package map;

import objets.Décors;
//import objets.RacineDroiteArbre;
//import objets.RacineGaucheArbre;
//import objets.RamureDroiteArbre;
//import objets.RamureGaucheArbre;
//import objets.RocheFissurée;

public class SousMap2 extends CoordCart {
	
	public static Décors[][] carte = new Décors[8][10];
	
	public static void sousMap2( ){
		for ( int i =0; i < carte.length ; i++){
			for ( int j = 0 ; j < carte[i].length ; j++){
				carte[i][j] = new Décors (false, "  -" );
			}
		};
	};
	
	public static Décors[][] setGetMap1(){
		sousMap2();
		return carte;
	}
	
	
}
