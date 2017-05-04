package map.zoneGlace;

import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.physics.box2d.Body;
import com.badlogic.gdx.physics.box2d.World;
import com.mygdx.game.GameMain;

import characters.Pnj;
import characters.Slim;
import characters.SlimPetit;
import decors.ClimatMontagneux;
import scenes.MainMenu;

public class SousMapH5 extends Sprite{

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

		game.getBatch().draw(ClimatMontagneux.piedGlacéSup, 0+ x, 240+ y);
		game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 0+ x, 300+ y);
		game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 0+ x, 360+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéInfDroi, 0+ x, 420+ y);

		game.getBatch().draw(ClimatMontagneux.piedGlacéSup, 60+ x, 300+ y);
		game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 60+ x, 360+ y);
		game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 60+ x, 420+ y);

		game.getBatch().draw(ClimatMontagneux.piedGlacéSup, 120+ x, 360+ y);
		game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 120+ x, 420+ y);

		game.getBatch().draw(ClimatMontagneux.piedGlacéSup, 180+ x, 420+ y);


		game.getBatch().draw(ClimatMontagneux.bordGlacéInfDroi, 0+ x, 0+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéInf, 60+ x, 60+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéInf, 120+ x, 60+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéInf, 180+ x, 60+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéInfDroi, 240+ x, 60+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéInf, 300+ x, 120+ y);
		game.getBatch().draw(ClimatMontagneux.escalierHaut, 360+ x, 120+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéInf, 420+ x, 120+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéInf, 480+ x, 120+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéInf, 540+ x, 120+ y);

		game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 60+ x, 0+ y);
		game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 120+ x, 0+ y);
		game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 180+ x, 0+ y);
		game.getBatch().draw(ClimatMontagneux.murGlacéDroite, 240+ x, 0+ y);
		game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 300+ x, 60+ y);
		game.getBatch().draw(ClimatMontagneux.cheminGlace, 360+ x, 60+ y);
		game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 420+ x, 60+ y);
		game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 480+ x, 60+ y);
		game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 540+ x, 60+ y);

		game.getBatch().draw(ClimatMontagneux.piedGlacéSup, 300+ x, 0+ y);
		game.getBatch().draw(ClimatMontagneux.piedGlacéSup, 420+ x, 0+ y);
		game.getBatch().draw(ClimatMontagneux.piedGlacéSup, 480+ x, 0+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéDroi, 540+ x, 0+ y);


        game.getBatch().draw(ClimatMontagneux.bordGlacéDroi, 00+ x, 120+ y);
        game.getBatch().draw(ClimatMontagneux.bordGlacéInf, 60+ x, 180+ y);
        game.getBatch().draw(ClimatMontagneux.cheminGlaceHori, 60+ x, 60+ y);
        game.getBatch().draw(ClimatMontagneux.bordGlacéGau, 120+ x, 120+ y);
        ClimatMontagneux.placerMurSombreGlacéCentre2( game, 60+ x, 120+ y );

        game.getBatch().draw(ClimatMontagneux.bordGlacéDroi, 120+ x, 300+ y);
        game.getBatch().draw(ClimatMontagneux.bordGlacéInf, 180+ x, 360+ y);
        game.getBatch().draw(ClimatMontagneux.bordGlacéSup, 180+ x, 240+ y);
        game.getBatch().draw(ClimatMontagneux.bordGlacéGau, 240+ x, 300+ y);
        ClimatMontagneux.placerMurSombreGlacéCentre2( game, 180+ x, 300+ y );

        game.getBatch().draw(ClimatMontagneux.bordGlacéDroi, 180+ x, 180+ y);
        game.getBatch().draw(ClimatMontagneux.bordGlacéInf, 240+ x, 240+ y);
        game.getBatch().draw(ClimatMontagneux.bordGlacéSup, 240+ x, 120+ y);
        game.getBatch().draw(ClimatMontagneux.bordGlacéGau, 300+ x, 180+ y);
        ClimatMontagneux.placerMurSombreGlacéCentre2( game, 240+ x, 180+ y );

        game.getBatch().draw(ClimatMontagneux.bordGlacéDroi, 300+ x, 360+ y);
        game.getBatch().draw(ClimatMontagneux.bordGlacéInf, 360+ x, 420+ y);
        game.getBatch().draw(ClimatMontagneux.bordGlacéSup, 360+ x, 300+ y);
        game.getBatch().draw(ClimatMontagneux.bordGlacéGau, 420+ x, 360+ y);
        ClimatMontagneux.placerMurSombreGlacéCentre2( game, 360+ x, 360+ y );

        game.getBatch().draw(ClimatMontagneux.bordGlacéDroi, 360+ x, 240+ y);
        game.getBatch().draw(ClimatMontagneux.bordGlacéInf, 420+ x, 300+ y);
        game.getBatch().draw(ClimatMontagneux.bordGlacéSup, 420+ x, 180+ y);
        game.getBatch().draw(ClimatMontagneux.bordGlacéGau, 480+ x, 240+ y);
        ClimatMontagneux.placerMurSombreGlacéCentre2( game, 420+ x, 240+ y );


//		buissons


        game.getBatch().draw(ClimatMontagneux.tree, 180+ x, 430+ y);
        game.getBatch().draw(ClimatMontagneux.tree, 120+ x, 370+ y);
        game.getBatch().draw(ClimatMontagneux.tree, 60+ x, 310+ y);
        game.getBatch().draw(ClimatMontagneux.tree, 0+ x, 250+ y);
		game.getBatch().draw(ClimatMontagneux.tree, -50+ x, 190+ y);

		game.getBatch().draw(ClimatMontagneux.tree, -50+ x, 20+ y);
        game.getBatch().draw(ClimatMontagneux.tree, 10+ x, 20+ y);

		game.getBatch().draw(ClimatMontagneux.tree, 60+ x, -60+ y);
		game.getBatch().draw(ClimatMontagneux.tree, 120+ x, -60+ y);
		game.getBatch().draw(ClimatMontagneux.tree, 180+ x, -60+ y);
		game.getBatch().draw(ClimatMontagneux.tree, 240+ x, -60+ y);

        game.getBatch().draw(ClimatMontagneux.tree, 540+ x, 420+ y);
        game.getBatch().draw(ClimatMontagneux.tree, 570+ x, 410+ y);
        game.getBatch().draw(ClimatMontagneux.tree, 540+ x, 380+ y);
        game.getBatch().draw(ClimatMontagneux.tree, 570+ x, 350+ y);
        game.getBatch().draw(ClimatMontagneux.tree, 540+ x, 320+ y);
        game.getBatch().draw(ClimatMontagneux.tree, 570+ x, 290+ y);
        game.getBatch().draw(ClimatMontagneux.tree, 540+ x, 260+ y);
        game.getBatch().draw(ClimatMontagneux.tree, 570+ x, 230+ y);
        game.getBatch().draw(ClimatMontagneux.tree, 540+ x, 200+ y);

//
        game.getBatch().draw(ClimatMontagneux.planteGelé3, 0+ x, 180+ y);

        game.getBatch().draw(ClimatMontagneux.planteGelé3, 180+ x,120+ y);
        game.getBatch().draw(ClimatMontagneux.planteGelé3, 300+ x, 0+ y);
        game.getBatch().draw(ClimatMontagneux.planteGelé, 480+ x, 0+ y);

        game.getBatch().draw(ClimatMontagneux.planteGelé, 480+ x, 130+ y);
        game.getBatch().draw(ClimatMontagneux.planteGelé, 420+ x, 360+ y);



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

        if ( isCote9Created) MainMenu.world.destroyBody(cote9);
        isCote9Created = false;

        if ( isCote10Created) MainMenu.world.destroyBody(cote10);
        isCote10Created = false;

        if ( isCote11Created) MainMenu.world.destroyBody(cote11);
        isCote11Created = false;

	}

	public static void createBodyAndType(World world) {
		// TODO Auto-generated method stub

        if ( isCote1Created == false ) {
            cote1 = ClimatMontagneux.createBody(560,360,60,300);
            isCote1Created = true;
        }
        if ( isCote2Created == false ) {
            cote2 = ClimatMontagneux.createBody(320,90,60,60);
            isCote2Created = true;
        }
        if ( isCote3Created == false ) {
            cote3 = ClimatMontagneux.createBody(530,90,240,60);
            isCote3Created = true;
        }
        if ( isCote4Created == false ) {
            cote4 = ClimatMontagneux.createBody(-30,280,30,160);
            isCote4Created = true;
        }
        if ( isCote5Created == false ) {
            cote5 = ClimatMontagneux.createBody(20,40,60,90);
            isCote5Created = true;
        }
        if ( isCote6Created == false ) {
            cote6 = ClimatMontagneux.createBody(160,30,240,50);
            isCote6Created = true;
        }
        if ( isCote7Created == false ) {
            cote7 = ClimatMontagneux.createBody(20,330,60,180);
            isCote7Created = true;
        }
        if ( isCote8Created == false ) {
            cote8 = ClimatMontagneux.createBody(80,390,60,180);
            isCote8Created = true;
        }
        if ( isCote9Created == false ) {
            cote9 = ClimatMontagneux.createBody(140,420,60,120);
            isCote9Created = true;
        }
        if ( isCote10Created == false ) {
            cote10 = ClimatMontagneux.createBody(190,450,60,60);
            isCote10Created = true;
        }
        if ( isCote11Created == false ) {
            cote11 = ClimatMontagneux.createBody(580,30,1,60);
            isCote11Created = true;
        }

	}

	public static void destroyType() {
		// TODO Auto-generated method stub
		
	}
}
