package map.zoneGlace;

import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.physics.box2d.Body;
import com.badlogic.gdx.physics.box2d.World;
import com.mygdx.game.GameMain;

import decors.ClimatMontagneux;
import map.CadrillageMap;
import scenes.MainMenu;

public class SousMapH4 extends Sprite{

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
    public static Body cote12 ;
    public static boolean isCote12Created;
    public static Body cote13 ;
    public static boolean isCote13Created;

    public static Body bosquet1 ;
    public static boolean isBosquet1Created;
    public static Body bosquet2 ;
    public static boolean isBosquet2Created;



    public static boolean isArbuste1Cut = false;
    public static boolean isArbuste2Cut = false;
    public static boolean isArbuste3Cut = false;
	
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

		game.getBatch().draw(ClimatMontagneux.bordGlacéInfDroi, 0+ x, 180+ y);
		game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 0+ x, 120+ y);
		game.getBatch().draw(ClimatMontagneux.murGlacéDroite, 0+ x, 60+ y);

		game.getBatch().draw(ClimatMontagneux.bordGlacéInfDroi, 60+ x, 240+ y);
		game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 60+ x, 180+ y);
		game.getBatch().draw(ClimatMontagneux.murGlacéDroite, 60+ x, 120+ y);

		game.getBatch().draw(ClimatMontagneux.bordGlacéInfDroi, 120+ x, 300+ y);
		game.getBatch().draw(ClimatMontagneux.murGlacéDroite, 120+ x, 180+ y);
		game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 120+ x, 240+ y);

		game.getBatch().draw(ClimatMontagneux.bordGlacéInf, 180+ x, 360+ y);
		game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 180+ x, 300+ y);
		game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 180+ x, 240+ y);

		game.getBatch().draw(ClimatMontagneux.escalierHaut2, 240+ x, 360+ y);
		game.getBatch().draw(ClimatMontagneux.escalierGlacé2, 240+ x, 300+ y);
		game.getBatch().draw(ClimatMontagneux.escalierGlacé2, 240+ x, 240+ y);

		game.getBatch().draw(ClimatMontagneux.bordGlacéInf, 360+ x, 360+ y);
		game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 360+ x, 300+ y);
		game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 360+ x, 240+ y);

		game.getBatch().draw(ClimatMontagneux.bordGlacéInf, 420+ x, 360+ y);
		game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 420+ x, 300+ y);
		game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 420+ x, 240+ y);
		
		game.getBatch().draw(ClimatMontagneux.bordGlacéInf, 480+ x, 360+ y);
		game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 480+ x, 300+ y);
		game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 480+ x, 240+ y);

		game.getBatch().draw(ClimatMontagneux.bordGlacéInf, 540+ x, 360+ y);
		game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 540+ x, 300+ y);
		game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 540+ x, 240+ y);

		game.getBatch().draw(ClimatMontagneux.piedGlacéSup, 00+ x, 0+ y);
		game.getBatch().draw(ClimatMontagneux.piedGlacéSup, 60+ x, 60+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéInfDroi, 60+ x, 0+ y);

		game.getBatch().draw(ClimatMontagneux.piedGlacéSup, 120+ x, 120+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéInfDroi, 120+ x, 60+ y);
		game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 120+ x, 0+ y);

		game.getBatch().draw(ClimatMontagneux.piedGlacéSup, 180+ x, 180+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéInfDroi, 180+ x, 120+ y);
		game.getBatch().draw(ClimatMontagneux.murGlacéDroite, 180+ x, 0+ y);
		game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 180+ x, 60+ y);

		game.getBatch().draw(ClimatMontagneux.bordGlacéInf, 240+ x, 180+ y);
		game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 240+ x, 60+ y);
		game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 240+ x, 120+ y);
		game.getBatch().draw(ClimatMontagneux.piedGlacéSup, 240+ x, 0+ y);

		game.getBatch().draw(ClimatMontagneux.bordGlacéInf, 300+ x, 180+ y);
		game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 300+ x, 60+ y);
		game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 300+ x, 120+ y);
		game.getBatch().draw(ClimatMontagneux.piedGlacéSup, 300+ x, 0+ y);
		
		game.getBatch().draw(ClimatMontagneux.escalierHaut2, 360+ x, 180+ y);
		game.getBatch().draw(ClimatMontagneux.escalierGlacé2, 360+ x, 120+ y);
		game.getBatch().draw(ClimatMontagneux.escalierGlacé2, 360+ x, 60+ y);

		game.getBatch().draw(ClimatMontagneux.bordGlacéInfDroi, 480+ x, 180+ y);
		game.getBatch().draw(ClimatMontagneux.murGlacéDroite, 480+ x, 60+ y);
		game.getBatch().draw(ClimatMontagneux.murGlacéDroite, 480+ x, 120+ y);
		game.getBatch().draw(ClimatMontagneux.piedGlacéSup, 480+ x, 0+ y);
		
		game.getBatch().draw(ClimatMontagneux.murGlacéDroite, 540+ x, 120+ y);
		game.getBatch().draw(ClimatMontagneux.murGlacéDroite, 540+ x, 180+ y);
		game.getBatch().draw(ClimatMontagneux.piedGlacéSup, 540+ x, 60+ y);
		
		
//

        game.getBatch().draw(ClimatMontagneux.tree, 570+ x, -30+ y);

        game.getBatch().draw(ClimatMontagneux.tree, 570+ x, -70+ y);

        game.getBatch().draw(ClimatMontagneux.tree, 540+ x, -60+ y);

		game.getBatch().draw(ClimatMontagneux.tree, 0+ x, 450+ y);
		game.getBatch().draw(ClimatMontagneux.tree, 90+ x, 450+ y);
		game.getBatch().draw(ClimatMontagneux.tree, 180+ x, 450+ y);
		game.getBatch().draw(ClimatMontagneux.tree, 270+ x, 450+ y);
		
		game.getBatch().draw(ClimatMontagneux.tree, 40+ x, 420+ y);
		game.getBatch().draw(ClimatMontagneux.tree, 130+ x, 420+ y);
		game.getBatch().draw(ClimatMontagneux.tree, 220+ x, 420+ y);
		game.getBatch().draw(ClimatMontagneux.tree, 310+ x, 420+ y);

        game.getBatch().draw(ClimatMontagneux.tree, 510+ x, 450+ y);
        game.getBatch().draw(ClimatMontagneux.tree, 480+ x, 420+ y);
        game.getBatch().draw(ClimatMontagneux.tree, 540+ x, 420+ y);
        game.getBatch().draw(ClimatMontagneux.tree, 510+ x, 390+ y);
        game.getBatch().draw(ClimatMontagneux.tree, 480+ x, 370+ y);
        game.getBatch().draw(ClimatMontagneux.tree, 540+ x, 370+ y);

        game.getBatch().draw(ClimatMontagneux.tree, 180+ x, -50+ y);

        game.getBatch().draw(ClimatMontagneux.tree, -50+ x, 140+ y);


        ClimatMontagneux.arbuste(isArbuste1Cut, game, 0+x,190+ y);
        ClimatMontagneux.arbuste(isArbuste2Cut, game, 60+x,250+ y);
        ClimatMontagneux.arbuste(isArbuste3Cut, game, 120+x,310+ y);


//
        game.getBatch().draw(ClimatMontagneux.planteGelé3, 0+ x, 300+ y);
        game.getBatch().draw(ClimatMontagneux.planteGelé3, 60+ x, 60+ y);
        game.getBatch().draw(ClimatMontagneux.planteGelé3, 120+ x, 360+ y);

        game.getBatch().draw(ClimatMontagneux.planteGelé3, 180+ x,140+ y);
        game.getBatch().draw(ClimatMontagneux.planteGelé3, 300+ x, 0+ y);
        game.getBatch().draw(ClimatMontagneux.planteGelé, 480+ x, 0+ y);

        game.getBatch().draw(ClimatMontagneux.planteGelé, 480+ x, 200+ y);
        game.getBatch().draw(ClimatMontagneux.planteGelé, 420+ x, 380+ y);
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

        if ( isCote12Created) MainMenu.world.destroyBody(cote12);
        isCote12Created = false;

        if ( isCote13Created) MainMenu.world.destroyBody(cote13);
        isCote13Created = false;

        if ( isBosquet1Created) MainMenu.world.destroyBody(bosquet1);
        isBosquet1Created = false;

        if ( isBosquet2Created) MainMenu.world.destroyBody(bosquet2);
        isBosquet2Created = false;
	}

	public static void createBodyAndType(World world) {
		// TODO Auto-generated method stub
        if ( isCote1Created == false ) {
            cote1 = ClimatMontagneux.createBody(10,140,60,160);
            isCote1Created = true;
        }
        if ( isCote2Created == false ) {
            cote2 = ClimatMontagneux.createBody(70,200,60,160);
            isCote2Created = true;
        }
        if ( isCote3Created == false ) {
            cote3 = ClimatMontagneux.createBody(130,260,60,160);
            isCote3Created = true;
        }
        if ( isCote4Created == false ) {
            cote4 = ClimatMontagneux.createBody(190,300,60,120);
            isCote4Created = true;
        }
        if ( isCote5Created == false ) {
            cote5 = ClimatMontagneux.createBody(190,60,60,120);
            isCote5Created = true;
        }
        if ( isCote6Created == false ) {
            cote6 = ClimatMontagneux.createBody(280,120,120,120);
            isCote6Created = true;
        }
        if ( isCote7Created == false ) {
            cote7 = ClimatMontagneux.createBody(490,120,60,120);
            isCote7Created = true;
        }
        if ( isCote8Created == false ) {
            cote8 = ClimatMontagneux.createBody(550,240,60,240);
            isCote8Created = true;
        }
        if ( isCote9Created == false ) {
            cote9 = ClimatMontagneux.createBody(430,300,180,120);
            isCote9Created = true;
        }
        if ( isCote10Created == false ) {
            cote10 = ClimatMontagneux.createBody(130,30,60,60);
            isCote10Created = true;
        }
        if ( isCote11Created == false ) {
            cote11 = ClimatMontagneux.createBody(70,0,60,1);
            isCote11Created = true;
        }
        if ( isCote12Created == false ) {
            cote12 = ClimatMontagneux.createBody(0,30,1,60);
            isCote12Created = true;
        }
        if ( isCote13Created == false ) {
            cote13 = ClimatMontagneux.createBody(580,20,30,60);
            isCote13Created = true;
        }

        if ( isBosquet1Created == false ) {
            bosquet1 = ClimatMontagneux.createBody(170,450,360,60);
            isBosquet1Created = true;
        }
        if ( isBosquet2Created == false ) {
            bosquet2 = ClimatMontagneux.createBody(530,420,120,90);
            isBosquet2Created = true;
        }



        CadrillageMap.setTypeDeDécor(0,3,"HerbesHautes");
        CadrillageMap.setTypeDeDécor(1,4,"HerbesHautes");
        CadrillageMap.setTypeDeDécor(2,5,"HerbesHautes");
        if ( CadrillageMap.décorChangé[0][3] == true ) isArbuste1Cut = true;
        if ( CadrillageMap.décorChangé[1][4] == true ) isArbuste2Cut = true;
        if ( CadrillageMap.décorChangé[2][5] == true ) isArbuste3Cut = true;
	}

	public static void destroyType() {
		// TODO Auto-generated method stub

        isArbuste1Cut = false;
        isArbuste2Cut = false;
        isArbuste3Cut = false;
	}
}
