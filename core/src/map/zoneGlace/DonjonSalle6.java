package map.zoneGlace;

import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.physics.box2d.Body;
import com.badlogic.gdx.physics.box2d.World;
import com.mygdx.game.GameMain;

import decors.ClimatMontagneux;
import items.Torche;
import map.CadrillageMap;
import scenes.MainMenu;

/**
 * Created by arnOo on 02/05/2017.
 */

public class DonjonSalle6 extends Sprite {

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

    public static Body torche1;
    public static boolean istorche1Created;
    public static Body torche2;
    public static boolean istorche2Created;

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
        game.getBatch().draw(ClimatMontagneux.murSombreGlacéCentre, 0+ x, 180+ y);
        game.getBatch().draw(ClimatMontagneux.murSombreGlacéCentre, 0+ x, 240+ y);
        game.getBatch().draw(ClimatMontagneux.murSombreGlacéCentre, 0+ x, 300+ y);
        game.getBatch().draw(ClimatMontagneux.murSombreGlacéCentre, 0+ x, 360+ y);
        game.getBatch().draw(ClimatMontagneux.murSombreGlacéCentre, 0+ x, 420+ y);

        game.getBatch().draw(ClimatMontagneux.murSombreGlacéCentre, 60+ x, 0+ y);
        game.getBatch().draw(ClimatMontagneux.murSombreGlacéCentre, 180+ x, 0+ y);
        game.getBatch().draw(ClimatMontagneux.murSombreGlacéCentre, 240+ x, 0+ y);
        game.getBatch().draw(ClimatMontagneux.murSombreGlacéCentre, 300+ x, 0+ y);
        game.getBatch().draw(ClimatMontagneux.murSombreGlacéCentre, 360+ x, 0+ y);
        game.getBatch().draw(ClimatMontagneux.murSombreGlacéCentre, 420+ x, 0+ y);
        game.getBatch().draw(ClimatMontagneux.murSombreGlacéCentre, 480+ x, 0+ y);

        game.getBatch().draw(ClimatMontagneux.murSombreGlacéCentre, 60+ x, 420+ y);
        game.getBatch().draw(ClimatMontagneux.murSombreGlacéCentre, 120+ x, 420+ y);
        game.getBatch().draw(ClimatMontagneux.murSombreGlacéCentre, 180+ x, 420+ y);
        game.getBatch().draw(ClimatMontagneux.murSombreGlacéCentre, 240+ x, 420+ y);
        game.getBatch().draw(ClimatMontagneux.murSombreGlacéCentre, 300+ x, 420+ y);
        game.getBatch().draw(ClimatMontagneux.murSombreGlacéCentre, 360+ x, 420+ y);
        game.getBatch().draw(ClimatMontagneux.murSombreGlacéCentre, 420+ x, 420+ y);
        game.getBatch().draw(ClimatMontagneux.murSombreGlacéCentre, 480+ x, 420+ y);

        game.getBatch().draw(ClimatMontagneux.murSombreGlacéCentre, 540+ x, 0+ y);
        game.getBatch().draw(ClimatMontagneux.murSombreGlacéCentre, 540+ x, 60+ y);
        game.getBatch().draw(ClimatMontagneux.murSombreGlacéCentre, 540+ x, 120+ y);
        game.getBatch().draw(ClimatMontagneux.murSombreGlacéCentre, 540+ x, 180+ y);
        game.getBatch().draw(ClimatMontagneux.murSombreGlacéCentre, 540+ x, 240+ y);
        game.getBatch().draw(ClimatMontagneux.murSombreGlacéCentre, 540+ x, 300+ y);
        game.getBatch().draw(ClimatMontagneux.murSombreGlacéCentre, 540+ x, 360+ y);
        game.getBatch().draw(ClimatMontagneux.murSombreGlacéCentre, 540+ x, 420+ y);

//

        game.getBatch().draw(ClimatMontagneux.murSombre2GlacéCentre, 120+ x, 240+ y);
        game.getBatch().draw(ClimatMontagneux.murSombre2GlacéCentre, 120+ x, 300+ y);
        game.getBatch().draw(ClimatMontagneux.murSombre2GlacéGauche, 120+ x, 180+ y);
        game.getBatch().draw(ClimatMontagneux.murSombre2GlacéCentre, 180+ x, 180+ y);
        game.getBatch().draw(ClimatMontagneux.escalierGlacéSombre2, 240+ x, 180+ y);
        game.getBatch().draw(ClimatMontagneux.murSombre2GlacéDroite, 360+ x, 180+ y);
        game.getBatch().draw(ClimatMontagneux.murSombre2GlacéCentre, 300+ x, 180+ y);
        game.getBatch().draw(ClimatMontagneux.murSombre2GlacéCentre, 360+ x, 240+ y);
        game.getBatch().draw(ClimatMontagneux.murSombre2GlacéCentre, 360+ x, 300+ y);

        game.getBatch().draw(ClimatMontagneux.piedGlacéSupSombre2, 120+ x, 120+ y);
        game.getBatch().draw(ClimatMontagneux.piedGlacéSupSombre2, 180+ x, 120+ y);
        game.getBatch().draw(ClimatMontagneux.piedGlacéSupSombre2, 300+ x, 120+ y);
        game.getBatch().draw(ClimatMontagneux.piedGlacéSupSombre2, 360+ x, 120+ y);

        game.getBatch().draw(ClimatMontagneux.bordGlacéSupGauSombre2, 180+ x, 300+ y);
        game.getBatch().draw(ClimatMontagneux.bordGlacéSupSombre2, 240+ x, 300+ y);
        game.getBatch().draw(ClimatMontagneux.bordGlacéSupDroiSombre2, 300+ x, 300+ y);
        game.getBatch().draw(ClimatMontagneux.bordGlacéInfGauSombre2, 180+ x, 240+ y);
        game.getBatch().draw(ClimatMontagneux.bordGlacéInfDroiSombre2, 300+ x, 240+ y);

//
        ClimatMontagneux.tonneau(isTonneau1Cut ,  game , 480 + x , 120 + y);
        ClimatMontagneux.tonneau(isTonneau2Cut ,  game , 480 + x , 180 + y);
        ClimatMontagneux.tonneau(isTonneau3Cut ,  game , 480 + x , 240 + y);
        ClimatMontagneux.tonneau(isTonneau4Cut ,  game , 480 + x , 300 + y);
        ClimatMontagneux.tonneau(isTonneau6Cut ,  game , 420 + x , 180 + y);
        ClimatMontagneux.tonneau(isTonneau7Cut ,  game , 420 + x , 240 + y);

        ClimatMontagneux.tonneau(isTonneau5Cut ,  game , 480 + x , 360 + y);

        ClimatMontagneux.crate(isTonneau10Cut ,  game , 360 + x , 360 + y);
        ClimatMontagneux.crate(isTonneau8Cut ,  game , 120 + x , 360 + y);
        if ( isTonneau8Cut ) game.getBatch().draw(ClimatMontagneux.escalier,120+x,360+y);
        ClimatMontagneux.crate(isTonneau9Cut ,  game , 180 + x , 360 + y);

        ClimatMontagneux.annimationTorche(game,60+ x,60+ y);
        ClimatMontagneux.annimationTorche(game,480+ x,60+ y);
        ClimatMontagneux.annimationTorche(game,60+ x,360+ y);

        if (Torche.isTorchePrise == false ) game.getBatch().draw(Torche.torcheT, 240+ x, 300+ y);
        if ( MainMenu.Link.annimationAward ) {
            game.getBatch().draw(Torche.torcheT, MainMenu.Link.getX() - 10, MainMenu.Link.getY() + 50);
            game.getBatch().draw(Torche.texteTorche, 100 + x, 60+y);
        }

        PlacementMainZoneGlace.détectionEscalier(MainMenu.Link);
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


        if ( istorche1Created) MainMenu.world.destroyBody(torche1);
        istorche1Created = false;
        if ( istorche2Created) MainMenu.world.destroyBody(torche2);
        istorche2Created = false;
    }

    public static void createBodyAndType(World world) {
        // TODO Auto-generated method stub

        if ( CadrillageMap.décorChangé[8][2] == true ) isTonneau1Cut = true;
        if ( CadrillageMap.décorChangé[8][3] == true ) isTonneau2Cut = true;
        if ( CadrillageMap.décorChangé[8][4] == true ) isTonneau3Cut = true;
        if ( CadrillageMap.décorChangé[8][5] == true ) isTonneau4Cut = true;
        if ( CadrillageMap.décorChangé[8][6] == true ) isTonneau5Cut = true;
        if ( CadrillageMap.décorChangé[7][3] == true ) isTonneau6Cut = true;
        if ( CadrillageMap.décorChangé[7][4] == true ) isTonneau7Cut = true;
        if ( CadrillageMap.décorChangé[2][6] == true ) isTonneau8Cut = true;
        if ( CadrillageMap.décorChangé[3][6] == true ) isTonneau9Cut = true;
        if ( CadrillageMap.décorChangé[6][6] == true ) isTonneau10Cut = true;

        CadrillageMap.setTypeDeDécor(8,2,"HerbesHautes");
        CadrillageMap.setTypeDeDécor(8,3,"HerbesHautes");
        CadrillageMap.setTypeDeDécor(8,4,"HerbesHautes");
        CadrillageMap.setTypeDeDécor(8,5,"HerbesHautes");
        CadrillageMap.setTypeDeDécor(8,6,"HerbesHautes");
        CadrillageMap.setTypeDeDécor(7,3,"HerbesHautes");
        CadrillageMap.setTypeDeDécor(7,4,"HerbesHautes");
        if ( ! isTonneau8Cut) CadrillageMap.setTypeDeDécor(2,6,"HerbesHautes");
        else CadrillageMap.setTypeDeDécor(2,6,"Escalier");
        CadrillageMap.setTypeDeDécor(3,6,"HerbesHautes");
        CadrillageMap.setTypeDeDécor(6,6,"HerbesHautes");

        destroyBody();

        if ( isCote1Created == false  ) {
            cote1 = ClimatMontagneux.createBody(20,240,60,480);
            isCote1Created = true;
        }
        if ( isCote2Created == false ) {
            cote2 = ClimatMontagneux.createBody(560,240,60,480);
            isCote2Created = true;
        }
        if ( isCote3Created == false) {
            cote3 = ClimatMontagneux.createBody(40,50,120,100);
            isCote3Created = true;
        }
        if ( isCote4Created == false ) {
            cote4 = ClimatMontagneux.createBody(300,440,600,60);
            isCote4Created = true;
        }
        if ( isCote5Created == false ) {
            cote5 = ClimatMontagneux.createBody(340,20,360,60);
            isCote5Created = true;
        }
        if ( isCote6Created == false ) {
            cote6 = ClimatMontagneux.createBody(140,270,60,180);
            isCote6Created = true;
        }
        if ( isCote7Created == false ) {
            cote7 = ClimatMontagneux.createBody(380,270,60,180);
            isCote7Created = true;
        }
        if ( isCote8Created == false ) {
            cote8 = ClimatMontagneux.createBody(190,210,60,60);
            isCote8Created = true;
        }
        if ( isCote9Created == false ) {
            cote9 = ClimatMontagneux.createBody(310,210,60,60);
            isCote9Created = true;
        }
        if ( isCote10Created == false ) {
            cote10 = ClimatMontagneux.createBody(250,360,240,1);
            isCote10Created = true;
        }



       
        if ( isTonneau1Created == false && ! isTonneau1Cut) {
            Tonneau1 = ClimatMontagneux.createBodyPerso("tonneau", "static",480,120);
            isTonneau1Created = true;
        }
        if ( isTonneau2Created == false && ! isTonneau2Cut) {
            Tonneau2 = ClimatMontagneux.createBodyPerso("tonneau", "static",480,180);
            isTonneau2Created = true;
        }
        if ( isTonneau3Created == false && ! isTonneau3Cut) {
            Tonneau3 = ClimatMontagneux.createBodyPerso("tonneau", "static",480,240);
            isTonneau3Created = true;
        }
        if ( isTonneau4Created == false && ! isTonneau4Cut) {
            Tonneau4 = ClimatMontagneux.createBodyPerso("tonneau", "static",480,300);
            isTonneau4Created = true;
        }
        if ( isTonneau5Created == false && ! isTonneau5Cut) {
            Tonneau5 = ClimatMontagneux.createBodyPerso("tonneau", "static",480,360);
            isTonneau5Created = true;
        }
        if ( isTonneau6Created == false && ! isTonneau6Cut) {
            Tonneau6 = ClimatMontagneux.createBodyPerso("tonneau", "static",420,180);
            isTonneau6Created = true;
        }
        if ( isTonneau7Created == false && ! isTonneau7Cut) {
            Tonneau7 = ClimatMontagneux.createBodyPerso("tonneau", "static",420,240);
            isTonneau7Created = true;
        }
        if ( isTonneau8Created == false && ! isTonneau8Cut) {
            Tonneau8 = ClimatMontagneux.createBodyPerso("tonneau", "static",120,360);
            isTonneau8Created = true;
        }
        if ( isTonneau9Created == false && ! isTonneau9Cut) {
            Tonneau9 = ClimatMontagneux.createBodyPerso("tonneau", "static",180,360);
            isTonneau9Created = true;
        }
        if ( isTonneau10Created == false && ! isTonneau10Cut) {
            Tonneau10 = ClimatMontagneux.createBodyPerso("tonneau", "static",360,360);
            isTonneau10Created = true;
        }

        if ( istorche1Created == false ) {
            torche1 = ClimatMontagneux.createBody( 8*60 +15 ,1*60 +15 ,60,60);
            istorche1Created = true;
        }
        if ( istorche2Created == false ) {
            torche2 = ClimatMontagneux.createBody( 1*60 +15 ,6*60 +15 ,60,60);
            istorche2Created = true;
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