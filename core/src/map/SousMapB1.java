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
	public static int x;
	public static int y;
	
	
	public static void sousMapB1(GameMain game, int x, int y){
		
		
		if ( Map.décorChangé[0][0] == false ) game.getBatch().draw(HerbesHautes.gazon, 0+x, 0+y);
		else game.getBatch().draw(HerbesBasses.gazonNeutre, 0 + x, 0 + y);
		
		game.getBatch().draw(HerbesBasses.gazonNeutre, 0 + x, 60 + y);
		game.getBatch().draw(HerbesHautes.gazon, 0+ x, 120+ y);
		game.getBatch().draw(HerbesHautes.gazon, 0+ x, 180+ y);
		
		if ( Map.décorChangé[0][240 /60 ] == false ) game.getBatch().draw(HerbesHautes.gazon, 0+x, 240+y);
		else game.getBatch().draw(HerbesBasses.gazonNeutre, 0 + x, 240+y);
		
		game.getBatch().draw(HerbesHautes.gazon, 0+ x, 300+ y);
		game.getBatch().draw(HerbesHautes.gazon, 0+ x, 360+ y);
		game.getBatch().draw(HerbesHautes.gazon, 0+ x, 420+ y);
		
		
		game.getBatch().draw(HerbesHautes.gazon, 60+ x, 0+ y);
		game.getBatch().draw(HerbesHautes.gazon, 60+ x, 60+ y);
		game.getBatch().draw(HerbesHautes.gazon, 60+ x, 120+ y);
		game.getBatch().draw(HerbesHautes.gazon, 60+ x, 180+ y);
		
		if ( Map.décorChangé[60 / 60 ][ 240 / 60] == false ) game.getBatch().draw(HerbesHautes.gazon, 60+ x, 240+ y);
		else game.getBatch().draw(HerbesBasses.gazonNeutre, 60+ x, 240+ y);
		
		game.getBatch().draw(HerbesHautes.gazon, 60+ x, 300+ y);
		game.getBatch().draw(HerbesHautes.gazon, 60+ x, 360+ y);
		game.getBatch().draw(HerbesHautes.gazon, 60+ x, 420+ y);
		
		game.getBatch().draw(HerbesHautes.gazon, 120+ x, 0+ y);
		game.getBatch().draw(HerbesHautes.gazon, 120+ x, 60+ y);
		game.getBatch().draw(HerbesHautes.gazon, 120+ x, 120+ y);
		game.getBatch().draw(HerbesHautes.gazon, 120+ x, 180+ y);
		game.getBatch().draw(HerbesHautes.gazon, 120+ x, 240+ y);
		game.getBatch().draw(HerbesHautes.gazon, 120+ x, 300+ y);
		game.getBatch().draw(HerbesHautes.gazon, 120+ x, 360+ y);
		game.getBatch().draw(HerbesHautes.gazon, 120+ x, 420+ y);
		
		game.getBatch().draw(HerbesHautes.gazon, 180+ x, 0+ y);
		game.getBatch().draw(HerbesHautes.gazon, 180+ x, 60+ y);
		game.getBatch().draw(HerbesHautes.gazon, 180+ x, 120+ y);
		game.getBatch().draw(HerbesHautes.gazon, 180+ x, 180+ y);
		game.getBatch().draw(HerbesHautes.gazon, 180+ x, 240+ y);
		game.getBatch().draw(HerbesHautes.gazon, 180+ x, 300+ y);
		game.getBatch().draw(HerbesHautes.gazon, 180+ x, 360+ y);
		game.getBatch().draw(HerbesHautes.gazon, 180+ x, 420+ y);
		
		game.getBatch().draw(HerbesHautes.gazon, 240+ x, 0+ y);
		game.getBatch().draw(HerbesHautes.gazon, 240+ x, 60+ y);
		game.getBatch().draw(HerbesHautes.gazon, 240+ x, 120+ y);
		game.getBatch().draw(HerbesHautes.gazon, 240+ x, 180+ y);
		game.getBatch().draw(HerbesHautes.gazon, 240+ x, 240+ y);
		game.getBatch().draw(HerbesHautes.gazon, 240+ x, 300+ y);
		game.getBatch().draw(HerbesHautes.gazon, 240+ x, 360+ y);
		game.getBatch().draw(HerbesHautes.gazon, 240+ x, 420+ y);
		
		game.getBatch().draw(HerbesHautes.gazon, 300+ x, 0+ y);
		game.getBatch().draw(HerbesHautes.gazon, 300+ x, 60+ y);
		game.getBatch().draw(HerbesHautes.gazon, 300+ x, 120+ y);
		game.getBatch().draw(HerbesHautes.gazon, 300+ x, 180+ y);
		game.getBatch().draw(HerbesHautes.gazon, 300+ x, 240+ y);
		game.getBatch().draw(HerbesHautes.gazon, 300+ x, 300+ y);
		game.getBatch().draw(HerbesHautes.gazon, 300+ x, 360+ y);
		game.getBatch().draw(HerbesHautes.gazon, 300+ x, 420+ y);
		
		game.getBatch().draw(HerbesHautes.gazon, 360+ x, 0+ y);
		game.getBatch().draw(HerbesHautes.gazon, 360+ x, 60+ y);
		game.getBatch().draw(HerbesHautes.gazon, 360+ x, 120+ y);
		game.getBatch().draw(HerbesHautes.gazon, 360+ x, 180+ y);
		game.getBatch().draw(HerbesHautes.gazon, 360+ x, 240+ y);
		game.getBatch().draw(RacineGaucheArbre.map6060, 360+ x, 300+ y);
		game.getBatch().draw(HerbesHautes.gazon, 360+ x, 360+ y);
		game.getBatch().draw(HerbesHautes.gazon, 360+ x, 420+ y);
		
		game.getBatch().draw(HerbesHautes.gazon, 420+ x, 0+ y);
		game.getBatch().draw(HerbesHautes.gazon, 420+ x, 60+ y);
		game.getBatch().draw(HerbesHautes.gazon, 420+ x, 120+ y);
		game.getBatch().draw(RacineGaucheArbre.map6060, 420+ x, 180+ y);
		game.getBatch().draw(HerbesHautes.gazon, 420+ x, 240+ y);
		game.getBatch().draw(HerbesHautes.gazon, 420+ x, 300+ y);
		game.getBatch().draw(HerbesHautes.gazon, 420+ x, 360+ y);
		game.getBatch().draw(HerbesHautes.gazon, 420+ x, 420+ y);
		
		game.getBatch().draw(HerbesHautes.gazon, 480+ x, 0+ y);
		game.getBatch().draw(HerbesHautes.gazon, 480+ x, 60+ y);
		game.getBatch().draw(HerbesHautes.gazon, 480+ x, 120+ y);
//		game.getBatch().draw(Trou.trou, 480, 180);
		game.getBatch().draw(HerbesHautes.gazon, 480+ x, 240+ y);
		game.getBatch().draw(HerbesHautes.gazon, 480+ x, 300+ y);
		game.getBatch().draw(HerbesHautes.gazon, 480+ x, 360+ y);
		game.getBatch().draw(HerbesHautes.gazon, 480+ x, 420+ y);
		
		game.getBatch().draw(HerbesHautes.gazon, 540+ x, 0+ y);
		game.getBatch().draw(HerbesHautes.gazon, 540+ x, 60+ y);
		game.getBatch().draw(HerbesHautes.gazon, 540+ x, 120+ y);
		game.getBatch().draw(HerbesHautes.gazon, 540+ x, 180+ y);
		game.getBatch().draw(HerbesHautes.gazon, 540+ x, 240+ y);
		game.getBatch().draw(HerbesHautes.gazon, 540+ x, 300+ y);
		game.getBatch().draw(HerbesHautes.gazon, 540+ x, 360+ y);
		game.getBatch().draw(HerbesHautes.gazon, 540+ x, 420+ y);
		
		
	}
	
	public static void createBodyAndType(){
		
		Map.setTypeDeDécor(0, 0, "HerbesHautes");
		
		Map.setTypeDeDécor(0, 240 / 60, "HerbesHautes");
		
		Map.setTypeDeDécor(60 / 60, 240 / 60, "HerbesHautes");
		
		if ( isBody1Created == false ) {
			body1 = RacineGaucheArbre.createBody(370,305);
			isBody1Created = true;
		}
		
		if ( isBody2Created == false ) {
			body2 = RacineGaucheArbre.createBody(430,185);
			isBody2Created = true;
		}
		
		Map.setTypeDeDécor(480/60, 180/60, "trou");
	}
	
	public static void destroyBody(){
		MainMenu.world.destroyBody(body1);
		MainMenu.world.destroyBody(body2);
		SousMapB1.isBody1Created = false;
		SousMapB1.isBody2Created = false;
	}
	

	
}
