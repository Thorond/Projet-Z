package items;

import com.badlogic.gdx.graphics.Texture;

public class CoeurDeVie {
	
	public static Texture coeurDeVie = new Texture("Divers/coeurDeVie.png");
	public static boolean estPr�sent =false;
	public static boolean clignotement = false;
	public static long start;
	public static long startClignotement;
	public static int x;
	public static int y;
	
	public static void d�poserCoeur(int X, int Y){
		double tempo = Math.random();
		if ( tempo < 0.25 ) {
			x = X + (int) (60 * Math.random());
			y = Y + (int) (60 * Math.random());
		}
		else if (tempo > 0.25 && tempo < 0.5) {
			x = X - (int) (60 * Math.random());
			y = Y + (int) (60 * Math.random());
		}
		else if (tempo > 0.5 && tempo < 0.75 ) {
			x = X + (int) (60 * Math.random());
			y = Y - (int) (60 * Math.random());
		}
		else if (tempo > 0.75 ){
			x = X - (int) (60 * Math.random());
			y = Y - (int) (60 * Math.random());
		}
	}
	
	public static void setEstPr�sent(boolean boo){
		estPr�sent = boo;
		if (boo == true) {
			start = System.currentTimeMillis();
			startClignotement = System.currentTimeMillis();
		}
	}
	
	public static void clignotementCoeur(){
		if ( System.currentTimeMillis() - CoeurDeVie.startClignotement > 300){
			if ( clignotement == false ){
				clignotement = true;
			} else{
				clignotement = false;
			}
			startClignotement = System.currentTimeMillis();
			
		}
	}

}
