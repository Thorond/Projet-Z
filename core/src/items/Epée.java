package items;

import com.badlogic.gdx.graphics.Texture;

import characters.MainCharacter;
import map.Map;
import map.PlacementMain;

public class Epée {
//	extends Item

//	public Epée(Texture text){
//		super(text,1);
//	}
	
//	static a enlever
	public static void utilisationItem( MainCharacter cha) {
		if ( cha.getDirection().equals("bas")){
			if ( ((int) cha.getBody().getPosition().y / 60 ) -1 >= 0 &&
					Map.typeDeDécor[( int) cha.getBody().getPosition().x / 60 ][((int) cha.getBody().getPosition().y / 60 ) -1 ].equals("HerbesHautes")){
				Map.setDécorChangé(( int) cha.getBody().getPosition().x / 60, ((int) cha.getBody().getPosition().y / 60) - 1, true);
				CoeurDeVie.déposerCoeur((int) cha.getBody().getPosition().x, (int) cha.getBody().getPosition().y -60 );
				CoeurDeVie.setEstPrésent(true);
			}
			
//			if ( PlacementMain.positionSousMap.equals("A1") ){
//				for ( int i = 0 ; i < SousMapA1.coordEnnemieSousMap.length ; i++){
//					if ( cha.position.getX()+1 == SousMapA1.ennemieSousMap[i].position.getX() && cha.position.getY() == SousMapA1.ennemieSousMap1[i].position.getY() )
//						SousMapA1.ennemieSousMap[i].setHealth(SousMapA1.ennemieSousMap1[i].getHealth() - cha.getStrenght());
//				}
//			}
//			
//			if ( Map.carte[cha.position.getX()+1][cha.position.getY()].getGraphisme() == "  \"") Map.carte[cha.position.getX()+1][cha.position.getY()].setGraphisme("  -");
		} else if ( cha.getDirection().equals("haut")){
			if ( ((int) cha.getBody().getPosition().y / 60 ) +1 <= 7 &&
					Map.typeDeDécor[( int) cha.getBody().getPosition().x / 60 ][((int) cha.getBody().getPosition().y / 60 ) +1 ].equals("HerbesHautes")){
				Map.setDécorChangé(( int) cha.getBody().getPosition().x / 60, ((int) cha.getBody().getPosition().y / 60) +1, true);
			}
			
//			if ( PlacementMain.positionSousMapA1 == true ){
//				for ( int i = 0 ; i < SousMapA1.coordEnnemieSousMap1.length ; i++){
//					if ( cha.position.getX()-1 == SousMapA1.ennemieSousMap1[i].position.getX() && cha.position.getY() == SousMapA1.ennemieSousMap1[i].position.getY() )
//						SousMapA1.ennemieSousMap1[i].setHealth(SousMapA1.ennemieSousMap1[i].getHealth() - cha.getStrenght());
//				}
//			}
			
//			if ( Map.carte[cha.position.getX()-1][cha.position.getY()].getGraphisme() == "  \"") Map.carte[cha.position.getX()-1][cha.position.getY()].setGraphisme("  -");
		} else if ( cha.getDirection().equals("droite")){
			if ( ((int) cha.getBody().getPosition().x / 60 ) +1 <= 9 &&
					Map.typeDeDécor[((int) cha.getBody().getPosition().x / 60) +1 ][((int) cha.getBody().getPosition().y / 60 ) ].equals("HerbesHautes")){
				Map.setDécorChangé(((int) cha.getBody().getPosition().x / 60) +1, ((int) cha.getBody().getPosition().y / 60), true);
			}
			
//			if ( PlacementMain.positionSousMapA1 == true ){
//				for ( int i = 0 ; i < SousMapA1.coordEnnemieSousMap1.length ; i++){
//					if ( cha.position.getX() == SousMapA1.ennemieSousMap1[i].position.getX() && cha.position.getY()+1 == SousMapA1.ennemieSousMap1[i].position.getY() )
//						SousMapA1.ennemieSousMap1[i].setHealth(SousMapA1.ennemieSousMap1[i].getHealth() - cha.getStrenght());
//				}
//			}
//			
//			if ( Map.carte[cha.position.getX()][cha.position.getY()+1].getGraphisme() == "  \"") Map.carte[cha.position.getX()][cha.position.getY()+1].setGraphisme("  -");
//			
		} else if ( cha.getDirection() == "gauche"){
			if ( ((int) cha.getBody().getPosition().x / 60 ) -1 >= 0 &&
					Map.typeDeDécor[((int) cha.getBody().getPosition().x / 60) -1 ][((int) cha.getBody().getPosition().y / 60 ) ].equals("HerbesHautes")){
				Map.setDécorChangé(((int) cha.getBody().getPosition().x / 60) -1, ((int) cha.getBody().getPosition().y / 60), true);
			}
			
//			if ( PlacementMain.positionSousMapA1 == true ){
//				for ( int i = 0 ; i < SousMapA1.coordEnnemieSousMap1.length ; i++){
//					if ( cha.position.getX() == SousMapA1.ennemieSousMap1[i].position.getX() && cha.position.getY()-1 == SousMapA1.ennemieSousMap1[i].position.getY() )
//						SousMapA1.ennemieSousMap1[i].setHealth(SousMapA1.ennemieSousMap1[i].getHealth() - cha.getStrenght());
//				}
//			}
//			
//			if ( Map.carte[cha.position.getX()][cha.position.getY()-1].getGraphisme() == "  \"") Map.carte[cha.position.getX()][cha.position.getY()-1].setGraphisme("  -");
		}
		
	}
	
}
