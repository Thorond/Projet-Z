package items;

import com.badlogic.gdx.graphics.Texture;

import characters.MainCharacter;
import map.Map;
import map.PlacementMain;

public class Ep�e {
//	extends Item

//	public Ep�e(Texture text){
//		super(text,1);
//	}
	
//	static a enlever
	public static void utilisationItem( MainCharacter cha) {
		if ( cha.getDirection().equals("bas")){
			if ( ((int) cha.getBody().getPosition().y / 60 ) -1 >= 0 &&
					Map.typeDeD�cor[( int) cha.getBody().getPosition().x / 60 ][((int) cha.getBody().getPosition().y / 60 ) -1 ].equals("HerbesHautes")){
				Map.setD�corChang�(( int) cha.getBody().getPosition().x / 60, ((int) cha.getBody().getPosition().y / 60) - 1, true);
			}
			
//			if ( PlacementMain.positionSousMap.equals("A1") ){
//				for ( int i = 0 ; i < SousMapA1.coordEnnemieSousMap.length ; i++){
//					if ( cha.position.getX()+1 == SousMapA1.ennemieSousMap[i].position.getX() && cha.position.getY() == SousMapA1.ennemieSousMap1[i].position.getY() )
//						SousMapA1.ennemieSousMap[i].setHealth(SousMapA1.ennemieSousMap1[i].getHealth() - cha.getStrenght());
//				}
//			}
//			
//			if ( Map.carte[cha.position.getX()+1][cha.position.getY()].getGraphisme() == "  \"") Map.carte[cha.position.getX()+1][cha.position.getY()].setGraphisme("  -");
		} else if ( cha.getDirection() == "haut"){
//			if ( PlacementMain.positionSousMapA1 == true ){
//				for ( int i = 0 ; i < SousMapA1.coordEnnemieSousMap1.length ; i++){
//					if ( cha.position.getX()-1 == SousMapA1.ennemieSousMap1[i].position.getX() && cha.position.getY() == SousMapA1.ennemieSousMap1[i].position.getY() )
//						SousMapA1.ennemieSousMap1[i].setHealth(SousMapA1.ennemieSousMap1[i].getHealth() - cha.getStrenght());
//				}
//			}
			
//			if ( Map.carte[cha.position.getX()-1][cha.position.getY()].getGraphisme() == "  \"") Map.carte[cha.position.getX()-1][cha.position.getY()].setGraphisme("  -");
		} else if ( cha.getDirection() == "droite"){
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
