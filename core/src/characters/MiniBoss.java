package characters;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.physics.box2d.World;

import items.Bouclier;
import scenes.MainMenu;

/**
 * Created by arnOo on 02/05/2017.
 */

public class MiniBoss extends Pnj{

    public long start = System.currentTimeMillis();

    public boolean textBas1 = true;
    public static Texture miniBossBas1 = new Texture("monstres/miniBoss/miniBossBas1.png");
    public static Texture miniBossBas2 = new Texture("monstres/miniBoss/miniBossBas2.png");
    public boolean textGauche1 = true;
    public static Texture miniBossGauche1 = new Texture("monstres/miniBoss/miniBossGauche1.png");
    public static Texture miniBossGauche2 = new Texture("monstres/miniBoss/miniBossGauche2.png");
    public boolean textHaut1 = true;
    public static Texture miniBossHaut1 = new Texture("monstres/miniBoss/miniBossHaut1.png");
    public static Texture miniBossHaut2 = new Texture("monstres/miniBoss/miniBossHaut2.png");
    public boolean textDroite1 = true;
    public static Texture miniBossDroite1 = new Texture("monstres/miniBoss/miniBossDroite1.png");
    public static Texture miniBossDroite2 = new Texture("monstres/miniBoss/miniBossDroite2.png");


    public static Texture toileSupDroi = new Texture("monstres/spider/toileSupDroi.png");

    public MiniBoss(World world, Texture text, float x, float y, String direction) {
        super(world,text, 20, 20, 1, x, y, direction);
        // TODO Auto-generated constructor stub
    }

    public void représentation(){
        if (this.getDirection().equals("gauche")){
            if ( System.currentTimeMillis() - this.start > 500) {

                if (this.textGauche1 == true ) {
                    this.setTexture(miniBossGauche2);
                    this.textGauche1 = false;
                } else {
                    this.setTexture(miniBossGauche1);
                    this.textGauche1 = true;
                }
                this.start = System.currentTimeMillis();


            }
        }
        else if (this.getDirection().equals("droite")){
            if ( System.currentTimeMillis() - this.start > 500) {

                if (this.textDroite1 == true ) {
                    this.setTexture(miniBossDroite2);
                    this.textDroite1 = false;
                } else {
                    this.setTexture(miniBossDroite1);
                    this.textDroite1 = true;
                }
                this.start = System.currentTimeMillis();

            }
        }
        else if (this.getDirection().equals("haut")){
            if ( System.currentTimeMillis() - this.start > 500) {

                if (this.textHaut1 == true ) {
                    this.setTexture(miniBossHaut2);
                    this.textHaut1 = false;
                } else {
                    this.setTexture(miniBossHaut1);
                    this.textHaut1 = true;
                }
                this.start = System.currentTimeMillis();

            }
        }
        else if (this.getDirection().equals("bas")){
            if ( System.currentTimeMillis() - this.start > 500) {

                if (this.textHaut1 == true ) {
                    this.setTexture(miniBossBas2);
                    this.textHaut1 = false;
                } else {
                    this.setTexture(miniBossBas1);
                    this.textHaut1 = true;
                }
                this.start = System.currentTimeMillis();

            }
        }
    }

//    *****

    public static long timerAttaque = System.currentTimeMillis();
    public static boolean estPlacé = false;

    @Override
    public void déplacement(){
        if ( this.isHit ){
            if ( System.currentTimeMillis() - this.timerHit > 300 ) this.isHit = false;
        }else {
            if (this.isAlive()) déplacementVersJoueur();
        }
    }

    @Override
    public void déplacementVersJoueur(){
        if ( System.currentTimeMillis() - timerAttaque < 2000 ) {
            if ( ! estPlacé  ) {
                this.getBody().setLinearVelocity(0,0);
                double choix = Math.random();
                if ( choix <= 0.25 ) {
                    this.getBody().setTransform(MainMenu.Link.getBody().getPosition().x -90 ,
                            MainMenu.Link.getBody().getPosition().y ,0 );
                    this.setDirection("droite");
                } else if ( choix <= 0.5 ) {
                    this.getBody().setTransform(MainMenu.Link.getBody().getPosition().x +40 ,
                            MainMenu.Link.getBody().getPosition().y ,0 );
                    this.setDirection("gauche");
                } else if ( choix <= 0.75 ) {
                    this.getBody().setTransform(MainMenu.Link.getBody().getPosition().x -10 ,
                            MainMenu.Link.getBody().getPosition().y -80,0 );
                    this.setDirection("haut");
                } else if ( choix <= 1 ) {
                    this.getBody().setTransform(MainMenu.Link.getBody().getPosition().x -10 ,
                            MainMenu.Link.getBody().getPosition().y +40,0 );
                    this.setDirection("bas");
                }
                this.estPlacé = true;
            }
        } else if (System.currentTimeMillis() - timerAttaque < 6000){
            if ( this.getDirection().equals("gauche") ){
                this.getBody().setLinearVelocity(new Vector2(-10000f,0));
            }
            else if (this.getDirection().equals("droite") ){
                this.getBody().setLinearVelocity(new Vector2(+10000f,0));
            }
            else if (this.getDirection().equals("bas") ){
                this.getBody().setLinearVelocity(new Vector2(0,-10000f));
            }
            else if (this.getDirection().equals("haut") ){
                this.getBody().setLinearVelocity(new Vector2(0,+10000f));
            }
            if ( this.getBody().getLinearVelocity().x == 0 && this.getBody().getLinearVelocity().y == 0 ) arrét = true;
            else arrét = false;
        } else {
            this.estPlacé = false;
            timerAttaque = System.currentTimeMillis();
        }

    }

    @Override
    public void subirDégats( int cha, String direction){}

    @Override
    public void infligéDégatLink(){

        if ( System.currentTimeMillis() - timerSubirDégat > 700 ) {

            if (MainMenu.Link.getX() + MainMenu.Link.getWidth() / 2 >= this.getX() - 40
                    && MainMenu.Link.getX() <= this.getX()
                    && MainMenu.Link.getY() + MainMenu.Link.getHeight() / 2 >= this.getY()
                    && MainMenu.Link.getY() <= this.getY() + this.getHeight() / 2) {
                MainMenu.Link.isHit = true;
                MainMenu.Link.timerHit = System.currentTimeMillis();
                MainMenu.Link.getBody().applyLinearImpulse(new Vector2(-600000, 0), MainMenu.Link.getBody().getWorldCenter(), true);
                if (MainMenu.Link.getDirection().equals("droite") && Bouclier.isBouclierUtilisé) { // utilisation du bouclier

                } else MainMenu.Link.setHealth(MainMenu.Link.getHealth() - this.getStrength());
            } else if (this.getX() - MainMenu.Link.getX() < 0
                    && MainMenu.Link.getX() <= this.getX() + this.getWidth() / 2 + 20
                    && MainMenu.Link.getY() + MainMenu.Link.getHeight() / 2 >= this.getY()
                    && MainMenu.Link.getY() <= this.getY() + this.getHeight() / 2) {
                MainMenu.Link.isHit = true;
                MainMenu.Link.timerHit = System.currentTimeMillis();
                MainMenu.Link.getBody().applyLinearImpulse(new Vector2(+600000, 0), MainMenu.Link.getBody().getWorldCenter(), true);

                if (MainMenu.Link.getDirection().equals("gauche") && Bouclier.isBouclierUtilisé) { // utilisation du bouclier

                } else MainMenu.Link.setHealth(MainMenu.Link.getHealth() - this.getStrength());
            }

            if (MainMenu.Link.getX() + MainMenu.Link.getWidth() / 2 >= this.getX()
                    && MainMenu.Link.getX() <= this.getX() + this.getWidth() / 2
                    && MainMenu.Link.getY() + MainMenu.Link.getHeight() / 2 >= this.getY() - 30
                    && this.getY() - MainMenu.Link.getY() > 0) {
                MainMenu.Link.isHit = true;
                MainMenu.Link.timerHit = System.currentTimeMillis();
                MainMenu.Link.getBody().applyLinearImpulse(new Vector2(0, -600000), MainMenu.Link.getBody().getWorldCenter(), true);

                if (MainMenu.Link.getDirection().equals("haut") && Bouclier.isBouclierUtilisé) { // utilisation du bouclier

                } else MainMenu.Link.setHealth(MainMenu.Link.getHealth() - this.getStrength());
            } else if (MainMenu.Link.getX() + MainMenu.Link.getWidth() / 2 >= this.getX()
                    && MainMenu.Link.getX() <= this.getX() + this.getWidth() / 2
                    && this.getY() - MainMenu.Link.getY() < 0
                    && MainMenu.Link.getY() <= this.getY() + this.getHeight() / 2 + 15) {
                MainMenu.Link.isHit = true;
                MainMenu.Link.timerHit = System.currentTimeMillis();
                MainMenu.Link.getBody().applyLinearImpulse(new Vector2(0, +600000), MainMenu.Link.getBody().getWorldCenter(), true);

                if (MainMenu.Link.getDirection().equals("bas") && Bouclier.isBouclierUtilisé) { // utilisation du bouclier

                } else MainMenu.Link.setHealth(MainMenu.Link.getHealth() - this.getStrength());
            }

            timerSubirDégat = System.currentTimeMillis();
        }

    }


}