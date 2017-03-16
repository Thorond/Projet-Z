package items;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.mygdx.game.GameMain;

import characters.MainCharacter;

public class Item extends Sprite {
	
	protected int nombreItem;
	public Texture texture;
	
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
	
	
	

}
