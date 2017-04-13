package map.zoneGlace;

import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.physics.box2d.Body;
import com.badlogic.gdx.physics.box2d.World;
import com.mygdx.game.GameMain;

import characters.MainCharacter;
import characters.Pnj;
import characters.Squelette;
import decors.ClimatMontagneux;
import decors.DonjonGlace;
import map.CadrillageMap;
import scenes.MainMenu;

/**
 * Created by arnOo on 11/04/2017.
 */

public class GrotteF5Salle4 extends Sprite {


    public static boolean porteGauche = false; // à sauvegarder
    public static boolean porteDroite = false; // à sauvegarder

    public static boolean premièreApparition = true; // à sauvegarder
    public static int nbrTué = 0; // à sauvegarder
    public static long timerApparition;

    public static int yClé = 480;

    public static int yCléFinal = 240;

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

    public static Squelette monstre1;
    public static Squelette monstre2;
    public static boolean m1EstCrée = false ;
    public static boolean m2EstCrée = false ;
    public static Squelette monstre3;
    public static Squelette monstre4;
    public static boolean m3EstCrée = false ;
    public static boolean m4EstCrée = false ;
    public static Squelette monstre5;
    public static Squelette monstre6;
    public static boolean m5EstCrée = false ;
    public static boolean m6EstCrée = false ;
    public static Squelette monstre7;
    public static Squelette monstre8;
    public static boolean m7EstCrée = false ;
    public static boolean m8EstCrée = false ;

    public static boolean m1EstTué = false;
    public static boolean m2EstTué = false;
    public static boolean m3EstTué = false;
    public static boolean m4EstTué = false;
    public static boolean m5EstTué = false;
    public static boolean m6EstTué = false;
    public static boolean m7EstTué = false;
    public static boolean m8EstTué = false;

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
        game.getBatch().draw(ClimatMontagneux.murSombreGlacéCentre, 240+ x, 420+ y);
        game.getBatch().draw(ClimatMontagneux.murSombreGlacéCentre, 300+ x, 420+ y);
        game.getBatch().draw(ClimatMontagneux.murSombreGlacéCentre, 360+ x, 420+ y);
        game.getBatch().draw(ClimatMontagneux.murSombreGlacéCentre, 420+ x, 420+ y);
        game.getBatch().draw(ClimatMontagneux.murSombreGlacéCentre, 480+ x, 420+ y);

        game.getBatch().draw(ClimatMontagneux.murSombreGlacéCentre, 540+ x, 0+ y);
        game.getBatch().draw(ClimatMontagneux.murSombreGlacéCentre, 540+ x, 60+ y);
        game.getBatch().draw(ClimatMontagneux.murSombreGlacéCentre, 540+ x, 120+ y);
        game.getBatch().draw(ClimatMontagneux.murSombreGlacéCentre, 540+ x, 300+ y);
        game.getBatch().draw(ClimatMontagneux.murSombreGlacéCentre, 540+ x, 360+ y);
        game.getBatch().draw(ClimatMontagneux.murSombreGlacéCentre, 540+ x, 420+ y);

        if ( porteDroite == false ){
            game.getBatch().draw(ClimatMontagneux.murSombreGlacéCentre, 540+ x, 180+ y);
            game.getBatch().draw(ClimatMontagneux.murSombreGlacéCentre, 540+ x, 240+ y);

            game.getBatch().draw(ClimatMontagneux.emplacementBombe, 480+ x, 210+ y);
        }

        if ( porteGauche == false ){
            game.getBatch().draw(ClimatMontagneux.murSombreGlacéCentre, 0+ x, 300+ y);

            game.getBatch().draw(ClimatMontagneux.emplacementBombe, 60+ x, 330+ y);
        } else {
            game.getBatch().draw(ClimatMontagneux.grossePierre, 0+ x, 300+ y);
        }


        //		==================================================================
        //		Placement des dessins des monstres
        //==================================================================

        if ( m1EstCrée && monstre1.isAlive() ) {
            game.getBatch().draw(monstre1,monstre1.getX(), monstre1.getY());
        }
        if ( m2EstCrée && monstre2.isAlive() ) {
            game.getBatch().draw(monstre2.getTexture(), monstre2.getX(), monstre2.getY());
        }
        if ( m3EstCrée && monstre3.isAlive() ) {
            game.getBatch().draw(monstre3,monstre3.getX(), monstre3.getY());
        }
        if ( m4EstCrée && monstre4.isAlive() ) {
            game.getBatch().draw(monstre4.getTexture(), monstre4.getX(), monstre4.getY());
        }
        if ( m5EstCrée && monstre5.isAlive() ) {
            game.getBatch().draw(monstre5,monstre5.getX(), monstre5.getY());
        }
        if ( m6EstCrée && monstre6.isAlive() ) {
            game.getBatch().draw(monstre6.getTexture(), monstre6.getX(), monstre6.getY());
        }
        if ( m7EstCrée && monstre7.isAlive() ) {
            game.getBatch().draw(monstre7,monstre7.getX(), monstre7.getY());
        }
        if ( m8EstCrée && monstre8.isAlive() ) {
            game.getBatch().draw(monstre8.getTexture(), monstre8.getX(), monstre8.getY());
        }
        //==================================================================
        //		      			dégats des monstres
        //==================================================================

        if ( m1EstCrée && monstre1.isAlive() ) {
            monstre1.infligéDégatLink();
        }
        if ( m2EstCrée && monstre2.isAlive() ) {
            monstre2.infligéDégatLink();
        }
        if ( m3EstCrée && monstre3.isAlive() ) {
            monstre3.infligéDégatLink();
        }
        if ( m4EstCrée && monstre4.isAlive() ) {
            monstre4.infligéDégatLink();
        }
        if ( m5EstCrée && monstre5.isAlive() ) {
            monstre5.infligéDégatLink();
        }
        if ( m6EstCrée && monstre6.isAlive() ) {
            monstre6.infligéDégatLink();
        }
        if ( m7EstCrée && monstre7.isAlive() ) {
            monstre7.infligéDégatLink();
        }
        if ( m8EstCrée && monstre8.isAlive() ) {
            monstre8.infligéDégatLink();
        }

//        ******************** récompense ***********************

        if (DonjonGlace.isCléBasseTrouvé == false && nbrTué == 8 ){
            if ( yClé > yCléFinal ) {
                yClé -= 5 ;
            }
            game.getBatch().draw(DonjonGlace.CléBasse, 180, yClé);
        }

        if ( MainMenu.Link.annimationAward ) {
            game.getBatch().draw(DonjonGlace.CléBasse, MainMenu.Link.getX() - 45, MainMenu.Link.getY() +50);
            game.getBatch().draw(DonjonGlace.texteClé, 100 + x, 10+y);
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

        //		destruction monstres
        if ( m1EstCrée )MainMenu.world.destroyBody(monstre1.getBody());
        if ( m2EstCrée )MainMenu.world.destroyBody(monstre2.getBody());
        m1EstCrée = false;
        m2EstCrée = false;
        if ( m3EstCrée )MainMenu.world.destroyBody(monstre3.getBody());
        if ( m4EstCrée )MainMenu.world.destroyBody(monstre4.getBody());
        m3EstCrée = false;
        m4EstCrée = false;
        if ( m5EstCrée )MainMenu.world.destroyBody(monstre5.getBody());
        if ( m6EstCrée )MainMenu.world.destroyBody(monstre6.getBody());
        m5EstCrée = false;
        m6EstCrée = false;
        if ( m7EstCrée )MainMenu.world.destroyBody(monstre7.getBody());
        if ( m8EstCrée )MainMenu.world.destroyBody(monstre8.getBody());
        m7EstCrée = false;
        m8EstCrée = false;

        Pnj.nbrDeMonstres = 0 ;

        m1EstTué = false;
        m2EstTué = false;
        m3EstTué = false;
        m4EstTué = false;
        m5EstTué = false;
        m6EstTué = false;
        m7EstTué = false;
        m8EstTué = false;
    }

    public static void createBodyAndType(World world) {
        // TODO Auto-generated method stub
        if ( isCote1Created == false ) {
            cote1 = ClimatMontagneux.createBody(20,240,60,480);
            isCote1Created = true;
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
            cote5 = ClimatMontagneux.createBody(460,20,240,60);
            isCote5Created = true;
        }
        if ( isCote6Created == false ) {
            cote6 = ClimatMontagneux.createBody(100,20,240,60);
            isCote6Created = true;
        }
        if ( porteDroite == false ){

            if ( isCote2Created == false ) {
                cote2 = ClimatMontagneux.createBody(560,150,60,300);
                isCote2Created = true;
            }

            if (CadrillageMap.typeDeDécor[9][3].equals("détruit")
                    || CadrillageMap.typeDeDécor[9][4].equals("détruit")) {
                porteDroite = true;
                GrotteF5Salle4.destroyBody();
            }

            CadrillageMap.setTypeDeDécor(9,3,"destructible");
            CadrillageMap.setTypeDeDécor(9,4,"destructible");




        } else {
            if ( isCote2Created == false ) {
                cote2 = ClimatMontagneux.createBody(560,90,60,180);
                isCote2Created = true;
            }
        }
// ****************************************************
        if ( porteGauche == false ){


            if (CadrillageMap.typeDeDécor[0][5].equals("détruit")) {
                porteGauche = true;
                timerApparition = System.currentTimeMillis();
            }

            CadrillageMap.setTypeDeDécor(0,5,"destructible");

        } else {

//		========================================================================================
            //		Création des corps des montres
            //========================================================================================


            if ( System.currentTimeMillis() - timerApparition > 300 ) {
                if ( m1EstCrée == false) {
                    if ( nbrTué <= 7 ){
                        if (premièreApparition)
                            monstre1 = new Squelette(world, Squelette.squeletteBas2, 60, 330, "bas");
                        else monstre1 = new Squelette(world, Squelette.squeletteBas2, 200, 330, "bas");
                        Pnj.monstres[0] = monstre1;
                        m1EstCrée = true;
                        Pnj.nbrDeMonstres ++;
                    }
                } else {
                    monstre1.déplacement();
                    monstre1.représentation();
                    monstre1.attaque(MainMenu.Link);
                    monstre1.updateBody();
                }
            }

            if ( System.currentTimeMillis() - timerApparition > 600 ) {
                if ( m2EstCrée == false) {
                    if ( nbrTué <= 6 ) {
                        if (premièreApparition)
                            monstre2 = new Squelette(world, Squelette.squeletteDroite2, 60, 340, "droite");
                        else
                            monstre2 = new Squelette(world, Squelette.squeletteDroite2, 60, 200, "droite");
                        Pnj.monstres[1] = monstre2;
                        m2EstCrée = true;
                        Pnj.nbrDeMonstres++;
                    }
                } else {
                    monstre2.déplacement();
                    monstre2.représentation();
                    monstre2.attaque(MainMenu.Link);
                    monstre2.updateBody();
                }
            }

            if (  System.currentTimeMillis() - timerApparition > 900 ) {
                if ( m3EstCrée == false) {
                    if ( nbrTué <= 5 ) {
                        if (premièreApparition)
                            monstre3 = new Squelette(world, Squelette.squeletteBas2, 50, 330, "bas");
                        else
                            monstre3 = new Squelette(world, Squelette.squeletteHaut2, 350, 120, "haut");
                        Pnj.monstres[2] = monstre3;
                        m3EstCrée = true;
                        Pnj.nbrDeMonstres++;
                    }
                } else {
                    monstre3.déplacement();
                    monstre3.représentation();
                    monstre3.attaque(MainMenu.Link);
                    monstre3.updateBody();
                }
            }

            if ( System.currentTimeMillis() - timerApparition > 1200 ) {
                if ( m4EstCrée == false) {
                    if ( nbrTué <= 4 ) {
                        if (premièreApparition)
                            monstre4 = new Squelette(world, Squelette.squeletteGauche2, 60, 330, "gauche");
                        else
                            monstre4 = new Squelette(world, Squelette.squeletteGauche2, 450, 60, "gauche");
                        Pnj.monstres[3] = monstre4;
                        m4EstCrée = true;
                        Pnj.nbrDeMonstres++;
                    }
                } else {
                    monstre4.déplacement();
                    monstre4.représentation();
                    monstre4.attaque(MainMenu.Link);
                    monstre4.updateBody();
                }
            }

            if ( System.currentTimeMillis() - timerApparition > 1500 ) {
                if ( m5EstCrée == false) {
                    if ( nbrTué <= 3 ) {
                        if (premièreApparition)
                            monstre5 = new Squelette(world, Squelette.squeletteGauche2, 70, 330, "gauche");
                        else
                            monstre5 = new Squelette(world, Squelette.squeletteGauche2, 480, 380, "gauche");
                        Pnj.monstres[4] = monstre5;
                        m5EstCrée = true;
                        Pnj.nbrDeMonstres++;
                    }
                } else {
                    monstre5.déplacement();
                    monstre5.représentation();
                    monstre5.attaque(MainMenu.Link);
                    monstre5.updateBody();
                }
            }

            if (  System.currentTimeMillis() - timerApparition > 1800 ) {
                if ( m6EstCrée == false) {
                    if ( nbrTué <= 2 ) {
                        if (premièreApparition)
                            monstre6 = new Squelette(world, Squelette.squeletteBas2, 50, 340, "bas");
                        else
                            monstre6 = new Squelette(world, Squelette.squeletteDroite2, 60, 100, "droite");
                        Pnj.monstres[5] = monstre6;
                        m6EstCrée = true;
                        Pnj.nbrDeMonstres++;
                    }
                } else {
                    monstre6.déplacement();
                    monstre6.représentation();
                    monstre6.attaque(MainMenu.Link);
                    monstre6.updateBody();
                }
            }

            if (System.currentTimeMillis() - timerApparition > 2100 ) {
                if ( m7EstCrée == false) {
                    if ( nbrTué <= 1 ) {
                        if (premièreApparition)
                            monstre7 = new Squelette(world, Squelette.squeletteGauche2, 60, 330, "gauche");
                        else
                            monstre7 = new Squelette(world, Squelette.squeletteGauche2, 300, 240, "gauche");
                        Pnj.monstres[6] = monstre7;
                        m7EstCrée = true;
                        Pnj.nbrDeMonstres++;
                    }
                } else {
                    monstre7.déplacement();
                    monstre7.représentation();
                    monstre7.attaque(MainMenu.Link);
                    monstre7.updateBody();
                }
            }

            if ( System.currentTimeMillis() - timerApparition > 2400 ) {
                if ( m8EstCrée == false) {
                    if ( nbrTué <= 0 ){
                        if (premièreApparition) {
                            monstre8 = new Squelette(world, Squelette.squeletteGauche2, 70, 330, "gauche");
                            premièreApparition = false;
                        } else
                            monstre8 = new Squelette(world, Squelette.squeletteGauche2, 360, 180, "gauche");
                        Pnj.monstres[7] = monstre8;
                        m8EstCrée = true;
                        Pnj.nbrDeMonstres ++;
                    }
                } else {
                    monstre8.déplacement();
                    monstre8.représentation();
                    monstre8.attaque(MainMenu.Link);
                    monstre8.updateBody();
                }
            }

//            ************************************
//             acquisition de l'état des monstres

            if ( m1EstCrée && ! monstre1.isAlive() && ! m1EstTué) {
                nbrTué ++ ;
                m1EstTué = true;
            }
            if ( m2EstCrée && ! monstre2.isAlive() && ! m2EstTué) {
                nbrTué ++ ;
                m2EstTué = true;
            }
            if ( m3EstCrée && ! monstre3.isAlive() && ! m3EstTué) {
                nbrTué ++ ;
                m3EstTué = true;
            }
            if ( m4EstCrée && ! monstre4.isAlive() && ! m4EstTué) {
                nbrTué ++ ;
                m4EstTué = true;
            }
            if ( m5EstCrée && ! monstre5.isAlive() && ! m5EstTué) {
                nbrTué ++ ;
                m5EstTué = true;
            }
            if ( m6EstCrée && ! monstre6.isAlive() && ! m6EstTué) {
                nbrTué ++ ;
                m6EstTué = true;
            }
            if ( m7EstCrée && ! monstre7.isAlive() && ! m7EstTué) {
                nbrTué ++ ;
                m7EstTué = true;
            }
            if ( m8EstCrée && ! monstre8.isAlive() && ! m8EstTué) {
                nbrTué ++ ;
                m8EstTué = true;
            }

            if ( DonjonGlace.isCléBasseTrouvé == false ) CadrillageMap.setTypeDeDécor(3,4,"cléBasse");
            détectionClé(MainMenu.Link);

        }
    }

    public static void destroyType() {
        // TODO Auto-generated method stub

    }

    public static void détectionClé(MainCharacter Link){
        if (DonjonGlace.isCléBasseTrouvé == false && nbrTué == 8 ){
            if ( yClé <= yCléFinal ) {
                if (CadrillageMap.typeDeDécor[(int) (Link.getBody().getPosition().x * MainMenu.PPM / 60)][(int) (Link.getBody().getPosition().y * MainMenu.PPM / 60) + 1].equals("cléBasse")) {
                   DonjonGlace.isCléBasseTrouvé = true;
                    MainMenu.Link.annimationAward = true;
                    CadrillageMap.setTypeDeDécor(3,4,"");
                }
            }
        }
    }
}
