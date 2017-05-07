package sauvegarde;

import characters.Dompteuse;
import characters.Ghost;
import characters.MainCharacter;
import characters.Marchand;
import characters.SnowMan;
import characters.Tigre;
import decors.DonjonGlace;
import decors.Totem;
import items.Arc;
import items.Bombe;
import items.Bouclier;
import items.CoeurDeVie;
import items.Epee;
import items.Flèches;
import items.GantDeForce;
import items.Plume;
import items.Potion;
import items.Torche;
import map.zoneDesert.GestionDesMapsZoneDesert;
import map.zoneDesert.PlacementMainZoneDesert;
import map.zoneGlace.SousMapB3;
import map.zoneGlace.GestionDesMapsZoneGlace;
import map.zoneGlace.GrotteF5Salle3;
import map.zoneGlace.PlacementMainZoneGlace;
import map.zoneGlace.SousMapE1;
import map.zoneGlace.SousMapF4;
import map.zoneGlace.SousMapI1;
import menus.Carte;
import scenes.MainMenu;

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
	public int HealthMax;
	public int Health;

//  *********   items ***********
	public boolean isEpéePrise;
	public boolean isArcPris;
	public boolean isBombeRécupéré;
    public int nombreBombe;
	public boolean isBouclierPris;
	public int nombreFlèche;
	public boolean isGantDeForcePris ;
	public boolean isPlumePrise;
    public boolean isPotionRécupérer;
    public boolean isTorchePrise;

//    ********réceptacle et cofres ***********
    public int nbrDeReceptacle;
    public boolean isReceptaclePrisB3 ;
    public boolean isReceptaclePrisF4 ;
    public boolean isReceptaclePrisI1 ;
    public boolean isReceptaclePrisE1 ;
    public boolean isReceptaclePrisGrotteF5Salle3 ;

    //
//     *********PNJ*******
//	 totem
	public  boolean jeuRésoluTotem;
//	iceman
	public int étatTexteBonhomme;
//	ghost
	public int etatScenarioGhost;
//    dompteuse
    public int etatScenarioDompteuse ;
//    tigre
    public boolean tigreRamené ;
//    Marchand
    public int etatScenarioMarchand;

//    ***************Donjon*************
    public  boolean isCléBossRécupérée;
    public boolean ouverturePorteBoss;
    public int ouvertureGrille ;
    public boolean transitionGate;
    public boolean isCléBasseTrouvé;
    public boolean isCléHauteTrouvé;
    public boolean isCléMilieuTrouvé ;
    public boolean carteTrouvé;


//         *********élément des cartes**********

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
	 
	  public Sauvegarde(MainCharacter Link, String posiSousMap, String zone){
	    this.coordX = Link.getBody().getPosition().x;
	    this.coordY = Link.getBody().getPosition().y;
	    this.direction = Link.getDirection();
	    this.posiSousMap = posiSousMap;
		this.zone = zone;
		  //

          this.HealthMax = Link.getHealthMax();
          this.Health = Link.getHealth();
          this.isEpéePrise = Epee.isEpéePrise ;
          this.isArcPris = Arc.isArcPris ;
          this.isBombeRécupéré = Bombe.isBombeRécupéré ;
          this.nombreBombe = MainMenu.bombe.getNombreItem();
          this.isBouclierPris = Bouclier.isBouclierPris;
          this.nombreFlèche = Flèches.nombreFlèche;
          this.isGantDeForcePris = GantDeForce.isGantDeForcePris ;
          this.isPlumePrise = Plume.isPlumePrise ;
          this.isPotionRécupérer = Potion.isPotionRécupérer ;
          this.isTorchePrise = Torche.isTorchePrise;


        //    ********réceptacle et cofres ***********
          nbrDeReceptacle = CoeurDeVie.nbrDeReceptacle;
          isReceptaclePrisB3 = SousMapB3.isReceptaclePris;
          isReceptaclePrisF4 = SousMapF4.isReceptaclePris;
          isReceptaclePrisI1 = SousMapI1.isReceptaclePris;
          isReceptaclePrisE1 = SousMapE1.isReceptaclePris;
          isReceptaclePrisGrotteF5Salle3 = GrotteF5Salle3.isReceptaclePris;

          //        pnj
          //    totem
          jeuRésoluTotem = Totem.jeuRésolu;
          //	iceman
          étatTexteBonhomme = SnowMan.étatTexte ;
          //	ghost
          etatScenarioGhost = Ghost.etatScenario ;
          //    tigre
          tigreRamené = Tigre.tigreRamené;
          // dompteuse
          this.etatScenarioDompteuse = Dompteuse.etatScenario ;
          // marchand
          this.etatScenarioMarchand = Marchand.etatScenario;

          //    ***************Donjon*************
          isCléBossRécupérée = DonjonGlace.isCléBossRécupérée;
          ouverturePorteBoss = DonjonGlace.ouverturePorteBoss;
          ouvertureGrille = DonjonGlace.ouvertureGrille;
          transitionGate = DonjonGlace.transitionGate ;
          isCléBasseTrouvé = DonjonGlace.isCléBasseTrouvé;
          isCléHauteTrouvé = DonjonGlace.isCléHauteTrouvé;
          isCléMilieuTrouvé = DonjonGlace.isCléMilieuTrouvé;
          carteTrouvé = DonjonGlace.carteTrouvé;

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


    public void chargerSauvegarde(){

//		lorsqu'une sauvegarde existe, on l'appelle et on récupère les données

        MainMenu.Link.setDirection(this.getDirection());
        MainMenu.Link.getBody().setTransform(this.getCoordX(), this.getCoordY(), 0);
        MainMenu.Link.zone = this.zone;
        if ( MainMenu.Link.zone.equals("zoneGlace"))	{
            PlacementMainZoneGlace.positionSousMap = this.getPosiSousMap();
            PlacementMainZoneGlace.positionRelativeX = getCoordX();
            PlacementMainZoneGlace.positionRelativeY = getCoordY();
        }
        else if ( MainMenu.Link.zone.equals("zoneDesert"))	PlacementMainZoneDesert.positionSousMap = this.getPosiSousMap();
        MainMenu.Link.setHealthMax(this.HealthMax  ) ;
        MainMenu.Link.setHealth(this.Health);
        Epee.isEpéePrise  = this.isEpéePrise ;
        Arc.isArcPris = this.isArcPris  ;
        Bombe.isBombeRécupéré  = this.isBombeRécupéré ;
        Bouclier.isBouclierPris = this.isBouclierPris ;
        Flèches.nombreFlèche = this.nombreFlèche ;
        GantDeForce.isGantDeForcePris = this.isGantDeForcePris ;
        Plume.isPlumePrise = this.isPlumePrise ;
        Potion.isPotionRécupérer = this.isPotionRécupérer;
        Torche.isTorchePrise = this.isTorchePrise ;

        //    ********réceptacle et cofres ***********
        CoeurDeVie.nbrDeReceptacle = nbrDeReceptacle ;
        SousMapB3.isReceptaclePris = isReceptaclePrisB3 ;
        SousMapF4.isReceptaclePris = isReceptaclePrisF4 ;
        SousMapI1.isReceptaclePris = isReceptaclePrisI1 ;
        SousMapE1.isReceptaclePris = isReceptaclePrisE1 ;
        GrotteF5Salle3.isReceptaclePris = isReceptaclePrisGrotteF5Salle3 ;

//        pnj
        //    totem
        Totem.jeuRésolu = this.jeuRésoluTotem ;
        //	iceman
        SnowMan.étatTexte = this.étatTexteBonhomme  ;
        //	ghost
        Ghost.etatScenario = this.etatScenarioGhost ;
        //    tigre
        Tigre.tigreRamené = this.tigreRamené ;
        //    dompteuse
        Dompteuse.etatScenario = this.etatScenarioDompteuse;
        //    marchand
        Marchand.etatScenario = this.etatScenarioMarchand ;

        //    ***************Donjon*************
        DonjonGlace.isCléBossRécupérée = isCléBossRécupérée ;
        DonjonGlace.ouverturePorteBoss = ouverturePorteBoss ;
        DonjonGlace.ouvertureGrille = ouvertureGrille;
        DonjonGlace.transitionGate  = transitionGate ;
        DonjonGlace.isCléBasseTrouvé = isCléBasseTrouvé;
        DonjonGlace.isCléHauteTrouvé = isCléHauteTrouvé;
        DonjonGlace.isCléMilieuTrouvé = isCléMilieuTrouvé ;
        DonjonGlace.carteTrouvé = carteTrouvé;


//         carte
        Carte.récupérationInfoCarte(this);
    }

    public static void créerSauvegarde(){

//		nouvelle sauvegarde
        GestionDesMapsZoneGlace.destructionDesCorps();
        PlacementMainZoneGlace.réinitialisation();
        // détruire les types ( décors )

        MainMenu.Link.setDirection("bas");
        MainMenu.Link.getBody().setTransform(100, 100, 0);
        PlacementMainZoneGlace.positionSousMap = "B2";
        MainMenu.Link.zone = "zoneGlace";
        PlacementMainZoneGlace.positionRelativeX = 100;
        PlacementMainZoneGlace.positionRelativeY = 100;

        MainMenu.Link.setHealthMax( 12 ) ;
        MainMenu.Link.setHealth( 12 );
        MainMenu.Link.setStrength(4);

        // items
        Epee.isEpéePrise  = false ;
        Arc.isArcPris = false  ;
        Bombe.isBombeRécupéré  = false;
        Bouclier.isBouclierPris = false ;
        Flèches.nombreFlèche = 0 ;
        GantDeForce.isGantDeForcePris = false ;
        Plume.isPlumePrise = false ;
        Potion.isPotionRécupérer = false;
        Torche.isTorchePrise = false ;


        //    ********réceptacle et cofres ***********
        CoeurDeVie.nbrDeReceptacle = 0 ;
        SousMapB3.isReceptaclePris = false ;
        SousMapF4.isReceptaclePris = false ;
        SousMapI1.isReceptaclePris = false ;
        SousMapE1.isReceptaclePris = false ;
        GrotteF5Salle3.isReceptaclePris = false ;

//        pnj
        //    totem
        Totem.jeuRésolu = false ;
        //	iceman
        SnowMan.étatTexte = 0  ;
        //	ghost
        Ghost.etatScenario = 0 ;
        //    tigre
        Tigre.tigreRamené = false;
//        dompteuse
        Dompteuse.etatScenario = 0;
        //    marchand
        Marchand.etatScenario = 0;


        //    ***************Donjon*************
        DonjonGlace.isCléBossRécupérée = false ;
        DonjonGlace.ouverturePorteBoss = false ;
        DonjonGlace.ouvertureGrille = -1 ;
        DonjonGlace.transitionGate  = false ;
        DonjonGlace.isCléBasseTrouvé = false;
        DonjonGlace.isCléHauteTrouvé = false;
        DonjonGlace.isCléMilieuTrouvé = false ;
        DonjonGlace.carteTrouvé = false;

//        *******


        MainMenu.sauvegarde = new Sauvegarde(MainMenu.Link , PlacementMainZoneGlace.positionSousMap, "zoneGlace");
        SendClass.sendClass(MainMenu.sauvegarde);
        MainMenu.sauvegarde.chargerSauvegarde();

    }
	  
}
