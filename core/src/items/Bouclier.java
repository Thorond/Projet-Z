package items;

import com.badlogic.gdx.graphics.Texture;

public class Bouclier extends Item{
	
	public static Texture bouclier = new Texture("items/shield.png");
	
	public static boolean annimationBouclier = false;

	public Bouclier(){
		super(bouclier,1);
	}
	
	public static boolean isBouclierPris = false; // a sauvegarder 
}
