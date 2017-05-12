package map.zoneGlace;

import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.physics.box2d.Body;
import com.badlogic.gdx.physics.box2d.World;
import com.mygdx.game.GameMain;

import decors.ClimatMontagneux;
import decors.DonjonGlace;
import items.Coffre;
import map.CadrillageMap;
import scenes.MainMenu;

public class SousMapI5 extends Sprite{


    public static boolean ouvertureCoffre = false; // à sauvegarder
    public static boolean coffreOuvert = false; // à sauvegarder


	public static Body murCoffre;
	public static boolean ismurCoffreCreated;

    public static Body cote1 ;
    public static boolean isCote1Created;
    public static Body cote2 ;
    public static boolean isCote2Created;
    public static Body cote3 ;
    public static boolean isCote3Created;

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
		ClimatMontagneux.eauProfondeGlacée(game, 120+ x, 360+ y);
		ClimatMontagneux.eauProfondeGlacée(game, 120+ x, 420+ y);
		
		game.getBatch().draw(ClimatMontagneux.glace1, 180+ x, 0+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 180+ x, 60+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 180+ x, 120+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 180+ x, 180+ y);
		ClimatMontagneux.eauProfondeGlacée(game, 180+ x, 240+ y);
		ClimatMontagneux.eauProfondeGlacée(game, 180+ x, 300+ y);
		ClimatMontagneux.eauProfondeGlacée(game, 180+ x, 360+ y);
		ClimatMontagneux.eauProfondeGlacée(game, 180+ x, 420+ y);

		game.getBatch().draw(ClimatMontagneux.glace1, 240+ x, 0+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 240+ x, 60+ y);
		ClimatMontagneux.eauProfondeGlacée(game, 240+ x, 120+ y);
		ClimatMontagneux.eauProfondeGlacée(game, 240+ x, 180+ y);
		ClimatMontagneux.eauProfondeGlacée(game, 240+ x, 240+ y);
		ClimatMontagneux.eauProfondeGlacée(game, 240+ x, 300+ y);
		ClimatMontagneux.eauProfondeGlacée(game, 240+ x, 360+ y);
		ClimatMontagneux.eauProfondeGlacée(game, 240+ x, 420+ y);

		ClimatMontagneux.eauProfondeGlacée(game, 300+ x, 0+ y);
		ClimatMontagneux.eauProfondeGlacée(game, 300+ x, 60+ y);
		ClimatMontagneux.eauProfondeGlacée(game, 300+ x, 120+ y);
		ClimatMontagneux.eauProfondeGlacée(game, 300+ x, 180+ y);
		ClimatMontagneux.eauProfondeGlacée(game, 300+ x, 240+ y);
		ClimatMontagneux.eauProfondeGlacée(game, 300+ x, 300+ y);
		ClimatMontagneux.eauProfondeGlacée(game, 300+ x, 360+ y);
		ClimatMontagneux.eauProfondeGlacée(game, 300+ x, 420+ y);

		ClimatMontagneux.eauProfondeGlacée(game, 360+ x, 0+ y);
		ClimatMontagneux.eauProfondeGlacée(game, 360+ x, 60+ y);
		ClimatMontagneux.eauProfondeGlacée(game, 360+ x, 120+ y);
		ClimatMontagneux.eauProfondeGlacée(game, 360+ x, 180+ y);
		ClimatMontagneux.eauProfondeGlacée(game, 360+ x, 240+ y);
		ClimatMontagneux.eauProfondeGlacée(game, 360+ x, 300+ y);
		ClimatMontagneux.eauProfondeGlacée(game, 360+ x, 360+ y);
		ClimatMontagneux.eauProfondeGlacée(game, 360+ x, 420+ y);

		ClimatMontagneux.eauProfondeGlacée(game, 420+ x, 0+ y);
		ClimatMontagneux.eauProfondeGlacée(game, 420+ x, 60+ y);
		ClimatMontagneux.eauProfondeGlacée(game, 420+ x, 120+ y);
		ClimatMontagneux.eauProfondeGlacée(game, 420+ x, 180+ y);
		ClimatMontagneux.eauProfondeGlacée(game, 420+ x, 240+ y);
		ClimatMontagneux.eauProfondeGlacée(game, 420+ x, 300+ y);
		ClimatMontagneux.eauProfondeGlacée(game, 420+ x, 360+ y);
		ClimatMontagneux.eauProfondeGlacée(game, 420+ x, 420+ y);

		ClimatMontagneux.eauProfondeGlacée(game, 480+ x, 0+ y);
		ClimatMontagneux.eauProfondeGlacée(game, 480+ x, 60+ y);
		ClimatMontagneux.eauProfondeGlacée(game, 480+ x, 120+ y);
		ClimatMontagneux.eauProfondeGlacée(game, 480+ x, 180+ y);
		ClimatMontagneux.eauProfondeGlacée(game, 480+ x, 240+ y);
		ClimatMontagneux.eauProfondeGlacée(game, 480+ x, 300+ y);
		ClimatMontagneux.eauProfondeGlacée(game, 480+ x, 360+ y);
		ClimatMontagneux.eauProfondeGlacée(game, 480+ x, 420+ y);

		ClimatMontagneux.eauProfondeGlacée(game, 540+ x, 0+ y);
		ClimatMontagneux.eauProfondeGlacée(game, 540+ x, 60+ y);
		ClimatMontagneux.eauProfondeGlacée(game, 540+ x, 120+ y);
		ClimatMontagneux.eauProfondeGlacée(game, 540+ x, 180+ y);
		ClimatMontagneux.eauProfondeGlacée(game, 540+ x, 240+ y);
		ClimatMontagneux.eauProfondeGlacée(game, 540+ x, 300+ y);
		ClimatMontagneux.eauProfondeGlacée(game, 540+ x, 360+ y);
		ClimatMontagneux.eauProfondeGlacée(game, 540+ x, 420+ y);

//

		game.getBatch().draw(ClimatMontagneux.bordGlacéDroi, 60+ x, 420+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéDroi, 60+ x, 360+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéSupDroi, 120+ x, 300+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéDroi, 120+ x, 240+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéSupDroi, 180+ x, 180+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéDroi, 180+ x, 120+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéSupDroi, 240+ x, 60+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéDroi, 240+ x, 0+ y);


		game.getBatch().draw(ClimatMontagneux.bordGlacéInfDroi, 0+ x, 120+ y);
		game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 0+ x, 60+ y);
		game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 0+ x, 0+ y);
		game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 60+ x, 120+ y);
		game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 60+ x, 60+ y);
		game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 60+ x, 0+ y);
		game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 120+ x, 120+ y);
		game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 120+ x, 60+ y);
		game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 120+ x, 0+ y);
		game.getBatch().draw(ClimatMontagneux.murGlacéDroite, 180+ x, 120+ y);
		game.getBatch().draw(ClimatMontagneux.murGlacéDroite, 180+ x, 60+ y);
		game.getBatch().draw(ClimatMontagneux.murGlacéDroite, 180+ x, 0+ y);

        game.getBatch().draw(ClimatMontagneux.bordGlacéInf, 120+ x, 180+ y);
        game.getBatch().draw(ClimatMontagneux.bordGlacéInf, 60+ x, 180+ y);

//


        game.getBatch().draw(ClimatMontagneux.tree, -30+ x, 410+ y);
		game.getBatch().draw(ClimatMontagneux.tree, 60+ x, 430+ y);

        game.getBatch().draw(ClimatMontagneux.tree, 0+ x, 380+ y);
        game.getBatch().draw(ClimatMontagneux.tree, 60+ x, 380+ y);

        game.getBatch().draw(ClimatMontagneux.tree, -30+ x, 350+ y);
        game.getBatch().draw(ClimatMontagneux.tree, 30+ x, 350+ y);

        game.getBatch().draw(ClimatMontagneux.tree, 0+ x, 320+ y);
        game.getBatch().draw(ClimatMontagneux.tree, 60+ x, 320+ y);
        game.getBatch().draw(ClimatMontagneux.tree, 120+ x, 320+ y);

        game.getBatch().draw(ClimatMontagneux.tree, -30+ x, 290+ y);
        game.getBatch().draw(ClimatMontagneux.tree, 30+ x, 290+ y);
        game.getBatch().draw(ClimatMontagneux.tree, 90+ x, 290+ y);

        game.getBatch().draw(ClimatMontagneux.tree, 0+ x, 260+ y);
        game.getBatch().draw(ClimatMontagneux.tree, 60+ x, 260+ y);
        game.getBatch().draw(ClimatMontagneux.tree, 120+ x, 260+ y);

        game.getBatch().draw(ClimatMontagneux.tree, -30+ x, 230+ y);
        game.getBatch().draw(ClimatMontagneux.tree, 30+ x, 230+ y);
        game.getBatch().draw(ClimatMontagneux.tree, 90+ x, 230+ y);
        game.getBatch().draw(ClimatMontagneux.tree, 150+ x, 230+ y);

        game.getBatch().draw(ClimatMontagneux.tree, 0+ x, 200+ y);
        game.getBatch().draw(ClimatMontagneux.tree, 60+ x, 200+ y);
        game.getBatch().draw(ClimatMontagneux.tree, 120+ x, 200+ y);
        game.getBatch().draw(ClimatMontagneux.tree, 180+ x, 200+ y);

        game.getBatch().draw(ClimatMontagneux.buisson, 0+ x, 130+ y);

		game.getBatch().draw(ClimatMontagneux.icebergWater, 360+ x, 50+ y);
        game.getBatch().draw(ClimatMontagneux.iceberg2, 150+ x, 430+ y);
		game.getBatch().draw(ClimatMontagneux.icebergWater, 310+ x, 300+ y);

        game.getBatch().draw(ClimatMontagneux.planteGelé, 240+ x, 20+ y);


//        if ( ouvertureCoffre == false ) game.getBatch().draw(ClimatMontagneux.coffreBleuFermé, 250+ x, 80+ y);
//        else {
//            if ( coffreOuvert == false ) {
//                if ( Coffre.ouvert1 == true && Coffre.ouvert2 == true ){
//                    coffreOuvert = true;
//                }
//                Coffre.annimationCoffreBleu(game, 250+ x, 80+ y);
//
//            } else {
//                game.getBatch().draw(ClimatMontagneux.coffreBleuOuvert3, 250+ x, 80+ y);
//            }
//
//        }
//        if ( MainMenu.Link.annimationAward ) {
////			game.getBatch().draw(DonjonGlace.CléHaute, MainMenu.Link.getX() - 10, MainMenu.Link.getY() +10);
////			game.getBatch().draw(DonjonGlace.texteClé, 100 + x, 10+y);
//        }

	}

	public static void destroyBody() {
		// TODO Auto-generated method stub

        if ( ismurCoffreCreated) MainMenu.world.destroyBody(murCoffre);
        ismurCoffreCreated = false;

        if ( isCote1Created) MainMenu.world.destroyBody(cote1);
        isCote1Created = false;

        if ( isCote2Created) MainMenu.world.destroyBody(cote2);
        isCote2Created = false;

        if ( isCote3Created) MainMenu.world.destroyBody(cote3);
        isCote3Created = false;
	}

	public static void createBodyAndType(World world) {
		// TODO Auto-generated method stub

//        CadrillageMap.setTypeDeDécor(4,1, "coffreBleu");

        if ( ismurCoffreCreated == false ) {
            murCoffre = ClimatMontagneux.createBody(270,100,30,30);
            ismurCoffreCreated = true;
        }


        if ( isCote1Created == false ) {
            cote1 = ClimatMontagneux.createBody(120,330,260,240);
            isCote1Created = true;
        }

        if ( isCote2Created == false ) {
            cote2 = ClimatMontagneux.createBody(110,50,220,140);
            isCote2Created = true;
        }


        if ( isCote3Created == false ) {
            cote3 = ClimatMontagneux.createBody(50,150,1,120);
            isCote3Created = true;
        }
	}

	public static void destroyType() {
		// TODO Auto-generated method stub
		
	}
}
