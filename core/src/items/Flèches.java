package items;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.physics.box2d.Body;
import com.badlogic.gdx.physics.box2d.BodyDef;
import com.badlogic.gdx.physics.box2d.Fixture;
import com.badlogic.gdx.physics.box2d.FixtureDef;
import com.badlogic.gdx.physics.box2d.PolygonShape;
import com.badlogic.gdx.physics.box2d.World;

import scenes.MainMenu;

/**
 * Created by arnOo on 07/04/2017.
 */

public class Flèches extends Sprite {

    public String direction;
    public int x;
    public int y;
    private Body body;
    public World world = MainMenu.world;

    public static Texture flècheHaut = new Texture("items/flèches/flècheHaut.png");
    public static Texture flècheBas = new Texture("items/flèches/flècheBas.png");
    public static Texture flècheDroite = new Texture("items/flèches/flècheDroite.png");
    public static Texture flècheGauche = new Texture("items/flèches/flècheGauche.png");

    public Body getBody() {
        return body;
    }

    public void setBody(Body body) {
        this.body = body;
    }

    public Flèches(String direction, int x, int y , Texture texture){
        super(texture);
        this.direction = direction;
        this.x = x;
        this.y = y;
    }

    void createBody(float x, float y){
        BodyDef bodyDef = new BodyDef();
        bodyDef.type = BodyDef.BodyType.DynamicBody;
        bodyDef.position.set(x/ MainMenu.PPM,y/MainMenu.PPM);
        body = world.createBody(bodyDef);

        PolygonShape shape = new PolygonShape();
        shape.setAsBox((getWidth() / 2f)/MainMenu.PPM , (getHeight() / 2f)/MainMenu.PPM);

        FixtureDef fixtureDef = new FixtureDef();
        fixtureDef.shape = shape;
        fixtureDef.density = 1;

        Fixture fixture = body.createFixture(fixtureDef);

        shape.dispose();
    }

    public void updateBody(){
        this.setPosition(this.getBody().getPosition().x *MainMenu.PPM , this.getBody().getPosition().y*MainMenu.PPM);
    }

}
