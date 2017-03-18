package menus;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.mygdx.game.GameMain;

import items.CoeurDeVie;
import map.CadrillageMap;
import map.GestionDesMaps;
import map.PlacementMain;
import scenes.MainMenu;

public class MenuGameover extends Menu {
	
	public static Texture nomGO = new Texture("menus/nomGO.png");

	public static Texture gameOverT = new Texture("Divers/gameOver.png");
	public static Sprite gameOver = new Sprite(gameOverT);
	public static float opacitéGO = 0f;
	
	public static boolean isGO = false;
	
	public static void GameOver(GameMain game){
		if (!(MainMenu.Link.isAlive)){
			if ( opacitéGO <1 ){
				gameOver.setAlpha(opacitéGO);
				gameOver.draw(game.getBatch());
				opacitéGO+=0.005f;
			} else {
				opacitéGO = 0;
				MainMenu.Link.isAlive = true;
//				destruction des corps de la sous map sur laquelle on était quand on meurt 
				GestionDesMaps.destructionDesCorps();
				
//				suppression des types de décor 
				CadrillageMap.setTypeDeDécor();
				CadrillageMap.setDécoChangéFaux();
				CoeurDeVie.réinitialisation();
				
				MainMenu.Link.setDirection(MainMenu.sauvegarde.getDirection());
				MainMenu.Link.getBody().setTransform(MainMenu.sauvegarde.getCoordX(), MainMenu.sauvegarde.getCoordY(), 0);
				PlacementMain.positionSousMap = MainMenu.sauvegarde.posiSousMap;
				MainMenu.Link.setHealth(MainMenu.Link.getHealthMax());
			}
		} 
	}
	
	public static int choix = 1;
	
	public static void affichageMenuGO(GameMain game){
		if ( isGO ) {
			game.getBatch().draw(fond,-5,-30);
			game.getBatch().draw(nomGO, 100,330);
			if (choix == 1){
				game.getBatch().draw(boutonPresséReprendre,180,230);
				game.getBatch().draw(flècheDroite,160,250);
			} else game.getBatch().draw(boutonReprendre,180,230);
			if (choix == 2){
				game.getBatch().draw(boutonPresséRetour,180,140);
				game.getBatch().draw(flècheDroite,160,160);
			} else game.getBatch().draw(boutonRetour,180,140);
		}
	}
	
	
}
