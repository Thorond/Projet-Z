package map;

import com.mygdx.game.GameMain;

import scenes.MainMenu;

public class GestionDesMaps {
	
	public static void défilementDeMap(GameMain game){
		MainMenu.Link.getBody().setLinearVelocity(MainMenu.Link.getBody().getLinearVelocity().x / 1.4f, MainMenu.Link.getBody().getLinearVelocity().y / 1.4f);
//			=============================================================================================
//			                                    changement de map/défilement
//			=============================================================================================
			if ( PlacementMain.direction.equals("gauche")){
				MainMenu.Link.getBody().setTransform(MainMenu.Link.getBody().getPosition().x +10.05f, MainMenu.Link.getBody().getPosition().y  , 0);
				
				if ( PlacementMain.positionSousMap.equals("A1") ) {
					SousMapA1.sousMap(game,-600 + PlacementMain.x,0);
					SousMapB1.sousMap(game, PlacementMain.x, 0);
				} else if ( PlacementMain.positionSousMap.equals("B1") ) {
					SousMapB1.sousMap(game,-600 + PlacementMain.x,0);
					SousMapC1.sousMap(game, PlacementMain.x, 0);
				} else if ( PlacementMain.positionSousMap.equals("C1") ) {
					SousMapC1.sousMap(game,-600 + PlacementMain.x,0);
					SousMapD1.sousMap(game, PlacementMain.x, 0);
				} else if ( PlacementMain.positionSousMap.equals("D1") ) {
					SousMapD1.sousMap(game,-600 + PlacementMain.x,0);
					SousMapE1.sousMap(game, PlacementMain.x, 0);
				} else if ( PlacementMain.positionSousMap.equals("E1") ) {
					SousMapE1.sousMap(game,-600 + PlacementMain.x,0);
					SousMapF1.sousMap(game, PlacementMain.x, 0);
				} else if ( PlacementMain.positionSousMap.equals("A2") ) {
					SousMapB2.sousMap(game, 0 + PlacementMain.x, 0);
					SousMapA2.sousMap(game, -600 + PlacementMain.x,0);
				} else if ( PlacementMain.positionSousMap.equals("B2") ) {
					SousMapC2.sousMap(game, 0 + PlacementMain.x, 0);
					SousMapB2.sousMap(game, -600 + PlacementMain.x,0);
				} else if (PlacementMain.positionSousMap.equals("C2")){
					SousMapD2.sousMap(game, 0 + PlacementMain.x, 0);
					SousMapC2.sousMap(game, -600 + PlacementMain.x,0);
				} else if (PlacementMain.positionSousMap.equals("D2")){
					SousMapE2.sousMap(game, 0 + PlacementMain.x, 0);
					SousMapD2.sousMap(game, -600 + PlacementMain.x,0);
				} else if (PlacementMain.positionSousMap.equals("E2")){
					SousMapF2.sousMap(game, 0 + PlacementMain.x, 0);
					SousMapE2.sousMap(game, -600 + PlacementMain.x,0);
				} else if ( PlacementMain.positionSousMap.equals("A3") ) {
					SousMapB3.sousMap(game, 0 + PlacementMain.x, 0);
					SousMapA3.sousMap(game, -600 + PlacementMain.x,0);
				} else if ( PlacementMain.positionSousMap.equals("B3") ) {
					SousMapC3.sousMap(game, 0 + PlacementMain.x, 0);
					SousMapB3.sousMap(game, -600 + PlacementMain.x,0);
				} else if (PlacementMain.positionSousMap.equals("C3")){
					SousMapD3.sousMap(game, 0 + PlacementMain.x, 0);
					SousMapC3.sousMap(game, -600 + PlacementMain.x,0);
				} else if (PlacementMain.positionSousMap.equals("D3")){
					SousMapE3.sousMap(game, 0 + PlacementMain.x, 0);
					SousMapD3.sousMap(game, -600 + PlacementMain.x,0);
				} else if (PlacementMain.positionSousMap.equals("E3")){
					SousMapF3.sousMap(game, 0 + PlacementMain.x, 0);
					SousMapE3.sousMap(game, -600 + PlacementMain.x,0);
				} else if ( PlacementMain.positionSousMap.equals("A4") ) {
					SousMapB4.sousMap(game, 0 + PlacementMain.x, 0);
					SousMapA4.sousMap(game, -600 + PlacementMain.x,0);
				} else if ( PlacementMain.positionSousMap.equals("B4") ) {
					SousMapC4.sousMap(game, 0 + PlacementMain.x, 0);
					SousMapB4.sousMap(game, -600 + PlacementMain.x,0);
				} else if (PlacementMain.positionSousMap.equals("C4")){
					SousMapD4.sousMap(game, 0 + PlacementMain.x, 0);
					SousMapC4.sousMap(game, -600 + PlacementMain.x,0);
				} else if (PlacementMain.positionSousMap.equals("D4")){
					SousMapE4.sousMap(game, 0 + PlacementMain.x, 0);
					SousMapD4.sousMap(game, -600 + PlacementMain.x,0);
				} else if (PlacementMain.positionSousMap.equals("E4")){
					SousMapF4.sousMap(game, 0 + PlacementMain.x, 0);
					SousMapE4.sousMap(game, -600 + PlacementMain.x,0);
				}
				if ( System.currentTimeMillis() - PlacementMain.start > 10) {
					PlacementMain.x+=15;
					PlacementMain.start = System.currentTimeMillis();
				}
			} else if ( PlacementMain.direction.equals("droite")){
				MainMenu.Link.getBody().setTransform(MainMenu.Link.getBody().getPosition().x -10.1f, MainMenu.Link.getBody().getPosition().y  , 0);
				
				if ( PlacementMain.positionSousMap.equals("A1") ) {
				} else if ( PlacementMain.positionSousMap.equals("B1") ) {
					SousMapA1.sousMap(game,0- PlacementMain.x,0);
					SousMapB1.sousMap(game,600 - PlacementMain.x,0);
				} else if ( PlacementMain.positionSousMap.equals("C1") ) {
					SousMapB1.sousMap(game,0- PlacementMain.x,0);
					SousMapC1.sousMap(game,600 - PlacementMain.x,0);
				} else if ( PlacementMain.positionSousMap.equals("D1") ) {
					SousMapC1.sousMap(game,0- PlacementMain.x,0);
					SousMapD1.sousMap(game,600 - PlacementMain.x,0);
				} else if ( PlacementMain.positionSousMap.equals("E1") ) {
					SousMapD1.sousMap(game,0- PlacementMain.x,0);
					SousMapE1.sousMap(game,600 - PlacementMain.x,0);
				} else if ( PlacementMain.positionSousMap.equals("F1") ) {
					SousMapE1.sousMap(game,0- PlacementMain.x,0);
					SousMapF1.sousMap(game,600 - PlacementMain.x,0);
				} else if ( PlacementMain.positionSousMap.equals("A2") ) {
				} else if ( PlacementMain.positionSousMap.equals("B2") ) {
					SousMapA2.sousMap(game, 0- PlacementMain.x,0);
					SousMapB2.sousMap(game, 600- PlacementMain.x, 0);
				} else if ( PlacementMain.positionSousMap.equals("C2") ) {
					SousMapB2.sousMap(game, 0- PlacementMain.x,0);
					SousMapC2.sousMap(game, 600- PlacementMain.x, 0);
				} else if ( PlacementMain.positionSousMap.equals("D2") ) {
					SousMapC2.sousMap(game, 0- PlacementMain.x,0);
					SousMapD2.sousMap(game, 600- PlacementMain.x, 0);
				} else if ( PlacementMain.positionSousMap.equals("E2") ) {
					SousMapD2.sousMap(game, 0- PlacementMain.x,0);
					SousMapE2.sousMap(game, 600- PlacementMain.x, 0);
				} else if ( PlacementMain.positionSousMap.equals("F2") ) {
					SousMapE2.sousMap(game, 0- PlacementMain.x,0);
					SousMapF2.sousMap(game, 600- PlacementMain.x, 0);
				} else if ( PlacementMain.positionSousMap.equals("A3") ) {
				} else if ( PlacementMain.positionSousMap.equals("B3") ) {
					SousMapA3.sousMap(game, 0- PlacementMain.x,0);
					SousMapB3.sousMap(game, 600- PlacementMain.x, 0);
				} else if ( PlacementMain.positionSousMap.equals("C3") ) {
					SousMapB3.sousMap(game, 0- PlacementMain.x,0);
					SousMapC3.sousMap(game, 600- PlacementMain.x, 0);
				} else if ( PlacementMain.positionSousMap.equals("D3") ) {
					SousMapC3.sousMap(game, 0- PlacementMain.x,0);
					SousMapD3.sousMap(game, 600- PlacementMain.x, 0);
				} else if ( PlacementMain.positionSousMap.equals("E3") ) {
					SousMapD3.sousMap(game, 0- PlacementMain.x,0);
					SousMapE3.sousMap(game, 600- PlacementMain.x, 0);
				} else if ( PlacementMain.positionSousMap.equals("F3") ) {
					SousMapE3.sousMap(game, 0- PlacementMain.x,0);
					SousMapF3.sousMap(game, 600- PlacementMain.x, 0);
				} else if ( PlacementMain.positionSousMap.equals("A4") ) {
				} else if ( PlacementMain.positionSousMap.equals("B4") ) {
					SousMapA4.sousMap(game, 0- PlacementMain.x,0);
					SousMapB4.sousMap(game, 600- PlacementMain.x, 0);
				} else if ( PlacementMain.positionSousMap.equals("C4") ) {
					SousMapB4.sousMap(game, 0- PlacementMain.x,0);
					SousMapC4.sousMap(game, 600- PlacementMain.x, 0);
				} else if ( PlacementMain.positionSousMap.equals("D4") ) {
					SousMapC4.sousMap(game, 0- PlacementMain.x,0);
					SousMapD4.sousMap(game, 600- PlacementMain.x, 0);
				} else if ( PlacementMain.positionSousMap.equals("E4") ) {
					SousMapD4.sousMap(game, 0- PlacementMain.x,0);
					SousMapE4.sousMap(game, 600- PlacementMain.x, 0);
				} else if ( PlacementMain.positionSousMap.equals("F4") ) {
					SousMapE4.sousMap(game, 0- PlacementMain.x,0);
					SousMapF4.sousMap(game, 600- PlacementMain.x, 0);
				}
				if ( System.currentTimeMillis() - PlacementMain.start > 10) {
					PlacementMain.x+=15;
					PlacementMain.start = System.currentTimeMillis();
				}
			} else if ( PlacementMain.direction.equals("bas")){
				MainMenu.Link.getBody().setTransform(MainMenu.Link.getBody().getPosition().x , MainMenu.Link.getBody().getPosition().y +9.9f , 0);
				
				if ( PlacementMain.positionSousMap.equals("A1") ) {
				} else if ( PlacementMain.positionSousMap.equals("B1") ) {
				} else if ( PlacementMain.positionSousMap.equals("C1") ) {
				} else if ( PlacementMain.positionSousMap.equals("D1") ) {
				} else if ( PlacementMain.positionSousMap.equals("E1") ) {
				} else if ( PlacementMain.positionSousMap.equals("F1") ) {
				} else if ( PlacementMain.positionSousMap.equals("A2") ) {
					SousMapA1.sousMap(game,0,0+ PlacementMain.y);
					SousMapA2.sousMap(game, 0,-480 + PlacementMain.y );
				} else if ( PlacementMain.positionSousMap.equals("B2") ) {
					SousMapB2.sousMap(game, 0, -480 + PlacementMain.y);
					SousMapB1.sousMap(game, 0, PlacementMain.y);
				} else if ( PlacementMain.positionSousMap.equals("C2") ) {
					SousMapC1.sousMap(game, 0, PlacementMain.y);
					SousMapC2.sousMap(game, 0, -480 + PlacementMain.y);
				} else if ( PlacementMain.positionSousMap.equals("D2") ) {
					SousMapD2.sousMap(game, 0, -480 + PlacementMain.y);
					SousMapD1.sousMap(game, 0, PlacementMain.y);
				} else if ( PlacementMain.positionSousMap.equals("E2") ) {
					SousMapE2.sousMap(game, 0, -480 + PlacementMain.y);
					SousMapE1.sousMap(game, 0, PlacementMain.y);
				} else if ( PlacementMain.positionSousMap.equals("F2") ) {
					SousMapF2.sousMap(game, 0, -480 + PlacementMain.y);
					SousMapF1.sousMap(game, 0, PlacementMain.y);
				} else if ( PlacementMain.positionSousMap.equals("A3") ) {
					SousMapA2.sousMap(game,0, PlacementMain.y);
					SousMapA3.sousMap(game, 0,-480 + PlacementMain.y );
				} else if ( PlacementMain.positionSousMap.equals("B3") ) {
					SousMapB3.sousMap(game, 0, -480 + PlacementMain.y);
					SousMapB2.sousMap(game, 0, PlacementMain.y);
				} else if ( PlacementMain.positionSousMap.equals("C3") ) {
					SousMapC3.sousMap(game, 0, -480 + PlacementMain.y);
					SousMapC2.sousMap(game, 0, PlacementMain.y);
				} else if ( PlacementMain.positionSousMap.equals("D3") ) {
					SousMapD3.sousMap(game, 0, -480 + PlacementMain.y);
					SousMapD2.sousMap(game, 0, PlacementMain.y);
				} else if ( PlacementMain.positionSousMap.equals("E3") ) {
					SousMapE3.sousMap(game, 0, -480 + PlacementMain.y);
					SousMapE2.sousMap(game, 0, PlacementMain.y);
				} else if ( PlacementMain.positionSousMap.equals("F3") ) {
					SousMapF3.sousMap(game, 0, -480 + PlacementMain.y);
					SousMapF2.sousMap(game, 0, PlacementMain.y);
				} else if ( PlacementMain.positionSousMap.equals("A4") ) {
					SousMapA3.sousMap(game,0,0+ PlacementMain.y);
					SousMapA4.sousMap(game, 0,-480 + PlacementMain.y );
				} else if ( PlacementMain.positionSousMap.equals("B4") ) {
					SousMapB4.sousMap(game, 0, -480 + PlacementMain.y);
					SousMapB3.sousMap(game, 0, PlacementMain.y);
				} else if ( PlacementMain.positionSousMap.equals("C4") ) {
					SousMapC4.sousMap(game, 0, -480 + PlacementMain.y);
					SousMapC3.sousMap(game, 0, PlacementMain.y);
				} else if ( PlacementMain.positionSousMap.equals("D4") ) {
					SousMapD4.sousMap(game, 0, -480 + PlacementMain.y);
					SousMapD3.sousMap(game, 0, PlacementMain.y);
				} else if ( PlacementMain.positionSousMap.equals("E4") ) {
					SousMapE3.sousMap(game, 0, PlacementMain.y);
					SousMapE4.sousMap(game, 0, -480 + PlacementMain.y);
				} else if ( PlacementMain.positionSousMap.equals("F4") ) {
					SousMapF4.sousMap(game, 0, -480 + PlacementMain.y);
					SousMapF3.sousMap(game, 0, PlacementMain.y);
				}
				if ( System.currentTimeMillis() - PlacementMain.start > 10) {
					PlacementMain.y+=15;
					PlacementMain.start = System.currentTimeMillis();
				}
			} else if ( PlacementMain.direction.equals("haut")){
				if ( System.currentTimeMillis() - PlacementMain.start > 10) {
					MainMenu.Link.getBody().setTransform(MainMenu.Link.getBody().getPosition().x , MainMenu.Link.getBody().getPosition().y -10 , 0);
				}
				if ( PlacementMain.positionSousMap.equals("A1") ) {
					SousMapA1.sousMap(game,0,480- PlacementMain.y);
					SousMapA2.sousMap(game, 0,0- PlacementMain.y );
				} else if ( PlacementMain.positionSousMap.equals("B1") ) {
					SousMapB2.sousMap(game, 0, 0-PlacementMain.y);
					SousMapB1.sousMap(game, 0, 480-PlacementMain.y);
				} else if ( PlacementMain.positionSousMap.equals("C1") ) {
					SousMapC2.sousMap(game, 0, 0-PlacementMain.y);
					SousMapC1.sousMap(game, 0, 480-PlacementMain.y);
				} else if ( PlacementMain.positionSousMap.equals("D1") ) {
					SousMapD2.sousMap(game, 0, 0-PlacementMain.y);
					SousMapD1.sousMap(game, 0, 480-PlacementMain.y);
				} else if ( PlacementMain.positionSousMap.equals("E1") ) {
					SousMapE2.sousMap(game, 0, 0-PlacementMain.y);
					SousMapE1.sousMap(game, 0, 480-PlacementMain.y);
				} else if ( PlacementMain.positionSousMap.equals("F1") ) {
					SousMapF2.sousMap(game, 0, 0-PlacementMain.y);
					SousMapF1.sousMap(game, 0, 480-PlacementMain.y);
				} else if ( PlacementMain.positionSousMap.equals("A2") ) {
					SousMapA2.sousMap(game,0,480- PlacementMain.y);
					SousMapA3.sousMap(game, 0,0- PlacementMain.y );
				} else if ( PlacementMain.positionSousMap.equals("B2") ) {
					SousMapB3.sousMap(game, 0, 0-PlacementMain.y);
					SousMapB2.sousMap(game, 0, 480-PlacementMain.y);
				} else if ( PlacementMain.positionSousMap.equals("C2") ) {
					SousMapC3.sousMap(game, 0, 0-PlacementMain.y);
					SousMapC2.sousMap(game, 0, 480-PlacementMain.y);
				} else if ( PlacementMain.positionSousMap.equals("D2") ) {
					SousMapD3.sousMap(game, 0, 0-PlacementMain.y);
					SousMapD2.sousMap(game, 0, 480-PlacementMain.y);
				} else if ( PlacementMain.positionSousMap.equals("E2") ) {
					SousMapE3.sousMap(game, 0, 0-PlacementMain.y);
					SousMapE2.sousMap(game, 0, 480-PlacementMain.y);
				} else if ( PlacementMain.positionSousMap.equals("F2") ) {
					SousMapF3.sousMap(game, 0, 0-PlacementMain.y);
					SousMapF2.sousMap(game, 0, 480-PlacementMain.y);
				} else if ( PlacementMain.positionSousMap.equals("A3") ) {
					SousMapA3.sousMap(game,0,480- PlacementMain.y);
					SousMapA4.sousMap(game, 0,0- PlacementMain.y );
				} else if ( PlacementMain.positionSousMap.equals("B3") ) {
					SousMapB4.sousMap(game, 0, 0-PlacementMain.y);
					SousMapB3.sousMap(game, 0, 480-PlacementMain.y);
				} else if ( PlacementMain.positionSousMap.equals("C3") ) {
					SousMapC4.sousMap(game, 0, 0-PlacementMain.y);
					SousMapC3.sousMap(game, 0, 480-PlacementMain.y);
				} else if ( PlacementMain.positionSousMap.equals("D3") ) {
					SousMapD4.sousMap(game, 0, 0-PlacementMain.y);
					SousMapD3.sousMap(game, 0, 480-PlacementMain.y);
				} else if ( PlacementMain.positionSousMap.equals("E3") ) {
					SousMapE3.sousMap(game, 0, 480-PlacementMain.y);
					SousMapE4.sousMap(game, 0, 0-PlacementMain.y);
				} else if ( PlacementMain.positionSousMap.equals("F3") ) {
					SousMapF4.sousMap(game, 0, 0-PlacementMain.y);
					SousMapF3.sousMap(game, 0, 480-PlacementMain.y);
				}
				if ( System.currentTimeMillis() - PlacementMain.start > 10) {
					PlacementMain.y+=15;
					PlacementMain.start = System.currentTimeMillis();
				}
			}
			
			if ( PlacementMain.x == 600) {
				PlacementMain.défilement = false;
				PlacementMain.x = 0;
			}
			if ( PlacementMain.y == 480) {
				PlacementMain.défilement = false;
				PlacementMain.y = 0;
			}
	}
	
	
//	 ===========================================================================================================
//	 ===========================================================================================================
//	 ===========================================================================================================
//	 ===========================================================================================================
//	 ===========================================================================================================
	
	public static void affichageDeSousCarte(GameMain game){
//		=============================================================================================
//                  					  affichage de la sous carte
//			=============================================================================================
			if ( PlacementMain.positionSousMap.equals("A1")) {
				SousMapA1.createBodyAndType(MainMenu.world);
				SousMapA1.sousMap(game, 0,0);
			}
			else if ( PlacementMain.positionSousMap.equals("B1")) {
				SousMapB1.createBodyAndType(MainMenu.world);
				SousMapB1.sousMap(game, 0,0);
			}
			else if ( PlacementMain.positionSousMap.equals("C1")) {
				SousMapC1.createBodyAndType(MainMenu.world);
				SousMapC1.sousMap(game, 0, 0);
			}
			else if ( PlacementMain.positionSousMap.equals("D1")) {
				SousMapD1.createBodyAndType(MainMenu.world);
				SousMapD1.sousMap(game, 0, 0);
			}
			else if ( PlacementMain.positionSousMap.equals("E1")) {
				SousMapE1.createBodyAndType(MainMenu.world);
				SousMapE1.sousMap(game, 0, 0);
			}
			else if ( PlacementMain.positionSousMap.equals("F1")) {
				SousMapF1.createBodyAndType(MainMenu.world);
				SousMapF1.sousMap(game, 0, 0);
			}
			else if ( PlacementMain.positionSousMap.equals("A2")){
				SousMapA2.createBodyAndType(MainMenu.world);
				SousMapA2.sousMap(game, 0,0 );
			}
			else if ( PlacementMain.positionSousMap.equals("B2")) {
				SousMapB2.destroyType();
				SousMapB2.createBodyAndType(MainMenu.world);
				SousMapB2.sousMap(game, 0, 0);
			}
			else if ( PlacementMain.positionSousMap.equals("C2")) {
				SousMapC2.destroyType();
				SousMapC2.createBodyAndType(MainMenu.world);
				SousMapC2.sousMap(game, 0, 0);
			}
			else if ( PlacementMain.positionSousMap.equals("D2")) {
				SousMapD2.destroyType();
				SousMapD2.createBodyAndType(MainMenu.world);
				SousMapD2.sousMap(game, 0, 0);
			}
			else if ( PlacementMain.positionSousMap.equals("E2")) {
				SousMapE2.destroyType();
				SousMapE2.createBodyAndType(MainMenu.world);
				SousMapE2.sousMap(game, 0, 0);
			}
			else if ( PlacementMain.positionSousMap.equals("F2")) {
				SousMapF2.destroyType();
				SousMapF2.createBodyAndType(MainMenu.world);
				SousMapF2.sousMap(game, 0, 0);
			}
			else if ( PlacementMain.positionSousMap.equals("A3")){
				SousMapA3.createBodyAndType(MainMenu.world);
				SousMapA3.sousMap(game, 0,0 );
			}
			else if ( PlacementMain.positionSousMap.equals("B3")) {
				SousMapB3.destroyType();
				SousMapB3.createBodyAndType(MainMenu.world);
				SousMapB3.sousMap(game, 0, 0);
			}
			else if ( PlacementMain.positionSousMap.equals("C3")) {
				SousMapC3.destroyType();
				SousMapC3.createBodyAndType(MainMenu.world);
				SousMapC3.sousMap(game, 0, 0);
			}
			else if ( PlacementMain.positionSousMap.equals("D3")) {
				SousMapD3.destroyType();
				SousMapD3.createBodyAndType(MainMenu.world);
				SousMapD3.sousMap(game, 0, 0);
			}
			else if ( PlacementMain.positionSousMap.equals("E3")) {
				SousMapE3.destroyType();
				SousMapE3.createBodyAndType(MainMenu.world);
				SousMapE3.sousMap(game, 0, 0);
			}
			else if ( PlacementMain.positionSousMap.equals("F3")) {
				SousMapF3.destroyType();
				SousMapF3.createBodyAndType(MainMenu.world);
				SousMapF3.sousMap(game, 0, 0);
			}
			else if ( PlacementMain.positionSousMap.equals("A4")){
				SousMapA4.createBodyAndType(MainMenu.world);
				SousMapA4.sousMap(game, 0,0 );
			}
			else if ( PlacementMain.positionSousMap.equals("B4")) {
				SousMapB4.destroyType();
				SousMapB4.createBodyAndType(MainMenu.world);
				SousMapB4.sousMap(game, 0, 0);
			}
			else if ( PlacementMain.positionSousMap.equals("C4")) {
				SousMapC4.destroyType();
				SousMapC4.createBodyAndType(MainMenu.world);
				SousMapC4.sousMap(game, 0, 0);
			}
			else if ( PlacementMain.positionSousMap.equals("D4")) {
				SousMapD4.destroyType();
				SousMapD4.createBodyAndType(MainMenu.world);
				SousMapD4.sousMap(game, 0, 0);
			}
			else if ( PlacementMain.positionSousMap.equals("E4")) {
				SousMapE4.destroyType();
				SousMapE4.createBodyAndType(MainMenu.world);
				SousMapE4.sousMap(game, 0, 0);
			}
			else if ( PlacementMain.positionSousMap.equals("F4")) {
				SousMapF4.destroyType();
				SousMapF4.createBodyAndType(MainMenu.world);
				SousMapF4.sousMap(game, 0, 0);
			}
	}
	
//	 ===========================================================================================================
//	 ===========================================================================================================
//	 ===========================================================================================================
//	 ===========================================================================================================
//	 ===========================================================================================================
	
	public static void destructionDesCorps(){
//		suppresion des corps de la map sur laquelle on était
		if (PlacementMain.positionSousMap.equals("A1")) SousMapA1.destroyBody();
		else if (PlacementMain.positionSousMap.equals("B1")) SousMapB1.destroyBody();
		else if (PlacementMain.positionSousMap.equals("C1")) SousMapC1.destroyBody();
		else if (PlacementMain.positionSousMap.equals("D1")) SousMapD1.destroyBody();
		else if (PlacementMain.positionSousMap.equals("E1")) SousMapE1.destroyBody();
		else if (PlacementMain.positionSousMap.equals("F1")) SousMapF1.destroyBody();
		else if (PlacementMain.positionSousMap.equals("A2")) SousMapA2.destroyBody();
		else if (PlacementMain.positionSousMap.equals("B2")) SousMapB2.destroyBody();
		else if (PlacementMain.positionSousMap.equals("C2")) SousMapC2.destroyBody();
		else if (PlacementMain.positionSousMap.equals("D2")) SousMapD2.destroyBody();
		else if (PlacementMain.positionSousMap.equals("E2")) SousMapE2.destroyBody();
		else if (PlacementMain.positionSousMap.equals("F2")) SousMapF2.destroyBody();
		else if (PlacementMain.positionSousMap.equals("A3")) SousMapA3.destroyBody();
		else if (PlacementMain.positionSousMap.equals("B3")) SousMapB3.destroyBody();
		else if (PlacementMain.positionSousMap.equals("C3")) SousMapC3.destroyBody();
		else if (PlacementMain.positionSousMap.equals("D3")) SousMapD3.destroyBody();
		else if (PlacementMain.positionSousMap.equals("E3")) SousMapE3.destroyBody();
		else if (PlacementMain.positionSousMap.equals("F3")) SousMapF3.destroyBody();
		else if (PlacementMain.positionSousMap.equals("A4")) SousMapA4.destroyBody();
		else if (PlacementMain.positionSousMap.equals("B4")) SousMapB4.destroyBody();
		else if (PlacementMain.positionSousMap.equals("C4")) SousMapC4.destroyBody();
		else if (PlacementMain.positionSousMap.equals("D4")) SousMapD4.destroyBody();
		else if (PlacementMain.positionSousMap.equals("E4")) SousMapE4.destroyBody();
		else if (PlacementMain.positionSousMap.equals("F4")) SousMapF4.destroyBody();
	}
	
}
