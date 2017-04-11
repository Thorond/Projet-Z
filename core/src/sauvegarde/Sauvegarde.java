package sauvegarde;

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
	 
	  public Sauvegarde(float x, float y, String direction, String posiSousMap, String zone){
	    this.coordX = x;
	    this.coordY = y;
	    this.direction = direction;
	    this.posiSousMap = posiSousMap;
		this.zone = zone;
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
