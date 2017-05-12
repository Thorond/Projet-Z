package map.zoneGlace;

import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.physics.box2d.Body;
import com.badlogic.gdx.physics.box2d.World;
import com.mygdx.game.GameMain;

import decors.ClimatMontagneux;
import map.CadrillageMap;
import scenes.MainMenu;

public class SousMapB6 extends Sprite{
	
	public static Body mur1;
	public static boolean ismur1Created;

    public static Body mur2;
    public static boolean ismur2Created;
	
	public static void sousMap(GameMain game, int x, int y){
		
		ClimatMontagneux.eauProfondeGlacée(game,0+ x, 0+y);
		game.getBatch().draw(ClimatMontagneux.glace1, 0+ x, 60+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 0+ x, 120+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 0+ x, 180+ y);		
		game.getBatch().draw(ClimatMontagneux.glace1, 0 + x,240 + y);
		game.getBatch().draw(ClimatMontagneux.glace1, 0+ x, 300+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 0+ x, 360+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 0+ x, 420+ y);
		
		ClimatMontagneux.eauProfondeGlacée(game,60+ x, 0+y);
		game.getBatch().draw(ClimatMontagneux.glace1, 60+ x, 60+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 60+ x, 120+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 60+ x, 180+ y);		
		game.getBatch().draw(ClimatMontagneux.glace1, 60+ x, 240+ y);	
		game.getBatch().draw(ClimatMontagneux.glace1, 60+ x, 300+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 60+ x, 360+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 60+ x, 420+ y);
		
		ClimatMontagneux.eauProfondeGlacée(game,120+ x, 0+y);
		game.getBatch().draw(ClimatMontagneux.glace1, 120+ x, 60+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 120+ x, 120+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 120+ x, 180+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 120+ x, 240+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 120+ x, 300+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 120+ x, 360+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 120+ x, 420+ y);
		
		ClimatMontagneux.eauProfondeGlacée(game,180+ x, 0+y);
		game.getBatch().draw(ClimatMontagneux.glace1, 180+ x, 60+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 180+ x, 120+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 180+ x, 180+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 180+ x, 240+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 180+ x, 300+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 180+ x, 360+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 180+ x, 420+ y);
		
		ClimatMontagneux.eauProfondeGlacée(game,240+ x, 0+y);
		game.getBatch().draw(ClimatMontagneux.glace1, 240+ x, 60+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 240+ x, 120+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 240+ x, 180+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 240+ x, 240+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 240+ x, 300+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 240+ x, 360+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 240+ x, 420+ y);
		
		ClimatMontagneux.eauProfondeGlacée(game,300+ x, 0+y);
		game.getBatch().draw(ClimatMontagneux.glace1, 300+ x, 60+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 300+ x, 120+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 300+ x, 180+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 300+ x, 240+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 300+ x, 300+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 300+ x, 360+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 300+ x, 420+ y);
		
		ClimatMontagneux.eauProfondeGlacée(game,360+ x, 0+y);
		game.getBatch().draw(ClimatMontagneux.glace1, 360+ x, 60+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 360+ x, 120+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 360+ x, 180+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 360+ x, 240+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 360+ x, 300+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 360+ x, 360+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 360+ x, 420+ y);
		
		ClimatMontagneux.eauProfondeGlacée(game,420+ x, 0+y);
		game.getBatch().draw(ClimatMontagneux.glace1, 420+ x, 60+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 420+ x, 120+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 420+ x, 180+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 420+ x, 240+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 420+ x, 300+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 420+ x, 360+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 420+ x, 420+ y);
		
		ClimatMontagneux.eauProfondeGlacée(game,480+ x, 0+y);
		game.getBatch().draw(ClimatMontagneux.glace1, 480+ x, 60+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 480+ x, 120+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 480+ x, 180+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 480+ x, 240+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 480+ x, 300+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 480+ x, 360+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 480+ x, 420+ y);
		
		ClimatMontagneux.eauProfondeGlacée(game,540+ x, 0+y);
		game.getBatch().draw(ClimatMontagneux.glace1, 540+ x, 60+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 540+ x, 120+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 540+ x, 180+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 540+ x, 240+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 540+ x, 300+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 540+ x, 360+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 540+ x, 420+ y);
		
//		

		game.getBatch().draw(ClimatMontagneux.bordGlacéInf, 0+ x, 180+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéInf, 60+ x, 180+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéInf, 120+ x, 180+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéInf, 180+ x, 180+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéInf, 240+ x, 180+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéInf, 300+ x, 180+ y);
		game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 0+ x, 120+ y);
		game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 60+ x, 120+ y);
		game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 120+ x, 120+ y);
		game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 180+ x, 120+ y);
		game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 240+ x, 120+ y);
		game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 300+ x, 120+ y);
		game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 360+ x, 120+ y);
		game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 420+ x, 120+ y);
		game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 480+ x, 120+ y);
		game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 540+ x, 120+ y);
		game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 0+ x, 60+ y);
		game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 60+ x, 60+ y);
		game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 120+ x, 60+ y);
		game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 180+ x, 60+ y);
		game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 240+ x, 60+ y);
		game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 300+ x, 60+ y);
		game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 360+ x, 60+ y);
		game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 420+ x, 60+ y);
		game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 480+ x, 60+ y);
		game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 540+ x, 60+ y);
		game.getBatch().draw(ClimatMontagneux.murBasMer, 0+ x, 0+ y);
		game.getBatch().draw(ClimatMontagneux.murBasMer, 60+ x, 0+ y);
		game.getBatch().draw(ClimatMontagneux.murBasMer, 120+ x, 0+ y);
		game.getBatch().draw(ClimatMontagneux.murBasMer, 180+ x, 0+ y);
		game.getBatch().draw(ClimatMontagneux.murBasMer, 240+ x, 0+ y);
		game.getBatch().draw(ClimatMontagneux.murBasMer, 300+ x, 0+ y);
		game.getBatch().draw(ClimatMontagneux.murBasMer, 360+ x, 0+ y);
		game.getBatch().draw(ClimatMontagneux.murBasMer, 420+ x, 0+ y);
		game.getBatch().draw(ClimatMontagneux.murBasMer, 480+ x, 0+ y);
		game.getBatch().draw(ClimatMontagneux.murBasMer, 540+ x, 0+ y);

		game.getBatch().draw(ClimatMontagneux.bordGlacéDroi, 240+ x, 420+ y);
		ClimatMontagneux.eauProfonde(game,300+x,420+y);
		ClimatMontagneux.eauProfonde(game,360+x,420+y);
		ClimatMontagneux.eauProfonde(game,420+x,420+y);
		ClimatMontagneux.eauProfonde(game,480+x,420+y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéGau, 540+ x, 420+ y);

		game.getBatch().draw(ClimatMontagneux.bordGlacéDroi, 240+ x, 360+ y);
		ClimatMontagneux.eauProfonde(game,300+x,360+y);
		ClimatMontagneux.eauProfonde(game,360+x,360+y);
		ClimatMontagneux.eauProfonde(game,420+x,360+y);
		ClimatMontagneux.eauProfonde(game,480+x,360+y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéGau, 540+ x, 360+ y);

		game.getBatch().draw(ClimatMontagneux.bordGlacéDroi, 240+ x, 300+ y);
		ClimatMontagneux.eauProfonde(game,300+x,300+y);
		ClimatMontagneux.eauProfonde(game,360+x,300+y);
		ClimatMontagneux.eauProfonde(game,420+x,300+y);
		ClimatMontagneux.eauProfonde(game,480+x,300+y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéGau, 540+ x, 300+ y);

		game.getBatch().draw(ClimatMontagneux.bordGlacéDroi, 240+ x, 240+ y);
		ClimatMontagneux.eauProfonde300(game,300+x,240+y);
		ClimatMontagneux.eauProfonde300(game,360+x,240+y);
		ClimatMontagneux.eauProfonde300(game,420+x,240+y);
		ClimatMontagneux.eauProfonde300(game,480+x,240+y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéGau, 540+ x, 240+ y);

		game.getBatch().draw(ClimatMontagneux.bordGlacéInfDroi, 240+ x, 180+ y);
		ClimatMontagneux.eauProfonde300(game,300+x,180+y);
		ClimatMontagneux.eauProfonde150(game,360+x,180+y);
		ClimatMontagneux.eauProfonde150(game,420+x,180+y);
		ClimatMontagneux.eauProfonde300(game,480+x,180+y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéInfGau, 540+ x, 180+ y);
		
		
		
		ClimatMontagneux.annimationCascadeMoy(game, 300+x, 35+y);


		game.getBatch().draw(ClimatMontagneux.tree, 570+ x, 340+ y);
		game.getBatch().draw(ClimatMontagneux.tree, 540+ x, 310+ y);
		game.getBatch().draw(ClimatMontagneux.tree, 570+ x, 290+ y);
		game.getBatch().draw(ClimatMontagneux.tree, 540+ x, 260+ y);
		game.getBatch().draw(ClimatMontagneux.tree, 570+ x, 230+ y);
		game.getBatch().draw(ClimatMontagneux.tree, 540+ x, 200+ y);
		
	}

	public static void destroyBody() {
		// TODO Auto-generated method stub
		if ( ismur1Created) MainMenu.world.destroyBody(mur1);
		ismur1Created = false;

        if ( ismur2Created) MainMenu.world.destroyBody(mur2);
        ismur2Created = false;
	}

	public static void createBodyAndType(World world) {
		// TODO Auto-generated method stub
		CadrillageMap.setTypeDeDécor(5, 3, "EauProfonde");
		CadrillageMap.setTypeDeDécor(6, 3, "EauProfonde");
		CadrillageMap.setTypeDeDécor(7, 3, "EauProfonde");
		CadrillageMap.setTypeDeDécor(8, 3, "EauProfonde");
		CadrillageMap.setTypeDeDécor(5, 4, "EauProfonde");
		CadrillageMap.setTypeDeDécor(6, 4, "EauProfonde");
		CadrillageMap.setTypeDeDécor(7, 4, "EauProfonde");
		CadrillageMap.setTypeDeDécor(8, 4, "EauProfonde");
		CadrillageMap.setTypeDeDécor(5, 5, "EauProfonde");
		CadrillageMap.setTypeDeDécor(6, 5, "EauProfonde");
		CadrillageMap.setTypeDeDécor(7, 5, "EauProfonde");
		CadrillageMap.setTypeDeDécor(8, 5, "EauProfonde");
		CadrillageMap.setTypeDeDécor(5, 6, "EauProfonde");
		CadrillageMap.setTypeDeDécor(6, 6, "EauProfonde");
		CadrillageMap.setTypeDeDécor(7, 6, "EauProfonde");
		CadrillageMap.setTypeDeDécor(8, 6, "EauProfonde");
		CadrillageMap.setTypeDeDécor(5, 7, "EauProfonde");
		CadrillageMap.setTypeDeDécor(6, 7, "EauProfonde");
		CadrillageMap.setTypeDeDécor(7, 7, "EauProfonde");
		CadrillageMap.setTypeDeDécor(8, 7, "EauProfonde");
		
		if ( ismur1Created == false ) {
			mur1 = ClimatMontagneux.createBody(300,180,600,1);
			ismur1Created = true;
		}


        if ( ismur2Created == false ) {
            mur2 = ClimatMontagneux.createBody(570,350,60,120);
            ismur2Created = true;
        }
	}

	public static void destroyType() {
		// TODO Auto-generated method stub
		
	}
}
