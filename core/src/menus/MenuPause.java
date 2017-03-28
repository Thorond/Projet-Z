package menus;

import com.badlogic.gdx.graphics.Texture;
import com.mygdx.game.GameMain;


public class MenuPause extends Menu {
	
	public static Texture nomPause = new Texture("menus/nomPause.png"); 
	
	public static Texture boutonPresséSave = new Texture("menus/boutonPresséSave.png"); 
	public static Texture boutonSave = new Texture("menus/boutonSave.png"); 
	
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
}
