package decors;

import com.badlogic.gdx.graphics.Texture;
import com.mygdx.game.GameMain;

import map.CadrillageMap;
import scenes.MainMenu;

public class Totem {
	
	public static boolean jeuRésolu = false; // à sauvegarder
	
	public static int xLink ;
	public static int yLink ;
	
	public static String directionTotem1 = "bas";
	public static int xTotem1 = 6; 
	public static int yTotem1 = 1; 
	public static String directionTotem2 = "haut";
	public static int xTotem2 = 3; 
	public static int yTotem2 = 7; 
	
	public static Texture totem1 = new Texture("monstres/totem/totemGauche.png");
	public static Texture totem2 = new Texture("monstres/totem/totemDroit.png");
	public static Texture totem1Complet = new Texture("monstres/totem/totemEntierDroit.png");
	public static Texture totem2Complet = new Texture("monstres/totem/totemEntierGauche.png");
	
	public static int étatTexte = 0;
	public static Texture  texte0 = new Texture("texte/totem/texte0.png");
	public static Texture  texte1 = new Texture("texte/totem/texte1.png");
	public static Texture  texte2 = new Texture("texte/totem/texte2.png");
	public static Texture  texte3 = new Texture("texte/totem/texte3.png");
	
	public static void représentationTexte(GameMain game ){
		if ( étatTexte == 1 ) game.getBatch().draw(texte0, 100 , 60 );
		else if ( étatTexte == 2 ) game.getBatch().draw(texte1, 100 , 60 );
		else if ( étatTexte == 3 ) game.getBatch().draw(texte2, 100 , 60 );
		else if ( étatTexte == 5 ) game.getBatch().draw(texte3, 100 , 60 );
	}

	public static void représentationTotems(GameMain game, int x, int y){
		if  ( !( jeuRésolu ) ) {
			if ( isLinkDamier == false){
				game.getBatch().draw(totem1,xTotem1 *60 +x,yTotem1 *60 +y);
				game.getBatch().draw(totem2,xTotem2 *60 +x,yTotem2 *60 +y);
			} else {
				game.getBatch().draw(totem1,xTotem1 *60 +x,yTotem1 *60 +y);
				game.getBatch().draw(totem2,xTotem2 *60 +x,yTotem2 *60 +y);
			} 
		} else {
				game.getBatch().draw(totem1Complet,5 *60 +x,4 *60 +y);
				game.getBatch().draw(totem2Complet,4 *60 +x,4 *60 +y);
		}
	}
	
	public static void déplacementTotems(){
		if (isLinkDamier){
			if ( xLink -(int) (MainMenu.Link.getX() / 60 ) > 0 ) {
				if ( CadrillageMap.typeDeDécor[xTotem1][yTotem1+1].equals("") && yTotem1 < 7 
						&& !( yTotem1+1 == yTotem2 && xTotem1 == xTotem2 )) yTotem1 ++;
				if ( CadrillageMap.typeDeDécor[xTotem2][yTotem2-1].equals("")
						&& !( yTotem1 == yTotem2 && xTotem1 == xTotem2-1 )) yTotem2 --;
				xLink = (int) (MainMenu.Link.getX() / 60 );
			}
			else if ( xLink -(int) (MainMenu.Link.getX() / 60 ) < 0 ) {
				if ( CadrillageMap.typeDeDécor[xTotem1][yTotem1-1].equals("")
						&& !( yTotem1-1 == yTotem2 && xTotem1 == xTotem2 )) yTotem1 --;
				if ( CadrillageMap.typeDeDécor[xTotem2][yTotem2+1].equals("") && yTotem2 < 7
						&& !( yTotem1 == yTotem2 && xTotem1 == xTotem2+1 )) yTotem2 ++;
				xLink = (int) (MainMenu.Link.getX() / 60 );
			}
			else if ( yLink -(int) (MainMenu.Link.getY() / 60 ) > 0 ) {
				if ( CadrillageMap.typeDeDécor[xTotem1-1][yTotem1].equals("")
						&& !( yTotem1 == yTotem2 && xTotem1-1 == xTotem2 )) xTotem1 --;
				if ( CadrillageMap.typeDeDécor[xTotem2+1][yTotem2].equals("")
						&& !( yTotem1 == yTotem2 && xTotem1 == xTotem2+1 )) xTotem2 ++;
				yLink = (int) (MainMenu.Link.getY() / 60 );
			}
			else if ( yLink -(int) (MainMenu.Link.getY() / 60 ) < 0 ) {
				if ( CadrillageMap.typeDeDécor[xTotem1+1][yTotem1].equals("")
						&& !( yTotem1 == yTotem2 && xTotem1+1 == xTotem2 )) xTotem1 ++;
				if ( CadrillageMap.typeDeDécor[xTotem2-1][yTotem2].equals("")
						&& !( yTotem1 == yTotem2 && xTotem1 == xTotem2-1 )) xTotem2 --;
				yLink = (int) (MainMenu.Link.getY() / 60 );
			}
		}
		if ( xTotem1 == 4 && yTotem1 == 4 && xTotem2 == 5 && yTotem2 == 4 ) {
			if ( jeuRésolu == false ) {
				DonjonGlace.transitionGate = true;
				étatTexte = 5;
			} 
			jeuRésolu = true;
		}
	}
	
	public static boolean isLinkDamier = false;
	public static void positionInitialLink(){
		if (MainMenu.Link.getY() > 60 && isLinkDamier == false){
			isLinkDamier = true;
			if ( jeuRésolu == false ) étatTexte = 1;
			xLink = (int) (MainMenu.Link.getX() / 60 );
			yLink = (int) (MainMenu.Link.getY() / 60 );
		} 
		if ( MainMenu.Link.getY() < 60 && isLinkDamier ) {
			isLinkDamier = false;
			étatTexte = 0;
		}
	}
	
}
