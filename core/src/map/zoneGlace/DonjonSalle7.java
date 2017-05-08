package map.zoneGlace;

import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.physics.box2d.Body;
import com.badlogic.gdx.physics.box2d.World;
import com.mygdx.game.GameMain;

import characters.Pnj;
import characters.Spiders;
import decors.ClimatMontagneux;
import decors.DonjonGlace;
import items.Torche;
import scenes.MainMenu;

/**
 * Created by arnOo on 02/05/2017.
 */

public class DonjonSalle7 extends Sprite {

    public static Spiders monstre1;
    public static Spiders monstre2;
    public static Spiders monstre3;
    public static boolean m1EstCrée = false ;
    public static boolean m2EstCrée = false ;
    public static boolean m3EstCrée = false ;
    public static Spiders monstre4;
    public static Spiders monstre5;
    public static Spiders monstre6;
    public static boolean m4EstCrée = false ;
    public static boolean m5EstCrée = false ;
    public static boolean m6EstCrée = false ;
    public static Spiders monstre7;
    public static Spiders monstre8;
    public static Spiders monstre9;
    public static boolean m7EstCrée = false ;
    public static boolean m8EstCrée = false ;
    public static boolean m9EstCrée = false ;

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
        game.getBatch().draw(ClimatMontagneux.murSombreGlacéCentre, 180+ x, 420+ y);
        game.getBatch().draw(ClimatMontagneux.murSombreGlacéCentre, 240+ x, 420+ y);
        game.getBatch().draw(ClimatMontagneux.murSombreGlacéCentre, 300+ x, 420+ y);
        game.getBatch().draw(ClimatMontagneux.murSombreGlacéCentre, 360+ x, 420+ y);
        game.getBatch().draw(ClimatMontagneux.murSombreGlacéCentre, 420+ x, 420+ y);
        game.getBatch().draw(ClimatMontagneux.murSombreGlacéCentre, 480+ x, 420+ y);

        game.getBatch().draw(ClimatMontagneux.murSombreGlacéCentre, 420+ x, 60+ y);
        game.getBatch().draw(ClimatMontagneux.murSombreGlacéCentre, 480+ x, 60+ y);
        game.getBatch().draw(ClimatMontagneux.murSombreGlacéCentre, 480+ x, 120+ y);

        game.getBatch().draw(ClimatMontagneux.murSombreGlacéCentre, 540+ x, 0+ y);
        game.getBatch().draw(ClimatMontagneux.murSombreGlacéCentre, 540+ x, 60+ y);
        game.getBatch().draw(ClimatMontagneux.murSombreGlacéCentre, 540+ x, 120+ y);
        game.getBatch().draw(ClimatMontagneux.murSombreGlacéCentre, 540+ x, 180+ y);
        game.getBatch().draw(ClimatMontagneux.murSombreGlacéCentre, 540+ x, 240+ y);
        game.getBatch().draw(ClimatMontagneux.murSombreGlacéCentre, 540+ x, 300+ y);
        game.getBatch().draw(ClimatMontagneux.murSombreGlacéCentre, 540+ x, 360+ y);
        game.getBatch().draw(ClimatMontagneux.murSombreGlacéCentre, 540+ x, 420+ y);


//
        game.getBatch().draw(Spiders.toileSupDroi, 420+ x, 300+ y);

        
//        
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
            game.getBatch().draw(monstre3.getTexture(), monstre3.getX(), monstre3.getY());
        }
        if ( m4EstCrée && monstre4.isAlive() ) {
            game.getBatch().draw(monstre4,monstre4.getX(), monstre4.getY());
        }
        if ( m5EstCrée && monstre5.isAlive() ) {
            game.getBatch().draw(monstre5.getTexture(), monstre5.getX(), monstre5.getY());
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
        if ( m9EstCrée && monstre9.isAlive() ) {
            game.getBatch().draw(monstre9.getTexture(), monstre9.getX(), monstre9.getY());
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
        if ( m9EstCrée && monstre9.isAlive() ) {
            monstre9.infligéDégatLink();
        }




    }

    public static void destroyBody() {
        // TODO Auto-generated method stub

//		destruction monstres
        if ( m1EstCrée )MainMenu.world.destroyBody(monstre1.getBody());
        if ( m2EstCrée )MainMenu.world.destroyBody(monstre2.getBody());
        if ( m3EstCrée )MainMenu.world.destroyBody(monstre3.getBody());
        m1EstCrée = false;
        m2EstCrée = false;
        m3EstCrée = false;
        if ( m4EstCrée )MainMenu.world.destroyBody(monstre4.getBody());
        if ( m5EstCrée )MainMenu.world.destroyBody(monstre5.getBody());
        if ( m6EstCrée )MainMenu.world.destroyBody(monstre6.getBody());
        m4EstCrée = false;
        m5EstCrée = false;
        m6EstCrée = false;
        if ( m7EstCrée )MainMenu.world.destroyBody(monstre7.getBody());
        if ( m8EstCrée )MainMenu.world.destroyBody(monstre8.getBody());
        if ( m9EstCrée )MainMenu.world.destroyBody(monstre9.getBody());
        m7EstCrée = false;
        m8EstCrée = false;
        m9EstCrée = false;
        Pnj.nbrDeMonstres = 0;
        
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


    }

    public static void createBodyAndType(World world) {
        // TODO Auto-generated method stub
        if ( isCote1Created == false ) {
            cote1 = ClimatMontagneux.createBody(20,80,60,180);
            isCote1Created = true;
        }
        if ( isCote2Created == false ) {
            cote2 = ClimatMontagneux.createBody(560,240,60,480);
            isCote2Created = true;
        }
        if ( isCote3Created == false ) {
            cote3 = ClimatMontagneux.createBody(100,20,240,60);
            isCote3Created = true;
        }
        if ( isCote4Created == false ) {
            cote4 = ClimatMontagneux.createBody(340,440,360,60);
            isCote4Created = true;
        }
        if ( isCote5Created == false ) {
            cote5 = ClimatMontagneux.createBody(460,20,240,60);
            isCote5Created = true;
        }
        if ( isCote6Created == false ) {
            cote6 = ClimatMontagneux.createBody(40,440,120,60);
            isCote6Created = true;
        }
        if ( isCote7Created == false ) {
            cote7 = ClimatMontagneux.createBody(20,390,60,180);
            isCote7Created = true;
        }
        if ( isCote8Created == false ) {
            cote8 = ClimatMontagneux.createBody(440,80,60,60);
            isCote8Created = true;
        }
        if ( isCote9Created == false ) {
            cote9 = ClimatMontagneux.createBody(500,140,60,60);
            isCote9Created = true;
        }


//		========================================================================================
        //		Création des corps des montres
        //========================================================================================



        if ( m2EstCrée == false ) {
            monstre2 = new Spiders(world ,Spiders.spiderDroite2 , 150 , 170 , "droite") ;
            Pnj.monstres[1] = monstre2;
            Pnj.nbrDeMonstres = 2;
            m2EstCrée = true;
        } else {
            monstre2.déplacement();
            monstre2.représentation();
            monstre2.updateBody();
        }

        if ( m1EstCrée == false ) {
            monstre1 = new Spiders(world ,Spiders.spiderBas2 , 360 , 300 , "bas") ;
            Pnj.monstres[0] = monstre1;
            Pnj.nbrDeMonstres = 1;
            m1EstCrée = true;
        } else {
            monstre1.déplacement();
            monstre1.représentation();
            monstre1.updateBody();
        }

        if ( m3EstCrée == false ) {
            monstre3 = new Spiders(world ,Spiders.spiderDroite2, 230 , 380 , "droite") ;
            Pnj.monstres[2] = monstre3;
            m3EstCrée = true;
        } else {
            monstre3.déplacement();
            monstre3.représentation();
            monstre3.updateBody();
        }
        if ( m4EstCrée == false ) {
            monstre4 = new Spiders(world ,Spiders.spiderBas2 , 300 , 300 , "bas") ;
            Pnj.monstres[3] = monstre4;
            Pnj.nbrDeMonstres = 4;
            m4EstCrée = true;
        } else {
            monstre4.déplacement();
            monstre4.représentation();
            monstre4.updateBody();
        }
        if ( m5EstCrée == false ) {
            monstre5 = new Spiders(world ,Spiders.spiderBas2 , 300 , 120 , "bas") ;
            Pnj.monstres[4] = monstre5;
            Pnj.nbrDeMonstres = 5;
            m5EstCrée = true;
        } else {
            monstre5.déplacement();
            monstre5.représentation();
            monstre5.updateBody();
        }
        if ( m6EstCrée == false ) {
            monstre6 = new Spiders(world ,Spiders.spiderBas2 , 120 , 120 , "bas") ;
            Pnj.monstres[5] = monstre6;
            Pnj.nbrDeMonstres = 6;
            m6EstCrée = true;
        } else {
            monstre6.déplacement();
            monstre6.représentation();
            monstre6.updateBody();
        }
        if ( m7EstCrée == false ) {
            monstre7 = new Spiders(world ,Spiders.spiderBas2 , 420 , 180 , "bas") ;
            Pnj.monstres[6] = monstre7;
            Pnj.nbrDeMonstres = 7;
            m7EstCrée = true;
        } else {
            monstre7.déplacement();
            monstre7.représentation();
            monstre7.updateBody();
        }
        if ( m8EstCrée == false ) {
            monstre8 = new Spiders(world ,Spiders.spiderBas2 , 420 , 300 , "bas") ;
            Pnj.monstres[7] = monstre8;
            Pnj.nbrDeMonstres = 8;
            m8EstCrée = true;
        } else {
            monstre8.déplacement();
            monstre8.représentation();
            monstre8.updateBody();
        }
        if ( m9EstCrée == false ) {
            monstre9 = new Spiders(world ,Spiders.spiderBas2 , 480 , 360 , "bas") ;
            Pnj.monstres[8] = monstre9;
            Pnj.nbrDeMonstres = 9;
            m9EstCrée = true;
        } else {
            monstre9.déplacement();
            monstre9.représentation();
            monstre9.updateBody();
        }
    }

    public static void destroyType() {
        // TODO Auto-generated method stub

    }
}
