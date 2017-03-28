package map;

import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.physics.box2d.Body;
import com.badlogic.gdx.physics.box2d.World;
import com.mygdx.game.GameMain;

import decors.ClimatMontagneux;
import scenes.MainMenu;

public class SousMapC2 extends Sprite {

	public static Body bosquet1 ;
	public static boolean isBosquet1Created;
	public static Body bosquet2 ;
	public static boolean isBosquet2Created;
	public static Body tronc1;
	public static boolean isTronc1Created;
	public static Body tronc2;
	public static boolean isTronc2Created;
	public static Body tronc3;
	public static boolean isTronc3Created;
	public static Body grossePierre1;
	public static boolean isGrossePierre1Created;
	public static Body grossePierre2;
	public static boolean isGrossePierre2Created;
	public static Body grossePierre3;
	public static boolean isGrossePierre3Created;
	public static Body grossePierre4;
	public static boolean isGrossePierre4Created;
	public static Body grossePierre5;
	public static boolean isGrossePierre5Created;
	public static Body grossePierre6;
	public static boolean isGrossePierre6Created;
	public static Body grossePierre7;
	public static boolean isGrossePierre7Created;
	public static Body cote;
	public static boolean isCoteCreated;
	
	public static Body petitePierre1;
	public static boolean isPetitePierre1Created;
	
	public static Body arbre1;
	public static boolean isArbre1Created;
	
	public static boolean isBuisson1Cut = false;
	public static boolean isBuisson2Cut = false;
	public static boolean isBuisson3Cut = false;
	public static boolean isBuisson4Cut = false;
	public static boolean isBuisson5Cut = false;
	
	public static void sousMap(GameMain game, int x, int y){
		
		game.getBatch().draw(ClimatMontagneux.glace1, 0+ x, 0+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 0+ x, 60+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 0+ x, 120+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 0+ x, 180+ y);		
		game.getBatch().draw(ClimatMontagneux.glace1, 0 + x,240 + y);
		game.getBatch().draw(ClimatMontagneux.glace1, 0+ x, 300+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 0+ x, 360+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 0+ x, 420+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéSup, 0+ x, 420+ y);
		
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
		
//		troncs
		
		game.getBatch().draw(ClimatMontagneux.tronc, 360+ x, 300+ y);
		game.getBatch().draw(ClimatMontagneux.tronc, 240+ x, 360+ y);
		game.getBatch().draw(ClimatMontagneux.tronc, 300+ x, 300+ y);
		
//		arbre
		
		game.getBatch().draw(ClimatMontagneux.tree, 240+ x, 240+ y);
		
//		pierre
		
		game.getBatch().draw(ClimatMontagneux.grossePierre, 440+ x, 300+ y);
		game.getBatch().draw(ClimatMontagneux.grossePierre, 480+ x, 310+ y);
		game.getBatch().draw(ClimatMontagneux.grossePierre, 530+ x, 290+ y);
		
		game.getBatch().draw(ClimatMontagneux.grossePierre, 420+ x, 270+ y);
		game.getBatch().draw(ClimatMontagneux.grossePierre, 450+ x, 270+ y);
		game.getBatch().draw(ClimatMontagneux.grossePierre, 490+ x, 270+ y);
		game.getBatch().draw(ClimatMontagneux.grossePierre, 510+ x, 270+ y);
		game.getBatch().draw(ClimatMontagneux.grossePierre, 550+ x, 270+ y);
		
		game.getBatch().draw(ClimatMontagneux.grossePierre, 300+ x,0+ y);
		game.getBatch().draw(ClimatMontagneux.grossePierre, 300+ x,60+ y);
		game.getBatch().draw(ClimatMontagneux.grossePierre, 240+ x,0+ y);

		game.getBatch().draw(ClimatMontagneux.petitePierre, 180+ x, 0+ y);

		
//		relief bas droite
		
		game.getBatch().draw(ClimatMontagneux.bordGlacéGau, 360+ x, 0+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéGau, 360+ x, 60+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéGau, 360+ x, 120+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéGau, 360+ x, 180+ y);
		

		
//		bosquet2
		game.getBatch().draw(ClimatMontagneux.arbreBasMilieu, 0+ x, 300+ y);
		game.getBatch().draw(ClimatMontagneux.arbreCentreMilieu, 0+ x, 360+ y);
		game.getBatch().draw(ClimatMontagneux.arbreSommetMilieu, 0+ x, 420+ y);
		game.getBatch().draw(ClimatMontagneux.arbreBasDroite, 60+ x, 300+ y);
		game.getBatch().draw(ClimatMontagneux.arbreCentreDroite, 60+ x, 360+ y);
		game.getBatch().draw(ClimatMontagneux.arbreSommetDroite, 60+ x, 420+ y);
		
//		bosquet1
		game.getBatch().draw(ClimatMontagneux.arbreBasGauche, 360+ x, 60+ y);
		game.getBatch().draw(ClimatMontagneux.arbreCentreGauche, 360+ x, 120+ y);
		game.getBatch().draw(ClimatMontagneux.arbreCentreGauche, 360+ x, 180+ y);
		game.getBatch().draw(ClimatMontagneux.arbreSommetGauche, 360+ x, 240+ y);
		game.getBatch().draw(ClimatMontagneux.arbreBasMilieu, 420+ x,60+ y);
		game.getBatch().draw(ClimatMontagneux.arbreCentreMilieu, 420+ x, 120+ y);
		game.getBatch().draw(ClimatMontagneux.arbreCentreMilieu, 420+ x, 180+ y);
		game.getBatch().draw(ClimatMontagneux.arbreSommetMilieu, 420+ x, 240+ y);
		game.getBatch().draw(ClimatMontagneux.arbreBasMilieu, 480+ x,60+ y);
		game.getBatch().draw(ClimatMontagneux.arbreCentreMilieu, 480+ x, 120+ y);
		game.getBatch().draw(ClimatMontagneux.arbreCentreMilieu, 480+ x, 180+ y);
		game.getBatch().draw(ClimatMontagneux.arbreSommetMilieu, 480+ x, 240+ y);
		game.getBatch().draw(ClimatMontagneux.arbreBasMilieu, 540+ x, 60+ y);
		game.getBatch().draw(ClimatMontagneux.arbreCentreMilieu, 540+ x, 120+ y);
		game.getBatch().draw(ClimatMontagneux.arbreCentreMilieu, 540+ x, 180+ y);
		game.getBatch().draw(ClimatMontagneux.arbreSommetMilieu, 540+ x, 240+ y);
		
//		buissons 
		

		ClimatMontagneux.buisson(isBuisson1Cut,game, 60+x, 60+y);
		ClimatMontagneux.buisson(isBuisson2Cut,game, 60+x, 180+y);
		ClimatMontagneux.buisson(isBuisson3Cut,game, 120+x, 180+y);
		ClimatMontagneux.buisson(isBuisson4Cut,game, 240+x, 60+y);
		ClimatMontagneux.buisson(isBuisson5Cut,game, 300+x, 120+y);
	

		
		
		
	}
	
	public static void createBodyAndType(World world){
		
		CadrillageMap.setTypeDeDécor(1,1,"HerbesHautes");
		CadrillageMap.setTypeDeDécor(1,3,"HerbesHautes");
		CadrillageMap.setTypeDeDécor(2,3,"HerbesHautes");
		CadrillageMap.setTypeDeDécor(4,1,"HerbesHautes");
		CadrillageMap.setTypeDeDécor(5,2,"HerbesHautes");
		if ( CadrillageMap.décorChangé[1][1] == true ) isBuisson1Cut = true;
		if ( CadrillageMap.décorChangé[1][3] == true ) isBuisson2Cut = true;
		if ( CadrillageMap.décorChangé[2][3] == true ) isBuisson3Cut = true;
		if ( CadrillageMap.décorChangé[4][1] == true ) isBuisson4Cut = true;
		if ( CadrillageMap.décorChangé[5][2] == true ) isBuisson5Cut = true;
		
		if ( isBosquet1Created == false ) {
			bosquet1 = ClimatMontagneux.createBody(450,180,220,200);
			isBosquet1Created = true;
		}
		if ( isBosquet2Created == false ) {
			bosquet2 = ClimatMontagneux.createBody(50,370,100,150);
			isBosquet2Created = true;
		}
		if ( isTronc1Created == false ) {
			tronc1 = ClimatMontagneux.createBodyPerso("tronc", "static",360,300);
			isTronc1Created = true;
		}
		if ( isTronc2Created == false ) {
			tronc2 = ClimatMontagneux.createBodyPerso("tronc", "static",240,360);
			isTronc2Created = true;
		}
		if ( isTronc3Created == false ) {
			tronc3 =ClimatMontagneux.createBodyPerso("tronc", "static",300,300);
			isTronc3Created = true;
		}
		if ( isGrossePierre1Created == false ) {
			grossePierre1 = ClimatMontagneux.createBodyPerso("grossePierre", "static",300,0);
			isGrossePierre1Created = true;
		}
		if ( isGrossePierre2Created == false ) {
			grossePierre2 = ClimatMontagneux.createBodyPerso("grossePierre", "static",440,300);
			isGrossePierre2Created = true;
		}
		if ( isGrossePierre3Created == false ) {
			grossePierre3 = ClimatMontagneux.createBodyPerso("grossePierre", "static",480,310);
			isGrossePierre3Created = true;
		}
		if ( isGrossePierre4Created == false ) {
			grossePierre4 = ClimatMontagneux.createBodyPerso("grossePierre", "static",530,290);
			isGrossePierre4Created = true;
		}
		if ( isGrossePierre5Created == false ) {
			grossePierre5 = ClimatMontagneux.createBodyPerso("grossePierre", "static",420,270);
			isGrossePierre5Created = true;
		}
		if ( isGrossePierre6Created == false ) {
			grossePierre6 = ClimatMontagneux.createBodyPerso("grossePierre", "static",300,60);
			isGrossePierre6Created = true;
		}
		if ( isGrossePierre7Created == false ) {
			grossePierre7 = ClimatMontagneux.createBodyPerso("grossePierre", "static",240,0);
			isGrossePierre7Created = true;
		}
		if ( isArbre1Created == false ) {
			arbre1 = ClimatMontagneux.createBodyPerso("arbre", "static",240,240);
			isArbre1Created = true;
		}
		if ( isCoteCreated == false ) {
			cote = ClimatMontagneux.createBody(350,30,1,60);
			isCoteCreated = true;
		}
		if ( isPetitePierre1Created == false ) {
			petitePierre1 = ClimatMontagneux.createBodyPerso("tronc", "static",190,0);
			isPetitePierre1Created = true;
		}
		
	}
	
	public static void destroyType(){
		isBuisson1Cut = false;
		isBuisson2Cut = false;
		isBuisson3Cut = false;
		isBuisson4Cut = false;
		isBuisson5Cut = false;
	}
	
	public static void destroyBody(){
		if ( isBosquet1Created) MainMenu.world.destroyBody(bosquet1);
		isBosquet1Created = false;
		
		if ( isBosquet2Created) MainMenu.world.destroyBody(bosquet2);
		isBosquet2Created = false;
		
		if ( isTronc1Created ) MainMenu.world.destroyBody(tronc1);
		isTronc1Created = false;
		
		if ( isTronc2Created) MainMenu.world.destroyBody(tronc2);
		isTronc2Created = false;
		
		if ( isTronc3Created) MainMenu.world.destroyBody(tronc3);
		isTronc3Created = false;
		
		if ( isGrossePierre1Created) MainMenu.world.destroyBody(grossePierre1);
		isGrossePierre1Created = false;
		
		if ( isGrossePierre2Created) MainMenu.world.destroyBody(grossePierre2);
		isGrossePierre2Created = false;
		
		if ( isGrossePierre3Created) MainMenu.world.destroyBody(grossePierre3);
		isGrossePierre3Created = false;
		
		if ( isGrossePierre4Created) MainMenu.world.destroyBody(grossePierre4);
		isGrossePierre4Created = false;
		
		if ( isGrossePierre5Created) MainMenu.world.destroyBody(grossePierre5);
		isGrossePierre5Created = false;
		
		if ( isGrossePierre6Created) MainMenu.world.destroyBody(grossePierre6);
		isGrossePierre6Created = false;

		if ( isGrossePierre7Created) MainMenu.world.destroyBody(grossePierre7);
		isGrossePierre7Created = false;
		
		if ( isArbre1Created) MainMenu.world.destroyBody(arbre1);
		isArbre1Created = false;
		
		if ( isCoteCreated) MainMenu.world.destroyBody(cote);
		isCoteCreated = false;
		
		if ( isPetitePierre1Created) MainMenu.world.destroyBody(petitePierre1);
		isPetitePierre1Created = false;
	}
}
