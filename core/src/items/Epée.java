package items;

import characters.MainCharacter;
import map.Map;
import map.PlacementMain;
import map.SousMapB1;

public class Epée {
//	extends Item

//	public Epée(Texture text){
//		super(text,1);
//	}
	
//	static a enlever
	public static void utilisationItem( MainCharacter cha) {
		if ( cha.getDirection().equals("bas")){
			if ( ((int) cha.getBody().getPosition().y / 60 ) -1 >= 0 &&
					Map.typeDeDécor[( int) cha.getBody().getPosition().x / 60 ][((int) cha.getBody().getPosition().y / 60 ) -1 ].equals("HerbesHautes")
					&& Map.décorChangé[((int) cha.getBody().getPosition().x / 60) ][((int) cha.getBody().getPosition().y / 60 ) -1] == false){
				Map.setDécorChangé(( int) cha.getBody().getPosition().x / 60, ((int) cha.getBody().getPosition().y / 60) - 1, true);
				CoeurDeVie.remplirCoeurDeVies((int) cha.getBody().getPosition().x, (int) cha.getBody().getPosition().y -30 );
			}
			
		} else if ( cha.getDirection().equals("haut")){
			if ( ((int) cha.getBody().getPosition().y / 60 ) +1 <= 7 &&
					Map.typeDeDécor[( int) cha.getBody().getPosition().x / 60 ][((int) cha.getBody().getPosition().y / 60 ) +1 ].equals("HerbesHautes")
					&& Map.décorChangé[((int) cha.getBody().getPosition().x / 60)  ][((int) cha.getBody().getPosition().y / 60 ) +1 ] == false){
				Map.setDécorChangé(( int) cha.getBody().getPosition().x / 60, ((int) cha.getBody().getPosition().y / 60) +1, true);
				CoeurDeVie.remplirCoeurDeVies((int) cha.getBody().getPosition().x, (int) cha.getBody().getPosition().y +60 );
			}
			
		} else if ( cha.getDirection().equals("droite")){
			if ( ((int) cha.getBody().getPosition().x / 60 ) +1 <= 9 &&
					Map.typeDeDécor[((int) cha.getBody().getPosition().x / 60) +1 ][((int) cha.getBody().getPosition().y / 60 ) ].equals("HerbesHautes")
					&& Map.décorChangé[((int) cha.getBody().getPosition().x / 60) +1 ][((int) cha.getBody().getPosition().y / 60 ) ] == false){
				Map.setDécorChangé(((int) cha.getBody().getPosition().x / 60) +1, ((int) cha.getBody().getPosition().y / 60), true);
				CoeurDeVie.remplirCoeurDeVies((int) cha.getBody().getPosition().x +30, (int) cha.getBody().getPosition().y );
			}
			
		} else if ( cha.getDirection() == "gauche"){
			if ( ((int) cha.getBody().getPosition().x / 60 ) -1 >= 0 &&
					Map.typeDeDécor[((int) cha.getBody().getPosition().x / 60) -1 ][((int) cha.getBody().getPosition().y / 60 ) ].equals("HerbesHautes")
					&& Map.décorChangé[((int) cha.getBody().getPosition().x / 60) -1 ][((int) cha.getBody().getPosition().y / 60 ) ] == false){
				Map.setDécorChangé(((int) cha.getBody().getPosition().x / 60) -1, ((int) cha.getBody().getPosition().y / 60), true);
				CoeurDeVie.remplirCoeurDeVies((int) cha.getBody().getPosition().x -30, (int) cha.getBody().getPosition().y );
			}
			
		}
		if (Map.typeDeDécor[((int) cha.getBody().getPosition().x / 60)  ][((int) cha.getBody().getPosition().y / 60 ) ].equals("HerbesHautes")
					&& Map.décorChangé[((int) cha.getBody().getPosition().x / 60)  ][((int) cha.getBody().getPosition().y / 60 ) ] == false){
			Map.setDécorChangé(((int) cha.getBody().getPosition().x / 60) , ((int) cha.getBody().getPosition().y / 60), true);
			CoeurDeVie.remplirCoeurDeVies((int) cha.getBody().getPosition().x , (int) cha.getBody().getPosition().y );
		}
		if ( PlacementMain.positionSousMap.equals("B1")){
			if ( SousMapB1.monstresPrésent ){
				for ( int i = 0; i < SousMapB1.monstres.length ; i++){
					if ( SousMapB1.monstres[i].isAlive() ){
						for ( int j = 0 ; j <= 120 ; j ++){
							for ( int k = 0 ; k <= 120 ; k++){
								System.out.println(SousMapB1.monstres[i].getHealth());
								if ( (int) cha.getBody().getPosition().x +j == (int) SousMapB1.monstres[i].getBody().getPosition().x 
										&& (int) cha.getBody().getPosition().y +k == (int) SousMapB1.monstres[i].getBody().getPosition().y ){
									System.out.println("Yop");
									SousMapB1.monstres[i].setHealth(SousMapB1.monstres[i].getHealth() - cha.getStrength() );
								}
							}
						}
					}
				}			
			}
		}
	}
	
}
