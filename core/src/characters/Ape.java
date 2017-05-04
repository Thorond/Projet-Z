package characters;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.physics.box2d.World;
import com.mygdx.game.GameMain;

import items.Bouclier;
import scenes.MainMenu;

/**
 * Created by arnOo on 02/05/2017.
 */

public class Ape extends Pnj{

    public long startD = System.currentTimeMillis();
    public long timerDépla = System.currentTimeMillis();
    public long timerAtta = System.currentTimeMillis();

    public int textBas1 = 0;
    public static Texture apeBas1 = new Texture("monstres/ape/apeBas1.png");
    public static Texture apeBas2 = new Texture("monstres/ape/apeBas2.png");
    public static Texture apeBas3 = new Texture("monstres/ape/apeBas3.png");
    
    public int textGauche1 = 0;
    public static Texture apeGauche1 = new Texture("monstres/ape/apeGauche1.png");
    public static Texture apeGauche2 = new Texture("monstres/ape/apeGauche2.png");
    
    public static Texture apeDead = new Texture("monstres/ape/apeDead.png");
    
    public static Texture laserT = new Texture("monstres/ape/laser.png");
    public static Sprite laser = new Sprite(laserT);

    public Ape(World world, Texture text, float x, float y, String direction) {
        super(world,text, 30, 30, 3, x, y, direction);
        // TODO Auto-generated constructor stub
    }

    @Override
    public void déplacement(){
        if ( this.isAlive() && ! isAtta ){
            if ( System.currentTimeMillis() - timerDépla > 1000 ) {
                if (this.getY() - MainMenu.Link.getY() > -20) {
                    this.getBody().setLinearVelocity(new Vector2(0, -100f));
                    this.setDirection("bas");
                } else if (this.getY() - MainMenu.Link.getY() < -30) {
                    this.getBody().setLinearVelocity(new Vector2(0, +100f));
                    this.setDirection("haut");
                } else {
                    this.getBody().setLinearVelocity(new Vector2(this.getBody().getLinearVelocity().x, 0));
                }
                if (this.getBody().getLinearVelocity().x == 0 && this.getBody().getLinearVelocity().y == 0)
                    arrét = true;
                else arrét = false;

                timerDépla = System.currentTimeMillis();
            }
        }
    }

    public boolean isAtta = false;
    public boolean laserPrésent = false;
    public void attaque(){
        if (this.getY() - MainMenu.Link.getY() < -20 && this.getY() - MainMenu.Link.getY() > -30) {
            if ( ! isAtta ) {
                isAtta = true;
                timerAtta = System.currentTimeMillis();
            }
            this.getBody().setLinearVelocity(0, 0);
            this.setDirection("gauche");
            if ( ! laserPrésent ) {
                textGauche1 = 0;
                xLaser = 0;
                DxLaser = 10;
            }
        }

        if ( System.currentTimeMillis() - timerAtta > 1000) isAtta = false; // il réitère l'attaque au bout d'un certain temps

        if ( System.currentTimeMillis() - timerAtta > 200) { // début de l'attaque du laser
            if ( isAtta ){
                if ( ! laserPrésent ) {
                    laserPrésent = true;
                }
            } else {
                laserPrésent = false;
            }

        }
    }

    @Override
    public void infligéDégatLink(){
        if ( laserPrésent && xLaser >= 260 ) {
            if (System.currentTimeMillis() - timerSubirDégat > 250) {

                if (MainMenu.Link.getY() +20 >= this.getY()
                        && this.getY() +30 > MainMenu.Link.getY() ) {
                    MainMenu.Link.isHit = true;
                    MainMenu.Link.timerHit = System.currentTimeMillis();
                    MainMenu.Link.getBody().applyLinearImpulse(new Vector2(0, -600000), MainMenu.Link.getBody().getWorldCenter(), true);

                    if (MainMenu.Link.getDirection().equals("droite") && Bouclier.isBouclierUtilisé) { // utilisation du bouclier

                    } else MainMenu.Link.setHealth(MainMenu.Link.getHealth() - this.getStrength());
                } else if (this.getY() - MainMenu.Link.getY() < 0
                        && MainMenu.Link.getY() <= this.getY() + this.getHeight() / 2 + 15) {
                    MainMenu.Link.isHit = true;
                    MainMenu.Link.timerHit = System.currentTimeMillis();
                    MainMenu.Link.getBody().applyLinearImpulse(new Vector2(0, +600000), MainMenu.Link.getBody().getWorldCenter(), true);

                    if (MainMenu.Link.getDirection().equals("droite") && Bouclier.isBouclierUtilisé) { // utilisation du bouclier

                    } else MainMenu.Link.setHealth(MainMenu.Link.getHealth() - this.getStrength());
                }

                timerSubirDégat = System.currentTimeMillis();
            }
        }
    }

    public int xLaser = 0;
    public int DxLaser = 10;
    public void représentationlaser(GameMain game, int x , int y){
        int xMax = 360;
        int DxMax = 360;
        if ( this.laserPrésent ) {

            laser.setSize(DxLaser,laser.getHeight());
            laser.setX(this.getX()-xLaser + x );
            laser.setY(this.getY() + y);
            laser.draw(game.getBatch());

            if ( xLaser < xMax ) xLaser +=20;
            if ( DxLaser < DxMax ) DxLaser +=20 ;
        }
    }

    public void représentation(){
        if (this.getDirection().equals("gauche")){
            if (this.textGauche1 == 0) {
                this.setTexture(apeGauche1);
                this.textGauche1 = 1;
            }
            if ( System.currentTimeMillis() - timerAtta > 200) {
                if (this.textGauche1 == 1) {
                    this.setTexture(apeGauche2);
                }
            }
        }
        else if (this.getDirection().equals("bas") || this.getDirection().equals("haut")){
            if ( System.currentTimeMillis() - this.startD > 500) {
                if (this.arrét){
                    this.setTexture(apeBas2);
                } else {
                    if (this.textBas1 == 0) {
                        this.setTexture(apeBas1);
                        this.textBas1 = 1;
                    } else if (this.textBas1 == 1) {
                        this.setTexture(apeBas2);
                        this.textBas1 = 2;
                    } else if (this.textBas1 == 2) {
                        this.setTexture(apeBas3);
                        this.textBas1 = 0;
                    }
                    this.startD = System.currentTimeMillis();
                }
            }
        }


    }
}
