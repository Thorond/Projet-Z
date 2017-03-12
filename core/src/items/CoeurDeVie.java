package items;

import com.badlogic.gdx.graphics.Texture;

public class CoeurDeVie {
	
	public static Texture coeurDeVie = new Texture("Divers/coeurDeVie.png");
	public static Texture receptacleDeCoeur = new Texture("Divers/receptacleDeCoeur.png");
	protected boolean estPr�sent =false;
	protected boolean clignotement = false;
	protected long start;
	protected long startClignotement;
	protected int x;
	protected int y;
	public static CoeurDeVie[] coeurDeVies = new CoeurDeVie[] { new CoeurDeVie(), new CoeurDeVie(), new CoeurDeVie(), new CoeurDeVie(), new CoeurDeVie(),
			new CoeurDeVie(), new CoeurDeVie(), new CoeurDeVie(), new CoeurDeVie(), new CoeurDeVie(),
			new CoeurDeVie(), new CoeurDeVie(), new CoeurDeVie(), new CoeurDeVie(), new CoeurDeVie(),
			new CoeurDeVie(), new CoeurDeVie(), new CoeurDeVie(), new CoeurDeVie(), new CoeurDeVie()
	};
	
	public CoeurDeVie(){
	}
	
	public void d�poserCoeur(int X, int Y){
		double tempo = Math.random();
		if ( tempo < 0.25 ) {
			x = X + (int) (30 * Math.random());
			y = Y + (int) (30 * Math.random());
		}
		else if (tempo > 0.25 && tempo < 0.5) {
			x = X - (int) (30 * Math.random());
			y = Y + (int) (30 * Math.random());
		}
		else if (tempo > 0.5 && tempo < 0.75 ) {
			x = X + (int) (30 * Math.random());
			y = Y - (int) (30 * Math.random());
		}
		else if (tempo > 0.75 ){
			x = X - (int) (30 * Math.random());
			y = Y - (int) (30 * Math.random());
		}
	}
	
	public void setEstPr�sent(boolean boo){
		estPr�sent = boo;
		if (boo == true) {
			start = System.currentTimeMillis();
			startClignotement = System.currentTimeMillis();
		}
	}
	
	public void clignotementCoeur(){
		if ( System.currentTimeMillis() - this.startClignotement > 300){
			if ( clignotement == false ){
				clignotement = true;
			} else{
				clignotement = false;
			}
			startClignotement = System.currentTimeMillis();
			
		}
	}
	
	public static void remplirCoeurDeVies(int X, int Y){
		for ( int i = 0 ; i < coeurDeVies.length ; i++ ){
			if ( coeurDeVies[i].estPr�sent == false ) {
				coeurDeVies[i].setEstPr�sent(true);
				coeurDeVies[i].d�poserCoeur(X, Y);
				break;
			}
		}
	}
	
	public static void r�initialisation(){
		for ( int i = 0 ; i < coeurDeVies.length ; i++) coeurDeVies[i].setEstPr�sent(false);
	}


	public boolean isClignotement() {
		return clignotement;
	}

	public void setClignotement(boolean clignotement) {
		this.clignotement = clignotement;
	}

	public long getStart() {
		return start;
	}

	public void setStart(long start) {
		this.start = start;
	}

	public long getStartClignotement() {
		return startClignotement;
	}

	public void setStartClignotement(long startClignotement) {
		this.startClignotement = startClignotement;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public boolean isEstPr�sent() {
		return estPr�sent;
	}

}
