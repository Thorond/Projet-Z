package map;

import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.physics.box2d.Body;
import com.badlogic.gdx.physics.box2d.World;
import com.mygdx.game.GameMain;

import decors.ClimatMontagneux;
import scenes.MainMenu;

public class SousMapF4 extends Sprite{
	
	public static Body cote1 ;
	public static boolean isCote1Created;
	public static Body cote2 ;
	public static boolean isCote2Created;
	
	public static void sousMap(GameMain game, int x, int y){
		
		ClimatMontagneux.eauProfonde(game,0+ x, 0+y);
		ClimatMontagneux.eauProfonde(game,0+ x, 60+y);
		ClimatMontagneux.eauProfonde(game,0+ x, 120+y);
		ClimatMontagneux.eauProfonde(game,0+ x, 180+y);	
		game.getBatch().draw(ClimatMontagneux.glace1, 0 + x,240 + y);
		game.getBatch().draw(ClimatMontagneux.glace1, 0+ x, 300+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 0+ x, 360+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 0+ x, 420+ y);
		
		game.getBatch().draw(ClimatMontagneux.glace1, 60+ x, 0+ y);
		ClimatMontagneux.eauProfonde(game,60+ x, 60+y);
		ClimatMontagneux.eauProfonde(game,60+ x, 120+y);
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
		game.getBatch().draw(ClimatMontagneux.escalierGlacé, 300+ x, 420+ y);
		game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 360+ x, 420+ y);
		game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 420+ x, 420+ y);
		game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 480+ x, 420+ y);
		game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 540+ x, 420+ y);
		
		game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 0+ x, 360+ y);
		game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 60+ x, 360+ y);
		game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 120+ x, 360+ y);
		game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 180+ x, 360+ y);
		game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 240+ x, 360+ y);
		game.getBatch().draw(ClimatMontagneux.escalierGlacé, 300+ x, 360+ y);
		game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 360+ x, 360+ y);
		game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 420+ x, 360+ y);
		game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 480+ x, 360+ y);
		game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 540+ x, 360+ y);
		
		game.getBatch().draw(ClimatMontagneux.piedCassé1Sup, 0+ x, 300+ y);
		game.getBatch().draw(ClimatMontagneux.piedGlacéSup, 60+ x, 300+ y);
		game.getBatch().draw(ClimatMontagneux.piedGlacéSup, 120+ x, 300+ y);
		game.getBatch().draw(ClimatMontagneux.piedCassé1Sup, 180+ x, 300+ y);
		game.getBatch().draw(ClimatMontagneux.piedGlacéSup, 240+ x, 300+ y);
		game.getBatch().draw(ClimatMontagneux.piedCassé2Sup, 360+ x, 300+ y);
		game.getBatch().draw(ClimatMontagneux.piedCassé1Sup, 420+ x, 300+ y);
		game.getBatch().draw(ClimatMontagneux.piedGlacéSup, 480+ x, 300+ y);
		game.getBatch().draw(ClimatMontagneux.piedGlacéSup, 540+ x, 300+ y);
		

		game.getBatch().draw(ClimatMontagneux.bordGlacéInf, 0+ x, 240+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéInfGau, 60+ x, 180+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéGau, 120+ x, 120+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéGau, 120+ x, 60+ y);
		game.getBatch().draw(ClimatMontagneux.cheminGlaceHori, 60+ x, 0+ y);
		
		game.getBatch().draw(ClimatMontagneux.bordGlacéInf, 120+ x, 0+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéInf, 180+ x, 0+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéInf, 240+ x, 0+ y);
		

		game.getBatch().draw(ClimatMontagneux.planteGelé, 60+ x, 300+ y);
		game.getBatch().draw(ClimatMontagneux.planteGelé, 120+ x, 240+ y);
		game.getBatch().draw(ClimatMontagneux.planteGelé, 120+ x, 120+ y);
		game.getBatch().draw(ClimatMontagneux.planteGelé, 180+ x, 240+ y);
		game.getBatch().draw(ClimatMontagneux.planteGelé, 180+ x, 180+ y);
		game.getBatch().draw(ClimatMontagneux.planteGelé, 240+ x, 240+ y);
		game.getBatch().draw(ClimatMontagneux.planteGelé, 240+ x, 180+ y);
		game.getBatch().draw(ClimatMontagneux.planteGelé, 360+ x, 180+ y);

		game.getBatch().draw(ClimatMontagneux.petitePierre, 420+ x, 180+ y);
		game.getBatch().draw(ClimatMontagneux.petitePierre, 360+ x, 300+ y);

		game.getBatch().draw(ClimatMontagneux.tree, 570+ x, 280+ y);
		game.getBatch().draw(ClimatMontagneux.tree, 420+ x, 250+ y);
		game.getBatch().draw(ClimatMontagneux.tree, 540+ x, 250+ y);
		game.getBatch().draw(ClimatMontagneux.tree, 450+ x, 220+ y);
		game.getBatch().draw(ClimatMontagneux.tree, 510+ x, 220+ y);
		game.getBatch().draw(ClimatMontagneux.tree, 480+ x, 190+ y);
		
		game.getBatch().draw(ClimatMontagneux.tree, 360+ x, 130+ y);
		game.getBatch().draw(ClimatMontagneux.tree, 330+ x, 100+ y);
		game.getBatch().draw(ClimatMontagneux.tree, 390+ x, 100+ y);
		game.getBatch().draw(ClimatMontagneux.tree, 240+ x, 70+ y);
		game.getBatch().draw(ClimatMontagneux.tree, 300+ x, 70+ y);
		game.getBatch().draw(ClimatMontagneux.tree, 360+ x, 70+ y);
		game.getBatch().draw(ClimatMontagneux.tree, 150+ x, 40+ y);
		game.getBatch().draw(ClimatMontagneux.tree, 210+ x, 40+ y);
		game.getBatch().draw(ClimatMontagneux.tree, 270+ x, 40+ y);
		game.getBatch().draw(ClimatMontagneux.tree, 330+ x, 40+ y);
		game.getBatch().draw(ClimatMontagneux.tree, 120+ x, 10+ y);
		game.getBatch().draw(ClimatMontagneux.tree, 180+ x, 10+ y);
		game.getBatch().draw(ClimatMontagneux.tree, 240+ x, 10+ y);
		game.getBatch().draw(ClimatMontagneux.tree, 300+ x, 10+ y);
		game.getBatch().draw(ClimatMontagneux.tree, 60+ x, 10+ y);
		

		game.getBatch().draw(ClimatMontagneux.planteGelé, 360+ x, 0+ y);
		game.getBatch().draw(ClimatMontagneux.planteGelé, 420+ x, 60+ y);
		game.getBatch().draw(ClimatMontagneux.planteGelé, 540+ x, 00+ y);
		game.getBatch().draw(ClimatMontagneux.planteGelé, 540+ x, 180+ y);
	}

	public static void destroyBody() {
		// TODO Auto-generated method stub
		if ( isCote1Created) MainMenu.world.destroyBody(cote1);
		isCote1Created = false;
		
		if ( isCote2Created) MainMenu.world.destroyBody(cote2);
		isCote2Created = false;
	}

	public static void createBodyAndType(World world) {
		// TODO Auto-generated method stub
		CadrillageMap.setTypeDeDécor(0, 0, "EauProfonde");
		CadrillageMap.setTypeDeDécor(0, 1, "EauProfonde");
		CadrillageMap.setTypeDeDécor(0, 2, "EauProfonde");
		CadrillageMap.setTypeDeDécor(0, 3, "EauProfonde");
		CadrillageMap.setTypeDeDécor(1, 1, "EauProfonde");
		CadrillageMap.setTypeDeDécor(1, 2, "EauProfonde");
		
		if ( isCote1Created == false ) {
			cote1 = ClimatMontagneux.createBody(140,420,290,120);
			isCote1Created = true;
		}
		if ( isCote2Created == false ) {
			cote2 = ClimatMontagneux.createBody(460,420,240,120);
			isCote2Created = true;
		}
	}

	public static void destroyType() {
		// TODO Auto-generated method stub
		
	}
}