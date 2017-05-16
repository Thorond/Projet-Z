package items;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.mygdx.game.GameMain;

import characters.MainCharacter;
import scenes.MainMenu;

public class Essence {
	
	public static final int essenceMax = 999;
	public static int nombreEssence = 0; // à sauvegarder
	
	public static Texture essenceBleu = new Texture("Divers/essence/essenceBleu.png");
	public static Texture essenceJaune = new Texture("Divers/essence/essenceJaune.png");
	public static Texture essenceOrange = new Texture("Divers/essence/essenceOrange.png");
	public static Texture essenceRouge = new Texture("Divers/essence/essenceRouge.png");
	public static Texture essenceNombre = new Texture("Divers/essence/essenceNombre.png");

	public static Texture texteEssence10 = new Texture("texte/divers/texteEssence10.png");
    public static Texture texteEssence25 = new Texture("texte/divers/texteEssence25.png");

	protected boolean estPrésent =false;
	protected boolean clignotement = false;
	protected long start;
	protected long startClignotement;
	protected int x;
	protected int y;
	public int type ;
	
	public static Essence[] essences = new Essence[] { new Essence(), new Essence(), new Essence(), new Essence(), new Essence(),
			new Essence(), new Essence(), new Essence(), new Essence(), new Essence(),
			new Essence(), new Essence(), new Essence(), new Essence(), new Essence(),
			new Essence(), new Essence(), new Essence(), new Essence(), new Essence()
	};
	
	public Essence(){
	}
	
	public void déposerEssence(int X, int Y){
		double ty = Math.random();
		if ( ty >=  0.10) type = 1;
		else if( ty >= 0.05) type = 2;
		else if ( ty >= 0.01 ) type = 3;
		else type = 4;
		
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
	
	public void setEstPrésent(boolean boo){
		estPrésent = boo;
		if (boo == true) {
			start = System.currentTimeMillis();
			startClignotement = System.currentTimeMillis();
		}
	}
	
	public void clignotementEssence(){
		if ( System.currentTimeMillis() - this.startClignotement > 300){
			if ( clignotement == false ){
				clignotement = true;
			} else{
				clignotement = false;
			}
			startClignotement = System.currentTimeMillis();
			
		}
	}
	
	public static void remplirEssences(int X, int Y){
		if ( Math.random() < 0.4 ){
			for ( int i = 0 ; i < essences.length ; i++ ){
				if ( essences[i].estPrésent == false ) {
					essences[i].setEstPrésent(true);
					essences[i].déposerEssence(X, Y);
					break;
				}
			}
		}
	}
	
	public static void détectionEssence(MainCharacter Link){
		for ( int i = 0 ; i < essences.length ; i ++){
			if (essences[i].isEstPrésent()){
				for ( int j = -10 ; j < 40 ; j ++){
					for ( int k = -10 ; k < 40 ; k ++){
						if ( (int) (Link.getBody().getPosition().x*MainMenu.PPM) +j == essences[i].getX()
								&& (int) (Link.getBody().getPosition().y*MainMenu.PPM) +k == essences[i].getY() ){
							if ( essences[i].type == 1) nombreEssence += 1;
							else if ( essences[i].type == 2) nombreEssence += 5;
							else if ( essences[i].type == 3) nombreEssence += 10;
							else if ( essences[i].type == 4) nombreEssence += 25;
							if ( nombreEssence > essenceMax ) nombreEssence = 999;
							essences[i].setEstPrésent(false);
						}
					}
				}

			}
		}
	}

	public static void détectionEssenceEpée(MainCharacter Link){
		for ( int i = 0 ; i < essences.length ; i ++){
			if (essences[i].isEstPrésent()){
				if (Link.getDirection().equals("droite")){
					if ( (int) Link.getBody().getPosition().x*MainMenu.PPM <=  essences[i].getX()
							&& (int) Link.getBody().getPosition().x*MainMenu.PPM + 60 >=  essences[i].getX()
							&& (int) Link.getBody().getPosition().y*MainMenu.PPM -20 <=  essences[i].getY()
							&& (int) Link.getBody().getPosition().y*MainMenu.PPM +60 >=  essences[i].getY() ){
						if ( essences[i].type == 1) nombreEssence += 1;
						else if ( essences[i].type == 2) nombreEssence += 5;
						else if ( essences[i].type == 3) nombreEssence += 10;
						else if ( essences[i].type == 4) nombreEssence += 25;
						if ( nombreEssence > essenceMax ) nombreEssence = 999;
						essences[i].setEstPrésent(false);
					}
				} else if (Link.getDirection().equals("gauche")){
					if ( (int) Link.getBody().getPosition().x*MainMenu.PPM >= essences[i].getX()
							&& (int) Link.getBody().getPosition().x*MainMenu.PPM -60 <= essences[i].getX()
							&& (int) Link.getBody().getPosition().y*MainMenu.PPM -20 <= essences[i].getY()
							&& (int) Link.getBody().getPosition().y*MainMenu.PPM +60 >= essences[i].getY() ){
						if ( essences[i].type == 1) nombreEssence += 1;
						else if ( essences[i].type == 2) nombreEssence += 5;
						else if ( essences[i].type == 3) nombreEssence += 10;
						else if ( essences[i].type == 4) nombreEssence += 25;
						if ( nombreEssence > essenceMax ) nombreEssence = 999;
						essences[i].setEstPrésent(false);
					}
				} else if (Link.getDirection().equals("haut")){
					if ( (int) Link.getBody().getPosition().x*MainMenu.PPM -20 <= essences[i].getX()
							&& (int) Link.getBody().getPosition().x*MainMenu.PPM + 60 >= essences[i].getX()
							&& (int) Link.getBody().getPosition().y*MainMenu.PPM  <= essences[i].getY()
							&& (int) Link.getBody().getPosition().y*MainMenu.PPM +60 >= essences[i].getY() ){
						if ( essences[i].type == 1) nombreEssence += 1;
						else if ( essences[i].type == 2) nombreEssence += 5;
						else if ( essences[i].type == 3) nombreEssence += 10;
						else if ( essences[i].type == 4) nombreEssence += 25;
						if ( nombreEssence > essenceMax ) nombreEssence = 999;
						essences[i].setEstPrésent(false);
					}
				} else if (Link.getDirection().equals("bas")){
					if ( (int) Link.getBody().getPosition().x*MainMenu.PPM -20 <= essences[i].getX()
							&& (int) Link.getBody().getPosition().x*MainMenu.PPM + 60 >= essences[i].getX()
							&& (int) Link.getBody().getPosition().y*MainMenu.PPM >= essences[i].getY()
							&& (int) Link.getBody().getPosition().y*MainMenu.PPM -60 <= essences[i].getY() ){
						if ( essences[i].type == 1) nombreEssence += 1;
						else if ( essences[i].type == 2) nombreEssence += 5;
						else if ( essences[i].type == 3) nombreEssence += 10;
						else if ( essences[i].type == 4) nombreEssence += 25;
						if ( nombreEssence > essenceMax ) nombreEssence = 999;
						essences[i].setEstPrésent(false);
					}
				}

			}
		}
	}
	
	public static void représentationEssence(GameMain game){
		for ( int i = 0; i< essences.length ; i++){
			if ( System.currentTimeMillis() - essences[i].getStart() > 10000) essences[i].setEstPrésent(false);
			if ( essences[i].isEstPrésent() 
					&& System.currentTimeMillis() - essences[i].getStart() < 5000) {
				if ( essences[i].type == 1 ) game.getBatch().draw(essenceBleu, essences[i].getX() , essences[i].getY());
				else if ( essences[i].type == 2 ) game.getBatch().draw(essenceRouge, essences[i].getX() , essences[i].getY());
				else if ( essences[i].type == 3 ) game.getBatch().draw(essenceJaune, essences[i].getX() , essences[i].getY());
				else if ( essences[i].type == 4 ) game.getBatch().draw(essenceOrange, essences[i].getX() , essences[i].getY());
			}
			else if ( essences[i].isEstPrésent()
					&& System.currentTimeMillis() - essences[i].getStart() > 5000){
				essences[i].clignotementEssence();
				if (essences[i].isClignotement() ) {
					if ( essences[i].type == 1 ) game.getBatch().draw(essenceBleu, essences[i].getX() , essences[i].getY());
					else if ( essences[i].type == 2 ) game.getBatch().draw(essenceRouge, essences[i].getX() , essences[i].getY());
					else if ( essences[i].type == 3 ) game.getBatch().draw(essenceJaune, essences[i].getX() , essences[i].getY());
					else if ( essences[i].type == 4 ) game.getBatch().draw(essenceOrange, essences[i].getX() , essences[i].getY());
				}
			}
		}
	}
	
	public static void représentationNombreEssence(GameMain game, BitmapFont font){
		game.getBatch().draw(essenceNombre, 380, 410 );
		font.draw(game.getBatch(),  Integer.toString(nombreEssence) , 430, 430);
	}
	
	public static void réinitialisation(){
		for ( int i = 0 ; i < essences.length ; i++) essences[i].setEstPrésent(false);
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

	public boolean isEstPrésent() {
		return estPrésent;
	}
	
}
