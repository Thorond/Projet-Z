package map.zoneGlace;

import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.physics.box2d.Body;
import com.badlogic.gdx.physics.box2d.World;
import com.mygdx.game.GameMain;

import characters.MainCharacter;
import decors.ClimatMontagneux;
import items.Arc;
import map.CadrillageMap;
import scenes.MainMenu;

/**
 * Created by arnOo on 08/04/2017.
 */

public class GrotteI1Salle3 extends Sprite {

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

    public static void sousMap(GameMain game, int x, int y){

        détectionLink(MainMenu.Link);

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

        game.getBatch().draw(ClimatMontagneux.carreauSombre, 60+ x, 60+ y);
        game.getBatch().draw(ClimatMontagneux.carreauSombre, 60+ x, 120+ y);
        game.getBatch().draw(ClimatMontagneux.carreauSombre, 60+ x, 180+ y);
        game.getBatch().draw(ClimatMontagneux.carreauSombre, 60+ x, 240+ y);
        game.getBatch().draw(ClimatMontagneux.carreauSombre, 60+ x, 300+ y);
        game.getBatch().draw(ClimatMontagneux.carreauSombre, 60+ x, 360+ y);

        game.getBatch().draw(ClimatMontagneux.carreauSombre, 120+ x, 60+ y);
        game.getBatch().draw(ClimatMontagneux.carreauSombre, 120+ x, 120+ y);
        game.getBatch().draw(ClimatMontagneux.carreauSombre, 120+ x, 180+ y);
        game.getBatch().draw(ClimatMontagneux.carreauSombre, 120+ x, 240+ y);
        game.getBatch().draw(ClimatMontagneux.carreauSombre, 120+ x, 300+ y);
        game.getBatch().draw(ClimatMontagneux.carreauSombre, 120+ x, 360+ y);

        game.getBatch().draw(ClimatMontagneux.carreauSombre, 180+ x, 60+ y);
        game.getBatch().draw(ClimatMontagneux.carreauSombre, 180+ x, 120+ y);
        game.getBatch().draw(ClimatMontagneux.carreauSombre, 180+ x, 180+ y);
        game.getBatch().draw(ClimatMontagneux.carreauSombre, 180+ x, 240+ y);
        game.getBatch().draw(ClimatMontagneux.carreauSombre, 180+ x, 300+ y);
        game.getBatch().draw(ClimatMontagneux.carreauSombre, 180+ x, 360+ y);

        game.getBatch().draw(ClimatMontagneux.carreauSombre, 240+ x, 60+ y);
        game.getBatch().draw(ClimatMontagneux.carreauSombre, 240+ x, 120+ y);
        game.getBatch().draw(ClimatMontagneux.carreauSombre, 240+ x, 180+ y);
        game.getBatch().draw(ClimatMontagneux.carreauSombre, 240+ x, 240+ y);
        game.getBatch().draw(ClimatMontagneux.carreauSombre, 240+ x, 300+ y);
        game.getBatch().draw(ClimatMontagneux.carreauSombre, 240+ x, 360+ y);

        game.getBatch().draw(ClimatMontagneux.carreauSombre, 300+ x, 60+ y);
        game.getBatch().draw(ClimatMontagneux.carreauSombre, 300+ x, 120+ y);
        game.getBatch().draw(ClimatMontagneux.carreauSombre, 300+ x, 180+ y);
        game.getBatch().draw(ClimatMontagneux.carreauSombre, 300+ x, 240+ y);
        game.getBatch().draw(ClimatMontagneux.carreauSombre, 300+ x, 300+ y);
        game.getBatch().draw(ClimatMontagneux.carreauSombre, 300+ x, 360+ y);

        game.getBatch().draw(ClimatMontagneux.carreauSombre, 360+ x, 60+ y);
        game.getBatch().draw(ClimatMontagneux.carreauSombre, 360+ x, 120+ y);
        game.getBatch().draw(ClimatMontagneux.carreauSombre, 360+ x, 180+ y);
        game.getBatch().draw(ClimatMontagneux.carreauSombre, 360+ x, 240+ y);
        game.getBatch().draw(ClimatMontagneux.carreauSombre, 360+ x, 300+ y);
        game.getBatch().draw(ClimatMontagneux.carreauSombre, 360+ x, 360+ y);

        game.getBatch().draw(ClimatMontagneux.carreauSombre, 420+ x, 60+ y);
        game.getBatch().draw(ClimatMontagneux.carreauSombre, 420+ x, 120+ y);
        game.getBatch().draw(ClimatMontagneux.carreauSombre, 420+ x, 180+ y);
        game.getBatch().draw(ClimatMontagneux.carreauSombre, 420+ x, 240+ y);
        game.getBatch().draw(ClimatMontagneux.carreauSombre, 420+ x, 300+ y);
        game.getBatch().draw(ClimatMontagneux.carreauSombre, 420+ x, 360+ y);

        game.getBatch().draw(ClimatMontagneux.carreauSombre, 480+ x, 60+ y);
        game.getBatch().draw(ClimatMontagneux.carreauSombre, 480+ x, 120+ y);
        game.getBatch().draw(ClimatMontagneux.carreauSombre, 480+ x, 180+ y);
        game.getBatch().draw(ClimatMontagneux.carreauSombre, 480+ x, 240+ y);
        game.getBatch().draw(ClimatMontagneux.carreauSombre, 480+ x, 300+ y);
        game.getBatch().draw(ClimatMontagneux.carreauSombre, 480+ x, 360+ y);

        game.getBatch().draw(ClimatMontagneux.murSombreGlacéCentre, 0+ x, 0+ y);
        game.getBatch().draw(ClimatMontagneux.murSombreGlacéCentre, 0+ x, 60+ y);
        game.getBatch().draw(ClimatMontagneux.murSombreGlacéCentre, 0+ x, 120+ y);
        game.getBatch().draw(ClimatMontagneux.murSombreGlacéCentre, 0+ x, 300+ y);
        game.getBatch().draw(ClimatMontagneux.murSombreGlacéCentre, 0+ x, 360+ y);
        game.getBatch().draw(ClimatMontagneux.murSombreGlacéCentre, 0+ x, 420+ y);

        game.getBatch().draw(ClimatMontagneux.murSombreGlacéCentre, 60+ x, 0+ y);
        game.getBatch().draw(ClimatMontagneux.murSombreGlacéCentre, 120+ x, 0+ y);
        game.getBatch().draw(ClimatMontagneux.murSombreGlacéCentre, 180+ x, 0+ y);
        game.getBatch().draw(ClimatMontagneux.murSombreGlacéCentre, 240+ x, 0+ y);
        game.getBatch().draw(ClimatMontagneux.murSombreGlacéCentre, 300+ x, 0+ y);
        game.getBatch().draw(ClimatMontagneux.murSombreGlacéCentre, 360+ x, 0+ y);
        game.getBatch().draw(ClimatMontagneux.murSombreGlacéCentre, 420+ x, 0+ y);
        game.getBatch().draw(ClimatMontagneux.murSombreGlacéCentre, 480+ x, 0+ y);

        game.getBatch().draw(ClimatMontagneux.meurtrière, 60+ x, 420+ y);
        game.getBatch().draw(ClimatMontagneux.meurtrière, 120+ x, 420+ y);
        game.getBatch().draw(ClimatMontagneux.meurtrière, 180+ x, 420+ y);
        game.getBatch().draw(ClimatMontagneux.meurtrière, 240+ x, 420+ y);
        game.getBatch().draw(ClimatMontagneux.meurtrière, 300+ x, 420+ y);
        game.getBatch().draw(ClimatMontagneux.meurtrière, 360+ x, 420+ y);
        game.getBatch().draw(ClimatMontagneux.meurtrière, 420+ x, 420+ y);
        game.getBatch().draw(ClimatMontagneux.meurtrière, 480+ x, 420+ y);

        game.getBatch().draw(ClimatMontagneux.murSombreGlacéCentre, 540+ x, 0+ y);
        game.getBatch().draw(ClimatMontagneux.murSombreGlacéCentre, 540+ x, 60+ y);
        game.getBatch().draw(ClimatMontagneux.murSombreGlacéCentre, 540+ x, 120+ y);
        game.getBatch().draw(ClimatMontagneux.murSombreGlacéCentre, 540+ x, 300+ y);
        game.getBatch().draw(ClimatMontagneux.murSombreGlacéCentre, 540+ x, 360+ y);
        game.getBatch().draw(ClimatMontagneux.murSombreGlacéCentre, 540+ x, 420+ y);
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
    }

    public static void createBodyAndType(World world) {
        // TODO Auto-generated method stub
        CadrillageMap.setTypeDeDécor(1,4,"piège");
        CadrillageMap.setTypeDeDécor(1,5,"piège");
        CadrillageMap.setTypeDeDécor(1,6,"piège");
        CadrillageMap.setTypeDeDécor(2,2,"piège");
        CadrillageMap.setTypeDeDécor(2,3,"piège");
        CadrillageMap.setTypeDeDécor(3,5,"piège");
        CadrillageMap.setTypeDeDécor(4,1,"piège");
        CadrillageMap.setTypeDeDécor(4,2,"piège");
        CadrillageMap.setTypeDeDécor(4,3,"piège");
        CadrillageMap.setTypeDeDécor(4,4,"piège");
        CadrillageMap.setTypeDeDécor(4,5,"piège");
        CadrillageMap.setTypeDeDécor(5,1,"piège");
        CadrillageMap.setTypeDeDécor(5,2,"piège");
        CadrillageMap.setTypeDeDécor(5,3,"piège");
        CadrillageMap.setTypeDeDécor(6,5,"piège");
        CadrillageMap.setTypeDeDécor(6,6,"piège");
        CadrillageMap.setTypeDeDécor(7,2,"piège");
        CadrillageMap.setTypeDeDécor(7,3,"piège");
        CadrillageMap.setTypeDeDécor(7,4,"piège");
        CadrillageMap.setTypeDeDécor(7,5,"piège");
        CadrillageMap.setTypeDeDécor(7,6,"piège");
        CadrillageMap.setTypeDeDécor(8,4,"piège");
        CadrillageMap.setTypeDeDécor(8,5,"piège");
        CadrillageMap.setTypeDeDécor(8,6,"piège");

        if ( isCote1Created == false ) {
            cote1 = ClimatMontagneux.createBody(20,90,60,180);
            isCote1Created = true;
        }
        if ( isCote2Created == false ) {
            cote2 = ClimatMontagneux.createBody(560,90,60,180);
            isCote2Created = true;
        }
        if ( isCote3Created == false ) {
            cote3 = ClimatMontagneux.createBody(560,390,60,180);
            isCote3Created = true;
        }
        if ( isCote4Created == false ) {
            cote4 = ClimatMontagneux.createBody(300,440,600,60);
            isCote4Created = true;
        }
        if ( isCote5Created == false ) {
            cote5 = ClimatMontagneux.createBody(300,20,600,60);
            isCote5Created = true;
        }
        if ( isCote6Created == false ) {
            cote6 = ClimatMontagneux.createBody(20,390,60,180);
            isCote6Created = true;
        }
    }

    public static void destroyType() {
        // TODO Auto-generated method stub

    }

//    ************************************************

    public static long timerUtilisationMeurtrière = System.currentTimeMillis();
    public static boolean estPassé = false; // à sauvegarder
    public static void détectionLink(MainCharacter Link){
        if ( ! estPassé ) {
            if (CadrillageMap.typeDeDécor[(int) ((Link.getBody().getPosition().x) * MainMenu.PPM / 60)][(int) ((Link.getBody().getPosition().y) * MainMenu.PPM / 60)].equals("piège")) {
                if (System.currentTimeMillis() - timerUtilisationMeurtrière > 400) {
                    Arc.utilisationNonJoueur("bas", 80, 420);
                    Arc.utilisationNonJoueur("bas", 140, 420);
                    Arc.utilisationNonJoueur("bas", 200, 420);
                    Arc.utilisationNonJoueur("bas", 260, 420);
                    Arc.utilisationNonJoueur("bas", 320, 420);
                    Arc.utilisationNonJoueur("bas", 380, 420);
                    Arc.utilisationNonJoueur("bas", 440, 420);
                    Arc.utilisationNonJoueur("bas", 500, 420);

                    Arc.utilisationNonJoueur("haut", 80, 0);
                    Arc.utilisationNonJoueur("haut", 140, 0);
                    Arc.utilisationNonJoueur("haut", 200, 0);
                    Arc.utilisationNonJoueur("haut", 260, 0);
                    Arc.utilisationNonJoueur("haut", 320, 0);
                    Arc.utilisationNonJoueur("haut", 380, 0);
                    Arc.utilisationNonJoueur("haut", 440, 0);
                    Arc.utilisationNonJoueur("haut", 500, 0);
                    timerUtilisationMeurtrière = System.currentTimeMillis();
                }

            }
            if ( ! PlacementMainZoneGlace.défilement && (Link.getBody().getPosition().x) * MainMenu.PPM > 540 ) {
                estPassé = true;
            }
        }
    }
}
