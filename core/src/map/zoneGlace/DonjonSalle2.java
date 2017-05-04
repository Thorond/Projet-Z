package map.zoneGlace;

import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.physics.box2d.Body;
import com.badlogic.gdx.physics.box2d.World;
import com.mygdx.game.GameMain;

import characters.Pnj;
import characters.Slim;
import characters.SlimPetit;
import decors.ClimatMontagneux;
import decors.DonjonGlace;
import items.Coffre;
import scenes.MainMenu;

/**
 * Created by arnOo on 02/05/2017.
 */

public class DonjonSalle2 extends Sprite {



    public static boolean ouvertureCoffre = false; // à sauvegarder
    public static boolean coffreOuvert = false; // à sauvegarder

//

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


//  ************************


    public static int nbrTuéSlim = 0; // à sauvegarder
    public static int nbrTuéPetitSlim = 0; // à sauvegarder

    public static int yClé = 480;

    public static int yCléFinal = 360;

    public static Slim monstre1;
    public static Slim monstre2;
    public static Slim monstre3;
    public static boolean m1EstCrée = false ;
    public static boolean m2EstCrée = false ;
    public static boolean m3EstCrée = false ;


    public static SlimPetit petitMonstre1;
    public static SlimPetit petitMonstre2;
    public static SlimPetit petitMonstre3;
    public static SlimPetit petitMonstre4;
    public static SlimPetit petitMonstre5;
    public static SlimPetit petitMonstre6;
    public static boolean pm1EstCrée = false ;
    public static boolean pm2EstCrée = false ;
    public static boolean pm3EstCrée = false ;
    public static boolean pm5EstCrée = false ;
    public static boolean pm6EstCrée = false ;
    public static boolean pm4EstCrée = false ;


    public static boolean m1EstTué = false;
    public static boolean m2EstTué = false;
    public static boolean m3EstTué = false;
    public static boolean m4EstTué = false;
    public static boolean m5EstTué = false;
    public static boolean m6EstTué = false;
    public static boolean m7EstTué = false;
    public static boolean m8EstTué = false;
    public static boolean m9EstTué = false;

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
        game.getBatch().draw(ClimatMontagneux.murSombreGlacéCentre, 120+ x, 0+ y);
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
        game.getBatch().draw(ClimatMontagneux.murSombreGlacéCentre, 540+ x, 300+ y);
        game.getBatch().draw(ClimatMontagneux.murSombreGlacéCentre, 540+ x, 360+ y);
        game.getBatch().draw(ClimatMontagneux.murSombreGlacéCentre, 540+ x, 420+ y);


        //		==================================================================
		//		            Placement des dessins des monstres
		//      ==================================================================

		if ( m1EstCrée && monstre1.isAlive() ) {
			game.getBatch().draw(monstre1,monstre1.getX(), monstre1.getY());
		}
		if ( m2EstCrée && monstre2.isAlive() ) {
			game.getBatch().draw(monstre2.getTexture(), monstre2.getX(), monstre2.getY());
		}
		if ( m3EstCrée && monstre3.isAlive() ) {
			game.getBatch().draw(monstre3.getTexture(), monstre3.getX(), monstre3.getY());
		}

		if ( pm1EstCrée && petitMonstre1.isAlive() ) {
			game.getBatch().draw(petitMonstre1,petitMonstre1.getX(), petitMonstre1.getY());
		}
		if ( pm2EstCrée && petitMonstre2.isAlive() ) {
			game.getBatch().draw(petitMonstre2.getTexture(), petitMonstre2.getX(), petitMonstre2.getY());
		}
		if ( pm3EstCrée && petitMonstre3.isAlive() ) {
			game.getBatch().draw(petitMonstre3.getTexture(), petitMonstre3.getX(), petitMonstre3.getY());
		}
		if ( pm4EstCrée && petitMonstre4.isAlive() ) {
			game.getBatch().draw(petitMonstre4,petitMonstre4.getX(), petitMonstre4.getY());
		}
		if ( pm5EstCrée && petitMonstre5.isAlive() ) {
			game.getBatch().draw(petitMonstre5.getTexture(), petitMonstre5.getX(), petitMonstre5.getY());
		}
		if ( pm6EstCrée && petitMonstre6.isAlive() ) {
			game.getBatch().draw(petitMonstre6.getTexture(), petitMonstre6.getX(), petitMonstre6.getY());
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

		if ( pm6EstCrée && petitMonstre6.isAlive() ) {
			petitMonstre6.infligéDégatLink();
		}
		if ( pm1EstCrée && petitMonstre1.isAlive() ) {
			petitMonstre1.infligéDégatLink();
		}
		if ( pm2EstCrée && petitMonstre2.isAlive() ) {
			petitMonstre2.infligéDégatLink();
		}
		if ( pm3EstCrée && petitMonstre3.isAlive() ) {
			petitMonstre3.infligéDégatLink();
		}
		if ( pm4EstCrée && petitMonstre4.isAlive() ) {
			petitMonstre4.infligéDégatLink();
		}
		if ( pm5EstCrée && petitMonstre5.isAlive() ) {
			petitMonstre5.infligéDégatLink();
		}


//        ******************** récompense ***********************

        if ( nbrTuéPetitSlim == 6 ){
            if ( yClé > yCléFinal ) {
                yClé -= 5 ;
            }
            if ( ouvertureCoffre == false ) game.getBatch().draw(ClimatMontagneux.coffreBleuFermé, 420+ x, yClé + y);
            else {
                if ( coffreOuvert == false ) {
                    if ( Coffre.ouvert1 == true && Coffre.ouvert2 == true ){
                        coffreOuvert = true;
                    }
                    Coffre.annimationCoffreBleu(game, 420, yCléFinal);

                } else {
                    game.getBatch().draw(ClimatMontagneux.coffreBleuOuvert3, 420+ x, yCléFinal + y);
                }

            }
        }
//
        if ( MainMenu.Link.annimationAward ) {
            game.getBatch().draw(DonjonGlace.scroll, MainMenu.Link.getX() - 45, MainMenu.Link.getY() +50);
//            game.getBatch().draw(DonjonGlace.texteClé, 100 + x, 10+y);
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
        if ( m3EstCrée )MainMenu.world.destroyBody(monstre3.getBody());
        m1EstCrée = false;
        m2EstCrée = false;
        m3EstCrée = false;

        if ( pm1EstCrée )MainMenu.world.destroyBody(petitMonstre1.getBody());
        if ( pm2EstCrée )MainMenu.world.destroyBody(petitMonstre2.getBody());
        if ( pm3EstCrée )MainMenu.world.destroyBody(petitMonstre3.getBody());
        if ( pm4EstCrée )MainMenu.world.destroyBody(petitMonstre4.getBody());
        if ( pm5EstCrée )MainMenu.world.destroyBody(petitMonstre5.getBody());
        if ( pm6EstCrée )MainMenu.world.destroyBody(petitMonstre6.getBody());
        pm1EstCrée = false;
        pm2EstCrée = false;
        pm3EstCrée = false;
        pm4EstCrée = false;
        pm5EstCrée = false;
        pm6EstCrée = false;
        Pnj.nbrDeMonstres = 0;


        m1EstTué = false;
        m2EstTué = false;
        m3EstTué = false;
        m4EstTué = false;
        m5EstTué = false;
        m6EstTué = false;
        m7EstTué = false;
        m8EstTué = false;
        m9EstTué = false;
    }

    public static void createBodyAndType(World world) {
        // TODO Auto-generated method stub
        if ( isCote1Created == false ) {
            cote1 = ClimatMontagneux.createBody(20,240,60,480);
            isCote1Created = true;
        }
        if ( isCote2Created == false ) {
            cote2 = ClimatMontagneux.createBody(560,80,60,180);
            isCote2Created = true;
        }
        if ( isCote3Created == false ) {
            cote3 = ClimatMontagneux.createBody(300,20,600,60);
            isCote3Created = true;
        }
        if ( isCote4Created == false ) {
            cote4 = ClimatMontagneux.createBody(300,440,600,60);
            isCote4Created = true;
        }
        if ( isCote5Created == false ) {
            cote5 = ClimatMontagneux.createBody(560,390,60,180);
            isCote5Created = true;
        }
//        if ( isCote6Created == false ) {
//            cote6 = ClimatMontagneux.createBody(460,440,240,60);
//            isCote6Created = true;
//        }



        //		========================================================================================
        //      		Création des corps des montres
        //      ========================================================================================



        if ( m1EstCrée == false ) {
            if ( nbrTuéSlim <= 1) {
                monstre1 = new Slim(world, Slim.slimHaut1, 360, 300, "bas");
                Pnj.monstres[0] = monstre1;
                Pnj.nbrDeMonstres = 1;
                m1EstCrée = true;
            }
        } else if ( monstre1.isAlive()) {
            monstre1.déplacement();
            monstre1.représentation();
            monstre1.updateBody();
        } else {
            if ( ! pm1EstCrée) {
                petitMonstre1 = new SlimPetit(world, monstre1.getX(), monstre1.getY() ) ;
                Pnj.monstres[Pnj.nbrDeMonstres] = petitMonstre1;
                Pnj.nbrDeMonstres ++;
                pm1EstCrée = true;
            } else if( petitMonstre1.isAlive()){
                petitMonstre1.déplacement();
                petitMonstre1.représentation();
                petitMonstre1.updateBody();
            }
            if ( ! pm2EstCrée) {
                petitMonstre2 = new SlimPetit(world, monstre1.getX(), monstre1.getY() ) ;
                Pnj.monstres[Pnj.nbrDeMonstres] = petitMonstre2;
                Pnj.nbrDeMonstres ++;
                pm2EstCrée = true;
            } else if( petitMonstre2.isAlive()){
                petitMonstre2.déplacement();
                petitMonstre2.représentation();
                petitMonstre2.updateBody();
            }
        }

        if ( m2EstCrée == false ) {
            if ( nbrTuéSlim <= 2) {
                monstre2 = new Slim(world, Slim.slimGauche1, 150, 170, "gauche");
                Pnj.monstres[1] = monstre2;
                Pnj.nbrDeMonstres = 2;
                m2EstCrée = true;
            }
        } else if( monstre2.isAlive()){
            monstre2.déplacement();
            monstre2.représentation();
            monstre2.updateBody();
        } else {
            if ( ! pm3EstCrée) {
                petitMonstre3 = new SlimPetit(world, monstre2.getX(), monstre2.getY() ) ;
                Pnj.monstres[Pnj.nbrDeMonstres] = petitMonstre3;
                Pnj.nbrDeMonstres ++;
                pm3EstCrée = true;
            } else if( petitMonstre3.isAlive()){
                petitMonstre3.déplacement();
                petitMonstre3.représentation();
                petitMonstre3.updateBody();
            }
            if ( ! pm4EstCrée) {
                petitMonstre4 = new SlimPetit(world, monstre2.getX(), monstre2.getY() ) ;
                Pnj.monstres[Pnj.nbrDeMonstres] = petitMonstre4;
                Pnj.nbrDeMonstres ++;
                pm4EstCrée = true;
            } else if( petitMonstre4.isAlive()){
                petitMonstre4.déplacement();
                petitMonstre4.représentation();
                petitMonstre4.updateBody();
            }
        }

        if ( m3EstCrée == false ) {
            if ( nbrTuéSlim <= 0) {
                monstre3 = new Slim(world, Slim.slimDroite1, 230, 380, "droite");
                Pnj.monstres[2] = monstre3;
                Pnj.nbrDeMonstres = 3;
                m3EstCrée = true;
            }
        } else if (monstre3.isAlive()){
            monstre3.déplacement();
            monstre3.représentation();
            monstre3.updateBody();
        } else {
            if ( ! pm5EstCrée) {
                petitMonstre5 = new SlimPetit(world, monstre3.getX(), monstre3.getY() ) ;
                Pnj.monstres[Pnj.nbrDeMonstres] = petitMonstre5;
                Pnj.nbrDeMonstres ++;
                pm5EstCrée = true;
            } else if( petitMonstre5.isAlive()){
                petitMonstre5.déplacement();
                petitMonstre5.représentation();
                petitMonstre5.updateBody();
            }
            if ( ! pm6EstCrée) {
                petitMonstre6 = new SlimPetit(world, monstre3.getX(), monstre3.getY() ) ;
                Pnj.monstres[Pnj.nbrDeMonstres] = petitMonstre6;
                Pnj.nbrDeMonstres ++;
                pm6EstCrée = true;
            } else if( petitMonstre6.isAlive()){
                petitMonstre6.déplacement();
                petitMonstre6.représentation();
                petitMonstre6.updateBody();
            }
        }


//            ************************************
//             acquisition de l'état des monstres

        if ( m1EstCrée && ! monstre1.isAlive() && ! m1EstTué) {
            nbrTuéSlim ++ ;
            m1EstTué = true;
        }
        if ( m2EstCrée && ! monstre2.isAlive() && ! m2EstTué) {
            nbrTuéSlim ++ ;
            m2EstTué = true;
        }
        if ( m3EstCrée && ! monstre3.isAlive() && ! m3EstTué) {
            nbrTuéSlim ++ ;
            m3EstTué = true;
        }
        if ( pm1EstCrée && ! petitMonstre1.isAlive() && ! m4EstTué) {
            nbrTuéPetitSlim ++ ;
            m4EstTué = true;
        }
        if ( pm2EstCrée && ! petitMonstre2.isAlive() && ! m5EstTué) {
            nbrTuéPetitSlim ++ ;
            m5EstTué = true;
        }
        if ( pm3EstCrée && ! petitMonstre3.isAlive() && ! m6EstTué) {
            nbrTuéPetitSlim ++ ;
            m6EstTué = true;
        }
        if ( pm4EstCrée && ! petitMonstre4.isAlive() && ! m7EstTué) {
            nbrTuéPetitSlim ++ ;
            m7EstTué = true;
        }
        if ( pm5EstCrée && ! petitMonstre5.isAlive() && ! m8EstTué) {
            nbrTuéPetitSlim ++ ;
            m8EstTué = true;
        }
        if ( pm6EstCrée && ! petitMonstre6.isAlive() && ! m9EstTué) {
            nbrTuéPetitSlim ++ ;
            m9EstTué = true;
        }
    }

    public static void destroyType() {
        // TODO Auto-generated method stub

    }
}