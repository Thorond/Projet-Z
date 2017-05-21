package characters;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.physics.box2d.World;
import com.mygdx.game.GameMain;

import decors.ClimatMontagneux;
import items.Essence;
import items.GantDeForce;
import menus.MenuSac;
import scenes.MainMenu;

/**
 * Created by arnOo on 07/05/2017.
 */

public class Marchand extends Pnj{

    public long start = System.currentTimeMillis();

    public static Texture marchandBas1 = new Texture("monstres/marchand/marchandBas1.png");
    public boolean textGauche1 = true;
    public static Texture marchandGauche1 = new Texture("monstres/marchand/marchandGauche1.png");
    public static Texture marchandGauche2 = new Texture("monstres/marchand/marchandGauche2.png");
    public boolean textDroite1 = true;
    public static Texture marchandDroite1 = new Texture("monstres/marchand/marchandDroite1.png");
    public static Texture marchandDroite2 = new Texture("monstres/marchand/marchandDroite2.png");


    public static Texture toileSupDroi = new Texture("monstres/spider/toileSupDroi.png");

    public Marchand(World world, Texture text, float x, float y, String direction) {
        super(world,text, 20, 20, 1, x, y, direction);
    }

    public void représentation(){
        if (this.getDirection().equals("gauche")){
            if ( System.currentTimeMillis() - this.start > 500) {

                if (this.textGauche1 == true ) {
                    this.setTexture(marchandGauche2);
                    this.textGauche1 = false;
                } else {
                    this.setTexture(marchandGauche1);
                    this.textGauche1 = true;
                }
                this.start = System.currentTimeMillis();


            }
        }
        else if (this.getDirection().equals("droite")){
            if ( System.currentTimeMillis() - this.start > 500) {

                if (this.textDroite1 == true ) {
                    this.setTexture(marchandDroite2);
                    this.textDroite1 = false;
                } else {
                    this.setTexture(marchandDroite1);
                    this.textDroite1 = true;
                }
                this.start = System.currentTimeMillis();

            }
        }
        else if (this.getDirection().equals("bas")){
            this.setTexture(marchandBas1);
        }
    }

//    *****




    @Override
    public void déplacement(){
        if ( this.getBody().getPosition().x * MainMenu.PPM > 300){
            this.getBody().applyLinearImpulse(new Vector2(-1000f, 0), this.getBody().getWorldCenter(), true);
            this.setDirection("gauche");
        } else if ( this.getBody().getPosition().x * MainMenu.PPM < 240){
            this.getBody().applyLinearImpulse(new Vector2(1000f, 0), this.getBody().getWorldCenter(), true);
            this.setDirection("droite");
        } else {
            if ( this.getBody().getLinearVelocity().x == 0 ){
                this.getBody().applyLinearImpulse(new Vector2(200000f, 0), this.getBody().getWorldCenter(), true);
                this.setDirection("droite");
            }
        }
        if ( MainMenu.Link.getBody().getPosition().y * MainMenu.PPM < 180
                && etatScenario != 0 && etatScenario != 7 ) {
            etatScenario = 0;
        }
        if ( MainMenu.Link.getBody().getPosition().y * MainMenu.PPM > 180
                && MainMenu.Link.getBody().getPosition().y * MainMenu.PPM < 240
                && MainMenu.Link.getX()<= this.getX()  +10
                && MainMenu.Link.getX() >= this.getX() -10 ){
            if ( etatScenario == 0) etatScenario = 1;
            this.getBody().setLinearVelocity(0,0);
            this.setDirection("bas");
        }
    }



//    *****


    public static int etatScenario = 0 ; // à sauvegarder
    /*état 0, état initiale
    * état 1,2, dialoge
    * état 3, choix quant à donner 130 essences pour les gants de force ou non
    * 6, c'est bon
    * 4, il n'a pas d'argent mais a dit oui
    * 5, il n'a pas accepté à 3
    * 7, fin de discussion*/

    public static Texture  texte1 = new Texture("monstres/marchand/texteMarchand1.png");
    public static Texture  texte2 = new Texture("monstres/marchand/texteMarchand2.png");
    public static Texture  texte3 = new Texture("monstres/marchand/texteMarchand3.png");
    public static Texture  texte4 = new Texture("monstres/marchand/texteMarchand4.png");
    public static Texture  texte5 = new Texture("monstres/marchand/texteMarchandNon.png");
    public static Texture  texte6 = new Texture("monstres/marchand/texteMarchandOui.png");

    public static void updateMarchand( float dt ){
        if ( Gdx.input.isKeyJustPressed(Input.Keys.ENTER) ){
            if ( etatScenario == 1 || etatScenario == 2 ) etatScenario ++;
            else if ( etatScenario == 4 || etatScenario == 5 ) etatScenario = 8;
            else if ( etatScenario == 6 ) {
                etatScenario = 7;
                MainMenu.Link.annimationAward = true;
            }
        } else if ( Gdx.input.isKeyJustPressed(Input.Keys.K) ) {
            if ( etatScenario == 3 ) {
                if ( Essence.nombreEssence >= 130 ){
                    if( GantDeForce.isGantDeForcePris == false ) {
                        GantDeForce.isGantDeForcePris = true;
                        MenuSac.setItem(MainMenu.gantDeForce);
                    }
                    Essence.nombreEssence -= 130 ;
                    etatScenario =6;
                } else {
                    etatScenario =4;
                }

            }
        }else if ( Gdx.input.isKeyJustPressed(Input.Keys.L) ) {
            if( etatScenario == 3 ){
                etatScenario = 5 ;
            }
        }
    }


    public static void représentationTexte(GameMain game) {
        if ( etatScenario == 1 ) game.getBatch().draw(texte1,100,60);
        else if ( etatScenario == 2 ) game.getBatch().draw(texte2,100,60);
        else if ( etatScenario == 3 ) game.getBatch().draw(texte3,100,60);
        else if ( etatScenario == 4 ) game.getBatch().draw(texte4,100,60);
        else if ( etatScenario == 5 ) game.getBatch().draw(texte5,100,60);
        else if ( etatScenario == 6 ) game.getBatch().draw(texte6,100,60);
    }
}
