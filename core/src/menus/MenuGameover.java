package menus;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.mygdx.game.GameMain;

import items.CoeurDeVie;
import map.CadrillageMap;
import map.GestionDesMaps;
import map.PlacementMain;
import scenes.MainMenu;

public class MenuGameover {

	public static Texture gameOverT = new Texture("Divers/gameOver.png");
	public static Sprite gameOver = new Sprite(gameOverT);
	public static float opacitéGO = 0f;
	
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
	
	
}
