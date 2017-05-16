package items;

import com.badlogic.gdx.graphics.Texture;
import com.mygdx.game.GameMain;

import characters.MainCharacter;
import map.CadrillageMap;
import map.zoneGlace.GrotteF5Salle3;
import map.zoneGlace.GrotteI1Salle1;
import map.zoneGlace.IglooC5;
import map.zoneGlace.PlacementMainZoneGlace;
import map.zoneGlace.SousMapA2;
import map.zoneGlace.SousMapB3;
import map.zoneGlace.SousMapE1;
import map.zoneGlace.SousMapF4;
import map.zoneGlace.SousMapI1;
import scenes.MainMenu;

public class CoeurDeVie {
	
	public static Texture coeurDeVie = new Texture("Divers/coeur/coeurDeVie.png");
	protected boolean estPrésent =false;
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
	
	public void déposerCoeur(int X, int Y){
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
		if ( Math.random() < 0.4 ){
			for ( int i = 0 ; i < coeurDeVies.length ; i++ ){
				if ( coeurDeVies[i].estPrésent == false ) {
					coeurDeVies[i].setEstPrésent(true);
					coeurDeVies[i].déposerCoeur(X, Y);
					break;
				}
			}
		}
	}
	
	public static void détectionCoeur(MainCharacter Link){
		for ( int i = 0 ; i < coeurDeVies.length ; i ++){
			if (coeurDeVies[i].isEstPrésent()){
				if ( (int) (Link.getBody().getPosition().x*MainMenu.PPM) -10 <= coeurDeVies[i].getX()
						&& (int) (Link.getBody().getPosition().x*MainMenu.PPM) +40 >= coeurDeVies[i].getX()
						&& (int) (Link.getBody().getPosition().y*MainMenu.PPM) -10 <= coeurDeVies[i].getY()
						&& (int) (Link.getBody().getPosition().y*MainMenu.PPM) +40 >= coeurDeVies[i].getY() ){
					if (Link.getHealthMax() - Link.getHealth() >= 1 ) Link.setHealth(Link.getHealth() +1);
					coeurDeVies[i].setEstPrésent(false);
				}

			}
		}
	}

	public static void détectionCoeurEpée(MainCharacter Link){
		for ( int i = 0 ; i < coeurDeVies.length ; i ++){
			if (coeurDeVies[i].isEstPrésent()){
				if (Link.getDirection().equals("droite")){
					if ( (int) Link.getBody().getPosition().x*MainMenu.PPM <=  coeurDeVies[i].getX()
							&& (int) Link.getBody().getPosition().x*MainMenu.PPM + 60 >=  coeurDeVies[i].getX()
							&& (int) Link.getBody().getPosition().y*MainMenu.PPM -20 <=  coeurDeVies[i].getY()
							&& (int) Link.getBody().getPosition().y*MainMenu.PPM +60 >=  coeurDeVies[i].getY() ){
						if (Link.getHealthMax() - Link.getHealth() >= 1 ) Link.setHealth(Link.getHealth() +1);
						coeurDeVies[i].setEstPrésent(false);
					}
				} else if (Link.getDirection().equals("gauche")){
					if ( (int) Link.getBody().getPosition().x*MainMenu.PPM >= coeurDeVies[i].getX()
							&& (int) Link.getBody().getPosition().x*MainMenu.PPM -60 <= coeurDeVies[i].getX()
							&& (int) Link.getBody().getPosition().y*MainMenu.PPM -20 <= coeurDeVies[i].getY()
							&& (int) Link.getBody().getPosition().y*MainMenu.PPM +60 >= coeurDeVies[i].getY() ){
						if (Link.getHealthMax() - Link.getHealth() >= 1 ) Link.setHealth(Link.getHealth() +1);
						coeurDeVies[i].setEstPrésent(false);
					}
				} else if (Link.getDirection().equals("haut")){
					if ( (int) Link.getBody().getPosition().x*MainMenu.PPM -20 <= coeurDeVies[i].getX()
							&& (int) Link.getBody().getPosition().x*MainMenu.PPM + 60 >= coeurDeVies[i].getX()
							&& (int) Link.getBody().getPosition().y*MainMenu.PPM  <= coeurDeVies[i].getY()
							&& (int) Link.getBody().getPosition().y*MainMenu.PPM +60 >= coeurDeVies[i].getY() ){
						if (Link.getHealthMax() - Link.getHealth() >= 1 ) Link.setHealth(Link.getHealth() +1);
						coeurDeVies[i].setEstPrésent(false);
					}
				} else if (Link.getDirection().equals("bas")){
					if ( (int) Link.getBody().getPosition().x*MainMenu.PPM -20 <= coeurDeVies[i].getX()
							&& (int) Link.getBody().getPosition().x*MainMenu.PPM + 60 >= coeurDeVies[i].getX()
							&& (int) Link.getBody().getPosition().y*MainMenu.PPM >= coeurDeVies[i].getY()
							&& (int) Link.getBody().getPosition().y*MainMenu.PPM -60 <= coeurDeVies[i].getY() ){
						if (Link.getHealthMax() - Link.getHealth() >= 1 ) Link.setHealth(Link.getHealth() +1);
						coeurDeVies[i].setEstPrésent(false);
					}
				}

			}
		}
	}
	
//	=================================================================================================
	
	public static void représentationNombreCoeur(GameMain game, MainCharacter Link) {
		int vie = 0 ;
		int écart = 0;
		int placeCoeurY = 0;
		boolean premièreLigne = true;
		
		
		while ( vie +4 <= Link.getHealth()  ){

			if (premièreLigne ) {
				if ( vie>= 40 ){
					placeCoeurY = 40 ;
					écart = 0;
					premièreLigne = false;
				}
			}
			
			game.getBatch().draw(MainCharacter.coeurPlein, 20 + écart, 440 - placeCoeurY );
			écart+=30;
			vie += 4;
		}
		if (premièreLigne ) {
			if ( vie>= 40 ){
				placeCoeurY = 40 ;
				écart = 0;
				premièreLigne = false;
			}
		}
		if (Link.getHealth() != Link.getHealthMax()){
			if ( Link.getHealth() % 4 == 1 ) game.getBatch().draw(MainCharacter.coeurUnQuart, 20 + écart, 440  - placeCoeurY);
			else if ( Link.getHealth() % 4 == 2 ) game.getBatch().draw(MainCharacter.coeurMoitié, 20 + écart, 440 - placeCoeurY );
			else if ( Link.getHealth() % 4 == 3 ) game.getBatch().draw(MainCharacter.coeurTroisQuart, 20 + écart, 440  - placeCoeurY);
			else if ( Link.getHealth() % 4 == 0 || Link.getHealth() <= 0 ) game.getBatch().draw(MainCharacter.coeurVide, 20 + écart, 440  - placeCoeurY);
			écart+=30;
			vie+=4;
		}
		
		while ( vie + 4 <= Link.getHealthMax()){
			if (premièreLigne ) {
				if ( vie>= 40 ){
					placeCoeurY = 40 ;
					écart = 0;
					premièreLigne = false;
				}
			}
			game.getBatch().draw(MainCharacter.coeurVide, 20 + écart, 440  - placeCoeurY);
			écart+=30;
			vie+=4;
		}
		premièreLigne = true;
	}
	
//	=================================================================================================
	
	public static void représentationCoeur(GameMain game){
		for ( int i = 0; i< coeurDeVies.length ; i++){
			if ( System.currentTimeMillis() - coeurDeVies[i].getStart() > 10000) coeurDeVies[i].setEstPrésent(false);
			if ( coeurDeVies[i].isEstPrésent() 
					&& System.currentTimeMillis() - coeurDeVies[i].getStart() < 5000) game.getBatch().draw(coeurDeVie, coeurDeVies[i].getX() , coeurDeVies[i].getY());
			else if ( coeurDeVies[i].isEstPrésent()
					&& System.currentTimeMillis() - coeurDeVies[i].getStart() > 5000){
				coeurDeVies[i].clignotementCoeur();
				if (coeurDeVies[i].isClignotement() ) game.getBatch().draw(coeurDeVie, coeurDeVies[i].getX() , coeurDeVies[i].getY());
			}
		}
	}
	
	public static void réinitialisation(){
		for ( int i = 0 ; i < coeurDeVies.length ; i++) coeurDeVies[i].setEstPrésent(false);
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
	
//	gérer les réceptacles de coeurs qui rajoute un point de vie à link
	

	public static Texture receptacleDeCoeur = new Texture("Divers/receptacle/receptacleDeCoeur.png");
	public static Texture receptacleDeCoeurVide = new Texture("Divers/receptacle/receptacleDeCoeurVide.png");
	public static Texture receptacleInfDroi= new Texture("Divers/receptacle/receptacleInfDroi.png");
	public static Texture receptacleInfGau= new Texture("Divers/receptacle/receptacleInfGau.png");
	public static Texture receptacleSupDroi= new Texture("Divers/receptacle/receptacleSupDroi.png");
	public static Texture receptacleSupGauche= new Texture("Divers/receptacle/receptacleSupGauche.png");


    public static Texture texteRéceptacle = new Texture("texte/divers/texteRéceptacle.png");
	
	public static int nbrDeReceptacle = 0; // à sauvegarder 
	
	public static void receptacleDeCoeur(){
        if (PlacementMainZoneGlace.positionSousMap.equals("GrotteI1Salle1")) GrotteI1Salle1.isReceptaclePris = true;
        if (PlacementMainZoneGlace.positionSousMap.equals("IglooC5")) IglooC5.isReceptaclePris = true;
		if (PlacementMainZoneGlace.positionSousMap.equals("A2")) SousMapA2.isReceptaclePris = true;
		if (PlacementMainZoneGlace.positionSousMap.equals("B3")) SousMapB3.isReceptaclePris = true;
		if (PlacementMainZoneGlace.positionSousMap.equals("F4")) SousMapF4.isReceptaclePris = true;
		if (PlacementMainZoneGlace.positionSousMap.equals("I1")) SousMapI1.isReceptaclePris = true;
		if (PlacementMainZoneGlace.positionSousMap.equals("E1")) SousMapE1.isReceptaclePris = true;
        if (PlacementMainZoneGlace.positionSousMap.equals("GrotteF5Salle3")) GrotteF5Salle3.isReceptaclePris = true;
		nbrDeReceptacle += 1 ;
		if (nbrDeReceptacle == 4) {
			MainMenu.Link.setHealthMax(MainMenu.Link.getHealthMax() + 4);
			MainMenu.Link.setHealth(MainMenu.Link.getHealthMax());
			MainMenu.Link.setHealth(MainMenu.Link.getHealthMax());
			nbrDeReceptacle = 0 ;
		}
	}
	
	public static void détectionReceptable(MainCharacter Link){
		if ( CadrillageMap.typeDeDécor[(int) (Link.getBody().getPosition().x *MainMenu.PPM/60 )][(int) (Link.getBody().getPosition().y *MainMenu.PPM/ 60 )].equals("receptacleDeCoeur")) {
			CadrillageMap.setTypeDeDécor((int) (Link.getBody().getPosition().x *MainMenu.PPM/60 ), (int) (Link.getBody().getPosition().y *MainMenu.PPM/ 60 ), "");
			receptacleDeCoeur();
			Link.annimationAward = true;
		}
	}

	
	
}
