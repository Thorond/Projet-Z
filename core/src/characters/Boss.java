package characters;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.physics.box2d.World;

/**
 * Created by arnOo on 02/05/2017.
 */

public class Boss extends Pnj {

    public long start = System.currentTimeMillis();

    public boolean textBas1 = true;
    public static Texture boss1Bas1 = new Texture("monstres/boss/boss1Bas1.png");
    public static Texture boss1Bas2 = new Texture("monstres/boss/boss1Bas2.png");
    public static Texture boss1Bas3 = new Texture("monstres/boss/boss1Bas3.png");
    public boolean textGauche1 = true;
    public static Texture boss1Gauche1 = new Texture("monstres/boss/boss1Gauche1.png");
    public static Texture boss1Gauche2 = new Texture("monstres/boss/boss1Gauche2.png");
    public boolean textHaut1 = true;
    public static Texture boss1Haut1 = new Texture("monstres/boss/boss1Haut1.png");
    public static Texture boss1Haut2 = new Texture("monstres/boss/boss1Haut2.png");
    public static Texture boss1Haut3 = new Texture("monstres/boss/boss1Haut3.png");
    public boolean textDroite1 = true;
    public static Texture boss1Droite1 = new Texture("monstres/boss/boss1Droite1.png");
    public static Texture boss1Droite2 = new Texture("monstres/boss/boss1Droite2.png");


    public static Texture transformation1 = new Texture("monstres/boss/transformation1.png");
    public static Texture transformation2 = new Texture("monstres/boss/transformation2.png");
    public static Texture transformation3 = new Texture("monstres/boss/transformation3.png");
    public static Texture transformation4 = new Texture("monstres/boss/transformation4.png");
    public static Texture transformation5 = new Texture("monstres/boss/transformation5.png");


    public Boss(World world, Texture text, float x, float y, String direction) {
        super(world, text, 20, 20, 4, x, y, direction);
        // TODO Auto-generated constructor stub
    }

//    public void représentation() {
//        if (this.getDirection().equals("gauche")) {
//            if (System.currentTimeMillis() - this.start > 500) {
//
//                if (this.textGauche1 == true) {
//                    this.setTexture(miniBossGauche2);
//                    this.textGauche1 = false;
//                } else {
//                    this.setTexture(miniBossGauche1);
//                    this.textGauche1 = true;
//                }
//                this.start = System.currentTimeMillis();
//
//
//            }
//        } else if (this.getDirection().equals("droite")) {
//            if (System.currentTimeMillis() - this.start > 500) {
//
//                if (this.textDroite1 == true) {
//                    this.setTexture(miniBossDroite2);
//                    this.textDroite1 = false;
//                } else {
//                    this.setTexture(miniBossDroite1);
//                    this.textDroite1 = true;
//                }
//                this.start = System.currentTimeMillis();
//
//            }
//        } else if (this.getDirection().equals("haut")) {
//            if (System.currentTimeMillis() - this.start > 500) {
//
//                if (this.textHaut1 == true) {
//                    this.setTexture(miniBossHaut2);
//                    this.textHaut1 = false;
//                } else {
//                    this.setTexture(miniBossHaut1);
//                    this.textHaut1 = true;
//                }
//                this.start = System.currentTimeMillis();
//
//            }
//        } else if (this.getDirection().equals("bas")) {
//            if (System.currentTimeMillis() - this.start > 500) {
//
//                if (this.textHaut1 == true) {
//                    this.setTexture(miniBossBas2);
//                    this.textHaut1 = false;
//                } else {
//                    this.setTexture(miniBossBas1);
//                    this.textHaut1 = true;
//                }
//                this.start = System.currentTimeMillis();
//
//            }
//        }
//    }
}
