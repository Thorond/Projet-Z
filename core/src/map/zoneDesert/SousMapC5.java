package map.zoneDesert;

import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.physics.box2d.Body;
import com.badlogic.gdx.physics.box2d.World;
import com.mygdx.game.GameMain;

import decors.ClimatMontagneux;
import map.CadrillageMap;
import scenes.MainMenu;

public class SousMapC5 extends Sprite{
	
	public static Body arbre1;
	public static boolean isArbre1Created;
	
	public static Body arbuste1;
	public static boolean isarbuste1Created;
	public static Body arbuste2;
	public static boolean isarbuste2Created;
	public static Body arbuste3;
	public static boolean isarbuste3Created;
	public static Body arbuste4;
	public static boolean isarbuste4Created;
	public static Body arbuste5;
	public static boolean isarbuste5Created;
	
	public static Body bosquet1 ;
	public static boolean isBosquet1Created;
	public static Body bosquet2 ;
	public static boolean isBosquet2Created;
	

	public static Body igloo ;
	public static boolean isIglooCreated;
	
	public static boolean isArbuste1Cut = false;
	public static boolean isArbuste2Cut = false;
	public static boolean isArbuste3Cut = false;
	public static boolean isArbuste4Cut = false;
	public static boolean isArbuste5Cut = false;
	public static boolean isArbuste6Cut = false;
	
	public static void sousMap(GameMain game, int x, int y){
		
		game.getBatch().draw(ClimatMontagneux.glace1, 0+ x, 0+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 0+ x, 60+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 0+ x, 120+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 0+ x, 180+ y);		
		game.getBatch().draw(ClimatMontagneux.glace1, 0 + x,240 + y);
		game.getBatch().draw(ClimatMontagneux.glace1, 0+ x, 300+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 0+ x, 360+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 0+ x, 420+ y);
		
		game.getBatch().draw(ClimatMontagneux.glace1, 60+ x, 0+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 60+ x, 60+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 60+ x, 120+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 60+ x, 180+ y);		
		game.getBatch().draw(ClimatMontagneux.glace1, 60+ x, 240+ y);	
		game.getBatch().draw(ClimatMontagneux.glace1, 60+ x, 300+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 60+ x, 360+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 60+ x, 420+ y);
		
		game.getBatch().draw(ClimatMontagneux.glace1, 120+ x, 0+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 120+ x, 60+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 120+ x, 120+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 120+ x, 180+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 120+ x, 240+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 120+ x, 300+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 120+ x, 360+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 120+ x, 420+ y);
		
		game.getBatch().draw(ClimatMontagneux.glace1, 180+ x, 0+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 180+ x, 60+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 180+ x, 120+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 180+ x, 180+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 180+ x, 240+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 180+ x, 300+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 180+ x, 360+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 180+ x, 420+ y);
		
		game.getBatch().draw(ClimatMontagneux.glace1, 240+ x, 0+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 240+ x, 60+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 240+ x, 120+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 240+ x, 180+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 240+ x, 240+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 240+ x, 300+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 240+ x, 360+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 240+ x, 420+ y);
		
		game.getBatch().draw(ClimatMontagneux.glace1, 300+ x, 0+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 300+ x, 60+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 300+ x, 120+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 300+ x, 180+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 300+ x, 240+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 300+ x, 300+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 300+ x, 360+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 300+ x, 420+ y);
		
		game.getBatch().draw(ClimatMontagneux.glace1, 360+ x, 0+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 360+ x, 60+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 360+ x, 120+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 360+ x, 180+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 360+ x, 240+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 360+ x, 300+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 360+ x, 360+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 360+ x, 420+ y);
		
		game.getBatch().draw(ClimatMontagneux.glace1, 420+ x, 0+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 420+ x, 60+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 420+ x, 120+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 420+ x, 180+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 420+ x, 240+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 420+ x, 300+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 420+ x, 360+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 420+ x, 420+ y);
		
		game.getBatch().draw(ClimatMontagneux.glace1, 480+ x, 0+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 480+ x, 60+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 480+ x, 120+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 480+ x, 180+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 480+ x, 240+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 480+ x, 300+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 480+ x, 360+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 480+ x, 420+ y);
		
		game.getBatch().draw(ClimatMontagneux.glace1, 540+ x, 0+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 540+ x, 60+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 540+ x, 120+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 540+ x, 180+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 540+ x, 240+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 540+ x, 300+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 540+ x, 360+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 540+ x, 420+ y);
		

		game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 0+ x, 420+ y);
		game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 60+ x, 420+ y);
		game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 120+ x, 420+ y);
		game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 180+ x, 420+ y);
		game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 240+ x, 420+ y);
		game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 300+ x, 420+ y);
		game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 360+ x, 420+ y);
		game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 420+ x, 420+ y);
		game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 480+ x, 420+ y);
		game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 540+ x, 420+ y);
		
		game.getBatch().draw(ClimatMontagneux.piedGlacéSup, 0+ x, 360+ y);
		game.getBatch().draw(ClimatMontagneux.piedGlacéSup, 60+ x, 360+ y);
		game.getBatch().draw(ClimatMontagneux.piedGlacéSup, 120+ x, 360+ y);
		game.getBatch().draw(ClimatMontagneux.piedCassé1Sup, 180+ x, 360+ y);
		game.getBatch().draw(ClimatMontagneux.piedGlacéSup, 240+ x, 360+ y);
		game.getBatch().draw(ClimatMontagneux.piedCassé1Sup, 300+ x, 360+ y);
		game.getBatch().draw(ClimatMontagneux.piedGlacéSup, 360+ x, 360+ y);
		game.getBatch().draw(ClimatMontagneux.piedCassé1Sup, 420+ x, 360+ y);
		game.getBatch().draw(ClimatMontagneux.piedCassé2Sup, 480+ x, 360+ y);
		game.getBatch().draw(ClimatMontagneux.piedCassé1Sup, 540+ x, 360+ y);
		
		game.getBatch().draw(ClimatMontagneux.tree, 0+ x, 360+ y);
		game.getBatch().draw(ClimatMontagneux.tree, 60+ x, 360+ y);
		game.getBatch().draw(ClimatMontagneux.tree, 120+ x, 360+ y);
		game.getBatch().draw(ClimatMontagneux.tree, 180+ x, 360+ y);
		game.getBatch().draw(ClimatMontagneux.tree, 240+ x, 360+ y);
		game.getBatch().draw(ClimatMontagneux.tree, 300+ x, 360+ y);
		game.getBatch().draw(ClimatMontagneux.tree, 360+ x, 360+ y);
		game.getBatch().draw(ClimatMontagneux.tree, 420+ x, 360+ y);
		game.getBatch().draw(ClimatMontagneux.tree, 480+ x, 360+ y);
		game.getBatch().draw(ClimatMontagneux.tree, 540+ x, 360+ y);
		
		game.getBatch().draw(ClimatMontagneux.tree,-20+ x, 330+ y);
		game.getBatch().draw(ClimatMontagneux.tree, 40+ x, 330+ y);
		game.getBatch().draw(ClimatMontagneux.tree, 100+ x, 330+ y);
		game.getBatch().draw(ClimatMontagneux.tree, 160+ x, 330+ y);
		game.getBatch().draw(ClimatMontagneux.tree, 220+ x, 330+ y);
		game.getBatch().draw(ClimatMontagneux.tree, 280+ x, 330+ y);
		game.getBatch().draw(ClimatMontagneux.tree, 340+ x, 330+ y);
		game.getBatch().draw(ClimatMontagneux.tree, 400+ x, 330+ y);
		game.getBatch().draw(ClimatMontagneux.tree, 460+ x, 330+ y);
		game.getBatch().draw(ClimatMontagneux.tree, 520+ x, 330+ y);
		
		game.getBatch().draw(ClimatMontagneux.tree, 560+ x, 300+ y);
		game.getBatch().draw(ClimatMontagneux.tree, 560+ x, 240+ y);
		game.getBatch().draw(ClimatMontagneux.tree, 560+ x, 180+ y);
		game.getBatch().draw(ClimatMontagneux.tree, 560+ x, 120+ y);
		game.getBatch().draw(ClimatMontagneux.tree, 560+ x, 60+ y);
		game.getBatch().draw(ClimatMontagneux.tree, 560+ x, 0+ y);

		game.getBatch().draw(ClimatMontagneux.tree,-50+ x, 270+ y);
		

//		igloo
		
		game.getBatch().draw(ClimatMontagneux.igloo, 360+ x, 180+ y);
		game.getBatch().draw(ClimatMontagneux.shop, 415+ x, 255+ y);
		
//		arbuste 

		game.getBatch().draw(ClimatMontagneux.herbeGlace120, 120+ x, 120+ y);
		game.getBatch().draw(ClimatMontagneux.herbeGlace120, 210+ x, 90+ y);
		game.getBatch().draw(ClimatMontagneux.herbeGlace120, 300+ x, 60+ y);
		

		ClimatMontagneux.arbuste(isArbuste1Cut, game, 120+x,60+ y);
		ClimatMontagneux.arbuste(isArbuste2Cut, game, 120+x,240+ y);
		game.getBatch().draw(ClimatMontagneux.planteGelé3, 0+ x, 240+ y);
		game.getBatch().draw(ClimatMontagneux.planteGelé3, 60+ x, 300+ y);
		game.getBatch().draw(ClimatMontagneux.planteGelé, 180+ x, 60+ y);
		ClimatMontagneux.arbuste(isArbuste3Cut, game, 180+x,120+ y);
		game.getBatch().draw(ClimatMontagneux.planteGelé, 180+ x, 300+ y);
		game.getBatch().draw(ClimatMontagneux.planteGelé, 240+ x, 240+ y);
		game.getBatch().draw(ClimatMontagneux.planteGelé3, 240+ x, 120+ y);
		ClimatMontagneux.arbuste(isArbuste4Cut, game, 300+x,300+ y);
		ClimatMontagneux.arbuste(isArbuste5Cut, game, 360+x,180+ y);
		game.getBatch().draw(ClimatMontagneux.planteGelé, 360+ x, 0+ y);
		game.getBatch().draw(ClimatMontagneux.planteGelé3, 50+ x, 60+ y);
		ClimatMontagneux.arbuste(isArbuste6Cut, game, 480+x,60+ y);
	}

	public static void destroyBody() {
		// TODO Auto-generated method stub
		if ( isArbre1Created) MainMenu.world.destroyBody(arbre1);
		isArbre1Created = false;
		
		if ( isBosquet1Created) MainMenu.world.destroyBody(bosquet1);
		isBosquet1Created = false;
		
		if ( isBosquet2Created) MainMenu.world.destroyBody(bosquet2);
		isBosquet2Created = false;
		
		if ( isarbuste1Created) MainMenu.world.destroyBody(arbuste1);
		isarbuste1Created = false;
		
		if ( isarbuste2Created) MainMenu.world.destroyBody(arbuste2);
		isarbuste2Created = false;
		
		if ( isarbuste3Created) MainMenu.world.destroyBody(arbuste3);
		isarbuste3Created = false;
		
		if ( isarbuste4Created) MainMenu.world.destroyBody(arbuste4);
		isarbuste4Created = false;
		
		if ( isarbuste5Created) MainMenu.world.destroyBody(arbuste5);
		isarbuste5Created = false;
		
		if ( isIglooCreated ) MainMenu.world.destroyBody(igloo);
		isIglooCreated = false;
	}

	public static void createBodyAndType(World world) {
		// TODO Auto-generated method stub
		CadrillageMap.setTypeDeDécor(2,1,"HerbesHautes");
		CadrillageMap.setTypeDeDécor(2,4,"HerbesHautes");
		CadrillageMap.setTypeDeDécor(3,2,"HerbesHautes");
		CadrillageMap.setTypeDeDécor(5,5,"HerbesHautes");
		CadrillageMap.setTypeDeDécor(6,3,"HerbesHautes");
		if ( CadrillageMap.décorChangé[2][1] == true ) isArbuste1Cut = true;
		if ( CadrillageMap.décorChangé[2][4] == true ) isArbuste2Cut = true;
		if ( CadrillageMap.décorChangé[3][2] == true ) isArbuste3Cut = true;
		if ( CadrillageMap.décorChangé[5][5] == true ) isArbuste4Cut = true;
		if ( CadrillageMap.décorChangé[6][3] == true ) isArbuste5Cut = true;
		CadrillageMap.setTypeDeDécor(8,1,"HerbesHautes");
		if ( CadrillageMap.décorChangé[8][1] == true ) isArbuste6Cut = true;
		
		if ( isArbre1Created == false ) {
			arbre1 = ClimatMontagneux.createBodyPerso("arbre", "static",-30,270);
			isArbre1Created = true;
		}
		
		if ( isBosquet1Created == false ) {
			bosquet1 = ClimatMontagneux.createBody(300,390,600,100);
			isBosquet1Created = true;
		}
		if ( isBosquet2Created == false ) {
			bosquet2 = ClimatMontagneux.createBody(570,240,50,480);
			isBosquet2Created = true;
		}
		
		if ( isarbuste1Created == false ) {
			arbuste1 = ClimatMontagneux.createBodyPerso("tonneau", "static",120,60);
			isarbuste1Created = true;
		}
		if ( isarbuste2Created == false ) {
			arbuste2 = ClimatMontagneux.createBodyPerso("tonneau", "static",120,240);
			isarbuste2Created = true;
		}
		if ( isarbuste3Created == false ) {
			arbuste3 = ClimatMontagneux.createBodyPerso("tonneau", "static",180,120);
			isarbuste3Created = true;
		}
		if ( isarbuste4Created == false ) {
			arbuste4 = ClimatMontagneux.createBodyPerso("tonneau", "static",300,300);
			isarbuste4Created = true;
		}
		if ( isarbuste5Created == false ) {
			arbuste5 = ClimatMontagneux.createBodyPerso("tonneau", "static",480,60);
			isarbuste5Created = true;
		}
		
		
		if ( isIglooCreated == false ) {
			igloo = ClimatMontagneux.createBody(440,260,190,160);
			isIglooCreated = true;
		}
	}

	public static void destroyType() {
		// TODO Auto-generated method stub
		isArbuste1Cut = false;
		isArbuste2Cut = false;
		isArbuste3Cut = false;
		isArbuste4Cut = false;
		isArbuste5Cut = false;
		isArbuste6Cut = false;
	}
}
