package map.zoneGlace;

import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.physics.box2d.Body;
import com.badlogic.gdx.physics.box2d.World;
import com.mygdx.game.GameMain;

import decors.ClimatMontagneux;
import decors.DonjonGlace;
import scenes.MainMenu;

public class SousMapE6 extends Sprite{
	
	public static Body mur1;
	public static boolean ismur1Created;
	public static Body mur2;
	public static boolean ismur2Created;
	public static Body mur3;
	public static boolean ismur3Created;
	public static Body mur4;
	public static boolean ismur4Created;
	public static Body mur5;
	public static boolean ismur5Created;
	public static Body mur6;
	public static boolean ismur6Created;
	public static Body mur7;
	public static boolean ismur7Created;
	public static Body mur8;
	public static boolean ismur8Created;

    public static Body iceMan1;
    public static boolean isiceMan1Created;
    public static Body iceMan2;
    public static boolean isiceMan2Created;
    public static Body iceMan3;
    public static boolean isiceMan3Created;
    public static Body iceMan4;
    public static boolean isiceMan4Created;
	
	public static void sousMap(GameMain game, int x, int y){
		
		ClimatMontagneux.eauProfondeGlacée(game,0+ x, 0+y);
		game.getBatch().draw(ClimatMontagneux.glace1, 0+ x, 60+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 0+ x, 120+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 0+ x, 180+ y);		
		game.getBatch().draw(ClimatMontagneux.glace1, 0 + x,240 + y);
		game.getBatch().draw(ClimatMontagneux.glace1, 0+ x, 300+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 0+ x, 360+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 0+ x, 420+ y);
		
		ClimatMontagneux.eauProfondeGlacée(game,60+ x, 0+y);
		game.getBatch().draw(ClimatMontagneux.glace1, 60+ x, 60+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 60+ x, 120+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 60+ x, 180+ y);		
		game.getBatch().draw(ClimatMontagneux.glace1, 60+ x, 240+ y);	
		game.getBatch().draw(ClimatMontagneux.glace1, 60+ x, 300+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 60+ x, 360+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 60+ x, 420+ y);
		
		ClimatMontagneux.eauProfondeGlacée(game,120+ x, 0+y);
		game.getBatch().draw(ClimatMontagneux.glace1, 120+ x, 60+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 120+ x, 120+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 120+ x, 180+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 120+ x, 240+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 120+ x, 300+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 120+ x, 360+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 120+ x, 420+ y);
		
		ClimatMontagneux.eauProfondeGlacée(game,180+ x, 0+y);
		game.getBatch().draw(ClimatMontagneux.glace1, 180+ x, 60+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 180+ x, 120+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 180+ x, 180+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 180+ x, 240+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 180+ x, 300+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 180+ x, 360+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 180+ x, 420+ y);
		
		ClimatMontagneux.eauProfondeGlacée(game,240+ x, 0+y);
		game.getBatch().draw(ClimatMontagneux.glace1, 240+ x, 60+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 240+ x, 120+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 240+ x, 180+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 240+ x, 240+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 240+ x, 300+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 240+ x, 360+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 240+ x, 420+ y);
		
		ClimatMontagneux.eauProfondeGlacée(game,300+ x, 0+y);
		game.getBatch().draw(ClimatMontagneux.glace1, 300+ x, 60+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 300+ x, 120+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 300+ x, 180+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 300+ x, 240+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 300+ x, 300+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 300+ x, 360+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 300+ x, 420+ y);
		
		ClimatMontagneux.eauProfondeGlacée(game,360+ x, 0+y);
		game.getBatch().draw(ClimatMontagneux.glace1, 360+ x, 60+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 360+ x, 120+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 360+ x, 180+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 360+ x, 240+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 360+ x, 300+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 360+ x, 360+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 360+ x, 420+ y);
		
		ClimatMontagneux.eauProfondeGlacée(game,420+ x, 0+y);
		game.getBatch().draw(ClimatMontagneux.glace1, 420+ x, 60+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 420+ x, 120+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 420+ x, 180+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 420+ x, 240+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 420+ x, 300+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 420+ x, 360+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 420+ x, 420+ y);
		
		ClimatMontagneux.eauProfondeGlacée(game,480+ x, 0+y);
		game.getBatch().draw(ClimatMontagneux.glace1, 480+ x, 60+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 480+ x, 120+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 480+ x, 180+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 480+ x, 240+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 480+ x, 300+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 480+ x, 360+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 480+ x, 420+ y);
		
		ClimatMontagneux.eauProfondeGlacée(game,540+ x, 0+y);
		game.getBatch().draw(ClimatMontagneux.glace1, 540+ x, 60+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 540+ x, 120+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 540+ x, 180+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 540+ x, 240+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 540+ x, 300+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 540+ x, 360+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 540+ x, 420+ y);
		
//		
		game.getBatch().draw(ClimatMontagneux.bordGlacéInfDroi, 0+ x, 180+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéInfGau, 540+ x, 180+ y);
		game.getBatch().draw(ClimatMontagneux.murGlacéDroite, 0+ x, 120+ y);
		game.getBatch().draw(ClimatMontagneux.murGlacéGauche, 540+ x, 120+ y);
		game.getBatch().draw(ClimatMontagneux.murGlacéDroite, 0+ x, 60+ y);
		game.getBatch().draw(ClimatMontagneux.murGlacéGauche, 540+ x, 60+ y);
		game.getBatch().draw(ClimatMontagneux.murBasMer, 0+ x, 0+ y);
		game.getBatch().draw(ClimatMontagneux.murBasMer, 60+ x, 0+ y);
		game.getBatch().draw(ClimatMontagneux.murBasMer, 120+ x, 0+ y);
		game.getBatch().draw(ClimatMontagneux.murBasMer, 180+ x, 0+ y);
		game.getBatch().draw(ClimatMontagneux.murBasMer, 240+ x, 0+ y);
		game.getBatch().draw(ClimatMontagneux.murBasMer, 300+ x, 0+ y);
		game.getBatch().draw(ClimatMontagneux.murBasMer, 360+ x, 0+ y);
		game.getBatch().draw(ClimatMontagneux.murBasMer, 420+ x, 0+ y);
		game.getBatch().draw(ClimatMontagneux.murBasMer, 480+ x, 0+ y);
		game.getBatch().draw(ClimatMontagneux.murBasMer, 540+ x, 0+ y);
		

		game.getBatch().draw(ClimatMontagneux.bordGlacéDroi, 0+ x, 240+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéDroi, 0+ x, 300+ y);
		
		game.getBatch().draw(ClimatMontagneux.bordGlacéGau, 540+ x, 240+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéGau, 540+ x, 300+ y);
		
		game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 60+ x, 240+ y);
		game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 120+ x, 240+ y);
		game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 180+ x, 240+ y);
		game.getBatch().draw(ClimatMontagneux.escalierGlacé, 240+ x, 240+ y);
		game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 300+ x, 240+ y);
		game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 360+ x, 240+ y);
		game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 420+ x, 240+ y);
		game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 480+ x, 240+ y);
		
		game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 60+ x, 300+ y);
		game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 120+ x, 300+ y);
		game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 180+ x, 300+ y);
		game.getBatch().draw(ClimatMontagneux.escalierGlacé, 240+ x, 300+ y);
		game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 300+ x, 300+ y);
		game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 360+ x, 300+ y);
		game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 420+ x, 300+ y);
		game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 480+ x, 300+ y);
		
		game.getBatch().draw(ClimatMontagneux.bordGlacéInf, 60+ x, 360+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéInf, 120+ x, 360+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéInf, 180+ x, 360+ y);
		game.getBatch().draw(ClimatMontagneux.escalierHaut, 240+ x, 360+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéInf, 300+ x, 360+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéInf, 360+ x, 360+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéInf, 420+ x, 360+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéInf, 480+ x, 360+ y);

		game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 0+ x, 420+ y);
		game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 60+ x, 420+ y);
		game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 120+ x, 420+ y);
		game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 180+ x, 420+ y);
		game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 240+ x, 420+ y);
		game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 300+ x, 420+ y);
		game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 360+ x, 420+ y);
		game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 420+ x, 420+ y);
		game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 480+ x, 420+ y);
		game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 540+ x, 420+ y);
	
		
//		 hommes des neiges 
		
		ClimatMontagneux.IceMain(game, 160 + x, 200 + y);
		ClimatMontagneux.IceMain(game, 360 + x, 180 + y);
		ClimatMontagneux.IceMain(game, 370 + x, 70 + y);
		ClimatMontagneux.IceMain(game, 470 + x, 150 + y);
		
		if ( MainMenu.Link.annimationAward ) {
			game.getBatch().draw(DonjonGlace.CléMilieu,MainMenu.Link.getX() -40, MainMenu.Link.getY() + 40 );
			game.getBatch().draw(DonjonGlace.texteClé,100,60);
		}

//


        game.getBatch().draw(ClimatMontagneux.tree, -20+ x, 290+ y);
        game.getBatch().draw(ClimatMontagneux.tree, -20+ x, 250+ y);
        game.getBatch().draw(ClimatMontagneux.tree, -20+ x, 210+ y);

        game.getBatch().draw(ClimatMontagneux.tree, 130+ x, 70+ y);
        game.getBatch().draw(ClimatMontagneux.tree, 70+ x, 110+ y);
        game.getBatch().draw(ClimatMontagneux.tree, 70+ x, 70+ y);
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

        if ( isiceMan1Created) MainMenu.world.destroyBody(iceMan1);
        isiceMan1Created = false;

        if ( isiceMan2Created) MainMenu.world.destroyBody(iceMan2);
        isiceMan2Created = false;

        if ( isiceMan3Created) MainMenu.world.destroyBody(iceMan3);
        isiceMan3Created = false;

        if ( isiceMan4Created) MainMenu.world.destroyBody(iceMan4);
        isiceMan4Created = false;
	}

	public static void createBodyAndType(World world) {
		// TODO Auto-generated method stub
		if ( ismur1Created == false ) {
			mur1 = ClimatMontagneux.createBody(300,50,600,1);
			ismur1Created = true;
		}
        if ( ismur2Created == false ) {
            mur2 = ClimatMontagneux.createBody(300,420,600,1);
            ismur2Created = true;
        }
        if ( ismur3Created == false ) {
            mur3 = ClimatMontagneux.createBody(20,120,60,120);
            ismur3Created = true;
        }
        if ( ismur4Created == false ) {
            mur4 = ClimatMontagneux.createBody(560,120,60,120);
            ismur4Created = true;
        }
        if ( ismur5Created == false ) {
            mur5 = ClimatMontagneux.createBody(50,240,1,240);
            ismur5Created = true;
        }
        if ( ismur6Created == false ) {
            mur6 = ClimatMontagneux.createBody(530,240,1,240);
            ismur6Created = true;
        }
        if ( ismur7Created == false ) {
            mur7 = ClimatMontagneux.createBody(140,300,180,120);
            ismur7Created = true;
        }
        if ( ismur8Created == false ) {
            mur8 = ClimatMontagneux.createBody(400,300,250,120);
            ismur8Created = true;
        }

        if ( isiceMan1Created == false ) {
            iceMan1 = ClimatMontagneux.createBodyPerso("arbre", "static",160,200);
            isiceMan1Created = true;
        }
        if ( isiceMan2Created == false ) {
            iceMan2 = ClimatMontagneux.createBodyPerso("arbre", "static",360,180);
            isiceMan2Created = true;
        }
        if ( isiceMan3Created == false ) {
            iceMan3 = ClimatMontagneux.createBodyPerso("arbre", "static",370,70);
            isiceMan3Created = true;
        }
        if ( isiceMan4Created == false ) {
            iceMan4 = ClimatMontagneux.createBodyPerso("arbre", "static",470,150);
            isiceMan4Created = true;
        }
	}

	public static void destroyType() {
		// TODO Auto-generated method stub
		
	}
}
