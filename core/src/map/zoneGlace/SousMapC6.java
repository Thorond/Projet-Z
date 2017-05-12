package map.zoneGlace;

import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.physics.box2d.Body;
import com.badlogic.gdx.physics.box2d.World;
import com.mygdx.game.GameMain;

import decors.ClimatMontagneux;
import scenes.MainMenu;

public class SousMapC6 extends Sprite{
	
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


    public static Body arbre1;
    public static boolean isArbre1Created;
	
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
		ClimatMontagneux.eauProfondeGlacée(game,60+ x, 60+y);
		ClimatMontagneux.eauProfondeGlacée(game,60+ x, 120+y);
		game.getBatch().draw(ClimatMontagneux.glace1, 60+ x, 180+ y);		
		game.getBatch().draw(ClimatMontagneux.glace1, 60+ x, 240+ y);	
		game.getBatch().draw(ClimatMontagneux.glace1, 60+ x, 300+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 60+ x, 360+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 60+ x, 420+ y);
		
		ClimatMontagneux.eauProfondeGlacée(game,120+ x, 0+y);
		ClimatMontagneux.eauProfondeGlacée(game,120+ x, 60+y);
		ClimatMontagneux.eauProfondeGlacée(game,120+ x, 120+y);
		ClimatMontagneux.eauProfondeGlacée(game,120+ x, 180+y);
		ClimatMontagneux.eauProfondeGlacée(game,120+ x, 240+y);
		game.getBatch().draw(ClimatMontagneux.glace1, 120+ x, 300+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 120+ x, 360+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 120+ x, 420+ y);
		
		ClimatMontagneux.eauProfondeGlacée(game,180+ x, 0+y);
		ClimatMontagneux.eauProfondeGlacée(game,180+ x, 60+y);
		ClimatMontagneux.eauProfondeGlacée(game,180+ x, 120+y);
		ClimatMontagneux.eauProfondeGlacée(game,180+ x, 180+y);
		ClimatMontagneux.eauProfondeGlacée(game,180+ x, 240+y);
		game.getBatch().draw(ClimatMontagneux.glace1, 180+ x, 300+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 180+ x, 360+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 180+ x, 420+ y);
		
		ClimatMontagneux.eauProfondeGlacée(game,240+ x, 0+y);
		ClimatMontagneux.eauProfondeGlacée(game,240+ x, 60+y);
		ClimatMontagneux.eauProfondeGlacée(game,240+ x, 120+y);
		ClimatMontagneux.eauProfondeGlacée(game,240+ x, 180+y);
		game.getBatch().draw(ClimatMontagneux.glace1, 240+ x, 240+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 240+ x, 300+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 240+ x, 360+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 240+ x, 420+ y);
		
		ClimatMontagneux.eauProfondeGlacée(game,300+ x, 0+y);
		ClimatMontagneux.eauProfondeGlacée(game,300+ x, 60+y);
		ClimatMontagneux.eauProfondeGlacée(game,300+ x, 120+y);
		ClimatMontagneux.eauProfondeGlacée(game,300+ x, 180+y);
		game.getBatch().draw(ClimatMontagneux.glace1, 300+ x, 240+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 300+ x, 300+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 300+ x, 360+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 300+ x, 420+ y);
		
		ClimatMontagneux.eauProfondeGlacée(game,360+ x, 0+y);
		ClimatMontagneux.eauProfondeGlacée(game,360+ x, 60+y);
		ClimatMontagneux.eauProfondeGlacée(game,360+ x, 120+y);
		game.getBatch().draw(ClimatMontagneux.glace1, 360+ x, 180+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 360+ x, 240+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 360+ x, 300+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 360+ x, 360+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 360+ x, 420+ y);
		
		ClimatMontagneux.eauProfondeGlacée(game,420+ x, 0+y);
		ClimatMontagneux.eauProfondeGlacée(game,420+ x, 60+y);
		ClimatMontagneux.eauProfondeGlacée(game,420+ x, 120+y);
		game.getBatch().draw(ClimatMontagneux.glace1, 420+ x, 180+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 420+ x, 240+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 420+ x, 300+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 420+ x, 360+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 420+ x, 420+ y);
		
		ClimatMontagneux.eauProfondeGlacée(game,480+ x, 0+y);
		ClimatMontagneux.eauProfondeGlacée(game,480+ x, 60+y);
		game.getBatch().draw(ClimatMontagneux.glace1, 480+ x, 120+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 480+ x, 180+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 480+ x, 240+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 480+ x, 300+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 480+ x, 360+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 480+ x, 420+ y);
		
		ClimatMontagneux.eauProfondeGlacée(game,540+ x, 0+y);
		ClimatMontagneux.eauProfondeGlacée(game,540+ x, 60+y);
		game.getBatch().draw(ClimatMontagneux.glace1, 540+ x, 120+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 540+ x, 180+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 540+ x, 240+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 540+ x, 300+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 540+ x, 360+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 540+ x, 420+ y);
		
//
		game.getBatch().draw(ClimatMontagneux.bordGlacéInfDroi, 0+ x, 180+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéDroi, 0+ x, 240+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéInfDroi, 60+ x, 300+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéDroi, 60+ x, 360+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéInf, 120+ x, 420+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéInf, 180+ x, 420+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéInfGau, 240+ x, 360+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéInf, 300+ x, 360+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéInfGau, 360+ x, 300+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéInf, 420+ x, 300+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéInf, 480+ x, 240+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéInf, 540+ x, 240+ y);
		game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 0+ x, 120+ y);
		game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 60+ x, 240+ y);
		game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 120+ x, 360+ y);
		game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 180+ x, 360+ y);
		game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 240+ x, 300+ y);
		game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 300+ x, 300+ y);
		game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 360+ x, 240+ y);
		game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 420+ x, 240+ y);
		game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 480+ x, 180+ y);
		game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 540+ x, 180+ y);
		game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 0+ x, 60+ y);
		game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 60+ x, 180+ y);
		game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 120+ x, 300+ y);
		game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 180+ x, 300+ y);
		game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 240+ x, 240+ y);
		game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 300+ x, 240+ y);
		game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 360+ x, 180+ y);
		game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 420+ x, 180+ y);
		game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 480+ x, 120+ y);
		game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 540+ x, 120+ y);
		game.getBatch().draw(ClimatMontagneux.murBasMer, 0+ x, 0+ y);
		game.getBatch().draw(ClimatMontagneux.murBasMer, 60+ x, 120+ y);
		game.getBatch().draw(ClimatMontagneux.murBasMer, 120+ x, 240+ y);
		game.getBatch().draw(ClimatMontagneux.murBasMer, 180+ x, 240+ y);
		game.getBatch().draw(ClimatMontagneux.murBasMer, 240+ x, 180+ y);
		game.getBatch().draw(ClimatMontagneux.murBasMer, 300+ x, 180+ y);
		game.getBatch().draw(ClimatMontagneux.murBasMer, 360+ x, 120+ y);
		game.getBatch().draw(ClimatMontagneux.murBasMer, 420+ x, 120+ y);
		game.getBatch().draw(ClimatMontagneux.murBasMer, 480+ x, 60+ y);
		game.getBatch().draw(ClimatMontagneux.murBasMer, 540+ x, 60+ y);


//

        game.getBatch().draw(ClimatMontagneux.herbeGlace120, 480+ x, 330+ y);
        game.getBatch().draw(ClimatMontagneux.herbeGlace120, 510+ x, 300+ y);
        game.getBatch().draw(ClimatMontagneux.herbeGlace120, 540+ x, 270+ y);

        game.getBatch().draw(ClimatMontagneux.planteGelé3, 120+ x, 430+ y);
        game.getBatch().draw(ClimatMontagneux.planteGelé3, 240+ x, 380+ y);
        game.getBatch().draw(ClimatMontagneux.planteGelé, 360+ x, 420+ y);
        game.getBatch().draw(ClimatMontagneux.planteGelé, 420+ x, 320+ y);
        game.getBatch().draw(ClimatMontagneux.planteGelé, 460+ x, 360+ y);
        game.getBatch().draw(ClimatMontagneux.planteGelé3, 540+ x, 300+ y);

		game.getBatch().draw(ClimatMontagneux.tree, 560+ x, 420+ y);

        game.getBatch().draw(ClimatMontagneux.tree, 40+ x, 340+ y);
        game.getBatch().draw(ClimatMontagneux.tree, -30+ x, 340+ y);
        game.getBatch().draw(ClimatMontagneux.tree, 0+ x, 310+ y);
        game.getBatch().draw(ClimatMontagneux.tree, -30+ x, 290+ y);
        game.getBatch().draw(ClimatMontagneux.tree, 0+ x, 260+ y);
        game.getBatch().draw(ClimatMontagneux.tree, -30+ x, 230+ y);
        game.getBatch().draw(ClimatMontagneux.tree, 0+ x, 200+ y);


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

        if ( isArbre1Created) MainMenu.world.destroyBody(arbre1);
        isArbre1Created = false;
	}

	public static void createBodyAndType(World world) {
		// TODO Auto-generated method stub
		if ( ismur1Created == false ) {
			mur1 = ClimatMontagneux.createBody(30,180,80,1);
			ismur1Created = true;
		}
        if ( ismur2Created == false ) {
            mur2 = ClimatMontagneux.createBody(50,350,120,120);
            ismur2Created = true;
        }
        if ( ismur3Created == false ) {
            mur3 = ClimatMontagneux.createBody(170,360,120,120);
            ismur3Created = true;
        }
        if ( ismur4Created == false ) {
            mur4 = ClimatMontagneux.createBody(290,300,120,120);
            ismur4Created = true;
        }
        if ( ismur5Created == false ) {
            mur5 = ClimatMontagneux.createBody(410,240,120,120);
            ismur5Created = true;
        }
        if ( ismur6Created == false ) {
            mur6 = ClimatMontagneux.createBody(530,180,120,120);
            ismur6Created = true;
        }


        if ( isArbre1Created == false ) {
            arbre1 = ClimatMontagneux.createBody(570,460,50,80);
            isArbre1Created = true;
        }
	}

	public static void destroyType() {
		// TODO Auto-generated method stub
		
	}
}
