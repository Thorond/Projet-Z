package map;

import characters.MainCharacter;
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
			}
			
			défilement = true;
			start = System.currentTimeMillis();
			y = 60;
			x=0;
			direction = "bas";
			
			Map.setTypeDeDécor();
			Map.setDécoChangéFaux();
			CoeurDeVie.réinitialisation();
		} else if (perso.getBody().getPosition().x > 0 && perso.getBody().getPosition().y > 430/MainMenu.PPM ){
			if ( positionSousMap.equals("A1")  ){
			} else if ( positionSousMap.equals("B1" ) ){
			} else if ( positionSousMap.equals("C1" ) ){
			} else if ( positionSousMap.equals("D1" ) ){
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
			} else if ( positionSousMap.equals("A4") ){
				SousMapA4.destroyBody();
				positionSousMap = "A3";
			} else if ( positionSousMap.equals("B4") ){
				SousMapB4.destroyBody();
				positionSousMap = "B3";
			} else if ( positionSousMap.equals("C4") ){
				SousMapC4.destroyBody();
				positionSousMap = "C3";
			}  else if ( positionSousMap.equals("D4") ){
				SousMapD4.destroyBody();
				positionSousMap = "D3";
			}
			
			défilement = true;
			start = System.currentTimeMillis();
			y = 60;
			x=0;
			direction = "haut";
			
			Map.setTypeDeDécor();
			Map.setDécoChangéFaux();
			CoeurDeVie.réinitialisation();
		} else if (perso.getBody().getPosition().x < 0 && perso.getBody().getPosition().y > 0 ){
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
			}
			
			défilement = true;
			start = System.currentTimeMillis();
			x = 60;
			y = 0;
			direction = "gauche";
			
			Map.setTypeDeDécor();
			Map.setDécoChangéFaux();
			CoeurDeVie.réinitialisation();
		} else if (perso.getBody().getPosition().x > 560/MainMenu.PPM && perso.getBody().getPosition().y > 0 ){
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
			}
			
			défilement = true;
			start = System.currentTimeMillis();
			x = 60;
			y = 0;
			direction = "droite";
			
//			=============================================================================================================
//									réinitialisation du type de décor et de leur état , et des coeurs de vies
//			=============================================================================================================
			Map.setTypeDeDécor();
			Map.setDécoChangéFaux();
			CoeurDeVie.réinitialisation();
		}
		
	}
	
	

}
