package map.zoneDesert;

import characters.MainCharacter;
import decors.Totem;
import items.Bombe;
import items.CoeurDeVie;
import items.Essence;
import items.Flèches;
import map.CadrillageMap;
import map.zoneGlace.PlacementMainZoneGlace;
import scenes.MainMenu;

public class PlacementMainZoneDesert {
	
	
//	Repérage sur quelle sous map est Link
	
	
	public static String positionSousMap ; // à sauvegarder
	public static boolean défilement = false;
	public static long start;
	public static int x; 
	public static int y;
	public static String direction;
	public static float positionRelativeX = MainMenu.Link.getBody().getPosition().x;
	public static float positionRelativeY = MainMenu.Link.getBody().getPosition().y;

	public static boolean changementDeZone = false;
	
	public static void réinitialisation(){
		CadrillageMap.setTypeDeDécor();
		CadrillageMap.setDécoChangéFaux();
		Flèches.réinitialisation();
		CoeurDeVie.réinitialisation();
		Essence.réinitialisation();
		Bombe.réinitialisation();
	}
	
	
	public static void posiSousMap(MainCharacter perso){
		if (perso.getBody().getPosition().x > 0 && perso.getBody().getPosition().y < 0  ){
			if ( positionSousMap.equals("A1")  ){
				SousMapA1.destroyBody();
				positionSousMap = "A2";
			}  else if ( positionSousMap.equals("B1")  ){
				positionSousMap = "B2";
				SousMapB1.destroyBody();
			}  else if ( positionSousMap.equals("C1")  ){
				positionSousMap = "C2";
				SousMapC1.destroyBody();
			}  else if ( positionSousMap.equals("D1")  ){
				positionSousMap = "D2";
				SousMapD1.destroyBody();
			}  else if ( positionSousMap.equals("E1")  ){
				positionSousMap = "E2";
				SousMapE1.destroyBody();
			}  else if ( positionSousMap.equals("F1")  ){
				positionSousMap = "F2";
				SousMapF1.destroyBody();
			}  else if ( positionSousMap.equals("G1")  ){
				positionSousMap = "G2";
				Totem.étatTexte = 0;
				SousMapG1.destroyBody();
			}  else if ( positionSousMap.equals("H1")  ){
				positionSousMap = "H2";
				SousMapH1.destroyBody();
			}  else if ( positionSousMap.equals("I1")  ){
				positionSousMap = "I2";
				SousMapI1.destroyBody();
			} else if ( positionSousMap.equals("A2") ){
				SousMapA2.destroyBody();
				positionSousMap = "A3";
			} else if ( positionSousMap.equals("B2")  ){
				SousMapB2.destroyBody();
				positionSousMap = "B3";
			} else if ( positionSousMap.equals("C2")  ){
				SousMapC2.destroyBody();
				positionSousMap = "C3";
			} else if ( positionSousMap.equals("D2")  ){
				SousMapD2.destroyBody();
				positionSousMap = "D3";
			} else if ( positionSousMap.equals("E2")  ){
				SousMapE2.destroyBody();
				positionSousMap = "E3";
			} else if ( positionSousMap.equals("F2")  ){
				SousMapF2.destroyBody();
				positionSousMap = "F3";
			} else if ( positionSousMap.equals("G2")  ){
				SousMapG2.destroyBody();
				positionSousMap = "G3";
			} else if ( positionSousMap.equals("H2")  ){
				SousMapH2.destroyBody();
				positionSousMap = "H3";
			} else if ( positionSousMap.equals("I2")  ){
				SousMapI2.destroyBody();
				positionSousMap = "I3";
			} else if ( positionSousMap.equals("A3") ){
				SousMapA3.destroyBody();
				positionSousMap = "A4";
			} else if ( positionSousMap.equals("B3")  ){
				SousMapB3.destroyBody();
				positionSousMap = "B4";
			} else if ( positionSousMap.equals("C3")  ){
				SousMapC3.destroyBody();
				positionSousMap = "C4";
			} else if ( positionSousMap.equals("D3")  ){
				SousMapD3.destroyBody();
				positionSousMap = "D4";
			} else if ( positionSousMap.equals("E3")  ){
				SousMapE3.destroyBody();
				positionSousMap = "E4";
			} else if ( positionSousMap.equals("F3")  ){
				SousMapF3.destroyBody();
				positionSousMap = "F4";
			} else if ( positionSousMap.equals("G3")  ){
				SousMapG3.destroyBody();
				positionSousMap = "G4";
			} else if ( positionSousMap.equals("H3")  ){
				SousMapH3.destroyBody();
				positionSousMap = "H4";
			} else if ( positionSousMap.equals("I3")  ){
				SousMapI3.destroyBody();
				positionSousMap = "I4";
			} else if ( positionSousMap.equals("A4") ){
				SousMapA4.destroyBody();
				positionSousMap = "A5";
			} else if ( positionSousMap.equals("B4")  ){
				SousMapB4.destroyBody();
				positionSousMap = "B5";
			} else if ( positionSousMap.equals("C4")  ){
				SousMapC4.destroyBody();
				positionSousMap = "C5";
			} else if ( positionSousMap.equals("D4")  ){
				SousMapD4.destroyBody();
				positionSousMap = "D5";
			} else if ( positionSousMap.equals("E4")  ){
				SousMapE4.destroyBody();
				positionSousMap = "E5";
			} else if ( positionSousMap.equals("F4")  ){
				SousMapF4.destroyBody();
				positionSousMap = "F5";
			} else if ( positionSousMap.equals("G4")  ){
				SousMapG4.destroyBody();
				positionSousMap = "G5";
			} else if ( positionSousMap.equals("H4")  ){
				SousMapH4.destroyBody();
				positionSousMap = "H5";
			} else if ( positionSousMap.equals("I4")  ){
				SousMapI4.destroyBody();
				positionSousMap = "I5";
			} else if ( positionSousMap.equals("A5") ){
				SousMapA5.destroyBody();
				positionSousMap = "A6";
			} else if ( positionSousMap.equals("B5")  ){
				SousMapB5.destroyBody();
				positionSousMap = "B6";
			} else if ( positionSousMap.equals("C5")  ){
				SousMapC5.destroyBody();
				positionSousMap = "C6";
			} else if ( positionSousMap.equals("D5")  ){
				SousMapD5.destroyBody();
				positionSousMap = "D6";
			} else if ( positionSousMap.equals("E5")  ){
				SousMapE5.destroyBody();
				positionSousMap = "E6";
			} else if ( positionSousMap.equals("F5")  ){
				SousMapF5.destroyBody();
				positionSousMap = "F6";
			} else if ( positionSousMap.equals("G5")  ){
				SousMapG5.destroyBody();
				positionSousMap = "G6";
			} else if ( positionSousMap.equals("H5")  ){
				SousMapH5.destroyBody();
				positionSousMap = "H6";
			} else if ( positionSousMap.equals("I5")  ){
				SousMapI5.destroyBody();
				positionSousMap = "I6";
			} else if ( positionSousMap.equals("A6") ){
				SousMapA6.destroyBody();
				positionSousMap = "A7";
			} else if ( positionSousMap.equals("B6")  ){
				SousMapB6.destroyBody();
				positionSousMap = "B7";
			} else if ( positionSousMap.equals("C6")  ){
				SousMapC6.destroyBody();
				positionSousMap = "C7";
			} else if ( positionSousMap.equals("D6")  ){
				SousMapD6.destroyBody();
				positionSousMap = "D7";
			} else if ( positionSousMap.equals("E6")  ){
				SousMapE6.destroyBody();
				positionSousMap = "E7";
			} else if ( positionSousMap.equals("F6")  ){
				SousMapF6.destroyBody();
				positionSousMap = "F7";
			} else if ( positionSousMap.equals("G6")  ){
				SousMapG6.destroyBody();
				positionSousMap = "G7";
			} else if ( positionSousMap.equals("H6")  ){
				SousMapH6.destroyBody();
				positionSousMap = "H7";
			} else if ( positionSousMap.equals("I6")  ){
				SousMapI6.destroyBody();
				positionSousMap = "I7";
			}

			défilement = true;
			start = System.currentTimeMillis();
			y = 60;
			x=0;
			direction = "bas";

			réinitialisation();

		} else if (perso.getBody().getPosition().x > 0 && perso.getBody().getPosition().y > 460/MainMenu.PPM ){
			if ( positionSousMap.equals("A1")  ){
			} else if ( positionSousMap.equals("B1" ) ){
			} else if ( positionSousMap.equals("C1" ) ){
			} else if ( positionSousMap.equals("D1" ) ){
			} else if ( positionSousMap.equals("E1" ) ){
			} else if ( positionSousMap.equals("F1" ) ){
			} else if ( positionSousMap.equals("G1" ) ){
			} else if ( positionSousMap.equals("H1" ) ){
			} else if ( positionSousMap.equals("I1" ) ){
			} else if ( positionSousMap.equals("A2") ){
				SousMapA2.destroyBody();
				positionSousMap = "A1";
			} else if ( positionSousMap.equals("B2") ){
				SousMapB2.destroyBody();
				positionSousMap = "B1";
			} else if ( positionSousMap.equals("C2") ){
				SousMapC2.destroyBody();
				positionSousMap = "C1";
			} else if ( positionSousMap.equals("D2") ){
				SousMapD2.destroyBody();
				positionSousMap = "D1";
			} else if ( positionSousMap.equals("E2") ){
				SousMapE2.destroyBody();
				positionSousMap = "E1";
			} else if ( positionSousMap.equals("F2") ){
				SousMapF2.destroyBody();
				positionSousMap = "F1";
			} else if ( positionSousMap.equals("G2") ){
				SousMapG2.destroyBody();
				positionSousMap = "G1";
			} else if ( positionSousMap.equals("H2") ){
				SousMapH2.destroyBody();
				positionSousMap = "H1";
			} else if ( positionSousMap.equals("I2") ){
				SousMapI2.destroyBody();
				positionSousMap = "I1";
			} else if ( positionSousMap.equals("A3") ){
				SousMapA3.destroyBody();
				positionSousMap = "A2";
			} else if ( positionSousMap.equals("B3") ){
				SousMapB3.destroyBody();
				positionSousMap = "B2";
			} else if ( positionSousMap.equals("C3") ){
				SousMapC3.destroyBody();
				positionSousMap = "C2";
			}  else if ( positionSousMap.equals("D3") ){
				SousMapD3.destroyBody();
				positionSousMap = "D2";
			}  else if ( positionSousMap.equals("E3") ){
				SousMapE3.destroyBody();
				positionSousMap = "E2";
			}  else if ( positionSousMap.equals("F3") ){
				SousMapF3.destroyBody();
				positionSousMap = "F2";
			}  else if ( positionSousMap.equals("G3") ){
				SousMapG3.destroyBody();
				positionSousMap = "G2";
			}  else if ( positionSousMap.equals("H3") ){
				SousMapH3.destroyBody();
				positionSousMap = "H2";
			}  else if ( positionSousMap.equals("I3") ){
				SousMapI3.destroyBody();
				positionSousMap = "I2";
			} else if ( positionSousMap.equals("A4") ){
				SousMapA4.destroyBody();
				positionSousMap = "A3";
			} else if ( positionSousMap.equals("B4") ){
				SousMapB4.destroyBody();
				positionSousMap = "B3";
			} else if ( positionSousMap.equals("C4") ){
				SousMapC4.destroyBody();
				positionSousMap = "C3";
			} else if ( positionSousMap.equals("D4") ){
				SousMapD4.destroyBody();
				positionSousMap = "D3";
			} else if ( positionSousMap.equals("E4") ){
				SousMapE4.destroyBody();
				positionSousMap = "E3";
			} else if ( positionSousMap.equals("F4") ){
				SousMapF4.destroyBody();
				positionSousMap = "F3";
			} else if ( positionSousMap.equals("G4") ){
				SousMapG4.destroyBody();
				positionSousMap = "G3";
			} else if ( positionSousMap.equals("H4") ){
				SousMapH4.destroyBody();
				positionSousMap = "H3";
			} else if ( positionSousMap.equals("I4") ){
				SousMapI4.destroyBody();
				positionSousMap = "I3";
			} else if ( positionSousMap.equals("A5") ){
				SousMapA5.destroyBody();
				positionSousMap = "A4";
			} else if ( positionSousMap.equals("B5") ){
				SousMapB5.destroyBody();
				positionSousMap = "B4";
			} else if ( positionSousMap.equals("C5") ){
				SousMapC5.destroyBody();
				positionSousMap = "C4";
			} else if ( positionSousMap.equals("D5") ){
				SousMapD5.destroyBody();
				positionSousMap = "D4";
			} else if ( positionSousMap.equals("E5") ){
				SousMapE5.destroyBody();
				positionSousMap = "E4";
			} else if ( positionSousMap.equals("F5") ){
				SousMapF5.destroyBody();
				positionSousMap = "F4";
			} else if ( positionSousMap.equals("G5") ){
				SousMapG5.destroyBody();
				positionSousMap = "G4";
			} else if ( positionSousMap.equals("H5") ){
				SousMapH5.destroyBody();
				positionSousMap = "H4";
			} else if ( positionSousMap.equals("I5") ){
				SousMapI5.destroyBody();
				positionSousMap = "I4";
			} else if ( positionSousMap.equals("A6") ){
				SousMapA6.destroyBody();
				positionSousMap = "A5";
			} else if ( positionSousMap.equals("B6") ){
				SousMapB6.destroyBody();
				positionSousMap = "B5";
			} else if ( positionSousMap.equals("C6") ){
				SousMapC6.destroyBody();
				positionSousMap = "C5";
			} else if ( positionSousMap.equals("D6") ){
				SousMapD6.destroyBody();
				positionSousMap = "D5";
			} else if ( positionSousMap.equals("E6") ){
				SousMapE6.destroyBody();
				positionSousMap = "E5";
			} else if ( positionSousMap.equals("F6") ){
				SousMapF6.destroyBody();
				positionSousMap = "F5";
			} else if ( positionSousMap.equals("G6") ){
				SousMapG6.destroyBody();
				positionSousMap = "G5";
			} else if ( positionSousMap.equals("H6") ){
				SousMapH6.destroyBody();
				positionSousMap = "H5";
			} else if ( positionSousMap.equals("I6") ){
				SousMapI6.destroyBody();
				positionSousMap = "I5";
			}

			défilement = true;
			start = System.currentTimeMillis();
			y = 60;
			x=0;
			direction = "haut";

			réinitialisation();
		} else if (perso.getBody().getPosition().x < -10 && perso.getBody().getPosition().y > 0 ){
			if ( positionSousMap.equals("A1")  ){
			} else if ( positionSousMap.equals("B1")  ){
				positionSousMap = "A1";
				SousMapB1.destroyBody();
			} else if ( positionSousMap.equals("C1")  ){
				positionSousMap = "B1";
				SousMapC1.destroyBody();
			} else if ( positionSousMap.equals("D1")  ){
				positionSousMap = "C1";
				SousMapD1.destroyBody();
			} else if ( positionSousMap.equals("E1")  ){
				positionSousMap = "D1";
				SousMapE1.destroyBody();
			} else if ( positionSousMap.equals("F1")  ){
				positionSousMap = "E1";
				SousMapF1.destroyBody();
			} else if ( positionSousMap.equals("G1")  ){
				positionSousMap = "F1";
				SousMapG1.destroyBody();
			} else if ( positionSousMap.equals("H1")  ){
				positionSousMap = "G1";
				SousMapH1.destroyBody();
			} else if ( positionSousMap.equals("I1")  ){
				positionSousMap = "H1";
				SousMapI1.destroyBody();
			} else if ( positionSousMap.equals("A2") ){
			} else if ( positionSousMap.equals("B2")  ){
				SousMapB2.destroyBody();
				positionSousMap = "A2";
			} else if ( positionSousMap.equals("C2")  ){
				SousMapC2.destroyBody();
				positionSousMap = "B2";
			} else if ( positionSousMap.equals("D2")  ){
				SousMapD2.destroyBody();
				positionSousMap = "C2";
			} else if ( positionSousMap.equals("E2")  ){
				SousMapE2.destroyBody();
				positionSousMap = "D2";
			} else if ( positionSousMap.equals("F2")  ){
				SousMapF2.destroyBody();
				positionSousMap = "E2";
			} else if ( positionSousMap.equals("G2")  ){
				SousMapG2.destroyBody();
				positionSousMap = "F2";
			} else if ( positionSousMap.equals("H2")  ){
				SousMapH2.destroyBody();
				positionSousMap = "G2";
			} else if ( positionSousMap.equals("I2")  ){
				SousMapI2.destroyBody();
				positionSousMap = "H2";
			} else if ( positionSousMap.equals("A3") ){
			} else if ( positionSousMap.equals("B3")  ){
				SousMapB3.destroyBody();
				positionSousMap = "A3";
			} else if ( positionSousMap.equals("C3")  ){
				SousMapC3.destroyBody();
				positionSousMap = "B3";
			} else if ( positionSousMap.equals("D3")  ){
				SousMapD3.destroyBody();
				positionSousMap = "C3";
			} else if ( positionSousMap.equals("E3")  ){
				SousMapE3.destroyBody();
				positionSousMap = "D3";
			} else if ( positionSousMap.equals("F3")  ){
				SousMapF3.destroyBody();
				positionSousMap = "E3";
			} else if ( positionSousMap.equals("G3")  ){
				SousMapG3.destroyBody();
				positionSousMap = "F3";
			} else if ( positionSousMap.equals("H3")  ){
				SousMapH3.destroyBody();
				positionSousMap = "G3";
			} else if ( positionSousMap.equals("I3")  ){
				SousMapI3.destroyBody();
				positionSousMap = "H3";
			} else if ( positionSousMap.equals("A4") ){
			} else if ( positionSousMap.equals("B4")  ){
				SousMapB4.destroyBody();
				positionSousMap = "A4";
			} else if ( positionSousMap.equals("C4")  ){
				SousMapC4.destroyBody();
				positionSousMap = "B4";
			} else if ( positionSousMap.equals("D4")  ){
				SousMapD4.destroyBody();
				positionSousMap = "C4";
			} else if ( positionSousMap.equals("E4")  ){
				SousMapE4.destroyBody();
				positionSousMap = "D4";
			} else if ( positionSousMap.equals("F4")  ){
				SousMapF4.destroyBody();
				positionSousMap = "E4";
			} else if ( positionSousMap.equals("G4")  ){
				SousMapG4.destroyBody();
				positionSousMap = "F4";
			} else if ( positionSousMap.equals("H4")  ){
				SousMapH4.destroyBody();
				positionSousMap = "G4";
			} else if ( positionSousMap.equals("I4")  ){
				SousMapI4.destroyBody();
				positionSousMap = "H4";
			} else if ( positionSousMap.equals("A5") ){
			} else if ( positionSousMap.equals("B5")  ){
				SousMapB5.destroyBody();
				positionSousMap = "A5";
			} else if ( positionSousMap.equals("C5")  ){
				SousMapC5.destroyBody();
				positionSousMap = "B5";
			} else if ( positionSousMap.equals("D5")  ){
				SousMapD5.destroyBody();
				positionSousMap = "C5";
			} else if ( positionSousMap.equals("E5")  ){
				SousMapE5.destroyBody();
				positionSousMap = "D5";
			} else if ( positionSousMap.equals("F5")  ){
				SousMapF5.destroyBody();
				positionSousMap = "E5";
			} else if ( positionSousMap.equals("G5")  ){
				SousMapG5.destroyBody();
				positionSousMap = "F5";
			} else if ( positionSousMap.equals("H5")  ){
				SousMapH5.destroyBody();
				positionSousMap = "G5";
			} else if ( positionSousMap.equals("I5")  ){
				SousMapI5.destroyBody();
				positionSousMap = "H5";
			} else if ( positionSousMap.equals("B6")  ){
				SousMapB6.destroyBody();
				positionSousMap = "A6";
			} else if ( positionSousMap.equals("C6")  ){
				SousMapC6.destroyBody();
				positionSousMap = "B6";
			} else if ( positionSousMap.equals("D6")  ){
				SousMapD6.destroyBody();
				positionSousMap = "C6";
			} else if ( positionSousMap.equals("E6")  ){
				SousMapE6.destroyBody();
				positionSousMap = "D6";
			} else if ( positionSousMap.equals("F6")  ){
				SousMapF6.destroyBody();
				positionSousMap = "E6";
			} else if ( positionSousMap.equals("G6")  ){
				SousMapG6.destroyBody();
				positionSousMap = "F6";
			} else if ( positionSousMap.equals("H6")  ){
				SousMapH6.destroyBody();
				positionSousMap = "G6";
			} else if ( positionSousMap.equals("I6")  ){
				SousMapI6.destroyBody();
				positionSousMap = "H6";
			}//			**** changement de zone ****
			else if ( positionSousMap.equals("A6") && perso.getBody().getPosition().x < -10 && perso.getBody().getPosition().y > 0 ){
				SousMapA6.destroyBody();
				perso.zone = "zoneGlace";
				PlacementMainZoneGlace.positionSousMap = "I6";
				perso.getBody().setTransform(200,200,0);
				changementDeZone = false;
			}

			if ( changementDeZone == false ) défilement = true;
			changementDeZone = false;
			start = System.currentTimeMillis();
			x = 60;
			y = 0;
			direction = "gauche";




			réinitialisation();
		} else if (perso.getBody().getPosition().x > 580/MainMenu.PPM && perso.getBody().getPosition().y > 0 ){
			if ( positionSousMap.equals("A1" ) ){
				SousMapA1.destroyBody();
				positionSousMap = "B1";
			} else if ( positionSousMap.equals("B1")  ){
				positionSousMap = "C1";
				SousMapB1.destroyBody();
			} else if ( positionSousMap.equals("C1")  ){
				positionSousMap = "D1";
				SousMapC1.destroyBody();
			} else if ( positionSousMap.equals("D1")  ){
				positionSousMap = "E1";
				SousMapD1.destroyBody();
			} else if ( positionSousMap.equals("E1")  ){
				positionSousMap = "F1";
				SousMapE1.destroyBody();
			} else if ( positionSousMap.equals("F1")  ){
				positionSousMap = "G1";
				SousMapF1.destroyBody();
			} else if ( positionSousMap.equals("G1")  ){
				positionSousMap = "H1";
				Totem.étatTexte = 0;
				SousMapG1.destroyBody();
			} else if ( positionSousMap.equals("H1")  ){
				positionSousMap = "I1";
				SousMapH1.destroyBody();
			} else if ( positionSousMap.equals("A2" ) ){
				SousMapA2.destroyBody();
				positionSousMap = "B2";
			} else if ( positionSousMap.equals("B2") ){
				SousMapB2.destroyBody();
				positionSousMap = "C2";
			} else if ( positionSousMap.equals("C2") ){
				SousMapC2.destroyBody();
				positionSousMap = "D2";
			} else if ( positionSousMap.equals("D2") ){
				SousMapD2.destroyBody();
				positionSousMap = "E2";
			} else if ( positionSousMap.equals("E2") ){
				SousMapE2.destroyBody();
				positionSousMap = "F2";
			} else if ( positionSousMap.equals("F2") ){
				SousMapF2.destroyBody();
				positionSousMap = "G2";
			} else if ( positionSousMap.equals("G2") ){
				SousMapG2.destroyBody();
				positionSousMap = "H2";
			} else if ( positionSousMap.equals("H2") ){
				SousMapH2.destroyBody();
				positionSousMap = "I2";
			} else if ( positionSousMap.equals("A3" ) ){
				SousMapA3.destroyBody();
				positionSousMap = "B3";
			} else if ( positionSousMap.equals("B3") ){
				SousMapB3.destroyBody();
				positionSousMap = "C3";
			} else if ( positionSousMap.equals("C3") ){
				SousMapC3.destroyBody();
				positionSousMap = "D3";
			} else if ( positionSousMap.equals("D3") ){
				SousMapD3.destroyBody();
				positionSousMap = "E3";
			} else if ( positionSousMap.equals("E3") ){
				SousMapE3.destroyBody();
				positionSousMap = "F3";
			} else if ( positionSousMap.equals("F3") ){
				SousMapF3.destroyBody();
				positionSousMap = "G3";
			} else if ( positionSousMap.equals("G3") ){
				SousMapG3.destroyBody();
				positionSousMap = "H3";
			} else if ( positionSousMap.equals("H3") ){
				SousMapH3.destroyBody();
				positionSousMap = "I3";
			} else if ( positionSousMap.equals("A4" ) ){
				SousMapA4.destroyBody();
				positionSousMap = "B4";
			} else if ( positionSousMap.equals("B4") ){
				SousMapB4.destroyBody();
				positionSousMap = "C4";
			} else if ( positionSousMap.equals("C4") ){
				SousMapC4.destroyBody();
				positionSousMap = "D4";
			} else if ( positionSousMap.equals("D4") ){
				SousMapD4.destroyBody();
				positionSousMap = "E4";
			} else if ( positionSousMap.equals("E4") ){
				SousMapE4.destroyBody();
				positionSousMap = "F4";
			} else if ( positionSousMap.equals("F4") ){
				SousMapF4.destroyBody();
				positionSousMap = "G4";
			} else if ( positionSousMap.equals("G4") ){
				SousMapG4.destroyBody();
				positionSousMap = "H4";
			} else if ( positionSousMap.equals("H4") ){
				SousMapH4.destroyBody();
				positionSousMap = "I4";
			} else if ( positionSousMap.equals("A5" ) ){
				SousMapA5.destroyBody();
				positionSousMap = "B5";
			} else if ( positionSousMap.equals("B5") ){
				SousMapB5.destroyBody();
				positionSousMap = "C5";
			} else if ( positionSousMap.equals("C5") ){
				SousMapC5.destroyBody();
				positionSousMap = "D5";
			} else if ( positionSousMap.equals("D5") ){
				SousMapD5.destroyBody();
				positionSousMap = "E5";
			} else if ( positionSousMap.equals("E5") ){
				SousMapE5.destroyBody();
				positionSousMap = "F5";
			} else if ( positionSousMap.equals("F5") ){
				SousMapF5.destroyBody();
				positionSousMap = "G5";
			} else if ( positionSousMap.equals("G5") ){
				SousMapG5.destroyBody();
				positionSousMap = "H5";
			} else if ( positionSousMap.equals("H5") ){
				SousMapH5.destroyBody();
				positionSousMap = "I5";
			} else if ( positionSousMap.equals("A6" ) ){
				SousMapA6.destroyBody();
				positionSousMap = "B6";
			} else if ( positionSousMap.equals("B6") ){
				SousMapB6.destroyBody();
				positionSousMap = "C6";
			} else if ( positionSousMap.equals("C6") ){
				SousMapC6.destroyBody();
				positionSousMap = "D6";
			} else if ( positionSousMap.equals("D6") ){
				SousMapD6.destroyBody();
				positionSousMap = "E6";
			} else if ( positionSousMap.equals("E6") ){
				SousMapE6.destroyBody();
				positionSousMap = "F6";
			} else if ( positionSousMap.equals("F6") ){
				SousMapF6.destroyBody();
				positionSousMap = "G6";
			} else if ( positionSousMap.equals("G6") ){
				SousMapG6.destroyBody();
				positionSousMap = "H6";
			} else if ( positionSousMap.equals("H6") ){
				SousMapH6.destroyBody();
				positionSousMap = "I6";
			}

			défilement = true;
			start = System.currentTimeMillis();
			x = 60;
			y = 0;
			direction = "droite";


			réinitialisation();
		}
		
	}
	
	


	

}
