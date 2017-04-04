package characters;

import com.badlogic.gdx.graphics.Texture;
import com.mygdx.game.GameMain;

public class VieuxMarchand {

	public static int etatAttente1 = 0;
	public static long startAttente1 = System.currentTimeMillis();
	public static Texture  vieuxMarchandDroite1 = new Texture("monstres/vieuxMarchand/vieuxMarchandDroite1.png");
	public static Texture  vieuxMarchandDroite2 = new Texture("monstres/vieuxMarchand/vieuxMarchandDroite2.png");
	
	public static void annimationAttente1(GameMain game, int x , int y){
		if ( etatAttente1 == 0 ) game.getBatch().draw(vieuxMarchandDroite1,x,y);
		else game.getBatch().draw(vieuxMarchandDroite2,x,y);
		if ( System.currentTimeMillis() - startAttente1 > 2000 ){
			if ( etatAttente1 == 0 ) etatAttente1 = 1;
			else etatAttente1 = 0;
			startAttente1 = System.currentTimeMillis();
		}
	}
	
}
