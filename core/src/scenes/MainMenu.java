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
import décors.ClimatMontagneux;
import items.CoeurDeVie;
import items.Epee;
import map.Map;
import map.PlacementMain;
import map.SousMapA1;
import map.SousMapA2;
import map.SousMapA3;
import map.SousMapA4;
import map.SousMapB1;
import map.SousMapB2;
import map.SousMapB3;
import map.SousMapB4;
import map.SousMapC1;
import map.SousMapC2;
import map.SousMapC3;
import map.SousMapC4;
import map.SousMapD1;
import map.SousMapD2;
import map.SousMapD3;
import map.SousMapD4;
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
	
	private OrthographicCamera box2DCamera;
	private Box2DDebugRenderer debugRenderer;
	
	public static long start;
	
	public static float PPM = 1.5f;
	
	
	public MainMenu(GameMain game){
		
		this.game = game;
		
		this.box2DCamera = new OrthographicCamera();
		this.box2DCamera.setToOrtho(false, 600 / MainMenu.PPM, 480 /MainMenu.PPM);
		this.box2DCamera.position.set(300,240,0);
		
		this.debugRenderer = new Box2DDebugRenderer();
		
		world = new World(new Vector2(0,0),true);
		
		Link = new MainCharacter(world, 40, 30, 4, 0 , 0 , sauvegarde.getDirection());
		Link.getBody().setTransform(sauvegarde.getCoordX(), sauvegarde.getCoordY(), 0);
		PlacementMain.positionSousMap = sauvegarde.getPosiSousMap();
		
//		à utiliser en cas de nouvelle class sauvegarde
		
//		PlacementMain.positionSousMap = "B1";
//		Link = new MainCharacter(world,10,  10 , 4 , 50 , 50 , "bas");
		
	
		header = new Texture("Divers/barreHaute.png");
		start = System.currentTimeMillis();
		
		Map.setTypeDeDécor();
		Map.setDécoChangéFaux();
		
		
	}
	
	void update(float dt){
		if ( Link.getHealth()>0){
			if (PlacementMain.défilement == false){
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
		
				} else if (Gdx.input.isKeyPressed(Input.Keys.K)){
					Epee.utilisationItem(Link);
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
				if ( ! (Gdx.input.isKeyPressed(Input.Keys.Q)) && ! (Gdx.input.isKeyPressed(Input.Keys.D))) 
						Link.getBody().setLinearVelocity(Link.getBody().getLinearVelocity().x / 1.2f, Link.getBody().getLinearVelocity().y );
				if ( ! (Gdx.input.isKeyPressed(Input.Keys.Z)) && ! (Gdx.input.isKeyPressed(Input.Keys.S)) ) 
					Link.getBody().setLinearVelocity(Link.getBody().getLinearVelocity().x , Link.getBody().getLinearVelocity().y / 1.2f);
				
				if ( Map.typeDeDécor[(int) (Link.getBody().getPosition().x *1.5/60 )][(int) (Link.getBody().getPosition().y *1.5/ 60 )].equals("Trou")) ClimatMontagneux.setDamageTrou(Link);
				if ( Map.typeDeDécor[(int) (Link.getBody().getPosition().x *1.5/60 )][(int) (Link.getBody().getPosition().y *1.5/ 60 )].equals("EauProfonde")) ClimatMontagneux.setDamageEau(Link);
				for ( int i = 0 ; i < CoeurDeVie.coeurDeVies.length ; i ++){
					if (CoeurDeVie.coeurDeVies[i].isEstPrésent()){
						for ( int j = 0 ; j < 40 ; j ++){
							for ( int k = 0 ; k < 40 ; k ++){
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
//			suppresion des corps
			if (PlacementMain.positionSousMap.equals("A1")) SousMapA1.destroyBody();
			else if (PlacementMain.positionSousMap.equals("B1")) SousMapB1.destroyBody();
			else if (PlacementMain.positionSousMap.equals("C1")) SousMapC1.destroyBody();
			else if (PlacementMain.positionSousMap.equals("A2")) SousMapA2.destroyBody();
			else if (PlacementMain.positionSousMap.equals("B2")) SousMapB2.destroyBody();
			else if (PlacementMain.positionSousMap.equals("C2")) SousMapC2.destroyBody();
			
//			suppression des types
			Map.setTypeDeDécor();
			Map.setDécoChangéFaux();
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
		update(delta * 1000);
		
		Link.updatePlayer();
		
		
		if (PlacementMain.défilement == false ) PlacementMain.posiSousMap(Link);
		
		
		Gdx.gl.glClearColor(1, 0, 0, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		
		
		game.getBatch().begin();
		
		if ( PlacementMain.défilement == true) {
			Link.getBody().setLinearVelocity(Link.getBody().getLinearVelocity().x / 1.4f, Link.getBody().getLinearVelocity().y / 1.4f);
//			=============================================================================================
//			                                    changement de map
//			=============================================================================================
			if ( PlacementMain.direction.equals("gauche")){
				if ( System.currentTimeMillis() - PlacementMain.start > 10) {
					Link.getBody().setTransform(Link.getBody().getPosition().x +10, Link.getBody().getPosition().y  , 0);
				}
				if ( PlacementMain.positionSousMap.equals("A1") ) {
					SousMapA1.sousMapA1(game,-600 + PlacementMain.x,0);
					SousMapB1.sousMapB1(game, PlacementMain.x, 0);
				} else if ( PlacementMain.positionSousMap.equals("B1") ) {
					SousMapB1.sousMapB1(game,-600 + PlacementMain.x,0);
					SousMapC1.sousMapC1(game, PlacementMain.x, 0);
				} else if ( PlacementMain.positionSousMap.equals("C1") ) {
					SousMapC1.sousMapC1(game,-600 + PlacementMain.x,0);
					SousMapD1.sousMapD1(game, PlacementMain.x, 0);
				} else if ( PlacementMain.positionSousMap.equals("D1") ) {
//					SousMapD1.createBodyAndType(world);
//					SousMapD1.sousMapD1(game,-600 + PlacementMain.x,0);
//					SousMapE1.sousMapE1(game, PlacementMain.x, 0);
				} else if ( PlacementMain.positionSousMap.equals("A2") ) {
					SousMapB2.sousMapB2(game, 0 + PlacementMain.x, 0);
					SousMapA2.sousMapA2(game, -600 + PlacementMain.x,0);
				} else if ( PlacementMain.positionSousMap.equals("B2") ) {
					SousMapC2.sousMapC2(game, 0 + PlacementMain.x, 0);
					SousMapB2.sousMapB2(game, -600 + PlacementMain.x,0);
				} else if (PlacementMain.positionSousMap.equals("C2")){
					SousMapD2.sousMapD2(game, 0 + PlacementMain.x, 0);
					SousMapC2.sousMapC2(game, -600 + PlacementMain.x,0);
				} else if ( PlacementMain.positionSousMap.equals("A3") ) {
					SousMapB3.sousMapB3(game, 0 + PlacementMain.x, 0);
					SousMapA3.sousMapA3(game, -600 + PlacementMain.x,0);
				} else if ( PlacementMain.positionSousMap.equals("B3") ) {
					SousMapC3.sousMapC3(game, 0 + PlacementMain.x, 0);
					SousMapB3.sousMapB3(game, -600 + PlacementMain.x,0);
				} else if (PlacementMain.positionSousMap.equals("C3")){
					SousMapD3.sousMapD3(game, 0 + PlacementMain.x, 0);
					SousMapC3.sousMapC3(game, -600 + PlacementMain.x,0);
				} else if (PlacementMain.positionSousMap.equals("D3")){
					
				} else if ( PlacementMain.positionSousMap.equals("A4") ) {
					SousMapB4.sousMap(game, 0 + PlacementMain.x, 0);
					SousMapA4.sousMap(game, -600 + PlacementMain.x,0);
				} else if ( PlacementMain.positionSousMap.equals("B4") ) {
					SousMapC4.sousMap(game, 0 + PlacementMain.x, 0);
					SousMapB4.sousMap(game, -600 + PlacementMain.x,0);
				} else if (PlacementMain.positionSousMap.equals("C4")){
					SousMapD4.sousMap(game, 0 + PlacementMain.x, 0);
					SousMapC4.sousMap(game, -600 + PlacementMain.x,0);
				} else if (PlacementMain.positionSousMap.equals("D4")){
					
				}
				if ( System.currentTimeMillis() - PlacementMain.start > 10) {
					PlacementMain.x+=15;
					PlacementMain.start = System.currentTimeMillis();
				}
			} else if ( PlacementMain.direction.equals("droite")){
				if ( System.currentTimeMillis() - PlacementMain.start > 10) {
					Link.getBody().setTransform(Link.getBody().getPosition().x -10, Link.getBody().getPosition().y  , 0);
				}
				if ( PlacementMain.positionSousMap.equals("A1") ) {
				} else if ( PlacementMain.positionSousMap.equals("B1") ) {
					SousMapA1.sousMapA1(game,0- PlacementMain.x,0);
					SousMapB1.sousMapB1(game,600 - PlacementMain.x,0);
				} else if ( PlacementMain.positionSousMap.equals("C1") ) {
					SousMapB1.sousMapB1(game,0- PlacementMain.x,0);
					SousMapC1.sousMapC1(game,600 - PlacementMain.x,0);
				} else if ( PlacementMain.positionSousMap.equals("D1") ) {
					SousMapC1.sousMapC1(game,0- PlacementMain.x,0);
					SousMapD1.sousMapD1(game,600 - PlacementMain.x,0);
				} else if ( PlacementMain.positionSousMap.equals("A2") ) {
				} else if ( PlacementMain.positionSousMap.equals("B2") ) {
					SousMapA2.sousMapA2(game, 0- PlacementMain.x,0);
					SousMapB2.sousMapB2(game, 600- PlacementMain.x, 0);
				} else if ( PlacementMain.positionSousMap.equals("C2") ) {
					SousMapB2.sousMapB2(game, 0- PlacementMain.x,0);
					SousMapC2.sousMapC2(game, 600- PlacementMain.x, 0);
				} else if ( PlacementMain.positionSousMap.equals("D2") ) {
					SousMapC2.sousMapC2(game, 0- PlacementMain.x,0);
					SousMapD2.sousMapD2(game, 600- PlacementMain.x, 0);
				} else if ( PlacementMain.positionSousMap.equals("A3") ) {
				} else if ( PlacementMain.positionSousMap.equals("B3") ) {
					SousMapA3.sousMapA3(game, 0- PlacementMain.x,0);
					SousMapB3.sousMapB3(game, 600- PlacementMain.x, 0);
				} else if ( PlacementMain.positionSousMap.equals("C3") ) {
					SousMapB3.sousMapB3(game, 0- PlacementMain.x,0);
					SousMapC3.sousMapC3(game, 600- PlacementMain.x, 0);
				} else if ( PlacementMain.positionSousMap.equals("D3") ) {
					SousMapC3.sousMapC3(game, 0- PlacementMain.x,0);
					SousMapD3.sousMapD3(game, 600- PlacementMain.x, 0);
				} else if ( PlacementMain.positionSousMap.equals("A4") ) {
				} else if ( PlacementMain.positionSousMap.equals("B4") ) {
					SousMapA4.sousMap(game, 0- PlacementMain.x,0);
					SousMapB4.sousMap(game, 600- PlacementMain.x, 0);
				} else if ( PlacementMain.positionSousMap.equals("C4") ) {
					SousMapB4.sousMap(game, 0- PlacementMain.x,0);
					SousMapC4.sousMap(game, 600- PlacementMain.x, 0);
				} else if ( PlacementMain.positionSousMap.equals("D4") ) {
					SousMapC4.sousMap(game, 0- PlacementMain.x,0);
					SousMapD4.sousMap(game, 600- PlacementMain.x, 0);
				}
				if ( System.currentTimeMillis() - PlacementMain.start > 10) {
					PlacementMain.x+=15;
					PlacementMain.start = System.currentTimeMillis();
				}
			} else if ( PlacementMain.direction.equals("bas")){
				if ( System.currentTimeMillis() - PlacementMain.start > 10) {
					Link.getBody().setTransform(Link.getBody().getPosition().x , Link.getBody().getPosition().y +10 , 0);
				}
				if ( PlacementMain.positionSousMap.equals("A1") ) {
				} else if ( PlacementMain.positionSousMap.equals("B1") ) {
				} else if ( PlacementMain.positionSousMap.equals("C1") ) {
				} else if ( PlacementMain.positionSousMap.equals("D1") ) {
				} else if ( PlacementMain.positionSousMap.equals("A2") ) {
					SousMapA1.sousMapA1(game,0,0+ PlacementMain.y);
					SousMapA2.sousMapA2(game, 0,-480 + PlacementMain.y );
				} else if ( PlacementMain.positionSousMap.equals("B2") ) {
					SousMapB2.sousMapB2(game, 0, -480 + PlacementMain.y);
					SousMapB1.sousMapB1(game, 0, PlacementMain.y);
				} else if ( PlacementMain.positionSousMap.equals("C2") ) {
					SousMapC2.sousMapC2(game, 0, -480 + PlacementMain.y);
				} else if ( PlacementMain.positionSousMap.equals("D2") ) {
					SousMapD2.sousMapD2(game, 0, -480 + PlacementMain.y);
					SousMapD1.sousMapD1(game, 0, PlacementMain.y);
				} else if ( PlacementMain.positionSousMap.equals("A3") ) {
					SousMapA2.sousMapA2(game,0,0+ PlacementMain.y);
					SousMapA3.sousMapA3(game, 0,-480 + PlacementMain.y );
				} else if ( PlacementMain.positionSousMap.equals("B3") ) {
					SousMapB3.sousMapB3(game, 0, -480 + PlacementMain.y);
					SousMapB2.sousMapB2(game, 0, PlacementMain.y);
				} else if ( PlacementMain.positionSousMap.equals("C3") ) {
					SousMapC3.sousMapC3(game, 0, -480 + PlacementMain.y);
					SousMapC2.sousMapC2(game, 0, PlacementMain.y);
				} else if ( PlacementMain.positionSousMap.equals("D3") ) {
					SousMapD3.sousMapD3(game, 0, -480 + PlacementMain.y);
					SousMapD2.sousMapD2(game, 0, PlacementMain.y);
				} else if ( PlacementMain.positionSousMap.equals("A4") ) {
					SousMapA4.sousMap(game,0,0+ PlacementMain.y);
					SousMapA3.sousMapA3(game, 0,-480 + PlacementMain.y );
				} else if ( PlacementMain.positionSousMap.equals("B4") ) {
					SousMapB4.sousMap(game, 0, -480 + PlacementMain.y);
					SousMapB3.sousMapB3(game, 0, PlacementMain.y);
				} else if ( PlacementMain.positionSousMap.equals("C4") ) {
					SousMapC4.sousMap(game, 0, -480 + PlacementMain.y);
					SousMapC3.sousMapC3(game, 0, PlacementMain.y);
				} else if ( PlacementMain.positionSousMap.equals("D4") ) {
					SousMapD4.sousMap(game, 0, -480 + PlacementMain.y);
					SousMapD3.sousMapD3(game, 0, PlacementMain.y);
				}
				if ( System.currentTimeMillis() - PlacementMain.start > 10) {
					PlacementMain.y+=15;
					PlacementMain.start = System.currentTimeMillis();
				}
			} else if ( PlacementMain.direction.equals("haut")){
				if ( System.currentTimeMillis() - PlacementMain.start > 10) {
					Link.getBody().setTransform(Link.getBody().getPosition().x , Link.getBody().getPosition().y -10 , 0);
				}
				if ( PlacementMain.positionSousMap.equals("A1") ) {
					SousMapA1.sousMapA1(game,0,480- PlacementMain.y);
					SousMapA2.sousMapA2(game, 0,0- PlacementMain.y );
				} else if ( PlacementMain.positionSousMap.equals("B1") ) {
					SousMapB2.sousMapB2(game, 0, 0-PlacementMain.y);
					SousMapB1.sousMapB1(game, 0, 480-PlacementMain.y);
				} else if ( PlacementMain.positionSousMap.equals("C1") ) {
					SousMapC2.sousMapC2(game, 0, 0-PlacementMain.y);
					SousMapC1.sousMapC1(game, 0, 480-PlacementMain.y);
				} else if ( PlacementMain.positionSousMap.equals("D1") ) {
					SousMapD2.sousMapD2(game, 0, 0-PlacementMain.y);
					SousMapD1.sousMapD1(game, 0, 480-PlacementMain.y);
				} else if ( PlacementMain.positionSousMap.equals("A2") ) {
					SousMapA2.sousMapA2(game,0,480- PlacementMain.y);
					SousMapA3.sousMapA3(game, 0,0- PlacementMain.y );
				} else if ( PlacementMain.positionSousMap.equals("B2") ) {
					SousMapB3.sousMapB3(game, 0, 0-PlacementMain.y);
					SousMapB2.sousMapB2(game, 0, 480-PlacementMain.y);
				} else if ( PlacementMain.positionSousMap.equals("C2") ) {
					SousMapC3.sousMapC3(game, 0, 0-PlacementMain.y);
					SousMapC2.sousMapC2(game, 0, 480-PlacementMain.y);
				} else if ( PlacementMain.positionSousMap.equals("D2") ) {
					SousMapD3.sousMapD3(game, 0, 0-PlacementMain.y);
					SousMapD2.sousMapD2(game, 0, 480-PlacementMain.y);
				} else if ( PlacementMain.positionSousMap.equals("A3") ) {
					SousMapA3.sousMapA3(game,0,480- PlacementMain.y);
					SousMapA4.sousMap(game, 0,0- PlacementMain.y );
				} else if ( PlacementMain.positionSousMap.equals("B3") ) {
					SousMapB4.sousMap(game, 0, 0-PlacementMain.y);
					SousMapB3.sousMapB3(game, 0, 480-PlacementMain.y);
				} else if ( PlacementMain.positionSousMap.equals("C3") ) {
					SousMapC4.sousMap(game, 0, 0-PlacementMain.y);
					SousMapC3.sousMapC3(game, 0, 480-PlacementMain.y);
				} else if ( PlacementMain.positionSousMap.equals("D3") ) {
					SousMapD4.sousMap(game, 0, 0-PlacementMain.y);
					SousMapD3.sousMapD3(game, 0, 480-PlacementMain.y);
				}
				if ( System.currentTimeMillis() - PlacementMain.start > 10) {
					PlacementMain.y+=15;
					PlacementMain.start = System.currentTimeMillis();
				}
			}
			
			if ( PlacementMain.x == 600) {
				PlacementMain.défilement = false;
				PlacementMain.x = 0;
			}
			if ( PlacementMain.y == 480) {
				PlacementMain.défilement = false;
				PlacementMain.y = 0;
			}
			
			
		}else {
//			=============================================================================================
//                  					  affichage de la sous carte
//			=============================================================================================
			if ( PlacementMain.positionSousMap.equals("A1")) {
				SousMapA1.createBodyAndType(world);
				SousMapA1.sousMapA1(game, 0,0);
			}
			else if ( PlacementMain.positionSousMap.equals("B1")) {
				SousMapB1.createBodyAndType(world);
				SousMapB1.sousMapB1(game, 0,0);
			}
			else if ( PlacementMain.positionSousMap.equals("C1")) {
				SousMapC1.createBodyAndType(world);
				SousMapC1.sousMapC1(game, 0, 0);
			}
			else if ( PlacementMain.positionSousMap.equals("D1")) {
				SousMapD1.createBodyAndType(world);
				SousMapD1.sousMapD1(game, 0, 0);
			}
			else if ( PlacementMain.positionSousMap.equals("A2")){
				SousMapA2.createBodyAndType(world);
				SousMapA2.sousMapA2(game, 0,0 );
			}
			else if ( PlacementMain.positionSousMap.equals("B2")) {
				SousMapB2.destroyType();
				SousMapB2.createBodyAndType(world);
				SousMapB2.sousMapB2(game, 0, 0);
			}
			else if ( PlacementMain.positionSousMap.equals("C2")) {
				SousMapC2.destroyType();
				SousMapC2.createBodyAndType(world);
				SousMapC2.sousMapC2(game, 0, 0);
			}
			else if ( PlacementMain.positionSousMap.equals("D2")) {
				SousMapD2.destroyType();
				SousMapD2.createBodyAndType(world);
				SousMapD2.sousMapD2(game, 0, 0);
			}
			else if ( PlacementMain.positionSousMap.equals("A3")){
				SousMapA3.createBodyAndType(world);
				SousMapA3.sousMapA3(game, 0,0 );
			}
			else if ( PlacementMain.positionSousMap.equals("B3")) {
				SousMapB3.destroyType();
				SousMapB3.createBodyAndType(world);
				SousMapB3.sousMapB3(game, 0, 0);
			}
			else if ( PlacementMain.positionSousMap.equals("C3")) {
				SousMapC3.destroyType();
				SousMapC3.createBodyAndType(world);
				SousMapC3.sousMapC3(game, 0, 0);
			}
			else if ( PlacementMain.positionSousMap.equals("D3")) {
				SousMapD3.destroyType();
				SousMapD3.createBodyAndType(world);
				SousMapD3.sousMapD3(game, 0, 0);
			}
			else if ( PlacementMain.positionSousMap.equals("A4")){
				SousMapA4.createBodyAndType(world);
				SousMapA4.sousMap(game, 0,0 );
			}
			else if ( PlacementMain.positionSousMap.equals("B4")) {
				SousMapB4.destroyType();
				SousMapB4.createBodyAndType(world);
				SousMapB4.sousMap(game, 0, 0);
			}
			else if ( PlacementMain.positionSousMap.equals("C4")) {
				SousMapC4.destroyType();
				SousMapC4.createBodyAndType(world);
				SousMapC4.sousMap(game, 0, 0);
			}
			else if ( PlacementMain.positionSousMap.equals("D4")) {
				SousMapD4.destroyType();
				SousMapD4.createBodyAndType(world);
				SousMapD4.sousMap(game, 0, 0);
			}
		}
		
		
		
		
		
//		=============================================================================================
//		                                 dessiner les coeurs de vie
//		=============================================================================================
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
		
		
		game.getBatch().draw(Link, Link.getX(), Link.getY());
		
//		game.getBatch().draw(header, 0,480);
		
//		=============================================================================================
//											dessiner la vie
//		=============================================================================================
		
		
		int vie = 0 ;
		int écart = 0;
//		int écart2 =0;
		while ( vie +4 <= Link.getHealth()  ){
//			if ( vie < 40 ) {
				game.getBatch().draw(MainCharacter.coeurPlein, 20 + écart, 440 );
				écart+=15;
//			}
//			else {
//				game.getBatch().draw(MainCharacter.coeurPlein, 20 + écart2, 440 );
//				écart2 += 15;
//			}
			vie += 4;
		
		}
//		if (vie < 40){
			if ( Link.getHealth() % 4 == 1 ) game.getBatch().draw(MainCharacter.coeurUnQuart, 40 + écart, 440 );
			else if ( Link.getHealth() % 4 == 2 ) game.getBatch().draw(MainCharacter.coeurMoitié, 40 + écart, 440 );
			else if ( Link.getHealth() % 4 == 3 ) game.getBatch().draw(MainCharacter.coeurTroisQuart, 40 + écart, 440 );
//		} else {
//			if ( Link.getHealth() % 4 == 1 ) game.getBatch().draw(MainCharacter.coeurUnQuart, 20 + écart2, 440 );
//			else if ( Link.getHealth() % 4 == 2 ) game.getBatch().draw(MainCharacter.coeurMoitié, 20 + écart2, 440 );
//			else if ( Link.getHealth() % 4 == 3 ) game.getBatch().draw(MainCharacter.coeurTroisQuart, 20 + écart2, 440 );
//		}
		
		
		game.getBatch().end();
		
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
