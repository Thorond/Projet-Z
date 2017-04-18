package map.zoneGlace;

import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.physics.box2d.World;
import com.mygdx.game.GameMain;

import decors.ClimatMontagneux;
import map.CadrillageMap;

public class SousMapH6 extends Sprite{


    public static boolean isBuisson1Cut = false;
    public static boolean isBuisson2Cut = false;
    public static boolean isBuisson3Cut = false;
    public static boolean isBuisson4Cut = false;
    public static boolean isBuisson5Cut = false;
	
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
		ClimatMontagneux.eauProfondeGlacée(game, 120+ x, 60+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 120+ x, 120+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 120+ x, 180+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 120+ x, 240+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 120+ x, 300+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 120+ x, 360+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 120+ x, 420+ y);

		ClimatMontagneux.eauProfondeGlacée(game,180+ x, 0+y);
		ClimatMontagneux.eauProfondeGlacée(game, 180+ x, 60+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 180+ x, 120+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 180+ x, 180+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 180+ x, 240+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 180+ x, 300+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 180+ x, 360+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 180+ x, 420+ y);

		ClimatMontagneux.eauProfondeGlacée(game,240+ x, 0+y);
		ClimatMontagneux.eauProfondeGlacée(game, 240+ x, 60+ y);
		ClimatMontagneux.eauProfondeGlacée(game, 240+ x, 120+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 240+ x, 180+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 240+ x, 240+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 240+ x, 300+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 240+ x, 360+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 240+ x, 420+ y);

		ClimatMontagneux.eauProfondeGlacée(game,300+ x, 0+y);
		ClimatMontagneux.eauProfondeGlacée(game, 300+ x, 60+ y);
		ClimatMontagneux.eauProfondeGlacée(game, 300+ x, 120+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 300+ x, 180+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 300+ x, 240+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 300+ x, 300+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 300+ x, 360+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 300+ x, 420+ y);

		ClimatMontagneux.eauProfondeGlacée(game,360+ x, 0+y);
		ClimatMontagneux.eauProfondeGlacée(game, 360+ x, 60+ y);
		ClimatMontagneux.eauProfondeGlacée(game, 360+ x, 120+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 360+ x, 180+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 360+ x, 240+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 360+ x, 300+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 360+ x, 360+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 360+ x, 420+ y);

		ClimatMontagneux.eauProfondeGlacée(game,420+ x, 0+y);
		ClimatMontagneux.eauProfondeGlacée(game, 420+ x, 60+ y);
		ClimatMontagneux.eauProfondeGlacée(game, 420+ x, 120+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 420+ x, 180+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 420+ x, 240+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 420+ x, 300+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 420+ x, 360+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 420+ x, 420+ y);

		ClimatMontagneux.eauProfondeGlacée(game,480+ x, 0+y);
		ClimatMontagneux.eauProfondeGlacée(game, 480+ x, 60+ y);
		ClimatMontagneux.eauProfondeGlacée(game, 480+ x, 120+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 480+ x, 180+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 480+ x, 240+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 480+ x, 300+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 480+ x, 360+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 480+ x, 420+ y);

		ClimatMontagneux.eauProfondeGlacée(game,540+ x, 0+y);
		ClimatMontagneux.eauProfondeGlacée(game, 540+ x, 60+ y);
		ClimatMontagneux.eauProfondeGlacée(game, 540+ x, 120+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 540+ x, 180+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 540+ x, 240+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 540+ x, 300+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 540+ x, 360+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 540+ x, 420+ y);
//
		game.getBatch().draw(ClimatMontagneux.murGlacéDroite, 0+ x, 420+ y);
		game.getBatch().draw(ClimatMontagneux.piedCassé1Sup, 0+ x, 360+ y);
		game.getBatch().draw(ClimatMontagneux.piedCassé1Sup, 60+ x, 420+ y);
		game.getBatch().draw(ClimatMontagneux.piedCassé1Sup, 120+ x, 420+ y);
		game.getBatch().draw(ClimatMontagneux.piedCassé1Sup, 180+ x, 420+ y);
		game.getBatch().draw(ClimatMontagneux.piedCassé1Sup, 240+ x, 420+ y);

		game.getBatch().draw(ClimatMontagneux.bordGlacéInf, 0+ x, 180+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéInfDroi, 60+ x, 180+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéInf, 120+ x, 240+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéInfDroi, 180+ x, 240+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéInf, 240+ x, 300+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéInfDroi, 300+ x, 300+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéInf, 360+ x, 360+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéInfDroi, 420+ x, 360+ y);
		game.getBatch().draw(ClimatMontagneux.escalierHaut, 480+ x, 420+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéInfDroi, 540+ x, 420+ y);
		game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 0+ x, 120+ y);
		game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 60+ x, 120+ y);
		game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 120+ x, 180+ y);
		game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 180+ x, 180+ y);
		game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 240+ x, 240+ y);
		game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 300+ x, 240+ y);
		game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 360+ x, 300+ y);
		game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 420+ x, 300+ y);
		game.getBatch().draw(ClimatMontagneux.cheminGlace, 480+ x, 360+ y);
		game.getBatch().draw(ClimatMontagneux.murGlacéDroite, 540+ x, 360+ y);
		game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 0+ x, 60+ y);
		game.getBatch().draw(ClimatMontagneux.murGlacéDroite, 60+ x, 60+ y);
		game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 120+ x, 120+ y);
		game.getBatch().draw(ClimatMontagneux.murGlacéDroite, 180+ x, 120+ y);
		game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 240+ x, 180+ y);
		game.getBatch().draw(ClimatMontagneux.murGlacéDroite, 300+ x, 180+ y);
		game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 360+ x, 240+ y);
		game.getBatch().draw(ClimatMontagneux.murGlacéDroite, 420+ x, 240+ y);
		game.getBatch().draw(ClimatMontagneux.cheminGlace, 480+ x, 300+ y);
		game.getBatch().draw(ClimatMontagneux.murGlacéDroite, 540+ x, 300+ y);
		game.getBatch().draw(ClimatMontagneux.piedGlacéSup, 540+ x, 240+ y);
		game.getBatch().draw(ClimatMontagneux.murBasMer, 0+ x, 0+ y);
		game.getBatch().draw(ClimatMontagneux.murBasMer, 60+ x, 0+ y);
		game.getBatch().draw(ClimatMontagneux.murBasMer, 120+ x, 60+ y);
		game.getBatch().draw(ClimatMontagneux.murBasMer, 180+ x, 60+ y);
		game.getBatch().draw(ClimatMontagneux.murBasMer, 240+ x, 120+ y);
		game.getBatch().draw(ClimatMontagneux.murBasMer, 300+ x, 120+ y);
		game.getBatch().draw(ClimatMontagneux.murBasMer, 360+ x, 120+ y);
		game.getBatch().draw(ClimatMontagneux.murBasMer, 420+ x, 120+ y);
		game.getBatch().draw(ClimatMontagneux.murBasMer, 480+ x, 120+ y);
		game.getBatch().draw(ClimatMontagneux.murBasMer, 540+ x, 120+ y);


		game.getBatch().draw(ClimatMontagneux.bordGlacéInfGau, 360+ x, 180+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéInf, 420+ x, 180+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéInf, 480+ x, 180+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéInf, 540+ x, 180+ y);

//

        game.getBatch().draw(ClimatMontagneux.herbeGlace120, 0+ x, 240+ y);
        game.getBatch().draw(ClimatMontagneux.herbeGlace120, 60+ x, 300+ y);

		game.getBatch().draw(ClimatMontagneux.tree, 60+ x, 420+ y);
        game.getBatch().draw(ClimatMontagneux.tree, 120+ x, 420+ y);
        game.getBatch().draw(ClimatMontagneux.tree, 180+ x, 420+ y);
        game.getBatch().draw(ClimatMontagneux.tree, 240+ x, 420+ y);


        ClimatMontagneux.buisson(isBuisson1Cut,game, 120+x, 250+y);
        ClimatMontagneux.buisson(isBuisson2Cut,game, 300+x, 310+y);
        ClimatMontagneux.buisson(isBuisson3Cut,game, 240+x, 310+y);
        ClimatMontagneux.buisson(isBuisson4Cut,game, 360+x, 190+y);
        ClimatMontagneux.buisson(isBuisson5Cut,game, 420+x, 190+y);

        game.getBatch().draw(ClimatMontagneux.planteGelé, 0+ x, 360+ y);
        game.getBatch().draw(ClimatMontagneux.planteGelé3, 120+ x, 360+ y);
        game.getBatch().draw(ClimatMontagneux.planteGelé3, 0+ x, 180+ y);

        game.getBatch().draw(ClimatMontagneux.planteGelé3, 60+ x,240+ y);
        game.getBatch().draw(ClimatMontagneux.planteGelé3, 180+ x, 300+ y);
        game.getBatch().draw(ClimatMontagneux.planteGelé, 240+ x, 360+ y);

        game.getBatch().draw(ClimatMontagneux.planteGelé, 420+ x, 380+ y);
        game.getBatch().draw(ClimatMontagneux.planteGelé, 540+ x, 240+ y);
	}

	public static void destroyBody() {
		// TODO Auto-generated method stub
		
	}

	public static void createBodyAndType(World world) {
		// TODO Auto-generated method stub

        CadrillageMap.setTypeDeDécor(2,4,"HerbesHautes");
        CadrillageMap.setTypeDeDécor(5,5,"HerbesHautes");
        CadrillageMap.setTypeDeDécor(4,5,"HerbesHautes");
        CadrillageMap.setTypeDeDécor(6,3,"HerbesHautes");
        CadrillageMap.setTypeDeDécor(7,3,"HerbesHautes");
        if ( CadrillageMap.décorChangé[2][4] == true ) isBuisson1Cut = true;
        if ( CadrillageMap.décorChangé[5][5] == true ) isBuisson2Cut = true;
        if ( CadrillageMap.décorChangé[4][5] == true ) isBuisson3Cut = true;
        if ( CadrillageMap.décorChangé[6][3] == true ) isBuisson4Cut = true;
        if ( CadrillageMap.décorChangé[7][3] == true ) isBuisson5Cut = true;
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
