package items;

import characters.MainCharacter;
import map.Map;

public class Ep�e {
//	extends Item

//	public Ep�e(Texture text){
//		super(text,1);
//	}
	
//	static a enlever
	public static void utilisationItem( MainCharacter cha) {
		if ( cha.getDirection().equals("bas")){
			if ( ((int) cha.getBody().getPosition().y / 60 ) -1 >= 0 &&
					Map.typeDeD�cor[( int) cha.getBody().getPosition().x / 60 ][((int) cha.getBody().getPosition().y / 60 ) -1 ].equals("HerbesHautes")
					&& Map.d�corChang�[((int) cha.getBody().getPosition().x / 60) ][((int) cha.getBody().getPosition().y / 60 ) -1] == false){
				Map.setD�corChang�(( int) cha.getBody().getPosition().x / 60, ((int) cha.getBody().getPosition().y / 60) - 1, true);
				CoeurDeVie.remplirCoeurDeVies((int) cha.getBody().getPosition().x, (int) cha.getBody().getPosition().y -30 );
			}
			
		} else if ( cha.getDirection().equals("haut")){
			if ( ((int) cha.getBody().getPosition().y / 60 ) +1 <= 7 &&
					Map.typeDeD�cor[( int) cha.getBody().getPosition().x / 60 ][((int) cha.getBody().getPosition().y / 60 ) +1 ].equals("HerbesHautes")
					&& Map.d�corChang�[((int) cha.getBody().getPosition().x / 60)  ][((int) cha.getBody().getPosition().y / 60 ) +1 ] == false){
				Map.setD�corChang�(( int) cha.getBody().getPosition().x / 60, ((int) cha.getBody().getPosition().y / 60) +1, true);
				CoeurDeVie.remplirCoeurDeVies((int) cha.getBody().getPosition().x, (int) cha.getBody().getPosition().y +60 );
			}
			
		} else if ( cha.getDirection().equals("droite")){
			if ( ((int) cha.getBody().getPosition().x / 60 ) +1 <= 9 &&
					Map.typeDeD�cor[((int) cha.getBody().getPosition().x / 60) +1 ][((int) cha.getBody().getPosition().y / 60 ) ].equals("HerbesHautes")
					&& Map.d�corChang�[((int) cha.getBody().getPosition().x / 60) +1 ][((int) cha.getBody().getPosition().y / 60 ) ] == false){
				Map.setD�corChang�(((int) cha.getBody().getPosition().x / 60) +1, ((int) cha.getBody().getPosition().y / 60), true);
				CoeurDeVie.remplirCoeurDeVies((int) cha.getBody().getPosition().x +30, (int) cha.getBody().getPosition().y );
			}
			
		} else if ( cha.getDirection() == "gauche"){
			if ( ((int) cha.getBody().getPosition().x / 60 ) -1 >= 0 &&
					Map.typeDeD�cor[((int) cha.getBody().getPosition().x / 60) -1 ][((int) cha.getBody().getPosition().y / 60 ) ].equals("HerbesHautes")
					&& Map.d�corChang�[((int) cha.getBody().getPosition().x / 60) -1 ][((int) cha.getBody().getPosition().y / 60 ) ] == false){
				Map.setD�corChang�(((int) cha.getBody().getPosition().x / 60) -1, ((int) cha.getBody().getPosition().y / 60), true);
				CoeurDeVie.remplirCoeurDeVies((int) cha.getBody().getPosition().x -30, (int) cha.getBody().getPosition().y );
			}
			
		}
		
	}
	
}
