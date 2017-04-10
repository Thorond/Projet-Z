package items;

import com.badlogic.gdx.graphics.Texture;

import characters.MainCharacter;
import map.CadrillageMap;
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

	public static Texture texteEpée = new Texture("texte/texteEpée.png");;

	public void utilisationItem( MainCharacter cha) {
		isEpéeUtilisé = true;

//		**** récupération item grâce à épée ****
		CoeurDeVie.détectionCoeurEpée(cha);
		Essence.détectionEssenceEpée(cha);

		MainMenu.Link.getBody().setLinearVelocity(MainMenu.Link.getBody().getLinearVelocity().x / 100f, MainMenu.Link.getBody().getLinearVelocity().y / 100f);
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
				Essence.remplirEssences((int) (cha.getBody().getPosition().x*MainMenu.PPM), (int) (cha.getBody().getPosition().y*MainMenu.PPM ));
			}
			
		} else if ( cha.getDirection().equals("droite")){
			if ( ((int) cha.getBody().getPosition().x / 60 ) +1 <= 9 &&
					CadrillageMap.typeDeDécor[( int) (cha.getBody().getPosition().x *MainMenu.PPM / 60) +1 ][((int) (cha.getBody().getPosition().y*MainMenu.PPM / 60 ))  ].equals("HerbesHautes")
					&& CadrillageMap.décorChangé[((int) (cha.getBody().getPosition().x*MainMenu.PPM / 60)) +1][((int) (cha.getBody().getPosition().y *MainMenu.PPM/ 60 )) ] == false
					&& (int) (cha.getBody().getPosition().x * MainMenu.PPM / 60) + 1.5 - cha.getBody().getPosition().x *MainMenu.PPM / 60 < 90/60){
				CadrillageMap.setDécorChangé(( int) (cha.getBody().getPosition().x *MainMenu.PPM/ 60)+1, (int) (cha.getBody().getPosition().y *MainMenu.PPM/ 60) , true);
				CoeurDeVie.remplirCoeurDeVies((int) (cha.getBody().getPosition().x*MainMenu.PPM)+30, (int) (cha.getBody().getPosition().y*MainMenu.PPM ) );
				Essence.remplirEssences((int) (cha.getBody().getPosition().x*MainMenu.PPM), (int) (cha.getBody().getPosition().y*MainMenu.PPM ));
			}
			
		} else if ( cha.getDirection() == "gauche"){
			if ( ((int) cha.getBody().getPosition().x / 60 ) -1 >= 0 &&
					CadrillageMap.typeDeDécor[( int) (cha.getBody().getPosition().x *MainMenu.PPM / 60) -1 ][((int) (cha.getBody().getPosition().y*MainMenu.PPM / 60 ))  ].equals("HerbesHautes")
					&& CadrillageMap.décorChangé[((int) (cha.getBody().getPosition().x*MainMenu.PPM / 60)) -1][((int) (cha.getBody().getPosition().y *MainMenu.PPM/ 60 )) ] == false
					&& cha.getBody().getPosition().x *MainMenu.PPM / 60 - (int) (cha.getBody().getPosition().x * MainMenu.PPM / 60) < 30/60 ){
				CadrillageMap.setDécorChangé(( int) (cha.getBody().getPosition().x *MainMenu.PPM/ 60)-1, (int) (cha.getBody().getPosition().y *MainMenu.PPM/ 60) , true);
				CoeurDeVie.remplirCoeurDeVies((int) (cha.getBody().getPosition().x*MainMenu.PPM)-30, (int) (cha.getBody().getPosition().y*MainMenu.PPM ) );
				Essence.remplirEssences((int) (cha.getBody().getPosition().x*MainMenu.PPM), (int) (cha.getBody().getPosition().y*MainMenu.PPM ));
			}
			
		}
		if 	(	CadrillageMap.typeDeDécor[( int) (cha.getBody().getPosition().x *MainMenu.PPM / 60)  ][((int) (cha.getBody().getPosition().y*MainMenu.PPM / 60 ))  ].equals("HerbesHautes")
				&& CadrillageMap.décorChangé[((int) (cha.getBody().getPosition().x*MainMenu.PPM / 60)) ][((int) (cha.getBody().getPosition().y *MainMenu.PPM/ 60 )) ] == false){
			CadrillageMap.setDécorChangé(( int) (cha.getBody().getPosition().x *MainMenu.PPM/ 60), (int) (cha.getBody().getPosition().y *MainMenu.PPM/ 60) , true);
			CoeurDeVie.remplirCoeurDeVies((int) (cha.getBody().getPosition().x*MainMenu.PPM), (int) (cha.getBody().getPosition().y*MainMenu.PPM ) );
			Essence.remplirEssences((int) (cha.getBody().getPosition().x*MainMenu.PPM), (int) (cha.getBody().getPosition().y*MainMenu.PPM ));
		}
		
		
//			vérification que des monstres sont présents
		if ( Pnj.nbrDeMonstres > 0){
			for ( int i = 0; i < Pnj.nbrDeMonstres ; i++){
//					vérification qu'ils soient vivants
				if ( Pnj.monstres[i].isAlive() ){
					if (cha.getDirection().equals("droite")){
						if ( (int) cha.getBody().getPosition().x <= (int) Pnj.monstres[i].getBody().getPosition().x
								&& (int) cha.getBody().getPosition().x + 60 >= (int) Pnj.monstres[i].getBody().getPosition().x
								&& (int) cha.getBody().getPosition().y -20 <= (int) Pnj.monstres[i].getBody().getPosition().y
								&& (int) cha.getBody().getPosition().y +60 >= (int) Pnj.monstres[i].getBody().getPosition().y ){
							Pnj.monstres[i].subirDégats(cha.getStrength(), cha.getDirection());
						}
					} else if (cha.getDirection().equals("gauche")){
						if ( (int) cha.getBody().getPosition().x >= (int) Pnj.monstres[i].getBody().getPosition().x
								&& (int) cha.getBody().getPosition().x -60 <= (int) Pnj.monstres[i].getBody().getPosition().x
								&& (int) cha.getBody().getPosition().y -20 <= (int) Pnj.monstres[i].getBody().getPosition().y
								&& (int) cha.getBody().getPosition().y +60 >= (int) Pnj.monstres[i].getBody().getPosition().y  ){
							Pnj.monstres[i].subirDégats(cha.getStrength(), cha.getDirection());
						}
					} else if (cha.getDirection().equals("haut")){
						if ( (int) cha.getBody().getPosition().x -20 <= (int) Pnj.monstres[i].getBody().getPosition().x
								&& (int) cha.getBody().getPosition().x + 60 >= (int) Pnj.monstres[i].getBody().getPosition().x
								&& (int) cha.getBody().getPosition().y  <= (int) Pnj.monstres[i].getBody().getPosition().y
								&& (int) cha.getBody().getPosition().y +60 >= (int) Pnj.monstres[i].getBody().getPosition().y ){
							Pnj.monstres[i].subirDégats(cha.getStrength(), cha.getDirection());
						}
					} else if (cha.getDirection().equals("bas")){
						if ( (int) cha.getBody().getPosition().x -20 <= (int) Pnj.monstres[i].getBody().getPosition().x
								&& (int) cha.getBody().getPosition().x + 60 >= (int) Pnj.monstres[i].getBody().getPosition().x
								&& (int) cha.getBody().getPosition().y >= (int) Pnj.monstres[i].getBody().getPosition().y
								&& (int) cha.getBody().getPosition().y -60 <= (int) Pnj.monstres[i].getBody().getPosition().y){
							Pnj.monstres[i].subirDégats(cha.getStrength(), cha.getDirection());
						}
					}
				}
			}	
		}
		
	}
	
	
	public static Texture linkEpéeGaucheHauteDroite = new Texture("Personnage/linkEpéeGaucheHauteDroite.png");
	public static Texture linkEpéeGaucheHaut = new Texture("Personnage/linkEpéeGaucheHaute.png");
	public static Texture linkEpéeGaucheBas = new Texture("Personnage/linkEpéeGaucheBasse.png");
	public static Texture linkEpéeBasGaucheHaut = new Texture("Personnage/linkEpéeBasGaucheHaut.png");
	public static Texture linkEpéeBasGauche = new Texture("Personnage/linkEpéeBasGauche.png");
	public static Texture linkEpéeBasDroite = new Texture("Personnage/linkEpéeBasDroite.png");
	public static Texture linkEpéeDroiteHauteGauche = new Texture("Personnage/linkEpéeDroiteHauteGauche.png");
	public static Texture linkEpéeDroiteHaute = new Texture("Personnage/linkEpéeDroiteHaute.png");
	public static Texture linkEpéeDroiteBasse = new Texture("Personnage/linkEpéeDroiteBasse.png");
	public static Texture linkEpéeHautDroiteBas = new Texture("Personnage/linkEpéeHautDroiteBas.png");
	public static Texture linkEpéeHautDroite = new Texture("Personnage/linkEpéeHautDroite.png");
	public static Texture linkEpéeHautGauche = new Texture("Personnage/linkEpéeHautGauche.png");
	public static int etatEpée = 0;
	
	public static long annimation = System.currentTimeMillis();
	
	public void annimationEpée(MainCharacter cha){
		if (System.currentTimeMillis() - annimation > 70 ){
			if (etatEpée == 0) {
				etatEpée = 1;
			} else if (etatEpée == 1) {
				etatEpée = 2;
			} else if (etatEpée == 2) {
				etatEpée = 3;
			} else {
				etatEpée = 0;
				isEpéeUtilisé = false;
			}
			annimation = System.currentTimeMillis();
		}
		
		if ( cha.getDirection().equals("gauche")){
			if ( etatEpée == 1 ) {
				cha.setTexture(linkEpéeGaucheHauteDroite);
			} else if ( etatEpée == 2 ) {
				cha.setTexture(linkEpéeGaucheHaut);
			} else if (etatEpée == 3) {
				cha.setTexture(linkEpéeGaucheBas);
			} else cha.setTexture(MainCharacter.linkGaucheRepos);
		} else if ( cha.getDirection().equals("droite")){
			if ( etatEpée == 1 ) {
				cha.setTexture(linkEpéeDroiteHauteGauche);
			} else if ( etatEpée == 2 ) {
				cha.setTexture(linkEpéeDroiteHaute);
			} else if (etatEpée == 3) {
				cha.setTexture(linkEpéeDroiteBasse);
			}
		} else if ( cha.getDirection().equals("haut")){
			if ( etatEpée == 1 ) {
				cha.setTexture(linkEpéeHautDroiteBas);
			} else if ( etatEpée == 2 ) {
				cha.setTexture(linkEpéeHautDroite);
			} else if (etatEpée == 3) {
				cha.setTexture(linkEpéeHautGauche);
			}
		}  else if ( cha.getDirection().equals("bas")){
			if ( etatEpée == 1) {
				cha.setTexture(linkEpéeBasGaucheHaut);
			} else if ( etatEpée == 2) {
				cha.setTexture(linkEpéeBasGauche);
			} else if (etatEpée == 3) {
				cha.setTexture(linkEpéeBasDroite);
			}  else cha.setTexture(MainCharacter.linkBasRepos);
		} 
		
		
		
		
	}
	
}
