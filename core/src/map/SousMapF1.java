package map;

import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.physics.box2d.Body;
import com.badlogic.gdx.physics.box2d.World;
import com.mygdx.game.GameMain;

import decors.ClimatMontagneux;
import items.Bouclier;
import items.Epee;
import scenes.MainMenu;

public class SousMapF1 extends Sprite{
	
	public static Body cote1 ;
	public static boolean isCote1Created;
	public static Body cote2 ;
	public static boolean isCote2Created;
	public static Body cote3 ;
	public static boolean isCote3Created;
	public static Body cote4 ;
	public static boolean isCote4Created;
	public static Body cote5 ;
	public static boolean isCote5Created;
	
	public static Body pedestal ;
	public static boolean isPedestalCreated;
	
	public static void sousMap(GameMain game, int x, int y){
		
		game.getBatch().draw(ClimatMontagneux.ciel, 0+ x, 0+ y);
		game.getBatch().draw(ClimatMontagneux.ciel, 0+ x, 60+ y);
		game.getBatch().draw(ClimatMontagneux.ciel, 0+ x, 120+ y);
		game.getBatch().draw(ClimatMontagneux.ciel, 0+ x, 180+ y);		
		game.getBatch().draw(ClimatMontagneux.ciel, 0 + x,240 + y);
		game.getBatch().draw(ClimatMontagneux.ciel, 0+ x, 300+ y);
		game.getBatch().draw(ClimatMontagneux.ciel, 0+ x, 360+ y);
		game.getBatch().draw(ClimatMontagneux.ciel, 0+ x, 420+ y);
		
		game.getBatch().draw(ClimatMontagneux.ciel, 60+ x, 0+ y);
		game.getBatch().draw(ClimatMontagneux.ciel, 60+ x, 60+ y);
		game.getBatch().draw(ClimatMontagneux.ciel, 60+ x, 120+ y);
		game.getBatch().draw(ClimatMontagneux.ciel, 60+ x, 180+ y);		
		game.getBatch().draw(ClimatMontagneux.ciel, 60+ x, 240+ y);	
		game.getBatch().draw(ClimatMontagneux.ciel, 60+ x, 300+ y);
		game.getBatch().draw(ClimatMontagneux.ciel, 60+ x, 360+ y);
		game.getBatch().draw(ClimatMontagneux.ciel, 60+ x, 420+ y);
		
		game.getBatch().draw(ClimatMontagneux.ciel, 120+ x, 0+ y);
		game.getBatch().draw(ClimatMontagneux.ciel, 120+ x, 60+ y);
		game.getBatch().draw(ClimatMontagneux.ciel, 120+ x, 120+ y);
		game.getBatch().draw(ClimatMontagneux.ciel, 120+ x, 180+ y);
		game.getBatch().draw(ClimatMontagneux.ciel, 120+ x, 240+ y);
		game.getBatch().draw(ClimatMontagneux.ciel, 120+ x, 300+ y);
		game.getBatch().draw(ClimatMontagneux.ciel, 120+ x, 360+ y);
		game.getBatch().draw(ClimatMontagneux.ciel, 120+ x, 420+ y);
		
		game.getBatch().draw(ClimatMontagneux.ciel, 180+ x, 0+ y);
		game.getBatch().draw(ClimatMontagneux.ciel, 180+ x, 60+ y);
		game.getBatch().draw(ClimatMontagneux.ciel, 180+ x, 120+ y);
		game.getBatch().draw(ClimatMontagneux.ciel, 180+ x, 180+ y);
		game.getBatch().draw(ClimatMontagneux.ciel, 180+ x, 240+ y);
		game.getBatch().draw(ClimatMontagneux.ciel, 180+ x, 300+ y);
		game.getBatch().draw(ClimatMontagneux.ciel, 180+ x, 360+ y);
		game.getBatch().draw(ClimatMontagneux.ciel, 180+ x, 420+ y);
		
		game.getBatch().draw(ClimatMontagneux.glace1, 240+ x, 0+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 240+ x, 60+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 240+ x, 120+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 240+ x, 180+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 240+ x, 240+ y);
		game.getBatch().draw(ClimatMontagneux.ciel, 240+ x, 300+ y);
		game.getBatch().draw(ClimatMontagneux.ciel, 240+ x, 360+ y);
		game.getBatch().draw(ClimatMontagneux.ciel, 240+ x, 420+ y);
		
		game.getBatch().draw(ClimatMontagneux.glace1, 300+ x, 0+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 300+ x, 60+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 300+ x, 120+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 300+ x, 180+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 300+ x, 240+ y);
		game.getBatch().draw(ClimatMontagneux.ciel, 300+ x, 300+ y);
		game.getBatch().draw(ClimatMontagneux.ciel, 300+ x, 360+ y);
		game.getBatch().draw(ClimatMontagneux.ciel, 300+ x, 420+ y);
		
		game.getBatch().draw(ClimatMontagneux.glace1, 360+ x, 0+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 360+ x, 60+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 360+ x, 120+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 360+ x, 180+ y);
		game.getBatch().draw(ClimatMontagneux.ciel, 360+ x, 240+ y);
		game.getBatch().draw(ClimatMontagneux.ciel, 360+ x, 300+ y);
		game.getBatch().draw(ClimatMontagneux.ciel, 360+ x, 360+ y);
		game.getBatch().draw(ClimatMontagneux.ciel, 360+ x, 420+ y);
		
		game.getBatch().draw(ClimatMontagneux.glace1, 420+ x, 0+ y);
		game.getBatch().draw(ClimatMontagneux.ciel, 420+ x, 60+ y);
		game.getBatch().draw(ClimatMontagneux.ciel, 420+ x, 120+ y);
		game.getBatch().draw(ClimatMontagneux.ciel, 420+ x, 180+ y);
		game.getBatch().draw(ClimatMontagneux.ciel, 420+ x, 240+ y);
		game.getBatch().draw(ClimatMontagneux.ciel, 420+ x, 300+ y);
		game.getBatch().draw(ClimatMontagneux.ciel, 420+ x, 360+ y);
		game.getBatch().draw(ClimatMontagneux.ciel, 420+ x, 420+ y);
		
		game.getBatch().draw(ClimatMontagneux.ciel, 480+ x, 0+ y);
		game.getBatch().draw(ClimatMontagneux.ciel, 480+ x, 60+ y);
		game.getBatch().draw(ClimatMontagneux.ciel, 480+ x, 120+ y);
		game.getBatch().draw(ClimatMontagneux.ciel, 480+ x, 180+ y);
		game.getBatch().draw(ClimatMontagneux.ciel, 480+ x, 240+ y);
		game.getBatch().draw(ClimatMontagneux.ciel, 480+ x, 300+ y);
		game.getBatch().draw(ClimatMontagneux.ciel, 480+ x, 360+ y);
		game.getBatch().draw(ClimatMontagneux.ciel, 480+ x, 420+ y);
		
		game.getBatch().draw(ClimatMontagneux.ciel, 540+ x, 0+ y);
		game.getBatch().draw(ClimatMontagneux.ciel, 540+ x, 60+ y);
		game.getBatch().draw(ClimatMontagneux.ciel, 540+ x, 120+ y);
		game.getBatch().draw(ClimatMontagneux.ciel, 540+ x, 180+ y);
		game.getBatch().draw(ClimatMontagneux.ciel, 540+ x, 240+ y);
		game.getBatch().draw(ClimatMontagneux.ciel, 540+ x, 300+ y);
		game.getBatch().draw(ClimatMontagneux.ciel, 540+ x, 360+ y);
		game.getBatch().draw(ClimatMontagneux.ciel, 540+ x, 420+ y);
		
		game.getBatch().draw(ClimatMontagneux.bordGlacéGau, 60+ x, 0+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéGau, 60+ x, 60+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéSupGau, 60+ x, 120+ y);
		
		game.getBatch().draw(ClimatMontagneux.bordGlacéGau, 120+ x, 0+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéGau, 120+ x, 60+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéGau, 120+ x, 120+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéSupGau, 120+ x, 180+ y);
		
		game.getBatch().draw(ClimatMontagneux.bordGlacéDroi, 540+ x, 0+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéDroi, 540+ x, 60+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéSupDroi, 540+ x, 120+ y);
		
		game.getBatch().draw(ClimatMontagneux.bordGlacéDroi, 480+ x, 0+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéDroi, 480+ x, 60+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéDroi, 480+ x, 120+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéSupDroi, 480+ x, 180+ y);
		
		game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 180+ x, 0+ y);
		game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 240+ x, 0+ y);
		game.getBatch().draw(ClimatMontagneux.escalierGlacé, 300+ x, 0+ y);
		game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 360+ x, 0+ y);
		game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 420+ x, 0+ y);
		
		game.getBatch().draw(ClimatMontagneux.murGlacéGauche, 180+ x,60+ y);
		game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 240+ x, 60+ y);
		game.getBatch().draw(ClimatMontagneux.escalierGlacé, 300+ x, 60+ y);
		game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 360+ x, 60+ y);
		game.getBatch().draw(ClimatMontagneux.murGlacéDroite, 420+ x, 60+ y);
		
		game.getBatch().draw(ClimatMontagneux.bordGlacéInfGau, 180+ x,120+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéInf, 240+ x, 120+ y);
		game.getBatch().draw(ClimatMontagneux.escalierHaut, 300+ x, 120+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéInf, 360+ x, 120+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéInfDroi, 420+ x, 120+ y);
		
		game.getBatch().draw(ClimatMontagneux.bordGlacéGau, 180+ x,180+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéDroi, 420+ x, 180+ y);
		
		game.getBatch().draw(ClimatMontagneux.bordGlacéSupGau, 180+ x,240+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéSup, 240+ x,240+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéSup, 300+ x,240+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéSup, 360+ x,240+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéSupDroi, 420+ x, 240+ y);

		game.getBatch().draw(Epee.pedestal, 305+ x, 210+ y);
		if ( Epee.isEpéePrise == false ) game.getBatch().draw(Epee.épéeAnvil, 312+ x, 250+ y);
		if ( MainMenu.Link.annimationAward ) {
			game.getBatch().draw(Epee.épéeT, MainMenu.Link.getX() - 10, MainMenu.Link.getY() + 50);
			game.getBatch().draw(Epee.texteEpée, 100 + x, 60+y);
		}
	}

	public static void destroyBody() {
		// TODO Auto-generated method stub

		if ( isCote1Created) MainMenu.world.destroyBody(cote1);
		isCote1Created = false;
		
		if ( isCote2Created) MainMenu.world.destroyBody(cote2);
		isCote2Created = false;
		
		if ( isCote3Created) MainMenu.world.destroyBody(cote3);
		isCote3Created = false;
		
		if ( isCote4Created) MainMenu.world.destroyBody(cote4);
		isCote4Created = false;

		if ( isCote5Created) MainMenu.world.destroyBody(cote5);
		isCote5Created = false;
		
		if ( isPedestalCreated) MainMenu.world.destroyBody(pedestal);
		isPedestalCreated = false;
	}

	public static void createBodyAndType(World world) {
		// TODO Auto-generated method stub
		if ( Epee.isEpéePrise == false ) CadrillageMap.setTypeDeDécor(300/60, 180/60, "épée");
		
		if ( isCote1Created == false ) {
			cote1 = ClimatMontagneux.createBody(160,180,1,200);
			isCote1Created = true;
		}
		if ( isCote2Created == false ) {
			cote2 = ClimatMontagneux.createBody(460,180,1,200);
			isCote2Created = true;
		}
		if ( isCote3Created == false ) {
			cote3 = ClimatMontagneux.createBody(310,310,300,1);
			isCote3Created = true;
		}
		if ( isCote4Created == false ) {
			cote4 = ClimatMontagneux.createBody(220,60,120,120);
			isCote4Created = true;
		}
		if ( isCote5Created == false ) {
			cote5 = ClimatMontagneux.createBody(400,60,120,120);
			isCote5Created = true;
		}
		
		if ( isPedestalCreated == false ) {
			if ( Epee.isEpéePrise == false ) pedestal = ClimatMontagneux.createBody(300,270,30,120);
			else pedestal = ClimatMontagneux.createBody(300,220,30,20);
			isPedestalCreated = true;
		}
	}

	public static void destroyType() {
		// TODO Auto-generated method stub
		
	}
}
