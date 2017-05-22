package characters;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.physics.box2d.World;

import items.Torche;
import scenes.MainMenu;

/**
 * Created by arnOo on 02/05/2017.
 */

public class Spiders extends Pnj{

    public long start = System.currentTimeMillis();

    public boolean textBas1 = true;
    public static Texture spiderBas1 = new Texture("monstres/spider/spiderBas1.png");
    public static Texture spiderBas2 = new Texture("monstres/spider/spiderBas2.png");
    public static Texture spiderBas3 = new Texture("monstres/spider/spiderBas3.png");
    public boolean textGauche1 = true;
    public static Texture spiderGauche1 = new Texture("monstres/spider/spiderGauche1.png");
    public static Texture spiderGauche2 = new Texture("monstres/spider/spiderGauche2.png");
    public static Texture spiderGauche3 = new Texture("monstres/spider/spiderGauche3.png");
    public boolean textHaut1 = true;
    public static Texture spiderHaut1 = new Texture("monstres/spider/spiderHaut1.png");
    public static Texture spiderHaut2 = new Texture("monstres/spider/spiderHaut2.png");
    public static Texture spiderHaut3 = new Texture("monstres/spider/spiderHaut3.png");
    public boolean textDroite1 = true;
    public static Texture spiderDroite1 = new Texture("monstres/spider/spiderDroite1.png");
    public static Texture spiderDroite2 = new Texture("monstres/spider/spiderDroite2.png");
    public static Texture spiderDroite3 = new Texture("monstres/spider/spiderDroite3.png");


    public static Texture toileSupDroi = new Texture("monstres/spider/toileSupDroi.png");

    public Spiders(World world, Texture text, float x, float y, String direction) {
        super(world,text, 20, 20, 1, x, y, direction);
        // TODO Auto-generated constructor stub
    }

    public void représentation(){
        if (this.getDirection().equals("gauche")){
            if ( System.currentTimeMillis() - this.start > 50) {

                if (this.arrét ){
                    this.setTexture(spiderGauche1);
                } else {
                    if (this.textGauche1 == true ) {
                        this.setTexture(spiderGauche2);
                        this.textGauche1 = false;
                    } else {
                        this.setTexture(spiderGauche3);
                        this.textGauche1 = true;
                    }
                    this.start = System.currentTimeMillis();
                }

            }
        }
        else if (this.getDirection().equals("droite")){
            if ( System.currentTimeMillis() - this.start > 50) {
                if (this.arrét){
                    this.setTexture(spiderDroite1);
                } else {
                    if (this.textDroite1 == true ) {
                        this.setTexture(spiderDroite2);
                        this.textDroite1 = false;
                    } else {
                        this.setTexture(spiderDroite3);
                        this.textDroite1 = true;
                    }
                    this.start = System.currentTimeMillis();
                }
            }
        }
        else if (this.getDirection().equals("haut")){
            if ( System.currentTimeMillis() - this.start > 50) {
                if (this.arrét){
                    this.setTexture(spiderHaut1);
                } else {
                    if (this.textHaut1 == true ) {
                        this.setTexture(spiderHaut2);
                        this.textHaut1 = false;
                    } else {
                        this.setTexture(spiderHaut3);
                        this.textHaut1 = true;
                    }
                    this.start = System.currentTimeMillis();
                }
            }
        }
        else if (this.getDirection().equals("bas")){
            if ( System.currentTimeMillis() - this.start > 50) {
                if (this.arrét){
                    this.setTexture(spiderBas1);
                } else {
                    if (this.textBas1 == true ) {
                        this.setTexture(spiderBas2);
                        this.textBas1 = false;
                    } else {
                        this.setTexture(spiderBas3);
                        this.textBas1 = true;
                    }
                    this.start = System.currentTimeMillis();
                }
            }
        }
    }

    @Override
    public void déplacement(){
        if ( ! Torche.isTorcheUtilisée ) this.déplacementVersJoueur();
        else {
            if ( this.getX() - MainMenu.Link.getX() > 30  ){
                this.getBody().setLinearVelocity(new Vector2(100f,0));
                this.setDirection("gauche");
            }
            else if (this.getX() - MainMenu.Link.getX() < -50   ){
                this.getBody().setLinearVelocity(new Vector2(-100f,0));
                this.setDirection("droite");
            } else {
                this.getBody().setLinearVelocity( new Vector2(0,this.getBody().getLinearVelocity().y));
            }
            if (this.getY() - MainMenu.Link.getY() > 30  ){
                this.getBody().setLinearVelocity(new Vector2(0,+100f));
                this.setDirection("bas");
            }
            else if (this.getY() - MainMenu.Link.getY() < -50  ){
                this.getBody().setLinearVelocity(new Vector2(0,-100f));
                this.setDirection("haut");
            }  else {
                this.getBody().setLinearVelocity( new Vector2(this.getBody().getLinearVelocity().x,0));
            }

            if ( this.getX() > 540 || this.getX() < 60
                    || this.getY() > 420 || this.getY() < 60  )
                this.getBody().setLinearVelocity( 0,0);
            if ( this.getBody().getLinearVelocity().x == 0 && this.getBody().getLinearVelocity().y == 0 ) arrét = true;
            else arrét = false;
        }
    }

}