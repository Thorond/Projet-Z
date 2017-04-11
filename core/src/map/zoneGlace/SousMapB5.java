package map.zoneGlace;

import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.physics.box2d.Body;
import com.badlogic.gdx.physics.box2d.World;
import com.mygdx.game.GameMain;

import decors.ClimatMontagneux;
import map.CadrillageMap;
import scenes.MainMenu;

public class SousMapB5 extends Sprite{
	
	public static Body arbre1;
	public static boolean isArbre1Created;
	
	public static Body bordPont1 ;
	public static boolean isbordPont1Created;
	public static Body bordPont2 ;
	public static boolean isbordPont2Created;
	
	public static Body mur1;
	public static boolean ismur1Created;
	
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
		
//		

		game.getBatch().draw(ClimatMontagneux.murGlacéGauche, 240+ x, 420+ y);
		game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 300+ x, 420+ y);
		game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 360+ x, 420+ y);
		game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 420+ x, 420+ y);
		game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 480+ x, 420+ y);
		game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 540+ x, 420+ y);
		

		game.getBatch().draw(ClimatMontagneux.bordGlacéDroi, 180+ x, 360+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéDroi, 180+ x, 300+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéSupDroi, 240+ x, 240+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéDroi, 240+ x, 180+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéDroi, 240+ x, 120+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéDroi, 240+ x, 60+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéDroi, 240+ x, 0+ y);

		game.getBatch().draw(ClimatMontagneux.bordGlacéSupGau, 540+ x, 240+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéGau, 540+ x, 180+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéGau, 540+ x, 120+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéGau, 540+ x, 60+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéGau, 540+ x, 0+ y);
		
		ClimatMontagneux.eauProfonde(game,240+x,360+y);
		ClimatMontagneux.eauProfonde300(game,300+x,360+y);
		ClimatMontagneux.eauProfonde150(game,360+x,360+y);
		ClimatMontagneux.eauProfonde150(game,420+x,360+y);
		ClimatMontagneux.eauProfonde300(game,480+x,360+y);
		ClimatMontagneux.eauProfonde(game,540+x,360+y);
		
		ClimatMontagneux.eauProfonde(game,240+x,300+y);
		ClimatMontagneux.eauProfonde300(game,300+x,300+y);
		ClimatMontagneux.eauProfonde300(game,360+x,300+y);
		ClimatMontagneux.eauProfonde300(game,420+x,300+y);
		ClimatMontagneux.eauProfonde300(game,480+x,300+y);
		ClimatMontagneux.eauProfonde(game,540+x,300+y);
		
		ClimatMontagneux.eauProfonde(game,300+x,240+y);
		ClimatMontagneux.eauProfonde(game,360+x,240+y);
		ClimatMontagneux.eauProfonde(game,420+x,240+y);
		ClimatMontagneux.eauProfonde(game,480+x,240+y);
		
		ClimatMontagneux.eauProfonde(game,300+x,180+y);
		ClimatMontagneux.eauProfonde(game,360+x,180+y);
		ClimatMontagneux.eauProfonde(game,420+x,180+y);
		ClimatMontagneux.eauProfonde(game,480+x,180+y);
		
		ClimatMontagneux.eauProfonde(game,300+x,120+y);
		ClimatMontagneux.eauProfonde(game,360+x,120+y);
		ClimatMontagneux.eauProfonde(game,420+x,120+y);
		ClimatMontagneux.eauProfonde(game,480+x,120+y);
		
		ClimatMontagneux.eauProfonde(game,300+x,60+y);
		ClimatMontagneux.eauProfonde(game,360+x,60+y);
		ClimatMontagneux.eauProfonde(game,420+x,60+y);
		ClimatMontagneux.eauProfonde(game,480+x,60+y);
		
		ClimatMontagneux.eauProfonde(game,300+x,0+y);
		ClimatMontagneux.eauProfonde(game,360+x,0+y);
		ClimatMontagneux.eauProfonde(game,420+x,0+y);
		ClimatMontagneux.eauProfonde(game,480+x,0+y);

		ClimatMontagneux.annimationCascadePetite(game, 350+x, 400+y);
		

		ClimatMontagneux.placerGrandPont(game, 280+x, 120+y);

		game.getBatch().draw(ClimatMontagneux.tree,580+ x, 330+ y);
		game.getBatch().draw(ClimatMontagneux.tree,550+ x, 270+ y);
	}

	public static void destroyBody() {
		// TODO Auto-generated method stub
		if ( isArbre1Created) MainMenu.world.destroyBody(arbre1);
		isArbre1Created = false;
		
		if ( isbordPont1Created) MainMenu.world.destroyBody(bordPont1);
		isbordPont1Created = false;
		
		if ( isbordPont2Created) MainMenu.world.destroyBody(bordPont2);
		isbordPont2Created = false;
		
		if ( ismur1Created) MainMenu.world.destroyBody(mur1);
		ismur1Created = false;
	}

	public static void createBodyAndType(World world) {
		// TODO Auto-generated method stub
		CadrillageMap.setTypeDeDécor(5, 0, "EauProfonde");
		CadrillageMap.setTypeDeDécor(6, 0, "EauProfonde");
		CadrillageMap.setTypeDeDécor(7, 0, "EauProfonde");
		CadrillageMap.setTypeDeDécor(8, 0, "EauProfonde");
		CadrillageMap.setTypeDeDécor(5, 1, "EauProfonde");
		CadrillageMap.setTypeDeDécor(6, 1, "EauProfonde");
		CadrillageMap.setTypeDeDécor(7, 1, "EauProfonde");
		CadrillageMap.setTypeDeDécor(8, 1, "EauProfonde");
		CadrillageMap.setTypeDeDécor(5, 4, "EauProfonde");
		CadrillageMap.setTypeDeDécor(6, 4, "EauProfonde");
		CadrillageMap.setTypeDeDécor(7, 4, "EauProfonde");
		CadrillageMap.setTypeDeDécor(8, 4, "EauProfonde");
		CadrillageMap.setTypeDeDécor(4, 5, "EauProfonde");
		CadrillageMap.setTypeDeDécor(5, 5, "EauProfonde");
		CadrillageMap.setTypeDeDécor(6, 5, "EauProfonde");
		CadrillageMap.setTypeDeDécor(7, 5, "EauProfonde");
		CadrillageMap.setTypeDeDécor(8, 5, "EauProfonde");
		CadrillageMap.setTypeDeDécor(9, 5, "EauProfonde");
		CadrillageMap.setTypeDeDécor(4, 6, "EauProfonde");
		CadrillageMap.setTypeDeDécor(5, 6, "EauProfonde");
		CadrillageMap.setTypeDeDécor(6, 6, "EauProfonde");
		CadrillageMap.setTypeDeDécor(7, 6, "EauProfonde");
		CadrillageMap.setTypeDeDécor(8, 6, "EauProfonde");
		CadrillageMap.setTypeDeDécor(9, 6, "EauProfonde");
		
		if ( isArbre1Created == false ) {
			arbre1 = ClimatMontagneux.createBodyPerso("arbre", "static",550,270);
			isArbre1Created = true;
		}
		
		if ( isbordPont1Created == false ) {
			bordPont1 = ClimatMontagneux.createBody(420,150,270,1);
			isbordPont1Created = true;
		}
		if ( isbordPont2Created == false ) {
			bordPont2 = ClimatMontagneux.createBody(420,240,270,1);
			isbordPont2Created = true;
		}
		
		if ( ismur1Created == false ) {
			mur1 = ClimatMontagneux.createBody(420,450,390,60);
			ismur1Created = true;
		}
	}

	public static void destroyType() {
		// TODO Auto-generated method stub
		
	}
}
