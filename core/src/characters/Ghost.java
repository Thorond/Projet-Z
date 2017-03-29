package characters;

import com.badlogic.gdx.graphics.Texture;
import com.mygdx.game.GameMain;

public class Ghost {
	
	public static int etatScenario = 0; // à sauvegarder
	
	
	public static int etatAttente1 = 0;
	public static long startAttente1 = System.currentTimeMillis();
	public static Texture  fantFace1 = new Texture("monstres/ghost/FantFace1.png");
	public static Texture  fantFace2 = new Texture("monstres/ghost/FantFace2.png");
	public static Texture  fantFace3 = new Texture("monstres/ghost/FantFace3.png");
	
	public static Texture  fantEvap = new Texture("monstres/ghost/FantEvap.png");
	
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

	public static Texture flècheBas = new Texture("texte/flècheBas.png");
	public static long timerClignoFlèche = System.currentTimeMillis();
	public static boolean isAffi = true;
	
	public static Texture Texte1 = new Texture("texte/ghost/Texte1.png");
	public static Texture texte2 = new Texture("texte/ghost/texte2.png");
	public static Texture texte3 = new Texture("texte/ghost/texte3.png");
	public static Texture texte4 = new Texture("texte/ghost/texte4.png");
	public static Texture texte5 = new Texture("texte/ghost/texte5.png");
	public static Texture texte6 = new Texture("texte/ghost/texte6.png");
	public static Texture texte7 = new Texture("texte/ghost/texte7.png");
	public static Texture texte8 = new Texture("texte/ghost/texte8.png");
	public static Texture texte9 = new Texture("texte/ghost/texte9.png");
	public static Texture texte10RéponseFausse = new Texture("texte/ghost/texte10RéponseFausse.png");
	public static Texture texte10RéponseBonne = new Texture("texte/ghost/texte10RéponseBonne.png");
	
	public static void scenario1(GameMain game) {
		if ( etatScenario == 1) game.getBatch().draw(Texte1,100,60);
		else if ( etatScenario == 2) game.getBatch().draw(texte2,100,60);
		else if ( etatScenario == 3) game.getBatch().draw(texte3,100,60);
		else if ( etatScenario == 4) game.getBatch().draw(texte4,100,60);
		else if ( etatScenario == 5) game.getBatch().draw(texte5,100,60);
		else if ( etatScenario == 6) game.getBatch().draw(texte6,100,60);
		else if ( etatScenario == 7) game.getBatch().draw(texte7,100,60);
		else if ( etatScenario == 8) game.getBatch().draw(texte8,100,60);
		else if ( etatScenario == 9) game.getBatch().draw(texte9,100,190);
		else if ( etatScenario == 10) game.getBatch().draw(texte10RéponseFausse,100,60);
		else if ( etatScenario == 11) game.getBatch().draw(texte10RéponseBonne,100,60);
		if (etatScenario != 0 && etatScenario != 9 && isAffi ) game.getBatch().draw(flècheBas,405,98);
		if (System.currentTimeMillis() - timerClignoFlèche > 400 ){
			if (isAffi) isAffi = false;
			else isAffi = true;
			timerClignoFlèche = System.currentTimeMillis();
		}
	}
		

}
