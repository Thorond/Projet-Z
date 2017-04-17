package map.zoneGlace;

import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.physics.box2d.Body;
import com.badlogic.gdx.physics.box2d.World;
import com.mygdx.game.GameMain;

import characters.Dompteuse;
import decors.ClimatMontagneux;
import map.CadrillageMap;
import scenes.MainMenu;

public class SousMapG6 extends Sprite{

	public static Body mur1;
	public static boolean ismur1Created;

	public static Body mur2;
	public static boolean ismur2Created;



    public static boolean isBuisson1Cut = false;
    public static boolean isBuisson2Cut = false;
    public static boolean isBuisson3Cut = false;
    public static boolean isBuisson4Cut = false;
    public static boolean isBuisson5Cut = false;
    public static boolean isBuisson6Cut = false;
    public static boolean isBuisson7Cut = false;
    public static boolean isBuisson8Cut = false;
    public static boolean isBuisson9Cut = false;
    public static boolean isBuisson10Cut = false;

    public static boolean isBuisson11Cut = false;
    public static boolean isBuisson12Cut = false;
    public static boolean isBuisson13Cut = false;
    public static boolean isBuisson14Cut = false;
    public static boolean isBuisson15Cut = false;
    public static boolean isBuisson16Cut = false;
    public static boolean isBuisson17Cut = false;
    public static boolean isBuisson18Cut = false;


    public static boolean isArbuste1Cut = false;
    public static boolean isArbuste2Cut = false;
    public static boolean isArbuste3Cut = false;
    public static boolean isArbuste4Cut = false;
    public static boolean isArbuste5Cut = false;
    public static boolean isArbuste6Cut = false;
    public static boolean isArbuste7Cut = false;

    public static Body arbuste1;
    public static boolean isarbuste1Created;
    public static Body arbuste2;
    public static boolean isarbuste2Created;
    public static Body arbuste3;
    public static boolean isarbuste3Created;
    public static Body arbuste4;
    public static boolean isarbuste4Created;
    public static Body arbuste5;
    public static boolean isarbuste5Created;
    public static Body arbuste6;
    public static boolean isarbuste6Created;
    public static Body arbuste7;
    public static boolean isarbuste7Created;
	
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
		game.getBatch().draw(ClimatMontagneux.piedGlacéSup, 0+ x, 360+ y);
		game.getBatch().draw(ClimatMontagneux.piedGlacéSup, 60+ x, 360+ y);
		game.getBatch().draw(ClimatMontagneux.piedGlacéSup, 120+ x, 360+ y);
		game.getBatch().draw(ClimatMontagneux.piedGlacéSup, 180+ x, 360+ y);
		game.getBatch().draw(ClimatMontagneux.piedGlacéSup, 240+ x, 360+ y);
		game.getBatch().draw(ClimatMontagneux.piedGlacéSup, 300+ x, 360+ y);
		game.getBatch().draw(ClimatMontagneux.piedGlacéSup, 360+ x, 360+ y);
		game.getBatch().draw(ClimatMontagneux.piedGlacéSup, 420+ x, 360+ y);
		game.getBatch().draw(ClimatMontagneux.piedGlacéSup, 480+ x, 360+ y);
		game.getBatch().draw(ClimatMontagneux.piedGlacéSup, 540+ x, 360+ y);

 		game.getBatch().draw(ClimatMontagneux.bordGlacéInf, 0+ x, 180+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéInf, 60+ x, 180+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéInf, 120+ x, 180+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéInf, 180+ x, 180+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéInf, 240+ x, 180+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéInf, 300+ x, 180+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéInf, 360+ x, 180+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéInf, 420+ x, 180+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéInf, 480+ x, 180+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéInf, 540+ x, 180+ y);
		game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 0+ x, 120+ y);
		game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 0+ x, 60+ y);
		game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 540+ x, 120+ y);
		game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 540+ x, 60+ y);
		game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 480+ x, 120+ y);
		game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 480+ x, 60+ y);
		game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 420+ x, 120+ y);
		game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 420+ x, 60+ y);
		game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 360+ x, 120+ y);
		game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 360+ x, 60+ y);
		game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 300+ x, 120+ y);
		game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 300+ x, 60+ y);
		game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 240+ x, 120+ y);
		game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 240+ x, 60+ y);
		game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 180+ x, 120+ y);
		game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 180+ x, 60+ y);
		game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 120+ x, 120+ y);
		game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 120+ x, 60+ y);
		game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 60+ x, 120+ y);
		game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 60+ x, 60+ y);
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
//
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

//

        game.getBatch().draw(ClimatMontagneux.herbeGlace120, 0+ x, 240+ y);
        game.getBatch().draw(ClimatMontagneux.herbeGlace120, 30+ x, 300+ y);
        game.getBatch().draw(ClimatMontagneux.herbeGlace120, 60+ x, 300+ y);
        game.getBatch().draw(ClimatMontagneux.herbeGlace120, 90+ x, 240+ y);


        game.getBatch().draw(ClimatMontagneux.herbeGlace120, 240+ x, 200+ y);
        game.getBatch().draw(ClimatMontagneux.herbeGlace120, 270+ x, 230+ y);
        game.getBatch().draw(ClimatMontagneux.herbeGlace120, 330+ x, 290+ y);
        game.getBatch().draw(ClimatMontagneux.herbeGlace120, 390+ x, 290+ y);
        game.getBatch().draw(ClimatMontagneux.herbeGlace120, 450+ x, 230+ y);


//		buissons


        game.getBatch().draw(ClimatMontagneux.planteGelé, 0+ x, 360+ y);
        game.getBatch().draw(ClimatMontagneux.planteGelé3, 120+ x, 360+ y);
        game.getBatch().draw(ClimatMontagneux.planteGelé3, 0+ x, 180+ y);

        game.getBatch().draw(ClimatMontagneux.planteGelé3, 180+ x,180+ y);
        game.getBatch().draw(ClimatMontagneux.planteGelé3, 240+ x, 300+ y);
        game.getBatch().draw(ClimatMontagneux.planteGelé, 240+ x, 360+ y);

        game.getBatch().draw(ClimatMontagneux.planteGelé, 300+ x, 240+ y);
        game.getBatch().draw(ClimatMontagneux.planteGelé, 420+ x, 300+ y);
        game.getBatch().draw(ClimatMontagneux.planteGelé, 540+ x, 360+ y);


        ClimatMontagneux.buisson(isBuisson1Cut,game, 60+x, 360+y);
        ClimatMontagneux.buisson(isBuisson2Cut,game, 60+x, 180+y);
        ClimatMontagneux.buisson(isBuisson3Cut,game, 60+x, 240+y);
        ClimatMontagneux.buisson(isBuisson4Cut,game, 120+x, 300+y);
        ClimatMontagneux.buisson(isBuisson5Cut,game, 120+x, 180+y);
        ClimatMontagneux.buisson(isBuisson6Cut,game, 180+x, 300+y);
        ClimatMontagneux.buisson(isBuisson7Cut,game, 240+x, 180+y);
        ClimatMontagneux.buisson(isBuisson8Cut,game, 240+x, 240+y);
        ClimatMontagneux.buisson(isBuisson9Cut,game, 300+x, 360+y);
        ClimatMontagneux.buisson(isBuisson10Cut,game, 300+x, 300+y);

        ClimatMontagneux.buisson(isBuisson11Cut,game, 0+x, 300+y);
        ClimatMontagneux.buisson(isBuisson12Cut,game, 360+x, 240+y);
        ClimatMontagneux.buisson(isBuisson13Cut,game, 360+x,300+y);
        ClimatMontagneux.buisson(isBuisson14Cut,game, 420+x, 360+y);
        ClimatMontagneux.buisson(isBuisson15Cut,game, 480+x, 180+y);
        ClimatMontagneux.buisson(isBuisson16Cut,game, 480+x, 300+y);
        ClimatMontagneux.buisson(isBuisson17Cut,game, 540+x, 180+y);
        ClimatMontagneux.buisson(isBuisson18Cut,game, 540+x, 240+y);


        ClimatMontagneux.arbuste(isArbuste1Cut, game, 60+x,300+ y);
        ClimatMontagneux.arbuste(isArbuste2Cut, game, 120+x,240+ y);
        ClimatMontagneux.arbuste(isArbuste3Cut, game, 180+x,360+ y);
        ClimatMontagneux.arbuste(isArbuste4Cut, game, 300+x,300+ y);
        ClimatMontagneux.arbuste(isArbuste5Cut, game, 360+x,180+ y);
        ClimatMontagneux.arbuste(isArbuste6Cut, game, 420+x,240+ y);
        ClimatMontagneux.arbuste(isArbuste7Cut, game, 480+x,360+ y);

//         dompteuse

        Dompteuse.affichageDompteuse(game, 300+x,240+y);
        Dompteuse.détectionDompteuse(MainMenu.Link );

	}

	public static void destroyBody() {
		// TODO Auto-generated method stub
		if ( ismur1Created) MainMenu.world.destroyBody(mur1);
		ismur1Created = false;

		if ( ismur2Created) MainMenu.world.destroyBody(mur2);
		ismur2Created = false;


        if ( isarbuste1Created) MainMenu.world.destroyBody(arbuste1);
        isarbuste1Created = false;

        if ( isarbuste2Created) MainMenu.world.destroyBody(arbuste2);
        isarbuste2Created = false;

        if ( isarbuste3Created) MainMenu.world.destroyBody(arbuste3);
        isarbuste3Created = false;

        if ( isarbuste4Created) MainMenu.world.destroyBody(arbuste4);
        isarbuste4Created = false;

        if ( isarbuste5Created) MainMenu.world.destroyBody(arbuste5);
        isarbuste5Created = false;

        if ( isarbuste6Created) MainMenu.world.destroyBody(arbuste6);
        isarbuste6Created = false;

        if ( isarbuste7Created) MainMenu.world.destroyBody(arbuste7);
        isarbuste7Created = false;
	}

	public static void createBodyAndType(World world) {
		// TODO Auto-generated method stub
		if ( ismur1Created == false ) {
			mur1 = ClimatMontagneux.createBody(300,180,600,1);
			ismur1Created = true;
		}

		if ( ismur2Created == false ) {
			mur2 = ClimatMontagneux.createBody(300,450,600,60);
			ismur2Created = true;
		}


        CadrillageMap.setTypeDeDécor(1,6,"HerbesHautes");
        CadrillageMap.setTypeDeDécor(1,3,"HerbesHautes");
        CadrillageMap.setTypeDeDécor(1,4,"HerbesHautes");
        CadrillageMap.setTypeDeDécor(2,5,"HerbesHautes");
        CadrillageMap.setTypeDeDécor(2,3,"HerbesHautes");
        CadrillageMap.setTypeDeDécor(3,5,"HerbesHautes");
        CadrillageMap.setTypeDeDécor(4,3,"HerbesHautes");
        CadrillageMap.setTypeDeDécor(4,4,"HerbesHautes");
        CadrillageMap.setTypeDeDécor(5,6,"HerbesHautes");
        CadrillageMap.setTypeDeDécor(5,5,"HerbesHautes");
        if ( CadrillageMap.décorChangé[1][6] == true ) isBuisson1Cut = true;
        if ( CadrillageMap.décorChangé[1][3] == true ) isBuisson2Cut = true;
        if ( CadrillageMap.décorChangé[1][4] == true ) isBuisson3Cut = true;
        if ( CadrillageMap.décorChangé[2][5] == true ) isBuisson4Cut = true;
        if ( CadrillageMap.décorChangé[2][3] == true ) isBuisson5Cut = true;
        if ( CadrillageMap.décorChangé[3][5] == true ) isBuisson6Cut = true;
        if ( CadrillageMap.décorChangé[4][3] == true ) isBuisson7Cut = true;
        if ( CadrillageMap.décorChangé[4][4] == true ) isBuisson8Cut = true;
        if ( CadrillageMap.décorChangé[5][6] == true ) isBuisson9Cut = true;
        if ( CadrillageMap.décorChangé[5][5] == true ) isBuisson10Cut = true;
        CadrillageMap.setTypeDeDécor(0,5,"HerbesHautes");
        CadrillageMap.setTypeDeDécor(6,4,"HerbesHautes");
        CadrillageMap.setTypeDeDécor(6,5,"HerbesHautes");
        CadrillageMap.setTypeDeDécor(7,6,"HerbesHautes");
        CadrillageMap.setTypeDeDécor(8,3,"HerbesHautes");
        CadrillageMap.setTypeDeDécor(8,5,"HerbesHautes");
        CadrillageMap.setTypeDeDécor(9,3,"HerbesHautes");
        CadrillageMap.setTypeDeDécor(9,4,"HerbesHautes");
        if ( CadrillageMap.décorChangé[0][5] == true ) isBuisson11Cut = true;
        if ( CadrillageMap.décorChangé[6][4] == true ) isBuisson12Cut = true;
        if ( CadrillageMap.décorChangé[6][5] == true ) isBuisson13Cut = true;
        if ( CadrillageMap.décorChangé[7][6] == true ) isBuisson14Cut = true;
        if ( CadrillageMap.décorChangé[8][3] == true ) isBuisson15Cut = true;
        if ( CadrillageMap.décorChangé[8][5] == true ) isBuisson16Cut = true;
        if ( CadrillageMap.décorChangé[9][3] == true ) isBuisson17Cut = true;
        if ( CadrillageMap.décorChangé[9][4] == true ) isBuisson18Cut = true;



        CadrillageMap.setTypeDeDécor(1,5,"HerbesHautes");
        CadrillageMap.setTypeDeDécor(2,4,"HerbesHautes");
        CadrillageMap.setTypeDeDécor(3,6,"HerbesHautes");
        CadrillageMap.setTypeDeDécor(5,5,"HerbesHautes");
        CadrillageMap.setTypeDeDécor(6,3,"HerbesHautes");
        CadrillageMap.setTypeDeDécor(7,4,"HerbesHautes");
        CadrillageMap.setTypeDeDécor(8,6,"HerbesHautes");
        if ( CadrillageMap.décorChangé[1][5] == true ) isArbuste1Cut = true;
        if ( CadrillageMap.décorChangé[2][4] == true ) isArbuste2Cut = true;
        if ( CadrillageMap.décorChangé[3][6] == true ) isArbuste3Cut = true;
        if ( CadrillageMap.décorChangé[5][5] == true ) isArbuste4Cut = true;
        if ( CadrillageMap.décorChangé[6][3] == true ) isArbuste5Cut = true;
        if ( CadrillageMap.décorChangé[7][4] == true ) isArbuste6Cut = true;
        if ( CadrillageMap.décorChangé[8][6] == true ) isArbuste7Cut = true;

        if ( isarbuste1Created == false ) {
            arbuste1 = ClimatMontagneux.createBodyPerso("tonneau", "static",60,300);
            isarbuste1Created = true;
        }
        if ( isarbuste2Created == false ) {
            arbuste2 = ClimatMontagneux.createBodyPerso("tonneau", "static",120,240);
            isarbuste2Created = true;
        }
        if ( isarbuste3Created == false ) {
            arbuste3 = ClimatMontagneux.createBodyPerso("tonneau", "static",180,360);
            isarbuste3Created = true;
        }
        if ( isarbuste4Created == false ) {
            arbuste4 = ClimatMontagneux.createBodyPerso("tonneau", "static",300,300);
            isarbuste4Created = true;
        }
        if ( isarbuste5Created == false ) {
            arbuste5 = ClimatMontagneux.createBodyPerso("tonneau", "static",360,180);
            isarbuste5Created = true;
        }
        if ( isarbuste6Created == false ) {
            arbuste6 = ClimatMontagneux.createBodyPerso("tonneau", "static",420,240);
            isarbuste6Created = true;
        }
        if ( isarbuste7Created == false ) {
            arbuste7 = ClimatMontagneux.createBodyPerso("tonneau", "static",480,360);
            isarbuste7Created = true;
        }
	}

	public static void destroyType() {
		// TODO Auto-generated method stub

        isBuisson1Cut = false;
        isBuisson2Cut = false;
        isBuisson3Cut = false;
        isBuisson4Cut = false;
        isBuisson5Cut = false;
        isBuisson6Cut = false;
        isBuisson7Cut = false;
        isBuisson8Cut = false;
        isBuisson9Cut = false;
        isBuisson10Cut = false;
        isBuisson11Cut = false;
        isBuisson12Cut = false;
        isBuisson13Cut = false;
        isBuisson14Cut = false;
        isBuisson15Cut = false;
        isBuisson16Cut = false;
        isBuisson17Cut = false;
        isBuisson18Cut = false;


        isArbuste1Cut = false;
        isArbuste2Cut = false;
        isArbuste3Cut = false;
        isArbuste4Cut = false;
        isArbuste5Cut = false;
        isArbuste6Cut = false;
        isArbuste7Cut = false;
	}
}
