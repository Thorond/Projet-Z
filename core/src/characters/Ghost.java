package characters;

import com.badlogic.gdx.graphics.Texture;
import com.mygdx.game.GameMain;

import items.Plume;
import map.zoneGlace.IglooD3;

public class Ghost {
	
	public static int etatScenario = 0; // à sauvegarder
	/*etat == 0 , état initiale
	* de 1 à 6 il s'agit du dialogue normal
	* à 7 ( et à 10 , si la réponse a été fausse ) , le joueur fait le choix de répondre à l'énigme ou pas
	* donc l'état devient 8 ou 14, a 8, il y a l'énigme, à 14 il y a un texte de rupture
	* à 9 on déclenche la fonction update de l'alphabet
	* à 11 la réponse est bonne donc il vient les textes de féliciations*/
	
	public static int etatAttente1 = 0;
	public static long startAttente1 = System.currentTimeMillis();
	public static Texture  fantFace1 = new Texture("monstres/ghost/FantFace1.png");
	public static Texture  fantFace2 = new Texture("monstres/ghost/FantFace2.png");
	public static Texture  fantFace3 = new Texture("monstres/ghost/FantFace3.png");
	public static int etatAttente2 = 0;
	public static Texture  fantFace4 = new Texture("monstres/ghost/FantFace4.png");
	public static Texture  fantFace5 = new Texture("monstres/ghost/FantFace5.png");
	
	public static Texture  FantFaceDeçu = new Texture("monstres/ghost/FantFaceDeçu.png");
	public static Texture  FantFaceAward = new Texture("monstres/ghost/FantFaceAward.png");

	public static Texture  FantFaceTordu1 = new Texture("monstres/ghost/FantFaceTordu1.png");
	public static Texture  FantFaceTordu2 = new Texture("monstres/ghost/FantFaceTordu2.png");
	
	public static Texture  FantDos2 = new Texture("monstres/ghost/FantDos2.png");
	public static Texture  FantDos3 = new Texture("monstres/ghost/FantDos3.png");
	
	
	public static long timerSmoke = System.currentTimeMillis();
	public static int etatSmoke = 0;
	public static Texture  smoke1 = new Texture("effets/smoke1.png");
	public static Texture  smoke2 = new Texture("effets/smoke2.png");
	public static Texture  smoke3 = new Texture("effets/smoke3.png");
	public static Texture  smoke4 = new Texture("effets/smoke4.png");
	public static Texture  smoke5 = new Texture("effets/smoke5.png");
	
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
	public static void annimationPrésentationEnigme1(GameMain game, int x , int y){
		if (etatAttente2 == 0) game.getBatch().draw(fantFace4,x -5,y);
		else if ( etatAttente2 == 1) game.getBatch().draw(fantFace5,x,y);
		if ( System.currentTimeMillis() - startAttente1 > 1000 ){
			if (etatAttente2 == 0) etatAttente2 = 1;
			else  etatAttente2 = 0;
			startAttente1 = System.currentTimeMillis();
		}
	}
	
	public static long timerDisparition = System.currentTimeMillis() ;
	public static long timerChangementDeVitesse = System.currentTimeMillis() ;
	public static int vitesseDisparition = 300;
	public static int etatDisparition = 0;
	public static void animationDisparition(GameMain game, int x, int y){
		if (vitesseDisparition >= 21 ){
			if (etatDisparition == 0) game.getBatch().draw(FantFaceTordu1,x,y);
			else if ( etatDisparition == 1) game.getBatch().draw(FantFaceTordu2,x,y);
			else if ( etatDisparition == 2) game.getBatch().draw(FantDos2,x,y);
			else if ( etatDisparition == 3) game.getBatch().draw(FantDos3,x,y);
			if ( System.currentTimeMillis() - timerDisparition > vitesseDisparition ){
				if (etatDisparition == 0) etatDisparition = 1;
				else if ( etatDisparition == 1) etatDisparition = 2;
				else if ( etatDisparition == 2) etatDisparition = 3;
				else if ( etatDisparition == 3) etatDisparition = 0;
				timerDisparition = System.currentTimeMillis();
			}
			if (System.currentTimeMillis() - timerChangementDeVitesse > 170 && vitesseDisparition > 1 ) {
				vitesseDisparition -= 10 ;
				timerChangementDeVitesse = System.currentTimeMillis() ;
			}
		} else {
			if (Plume.isPlumePrise == false ) game.getBatch().draw(Plume.plume, x, y );
			game.getBatch().draw(Ghost.fantEvap, 270, 360 );
			if (etatSmoke == 0) game.getBatch().draw(smoke1,x-20,y);
			else if ( etatSmoke == 1) game.getBatch().draw(smoke2,x-20,y);
			else if ( etatSmoke == 2) game.getBatch().draw(smoke3,x-20,y);
			else if ( etatSmoke == 3) game.getBatch().draw(smoke4,x-20,y);
			else if ( etatSmoke == 4) game.getBatch().draw(smoke5,x-20,y);
			if ( System.currentTimeMillis() - timerSmoke > 300 ){
				if (etatSmoke == 0) etatSmoke = 1;
				else if ( etatSmoke == 1) etatSmoke = 2;
				else if ( etatSmoke == 2) etatSmoke = 3;
				else if ( etatSmoke == 3) etatSmoke = 4;
				else if ( etatSmoke == 4) {
					etatSmoke = 0;
					etatScenario = 20;
					IglooD3.destroyBody();
				}
				timerSmoke = System.currentTimeMillis();
			}
			
		}
	}
	
//	====================================================================================

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
