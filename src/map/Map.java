package map;

import objets.D�cors;
import objets.RacineDroiteArbre;
import objets.RacineGaucheArbre;
import objets.RamureDroiteArbre;
import objets.RamureGaucheArbre;

public class Map extends CoordCart {
	
	public static D�cors[][] carte = new D�cors[16][20];
	public static RacineGaucheArbre racineGaucheArbre = new RacineGaucheArbre();
	public static RacineDroiteArbre racineDroiteArbre = new RacineDroiteArbre();
	public static RamureGaucheArbre ramureGaucheArbre = new RamureGaucheArbre();
	public static RamureDroiteArbre ramureDroiteArbre = new RamureDroiteArbre();
	
	public static void setCarte(){
		for ( int i =0; i < carte.length ; i++){
			for ( int j = 0 ; j < carte[i].length ; j++){
				carte[i][j] = new D�cors (false, "  -" );
			}
		};
		SousMap1.sousMap1(carte, racineGaucheArbre, racineDroiteArbre, ramureGaucheArbre, ramureDroiteArbre);
	}
	
	public static D�cors[][] getMap(){
		setCarte();
		return carte;
	}

}
