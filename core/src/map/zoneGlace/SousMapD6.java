package map.zoneGlace;

import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.physics.box2d.Body;
import com.badlogic.gdx.physics.box2d.World;
import com.mygdx.game.GameMain;

import decors.ClimatMontagneux;
import scenes.MainMenu;

public class SousMapD6 extends Sprite{

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


    public static Body arbre1;
    public static boolean isArbre1Created;
	
	public static void sousMap(GameMain game, int x, int y){
		
		ClimatMontagneux.eauProfondeGlacée(game,0+ x, 0+y);
		ClimatMontagneux.eauProfondeGlacée(game,0+ x, 60+y);
		game.getBatch().draw(ClimatMontagneux.glace1, 0+ x, 120+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 0+ x, 180+ y);		
		game.getBatch().draw(ClimatMontagneux.glace1, 0 + x,240 + y);
		game.getBatch().draw(ClimatMontagneux.glace1, 0+ x, 300+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 0+ x, 360+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 0+ x, 420+ y);
		
		ClimatMontagneux.eauProfondeGlacée(game,60+ x, 0+y);
		ClimatMontagneux.eauProfondeGlacée(game,60+ x, 60+y);
		game.getBatch().draw(ClimatMontagneux.glace1, 60+ x, 120+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 60+ x, 180+ y);		
		game.getBatch().draw(ClimatMontagneux.glace1, 60+ x, 240+ y);	
		game.getBatch().draw(ClimatMontagneux.glace1, 60+ x, 300+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 60+ x, 360+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 60+ x, 420+ y);
		
		ClimatMontagneux.eauProfondeGlacée(game,120+ x, 0+y);
		ClimatMontagneux.eauProfondeGlacée(game,120+ x, 60+y);
		ClimatMontagneux.eauProfondeGlacée(game,120+ x, 120+y);
		game.getBatch().draw(ClimatMontagneux.glace1, 120+ x, 180+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 120+ x, 240+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 120+ x, 300+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 120+ x, 360+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 120+ x, 420+ y);
		
		ClimatMontagneux.eauProfondeGlacée(game,180+ x, 0+y);
		ClimatMontagneux.eauProfondeGlacée(game,180+ x, 60+y);
		ClimatMontagneux.eauProfondeGlacée(game,180+ x, 120+y);
		game.getBatch().draw(ClimatMontagneux.glace1, 180+ x, 180+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 180+ x, 240+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 180+ x, 300+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 180+ x, 360+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 180+ x, 420+ y);
		
		ClimatMontagneux.eauProfondeGlacée(game,240+ x, 0+y);
		ClimatMontagneux.eauProfondeGlacée(game,240+ x, 60+y);
		ClimatMontagneux.eauProfondeGlacée(game,240+ x, 120+y);
		game.getBatch().draw(ClimatMontagneux.glace1, 240+ x, 180+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 240+ x, 240+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 240+ x, 300+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 240+ x, 360+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 240+ x, 420+ y);
		
		ClimatMontagneux.eauProfondeGlacée(game,300+ x, 0+y);
		ClimatMontagneux.eauProfondeGlacée(game,300+ x, 60+y);
		game.getBatch().draw(ClimatMontagneux.glace1, 300+ x, 120+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 300+ x, 180+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 300+ x, 240+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 300+ x, 300+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 300+ x, 360+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 300+ x, 420+ y);
		
		ClimatMontagneux.eauProfondeGlacée(game,360+ x, 0+y);
		ClimatMontagneux.eauProfondeGlacée(game,360+ x, 60+y);
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
		game.getBatch().draw(ClimatMontagneux.piedGlacéSup, 60+ x, 360+ y);
		game.getBatch().draw(ClimatMontagneux.piedGlacéSup, 120+ x, 360+ y);
		game.getBatch().draw(ClimatMontagneux.piedGlacéSup, 180+ x, 360+ y);
		game.getBatch().draw(ClimatMontagneux.piedGlacéSup, 240+ x, 360+ y);
		game.getBatch().draw(ClimatMontagneux.piedGlacéSup, 300+ x, 360+ y);
		game.getBatch().draw(ClimatMontagneux.piedGlacéSup, 360+ x, 360+ y);
		game.getBatch().draw(ClimatMontagneux.piedGlacéSup, 420+ x, 360+ y);
		game.getBatch().draw(ClimatMontagneux.piedGlacéSup, 480+ x, 360+ y);
		game.getBatch().draw(ClimatMontagneux.piedGlacéSup, 540+ x, 360+ y);

		game.getBatch().draw(ClimatMontagneux.bordGlacéInf, 0+ x, 240+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéInfDroi, 60+ x, 240+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéInf, 120+ x, 300+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéInf, 180+ x, 300+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéInf, 240+ x, 300+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéInfGau, 300+ x, 240+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéInf, 360+ x, 240+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéInfGau, 420+ x, 180+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéInf, 480+ x, 180+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéInf, 540+ x, 180+ y);
		game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 0+ x, 180+ y);
		game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 60+ x, 180+ y);
		game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 120+ x, 240+ y);
		game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 180+ x, 240+ y);
		game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 240+ x, 240+ y);
		game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 300+ x, 180+ y);
		game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 360+ x, 180+ y);
		game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 420+ x, 120+ y);
		game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 480+ x, 120+ y);
		game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 540+ x, 120+ y);
		game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 0+ x, 120+ y);
		game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 60+ x, 120+ y);
		game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 120+ x, 180+ y);
		game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 180+ x, 180+ y);
		game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 240+ x, 180+ y);
		game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 300+ x, 120+ y);
		game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 360+ x, 120+ y);
		game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 420+ x, 60+ y);
		game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 480+ x, 60+ y);
		game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 540+ x, 60+ y);
		game.getBatch().draw(ClimatMontagneux.murBasMer, 0+ x, 60+ y);
		game.getBatch().draw(ClimatMontagneux.murBasMer, 60+ x, 60+ y);
		game.getBatch().draw(ClimatMontagneux.murBasMer, 120+ x, 120+ y);
		game.getBatch().draw(ClimatMontagneux.murBasMer, 180+ x, 120+ y);
		game.getBatch().draw(ClimatMontagneux.murBasMer, 240+ x, 120+ y);
		game.getBatch().draw(ClimatMontagneux.murBasMer, 300+ x, 60+ y);
		game.getBatch().draw(ClimatMontagneux.murBasMer, 360+ x, 60+ y);
		game.getBatch().draw(ClimatMontagneux.murBasMer, 420+ x, 0+ y);
		game.getBatch().draw(ClimatMontagneux.murBasMer, 480+ x, 0+ y);
		game.getBatch().draw(ClimatMontagneux.murBasMer, 540+ x, 0+ y);
		
		game.getBatch().draw(ClimatMontagneux.murGlacéGauche, 60+ x, 420+ y);
		game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 120+ x, 420+ y);
		game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 180+ x, 420+ y);
		game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 240+ x, 420+ y);
		game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 300+ x, 420+ y);
		game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 360+ x, 420+ y);
		game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 420+ x, 420+ y);
		game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 480+ x, 420+ y);
		game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 540+ x, 420+ y);


//


        game.getBatch().draw(ClimatMontagneux.herbeGlace120, -90+ x, 300+ y);
        game.getBatch().draw(ClimatMontagneux.herbeGlace120, -60+ x, 270+ y);

        game.getBatch().draw(ClimatMontagneux.planteGelé3, 0+ x, 370+ y);
        game.getBatch().draw(ClimatMontagneux.planteGelé3, 60+ x, 320+ y);
        game.getBatch().draw(ClimatMontagneux.planteGelé, 180+ x, 320+ y);
        game.getBatch().draw(ClimatMontagneux.planteGelé, 240+ x, 360+ y);
        game.getBatch().draw(ClimatMontagneux.planteGelé3, 300+ x, 260+ y);
        game.getBatch().draw(ClimatMontagneux.planteGelé, 420+ x, 360+ y);


		game.getBatch().draw(ClimatMontagneux.tree, -40+ x, 420+ y);

        game.getBatch().draw(ClimatMontagneux.tree, 580+ x, 290+ y);
        game.getBatch().draw(ClimatMontagneux.tree, 580+ x, 250+ y);

		game.getBatch().draw(ClimatMontagneux.tree, 520+ x, 290+ y);
        game.getBatch().draw(ClimatMontagneux.tree, 440+ x, 290+ y);
        game.getBatch().draw(ClimatMontagneux.tree, 410+ x, 260+ y);
        game.getBatch().draw(ClimatMontagneux.tree, 480+ x, 260+ y);
        game.getBatch().draw(ClimatMontagneux.tree, 440+ x, 250+ y);
        game.getBatch().draw(ClimatMontagneux.tree, 520+ x, 250+ y);
        game.getBatch().draw(ClimatMontagneux.tree, 480+ x, 220+ y);
        game.getBatch().draw(ClimatMontagneux.tree, 540+ x, 220+ y);
		game.getBatch().draw(ClimatMontagneux.tree, 520+ x, 200+ y);
        game.getBatch().draw(ClimatMontagneux.tree, 440+ x, 200+ y);
        game.getBatch().draw(ClimatMontagneux.tree, 580+ x, 210+ y);

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

        if ( isArbre1Created) MainMenu.world.destroyBody(arbre1);
        isArbre1Created = false;
	}

	public static void createBodyAndType(World world) {
		// TODO Auto-generated method stub
		if ( ismur1Created == false ) {
			mur1 = ClimatMontagneux.createBody(60,240,160,1);
			ismur1Created = true;
		}

        if ( ismur2Created == false ) {
            mur2 = ClimatMontagneux.createBody(320,450,540,60);
            ismur2Created = true;
        }

        if ( ismur3Created == false ) {
            mur3 = ClimatMontagneux.createBody(200,270,180,60);
            ismur3Created = true;
        }

        if ( ismur4Created == false ) {
            mur4 = ClimatMontagneux.createBody(350,210,120,60);
            ismur4Created = true;
        }

        if ( ismur5Created == false ) {
            mur5 = ClimatMontagneux.createBody(500,240,180,240);
            ismur5Created = true;
        }


        if ( isArbre1Created == false ) {
            arbre1 = ClimatMontagneux.createBody(0,460,1,80);
            isArbre1Created = true;
        }
	}

	public static void destroyType() {
		// TODO Auto-generated method stub
		
	}
}
