package décors;

import com.badlogic.gdx.graphics.Texture;
import com.mygdx.game.GameMain;

import characters.MainCharacter;

public class EauProfonde {
	
	public static boolean etat1 = false;
	public static Texture eauProfonde1 = new Texture("Map/eauProfonde2.png");
	public static Texture eauProfonde2 = new Texture("Map/eauProfonde3.png");
	public static long start = System.currentTimeMillis();

	public static void setDamage(MainCharacter cha) {
		cha.setHealth(cha.getHealth() - 2 );
		if ( cha.getDirection().equals("bas")) cha.getBody().setTransform(cha.getBody().getPosition().x, cha.getBody().getPosition().y + 60, 0);
		else if ( cha.getDirection().equals("haut")) cha.getBody().setTransform(cha.getBody().getPosition().x, cha.getBody().getPosition().y - 60, 0);
		else if ( cha.getDirection().equals("droite")) cha.getBody().setTransform(cha.getBody().getPosition().x -60, cha.getBody().getPosition().y , 0);
		else if ( cha.getDirection().equals("gauche")) cha.getBody().setTransform(cha.getBody().getPosition().x +60, cha.getBody().getPosition().y , 0);
	}
	
	public static void eauProfonde(GameMain game, int x, int y){
		if ( etat1 == false ) game.getBatch().draw(eauProfonde1, x, y);
		else game.getBatch().draw(eauProfonde2, x, y);		
		if ( System.currentTimeMillis() - start > 500){
			start = System.currentTimeMillis();
			if ( etat1 == false ) etat1=true;
			else etat1=false;
		}
		
	}

}
