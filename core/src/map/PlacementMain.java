package map;

import characters.MainCharacter;
import décors.RacineGaucheArbre;
import items.CoeurDeVie;
import scenes.MainMenu;

public class PlacementMain {
	
	
//	Repérage sur quelle sous map est Link
	
	
	public static String positionSousMap ;
	
	
	public static void posiSousMap(MainCharacter perso){
		if (perso.getBody().getPosition().x > 0 && perso.getBody().getPosition().y < 0  ){
			if ( positionSousMap.equals("A1")  ){
				positionSousMap = "A2";
			} else if ( positionSousMap.equals("A2") ){
				positionSousMap = "A3";
			} else if ( positionSousMap.equals("B1")  ){
				positionSousMap = "B2";
				SousMapB1.destroyBody();
			} else if ( positionSousMap.equals("B2")  ){
				positionSousMap = "B3";
			}
			perso.getBody().setTransform(perso.getBody().getPosition().x , perso.getBody().getPosition().y + 479 , 0);
			Map.setTypeDeDécor();
			Map.setDécoChangéFaux();
			CoeurDeVie.estPrésent = false;
		} else if (perso.getBody().getPosition().x > 0 && perso.getBody().getPosition().y > 480 ){
			if ( positionSousMap.equals("A1")  ){
			} else if ( positionSousMap.equals("A2") ){
				positionSousMap = "A1";
			}  else if ( positionSousMap.equals("B1" ) ){
			} else if ( positionSousMap.equals("B2") ){
				positionSousMap = "B1";
			}
			perso.getBody().setTransform(perso.getBody().getPosition().x , perso.getBody().getPosition().y - 479 , 0);
			Map.setTypeDeDécor();
			Map.setDécoChangéFaux();
			CoeurDeVie.estPrésent = false;
		} else if (perso.getBody().getPosition().x < 0 && perso.getBody().getPosition().y > 0 ){
			if ( positionSousMap.equals("A1")  ){
			} else if ( positionSousMap.equals("B1")  ){
				positionSousMap = "A1";
				SousMapB1.destroyBody();
			} else if ( positionSousMap.equals("A2") ){
			} else if ( positionSousMap.equals("B2")  ){
				positionSousMap = "A2";
			}
			perso.getBody().setTransform(perso.getBody().getPosition().x + 600, perso.getBody().getPosition().y  , 0);
			Map.setTypeDeDécor();
			Map.setDécoChangéFaux();
			CoeurDeVie.estPrésent = false;
		} else if (perso.getBody().getPosition().x > 600 && perso.getBody().getPosition().y > 0 ){
			if ( positionSousMap.equals("A1" ) ){
				positionSousMap = "B1";
			} else if ( positionSousMap.equals("B1")  ){
				positionSousMap = "C1";
				SousMapB1.destroyBody();
			} else if ( positionSousMap.equals("A2" ) ){
				positionSousMap = "B2";
			} else if ( positionSousMap.equals("B2") ){
				positionSousMap = "C2";
			}
			perso.getBody().setTransform(perso.getBody().getPosition().x - 600, perso.getBody().getPosition().y  , 0);
			Map.setTypeDeDécor();
			Map.setDécoChangéFaux();
			CoeurDeVie.estPrésent = false;
		}
		
	}
	
	

}
