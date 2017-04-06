package characters;

import com.badlogic.gdx.graphics.Texture;
import com.mygdx.game.GameMain;

import scenes.MainMenu;

public class Tigre {
	
	public static long start = System.currentTimeMillis();
	
	public static int textBas = 0;
	public static Texture tigreBas1 = new Texture("monstres/tigre/tigreBas1.png");
	public static Texture tigreBas2 = new Texture("monstres/tigre/tigreBas2.png");
	public static Texture tigreBas3 = new Texture("monstres/tigre/tigreBas3.png");
	public static int textGauche = 0;
	public static Texture tigreGauche1 = new Texture("monstres/tigre/tigreGauche1.png");
	public static Texture tigreGauche2 = new Texture("monstres/tigre/tigreGauche2.png");
	public static Texture tigreGauche3 = new Texture("monstres/tigre/tigreGauche3.png");
	public static int textHaut = 0;
	public static Texture tigreHaut1 = new Texture("monstres/tigre/tigreHaut1.png");
	public static Texture tigreHaut2 = new Texture("monstres/tigre/tigreHaut2.png");
	public static Texture tigreHaut3 = new Texture("monstres/tigre/tigreHaut3.png");
	public static int textDroite = 0;
	public static Texture tigreDroite1 = new Texture("monstres/tigre/tigreDroite1.png");
	public static Texture tigreDroite2 = new Texture("monstres/tigre/tigreDroite2.png");
	public static Texture tigreDroite3 = new Texture("monstres/tigre/tigreDroite3.png");
	

	public static Texture tigrePiège = new Texture("monstres/tigre/tigrePiège.png");

	
	
	public static void représentation(GameMain game){
		if (MainMenu.Link.getDirection().equals("gauche")){
			if (MainMenu.Link.getBody().getLinearVelocity().x > -100  ){
				game.getBatch().draw(tigreGauche2, MainMenu.Link.getX() +60 , MainMenu.Link.getY());
			} else {
				if (textGauche == 0  ) {
					game.getBatch().draw(tigreGauche1, MainMenu.Link.getX() +60 , MainMenu.Link.getY());
				} else if ( textGauche == 1){
					game.getBatch().draw(tigreGauche3, MainMenu.Link.getX() +60 , MainMenu.Link.getY());
				} else if ( textGauche == 2){
					game.getBatch().draw(tigreGauche2, MainMenu.Link.getX() +60, MainMenu.Link.getY());
				} 
			}
			if ( System.currentTimeMillis() - start > 250) {
				if (textGauche == 0  ) {
					textGauche = 1;
				} else if ( textGauche == 1){
					textGauche = 2;
				} else if ( textGauche == 2){
					textGauche = 0;
				} 
				start = System.currentTimeMillis();
					
			} 
		}
		else if (MainMenu.Link.getDirection().equals("droite")){
			if (MainMenu.Link.getBody().getLinearVelocity().x < 100  ){
				game.getBatch().draw(tigreDroite2, MainMenu.Link.getX() -90 , MainMenu.Link.getY());
			} else {
				if (textDroite == 0  ) {
					game.getBatch().draw(tigreDroite1, MainMenu.Link.getX() -90 , MainMenu.Link.getY());
				} else if ( textDroite == 1){
					game.getBatch().draw(tigreDroite3, MainMenu.Link.getX() -90 , MainMenu.Link.getY());
				} else if ( textDroite == 2){
					game.getBatch().draw(tigreDroite2, MainMenu.Link.getX() -90, MainMenu.Link.getY());
				} 
			}
			if ( System.currentTimeMillis() - start > 250) {
				if (textDroite == 0  ) {
					textDroite = 1;
				} else if ( textDroite == 1){
					textDroite = 2;
				} else if ( textDroite == 2){
					textDroite = 0;
				} 
				start = System.currentTimeMillis();
					
			} 
		}
		else if (MainMenu.Link.getDirection().equals("haut")){
			if (MainMenu.Link.getBody().getLinearVelocity().y < 100  ){
				game.getBatch().draw(tigreHaut2, MainMenu.Link.getX()  , MainMenu.Link.getY() -90);
			} else {
				if (textHaut == 0  ) {
					game.getBatch().draw(tigreHaut1, MainMenu.Link.getX() , MainMenu.Link.getY() -90);
				} else if ( textHaut == 1){
					game.getBatch().draw(tigreHaut3, MainMenu.Link.getX() , MainMenu.Link.getY() -90);
				}
			}
			if ( System.currentTimeMillis() - start > 250) {
				if (textHaut == 0  ) {
					textHaut = 1;
				} else if ( textHaut == 1){
					textHaut = 0;
				} 
				start = System.currentTimeMillis();
					
			} 
		}
		else if (MainMenu.Link.getDirection().equals("bas")){
			if (MainMenu.Link.getBody().getLinearVelocity().y > -100  ){
				game.getBatch().draw(tigreBas2, MainMenu.Link.getX()  , MainMenu.Link.getY() +60);
			} else {
				if (textBas == 0  ) {
					game.getBatch().draw(tigreBas1, MainMenu.Link.getX() , MainMenu.Link.getY() +60);
				} else if ( textBas == 1){
					game.getBatch().draw(tigreBas3, MainMenu.Link.getX() , MainMenu.Link.getY() +60);
				}
			}
			if ( System.currentTimeMillis() - start > 250) {
				if (textBas == 0  ) {
					textBas = 1;
				} else if ( textBas == 1){
					textBas = 0;
				} 
				start = System.currentTimeMillis();
					
			} 
		}
	}
}
