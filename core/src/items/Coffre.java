package items;

import com.mygdx.game.GameMain;

import characters.MainCharacter;
import decors.ClimatMontagneux;
import decors.DonjonGlace;
import map.CadrillageMap;
import map.zoneGlace.DonjonSalle2;
import map.zoneGlace.PlacementMainZoneGlace;
import map.zoneGlace.SousMapD2;
import map.zoneGlace.SousMapD5;
import map.zoneGlace.SousMapF2;
import map.zoneGlace.SousMapG5;
import map.zoneGlace.SousMapH2;
import map.zoneGlace.SousMapI5;
import scenes.MainMenu;

public class Coffre {
	
	public static long start = System.currentTimeMillis();
	
	
	public static boolean ouvert1 = false;
	public static boolean ouvert2 = false;
	
	public static void annimationCoffreBleu(GameMain game, int x , int y){
			MainMenu.Link.annimationAward = true;
			if ( ! (ouvert1) && ! (ouvert2 )) {
				game.getBatch().draw(ClimatMontagneux.coffreBleuOuvert1, x, y);
				if ( System.currentTimeMillis() - start > 100 ) {
					ouvert1 = true;
					start = System.currentTimeMillis();
				}
			} else if ( ouvert1 && !(ouvert2)) {
				game.getBatch().draw(ClimatMontagneux.coffreBleuOuvert2, x , y);
				if ( System.currentTimeMillis() - start > 100 ){
					ouvert2 = true;
					start = System.currentTimeMillis();
				}
			} else if ( ouvert1 && ouvert2 ){
				game.getBatch().draw(ClimatMontagneux.coffreBleuOuvert3,x,y);
				ouvert1= false;
				ouvert2=false;
		}
	}


	public static void détectionCoffres(MainCharacter Link, float PPM) {
        if (PlacementMainZoneGlace.positionSousMap.equals("F2")) {
            if (CadrillageMap.typeDeDécor[(int) (Link.getBody().getPosition().x * PPM / 60)][(int) (Link.getBody().getPosition().y * PPM / 60) + 1].equals("coffreBleu")) {
                if (! SousMapF2.ouvertureCoffre) MainMenu.bombe.setNombreItem(MainMenu.bombe.getNombreItem() + 20);
                SousMapF2.ouvertureCoffre = true;
            }
        }

        if (PlacementMainZoneGlace.positionSousMap.equals("H2")) {
            if (CadrillageMap.typeDeDécor[(int) (Link.getBody().getPosition().x * PPM / 60)][(int) (Link.getBody().getPosition().y * PPM / 60)].equals("coffreBleu")) {
                SousMapH2.ouvertureCoffre = true;
                DonjonGlace.isCléBossRécupérée = true;
            }
        }
        if (PlacementMainZoneGlace.positionSousMap.equals("G5")) {
            if (CadrillageMap.typeDeDécor[(int) (Link.getBody().getPosition().x * PPM / 60)][(int) (Link.getBody().getPosition().y * PPM / 60)].equals("coffreBleu")) {
                if (! SousMapG5.ouvertureCoffre) {
                    Essence.nombreEssence += 25;
                    if ( Essence.nombreEssence > Essence.essenceMax ) Essence.nombreEssence = 999;
                }
                SousMapG5.ouvertureCoffre = true;
            }
        }
        if (PlacementMainZoneGlace.positionSousMap.equals("D5")) {
            if (CadrillageMap.typeDeDécor[(int) (Link.getBody().getPosition().x * PPM / 60)][(int) (Link.getBody().getPosition().y * PPM / 60) + 1].equals("coffreBleu")) {
                if (! SousMapD5.ouvertureCoffre) {
                    Essence.nombreEssence += 10;
                    if ( Essence.nombreEssence > Essence.essenceMax ) Essence.nombreEssence = 999;
                }
                SousMapD5.ouvertureCoffre = true;
            }
        }
//        if (PlacementMainZoneGlace.positionSousMap.equals("I5")) {
//            if (CadrillageMap.typeDeDécor[(int) (Link.getBody().getPosition().x * PPM / 60)][(int) (Link.getBody().getPosition().y * PPM / 60)].equals("coffreBleu")) {
//                SousMapI5.ouvertureCoffre = true;
//            }
//        }
        if (PlacementMainZoneGlace.positionSousMap.equals("D2")) {
            if (CadrillageMap.typeDeDécor[(int) (Link.getBody().getPosition().x * PPM / 60)][(int) (Link.getBody().getPosition().y * PPM / 60) + 1].equals("coffreBleu")) {
                SousMapD2.ouvertureCoffre = true;
                DonjonGlace.isCléHauteTrouvé = true;
            }
        }
        if (PlacementMainZoneGlace.positionSousMap.equals("DonjonSalle2")) {
            if (CadrillageMap.typeDeDécor[(int) (Link.getBody().getPosition().x * PPM / 60)][(int) (Link.getBody().getPosition().y * PPM / 60)].equals("coffreBleu")) {
                DonjonSalle2.ouvertureCoffre = true;
                DonjonGlace.carteTrouvé = true;
            }
        }
	}
}
