package map;

import objets.D�cors;
//import objets.RacineDroiteArbre;
//import objets.RacineGaucheArbre;
//import objets.RamureDroiteArbre;
//import objets.RamureGaucheArbre;
//import objets.RocheFissur�e;

public class SousMap2 extends CoordCart {
	
	public static D�cors[][] carte = new D�cors[8][10];
	
	public static void sousMap2( ){
		for ( int i =0; i < carte.length ; i++){
			for ( int j = 0 ; j < carte[i].length ; j++){
				carte[i][j] = new D�cors (false, "  -" );
			}
		};
	};
	
	public static D�cors[][] setGetMap1(){
		sousMap2();
		return carte;
	}
	
	
}
