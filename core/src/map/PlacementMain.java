package map;

import characters.Ghost;
import characters.MainCharacter;
import decors.ClimatMontagneux;
import items.CoeurDeVie;
import scenes.MainMenu;

public class PlacementMain {
	
	
//	Repérage sur quelle sous map est Link
	
	
	public static String positionSousMap ;
	public static boolean défilement = false;
	public static long start;
	public static int x; 
	public static int y;
	public static String direction;
	
	
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
				SousMapG1.destroyBody();
			}  else if ( positionSousMap.equals("H1")  ){
				positionSousMap = "H2";
				SousMapH1.destroyBody();
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
			}
			
			défilement = true;
			start = System.currentTimeMillis();
			y = 60;
			x=0;
			direction = "bas";
			
			CadrillageMap.setTypeDeDécor();
			CadrillageMap.setDécoChangéFaux();
			CoeurDeVie.réinitialisation();
		} else if (perso.getBody().getPosition().x > 0 && perso.getBody().getPosition().y > 460/MainMenu.PPM ){
			if ( positionSousMap.equals("A1")  ){
			} else if ( positionSousMap.equals("B1" ) ){
			} else if ( positionSousMap.equals("C1" ) ){
			} else if ( positionSousMap.equals("D1" ) ){
			} else if ( positionSousMap.equals("E1" ) ){
			} else if ( positionSousMap.equals("F1" ) ){
			} else if ( positionSousMap.equals("G1" ) ){
			} else if ( positionSousMap.equals("H1" ) ){
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
			}
			
			défilement = true;
			start = System.currentTimeMillis();
			y = 60;
			x=0;
			direction = "haut";
			
			CadrillageMap.setTypeDeDécor();
			CadrillageMap.setDécoChangéFaux();
			CoeurDeVie.réinitialisation();
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
			}
			
			défilement = true;
			start = System.currentTimeMillis();
			x = 60;
			y = 0;
			direction = "gauche";
			
			CadrillageMap.setTypeDeDécor();
			CadrillageMap.setDécoChangéFaux();
			CoeurDeVie.réinitialisation();
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
			}
			
			défilement = true;
			start = System.currentTimeMillis();
			x = 60;
			y = 0;
			direction = "droite";
			
//			=============================================================================================================
//									réinitialisation du type de décor et de leur état , et des coeurs de vies
//			=============================================================================================================
			CadrillageMap.setTypeDeDécor();
			CadrillageMap.setDécoChangéFaux();
			CoeurDeVie.réinitialisation();
		}
		
//		 accès a l'igloo de la carte C1 
		else if (positionSousMap.equals("C1") 
				&& perso.getDirection().equals("haut")
				&& perso.getBody().getPosition().x > 160 &&  perso.getBody().getPosition().x < 185
				&& perso.getBody().getPosition().y > 140 && perso.getBody().getPosition().y < 150 ){
			MainMenu.Link.getBody().setTransform(280/MainMenu.PPM, 10, 0);
			SousMapC1.destroyBody();
			positionSousMap = "IglooC1";
			
			CadrillageMap.setTypeDeDécor();
			CadrillageMap.setDécoChangéFaux();
			CoeurDeVie.réinitialisation();
		} else if (positionSousMap.equals("IglooC1") 
				&& perso.getDirection().equals("bas")
				&& perso.getBody().getPosition().x > 230/MainMenu.PPM &&  perso.getBody().getPosition().x < 330/MainMenu.PPM
				&& perso.getBody().getPosition().y > 00 && perso.getBody().getPosition().y < 30 ){
			MainMenu.Link.getBody().setTransform(175, 155, 0);
			IglooC1.destroyBody();
			positionSousMap = "C1";
			
			CadrillageMap.setTypeDeDécor();
			CadrillageMap.setDécoChangéFaux();
			CoeurDeVie.réinitialisation();
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
			
			CadrillageMap.setTypeDeDécor();
			CadrillageMap.setDécoChangéFaux();
			CoeurDeVie.réinitialisation();
		} else if (positionSousMap.equals("IglooD3") 
				&& perso.getDirection().equals("bas")
				&& perso.getBody().getPosition().x > 230/MainMenu.PPM &&  perso.getBody().getPosition().x < 330/MainMenu.PPM
				&& perso.getBody().getPosition().y > 00 && perso.getBody().getPosition().y < 30 ){
			MainMenu.Link.getBody().setTransform(457/MainMenu.PPM, 95/MainMenu.PPM, 0);
			IglooD3.destroyBody();
			positionSousMap = "D3";
			
			CadrillageMap.setTypeDeDécor();
			CadrillageMap.setDécoChangéFaux();
			CoeurDeVie.réinitialisation();
		}
		
	}
//	déplacement de link , vers le haut le bas la droite ou la gauche entre deux tiles
	public static String typeDéplacementVertical = "" ;
	public static String typeDéplacementHorizontal = "" ;
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
		System.out.println(typeDéplacementVertical);
		System.out.println(typeDéplacementHorizontal);
	}
	
	
//	 détection si trou , eau 
	
	public static void détectionTrou(MainCharacter Link) {
		if ( typeDéplacementHorizontal.equals("gauche") )  {
			if ( typeDéplacementVertical.equals("bas")){
				if ( CadrillageMap.typeDeDécor[(int) ((Link.getBody().getPosition().x +12)*MainMenu.PPM/60 )][(int) ((Link.getBody().getPosition().y+5) *MainMenu.PPM/ 60 )].equals("Trou")) ClimatMontagneux.setDamageTrou(Link);
			} else if ( typeDéplacementVertical.equals("haut")){
				if ( CadrillageMap.typeDeDécor[(int) ((Link.getBody().getPosition().x +12)*MainMenu.PPM/60 )][(int) ((Link.getBody().getPosition().y -5) *MainMenu.PPM/ 60 )].equals("Trou")) ClimatMontagneux.setDamageTrou(Link);
			}
		} else if ( typeDéplacementHorizontal.equals("droite") ){
			if ( typeDéplacementVertical.equals("bas")){
				if ( CadrillageMap.typeDeDécor[(int) ((Link.getBody().getPosition().x )*MainMenu.PPM/60 )][(int) ((Link.getBody().getPosition().y+5) *MainMenu.PPM/ 60 )].equals("Trou")) ClimatMontagneux.setDamageTrou(Link);
			} else if ( typeDéplacementVertical.equals("haut")){
				if ( CadrillageMap.typeDeDécor[(int) ((Link.getBody().getPosition().x )*MainMenu.PPM/60 )][(int) ((Link.getBody().getPosition().y -5) *MainMenu.PPM/ 60 )].equals("Trou")) ClimatMontagneux.setDamageTrou(Link);
			}
		}
	}
	
	public static void détectionEauP(MainCharacter Link) {
		if ( typeDéplacementHorizontal.equals("gauche") )  {
			if ( typeDéplacementVertical.equals("bas")){
				if ( CadrillageMap.typeDeDécor[(int) ((Link.getBody().getPosition().x +12 )*MainMenu.PPM/60 )][(int) ((Link.getBody().getPosition().y +5)*MainMenu.PPM/ 60 )].equals("EauProfonde")) ClimatMontagneux.setDamageEau(Link);
			} else if ( typeDéplacementVertical.equals("haut")){
				if ( CadrillageMap.typeDeDécor[(int) ((Link.getBody().getPosition().x +12 )*MainMenu.PPM/60 )][(int) ((Link.getBody().getPosition().y -5)*MainMenu.PPM/ 60 )].equals("EauProfonde")) ClimatMontagneux.setDamageEau(Link);
			}
		} else if ( typeDéplacementHorizontal.equals("droite") ){
			if ( typeDéplacementVertical.equals("bas")){
				if ( CadrillageMap.typeDeDécor[(int) ((Link.getBody().getPosition().x  )*MainMenu.PPM/60 )][(int) ((Link.getBody().getPosition().y +5 )*MainMenu.PPM/ 60 )].equals("EauProfonde")) ClimatMontagneux.setDamageEau(Link);
			} else if ( typeDéplacementVertical.equals("haut")){
				if ( CadrillageMap.typeDeDécor[(int) ((Link.getBody().getPosition().x  )*MainMenu.PPM/60 )][(int) ((Link.getBody().getPosition().y -5)*MainMenu.PPM/ 60 )].equals("EauProfonde")) ClimatMontagneux.setDamageEau(Link);
			}
		}
	}
	

}
