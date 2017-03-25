package items;

import com.badlogic.gdx.graphics.Texture;

import characters.MainCharacter;
import map.CadrillageMap;
import map.PlacementMain;
import map.SousMapB1;
import map.SousMapB2;
import characters.Pnj;
import scenes.MainMenu;

public class Epee extends Item{
	
	public static Texture épéeT = new Texture("items/épéeItem.png");

	public Epee(){
		super(épéeT,1);
	}
	
	public static Texture épéeAnvil = new Texture("climatMontagneux/épéeAnvil.png");
	public static Texture pedestal = new Texture("climatMontagneux/pedestal.png");
	public static boolean isEpéePrise = false; // a sauvegarder 
	public static boolean isEpéeUtilisé = false;
	
	public static boolean annimationEpée = false;
	

	public void utilisationItem( MainCharacter cha) {
		isEpéeUtilisé = true;
		if ( cha.getDirection().equals("bas")){
			if ( ((int) cha.getBody().getPosition().y *MainMenu.PPM/ 60 ) -1 >= 0 &&
					CadrillageMap.typeDeDécor[( int) (cha.getBody().getPosition().x *MainMenu.PPM / 60) ][((int) (cha.getBody().getPosition().y*MainMenu.PPM / 60 )) -1 ].equals("HerbesHautes")
					&& CadrillageMap.décorChangé[((int) (cha.getBody().getPosition().x*MainMenu.PPM / 60)) ][((int) (cha.getBody().getPosition().y *MainMenu.PPM/ 60 )) -1] == false
					&& cha.getBody().getPosition().y *MainMenu.PPM / 60 - (int) (cha.getBody().getPosition().y * MainMenu.PPM / 60) < 30/60){
				CadrillageMap.setDécorChangé(( int) (cha.getBody().getPosition().x *MainMenu.PPM/ 60), (int) (cha.getBody().getPosition().y *MainMenu.PPM/ 60) - 1, true);
				CoeurDeVie.remplirCoeurDeVies((int) (cha.getBody().getPosition().x*MainMenu.PPM), (int) (cha.getBody().getPosition().y*MainMenu.PPM -30) );
			}
			
		} else if ( cha.getDirection().equals("haut")){
			if ( ((int) cha.getBody().getPosition().y / 60 ) +1 <= 7 &&
					CadrillageMap.typeDeDécor[( int) (cha.getBody().getPosition().x *MainMenu.PPM / 60) ][((int) (cha.getBody().getPosition().y*MainMenu.PPM / 60 )) +1 ].equals("HerbesHautes")
					&& CadrillageMap.décorChangé[((int) (cha.getBody().getPosition().x*MainMenu.PPM / 60)) ][((int) (cha.getBody().getPosition().y *MainMenu.PPM/ 60 )) +1] == false
					&& (int) (cha.getBody().getPosition().y * MainMenu.PPM / 60) + 1.5 - cha.getBody().getPosition().y *MainMenu.PPM / 60 < 90/60){
				CadrillageMap.setDécorChangé(( int) (cha.getBody().getPosition().x *MainMenu.PPM/ 60), (int) (cha.getBody().getPosition().y *MainMenu.PPM/ 60) + 1, true);
				CoeurDeVie.remplirCoeurDeVies((int) (cha.getBody().getPosition().x*MainMenu.PPM), (int) (cha.getBody().getPosition().y*MainMenu.PPM +30) );
			}
			
		} else if ( cha.getDirection().equals("droite")){
			if ( ((int) cha.getBody().getPosition().x / 60 ) +1 <= 9 &&
					CadrillageMap.typeDeDécor[( int) (cha.getBody().getPosition().x *MainMenu.PPM / 60) +1 ][((int) (cha.getBody().getPosition().y*MainMenu.PPM / 60 ))  ].equals("HerbesHautes")
					&& CadrillageMap.décorChangé[((int) (cha.getBody().getPosition().x*MainMenu.PPM / 60)) +1][((int) (cha.getBody().getPosition().y *MainMenu.PPM/ 60 )) ] == false
					&& (int) (cha.getBody().getPosition().x * MainMenu.PPM / 60) + 1.5 - cha.getBody().getPosition().x *MainMenu.PPM / 60 < 90/60){
				CadrillageMap.setDécorChangé(( int) (cha.getBody().getPosition().x *MainMenu.PPM/ 60)+1, (int) (cha.getBody().getPosition().y *MainMenu.PPM/ 60) , true);
				CoeurDeVie.remplirCoeurDeVies((int) (cha.getBody().getPosition().x*MainMenu.PPM)+30, (int) (cha.getBody().getPosition().y*MainMenu.PPM ) );
			}
			
		} else if ( cha.getDirection() == "gauche"){
			if ( ((int) cha.getBody().getPosition().x / 60 ) -1 >= 0 &&
					CadrillageMap.typeDeDécor[( int) (cha.getBody().getPosition().x *MainMenu.PPM / 60) -1 ][((int) (cha.getBody().getPosition().y*MainMenu.PPM / 60 ))  ].equals("HerbesHautes")
					&& CadrillageMap.décorChangé[((int) (cha.getBody().getPosition().x*MainMenu.PPM / 60)) -1][((int) (cha.getBody().getPosition().y *MainMenu.PPM/ 60 )) ] == false
					&& cha.getBody().getPosition().x *MainMenu.PPM / 60 - (int) (cha.getBody().getPosition().x * MainMenu.PPM / 60) < 30/60 ){
				CadrillageMap.setDécorChangé(( int) (cha.getBody().getPosition().x *MainMenu.PPM/ 60)-1, (int) (cha.getBody().getPosition().y *MainMenu.PPM/ 60) , true);
				CoeurDeVie.remplirCoeurDeVies((int) (cha.getBody().getPosition().x*MainMenu.PPM)-30, (int) (cha.getBody().getPosition().y*MainMenu.PPM ) );
			}
			
		}
		if 	(	CadrillageMap.typeDeDécor[( int) (cha.getBody().getPosition().x *MainMenu.PPM / 60)  ][((int) (cha.getBody().getPosition().y*MainMenu.PPM / 60 ))  ].equals("HerbesHautes")
				&& CadrillageMap.décorChangé[((int) (cha.getBody().getPosition().x*MainMenu.PPM / 60)) ][((int) (cha.getBody().getPosition().y *MainMenu.PPM/ 60 )) ] == false){
			CadrillageMap.setDécorChangé(( int) (cha.getBody().getPosition().x *MainMenu.PPM/ 60), (int) (cha.getBody().getPosition().y *MainMenu.PPM/ 60) , true);
			CoeurDeVie.remplirCoeurDeVies((int) (cha.getBody().getPosition().x*MainMenu.PPM), (int) (cha.getBody().getPosition().y*MainMenu.PPM ) );
		}
		
		
//			vérification que des monstres sont présents
		if ( Pnj.nbrDeMonstres > 0){
			for ( int i = 0; i < Pnj.nbrDeMonstres ; i++){
//					vérification qu'ils soient vivants
				if ( Pnj.monstres[i].isAlive() ){
					if (cha.getDirection().equals("droite")){
						for ( int j = 0 ; j <= 60 ; j ++){
							for ( int k = -20 ; k <= 60 ; k++){
								if ( (int) cha.getBody().getPosition().x +j == (int) Pnj.monstres[i].getBody().getPosition().x 
										&& (int) cha.getBody().getPosition().y +k == (int) Pnj.monstres[i].getBody().getPosition().y ){
									Pnj.monstres[i].subirDégats(cha, cha.getDirection());
									j=121;
									k=121;
								}
							}
						}
					} else if (cha.getDirection().equals("gauche")){
						for ( int j = 0 ; j >= -60 ; j --){
							for ( int k = -20 ; k <= 60 ; k++){
								if ( (int) cha.getBody().getPosition().x +j == (int) Pnj.monstres[i].getBody().getPosition().x 
										&& (int) cha.getBody().getPosition().y +k == (int) Pnj.monstres[i].getBody().getPosition().y ){
									Pnj.monstres[i].subirDégats(cha, cha.getDirection());
									j=-121;
									k=121;
								}
							}
						}
					} else if (cha.getDirection().equals("haut")){
						for ( int j = -20 ; j <= 60 ; j++){
							for ( int k = 0 ; k <= 60 ; k++){
								if ( (int) cha.getBody().getPosition().x +j == (int) Pnj.monstres[i].getBody().getPosition().x 
										&& (int) cha.getBody().getPosition().y +k == (int) Pnj.monstres[i].getBody().getPosition().y ){
									Pnj.monstres[i].subirDégats(cha, cha.getDirection());
									j=121;
									k=121;
								}
							}
						}
					} else if (cha.getDirection().equals("bas")){
						for ( int j = -20 ; j <= 60 ; j++){
							for ( int k = 0 ; k >= -60 ; k--){
								if ( (int) cha.getBody().getPosition().x +j == (int) Pnj.monstres[i].getBody().getPosition().x 
										&& (int) cha.getBody().getPosition().y +k == (int) Pnj.monstres[i].getBody().getPosition().y ){
									Pnj.monstres[i].subirDégats(cha, cha.getDirection());
									j=121;
									k=-121;
								}
							}
						}
					}
				}
			}	
			
		}
		
	}
	
	

	public static Texture linkEpéeGaucheHaut = new Texture("Personnage/linkEpéeGaucheHaute.png");
	public static Texture linkEpéeGaucheBas = new Texture("Personnage/linkEpéeGaucheBasse.png");
	public static Texture linkEpéeBasGauche = new Texture("Personnage/linkEpéeBasGauche.png");
	public static Texture linkEpéeBasDroite = new Texture("Personnage/linkEpéeBasDroite.png");
	public static Texture linkEpéeDroiteHaute = new Texture("Personnage/linkEpéeDroiteHaute.png");
	public static Texture linkEpéeDroiteBasse = new Texture("Personnage/linkEpéeDroiteBasse.png");
	public static Texture linkEpéeHautDroite = new Texture("Personnage/linkEpéeHautDroite.png");
	public static Texture linkEpéeHautGauche = new Texture("Personnage/linkEpéeHautGauche.png");
	public static int etatEpée = 1;
	
	public static long annimation = System.currentTimeMillis();
	
	public void annimationEpée(MainCharacter cha){
		if ( cha.getDirection().equals("gauche")){
			if ( etatEpée == 1 ) {
				cha.setTexture(linkEpéeGaucheHaut);
			} else {
				cha.setTexture(linkEpéeGaucheBas);
			}
		} else if ( cha.getDirection().equals("droite")){
			if ( etatEpée == 1 ) {
				cha.setTexture(linkEpéeDroiteHaute);
			} else {
				cha.setTexture(linkEpéeDroiteBasse);
			}
		} else if ( cha.getDirection().equals("haut")){
			if ( etatEpée == 1 ) {
				cha.setTexture(linkEpéeHautDroite);
			} else {
				cha.setTexture(linkEpéeHautGauche);
			}
		}  else if ( cha.getDirection().equals("bas")){
			if ( etatEpée == 1) {
				cha.setTexture(linkEpéeBasGauche);
			} else {
				cha.setTexture(linkEpéeBasDroite);
				
			}
		} 
		
		if (System.currentTimeMillis() - annimation > 200 ){
			if (etatEpée == 1) {
				etatEpée = 2;
			}else {
				etatEpée = 1;
				isEpéeUtilisé = false;
			}
			annimation = System.currentTimeMillis();
		}
		
	}
	
}
