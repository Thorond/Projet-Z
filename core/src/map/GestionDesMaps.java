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
				MainMenu.Link.getBody().setTransform(MainMenu.Link.getBody().getPosition().x +10.3f, MainMenu.Link.getBody().getPosition().y  , 0);
				
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
				} else if ( PlacementMain.positionSousMap.equals("F1") ) {
					SousMapF1.sousMap(game,-600 + PlacementMain.x,0);
					SousMapG1.sousMap(game, PlacementMain.x, 0);
				} else if ( PlacementMain.positionSousMap.equals("G1") ) {
					SousMapG1.sousMap(game,-600 + PlacementMain.x,0);
					SousMapH1.sousMap(game, PlacementMain.x, 0);
				} else if ( PlacementMain.positionSousMap.equals("H1") ) {
					SousMapH1.sousMap(game,-600 + PlacementMain.x,0);
					SousMapI1.sousMap(game, PlacementMain.x, 0);
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
				} else if (PlacementMain.positionSousMap.equals("F2")){
					SousMapG2.sousMap(game, 0 + PlacementMain.x, 0);
					SousMapF2.sousMap(game, -600 + PlacementMain.x,0);
				} else if (PlacementMain.positionSousMap.equals("G2")){
					SousMapH2.sousMap(game, 0 + PlacementMain.x, 0);
					SousMapG2.sousMap(game, -600 + PlacementMain.x,0);
				} else if (PlacementMain.positionSousMap.equals("H2")){
					SousMapI2.sousMap(game, 0 + PlacementMain.x, 0);
					SousMapH2.sousMap(game, -600 + PlacementMain.x,0);
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
				} else if (PlacementMain.positionSousMap.equals("F3")){
					SousMapG3.sousMap(game, 0 + PlacementMain.x, 0);
					SousMapF3.sousMap(game, -600 + PlacementMain.x,0);
				} else if (PlacementMain.positionSousMap.equals("G3")){
					SousMapH3.sousMap(game, 0 + PlacementMain.x, 0);
					SousMapG3.sousMap(game, -600 + PlacementMain.x,0);
				} else if (PlacementMain.positionSousMap.equals("H3")){
					SousMapI3.sousMap(game, 0 + PlacementMain.x, 0);
					SousMapH3.sousMap(game, -600 + PlacementMain.x,0);
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
				} else if (PlacementMain.positionSousMap.equals("F4")){
					SousMapG4.sousMap(game, 0 + PlacementMain.x, 0);
					SousMapF4.sousMap(game, -600 + PlacementMain.x,0);
				} else if (PlacementMain.positionSousMap.equals("G4")){
					SousMapH4.sousMap(game, 0 + PlacementMain.x, 0);
					SousMapG4.sousMap(game, -600 + PlacementMain.x,0);
				} else if (PlacementMain.positionSousMap.equals("H4")){
					SousMapI4.sousMap(game, 0 + PlacementMain.x, 0);
					SousMapH4.sousMap(game, -600 + PlacementMain.x,0);
				} else if ( PlacementMain.positionSousMap.equals("A5") ) {
					SousMapB5.sousMap(game, 0 + PlacementMain.x, 0);
					SousMapA5.sousMap(game, -600 + PlacementMain.x,0);
				} else if ( PlacementMain.positionSousMap.equals("B5") ) {
					SousMapC5.sousMap(game, 0 + PlacementMain.x, 0);
					SousMapB5.sousMap(game, -600 + PlacementMain.x,0);
				} else if (PlacementMain.positionSousMap.equals("C5")){
					SousMapD5.sousMap(game, 0 + PlacementMain.x, 0);
					SousMapC5.sousMap(game, -600 + PlacementMain.x,0);
				} else if (PlacementMain.positionSousMap.equals("D5")){
					SousMapE5.sousMap(game, 0 + PlacementMain.x, 0);
					SousMapD5.sousMap(game, -600 + PlacementMain.x,0);
				} else if (PlacementMain.positionSousMap.equals("E5")){
					SousMapF5.sousMap(game, 0 + PlacementMain.x, 0);
					SousMapE5.sousMap(game, -600 + PlacementMain.x,0);
				} else if (PlacementMain.positionSousMap.equals("F5")){
					SousMapG5.sousMap(game, 0 + PlacementMain.x, 0);
					SousMapF5.sousMap(game, -600 + PlacementMain.x,0);
				} else if (PlacementMain.positionSousMap.equals("G5")){
					SousMapH5.sousMap(game, 0 + PlacementMain.x, 0);
					SousMapG5.sousMap(game, -600 + PlacementMain.x,0);
				} else if (PlacementMain.positionSousMap.equals("H5")){
					SousMapI5.sousMap(game, 0 + PlacementMain.x, 0);
					SousMapH5.sousMap(game, -600 + PlacementMain.x,0);
				}  else if ( PlacementMain.positionSousMap.equals("A6") ) {
					SousMapB6.sousMap(game, 0 + PlacementMain.x, 0);
					SousMapA6.sousMap(game, -600 + PlacementMain.x,0);
				} else if ( PlacementMain.positionSousMap.equals("B6") ) {
					SousMapC6.sousMap(game, 0 + PlacementMain.x, 0);
					SousMapB6.sousMap(game, -600 + PlacementMain.x,0);
				} else if (PlacementMain.positionSousMap.equals("C6")){
					SousMapD6.sousMap(game, 0 + PlacementMain.x, 0);
					SousMapC6.sousMap(game, -600 + PlacementMain.x,0);
				} else if (PlacementMain.positionSousMap.equals("D6")){
					SousMapE6.sousMap(game, 0 + PlacementMain.x, 0);
					SousMapD6.sousMap(game, -600 + PlacementMain.x,0);
				} else if (PlacementMain.positionSousMap.equals("E6")){
					SousMapF6.sousMap(game, 0 + PlacementMain.x, 0);
					SousMapE6.sousMap(game, -600 + PlacementMain.x,0);
				} else if (PlacementMain.positionSousMap.equals("F6")){
					SousMapG6.sousMap(game, 0 + PlacementMain.x, 0);
					SousMapF6.sousMap(game, -600 + PlacementMain.x,0);
				} else if (PlacementMain.positionSousMap.equals("G6")){
					SousMapH6.sousMap(game, 0 + PlacementMain.x, 0);
					SousMapG6.sousMap(game, -600 + PlacementMain.x,0);
				} else if (PlacementMain.positionSousMap.equals("H6")){
					SousMapI6.sousMap(game, 0 + PlacementMain.x, 0);
					SousMapH6.sousMap(game, -600 + PlacementMain.x,0);
				}
				if ( System.currentTimeMillis() - PlacementMain.start > 10) {
					PlacementMain.x+=15;
					PlacementMain.start = System.currentTimeMillis();
				}
			} else if ( PlacementMain.direction.equals("droite")){
				MainMenu.Link.getBody().setTransform(MainMenu.Link.getBody().getPosition().x -10.3f, MainMenu.Link.getBody().getPosition().y  , 0);
				
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
				} else if ( PlacementMain.positionSousMap.equals("G1") ) {
					SousMapF1.sousMap(game,0- PlacementMain.x,0);
					SousMapG1.sousMap(game,600 - PlacementMain.x,0);
				} else if ( PlacementMain.positionSousMap.equals("H1") ) {
					SousMapG1.sousMap(game,0- PlacementMain.x,0);
					SousMapH1.sousMap(game,600 - PlacementMain.x,0);
				} else if ( PlacementMain.positionSousMap.equals("I1") ) {
					SousMapH1.sousMap(game,0- PlacementMain.x,0);
					SousMapI1.sousMap(game,600 - PlacementMain.x,0);
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
				} else if ( PlacementMain.positionSousMap.equals("G2") ) {
					SousMapF2.sousMap(game, 0- PlacementMain.x,0);
					SousMapG2.sousMap(game, 600- PlacementMain.x, 0);
				} else if ( PlacementMain.positionSousMap.equals("H2") ) {
					SousMapG2.sousMap(game, 0- PlacementMain.x,0);
					SousMapH2.sousMap(game, 600- PlacementMain.x, 0);
				} else if ( PlacementMain.positionSousMap.equals("I2") ) {
					SousMapH2.sousMap(game, 0- PlacementMain.x,0);
					SousMapI2.sousMap(game, 600- PlacementMain.x, 0);
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
				} else if ( PlacementMain.positionSousMap.equals("G3") ) {
					SousMapF3.sousMap(game, 0- PlacementMain.x,0);
					SousMapG3.sousMap(game, 600- PlacementMain.x, 0);
				} else if ( PlacementMain.positionSousMap.equals("H3") ) {
					SousMapG3.sousMap(game, 0- PlacementMain.x,0);
					SousMapH3.sousMap(game, 600- PlacementMain.x, 0);
				} else if ( PlacementMain.positionSousMap.equals("I3") ) {
					SousMapH3.sousMap(game, 0- PlacementMain.x,0);
					SousMapI3.sousMap(game, 600- PlacementMain.x, 0);
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
				} else if ( PlacementMain.positionSousMap.equals("G4") ) {
					SousMapG4.sousMap(game, 600- PlacementMain.x, 0);
					SousMapF4.sousMap(game, 0- PlacementMain.x,0);
				} else if ( PlacementMain.positionSousMap.equals("H4") ) {
					SousMapG4.sousMap(game, 0- PlacementMain.x,0);
					SousMapH4.sousMap(game, 600- PlacementMain.x, 0);
				} else if ( PlacementMain.positionSousMap.equals("I4") ) {
					SousMapH4.sousMap(game, 0- PlacementMain.x,0);
					SousMapI4.sousMap(game, 600- PlacementMain.x, 0);
				} else if ( PlacementMain.positionSousMap.equals("A5") ) {
				} else if ( PlacementMain.positionSousMap.equals("B5") ) {
					SousMapA5.sousMap(game, 0- PlacementMain.x,0);
					SousMapB5.sousMap(game, 600- PlacementMain.x, 0);
				} else if ( PlacementMain.positionSousMap.equals("C5") ) {
					SousMapB5.sousMap(game, 0- PlacementMain.x,0);
					SousMapC5.sousMap(game, 600- PlacementMain.x, 0);
				} else if ( PlacementMain.positionSousMap.equals("D5") ) {
					SousMapC5.sousMap(game, 0- PlacementMain.x,0);
					SousMapD5.sousMap(game, 600- PlacementMain.x, 0);
				} else if ( PlacementMain.positionSousMap.equals("E5") ) {
					SousMapD5.sousMap(game, 0- PlacementMain.x,0);
					SousMapE5.sousMap(game, 600- PlacementMain.x, 0);
				} else if ( PlacementMain.positionSousMap.equals("F5") ) {
					SousMapE5.sousMap(game, 0- PlacementMain.x,0);
					SousMapF5.sousMap(game, 600- PlacementMain.x, 0);
				} else if ( PlacementMain.positionSousMap.equals("G5") ) {
					SousMapF5.sousMap(game, 0- PlacementMain.x,0);
					SousMapG5.sousMap(game, 600- PlacementMain.x, 0);
				} else if ( PlacementMain.positionSousMap.equals("H5") ) {
					SousMapG5.sousMap(game, 0- PlacementMain.x,0);
					SousMapH5.sousMap(game, 600- PlacementMain.x, 0);
				} else if ( PlacementMain.positionSousMap.equals("I5") ) {
					SousMapH5.sousMap(game, 0- PlacementMain.x,0);
					SousMapI5.sousMap(game, 600- PlacementMain.x, 0);
				} else if ( PlacementMain.positionSousMap.equals("A6") ) {
				} else if ( PlacementMain.positionSousMap.equals("B6") ) {
					SousMapA6.sousMap(game, 0- PlacementMain.x,0);
					SousMapB6.sousMap(game, 600- PlacementMain.x, 0);
				} else if ( PlacementMain.positionSousMap.equals("C6") ) {
					SousMapB6.sousMap(game, 0- PlacementMain.x,0);
					SousMapC6.sousMap(game, 600- PlacementMain.x, 0);
				} else if ( PlacementMain.positionSousMap.equals("D6") ) {
					SousMapC6.sousMap(game, 0- PlacementMain.x,0);
					SousMapD6.sousMap(game, 600- PlacementMain.x, 0);
				} else if ( PlacementMain.positionSousMap.equals("E6") ) {
					SousMapD6.sousMap(game, 0- PlacementMain.x,0);
					SousMapE6.sousMap(game, 600- PlacementMain.x, 0);
				} else if ( PlacementMain.positionSousMap.equals("F6") ) {
					SousMapE6.sousMap(game, 0- PlacementMain.x,0);
					SousMapF6.sousMap(game, 600- PlacementMain.x, 0);
				} else if ( PlacementMain.positionSousMap.equals("G6") ) {
					SousMapF6.sousMap(game, 0- PlacementMain.x,0);
					SousMapG6.sousMap(game, 600- PlacementMain.x, 0);
				} else if ( PlacementMain.positionSousMap.equals("H6") ) {
					SousMapG6.sousMap(game, 0- PlacementMain.x,0);
					SousMapH6.sousMap(game, 600- PlacementMain.x, 0);
				} else if ( PlacementMain.positionSousMap.equals("I6") ) {
					SousMapH6.sousMap(game, 0- PlacementMain.x,0);
					SousMapI6.sousMap(game, 600- PlacementMain.x, 0);
				}
				if ( System.currentTimeMillis() - PlacementMain.start > 10) {
					PlacementMain.x+=15;
					PlacementMain.start = System.currentTimeMillis();
				}
			} else if ( PlacementMain.direction.equals("bas")){
				MainMenu.Link.getBody().setTransform(MainMenu.Link.getBody().getPosition().x , MainMenu.Link.getBody().getPosition().y +10.2f , 0);
				
				if ( PlacementMain.positionSousMap.equals("A1") ) {
				} else if ( PlacementMain.positionSousMap.equals("B1") ) {
				} else if ( PlacementMain.positionSousMap.equals("C1") ) {
				} else if ( PlacementMain.positionSousMap.equals("D1") ) {
				} else if ( PlacementMain.positionSousMap.equals("E1") ) {
				} else if ( PlacementMain.positionSousMap.equals("F1") ) {
				} else if ( PlacementMain.positionSousMap.equals("G1") ) {
				} else if ( PlacementMain.positionSousMap.equals("H1") ) {
				} else if ( PlacementMain.positionSousMap.equals("I1") ) {
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
				} else if ( PlacementMain.positionSousMap.equals("G2") ) {
					SousMapG1.sousMap(game, 0, PlacementMain.y);
					SousMapG2.sousMap(game, 0, -480 + PlacementMain.y);
				} else if ( PlacementMain.positionSousMap.equals("H2") ) {
					SousMapH1.sousMap(game, 0, PlacementMain.y);
					SousMapH2.sousMap(game, 0, -480 + PlacementMain.y);
				} else if ( PlacementMain.positionSousMap.equals("I2") ) {
					SousMapI1.sousMap(game, 0, PlacementMain.y);
					SousMapI2.sousMap(game, 0, -480 + PlacementMain.y);
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
				} else if ( PlacementMain.positionSousMap.equals("G3") ) {
					SousMapG2.sousMap(game, 0, PlacementMain.y);
					SousMapG3.sousMap(game, 0, -480 + PlacementMain.y);
				} else if ( PlacementMain.positionSousMap.equals("H3") ) {
					SousMapH3.sousMap(game, 0, -480 + PlacementMain.y);
					SousMapH2.sousMap(game, 0, PlacementMain.y);
				} else if ( PlacementMain.positionSousMap.equals("I3") ) {
					SousMapI3.sousMap(game, 0, -480 + PlacementMain.y);
					SousMapI2.sousMap(game, 0, PlacementMain.y);
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
				} else if ( PlacementMain.positionSousMap.equals("G4") ) {
					SousMapG4.sousMap(game, 0, -480 + PlacementMain.y);
					SousMapG3.sousMap(game, 0, PlacementMain.y);
				} else if ( PlacementMain.positionSousMap.equals("H4") ) {
					SousMapH4.sousMap(game, 0, -480 + PlacementMain.y);
					SousMapH3.sousMap(game, 0, PlacementMain.y);
				} else if ( PlacementMain.positionSousMap.equals("I4") ) {
					SousMapI4.sousMap(game, 0, -480 + PlacementMain.y);
					SousMapI3.sousMap(game, 0, PlacementMain.y);
				} else if ( PlacementMain.positionSousMap.equals("A5") ) {
					SousMapA4.sousMap(game,0,0+ PlacementMain.y);
					SousMapA5.sousMap(game, 0,-480 + PlacementMain.y );
				} else if ( PlacementMain.positionSousMap.equals("B5") ) {
					SousMapB5.sousMap(game, 0, -480 + PlacementMain.y);
					SousMapB4.sousMap(game, 0, PlacementMain.y);
				} else if ( PlacementMain.positionSousMap.equals("C5") ) {
					SousMapC5.sousMap(game, 0, -480 + PlacementMain.y);
					SousMapC4.sousMap(game, 0, PlacementMain.y);
				} else if ( PlacementMain.positionSousMap.equals("D5") ) {
					SousMapD5.sousMap(game, 0, -480 + PlacementMain.y);
					SousMapD4.sousMap(game, 0, PlacementMain.y);
				} else if ( PlacementMain.positionSousMap.equals("E5") ) {
					SousMapE4.sousMap(game, 0, PlacementMain.y);
					SousMapE5.sousMap(game, 0, -480 + PlacementMain.y);
				} else if ( PlacementMain.positionSousMap.equals("F5") ) {
					SousMapF5.sousMap(game, 0, -480 + PlacementMain.y);
					SousMapF4.sousMap(game, 0, PlacementMain.y);
				} else if ( PlacementMain.positionSousMap.equals("G5") ) {
					SousMapG5.sousMap(game, 0, -480 + PlacementMain.y);
					SousMapG4.sousMap(game, 0, PlacementMain.y);
				} else if ( PlacementMain.positionSousMap.equals("H5") ) {
					SousMapH5.sousMap(game, 0, -480 + PlacementMain.y);
					SousMapH4.sousMap(game, 0, PlacementMain.y);
				} else if ( PlacementMain.positionSousMap.equals("I5") ) {
					SousMapI5.sousMap(game, 0, -480 + PlacementMain.y);
					SousMapI4.sousMap(game, 0, PlacementMain.y);
				} else if ( PlacementMain.positionSousMap.equals("A6") ) {
					SousMapA5.sousMap(game,0,0+ PlacementMain.y);
					SousMapA6.sousMap(game, 0,-480 + PlacementMain.y );
				} else if ( PlacementMain.positionSousMap.equals("B6") ) {
					SousMapB6.sousMap(game, 0, -480 + PlacementMain.y);
					SousMapB5.sousMap(game, 0, PlacementMain.y);
				} else if ( PlacementMain.positionSousMap.equals("C6") ) {
					SousMapC6.sousMap(game, 0, -480 + PlacementMain.y);
					SousMapC5.sousMap(game, 0, PlacementMain.y);
				} else if ( PlacementMain.positionSousMap.equals("D6") ) {
					SousMapD6.sousMap(game, 0, -480 + PlacementMain.y);
					SousMapD5.sousMap(game, 0, PlacementMain.y);
				} else if ( PlacementMain.positionSousMap.equals("E6") ) {
					SousMapE5.sousMap(game, 0, PlacementMain.y);
					SousMapE6.sousMap(game, 0, -480 + PlacementMain.y);
				} else if ( PlacementMain.positionSousMap.equals("F6") ) {
					SousMapF6.sousMap(game, 0, -480 + PlacementMain.y);
					SousMapF5.sousMap(game, 0, PlacementMain.y);
				} else if ( PlacementMain.positionSousMap.equals("G6") ) {
					SousMapG6.sousMap(game, 0, -480 + PlacementMain.y);
					SousMapG5.sousMap(game, 0, PlacementMain.y);
				} else if ( PlacementMain.positionSousMap.equals("H6") ) {
					SousMapH6.sousMap(game, 0, -480 + PlacementMain.y);
					SousMapH5.sousMap(game, 0, PlacementMain.y);
				} else if ( PlacementMain.positionSousMap.equals("I6") ) {
					SousMapI6.sousMap(game, 0, -480 + PlacementMain.y);
					SousMapI5.sousMap(game, 0, PlacementMain.y);
				}
				if ( System.currentTimeMillis() - PlacementMain.start > 10) {
					PlacementMain.y+=15;
					PlacementMain.start = System.currentTimeMillis();
				}
			} else if ( PlacementMain.direction.equals("haut")){
				if ( System.currentTimeMillis() - PlacementMain.start > 10) {
					MainMenu.Link.getBody().setTransform(MainMenu.Link.getBody().getPosition().x , MainMenu.Link.getBody().getPosition().y -10.8f , 0);
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
				} else if ( PlacementMain.positionSousMap.equals("G1") ) {
					SousMapG1.sousMap(game, 0, 480-PlacementMain.y);
					SousMapG2.sousMap(game, 0, 0-PlacementMain.y);
				} else if ( PlacementMain.positionSousMap.equals("H1") ) {
					SousMapH1.sousMap(game, 0, 480-PlacementMain.y);
					SousMapH2.sousMap(game, 0, 0-PlacementMain.y);
				} else if ( PlacementMain.positionSousMap.equals("I1") ) {
					SousMapI1.sousMap(game, 0, 480-PlacementMain.y);
					SousMapI2.sousMap(game, 0, 0-PlacementMain.y);
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
				} else if ( PlacementMain.positionSousMap.equals("G2") ) {
					SousMapG2.sousMap(game, 0, 480-PlacementMain.y);
					SousMapG3.sousMap(game, 0, 0-PlacementMain.y);
				} else if ( PlacementMain.positionSousMap.equals("H2") ) {
					SousMapH3.sousMap(game, 0, 0-PlacementMain.y);
					SousMapH2.sousMap(game, 0, 480-PlacementMain.y);
				} else if ( PlacementMain.positionSousMap.equals("I2") ) {
					SousMapI3.sousMap(game, 0, 0-PlacementMain.y);
					SousMapI2.sousMap(game, 0, 480-PlacementMain.y);
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
				} else if ( PlacementMain.positionSousMap.equals("G3") ) {
					SousMapG4.sousMap(game, 0, 0-PlacementMain.y);
					SousMapG3.sousMap(game, 0, 480-PlacementMain.y);
				} else if ( PlacementMain.positionSousMap.equals("H3") ) {
					SousMapH4.sousMap(game, 0, 0-PlacementMain.y);
					SousMapH3.sousMap(game, 0, 480-PlacementMain.y);
				} else if ( PlacementMain.positionSousMap.equals("I3") ) {
					SousMapI4.sousMap(game, 0, 0-PlacementMain.y);
					SousMapI3.sousMap(game, 0, 480-PlacementMain.y);
				} else if ( PlacementMain.positionSousMap.equals("A4") ) {
					SousMapA4.sousMap(game,0,480- PlacementMain.y);
					SousMapA5.sousMap(game, 0,0- PlacementMain.y );
				} else if ( PlacementMain.positionSousMap.equals("B4") ) {
					SousMapB5.sousMap(game, 0, 0-PlacementMain.y);
					SousMapB4.sousMap(game, 0, 480-PlacementMain.y);
				} else if ( PlacementMain.positionSousMap.equals("C4") ) {
					SousMapC5.sousMap(game, 0, 0-PlacementMain.y);
					SousMapC4.sousMap(game, 0, 480-PlacementMain.y);
				} else if ( PlacementMain.positionSousMap.equals("D4") ) {
					SousMapD5.sousMap(game, 0, 0-PlacementMain.y);
					SousMapD4.sousMap(game, 0, 480-PlacementMain.y);
				} else if ( PlacementMain.positionSousMap.equals("E4") ) {
					SousMapE4.sousMap(game, 0, 480-PlacementMain.y);
					SousMapE5.sousMap(game, 0, 0-PlacementMain.y);
				} else if ( PlacementMain.positionSousMap.equals("F4") ) {
					SousMapF5.sousMap(game, 0, 0-PlacementMain.y);
					SousMapF4.sousMap(game, 0, 480-PlacementMain.y);
				} else if ( PlacementMain.positionSousMap.equals("G4") ) {
					SousMapG5.sousMap(game, 0, 0-PlacementMain.y);
					SousMapG4.sousMap(game, 0, 480-PlacementMain.y);
				} else if ( PlacementMain.positionSousMap.equals("H4") ) {
					SousMapH5.sousMap(game, 0, 0-PlacementMain.y);
					SousMapH4.sousMap(game, 0, 480-PlacementMain.y);
				} else if ( PlacementMain.positionSousMap.equals("I4") ) {
					SousMapI5.sousMap(game, 0, 0-PlacementMain.y);
					SousMapI4.sousMap(game, 0, 480-PlacementMain.y);
				} else if ( PlacementMain.positionSousMap.equals("A5") ) {
					SousMapA5.sousMap(game,0,480- PlacementMain.y);
					SousMapA6.sousMap(game, 0,0- PlacementMain.y );
				} else if ( PlacementMain.positionSousMap.equals("B5") ) {
					SousMapB6.sousMap(game, 0, 0-PlacementMain.y);
					SousMapB5.sousMap(game, 0, 480-PlacementMain.y);
				} else if ( PlacementMain.positionSousMap.equals("C5") ) {
					SousMapC6.sousMap(game, 0, 0-PlacementMain.y);
					SousMapC5.sousMap(game, 0, 480-PlacementMain.y);
				} else if ( PlacementMain.positionSousMap.equals("D5") ) {
					SousMapD6.sousMap(game, 0, 0-PlacementMain.y);
					SousMapD5.sousMap(game, 0, 480-PlacementMain.y);
				} else if ( PlacementMain.positionSousMap.equals("E5") ) {
					SousMapE5.sousMap(game, 0, 480-PlacementMain.y);
					SousMapE6.sousMap(game, 0, 0-PlacementMain.y);
				} else if ( PlacementMain.positionSousMap.equals("F5") ) {
					SousMapF6.sousMap(game, 0, 0-PlacementMain.y);
					SousMapF5.sousMap(game, 0, 480-PlacementMain.y);
				} else if ( PlacementMain.positionSousMap.equals("G5") ) {
					SousMapG6.sousMap(game, 0, 0-PlacementMain.y);
					SousMapG5.sousMap(game, 0, 480-PlacementMain.y);
				} else if ( PlacementMain.positionSousMap.equals("H5") ) {
					SousMapH6.sousMap(game, 0, 0-PlacementMain.y);
					SousMapH5.sousMap(game, 0, 480-PlacementMain.y);
				} else if ( PlacementMain.positionSousMap.equals("I5") ) {
					SousMapI6.sousMap(game, 0, 0-PlacementMain.y);
					SousMapI5.sousMap(game, 0, 480-PlacementMain.y);
				}
				if ( System.currentTimeMillis() - PlacementMain.start > 10) {
					PlacementMain.y+=15;
					PlacementMain.start = System.currentTimeMillis();
				}
			}
			
			if ( PlacementMain.x == 600) {
				PlacementMain.défilement = false;
				PlacementMain.x = 0;
				PlacementMain.positionRelativeX = MainMenu.Link.getBody().getPosition().x;
				PlacementMain.positionRelativeY = MainMenu.Link.getBody().getPosition().y;
			}
			if ( PlacementMain.y == 480) {
				PlacementMain.défilement = false;
				PlacementMain.y = 0;
				PlacementMain.positionRelativeX = MainMenu.Link.getBody().getPosition().x;
				PlacementMain.positionRelativeY = MainMenu.Link.getBody().getPosition().y;
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
			else if ( PlacementMain.positionSousMap.equals("G1")) {
				SousMapG1.destroyBody();  
				SousMapG1.createBodyAndType(MainMenu.world);
				SousMapG1.sousMap(game, 0, 0);
			}
			else if ( PlacementMain.positionSousMap.equals("H1")) {
				SousMapH1.destroyBody();  
				SousMapH1.createBodyAndType(MainMenu.world);
				SousMapH1.sousMap(game, 0, 0);
			}
			else if ( PlacementMain.positionSousMap.equals("I1")) {
				SousMapI1.destroyBody();  
				SousMapI1.createBodyAndType(MainMenu.world);
				SousMapI1.sousMap(game, 0, 0);
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
			else if ( PlacementMain.positionSousMap.equals("G2")) {
				SousMapG2.destroyType();
				SousMapG2.createBodyAndType(MainMenu.world);
				SousMapG2.sousMap(game, 0, 0);
			}
			else if ( PlacementMain.positionSousMap.equals("H2")) {
				SousMapH2.destroyType();
				SousMapH2.createBodyAndType(MainMenu.world);
				SousMapH2.sousMap(game, 0, 0);
			}
			else if ( PlacementMain.positionSousMap.equals("I2")) {
				SousMapI2.destroyType();
				SousMapI2.createBodyAndType(MainMenu.world);
				SousMapI2.sousMap(game, 0, 0);
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
			else if ( PlacementMain.positionSousMap.equals("G3")) {
				SousMapG3.destroyType();
				SousMapG3.createBodyAndType(MainMenu.world);
				SousMapG3.sousMap(game, 0, 0);
			}
			else if ( PlacementMain.positionSousMap.equals("H3")) {
				SousMapH3.destroyType();
				SousMapH3.createBodyAndType(MainMenu.world);
				SousMapH3.sousMap(game, 0, 0);
			}
			else if ( PlacementMain.positionSousMap.equals("I3")) {
				SousMapI3.destroyType();
				SousMapI3.createBodyAndType(MainMenu.world);
				SousMapI3.sousMap(game, 0, 0);
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
			else if ( PlacementMain.positionSousMap.equals("G4")) {
				SousMapG4.destroyType();
				SousMapG4.createBodyAndType(MainMenu.world);
				SousMapG4.sousMap(game, 0, 0);
			}
			else if ( PlacementMain.positionSousMap.equals("H4")) {
				SousMapH4.destroyType();
				SousMapH4.createBodyAndType(MainMenu.world);
				SousMapH4.sousMap(game, 0, 0);
			}
			else if ( PlacementMain.positionSousMap.equals("I4")) {
				SousMapI4.destroyType();
				SousMapI4.createBodyAndType(MainMenu.world);
				SousMapI4.sousMap(game, 0, 0);
			}
			else if ( PlacementMain.positionSousMap.equals("A5")){
				SousMapA5.createBodyAndType(MainMenu.world);
				SousMapA5.sousMap(game, 0,0 );
			}
			else if ( PlacementMain.positionSousMap.equals("B5")) {
				SousMapB5.destroyType();
				SousMapB5.createBodyAndType(MainMenu.world);
				SousMapB5.sousMap(game, 0, 0);
			}
			else if ( PlacementMain.positionSousMap.equals("C5")) {
				SousMapC5.destroyType();
				SousMapC5.createBodyAndType(MainMenu.world);
				SousMapC5.sousMap(game, 0, 0);
			}
			else if ( PlacementMain.positionSousMap.equals("D5")) {
				SousMapD5.destroyType();
				SousMapD5.createBodyAndType(MainMenu.world);
				SousMapD5.sousMap(game, 0, 0);
			}
			else if ( PlacementMain.positionSousMap.equals("E5")) {
				SousMapE5.destroyType();
				SousMapE5.createBodyAndType(MainMenu.world);
				SousMapE5.sousMap(game, 0, 0);
			}
			else if ( PlacementMain.positionSousMap.equals("F5")) {
				SousMapF5.destroyType();
				SousMapF5.createBodyAndType(MainMenu.world);
				SousMapF5.sousMap(game, 0, 0);
			}
			else if ( PlacementMain.positionSousMap.equals("G5")) {
				SousMapG5.destroyType();
				SousMapG5.createBodyAndType(MainMenu.world);
				SousMapG5.sousMap(game, 0, 0);
			}
			else if ( PlacementMain.positionSousMap.equals("H5")) {
				SousMapH5.destroyType();
				SousMapH5.createBodyAndType(MainMenu.world);
				SousMapH5.sousMap(game, 0, 0);
			}
			else if ( PlacementMain.positionSousMap.equals("I5")) {
				SousMapI5.destroyType();
				SousMapI5.createBodyAndType(MainMenu.world);
				SousMapI5.sousMap(game, 0, 0);
			}
			else if ( PlacementMain.positionSousMap.equals("A6")){
				SousMapA6.createBodyAndType(MainMenu.world);
				SousMapA6.sousMap(game, 0,0 );
			}
			else if ( PlacementMain.positionSousMap.equals("B6")) {
				SousMapB6.destroyType();
				SousMapB6.createBodyAndType(MainMenu.world);
				SousMapB6.sousMap(game, 0, 0);
			}
			else if ( PlacementMain.positionSousMap.equals("C6")) {
				SousMapC6.destroyType();
				SousMapC6.createBodyAndType(MainMenu.world);
				SousMapC6.sousMap(game, 0, 0);
			}
			else if ( PlacementMain.positionSousMap.equals("D6")) {
				SousMapD6.destroyType();
				SousMapD6.createBodyAndType(MainMenu.world);
				SousMapD6.sousMap(game, 0, 0);
			}
			else if ( PlacementMain.positionSousMap.equals("E6")) {
				SousMapE6.destroyType();
				SousMapE6.createBodyAndType(MainMenu.world);
				SousMapE6.sousMap(game, 0, 0);
			}
			else if ( PlacementMain.positionSousMap.equals("F6")) {
				SousMapF6.destroyType();
				SousMapF6.createBodyAndType(MainMenu.world);
				SousMapF6.sousMap(game, 0, 0);
			}
			else if ( PlacementMain.positionSousMap.equals("G6")) {
				SousMapG6.destroyType();
				SousMapG6.createBodyAndType(MainMenu.world);
				SousMapG6.sousMap(game, 0, 0);
			}
			else if ( PlacementMain.positionSousMap.equals("H6")) {
				SousMapH6.destroyType();
				SousMapH6.createBodyAndType(MainMenu.world);
				SousMapH6.sousMap(game, 0, 0);
			}
			else if ( PlacementMain.positionSousMap.equals("I6")) {
				SousMapI6.destroyType();
				SousMapI6.createBodyAndType(MainMenu.world);
				SousMapI6.sousMap(game, 0, 0);
			}
			
			else if ( PlacementMain.positionSousMap.equals("IglooC1")) {
				IglooC1.destroyType();
				IglooC1.createBodyAndType(MainMenu.world); 
				MainMenu.Link.setSize(50, 61); // taille augmenter quand link est dans l'igloo
				IglooC1.représentation(game, 0, 0);
			}
			
			else if ( PlacementMain.positionSousMap.equals("IglooD3")) {
				IglooD3.destroyType();
				IglooD3.createBodyAndType(MainMenu.world); 
				MainMenu.Link.setSize(50, 61); // taille augmenter quand link est dans l'igloo
				IglooD3.représentation(game, 0, 0);
			}
			
			else if ( PlacementMain.positionSousMap.equals("IglooC5")) {
				IglooC5.destroyType();
				IglooC5.createBodyAndType(MainMenu.world); 
				MainMenu.Link.setSize(50, 61); // taille augmenter quand link est dans l'igloo
				IglooC5.représentation(game, 0, 0);
			}
	}
	
//	 ===========================================================================================================
//	 ===========================================================================================================
//	 ===========================================================================================================
//	 ===========================================================================================================
//	 ===========================================================================================================
	
	public static void destructionDesCorps(){
//		suppresion des corps de la map sur laquelle on était ( lorsque l'on meurt)
		if (PlacementMain.positionSousMap.equals("A1")) SousMapA1.destroyBody();
		else if (PlacementMain.positionSousMap.equals("B1")) SousMapB1.destroyBody();
		else if (PlacementMain.positionSousMap.equals("C1")) SousMapC1.destroyBody();
		else if (PlacementMain.positionSousMap.equals("IglooC1")) IglooC1.destroyBody();
		else if (PlacementMain.positionSousMap.equals("D1")) SousMapD1.destroyBody();
		else if (PlacementMain.positionSousMap.equals("E1")) SousMapE1.destroyBody();
		else if (PlacementMain.positionSousMap.equals("F1")) SousMapF1.destroyBody();
		else if (PlacementMain.positionSousMap.equals("G1")) SousMapG1.destroyBody();
		else if (PlacementMain.positionSousMap.equals("H1")) SousMapH1.destroyBody();
		else if (PlacementMain.positionSousMap.equals("I1")) SousMapI1.destroyBody();
		else if (PlacementMain.positionSousMap.equals("A2")) SousMapA2.destroyBody();
		else if (PlacementMain.positionSousMap.equals("B2")) SousMapB2.destroyBody();
		else if (PlacementMain.positionSousMap.equals("C2")) SousMapC2.destroyBody();
		else if (PlacementMain.positionSousMap.equals("D2")) SousMapD2.destroyBody();
		else if (PlacementMain.positionSousMap.equals("E2")) SousMapE2.destroyBody();
		else if (PlacementMain.positionSousMap.equals("F2")) SousMapF2.destroyBody();
		else if (PlacementMain.positionSousMap.equals("G2")) SousMapG2.destroyBody();
		else if (PlacementMain.positionSousMap.equals("H2")) SousMapH2.destroyBody();
		else if (PlacementMain.positionSousMap.equals("I2")) SousMapI2.destroyBody();
		else if (PlacementMain.positionSousMap.equals("A3")) SousMapA3.destroyBody();
		else if (PlacementMain.positionSousMap.equals("B3")) SousMapB3.destroyBody();
		else if (PlacementMain.positionSousMap.equals("C3")) SousMapC3.destroyBody();
		else if (PlacementMain.positionSousMap.equals("D3")) SousMapD3.destroyBody();
		else if (PlacementMain.positionSousMap.equals("IglooD3")) IglooD3.destroyBody();
		else if (PlacementMain.positionSousMap.equals("E3")) SousMapE3.destroyBody();
		else if (PlacementMain.positionSousMap.equals("F3")) SousMapF3.destroyBody();
		else if (PlacementMain.positionSousMap.equals("G3")) SousMapG3.destroyBody();
		else if (PlacementMain.positionSousMap.equals("H3")) SousMapH3.destroyBody();
		else if (PlacementMain.positionSousMap.equals("I3")) SousMapI3.destroyBody();
		else if (PlacementMain.positionSousMap.equals("A4")) SousMapA4.destroyBody();
		else if (PlacementMain.positionSousMap.equals("B4")) SousMapB4.destroyBody();
		else if (PlacementMain.positionSousMap.equals("C4")) SousMapC4.destroyBody();
		else if (PlacementMain.positionSousMap.equals("D4")) SousMapD4.destroyBody();
		else if (PlacementMain.positionSousMap.equals("E4")) SousMapE4.destroyBody();
		else if (PlacementMain.positionSousMap.equals("F4")) SousMapF4.destroyBody();
		else if (PlacementMain.positionSousMap.equals("G4")) SousMapG4.destroyBody();
		else if (PlacementMain.positionSousMap.equals("H4")) SousMapH4.destroyBody();
		else if (PlacementMain.positionSousMap.equals("I4")) SousMapI4.destroyBody();
		else if (PlacementMain.positionSousMap.equals("A5")) SousMapA5.destroyBody();
		else if (PlacementMain.positionSousMap.equals("B5")) SousMapB5.destroyBody();
		else if (PlacementMain.positionSousMap.equals("C5")) SousMapC5.destroyBody();
		else if (PlacementMain.positionSousMap.equals("IglooC5")) IglooC5.destroyBody();
		else if (PlacementMain.positionSousMap.equals("D5")) SousMapD5.destroyBody();
		else if (PlacementMain.positionSousMap.equals("E5")) SousMapE5.destroyBody();
		else if (PlacementMain.positionSousMap.equals("F5")) SousMapF5.destroyBody();
		else if (PlacementMain.positionSousMap.equals("G5")) SousMapG5.destroyBody();
		else if (PlacementMain.positionSousMap.equals("H5")) SousMapH5.destroyBody();
		else if (PlacementMain.positionSousMap.equals("I5")) SousMapI5.destroyBody();
		else if (PlacementMain.positionSousMap.equals("A6")) SousMapA6.destroyBody();
		else if (PlacementMain.positionSousMap.equals("B6")) SousMapB6.destroyBody();
		else if (PlacementMain.positionSousMap.equals("C6")) SousMapC6.destroyBody();
		else if (PlacementMain.positionSousMap.equals("D6")) SousMapD6.destroyBody();
		else if (PlacementMain.positionSousMap.equals("E6")) SousMapE6.destroyBody();
		else if (PlacementMain.positionSousMap.equals("F6")) SousMapF6.destroyBody();
		else if (PlacementMain.positionSousMap.equals("G6")) SousMapG6.destroyBody();
		else if (PlacementMain.positionSousMap.equals("H6")) SousMapH6.destroyBody();
		else if (PlacementMain.positionSousMap.equals("I6")) SousMapI6.destroyBody();
	}
	
}
