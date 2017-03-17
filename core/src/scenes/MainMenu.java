package scenes;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.physics.box2d.Box2DDebugRenderer;
import com.badlogic.gdx.physics.box2d.World;
import com.mygdx.game.GameMain;

import characters.MainCharacter;
import decors.ClimatMontagneux;
import items.CoeurDeVie;
import items.Epee;
import items.Plume;
import map.CadrillageMap;
import map.GestionDesMaps;
import map.PlacementMain;
import menus.MenuSac;
import sauvegarde.AcceptClass;
import sauvegarde.Sauvegarde;
import sauvegarde.SendClass;

public class MainMenu implements Screen{
	
	private GameMain game;
	public static MainCharacter Link;
	public static Epee épée = new Epee();
	public static Plume plume = new Plume();
	Texture carte;
	public static World world;
	public static Sauvegarde sauvegarde = AcceptClass.acceptClass() ;
//	= AcceptClass.acceptClass() é utiliser en cas de nouvelle class sauvegarde
	
	private OrthographicCamera box2DCamera;
	private Box2DDebugRenderer debugRenderer;
	
	public static long start;
	
	public static float PPM = 1.5f;
	
	
	public MainMenu(GameMain game){
		
//		fonction libGDX
		
		this.game = game;
		
		this.box2DCamera = new OrthographicCamera();
		this.box2DCamera.setToOrtho(false, 600 / MainMenu.PPM, 480 /MainMenu.PPM);
		this.box2DCamera.position.set(300,240,0);
		
		this.debugRenderer = new Box2DDebugRenderer();
		
		world = new World(new Vector2(0,0),true);
		
//		lorsqu'une sauvegarde existe, on l'appelle
		
		Link = new MainCharacter(world, 40, 30, 4, 0 , 0 , sauvegarde.getDirection());
		Link.getBody().setTransform(sauvegarde.getCoordX(), sauvegarde.getCoordY(), 0);
		PlacementMain.positionSousMap = sauvegarde.getPosiSousMap();
		
//		à utiliser en cas de renouvelle de la sauvegarde
		
//		PlacementMain.positionSousMap = "B1";
//		Link = new MainCharacter(world,10,  10 , 4 , 50 , 50 , "bas");
		
		MenuSac.itemsKL[0] = plume;
		MenuSac.itemsKL[1] = épée;
		
		start = System.currentTimeMillis();
		
		CadrillageMap.setTypeDeDécor();
		CadrillageMap.setDécoChangéFaux();
		
		
	}
	
	void updateSac(float dt){
		if (Gdx.input.isKeyJustPressed(Input.Keys.Q) && MenuSac.itemSelect > 1){
			MenuSac.itemSelect--;		
		} else if (Gdx.input.isKeyJustPressed(Input.Keys.D) && MenuSac.itemSelect < 15){
			MenuSac.itemSelect++;	
		} else if (Gdx.input.isKeyJustPressed(Input.Keys.Z) && MenuSac.itemSelect > 5){
			MenuSac.itemSelect-=5;	
		} else if (Gdx.input.isKeyJustPressed(Input.Keys.S) && MenuSac.itemSelect <11){
			MenuSac.itemSelect+=5;
		}
		if (Gdx.input.isKeyJustPressed(Input.Keys.K) &&  MenuSac.itemSelect <= MenuSac.nbrItems){
			MenuSac.acquisitionItemsK();
		} else if (Gdx.input.isKeyJustPressed(Input.Keys.L) &&  MenuSac.itemSelect <= MenuSac.nbrItems){
			MenuSac.acquisitionItemsL();
		}
		
		
		if (Gdx.input.isKeyJustPressed(Input.Keys.M)){
			MenuSac.isSacAffiché = false;
		}
	}
	
	
	void updateInGame(float dt){
		if ( Link.getHealth()>0){
			if (PlacementMain.défilement == false){
//				choix clavier du joueur
				if (Gdx.input.isKeyPressed(Input.Keys.Q)){
					Link.getBody().applyLinearImpulse(new Vector2(-10000f,0), Link.getBody().getWorldCenter(), true);
					Link.setDirection("gauche");
					Link.représentationLink(Link);
		
					
				} else if (Gdx.input.isKeyPressed(Input.Keys.D)){
					Link.getBody().applyLinearImpulse(new Vector2(+10000f,0), Link.getBody().getWorldCenter(), true);
					Link.setDirection("droite");
					Link.représentationLink(Link);
					
				} else if (Gdx.input.isKeyPressed(Input.Keys.Z)){
					Link.getBody().applyLinearImpulse(new Vector2(0,+10000f), Link.getBody().getWorldCenter(), true);
					Link.setDirection("haut");
					Link.représentationLink(Link);
		
				} else if (Gdx.input.isKeyPressed(Input.Keys.S)){
					Link.getBody().applyLinearImpulse(new Vector2(0,-10000f), Link.getBody().getWorldCenter(), true);
	
					Link.setDirection("bas");
					Link.représentationLink(Link);
		
				} else if (Gdx.input.isKeyJustPressed(Input.Keys.P)){
					sauvegarde = new Sauvegarde(Link.getBody().getPosition().x,Link.getBody().getPosition().y, Link.getDirection(), PlacementMain.positionSousMap);
					SendClass.sendClass(sauvegarde);
				} else if (Gdx.input.isKeyPressed(Input.Keys.O)){
					pause();
				} else if (Gdx.input.isKeyPressed(Input.Keys.I)){
					resume();
				} else {
					Link.getBody().setLinearVelocity(Link.getBody().getLinearVelocity().x / 1.2f, Link.getBody().getLinearVelocity().y / 1.2f);
					if (Link.getDirection().equals("bas")) Link.setTexture(MainCharacter.linkBasRepos);
					else if (Link.getDirection().equals("haut")) Link.setTexture(MainCharacter.linkHautRepos);
					else if (Link.getDirection().equals("gauche")) Link.setTexture(MainCharacter.linkGaucheRepos);
					else if (Link.getDirection().equals("droite")) Link.setTexture(MainCharacter.linkDroiteRepos);
				} 
				
				
				if ( ! (Gdx.input.isKeyPressed(Input.Keys.Q)) && ! (Gdx.input.isKeyPressed(Input.Keys.D))) 
						Link.getBody().setLinearVelocity(Link.getBody().getLinearVelocity().x / 1.2f, Link.getBody().getLinearVelocity().y );
				if ( ! (Gdx.input.isKeyPressed(Input.Keys.Z)) && ! (Gdx.input.isKeyPressed(Input.Keys.S)) ) 
					Link.getBody().setLinearVelocity(Link.getBody().getLinearVelocity().x , Link.getBody().getLinearVelocity().y / 1.2f);
				
//				intéraction avec l'environnement 
				
				 if (Gdx.input.isKeyJustPressed(Input.Keys.K)){
						MenuSac.itemsKL[0].utilisationItem(Link);
				 } else if (Gdx.input.isKeyJustPressed(Input.Keys.L)){
					 	MenuSac.itemsKL[1].utilisationItem(Link);
				 } else if (Gdx.input.isKeyJustPressed(Input.Keys.M) ){
						MenuSac.isSacAffiché = true;
				 }
				
				
				if ( CadrillageMap.typeDeDécor[(int) (Link.getBody().getPosition().x *1.5/60 )][(int) (Link.getBody().getPosition().y *1.5/ 60 )].equals("Trou")) ClimatMontagneux.setDamageTrou(Link);
				if ( CadrillageMap.typeDeDécor[(int) (Link.getBody().getPosition().x *1.5/60 )][(int) (Link.getBody().getPosition().y *1.5/ 60 )].equals("EauProfonde")) ClimatMontagneux.setDamageEau(Link);
//				récupération de vie par les coeurs de vie
				for ( int i = 0 ; i < CoeurDeVie.coeurDeVies.length ; i ++){
					if (CoeurDeVie.coeurDeVies[i].isEstPrésent()){
						for ( int j = -10 ; j < 40 ; j ++){
							for ( int k = -10 ; k < 40 ; k ++){
								if ( (int) (Link.getBody().getPosition().x*MainMenu.PPM) +j == CoeurDeVie.coeurDeVies[i].getX() 
										&& (int) (Link.getBody().getPosition().y*MainMenu.PPM) +k == CoeurDeVie.coeurDeVies[i].getY() ){
									if (Link.getHealthMax() - Link.getHealth() >= 1 ) Link.setHealth(Link.getHealth() +1);
									CoeurDeVie.coeurDeVies[i].setEstPrésent(false);
								}
							}
						}
						
					}
				}
			}
		} else {
//			destruction des corps de la sous map sur laquelle on était
//			GestionDesMaps.destructionDesCorps();
			
//			suppression des types de décor 
			CadrillageMap.setTypeDeDécor();
			CadrillageMap.setDécoChangéFaux();
			CoeurDeVie.réinitialisation();
			
			Link.setDirection(sauvegarde.getDirection());
			Link.getBody().setTransform(sauvegarde.getCoordX(), sauvegarde.getCoordY(), 0);
			PlacementMain.positionSousMap = sauvegarde.posiSousMap;
			Link.setHealth(Link.getHealthMax());
		}
	}

	@Override
	public void show() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void render(float delta) {
		// TODO Auto-generated method stub
		
	
		
		
		Gdx.gl.glClearColor(1, 0, 0, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		
		
		game.getBatch().begin();
		
		if ( MenuSac.isSacAffiché == true ) {
			
			updateSac(delta );
//			=============================================================================================
//											  dessiner le sac
//			=============================================================================================

			MenuSac.affichéSac(game);
		} else {
			
			updateInGame(delta * 1000);
			
			Link.updatePlayer();
			
			if (PlacementMain.défilement == false ) PlacementMain.posiSousMap(Link);
			
			if ( PlacementMain.défilement == true) {
				GestionDesMaps.défilementDeMap(game);
			}else {
				GestionDesMaps.affichageDeSousCarte(game);
			}
			
			//			=============================================================================================
			//     		       dessiner les coeurs de vie
			//			=============================================================================================
			for ( int i = 0; i< CoeurDeVie.coeurDeVies.length ; i++){
				if ( System.currentTimeMillis() - CoeurDeVie.coeurDeVies[i].getStart() > 10000) CoeurDeVie.coeurDeVies[i].setEstPrésent(false);
				if ( CoeurDeVie.coeurDeVies[i].isEstPrésent() 
						&& System.currentTimeMillis() - CoeurDeVie.coeurDeVies[i].getStart() < 5000) game.getBatch().draw(CoeurDeVie.coeurDeVie, CoeurDeVie.coeurDeVies[i].getX() , CoeurDeVie.coeurDeVies[i].getY());
				else if ( CoeurDeVie.coeurDeVies[i].isEstPrésent()
						&& System.currentTimeMillis() - CoeurDeVie.coeurDeVies[i].getStart() > 5000){
					CoeurDeVie.coeurDeVies[i].clignotementCoeur();
					if (CoeurDeVie.coeurDeVies[i].isClignotement() ) game.getBatch().draw(CoeurDeVie.coeurDeVie, CoeurDeVie.coeurDeVies[i].getX() , CoeurDeVie.coeurDeVies[i].getY());
				}
			}
			
//			dessin du joueur
			game.getBatch().draw(Link, Link.getX(), Link.getY());
		}
		
	
		
//		=============================================================================================
//     						  dessiner les items à la fois en jeu et dans menuSac
//		=============================================================================================

		MenuSac.affichageItemK(game);
		MenuSac.affichageItemL(game);
		
//		=============================================================================================
//								dessiner la vie à la fois en jeu et dans menuSac
//		=============================================================================================
		
		int vie = 0 ;
		int écart = 0;
		while ( vie +4 <= Link.getHealth()  ){
			game.getBatch().draw(MainCharacter.coeurPlein, 20 + écart, 440 );
			écart+=15;
			vie += 4;
		}
		if ( Link.getHealth() % 4 == 1 ) game.getBatch().draw(MainCharacter.coeurUnQuart, 40 + écart, 440 );
		else if ( Link.getHealth() % 4 == 2 ) game.getBatch().draw(MainCharacter.coeurMoitié, 40 + écart, 440 );
		else if ( Link.getHealth() % 4 == 3 ) game.getBatch().draw(MainCharacter.coeurTroisQuart, 40 + écart, 440 );
		
		game.getBatch().end();
		
		
//		afficher les corps pour visualiser ce avec quoi on travail
		this.debugRenderer.render(world, this.box2DCamera.combined);
		
		world.step(Gdx.graphics.getDeltaTime(), 6, 2);
		
	}

	@Override
	public void resize(int width, int height) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void pause() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void resume() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void hide() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void dispose() {
		// TODO Auto-generated method stub
		Link.getTexture().dispose();
		carte.dispose();
	}

}
