package map.zoneGlace;

import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.physics.box2d.Body;
import com.badlogic.gdx.physics.box2d.World;
import com.mygdx.game.GameMain;

import decors.ClimatMontagneux;
import map.CadrillageMap;
import scenes.MainMenu;

public class SousMapF6 extends Sprite{

	public static Body mur1;
	public static boolean ismur1Created;

	public static Body bordPont1 ;
	public static boolean isbordPont1Created;
	public static Body bordPont2 ;
	public static boolean isbordPont2Created;

	public static Body cote1 ;
	public static boolean isCote1Created;
	public static Body cote2 ;
	public static boolean isCote2Created;


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
	
	public static void sousMap(GameMain game, int x, int y){
		
		ClimatMontagneux.eauProfondeGlacée(game,0+ x, 0+y);
		game.getBatch().draw(ClimatMontagneux.glace1, 0+ x, 60+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 0+ x, 120+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 0+ x, 180+ y);		
		game.getBatch().draw(ClimatMontagneux.glace1, 0+ x,240 + y);
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
		game.getBatch().draw(ClimatMontagneux.bordGlacéInf, 0+ x, 180+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéInf, 60+ x, 180+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéInf, 120+ x, 180+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéInf, 480+ x, 180+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéInf, 540+ x, 180+ y);
		game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 0+ x, 120+ y);
		game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 60+ x, 120+ y);
		game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 120+ x, 120+ y);
		game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 180+ x, 120+ y);
		game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 240+ x, 120+ y);
		game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 300+ x, 120+ y);
		game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 360+ x, 120+ y);
		game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 420+ x, 120+ y);
		game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 480+ x, 120+ y);
		game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 540+ x, 120+ y);
		game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 0+ x, 60+ y);
		game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 60+ x, 60+ y);
		game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 120+ x, 60+ y);
		game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 180+ x, 60+ y);
		game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 240+ x, 60+ y);
		game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 300+ x, 60+ y);
		game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 360+ x, 60+ y);
		game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 420+ x, 60+ y);
		game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 480+ x, 60+ y);
		game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 540+ x, 60+ y);
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
		

		game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 0+ x, 420+ y);
		game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 60+ x, 420+ y);
		game.getBatch().draw(ClimatMontagneux.cheminGlace, 120+ x, 420+ y);
		game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 180+ x, 420+ y);
		game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 240+ x, 420+ y);
		game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 300+ x, 420+ y);
		game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 360+ x, 420+ y);
		game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 420+ x, 420+ y);
		game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 480+ x, 420+ y);
		game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 540+ x, 420+ y);
		
		game.getBatch().draw(ClimatMontagneux.piedGlacéSup, 0+ x, 360+ y);
		game.getBatch().draw(ClimatMontagneux.piedGlacéSup, 60+ x, 360+ y);
		game.getBatch().draw(ClimatMontagneux.piedGlacéSup, 480+ x, 360+ y);
		game.getBatch().draw(ClimatMontagneux.piedGlacéSup, 540+ x, 360+ y);
		
		
		game.getBatch().draw(ClimatMontagneux.bordGlacéSupGau, 420+ x, 360+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéGau, 420+ x, 300+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéGau, 420+ x, 240+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéInfGau, 420+ x, 180+ y);
		
		ClimatMontagneux.eauProfonde150(game,360+x,360+y);
		ClimatMontagneux.eauProfonde300(game,360+x,300+y);
		ClimatMontagneux.eauProfonde300(game,360+x,240+y);
		ClimatMontagneux.eauProfonde150(game,360+x,180+y);

		ClimatMontagneux.eauProfonde150(game,300+x,360+y);
		ClimatMontagneux.eauProfonde300(game,300+x,300+y);
		ClimatMontagneux.eauProfonde300(game,300+x,240+y);
		ClimatMontagneux.eauProfonde150(game,300+x,180+y);
		
		ClimatMontagneux.eauProfonde300(game,240+x,360+y);
		ClimatMontagneux.eauProfonde300(game,240+x,300+y);
		ClimatMontagneux.eauProfonde300(game,240+x,240+y);
		ClimatMontagneux.eauProfonde150(game,240+x,180+y);
		
		game.getBatch().draw(ClimatMontagneux.bordGlacéSupDroi, 180+ x, 360+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéDroi, 180+ x, 300+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéDroi, 180+ x, 240+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéInfDroi, 180+ x, 180+ y);


//
        game.getBatch().draw(ClimatMontagneux.planteGelé, 0+ x, 350+ y);
        game.getBatch().draw(ClimatMontagneux.planteGelé3, 90+ x, 350+ y);
        game.getBatch().draw(ClimatMontagneux.planteGelé, 60+ x, 280+ y);
        game.getBatch().draw(ClimatMontagneux.planteGelé, 120+ x, 240+ y);



        game.getBatch().draw(ClimatMontagneux.tree, 180+ x, 380+ y);
        game.getBatch().draw(ClimatMontagneux.tree, 180+ x, 320+ y);


//		buissons


        ClimatMontagneux.buisson(isBuisson1Cut,game, 420+x, 300+y);
        ClimatMontagneux.buisson(isBuisson2Cut,game, 480+x, 300+y);
        ClimatMontagneux.buisson(isBuisson3Cut,game, 540+x, 300+y);
        ClimatMontagneux.buisson(isBuisson4Cut,game, 420+x, 360+y);
        ClimatMontagneux.buisson(isBuisson5Cut,game, 480+x, 360+y);
        ClimatMontagneux.buisson(isBuisson6Cut,game, 540+x, 360+y);
        ClimatMontagneux.buisson(isBuisson7Cut,game, 480+x, 240+y);
        ClimatMontagneux.buisson(isBuisson8Cut,game, 480+x, 180+y);
        ClimatMontagneux.buisson(isBuisson9Cut,game, 540+x, 240+y);
        ClimatMontagneux.buisson(isBuisson10Cut,game, 540+x, 180+y);

		ClimatMontagneux.placerGrandPont(game, 190+x, 200+y);

		ClimatMontagneux.annimationCascadePetite(game, 290+x, 400 + y);
		ClimatMontagneux.annimationCascadeMoy(game, 210 + x, 35 + y);

//

        game.getBatch().draw(ClimatMontagneux.tree, -50+ x, 290+ y);
        game.getBatch().draw(ClimatMontagneux.tree, -50+ x, 250+ y);
        game.getBatch().draw(ClimatMontagneux.tree, -50+ x, 210+ y);

        game.getBatch().draw(ClimatMontagneux.tree, 10+ x, 290+ y);
        game.getBatch().draw(ClimatMontagneux.tree, 10+ x, 250+ y);
        game.getBatch().draw(ClimatMontagneux.tree, 10+ x, 210+ y);


        game.getBatch().draw(ClimatMontagneux.tree, 70+ x, 210+ y);


	}

	public static void destroyBody() {
		// TODO Auto-generated method stub
		if ( ismur1Created) MainMenu.world.destroyBody(mur1);
		ismur1Created = false;

		if ( isbordPont1Created) MainMenu.world.destroyBody(bordPont1);
		isbordPont1Created = false;

		if ( isbordPont2Created) MainMenu.world.destroyBody(bordPont2);
		isbordPont2Created = false;

		if ( isCote1Created) MainMenu.world.destroyBody(cote1);
		isCote1Created = false;

		if ( isCote2Created) MainMenu.world.destroyBody(cote2);
		isCote2Created = false;
	}

	public static void createBodyAndType(World world) {
		// TODO Auto-generated method stub


		if ( ismur1Created == false ) {
			mur1 = ClimatMontagneux.createBody(300,180,600,1);
			ismur1Created = true;
		}

		if ( isbordPont1Created == false ) {
			bordPont1 = ClimatMontagneux.createBody(330,220,270,1);
			isbordPont1Created = true;
		}
		if ( isbordPont2Created == false ) {
			bordPont2 = ClimatMontagneux.createBody(330,300,270,1);
			isbordPont2Created = true;
		}
		if ( isCote1Created == false ) {
			cote1 = ClimatMontagneux.createBody(50,450,100,60);
			isCote1Created = true;
		}
		if ( isCote2Created == false ) {
			cote2 = ClimatMontagneux.createBody(380,450,420,60);
			isCote2Created = true;
		}


        CadrillageMap.setTypeDeDécor(7,5,"HerbesHautes");
        CadrillageMap.setTypeDeDécor(8,5,"HerbesHautes");
        CadrillageMap.setTypeDeDécor(9,5,"HerbesHautes");
        CadrillageMap.setTypeDeDécor(7,6,"HerbesHautes");
        CadrillageMap.setTypeDeDécor(8,6,"HerbesHautes");
        CadrillageMap.setTypeDeDécor(9,6,"HerbesHautes");
        if ( CadrillageMap.décorChangé[7][5] == true ) isBuisson1Cut = true;
        if ( CadrillageMap.décorChangé[8][5] == true ) isBuisson2Cut = true;
        if ( CadrillageMap.décorChangé[9][5] == true ) isBuisson3Cut = true;
        if ( CadrillageMap.décorChangé[7][6] == true ) isBuisson4Cut = true;
        if ( CadrillageMap.décorChangé[8][6] == true ) isBuisson5Cut = true;
        if ( CadrillageMap.décorChangé[9][6] == true ) isBuisson6Cut = true;
        CadrillageMap.setTypeDeDécor(8,4,"HerbesHautes");
        CadrillageMap.setTypeDeDécor(8,3,"HerbesHautes");
        CadrillageMap.setTypeDeDécor(9,4,"HerbesHautes");
        CadrillageMap.setTypeDeDécor(9,3,"HerbesHautes");
        if ( CadrillageMap.décorChangé[8][4] == true ) isBuisson7Cut = true;
        if ( CadrillageMap.décorChangé[8][3] == true ) isBuisson8Cut = true;
        if ( CadrillageMap.décorChangé[9][4] == true ) isBuisson9Cut = true;
        if ( CadrillageMap.décorChangé[9][3] == true ) isBuisson10Cut = true;
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
	}
}
