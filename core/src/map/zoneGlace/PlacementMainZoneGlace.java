package map.zoneGlace;

import characters.Ghost;
import characters.MainCharacter;
import decors.ClimatMontagneux;
import decors.DonjonGlace;
import decors.Totem;
import items.Bombe;
import items.CoeurDeVie;
import items.Essence;
import items.Flèches;
import map.*;
import map.zoneDesert.PlacementMainZoneDesert;
import scenes.MainMenu;

public class PlacementMainZoneGlace {
	
	
//	Repérage sur quelle sous map est Link
	
	
	public static String positionSousMap = "G5";
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
		Flèches.réinitialisationDrop();
	}
	
	
	public static void posiSousMap(MainCharacter perso){
		if (perso.getBody().getPosition().x > -10 && perso.getBody().getPosition().y < 0  ){
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
			}
// 		******************** GrotteI1 *******************************
			else if ( positionSousMap.equals("GrotteI1Salle2")  ){
				map.zoneGlace.GrotteI1Salle2.destroyBody();
				positionSousMap = "GrotteI1Salle1";
			}
// 		******************** GrotteF5 *******************************
			else if ( positionSousMap.equals("GrotteF5Salle4")  ){
				map.zoneGlace.GrotteF5Salle4.destroyBody();
				positionSousMap = "GrotteF5Salle2";
			}else if ( positionSousMap.equals("GrotteF5Salle2")  ){
				map.zoneGlace.GrotteF5Salle2.destroyBody();
				positionSousMap = "GrotteF5Salle3";
			}
// 		******************** donjon *******************************
            else if ( positionSousMap.equals("DonjonSalle3")  ){
                map.zoneGlace.DonjonSalle3.destroyBody();
                positionSousMap = "DonjonSalle1";
            } else if ( positionSousMap.equals("DonjonSalle4")  ){
                map.zoneGlace.DonjonSalle4.destroyBody();
                positionSousMap = "DonjonSalle3";
            } else if ( positionSousMap.equals("DonjonSalle6")  ){
                map.zoneGlace.DonjonSalle6.destroyBody();
                positionSousMap = "DonjonSalle5";
            } else if ( positionSousMap.equals("DonjonSalle5")  ){
                map.zoneGlace.DonjonSalle5.destroyBody();
                positionSousMap = "DonjonSalle7";
            } else if ( positionSousMap.equals("DonjonSalle7")  ){
                map.zoneGlace.DonjonSalle7.destroyBody();
                positionSousMap = "DonjonSalle8";
            } else if ( positionSousMap.equals("DonjonSalle10")  ){
                map.zoneGlace.DonjonSalle10.destroyBody();
                positionSousMap = "DonjonSalle9";
            }

            else if ( positionSousMap.equals("DonjonSalle9") ){
                map.zoneGlace.DonjonSalle9.destroyBody();
                if ( DonjonSalle9.salle == 0 || DonjonSalle9.salle == 1) DonjonSalle9.salle = 2;
                else if ( DonjonSalle9.salle == 5 ) DonjonSalle9.salle = 6;
                else DonjonSalle9.salle = 0 ;
            }
			
			défilement = true;
			start = System.currentTimeMillis();
			y = 60;
			x=0;
			direction = "bas";
			
			réinitialisation();
			
		} else if (perso.getBody().getPosition().x > -10 && perso.getBody().getPosition().y > 460/MainMenu.PPM ){
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
// 		******************** GrotteI1 *******************************
			else if ( positionSousMap.equals("GrotteI1Salle1") ){
				map.zoneGlace.GrotteI1Salle1.destroyBody();
				positionSousMap = "GrotteI1Salle2";
			}
// 		******************** GrotteF5 *******************************
			else if ( positionSousMap.equals("GrotteF5Salle3") ){
				map.zoneGlace.GrotteF5Salle3.destroyBody();
				positionSousMap = "GrotteF5Salle2";
			}else if ( positionSousMap.equals("GrotteF5Salle2") ){
				map.zoneGlace.GrotteF5Salle2.destroyBody();
				positionSousMap = "GrotteF5Salle4";
			}
// 		******************** donjon *******************************
            else if ( positionSousMap.equals("DonjonSalle1") ){
                map.zoneGlace.DonjonSalle1.destroyBody();
                positionSousMap = "DonjonSalle3";
            } else if ( positionSousMap.equals("DonjonSalle3") ){
                map.zoneGlace.DonjonSalle3.destroyBody();
                positionSousMap = "DonjonSalle4";
            } else if ( positionSousMap.equals("DonjonSalle5") ){
                map.zoneGlace.DonjonSalle5.destroyBody();
                positionSousMap = "DonjonSalle6";
            } else if ( positionSousMap.equals("DonjonSalle7") ){
                map.zoneGlace.DonjonSalle7.destroyBody();
                positionSousMap = "DonjonSalle5";
            } else if ( positionSousMap.equals("DonjonSalle8") ){
                map.zoneGlace.DonjonSalle8.destroyBody();
                positionSousMap = "DonjonSalle7";
            } else if ( positionSousMap.equals("DonjonSalle9") && DonjonSalle9.salle == 6){
                map.zoneGlace.DonjonSalle9.destroyBody();
                positionSousMap = "DonjonSalle10";
            }

            else if ( positionSousMap.equals("DonjonSalle9") ){
                map.zoneGlace.DonjonSalle9.destroyBody();
                if ( DonjonSalle9.salle == 3) DonjonSalle9.salle = 4;
                else DonjonSalle9.salle = 0 ;
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
			} else if ( positionSousMap.equals("A6") ){
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
			}
			// 		******************** GrotteI1 *******************************
			else if ( positionSousMap.equals("GrotteI1Salle3")  ){
				map.zoneGlace.GrotteI1Salle3.destroyBody();
				positionSousMap = "GrotteI1Salle2";
			} else if ( positionSousMap.equals("GrotteI1Salle4")  ){
				GrotteI1Salle4.destroyBody();
				positionSousMap = "GrotteI1Salle3";
			}
			// 		******************** GrotteF5 *******************************
			else if ( positionSousMap.equals("GrotteF5Salle5")  ){
				map.zoneGlace.GrotteF5Salle5.destroyBody();
				positionSousMap = "GrotteF5Salle4";
			} else if ( positionSousMap.equals("GrotteF5Salle1")  ){
				GrotteF5Salle1.destroyBody();
				positionSousMap = "GrotteF5Salle2";
			}
            // 		******************** Donjon *******************************
            else if ( positionSousMap.equals("DonjonSalle1")  ){
                map.zoneGlace.DonjonSalle1.destroyBody();
                positionSousMap = "DonjonSalle2";
            } else if ( positionSousMap.equals("DonjonSalle3")  ){
                map.zoneGlace.DonjonSalle3.destroyBody();
                DonjonSalle9.salle = 1;
                positionSousMap = "DonjonSalle9";
            } else if ( positionSousMap.equals("DonjonSalle5")  ){
                map.zoneGlace.DonjonSalle5.destroyBody();
                positionSousMap = "DonjonSalle4";
            } else if ( positionSousMap.equals("DonjonSalle7")  ){
                map.zoneGlace.DonjonSalle7.destroyBody();
                positionSousMap = "DonjonSalle3";
            }

            else if ( positionSousMap.equals("DonjonSalle9") ){
                map.zoneGlace.DonjonSalle9.destroyBody();
                if ( DonjonSalle9.salle == 1 ) DonjonSalle9.salle = 0;
                else if ( DonjonSalle9.salle == 2) DonjonSalle9.salle = 3;
                else if ( DonjonSalle9.salle == 4 ) DonjonSalle9.salle = 5;
                else DonjonSalle9.salle = 0 ;
            }


            défilement = true;
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
			}//			**** changement de zone ****
			else if ( positionSousMap.equals("I6")  ){
				SousMapI6.destroyBody();
				MainMenu.Link.zone = "zoneDesert";
				PlacementMainZoneDesert.positionSousMap = "A6";
				MainMenu.Link.getBody().setTransform(200,200,0);
				changementDeZone = true;
			}

			// 		******************** GrotteI1 *******************************
			else if ( positionSousMap.equals("GrotteI1Salle2") ){
				map.zoneGlace.GrotteI1Salle2.destroyBody();
				positionSousMap = "GrotteI1Salle3";
			} else if ( positionSousMap.equals("GrotteI1Salle3") ){
				map.zoneGlace.GrotteI1Salle3.destroyBody();
				positionSousMap = "GrotteI1Salle4";
			}
			// 		******************** GrotteF5 *******************************
			else if ( positionSousMap.equals("GrotteF5Salle2") ){
				map.zoneGlace.GrotteF5Salle2.destroyBody();
				positionSousMap = "GrotteF5Salle1";
			} else if ( positionSousMap.equals("GrotteF5Salle4") ){
				map.zoneGlace.GrotteF5Salle4.destroyBody();
				positionSousMap = "GrotteF5Salle5";
			}
            // 		******************** Donjon *******************************
            else if ( positionSousMap.equals("DonjonSalle2")  ){
                map.zoneGlace.DonjonSalle2.destroyBody();
                positionSousMap = "DonjonSalle1";
            } else if ( positionSousMap.equals("DonjonSalle9")  ){
                map.zoneGlace.DonjonSalle9.destroyBody();
                positionSousMap = "DonjonSalle3";
            } else if ( positionSousMap.equals("DonjonSalle4")  ){
                map.zoneGlace.DonjonSalle4.destroyBody();
                positionSousMap = "DonjonSalle5";
            } else if ( positionSousMap.equals("DonjonSalle3")  ){
                map.zoneGlace.DonjonSalle3.destroyBody();
                positionSousMap = "DonjonSalle7";
            }

			if ( changementDeZone == false ) défilement = true;
			changementDeZone = false;
			start = System.currentTimeMillis();
			x = 60;
			y = 0;
			direction = "droite";


			réinitialisation();
		}
		
//		 accès a l'igloo de la carte C1 
		else if (positionSousMap.equals("C1") 
				&& perso.getDirection().equals("haut")
				&& perso.getBody().getPosition().x > 160 &&  perso.getBody().getPosition().x < 185
				&& perso.getBody().getPosition().y > 140 && perso.getBody().getPosition().y < 150 ){
			MainMenu.Link.getBody().setTransform(280/MainMenu.PPM, 10, 0);
			SousMapC1.destroyBody();
			positionSousMap = "IglooC1";

			réinitialisation();
		} else if (positionSousMap.equals("IglooC1") 
				&& perso.getDirection().equals("bas")
				&& perso.getBody().getPosition().x > 230/MainMenu.PPM &&  perso.getBody().getPosition().x < 330/MainMenu.PPM
				&& perso.getBody().getPosition().y > 00 && perso.getBody().getPosition().y < 30 ){
			MainMenu.Link.getBody().setTransform(175, 155, 0);
			map.zoneGlace.IglooC1.destroyBody();
			positionSousMap = "C1";

			réinitialisation();
		}
//		 accès a l'igloo de la carte D3 
		else if (positionSousMap.equals("D3") 
				&& perso.getDirection().equals("haut")
				&& perso.getBody().getPosition().x > 440/MainMenu.PPM &&  perso.getBody().getPosition().x < 480/MainMenu.PPM
				&& perso.getBody().getPosition().y > 90/MainMenu.PPM && perso.getBody().getPosition().y < 120/MainMenu.PPM ){
			MainMenu.Link.getBody().setTransform(280/MainMenu.PPM, 10, 0);
			SousMapD3.destroyBody();
			positionSousMap = "IglooD3";
			if (Ghost.etatScenario == 14 ) Ghost.etatScenario = 0;

			réinitialisation();
		} else if (positionSousMap.equals("IglooD3") 
				&& perso.getDirection().equals("bas")
				&& perso.getBody().getPosition().x > 230/MainMenu.PPM &&  perso.getBody().getPosition().x < 330/MainMenu.PPM
				&& perso.getBody().getPosition().y > 00 && perso.getBody().getPosition().y < 30 ){
			MainMenu.Link.getBody().setTransform(457/MainMenu.PPM, 95/MainMenu.PPM, 0);
			map.zoneGlace.IglooD3.destroyBody();
			positionSousMap = "D3";

			réinitialisation();
		}
//		 accès a l'igloo de la carte C5 
		else if (positionSousMap.equals("C5") 
				&& perso.getDirection().equals("haut")
				&& perso.getBody().getPosition().x > 420/MainMenu.PPM &&  perso.getBody().getPosition().x < 460/MainMenu.PPM
				&& perso.getBody().getPosition().y > 150/MainMenu.PPM && perso.getBody().getPosition().y < 180/MainMenu.PPM ){
			MainMenu.Link.getBody().setTransform(280/MainMenu.PPM, 10, 0);
			SousMapC5.destroyBody();
			positionSousMap = "IglooC5";

			réinitialisation();
		} else if (positionSousMap.equals("IglooC5") 
				&& perso.getDirection().equals("bas")
				&& perso.getBody().getPosition().x > 230/MainMenu.PPM &&  perso.getBody().getPosition().x < 330/MainMenu.PPM
				&& perso.getBody().getPosition().y > 00 && perso.getBody().getPosition().y < 30 ){
			MainMenu.Link.getBody().setTransform(440/MainMenu.PPM, 155/MainMenu.PPM, 0);
			map.zoneGlace.IglooC5.destroyBody();
			positionSousMap = "C5";

			réinitialisation();
		}
		//		 accès a la grotte en I1
		else if (positionSousMap.equals("I1")
				&& perso.getDirection().equals("haut")
				&& perso.getBody().getPosition().x > 240/MainMenu.PPM &&  perso.getBody().getPosition().x < 360/MainMenu.PPM
				&& perso.getBody().getPosition().y > 230/MainMenu.PPM && perso.getBody().getPosition().y < 260/MainMenu.PPM ){
			MainMenu.Link.getBody().setTransform(300/MainMenu.PPM, 10, 0);
			SousMapI1.destroyBody();
			positionSousMap = "GrotteI1Salle1";

			réinitialisation();
		} else if (positionSousMap.equals("GrotteI1Salle1")
				&& perso.getDirection().equals("bas")
				&& perso.getBody().getPosition().x > 230/MainMenu.PPM &&  perso.getBody().getPosition().x < 330/MainMenu.PPM
				&& perso.getBody().getPosition().y > 00 && perso.getBody().getPosition().y < 30 ){
			MainMenu.Link.getBody().setTransform(270/MainMenu.PPM, 220/MainMenu.PPM, 0);
			map.zoneGlace.GrotteI1Salle1.destroyBody();
			positionSousMap = "I1";

			réinitialisation();
		}

		//		 accès a la grotte en F5
		else if (positionSousMap.equals("F5")
				&& perso.getDirection().equals("haut")
				&& perso.getBody().getPosition().x > 400/MainMenu.PPM &&  perso.getBody().getPosition().x < 480/MainMenu.PPM
				&& perso.getBody().getPosition().y > 120/MainMenu.PPM && perso.getBody().getPosition().y < 140/MainMenu.PPM ){
			MainMenu.Link.getBody().setTransform(300/MainMenu.PPM, 10, 0);
			SousMapF5.destroyBody();
			positionSousMap = "GrotteF5Salle1";

			réinitialisation();
		} else if (positionSousMap.equals("GrotteF5Salle1")
				&& perso.getDirection().equals("bas")
				&& perso.getBody().getPosition().x > 230/MainMenu.PPM &&  perso.getBody().getPosition().x < 330/MainMenu.PPM
				&& perso.getBody().getPosition().y > 00 && perso.getBody().getPosition().y < 30 ){
			MainMenu.Link.getBody().setTransform(430/MainMenu.PPM, 110/MainMenu.PPM, 0);
			map.zoneGlace.GrotteF5Salle1.destroyBody();
			positionSousMap = "F5";

			réinitialisation();
		}

        //      accès au donjon
        else if (positionSousMap.equals("H2")
                && perso.getDirection().equals("haut")
                && perso.getBody().getPosition().x > 480/MainMenu.PPM &&  perso.getBody().getPosition().x < 600/MainMenu.PPM
                && perso.getBody().getPosition().y > 250/MainMenu.PPM && perso.getBody().getPosition().y < 310/MainMenu.PPM ){
            MainMenu.Link.getBody().setTransform(300/MainMenu.PPM, 10, 0);
            SousMapH2.destroyBody();
            positionSousMap = "DonjonSalle1";

            réinitialisation();
        } else if (positionSousMap.equals("DonjonSalle1")
                && perso.getDirection().equals("bas")
                && perso.getBody().getPosition().x > 230/MainMenu.PPM &&  perso.getBody().getPosition().x < 330/MainMenu.PPM
                && perso.getBody().getPosition().y > 00 && perso.getBody().getPosition().y < 30 ){
            MainMenu.Link.getBody().setTransform(510/MainMenu.PPM, 230/MainMenu.PPM, 0);
            map.zoneGlace.DonjonSalle1.destroyBody();
            positionSousMap = "H2";

            réinitialisation();
        }

	}


    public static void détectionEscalier(MainCharacter Link){
        if ( CadrillageMap.typeDeDécor[(int) (Link.getBody().getPosition().x *MainMenu.PPM/60 )][(int) (Link.getBody().getPosition().y *MainMenu.PPM/ 60 )].equals("Escalier")) {
            if ( PlacementMainZoneGlace.positionSousMap.equals("DonjonSalle6")){
                DonjonSalle6.destroyBody();
                DonjonSalle6.destroyType();
                PlacementMainZoneGlace.positionSousMap = "H1";
                PlacementMainZoneGlace.réinitialisation();
                Link.getBody().setTransform(430 / MainMenu.PPM ,240 / MainMenu.PPM ,0);
            } else if ( PlacementMainZoneGlace.positionSousMap.equals("H1")){
                SousMapH1.destroyBody();
                SousMapH1.destroyType();
                PlacementMainZoneGlace.positionSousMap = "DonjonSalle6";
                PlacementMainZoneGlace.réinitialisation();
                Link.getBody().setTransform(60 / MainMenu.PPM ,300 / MainMenu.PPM ,0);
            } else if ( PlacementMainZoneGlace.positionSousMap.equals("DonjonSalle8")){
                DonjonSalle8.destroyBody();
                DonjonSalle8.destroyType();
                PlacementMainZoneGlace.positionSousMap = "H2";
                PlacementMainZoneGlace.réinitialisation();
                Link.getBody().setTransform(250 / MainMenu.PPM ,70 / MainMenu.PPM ,0);
            } else if ( PlacementMainZoneGlace.positionSousMap.equals("H2")){
                SousMapH2.destroyBody();
                SousMapH2.destroyType();
                PlacementMainZoneGlace.positionSousMap = "DonjonSalle8";
                PlacementMainZoneGlace.réinitialisation();
                Link.getBody().setTransform(430 / MainMenu.PPM ,80 / MainMenu.PPM ,0);
            } else if ( PlacementMainZoneGlace.positionSousMap.equals("GrotteA4")){
                GrotteA4.destroyBody();
                GrotteA4.destroyType();
                PlacementMainZoneGlace.positionSousMap = "A4";
                PlacementMainZoneGlace.réinitialisation();
                Link.getBody().setTransform(550 / MainMenu.PPM ,240 / MainMenu.PPM ,0);
            } else if ( PlacementMainZoneGlace.positionSousMap.equals("A4")){
                SousMapA4.destroyBody();
                SousMapA4.destroyType();
                PlacementMainZoneGlace.positionSousMap = "GrotteA4";
                PlacementMainZoneGlace.réinitialisation();
                Link.getBody().setTransform(430 / MainMenu.PPM ,80 / MainMenu.PPM ,0);
            }
        }
    }
	
	
//	================================================================================
//	déplacement de link , vers le haut le bas la droite ou la gauche entre deux tiles
//	================================================================================
	public static String typeDéplacementVertical = "bas" ;
	public static String typeDéplacementHorizontal = "gauche" ;
	public static boolean déplacementVertical = false;
	public static boolean déplacementHorizontal = false;
	public static void setDéplacement(MainCharacter Link){
//		 changement de direction?
		if ( déplacementHorizontal ){
			if ( typeDéplacementHorizontal.equals("gauche") || typeDéplacementHorizontal.equals("droite")) {
				if ( Link.getX() % 60 > 25 && Link.getX() % 60 < 35) déplacementHorizontal =false;
			} 
		} //		initialisation 
		else {
			if ( Link.getDirection().equals("gauche") || Link.getDirection().equals("droite")) {
				if (Link.getX() % 60 < 10 ) {
					typeDéplacementHorizontal = "gauche";
					déplacementHorizontal = true;
				}
				else if (Link.getX() % 60 > 50 ) {
					typeDéplacementHorizontal = "droite";
					déplacementHorizontal = true;
				}
			} 
		} 
		if ( déplacementVertical ){
			if ( typeDéplacementVertical.equals("haut") || typeDéplacementVertical.equals("bas")){
				if ( Link.getY() % 60 > 25 && Link.getY() % 60 < 35 ) déplacementVertical =false;
			}
		} //		initialisation 
		else {
			if ( Link.getDirection().equals("haut") || Link.getDirection().equals("bas")) {
				if (Link.getY() % 60 < 10 ) {
					typeDéplacementVertical = "bas";
					déplacementVertical = true;
				}
				else if (Link.getY() % 60 >50 ) {
					typeDéplacementVertical = "haut";
					déplacementVertical = true;
				}
			}
		} 	
	}
	
	
//	 détection si trou , eau 
//	========================================

	public static boolean trouPrésent = false;

	public static void détectionTrou(MainCharacter Link) {
		if ( typeDéplacementHorizontal.equals("gauche") )  {
			if ( typeDéplacementVertical.equals("bas")){
				if ( CadrillageMap.typeDeDécor[(int) ((Link.getBody().getPosition().x +12)*MainMenu.PPM/60 )][(int) ((Link.getBody().getPosition().y+5) *MainMenu.PPM/ 60 )].equals("Trou")) trouPrésent = true;
			} else if ( typeDéplacementVertical.equals("haut")){
				if ( CadrillageMap.typeDeDécor[(int) ((Link.getBody().getPosition().x +12)*MainMenu.PPM/60 )][(int) ((Link.getBody().getPosition().y -5) *MainMenu.PPM/ 60 )].equals("Trou")) trouPrésent = true;
			}
		} else if ( typeDéplacementHorizontal.equals("droite") ){
			if ( typeDéplacementVertical.equals("bas")){
				if ( CadrillageMap.typeDeDécor[(int) ((Link.getBody().getPosition().x +10)*MainMenu.PPM/60 )][(int) ((Link.getBody().getPosition().y+5) *MainMenu.PPM/ 60 )].equals("Trou")) trouPrésent = true;
			} else if ( typeDéplacementVertical.equals("haut")){
				if ( CadrillageMap.typeDeDécor[(int) ((Link.getBody().getPosition().x +10)*MainMenu.PPM/60 )][(int) ((Link.getBody().getPosition().y -5) *MainMenu.PPM/ 60 )].equals("Trou")) trouPrésent = true;
			}
		}
		if ( trouPrésent){
			if ( Link.getDirection().equals("droite"))
				MainMenu.Link.getBody().setTransform(Link.getBody().getPosition().x + 10, Link.getBody().getPosition().y , 0);
			else if ( Link.getDirection().equals("bas"))
				MainMenu.Link.getBody().setTransform(Link.getBody().getPosition().x -20, Link.getBody().getPosition().y -20, 0);
			else if ( Link.getDirection().equals("gauche"))
				MainMenu.Link.getBody().setTransform(Link.getBody().getPosition().x -20, Link.getBody().getPosition().y -20, 0);

			ClimatMontagneux.setDamageTrou(Link);
			trouPrésent = false;
			Link.tombe = true;
			Link.timerChuteTotal = System.currentTimeMillis();
			Link.getBody().setLinearVelocity(0,0);

		}
	}

	public static void détectionEauP(MainCharacter Link) {
		if ( typeDéplacementHorizontal.equals("gauche") )  {
			if ( typeDéplacementVertical.equals("bas")){
				if ( CadrillageMap.typeDeDécor[(int) ((Link.getBody().getPosition().x +12 )*MainMenu.PPM/60 )][(int) ((Link.getBody().getPosition().y +5)*MainMenu.PPM/ 60 )].equals("EauProfonde")) trouPrésent = true;
			} else if ( typeDéplacementVertical.equals("haut")){
				if ( CadrillageMap.typeDeDécor[(int) ((Link.getBody().getPosition().x +12 )*MainMenu.PPM/60 )][(int) ((Link.getBody().getPosition().y -5)*MainMenu.PPM/ 60 )].equals("EauProfonde")) trouPrésent = true;
			}
		} else if ( typeDéplacementHorizontal.equals("droite") ){
			if ( typeDéplacementVertical.equals("bas")){
				if ( CadrillageMap.typeDeDécor[(int) ((Link.getBody().getPosition().x +10 )*MainMenu.PPM/60 )][(int) ((Link.getBody().getPosition().y +5 )*MainMenu.PPM/ 60 )].equals("EauProfonde")) trouPrésent = true;
			} else if ( typeDéplacementVertical.equals("haut")){
				if ( CadrillageMap.typeDeDécor[(int) ((Link.getBody().getPosition().x +10)*MainMenu.PPM/60 )][(int) ((Link.getBody().getPosition().y -5)*MainMenu.PPM/ 60 )].equals("EauProfonde")) trouPrésent = true;
			}
		}
		if ( trouPrésent){
			if ( Link.getDirection().equals("droite"))
				MainMenu.Link.getBody().setTransform(Link.getBody().getPosition().x + 10, Link.getBody().getPosition().y , 0);
			else if ( Link.getDirection().equals("bas"))
				MainMenu.Link.getBody().setTransform(Link.getBody().getPosition().x -20, Link.getBody().getPosition().y -20, 0);
			else if ( Link.getDirection().equals("gauche"))
				MainMenu.Link.getBody().setTransform(Link.getBody().getPosition().x -20, Link.getBody().getPosition().y -20, 0);

			ClimatMontagneux.setDamageEau(Link);
			trouPrésent = false;
			Link.tombe = true;
			Link.timerChuteTotal = System.currentTimeMillis();
			Link.getBody().setLinearVelocity(0,0);
		}
	}
	

}
