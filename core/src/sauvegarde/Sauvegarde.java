package sauvegarde;

import characters.Dompteuse;
import characters.Ghost;
import characters.MainCharacter;
import characters.Marchand;
import characters.SnowMan;
import characters.Tigre;
import decors.ClimatMontagneux;
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
import map.zoneGlace.DonjonSalle2;
import map.zoneGlace.GrotteF5Salle1;
import map.zoneGlace.GrotteF5Salle2;
import map.zoneGlace.GrotteF5Salle4;
import map.zoneGlace.GrotteF5Salle5;
import map.zoneGlace.GrotteI1Salle1;
import map.zoneGlace.GrotteI1Salle3;
import map.zoneGlace.SousMapA2;
import map.zoneGlace.SousMapB3;
import map.zoneGlace.GestionDesMapsZoneGlace;
import map.zoneGlace.GrotteF5Salle3;
import map.zoneGlace.PlacementMainZoneGlace;
import map.zoneGlace.SousMapD2;
import map.zoneGlace.SousMapD5;
import map.zoneGlace.SousMapE1;
import map.zoneGlace.SousMapF2;
import map.zoneGlace.SousMapF4;
import map.zoneGlace.SousMapG5;
import map.zoneGlace.SousMapH2;
import map.zoneGlace.SousMapI1;
import menus.Carte;
import scenes.MainMenu;
import sun.applet.Main;

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
    public boolean isReceptaclePrisGrotteI1Salle1 ;
    public boolean isReceptaclePrisA2 ;
    public boolean isReceptaclePrisB3 ;
    public boolean isReceptaclePrisF4 ;
    public boolean isReceptaclePrisI1 ;
    public boolean isReceptaclePrisE1 ;
    public boolean isReceptaclePrisGrotteF5Salle3 ;

    public boolean ouvertureCoffreF2 ;
    public boolean coffreOuvertF2 ;
    public boolean ouvertureCoffreH2 ;
    public boolean coffreOuvertH2 ;
    public boolean ouvertureCoffreG5 ;
    public boolean coffreOuvertG5 ;
    public boolean ouvertureCoffreD5 ;
    public boolean coffreOuvertD5 ;
    public boolean ouvertureCoffreD2 ;
    public boolean coffreOuvertD2 ;
    public boolean ouvertureCoffreDonjonSalle2 ;
    public boolean coffreOuvertDonjonSalle2 ;
    //
//     *********PNJ*******
//	 totem
	public  boolean jeuRésoluTotem;
//	iceman
	public int étatTexteBonhomme;
    public boolean isCarottesPrise;
    public boolean noseFound;
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

    public int nbrTuéSlim ;
    public int nbrTuéPetitSlim ;
    public int yCléDonjon ;


//         *********élément des cartes**********

//    B3
    public boolean pontCasse;
    public int annimation ;
//    grotteF5
    public boolean porteGaucheGrotteF5Salle1;
    public boolean porteHautGrotteF5Salle2;
    public boolean porteBasGrotteF5Salle2;
    public boolean porteGaucheGrotteF5Salle4 ;
    public boolean porteDroiteGrotteF5Salle4 ;
    public boolean premièreApparition ;
    public int nbrTué ;
    public int yClé ;
    public boolean glacierCassé;

//	grotte I1
    public boolean ropeCut ;
    public int yCléI1 ;
	public boolean estPassé;

	
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
          isReceptaclePrisGrotteI1Salle1 = GrotteI1Salle1.isReceptaclePris ;
          isReceptaclePrisA2 = SousMapA2.isReceptaclePris ;
          isReceptaclePrisB3 = SousMapB3.isReceptaclePris;
          isReceptaclePrisF4 = SousMapF4.isReceptaclePris;
          isReceptaclePrisI1 = SousMapI1.isReceptaclePris;
          isReceptaclePrisE1 = SousMapE1.isReceptaclePris;
          isReceptaclePrisGrotteF5Salle3 = GrotteF5Salle3.isReceptaclePris;

          ouvertureCoffreF2 = SousMapF2.ouvertureCoffre ;
          coffreOuvertF2 = SousMapF2.coffreOuvert ;
          ouvertureCoffreH2 = SousMapH2.ouvertureCoffre ;
          coffreOuvertH2 = SousMapH2.coffreOuvert ;
          ouvertureCoffreG5 = SousMapG5.ouvertureCoffre ;
          coffreOuvertG5 = SousMapG5.coffreOuvert ;
          ouvertureCoffreD5 = SousMapD5.ouvertureCoffre ;
          coffreOuvertD5 = SousMapD5.coffreOuvert ;
          ouvertureCoffreD2 = SousMapD2.ouvertureCoffre;
          coffreOuvertD2 = SousMapD2.coffreOuvert ;
          ouvertureCoffreDonjonSalle2 = DonjonSalle2.ouvertureCoffre ;
          coffreOuvertDonjonSalle2 = DonjonSalle2.coffreOuvert ;

          //        pnj
          //    totem
          jeuRésoluTotem = Totem.jeuRésolu;
          //	iceman
          étatTexteBonhomme = SnowMan.étatTexte ;
          this.isCarottesPrise = ClimatMontagneux.isCarottesPrise ;
          this.noseFound = ClimatMontagneux.noseFound;
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

          nbrTuéSlim = DonjonSalle2.nbrTuéSlim ;
          nbrTuéPetitSlim = DonjonSalle2.nbrTuéPetitSlim ;
          yCléDonjon = DonjonSalle2.yClé ;

          // B3
          this.pontCasse = SousMapB3.pontCasse ;
          this.annimation = SousMapB3.annimation;

          //    grotteF5
          porteGaucheGrotteF5Salle1 = GrotteF5Salle1.porteGauche;
          porteHautGrotteF5Salle2 = GrotteF5Salle2.porteHaut;
          porteBasGrotteF5Salle2 = GrotteF5Salle2.porteBas;
          porteGaucheGrotteF5Salle4 = GrotteF5Salle4.porteGauche;
          porteDroiteGrotteF5Salle4 = GrotteF5Salle4.porteDroite;
          premièreApparition = GrotteF5Salle4.premièreApparition;
          nbrTué = GrotteF5Salle4.nbrTué;
          yClé = GrotteF5Salle4.yClé;
          glacierCassé = GrotteF5Salle5.glacierCassé;

          //	grotte I1
          ropeCut = GrotteI1Salle1.ropeCut ;
          yCléI1 = GrotteI1Salle1.yClé ;
          estPassé = GrotteI1Salle3.estPassé;

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
        GrotteI1Salle1.isReceptaclePris = isReceptaclePrisGrotteI1Salle1 ;
        SousMapA2.isReceptaclePris = isReceptaclePrisA2;
        CoeurDeVie.nbrDeReceptacle = nbrDeReceptacle ;
        SousMapB3.isReceptaclePris = isReceptaclePrisB3 ;
        SousMapF4.isReceptaclePris = isReceptaclePrisF4 ;
        SousMapI1.isReceptaclePris = isReceptaclePrisI1 ;
        SousMapE1.isReceptaclePris = isReceptaclePrisE1 ;
        GrotteF5Salle3.isReceptaclePris = isReceptaclePrisGrotteF5Salle3 ;

        SousMapF2.ouvertureCoffre  = ouvertureCoffreF2 ;
        SousMapF2.coffreOuvert  = coffreOuvertF2 ;
        SousMapH2.ouvertureCoffre  = ouvertureCoffreH2;
        SousMapH2.coffreOuvert  = coffreOuvertH2;
        SousMapG5.ouvertureCoffre  = ouvertureCoffreG5 ;
        SousMapG5.coffreOuvert = coffreOuvertG5;
        SousMapD5.ouvertureCoffre  = ouvertureCoffreD5;
        SousMapD5.coffreOuvert = coffreOuvertD5 ;
        SousMapD2.ouvertureCoffre = ouvertureCoffreD2 ;
        SousMapD2.coffreOuvert  = coffreOuvertD2;
        DonjonSalle2.ouvertureCoffre = ouvertureCoffreDonjonSalle2 ;
        DonjonSalle2.coffreOuvert = coffreOuvertDonjonSalle2 ;

//        pnj
        //    totem
        Totem.jeuRésolu = this.jeuRésoluTotem ;
        //	iceman
        SnowMan.étatTexte = this.étatTexteBonhomme  ;
        ClimatMontagneux.isCarottesPrise = this.isCarottesPrise  ;
        ClimatMontagneux.noseFound = this.noseFound ;
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

        DonjonSalle2.nbrTuéSlim  = nbrTuéSlim ;
        DonjonSalle2.nbrTuéPetitSlim  = nbrTuéPetitSlim ;
        DonjonSalle2.yClé = yCléDonjon ;

        // B3
        SousMapB3.pontCasse  = this.pontCasse;
        SousMapB3.annimation = this.annimation ;

        //    grotteF5
        GrotteF5Salle1.porteGauche = porteGaucheGrotteF5Salle1 ;
        GrotteF5Salle2.porteHaut =  porteHautGrotteF5Salle2 ;
        GrotteF5Salle2.porteBas = porteBasGrotteF5Salle2 ;
        GrotteF5Salle4.porteGauche = porteGaucheGrotteF5Salle4 ;
        GrotteF5Salle4.porteDroite = porteDroiteGrotteF5Salle4 ;
        GrotteF5Salle4.premièreApparition = premièreApparition ;
        GrotteF5Salle4.nbrTué = nbrTué ;
        GrotteF5Salle4.yClé = yClé ;
        GrotteF5Salle5.glacierCassé = glacierCassé ;


        //	grotte I1
        GrotteI1Salle1.ropeCut  = ropeCut ;
        GrotteI1Salle1.yClé  = yCléI1 ;
        GrotteI1Salle3.estPassé = estPassé ;

//         carte
        Carte.récupérationInfoCarte(this);
    }

    public static void créerSauvegarde(){

//		nouvelle sauvegarde
        GestionDesMapsZoneGlace.destructionDesCorps();
        PlacementMainZoneGlace.réinitialisation();
        // détruire les types ( décors )

//        histoire
        MainCharacter.etatScenario = 0 ;

        MainMenu.Link.setDirection("gauche");
        MainMenu.Link.getBody().setTransform(250 / MainMenu.PPM , 290 / MainMenu.PPM, 0);
        PlacementMainZoneGlace.positionSousMap = "A2";
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
        GrotteI1Salle1.isReceptaclePris = false ;
        SousMapA2.isReceptaclePris = false;
        SousMapB3.isReceptaclePris = false ;
        SousMapF4.isReceptaclePris = false ;
        SousMapI1.isReceptaclePris = false ;
        SousMapE1.isReceptaclePris = false ;
        GrotteF5Salle3.isReceptaclePris = false ;

        SousMapF2.ouvertureCoffre  = false ;
        SousMapF2.coffreOuvert  = false ;
        SousMapH2.ouvertureCoffre  = false;
        SousMapH2.coffreOuvert  = false;
        SousMapG5.ouvertureCoffre  = false ;
        SousMapG5.coffreOuvert = false;
        SousMapD5.ouvertureCoffre  = false;
        SousMapD5.coffreOuvert = false ;
        SousMapD2.ouvertureCoffre = false ;
        SousMapD2.coffreOuvert  = false;
        DonjonSalle2.ouvertureCoffre = false ;
        DonjonSalle2.coffreOuvert = false ;

//        pnj
        //    totem
        Totem.jeuRésolu = false ;
        //	iceman
        SnowMan.étatTexte = 0  ;
        ClimatMontagneux.isCarottesPrise = false  ;
        ClimatMontagneux.noseFound = false ;
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

        DonjonSalle2.nbrTuéSlim  = 0;
        DonjonSalle2.nbrTuéPetitSlim  = 0;
        DonjonSalle2.yClé = 480 ;


        // B3
        SousMapB3.pontCasse  = false ;
        SousMapB3.annimation = 0 ;

        //    grotteF5
        GrotteF5Salle1.porteGauche = false;
        GrotteF5Salle2.porteHaut =  false ;
        GrotteF5Salle2.porteBas = false ;
        GrotteF5Salle4.porteGauche = false ;
        GrotteF5Salle4.porteDroite = false ;
        GrotteF5Salle4.premièreApparition = true ;
        GrotteF5Salle4.nbrTué = 0 ;
        GrotteF5Salle4.yClé = 480 ;
        GrotteF5Salle5.glacierCassé = false ;


        //	grotte I1
        GrotteI1Salle1.ropeCut  = false ;
        GrotteI1Salle1.yClé  = 300 ;
        GrotteI1Salle3.estPassé = false;

//        *******


        MainMenu.sauvegarde = new Sauvegarde(MainMenu.Link , PlacementMainZoneGlace.positionSousMap, "zoneGlace");
        SendClass.sendClass(MainMenu.sauvegarde);
        MainMenu.sauvegarde.chargerSauvegarde();

    }
	  
}
