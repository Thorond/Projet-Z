package characters;

import com.badlogic.gdx.graphics.Texture;
import com.mygdx.game.GameMain;

public class Ghost {
	
	public static int etatAttente1 = 0;
	public static long startAttente1 = System.currentTimeMillis();
	public static Texture  fantFace1 = new Texture("monstres/ghost/FantFace1.png");
	public static Texture  fantFace2 = new Texture("monstres/ghost/FantFace2.png");
	public static Texture  fantFace3 = new Texture("monstres/ghost/FantFace3.png");
	
	public static void annimationAttente1(GameMain game, int x , int y){
		if (etatAttente1 == 0) game.getBatch().draw(fantFace1,x,y);
		else if ( etatAttente1 == 1) game.getBatch().draw(fantFace3,x,y);
		else if ( etatAttente1 == 2) game.getBatch().draw(fantFace2,x,y);
		else if ( etatAttente1 == 3) game.getBatch().draw(fantFace3,x,y);
		if ( System.currentTimeMillis() - startAttente1 > 400 ){
			if (etatAttente1 == 0) etatAttente1 = 1;
			else if ( etatAttente1 == 1) etatAttente1 = 2;
			else if ( etatAttente1 == 2) etatAttente1 = 3;
			else if ( etatAttente1 == 3) etatAttente1 = 0;
			startAttente1 = System.currentTimeMillis();
		}
	}

}
