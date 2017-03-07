package map;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.physics.box2d.World;
import com.mygdx.game.GameMain;

import décors.EauProfonde;
import décors.HerbesHautes;
import décors.MurDroitSolideGauche;
import décors.MurDroitSolideHaut;
import scenes.MainMenu;

public class SousMapB2 extends Sprite {
	
public static void sousMapB2(GameMain game, int x, int y){
		
		
		game.getBatch().draw(HerbesHautes.gazon, 0 + x, 0 + y);
		game.getBatch().draw(HerbesHautes.gazon, 0 + x, 60 + y);
		game.getBatch().draw(HerbesHautes.gazon, 0+ x, 120+ y);
		game.getBatch().draw(HerbesHautes.gazon, 0+ x, 180+ y);		
		game.getBatch().draw(HerbesHautes.gazon, 0 + x,240 + y);
		game.getBatch().draw(HerbesHautes.gazon, 0+ x, 300+ y);
		game.getBatch().draw(HerbesHautes.gazon, 0+ x, 360+ y);
		game.getBatch().draw(HerbesHautes.gazon, 0+ x, 420+ y);
		
		
		game.getBatch().draw(HerbesHautes.gazon, 60+ x, 0+ y);
		game.getBatch().draw(HerbesHautes.gazon, 60+ x, 60+ y);
		game.getBatch().draw(HerbesHautes.gazon, 60+ x, 120+ y);
		game.getBatch().draw(HerbesHautes.gazon, 60+ x, 180+ y);		
		game.getBatch().draw(HerbesHautes.gazon, 60+ x, 240+ y);	
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
		
		EauProfonde.eauProfonde(game, 180+x, y);
		EauProfonde.eauProfonde(game, 180+x, 60+y);
		EauProfonde.eauProfonde(game, 180+x, 120+y);
		game.getBatch().draw(HerbesHautes.gazon, 180+ x, 180+ y);
		game.getBatch().draw(HerbesHautes.gazon, 180+ x, 240+ y);
		game.getBatch().draw(HerbesHautes.gazon, 180+ x, 300+ y);
		game.getBatch().draw(HerbesHautes.gazon, 180+ x, 360+ y);
		game.getBatch().draw(HerbesHautes.gazon, 180+ x, 420+ y);
		
		game.getBatch().draw(HerbesHautes.gazon, 240+ x, 0+ y);
		game.getBatch().draw(HerbesHautes.gazon, 240+ x, 60+ y);
		EauProfonde.eauProfonde(game, 240+x, 120+y);
		EauProfonde.eauProfonde(game, 240+x, 180+y);
		game.getBatch().draw(HerbesHautes.gazon, 240+ x, 240+ y);
		game.getBatch().draw(HerbesHautes.gazon, 240+ x, 300+ y);
		game.getBatch().draw(HerbesHautes.gazon, 240+ x, 360+ y);
		game.getBatch().draw(HerbesHautes.gazon, 240+ x, 420+ y);
		
		game.getBatch().draw(HerbesHautes.gazon, 300+ x, 0+ y);
		game.getBatch().draw(HerbesHautes.gazon, 300+ x, 60+ y);
		game.getBatch().draw(HerbesHautes.gazon, 300+ x, 120+ y);
		EauProfonde.eauProfonde(game, 300+x, 180+y);
		EauProfonde.eauProfonde(game, 300+x, 240+y);
		game.getBatch().draw(HerbesHautes.gazon, 300+ x, 300+ y);
		game.getBatch().draw(HerbesHautes.gazon, 300+ x, 360+ y);
		game.getBatch().draw(HerbesHautes.gazon, 300+ x, 420+ y);
		
		game.getBatch().draw(HerbesHautes.gazon, 360+ x, 0+ y);
		game.getBatch().draw(HerbesHautes.gazon, 360+ x, 60+ y);
		game.getBatch().draw(HerbesHautes.gazon, 360+ x, 120+ y);
		game.getBatch().draw(HerbesHautes.gazon, 360+ x, 180+ y);
		EauProfonde.eauProfonde(game, 360+x,240+ y);
		game.getBatch().draw(HerbesHautes.gazon, 360+ x, 300+ y);
		game.getBatch().draw(HerbesHautes.gazon, 360+ x, 360+ y);
		game.getBatch().draw(HerbesHautes.gazon, 360+ x, 420+ y);
		
		game.getBatch().draw(HerbesHautes.gazon, 420+ x, 0+ y);
		game.getBatch().draw(HerbesHautes.gazon, 420+ x, 60+ y);
		game.getBatch().draw(HerbesHautes.gazon, 420+ x, 120+ y);
		game.getBatch().draw(HerbesHautes.gazon, 420+ x, 180+ y);
		EauProfonde.eauProfonde(game, 420+x,240+ y);
		game.getBatch().draw(HerbesHautes.gazon, 420+ x, 300+ y);
		game.getBatch().draw(HerbesHautes.gazon, 420+ x, 360+ y);
		game.getBatch().draw(HerbesHautes.gazon, 420+ x, 420+ y);
		
		game.getBatch().draw(HerbesHautes.gazon, 480+ x, 0+ y);
		game.getBatch().draw(HerbesHautes.gazon, 480+ x, 60+ y);
		game.getBatch().draw(HerbesHautes.gazon, 480+ x, 120+ y);
		game.getBatch().draw(HerbesHautes.gazon, 480+ x, 180+ y);
		EauProfonde.eauProfonde(game, 480+x, 240+y);
		EauProfonde.eauProfonde(game, 480+x, 300+y);
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
	
	public static void createBodyAndType(World world){
	
		
	}
	
	public static void destroyBody(){

	}

	
}
