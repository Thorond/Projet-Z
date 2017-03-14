package map;

import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.physics.box2d.Body;
import com.badlogic.gdx.physics.box2d.World;
import com.mygdx.game.GameMain;

import decors.ClimatMontagneux;
import scenes.MainMenu;

public class SousMapD3 extends Sprite{
	
	public static Body bosquet1 ;
	public static boolean isBosquet1Created;
	
	public static Body igloo ;
	public static boolean isIglooCreated;
	
	public static Body cote1 ;
	public static boolean isCote1Created;
	public static Body cote2 ;
	public static boolean isCote2Created;
	public static Body cote3 ;
	public static boolean isCote3Created;
	public static Body cote4 ;
	public static boolean isCote4Created;
	public static Body cote5 ;
	public static boolean isCote5Created;
	public static Body cote6 ;
	public static boolean isCote6Created;
	public static Body cote7 ;
	public static boolean isCote7Created;
	public static Body cote8 ;
	public static boolean isCote8Created;
	public static Body cote9 ;
	public static boolean isCote9Created;
	public static Body cote10 ;
	public static boolean isCote10Created;
	public static Body cote11 ;
	public static boolean isCote11Created;
	
	public static Body petitePierre1;
	public static boolean isPetitePierre1Created;
	public static Body petitePierre2;
	public static boolean isPetitePierre2Created;
	public static Body petitePierre3;
	public static boolean isPetitePierre3Created;
	
	public static void sousMapD3(GameMain game, int x, int y){
		
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
		
		
		
		game.getBatch().draw(ClimatMontagneux.bordGlacéSup, 0+ x, 360+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéSup, 60+ x, 360+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéSup, 120+ x, 360+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéSup, 180+ x, 360+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéGau, 240+ x, 420+ y);
		
		game.getBatch().draw(ClimatMontagneux.arbreBasGauche, 120+ x, 420+ y);
		game.getBatch().draw(ClimatMontagneux.arbreBasDroite, 180+ x, 420+ y);
		
		game.getBatch().draw(ClimatMontagneux.petitePierre, 480+ x, 420+ y);
		game.getBatch().draw(ClimatMontagneux.petitePierre, 530+ x, 420+ y);
		game.getBatch().draw(ClimatMontagneux.petitePierre, 480+ x, 360+ y);
		
		game.getBatch().draw(ClimatMontagneux.murGlacéGauche, 300+ x, 0+ y);
		game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 240+ x, 0+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéGau, 360+ x, 0+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéInf, 300+ x, 60+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéInfGau, 240+ x, 60+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéGau, 240+ x, 120+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéGau, 240+ x, 180+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéSupGau, 240+ x, 240+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéSupGau, 300+ x, 300+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéSup, 360+ x, 300+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéSup, 420+ x, 300+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéSupDroi, 480+ x, 300+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéSup, 540+ x, 240+ y);

		game.getBatch().draw(ClimatMontagneux.igloo, 380+ x, 120+ y);

		
		game.getBatch().draw(ClimatMontagneux.bordGlacéSupGau, 520+ x, 0+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéGau, 580+ x, 60+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéGau, 580+ x, 120+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéGau, 580+ x, 180+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéGau, 580+ x, 240+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéGau, 580+ x, 300+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéGau, 580+ x, 360+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéSupGau, 580+ x, 420+ y);
		game.getBatch().draw(ClimatMontagneux.tree, 540+ x, 0+ y);
		
		game.getBatch().draw(ClimatMontagneux.arbreBasDroite, 0+ x, 120+ y);
		game.getBatch().draw(ClimatMontagneux.arbreCentreDroite, 0+ x, 180+ y);
		game.getBatch().draw(ClimatMontagneux.arbreSommetDroite, 0+ x, 240+ y);
		
	}

	public static void createBodyAndType(World world) {
		// TODO Auto-generated method stub
		if ( isBosquet1Created == false ) {
			bosquet1 = ClimatMontagneux.createBody(10,200,60,150);
			isBosquet1Created = true;
		}
		
		if ( isIglooCreated == false ) {
			igloo = ClimatMontagneux.createBody(470,210,190,160);
			isIglooCreated = true;
		}
		
		if ( isCote1Created == false ) {
			cote1 = ClimatMontagneux.createBody(565,280,1,380);
			isCote1Created = true;
		}
		if ( isCote2Created == false ) {
			cote2 = ClimatMontagneux.createBody(510,20,1,60);
			isCote2Created = true;
		}
		if ( isCote3Created == false ) {
			cote3 = ClimatMontagneux.createBody(220,120,1,300);
			isCote3Created = true;
		}
		if ( isCote4Created == false ) {
			cote4 = ClimatMontagneux.createBody(340,30,1,60);
			isCote4Created = true;
		}
		if ( isCote5Created == false ) {
			cote5 = ClimatMontagneux.createBody(220,450,1,60);
			isCote5Created = true;
		}
		if ( isCote6Created == false ) {
			cote6 = ClimatMontagneux.createBody(520,320,1,60);
			isCote6Created = true;
		}
		if ( isCote7Created == false ) {
			cote7 = ClimatMontagneux.createBody(280,320,1,60);
			isCote7Created = true;
		}
		if ( isCote8Created == false ) {
			cote8 = ClimatMontagneux.createBody(280,60,120,1);
			isCote8Created = true;
		}
		if ( isCote9Created == false ) {
			cote9 = ClimatMontagneux.createBody(400,360,240,1);
			isCote9Created = true;
		}
		if ( isCote10Created == false ) {
			cote10 = ClimatMontagneux.createBody(250,290,60,1);
			isCote10Created = true;
		}
		if ( isCote11Created == false ) {
			cote11 = ClimatMontagneux.createBody(110,400,200,1);
			isCote11Created = true;
		}
		if ( isPetitePierre1Created == false ) {
			petitePierre1 = ClimatMontagneux.createBodyPerso("grossePierre", "static",480,420);
			isPetitePierre1Created = true;
		}
		if ( isPetitePierre2Created == false ) {
			petitePierre2 = ClimatMontagneux.createBodyPerso("grossePierre", "static",530,420);
			isPetitePierre2Created = true;
		}
		if ( isPetitePierre3Created == false ) {
			petitePierre3 = ClimatMontagneux.createBodyPerso("grossePierre", "static",480,360);
			isPetitePierre3Created = true;
		}
	}

	public static void destroyType() {
		// TODO Auto-generated method stub
		
	}

	public static void destroyBody() {
		// TODO Auto-generated method stub
		if ( isBosquet1Created) MainMenu.world.destroyBody(bosquet1);
		isBosquet1Created = false;
		
		if ( isIglooCreated ) MainMenu.world.destroyBody(igloo);
		isIglooCreated = false;
		
		if ( isCote1Created) MainMenu.world.destroyBody(cote1);
		isCote1Created = false;
		
		if ( isCote2Created) MainMenu.world.destroyBody(cote2);
		isCote2Created = false;
		
		if ( isCote3Created) MainMenu.world.destroyBody(cote3);
		isCote3Created = false;
		
		if ( isCote4Created) MainMenu.world.destroyBody(cote4);
		isCote4Created = false;
		
		if ( isCote5Created) MainMenu.world.destroyBody(cote5);
		isCote5Created = false;
		
		if ( isCote6Created) MainMenu.world.destroyBody(cote6);
		isCote6Created = false;
		
		if ( isCote7Created) MainMenu.world.destroyBody(cote7);
		isCote7Created = false;
		
		if ( isCote8Created) MainMenu.world.destroyBody(cote8);
		isCote8Created = false;
		
		if ( isCote9Created) MainMenu.world.destroyBody(cote9);
		isCote9Created = false;
		
		if ( isCote10Created) MainMenu.world.destroyBody(cote10);
		isCote10Created = false;
		
		if ( isCote11Created) MainMenu.world.destroyBody(cote11);
		isCote11Created = false;
		
		if ( isPetitePierre1Created) MainMenu.world.destroyBody(petitePierre1);
		isPetitePierre1Created = false;
		
		if ( isPetitePierre2Created) MainMenu.world.destroyBody(petitePierre2);
		isPetitePierre2Created = false;
		
		if ( isPetitePierre3Created) MainMenu.world.destroyBody(petitePierre3);
		isPetitePierre3Created = false;
	}
}
