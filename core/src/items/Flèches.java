package items;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.physics.box2d.Body;
import com.badlogic.gdx.physics.box2d.BodyDef;
import com.badlogic.gdx.physics.box2d.Fixture;
import com.badlogic.gdx.physics.box2d.FixtureDef;
import com.badlogic.gdx.physics.box2d.PolygonShape;
import com.badlogic.gdx.physics.box2d.World;
import com.mygdx.game.GameMain;

import characters.MainCharacter;
import scenes.MainMenu;
import sun.awt.image.ImageWatched;

/**
 * Created by arnOo on 07/04/2017.
 */

public class Flèches extends Sprite {

    public String direction;
    public int x;
    public int y;

    // *************************** corps ***********************
    private Body body;
    public World world = MainMenu.world;

    public Body getBody() {
        return body;
    }

    public void setBody(Body body) {
        this.body = body;
    }
    void createBody(float x, float y){
        BodyDef bodyDef = new BodyDef();
        bodyDef.type = BodyDef.BodyType.DynamicBody;
        bodyDef.position.set(x/ MainMenu.PPM,y/MainMenu.PPM);
        body = world.createBody(bodyDef);

        PolygonShape shape = new PolygonShape();
        if ( this.direction.equals("gauche") || this.direction.equals("droite")  )
            shape.setAsBox(27/MainMenu.PPM , 10);
        else if ( this.direction.equals("haut") || this.direction.equals("bas")  )
            shape.setAsBox(10, 27/MainMenu.PPM);

        FixtureDef fixtureDef = new FixtureDef();
        fixtureDef.shape = shape;
        fixtureDef.density = 0.1f;

        Fixture fixture = body.createFixture(fixtureDef);

        shape.dispose();
    }

    public void updateBody(){
        this.setPosition(this.getBody().getPosition().x *MainMenu.PPM , this.getBody().getPosition().y*MainMenu.PPM);
    }
    // ====================================================

    public static Texture flècheHaut = new Texture("items/flèches/flècheHaut.png");
    public static Texture flècheBas = new Texture("items/flèches/flècheBas.png");
    public static Texture flècheDroite = new Texture("items/flèches/flècheDroite.png");
    public static Texture flècheGauche = new Texture("items/flèches/flècheGauche.png");

    public static Flèches[] flèches = new Flèches[] { new Flèches(), new Flèches(), new Flèches(), new Flèches(), new Flèches(),
            new Flèches(), new Flèches(), new Flèches(), new Flèches(), new Flèches(),
            new Flèches(), new Flèches(), new Flèches(), new Flèches(), new Flèches(),
            new Flèches(), new Flèches(), new Flèches(), new Flèches(), new Flèches()
    };

    public Flèches(){
    }



    public Flèches(String direction, int x, int y , Texture texture){
        super(texture);
        this.direction = direction;
        this.x = x;
        this.y = y;
        this.createBody(x,y);
    }



    public boolean enDéplacement = false;

    public static void déplacementInitial(MainCharacter Link){
        for ( int i = 0 ; i < flèches.length ; i++ ){
            if ( flèches[i].enDéplacement == false ) {
                if( Link.getDirection().equals("haut") )
                {
                    flèches[i] = new Flèches("haut",(int) Link.getX(), (int) Link.getY() +60,flècheHaut);
                    flèches[i].getBody().applyLinearImpulse(new Vector2(0f,+100000f), Link.getBody().getWorldCenter(), true);
                }
                else if( Link.getDirection().equals("bas"))
                {
                    flèches[i] = new Flèches("bas",(int) Link.getX(), (int) Link.getY()-60,flècheBas);
                    flèches[i].getBody().applyLinearImpulse(new Vector2(0f,-100000f), Link.getBody().getWorldCenter(), true);
                }
                else if( Link.getDirection().equals("gauche"))
                {
                    flèches[i] = new Flèches("gauche",(int) Link.getX()-60, (int) Link.getY(),flècheGauche);
                    flèches[i].getBody().applyLinearImpulse(new Vector2(-100000f,0f), Link.getBody().getWorldCenter(), true);
                }
                else if( Link.getDirection().equals("droite"))
                {
                    flèches[i] = new Flèches("droite",(int) Link.getX()+60, (int) Link.getY(),flècheDroite);
                    flèches[i].getBody().applyLinearImpulse(new Vector2(+100000f,0f), Link.getBody().getWorldCenter(), true);
                }
                flèches[i].enDéplacement = true;
                flèches[i].updateBody();
                break;
            }
        }
    }
    public static void déplacement(MainCharacter Link ){
        for ( int i = 0 ; i < flèches.length ; i++ ){
            if (  flèches[i].enDéplacement){
                if ( flèches[i].getBody().getLinearVelocity().x > -90
                        && flèches[i].getBody().getLinearVelocity().x < 90
                        && flèches[i].getBody().getLinearVelocity().y > -90
                        && flèches[i].getBody().getLinearVelocity().y < 90) {
                    flèches[i].enDéplacement = false;
                    MainMenu.world.destroyBody(flèches[i].body);
                }
                else if ( (flèches[i].getX()  > 610 || flèches[i].getY() > 490 )
                        || (flèches[i].getX() < -10 || flèches[i].getY() < -10 ) ){
                    flèches[i].enDéplacement = false;
                    MainMenu.world.destroyBody(flèches[i].body);
                }
            }
        }
    }

    public static void représentationFlèches(GameMain game) {
        for ( int i = 0 ; i < flèches.length ; i++ ){
            if (  flèches[i].enDéplacement){
                flèches[i].draw( game.getBatch());
                flèches[i].updateBody();
            }
        }
    }
}
