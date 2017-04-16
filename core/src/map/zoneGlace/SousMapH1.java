package map.zoneGlace;

import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.physics.box2d.Body;
import com.badlogic.gdx.physics.box2d.World;
import com.mygdx.game.GameMain;

import decors.ClimatMontagneux;
import decors.DonjonGlace;
import decors.Totem;
import map.CadrillageMap;
import scenes.MainMenu;

public class SousMapH1 extends Sprite{


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


    public static boolean isBuisson1Cut = false;
    public static boolean isBuisson2Cut = false;
    public static boolean isBuisson3Cut = false;
    public static boolean isBuisson4Cut = false;
    public static boolean isBuisson5Cut = false;
	
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
		ClimatMontagneux.eauProfondeGlacée(game, 60+ x, 420+ y);
		
		game.getBatch().draw(ClimatMontagneux.glace1, 120+ x, 0+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 120+ x, 60+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 120+ x, 120+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 120+ x, 180+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 120+ x, 240+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 120+ x, 300+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 120+ x, 360+ y);
		ClimatMontagneux.eauProfondeGlacée(game, 120+ x, 420+ y);
		
		game.getBatch().draw(ClimatMontagneux.glace1, 180+ x, 0+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 180+ x, 60+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 180+ x, 120+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 180+ x, 180+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 180+ x, 240+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 180+ x, 300+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 180+ x, 360+ y);
		ClimatMontagneux.eauProfondeGlacée(game, 180+ x, 420+ y);
		
		game.getBatch().draw(ClimatMontagneux.glace1, 240+ x, 0+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 240+ x, 60+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 240+ x, 120+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 240+ x, 180+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 240+ x, 240+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 240+ x, 300+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 240+ x, 360+ y);
		ClimatMontagneux.eauProfondeGlacée(game, 240+ x, 420+ y);
		
		game.getBatch().draw(ClimatMontagneux.glace1, 300+ x, 0+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 300+ x, 60+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 300+ x, 120+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 300+ x, 180+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 300+ x, 240+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 300+ x, 300+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 300+ x, 360+ y);
		ClimatMontagneux.eauProfondeGlacée(game, 300+ x, 420+ y);
		
		game.getBatch().draw(ClimatMontagneux.glace1, 360+ x, 0+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 360+ x, 60+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 360+ x, 120+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 360+ x, 180+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 360+ x, 240+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 360+ x, 300+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 360+ x, 360+ y);
		ClimatMontagneux.eauProfondeGlacée(game, 360+ x, 420+ y);
		
		game.getBatch().draw(ClimatMontagneux.glace1, 420+ x, 0+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 420+ x, 60+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 420+ x, 120+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 420+ x, 180+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 420+ x, 240+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 420+ x, 300+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 420+ x, 360+ y);
		ClimatMontagneux.eauProfondeGlacée(game, 420+ x, 420+ y);
		
		game.getBatch().draw(ClimatMontagneux.glace1, 480+ x, 0+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 480+ x, 60+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 480+ x, 120+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 480+ x, 180+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 480+ x, 240+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 480+ x, 300+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 480+ x, 360+ y);
		ClimatMontagneux.eauProfondeGlacée(game, 480+ x, 420+ y);

		game.getBatch().draw(ClimatMontagneux.glace1, 540+ x, 0+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 540+ x, 60+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 540+ x, 120+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 540+ x, 180+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 540+ x, 240+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 540+ x, 300+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 540+ x, 360+ y);
		ClimatMontagneux.eauProfondeGlacée(game, 540+ x, 420+ y);


//

		game.getBatch().draw(ClimatMontagneux.bordGlacéInf, 0+ x, 420+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéSupDroi, 60+ x, 420+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéSup, 480+ x, 360+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéSup, 540+ x, 360+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéSup, 120+ x, 360+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéSup, 180+ x, 360+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéSup, 240+ x, 360+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéSup, 300+ x, 360+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéSup, 360+ x, 360+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéSup, 420+ x, 360+ y);


		game.getBatch().draw(ClimatMontagneux.murSombreGlacéDroite, 0+ x, 360+ y);
		game.getBatch().draw(ClimatMontagneux.murSombreGlacéDroite3, 0+ x, 300+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéSupDroi, 0+ x, 240+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéInfDroi, 0+ x, 180+ y);
		game.getBatch().draw(ClimatMontagneux.murSombreGlacéGauche3, 0+ x, 120+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéSupGau, 0+ x, 60+ y);

		game.getBatch().draw(ClimatMontagneux.bordGlacéInfGau, 60+ x, 360+ y);
		game.getBatch().draw(ClimatMontagneux.murSombreGlacéDroite, 60+ x, 300+ y);
		game.getBatch().draw(ClimatMontagneux.murSombreGlacéDroite3, 60+ x, 240+ y);
		game.getBatch().draw(ClimatMontagneux.murSombreGlacéCentre, 60+ x, 180+ y);
		game.getBatch().draw(ClimatMontagneux.murSombreGlacéCentre, 60+ x, 120+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéSup, 60+ x, 60+ y);

		game.getBatch().draw(ClimatMontagneux.bordGlacéGau, 120+ x, 300+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéGau, 120+ x, 240+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéGau, 120+ x, 180+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéGau, 120+ x, 120+ y);


		game.getBatch().draw(ClimatMontagneux.tree, -40+ x, 0+ y);

        game.getBatch().draw(ClimatMontagneux.tree, 0+ x, 440+ y);
        game.getBatch().draw(ClimatMontagneux.tree, 60+ x, 440+ y);
        game.getBatch().draw(ClimatMontagneux.tree, 70+ x, 380+ y);



		game.getBatch().draw(DonjonGlace.murHorizontal, 512+ x, 350+ y);
		game.getBatch().draw(DonjonGlace.murHorizontal, 422+ x, 350+ y);
		game.getBatch().draw(DonjonGlace.murHorizontal, 332+ x, 350+ y);
		game.getBatch().draw(DonjonGlace.murHorizontal, 242+ x, 350+ y);
		game.getBatch().draw(DonjonGlace.murHorizontal, 152+ x, 350+ y);
		game.getBatch().draw(DonjonGlace.murVertical, 132+ x, 270+ y);
		game.getBatch().draw(DonjonGlace.murHorizontal, 64+ x, 70+ y);
		game.getBatch().draw(DonjonGlace.murVertical, 44+ x, -10+ y);
		game.getBatch().draw(DonjonGlace.murVertical, 44+ x, -170+ y);


        game.getBatch().draw(ClimatMontagneux.tree, 360+ x, 300+ y);
        game.getBatch().draw(ClimatMontagneux.tree, 300+ x, 300+ y);
        game.getBatch().draw(ClimatMontagneux.tree, 330+ x, 270+ y);
        game.getBatch().draw(ClimatMontagneux.tree, 420+ x, 300+ y);
        game.getBatch().draw(ClimatMontagneux.tree, 480+ x, 300+ y);
        game.getBatch().draw(ClimatMontagneux.tree, 540+ x, 300+ y);

		game.getBatch().draw(ClimatMontagneux.petitPont, 40+ x, 200+ y);

		if ( !(Totem.jeuRésolu) ) game.getBatch().draw(DonjonGlace.gate2Fermé, -60+ x, 185+ y);
		else if ( Totem.jeuRésolu && !(DonjonGlace.transitionGate )) game.getBatch().draw(DonjonGlace.gate2Ouvert2, -73+ x, 147+ y);


        game.getBatch().draw(ClimatMontagneux.tree, 70+ x, 30+ y);
        game.getBatch().draw(ClimatMontagneux.tree, 70+ x, -30+ y);

        game.getBatch().draw(ClimatMontagneux.bordGlacéSup, 360 + x, 240 + y);
        game.getBatch().draw(ClimatMontagneux.bordGlacéSupGau, 300 + x, 240 + y);
        game.getBatch().draw(ClimatMontagneux.bordGlacéGau, 300 + x, 180 + y);
        game.getBatch().draw(ClimatMontagneux.bordGlacéGau, 300 + x, 120 + y);
        game.getBatch().draw(ClimatMontagneux.bordGlacéGau, 300 + x, 60 + y);
        game.getBatch().draw(ClimatMontagneux.bordGlacéInfGau, 300 + x, 0 + y);
        game.getBatch().draw(ClimatMontagneux.bordGlacéInf, 360 + x, 0 + y);

        game.getBatch().draw(ClimatMontagneux.piedGlacéSup, 420 + x, 0 + y);
        game.getBatch().draw(ClimatMontagneux.murGlacéGauche, 420 + x, 60 + y);
        game.getBatch().draw(ClimatMontagneux.murGlacéGauche, 420 + x, 120 + y);
        game.getBatch().draw(ClimatMontagneux.bordGlacéInfGau, 420 + x, 180 + y);
        game.getBatch().draw(ClimatMontagneux.bordGlacéGau, 420 + x, 240 + y);
        game.getBatch().draw(ClimatMontagneux.bordGlacéSupGau, 420 + x, 300 + y);
        game.getBatch().draw(ClimatMontagneux.bordGlacéSup, 480 + x, 300 + y);
        game.getBatch().draw(ClimatMontagneux.bordGlacéSup, 540 + x, 300 + y);

        game.getBatch().draw(ClimatMontagneux.piedGlacéSup, 480 + x, 0 + y);
        game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 480 + x, 60 + y);
        game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 480 + x, 120 + y);
        game.getBatch().draw(ClimatMontagneux.bordGlacéInf, 480 + x, 180 + y);

        game.getBatch().draw(ClimatMontagneux.escalierBas, 430 + x, 290 + y);

        game.getBatch().draw(ClimatMontagneux.piedGlacéSup, 540 + x, 0 + y);
        game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 540 + x, 60 + y);
        game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 540 + x, 120 + y);
        game.getBatch().draw(ClimatMontagneux.bordGlacéInf, 540 + x, 180 + y);

        DonjonGlace.annimationFlag(game, 320 +x , 20 + y);
        DonjonGlace.annimationFlag(game, 320 +x , 280 + y);

//	plante

        game.getBatch().draw(ClimatMontagneux.planteGelé, 120+ x, 20+ y);
        game.getBatch().draw(ClimatMontagneux.planteGelé, 180+ x, 240+ y);

//		buissons


        ClimatMontagneux.buisson(isBuisson1Cut,game, 180+x, 300+y);
        ClimatMontagneux.buisson(isBuisson2Cut,game, 240+x, 240+y);
        ClimatMontagneux.buisson(isBuisson3Cut,game, 180+x, 180+y);
        ClimatMontagneux.buisson(isBuisson4Cut,game, 240+x, 120+y);
        ClimatMontagneux.buisson(isBuisson5Cut,game, 180+x, 60+y);

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
	}

	public static void createBodyAndType(World world) {
		// TODO Auto-generated method stub

        CadrillageMap.setTypeDeDécor(3,5,"HerbesHautes");
        CadrillageMap.setTypeDeDécor(4,4,"HerbesHautes");
        CadrillageMap.setTypeDeDécor(3,3,"HerbesHautes");
        CadrillageMap.setTypeDeDécor(4,2,"HerbesHautes");
        CadrillageMap.setTypeDeDécor(3,1,"HerbesHautes");
        if ( CadrillageMap.décorChangé[3][5] == true ) isBuisson1Cut = true;
        if ( CadrillageMap.décorChangé[4][4] == true ) isBuisson2Cut = true;
        if ( CadrillageMap.décorChangé[3][3] == true ) isBuisson3Cut = true;
        if ( CadrillageMap.décorChangé[4][2] == true ) isBuisson4Cut = true;
        if ( CadrillageMap.décorChangé[3][1] == true ) isBuisson5Cut = true;


        if ( isCote1Created == false ) {
            cote1 = ClimatMontagneux.createBody(60,330,160,120);
            isCote1Created = true;
        }
        if ( isCote2Created == false ) {
            cote2 = ClimatMontagneux.createBody(360,350,480,1);
            isCote2Created = true;
        }
        if ( isCote3Created == false ) {
            cote3 = ClimatMontagneux.createBody(335,180,130,360);
            isCote3Created = true;
        }
        if ( isCote4Created == false ) {
            cote4 = ClimatMontagneux.createBody(60,90,160,240);
            isCote4Created = true;
        }
        if ( isCote5Created == false ) {
            cote5 = ClimatMontagneux.createBody(490,150,180,60);
            isCote5Created = true;
        }
	}

	public static void destroyType() {
		// TODO Auto-generated method stub

        isBuisson1Cut = false;
        isBuisson2Cut = false;
        isBuisson3Cut = false;
        isBuisson4Cut = false;
        isBuisson5Cut = false;
	}
}
