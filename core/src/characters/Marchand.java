package characters;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.physics.box2d.World;

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

    }




}
