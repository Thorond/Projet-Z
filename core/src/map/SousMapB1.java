package map;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.physics.box2d.Body;
import com.mygdx.game.GameMain;

import décors.HerbesBasses;
import décors.RacineGaucheArbre;
import scenes.MainMenu;

public class SousMapB1 extends Sprite {
	
	public static Texture sousMapB1 = new Texture("Corps.png");
	
	public static Body body1;
	public static boolean isBody1Created;
	public static Body body2;
	public static boolean isBody2Created;
	
	
	public static void sousMapB1(GameMain game){
		game.getBatch().draw(HerbesBasses.map6060, 0, 0);
		game.getBatch().draw(HerbesBasses.map6060, 0, 60);
		game.getBatch().draw(HerbesBasses.map6060, 0, 120);
		game.getBatch().draw(HerbesBasses.map6060, 0, 180);
		game.getBatch().draw(HerbesBasses.map6060, 0, 240);
		game.getBatch().draw(HerbesBasses.map6060, 0, 300);
		game.getBatch().draw(HerbesBasses.map6060, 0, 360);
		game.getBatch().draw(HerbesBasses.map6060, 0, 420);
		
		game.getBatch().draw(HerbesBasses.map6060, 60, 0);
		game.getBatch().draw(HerbesBasses.map6060, 60, 60);
		game.getBatch().draw(HerbesBasses.map6060, 60, 120);
		game.getBatch().draw(HerbesBasses.map6060, 60, 180);
		game.getBatch().draw(HerbesBasses.map6060, 60, 240);
		game.getBatch().draw(HerbesBasses.map6060, 60, 300);
		game.getBatch().draw(HerbesBasses.map6060, 60, 360);
		game.getBatch().draw(HerbesBasses.map6060, 60, 420);
		
		game.getBatch().draw(HerbesBasses.map6060, 120, 0);
		game.getBatch().draw(HerbesBasses.map6060, 120, 60);
		game.getBatch().draw(HerbesBasses.map6060, 120, 120);
		game.getBatch().draw(HerbesBasses.map6060, 120, 180);
		game.getBatch().draw(HerbesBasses.map6060, 120, 240);
		game.getBatch().draw(HerbesBasses.map6060, 120, 300);
		game.getBatch().draw(HerbesBasses.map6060, 120, 360);
		game.getBatch().draw(HerbesBasses.map6060, 120, 420);
		
		game.getBatch().draw(HerbesBasses.map6060, 180, 0);
		game.getBatch().draw(HerbesBasses.map6060, 180, 60);
		game.getBatch().draw(HerbesBasses.map6060, 180, 120);
		game.getBatch().draw(HerbesBasses.map6060, 180, 180);
		game.getBatch().draw(HerbesBasses.map6060, 180, 240);
		game.getBatch().draw(HerbesBasses.map6060, 180, 300);
		game.getBatch().draw(HerbesBasses.map6060, 180, 360);
		game.getBatch().draw(HerbesBasses.map6060, 180, 420);
		
		game.getBatch().draw(HerbesBasses.map6060, 240, 0);
		game.getBatch().draw(HerbesBasses.map6060, 240, 60);
		game.getBatch().draw(HerbesBasses.map6060, 240, 120);
		game.getBatch().draw(HerbesBasses.map6060, 240, 180);
		game.getBatch().draw(HerbesBasses.map6060, 240, 240);
		game.getBatch().draw(HerbesBasses.map6060, 240, 300);
		game.getBatch().draw(HerbesBasses.map6060, 240, 360);
		game.getBatch().draw(HerbesBasses.map6060, 240, 420);
		
		if ( isBody1Created == false ) {
			body1 = RacineGaucheArbre.createBody(370,305);
			isBody1Created = true;
		}
		game.getBatch().draw(RacineGaucheArbre.map6060, 360, 300);
		
		if ( isBody2Created == false ) {
			body2 = RacineGaucheArbre.createBody(430,185);
			isBody2Created = true;
		}
		game.getBatch().draw(RacineGaucheArbre.map6060, 420, 180);
		
		
	}
	
	public static void destroyBody(){
		MainMenu.world.destroyBody(body1);
		MainMenu.world.destroyBody(body2);
		SousMapB1.isBody1Created = false;
		SousMapB1.isBody2Created = false;
	}
	

	
}
