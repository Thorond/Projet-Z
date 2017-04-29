package map.zoneGlace;

import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.physics.box2d.Body;
import com.badlogic.gdx.physics.box2d.World;
import com.mygdx.game.GameMain;

import decors.ClimatMontagneux;
import decors.DonjonGlace;
import scenes.MainMenu;

public class SousMapH3 extends Sprite{


	public static Body bosquet1 ;
	public static boolean isBosquet1Created;
    public static Body bosquet2 ;
    public static boolean isBosquet2Created;

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

    public static Body arbre1;
    public static boolean isarbre1Created;
    public static Body arbre2;
    public static boolean isarbre2Created;
    public static Body arbre3;
    public static boolean isarbre3Created;
    public static Body arbre4;
    public static boolean isarbre4Created;
    public static Body arbre5;
    public static boolean isarbre5Created;
    public static Body arbre6;
    public static boolean isarbre6Created;
	
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
		
		
//		
		

		
		
		game.getBatch().draw(ClimatMontagneux.bordGlacéSupDroi, 00+ x, 420+ y);

		game.getBatch().draw(ClimatMontagneux.bordGlacéSupDroi, 60+ x, 360+ y);
		ClimatMontagneux.placerMurSombreGlacéCentre(game, 60+ x, 420+ y);

		game.getBatch().draw(ClimatMontagneux.bordGlacéSupDroi, 120+ x, 300+ y);
		ClimatMontagneux.placerMurSombreGlacéCentre(game, 120+ x, 420+ y);
		ClimatMontagneux.placerMurSombreGlacéCentre(game, 120+ x, 360+ y);

		game.getBatch().draw(ClimatMontagneux.bordGlacéSupDroi, 180+ x, 240+ y);
		ClimatMontagneux.placerMurSombreGlacéCentre(game, 180+ x, 300+ y);
		ClimatMontagneux.placerMurSombreGlacéCentre(game, 180+ x, 360+ y);
		ClimatMontagneux.placerMurSombreGlacéDroite3(game, 180+ x, 420+ y);

		game.getBatch().draw(ClimatMontagneux.bordGlacéSup, 240+ x, 180+ y);
		ClimatMontagneux.placerMurSombreGlacéCentre(game, 240+ x, 240+ y);
		ClimatMontagneux.placerMurSombreGlacéCentre(game, 240+ x, 300+ y);
		ClimatMontagneux.placerMurSombreGlacéDroite3(game, 240+ x, 360+ y);
		ClimatMontagneux.placerMurSombreGlacéDroite(game, 240+ x, 420+ y);

		game.getBatch().draw(ClimatMontagneux.bordGlacéSup, 300+ x, 180+ y);
		ClimatMontagneux.placerMurSombreGlacéCentre(game, 300+ x, 240+ y);
		ClimatMontagneux.placerMurSombreGlacéDroite3(game, 300+ x, 300+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéInfGau, 300+ x, 360+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéGau, 300+ x, 420+ y);

		game.getBatch().draw(ClimatMontagneux.bordGlacéSup, 360+ x, 180+ y);
		ClimatMontagneux.placerMurSombreGlacéDroite3(game, 360+ x, 240+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéInfGau, 360+ x, 300+ y);

		game.getBatch().draw(ClimatMontagneux.bordGlacéGau, 420+ x, 240+ y);

		game.getBatch().draw(ClimatMontagneux.bordGlacéDroi, 360+ x, 180+ y);
		
		game.getBatch().draw(ClimatMontagneux.bordGlacéSupDroi, 420+ x, 120+ y);
		ClimatMontagneux.placerMurSombreGlacéDroite3(game, 420+ x, 180+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéInf, 420+ x, 240+ y);
		
		game.getBatch().draw(ClimatMontagneux.bordGlacéSupDroi, 480+ x, 60+ y);
		ClimatMontagneux.placerMurSombreGlacéDroite3(game, 480+ x, 120+ y);
		ClimatMontagneux.placerMurSombreGlacéDroite(game, 480+ x, 180+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéInf, 480+ x, 240+ y);
		
		game.getBatch().draw(ClimatMontagneux.bordGlacéSupDroi, 540+ x, 00+ y);
		ClimatMontagneux.placerMurSombreGlacéDroite3(game, 540+ x, 60+ y);
		ClimatMontagneux.placerMurSombreGlacéDroite(game, 540+ x, 120+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéInf, 540+ x, 180+ y);
		
//		

		game.getBatch().draw(DonjonGlace.murVertical, 310+ x, 450+ y);
		game.getBatch().draw(DonjonGlace.murHorizontal, 330+ x, 450+ y);
		game.getBatch().draw(DonjonGlace.murHorizontal, 420+ x, 450+ y);
		game.getBatch().draw(DonjonGlace.murHorizontal, 510+ x, 450+ y);
		
//		
		game.getBatch().draw(ClimatMontagneux.planteGelé, 0+ x, 120+ y);
		game.getBatch().draw(ClimatMontagneux.planteGelé3, 00+ x, 240+ y);
		game.getBatch().draw(ClimatMontagneux.planteGelé, 60+ x, 140+ y);
		game.getBatch().draw(ClimatMontagneux.planteGelé, 180+ x, 180+ y);
		game.getBatch().draw(ClimatMontagneux.planteGelé3, 300+ x, 60+ y);
		game.getBatch().draw(ClimatMontagneux.planteGelé2Cut, 300+ x, 420+ y);
        game.getBatch().draw(ClimatMontagneux.planteGelé2Cut, 300+ x, 380+ y);
        game.getBatch().draw(ClimatMontagneux.planteGelé3, 360+ x, 320+ y);
        game.getBatch().draw(ClimatMontagneux.planteGelé3, 420+ x, 380+ y);

		game.getBatch().draw(ClimatMontagneux.iceberg2, 420+ x, 240+ y);
		
		game.getBatch().draw(ClimatMontagneux.tree, 00+ x, 420+ y);
		game.getBatch().draw(ClimatMontagneux.tree, 60+ x, 360+ y);
		game.getBatch().draw(ClimatMontagneux.tree, 120+ x, 300+ y);
		game.getBatch().draw(ClimatMontagneux.tree, 180+ x, 240+ y);
		game.getBatch().draw(ClimatMontagneux.tree, 240+ x, 180+ y);
		game.getBatch().draw(ClimatMontagneux.tree, 300+ x, 180+ y);
		game.getBatch().draw(ClimatMontagneux.tree, 420+ x, 120+ y);
		game.getBatch().draw(ClimatMontagneux.tree, 480+ x, 60+ y);
		game.getBatch().draw(ClimatMontagneux.tree, 540+ x, 0+ y);
		
		game.getBatch().draw(ClimatMontagneux.tree, 30+ x, 330+ y);
		game.getBatch().draw(ClimatMontagneux.tree, 90+ x, 270+ y);
		game.getBatch().draw(ClimatMontagneux.tree, 150+ x, 210+ y);
		game.getBatch().draw(ClimatMontagneux.tree, 210+ x, 150+ y);
		game.getBatch().draw(ClimatMontagneux.tree, 270+ x, 150+ y);
		game.getBatch().draw(ClimatMontagneux.tree, 390+ x, 90+ y);

		game.getBatch().draw(ClimatMontagneux.tree, -30+ x, 360+ y);
		game.getBatch().draw(ClimatMontagneux.tree, 40+ x, 300+ y);
		game.getBatch().draw(ClimatMontagneux.tree, 100+ x, 240+ y);
		game.getBatch().draw(ClimatMontagneux.tree, 430+ x, 60+ y);
		game.getBatch().draw(ClimatMontagneux.tree, 450+ x, 30+ y);
		game.getBatch().draw(ClimatMontagneux.tree, 490+ x, 0+ y);

        game.getBatch().draw(ClimatMontagneux.tree, 510+ x, -30+ y);
        game.getBatch().draw(ClimatMontagneux.tree, 480+ x, -60+ y);
        game.getBatch().draw(ClimatMontagneux.tree, 540+ x, -60+ y);

		game.getBatch().draw(ClimatMontagneux.tree, -10+ x, 50+ y);
		
		game.getBatch().draw(ClimatMontagneux.tree, 60+ x, 30+ y);
		game.getBatch().draw(ClimatMontagneux.tree, 150+ x, 30+ y);
		game.getBatch().draw(ClimatMontagneux.tree, 30+ x, 0+ y);
		game.getBatch().draw(ClimatMontagneux.tree, 120+ x, 0+ y);
		game.getBatch().draw(ClimatMontagneux.tree, 210+ x, 0+ y);
		game.getBatch().draw(ClimatMontagneux.tree, 0+ x, -30+ y);
		game.getBatch().draw(ClimatMontagneux.tree, 90+ x, -30+ y);
		game.getBatch().draw(ClimatMontagneux.tree, 180+ x, -30+ y);
		game.getBatch().draw(ClimatMontagneux.tree, 270+ x, -30+ y);
		game.getBatch().draw(ClimatMontagneux.tree, 40+ x, -60+ y);
		game.getBatch().draw(ClimatMontagneux.tree, 130+ x, -60+ y);
		game.getBatch().draw(ClimatMontagneux.tree, 220+ x, -60+ y);
		game.getBatch().draw(ClimatMontagneux.tree, 310+ x, -60+ y);

        game.getBatch().draw(ClimatMontagneux.tree, 570+ x, 320+ y);
        game.getBatch().draw(ClimatMontagneux.tree, 570+ x, 260+ y);
        game.getBatch().draw(ClimatMontagneux.tree, 540+ x, 200+ y);
		
		
		
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

        if ( isarbre1Created) MainMenu.world.destroyBody(arbre1);
        isarbre1Created = false;

        if ( isarbre2Created) MainMenu.world.destroyBody(arbre2);
        isarbre2Created = false;

        if ( isarbre3Created) MainMenu.world.destroyBody(arbre3);
        isarbre3Created = false;

        if ( isarbre4Created) MainMenu.world.destroyBody(arbre4);
        isarbre4Created = false;

        if ( isarbre5Created) MainMenu.world.destroyBody(arbre5);
        isarbre5Created = false;

        if ( isarbre6Created) MainMenu.world.destroyBody(arbre6);
        isarbre6Created = false;
	}

	public static void createBodyAndType(World world) {
		// TODO Auto-generated method stub

        if ( isBosquet1Created == false ) {
            bosquet1 = ClimatMontagneux.createBody(170,10,360,50);
            isBosquet1Created = true;
        }
        if ( isBosquet2Created == false ) {
            bosquet2 = ClimatMontagneux.createBody(530,30,120,90);
            isBosquet2Created = true;
        }

        if ( isCote1Created == false ) {
            cote1 = ClimatMontagneux.createBody(10,400,60,60);
            isCote1Created = true;
        }
        if ( isCote2Created == false ) {
            cote2 = ClimatMontagneux.createBody(60,370,60,120);
            isCote2Created = true;
        }
//        bas gauche frontière
        if ( isCote3Created == false ) {
            cote3 = ClimatMontagneux.createBody(10,60,60,120);
            isCote3Created = true;
        }

        if ( isCote4Created == false ) {
            cote4 = ClimatMontagneux.createBody(110,310,60,120);
            isCote4Created = true;
        }
        if ( isCote5Created == false ) {
            cote5 = ClimatMontagneux.createBody(265,210,140,120);
            isCote5Created = true;
        }
        if ( isCote6Created == false ) {
            cote6 = ClimatMontagneux.createBody(120,60,180,70);
            isCote6Created = true;
        }
        if ( isCote7Created == false ) {
            cote7 = ClimatMontagneux.createBody(450,450,300,1);
            isCote7Created = true;
        }
        if ( isCote8Created == false ) {
            cote8 = ClimatMontagneux.createBody(510,310,180,140);
            isCote8Created = true;
        }
        if ( isarbre1Created == false ) {
            arbre1 = ClimatMontagneux.createBodyPerso("arbre", "static",150,210);
            isarbre1Created = true;
        }
        if ( isarbre2Created == false ) {
            arbre2 = ClimatMontagneux.createBodyPerso("arbre", "static",210,0);
            isarbre2Created = true;
        }
        if ( isarbre3Created == false ) {
            arbre3 = ClimatMontagneux.createBodyPerso("arbre", "static",300,380);
            isarbre3Created = true;
        }
        if ( isarbre4Created == false ) {
            arbre4 = ClimatMontagneux.createBodyPerso("arbre", "static",430,60);
            isarbre4Created = true;
        }
        if ( isarbre5Created == false ) {
            arbre5 = ClimatMontagneux.createBodyPerso("arbre", "static",400,90);
            isarbre5Created = true;
        }
        if ( isarbre6Created == false ) {
            arbre6 = ClimatMontagneux.createBodyPerso("arbre", "static",450,30);
            isarbre6Created = true;
        }
	}

	public static void destroyType() {
		// TODO Auto-generated method stub
		
	}
}
