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

import characters.Ghost;
import characters.MainCharacter;
import characters.Pnj;
import decors.ClimatMontagneux;
import interactionClavier.AlphabetEtAcquisition;
import items.Bouclier;
import items.CoeurDeVie;
import items.Coffre;
import items.Epee;
import items.GantDeForce;
import items.Plume;
import map.CadrillageMap;
import map.GestionDesMaps;
import map.IglooC1;
import map.IglooD3;
import map.PlacementMain;
import map.SousMapB3;
import map.SousMapF1;
import map.SousMapF2;
import menus.MenuGameover;
import menus.MenuPause;
import menus.MenuSac;
import sauvegarde.AcceptClass;
import sauvegarde.Sauvegarde;
import sauvegarde.SendClass;

public class MainMenu implements Screen{
	
	private GameMain game;
	public static MainCharacter Link;
	
	public static Epee épée = new Epee();
	public static Plume plume = new Plume();
	public static GantDeForce gantDeForce = new GantDeForce();
	public static Bouclier bouclier = new Bouclier();
	
	Texture carte;
	public static World world;
	public static Sauvegarde sauvegarde = AcceptClass.acceptClass() ;
//	= AcceptClass.acceptClass() à utiliser en cas de nouvelle class sauvegarde
	
	public static OrthographicCamera box2DCamera;
	private Box2DDebugRenderer debugRenderer;
	
	public static long start;
	
	public static float PPM = 1.5f;
	
	public MainMenu(GameMain game){
		
//		fonction libGDX
		
		this.game = game;
		
		box2DCamera = new OrthographicCamera();
		box2DCamera.setToOrtho(false, 600 / MainMenu.PPM, 480 /MainMenu.PPM);
		box2DCamera.position.set(300,240,0);
		
		this.debugRenderer = new Box2DDebugRenderer();
		
		world = new World(new Vector2(0,0),true);
		
//		lorsqu'une sauvegarde existe, on l'appelle
		
		Link = new MainCharacter(world, 12, 8, 4, 0 , 0 , sauvegarde.getDirection());
		Link.getBody().setTransform(sauvegarde.getCoordX(), sauvegarde.getCoordY(), 0);
		PlacementMain.positionSousMap = sauvegarde.getPosiSousMap();
		
//		à utiliser en cas de renouvellement de la sauvegarde
		
//		PlacementMain.positionSousMap = "B1";
//		Link = new MainCharacter(world,10,  10 , 4 , 50 , 50 , "bas");
		
		MenuSac.setItem(plume);
		MenuSac.setItem(bouclier); // pour ne pas avoir à aller le rechercher à chaque réinitialisation de sauvegarde
		MenuSac.setItem(épée); // pour ne pas avoir à aller la rechercher à chaque réinitialisation de sauvegarde
		MenuSac.setItem(gantDeForce);
		if ( Epee.isEpéePrise )	MenuSac.setItem(épée);
		if ( Bouclier.isBouclierPris) MenuSac.setItem(bouclier);
		
		start = System.currentTimeMillis();
		
		CadrillageMap.setTypeDeDécor();
		CadrillageMap.setDécoChangéFaux();
		
		
	}
	
	void updateGO(float dt){
		if (Gdx.input.isKeyJustPressed(Input.Keys.S) ){
			if ( MenuGameover.choix == 1) MenuGameover.choix++;	
			else MenuGameover.choix = 1;
		} else if (Gdx.input.isKeyJustPressed(Input.Keys.Z)){
			if ( MenuGameover.choix == 2) MenuGameover.choix--;	
			else MenuGameover.choix =2;
		}
		if (Gdx.input.isKeyJustPressed(Input.Keys.ENTER) ){
			if (MenuGameover.choix == 1) MenuGameover.isGO = false;
		}
	}
	
	void updatePause(float dt){
		if (Gdx.input.isKeyJustPressed(Input.Keys.S) ){
			if ( MenuPause.choix == 1) MenuPause.choix = 2;
			else if ( MenuPause.choix == 2) MenuPause.choix =3;	
			else if ( MenuPause.choix == 3) MenuPause.choix =1;
		} else if (Gdx.input.isKeyJustPressed(Input.Keys.Z)){
			if ( MenuPause.choix == 1) MenuPause.choix = 3;
			else if ( MenuPause.choix == 2) MenuPause.choix =1;	
			else if ( MenuPause.choix == 3) MenuPause.choix =2;
		}
		if (Gdx.input.isKeyJustPressed(Input.Keys.ENTER) ){
			if (MenuPause.choix == 1) MenuPause.isPause = false;
			else if (MenuPause.choix == 3){
				sauvegarde = new Sauvegarde(Link.getBody().getPosition().x,Link.getBody().getPosition().y, Link.getDirection(), PlacementMain.positionSousMap);
				SendClass.sendClass(sauvegarde);
//				affichage de quelques choses pour montrer que c'est sauvegarder
			}
		}
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
	
//	premier scenario avec le fantôme 
	void updateSc1Ghost(float dt){
		if ( Ghost.etatScenario != 7 && Ghost.etatScenario < 9  && Gdx.input.isKeyJustPressed(Input.Keys.ENTER)) {
			Ghost.etatScenario ++;
		} else if ( ( Ghost.etatScenario == 7 || Ghost.etatScenario == 10 ) && Gdx.input.isKeyJustPressed(Input.Keys.K) ){
			Ghost.etatScenario = 8;
		} else if ( ( Ghost.etatScenario == 7 || Ghost.etatScenario == 10 ) && Gdx.input.isKeyJustPressed(Input.Keys.L) ){
			Ghost.etatScenario = 16;
		} else if ( Ghost.etatScenario == 11 && Gdx.input.isKeyJustPressed(Input.Keys.ENTER) ){
			Ghost.etatScenario = 20;
			IglooD3.destroyBody();
		}
		if (Ghost.etatScenario == 9 ) AlphabetEtAcquisition.isAlphabetUtilisé = true;
	}
	
//	lorsque le joueur tape au clavier
	void updateAlEtAc(float dt){
		AlphabetEtAcquisition.acquisitionTouche();
	}
	
	
	void updateInGame(float dt){
		if ( Link.isAlive){
			if ( Link.annimationAward){
//				annimation de récupération de l'épée
				Link.setTexture(MainCharacter.linkAward);
				Link.getBody().setLinearVelocity(Link.getBody().getLinearVelocity().x / 2f, Link.getBody().getLinearVelocity().y / 2f);
				if ( Gdx.input.isKeyJustPressed(Input.Keys.ENTER)){
					Link.annimationAward = false;
				}
			} else if (Epee.isEpéeUtilisé){
				épée.annimationEpée(Link);
			} else {
				if (PlacementMain.défilement == false){
	//				choix clavier du joueur
					if (Gdx.input.isKeyPressed(Input.Keys.Q) ){
						Link.getBody().applyLinearImpulse(new Vector2(-100000f,0), Link.getBody().getWorldCenter(), true);
						if (Bouclier.isBouclierUtilisé ); // que le joueur garde sa défense
						else Link.setDirection("gauche");
						Link.représentationLink(Link);
			
						
					} else if (Gdx.input.isKeyPressed(Input.Keys.D)){
						Link.getBody().applyLinearImpulse(new Vector2(+100000f,0), Link.getBody().getWorldCenter(), true);
						if (Bouclier.isBouclierUtilisé); // que le joueur garde sa défense
						else Link.setDirection("droite");
						Link.représentationLink(Link);
						
					} else if (Gdx.input.isKeyPressed(Input.Keys.Z)  ){
						Link.getBody().applyLinearImpulse(new Vector2(0,+100000f), Link.getBody().getWorldCenter(), true);
						if (Bouclier.isBouclierUtilisé); // que le joueur garde sa défense
						else Link.setDirection("haut");
						Link.représentationLink(Link);
			
					} else if (Gdx.input.isKeyPressed(Input.Keys.S)){
						Link.getBody().applyLinearImpulse(new Vector2(0,-100000f), Link.getBody().getWorldCenter(), true);
						if (Bouclier.isBouclierUtilisé); // que le joueur garde sa défense
						else Link.setDirection("bas");
						Link.représentationLink(Link);
			
					} else {
						Link.getBody().setLinearVelocity(Link.getBody().getLinearVelocity().x / 1.2f, Link.getBody().getLinearVelocity().y / 1.2f);
						if (Link.getDirection().equals("bas")) {
							if ( Bouclier.isBouclierUtilisé ) Link.setTexture(MainCharacter.linkBasReposBouclier);
							else Link.setTexture(MainCharacter.linkBasRepos);
						}
						else if (Link.getDirection().equals("haut")) {
							if ( Bouclier.isBouclierUtilisé ) Link.setTexture(MainCharacter.linkHautReposBouclier);
							else Link.setTexture(MainCharacter.linkHautRepos);
						}
						else if (Link.getDirection().equals("gauche")) {
							if ( Bouclier.isBouclierUtilisé ) Link.setTexture(MainCharacter.linkGaucheReposBouclier);
							else Link.setTexture(MainCharacter.linkGaucheRepos);
						}
						else if (Link.getDirection().equals("droite")) {
							if ( Bouclier.isBouclierUtilisé ) Link.setTexture(MainCharacter.linkDroiteReposBouclier);
							else Link.setTexture(MainCharacter.linkDroiteRepos);
						}
					} 
					
					
					if ( ! (Gdx.input.isKeyPressed(Input.Keys.Q)) && ! (Gdx.input.isKeyPressed(Input.Keys.D))) 
							Link.getBody().setLinearVelocity(Link.getBody().getLinearVelocity().x / 1.2f, Link.getBody().getLinearVelocity().y );
					if ( ! (Gdx.input.isKeyPressed(Input.Keys.Z)) && ! (Gdx.input.isKeyPressed(Input.Keys.S)) ) 
						Link.getBody().setLinearVelocity(Link.getBody().getLinearVelocity().x , Link.getBody().getLinearVelocity().y / 1.2f);
					
//					mettre le jeu en pause et sauvegarder
					if (Gdx.input.isKeyJustPressed(Input.Keys.P)){
						sauvegarde = new Sauvegarde(Link.getBody().getPosition().x,Link.getBody().getPosition().y, Link.getDirection(), PlacementMain.positionSousMap);
						SendClass.sendClass(sauvegarde);
					}
					if (Gdx.input.isKeyPressed(Input.Keys.O)){
//						 permettant de stopper l'avancer des monstres lorsque l'on regarde dans son sac, à mettre dans une autres fonction dans la 
//						 classe gestionDesMaps ?
						 for ( int l = 0; l < Pnj.nbrDeMonstres ; l ++) 
							 Pnj.monstres[l].getBody().setLinearVelocity(0, 0);
						 Link.getBody().setLinearVelocity(Link.getBody().getLinearVelocity().x / 100f, Link.getBody().getLinearVelocity().y / 100f);
						 MenuPause.isPause = true;
					}
					
					
	//				intéraction avec l'environnement; lorsqu'il est dans un batiment il n'a pas le droit d'utiliser un item
					
					 if (Gdx.input.isKeyJustPressed(Input.Keys.K) && MenuSac.itemKOccupé  
							 && ! PlacementMain.positionSousMap.equals("IglooC1")
							 && ! PlacementMain.positionSousMap.equals("IglooD3")){
							MenuSac.itemsKL[0].utilisationItem(Link);
					 } else if (Gdx.input.isKeyJustPressed(Input.Keys.L) && MenuSac.itemLOccupé 
							 && ! PlacementMain.positionSousMap.equals("IglooC1")
							 && ! PlacementMain.positionSousMap.equals("IglooD3")){
						 	MenuSac.itemsKL[1].utilisationItem(Link);
					 } else if (Gdx.input.isKeyJustPressed(Input.Keys.M) ){
//						 permettant de stopper l'avancer des monstres lorsque l'on regarde dans son sac, à mettre dans une autres fonction dans la 
//						 classe gestionDesMaps ?
						 for ( int l = 0; l < Pnj.nbrDeMonstres ; l ++) 
							 Pnj.monstres[l].getBody().setLinearVelocity(0, 0);
						 Link.getBody().setLinearVelocity(Link.getBody().getLinearVelocity().x / 100f, Link.getBody().getLinearVelocity().y / 100f);
						 MenuSac.isSacAffiché = true;
					 }
//					 cas particulier du bouclier, en effet, il faut que le joueur garde le doigt appuyer pour garder le bouclier actif
					 if (Bouclier.isBouclierUtilisé && Gdx.input.isKeyPressed(Input.Keys.K) ){
						 MenuSac.itemsKL[0].utilisationItem(Link);
					 } else if (Bouclier.isBouclierUtilisé && Gdx.input.isKeyPressed(Input.Keys.L) ){
						 MenuSac.itemsKL[1].utilisationItem(Link);
					 } else if (Bouclier.isBouclierUtilisé && ( !(Gdx.input.isKeyPressed(Input.Keys.K)) && !(Gdx.input.isKeyPressed(Input.Keys.L)) )){
						 Bouclier.isBouclierUtilisé = false;
						 MainCharacter.changementDeVitesse = true;
					 }
					 
					
					 if (Link.getDirection().equals("haut") 
							 && CadrillageMap.typeDeDécor[(int) (Link.getBody().getPosition().x *PPM/60 )][(int) (Link.getBody().getPosition().y *PPM/ 60 )].equals("épée")
							 &&  CadrillageMap.décorChangé[(int) (Link.getBody().getPosition().x *PPM/60 )][(int) (Link.getBody().getPosition().y *PPM/ 60 )] == false) {
						 Epee.isEpéePrise = true;
						 CadrillageMap.décorChangé[(int) (Link.getBody().getPosition().x *PPM/60 )][(int) (Link.getBody().getPosition().y *PPM/ 60 )] = true;
						 MainMenu.Link.annimationAward = true;
						 SousMapF1.destroyBody();
						 MenuSac.setItem(épée);
					 };
					 if (PlacementMain.positionSousMap.equals("IglooC1") && Link.getDirection().equals("haut") && !(Bouclier.isBouclierPris) 
							 && Link.getX() >420
							 && Link.getY()>270 ) {
						 Bouclier.isBouclierPris = true;
						 MainMenu.Link.annimationAward = true;
						 IglooC1.destroyBody();
						 MenuSac.setItem(bouclier);
					 };
//					 démarage scenario 1
					 if ( Ghost.etatScenario == 0 && PlacementMain.positionSousMap.equals("IglooD3") && Link.getDirection().equals("haut")
							 && Link.getBody().getPosition().x > 190 / PPM && Link.getBody().getPosition().x < 410 / PPM 
							 && Link.getBody().getPosition().y > 200 / PPM  ){
						 Ghost.etatScenario = 1;
						 Link.getBody().setLinearVelocity(0, 0);
						 
					 }
					 if ( PlacementMain.positionSousMap.equals("F2")){
						 if ( CadrillageMap.typeDeDécor[(int) (Link.getBody().getPosition().x *PPM/60 )][(int) (Link.getBody().getPosition().y *PPM/ 60 ) +1].equals("coffreBleu") ){
							 SousMapF2.ouvertureCoffre = true;
						 }
					 }
					if ( CadrillageMap.typeDeDécor[(int) (Link.getBody().getPosition().x *PPM/60 )][(int) (Link.getBody().getPosition().y *PPM/ 60 )].equals("Trou")) ClimatMontagneux.setDamageTrou(Link);
					if ( CadrillageMap.typeDeDécor[(int) (Link.getBody().getPosition().x *PPM/60 )][(int) (Link.getBody().getPosition().y *PPM/ 60 )].equals("EauProfonde")) ClimatMontagneux.setDamageEau(Link);
//									Récuparation du réceptacle 
					if ( CadrillageMap.typeDeDécor[(int) (Link.getBody().getPosition().x *PPM/60 )][(int) (Link.getBody().getPosition().y *PPM/ 60 )].equals("receptacleDeCoeur")) {
						CadrillageMap.setTypeDeDécor((int) (Link.getBody().getPosition().x *PPM/60 ), (int) (Link.getBody().getPosition().y *PPM/ 60 ), "");
						CoeurDeVie.receptacleDeCoeur();
						Link.annimationAward = true;
					}
					
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
			}
//			Est ce que le joueur est mort?
			if ( MainMenu.Link.getHealth() <= 0) {
				MainMenu.Link.isAlive = false;
				MenuGameover.isGO = true;
				Link.getBody().setLinearVelocity(0, 0);
			}
		} else {
//			'accélérer' le GameOver
			if (Gdx.input.isKeyJustPressed(Input.Keys.ENTER) ){
				MenuGameover.opacitéGO = 0.99f;
			}
		}
	}

	@Override
	public void show() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void render(float delta) {
		
		Gdx.gl.glClearColor(1, 0, 0, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		
		
		game.getBatch().begin();
		
		if ( Link.isAlive && MenuGameover.isGO ) {
		//			  dessiner le menu de game over
			 MenuGameover.affichageMenuGO(game);
			 updateGO(delta);
		} else if ( MenuPause.isPause == true ) {
			
			updatePause(delta );
			MenuPause.affichageMenuPause(game);
		} else {
			
			if ( MenuSac.isSacAffiché == true ) {
				
				updateSac(delta );
	//			=============================================================================================
	//											  dessiner le sac
	//			=============================================================================================
	
				MenuSac.affichéSac(game);
			} else {
				
//				lorsque le joueur doit répondre à l'énigme ( ou autre chose nécessitant le clavier )
				if ( Ghost.etatScenario != 0 && Ghost.etatScenario != 9 && Ghost.etatScenario < 16) updateSc1Ghost(delta);
				else if ( AlphabetEtAcquisition.isAlphabetUtilisé ) updateAlEtAc(delta);
				else updateInGame(delta );
				
				Link.updatePlayer();
				
				if (PlacementMain.défilement == false ) {
					PlacementMain.posiSousMap(Link);
				}
				
				if ( PlacementMain.défilement == true) {
					GestionDesMaps.défilementDeMap(game);
				}else {
					Link.setSize(Link.getTexture().getWidth(), Link.getTexture().getHeight());
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
				Link.draw(game.getBatch());
			}
			
			if ( Ghost.etatScenario > 0  && Ghost.etatScenario < 16 ) Ghost.scenario1(game);
			if ( AlphabetEtAcquisition.isAlphabetUtilisé ) AlphabetEtAcquisition.affichageMot(game);
			
				
	//		=============================================================================================
	//     						  dessiner les items à la fois en jeu et dans menuSac
	//		=============================================================================================
	
			if ( MenuSac.itemKOccupé ) MenuSac.affichageItemK(game);
			if ( MenuSac.itemLOccupé ) MenuSac.affichageItemL(game);
			
	//		=============================================================================================
	//								dessiner la vie à la fois en jeu et dans menuSac
	//		=============================================================================================
			
			int vie = 0 ;
			int écart = 0;
			while ( vie +4 <= Link.getHealth()  ){
				game.getBatch().draw(MainCharacter.coeurPlein, 20 + écart, 440 );
				écart+=30;
				vie += 4;
			}
			if (Link.getHealth() != Link.getHealthMax()){
				if ( Link.getHealth() % 4 == 1 ) game.getBatch().draw(MainCharacter.coeurUnQuart, 20 + écart, 440 );
				else if ( Link.getHealth() % 4 == 2 ) game.getBatch().draw(MainCharacter.coeurMoitié, 20 + écart, 440 );
				else if ( Link.getHealth() % 4 == 3 ) game.getBatch().draw(MainCharacter.coeurTroisQuart, 20 + écart, 440 );
				else if ( Link.getHealth() % 4 == 0 || Link.getHealth() <= 0 ) game.getBatch().draw(MainCharacter.coeurVide, 20 + écart, 440 );
				écart+=30;
				vie+=4;
			}
			while ( vie + 4 <= Link.getHealthMax()){
				game.getBatch().draw(MainCharacter.coeurVide, 20 + écart, 440 );
				écart+=30;
				vie+=4;
			}
			
	//		déssin du gameover
			MenuGameover.GameOver(game);
		}
		
		game.getBatch().end();
		
		
//		afficher les corps pour visualiser ce avec quoi on travail
		this.debugRenderer.render(world, box2DCamera.combined);
		
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
