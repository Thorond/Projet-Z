package menus;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.graphics.Texture;
import com.mygdx.game.GameMain;

import sauvegarde.Sauvegarde;

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
        if (  ! mapA4Découverte ) game.getBatch().draw(cacheNoir , 1 - variationX * 100 , 163);
        if (  ! mapA5Découverte ) game.getBatch().draw(cacheNoir , 1 - variationX * 100 , 82);
        if (  ! mapA6Découverte ) game.getBatch().draw(cacheNoir , 1 - variationX * 100 , 0);


        if (  ! mapB1Découverte ) game.getBatch().draw(cacheNoir , 101 - variationX * 100 , 405);
        if (  ! mapB2Découverte ) game.getBatch().draw(cacheNoir , 101 - variationX * 100 , 324);
        if (  ! mapB3Découverte ) game.getBatch().draw(cacheNoir , 101 - variationX * 100 , 244);
        if (  ! mapB4Découverte ) game.getBatch().draw(cacheNoir , 101 - variationX * 100 , 163);
        if (  ! mapB5Découverte ) game.getBatch().draw(cacheNoir , 101 - variationX * 100 , 82);
        if (  ! mapB6Découverte ) game.getBatch().draw(cacheNoir , 101 - variationX * 100 , 0);

        if (  ! mapC1Découverte ) game.getBatch().draw(cacheNoir , 201 - variationX * 100 , 405);
        if (  ! mapC2Découverte ) game.getBatch().draw(cacheNoir , 201 - variationX * 100 , 324);
        if (  ! mapC3Découverte ) game.getBatch().draw(cacheNoir , 201 - variationX * 100 , 244);
        if (  ! mapC4Découverte ) game.getBatch().draw(cacheNoir , 201 - variationX * 100 , 163);
        if (  ! mapC5Découverte ) game.getBatch().draw(cacheNoir , 201 - variationX * 100 , 82);
        if (  ! mapC6Découverte ) game.getBatch().draw(cacheNoir , 201 - variationX * 100 , 0);

        if (  ! mapD1Découverte ) game.getBatch().draw(cacheNoir , 301 - variationX * 100 , 405);
        if (  ! mapD2Découverte ) game.getBatch().draw(cacheNoir , 301 - variationX * 100 , 324);
        if (  ! mapD3Découverte ) game.getBatch().draw(cacheNoir , 301 - variationX * 100 , 244);
        if (  ! mapD4Découverte ) game.getBatch().draw(cacheNoir , 301 - variationX * 100 , 163);
        if (  ! mapD5Découverte ) game.getBatch().draw(cacheNoir , 301 - variationX * 100 , 82);
        if (  ! mapD6Découverte ) game.getBatch().draw(cacheNoir , 301 - variationX * 100 , 0);

        if (  ! mapE1Découverte ) game.getBatch().draw(cacheNoir , 401 - variationX * 100 , 405);
        if (  ! mapE2Découverte ) game.getBatch().draw(cacheNoir , 401 - variationX * 100 , 324);
        if (  ! mapE3Découverte ) game.getBatch().draw(cacheNoir , 401 - variationX * 100 , 244);
        if (  ! mapE4Découverte ) game.getBatch().draw(cacheNoir , 401 - variationX * 100 , 163);
        if (  ! mapE5Découverte ) game.getBatch().draw(cacheNoir , 401 - variationX * 100 , 82);
        if (  ! mapE6Découverte ) game.getBatch().draw(cacheNoir , 401 - variationX * 100 , 0);

        if (  ! mapF1Découverte ) game.getBatch().draw(cacheNoir , 501 - variationX * 100 , 405);
        if (  ! mapF2Découverte ) game.getBatch().draw(cacheNoir , 501 - variationX * 100 , 324);
        if (  ! mapF3Découverte ) game.getBatch().draw(cacheNoir , 501 - variationX * 100 , 244);
        if (  ! mapF4Découverte ) game.getBatch().draw(cacheNoir , 501 - variationX * 100 , 163);
        if (  ! mapF5Découverte ) game.getBatch().draw(cacheNoir , 501 - variationX * 100 , 82);
        if (  ! mapF6Découverte ) game.getBatch().draw(cacheNoir , 501 - variationX * 100 , 0);

        if (  ! mapG1Découverte ) game.getBatch().draw(cacheNoir , 601 - variationX * 100 , 405);
        if (  ! mapG2Découverte ) game.getBatch().draw(cacheNoir , 601 - variationX * 100 , 324);
        if (  ! mapG3Découverte ) game.getBatch().draw(cacheNoir , 601 - variationX * 100 , 244);
        if (  ! mapG4Découverte ) game.getBatch().draw(cacheNoir , 601 - variationX * 100 , 163);
        if (  ! mapG5Découverte ) game.getBatch().draw(cacheNoir , 601 - variationX * 100 , 82);
        if (  ! mapG6Découverte ) game.getBatch().draw(cacheNoir , 601 - variationX * 100 , 0);

        if (  ! mapH1Découverte ) game.getBatch().draw(cacheNoir , 701 - variationX * 100 , 405);
        if (  ! mapH2Découverte ) game.getBatch().draw(cacheNoir , 701 - variationX * 100 , 324);
        if (  ! mapH3Découverte ) game.getBatch().draw(cacheNoir , 701 - variationX * 100 , 244);
        if (  ! mapH4Découverte ) game.getBatch().draw(cacheNoir , 701 - variationX * 100 , 163);
        if (  ! mapH5Découverte ) game.getBatch().draw(cacheNoir , 701 - variationX * 100 , 82);
        if (  ! mapH6Découverte ) game.getBatch().draw(cacheNoir , 701 - variationX * 100 , 0);

        if (  ! mapI1Découverte ) game.getBatch().draw(cacheNoir , 801 - variationX * 100 , 405);
        if (  ! mapI2Découverte ) game.getBatch().draw(cacheNoir , 801 - variationX * 100 , 324);
        if (  ! mapI3Découverte ) game.getBatch().draw(cacheNoir , 801 - variationX * 100 , 244);
        if (  ! mapI4Découverte ) game.getBatch().draw(cacheNoir , 801 - variationX * 100 , 163);
        if (  ! mapI5Découverte ) game.getBatch().draw(cacheNoir , 801 - variationX * 100 , 82);
        if (  ! mapI6Découverte ) game.getBatch().draw(cacheNoir , 801 - variationX * 100 , 0);
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

    public static void récupérationInfoCarte(Sauvegarde sauvegarde){
        mapA1Découverte = sauvegarde.mapA1Découverte ;
        mapA2Découverte = sauvegarde.mapA2Découverte;
        mapA3Découverte = sauvegarde.mapA3Découverte;
        mapA4Découverte = sauvegarde.mapA4Découverte;
        mapA5Découverte = sauvegarde.mapA5Découverte;
        mapA6Découverte = sauvegarde.mapA6Découverte;

        mapB1Découverte = sauvegarde.mapB1Découverte;
        mapB2Découverte = sauvegarde.mapB2Découverte;
        mapB3Découverte = sauvegarde.mapB3Découverte;
        mapB4Découverte = sauvegarde.mapB4Découverte;
        mapB5Découverte = sauvegarde.mapB5Découverte;
        mapB6Découverte = sauvegarde.mapB6Découverte;

        mapC1Découverte = sauvegarde.mapC1Découverte;
        mapC2Découverte = sauvegarde.mapC2Découverte;
        mapC3Découverte = sauvegarde.mapC3Découverte;
        mapC4Découverte = sauvegarde.mapC4Découverte;
        mapC5Découverte = sauvegarde.mapC5Découverte;
        mapC6Découverte = sauvegarde.mapC6Découverte;

        mapD1Découverte = sauvegarde.mapD1Découverte;
        mapD2Découverte = sauvegarde.mapD2Découverte;
        mapD3Découverte = sauvegarde.mapD3Découverte;
        mapD4Découverte = sauvegarde.mapD4Découverte;
        mapD5Découverte = sauvegarde.mapD5Découverte;
        mapD6Découverte = sauvegarde.mapD6Découverte;

        mapE1Découverte = sauvegarde.mapE1Découverte;
        mapE2Découverte = sauvegarde.mapE2Découverte;
        mapE3Découverte = sauvegarde.mapE3Découverte;
        mapE4Découverte = sauvegarde.mapE4Découverte;
        mapE5Découverte = sauvegarde.mapE5Découverte;
        mapE6Découverte = sauvegarde.mapE6Découverte;

        mapF1Découverte = sauvegarde.mapF1Découverte;
        mapF2Découverte = sauvegarde.mapF2Découverte;
        mapF3Découverte = sauvegarde.mapF3Découverte;
        mapF4Découverte = sauvegarde.mapF4Découverte;
        mapF5Découverte = sauvegarde.mapF5Découverte;
        mapF6Découverte = sauvegarde.mapF6Découverte;

        mapG1Découverte = sauvegarde.mapG1Découverte;
        mapG2Découverte = sauvegarde.mapG2Découverte;
        mapG3Découverte = sauvegarde.mapG3Découverte;
        mapG4Découverte = sauvegarde.mapG4Découverte;
        mapG5Découverte = sauvegarde.mapG5Découverte;
        mapG6Découverte = sauvegarde.mapG6Découverte;

        mapH1Découverte = sauvegarde.mapH1Découverte;
        mapH2Découverte = sauvegarde.mapH2Découverte;
        mapH3Découverte = sauvegarde.mapH3Découverte;
        mapH4Découverte = sauvegarde.mapH4Découverte;
        mapH5Découverte = sauvegarde.mapH5Découverte;
        mapH6Découverte = sauvegarde.mapH6Découverte;

        mapI1Découverte = sauvegarde.mapI1Découverte;
        mapI2Découverte = sauvegarde.mapI2Découverte;
        mapI3Découverte = sauvegarde.mapI3Découverte;
        mapI4Découverte = sauvegarde.mapI4Découverte;
        mapI5Découverte = sauvegarde.mapI5Découverte;
        mapI6Découverte = sauvegarde.mapI6Découverte;
    }

}
