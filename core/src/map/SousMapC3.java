package map;

import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.physics.box2d.Body;
import com.badlogic.gdx.physics.box2d.World;
import com.mygdx.game.GameMain;

import decors.ClimatMontagneux;
import scenes.MainMenu;

public class SousMapC3 extends Sprite{
	
	public static Body bosquet1 ;
	public static boolean isBosquet1Created;
	public static Body bosquet2 ;
	public static boolean isBosquet2Created;
	public static Body bosquet3 ;
	public static boolean isBosquet3Created;
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
	
	
	public static void sousMapC3(GameMain game, int x, int y){
		
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
		
//		relief / buisson
		
		game.getBatch().draw(ClimatMontagneux.bordGlacéGau, 360+ x, 420+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéGau, 360+ x, 360+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéGau, 360+ x, 300+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéSupGau, 300+ x, 240+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéGau, 300+ x, 180+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéGau, 300+ x, 120+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéSupGau, 240+ x, 60+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéGau, 240+ x, 00+ y);
		
		game.getBatch().draw(ClimatMontagneux.buisson, 360+ x, 300+ y);
		game.getBatch().draw(ClimatMontagneux.buisson, 300+ x, 240+ y);
		game.getBatch().draw(ClimatMontagneux.buisson, 300+ x, 180+ y);
		game.getBatch().draw(ClimatMontagneux.buisson, 240+ x, 60+ y);
		
		game.getBatch().draw(ClimatMontagneux.bordGlacéSup, 540+ x, 360+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéSup, 480+ x, 360+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéSupGau, 420+ x, 360+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéGau, 420+ x, 300+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéGau, 420+ x, 240+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéSupGau, 360+ x, 180+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéGau, 360+ x, 120+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéGau, 360+ x, 60+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéSupGau, 300+ x, 0+ y);
		
//		bosquet / arbre
		game.getBatch().draw(ClimatMontagneux.petitePierre, 200+ x, 440+ y);
		
		game.getBatch().draw(ClimatMontagneux.arbreBasGauche, 180+ x, 300+ y);
		game.getBatch().draw(ClimatMontagneux.arbreCentreGauche, 180+ x, 360+ y);
		game.getBatch().draw(ClimatMontagneux.arbreSommetGauche, 180+ x, 420+ y);
		game.getBatch().draw(ClimatMontagneux.arbreBasMilieu, 240+ x, 300+ y);
		game.getBatch().draw(ClimatMontagneux.arbreCentreMilieu, 240+ x, 360+ y);
		game.getBatch().draw(ClimatMontagneux.arbreSommetMilieu, 240+ x, 420+ y);
		game.getBatch().draw(ClimatMontagneux.arbreBasDroite, 300+ x, 300+ y);
		game.getBatch().draw(ClimatMontagneux.arbreCentreDroite, 300+ x, 360+ y);
		game.getBatch().draw(ClimatMontagneux.arbreSommetDroite, 300+ x, 420+ y);
		
		game.getBatch().draw(ClimatMontagneux.tree, 170+ x, 260+ y);
		
		game.getBatch().draw(ClimatMontagneux.arbreBasGauche, 120+ x, 120+ y);
		game.getBatch().draw(ClimatMontagneux.arbreCentreGauche, 120+ x, 180+ y);
		game.getBatch().draw(ClimatMontagneux.arbreSommetGauche, 120+ x, 240+ y);
		game.getBatch().draw(ClimatMontagneux.arbreBasMilieu, 180+ x, 120+ y);
		game.getBatch().draw(ClimatMontagneux.arbreCentreMilieu, 180+ x, 180+ y);
		game.getBatch().draw(ClimatMontagneux.arbreSommetMilieu, 180+ x, 240+ y);
		game.getBatch().draw(ClimatMontagneux.arbreBasDroite, 240+ x, 120+ y);
		game.getBatch().draw(ClimatMontagneux.arbreCentreDroite, 240+ x, 180+ y);
		game.getBatch().draw(ClimatMontagneux.arbreSommetDroite, 240+ x, 240+ y);
		
		game.getBatch().draw(ClimatMontagneux.arbreBasDroite, 0+ x, 0+ y);
		game.getBatch().draw(ClimatMontagneux.arbreSommetDroite, 0+ x, 60+ y);
		
	}

	public static void destroyBody() {
		// TODO Auto-generated method stub
		if ( isBosquet1Created) MainMenu.world.destroyBody(bosquet1);
		isBosquet1Created = false;
		
		if ( isBosquet2Created) MainMenu.world.destroyBody(bosquet2);
		isBosquet2Created = false;
		
		if ( isBosquet3Created) MainMenu.world.destroyBody(bosquet3);
		isBosquet3Created = false;
		
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
	}

	public static void createBodyAndType(World world) {
		// TODO Auto-generated method stub
		if ( isBosquet1Created == false ) {
			bosquet1 = ClimatMontagneux.createBody(200,210,180,160);
			isBosquet1Created = true;
		}
		if ( isBosquet2Created == false ) {
			bosquet2 = ClimatMontagneux.createBody(10,60,60,80);
			isBosquet2Created = true;
		}
		if ( isBosquet3Created == false ) {
			bosquet3 = ClimatMontagneux.createBody(260,420,180,270);
			isBosquet3Created = true;
		}
		if ( isCote1Created == false ) {
			cote1 = ClimatMontagneux.createBody(345,140,1,160);
			isCote1Created = true;
		}
		if ( isCote2Created == false ) {
			cote2 = ClimatMontagneux.createBody(405,320,1,160);
			isCote2Created = true;
		}
		if ( isCote3Created == false ) {
			cote3 = ClimatMontagneux.createBody(285,30,1,60);
			isCote3Created = true;
		}
		if ( isCote4Created == false ) {
			cote4 = ClimatMontagneux.createBody(315,60,60,1);
			isCote4Created = true;
		}
		if ( isCote5Created == false ) {
			cote5 = ClimatMontagneux.createBody(375,220,60,1);
			isCote5Created = true;
		}
		if ( isCote6Created == false ) {
			cote6 = ClimatMontagneux.createBody(495,400,180,1);
			isCote6Created = true;
		}
		if ( isCote7Created == false ) {
			cote7 = ClimatMontagneux.createBody(225,60,1,120);
			isCote7Created = true;
		}
	}

	public static void destroyType() {
		// TODO Auto-generated method stub
		
	}

}
