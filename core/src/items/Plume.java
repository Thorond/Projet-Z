package items;

import com.badlogic.gdx.graphics.Texture;

import characters.MainCharacter;

public class Plume extends Item {

	public static long start = System.currentTimeMillis();
	
	public static Texture plume = new Texture("items/feather.png");
	
	public Plume(){
		super(plume);
	}
	
	public void utilisationItem( MainCharacter cha) {
		if (  System.currentTimeMillis() - start > 500 ) {
			if ( cha.getDirection().equals("gauche")) { 
				cha.getBody().setTransform(cha.getBody().getPosition().x - Math.min(80, cha.getBody().getPosition().x ), cha.getBody().getPosition().y , 0);
			} else if ( cha.getDirection().equals("droite")) {
				cha.getBody().setTransform(cha.getBody().getPosition().x + Math.min(80, 600 -cha.getBody().getPosition().x ), cha.getBody().getPosition().y , 0);
			} else if ( cha.getDirection().equals("haut")) {
				cha.getBody().setTransform(cha.getBody().getPosition().x , cha.getBody().getPosition().y + Math.min(80, 480 -cha.getBody().getPosition().y ) , 0);
			} else if ( cha.getDirection().equals("bas")) {
				cha.getBody().setTransform(cha.getBody().getPosition().x , cha.getBody().getPosition().y - Math.min(80, cha.getBody().getPosition().y ), 0);
			} 
		}
		start = System.currentTimeMillis();
	}
	
	
}
