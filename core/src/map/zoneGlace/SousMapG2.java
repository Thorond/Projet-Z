package map.zoneGlace;

import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.physics.box2d.Body;
import com.badlogic.gdx.physics.box2d.World;
import com.mygdx.game.GameMain;

import decors.ClimatMontagneux;
import scenes.MainMenu;

public class SousMapG2 extends Sprite{

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
		
// première ligne 
		game.getBatch().draw(ClimatMontagneux.bordGlacéSupDroi, 60+ x, 420+ y);
		ClimatMontagneux.placerMurSombreGlacéCentre(game,120+ x, 420 +y);
		game.getBatch().draw(ClimatMontagneux.murSombreGlacéDroite3, 180+ x, 420+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéInfGau, 240+ x, 420+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéInfDroi, 300+ x, 420+ y);
		game.getBatch().draw(ClimatMontagneux.murSombreGlacéGauche3, 360+ x, 420+ y);
		ClimatMontagneux.placerMurSombreGlacéCentre(game,420+ x, 420 +y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéSupGau, 480+ x, 420+ y);
		
// deuxième ligne 
		game.getBatch().draw(ClimatMontagneux.bordGlacéInfDroi, 60+ x, 360+ y);
		ClimatMontagneux.placerMurSombreGlacéCentre(game,120+ x,360 + y);
		ClimatMontagneux.placerMurSombreGlacéCentre(game,180+ x,360 + y);
		game.getBatch().draw(ClimatMontagneux.murSombreGlacéDroite3, 240+ x,360+ y);
		game.getBatch().draw(ClimatMontagneux.murSombreGlacéGauche3, 300+ x, 360+ y);
		ClimatMontagneux.placerMurSombreGlacéCentre(game,360+ x, 360 +y);
		ClimatMontagneux.placerMurSombreGlacéCentre(game,420+ x, 360 +y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéInfGau, 480+ x, 360+ y);
		
// deuxième ligne 
		game.getBatch().draw(ClimatMontagneux.bordGlacéInfDroi, 00+ x, 300+ y);
		game.getBatch().draw(ClimatMontagneux.murSombreGlacéGauche, 60+ x, 300+ y);
		ClimatMontagneux.placerMurSombreGlacéCentre(game,120+ x,300 + y);
		ClimatMontagneux.placerMurSombreGlacéCentre(game,180+ x,300 + y);
		game.getBatch().draw(ClimatMontagneux.murSombreGlacéCentre, 240+ x, 300+ y);
		game.getBatch().draw(ClimatMontagneux.murSombreGlacéCentre, 300+ x, 300+ y);
		ClimatMontagneux.placerMurSombreGlacéCentre(game,360+ x, 300 +y);
		ClimatMontagneux.placerMurSombreGlacéCentre(game,420+ x, 300 +y);
		game.getBatch().draw(ClimatMontagneux.murSombreGlacéDroite, 480+ x, 300+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéInfGau, 540+ x, 300+ y);
		
// troisième ligne 
		game.getBatch().draw(ClimatMontagneux.murSombreGlacéGauche, 00+ x, 240+ y);
		game.getBatch().draw(ClimatMontagneux.murSombreGlacéGauche3, 60+ x, 240+ y);
		ClimatMontagneux.placerMurSombreGlacéCentre(game,120+ x,240 + y);
		ClimatMontagneux.placerMurSombreGlacéCentre(game,180+ x,240 + y);
		game.getBatch().draw(ClimatMontagneux.murSombreGlacéCentre, 240+ x, 240+ y);
		game.getBatch().draw(ClimatMontagneux.murSombreGlacéCentre, 300+ x, 240+ y);
		ClimatMontagneux.placerMurSombreGlacéCentre(game,360+ x, 240 +y);
		ClimatMontagneux.placerMurSombreGlacéCentre(game,420+ x, 240 +y);
		game.getBatch().draw(ClimatMontagneux.murSombreGlacéDroite3, 480+ x, 240+ y);
		game.getBatch().draw(ClimatMontagneux.murSombreGlacéDroite, 540+ x, 240+ y);
		
// 4eme ligne 
		game.getBatch().draw(ClimatMontagneux.murSombreGlacéGauche3, 00+ x, 180+ y);
		ClimatMontagneux.placerMurSombreGlacéCentre(game,60+ x, 180 +y);
		ClimatMontagneux.placerMurSombreGlacéCentre(game,120+ x,180 + y);
		ClimatMontagneux.placerMurSombreGlacéCentre(game,180+ x,180 + y);
		game.getBatch().draw(ClimatMontagneux.murSombreGlacéCentre, 240+ x, 180+ y);
		game.getBatch().draw(ClimatMontagneux.murSombreGlacéCentre, 300+ x, 180+ y);
		ClimatMontagneux.placerMurSombreGlacéCentre(game,360+ x, 180 +y);
		ClimatMontagneux.placerMurSombreGlacéCentre(game,420+ x, 180 +y);
		ClimatMontagneux.placerMurSombreGlacéCentre(game,480+ x,180 + y);
		game.getBatch().draw(ClimatMontagneux.murSombreGlacéDroite3, 540+ x, 180+ y);
		
// 5eme ligne 
		ClimatMontagneux.placerMurSombreGlacéCentre(game,0+ x, 120 +y);
		ClimatMontagneux.placerMurSombreGlacéCentre(game,60+ x,120 + y);
		ClimatMontagneux.placerMurSombreGlacéCentre(game,120+ x,120 + y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéSupGau, 180+ x, 120+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéSup, 240+ x, 120+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéSup, 300+ x, 120+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéSupDroi, 360+ x, 120+ y);
		ClimatMontagneux.placerMurSombreGlacéCentre(game,420+ x, 120 +y);
		ClimatMontagneux.placerMurSombreGlacéCentre(game,480+ x,120 + y);
		ClimatMontagneux.placerMurSombreGlacéCentre(game,540+ x,120 + y);
		
// 6eme ligne 
		ClimatMontagneux.placerMurSombreGlacéCentre(game,0+ x, 60 +y);
		ClimatMontagneux.placerMurSombreGlacéCentre(game,60+ x,60 + y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéSupGau, 120+ x, 60+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéSupDroi, 420+ x, 60+ y);
		ClimatMontagneux.placerMurSombreGlacéCentre(game,480+ x,60 + y);
		ClimatMontagneux.placerMurSombreGlacéCentre(game,540+ x,60 + y);
		
// 7eme ligne 
		game.getBatch().draw(ClimatMontagneux.bordGlacéSup, 00+ x, 0+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéSup, 60+ x, 0+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéSup, 480+ x, 0+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéSup, 540+ x, 0+ y);
		
//		troisième  couche 
		
//		torches
			ClimatMontagneux.annimationTorche(game, 3*60+x, 130+y);
			ClimatMontagneux.annimationTorche(game, 6*60+x, 130+y);
			
//		arbres
		
		game.getBatch().draw(ClimatMontagneux.tree, 0+ x, 450+ y);
		game.getBatch().draw(ClimatMontagneux.tree, 30+ x, 420+ y);
		game.getBatch().draw(ClimatMontagneux.tree, -30+ x, 390+ y);
		game.getBatch().draw(ClimatMontagneux.tree, 70+ x, 390+ y);
		game.getBatch().draw(ClimatMontagneux.tree, 20+ x, 370+ y);
		game.getBatch().draw(ClimatMontagneux.tree, -10+ x, 330+ y);
		
		game.getBatch().draw(ClimatMontagneux.tree, 530+ x, 450+ y);
		game.getBatch().draw(ClimatMontagneux.tree, 500+ x, 420+ y);
		game.getBatch().draw(ClimatMontagneux.tree, 470+ x, 390+ y);
		game.getBatch().draw(ClimatMontagneux.tree, 570+ x, 390+ y);
		game.getBatch().draw(ClimatMontagneux.tree, 520+ x, 370+ y);
		game.getBatch().draw(ClimatMontagneux.tree, 550+ x, 330+ y);

		game.getBatch().draw(ClimatMontagneux.tree, 180+ x, 60+ y);
		game.getBatch().draw(ClimatMontagneux.tree, 0+ x, 10+ y);
		game.getBatch().draw(ClimatMontagneux.tree, 60+ x, 10+ y);
		game.getBatch().draw(ClimatMontagneux.tree, 120+ x, 70+ y);
		game.getBatch().draw(ClimatMontagneux.tree, 140+ x, 20+ y);
		game.getBatch().draw(ClimatMontagneux.tree, 30+ x, -40+ y);
		game.getBatch().draw(ClimatMontagneux.tree, 90+ x, -20+ y);

		game.getBatch().draw(ClimatMontagneux.tree, 360+ x, 60+ y);
		game.getBatch().draw(ClimatMontagneux.tree, 540+ x, 10+ y);
		game.getBatch().draw(ClimatMontagneux.tree, 480+ x, 10+ y);
		game.getBatch().draw(ClimatMontagneux.tree, 420+ x, 70+ y);
		game.getBatch().draw(ClimatMontagneux.tree, 400+ x, 20+ y);
		game.getBatch().draw(ClimatMontagneux.tree, 430+ x, -30+ y);
		game.getBatch().draw(ClimatMontagneux.tree, 510+ x, -20+ y);
		
		game.getBatch().draw(ClimatMontagneux.tree, 540+ x, -60+ y);
		game.getBatch().draw(ClimatMontagneux.tree, 480+ x, -60+ y);
		
		game.getBatch().draw(ClimatMontagneux.planteGelé, 240+ x, 0+ y);
		game.getBatch().draw(ClimatMontagneux.planteGelé3, 240+ x, 120+ y);
		game.getBatch().draw(ClimatMontagneux.planteGelé, 300+ x, 60+ y);
		game.getBatch().draw(ClimatMontagneux.planteGelé3, 360+ x, 0+ y);
		
		

//	pont

		game.getBatch().draw(ClimatMontagneux.grandPontVertical2, 240+ x, 165+ y);
		
	}

	public static void destroyBody() {
		// TODO Auto-generated method stub
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
		
	}

	public static void createBodyAndType(World world) {
		// TODO Auto-generated method stub

        if ( isCote1Created == false ) {
            cote1 = ClimatMontagneux.createBody(230,360,1,360);
            isCote1Created = true;
        }
        if ( isCote2Created == false ) {
            cote2 = ClimatMontagneux.createBody(340,360,1,360);
            isCote2Created = true;
        }
        if ( isCote3Created == false ) {
            cote3 = ClimatMontagneux.createBody(190,120,60,120);
            isCote3Created = true;
        }
        if ( isCote4Created == false ) {
            cote4 = ClimatMontagneux.createBody(380,120,60,120);
            isCote4Created = true;
        }
        if ( isCote5Created == false ) {
            cote5 = ClimatMontagneux.createBody(150,60,60,60);
            isCote5Created = true;
        }
        if ( isCote6Created == false ) {
            cote6 = ClimatMontagneux.createBody(410,60,60,60);
            isCote6Created = true;
        }
        if ( isCote7Created == false ) {
            cote7 = ClimatMontagneux.createBody(110,0,60,60);
            isCote7Created = true;
        }
        if ( isCote8Created == false ) {
            cote8 = ClimatMontagneux.createBody(440,0,60,60);
            isCote8Created = true;
        }
	}

	public static void destroyType() {
		// TODO Auto-generated method stub
		
	}
}
