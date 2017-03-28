package items;

import com.badlogic.gdx.graphics.Texture;

import characters.MainCharacter;

public class Bouclier extends Item{
	
	public static Texture bouclier = new Texture("items/shield.png");
	

	public Bouclier(){
		super(bouclier,1);
	}
	
	public static boolean isBouclierPris = false; // a sauvegarder 
	public static boolean isBouclierUtilisé = false;
	
	public void utilisationItem( MainCharacter cha) {
		if (isBouclierUtilisé == false ) MainCharacter.changementDeVitesse = true;
		isBouclierUtilisé = true;
		
	}
}
