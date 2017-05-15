package characters;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.physics.box2d.World;
import com.mygdx.game.GameMain;

/**
 * Created by arnOo on 02/05/2017.
 */

public class Boss extends Pnj {


    public long start = System.currentTimeMillis();

    public boolean textBas1 = true;
    public static Texture boss1Bas1 = new Texture("monstres/boss/boss1Bas1.png");
    public static Texture boss1Bas2 = new Texture("monstres/boss/boss1Bas2.png");
    public static Texture boss1Bas3 = new Texture("monstres/boss/boss1Bas3.png");
    public static Texture boss2Bas1 = new Texture("monstres/boss/boss2Bas1.png");
    public static Texture boss2Bas2 = new Texture("monstres/boss/boss2Bas2.png");
    public boolean textGauche1 = true;
    public static Texture boss1Gauche1 = new Texture("monstres/boss/boss1Gauche1.png");
    public static Texture boss1Gauche2 = new Texture("monstres/boss/boss1Gauche2.png");
    public static Texture boss2Gauche1 = new Texture("monstres/boss/boss2Gauche1.png");
    public static Texture boss2Gauche2 = new Texture("monstres/boss/boss2Gauche2.png");
    public boolean textHaut1 = true;
    public static Texture boss1Haut1 = new Texture("monstres/boss/boss1Haut1.png");
    public static Texture boss1Haut2 = new Texture("monstres/boss/boss1Haut2.png");
    public static Texture boss1Haut3 = new Texture("monstres/boss/boss1Haut3.png");
    public static Texture boss2Haut1 = new Texture("monstres/boss/boss2Haut1.png");
    public static Texture boss2Haut2 = new Texture("monstres/boss/boss2Haut2.png");
    public boolean textDroite1 = true;
    public static Texture boss1Droite1 = new Texture("monstres/boss/boss1Droite1.png");
    public static Texture boss1Droite2 = new Texture("monstres/boss/boss1Droite2.png");
    public static Texture boss2Droite1 = new Texture("monstres/boss/boss2Droite1.png");
    public static Texture boss2Droite2 = new Texture("monstres/boss/boss2Droite2.png");



    public Boss(World world, Texture text, float x, float y, String direction) {
        super(world, text, 60, 60, 4, x, y, direction);
        // TODO Auto-generated constructor stub
    }

    public void représentation() {
        if ( this.getHealth() > 40 ) {
            if (this.getDirection().equals("gauche")) {
                if (System.currentTimeMillis() - this.start > 500) {

                    if (this.textGauche1 == true) {
                        this.setTexture(boss1Gauche2);
                        this.textGauche1 = false;
                    } else {
                        this.setTexture(boss1Gauche1);
                        this.textGauche1 = true;
                    }
                    this.start = System.currentTimeMillis();


                }
            } else if (this.getDirection().equals("droite")) {
                if (System.currentTimeMillis() - this.start > 500) {

                    if (this.textDroite1 == true) {
                        this.setTexture(boss1Droite2);
                        this.textDroite1 = false;
                    } else {
                        this.setTexture(boss1Droite1);
                        this.textDroite1 = true;
                    }
                    this.start = System.currentTimeMillis();

                }
            } else if (this.getDirection().equals("haut")) {
                if (System.currentTimeMillis() - this.start > 500) {

                    if (this.textHaut1 == true) {
                        this.setTexture(boss1Haut2);
                        this.textHaut1 = false;
                    } else {
                        this.setTexture(boss1Haut1);
                        this.textHaut1 = true;
                    }
                    this.start = System.currentTimeMillis();

                }
            } else if (this.getDirection().equals("bas")) {
                if (System.currentTimeMillis() - this.start > 500) {

                    if (this.textHaut1 == true) {
                        this.setTexture(boss1Bas2);
                        this.textHaut1 = false;
                    } else {
                        this.setTexture(boss1Bas1);
                        this.textHaut1 = true;
                    }
                    this.start = System.currentTimeMillis();

                }
            }
        } else if ( this.getHealth() > 0 ) {
            if (this.getDirection().equals("gauche")) {
                if (System.currentTimeMillis() - this.start > 500) {

                    if (this.textGauche1 == true) {
                        this.setTexture(boss2Gauche2);
                        this.textGauche1 = false;
                    } else {
                        this.setTexture(boss2Gauche1);
                        this.textGauche1 = true;
                    }
                    this.start = System.currentTimeMillis();


                }
            } else if (this.getDirection().equals("droite")) {
                if (System.currentTimeMillis() - this.start > 500) {

                    if (this.textDroite1 == true) {
                        this.setTexture(boss2Droite2);
                        this.textDroite1 = false;
                    } else {
                        this.setTexture(boss2Droite1);
                        this.textDroite1 = true;
                    }
                    this.start = System.currentTimeMillis();

                }
            } else if (this.getDirection().equals("haut")) {
                if (System.currentTimeMillis() - this.start > 500) {

                    if (this.textHaut1 == true) {
                        this.setTexture(boss2Haut2);
                        this.textHaut1 = false;
                    } else {
                        this.setTexture(boss2Haut1);
                        this.textHaut1 = true;
                    }
                    this.start = System.currentTimeMillis();

                }
            } else if (this.getDirection().equals("bas")) {
                if (System.currentTimeMillis() - this.start > 500) {

                    if (this.textHaut1 == true) {
                        this.setTexture(boss2Bas2);
                        this.textHaut1 = false;
                    } else {
                        this.setTexture(boss2Bas1);
                        this.textHaut1 = true;
                    }
                    this.start = System.currentTimeMillis();

                }
            }
        }
    }



    public static Texture texte1 = new Texture("monstres/boss/texte/texte1.png");
    public static Texture texte2 = new Texture("monstres/boss/texte/texte2.png");
    public static Texture texte3 = new Texture("monstres/boss/texte/texte3.png");
    public static Texture texte4 = new Texture("monstres/boss/texte/texte4.png");
    public static Texture texte5 = new Texture("monstres/boss/texte/texte5.png");
    public static Texture texte6 = new Texture("monstres/boss/texte/texte6.png");
    public static Texture texte7 = new Texture("monstres/boss/texte/texte7.png");
    public static Texture texte8 = new Texture("monstres/boss/texte/texte8.png");
    public static Texture texte9 = new Texture("monstres/boss/texte/texte9.png");

    public static int etatTransformation = 0;
    public static long timerTransformation = System.currentTimeMillis();

    public static Texture transformation1 = new Texture("monstres/boss/transformation1.png");
    public static Texture transformation2 = new Texture("monstres/boss/transformation2.png");
    public static Texture transformation3 = new Texture("monstres/boss/transformation3.png");
    public static Texture transformation4 = new Texture("monstres/boss/transformation4.png");
    public static Texture transformation5 = new Texture("monstres/boss/transformation5.png");

    public static void transformation(GameMain game, int x, int y){
        if ( etatTransformation == 0 ) game.getBatch().draw(transformation1, x, y);
        else if ( etatTransformation == 1 ) game.getBatch().draw(transformation2, x, y);
        else if ( etatTransformation == 2 ) game.getBatch().draw(transformation3, x, y);
        else if ( etatTransformation == 3 ) game.getBatch().draw(transformation4, x, y);
        else if ( etatTransformation == 4 ) {
            game.getBatch().draw(transformation5, x, y);
            if ( MainCharacter.etatScenario == 7 )  MainCharacter.etatScenario = 8 ;
        }

        if  ( System.currentTimeMillis() - timerTransformation > 800 ) {
            if (etatTransformation == 0 ) etatTransformation = 1 ;
            else if (etatTransformation == 1 ) etatTransformation = 2 ;
            else if (etatTransformation == 2 ) etatTransformation = 3 ;
            else if (etatTransformation == 3 ) etatTransformation = 4 ;
            else if (etatTransformation == 4 ) etatTransformation = 5 ;
            timerTransformation = System.currentTimeMillis();
        }
    }

    public static int etatRésidu = 0;
    public static long timerRésidu = System.currentTimeMillis() ;

    public static Texture résidu1 = new Texture("monstres/boss/résidu1.png");
    public static Texture résidu2 = new Texture("monstres/boss/résidu2.png");

    public static void résidu(GameMain game , int x , int y ) {
        if ( etatRésidu == 0 ) game.getBatch().draw(résidu1,x,y);
        else if ( etatRésidu == 1 ) game.getBatch().draw(résidu2,x,y);

        if ( System.currentTimeMillis() - timerRésidu > 300 ){
            if ( etatRésidu == 0 ) etatRésidu = 1 ;
            else if ( etatRésidu == 1 ) etatRésidu = 0;
            timerRésidu = System.currentTimeMillis() ;
        }
    }
}
