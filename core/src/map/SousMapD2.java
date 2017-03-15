package map;

import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.physics.box2d.Body;
import com.badlogic.gdx.physics.box2d.World;
import com.mygdx.game.GameMain;

import decors.ClimatMontagneux;
import scenes.MainMenu;

public class SousMapD2 extends Sprite{
	
	public static Body bosquet1 ;
	public static boolean isBosquet1Created;
	public static Body bosquet2 ;
	public static boolean isBosquet2Created;
	
	public static Body cote1 ;
	public static boolean isCote1Created;
	public static Body cote2 ;
	public static boolean isCote2Created;
	
	public static Body grossePierre1;
	public static boolean isGrossePierre1Created;
	public static Body grossePierre2;
	public static boolean isGrossePierre2Created;
	
	public static Body petitePierre1;
	public static boolean isPetitePierre1Created;
	
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
		
		
		game.getBatch().draw(ClimatMontagneux.grossePierre, 00+ x, 300+ y);
		
		game.getBatch().draw(ClimatMontagneux.bordGlacéSup, 00+ x, 240+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéSup, 60+ x, 240+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéSup,120+ x, 240+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéSup, 180+ x, 240+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéSup, 240+ x, 240+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéSup, 300+ x, 240+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéSup, 360+ x, 240+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéSup, 420+ x, 240+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéSup, 480+ x, 240+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéSup, 540+ x, 240+ y);
		
		game.getBatch().draw(ClimatMontagneux.bordGlacéSupGau, 240+ x, 0+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéGau, 240+ x, 60+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéSupGau, 240+ x, 180+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéSup, 300+ x, 180+ y);
		game.getBatch().draw(ClimatMontagneux.cheminGlaceHori, 360+ x, 180+ y);
		game.getBatch().draw(ClimatMontagneux.cheminGlaceHori, 420+ x, 180+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéSup, 480+ x, 180+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéSup, 540+ x, 180+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéSup, 300+ x, 0+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéSup, 360+ x, 0+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéSupGau, 420+ x, 60+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéGau, 480+ x, 120+ y);
		
		game.getBatch().draw(ClimatMontagneux.bordGlacéDroi, 00+ x, 120+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéInf, 60+ x, 180+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéSup, 60+ x, 60+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéGau, 120+ x, 120+ y);
		game.getBatch().draw(ClimatMontagneux.murSombreGlacéCentre2, 60+ x, 120+ y);
		
		game.getBatch().draw(ClimatMontagneux.murSombreGlacéGauche, 240+ x, 60+ y);
		game.getBatch().draw(ClimatMontagneux.murSombreGlacéCentre2, 300+ x, 60+ y);
		game.getBatch().draw(ClimatMontagneux.murSombreGlacéGauche3, 360+ x, 60+ y);
		game.getBatch().draw(ClimatMontagneux.murSombreGlacéGauche, 360+ x, 120+ y);
		game.getBatch().draw(ClimatMontagneux.murSombreGlacéCentre2, 420+ x, 120+ y);
		game.getBatch().draw(ClimatMontagneux.grossePierre, 420+ x, 190+ y);
		
		game.getBatch().draw(ClimatMontagneux.bordGlacéInfGau, 240+ x, 120+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéInfDroi, 300+ x, 120+ y);
		
		game.getBatch().draw(ClimatMontagneux.arbreBasDroite, 0+ x, 60+ y);
		game.getBatch().draw(ClimatMontagneux.arbreCentreDroite, 0+ x, 120+ y);
		game.getBatch().draw(ClimatMontagneux.arbreCentreDroite, 0+ x, 180+ y);
		game.getBatch().draw(ClimatMontagneux.arbreSommetDroite, 0+ x, 240+ y);
		
		game.getBatch().draw(ClimatMontagneux.arbreCentreGauche, 120+ x, 0+ y);
		game.getBatch().draw(ClimatMontagneux.arbreCentreGauche, 120+ x, 60+ y);
		game.getBatch().draw(ClimatMontagneux.arbreCentreGauche, 120+ x, 120+ y);
		game.getBatch().draw(ClimatMontagneux.arbreSommetGauche, 120+ x, 180+ y);
		game.getBatch().draw(ClimatMontagneux.arbreCentreDroite, 180+ x, 0+ y);
		game.getBatch().draw(ClimatMontagneux.arbreCentreDroite, 180+ x, 60+ y);
		game.getBatch().draw(ClimatMontagneux.arbreCentreDroite, 180+ x, 120+ y);
		game.getBatch().draw(ClimatMontagneux.arbreSommetDroite, 180+ x, 180+ y);
		
		game.getBatch().draw(ClimatMontagneux.petitePierre, 480+ x, 0+ y);
		game.getBatch().draw(ClimatMontagneux.tree, 540+ x, 0+ y);
		
	}

	public static void destroyBody() {
		// TODO Auto-generated method stub
		if ( isBosquet1Created) MainMenu.world.destroyBody(bosquet1);
		isBosquet1Created = false;
		
		if ( isBosquet2Created) MainMenu.world.destroyBody(bosquet2);
		isBosquet2Created = false;
		
		if ( isCote1Created) MainMenu.world.destroyBody(cote1);
		isCote1Created = false;
		
		if ( isCote2Created) MainMenu.world.destroyBody(cote2);
		isCote2Created = false;
		
		if ( isGrossePierre1Created) MainMenu.world.destroyBody(grossePierre1);
		isGrossePierre1Created = false;
		
		if ( isGrossePierre2Created) MainMenu.world.destroyBody(grossePierre2);
		isGrossePierre2Created = false;
		
		if ( isArbre1Created) MainMenu.world.destroyBody(arbre1);
		isArbre1Created = false;
		
		if ( isPetitePierre1Created) MainMenu.world.destroyBody(petitePierre1);
		isPetitePierre1Created = false;
	}

	public static void createBodyAndType(World world) {
		// TODO Auto-generated method stub
		if ( isBosquet1Created == false ) {
			bosquet1 = ClimatMontagneux.createBody(20,180,30,200);
			isBosquet1Created = true;
		}
		if ( isBosquet2Created == false ) {
			bosquet2 = ClimatMontagneux.createBody(160,110,120,200);
			isBosquet2Created = true;
		}
		
		if ( isCote1Created == false ) {
			cote1 = ClimatMontagneux.createBody(300,285,600,1);
			isCote1Created = true;
		}
		if ( isCote2Created == false ) {
			cote2 = ClimatMontagneux.createBody(410,225,320,1);
			isCote2Created = true;
		}
		
		if ( isGrossePierre1Created == false ) {
			grossePierre1 = ClimatMontagneux.createBodyPerso("grossePierre", "static",00,300);
			isGrossePierre1Created = true;
		}
		if ( isGrossePierre2Created == false ) {
			grossePierre2 = ClimatMontagneux.createBodyPerso("grossePierre", "static",420,180);
			isGrossePierre2Created = true;
		}
		
		if ( isArbre1Created == false ) {
			arbre1 = ClimatMontagneux.createBodyPerso("arbre", "static",540,0);
			isArbre1Created = true;
		}
		if ( isPetitePierre1Created == false ) {
			petitePierre1 = ClimatMontagneux.createBodyPerso("grossePierre", "static",480,0);
			isPetitePierre1Created = true;
		}
	}

	public static void destroyType() {
		// TODO Auto-generated method stub
		
	}
}
