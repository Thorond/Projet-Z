package menus;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.graphics.Texture;
import com.mygdx.game.GameMain;

/**
 * Created by arnOo on 19/04/2017.
 */

public class Carte {

    public static int variationX = 0;

    public static boolean isAfficher = false;

    public static Texture carteTotale = new Texture("menus/carte/carteTotale.png");
    public static Texture cacheNoir = new Texture("menus/carte/cacheNoir.png");

    public static void représentation(GameMain game ){
        game.getBatch().draw(carteTotale, - variationX * 100 ,0);


        if (  ! mapA1Découverte ) game.getBatch().draw(cacheNoir , 1 - variationX * 100 , 405);
        if (  ! mapA2Découverte ) game.getBatch().draw(cacheNoir , 1 - variationX * 100 , 324);
        if (  ! mapA3Découverte ) game.getBatch().draw(cacheNoir , 1 - variationX * 100 , 244);
        if (  ! mapA3Découverte ) game.getBatch().draw(cacheNoir , 1 - variationX * 100 , 163);
        if (  ! mapA3Découverte ) game.getBatch().draw(cacheNoir , 1 - variationX * 100 , 82);
        if (  ! mapA3Découverte ) game.getBatch().draw(cacheNoir , 1 - variationX * 100 , 0);
    }

    public static void updateCarte( float dt){
        if ( Gdx.input.isKeyJustPressed(Input.Keys.P))  isAfficher = false ;
        else if ( Gdx.input.isKeyJustPressed(Input.Keys.D) && variationX < 3) variationX += 1;
        else if ( Gdx.input.isKeyJustPressed(Input.Keys.Q) && variationX > 0) variationX -= 1;

    }

    public static boolean mapA1Découverte = false; // à sauvegarder
    public static boolean mapA2Découverte = false; // à sauvegarder
    public static boolean mapA3Découverte = false; // à sauvegarder
    public static boolean mapA4Découverte = false; // à sauvegarder
    public static boolean mapA5Découverte = false; // à sauvegarder
    public static boolean mapA6Découverte = false; // à sauvegarder

    public static boolean mapB1Découverte = false; // à sauvegarder
    public static boolean mapB2Découverte = false; // à sauvegarder
    public static boolean mapB3Découverte = false; // à sauvegarder
    public static boolean mapB4Découverte = false; // à sauvegarder
    public static boolean mapB5Découverte = false; // à sauvegarder
    public static boolean mapB6Découverte = false; // à sauvegarder

    public static boolean mapC1Découverte = false; // à sauvegarder
    public static boolean mapC2Découverte = false; // à sauvegarder
    public static boolean mapC3Découverte = false; // à sauvegarder
    public static boolean mapC4Découverte = false; // à sauvegarder
    public static boolean mapC5Découverte = false; // à sauvegarder
    public static boolean mapC6Découverte = false; // à sauvegarder

    public static boolean mapD1Découverte = false; // à sauvegarder
    public static boolean mapD2Découverte = false; // à sauvegarder
    public static boolean mapD3Découverte = false; // à sauvegarder
    public static boolean mapD4Découverte = false; // à sauvegarder
    public static boolean mapD5Découverte = false; // à sauvegarder
    public static boolean mapD6Découverte = false; // à sauvegarder

    public static boolean mapE1Découverte = false; // à sauvegarder
    public static boolean mapE2Découverte = false; // à sauvegarder
    public static boolean mapE3Découverte = false; // à sauvegarder
    public static boolean mapE4Découverte = false; // à sauvegarder
    public static boolean mapE5Découverte = false; // à sauvegarder
    public static boolean mapE6Découverte = false; // à sauvegarder

    public static boolean mapF1Découverte = false; // à sauvegarder
    public static boolean mapF2Découverte = false; // à sauvegarder
    public static boolean mapF3Découverte = false; // à sauvegarder
    public static boolean mapF4Découverte = false; // à sauvegarder
    public static boolean mapF5Découverte = false; // à sauvegarder
    public static boolean mapF6Découverte = false; // à sauvegarder

    public static boolean mapG1Découverte = false; // à sauvegarder
    public static boolean mapG2Découverte = false; // à sauvegarder
    public static boolean mapG3Découverte = false; // à sauvegarder
    public static boolean mapG4Découverte = false; // à sauvegarder
    public static boolean mapG5Découverte = false; // à sauvegarder
    public static boolean mapG6Découverte = false; // à sauvegarder

    public static boolean mapH1Découverte = false; // à sauvegarder
    public static boolean mapH2Découverte = false; // à sauvegarder
    public static boolean mapH3Découverte = false; // à sauvegarder
    public static boolean mapH4Découverte = false; // à sauvegarder
    public static boolean mapH5Découverte = false; // à sauvegarder
    public static boolean mapH6Découverte = false; // à sauvegarder

    public static boolean mapI1Découverte = false; // à sauvegarder
    public static boolean mapI2Découverte = false; // à sauvegarder
    public static boolean mapI3Découverte = false; // à sauvegarder
    public static boolean mapI4Découverte = false; // à sauvegarder
    public static boolean mapI5Découverte = false; // à sauvegarder
    public static boolean mapI6Découverte = false; // à sauvegarder

}
