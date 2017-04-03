package menus;

import com.badlogic.gdx.graphics.Texture;
import com.mygdx.game.GameMain;

import items.Item;
import scenes.MainMenu;

public class MenuSac extends Menu{
	
	public static Texture nomSac = new Texture("menus/nomSac.png");
	
	public static int itemSelect = 1;
	
	public static boolean isSacAffiché = false;
	
	public static void affichéSac(GameMain game){
		game.getBatch().draw(fond,-5,-30);
		game.getBatch().draw(fondBeige,60,40);
		game.getBatch().draw(nomSac, 100,330);
		if (itemSelect == 1 ) {
			game.getBatch().draw(fondItem2, 80 , 220);
			game.getBatch().draw(flècheDroite, 60 , 240);
		}
		else game.getBatch().draw(fondItem1, 80 , 220);
		if ( nbrItems >= 1 ) {
			game.getBatch().draw(ensembleDesItems[0], 80 , 230);
			MainMenu.font.draw(game.getBatch(), Integer.toString(ensembleDesItems[0].getNombreItem()), 90, 240);
		}
		if (itemSelect == 2 ) {
			game.getBatch().draw(fondItem2, 160 , 220);
			game.getBatch().draw(flècheDroite, 140 , 240);
		}
		else game.getBatch().draw(fondItem1, 160 , 220);
		if ( nbrItems >= 2 ) {
			game.getBatch().draw(ensembleDesItems[1], 160 , 230);
			MainMenu.font.draw(game.getBatch(), Integer.toString(ensembleDesItems[1].getNombreItem()), 170, 240);
		}
		if (itemSelect == 3 ) {
			game.getBatch().draw(fondItem2, 240 , 220);
			game.getBatch().draw(flècheDroite, 220 , 240);
		}
		else game.getBatch().draw(fondItem1, 240 , 220);
		if ( nbrItems >= 3 ) {
			game.getBatch().draw(ensembleDesItems[2], 240 , 230);
			MainMenu.font.draw(game.getBatch(), Integer.toString(ensembleDesItems[2].getNombreItem()), 250, 240);
		}
		if (itemSelect == 4 ) {
			game.getBatch().draw(fondItem2, 320 , 220);
			game.getBatch().draw(flècheDroite, 300 , 240);
		}
		else game.getBatch().draw(fondItem1, 320 , 220);
		if ( nbrItems >= 4 ) {
			game.getBatch().draw(ensembleDesItems[3], 320 , 230);
			MainMenu.font.draw(game.getBatch(), Integer.toString(ensembleDesItems[3].getNombreItem()), 330, 240);
		}
		if (itemSelect == 5 ) {
			game.getBatch().draw(fondItem2, 400 , 220);
			game.getBatch().draw(flècheDroite, 380 , 240);
		}
		else game.getBatch().draw(fondItem1, 400 , 220);
		if ( nbrItems >= 5 ) {
			game.getBatch().draw(ensembleDesItems[4], 400 , 230);
			MainMenu.font.draw(game.getBatch(), Integer.toString(ensembleDesItems[4].getNombreItem()), 410, 240);
		}
		
		if (itemSelect == 6 ) {
			game.getBatch().draw(fondItem2, 80 , 140);
			game.getBatch().draw(flècheDroite, 60 , 160);
		}
		else game.getBatch().draw(fondItem1, 80 , 140);
		if ( nbrItems >= 6 ) {
			game.getBatch().draw(ensembleDesItems[5], 80 , 150);
			MainMenu.font.draw(game.getBatch(), Integer.toString(ensembleDesItems[5].getNombreItem()), 90, 160);
		}
		if (itemSelect == 7 ) {
			game.getBatch().draw(fondItem2, 160 , 140);
			game.getBatch().draw(flècheDroite, 140 , 160);
		}
		else game.getBatch().draw(fondItem1, 160 , 140);
		if ( nbrItems >= 7 ) {
			game.getBatch().draw(ensembleDesItems[6], 160 , 150);
			MainMenu.font.draw(game.getBatch(), Integer.toString(ensembleDesItems[6].getNombreItem()), 170, 160);
		}
		if (itemSelect == 8 ) {
			game.getBatch().draw(fondItem2, 240 , 140);
			game.getBatch().draw(flècheDroite, 220 , 160);
		}
		else game.getBatch().draw(fondItem1, 240 , 140);
		if ( nbrItems >= 8 ) {
			game.getBatch().draw(ensembleDesItems[7], 240 , 150);
			MainMenu.font.draw(game.getBatch(), Integer.toString(ensembleDesItems[7].getNombreItem()), 250, 160);
		}
		if (itemSelect == 9 ) {
			game.getBatch().draw(fondItem2, 320 , 140);
			game.getBatch().draw(flècheDroite, 300 , 160);
		}
		else game.getBatch().draw(fondItem1, 320 , 140);
		if ( nbrItems >= 9 ) {
			game.getBatch().draw(ensembleDesItems[8], 320 , 150);
			MainMenu.font.draw(game.getBatch(), Integer.toString(ensembleDesItems[8].getNombreItem()), 330, 160);
		}
		if (itemSelect == 10 ) {
			game.getBatch().draw(fondItem2, 400 , 140);
			game.getBatch().draw(flècheDroite, 380 , 160);
		}
		else game.getBatch().draw(fondItem1, 400 , 140);
		if ( nbrItems >= 10 ) {
			game.getBatch().draw(ensembleDesItems[9], 400 , 150);
			MainMenu.font.draw(game.getBatch(), Integer.toString(ensembleDesItems[9].getNombreItem()), 410, 160);
		}
		
		if (itemSelect == 11 ) {
			game.getBatch().draw(fondItem2, 80 , 60);
			game.getBatch().draw(flècheDroite, 60 , 80);
		}
		else game.getBatch().draw(fondItem1, 80 , 60);
		if ( nbrItems >= 11 ) {
			game.getBatch().draw(ensembleDesItems[10], 80 , 70);
			MainMenu.font.draw(game.getBatch(), Integer.toString(ensembleDesItems[10].getNombreItem()), 90, 80);
		}
		if (itemSelect == 12 ) {
			game.getBatch().draw(fondItem2, 160 , 60);
			game.getBatch().draw(flècheDroite, 140 , 80);
		}
		else game.getBatch().draw(fondItem1, 160 , 60);
		if ( nbrItems >= 12 ) {
			game.getBatch().draw(ensembleDesItems[11], 160 , 70);
			MainMenu.font.draw(game.getBatch(), Integer.toString(ensembleDesItems[11].getNombreItem()), 170, 80);
		}
		if (itemSelect == 13 ) {
			game.getBatch().draw(fondItem2, 240 , 60);
			game.getBatch().draw(flècheDroite, 220 , 80);
		}
		else game.getBatch().draw(fondItem1, 240 , 60);
		if ( nbrItems >= 13 ) {
			game.getBatch().draw(ensembleDesItems[12], 240 , 70);
			MainMenu.font.draw(game.getBatch(), Integer.toString(ensembleDesItems[12].getNombreItem()), 250, 80);
		}
		if (itemSelect == 14 ) {
			game.getBatch().draw(fondItem2, 320 , 60);
			game.getBatch().draw(flècheDroite, 300 , 80);
		}
		else game.getBatch().draw(fondItem1, 320 , 60);
		if ( nbrItems >= 14 ){
			game.getBatch().draw(ensembleDesItems[13], 320 , 70);
			MainMenu.font.draw(game.getBatch(), Integer.toString(ensembleDesItems[13].getNombreItem()), 330, 80);
		}
		if (itemSelect == 15 ) {
			game.getBatch().draw(fondItem2, 400 , 60);
			game.getBatch().draw(flècheDroite, 380 , 80);
		}
		else game.getBatch().draw(fondItem1, 400 , 60);
		if ( nbrItems >= 15 ) {
			game.getBatch().draw(ensembleDesItems[14], 400 , 70);
			MainMenu.font.draw(game.getBatch(), Integer.toString(ensembleDesItems[14].getNombreItem()), 410, 80);
		}
	}
	
//	

	public static Item[] itemsKL = new Item[2] ;
	
	public static boolean itemKOccupé = false;
	public static boolean itemLOccupé = false;
	
	public static void acquisitionItemsK(){
		Item temp = itemsKL[0];
		itemsKL[0]=ensembleDesItems[itemSelect - 1];
		ensembleDesItems[itemSelect - 1]=temp;
	}
	public static void acquisitionItemsL(){
		Item temp = itemsKL[1];
		itemsKL[1]=ensembleDesItems[itemSelect - 1];
		ensembleDesItems[itemSelect - 1]=temp;
	}
	
	public static void affichageItemK(GameMain game){
		if ( MenuSac.isSacAffiché == false) {
			game.getBatch().draw(itemsKL[0].getTexture(),460,420);
			MainMenu.font.draw(game.getBatch(), Integer.toString(itemsKL[0].getNombreItem()), 500, 430);
		}
		else {
			game.getBatch().draw(fondItem,420,310);
			game.getBatch().draw(itemsKL[0].getTexture(),420,320);
			MainMenu.font.draw(game.getBatch(), Integer.toString(itemsKL[0].getNombreItem()), 430, 330);
		}
	}
	public static void affichageItemL(GameMain game ){
		if ( MenuSac.isSacAffiché == false) {
			game.getBatch().draw(itemsKL[1].getTexture(),520,420);
			MainMenu.font.draw(game.getBatch(), Integer.toString(itemsKL[1].getNombreItem()), 560, 430);
		}
		else {
			game.getBatch().draw(fondItem,490,260);
			game.getBatch().draw(itemsKL[1].getTexture(),490,270);
			MainMenu.font.draw(game.getBatch(), Integer.toString(itemsKL[1].getNombreItem()), 500, 280);
		}
	}
	
//	création du sac et affichage
	public static int nbrItems = 0; // à sauvegarder
	public static Item[] ensembleDesItems = new Item[15]  ;
	
	public static void setItem(Item ite){
		if ( itemKOccupé == false ) {
			itemsKL[0] = ite;
			itemKOccupé = true;
		} else if ( itemLOccupé == false ){
			itemsKL[1] = ite;
			itemLOccupé = true;
		} else {
			ensembleDesItems[nbrItems]=ite;
			nbrItems++;
		}
	}

}
