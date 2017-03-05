package map;

import characters.MainCharacter;
import items.CoeurDeVie;

public class PlacementMain {
	
	
//	Rep�rage sur quelle sous map est Link
	
	
	public static String positionSousMap ;
	public static boolean d�filement = false;
	public static long start;
	public static int x; 
	public static int y;
	public static String direction;
	
	
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
			
			d�filement = true;
			start = System.currentTimeMillis();
			y = 60;
			direction = perso.getDirection();
			
			perso.getBody().setTransform(perso.getBody().getPosition().x , perso.getBody().getPosition().y + 479 , 0);
			Map.setTypeDeD�cor();
			Map.setD�coChang�Faux();
			CoeurDeVie.r�initialisation();
		} else if (perso.getBody().getPosition().x > 0 && perso.getBody().getPosition().y > 480 ){
			if ( positionSousMap.equals("A1")  ){
			} else if ( positionSousMap.equals("A2") ){
				positionSousMap = "A1";
			}  else if ( positionSousMap.equals("B1" ) ){
			} else if ( positionSousMap.equals("B2") ){
				positionSousMap = "B1";
			}
			
			d�filement = true;
			start = System.currentTimeMillis();
			y = 60;
			direction = perso.getDirection();
			
			perso.getBody().setTransform(perso.getBody().getPosition().x , perso.getBody().getPosition().y - 479 , 0);
			Map.setTypeDeD�cor();
			Map.setD�coChang�Faux();
			CoeurDeVie.r�initialisation();
		} else if (perso.getBody().getPosition().x < 0 && perso.getBody().getPosition().y > 0 ){
			if ( positionSousMap.equals("A1")  ){
			} else if ( positionSousMap.equals("B1")  ){
				positionSousMap = "A1";
				SousMapB1.destroyBody();
			} else if ( positionSousMap.equals("A2") ){
			} else if ( positionSousMap.equals("B2")  ){
				positionSousMap = "A2";
			}
			
			d�filement = true;
			start = System.currentTimeMillis();
			x = 60;
			direction = perso.getDirection();
			
			perso.getBody().setTransform(perso.getBody().getPosition().x + 600, perso.getBody().getPosition().y  , 0);
			Map.setTypeDeD�cor();
			Map.setD�coChang�Faux();
			CoeurDeVie.r�initialisation();
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
			
			d�filement = true;
			start = System.currentTimeMillis();
			x = 60;
			direction = perso.getDirection();
			
			perso.getBody().setTransform(perso.getBody().getPosition().x - 600, perso.getBody().getPosition().y  , 0);
//			=============================================================================================================
//									r�initialisation du type de d�cor et de leur �tat , et des coeurs de vies
//			=============================================================================================================
			Map.setTypeDeD�cor();
			Map.setD�coChang�Faux();
			CoeurDeVie.r�initialisation();
		}
		
	}
	
	

}
