package map.zoneGlace;

import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.physics.box2d.Body;
import com.badlogic.gdx.physics.box2d.World;
import com.mygdx.game.GameMain;

import decors.ClimatMontagneux;
import items.Bombe;
import items.Coffre;
import map.CadrillageMap;
import scenes.MainMenu;

public class SousMapF2 extends Sprite{
	
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
	public static Body mur9;
	public static boolean ismur9Created;
	public static Body mur10;
	public static boolean ismur10Created;
	public static Body murCoffre;
	public static boolean ismurCoffreCreated;
	
	public static Body grossePierre1;
	public static boolean isGrossePierre1Created;
	public static Body grossePierre2;
	public static boolean isGrossePierre2Created;
	public static Body grossePierre3;
	public static boolean isGrossePierre3Created;
	
	public static Body petitePierre;
	public static boolean isPetitePierreCreated;
	public static boolean isPetitePierreDéplacé = false;
	
	
	
	public static boolean ouvertureCoffre = false; // à sauvegarder
	public static boolean coffreOuvert = false; // à sauvegarder
	
	public static void sousMap(GameMain game, int x, int y){
		
		game.getBatch().draw(ClimatMontagneux.glace1, 0+ x, 0+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 0+ x, 60+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 0+ x, 120+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 0+ x, 180+ y);		
		game.getBatch().draw(ClimatMontagneux.glace1, 0 + x,240 + y);
		game.getBatch().draw(ClimatMontagneux.glace1, 0+ x, 300+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 0+ x, 360+ y);
		game.getBatch().draw(ClimatMontagneux.ciel, 0+ x, 420+ y);
		
		game.getBatch().draw(ClimatMontagneux.glace1, 60+ x, 0+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 60+ x, 60+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 60+ x, 120+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 60+ x, 180+ y);		
		game.getBatch().draw(ClimatMontagneux.glace1, 60+ x, 240+ y);	
		game.getBatch().draw(ClimatMontagneux.glace1, 60+ x, 300+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 60+ x, 360+ y);
		game.getBatch().draw(ClimatMontagneux.ciel, 60+ x, 420+ y);
		
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
		
		game.getBatch().draw(ClimatMontagneux.bordGlacéGau, 60+ x, 420+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéGau, 120+ x, 420+ y);
		game.getBatch().draw(ClimatMontagneux.murGlacéGauche, 180+ x, 420+ y);
		game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 240+ x, 420+ y);
		game.getBatch().draw(ClimatMontagneux.escalierGlacé, 300+ x, 420+ y);
		game.getBatch().draw(ClimatMontagneux.murGlacéGauche, 360+ x, 420+ y);
		game.getBatch().draw(ClimatMontagneux.murGlacéDroite, 420+ x, 420+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéDroi, 480+ x, 420+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéDroi, 540+ x, 420+ y);
		
		game.getBatch().draw(ClimatMontagneux.bordGlacéSupGau, 0+ x, 360+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéGau, 60+ x, 360+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéInfGau, 120+ x, 360+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéInf, 180+ x, 360+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéInf, 240+ x, 360+ y);
		game.getBatch().draw(ClimatMontagneux.escalierHaut, 300+ x, 360+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéInf, 360+ x, 360+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéInf, 420+ x, 360+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéInfDroi, 480+ x, 360+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéDroi, 540+ x, 360+ y);
		
		game.getBatch().draw(ClimatMontagneux.bordGlacéGau, 0+ x, 300+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéGau, 60+ x, 300+ y);
		game.getBatch().draw(ClimatMontagneux.murGlacéGauche, 120+ x, 300+ y);
		game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 180+ x, 300+ y);
		game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 240+ x, 300+ y);
		game.getBatch().draw(ClimatMontagneux.escalierGlacé, 300+ x, 300+ y);
		game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 360+ x, 300+ y);
		game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 420+ x, 300+ y);
		game.getBatch().draw(ClimatMontagneux.murGlacéDroite, 480+ x, 300+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéDroi, 540+ x, 300+ y);
		
		game.getBatch().draw(ClimatMontagneux.bordGlacéGau, 0+ x, 240+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéInfGau, 60+ x, 240+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéInf, 120+ x, 240+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéInf, 180+ x, 240+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéInf, 240+ x, 240+ y);
		game.getBatch().draw(ClimatMontagneux.escalierHaut, 300+ x, 240+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéInf, 360+ x, 240+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéInf, 420+ x, 240+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéInf, 480+ x, 240+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéInfDroi, 540+ x, 240+ y);
		
		game.getBatch().draw(ClimatMontagneux.bordGlacéGau, 0+ x, 180+ y);
		game.getBatch().draw(ClimatMontagneux.murGlacéGauche, 60+ x, 180+ y);
		game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 120+ x, 180+ y);
		game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 180+ x, 180+ y);
		game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 240+ x, 180+ y);
		game.getBatch().draw(ClimatMontagneux.escalierGlacé, 300+ x, 180+ y);
		game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 360+ x, 180+ y);
		game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 420+ x, 180+ y);
		game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 480+ x, 180+ y);
		game.getBatch().draw(ClimatMontagneux.murGlacéDroite, 540+ x, 180+ y);
		
		game.getBatch().draw(ClimatMontagneux.bordGlacéGau, 0+ x, 120+ y);
		game.getBatch().draw(ClimatMontagneux.murGlacéGauche, 60+ x, 120+ y);
		game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 120+ x, 120+ y);
		game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 180+ x, 120+ y);
		game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 240+ x, 120+ y);
		game.getBatch().draw(ClimatMontagneux.escalierGlacé, 300+ x, 120+ y);
		game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 360+ x, 120+ y);
		game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 420+ x, 120+ y);
		game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 480+ x, 120+ y);
		game.getBatch().draw(ClimatMontagneux.murGlacéDroite, 540+ x, 120+ y);
		
		game.getBatch().draw(ClimatMontagneux.bordGlacéInfGau, 0+ x, 60+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéInf, 60+ x, 60+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéInf, 120+ x, 60+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéInf, 180+ x, 60+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéInf, 240+ x, 60+ y);
		game.getBatch().draw(ClimatMontagneux.escalierHaut, 300+ x, 60+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéInf, 360+ x, 60+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéInf, 420+ x, 60+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéInf, 480+ x, 60+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéInf, 540+ x, 60+ y);
		
		game.getBatch().draw(ClimatMontagneux.murGlacéGauche, 0+ x, 0+ y);
		game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 60+ x, 0+ y);
		game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 120+ x, 0+ y);
		game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 180+ x, 0+ y);
		game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 240+ x, 0+ y);
		game.getBatch().draw(ClimatMontagneux.escalierGlacé, 300+ x, 0+ y);
		game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 360+ x, 0+ y);
		game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 420+ x, 0+ y);
		game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 480+ x, 0+ y);
		game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 540+ x, 0+ y);
		
		
		game.getBatch().draw(ClimatMontagneux.grossePierre, 420+ x, 70+ y);
		game.getBatch().draw(ClimatMontagneux.grossePierre, 60+ x, 250+ y);
		game.getBatch().draw(ClimatMontagneux.grossePierre, 535+ x, 300+ y);
		game.getBatch().draw(ClimatMontagneux.signTête, 120+ x, 410+ y);
		game.getBatch().draw(ClimatMontagneux.grossePierre, 410+ x, 360+ y);
		game.getBatch().draw(ClimatMontagneux.grossePierre, 470+ x, 360+ y);
		game.getBatch().draw(ClimatMontagneux.grossePierre, 535+ x, 420+ y);
		
		ClimatMontagneux.petitePierre(isPetitePierreDéplacé,game, 0+x, 240+y);
		
		if ( ouvertureCoffre == false ) game.getBatch().draw(ClimatMontagneux.coffreBleuFermé, 20+ x, 370+ y);
		else {
			if ( coffreOuvert == false ) {
				if ( Coffre.ouvert1 == true && Coffre.ouvert2 == true ){
					coffreOuvert = true;
				}
				Coffre.annimationCoffreBleu(game, 20, 370);
				
			} else {
				game.getBatch().draw(ClimatMontagneux.coffreBleuOuvert3, 20+ x, 370+ y);
			}
			
		}
		if ( MainMenu.Link.annimationAward ) {
			game.getBatch().draw(Bombe.bombeT, MainMenu.Link.getX() - 15, MainMenu.Link.getY() +60);
//			game.getBatch().draw(DonjonGlace.texteClé, 100 + x, 10+y);
		}
		
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
		if ( ismur9Created) MainMenu.world.destroyBody(mur9);
		ismur9Created = false;
		if ( ismur10Created) MainMenu.world.destroyBody(mur10);
		ismur10Created = false;
		if ( ismurCoffreCreated) MainMenu.world.destroyBody(murCoffre);
		ismurCoffreCreated = false;
		
		if ( isGrossePierre1Created) MainMenu.world.destroyBody(grossePierre1);
		isGrossePierre1Created = false;
		if ( isGrossePierre2Created) MainMenu.world.destroyBody(grossePierre2);
		isGrossePierre2Created = false;
		if ( isGrossePierre3Created) MainMenu.world.destroyBody(grossePierre3);
		isGrossePierre3Created = false;
		
		if ( isPetitePierreCreated) MainMenu.world.destroyBody(petitePierre);
		isPetitePierreCreated = false;
		
		
	}

	public static void createBodyAndType(World world) {
		// TODO Auto-generated method stub
		if ( ismur1Created == false ) {
			mur1 = ClimatMontagneux.createBody(140,30,290,60);
			ismur1Created = true;
		}
		if ( ismur2Created == false ) {
			mur2 = ClimatMontagneux.createBody(460,30,240,60);
			ismur2Created = true;
		}
		if ( ismur3Created == false ) {
			mur3 = ClimatMontagneux.createBody(170,180,230,120);
			ismur3Created = true;
		}
		if ( ismur4Created == false ) {
			mur4 = ClimatMontagneux.createBody(460,180,240,120);
			ismur4Created = true;
		}
		if ( ismur5Created == false ) {
			mur5 = ClimatMontagneux.createBody(170,330,230,60);
			ismur5Created = true;
		}
		if ( ismur6Created == false ) {
			mur6 = ClimatMontagneux.createBody(460,330,240,60);
			ismur6Created = true;
		}
		if ( ismur7Created == false ) {
			mur7 = ClimatMontagneux.createBody(135,450,290,60);
			ismur7Created = true;
		}
		if ( ismur8Created == false ) {
			mur8 = ClimatMontagneux.createBody(460,450,240,60);
			ismur8Created = true;
		}
		if ( ismur9Created == false ) {
			mur9 = ClimatMontagneux.createBody(0,240,1,420);
			ismur9Created = true;
		}
		if ( ismur10Created == false ) {
			mur10 = ClimatMontagneux.createBody(540,270,60,60);
			ismur10Created = true;
		}
		CadrillageMap.setTypeDeDécor(0,360/60, "coffreBleu");
		if ( ismurCoffreCreated == false ) {
			murCoffre = ClimatMontagneux.createBody(50,390,120,60);
			ismurCoffreCreated = true;
		}
		
		if ( isGrossePierre1Created == false ) {
			grossePierre1 = ClimatMontagneux.createBodyPerso("grossePierre", "static", 60,250);
			isGrossePierre1Created = true;
		}
		if ( isGrossePierre2Created == false ) {
			grossePierre2 = ClimatMontagneux.createBodyPerso("grossePierre", "static", 420,70);
			isGrossePierre2Created = true;
		}
		if ( isGrossePierre3Created == false ) {
			grossePierre3 = ClimatMontagneux.createBodyPerso("grossePierre", "static", 410,360);
			isGrossePierre3Created = true;
		}
		
		CadrillageMap.setTypeDeDécor(0, 240/60, "petitePierre");
		if ( CadrillageMap.décorChangé[0][240/60] == true ) isPetitePierreDéplacé = true;
		if ( isPetitePierreCreated == false && isPetitePierreDéplacé == false) {
			petitePierre = ClimatMontagneux.createBodyPerso("grossePierre", "static", 20,240);
			isPetitePierreCreated = true;
		}
		
		
	}

	public static void destroyType() {
		// TODO Auto-generated method stub
		isPetitePierreDéplacé = false;
	}
}
