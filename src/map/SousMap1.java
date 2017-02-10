package map;

import characters.Pnj;

import objets.Décors;
import objets.RacineDroiteArbre;
import objets.RacineGaucheArbre;
import objets.RamureDroiteArbre;
import objets.RamureGaucheArbre;

public class SousMap1 extends Map {
	
	public static void sousMap1( Décors[][] carte, RacineGaucheArbre racineG, RacineDroiteArbre racineD, RamureGaucheArbre ramureG, RamureDroiteArbre ramureD){
		carte[1][0]=racineG;
		carte[1][1]=racineD;
		carte[1][2]=racineG;
		carte[1][3]=racineD;
		carte[0][2]=ramureG;
		carte[0][3]=ramureD;
		carte[0][0]=ramureG;
		carte[0][1]=ramureD;
		carte[2][0]=ramureG;
		carte[2][1]=ramureD;
		carte[3][0]=racineG;
		carte[3][1]=racineD;
//		carte[3][0]=new RocheFissurée();
		carte[0][4]=racineG;
		carte[0][5]=racineD;
	};
	
	
//	Création des ennemies 
	
	public static final CoordCart coord1 = new CoordCart(7,8);
	public static CoordCart coordTemp1 = new CoordCart(7,8);
	public static Pnj un = new Pnj(4,10, coordTemp1);
	public static final CoordCart coord2 = new CoordCart(2,8);
	public static CoordCart coordTemp2 = new CoordCart(2,8);
	public static Pnj deux = new Pnj(4,10, coordTemp2);
	public static final CoordCart coord3 = new CoordCart(5,3);
	public static CoordCart coordTemp3 = new CoordCart(5,3);
	public static Pnj trois = new Pnj(4,10, coordTemp3);
	
	public static CoordCart[] coordEnnemieSousMap1 = new CoordCart[] { coord1 , coord2, coord3 };
	
	public static CoordCart[] getCoordEnnemieSousMap1(){
		return coordEnnemieSousMap1;
	}
	
	public static Pnj[] ennemieSousMap1 = new Pnj[] { un , deux, trois };
	
	public static Pnj[] getEnnemieSousMap1(){
		return ennemieSousMap1;
	}

	
}
