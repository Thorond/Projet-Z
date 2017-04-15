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

public class SousMapH2 extends Sprite{


    public static boolean ouvertureCoffre = false; // à sauvegarder
    public static boolean coffreOuvert = false; // à sauvegarder

    public static Body murCoffre;
    public static boolean ismurCoffreCreated;

	public static void sousMap(GameMain game, int x, int y) {

        game.getBatch().draw(ClimatMontagneux.glace1, 0 + x, 0 + y);
        game.getBatch().draw(ClimatMontagneux.glace1, 0 + x, 60 + y);
        game.getBatch().draw(ClimatMontagneux.glace1, 0 + x, 120 + y);
        game.getBatch().draw(ClimatMontagneux.glace1, 0 + x, 180 + y);
        game.getBatch().draw(ClimatMontagneux.glace1, 0 + x, 240 + y);
        game.getBatch().draw(ClimatMontagneux.glace1, 0 + x, 300 + y);
        game.getBatch().draw(ClimatMontagneux.glace1, 0 + x, 360 + y);
        game.getBatch().draw(ClimatMontagneux.glace1, 0 + x, 420 + y);

        game.getBatch().draw(ClimatMontagneux.glace1, 60 + x, 0 + y);
        game.getBatch().draw(ClimatMontagneux.glace1, 60 + x, 60 + y);
        game.getBatch().draw(ClimatMontagneux.glace1, 60 + x, 120 + y);
        game.getBatch().draw(ClimatMontagneux.glace1, 60 + x, 180 + y);
        game.getBatch().draw(ClimatMontagneux.glace1, 60 + x, 240 + y);
        game.getBatch().draw(ClimatMontagneux.glace1, 60 + x, 300 + y);
        game.getBatch().draw(ClimatMontagneux.glace1, 60 + x, 360 + y);
        game.getBatch().draw(ClimatMontagneux.glace1, 60 + x, 420 + y);

        game.getBatch().draw(ClimatMontagneux.glace1, 120 + x, 0 + y);
        game.getBatch().draw(ClimatMontagneux.glace1, 120 + x, 60 + y);
        game.getBatch().draw(ClimatMontagneux.glace1, 120 + x, 120 + y);
        game.getBatch().draw(ClimatMontagneux.glace1, 120 + x, 180 + y);
        game.getBatch().draw(ClimatMontagneux.glace1, 120 + x, 240 + y);
        game.getBatch().draw(ClimatMontagneux.glace1, 120 + x, 300 + y);
        game.getBatch().draw(ClimatMontagneux.glace1, 120 + x, 360 + y);
        game.getBatch().draw(ClimatMontagneux.glace1, 120 + x, 420 + y);

        game.getBatch().draw(ClimatMontagneux.glace1, 180 + x, 0 + y);
        game.getBatch().draw(ClimatMontagneux.glace1, 180 + x, 60 + y);
        game.getBatch().draw(ClimatMontagneux.glace1, 180 + x, 120 + y);
        game.getBatch().draw(ClimatMontagneux.glace1, 180 + x, 180 + y);
        game.getBatch().draw(ClimatMontagneux.glace1, 180 + x, 240 + y);
        game.getBatch().draw(ClimatMontagneux.glace1, 180 + x, 300 + y);
        game.getBatch().draw(ClimatMontagneux.glace1, 180 + x, 360 + y);
        game.getBatch().draw(ClimatMontagneux.glace1, 180 + x, 420 + y);

        game.getBatch().draw(ClimatMontagneux.glace1, 240 + x, 0 + y);
        game.getBatch().draw(ClimatMontagneux.glace1, 240 + x, 60 + y);
        game.getBatch().draw(ClimatMontagneux.glace1, 240 + x, 120 + y);
        game.getBatch().draw(ClimatMontagneux.glace1, 240 + x, 180 + y);
        game.getBatch().draw(ClimatMontagneux.glace1, 240 + x, 240 + y);
        game.getBatch().draw(ClimatMontagneux.glace1, 240 + x, 300 + y);
        game.getBatch().draw(ClimatMontagneux.glace1, 240 + x, 360 + y);
        game.getBatch().draw(ClimatMontagneux.glace1, 240 + x, 420 + y);

        game.getBatch().draw(ClimatMontagneux.glace1, 300 + x, 0 + y);
        game.getBatch().draw(ClimatMontagneux.glace1, 300 + x, 60 + y);
        game.getBatch().draw(ClimatMontagneux.glace1, 300 + x, 120 + y);
        game.getBatch().draw(ClimatMontagneux.glace1, 300 + x, 180 + y);
        game.getBatch().draw(ClimatMontagneux.glace1, 300 + x, 240 + y);
        game.getBatch().draw(ClimatMontagneux.glace1, 300 + x, 300 + y);
        game.getBatch().draw(ClimatMontagneux.glace1, 300 + x, 360 + y);
        game.getBatch().draw(ClimatMontagneux.glace1, 300 + x, 420 + y);

        game.getBatch().draw(ClimatMontagneux.glace1, 360 + x, 0 + y);
        game.getBatch().draw(ClimatMontagneux.glace1, 360 + x, 60 + y);
        game.getBatch().draw(ClimatMontagneux.glace1, 360 + x, 120 + y);
        game.getBatch().draw(ClimatMontagneux.glace1, 360 + x, 180 + y);
        game.getBatch().draw(ClimatMontagneux.glace1, 360 + x, 240 + y);
        game.getBatch().draw(ClimatMontagneux.glace1, 360 + x, 300 + y);
        game.getBatch().draw(ClimatMontagneux.glace1, 360 + x, 360 + y);
        game.getBatch().draw(ClimatMontagneux.glace1, 360 + x, 420 + y);

        game.getBatch().draw(ClimatMontagneux.glace1, 420 + x, 0 + y);
        game.getBatch().draw(ClimatMontagneux.glace1, 420 + x, 60 + y);
        game.getBatch().draw(ClimatMontagneux.glace1, 420 + x, 120 + y);
        game.getBatch().draw(ClimatMontagneux.glace1, 420 + x, 180 + y);
        game.getBatch().draw(ClimatMontagneux.glace1, 420 + x, 240 + y);
        game.getBatch().draw(ClimatMontagneux.glace1, 420 + x, 300 + y);
        game.getBatch().draw(ClimatMontagneux.glace1, 420 + x, 360 + y);
        game.getBatch().draw(ClimatMontagneux.glace1, 420 + x, 420 + y);

        game.getBatch().draw(ClimatMontagneux.glace1, 480 + x, 0 + y);
        game.getBatch().draw(ClimatMontagneux.glace1, 480 + x, 60 + y);
        game.getBatch().draw(ClimatMontagneux.glace1, 480 + x, 120 + y);
        game.getBatch().draw(ClimatMontagneux.glace1, 480 + x, 180 + y);
        game.getBatch().draw(ClimatMontagneux.glace1, 480 + x, 240 + y);
        game.getBatch().draw(ClimatMontagneux.glace1, 480 + x, 300 + y);
        game.getBatch().draw(ClimatMontagneux.glace1, 480 + x, 360 + y);
        game.getBatch().draw(ClimatMontagneux.glace1, 480 + x, 420 + y);

        game.getBatch().draw(ClimatMontagneux.glace1, 540 + x, 0 + y);
        game.getBatch().draw(ClimatMontagneux.glace1, 540 + x, 60 + y);
        game.getBatch().draw(ClimatMontagneux.glace1, 540 + x, 120 + y);
        game.getBatch().draw(ClimatMontagneux.glace1, 540 + x, 180 + y);
        game.getBatch().draw(ClimatMontagneux.glace1, 540 + x, 240 + y);
        game.getBatch().draw(ClimatMontagneux.glace1, 540 + x, 300 + y);
        game.getBatch().draw(ClimatMontagneux.glace1, 540 + x, 360 + y);
        game.getBatch().draw(ClimatMontagneux.glace1, 540 + x, 420 + y);

//		


        game.getBatch().draw(ClimatMontagneux.murSombreGlacéCentre, 0 + x, 0 + y);
        game.getBatch().draw(ClimatMontagneux.murSombreGlacéCentre, 0 + x, 60 + y);
        ClimatMontagneux.placerMurSombreGlacéDroite3(game, 0 + x, 120 + y);
        game.getBatch().draw(ClimatMontagneux.murSombreGlacéDroite, 0 + x, 180 + y);
        game.getBatch().draw(ClimatMontagneux.bordGlacéInfGau, 0 + x, 240 + y);

        game.getBatch().draw(ClimatMontagneux.murSombreGlacéCentre, 60 + x, 00 + y);
        ClimatMontagneux.placerMurSombreGlacéDroite3(game, 60 + x, 60 + y);
        game.getBatch().draw(ClimatMontagneux.murSombreGlacéDroite, 60 + x, 120 + y);
        game.getBatch().draw(ClimatMontagneux.bordGlacéInfGau, 60 + x, 180 + y);

        ClimatMontagneux.placerMurSombreGlacéDroite3(game, 120 + x, 0 + y);
        game.getBatch().draw(ClimatMontagneux.murSombreGlacéDroite, 120 + x, 60 + y);
        game.getBatch().draw(ClimatMontagneux.bordGlacéInfGau, 120 + x, 120 + y);

        game.getBatch().draw(ClimatMontagneux.murSombreGlacéDroite, 180 + x, 0 + y);
        game.getBatch().draw(ClimatMontagneux.bordGlacéInfGau, 180 + x, 60 + y);

        game.getBatch().draw(ClimatMontagneux.bordGlacéInfGau, 240 + x, 0 + y);

//

        game.getBatch().draw(ClimatMontagneux.tree, -70 + x, 450 + y);
        game.getBatch().draw(ClimatMontagneux.tree, -30 + x, 390 + y);
        game.getBatch().draw(ClimatMontagneux.tree, -50 + x, 330 + y);


        game.getBatch().draw(ClimatMontagneux.tree, 70+ x, 450+ y);
        game.getBatch().draw(ClimatMontagneux.tree, 70+ x, 390+ y);
        game.getBatch().draw(ClimatMontagneux.tree, 70+ x, 330+ y);
        game.getBatch().draw(ClimatMontagneux.tree, 130+ x, 330+ y);
        game.getBatch().draw(ClimatMontagneux.tree, 150+ x, 270+ y);
        game.getBatch().draw(ClimatMontagneux.tree, 150+ x, 220+ y);
        game.getBatch().draw(ClimatMontagneux.tree, 150+ x, 170+ y);
        game.getBatch().draw(ClimatMontagneux.tree, 210+ x, 170+ y);
        game.getBatch().draw(ClimatMontagneux.tree, 330+ x, 100+ y);
        game.getBatch().draw(ClimatMontagneux.tree, 330+ x, 50+ y);
        game.getBatch().draw(ClimatMontagneux.tree, 330+ x, 0+ y);
        game.getBatch().draw(ClimatMontagneux.tree, 390+ x, 0+ y);
        game.getBatch().draw(ClimatMontagneux.tree, 450+ x, 0+ y);
        game.getBatch().draw(ClimatMontagneux.tree, 510+ x, 0+ y);
        game.getBatch().draw(ClimatMontagneux.tree, 570+ x, 0+ y);

        game.getBatch().draw(DonjonGlace.murVertical, 44 + x, 310 + y);
        game.getBatch().draw(DonjonGlace.murHorizontal, 64 + x, 310 + y);
        game.getBatch().draw(DonjonGlace.murVertical, 132 + x, 140 + y);
        game.getBatch().draw(DonjonGlace.murHorizontal, 152 + x, 140 + y);
        game.getBatch().draw(DonjonGlace.murHorizontal, 242 + x, 140 + y);
        game.getBatch().draw(DonjonGlace.murVertical, 310 + x, -30 + y);
        game.getBatch().draw(DonjonGlace.murHorizontal, 330 + x, -30 + y);
        game.getBatch().draw(DonjonGlace.murHorizontal, 420 + x, -30 + y);
        game.getBatch().draw(DonjonGlace.murHorizontal, 510 + x, -30 + y);

        game.getBatch().draw(ClimatMontagneux.tree, 10 + x, 270 + y);
        game.getBatch().draw(ClimatMontagneux.tree, 60 + x, 250 + y);
        game.getBatch().draw(ClimatMontagneux.tree, 60 + x, 210 + y);

        game.getBatch().draw(ClimatMontagneux.tree, 180 + x, 80 + y);
        game.getBatch().draw(ClimatMontagneux.escalierBas, 250 + x, 10 + y);

//
        if ( ouvertureCoffre == false ) game.getBatch().draw(ClimatMontagneux.coffreBleuFermé, 270+ x, 100+ y);
        else {
            if ( coffreOuvert == false ) {
                if ( Coffre.ouvert1 == true && Coffre.ouvert2 == true ){
                    coffreOuvert = true;
                }
                Coffre.annimationCoffreBleu(game, 270, 100);

            } else {
                game.getBatch().draw(ClimatMontagneux.coffreBleuOuvert3, 270+ x, 100+ y);
            }

        }
        if ( MainMenu.Link.annimationAward ) {
//			game.getBatch().draw(DonjonGlace.CléHaute, MainMenu.Link.getX() - 10, MainMenu.Link.getY() +10);
//			game.getBatch().draw(DonjonGlace.texteClé, 100 + x, 10+y);
        }

//

        game.getBatch().draw(ClimatMontagneux.piedGlacéSup, 300 + x, 240 + y);
        game.getBatch().draw(ClimatMontagneux.murGlacéGauche, 300 + x, 300 + y);
        game.getBatch().draw(ClimatMontagneux.murGlacéGauche, 300 + x, 360 + y);
        game.getBatch().draw(ClimatMontagneux.murGlacéGauche, 300 + x, 420 + y);

        game.getBatch().draw(ClimatMontagneux.piedGlacéSup, 360 + x, 240 + y);
        game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 360 + x, 300 + y);
        game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 360 + x, 360 + y);
        game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 360 + x, 420 + y);

        game.getBatch().draw(ClimatMontagneux.piedGlacéSup, 420 + x, 180 + y);
        game.getBatch().draw(ClimatMontagneux.murGlacéGauche, 420 + x, 240 + y);
        game.getBatch().draw(DonjonGlace.serrure, 430 + x, 240 + y);
        game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 420 + x, 300 + y);
        game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 420 + x, 360 + y);
        game.getBatch().draw(ClimatMontagneux.bordGlacéInfGau, 420 + x, 420 + y);


        game.getBatch().draw(ClimatMontagneux.glaceSombre3, 480+ x, 300+ y);
        game.getBatch().draw(ClimatMontagneux.glaceSombre3, 480+ x, 240+ y);
        game.getBatch().draw(ClimatMontagneux.entréGrotteArc, 480+ x, 180+ y);
        game.getBatch().draw(ClimatMontagneux.glaceSombre3, 540+ x, 300+ y);
        game.getBatch().draw(ClimatMontagneux.glaceSombre3, 540+ x, 240+ y);
        game.getBatch().draw(ClimatMontagneux.entréGrotteArc, 540+ x, 180+ y);

        game.getBatch().draw(DonjonGlace.murGlacéPorte1, 480 + x, 240 + y);
        game.getBatch().draw(ClimatMontagneux.bordGlacéInf, 480 + x, 420 + y);
        game.getBatch().draw(ClimatMontagneux.bordGlacéInf, 540 + x, 420 + y);

    }
	public static void destroyBody() {
		// TODO Auto-generated method stub

        if ( ismurCoffreCreated) MainMenu.world.destroyBody(murCoffre);
        ismurCoffreCreated = false;
	}

	public static void createBodyAndType(World world) {
		// TODO Auto-generated method stub

        CadrillageMap.setTypeDeDécor(4,1, "coffreBleu");
        if ( ismurCoffreCreated == false ) {
            murCoffre = ClimatMontagneux.createBody(290,120,30,30);
            ismurCoffreCreated = true;
        }
	}

	public static void destroyType() {
		// TODO Auto-generated method stub
		
	}
}
