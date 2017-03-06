package map;

import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.physics.box2d.Body;
import com.badlogic.gdx.physics.box2d.World;
import com.mygdx.game.GameMain;

import décors.EauProfonde;
import décors.HerbesHautes;
import décors.MurDroitSolideGauche;
import décors.MurDroitSolideHaut;
import scenes.MainMenu;

public class SousMapA1 extends Sprite {
	
	
	
	
	public static Body bodyMur2;
	public static Body bodyMur3;
	public static Body bodyMur4;
	public static Body bodyMur5;
	public static Body bodyMur6;
	public static Body bodyMur7;
	public static Body bodyMur8;
	public static Body bodyMur9;
	public static Body bodyMur10;
	
	public static boolean isBodyMur2Created;
	public static boolean isBodyMur3Created;
	public static boolean isBodyMur4Created;
	public static boolean isBodyMur5Created;
	public static boolean isBodyMur6Created;
	public static boolean isBodyMur7Created;
	public static boolean isBodyMur8Created;
	public static boolean isBodyMur9Created;
	public static boolean isBodyMur10Created;
	
//	murs gauches
	
	public static Body bodyMurGauche2;
	public static Body bodyMurGauche3;
	public static Body bodyMurGauche4;
	public static Body bodyMurGauche5;
	public static Body bodyMurGauche6;
	public static Body bodyMurGauche7;
	public static Body bodyMurGauche8;
	
	public static boolean isBodyMurGauche2Created;
	public static boolean isBodyMurGauche3Created;
	public static boolean isBodyMurGauche4Created;
	public static boolean isBodyMurGauche5Created;
	public static boolean isBodyMurGauche6Created;
	public static boolean isBodyMurGauche7Created;
	public static boolean isBodyMurGauche8Created;
	
	
	public static void sousMapA1(GameMain game, int x, int y){
		
		
		game.getBatch().draw(MurDroitSolideGauche.murDroitSolideGauche, 0 + x, 0 + y);
		game.getBatch().draw(MurDroitSolideGauche.murDroitSolideGauche, 0 + x, 60 + y);
		game.getBatch().draw(MurDroitSolideGauche.murDroitSolideGauche, 0+ x, 120+ y);
		game.getBatch().draw(MurDroitSolideGauche.murDroitSolideGauche, 0+ x, 180+ y);		
		game.getBatch().draw(MurDroitSolideGauche.murDroitSolideGauche, 0 + x,240 + y);
		game.getBatch().draw(MurDroitSolideGauche.murDroitSolideGauche, 0+ x, 300+ y);
		game.getBatch().draw(MurDroitSolideGauche.murDroitSolideGauche, 0+ x, 360+ y);
		game.getBatch().draw(MurDroitSolideHaut.murDroitSolideHaut, 0+ x, 420+ y);
		
		
		game.getBatch().draw(HerbesHautes.gazon, 60+ x, 0+ y);
		game.getBatch().draw(HerbesHautes.gazon, 60+ x, 60+ y);
		game.getBatch().draw(HerbesHautes.gazon, 60+ x, 120+ y);
		game.getBatch().draw(HerbesHautes.gazon, 60+ x, 180+ y);		
		game.getBatch().draw(HerbesHautes.gazon, 60+ x, 240+ y);	
		game.getBatch().draw(HerbesHautes.gazon, 60+ x, 300+ y);
		game.getBatch().draw(HerbesHautes.gazon, 60+ x, 360+ y);
		game.getBatch().draw(MurDroitSolideHaut.murDroitSolideHaut, 60+ x, 420+ y);
		
		game.getBatch().draw(HerbesHautes.gazon, 120+ x, 0+ y);
		game.getBatch().draw(HerbesHautes.gazon, 120+ x, 60+ y);
		game.getBatch().draw(HerbesHautes.gazon, 120+ x, 120+ y);
		game.getBatch().draw(HerbesHautes.gazon, 120+ x, 180+ y);
		game.getBatch().draw(HerbesHautes.gazon, 120+ x, 240+ y);
		game.getBatch().draw(HerbesHautes.gazon, 120+ x, 300+ y);
		game.getBatch().draw(HerbesHautes.gazon, 120+ x, 360+ y);
		game.getBatch().draw(MurDroitSolideHaut.murDroitSolideHaut, 120+ x, 420+ y);
		
		EauProfonde.eauProfonde(game, 180+x, y);
		EauProfonde.eauProfonde(game, 180+x, 60+y);
		EauProfonde.eauProfonde(game, 180+x, 120+y);
		game.getBatch().draw(HerbesHautes.gazon, 180+ x, 180+ y);
		game.getBatch().draw(HerbesHautes.gazon, 180+ x, 240+ y);
		game.getBatch().draw(HerbesHautes.gazon, 180+ x, 300+ y);
		game.getBatch().draw(HerbesHautes.gazon, 180+ x, 360+ y);
		game.getBatch().draw(MurDroitSolideHaut.murDroitSolideHaut, 180+ x, 420+ y);
		
		game.getBatch().draw(HerbesHautes.gazon, 240+ x, 0+ y);
		game.getBatch().draw(HerbesHautes.gazon, 240+ x, 60+ y);
		EauProfonde.eauProfonde(game, 240+x, 120+y);
		EauProfonde.eauProfonde(game, 240+x, 180+y);
		game.getBatch().draw(HerbesHautes.gazon, 240+ x, 240+ y);
		game.getBatch().draw(HerbesHautes.gazon, 240+ x, 300+ y);
		game.getBatch().draw(HerbesHautes.gazon, 240+ x, 360+ y);
		game.getBatch().draw(MurDroitSolideHaut.murDroitSolideHaut, 240+ x, 420+ y);
		
		game.getBatch().draw(HerbesHautes.gazon, 300+ x, 0+ y);
		game.getBatch().draw(HerbesHautes.gazon, 300+ x, 60+ y);
		game.getBatch().draw(HerbesHautes.gazon, 300+ x, 120+ y);
		EauProfonde.eauProfonde(game, 300+x, 180+y);
		EauProfonde.eauProfonde(game, 300+x, 240+y);
		game.getBatch().draw(HerbesHautes.gazon, 300+ x, 300+ y);
		game.getBatch().draw(HerbesHautes.gazon, 300+ x, 360+ y);
		game.getBatch().draw(MurDroitSolideHaut.murDroitSolideHaut, 300+ x, 420+ y);
		
		game.getBatch().draw(HerbesHautes.gazon, 360+ x, 0+ y);
		game.getBatch().draw(HerbesHautes.gazon, 360+ x, 60+ y);
		game.getBatch().draw(HerbesHautes.gazon, 360+ x, 120+ y);
		game.getBatch().draw(HerbesHautes.gazon, 360+ x, 180+ y);
		EauProfonde.eauProfonde(game, 360+x,240+ y);
		game.getBatch().draw(HerbesHautes.gazon, 360+ x, 300+ y);
		game.getBatch().draw(HerbesHautes.gazon, 360+ x, 360+ y);
		game.getBatch().draw(MurDroitSolideHaut.murDroitSolideHaut, 360+ x, 420+ y);
		
		game.getBatch().draw(HerbesHautes.gazon, 420+ x, 0+ y);
		game.getBatch().draw(HerbesHautes.gazon, 420+ x, 60+ y);
		game.getBatch().draw(HerbesHautes.gazon, 420+ x, 120+ y);
		game.getBatch().draw(HerbesHautes.gazon, 420+ x, 180+ y);
		EauProfonde.eauProfonde(game, 420+x,240+ y);
		game.getBatch().draw(HerbesHautes.gazon, 420+ x, 300+ y);
		game.getBatch().draw(HerbesHautes.gazon, 420+ x, 360+ y);
		game.getBatch().draw(MurDroitSolideHaut.murDroitSolideHaut, 420+ x, 420+ y);
		
		game.getBatch().draw(HerbesHautes.gazon, 480+ x, 0+ y);
		game.getBatch().draw(HerbesHautes.gazon, 480+ x, 60+ y);
		game.getBatch().draw(HerbesHautes.gazon, 480+ x, 120+ y);
		game.getBatch().draw(HerbesHautes.gazon, 480+ x, 180+ y);
		EauProfonde.eauProfonde(game, 480+x, 240+y);
		EauProfonde.eauProfonde(game, 480+x, 300+y);
		game.getBatch().draw(HerbesHautes.gazon, 480+ x, 360+ y);
		game.getBatch().draw(MurDroitSolideHaut.murDroitSolideHaut, 480+ x, 420+ y);
		
		game.getBatch().draw(HerbesHautes.gazon, 540+ x, 0+ y);
		game.getBatch().draw(HerbesHautes.gazon, 540+ x, 60+ y);
		game.getBatch().draw(HerbesHautes.gazon, 540+ x, 120+ y);
		game.getBatch().draw(HerbesHautes.gazon, 540+ x, 180+ y);
		game.getBatch().draw(HerbesHautes.gazon, 540+ x, 240+ y);
		EauProfonde.eauProfonde(game, 540+x, 300+y);
		game.getBatch().draw(HerbesHautes.gazon, 540+ x, 360+ y);
		game.getBatch().draw(MurDroitSolideHaut.murDroitSolideHaut, 540+ x, 420+ y);
		
		
//		==================================================================
//						Placement des dessins des monstres
//		==================================================================
	
	}
	
	public static void createBodyAndType(World world){
		
		Map.setTypeDeDécor(180/60,0,"EauProfonde");
		Map.setTypeDeDécor(180/60,60/60,"EauProfonde");
		Map.setTypeDeDécor(180/60,120/60,"EauProfonde");
		Map.setTypeDeDécor(240/60,120/60,"EauProfonde");
		Map.setTypeDeDécor(240/60,180/60,"EauProfonde");
		Map.setTypeDeDécor(300/60,180/60,"EauProfonde");
		Map.setTypeDeDécor(300/60,240/60,"EauProfonde");
		Map.setTypeDeDécor(360/60,240/60,"EauProfonde");
		Map.setTypeDeDécor(420/60,240/60,"EauProfonde");
		Map.setTypeDeDécor(480/60,240/60,"EauProfonde");
		Map.setTypeDeDécor(480/60,300/60,"EauProfonde");
		Map.setTypeDeDécor(540/60,300/60,"EauProfonde");
		
		
		
//		========================================================================================
//							Création des corps du mur supérieur
//		========================================================================================
		
		
		if ( isBodyMur2Created == false ) {
			bodyMur2 = MurDroitSolideHaut.createBody(60,430);
			isBodyMur2Created = true;
		}
		if ( isBodyMur3Created == false ) {
			bodyMur3 = MurDroitSolideHaut.createBody(120,430);
			isBodyMur3Created = true;
		}
		if ( isBodyMur4Created == false ) {
			bodyMur4 = MurDroitSolideHaut.createBody(180,430);
			isBodyMur4Created = true;
		}
		if ( isBodyMur5Created == false ) {
			bodyMur5 = MurDroitSolideHaut.createBody(240,430);
			isBodyMur5Created = true;
		}
		if ( isBodyMur6Created == false ) {
			bodyMur6 = MurDroitSolideHaut.createBody(300,430);
			isBodyMur6Created = true;
		}
		if ( isBodyMur7Created == false ) {
			bodyMur7 = MurDroitSolideHaut.createBody(360,430);
			isBodyMur7Created = true;
		}
		if ( isBodyMur8Created == false ) {
			bodyMur8 = MurDroitSolideHaut.createBody(420,430);
			isBodyMur8Created = true;
		}
		if ( isBodyMur9Created == false ) {
			bodyMur9 = MurDroitSolideHaut.createBody(480,430);
			isBodyMur9Created = true;
		}
		if ( isBodyMur10Created == false ) {
			bodyMur10 = MurDroitSolideHaut.createBody(540,430);
			isBodyMur10Created = true;
		}
		
//		murs gauches
		
		if ( isBodyMurGauche2Created == false ) {
			bodyMurGauche2 = MurDroitSolideHaut.createBody(0,0);
			isBodyMurGauche2Created = true;
		}
		if ( isBodyMurGauche3Created == false ) {
			bodyMurGauche3 = MurDroitSolideHaut.createBody(0,60);
			isBodyMurGauche3Created = true;
		}
		if ( isBodyMurGauche4Created == false ) {
			bodyMurGauche4 = MurDroitSolideHaut.createBody(0,120);
			isBodyMurGauche4Created = true;
		}
		if ( isBodyMurGauche5Created == false ) {
			bodyMurGauche5 = MurDroitSolideHaut.createBody(0,180);
			isBodyMurGauche5Created = true;
		}
		if ( isBodyMurGauche6Created == false ) {
			bodyMurGauche6 = MurDroitSolideHaut.createBody(0,240);
			isBodyMurGauche6Created = true;
		}
		if ( isBodyMurGauche7Created == false ) {
			bodyMurGauche7 = MurDroitSolideHaut.createBody(0,300);
			isBodyMurGauche7Created = true;
		}
		if ( isBodyMurGauche8Created == false ) {
			bodyMurGauche8 = MurDroitSolideHaut.createBody(0,360);
			isBodyMurGauche8Created = true;
		}
		
		
		
//		========================================================================================
//									Création des corps des montres
//		========================================================================================
		
		
	}
	
	public static void destroyBody(){
//		déstruction du corps des arbres et des monstres
		
		
//		déstruction du corps des murs
		if ( isBodyMur2Created)MainMenu.world.destroyBody(bodyMur2);
		if ( isBodyMur3Created)MainMenu.world.destroyBody(bodyMur3);
		if ( isBodyMur4Created)MainMenu.world.destroyBody(bodyMur4);
		if ( isBodyMur5Created)MainMenu.world.destroyBody(bodyMur5);
		if ( isBodyMur6Created)MainMenu.world.destroyBody(bodyMur6);
		if ( isBodyMur7Created)MainMenu.world.destroyBody(bodyMur7);
		if ( isBodyMur8Created)MainMenu.world.destroyBody(bodyMur8);
		if ( isBodyMur9Created)	MainMenu.world.destroyBody(bodyMur9);
		if ( isBodyMur10Created)	MainMenu.world.destroyBody(bodyMur10);
		isBodyMur2Created = false;
		isBodyMur3Created = false;
		isBodyMur4Created = false;
		isBodyMur5Created = false;
		isBodyMur6Created = false;
		isBodyMur7Created = false;
		isBodyMur8Created = false;
		isBodyMur9Created = false;
		isBodyMur10Created = false;
		
//		murs gauches
		
		if ( isBodyMurGauche2Created)MainMenu.world.destroyBody(bodyMurGauche2);
		if ( isBodyMurGauche3Created)MainMenu.world.destroyBody(bodyMurGauche3);
		if ( isBodyMurGauche4Created)MainMenu.world.destroyBody(bodyMurGauche4);
		if ( isBodyMurGauche5Created)MainMenu.world.destroyBody(bodyMurGauche5);
		if ( isBodyMurGauche6Created)MainMenu.world.destroyBody(bodyMurGauche6);
		if ( isBodyMurGauche7Created)MainMenu.world.destroyBody(bodyMurGauche7);
		if ( isBodyMurGauche8Created)MainMenu.world.destroyBody(bodyMurGauche8);
		isBodyMurGauche2Created = false;
		isBodyMurGauche3Created = false;
		isBodyMurGauche4Created = false;
		isBodyMurGauche5Created = false;
		isBodyMurGauche6Created = false;
		isBodyMurGauche7Created = false;
		isBodyMurGauche8Created = false;
	}
}
