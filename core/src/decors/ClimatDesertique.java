package decors;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.physics.box2d.Body;
import com.badlogic.gdx.physics.box2d.BodyDef;
import com.badlogic.gdx.physics.box2d.Fixture;
import com.badlogic.gdx.physics.box2d.FixtureDef;
import com.badlogic.gdx.physics.box2d.PolygonShape;
import com.badlogic.gdx.physics.box2d.World;
import com.mygdx.game.GameMain;

import characters.MainCharacter;
import map.CadrillageMap;
import map.zoneDesert.PlacementMainZoneDesert;
import scenes.MainMenu;

/**
 * Created by arnOo on 11/04/2017.
 */

public class ClimatDesertique {

    public static World world = MainMenu.world;
    public static Body body;

    public static Body createBody(float x, float y,  int largeur, int taille){
        BodyDef bodyDef = new BodyDef();
        bodyDef.type = BodyDef.BodyType.StaticBody;
        bodyDef.position.set(x/MainMenu.PPM,y/MainMenu.PPM);
        body = world.createBody(bodyDef);

        PolygonShape shape = new PolygonShape();
        shape.setAsBox(largeur / (2*MainMenu.PPM)  , taille / (2*MainMenu.PPM));

        FixtureDef fixtureDef = new FixtureDef();
        fixtureDef.shape = shape;
        fixtureDef.density = 1;

        Fixture fixture = body.createFixture(fixtureDef);

        shape.dispose();

        return body;
    }

    public static Body createBodyPerso( String décor, String type, float x, float y){
        BodyDef bodyDef = new BodyDef();
        if ( type.equals("static")) bodyDef.type = BodyDef.BodyType.StaticBody;
        else if ( type.equals("kinematic")) bodyDef.type = BodyDef.BodyType.KinematicBody;
        else if ( type.equals("Dynamic")) bodyDef.type = BodyDef.BodyType.DynamicBody;

        if ( décor.equals("tronc") || décor.equals("grossePierre")
                || décor.equals("tonneau")) bodyDef.position.set((x+10)/MainMenu.PPM,(y+20)/MainMenu.PPM);
        else if (décor.equals("arbre")) bodyDef.position.set((x+10)/MainMenu.PPM +2,(y+35)/MainMenu.PPM);
        body = world.createBody(bodyDef);

        PolygonShape shape = new PolygonShape();
        if (décor.equals("tronc") ) shape.setAsBox((2 / 2)/MainMenu.PPM  +2, (2 / 2)/MainMenu.PPM+2);
        else if ( décor.equals("tonneau")) shape.setAsBox((20 / 2)/MainMenu.PPM +2 , (20 / 2)/MainMenu.PPM +2);
        else if (décor.equals("grossePierre")) shape.setAsBox((20 / 2)/MainMenu.PPM  +5, (20 / 2)/MainMenu.PPM + 5);
        else if (décor.equals("arbre")) shape.setAsBox((30 / 2)/MainMenu.PPM +5 , (60 / 2)/MainMenu.PPM);

        FixtureDef fixtureDef = new FixtureDef();
        fixtureDef.shape = shape;
        fixtureDef.density = 1;

        Fixture fixture = body.createFixture(fixtureDef);

        shape.dispose();

        return body;
    }


//	objets



//	tile

//    public static Texture   = new Texture("climatDesertique/.png");



    //	eau derivière


    public static void eauProfonde(GameMain game, int x, int y){

        if ( PlacementMainZoneDesert.défilement == false ) CadrillageMap.setTypeDeDécor(x/60, y/60, "EauProfonde");

    }



}
