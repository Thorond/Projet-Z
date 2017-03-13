package decors;

import com.badlogic.gdx.graphics.Texture;

import characters.MainCharacter;

public class Trou {

	public static Texture trou = new Texture("Map6060.png");

	public static void setDamage(MainCharacter cha) {
		// TODO Auto-generated method stub
		cha.setHealth(cha.getHealth() - 1 );
		if ( cha.getDirection().equals("bas")) cha.getBody().setTransform(cha.getBody().getPosition().x, cha.getBody().getPosition().y + 60, 0);
		else if ( cha.getDirection().equals("haut")) cha.getBody().setTransform(cha.getBody().getPosition().x, cha.getBody().getPosition().y - 60, 0);
		else if ( cha.getDirection().equals("droite")) cha.getBody().setTransform(cha.getBody().getPosition().x -60, cha.getBody().getPosition().y , 0);
		else if ( cha.getDirection().equals("gauche")) cha.getBody().setTransform(cha.getBody().getPosition().x +60, cha.getBody().getPosition().y , 0);
	}
	
}
