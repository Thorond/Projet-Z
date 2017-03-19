package map;

import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.physics.box2d.Body;
import com.badlogic.gdx.physics.box2d.World;
import com.mygdx.game.GameMain;

import decors.ClimatMontagneux;
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
			mur3 = ClimatMontagneux.createBody(140,180,290,120);
			ismur3Created = true;
		}
		if ( ismur4Created == false ) {
			mur4 = ClimatMontagneux.createBody(460,180,240,120);
			ismur4Created = true;
		}
		if ( ismur5Created == false ) {
			mur5 = ClimatMontagneux.createBody(140,330,290,60);
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
	}

	public static void destroyType() {
		// TODO Auto-generated method stub
		
	}
}
