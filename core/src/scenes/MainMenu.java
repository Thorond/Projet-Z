package scenes;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.physics.box2d.World;
import com.mygdx.game.GameMain;

import characters.MainCharacter;
import décors.Trou;
import items.CoeurDeVie;
import items.Epée;
import map.Map;
import map.PlacementMain;
import map.SousMapA1;
import map.SousMapA2;
import map.SousMapB1;
import map.SousMapB2;
import sauvegarde.AcceptClass;
import sauvegarde.Sauvegarde;
import sauvegarde.SendClass;

public class MainMenu implements Screen{
	
	private GameMain game;
	private MainCharacter Link;
	Texture carte;
	Texture header;
	public static World world;
	public static Sauvegarde sauvegarde = AcceptClass.acceptClass() ;
//	= AcceptClass.acceptClass() à utiliser en cas de nouvelle class sauvegarde

	
	public static long start;
	
	
	public MainMenu(GameMain game){
		
		this.game = game;
		world = new World(new Vector2(0,0),true);
		
		Link = new MainCharacter(world, 20, 4, sauvegarde.getCoordX() , sauvegarde.getCoordY()  , sauvegarde.getDirection());
		
		PlacementMain.positionSousMap = sauvegarde.getPosiSousMap();
		
//		à utiliser en cas de nouvelle class sauvegarde
		
//		PlacementMain.positionSousMap = "B1";
//		Link = new MainCharacter(world, 10 , 4 , 50 , 50 , "bas");
		
		carte = new Texture("Map.png");
		header = new Texture("Divers/barreHaute.png");
		start = System.currentTimeMillis();
		
		Map.setTypeDeDécor();
		Map.setDécoChangéFaux();
		
		
	}
	
	void update(float dt){
		if (Gdx.input.isKeyPressed(Input.Keys.Q)){
			Link.getBody().applyLinearImpulse(new Vector2(-100000f,0), Link.getBody().getWorldCenter(), true);
			Link.setDirection("gauche");
			Link.représentationLink(Link);

			
		} else if (Gdx.input.isKeyPressed(Input.Keys.D)){
			Link.getBody().applyLinearImpulse(new Vector2(+100000f,0), Link.getBody().getWorldCenter(), true);
			Link.setDirection("droite");
			Link.représentationLink(Link);
			
		} else if (Gdx.input.isKeyPressed(Input.Keys.Z)){
			Link.getBody().applyLinearImpulse(new Vector2(0,+100000f), Link.getBody().getWorldCenter(), true);
			Link.setDirection("haut");
			Link.représentationLink(Link);

		} else if (Gdx.input.isKeyPressed(Input.Keys.S)){
			Link.getBody().applyLinearImpulse(new Vector2(0,-100000f), Link.getBody().getWorldCenter(), true);
			Link.setDirection("bas");
			Link.représentationLink(Link);

		} else if (Gdx.input.isKeyPressed(Input.Keys.K)){
			Epée.utilisationItem(Link);
	    } else if (Gdx.input.isKeyPressed(Input.Keys.P)){
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
		if ( Map.typeDeDécor[(int) (Link.getBody().getPosition().x /60 )][(int) (Link.getBody().getPosition().y / 60 )].equals("trou")) Trou.setDamage(Link);
	}

	@Override
	public void show() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void render(float delta) {
		// TODO Auto-generated method stub
		update(delta * 1000);
		
		Link.updatePlayer();
		
		PlacementMain.posiSousMap(Link);
		
		
		Gdx.gl.glClearColor(1, 0, 0, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		
		
		game.getBatch().begin();
		if ( PlacementMain.positionSousMap.equals("A1")) game.getBatch().draw(SousMapA1.sousMapA1, 0, 0);
		else if ( PlacementMain.positionSousMap.equals("A2")) game.getBatch().draw(SousMapA2.sousMapA2, 10, 10);
		else if ( PlacementMain.positionSousMap.equals("B1")) SousMapB1.sousMapB1(game);
		else if ( PlacementMain.positionSousMap.equals("B2")) game.getBatch().draw(SousMapB2.sousMapB2, 30, 30);
		
		
		game.getBatch().draw(Link, Link.getX(), Link.getY());
		game.getBatch().draw(header, 0,480);
		
//		dessiner les coeurs de vie
		
		if ( System.currentTimeMillis() - CoeurDeVie.start > 10000) CoeurDeVie.setEstPrésent(false);
		if ( CoeurDeVie.estPrésent == true 
				&& System.currentTimeMillis() - CoeurDeVie.start < 5000) game.getBatch().draw(CoeurDeVie.coeurDeVie, CoeurDeVie.x , CoeurDeVie.y);
		else if ( CoeurDeVie.estPrésent == true 
				&& System.currentTimeMillis() - CoeurDeVie.start > 5000){
			CoeurDeVie.clignotementCoeur();
			if (CoeurDeVie.clignotement == true ) game.getBatch().draw(CoeurDeVie.coeurDeVie, CoeurDeVie.x , CoeurDeVie.y);
		}
//		dessiner la vie
		
		int vie = 0 ;
		int écart = 0;
		while ( vie +4 <= Link.getHealth()  ){
			game.getBatch().draw(MainCharacter.coeurPlein, 240 + écart, 540 );
			vie += 4;
			écart += 60;
		}
		if ( Link.getHealth() % 4 == 1 ) game.getBatch().draw(MainCharacter.coeurUnQuart, 240 + écart, 540 );
		else if ( Link.getHealth() % 4 == 2 ) game.getBatch().draw(MainCharacter.coeurMoitié, 240 + écart, 540 );
		else if ( Link.getHealth() % 4 == 3 ) game.getBatch().draw(MainCharacter.coeurTroisQuart, 240 + écart, 540 );
		
		game.getBatch().end();
		
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
