package characters;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.physics.box2d.World;

import items.Arc;
import scenes.MainMenu;

/**
 * Created by arnOo on 10/04/2017.
 */

public class Squelette extends Pnj{

    public long startD = System.currentTimeMillis();

    public boolean textBas1 = true;
    public static Texture squeletteBas1 = new Texture("monstres/squelette/squeletteBas1.png");
    public static Texture squeletteBas2 = new Texture("monstres/squelette/squeletteBas2.png");
    public static Texture squeletteBas3 = new Texture("monstres/squelette/squeletteBas3.png");
    public boolean textGauche1 = true;
    public static Texture squeletteGauche1 = new Texture("monstres/squelette/squeletteGauche1.png");
    public static Texture squeletteGauche2 = new Texture("monstres/squelette/squeletteGauche2.png");
    public boolean textHaut1 = true;
    public static Texture squeletteHaut1 = new Texture("monstres/squelette/squeletteHaut1.png");
    public static Texture squeletteHaut2 = new Texture("monstres/squelette/squeletteHaut2.png");
    public static Texture squeletteHaut3 = new Texture("monstres/squelette/squeletteHaut3.png");
    public boolean textDroite1 = true;
    public static Texture squeletteDroite1 = new Texture("monstres/squelette/squeletteDroite1.png");
    public static Texture squeletteDroite2 = new Texture("monstres/squelette/squeletteDroite2.png");

    public Squelette(World world, Texture text, float x, float y, String direction) {
        super(world,text, 8, 8, 3, x, y, direction);
        // TODO Auto-generated constructor stub
    }

    @Override
    public void déplacementAléa(){
        double tempo = Math.random();
        if ( System.currentTimeMillis() - startD > 1000) {
            if ( tempo < 0.25 && this.getBody().getPosition().x > 90/ MainMenu.PPM ){
                this.getBody().applyLinearImpulse(new Vector2(-20000f,0), this.getBody().getWorldCenter(), true);
                this.setDirection("gauche");
            }
            else if (tempo > 0.25 && tempo < 0.5 && this.getBody().getPosition().x < 480/MainMenu.PPM ){
                this.getBody().applyLinearImpulse(new Vector2(+20000f,0), this.getBody().getWorldCenter(), true);
                this.setDirection("droite");
            }
            else if (tempo > 0.5 && tempo < 0.75 && this.getBody().getPosition().y > 90/MainMenu.PPM ){
                this.getBody().applyLinearImpulse(new Vector2(0,-20000f), this.getBody().getWorldCenter(), true);
                this.setDirection("bas");
            }
            else if (tempo > 0.75 && this.getBody().getPosition().y < 360/MainMenu.PPM){
                this.getBody().applyLinearImpulse(new Vector2(0,+20000f), this.getBody().getWorldCenter(), true);
                this.setDirection("haut");
            }
            startD = System.currentTimeMillis();
            arrét = false;
        }
        if (System.currentTimeMillis() - startD > 700 ) {
//			ralentissement des pnjs
            this.getBody().setLinearVelocity(this.getBody().getLinearVelocity().x / 100f, this.getBody().getLinearVelocity().y / 100f);
            arrét = true;
        }

    }

    public void représentation(){
        if (this.getDirection().equals("gauche")){
            if ( System.currentTimeMillis() - this.start > 500) {

                if (this.arrét ){
                    this.setTexture(squeletteGauche2);
                } else {
                    if (this.textGauche1 == true ) {
                        this.setTexture(squeletteGauche1);
                        this.textGauche1 = false;
                    } else {
                        this.setTexture(squeletteGauche2);
                        this.textGauche1 = true;
                    }
                    this.start = System.currentTimeMillis();
                }

            }
        }
        else if (this.getDirection().equals("droite")){
            if ( System.currentTimeMillis() - this.start > 500) {
                if (this.arrét){
                    this.setTexture(squeletteDroite2);
                } else {
                    if (this.textDroite1 == true ) {
                        this.setTexture(squeletteDroite1);
                        this.textDroite1 = false;
                    } else {
                        this.setTexture(squeletteDroite2);
                        this.textDroite1 = true;
                    }
                    this.start = System.currentTimeMillis();
                }
            }
        }
        else if (this.getDirection().equals("haut")){
            if ( System.currentTimeMillis() - this.start > 500) {
                if (this.arrét){
                    this.setTexture(squeletteHaut2);
                } else {
                    if (this.textHaut1 == true ) {
                        this.setTexture(squeletteHaut1);
                        this.textHaut1 = false;
                    } else {
                        this.setTexture(squeletteHaut3);
                        this.textHaut1 = true;
                    }
                    this.start = System.currentTimeMillis();
                }
            }
        }
        else if (this.getDirection().equals("bas")){
            if ( System.currentTimeMillis() - this.start > 500) {
                if (this.arrét){
                    this.setTexture(squeletteBas2);
                } else {
                    if (this.textHaut1 == true ) {
                        this.setTexture(squeletteBas1);
                        this.textHaut1 = false;
                    } else {
                        this.setTexture(squeletteBas3);
                        this.textHaut1 = true;
                    }
                    this.start = System.currentTimeMillis();
                }
            }
        }
    }

    public long timerLancementFlèche = System.currentTimeMillis();
    public void attaque(MainCharacter Link){
        if ( System.currentTimeMillis() - timerLancementFlèche > 800 ){

            if ( Link.getX() + 30 > this.getX() && Link.getX() - 30 < this.getX()
                    && Link.getY() > this.getY() && this.getDirection().equals("haut")) Arc.utilisationNonJoueur("haut", this.getX(), this.getY());
            else if ( Link.getX() + 30 > this.getX() && Link.getX() - 30 < this.getX()
                    && Link.getY() < this.getY() && this.getDirection().equals("bas")) Arc.utilisationNonJoueur("bas", this.getX(), this.getY());
            else if ( Link.getY() + 30 > this.getY() && Link.getY() - 30 < this.getY()
                    && Link.getX() < this.getX() && this.getDirection().equals("gauche")) Arc.utilisationNonJoueur("gauche", this.getX(), this.getY());
            else if ( Link.getY() + 30 > this.getY() && Link.getY() - 30 < this.getY()
                    && Link.getX() > this.getX() && this.getDirection().equals("droite")) Arc.utilisationNonJoueur("droite", this.getX(), this.getY());
            timerLancementFlèche = System.currentTimeMillis();
        }


    }
}
