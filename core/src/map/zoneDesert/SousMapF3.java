package map.zoneDesert;

import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.physics.box2d.Body;
import com.badlogic.gdx.physics.box2d.World;
import com.mygdx.game.GameMain;

import decors.ClimatMontagneux;
import map.CadrillageMap;
import scenes.MainMenu;

public class SousMapF3 extends Sprite{
	
	public static Body mur1 ;
	public static boolean ismur1Created;
	public static Body mur2 ;
	public static boolean ismur2Created;
	public static Body mur3 ;
	public static boolean ismur3Created;
	public static Body mur4 ;
	public static boolean ismur4Created;
	public static Body mur5;
	public static boolean ismur5Created;
	public static Body mur6;
	public static boolean ismur6Created;
	public static Body mur7;
	public static boolean ismur7Created;
	public static Body mur8;
	public static boolean ismur8Created;
	
	public static Body grossePierre1;
	public static boolean isGrossePierre1Created;
	public static Body grossePierre2;
	public static boolean isGrossePierre2Created;
	public static Body grossePierre3;
	public static boolean isGrossePierre3Created;
	public static Body grossePierre4;
	public static boolean isGrossePierre4Created;
	
	public static Body arbre1;
	public static boolean isArbre1Created;
	
	
	public static void sousMap(GameMain game, int x, int y){
		
		game.getBatch().draw(ClimatMontagneux.glace1, 0+ x, 0+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 0+ x, 60+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 0+ x, 120+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 0+ x, 180+ y);		
		game.getBatch().draw(ClimatMontagneux.glace1, 0 + x,240 + y);
		game.getBatch().draw(ClimatMontagneux.glace1, 0+ x, 300+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 0+ x, 360+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 0+ x, 420+ y);
		
		game.getBatch().draw(ClimatMontagneux.glace1, 60+ x, 0+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 60+ x, 60+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 60+ x, 120+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 60+ x, 180+ y);		
		game.getBatch().draw(ClimatMontagneux.glace1, 60+ x, 240+ y);	
		game.getBatch().draw(ClimatMontagneux.glace1, 60+ x, 300+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 60+ x, 360+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 60+ x, 420+ y);
		
		game.getBatch().draw(ClimatMontagneux.glace1, 120+ x, 0+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 120+ x, 60+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 120+ x, 120+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 120+ x, 180+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 120+ x, 240+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 120+ x, 300+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 120+ x, 360+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 120+ x, 420+ y);
		
		game.getBatch().draw(ClimatMontagneux.glace1, 180+ x, 0+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 180+ x, 60+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 180+ x, 120+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 180+ x, 180+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 180+ x, 240+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 180+ x, 300+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 180+ x, 360+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 180+ x, 420+ y);
		
		game.getBatch().draw(ClimatMontagneux.glace1, 240+ x, 0+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 240+ x, 60+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 240+ x, 120+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 240+ x, 180+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 240+ x, 240+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 240+ x, 300+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 240+ x, 360+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 240+ x, 420+ y);
		
		game.getBatch().draw(ClimatMontagneux.glace1, 300+ x, 0+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 300+ x, 60+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 300+ x, 120+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 300+ x, 180+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 300+ x, 240+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 300+ x, 300+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 300+ x, 360+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 300+ x, 420+ y);
		
		game.getBatch().draw(ClimatMontagneux.glace1, 360+ x, 0+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 360+ x, 60+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 360+ x, 120+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 360+ x, 180+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 360+ x, 240+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 360+ x, 300+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 360+ x, 360+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 360+ x, 420+ y);
		
		game.getBatch().draw(ClimatMontagneux.glace1, 420+ x, 0+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 420+ x, 60+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 420+ x, 120+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 420+ x, 180+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 420+ x, 240+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 420+ x, 300+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 420+ x, 360+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 420+ x, 420+ y);
		
		game.getBatch().draw(ClimatMontagneux.glace1, 480+ x, 0+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 480+ x, 60+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 480+ x, 120+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 480+ x, 180+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 480+ x, 240+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 480+ x, 300+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 480+ x, 360+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 480+ x, 420+ y);
		
		game.getBatch().draw(ClimatMontagneux.glace1, 540+ x, 0+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 540+ x, 60+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 540+ x, 120+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 540+ x, 180+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 540+ x, 240+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 540+ x, 300+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 540+ x, 360+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 540+ x, 420+ y);
		
		
		game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 0+ x, 420+ y);
		game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 60+ x, 420+ y);
		game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 120+ x, 420+ y);
		game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 180+ x, 420+ y);
		game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 240+ x, 420+ y);
		game.getBatch().draw(ClimatMontagneux.escalierGlacé, 300+ x, 420+ y);
		game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 360+ x, 420+ y);
		game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 420+ x, 420+ y);
		game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 480+ x, 420+ y);
		game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 540+ x, 420+ y);
		
		game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 0+ x, 360+ y);
		game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 60+ x, 360+ y);
		game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 120+ x, 360+ y);
		game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 180+ x, 360+ y);
		game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 240+ x, 360+ y);
		game.getBatch().draw(ClimatMontagneux.escalierGlacé, 300+ x, 360+ y);
		game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 360+ x, 360+ y);
		game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 420+ x, 360+ y);
		game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 480+ x, 360+ y);
		game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 540+ x, 360+ y);
		
		game.getBatch().draw(ClimatMontagneux.bordGlacéInf, 0+ x, 300+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéInf, 60+ x, 300+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéInf, 120+ x, 300+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéInf, 180+ x, 300+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéInf, 240+ x, 300+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéInf, 300+ x, 300+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéInf, 360+ x, 300+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéInf, 420+ x, 300+ y);
		game.getBatch().draw(ClimatMontagneux.escalierHaut, 480+ x, 300+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéInf, 540+ x, 300+ y);
		
		game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 0+ x, 240+ y);
		game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 60+ x, 240+ y);
		game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 120+ x, 240+ y);
		game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 180+ x, 240+ y);
		game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 240+ x, 240+ y);
		game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 300+ x, 240+ y);
		game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 360+ x, 240+ y);
		game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 420+ x, 240+ y);
		game.getBatch().draw(ClimatMontagneux.escalierGlacé, 480+ x, 240+ y);
		game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 540+ x, 240+ y);
		
		game.getBatch().draw(ClimatMontagneux.bordGlacéInf, 0+ x, 180+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéInf, 60+ x, 180+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéInf, 120+ x, 180+ y);
		game.getBatch().draw(ClimatMontagneux.escalierHaut, 180+ x, 180+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéInf, 240+ x, 180+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéInf, 300+ x, 180+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéInf, 360+ x, 180+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéInf, 420+ x, 180+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéInf, 480+ x, 180+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéInf, 540+ x, 180+ y);
		
		game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 0+ x, 120+ y);
		game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 60+ x, 120+ y);
		game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 120+ x, 120+ y);
		game.getBatch().draw(ClimatMontagneux.escalierGlacé, 180+ x, 120+ y);
		game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 240+ x, 120+ y);
		game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 300+ x, 120+ y);
		game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 360+ x, 120+ y);
		game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 420+ x, 120+ y);
		game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 480+ x, 120+ y);
		game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 540+ x, 120+ y);
		
		game.getBatch().draw(ClimatMontagneux.bordGlacéInf, 0+ x, 60+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéInf, 60+ x, 60+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéInf, 120+ x, 60+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéInf, 180+ x, 60+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéInf, 240+ x, 60+ y);
		game.getBatch().draw(ClimatMontagneux.escalierHaut, 300+ x, 60+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéInf, 360+ x, 60+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéInf, 420+ x, 60+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéInf, 480+ x, 60+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéInf, 540+ x, 60+ y);
		
		game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 0+ x, 0+ y);
		game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 60+ x, 0+ y);
		game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 120+ x, 0+ y);
		game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 180+ x, 0+ y);
		game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 240+ x, 0+ y);
		game.getBatch().draw(ClimatMontagneux.escalierGlacé, 300+ x, 0+ y);
		game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 360+ x, 0+ y);
		game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 420+ x, 0+ y);
		game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 480+ x, 0+ y);
		game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 540+ x, 0+ y);
		
		game.getBatch().draw(ClimatMontagneux.murSombreGlacéDroite, 60+ x, 60+ y);
		game.getBatch().draw(ClimatMontagneux.murSombreGlacéCentre2, 00+ x, 60+ y);
		
		game.getBatch().draw(ClimatMontagneux.grossePierre, 420+ x, 70+ y);
		game.getBatch().draw(ClimatMontagneux.grossePierre, 60+ x, 310+ y);
		game.getBatch().draw(ClimatMontagneux.grossePierre, 535+ x, 310+ y);
		game.getBatch().draw(ClimatMontagneux.tree, 480+ x, 80+ y);
		game.getBatch().draw(ClimatMontagneux.grossePierre, 100+ x, 190+ y);
		game.getBatch().draw(ClimatMontagneux.tree, 535+ x, 200+ y);
	}

	public static void destroyBody() {
		// TODO Auto-generated method stub
		if ( ismur1Created) MainMenu.world.destroyBody(mur1);
		ismur1Created = false;
		if ( ismur2Created) MainMenu.world.destroyBody(mur2);
		ismur2Created = false;
		if ( ismur3Created) MainMenu.world.destroyBody(mur3);
		ismur3Created = false;
		if ( ismur4Created) MainMenu.world.destroyBody(mur4);
		ismur4Created = false;
		if ( ismur5Created) MainMenu.world.destroyBody(mur5);
		ismur5Created = false;
		if ( ismur6Created) MainMenu.world.destroyBody(mur6);
		ismur6Created = false;
		if ( ismur7Created) MainMenu.world.destroyBody(mur7);
		ismur7Created = false;
		if ( ismur8Created) MainMenu.world.destroyBody(mur8);
		ismur8Created = false;
		
		if ( isGrossePierre1Created) MainMenu.world.destroyBody(grossePierre1);
		isGrossePierre1Created = false;
		if ( isGrossePierre2Created) MainMenu.world.destroyBody(grossePierre2);
		isGrossePierre2Created = false;
		if ( isGrossePierre3Created) MainMenu.world.destroyBody(grossePierre3);
		isGrossePierre3Created = false;
		if ( isGrossePierre4Created) MainMenu.world.destroyBody(grossePierre4);
		isGrossePierre4Created = false;

		if ( isArbre1Created) MainMenu.world.destroyBody(arbre1);
		isArbre1Created = false;
	
	}

	public static void createBodyAndType(World world) {
		// TODO Auto-generated method stub
		CadrillageMap.setTypeDeDécor(1, 1, "Trou");
		
		if ( ismur1Created == false ) {
			mur1 = ClimatMontagneux.createBody(140,30,290,60);
			ismur1Created = true;
		}
		if ( ismur2Created == false ) {
			mur2 = ClimatMontagneux.createBody(460,30,240,60);
			ismur2Created = true;
		}
		if ( ismur3Created == false ) {
			mur3 = ClimatMontagneux.createBody(80,150,160,60);
			ismur3Created = true;
		}
		if ( ismur4Created == false ) {
			mur4 = ClimatMontagneux.createBody(400,150,360,60);
			ismur4Created = true;
		}
		if ( ismur5Created == false ) {
			mur5 = ClimatMontagneux.createBody(240,270,450,60);
			ismur5Created = true;
		}
		if ( ismur6Created == false ) {
			mur6 = ClimatMontagneux.createBody(550,270,60,60);
			ismur6Created = true;
		}
		if ( ismur7Created == false ) {
			mur7 = ClimatMontagneux.createBody(140,420,290,120);
			ismur7Created = true;
		}
		if ( ismur8Created == false ) {
			mur8 = ClimatMontagneux.createBody(460,420,240,120);
			ismur8Created = true;
		}
		
		
		if ( isGrossePierre1Created == false ) {
			grossePierre1 = ClimatMontagneux.createBodyPerso("grossePierre", "static", 420,70);
			isGrossePierre1Created = true;
		}
		if ( isGrossePierre2Created == false ) {
			grossePierre2 = ClimatMontagneux.createBodyPerso("grossePierre", "static", 60,310);
			isGrossePierre2Created = true;
		}
		if ( isGrossePierre3Created == false ) {
			grossePierre3 = ClimatMontagneux.createBodyPerso("grossePierre", "static", 535,310);
			isGrossePierre3Created = true;
		}
		if ( isGrossePierre4Created == false ) {
			grossePierre4 = ClimatMontagneux.createBodyPerso("grossePierre", "static", 100,190);
			isGrossePierre4Created = true;
		}
		
		if ( isArbre1Created == false ) {
			arbre1 = ClimatMontagneux.createBodyPerso("arbre", "static",535,200);
			isArbre1Created = true;
		}
		
	}

	public static void destroyType() {
		// TODO Auto-generated method stub
		
	}
}
