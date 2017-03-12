package items;

import characters.MainCharacter;
import map.Map;
import map.PlacementMain;
import map.SousMapB1;
import scenes.MainMenu;

public class Epee {
//	extends Item

//	public Epée(Texture text){
//		super(text,1);
//	}
	
	public static long startAtt = System.currentTimeMillis();
	
//	static a enlever
	public static void utilisationItem( MainCharacter cha) {
		if (  System.currentTimeMillis() - startAtt > 500 ) {
			if ( cha.getDirection().equals("bas")){
				if ( ((int) cha.getBody().getPosition().y *MainMenu.PPM/ 60 ) -1 >= 0 &&
						Map.typeDeDécor[( int) (cha.getBody().getPosition().x *MainMenu.PPM / 60) ][((int) (cha.getBody().getPosition().y*MainMenu.PPM / 60 )) -1 ].equals("HerbesHautes")
						&& Map.décorChangé[((int) (cha.getBody().getPosition().x*MainMenu.PPM / 60)) ][((int) (cha.getBody().getPosition().y *MainMenu.PPM/ 60 )) -1] == false){
					Map.setDécorChangé(( int) (cha.getBody().getPosition().x *MainMenu.PPM/ 60), (int) (cha.getBody().getPosition().y *MainMenu.PPM/ 60) - 1, true);
					CoeurDeVie.remplirCoeurDeVies((int) (cha.getBody().getPosition().x*MainMenu.PPM), (int) (cha.getBody().getPosition().y*MainMenu.PPM -30) );
				}
				
			} else if ( cha.getDirection().equals("haut")){
				if ( ((int) cha.getBody().getPosition().y / 60 ) +1 <= 7 &&
						Map.typeDeDécor[( int) (cha.getBody().getPosition().x *MainMenu.PPM / 60) ][((int) (cha.getBody().getPosition().y*MainMenu.PPM / 60 )) +1 ].equals("HerbesHautes")
						&& Map.décorChangé[((int) (cha.getBody().getPosition().x*MainMenu.PPM / 60)) ][((int) (cha.getBody().getPosition().y *MainMenu.PPM/ 60 )) +1] == false){
					Map.setDécorChangé(( int) (cha.getBody().getPosition().x *MainMenu.PPM/ 60), (int) (cha.getBody().getPosition().y *MainMenu.PPM/ 60) + 1, true);
					CoeurDeVie.remplirCoeurDeVies((int) (cha.getBody().getPosition().x*MainMenu.PPM), (int) (cha.getBody().getPosition().y*MainMenu.PPM +30) );
				}
				
			} else if ( cha.getDirection().equals("droite")){
				if ( ((int) cha.getBody().getPosition().x / 60 ) +1 <= 9 &&
						Map.typeDeDécor[( int) (cha.getBody().getPosition().x *MainMenu.PPM / 60) +1 ][((int) (cha.getBody().getPosition().y*MainMenu.PPM / 60 ))  ].equals("HerbesHautes")
						&& Map.décorChangé[((int) (cha.getBody().getPosition().x*MainMenu.PPM / 60)) +1][((int) (cha.getBody().getPosition().y *MainMenu.PPM/ 60 )) ] == false){
					Map.setDécorChangé(( int) (cha.getBody().getPosition().x *MainMenu.PPM/ 60)+1, (int) (cha.getBody().getPosition().y *MainMenu.PPM/ 60) , true);
					CoeurDeVie.remplirCoeurDeVies((int) (cha.getBody().getPosition().x*MainMenu.PPM)+30, (int) (cha.getBody().getPosition().y*MainMenu.PPM ) );
				}
				
			} else if ( cha.getDirection() == "gauche"){
				if ( ((int) cha.getBody().getPosition().x / 60 ) -1 >= 0 &&
						Map.typeDeDécor[( int) (cha.getBody().getPosition().x *MainMenu.PPM / 60) -1 ][((int) (cha.getBody().getPosition().y*MainMenu.PPM / 60 ))  ].equals("HerbesHautes")
						&& Map.décorChangé[((int) (cha.getBody().getPosition().x*MainMenu.PPM / 60)) -1][((int) (cha.getBody().getPosition().y *MainMenu.PPM/ 60 )) ] == false){
					Map.setDécorChangé(( int) (cha.getBody().getPosition().x *MainMenu.PPM/ 60)-1, (int) (cha.getBody().getPosition().y *MainMenu.PPM/ 60) , true);
					CoeurDeVie.remplirCoeurDeVies((int) (cha.getBody().getPosition().x*MainMenu.PPM)-30, (int) (cha.getBody().getPosition().y*MainMenu.PPM ) );
				}
				
			}
			if 	(	Map.typeDeDécor[( int) (cha.getBody().getPosition().x *MainMenu.PPM / 60)  ][((int) (cha.getBody().getPosition().y*MainMenu.PPM / 60 ))  ].equals("HerbesHautes")
					&& Map.décorChangé[((int) (cha.getBody().getPosition().x*MainMenu.PPM / 60)) ][((int) (cha.getBody().getPosition().y *MainMenu.PPM/ 60 )) ] == false){
				Map.setDécorChangé(( int) (cha.getBody().getPosition().x *MainMenu.PPM/ 60), (int) (cha.getBody().getPosition().y *MainMenu.PPM/ 60) , true);
				CoeurDeVie.remplirCoeurDeVies((int) (cha.getBody().getPosition().x*MainMenu.PPM), (int) (cha.getBody().getPosition().y*MainMenu.PPM ) );
			}
			if ( PlacementMain.positionSousMap.equals("B1")){
//				vérification que des monstres sont sur cette map
				if ( SousMapB1.monstresPrésent){
					for ( int i = 0; i < SousMapB1.monstres.length ; i++){
//						vérification qu'ils soient vivants
						if ( SousMapB1.monstres[i].isAlive() ){
							if (cha.getDirection().equals("droite")){
								for ( int j = 0 ; j <= 120 ; j ++){
									for ( int k = -60 ; k <= 120 ; k++){
										if ( (int) cha.getBody().getPosition().x +j == (int) SousMapB1.monstres[i].getBody().getPosition().x 
												&& (int) cha.getBody().getPosition().y +k == (int) SousMapB1.monstres[i].getBody().getPosition().y ){
											SousMapB1.monstres[i].subirDégats(cha, cha.getDirection());
											j=121;
											k=121;
										}
									}
								}
							} else if (cha.getDirection().equals("gauche")){
								for ( int j = 0 ; j >= -120 ; j --){
									for ( int k = -60 ; k <= 120 ; k++){
										if ( (int) cha.getBody().getPosition().x +j == (int) SousMapB1.monstres[i].getBody().getPosition().x 
												&& (int) cha.getBody().getPosition().y +k == (int) SousMapB1.monstres[i].getBody().getPosition().y ){
											SousMapB1.monstres[i].subirDégats(cha, cha.getDirection());
											j=-121;
											k=121;
										}
									}
								}
							} else if (cha.getDirection().equals("haut")){
								for ( int j = -60 ; j <= 120 ; j++){
									for ( int k = 0 ; k <= 120 ; k++){
										if ( (int) cha.getBody().getPosition().x +j == (int) SousMapB1.monstres[i].getBody().getPosition().x 
												&& (int) cha.getBody().getPosition().y +k == (int) SousMapB1.monstres[i].getBody().getPosition().y ){
											SousMapB1.monstres[i].subirDégats(cha, cha.getDirection());
											j=121;
											k=121;
										}
									}
								}
							} else if (cha.getDirection().equals("bas")){
								for ( int j = -60 ; j <= 120 ; j++){
									for ( int k = 0 ; k >= -120 ; k--){
										if ( (int) cha.getBody().getPosition().x +j == (int) SousMapB1.monstres[i].getBody().getPosition().x 
												&& (int) cha.getBody().getPosition().y +k == (int) SousMapB1.monstres[i].getBody().getPosition().y ){
											SousMapB1.monstres[i].subirDégats(cha, cha.getDirection());
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
			startAtt = System.currentTimeMillis();
		}
	}
	
}
