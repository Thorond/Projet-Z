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
import characters.Pnj;
import map.PlacementMain;
import scenes.MainMenu;
import sun.awt.image.ImageWatched;

/**
 * Created by arnOo on 07/04/2017.
 */

public class Flèches extends Sprite {

    public static int nombreFlèche = 0; // à sauvegarder

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
            new Flèches(), new Flèches(), new Flèches(), new Flèches(), new Flèches(),
            new Flèches(), new Flèches(), new Flèches(), new Flèches(), new Flèches(),
            new Flèches(), new Flèches(), new Flèches(), new Flèches(), new Flèches(),
            new Flèches(), new Flèches(), new Flèches(), new Flèches(), new Flèches(),
            new Flèches(), new Flèches(), new Flèches(), new Flèches(), new Flèches(),
            new Flèches(), new Flèches(), new Flèches(), new Flèches(), new Flèches(),
            new Flèches(), new Flèches(), new Flèches()
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
    public static long timerUtilisation = System.currentTimeMillis();

    public static void déplacementInitial(String direction , float x ,float  y){
        if ( nombreFlèche > 0 && System.currentTimeMillis() - timerUtilisation > 400 ) {
            for (int i = 0; i < flèches.length; i++) {
                if (flèches[i].enDéplacement == false) {
                    if (direction.equals("haut")) {
                        flèches[i] = new Flèches("haut", (int) x, (int) y + 60, flècheHaut);
                        flèches[i].getBody().applyLinearImpulse(new Vector2(0f, +100000f), flèches[i].getBody().getWorldCenter(), true);
                    } else if (direction.equals("bas")) {
                        flèches[i] = new Flèches("bas", (int) x, (int) y - 60, flècheBas);
                        flèches[i].getBody().applyLinearImpulse(new Vector2(0f, -100000f), flèches[i].getBody().getWorldCenter(), true);
                    } else if (direction.equals("gauche")) {
                        flèches[i] = new Flèches("gauche", (int) x - 60, (int) y, flècheGauche);
                        flèches[i].getBody().applyLinearImpulse(new Vector2(-100000f, 0f), flèches[i].getBody().getWorldCenter(), true);
                    } else if (direction.equals("droite")) {
                        flèches[i] = new Flèches("droite", (int) x + 60, (int) y, flècheDroite);
                        flèches[i].getBody().applyLinearImpulse(new Vector2(+100000f, 0f), flèches[i].getBody().getWorldCenter(), true);
                    }
                    flèches[i].enDéplacement = true;
                    flèches[i].updateBody();
                    nombreFlèche --;
                    break;
                }
            }
            timerUtilisation = System.currentTimeMillis();
        }
    }

    public static void déplacementInitialNonJoueur(String direction , float x ,float  y ){

        for (int i = 0; i < flèches.length; i++) {
            if (flèches[i].enDéplacement == false) {
                if (direction.equals("haut")) {
                    flèches[i] = new Flèches("haut", (int) x, (int) y + 60, flècheHaut);
                    flèches[i].getBody().applyLinearImpulse(new Vector2(0f, +100000f), flèches[i].getBody().getWorldCenter(), true);
                } else if (direction.equals("bas")) {
                    flèches[i] = new Flèches("bas", (int) x, (int) y - 60, flècheBas);
                    flèches[i].getBody().applyLinearImpulse(new Vector2(0f, -100000f), flèches[i].getBody().getWorldCenter(), true);
                } else if (direction.equals("gauche")) {
                    flèches[i] = new Flèches("gauche", (int) x - 60, (int) y, flècheGauche);
                    flèches[i].getBody().applyLinearImpulse(new Vector2(-100000f, 0f), flèches[i].getBody().getWorldCenter(), true);
                } else if (direction.equals("droite")) {
                    flèches[i] = new Flèches("droite", (int) x + 60, (int) y, flècheDroite);
                    flèches[i].getBody().applyLinearImpulse(new Vector2(+100000f, 0f), flèches[i].getBody().getWorldCenter(), true);
                }
                flèches[i].enDéplacement = true;
                flèches[i].updateBody();
                break;
            }
        }
    }


    public boolean àRencontrerObstacle = false;
    public static void déplacement(MainCharacter Link ){
        for ( int i = 0 ; i < flèches.length ; i++ ){
            if (  flèches[i].enDéplacement){
                if ( flèches[i].direction.equals("gauche")){
                    if ( flèches[i].getBody().getLinearVelocity().x > -90
                            || flèches[i].getBody().getLinearVelocity().y < -10
                            || flèches[i].getBody().getLinearVelocity().y > 10 ) {
                        flèches[i].enDéplacement = false;
                        flèches[i].àRencontrerObstacle = true;
                        MainMenu.world.destroyBody(flèches[i].body);
                    } else if ( flèches[i].getX() < -10 ) {
                        flèches[i].enDéplacement = false;
                        MainMenu.world.destroyBody(flèches[i].body);
                    }
                } else if ( flèches[i].direction.equals("droite")){
                    if ( flèches[i].getBody().getLinearVelocity().x < 90
                            || flèches[i].getBody().getLinearVelocity().y < -10
                            || flèches[i].getBody().getLinearVelocity().y > 10 ) {
                        flèches[i].enDéplacement = false;
                        flèches[i].àRencontrerObstacle = true;
                        MainMenu.world.destroyBody(flèches[i].body);
                    } else if ( flèches[i].getX() > 610 ) {
                        flèches[i].enDéplacement = false;
                        MainMenu.world.destroyBody(flèches[i].body);
                    }
                } else if ( flèches[i].direction.equals("haut")){
                    if ( flèches[i].getBody().getLinearVelocity().x < -10
                            || flèches[i].getBody().getLinearVelocity().x > 10
                            || flèches[i].getBody().getLinearVelocity().y < 90 ) {
                        flèches[i].enDéplacement = false;
                        flèches[i].àRencontrerObstacle = true;
                        MainMenu.world.destroyBody(flèches[i].body);
                    } else if ( flèches[i].getY() > 490 ) {
                        flèches[i].enDéplacement = false;
                        MainMenu.world.destroyBody(flèches[i].body);
                    }
                } else if ( flèches[i].direction.equals("bas")){
                    if ( flèches[i].getBody().getLinearVelocity().x < -10
                            || flèches[i].getBody().getLinearVelocity().x > 10
                            || flèches[i].getBody().getLinearVelocity().y > -90 ) {
                        flèches[i].enDéplacement = false;
                        flèches[i].àRencontrerObstacle = true;
                        MainMenu.world.destroyBody(flèches[i].body);
                    } else if ( flèches[i].getY() < -10 ) {
                        flèches[i].enDéplacement = false;
                        MainMenu.world.destroyBody(flèches[i].body);
                    }
                }



                if ( flèches[i].àRencontrerObstacle){

//			vérification que des monstres sont présents
                    if ( Pnj.nbrDeMonstres > 0){
                        for ( int j = 0; j < Pnj.nbrDeMonstres ; j++){
//					vérification qu'ils soient vivants
                            if ( Pnj.monstres[j].isAlive() ){
                                if (flèches[i].direction.equals("droite")){
                                    if ( (int) flèches[i].getBody().getPosition().x <= (int) Pnj.monstres[j].getBody().getPosition().x
                                            && (int) flèches[i].getBody().getPosition().x + 60 >= (int) Pnj.monstres[j].getBody().getPosition().x
                                            && (int) flèches[i].getBody().getPosition().y -20 <= (int) Pnj.monstres[j].getBody().getPosition().y
                                            && (int) flèches[i].getBody().getPosition().y +20 >= (int) Pnj.monstres[j].getBody().getPosition().y ){
                                        Pnj.monstres[j].subirDégats(2, flèches[i].direction);
                                    }
                                } else if (flèches[i].direction.equals("gauche")){
                                    if ( (int) flèches[i].getBody().getPosition().x >= (int) Pnj.monstres[j].getBody().getPosition().x
                                            && (int) flèches[i].getBody().getPosition().x -60 <= (int) Pnj.monstres[j].getBody().getPosition().x
                                            && (int) flèches[i].getBody().getPosition().y -20 <= (int) Pnj.monstres[j].getBody().getPosition().y
                                            && (int) flèches[i].getBody().getPosition().y +20 >= (int) Pnj.monstres[j].getBody().getPosition().y  ){
                                        Pnj.monstres[j].subirDégats(2, flèches[i].direction);
                                    }
                                } else if (flèches[i].direction.equals("haut")){
                                    if ( (int) flèches[i].getBody().getPosition().x -20 <= (int) Pnj.monstres[j].getBody().getPosition().x
                                            && (int) flèches[i].getBody().getPosition().x + 80 >= (int) Pnj.monstres[j].getBody().getPosition().x
                                            && (int) flèches[i].getBody().getPosition().y  <= (int) Pnj.monstres[j].getBody().getPosition().y
                                            && (int) flèches[i].getBody().getPosition().y +60 >= (int) Pnj.monstres[j].getBody().getPosition().y ){
                                        Pnj.monstres[j].subirDégats(2, flèches[i].direction);
                                    }
                                } else if (flèches[i].direction.equals("bas")){
                                    if ( (int) flèches[i].getBody().getPosition().x -20 <= (int) Pnj.monstres[j].getBody().getPosition().x
                                            && (int) flèches[i].getBody().getPosition().x + 20 >= (int) Pnj.monstres[j].getBody().getPosition().x
                                            && (int) flèches[i].getBody().getPosition().y >= (int) Pnj.monstres[j].getBody().getPosition().y
                                            && (int) flèches[i].getBody().getPosition().y -60 <= (int) Pnj.monstres[j].getBody().getPosition().y){
                                        Pnj.monstres[j].subirDégats(2, flèches[i].direction);
                                    }
                                }
                            }
                        }
                    }

//                    dégat sur joueur

                    if (flèches[i].direction.equals("droite")){
                        if ( (int) flèches[i].getBody().getPosition().x <= (int) Link.getBody().getPosition().x
                                && (int) flèches[i].getBody().getPosition().x + 60 >= (int) Link.getBody().getPosition().x
                                && (int) flèches[i].getBody().getPosition().y -20 <= (int) Link.getBody().getPosition().y
                                && (int) flèches[i].getBody().getPosition().y +20 >= (int) Link.getBody().getPosition().y ){
                            MainMenu.Link.getBody().setTransform(MainMenu.Link.getBody().getPosition().x + 30, MainMenu.Link.getBody().getPosition().y , 0);
                            if ( MainMenu.Link.getDirection().equals("gauche") && Bouclier.isBouclierUtilisé){ // utilisation du bouclier
                            } else MainMenu.Link.setHealth(MainMenu.Link.getHealth() - 4);
                        }
                    } else if (flèches[i].direction.equals("gauche")){
                        if ( (int) flèches[i].getBody().getPosition().x >= (int) Link.getBody().getPosition().x
                                && (int) flèches[i].getBody().getPosition().x -60 <= (int) Link.getBody().getPosition().x
                                && (int) flèches[i].getBody().getPosition().y -20 <= (int) Link.getBody().getPosition().y
                                && (int) flèches[i].getBody().getPosition().y +20 >= (int) Link.getBody().getPosition().y  ){
                            MainMenu.Link.getBody().setTransform(MainMenu.Link.getBody().getPosition().x -30, MainMenu.Link.getBody().getPosition().y, 0);
                            if ( MainMenu.Link.getDirection().equals("droite") && Bouclier.isBouclierUtilisé){ // utilisation du bouclier
                            } else MainMenu.Link.setHealth(MainMenu.Link.getHealth() - 4);
                        }
                    } else if (flèches[i].direction.equals("haut")){
                        if ( (int) flèches[i].getBody().getPosition().x -20 <= (int) Link.getBody().getPosition().x
                                && (int) flèches[i].getBody().getPosition().x + 80 >= (int) Link.getBody().getPosition().x
                                && (int) flèches[i].getBody().getPosition().y  <= (int) Link.getBody().getPosition().y
                                && (int) flèches[i].getBody().getPosition().y +60 >= (int) Link.getBody().getPosition().y ){
                            MainMenu.Link.getBody().setTransform(MainMenu.Link.getBody().getPosition().x, MainMenu.Link.getBody().getPosition().y + 30, 0);
                            if ( MainMenu.Link.getDirection().equals("bas") && Bouclier.isBouclierUtilisé){ // utilisation du bouclier
                            } else MainMenu.Link.setHealth(MainMenu.Link.getHealth() - 4);
                        }
                    } else if (flèches[i].direction.equals("bas")){
                        if ( (int) flèches[i].getBody().getPosition().x -20 <= (int) Link.getBody().getPosition().x
                                && (int) flèches[i].getBody().getPosition().x + 20 >= (int) Link.getBody().getPosition().x
                                && (int) flèches[i].getBody().getPosition().y >= (int) Link.getBody().getPosition().y
                                && (int) flèches[i].getBody().getPosition().y -60 <= (int) Link.getBody().getPosition().y){
                            MainMenu.Link.getBody().setTransform(MainMenu.Link.getBody().getPosition().x, MainMenu.Link.getBody().getPosition().y - 30, 0);
                            if ( MainMenu.Link.getDirection().equals("haut") && Bouclier.isBouclierUtilisé){ // utilisation du bouclier
                            } else MainMenu.Link.setHealth(MainMenu.Link.getHealth() - 4);
                        }
                    }
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

    public static void réinitialisation() {
        for ( int i = 0 ; i < flèches.length ; i++ ){
            if ( flèches[i].enDéplacement ){
                flèches[i].enDéplacement = false;
                MainMenu.world.destroyBody(flèches[i].body);
            }
        }
    }
}
