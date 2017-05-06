package map.zoneGlace;

import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.physics.box2d.Body;
import com.badlogic.gdx.physics.box2d.World;
import com.mygdx.game.GameMain;

import decors.ClimatMontagneux;
import map.CadrillageMap;
import scenes.MainMenu;

/**
 * Created by arnOo on 02/05/2017.
 */

public class DonjonSalle9 extends Sprite {

    public static int salle = 0 ;

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


    public static boolean isTonneau1Cut = false;
    public static boolean isTonneau2Cut = false;
    public static boolean isTonneau3Cut = false;
    public static boolean isTonneau4Cut = false;
    public static boolean isTonneau5Cut = false;
    public static boolean isTonneau6Cut = false;
    public static boolean isTonneau7Cut = false;
    public static boolean isTonneau8Cut = false;
    public static boolean isTonneau9Cut = false;
    public static boolean isTonneau10Cut = false;

    public static Body Tonneau1;
    public static boolean isTonneau1Created;
    public static Body Tonneau2;
    public static boolean isTonneau2Created;
    public static Body Tonneau3;
    public static boolean isTonneau3Created;
    public static Body Tonneau4;
    public static boolean isTonneau4Created;
    public static Body Tonneau5;
    public static boolean isTonneau5Created;
    public static Body Tonneau6;
    public static boolean isTonneau6Created;
    public static Body Tonneau7;
    public static boolean isTonneau7Created;
    public static Body Tonneau8;
    public static boolean isTonneau8Created;
    public static Body Tonneau9;
    public static boolean isTonneau9Created;
    public static Body Tonneau10;
    public static boolean isTonneau10Created;

    public static void sousMap(GameMain game, int x, int y){

        game.getBatch().draw(ClimatMontagneux.glaceSombre3, 0+ x, 0+ y);
        game.getBatch().draw(ClimatMontagneux.glaceSombre3, 0+ x, 60+ y);
        game.getBatch().draw(ClimatMontagneux.glaceSombre3, 0+ x, 120+ y);
        game.getBatch().draw(ClimatMontagneux.glaceSombre3, 0+ x, 180+ y);
        game.getBatch().draw(ClimatMontagneux.glaceSombre3, 0 + x,240 + y);
        game.getBatch().draw(ClimatMontagneux.glaceSombre3, 0+ x, 300+ y);
        game.getBatch().draw(ClimatMontagneux.glaceSombre3, 0+ x, 360+ y);
        game.getBatch().draw(ClimatMontagneux.glaceSombre3, 0+ x, 420+ y);

        game.getBatch().draw(ClimatMontagneux.glaceSombre3, 60+ x, 0+ y);
        game.getBatch().draw(ClimatMontagneux.glaceSombre3, 60+ x, 60+ y);
        game.getBatch().draw(ClimatMontagneux.glaceSombre3, 60+ x, 120+ y);
        game.getBatch().draw(ClimatMontagneux.glaceSombre3, 60+ x, 180+ y);
        game.getBatch().draw(ClimatMontagneux.glaceSombre3, 60+ x, 240+ y);
        game.getBatch().draw(ClimatMontagneux.glaceSombre3, 60+ x, 300+ y);
        game.getBatch().draw(ClimatMontagneux.glaceSombre3, 60+ x, 360+ y);
        game.getBatch().draw(ClimatMontagneux.glaceSombre3, 60+ x, 420+ y);

        game.getBatch().draw(ClimatMontagneux.glaceSombre3, 120+ x, 0+ y);
        game.getBatch().draw(ClimatMontagneux.glaceSombre3, 120+ x, 60+ y);
        game.getBatch().draw(ClimatMontagneux.glaceSombre3, 120+ x, 120+ y);
        game.getBatch().draw(ClimatMontagneux.glaceSombre3, 120+ x, 180+ y);
        game.getBatch().draw(ClimatMontagneux.glaceSombre3, 120+ x, 240+ y);
        game.getBatch().draw(ClimatMontagneux.glaceSombre3, 120+ x, 300+ y);
        game.getBatch().draw(ClimatMontagneux.glaceSombre3, 120+ x, 360+ y);
        game.getBatch().draw(ClimatMontagneux.glaceSombre3, 120+ x, 420+ y);

        game.getBatch().draw(ClimatMontagneux.glaceSombre3, 180+ x, 0+ y);
        game.getBatch().draw(ClimatMontagneux.glaceSombre3, 180+ x, 60+ y);
        game.getBatch().draw(ClimatMontagneux.glaceSombre3, 180+ x, 120+ y);
        game.getBatch().draw(ClimatMontagneux.glaceSombre3, 180+ x, 180+ y);
        game.getBatch().draw(ClimatMontagneux.glaceSombre3, 180+ x, 240+ y);
        game.getBatch().draw(ClimatMontagneux.glaceSombre3, 180+ x, 300+ y);
        game.getBatch().draw(ClimatMontagneux.glaceSombre3, 180+ x, 360+ y);
        game.getBatch().draw(ClimatMontagneux.glaceSombre3, 180+ x, 420+ y);

        game.getBatch().draw(ClimatMontagneux.glaceSombre3, 240+ x, 0+ y);
        game.getBatch().draw(ClimatMontagneux.glaceSombre3, 240+ x, 60+ y);
        game.getBatch().draw(ClimatMontagneux.glaceSombre3, 240+ x, 120+ y);
        game.getBatch().draw(ClimatMontagneux.glaceSombre3, 240+ x, 180+ y);
        game.getBatch().draw(ClimatMontagneux.glaceSombre3, 240+ x, 240+ y);
        game.getBatch().draw(ClimatMontagneux.glaceSombre3, 240+ x, 300+ y);
        game.getBatch().draw(ClimatMontagneux.glaceSombre3, 240+ x, 360+ y);
        game.getBatch().draw(ClimatMontagneux.glaceSombre3, 240+ x, 420+ y);

        game.getBatch().draw(ClimatMontagneux.glaceSombre3, 300+ x, 0+ y);
        game.getBatch().draw(ClimatMontagneux.glaceSombre3, 300+ x, 60+ y);
        game.getBatch().draw(ClimatMontagneux.glaceSombre3, 300+ x, 120+ y);
        game.getBatch().draw(ClimatMontagneux.glaceSombre3, 300+ x, 180+ y);
        game.getBatch().draw(ClimatMontagneux.glaceSombre3, 300+ x, 240+ y);
        game.getBatch().draw(ClimatMontagneux.glaceSombre3, 300+ x, 300+ y);
        game.getBatch().draw(ClimatMontagneux.glaceSombre3, 300+ x, 360+ y);
        game.getBatch().draw(ClimatMontagneux.glaceSombre3, 300+ x, 420+ y);

        game.getBatch().draw(ClimatMontagneux.glaceSombre3, 360+ x, 0+ y);
        game.getBatch().draw(ClimatMontagneux.glaceSombre3, 360+ x, 60+ y);
        game.getBatch().draw(ClimatMontagneux.glaceSombre3, 360+ x, 120+ y);
        game.getBatch().draw(ClimatMontagneux.glaceSombre3, 360+ x, 180+ y);
        game.getBatch().draw(ClimatMontagneux.glaceSombre3, 360+ x, 240+ y);
        game.getBatch().draw(ClimatMontagneux.glaceSombre3, 360+ x, 300+ y);
        game.getBatch().draw(ClimatMontagneux.glaceSombre3, 360+ x, 360+ y);
        game.getBatch().draw(ClimatMontagneux.glaceSombre3, 360+ x, 420+ y);

        game.getBatch().draw(ClimatMontagneux.glaceSombre3, 420+ x, 0+ y);
        game.getBatch().draw(ClimatMontagneux.glaceSombre3, 420+ x, 60+ y);
        game.getBatch().draw(ClimatMontagneux.glaceSombre3, 420+ x, 120+ y);
        game.getBatch().draw(ClimatMontagneux.glaceSombre3, 420+ x, 180+ y);
        game.getBatch().draw(ClimatMontagneux.glaceSombre3, 420+ x, 240+ y);
        game.getBatch().draw(ClimatMontagneux.glaceSombre3, 420+ x, 300+ y);
        game.getBatch().draw(ClimatMontagneux.glaceSombre3, 420+ x, 360+ y);
        game.getBatch().draw(ClimatMontagneux.glaceSombre3, 420+ x, 420+ y);

        game.getBatch().draw(ClimatMontagneux.glaceSombre3, 480+ x, 0+ y);
        game.getBatch().draw(ClimatMontagneux.glaceSombre3, 480+ x, 60+ y);
        game.getBatch().draw(ClimatMontagneux.glaceSombre3, 480+ x, 120+ y);
        game.getBatch().draw(ClimatMontagneux.glaceSombre3, 480+ x, 180+ y);
        game.getBatch().draw(ClimatMontagneux.glaceSombre3, 480+ x, 240+ y);
        game.getBatch().draw(ClimatMontagneux.glaceSombre3, 480+ x, 300+ y);
        game.getBatch().draw(ClimatMontagneux.glaceSombre3, 480+ x, 360+ y);
        game.getBatch().draw(ClimatMontagneux.glaceSombre3, 480+ x, 420+ y);

        game.getBatch().draw(ClimatMontagneux.glaceSombre3, 540+ x, 0+ y);
        game.getBatch().draw(ClimatMontagneux.glaceSombre3, 540+ x, 60+ y);
        game.getBatch().draw(ClimatMontagneux.glaceSombre3, 540+ x, 120+ y);
        game.getBatch().draw(ClimatMontagneux.glaceSombre3, 540+ x, 180+ y);
        game.getBatch().draw(ClimatMontagneux.glaceSombre3, 540+ x, 240+ y);
        game.getBatch().draw(ClimatMontagneux.glaceSombre3, 540+ x, 300+ y);
        game.getBatch().draw(ClimatMontagneux.glaceSombre3, 540+ x, 360+ y);
        game.getBatch().draw(ClimatMontagneux.glaceSombre3, 540+ x, 420+ y);

        game.getBatch().draw(ClimatMontagneux.murSombreGlacéCentre, 0+ x, 0+ y);
        game.getBatch().draw(ClimatMontagneux.murSombreGlacéCentre, 0+ x, 60+ y);
        game.getBatch().draw(ClimatMontagneux.murSombreGlacéCentre, 0+ x, 120+ y);
        game.getBatch().draw(ClimatMontagneux.murSombreGlacéCentre, 0+ x, 300+ y);
        game.getBatch().draw(ClimatMontagneux.murSombreGlacéCentre, 0+ x, 360+ y);
        game.getBatch().draw(ClimatMontagneux.murSombreGlacéCentre, 0+ x, 420+ y);

        game.getBatch().draw(ClimatMontagneux.murSombreGlacéCentre, 60+ x, 0+ y);
        game.getBatch().draw(ClimatMontagneux.murSombreGlacéCentre, 120+ x, 0+ y);
        game.getBatch().draw(ClimatMontagneux.murSombreGlacéCentre, 180+ x, 0+ y);
        game.getBatch().draw(ClimatMontagneux.murSombreGlacéCentre, 360+ x, 0+ y);
        game.getBatch().draw(ClimatMontagneux.murSombreGlacéCentre, 420+ x, 0+ y);
        game.getBatch().draw(ClimatMontagneux.murSombreGlacéCentre, 480+ x, 0+ y);

        game.getBatch().draw(ClimatMontagneux.murSombreGlacéCentre, 60+ x, 420+ y);
        game.getBatch().draw(ClimatMontagneux.murSombreGlacéCentre, 120+ x, 420+ y);
        game.getBatch().draw(ClimatMontagneux.murSombreGlacéCentre, 180+ x, 420+ y);
        game.getBatch().draw(ClimatMontagneux.murSombreGlacéCentre, 360+ x, 420+ y);
        game.getBatch().draw(ClimatMontagneux.murSombreGlacéCentre, 420+ x, 420+ y);
        game.getBatch().draw(ClimatMontagneux.murSombreGlacéCentre, 480+ x, 420+ y);

        game.getBatch().draw(ClimatMontagneux.murSombreGlacéCentre, 540+ x, 0+ y);
        game.getBatch().draw(ClimatMontagneux.murSombreGlacéCentre, 540+ x, 60+ y);
        game.getBatch().draw(ClimatMontagneux.murSombreGlacéCentre, 540+ x, 120+ y);
        game.getBatch().draw(ClimatMontagneux.murSombreGlacéCentre, 540+ x, 300+ y);
        game.getBatch().draw(ClimatMontagneux.murSombreGlacéCentre, 540+ x, 360+ y);
        game.getBatch().draw(ClimatMontagneux.murSombreGlacéCentre, 540+ x, 420+ y);

//
        if ( salle == 1 || salle == 0 ) {
            ClimatMontagneux.tonneau(isTonneau1Cut, game, 60 + x, 60 + y);
            ClimatMontagneux.tonneau(isTonneau2Cut, game, 60 + x, 120 + y);
            ClimatMontagneux.tonneau(isTonneau3Cut, game, 120 + x, 60 + y);

            ClimatMontagneux.tonneau(isTonneau4Cut, game, 60 + x, 360 + y);
            ClimatMontagneux.tonneau(isTonneau5Cut, game, 120 + x, 360 + y);
            ClimatMontagneux.tonneau(isTonneau6Cut, game, 60 + x, 300 + y);

            ClimatMontagneux.tonneau(isTonneau7Cut, game, 480 + x, 360 + y);
            ClimatMontagneux.tonneau(isTonneau8Cut, game, 420 + x, 360 + y);
            ClimatMontagneux.tonneau(isTonneau9Cut, game, 480 + x, 60 + y);
            ClimatMontagneux.tonneau(isTonneau10Cut, game, 420 + x, 60 + y);
        } else if ( salle == 2 ) {
            ClimatMontagneux.tonneau(isTonneau1Cut, game, 60 + x, 60 + y);
            ClimatMontagneux.tonneau(isTonneau2Cut, game, 60 + x, 120 + y);
            ClimatMontagneux.tonneau(isTonneau3Cut, game, 120 + x, 60 + y);

            ClimatMontagneux.tonneau(isTonneau4Cut, game, 60 + x, 360 + y);
            ClimatMontagneux.tonneau(isTonneau5Cut, game, 120 + x, 360 + y);
            ClimatMontagneux.tonneau(isTonneau6Cut, game, 480 + x, 300 + y);

            ClimatMontagneux.tonneau(isTonneau7Cut, game, 480 + x, 360 + y);
            ClimatMontagneux.tonneau(isTonneau8Cut, game, 420 + x, 360 + y);
            ClimatMontagneux.tonneau(isTonneau9Cut, game, 480 + x, 60 + y);
            ClimatMontagneux.tonneau(isTonneau10Cut, game, 420 + x, 60 + y);
        } else if ( salle == 3 ) {
            ClimatMontagneux.tonneau(isTonneau1Cut, game, 60 + x, 60 + y);
            ClimatMontagneux.tonneau(isTonneau2Cut, game, 480 + x, 120 + y);
            ClimatMontagneux.tonneau(isTonneau3Cut, game, 120 + x, 60 + y);

            ClimatMontagneux.tonneau(isTonneau4Cut, game, 60 + x, 360 + y);
            ClimatMontagneux.tonneau(isTonneau5Cut, game, 120 + x, 360 + y);
            ClimatMontagneux.tonneau(isTonneau6Cut, game, 60 + x, 300 + y);

            ClimatMontagneux.tonneau(isTonneau7Cut, game, 480 + x, 360 + y);
            ClimatMontagneux.tonneau(isTonneau8Cut, game, 420 + x, 360 + y);
            ClimatMontagneux.tonneau(isTonneau9Cut, game, 480 + x, 60 + y);
            ClimatMontagneux.tonneau(isTonneau10Cut, game, 420 + x, 60 + y);
        } else if ( salle == 4 ) {
            ClimatMontagneux.tonneau(isTonneau1Cut, game, 60 + x, 60 + y);
            ClimatMontagneux.tonneau(isTonneau2Cut, game, 480 + x, 120 + y);
            ClimatMontagneux.tonneau(isTonneau3Cut, game, 120 + x, 60 + y);

            ClimatMontagneux.tonneau(isTonneau4Cut, game, 60 + x, 360 + y);
            ClimatMontagneux.tonneau(isTonneau5Cut, game, 120 + x, 360 + y);
            ClimatMontagneux.tonneau(isTonneau6Cut, game, 480 + x, 300 + y);

            ClimatMontagneux.tonneau(isTonneau7Cut, game, 480 + x, 360 + y);
            ClimatMontagneux.tonneau(isTonneau8Cut, game, 420 + x, 360 + y);
            ClimatMontagneux.tonneau(isTonneau9Cut, game, 480 + x, 60 + y);
            ClimatMontagneux.tonneau(isTonneau10Cut, game, 420 + x, 60 + y);
        } else if ( salle == 5 ) {
            ClimatMontagneux.tonneau(isTonneau1Cut, game, 60 + x, 60 + y);
            ClimatMontagneux.tonneau(isTonneau2Cut, game, 480 + x, 120 + y);
            ClimatMontagneux.tonneau(isTonneau3Cut, game, 120 + x, 60 + y);

            ClimatMontagneux.tonneau(isTonneau4Cut, game, 60 + x, 360 + y);
            ClimatMontagneux.tonneau(isTonneau5Cut, game, 120 + x, 360 + y);
            ClimatMontagneux.tonneau(isTonneau6Cut, game, 60 + x, 120 + y);

            ClimatMontagneux.tonneau(isTonneau7Cut, game, 480 + x, 360 + y);
            ClimatMontagneux.tonneau(isTonneau8Cut, game, 420 + x, 360 + y);
            ClimatMontagneux.tonneau(isTonneau9Cut, game, 480 + x, 60 + y);
            ClimatMontagneux.tonneau(isTonneau10Cut, game, 420 + x, 60 + y);
        } else if ( salle == 6 ) {
            ClimatMontagneux.tonneau(isTonneau1Cut, game, 60 + x, 60 + y);
            ClimatMontagneux.tonneau(isTonneau2Cut, game, 60 + x, 300 + y);
            ClimatMontagneux.tonneau(isTonneau3Cut, game, 120 + x, 60 + y);

            ClimatMontagneux.tonneau(isTonneau4Cut, game, 60 + x, 360 + y);
            ClimatMontagneux.tonneau(isTonneau5Cut, game, 120 + x, 360 + y);
            ClimatMontagneux.tonneau(isTonneau6Cut, game, 480 + x, 300 + y);

            ClimatMontagneux.tonneau(isTonneau7Cut, game, 480 + x, 360 + y);
            ClimatMontagneux.tonneau(isTonneau8Cut, game, 420 + x, 360 + y);
            ClimatMontagneux.tonneau(isTonneau9Cut, game, 480 + x, 60 + y);
            ClimatMontagneux.tonneau(isTonneau10Cut, game, 420 + x, 60 + y);
        }

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


        if ( isTonneau1Created) MainMenu.world.destroyBody(Tonneau1);
        isTonneau1Created = false;

        if ( isTonneau2Created) MainMenu.world.destroyBody(Tonneau2);
        isTonneau2Created = false;

        if ( isTonneau3Created) MainMenu.world.destroyBody(Tonneau3);
        isTonneau3Created = false;

        if ( isTonneau4Created) MainMenu.world.destroyBody(Tonneau4);
        isTonneau4Created = false;

        if ( isTonneau5Created) MainMenu.world.destroyBody(Tonneau5);
        isTonneau5Created = false;

        if ( isTonneau6Created) MainMenu.world.destroyBody(Tonneau6);
        isTonneau6Created = false;

        if ( isTonneau7Created) MainMenu.world.destroyBody(Tonneau7);
        isTonneau7Created = false;

        if ( isTonneau8Created) MainMenu.world.destroyBody(Tonneau8);
        isTonneau8Created = false;

        if ( isTonneau9Created) MainMenu.world.destroyBody(Tonneau9);
        isTonneau9Created = false;

        if ( isTonneau10Created) MainMenu.world.destroyBody(Tonneau10);
        isTonneau10Created = false;
    }

    public static void createBodyAndType(World world) {
        // TODO Auto-generated method stub

        if ( salle == 1 || salle == 0 ) {
            if (CadrillageMap.décorChangé[1][1] == true) isTonneau1Cut = true;
            if (CadrillageMap.décorChangé[1][2] == true) isTonneau2Cut = true;
            if (CadrillageMap.décorChangé[2][1] == true) isTonneau3Cut = true;
            if (CadrillageMap.décorChangé[1][6] == true) isTonneau4Cut = true;
            if (CadrillageMap.décorChangé[2][6] == true) isTonneau5Cut = true;
            if (CadrillageMap.décorChangé[1][5] == true) isTonneau6Cut = true;
            if (CadrillageMap.décorChangé[8][6] == true) isTonneau7Cut = true;
            if (CadrillageMap.décorChangé[7][6] == true) isTonneau8Cut = true;
            if (CadrillageMap.décorChangé[8][1] == true) isTonneau9Cut = true;
            if (CadrillageMap.décorChangé[7][1] == true) isTonneau10Cut = true;

            CadrillageMap.setTypeDeDécor(1, 1, "HerbesHautes");
            CadrillageMap.setTypeDeDécor(1, 2, "HerbesHautes");
            CadrillageMap.setTypeDeDécor(2, 1, "HerbesHautes");
            CadrillageMap.setTypeDeDécor(1, 6, "HerbesHautes");
            CadrillageMap.setTypeDeDécor(2, 6, "HerbesHautes");
            CadrillageMap.setTypeDeDécor(1, 5, "HerbesHautes");
            CadrillageMap.setTypeDeDécor(8, 6, "HerbesHautes");
            CadrillageMap.setTypeDeDécor(7, 6, "HerbesHautes");
            CadrillageMap.setTypeDeDécor(8, 1, "HerbesHautes");
            CadrillageMap.setTypeDeDécor(7, 1, "HerbesHautes");

            destroyBody();

            if (isTonneau1Created == false && !isTonneau1Cut) {
                Tonneau1 = ClimatMontagneux.createBodyPerso("tonneau", "static", 60, 60);
                isTonneau1Created = true;
            }
            if (isTonneau2Created == false && !isTonneau2Cut) {
                Tonneau2 = ClimatMontagneux.createBodyPerso("tonneau", "static", 60, 120);
                isTonneau2Created = true;
            }
            if (isTonneau3Created == false && !isTonneau3Cut) {
                Tonneau3 = ClimatMontagneux.createBodyPerso("tonneau", "static", 120, 60);
                isTonneau3Created = true;
            }
            if (isTonneau4Created == false && !isTonneau4Cut) {
                Tonneau4 = ClimatMontagneux.createBodyPerso("tonneau", "static", 60, 360);
                isTonneau4Created = true;
            }
            if (isTonneau5Created == false && !isTonneau5Cut) {
                Tonneau5 = ClimatMontagneux.createBodyPerso("tonneau", "static", 120, 360);
                isTonneau5Created = true;
            }
            if (isTonneau6Created == false && !isTonneau6Cut) {
                Tonneau6 = ClimatMontagneux.createBodyPerso("tonneau", "static", 60, 300);
                isTonneau6Created = true;
            }
            if (isTonneau7Created == false && !isTonneau7Cut) {
                Tonneau7 = ClimatMontagneux.createBodyPerso("tonneau", "static", 480, 360);
                isTonneau7Created = true;
            }
            if (isTonneau8Created == false && !isTonneau8Cut) {
                Tonneau8 = ClimatMontagneux.createBodyPerso("tonneau", "static", 420, 360);
                isTonneau8Created = true;
            }
            if (isTonneau9Created == false && !isTonneau9Cut) {
                Tonneau9 = ClimatMontagneux.createBodyPerso("tonneau", "static", 480, 60);
                isTonneau9Created = true;
            }
            if (isTonneau10Created == false && !isTonneau10Cut) {
                Tonneau10 = ClimatMontagneux.createBodyPerso("tonneau", "static", 420, 60);
                isTonneau10Created = true;
            }
        }
        else if ( salle == 2 ) {
            if (CadrillageMap.décorChangé[1][1] == true) isTonneau1Cut = true;
            if (CadrillageMap.décorChangé[1][2] == true) isTonneau2Cut = true;
            if (CadrillageMap.décorChangé[2][1] == true) isTonneau3Cut = true;
            if (CadrillageMap.décorChangé[1][6] == true) isTonneau4Cut = true;
            if (CadrillageMap.décorChangé[2][6] == true) isTonneau5Cut = true;
            if (CadrillageMap.décorChangé[8][5] == true) isTonneau6Cut = true;
            if (CadrillageMap.décorChangé[8][6] == true) isTonneau7Cut = true;
            if (CadrillageMap.décorChangé[7][6] == true) isTonneau8Cut = true;
            if (CadrillageMap.décorChangé[8][1] == true) isTonneau9Cut = true;
            if (CadrillageMap.décorChangé[7][1] == true) isTonneau10Cut = true;

            CadrillageMap.setTypeDeDécor(1, 1, "HerbesHautes");
            CadrillageMap.setTypeDeDécor(1, 2, "HerbesHautes");
            CadrillageMap.setTypeDeDécor(2, 1, "HerbesHautes");
            CadrillageMap.setTypeDeDécor(1, 6, "HerbesHautes");
            CadrillageMap.setTypeDeDécor(2, 6, "HerbesHautes");
            CadrillageMap.setTypeDeDécor(8, 5, "HerbesHautes");
            CadrillageMap.setTypeDeDécor(8, 6, "HerbesHautes");
            CadrillageMap.setTypeDeDécor(7, 6, "HerbesHautes");
            CadrillageMap.setTypeDeDécor(8, 1, "HerbesHautes");
            CadrillageMap.setTypeDeDécor(7, 1, "HerbesHautes");

            destroyBody();

            if (isTonneau1Created == false && !isTonneau1Cut) {
                Tonneau1 = ClimatMontagneux.createBodyPerso("tonneau", "static", 60, 60);
                isTonneau1Created = true;
            }
            if (isTonneau2Created == false && !isTonneau2Cut) {
                Tonneau2 = ClimatMontagneux.createBodyPerso("tonneau", "static", 60, 120);
                isTonneau2Created = true;
            }
            if (isTonneau3Created == false && !isTonneau3Cut) {
                Tonneau3 = ClimatMontagneux.createBodyPerso("tonneau", "static", 120, 60);
                isTonneau3Created = true;
            }
            if (isTonneau4Created == false && !isTonneau4Cut) {
                Tonneau4 = ClimatMontagneux.createBodyPerso("tonneau", "static", 60, 360);
                isTonneau4Created = true;
            }
            if (isTonneau5Created == false && !isTonneau5Cut) {
                Tonneau5 = ClimatMontagneux.createBodyPerso("tonneau", "static", 120, 360);
                isTonneau5Created = true;
            }
            if (isTonneau6Created == false && !isTonneau6Cut) {
                Tonneau6 = ClimatMontagneux.createBodyPerso("tonneau", "static", 480, 300);
                isTonneau6Created = true;
            }
            if (isTonneau7Created == false && !isTonneau7Cut) {
                Tonneau7 = ClimatMontagneux.createBodyPerso("tonneau", "static", 480, 360);
                isTonneau7Created = true;
            }
            if (isTonneau8Created == false && !isTonneau8Cut) {
                Tonneau8 = ClimatMontagneux.createBodyPerso("tonneau", "static", 420, 360);
                isTonneau8Created = true;
            }
            if (isTonneau9Created == false && !isTonneau9Cut) {
                Tonneau9 = ClimatMontagneux.createBodyPerso("tonneau", "static", 480, 60);
                isTonneau9Created = true;
            }
            if (isTonneau10Created == false && !isTonneau10Cut) {
                Tonneau10 = ClimatMontagneux.createBodyPerso("tonneau", "static", 420, 60);
                isTonneau10Created = true;
            }
        }
        else if ( salle == 3 ) {
            if (CadrillageMap.décorChangé[1][1] == true) isTonneau1Cut = true;
            if (CadrillageMap.décorChangé[8][2] == true) isTonneau2Cut = true;
            if (CadrillageMap.décorChangé[2][1] == true) isTonneau3Cut = true;
            if (CadrillageMap.décorChangé[1][6] == true) isTonneau4Cut = true;
            if (CadrillageMap.décorChangé[2][6] == true) isTonneau5Cut = true;
            if (CadrillageMap.décorChangé[1][5] == true) isTonneau6Cut = true;
            if (CadrillageMap.décorChangé[8][6] == true) isTonneau7Cut = true;
            if (CadrillageMap.décorChangé[7][6] == true) isTonneau8Cut = true;
            if (CadrillageMap.décorChangé[8][1] == true) isTonneau9Cut = true;
            if (CadrillageMap.décorChangé[7][1] == true) isTonneau10Cut = true;

            CadrillageMap.setTypeDeDécor(1, 1, "HerbesHautes");
            CadrillageMap.setTypeDeDécor(8, 2, "HerbesHautes");
            CadrillageMap.setTypeDeDécor(2, 1, "HerbesHautes");
            CadrillageMap.setTypeDeDécor(1, 6, "HerbesHautes");
            CadrillageMap.setTypeDeDécor(2, 6, "HerbesHautes");
            CadrillageMap.setTypeDeDécor(1, 5, "HerbesHautes");
            CadrillageMap.setTypeDeDécor(8, 6, "HerbesHautes");
            CadrillageMap.setTypeDeDécor(7, 6, "HerbesHautes");
            CadrillageMap.setTypeDeDécor(8, 1, "HerbesHautes");
            CadrillageMap.setTypeDeDécor(7, 1, "HerbesHautes");

            destroyBody();

            if (isTonneau1Created == false && !isTonneau1Cut) {
                Tonneau1 = ClimatMontagneux.createBodyPerso("tonneau", "static", 60, 60);
                isTonneau1Created = true;
            }
            if (isTonneau2Created == false && !isTonneau2Cut) {
                Tonneau2 = ClimatMontagneux.createBodyPerso("tonneau", "static", 480, 120);
                isTonneau2Created = true;
            }
            if (isTonneau3Created == false && !isTonneau3Cut) {
                Tonneau3 = ClimatMontagneux.createBodyPerso("tonneau", "static", 120, 60);
                isTonneau3Created = true;
            }
            if (isTonneau4Created == false && !isTonneau4Cut) {
                Tonneau4 = ClimatMontagneux.createBodyPerso("tonneau", "static", 60, 360);
                isTonneau4Created = true;
            }
            if (isTonneau5Created == false && !isTonneau5Cut) {
                Tonneau5 = ClimatMontagneux.createBodyPerso("tonneau", "static", 120, 360);
                isTonneau5Created = true;
            }
            if (isTonneau6Created == false && !isTonneau6Cut) {
                Tonneau6 = ClimatMontagneux.createBodyPerso("tonneau", "static", 60, 300);
                isTonneau6Created = true;
            }
            if (isTonneau7Created == false && !isTonneau7Cut) {
                Tonneau7 = ClimatMontagneux.createBodyPerso("tonneau", "static", 480, 360);
                isTonneau7Created = true;
            }
            if (isTonneau8Created == false && !isTonneau8Cut) {
                Tonneau8 = ClimatMontagneux.createBodyPerso("tonneau", "static", 420, 360);
                isTonneau8Created = true;
            }
            if (isTonneau9Created == false && !isTonneau9Cut) {
                Tonneau9 = ClimatMontagneux.createBodyPerso("tonneau", "static", 480, 60);
                isTonneau9Created = true;
            }
            if (isTonneau10Created == false && !isTonneau10Cut) {
                Tonneau10 = ClimatMontagneux.createBodyPerso("tonneau", "static", 420, 60);
                isTonneau10Created = true;
            }
        }
        else if ( salle == 4 ) {
            if (CadrillageMap.décorChangé[1][1] == true) isTonneau1Cut = true;
            if (CadrillageMap.décorChangé[8][2] == true) isTonneau2Cut = true;
            if (CadrillageMap.décorChangé[2][1] == true) isTonneau3Cut = true;
            if (CadrillageMap.décorChangé[1][6] == true) isTonneau4Cut = true;
            if (CadrillageMap.décorChangé[2][6] == true) isTonneau5Cut = true;
            if (CadrillageMap.décorChangé[8][5] == true) isTonneau6Cut = true;
            if (CadrillageMap.décorChangé[8][6] == true) isTonneau7Cut = true;
            if (CadrillageMap.décorChangé[7][6] == true) isTonneau8Cut = true;
            if (CadrillageMap.décorChangé[8][1] == true) isTonneau9Cut = true;
            if (CadrillageMap.décorChangé[7][1] == true) isTonneau10Cut = true;

            CadrillageMap.setTypeDeDécor(1, 1, "HerbesHautes");
            CadrillageMap.setTypeDeDécor(8, 2, "HerbesHautes");
            CadrillageMap.setTypeDeDécor(2, 1, "HerbesHautes");
            CadrillageMap.setTypeDeDécor(1, 6, "HerbesHautes");
            CadrillageMap.setTypeDeDécor(2, 6, "HerbesHautes");
            CadrillageMap.setTypeDeDécor(8, 5, "HerbesHautes");
            CadrillageMap.setTypeDeDécor(8, 6, "HerbesHautes");
            CadrillageMap.setTypeDeDécor(7, 6, "HerbesHautes");
            CadrillageMap.setTypeDeDécor(8, 1, "HerbesHautes");
            CadrillageMap.setTypeDeDécor(7, 1, "HerbesHautes");

            destroyBody();

            if (isTonneau1Created == false && !isTonneau1Cut) {
                Tonneau1 = ClimatMontagneux.createBodyPerso("tonneau", "static", 60, 60);
                isTonneau1Created = true;
            }
            if (isTonneau2Created == false && !isTonneau2Cut) {
                Tonneau2 = ClimatMontagneux.createBodyPerso("tonneau", "static", 480, 120);
                isTonneau2Created = true;
            }
            if (isTonneau3Created == false && !isTonneau3Cut) {
                Tonneau3 = ClimatMontagneux.createBodyPerso("tonneau", "static", 120, 60);
                isTonneau3Created = true;
            }
            if (isTonneau4Created == false && !isTonneau4Cut) {
                Tonneau4 = ClimatMontagneux.createBodyPerso("tonneau", "static", 60, 360);
                isTonneau4Created = true;
            }
            if (isTonneau5Created == false && !isTonneau5Cut) {
                Tonneau5 = ClimatMontagneux.createBodyPerso("tonneau", "static", 120, 360);
                isTonneau5Created = true;
            }
            if (isTonneau6Created == false && !isTonneau6Cut) {
                Tonneau6 = ClimatMontagneux.createBodyPerso("tonneau", "static", 480, 300);
                isTonneau6Created = true;
            }
            if (isTonneau7Created == false && !isTonneau7Cut) {
                Tonneau7 = ClimatMontagneux.createBodyPerso("tonneau", "static", 480, 360);
                isTonneau7Created = true;
            }
            if (isTonneau8Created == false && !isTonneau8Cut) {
                Tonneau8 = ClimatMontagneux.createBodyPerso("tonneau", "static", 420, 360);
                isTonneau8Created = true;
            }
            if (isTonneau9Created == false && !isTonneau9Cut) {
                Tonneau9 = ClimatMontagneux.createBodyPerso("tonneau", "static", 480, 60);
                isTonneau9Created = true;
            }
            if (isTonneau10Created == false && !isTonneau10Cut) {
                Tonneau10 = ClimatMontagneux.createBodyPerso("tonneau", "static", 420, 60);
                isTonneau10Created = true;
            }
        }
        else if ( salle == 5 ) {
            if (CadrillageMap.décorChangé[1][1] == true) isTonneau1Cut = true;
            if (CadrillageMap.décorChangé[8][2] == true) isTonneau2Cut = true;
            if (CadrillageMap.décorChangé[2][1] == true) isTonneau3Cut = true;
            if (CadrillageMap.décorChangé[1][6] == true) isTonneau4Cut = true;
            if (CadrillageMap.décorChangé[2][6] == true) isTonneau5Cut = true;
            if (CadrillageMap.décorChangé[1][2] == true) isTonneau6Cut = true;
            if (CadrillageMap.décorChangé[8][6] == true) isTonneau7Cut = true;
            if (CadrillageMap.décorChangé[7][6] == true) isTonneau8Cut = true;
            if (CadrillageMap.décorChangé[8][1] == true) isTonneau9Cut = true;
            if (CadrillageMap.décorChangé[7][1] == true) isTonneau10Cut = true;

            CadrillageMap.setTypeDeDécor(1, 1, "HerbesHautes");
            CadrillageMap.setTypeDeDécor(8, 2, "HerbesHautes");
            CadrillageMap.setTypeDeDécor(2, 1, "HerbesHautes");
            CadrillageMap.setTypeDeDécor(1, 6, "HerbesHautes");
            CadrillageMap.setTypeDeDécor(2, 6, "HerbesHautes");
            CadrillageMap.setTypeDeDécor(1, 2, "HerbesHautes");
            CadrillageMap.setTypeDeDécor(8, 6, "HerbesHautes");
            CadrillageMap.setTypeDeDécor(7, 6, "HerbesHautes");
            CadrillageMap.setTypeDeDécor(8, 1, "HerbesHautes");
            CadrillageMap.setTypeDeDécor(7, 1, "HerbesHautes");

            destroyBody();

            if (isTonneau1Created == false && !isTonneau1Cut) {
                Tonneau1 = ClimatMontagneux.createBodyPerso("tonneau", "static", 60, 60);
                isTonneau1Created = true;
            }
            if (isTonneau2Created == false && !isTonneau2Cut) {
                Tonneau2 = ClimatMontagneux.createBodyPerso("tonneau", "static", 480, 120);
                isTonneau2Created = true;
            }
            if (isTonneau3Created == false && !isTonneau3Cut) {
                Tonneau3 = ClimatMontagneux.createBodyPerso("tonneau", "static", 120, 60);
                isTonneau3Created = true;
            }
            if (isTonneau4Created == false && !isTonneau4Cut) {
                Tonneau4 = ClimatMontagneux.createBodyPerso("tonneau", "static", 60, 360);
                isTonneau4Created = true;
            }
            if (isTonneau5Created == false && !isTonneau5Cut) {
                Tonneau5 = ClimatMontagneux.createBodyPerso("tonneau", "static", 120, 360);
                isTonneau5Created = true;
            }
            if (isTonneau6Created == false && !isTonneau6Cut) {
                Tonneau6 = ClimatMontagneux.createBodyPerso("tonneau", "static", 60, 120);
                isTonneau6Created = true;
            }
            if (isTonneau7Created == false && !isTonneau7Cut) {
                Tonneau7 = ClimatMontagneux.createBodyPerso("tonneau", "static", 480, 360);
                isTonneau7Created = true;
            }
            if (isTonneau8Created == false && !isTonneau8Cut) {
                Tonneau8 = ClimatMontagneux.createBodyPerso("tonneau", "static", 420, 360);
                isTonneau8Created = true;
            }
            if (isTonneau9Created == false && !isTonneau9Cut) {
                Tonneau9 = ClimatMontagneux.createBodyPerso("tonneau", "static", 480, 60);
                isTonneau9Created = true;
            }
            if (isTonneau10Created == false && !isTonneau10Cut) {
                Tonneau10 = ClimatMontagneux.createBodyPerso("tonneau", "static", 420, 60);
                isTonneau10Created = true;
            }
        }
        else if ( salle == 6 ) {
            if (CadrillageMap.décorChangé[1][1] == true) isTonneau1Cut = true;
            if (CadrillageMap.décorChangé[1][5] == true) isTonneau2Cut = true;
            if (CadrillageMap.décorChangé[2][1] == true) isTonneau3Cut = true;
            if (CadrillageMap.décorChangé[1][6] == true) isTonneau4Cut = true;
            if (CadrillageMap.décorChangé[2][6] == true) isTonneau5Cut = true;
            if (CadrillageMap.décorChangé[8][5] == true) isTonneau6Cut = true;
            if (CadrillageMap.décorChangé[8][6] == true) isTonneau7Cut = true;
            if (CadrillageMap.décorChangé[7][6] == true) isTonneau8Cut = true;
            if (CadrillageMap.décorChangé[8][1] == true) isTonneau9Cut = true;
            if (CadrillageMap.décorChangé[7][1] == true) isTonneau10Cut = true;

            CadrillageMap.setTypeDeDécor(1, 1, "HerbesHautes");
            CadrillageMap.setTypeDeDécor(1, 5, "HerbesHautes");
            CadrillageMap.setTypeDeDécor(2, 1, "HerbesHautes");
            CadrillageMap.setTypeDeDécor(1, 6, "HerbesHautes");
            CadrillageMap.setTypeDeDécor(2, 6, "HerbesHautes");
            CadrillageMap.setTypeDeDécor(8, 5, "HerbesHautes");
            CadrillageMap.setTypeDeDécor(8, 6, "HerbesHautes");
            CadrillageMap.setTypeDeDécor(7, 6, "HerbesHautes");
            CadrillageMap.setTypeDeDécor(8, 1, "HerbesHautes");
            CadrillageMap.setTypeDeDécor(7, 1, "HerbesHautes");

            destroyBody();

            if (isTonneau1Created == false && !isTonneau1Cut) {
                Tonneau1 = ClimatMontagneux.createBodyPerso("tonneau", "static", 60, 60);
                isTonneau1Created = true;
            }
            if (isTonneau2Created == false && !isTonneau2Cut) {
                Tonneau2 = ClimatMontagneux.createBodyPerso("tonneau", "static", 60, 300);
                isTonneau2Created = true;
            }
            if (isTonneau3Created == false && !isTonneau3Cut) {
                Tonneau3 = ClimatMontagneux.createBodyPerso("tonneau", "static", 120, 60);
                isTonneau3Created = true;
            }
            if (isTonneau4Created == false && !isTonneau4Cut) {
                Tonneau4 = ClimatMontagneux.createBodyPerso("tonneau", "static", 60, 360);
                isTonneau4Created = true;
            }
            if (isTonneau5Created == false && !isTonneau5Cut) {
                Tonneau5 = ClimatMontagneux.createBodyPerso("tonneau", "static", 120, 360);
                isTonneau5Created = true;
            }
            if (isTonneau6Created == false && !isTonneau6Cut) {
                Tonneau6 = ClimatMontagneux.createBodyPerso("tonneau", "static", 480, 300);
                isTonneau6Created = true;
            }
            if (isTonneau7Created == false && !isTonneau7Cut) {
                Tonneau7 = ClimatMontagneux.createBodyPerso("tonneau", "static", 480, 360);
                isTonneau7Created = true;
            }
            if (isTonneau8Created == false && !isTonneau8Cut) {
                Tonneau8 = ClimatMontagneux.createBodyPerso("tonneau", "static", 420, 360);
                isTonneau8Created = true;
            }
            if (isTonneau9Created == false && !isTonneau9Cut) {
                Tonneau9 = ClimatMontagneux.createBodyPerso("tonneau", "static", 480, 60);
                isTonneau9Created = true;
            }
            if (isTonneau10Created == false && !isTonneau10Cut) {
                Tonneau10 = ClimatMontagneux.createBodyPerso("tonneau", "static", 420, 60);
                isTonneau10Created = true;
            }
        }


        if ( isCote1Created == false ) {
            cote1 = ClimatMontagneux.createBody(20,80,60,180);
            isCote1Created = true;
        }
        if ( isCote2Created == false ) {
            cote2 = ClimatMontagneux.createBody(560,80,60,180);
            isCote2Created = true;
        }
        if ( isCote3Created == false ) {
            cote3 = ClimatMontagneux.createBody(100,20,240,60);
            isCote3Created = true;
        }
        if ( isCote4Created == false ) {
            cote4 = ClimatMontagneux.createBody(100,440,240,60);
            isCote4Created = true;
        }
        if ( isCote5Created == false ) {
            cote5 = ClimatMontagneux.createBody(460,20,240,60);
            isCote5Created = true;
        }
        if ( isCote6Created == false ) {
            cote6 = ClimatMontagneux.createBody(460,440,240,60);
            isCote6Created = true;
        }
        if ( isCote7Created == false ) {
            cote7 = ClimatMontagneux.createBody(20,390,60,180);
            isCote7Created = true;
        }
        if ( isCote8Created == false ) {
            cote8 = ClimatMontagneux.createBody(560,390,60,180);
            isCote8Created = true;
        }

    }

    public static void destroyType() {
        // TODO Auto-generated method stub

        isTonneau1Cut = false;
        isTonneau2Cut = false;
        isTonneau3Cut = false;
        isTonneau4Cut = false;
        isTonneau5Cut = false;
        isTonneau6Cut = false;
        isTonneau7Cut = false;
        isTonneau8Cut = false;
        isTonneau9Cut = false;
        isTonneau10Cut = false;
    }
}
