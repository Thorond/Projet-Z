package characters;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.physics.box2d.World;
import com.mygdx.game.GameMain;

import items.Bombe;
import map.CadrillageMap;
import scenes.MainMenu;

/**
 * Created by arnOo on 02/05/2017.
 */

public class Boss extends Pnj {


    public long startD = System.currentTimeMillis();

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
            if ( enTransformation ) {
                transformation();
            } else {
                if (this.getDirection().equals("gauche")) {
                    if (System.currentTimeMillis() - this.startD > 500) {

                        if (this.textGauche1 == true) {
                            this.setTexture(boss1Gauche2);
                            this.textGauche1 = false;
                        } else {
                            this.setTexture(boss1Gauche1);
                            this.textGauche1 = true;
                        }
                        this.startD = System.currentTimeMillis();


                    }
                } else if (this.getDirection().equals("droite")) {
                    if (System.currentTimeMillis() - this.startD > 500) {

                        if (this.textDroite1 == true) {
                            this.setTexture(boss1Droite2);
                            this.textDroite1 = false;
                        } else {
                            this.setTexture(boss1Droite1);
                            this.textDroite1 = true;
                        }
                        this.startD = System.currentTimeMillis();

                    }
                } else if (this.getDirection().equals("haut")) {
                    if (System.currentTimeMillis() - this.startD > 500) {

                        if (this.textHaut1 == true) {
                            this.setTexture(boss1Haut2);
                            this.textHaut1 = false;
                        } else {
                            this.setTexture(boss1Haut1);
                            this.textHaut1 = true;
                        }
                        this.startD = System.currentTimeMillis();

                    }
                } else if (this.getDirection().equals("bas")) {
                    if (System.currentTimeMillis() - this.startD > 500) {

                        if (this.textHaut1 == true) {
                            this.setTexture(boss1Bas2);
                            this.textHaut1 = false;
                        } else {
                            this.setTexture(boss1Bas1);
                            this.textHaut1 = true;
                        }
                        this.startD = System.currentTimeMillis();

                    }
                }
            }
        } else if ( this.getHealth() > 0 ) {
            if (this.getDirection().equals("gauche")) {
                if (System.currentTimeMillis() - this.startD > 500) {

                    if (this.textGauche1 == true) {
                        this.setTexture(boss2Gauche2);
                        this.textGauche1 = false;
                    } else {
                        this.setTexture(boss2Gauche1);
                        this.textGauche1 = true;
                    }
                    this.startD = System.currentTimeMillis();


                }
            } else if (this.getDirection().equals("droite")) {
                if (System.currentTimeMillis() - this.startD > 500) {

                    if (this.textDroite1 == true) {
                        this.setTexture(boss2Droite2);
                        this.textDroite1 = false;
                    } else {
                        this.setTexture(boss2Droite1);
                        this.textDroite1 = true;
                    }
                    this.startD = System.currentTimeMillis();

                }
            } else if (this.getDirection().equals("haut")) {
                if (System.currentTimeMillis() - this.startD > 500) {

                    if (this.textHaut1 == true) {
                        this.setTexture(boss2Haut2);
                        this.textHaut1 = false;
                    } else {
                        this.setTexture(boss2Haut1);
                        this.textHaut1 = true;
                    }
                    this.startD = System.currentTimeMillis();

                }
            } else if (this.getDirection().equals("bas")) {
                if (System.currentTimeMillis() - this.startD > 500) {

                    if (this.textHaut1 == true) {
                        this.setTexture(boss2Bas2);
                        this.textHaut1 = false;
                    } else {
                        this.setTexture(boss2Bas1);
                        this.textHaut1 = true;
                    }
                    this.startD = System.currentTimeMillis();

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
    public static Texture texte11 = new Texture("monstres/boss/texte/texte11.png");
    public static Texture texte12 = new Texture("monstres/boss/texte/texte12.png");
    public static Texture texte14 = new Texture("monstres/boss/texte/texte14.png");
    public static Texture texte15 = new Texture("monstres/boss/texte/texte15.png");
    public static Texture texte16 = new Texture("monstres/boss/texte/texte16.png");

    public static int etatTransformation = 0;
    public static long timerTransformation = System.currentTimeMillis();

    public static Texture transformation1 = new Texture("monstres/boss/transformation1.png");
    public static Texture transformation2 = new Texture("monstres/boss/transformation2.png");
    public static Texture transformation3 = new Texture("monstres/boss/transformation3.png");
    public static Texture transformation4 = new Texture("monstres/boss/transformation4.png");
    public static Texture transformation5 = new Texture("monstres/boss/transformation5.png");

    // téléportation lors du combat
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

    // téléportation lors du début du jeu
    public void transformation(){
        if ( etatTransformation == 0 ) this.setTexture(transformation1);
        else if ( etatTransformation == 1 ) this.setTexture(transformation2);
        else if ( etatTransformation == 2 ) this.setTexture(transformation3);
        else if ( etatTransformation == 3 ) this.setTexture(transformation4);
        else if ( etatTransformation == 4 ) {
            this.setTexture(transformation5);
        }

        if  ( System.currentTimeMillis() - timerTransformation > 300 ) {
            if (etatTransformation == 0 ) etatTransformation = 1 ;
            else if (etatTransformation == 1 ) etatTransformation = 2 ;
            else if (etatTransformation == 2 ) etatTransformation = 3 ;
            else if (etatTransformation == 3 ) etatTransformation = 4 ;
            else if (etatTransformation == 4 ) etatTransformation = 0 ;
            timerTransformation = System.currentTimeMillis();
        }
    }

    public static int etatRésidu = 0;
    public static long timerRésidu = System.currentTimeMillis() ;

    public static Texture résidu1 = new Texture("monstres/boss/résidu1.png");
    public static Texture résidu2 = new Texture("monstres/boss/résidu2.png");

    // animation de la 'faille' que le boss laisse derrière lui
    public static void résidu(GameMain game , int x , int y ) {
        if ( etatRésidu == 0 ) game.getBatch().draw(résidu1,x,y);
        else if ( etatRésidu == 1 ) game.getBatch().draw(résidu2,x,y);

        if ( System.currentTimeMillis() - timerRésidu > 300 ){
            if ( etatRésidu == 0 ) etatRésidu = 1 ;
            else if ( etatRésidu == 1 ) etatRésidu = 0;
            timerRésidu = System.currentTimeMillis() ;
        }
    }



//	déplacement aléatoire pour la phase 2 du boss

    @Override
    public void déplacementAléa(){
        double tempo = Math.random();
        double tempo2 = Math.random() ;
        if ( System.currentTimeMillis() - start > 2000 || this.getBody().getLinearVelocity().x == 0
                || this.getBody().getLinearVelocity().y == 0 ) {
            if (tempo < 0.5 && this.getBody().getPosition().x > 90 / MainMenu.PPM) {
                if (!CadrillageMap.typeDeDécor[(int) (this.getBody().getPosition().x * MainMenu.PPM / 60) - 1][(int) (this.getBody().getPosition().y * MainMenu.PPM / 60)].equals("Trou")
                        && !CadrillageMap.typeDeDécor[(int) (this.getBody().getPosition().x * MainMenu.PPM / 60) - 1][(int) (this.getBody().getPosition().y * MainMenu.PPM / 60)].equals("EauProfonde")) {
                    this.getBody().applyLinearImpulse(new Vector2(-2000000f, 0), this.getBody().getWorldCenter(), true);
                    this.setDirection("gauche");
                }
            } else if (tempo > 0.5 && this.getBody().getPosition().x < 480 / MainMenu.PPM) {
                if (!CadrillageMap.typeDeDécor[(int) (this.getBody().getPosition().x * MainMenu.PPM / 60) + 1][(int) (this.getBody().getPosition().y * MainMenu.PPM / 60)].equals("Trou")
                        && !CadrillageMap.typeDeDécor[(int) (this.getBody().getPosition().x * MainMenu.PPM / 60) + 1][(int) (this.getBody().getPosition().y * MainMenu.PPM / 60)].equals("EauProfonde")) {
                    this.getBody().applyLinearImpulse(new Vector2(+2000000f, 0), this.getBody().getWorldCenter(), true);
                    this.setDirection("droite");

                }
            }

            if (tempo2 < 0.5 && this.getBody().getPosition().y > 90 / MainMenu.PPM) {
                if (!CadrillageMap.typeDeDécor[(int) (this.getBody().getPosition().x * MainMenu.PPM / 60)][(int) (this.getBody().getPosition().y * MainMenu.PPM / 60) - 1].equals("Trou")
                        && !CadrillageMap.typeDeDécor[(int) (this.getBody().getPosition().x * MainMenu.PPM / 60)][(int) (this.getBody().getPosition().y * MainMenu.PPM / 60) - 1].equals("EauProfonde")) {
                    this.getBody().applyLinearImpulse(new Vector2(0, -2000000f), this.getBody().getWorldCenter(), true);
                    this.setDirection("bas");
                }
            } else if (tempo2 > 0.5 && this.getBody().getPosition().y < 360 / MainMenu.PPM) {
                if (!CadrillageMap.typeDeDécor[(int) (this.getBody().getPosition().x * MainMenu.PPM / 60)][(int) (this.getBody().getPosition().y * MainMenu.PPM / 60) + 1].equals("Trou")
                        && !CadrillageMap.typeDeDécor[(int) (this.getBody().getPosition().x * MainMenu.PPM / 60)][(int) (this.getBody().getPosition().y * MainMenu.PPM / 60) + 1].equals("EauProfonde")) {
                    this.getBody().applyLinearImpulse(new Vector2(0, +2000000f), this.getBody().getWorldCenter(), true);
                    this.setDirection("haut");
                }
            }
            start = System.currentTimeMillis();
        }
    }

    public int xRésidu = -120;
    public int yRésidu = -120;
    public long timerDéplacement = System.currentTimeMillis() ;
    public boolean enTransformation = false ;

    public void déplacementTéléportation(){
        if ( (System.currentTimeMillis() - timerDéplacement > 5000
                || this.isHit ) && enTransformation == false ){
            this.isHit =false;
            timerDéplacement = System.currentTimeMillis() ;
            enTransformation = true;
            etatTransformation = 0 ;

        }
        if ( enTransformation ) {
            if ( etatTransformation == 4 ) {
                xRésidu = (int) ( this.getBody().getPosition().x *MainMenu.PPM );
                yRésidu = (int) ( this.getBody().getPosition().y *MainMenu.PPM );
                CadrillageMap.setTypeDeDécor();

                this.getBody().setLinearVelocity(0,0);

                double xtemp = Math.random() ;
                double ytemp = Math.random() ;
                int xtemp2 = (int) (( 1 + xtemp * ( 8 - 1) ) * 60 / MainMenu.PPM ) ;
                int ytemp2 = (int) (( 1 + ytemp * ( 6 - 1) ) * 60 / MainMenu.PPM );
                this.getBody().setTransform(xtemp2, ytemp2 , 0);
                enTransformation = false ;
            }
        }
    }


//	déplacement global

    @Override
    public void déplacement(){
        if ( this.getHealth() > 40 ){
            déplacementTéléportation();
        }else if ( this.getHealth() > 0){
            this.déplacementAléa();
        }
    }


//	subir dégats et mort

    @Override
    public void subirDégats( int cha, String direction){
        if ( this.getHealth() <= 40 ) {
            if (this.getHealth() > 0 && this.getHealth() - cha <= 0) {
                this.drop();
//			est ce la meilleure solution?
                this.isAttacked = false;
                this.getBody().setTransform(-500, -500, 0);
            } else {
                if (direction.equals("droite")) {
                    this.isHit = true;
                    this.timerHit = System.currentTimeMillis();
                    this.getBody().applyLinearImpulse(new Vector2(+600000, 0), this.getBody().getWorldCenter(), true);

                } else if (direction.equals("gauche")) {
                    this.isHit = true;
                    this.timerHit = System.currentTimeMillis();
                    this.getBody().applyLinearImpulse(new Vector2(-600000, 0), this.getBody().getWorldCenter(), true);

                } else if (direction.equals("haut")) {
                    this.isHit = true;
                    this.timerHit = System.currentTimeMillis();
                    this.getBody().applyLinearImpulse(new Vector2(0, +600000), this.getBody().getWorldCenter(), true);

                } else if (direction.equals("bas")) {
                    this.isHit = true;
                    this.timerHit = System.currentTimeMillis();
                    this.getBody().applyLinearImpulse(new Vector2(0, -600000), this.getBody().getWorldCenter(), true);

                }
                this.isAttacked = true;
            }
            this.setHealth(this.getHealth() - cha);
        } else if ( this.getHealth() > 40 ){
            this.isHit = true;
        }
    }



//	 subir dégàt par bombe

    @Override
    public void subirDégatsBombe(Bombe cha, int x, int y ){
        if ( this.getHealth() > 0 && this.getHealth() - cha.getDégàts() <= 0 ) {
            this.drop();
            this.isAttacked = false;
            this.getBody().setTransform(-500, -500, 0); //	est ce la meilleure solution? oui a priori..
        } else {
            this.isHit = true;
        }
        this.setHealth(this.getHealth() - cha.getDégàts());
    }

}
