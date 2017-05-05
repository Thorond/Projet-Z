package menus;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.mygdx.game.GameMain;

import map.zoneDesert.PlacementMainZoneDesert;
import map.zoneGlace.PlacementMainZoneGlace;
import sauvegarde.Sauvegarde;
import sauvegarde.SendClass;
import scenes.MainMenu;


public class MenuPause extends Menu {
	
	public static Texture nomPause = new Texture("menus/nomPause.png");
	
	public static Texture boutonPresséSave = new Texture("menus/boutonPresséSave.png");
	public static Texture boutonSave = new Texture("menus/boutonSave.png");

	public static Texture texteSauvegardeT = new Texture("texte/texteSauvegarde.png");
    public static Sprite texteSauvegarde = new Sprite(texteSauvegardeT);
    public static long timerSauvegarde = System.currentTimeMillis();
    public static boolean sauvegardeEnCours = false;
    public static float opacité = 1;
    public static void affichageSauvegarde(GameMain game){
        if ( sauvegardeEnCours) {
            texteSauvegarde.setX(100 );
            texteSauvegarde.setY(10 );
            if ( opacité > 0 ) opacité -= 0.01 ;
            texteSauvegarde.setAlpha(opacité);
            texteSauvegarde.draw(game.getBatch());
        }

        if ( System.currentTimeMillis() - timerSauvegarde > 1400 ) sauvegardeEnCours = false;

    }
	
	public static boolean isPause = false;
	

	
	public static int choix = 1;
	
	public static void affichageMenuPause(GameMain game){
		game.getBatch().draw(fond,-5,-30);
		game.getBatch().draw(fondBeige,60,40);
		game.getBatch().draw(nomPause, 100,330);
		if (choix == 1){
			game.getBatch().draw(boutonPresséReprendre,180,230);
			game.getBatch().draw(flècheDroite,160,250);
		} else game.getBatch().draw(boutonReprendre,180,230);
		if (choix == 2){
			game.getBatch().draw(boutonPresséRetour,180,140);
			game.getBatch().draw(flècheDroite,160,160);
		} else game.getBatch().draw(boutonRetour,180,140);
		if (choix == 3){
			game.getBatch().draw(boutonPresséSave,180,50);
			game.getBatch().draw(flècheDroite,160,70);
		} else game.getBatch().draw(boutonSave,180,50);
	}

    public static void updatePause(float dt){
        if (Gdx.input.isKeyJustPressed(Input.Keys.S) ){
            if ( MenuPause.choix == 1) MenuPause.choix = 2;
            else if ( MenuPause.choix == 2) MenuPause.choix =3;
            else if ( MenuPause.choix == 3) MenuPause.choix =1;
        } else if (Gdx.input.isKeyJustPressed(Input.Keys.Z)){
            if ( MenuPause.choix == 1) MenuPause.choix = 3;
            else if ( MenuPause.choix == 2) MenuPause.choix =1;
            else if ( MenuPause.choix == 3) MenuPause.choix =2;
        }
        if (Gdx.input.isKeyJustPressed(Input.Keys.ENTER) ){
            if (MenuPause.choix == 1) MenuPause.isPause = false;
            else if (MenuPause.choix == 2){
                MenuDémarrer.isInGame = false;
                MenuDémarrer.choix=0;
            }
            else if (MenuPause.choix == 3){
                if ( MainMenu.Link.zone.equals("zoneGlace"))
                    MainMenu.sauvegarde = new Sauvegarde(MainMenu.Link, PlacementMainZoneGlace.positionSousMap, "zoneGlace");
                else
                    MainMenu.sauvegarde = new Sauvegarde(MainMenu.Link, PlacementMainZoneDesert.positionSousMap, "zoneDesert");
                SendClass.sendClass(MainMenu.sauvegarde);
//				affichage de quelques choses pour montrer que c'est sauvegarder
                if ( ! sauvegardeEnCours ) {
                    timerSauvegarde = System.currentTimeMillis();
                    opacité = 1;
                    sauvegardeEnCours = true;
                }
            }
        }
    }
}
