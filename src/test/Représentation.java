package test;


import characters.Character;
import characters.MainCharacter;
import characters.Pnj;
import map.CoordCart;
import map.Map;
import map.SousMap1;
import objets.D�cors;
import objets.Bombes;
import objets.Bouclier;

public class Repr�sentation {
	
//	Acquisition de la carte 
	
	private static D�cors[][] carte =  Map.getMap();
	
//	Cr�ation de Link
	
	static MainCharacter Link = new MainCharacter(12,10, new CoordCart(3,3));
	
//	Cr�ation des objets

	static Bouclier bouclier = new Bouclier();
	static Bombes bombes = new Bombes(0);
	
//	D�finition ennemis de la sous map 1
	
	static CoordCart[] coordEnnemieSousMap1;
	static Pnj[] ennemieSousMap1;
	
//	Rep�rage sur quelle sous map est Link
	
	public static boolean posiSousMap_1_1(Character perso){
		if (perso.position.getX() < 8 && perso.position.getX() >= 0 && perso.position.getY() < 10 && perso.position.getY() >= 0 ){
//			Acquisition ennemies de la sous map 1
			 coordEnnemieSousMap1 = SousMap1.getCoordEnnemieSousMap1();
			 ennemieSousMap1 = SousMap1.getEnnemieSousMap1();
			return true;
		} else {
//			r�initialisation des ennemies 
			for ( int i = 0 ; i<3 ; i++){
				ennemieSousMap1[i].setHealth(4);
				ennemieSousMap1[i].position.setX(coordEnnemieSousMap1[i].getX());
				ennemieSousMap1[i].position.setY(coordEnnemieSousMap1[i].getY());			}
			return false;
		}
	}
	public static boolean posiSousMap_1_2(Character perso){
		if (perso.position.getX() < 8 && perso.position.getX() >= 0 && perso.position.getY() < 20 && perso.position.getY() >= 10 ){
			return true;
		} else {
			return false;
		}
	}
	
	public static boolean posiSousMap_2_1(Character perso){		
		if (perso.position.getX() < 16 && perso.position.getX() >= 8 && perso.position.getY() < 10 && perso.position.getY() >= 0 ){
			return true;
		} else {
			return false;
		}
	}
	
	public static boolean posiSousMap_2_2(Character perso){
		if (perso.position.getX() < 16 && perso.position.getX() >= 8 && perso.position.getY() < 20 && perso.position.getY() >= 10 ){
			return true;
		} else {
			return false ;
		}
	}
	
	
//	Repr�sentation de la sousmap

	public static void repr�sentation(){
		Link.setEnt�te();
		if ( posiSousMap_1_1(Link) == true){
//			d�placements des pnjs
			for ( int i = 0 ; i < 3 ; i++ ){
				if ( distanceLink(ennemieSousMap1[i].position) == true ){
					d�placementToLink(ennemieSousMap1[i].position);
				}
				else {
					Pnj.d�placementAl�a(ennemieSousMap1[i], carte);
				}
			}
//			Repr�sentation de la sous carte
			for ( int i =0; i < 8 ; i++){
				String temp = "";
				for ( int j = 0 ; j < 10 ; j++){
					for ( int k = 0; k < bombes.bombes.length ; k ++){
						if ( bombes.bombeD�pos�e == true && bombes.bombes[k] != 9 && i == bombes.coordBombes[k].getX() && j == bombes.coordBombes[k].getY() ){
							temp += bombes.getGraphisme();
							j++;
						}
					}
					for (int k=0; k< ennemieSousMap1.length;k++){
						if ( ennemieSousMap1[k].getHealth() >0 && i == ennemieSousMap1[k].position.getX() && j == ennemieSousMap1[k].position.getY() ){
							temp += "  x";
							j++;
						}
					}
					if ( i == Link.position.getX() && j == Link.position.getY() ) {
						temp += "  o";
					} else {
						if ( j != 10) temp += carte[i][j].getGraphisme();
					}
				}
				System.out.println(temp);
			}
		} else if ( posiSousMap_1_2(Link) == true){
			for ( int i =0; i < 8 ; i++){
				String temp = "";
				for ( int j = 10 ; j < 20 ; j++){
					for ( int k = 0; k < bombes.bombes.length ; k ++){
						if ( bombes.bombeD�pos�e == true && bombes.bombes[k] != 9 && i == bombes.coordBombes[k].getX() && j == bombes.coordBombes[k].getY() ){
							temp += bombes.getGraphisme();
							j++;
						}
					}
					if ( i == Link.position.getX() && j == Link.position.getY() ) {
						temp += "  o";
					} else {
						temp += carte[i][j].getGraphisme();
					}
				}
				System.out.println(temp);
			}
		} else if ( posiSousMap_2_1(Link) == true){
			for ( int i =8; i < 16 ; i++){
				String temp = "";
				for ( int j = 0 ; j < 10 ; j++){
					for ( int k = 0; k < bombes.bombes.length ; k ++){
						if ( bombes.bombeD�pos�e == true && bombes.bombes[k] != 9 && i == bombes.coordBombes[k].getX() && j == bombes.coordBombes[k].getY() ){
							temp += bombes.getGraphisme();
							j++;
						}
					}
					if ( i == Link.position.getX() && j == Link.position.getY() ) {
						temp += "  o";
					} else {
						temp += carte[i][j].getGraphisme();
					}
				}
				System.out.println(temp);
			}
		} else if ( posiSousMap_2_2(Link) == true ){
			for ( int i =8; i < 16 ; i++){
				String temp = "";
				for ( int j = 10 ; j < 20 ; j++){
					for ( int k = 0; k < bombes.bombes.length ; k ++){
						if ( bombes.bombeD�pos�e == true && bombes.bombes[k] != 9 && i == bombes.coordBombes[k].getX() && j == bombes.coordBombes[k].getY() ){
							temp += bombes.getGraphisme();
							j++;
						}
					}
					if ( i == Link.position.getX() && j == Link.position.getY() ) {
						temp += "  o";
					} else {
						temp += carte[i][j].getGraphisme();
					}
				}
				System.out.println(temp);
			}
		}
		if ( bombes.bombeD�pos�e == true){
			bombes.d�laiExplosion(carte, ennemieSousMap1);
		}
	}
	

//	position relative par rapport � Link
	
	public static String positionToLinkX(CoordCart ennemie){
		if (Link.position.getX() < ennemie.getX())
			return "droite";
		else if (Link.position.getX() > ennemie.getX())
			return "gauche";
		else
			return "m�me niveau";
	}
	
	public static String positionToLinkY(CoordCart ennemie){
		if (Link.position.getY() < ennemie.getY())
			return "haut";
		else if (Link.position.getY() > ennemie.getY())
			return "bas";
		else {
			return "m�me niveau";
		}
	}
	
//	r�duction de distance � Link
	
	public static void d�placementToLink(CoordCart ennemie){
		if ( positionToLinkX(ennemie) == "droite"){
			ennemie.setX(ennemie.getX()-1);
		} else if (positionToLinkX(ennemie) == "gauche"){
			ennemie.setX(ennemie.getX()+1);
		}
			
		if ( positionToLinkY(ennemie) == "haut"){
			ennemie.setY(ennemie.getY()-1);
		} else if ( positionToLinkY(ennemie) == "bas"){
			ennemie.setY(ennemie.getY()+1);
		}
	}
	

	
//	distance relative par rapport � Link
	
	public static boolean distanceLink(CoordCart ennemie){
		if ( Link.position.distanceTo(ennemie) >1 && Link.position.distanceTo(ennemie) < 3 )
			return true;
		else
			return false;
	}
	
	
//	Main
	
	public static void main(String[] agrs){
		Link.setItems(bouclier);
		Link.setItems(bombes);
		repr�sentation();
		Link.display(carte);
	}
	
}
