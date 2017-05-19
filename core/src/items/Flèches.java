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
import map.CadrillageMap;
import map.zoneGlace.PlacementMainZoneGlace;
import menus.MenuSac;
import scenes.MainMenu;

/**
 * Created by arnOo on 07/04/2017.
 */

public class Flèches extends Sprite {

    public static int nombreFlèche = 0; // à sauvegarder

    public String direction;
    public int x;
    public int y;
    public boolean avecBombe = false;

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

    // fonction qui permet d'afficher les graphismes en fonction de la position du corps
    public void updateBody(){
        this.setPosition(this.getBody().getPosition().x *MainMenu.PPM , this.getBody().getPosition().y*MainMenu.PPM);
    }
    // ====================================================

    public static Texture dropFlèchesT = new Texture("items/flèches/dropFlèches.png");

    public static Texture flècheHaut = new Texture("items/flèches/flècheHaut.png");
    public static Texture flècheBas = new Texture("items/flèches/flècheBas.png");
    public static Texture flècheDroite = new Texture("items/flèches/flècheDroite.png");
    public static Texture flècheGauche = new Texture("items/flèches/flècheGauche.png");
    public static Texture flècheHautBombe = new Texture("items/flèches/flècheHautBombe.png");
    public static Texture flècheBasBombe = new Texture("items/flèches/flècheBasBombe.png");
    public static Texture flècheDroiteBombe = new Texture("items/flèches/flècheDroiteBombe.png");
    public static Texture flècheGaucheBombe = new Texture("items/flèches/flècheGaucheBombe.png");

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
                        if ( MenuSac.itemsKL[0] instanceof Bombe || MenuSac.itemsKL[1] instanceof Bombe ) flèches[i] = new Flèches("haut", (int) x, (int) y + 60, flècheHautBombe);
                        else flèches[i] = new Flèches("haut", (int) x, (int) y + 60, flècheHaut);
                        flèches[i].getBody().applyLinearImpulse(new Vector2(0f, +100000f), flèches[i].getBody().getWorldCenter(), true);
                    } else if (direction.equals("bas")) {
                        if ( MenuSac.itemsKL[0] instanceof Bombe || MenuSac.itemsKL[1] instanceof Bombe) flèches[i] = new Flèches("bas", (int) x, (int) y - 60, flècheBasBombe);
                        else flèches[i] = new Flèches("bas", (int) x, (int) y - 60, flècheBas);
                        flèches[i].getBody().applyLinearImpulse(new Vector2(0f, -100000f), flèches[i].getBody().getWorldCenter(), true);
                    } else if (direction.equals("gauche")) {
                        if ( MenuSac.itemsKL[0] instanceof Bombe || MenuSac.itemsKL[1] instanceof Bombe ) flèches[i] = new Flèches("gauche", (int) x - 60, (int) y, flècheGaucheBombe);
                        else flèches[i] = new Flèches("gauche", (int) x - 60, (int) y, flècheGauche);
                        flèches[i].getBody().applyLinearImpulse(new Vector2(-100000f, 0f), flèches[i].getBody().getWorldCenter(), true);
                    } else if (direction.equals("droite")) {
                        if ( MenuSac.itemsKL[0] instanceof Bombe || MenuSac.itemsKL[1] instanceof Bombe ) flèches[i] = new Flèches("droite", (int) x + 60, (int) y, flècheDroiteBombe);
                        else flèches[i] = new Flèches("droite", (int) x + 60, (int) y, flècheDroite);
                        flèches[i].getBody().applyLinearImpulse(new Vector2(+100000f, 0f), flèches[i].getBody().getWorldCenter(), true);
                    }
                    flèches[i].enDéplacement = true;
                    flèches[i].updateBody();
                    nombreFlèche --;

                    if (MenuSac.itemsKL[0] instanceof Bombe || MenuSac.itemsKL[1] instanceof Bombe){
                        flèches[i].avecBombe = true;
                        MainMenu.bombe.setNombreItem(MainMenu.bombe.getNombreItem() -1);
                    }

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
    public boolean enExplosion = false;
    public static void déplacement(MainCharacter Link ){
        for ( int i = 0 ; i < flèches.length ; i++ ){
            if (  flèches[i].enDéplacement){
                if ( flèches[i].direction.equals("gauche")){
                    if ( flèches[i].getBody().getLinearVelocity().x > -90
                            || flèches[i].getBody().getLinearVelocity().y < -10
                            || flèches[i].getBody().getLinearVelocity().y > 10
                            || flèches[i].getX() < -10) {
                        flèches[i].enDéplacement = false;
                        flèches[i].àRencontrerObstacle = true;
                        MainMenu.world.destroyBody(flèches[i].body);
                    }
                } else if ( flèches[i].direction.equals("droite")){
                    if ( flèches[i].getBody().getLinearVelocity().x < 90
                            || flèches[i].getBody().getLinearVelocity().y < -10
                            || flèches[i].getBody().getLinearVelocity().y > 10
                            || flèches[i].getX() > 610 ) {
                        flèches[i].enDéplacement = false;
                        flèches[i].àRencontrerObstacle = true;
                        MainMenu.world.destroyBody(flèches[i].body);
                    }
                } else if ( flèches[i].direction.equals("haut")){
                    if ( flèches[i].getBody().getLinearVelocity().x < -10
                            || flèches[i].getBody().getLinearVelocity().x > 10
                            || flèches[i].getBody().getLinearVelocity().y < 90
                            || flèches[i].getY() > 490 ) {
                        flèches[i].enDéplacement = false;
                        flèches[i].àRencontrerObstacle = true;
                        MainMenu.world.destroyBody(flèches[i].body);
                    }
                } else if ( flèches[i].direction.equals("bas")){
                    if ( flèches[i].getBody().getLinearVelocity().x < -10
                            || flèches[i].getBody().getLinearVelocity().x > 10
                            || flèches[i].getBody().getLinearVelocity().y > -90
                            || flèches[i].getY() < -10  ) {
                        flèches[i].enDéplacement = false;
                        flèches[i].àRencontrerObstacle = true;
                        MainMenu.world.destroyBody(flèches[i].body);
                    }
                }



                if ( flèches[i].àRencontrerObstacle){
                    if (  flèches[i].avecBombe && ! flèches[i].enExplosion) {
                        flèches[i].setTexture(Bombe.explosion);
                        flèches[i].setSize(Bombe.explosion.getWidth() ,Bombe.explosion.getHeight());
                        flèches[i].timerExplosion = System.currentTimeMillis();
                        flèches[i].enExplosion = true;
                    }

                    if ( flèches[i].avecBombe ){
                        flèches[i].explosionFlèche();
                    } else {
//			vérification que des monstres sont présents
                        if (Pnj.nbrDeMonstres > 0) {
                            for (int j = 0; j < Pnj.nbrDeMonstres; j++) {
//					vérification qu'ils soient vivants
                                if (Pnj.monstres[j].isAlive()) {
                                    if (flèches[i].direction.equals("droite")) {
                                        if ((int) flèches[i].getBody().getPosition().x <= (int) Pnj.monstres[j].getBody().getPosition().x
                                                && (int) flèches[i].getBody().getPosition().x + 60 >= (int) Pnj.monstres[j].getBody().getPosition().x
                                                && (int) flèches[i].getBody().getPosition().y - 20 <= (int) Pnj.monstres[j].getBody().getPosition().y
                                                && (int) flèches[i].getBody().getPosition().y + 20 >= (int) Pnj.monstres[j].getBody().getPosition().y) {
                                            Pnj.monstres[j].subirDégats(2, flèches[i].direction);
                                        }
                                    } else if (flèches[i].direction.equals("gauche")) {
                                        if ((int) flèches[i].getBody().getPosition().x >= (int) Pnj.monstres[j].getBody().getPosition().x
                                                && (int) flèches[i].getBody().getPosition().x - 60 <= (int) Pnj.monstres[j].getBody().getPosition().x
                                                && (int) flèches[i].getBody().getPosition().y - 20 <= (int) Pnj.monstres[j].getBody().getPosition().y
                                                && (int) flèches[i].getBody().getPosition().y + 20 >= (int) Pnj.monstres[j].getBody().getPosition().y) {
                                            Pnj.monstres[j].subirDégats(2, flèches[i].direction);
                                        }
                                    } else if (flèches[i].direction.equals("haut")) {
                                        if ((int) flèches[i].getBody().getPosition().x - 20 <= (int) Pnj.monstres[j].getBody().getPosition().x
                                                && (int) flèches[i].getBody().getPosition().x + 80 >= (int) Pnj.monstres[j].getBody().getPosition().x
                                                && (int) flèches[i].getBody().getPosition().y <= (int) Pnj.monstres[j].getBody().getPosition().y
                                                && (int) flèches[i].getBody().getPosition().y + 60 >= (int) Pnj.monstres[j].getBody().getPosition().y) {
                                            Pnj.monstres[j].subirDégats(2, flèches[i].direction);
                                        }
                                    } else if (flèches[i].direction.equals("bas")) {
                                        if ((int) flèches[i].getBody().getPosition().x - 20 <= (int) Pnj.monstres[j].getBody().getPosition().x
                                                && (int) flèches[i].getBody().getPosition().x + 20 >= (int) Pnj.monstres[j].getBody().getPosition().x
                                                && (int) flèches[i].getBody().getPosition().y >= (int) Pnj.monstres[j].getBody().getPosition().y
                                                && (int) flèches[i].getBody().getPosition().y - 60 <= (int) Pnj.monstres[j].getBody().getPosition().y) {
                                            Pnj.monstres[j].subirDégats(2, flèches[i].direction);
                                        }
                                    }
                                }
                            }
                        }

//                    dégat sur joueur

                        if (flèches[i].direction.equals("droite")) {
                            if ((int) flèches[i].getBody().getPosition().x <= (int) Link.getBody().getPosition().x
                                    && (int) flèches[i].getBody().getPosition().x + 60 >= (int) Link.getBody().getPosition().x
                                    && (int) flèches[i].getBody().getPosition().y - 20 <= (int) Link.getBody().getPosition().y
                                    && (int) flèches[i].getBody().getPosition().y + 20 >= (int) Link.getBody().getPosition().y) {
                                MainMenu.Link.isHit = true;
                                MainMenu.Link.timerHit = System.currentTimeMillis();
                                MainMenu.Link.getBody().applyLinearImpulse(new Vector2(+600000, 0), MainMenu.Link.getBody().getWorldCenter(), true);

                                if (MainMenu.Link.getDirection().equals("gauche") && Bouclier.isBouclierUtilisé) { // utilisation du bouclier
                                } else MainMenu.Link.setHealth(MainMenu.Link.getHealth() - 4);
                            }
                        } else if (flèches[i].direction.equals("gauche")) {
                            if ((int) flèches[i].getBody().getPosition().x >= (int) Link.getBody().getPosition().x
                                    && (int) flèches[i].getBody().getPosition().x - 60 <= (int) Link.getBody().getPosition().x
                                    && (int) flèches[i].getBody().getPosition().y - 20 <= (int) Link.getBody().getPosition().y
                                    && (int) flèches[i].getBody().getPosition().y + 20 >= (int) Link.getBody().getPosition().y) {
                                MainMenu.Link.isHit = true;
                                MainMenu.Link.timerHit = System.currentTimeMillis();
                                MainMenu.Link.getBody().applyLinearImpulse(new Vector2(-600000, 0), MainMenu.Link.getBody().getWorldCenter(), true);

                                if (MainMenu.Link.getDirection().equals("droite") && Bouclier.isBouclierUtilisé) { // utilisation du bouclier
                                } else MainMenu.Link.setHealth(MainMenu.Link.getHealth() - 4);
                            }
                        } else if (flèches[i].direction.equals("haut")) {
                            if ((int) flèches[i].getBody().getPosition().x - 20 <= (int) Link.getBody().getPosition().x
                                    && (int) flèches[i].getBody().getPosition().x + 80 >= (int) Link.getBody().getPosition().x
                                    && (int) flèches[i].getBody().getPosition().y <= (int) Link.getBody().getPosition().y
                                    && (int) flèches[i].getBody().getPosition().y + 60 >= (int) Link.getBody().getPosition().y) {
                                MainMenu.Link.isHit = true;
                                MainMenu.Link.timerHit = System.currentTimeMillis();
                                MainMenu.Link.getBody().applyLinearImpulse(new Vector2(0, +600000), MainMenu.Link.getBody().getWorldCenter(), true);

                                if (MainMenu.Link.getDirection().equals("bas") && Bouclier.isBouclierUtilisé) { // utilisation du bouclier
                                } else MainMenu.Link.setHealth(MainMenu.Link.getHealth() - 4);
                            }
                        } else if (flèches[i].direction.equals("bas")) {
                            if ((int) flèches[i].getBody().getPosition().x - 20 <= (int) Link.getBody().getPosition().x
                                    && (int) flèches[i].getBody().getPosition().x + 20 >= (int) Link.getBody().getPosition().x
                                    && (int) flèches[i].getBody().getPosition().y >= (int) Link.getBody().getPosition().y
                                    && (int) flèches[i].getBody().getPosition().y - 60 <= (int) Link.getBody().getPosition().y) {
                                MainMenu.Link.isHit = true;
                                MainMenu.Link.timerHit = System.currentTimeMillis();
                                MainMenu.Link.getBody().applyLinearImpulse(new Vector2(0, -600000), MainMenu.Link.getBody().getWorldCenter(), true);

                                if (MainMenu.Link.getDirection().equals("haut") && Bouclier.isBouclierUtilisé) { // utilisation du bouclier
                                } else MainMenu.Link.setHealth(MainMenu.Link.getHealth() - 4);
                            }
                        }

                        // corde grotte

                        if ( PlacementMainZoneGlace.positionSousMap.equals("GrotteI1Salle1")){
                            //		 effet sur les décors
                            if ( CadrillageMap.typeDeDécor[(int) ( (flèches[i].getX() + 45 )/ 60 )][(int) ((flèches[i].getY()) / 60 )].equals("destructible") ){
                                CadrillageMap.setTypeDeDécor((int) ( (flèches[i].getX() + 45 )/ 60 ),(int) ((flèches[i].getY()) / 60 ), "détruit");

                            } else if ( CadrillageMap.typeDeDécor[(int) (( flèches[i].getX() ) / 60 )][(int) ((flèches[i].getY()+ 45 )/ 60 )].equals("destructible") ){
                                CadrillageMap.setTypeDeDécor((int) ( (flèches[i].getX()  )/ 60 ),(int) ((flèches[i].getY() + 45) / 60 ), "détruit");

                            } else if ( CadrillageMap.typeDeDécor[(int) ( flèches[i].getX()  / 60 )][(int) ((flèches[i].getY()- 45 )/ 60 )].equals("destructible") ){
                                CadrillageMap.setTypeDeDécor((int) ( (flèches[i].getX()  )/ 60 ),(int) ((flèches[i].getY() - 45) / 60 ), "détruit");

                            } else if ( CadrillageMap.typeDeDécor[(int) ( (flèches[i].getX() - 45) / 60 )][(int) (flèches[i].getY() / 60 )].equals("destructible") ){
                                CadrillageMap.setTypeDeDécor((int) ( (flèches[i].getX() - 45 )/ 60 ),(int) ((flèches[i].getY()) / 60 ), "détruit");

                            } else if ( CadrillageMap.typeDeDécor[(int) ( flèches[i].getX()  / 60 )][(int) (flèches[i].getY() / 60 )].equals("destructible") ){
                                CadrillageMap.setTypeDeDécor((int) ( (flèches[i].getX()  )/ 60 ),(int) ((flèches[i].getY()) / 60 ), "détruit");

                            }
                        }
                    }
                }
            }
        }
    }

    public long timerExplosion = System.currentTimeMillis();
    public static void représentationFlèches(GameMain game) {
        for ( int i = 0 ; i < flèches.length ; i++ ){
            if (  flèches[i].enDéplacement ||flèches[i].enExplosion){
                flèches[i].draw( game.getBatch());
                flèches[i].updateBody();
            }
            if ( flèches[i].àRencontrerObstacle && flèches[i].avecBombe
                    && System.currentTimeMillis() - flèches[i].timerExplosion > 1000 )
                flèches[i].enExplosion = false;
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

//


    Bombe bombeFlèche = new Bombe(1);
    //	explosion de la bombe quand elle est sur une flèche
    public void explosionFlèche( ){

        //		vérification que des monstres sont présents
        if ( Pnj.nbrDeMonstres > 0 && ! PlacementMainZoneGlace.positionSousMap.equals("DonjonSalle10")){
            for ( int i = 0; i < Pnj.nbrDeMonstres ; i++){
                //				vérification qu'ils soient vivants
                if ( Pnj.monstres[i].isAlive() ){
                    if ( (int) this.getX() + 80 >= (int) Pnj.monstres[i].getBody().getPosition().x * MainMenu.PPM
                            && (int) this.getX() - 80 <= (int) Pnj.monstres[i].getBody().getPosition().x * MainMenu.PPM
                            && (int) this.getY() + 80 >= (int) Pnj.monstres[i].getBody().getPosition().y * MainMenu.PPM
                            && (int) this.getY() - 80 <= (int) Pnj.monstres[i].getBody().getPosition().y * MainMenu.PPM ){

                        Pnj.monstres[i].subirDégatsBombe(bombeFlèche, (int) this.getX(), (int) this.getY());
                    }
                }

            }
        }
//		dégàt sur le joueur

        if ( (int) this.getX() + 60 >= (int) MainMenu.Link.getBody().getPosition().x * MainMenu.PPM
                && (int) this.getX() - 60 <= (int) MainMenu.Link.getBody().getPosition().x * MainMenu.PPM
                && (int) this.getY() + 60 >= (int) MainMenu.Link.getBody().getPosition().y * MainMenu.PPM
                && (int) this.getY() - 60 <= (int) MainMenu.Link.getBody().getPosition().y * MainMenu.PPM ){
            MainMenu.Link.subirDégatsBombe(bombeFlèche, (int) this.getX(), (int) this.getY() );
            MainMenu.Link.setHealth(MainMenu.Link.getHealth() - bombeFlèche.getDégàts() );
        }

//		 effet sur les décors
        if ( CadrillageMap.typeDeDécor[(int) ( (this.getX() + 45 )/ 60 )][(int) ((this.getY()) / 60 )].equals("destructible") ){
            CadrillageMap.setTypeDeDécor((int) ( (this.getX() + 45 )/ 60 ),(int) ((this.getY()) / 60 ), "détruit");

        } else if ( CadrillageMap.typeDeDécor[(int) (( this.getX() ) / 60 )][(int) ((this.getY()+ 45 )/ 60 )].equals("destructible") ){
            CadrillageMap.setTypeDeDécor((int) ( (this.getX()  )/ 60 ),(int) ((this.getY() + 45) / 60 ), "détruit");

        } else if ( CadrillageMap.typeDeDécor[(int) ( this.getX()  / 60 )][(int) ((this.getY()- 45 )/ 60 )].equals("destructible") ){
            CadrillageMap.setTypeDeDécor((int) ( (this.getX()  )/ 60 ),(int) ((this.getY() - 45) / 60 ), "détruit");

        } else if ( CadrillageMap.typeDeDécor[(int) ( (this.getX() - 45) / 60 )][(int) (this.getY() / 60 )].equals("destructible") ){
            CadrillageMap.setTypeDeDécor((int) ( (this.getX() - 45 )/ 60 ),(int) ((this.getY()) / 60 ), "détruit");

        } else if ( CadrillageMap.typeDeDécor[(int) ( this.getX()  / 60 )][(int) (this.getY() / 60 )].equals("destructible") ){
            CadrillageMap.setTypeDeDécor((int) ( (this.getX()  )/ 60 ),(int) ((this.getY()) / 60 ), "détruit");

        }
    }

//     *******************************************************************************
//                                      drop des flèches
//    **********************************************************************************

    public boolean estPrésent =false;
    public boolean clignotement = false;
    public long start;
    public long startClignotement;
    public int xDrop;
    public int yDrop;
    public static Flèches[] dropFlèches = new Flèches[] { new Flèches(), new Flèches(), new Flèches(), new Flèches(), new Flèches(),
            new Flèches(), new Flèches(), new Flèches(), new Flèches(), new Flèches(),
            new Flèches(), new Flèches(), new Flèches(), new Flèches(), new Flèches(),
            new Flèches(), new Flèches(), new Flèches(), new Flèches(), new Flèches()
    };

    public void déposerFlèches(int xDrop, int yDrop){
        double tempo = Math.random();
        if ( tempo < 0.25 ) {
            this.xDrop = xDrop + (int) (30 * Math.random());
            this.yDrop = yDrop + (int) (30 * Math.random());
        }
        else if (tempo > 0.25 && tempo < 0.5) {
            this.xDrop = xDrop - (int) (30 * Math.random());
            this.yDrop = yDrop + (int) (30 * Math.random());
        }
        else if (tempo > 0.5 && tempo < 0.75 ) {
            this.xDrop = xDrop + (int) (30 * Math.random());
            this.yDrop = yDrop - (int) (30 * Math.random());
        }
        else if (tempo > 0.75 ){
            this.xDrop = xDrop - (int) (30 * Math.random());
            this.yDrop = yDrop - (int) (30 * Math.random());
        }
    }

    public void setEstPrésent(boolean boo){
        estPrésent = boo;
        if (boo == true) {
            start = System.currentTimeMillis();
            startClignotement = System.currentTimeMillis();
        }
    }

    public void clignotementFlèches(){
        if ( System.currentTimeMillis() - this.startClignotement > 300){
            if ( clignotement == false ){
                clignotement = true;
            } else{
                clignotement = false;
            }
            startClignotement = System.currentTimeMillis();

        }
    }

    public static void remplirDropFlèches(int xDrop, int yDrop){
        if ( Math.random() < 0.4 ){
            for ( int i = 0 ; i < dropFlèches.length ; i++ ){
                if ( dropFlèches[i].estPrésent == false ) {
                    dropFlèches[i].setEstPrésent(true);
                    dropFlèches[i].déposerFlèches(xDrop, yDrop);
                    break;
                }
            }
        }
    }

    public static void détectionFlèches(MainCharacter Link){
        for ( int i = 0 ; i < dropFlèches.length ; i ++){
            if (dropFlèches[i].estPrésent ){
                if ( (int) (Link.getBody().getPosition().x*MainMenu.PPM) -10 <= dropFlèches[i].xDrop
                        && (int) (Link.getBody().getPosition().x*MainMenu.PPM) +40 >= dropFlèches[i].xDrop
                        && (int) (Link.getBody().getPosition().y*MainMenu.PPM) -10 <= dropFlèches[i].yDrop
                        && (int) (Link.getBody().getPosition().y*MainMenu.PPM) +40 >= dropFlèches[i].yDrop ){
                    if ( nombreFlèche < 80 ) nombreFlèche += 3;
                    if ( nombreFlèche > 80 ) nombreFlèche = 80;
                    MainMenu.arc.setNombreItem(Flèches.nombreFlèche);
                    dropFlèches[i].setEstPrésent(false);
                }

            }
        }
    }

    public static void détectionFlèchesEpée(MainCharacter Link){
        for ( int i = 0 ; i < dropFlèches.length ; i ++){
            if (dropFlèches[i].estPrésent){
                if (Link.getDirection().equals("droite")){
                    if ( (int) Link.getBody().getPosition().x*MainMenu.PPM <=  dropFlèches[i].xDrop
                            && (int) Link.getBody().getPosition().x*MainMenu.PPM + 60 >=  dropFlèches[i].xDrop
                            && (int) Link.getBody().getPosition().y*MainMenu.PPM -20 <=  dropFlèches[i].yDrop
                            && (int) Link.getBody().getPosition().y*MainMenu.PPM +60 >=  dropFlèches[i].yDrop ){
                        if (Link.getHealthMax() - Link.getHealth() >= 1 ) Link.setHealth(Link.getHealth() +1);
                        dropFlèches[i].setEstPrésent(false);
                    }
                } else if (Link.getDirection().equals("gauche")){
                    if ( (int) Link.getBody().getPosition().x*MainMenu.PPM >= dropFlèches[i].xDrop
                            && (int) Link.getBody().getPosition().x*MainMenu.PPM -60 <= dropFlèches[i].xDrop
                            && (int) Link.getBody().getPosition().y*MainMenu.PPM -20 <= dropFlèches[i].yDrop
                            && (int) Link.getBody().getPosition().y*MainMenu.PPM +60 >= dropFlèches[i].yDrop ){
                        if (Link.getHealthMax() - Link.getHealth() >= 1 ) Link.setHealth(Link.getHealth() +1);
                        dropFlèches[i].setEstPrésent(false);
                    }
                } else if (Link.getDirection().equals("haut")){
                    if ( (int) Link.getBody().getPosition().x*MainMenu.PPM -20 <= dropFlèches[i].xDrop
                            && (int) Link.getBody().getPosition().x*MainMenu.PPM + 60 >= dropFlèches[i].xDrop
                            && (int) Link.getBody().getPosition().y*MainMenu.PPM  <= dropFlèches[i].yDrop
                            && (int) Link.getBody().getPosition().y*MainMenu.PPM +60 >= dropFlèches[i].yDrop ){
                        if (Link.getHealthMax() - Link.getHealth() >= 1 ) Link.setHealth(Link.getHealth() +1);
                        dropFlèches[i].setEstPrésent(false);
                    }
                } else if (Link.getDirection().equals("bas")){
                    if ( (int) Link.getBody().getPosition().x*MainMenu.PPM -20 <= dropFlèches[i].xDrop
                            && (int) Link.getBody().getPosition().x*MainMenu.PPM + 60 >= dropFlèches[i].xDrop
                            && (int) Link.getBody().getPosition().y*MainMenu.PPM >= dropFlèches[i].yDrop
                            && (int) Link.getBody().getPosition().y*MainMenu.PPM -60 <= dropFlèches[i].yDrop ){
                        if (Link.getHealthMax() - Link.getHealth() >= 1 ) Link.setHealth(Link.getHealth() +1);
                        dropFlèches[i].setEstPrésent(false);
                    }
                }

            }
        }
    }

//	=================================================================================================

    public static void représentationFlèchesDrop(GameMain game){
        for ( int i = 0; i< dropFlèches.length ; i++){
            if ( System.currentTimeMillis() - dropFlèches[i].start > 10000) dropFlèches[i].setEstPrésent(false);
            if ( dropFlèches[i].estPrésent
                    && System.currentTimeMillis() - dropFlèches[i].start < 5000) game.getBatch().draw(dropFlèchesT, dropFlèches[i].xDrop , dropFlèches[i].yDrop);
            else if ( dropFlèches[i].estPrésent
                    && System.currentTimeMillis() - dropFlèches[i].start > 5000){
                dropFlèches[i].clignotementFlèches();
                if (dropFlèches[i].clignotement ) game.getBatch().draw(dropFlèchesT, dropFlèches[i].xDrop , dropFlèches[i].yDrop);
            }
        }
    }

    public static void réinitialisationDrop(){
        for ( int i = 0 ; i < dropFlèches.length ; i++) dropFlèches[i].setEstPrésent(false);
    }




}
