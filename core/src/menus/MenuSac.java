package menus;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.physics.box2d.World;
import com.mygdx.game.GameMain;

import items.Item;
import scenes.MainMenu;

public class MenuSac {
	
	public static World world = MainMenu.world;
	
	public static Texture fond = new Texture("menus/fondMaron.png");
	public static Texture flècheGauche = new Texture("menus/arrowBlue_left.png");
	public static Texture flècheDroite = new Texture("menus/arrowBlue_right.png");
	public static Texture fondItem = new Texture("menus/panelInset_beige.png");
	public static Texture fondItem1 = new Texture("menus/buttonSquare_beige.png");
	public static Texture fondItem2 = new Texture("menus/buttonSquare_beige_pressed.png");
	public static Texture nomSac = new Texture("menus/nomSac.png");
	
	public static int itemSelect = 1;
	
	public static boolean isSacAffiché = false;
	
	public static void affichéSac(GameMain game){
		game.getBatch().draw(fond,-5,-30);
		game.getBatch().draw(nomSac, 100,330);
		if (itemSelect == 1 ) {
			game.getBatch().draw(fondItem2, 80 , 220);
			game.getBatch().draw(flècheDroite, 60 , 240);
		}
		else game.getBatch().draw(fondItem1, 80 , 220);
		if ( nbrItems >= 1 ) game.getBatch().draw(ensembleDesItems[0], 80 , 230);
		if (itemSelect == 2 ) {
			game.getBatch().draw(fondItem2, 160 , 220);
			game.getBatch().draw(flècheDroite, 140 , 240);
		}
		else game.getBatch().draw(fondItem1, 160 , 220);
		if (itemSelect == 3 ) {
			game.getBatch().draw(fondItem2, 240 , 220);
			game.getBatch().draw(flècheDroite, 220 , 240);
		}
		else game.getBatch().draw(fondItem1, 240 , 220);
		if (itemSelect == 4 ) {
			game.getBatch().draw(fondItem2, 320 , 220);
			game.getBatch().draw(flècheDroite, 300 , 240);
		}
		else game.getBatch().draw(fondItem1, 320 , 220);
		if (itemSelect == 5 ) {
			game.getBatch().draw(fondItem2, 400 , 220);
			game.getBatch().draw(flècheDroite, 380 , 240);
		}
		else game.getBatch().draw(fondItem1, 400 , 220);
		
		if (itemSelect == 6 ) {
			game.getBatch().draw(fondItem2, 80 , 140);
			game.getBatch().draw(flècheDroite, 60 , 160);
		}
		else game.getBatch().draw(fondItem1, 80 , 140);
		if (itemSelect == 7 ) {
			game.getBatch().draw(fondItem2, 160 , 140);
			game.getBatch().draw(flècheDroite, 140 , 160);
		}
		else game.getBatch().draw(fondItem1, 160 , 140);
		if (itemSelect == 8 ) {
			game.getBatch().draw(fondItem2, 240 , 140);
			game.getBatch().draw(flècheDroite, 220 , 160);
		}
		else game.getBatch().draw(fondItem1, 240 , 140);
		if (itemSelect == 9 ) {
			game.getBatch().draw(fondItem2, 320 , 140);
			game.getBatch().draw(flècheDroite, 300 , 160);
		}
		else game.getBatch().draw(fondItem1, 320 , 140);
		if (itemSelect == 10 ) {
			game.getBatch().draw(fondItem2, 400 , 140);
			game.getBatch().draw(flècheDroite, 380 , 160);
		}
		else game.getBatch().draw(fondItem1, 400 , 140);
		
		if (itemSelect == 11 ) {
			game.getBatch().draw(fondItem2, 80 , 60);
			game.getBatch().draw(flècheDroite, 60 , 80);
		}
		else game.getBatch().draw(fondItem1, 80 , 60);
		if (itemSelect == 12 ) {
			game.getBatch().draw(fondItem2, 160 , 60);
			game.getBatch().draw(flècheDroite, 140 , 80);
		}
		else game.getBatch().draw(fondItem1, 160 , 60);
		if (itemSelect == 13 ) {
			game.getBatch().draw(fondItem2, 240 , 60);
			game.getBatch().draw(flècheDroite, 220 , 80);
		}
		else game.getBatch().draw(fondItem1, 240 , 60);
		if (itemSelect == 14 ) {
			game.getBatch().draw(fondItem2, 320 , 60);
			game.getBatch().draw(flècheDroite, 300 , 80);
		}
		else game.getBatch().draw(fondItem1, 320 , 60);
		if (itemSelect == 15 ) {
			game.getBatch().draw(fondItem2, 400 , 60);
			game.getBatch().draw(flècheDroite, 380 , 80);
		}
		else game.getBatch().draw(fondItem1, 400 , 60);
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
		if ( MenuSac.isSacAffiché == false) game.getBatch().draw(itemsKL[0].getTexture(),460,420);
		else {
			game.getBatch().draw(fondItem,420,310);
			game.getBatch().draw(itemsKL[0].getTexture(),420,320);
		}
	}
	public static void affichageItemL(GameMain game ){
		if ( MenuSac.isSacAffiché == false) game.getBatch().draw(itemsKL[1].getTexture(),520,420);
		else {
			game.getBatch().draw(fondItem,490,260);
			game.getBatch().draw(itemsKL[1].getTexture(),490,270);
		}
	}
	
//	création du sac et affichage
	public static int nbrItems = 0;
	public static Item[] ensembleDesItems = new Item[15]  ;
	
	public static void setItem(Item ite){
		if ( itemKOccupé == false ) {
			itemsKL[0] = ite;
		} else if ( itemLOccupé == false ){
			itemsKL[1] = ite;
		} else {
			ensembleDesItems[nbrItems]=ite;
			nbrItems++;
		}
	}

}
