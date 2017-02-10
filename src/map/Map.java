package map;

import objets.Décors;
import objets.RacineDroiteArbre;
import objets.RacineGaucheArbre;
import objets.RamureDroiteArbre;
import objets.RamureGaucheArbre;

public class Map extends CoordCart {
	
	public static Décors[][] carte = new Décors[16][20];
	public static RacineGaucheArbre racineGaucheArbre = new RacineGaucheArbre();
	public static RacineDroiteArbre racineDroiteArbre = new RacineDroiteArbre();
	public static RamureGaucheArbre ramureGaucheArbre = new RamureGaucheArbre();
	public static RamureDroiteArbre ramureDroiteArbre = new RamureDroiteArbre();
	
	public static void setCarte(){
		for ( int i =0; i < carte.length ; i++){
			for ( int j = 0 ; j < carte[i].length ; j++){
				carte[i][j] = new Décors (false, "  -" );
			}
		};
		SousMap1.sousMap1(carte, racineGaucheArbre, racineDroiteArbre, ramureGaucheArbre, ramureDroiteArbre);
	}
	
	public static Décors[][] getMap(){
		setCarte();
		return carte;
	}

}
