package menus;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.graphics.Texture;
import com.mygdx.game.GameMain;

public class MenuDémarrer extends Menu {

    public static Texture menuDémarrer= new Texture("menus/menuDémarrer/menuDémarrer.png");

    public static Texture nomSauvegarde= new Texture("menus/menuDémarrer/nomSauvegarde.png");

    public static Texture boutonPresséCharSauv = new Texture("menus/menuDémarrer/boutonPresséCharSauv.png");
    public static Texture boutonCharSauv = new Texture("menus/menuDémarrer/boutonCharSauv.png");

    public static Texture boutonPresséNouSauv = new Texture("menus/menuDémarrer/boutonPresséNouSauv.png");
    public static Texture boutonNouSauv = new Texture("menus/menuDémarrer/boutonNouSauv.png");

    public static Texture boutonPresséOption = new Texture("menus/menuDémarrer/boutonPresséOption.png");
    public static Texture boutonOption = new Texture("menus/menuDémarrer/boutonOption.png");

    public static boolean isInGame = true; // à mettre false à la fin du développement


    public static int choix = 0;

    public static void affichageMenuDémarrer(GameMain game){
        if ( choix == 0 ){
            game.getBatch().draw(menuDémarrer,0,0);
        } else {
            game.getBatch().draw(fond,-5,-30);
            game.getBatch().draw(fondBeige,60,40);
            game.getBatch().draw(nomSauvegarde, 100,330);
            if (choix == 1){
                game.getBatch().draw(boutonPresséCharSauv,180,230);
                game.getBatch().draw(flècheDroite,160,250);
            } else game.getBatch().draw(boutonCharSauv,180,230);
            if (choix == 2){
                game.getBatch().draw(boutonPresséNouSauv,180,140);
                game.getBatch().draw(flècheDroite,160,160);
            } else game.getBatch().draw(boutonNouSauv,180,140);
            if (choix == 3){
                game.getBatch().draw(boutonPresséOption,180,50);
                game.getBatch().draw(flècheDroite,160,70);
            } else game.getBatch().draw(boutonOption,180,50);
        }

    }

    public static void updateDémarrage(float dt){
        if (Gdx.input.isKeyJustPressed(Input.Keys.S) ){
            if ( choix == 1) choix = 2;
            else if ( choix == 2)choix =3;
            else if ( choix == 3) choix =1;
        } else if (Gdx.input.isKeyJustPressed(Input.Keys.Z)){
            if ( choix == 1) choix = 3;
            else if ( choix == 2) choix =1;
            else if (choix == 3) choix =2;
        }
        if (Gdx.input.isKeyJustPressed(Input.Keys.ENTER) ){
            if (choix == 0) choix =1;
            else if (choix == 1) {
                isInGame = true;
//                 ici il faudra recharger la sauvegarde et tout remettre comme à l'allumage
                if ( MenuGameover.isGO ) MenuGameover.isGO = false;
                if ( MenuPause.isPause ) MenuPause.isPause = false;
            }
//            else if (MenuPause.choix == 3){
//                if ( Link.zone.equals("zoneGlace"))
//                    sauvegarde = new Sauvegarde(Link.getBody().getPosition().x,Link.getBody().getPosition().y, Link.getDirection(), PlacementMainZoneGlace.positionSousMap,
//                            "zoneGlace");
//                else
//                    sauvegarde = new Sauvegarde(Link.getBody().getPosition().x,Link.getBody().getPosition().y, Link.getDirection(), PlacementMainZoneDesert.positionSousMap,
//                            "zoneDesert");
//                SendClass.sendClass(sauvegarde);
////				affichage de quelques choses pour montrer que c'est sauvegarder
//            }
        }
    }
}
