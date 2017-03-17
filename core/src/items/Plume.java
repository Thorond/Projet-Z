package items;

import com.badlogic.gdx.graphics.Texture;

import characters.MainCharacter;

public class Plume extends Item {
	
	public static Texture plume = new Texture("items/feather.png");
	
	public Plume(){
		super(plume);
	}
	
	public void utilisationItem( MainCharacter cha) {
		if ( cha.getDirection().equals("gauche")) { 
			cha.getBody().setTransform(cha.getBody().getPosition().x - Math.min(70, cha.getBody().getPosition().x ), cha.getBody().getPosition().y , 0);
		} else if ( cha.getDirection().equals("droite")) {
			cha.getBody().setTransform(cha.getBody().getPosition().x + Math.min(70, 600 -cha.getBody().getPosition().x ), cha.getBody().getPosition().y , 0);
		} else if ( cha.getDirection().equals("haut")) {
			cha.getBody().setTransform(cha.getBody().getPosition().x , cha.getBody().getPosition().y + Math.min(70, 480 -cha.getBody().getPosition().y ) , 0);
		} else if ( cha.getDirection().equals("bas")) {
			cha.getBody().setTransform(cha.getBody().getPosition().x , cha.getBody().getPosition().y - Math.min(70, cha.getBody().getPosition().y ), 0);
		} 
	}
	
	
}
