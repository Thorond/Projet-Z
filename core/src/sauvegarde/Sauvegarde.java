package sauvegarde;

import menus.Carte;

public class Sauvegarde implements java.io.Serializable{
	
	
//  ===========================================================================
//				classe permettant de sauvegarder le jeu
//  ===========================================================================
	  
//	private static final long serialVersionUID = 1L;
	private float coordX;
	private float coordY;
	public String direction;
	public String posiSousMap;
	public String zone;
//	public int HealthMax;
//	public int Health;
//	public boolean isEpéePrise;
//	public boolean isArcPris;
//	public boolean isBombeRécupéré;
//	public boolean isBouclierPris;
//	public int nombreFlèche;
//	public boolean isGantDeForcePris ;
//	public boolean isPlumePrise;
//
////	 totem
//	public  boolean jeuRésolu;
////	iceman
//	public int étatTexte;
////	ghost
//	public int etatScenario;
////	grotteArc salle 3
//	public boolean estPassé;
	
//	 ******************* carte ************************
	public boolean mapA1Découverte = false; 
	public boolean mapA2Découverte = false; 
	public boolean mapA3Découverte = false; 
	public boolean mapA4Découverte = false; 
	public boolean mapA5Découverte = false; 
	public boolean mapA6Découverte = false; 

	public boolean mapB1Découverte = false; 
	public boolean mapB2Découverte = false; 
	public boolean mapB3Découverte = false; 
	public boolean mapB4Découverte = false; 
	public boolean mapB5Découverte = false; 
	public boolean mapB6Découverte = false; 

	public boolean mapC1Découverte = false; 
	public boolean mapC2Découverte = false; 
	public boolean mapC3Découverte = false; 
	public boolean mapC4Découverte = false; 
	public boolean mapC5Découverte = false; 
	public boolean mapC6Découverte = false; 

	public boolean mapD1Découverte = false; 
	public boolean mapD2Découverte = false; 
	public boolean mapD3Découverte = false; 
	public boolean mapD4Découverte = false; 
	public boolean mapD5Découverte = false; 
	public boolean mapD6Découverte = false; 

	public boolean mapE1Découverte = false; 
	public boolean mapE2Découverte = false; 
	public boolean mapE3Découverte = false; 
	public boolean mapE4Découverte = false; 
	public boolean mapE5Découverte = false; 
	public boolean mapE6Découverte = false; 

	public boolean mapF1Découverte = false; 
	public boolean mapF2Découverte = false; 
	public boolean mapF3Découverte = false; 
	public boolean mapF4Découverte = false; 
	public boolean mapF5Découverte = false; 
	public boolean mapF6Découverte = false; 

	public boolean mapG1Découverte = false; 
	public boolean mapG2Découverte = false; 
	public boolean mapG3Découverte = false; 
	public boolean mapG4Découverte = false; 
	public boolean mapG5Découverte = false; 
	public boolean mapG6Découverte = false; 

	public boolean mapH1Découverte = false; 
	public boolean mapH2Découverte = false; 
	public boolean mapH3Découverte = false; 
	public boolean mapH4Découverte = false; 
	public boolean mapH5Découverte = false; 
	public boolean mapH6Découverte = false; 

	public boolean mapI1Découverte = false; 
	public boolean mapI2Découverte = false; 
	public boolean mapI3Découverte = false; 
	public boolean mapI4Découverte = false; 
	public boolean mapI5Découverte = false; 
	public boolean mapI6Découverte = false; 
	 
	  public Sauvegarde(float x, float y, String direction, String posiSousMap, String zone){
	    this.coordX = x;
	    this.coordY = y;
	    this.direction = direction;
	    this.posiSousMap = posiSousMap;
		this.zone = zone;

          //	 ******************* carte ************************
           mapA1Découverte = Carte.mapA1Découverte ;
           mapA2Découverte = Carte.mapA2Découverte;
           mapA3Découverte = Carte.mapA3Découverte;
           mapA4Découverte = Carte.mapA4Découverte;
           mapA5Découverte = Carte.mapA5Découverte;
           mapA6Découverte = Carte.mapA6Découverte;

           mapB1Découverte = Carte.mapB1Découverte;
           mapB2Découverte = Carte.mapB2Découverte;
           mapB3Découverte = Carte.mapB3Découverte;
           mapB4Découverte = Carte.mapB4Découverte;
           mapB5Découverte = Carte.mapB5Découverte;
           mapB6Découverte = Carte.mapB6Découverte;

           mapC1Découverte = Carte.mapC1Découverte;
           mapC2Découverte = Carte.mapC2Découverte;
           mapC3Découverte = Carte.mapC3Découverte;
           mapC4Découverte = Carte.mapC4Découverte;
           mapC5Découverte = Carte.mapC5Découverte;
           mapC6Découverte = Carte.mapC6Découverte;

           mapD1Découverte = Carte.mapD1Découverte;
           mapD2Découverte = Carte.mapD2Découverte;
           mapD3Découverte = Carte.mapD3Découverte;
           mapD4Découverte = Carte.mapD4Découverte;
           mapD5Découverte = Carte.mapD5Découverte;
           mapD6Découverte = Carte.mapD6Découverte;

           mapE1Découverte = Carte.mapE1Découverte;
           mapE2Découverte = Carte.mapE2Découverte;
           mapE3Découverte = Carte.mapE3Découverte;
           mapE4Découverte = Carte.mapE4Découverte;
           mapE5Découverte = Carte.mapE5Découverte;
           mapE6Découverte = Carte.mapE6Découverte;

           mapF1Découverte = Carte.mapF1Découverte;
           mapF2Découverte = Carte.mapF2Découverte;
           mapF3Découverte = Carte.mapF3Découverte;
           mapF4Découverte = Carte.mapF4Découverte;
           mapF5Découverte = Carte.mapF5Découverte;
           mapF6Découverte = Carte.mapF6Découverte;

           mapG1Découverte = Carte.mapG1Découverte;
           mapG2Découverte = Carte.mapG2Découverte;
           mapG3Découverte = Carte.mapG3Découverte;
           mapG4Découverte = Carte.mapG4Découverte;
           mapG5Découverte = Carte.mapG5Découverte;
           mapG6Découverte = Carte.mapG6Découverte;

           mapH1Découverte = Carte.mapH1Découverte;
           mapH2Découverte = Carte.mapH2Découverte;
           mapH3Découverte = Carte.mapH3Découverte;
           mapH4Découverte = Carte.mapH4Découverte;
           mapH5Découverte = Carte.mapH5Découverte;
           mapH6Découverte = Carte.mapH6Découverte;

           mapI1Découverte = Carte.mapI1Découverte;
           mapI2Découverte = Carte.mapI2Découverte;
           mapI3Découverte = Carte.mapI3Découverte;
           mapI4Découverte = Carte.mapI4Découverte;
           mapI5Découverte = Carte.mapI5Découverte;
           mapI6Découverte = Carte.mapI6Découverte;
      }

	public float getCoordX() {
		return coordX;
	}

	public void setCoordX(int coordX) {
		this.coordX = coordX;
	}

	public float getCoordY() {
		return coordY;
	}

	public void setCoordY(int coordY) {
		this.coordY = coordY;
	}

	public String getDirection() {
		return direction;
	}

	public void setDirection(String direction) {
		this.direction = direction;
	}

	public String getPosiSousMap() {
		return posiSousMap;
	}

	public void setPosiSousMap(String posiSousMap) {
		this.posiSousMap = posiSousMap;
	}
	 
	
	  
}
