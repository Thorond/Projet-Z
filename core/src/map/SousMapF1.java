package map;

import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.physics.box2d.World;
import com.mygdx.game.GameMain;

import decors.ClimatMontagneux;
import items.Epee;
import scenes.MainMenu;

public class SousMapF1 extends Sprite{
	
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
		if ( Epee.annimationEpée ) game.getBatch().draw(Epee.épéeT, MainMenu.Link.getX() - 10, MainMenu.Link.getY() + 50);
	}

	public static void destroyBody() {
		// TODO Auto-generated method stub
		
	}

	public static void createBodyAndType(World world) {
		// TODO Auto-generated method stub
		if ( Epee.isEpéePrise == false ) CadrillageMap.setTypeDeDécor(300/60, 180/60, "épée");
	}

	public static void destroyType() {
		// TODO Auto-generated method stub
		
	}
}
