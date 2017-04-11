package map.zoneGlace;

import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.physics.box2d.Body;
import com.badlogic.gdx.physics.box2d.World;
import com.mygdx.game.GameMain;

import decors.ClimatMontagneux;
import map.CadrillageMap;
import scenes.MainMenu;

public class SousMapE4 extends Sprite{
	
	public static Body bosquet1 ;
	public static boolean isBosquet1Created;
	public static Body bosquet2 ;
	public static boolean isBosquet2Created;
	public static Body bosquet3 ;
	public static boolean isBosquet3Created;
	
	public static Body mur1 ;
	public static boolean isMur1Created;
	
	public static Body rebord ;
	public static boolean isRebordCreated;
	
	public static Body arbre1;
	public static boolean isArbre1Created;
	
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
		ClimatMontagneux.eauProfonde(game,120+ x, 180+y);
		ClimatMontagneux.eauProfonde(game,120+ x, 240+y);
		ClimatMontagneux.eauProfonde(game,120+ x, 300+y);
		game.getBatch().draw(ClimatMontagneux.glace1, 120+ x, 360+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 120+ x, 420+ y);
		
		game.getBatch().draw(ClimatMontagneux.glace1, 180+ x, 0+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 180+ x, 60+ y);
		ClimatMontagneux.eauProfonde(game,180+ x, 120+y);
		ClimatMontagneux.eauProfonde(game,180+ x, 180+y);
		ClimatMontagneux.eauProfonde(game,180+ x, 240+y);
		ClimatMontagneux.eauProfonde(game,180+ x, 300+y);
		ClimatMontagneux.eauProfonde(game,180+ x, 360+y);
		game.getBatch().draw(ClimatMontagneux.glace1, 180+ x, 420+ y);
		
		game.getBatch().draw(ClimatMontagneux.glace1, 240+ x, 0+ y);
		ClimatMontagneux.eauProfonde(game,240+ x, 60+y);
		ClimatMontagneux.eauProfonde(game,240+ x, 120+y);
		ClimatMontagneux.eauProfonde(game,240+ x, 180+y);
		ClimatMontagneux.eauProfonde(game,240+ x, 240+y);
		ClimatMontagneux.eauProfonde(game,240+ x, 300+y);
		ClimatMontagneux.eauProfonde(game,240+ x, 360+y);
		game.getBatch().draw(ClimatMontagneux.glace1, 240+ x, 420+ y);
		
		ClimatMontagneux.eauProfonde(game,300+ x, 0+y);
		ClimatMontagneux.eauProfonde(game,300+ x, 60+y);
		ClimatMontagneux.eauProfonde(game,300+ x, 120+y);
		ClimatMontagneux.eauProfonde(game,300+ x, 180+y);
		ClimatMontagneux.eauProfonde(game,300+ x, 240+y);
		ClimatMontagneux.eauProfonde(game,300+ x, 300+y);
		ClimatMontagneux.eauProfonde(game,300+ x, 360+y);
		game.getBatch().draw(ClimatMontagneux.glace1, 300+ x, 420+ y);
		
		ClimatMontagneux.eauProfonde(game,360+ x, 0+y);
		ClimatMontagneux.eauProfonde(game,360+ x, 60+y);
		ClimatMontagneux.eauProfonde(game,360+ x, 120+y);
		ClimatMontagneux.eauProfonde(game,360+ x, 180+y);
		ClimatMontagneux.eauProfonde(game,360+ x, 240+y);
		ClimatMontagneux.eauProfonde(game,360+ x, 300+y);
		game.getBatch().draw(ClimatMontagneux.glace1, 360+ x, 360+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 360+ x, 420+ y);
		
		ClimatMontagneux.eauProfonde(game,420+ x, 0+y);
		ClimatMontagneux.eauProfonde(game,420+ x, 60+y);
		ClimatMontagneux.eauProfonde(game,420+ x, 120+y);
		ClimatMontagneux.eauProfonde(game,420+ x, 180+y);
		ClimatMontagneux.eauProfonde(game,420+ x, 240+y);
		game.getBatch().draw(ClimatMontagneux.glace1, 420+ x, 300+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 420+ x, 360+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 420+ x, 420+ y);
		
		ClimatMontagneux.eauProfonde(game,480+ x, 0+y);
		ClimatMontagneux.eauProfonde(game,480+ x, 60+y);
		ClimatMontagneux.eauProfonde(game,480+ x, 120+y);
		ClimatMontagneux.eauProfonde(game,480+ x, 180+y);
		game.getBatch().draw(ClimatMontagneux.glace1, 480+ x, 240+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 480+ x, 300+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 480+ x, 360+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 480+ x, 420+ y);
		
		ClimatMontagneux.eauProfonde(game,540+ x, 0+y);
		ClimatMontagneux.eauProfonde(game,540+ x, 60+y);
		ClimatMontagneux.eauProfonde(game,540+ x, 120+y);
		ClimatMontagneux.eauProfonde(game,540+ x, 180+y);
		game.getBatch().draw(ClimatMontagneux.glace1, 540+ x, 240+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 540+ x, 300+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 540+ x, 360+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 540+ x, 420+ y);
		
		game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 0+ x, 60+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéInfGau, 0+ x, 120+ y);
		game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 60+ x, 0+ y);
		game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 0+ x, 0+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéInfGau, 60+ x, 60+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéInfGau, 120+ x, 0+ y);
		

		game.getBatch().draw(ClimatMontagneux.tree, 0+ x, 140+ y);
		game.getBatch().draw(ClimatMontagneux.tree, 0+ x, 420+ y);
		
		game.getBatch().draw(ClimatMontagneux.bordGlacéSupDroi, 240+ x, 0+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéSupDroi, 180+ x, 60+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéSupDroi, 120+ x, 120+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéDroi, 60+ x, 180+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéDroi, 60+ x, 240+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéDroi, 60+ x, 300+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéInfDroi, 120+ x, 360+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéInf, 240+ x, 420+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéInf, 180+ x, 420+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéInf, 300+ x, 420+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéInfGau, 360+ x, 360+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéInfGau, 420+ x, 300+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéInfGau, 480+ x, 240+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéInf, 540+ x, 240+ y);

		game.getBatch().draw(ClimatMontagneux.bordGlacéInf, 180+ x, 0+ y);

		game.getBatch().draw(ClimatMontagneux.tree, 240+ x, 440+ y);
		game.getBatch().draw(ClimatMontagneux.tree, 180+ x, 440+ y);
		game.getBatch().draw(ClimatMontagneux.tree, 300+ x, 440+ y);
		
		game.getBatch().draw(ClimatMontagneux.tree, 540+ x, 420+ y);
		game.getBatch().draw(ClimatMontagneux.tree, 540+ x, 360+ y);
		
		game.getBatch().draw(ClimatMontagneux.planteGelé, 120+ x, 370+ y);
		game.getBatch().draw(ClimatMontagneux.planteGelé3, 360+ x, 380+ y);
		game.getBatch().draw(ClimatMontagneux.planteGelé, 180+ x, 60+ y);
		game.getBatch().draw(ClimatMontagneux.planteGelé3, 60+ x, 300+ y);
		game.getBatch().draw(ClimatMontagneux.planteGelé, 480+ x, 260+ y);
	}

	public static void destroyBody() {
		// TODO Auto-generated method stub
		if ( isBosquet1Created) MainMenu.world.destroyBody(bosquet1);
		isBosquet1Created = false;
		
		if ( isBosquet2Created) MainMenu.world.destroyBody(bosquet2);
		isBosquet2Created = false;
		
		if ( isBosquet3Created) MainMenu.world.destroyBody(bosquet3);
		isBosquet3Created = false;
		
		if ( isMur1Created) MainMenu.world.destroyBody(mur1);
		isMur1Created = false;
		
		if ( isRebordCreated) MainMenu.world.destroyBody(rebord);
		isRebordCreated = false;
		
		if ( isArbre1Created) MainMenu.world.destroyBody(arbre1);
		isArbre1Created = false;
	}

	public static void createBodyAndType(World world) {
		// TODO Auto-generated method stub
		CadrillageMap.setTypeDeDécor(5, 0, "EauProfonde");
		CadrillageMap.setTypeDeDécor(6, 0, "EauProfonde");
		CadrillageMap.setTypeDeDécor(7, 0, "EauProfonde");
		CadrillageMap.setTypeDeDécor(8, 0, "EauProfonde");
		CadrillageMap.setTypeDeDécor(9, 0, "EauProfonde");
		CadrillageMap.setTypeDeDécor(4, 1, "EauProfonde");
		CadrillageMap.setTypeDeDécor(5, 1, "EauProfonde");
		CadrillageMap.setTypeDeDécor(6, 1, "EauProfonde");
		CadrillageMap.setTypeDeDécor(7, 1, "EauProfonde");
		CadrillageMap.setTypeDeDécor(8, 1, "EauProfonde");
		CadrillageMap.setTypeDeDécor(9, 1, "EauProfonde");
		CadrillageMap.setTypeDeDécor(3, 2, "EauProfonde");
		CadrillageMap.setTypeDeDécor(4, 2, "EauProfonde");
		CadrillageMap.setTypeDeDécor(5, 2, "EauProfonde");
		CadrillageMap.setTypeDeDécor(6, 2, "EauProfonde");
		CadrillageMap.setTypeDeDécor(7, 2, "EauProfonde");
		CadrillageMap.setTypeDeDécor(8, 2, "EauProfonde");
		CadrillageMap.setTypeDeDécor(9, 2, "EauProfonde");
		CadrillageMap.setTypeDeDécor(2, 3, "EauProfonde");
		CadrillageMap.setTypeDeDécor(3, 3, "EauProfonde");
		CadrillageMap.setTypeDeDécor(4, 3, "EauProfonde");
		CadrillageMap.setTypeDeDécor(5, 3, "EauProfonde");
		CadrillageMap.setTypeDeDécor(6, 3, "EauProfonde");
		CadrillageMap.setTypeDeDécor(7, 3, "EauProfonde");
		CadrillageMap.setTypeDeDécor(8, 3, "EauProfonde");
		CadrillageMap.setTypeDeDécor(9, 3, "EauProfonde");
		CadrillageMap.setTypeDeDécor(2, 4, "EauProfonde");
		CadrillageMap.setTypeDeDécor(3, 4, "EauProfonde");
		CadrillageMap.setTypeDeDécor(4, 4, "EauProfonde");
		CadrillageMap.setTypeDeDécor(5, 4, "EauProfonde");
		CadrillageMap.setTypeDeDécor(6, 4, "EauProfonde");
		CadrillageMap.setTypeDeDécor(7, 4, "EauProfonde");
		CadrillageMap.setTypeDeDécor(2, 5, "EauProfonde");
		CadrillageMap.setTypeDeDécor(3, 5, "EauProfonde");
		CadrillageMap.setTypeDeDécor(4, 5, "EauProfonde");
		CadrillageMap.setTypeDeDécor(5, 5, "EauProfonde");
		CadrillageMap.setTypeDeDécor(6, 5, "EauProfonde");
		CadrillageMap.setTypeDeDécor(3, 6, "EauProfonde");
		CadrillageMap.setTypeDeDécor(4, 6, "EauProfonde");
		CadrillageMap.setTypeDeDécor(5, 6, "EauProfonde");

		
		if ( isBosquet1Created == false ) {
			bosquet1 = ClimatMontagneux.createBody(255,455,170,30);
			isBosquet1Created = true;
		}
		if ( isBosquet2Created == false ) {
			bosquet2 = ClimatMontagneux.createBody(20,100,60,210);
			isBosquet2Created = true;
		}
		if ( isBosquet3Created == false ) {
			bosquet3 = ClimatMontagneux.createBody(560,420,50,100);
			isBosquet3Created = true;
		}
		
		if ( isMur1Created == false ) {
			mur1 = ClimatMontagneux.createBody(80,40,60,60);
			isMur1Created = true;
		}
		
		if ( isRebordCreated == false ) {
			rebord = ClimatMontagneux.createBody(150,0,120,1);
			isRebordCreated = true;
		}
		
		if ( isArbre1Created == false ) {
			arbre1 = ClimatMontagneux.createBodyPerso("arbre", "static",0,420);
			isArbre1Created = true;
		}
	}

	public static void destroyType() {
		// TODO Auto-generated method stub
		
	}
}
