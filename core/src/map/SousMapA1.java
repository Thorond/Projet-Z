package map;

import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.physics.box2d.Body;
import com.badlogic.gdx.physics.box2d.World;
import com.mygdx.game.GameMain;

import d�cors.ClimatMontagneux;
import d�cors.EauProfonde;
import d�cors.HerbesHautes;
import d�cors.MurDroitSolideGauche;
import d�cors.MurDroitSolideHaut;
import scenes.MainMenu;

public class SousMapA1 extends Sprite {
	
	

	
	public static void sousMapA1(GameMain game, int x, int y){
		
		
		ClimatMontagneux.eauProfondeGlac�e(game,0+ x, 0+y);
		ClimatMontagneux.eauProfondeGlac�e(game,0+ x, 60+y);
		ClimatMontagneux.eauProfondeGlac�e(game,0+ x, 120+y);
		ClimatMontagneux.eauProfondeGlac�e(game,0+ x, 180+y);
		ClimatMontagneux.eauProfondeGlac�e(game,0+ x, 240+y);
		ClimatMontagneux.eauProfondeGlac�e(game,0+ x, 300+y);
		ClimatMontagneux.eauProfondeGlac�e(game,0+ x, 360+y);
		ClimatMontagneux.eauProfondeGlac�e(game,0+ x, 420+y);
		
		
		ClimatMontagneux.eauProfondeGlac�e(game,60+ x, 0+y);
		ClimatMontagneux.eauProfondeGlac�e(game,60+ x, 60+y);
		ClimatMontagneux.eauProfondeGlac�e(game,60+ x, 120+y);
		ClimatMontagneux.eauProfondeGlac�e(game,60+ x, 180+y);
		ClimatMontagneux.eauProfondeGlac�e(game,60+ x, 240+y);
		ClimatMontagneux.eauProfondeGlac�e(game,60+ x, 300+y);
		ClimatMontagneux.eauProfondeGlac�e(game,60+ x, 360+y);
		ClimatMontagneux.eauProfondeGlac�e(game,60+ x, 420+y);
		
		ClimatMontagneux.eauProfondeGlac�e(game,120+ x, 0+y);
		ClimatMontagneux.eauProfondeGlac�e(game,120+ x, 60+y);
		ClimatMontagneux.eauProfondeGlac�e(game,120+ x, 120+y);
		ClimatMontagneux.eauProfondeGlac�e(game,120+ x, 180+y);
		ClimatMontagneux.eauProfondeGlac�e(game,120+ x, 240+y);
		ClimatMontagneux.eauProfondeGlac�e(game,120+ x, 300+y);
		ClimatMontagneux.eauProfondeGlac�e(game,120+ x, 360+y);
		ClimatMontagneux.eauProfondeGlac�e(game,120+ x, 420+y);
		
		ClimatMontagneux.eauProfondeGlac�e(game,180+ x, 0+y);
		ClimatMontagneux.eauProfondeGlac�e(game,180+ x, 60+y);
		ClimatMontagneux.eauProfondeGlac�e(game,180+ x, 120+y);
		ClimatMontagneux.eauProfondeGlac�e(game,180+ x, 180+y);
		ClimatMontagneux.eauProfondeGlac�e(game,180+ x, 240+y);
		ClimatMontagneux.eauProfondeGlac�e(game,180+ x, 300+y);
		ClimatMontagneux.eauProfondeGlac�e(game,180+ x, 360+y);
		ClimatMontagneux.eauProfondeGlac�e(game,180+ x, 420+y);
		
		ClimatMontagneux.eauProfondeGlac�e(game,240+ x, 0+y);
		ClimatMontagneux.eauProfondeGlac�e(game,240+ x, 60+y);
		ClimatMontagneux.eauProfondeGlac�e(game,240+ x, 120+y);
		ClimatMontagneux.eauProfondeGlac�e(game,240+ x, 180+y);
		ClimatMontagneux.eauProfondeGlac�e(game,240+ x, 240+y);
		ClimatMontagneux.eauProfondeGlac�e(game,240+ x, 300+y);
		ClimatMontagneux.eauProfondeGlac�e(game,240+ x, 360+y);
		ClimatMontagneux.eauProfondeGlac�e(game,240+ x, 420+y);
		
		ClimatMontagneux.eauProfondeGlac�e(game,300+ x, 0+y);
		ClimatMontagneux.eauProfondeGlac�e(game,300+ x, 60+y);
		ClimatMontagneux.eauProfondeGlac�e(game,300+ x, 120+y);
		ClimatMontagneux.eauProfondeGlac�e(game,300+ x, 180+y);
		ClimatMontagneux.eauProfondeGlac�e(game,300+ x, 240+y);
		ClimatMontagneux.eauProfondeGlac�e(game,300+ x, 300+y);
		ClimatMontagneux.eauProfondeGlac�e(game,300+ x, 360+y);
		ClimatMontagneux.eauProfondeGlac�e(game,300+ x, 420+y);
		
		ClimatMontagneux.eauProfondeGlac�e(game,360+ x, 0+y);
		ClimatMontagneux.eauProfondeGlac�e(game,360+ x, 60+y);
		ClimatMontagneux.eauProfondeGlac�e(game,360+ x, 120+y);
		game.getBatch().draw(ClimatMontagneux.eauProfondeGlac�e, 360+x, 180+y);
		game.getBatch().draw(ClimatMontagneux.glaceFragment�HautGauche, 360+x, 180+y);
		ClimatMontagneux.eauProfondeGlac�e(game,360+ x, 240+y);
		game.getBatch().draw(ClimatMontagneux.morceauGlaceHautGauche, 360+x, 240+y);
		ClimatMontagneux.eauProfondeGlac�e(game,360+ x, 300+y);
		ClimatMontagneux.eauProfondeGlac�e(game,360+ x, 360+y);
		ClimatMontagneux.eauProfondeGlac�e(game,360+ x, 420+y);
		
		ClimatMontagneux.eauProfondeGlac�e(game,420+ x, 0+y);
		ClimatMontagneux.eauProfondeGlac�e(game,420+ x, 60+y);
		game.getBatch().draw(ClimatMontagneux.eauProfondeGlac�e, 420+x, 120+y);
		game.getBatch().draw(ClimatMontagneux.eauProfondeGlac�e, 420+x, 180+y);
		game.getBatch().draw(ClimatMontagneux.glaceFragment�e, 420+x, 120+y);
		game.getBatch().draw(ClimatMontagneux.glaceFragment�e, 420+x, 180+y);
		ClimatMontagneux.eauProfondeGlac�e(game,420+ x, 240+y);
		ClimatMontagneux.eauProfondeGlac�e(game,420+ x, 300+y);
		ClimatMontagneux.eauProfondeGlac�e(game,420+ x, 360+y);
		ClimatMontagneux.eauProfondeGlac�e(game,420+ x, 420+y);
		
		ClimatMontagneux.eauProfondeGlac�e(game,480+ x, 0+y);
		ClimatMontagneux.eauProfondeGlac�e(game,480+ x, 60+y);
		game.getBatch().draw(ClimatMontagneux.eauProfondeGlac�e, 480+x, 120+y);
		game.getBatch().draw(ClimatMontagneux.eauProfondeGlac�e, 480+x, 180+y);
		game.getBatch().draw(ClimatMontagneux.glaceFragment�e, 480+x, 120+y);
		game.getBatch().draw(ClimatMontagneux.glaceFragment�e, 480+x, 180+y);
		ClimatMontagneux.eauProfondeGlac�e(game,480+ x, 240+y);
		ClimatMontagneux.eauProfondeGlac�e(game,480+ x, 300+y);
		ClimatMontagneux.eauProfondeGlac�e(game,480+ x, 360+y);
		ClimatMontagneux.eauProfondeGlac�e(game,480+ x, 420+y);
		
		ClimatMontagneux.eauProfondeGlac�e(game,540+ x, 0+y);
		ClimatMontagneux.eauProfondeGlac�e(game,540+ x, 60+y);
		game.getBatch().draw(ClimatMontagneux.eauProfondeGlac�e, 540+x, 120+y);
		game.getBatch().draw(ClimatMontagneux.eauProfondeGlac�e, 540+x, 180+y);
		game.getBatch().draw(ClimatMontagneux.glaceFragment�e, 540+x, 120+y);
		game.getBatch().draw(ClimatMontagneux.glaceFragment�e, 540+x, 180+y);
		ClimatMontagneux.eauProfondeGlac�e(game,540+ x, 240+y);
		ClimatMontagneux.eauProfondeGlac�e(game,540+ x, 300+y);
		ClimatMontagneux.eauProfondeGlac�e(game,540+ x, 360+y);
		ClimatMontagneux.eauProfondeGlac�e(game,540+ x, 420+y);
		
		game.getBatch().draw(ClimatMontagneux.icebergWater, 60+x, 120+y);
	
	}
	
	public static void createBodyAndType(World world){
		
		
		
		
	}
	
	public static void destroyBody(){
		
	}
}
