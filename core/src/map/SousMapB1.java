package map;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.physics.box2d.Body;
import com.mygdx.game.GameMain;

import décors.HerbesBasses;
import décors.HerbesHautes;
import décors.RacineGaucheArbre;
import scenes.MainMenu;

public class SousMapB1 extends Sprite {
	
	public static Texture sousMapB1 = new Texture("Corps.png");
	
	public static Body body1;
	public static boolean isBody1Created;
	public static Body body2;
	public static boolean isBody2Created;
	
	
	public static void sousMapB1(GameMain game){
		
		Map.setTypeDeDécor(0, 0, "HerbesHautes");
		if ( Map.décorChangé[0][0] == false ) game.getBatch().draw(HerbesHautes.gazon, 0, 0);
		else game.getBatch().draw(HerbesBasses.gazonNeutre, 0, 0);
		
		game.getBatch().draw(HerbesBasses.gazonNeutre, 0, 60);
		game.getBatch().draw(HerbesHautes.gazon, 0, 120);
		game.getBatch().draw(HerbesHautes.gazon, 0, 180);
		Map.setTypeDeDécor(0, 240 / 60, "HerbesHautes");
		if ( Map.décorChangé[0][240 /60 ] == false ) game.getBatch().draw(HerbesHautes.gazon, 0, 240);
		else game.getBatch().draw(HerbesBasses.gazonNeutre, 0, 240);
		
		game.getBatch().draw(HerbesHautes.gazon, 0, 300);
		game.getBatch().draw(HerbesHautes.gazon, 0, 360);
		game.getBatch().draw(HerbesHautes.gazon, 0, 420);
		
		
		game.getBatch().draw(HerbesHautes.gazon, 60, 0);
		game.getBatch().draw(HerbesHautes.gazon, 60, 60);
		game.getBatch().draw(HerbesHautes.gazon, 60, 120);
		game.getBatch().draw(HerbesHautes.gazon, 60, 180);
		Map.setTypeDeDécor(60 / 60, 240 / 60, "HerbesHautes");
		if ( Map.décorChangé[60 / 60 ][ 240 / 60] == false ) game.getBatch().draw(HerbesHautes.gazon, 60, 240);
		else game.getBatch().draw(HerbesBasses.gazonNeutre, 60, 240);
		
		game.getBatch().draw(HerbesHautes.gazon, 60, 300);
		game.getBatch().draw(HerbesHautes.gazon, 60, 360);
		game.getBatch().draw(HerbesHautes.gazon, 60, 420);
		
		game.getBatch().draw(HerbesHautes.gazon, 120, 0);
		game.getBatch().draw(HerbesHautes.gazon, 120, 60);
		game.getBatch().draw(HerbesHautes.gazon, 120, 120);
		game.getBatch().draw(HerbesHautes.gazon, 120, 180);
		game.getBatch().draw(HerbesHautes.gazon, 120, 240);
		game.getBatch().draw(HerbesHautes.gazon, 120, 300);
		game.getBatch().draw(HerbesHautes.gazon, 120, 360);
		game.getBatch().draw(HerbesHautes.gazon, 120, 420);
		
		game.getBatch().draw(HerbesHautes.gazon, 180, 0);
		game.getBatch().draw(HerbesHautes.gazon, 180, 60);
		game.getBatch().draw(HerbesHautes.gazon, 180, 120);
		game.getBatch().draw(HerbesHautes.gazon, 180, 180);
		game.getBatch().draw(HerbesHautes.gazon, 180, 240);
		game.getBatch().draw(HerbesHautes.gazon, 180, 300);
		game.getBatch().draw(HerbesHautes.gazon, 180, 360);
		game.getBatch().draw(HerbesHautes.gazon, 180, 420);
		
		game.getBatch().draw(HerbesHautes.gazon, 240, 0);
		game.getBatch().draw(HerbesHautes.gazon, 240, 60);
		game.getBatch().draw(HerbesHautes.gazon, 240, 120);
		game.getBatch().draw(HerbesHautes.gazon, 240, 180);
		game.getBatch().draw(HerbesHautes.gazon, 240, 240);
		game.getBatch().draw(HerbesHautes.gazon, 240, 300);
		game.getBatch().draw(HerbesHautes.gazon, 240, 360);
		game.getBatch().draw(HerbesHautes.gazon, 240, 420);
		
		game.getBatch().draw(HerbesHautes.gazon, 300, 0);
		game.getBatch().draw(HerbesHautes.gazon, 300, 60);
		game.getBatch().draw(HerbesHautes.gazon, 300, 120);
		game.getBatch().draw(HerbesHautes.gazon, 300, 180);
		game.getBatch().draw(HerbesHautes.gazon, 300, 240);
		game.getBatch().draw(HerbesHautes.gazon, 300, 300);
		game.getBatch().draw(HerbesHautes.gazon, 300, 360);
		game.getBatch().draw(HerbesHautes.gazon, 300, 420);
		
		game.getBatch().draw(HerbesHautes.gazon, 360, 0);
		game.getBatch().draw(HerbesHautes.gazon, 360, 60);
		game.getBatch().draw(HerbesHautes.gazon, 360, 120);
		game.getBatch().draw(HerbesHautes.gazon, 360, 180);
		game.getBatch().draw(HerbesHautes.gazon, 360, 240);
		if ( isBody1Created == false ) {
			body1 = RacineGaucheArbre.createBody(370,305);
			isBody1Created = true;
		}
		game.getBatch().draw(RacineGaucheArbre.map6060, 360, 300);
		game.getBatch().draw(HerbesHautes.gazon, 360, 360);
		game.getBatch().draw(HerbesHautes.gazon, 360, 420);
		
		game.getBatch().draw(HerbesHautes.gazon, 420, 0);
		game.getBatch().draw(HerbesHautes.gazon, 420, 60);
		game.getBatch().draw(HerbesHautes.gazon, 420, 120);
		if ( isBody2Created == false ) {
			body2 = RacineGaucheArbre.createBody(430,185);
			isBody2Created = true;
		}
		game.getBatch().draw(RacineGaucheArbre.map6060, 420, 180);
		game.getBatch().draw(HerbesHautes.gazon, 420, 240);
		game.getBatch().draw(HerbesHautes.gazon, 420, 300);
		game.getBatch().draw(HerbesHautes.gazon, 420, 360);
		game.getBatch().draw(HerbesHautes.gazon, 420, 420);
		
		game.getBatch().draw(HerbesHautes.gazon, 480, 0);
		game.getBatch().draw(HerbesHautes.gazon, 480, 60);
		game.getBatch().draw(HerbesHautes.gazon, 480, 120);
//		game.getBatch().draw(Trou.trou, 480, 180);
		Map.setTypeDeDécor(480/60, 180/60, "trou");
		game.getBatch().draw(HerbesHautes.gazon, 480, 240);
		game.getBatch().draw(HerbesHautes.gazon, 480, 300);
		game.getBatch().draw(HerbesHautes.gazon, 480, 360);
		game.getBatch().draw(HerbesHautes.gazon, 480, 420);
		
		game.getBatch().draw(HerbesHautes.gazon, 540, 0);
		game.getBatch().draw(HerbesHautes.gazon, 540, 60);
		game.getBatch().draw(HerbesHautes.gazon, 540, 120);
		game.getBatch().draw(HerbesHautes.gazon, 540, 180);
		game.getBatch().draw(HerbesHautes.gazon, 540, 240);
		game.getBatch().draw(HerbesHautes.gazon, 540, 300);
		game.getBatch().draw(HerbesHautes.gazon, 540, 360);
		game.getBatch().draw(HerbesHautes.gazon, 540, 420);
		
		
	}
	
	public static void destroyBody(){
		MainMenu.world.destroyBody(body1);
		MainMenu.world.destroyBody(body2);
		SousMapB1.isBody1Created = false;
		SousMapB1.isBody2Created = false;
	}
	

	
}
