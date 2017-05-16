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

    public static Body arbre1;
    public static boolean isarbre1Created;

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
        ClimatMontagneux.placerMurSombreGlacéDroite( game, 0 + x, 180 + y);
        game.getBatch().draw(ClimatMontagneux.bordGlacéInfGau, 0 + x, 240 + y);

        game.getBatch().draw(ClimatMontagneux.murSombreGlacéCentre, 60 + x, 00 + y);
        ClimatMontagneux.placerMurSombreGlacéDroite3(game, 60 + x, 60 + y);
        ClimatMontagneux.placerMurSombreGlacéDroite( game, 60 + x, 120 + y);
        game.getBatch().draw(ClimatMontagneux.bordGlacéInfGau, 60 + x, 180 + y);

        ClimatMontagneux.placerMurSombreGlacéDroite3(game, 120 + x, 0 + y);
        ClimatMontagneux.placerMurSombreGlacéDroite( game, 120 + x, 60 + y);
        game.getBatch().draw(ClimatMontagneux.bordGlacéInfGau, 120 + x, 120 + y);

        ClimatMontagneux.placerMurSombreGlacéDroite( game, 180 + x, 0 + y);
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


        DonjonGlace.détectionSerrure(MainMenu.Link);
//		grille
        if ( DonjonGlace.ouvertureGrille < 0 ) {
            game.getBatch().draw(DonjonGlace.murGlacéPorte1, 480 + x, 240 + y);
        } else if (DonjonGlace.transitionGrille ){
            DonjonGlace.annimationOuvertureGrille(game, x, y);
        } else if ( DonjonGlace.ouvertureGrille >= 4){
            game.getBatch().draw(DonjonGlace.murGlacéPorte4, 480 + x, 240 + y);
        }


//        game.getBatch().draw(DonjonGlace.murGlacéPorte1, 480 + x, 240 + y);
        game.getBatch().draw(ClimatMontagneux.bordGlacéInf, 480 + x, 420 + y);
        game.getBatch().draw(ClimatMontagneux.bordGlacéInf, 540 + x, 420 + y);



//
        game.getBatch().draw(ClimatMontagneux.planteGelé, 180+ x, 360+ y);
        game.getBatch().draw(ClimatMontagneux.planteGelé3, 540+ x, 90+ y);
        game.getBatch().draw(ClimatMontagneux.planteGelé, 240+ x, 300+ y);
        game.getBatch().draw(ClimatMontagneux.planteGelé, 360+ x, 240+ y);
        game.getBatch().draw(ClimatMontagneux.planteGelé3, 420+ x, 180+ y);


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
			game.getBatch().draw(DonjonGlace.cléBoss, MainMenu.Link.getX() - 10, MainMenu.Link.getY() +30);
			game.getBatch().draw(DonjonGlace.texteCléBoss, 100 + x, 150+y);
        }

        PlacementMainZoneGlace.détectionEscalier(MainMenu.Link);

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

        if ( isarbre1Created) MainMenu.world.destroyBody(arbre1);
        isarbre1Created = false;
	}

	public static void createBodyAndType(World world) {
		// TODO Auto-generated method stub

        CadrillageMap.setTypeDeDécor(4,0, "Escalier");

        CadrillageMap.setTypeDeDécor(4,1, "coffreBleu");
        if ( ismurCoffreCreated == false ) {
            murCoffre = ClimatMontagneux.createBody(290,120,30,30);
            ismurCoffreCreated = true;
        }


        if ( isCote1Created == false ) {
            cote1 = ClimatMontagneux.createBody(335,390,130,180);
            isCote1Created = true;
        }
        if ( DonjonGlace.ouvertureGrille < 3 ){
            if ( isCote2Created == false ) {
                cote2 = ClimatMontagneux.createBody(560,330,300,180);
                isCote2Created = true;
            }
        } else {
            if ( isCote2Created == false ) {
                cote2 = ClimatMontagneux.createBody(450,330,80,180);
                isCote2Created = true;
            }
        }

        if ( isCote3Created == false ) {
            cote3 = ClimatMontagneux.createBody(60,420,160,120);
            isCote3Created = true;
        }
        if ( isCote4Created == false ) {
            cote4 = ClimatMontagneux.createBody(110,315,160,150);
            isCote4Created = true;
        }
        if ( isCote5Created == false ) {
            cote5 = ClimatMontagneux.createBody(240,180,160,120);
            isCote5Created = true;
        }
        if ( isCote6Created == false ) {
            cote6 = ClimatMontagneux.createBody(330,80,70,170);
            isCote6Created = true;
        }
        if ( isCote7Created == false ) {
            cote7 = ClimatMontagneux.createBody(480,40,240,80);
            isCote7Created = true;
        }
        if ( isCote8Created == false ) {
            cote8 = ClimatMontagneux.createBody(240,0,120,1);
            isCote8Created = true;
        }
        if ( isCote9Created == false ) {
            cote9 = ClimatMontagneux.createBody(570,360,20,240);
            isCote9Created = true;
        }

        if ( isarbre1Created == false ) {
            arbre1 = ClimatMontagneux.createBodyPerso("arbre", "static",180,80);
            isarbre1Created = true;
        }
	}

	public static void destroyType() {
		// TODO Auto-generated method stub
		
	}
}
