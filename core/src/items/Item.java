package items;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.mygdx.game.GameMain;

import characters.MainCharacter;

public class Item extends Sprite {
	
	protected int nombreItem;
	public Texture texture;
	public static Item[] itemsKL = new Item[2] ;
	
	public Item(){
	}
	
	public Item(Texture text){
		super(text);
		this.nombreItem =1;
	}
	
	public Item( Texture text, int nombre){
		super(text);
		this.nombreItem = nombre;
	}
	
	public  void setTexture(Texture text ){
		texture = text;
	}
	
	public  Texture setTexture(){
		return texture;
	}
	
	public  void setNombreItem(int nbr){
		nombreItem = nbr;
	}
	public  int getNombreItem(){
		return nombreItem;
	}
		
	public void utilisationItem(MainCharacter cha) {
	}
	
//	
	
	public static boolean itemKOccupé = false;
	public static boolean itemLOccupé = false;
	
	public void acquisitionItemsK(){
		Item temp = itemsKL[0];
		itemsKL[0]=this.ensembleDesItems[this.curseur];
		this.ensembleDesItems[this.curseur]=temp;
	}
	public void acquisitionItemsL(){
		Item temp = itemsKL[1];
		itemsKL[1]=this.ensembleDesItems[this.curseur];
		this.ensembleDesItems[this.curseur]=temp;
	}
	
	public void affichageItemK(GameMain game){
		game.getBatch().draw(itemsKL[0].getTexture(),460,420);
	}
	public void affichageItemL(GameMain game ){
		game.getBatch().draw(itemsKL[1].getTexture(),520,420);
	}
	
//	création du sac et affichage
	public int nbrItems = 0;
	public Item[] ensembleDesItems = new Item[10]  ;
	public int curseur = 0;
	
	public void setItem(Item ite){
		if ( itemKOccupé == false ) {
			itemsKL[0] = ite;
		} else if ( itemLOccupé == false ){
			itemsKL[1] = ite;
		} else {
			ensembleDesItems[nbrItems]=ite;
			nbrItems++;
		}
	}
	
	public boolean sacEstAffiché = false;

}
