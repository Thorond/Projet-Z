package map;

import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.physics.box2d.World;
import com.mygdx.game.GameMain;

import decors.ClimatMontagneux;

public class SousMapI5 extends Sprite{
	
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
		ClimatMontagneux.eauProfondeGlacée(game, 120+ x, 360+ y);
		ClimatMontagneux.eauProfondeGlacée(game, 120+ x, 420+ y);
		
		game.getBatch().draw(ClimatMontagneux.glace1, 180+ x, 0+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 180+ x, 60+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 180+ x, 120+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 180+ x, 180+ y);
		ClimatMontagneux.eauProfondeGlacée(game, 180+ x, 240+ y);
		ClimatMontagneux.eauProfondeGlacée(game, 180+ x, 300+ y);
		ClimatMontagneux.eauProfondeGlacée(game, 180+ x, 360+ y);
		ClimatMontagneux.eauProfondeGlacée(game, 180+ x, 420+ y);

		game.getBatch().draw(ClimatMontagneux.glace1, 240+ x, 0+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 240+ x, 60+ y);
		ClimatMontagneux.eauProfondeGlacée(game, 240+ x, 120+ y);
		ClimatMontagneux.eauProfondeGlacée(game, 240+ x, 180+ y);
		ClimatMontagneux.eauProfondeGlacée(game, 240+ x, 240+ y);
		ClimatMontagneux.eauProfondeGlacée(game, 240+ x, 300+ y);
		ClimatMontagneux.eauProfondeGlacée(game, 240+ x, 360+ y);
		ClimatMontagneux.eauProfondeGlacée(game, 240+ x, 420+ y);

		ClimatMontagneux.eauProfondeGlacée(game, 300+ x, 0+ y);
		ClimatMontagneux.eauProfondeGlacée(game, 300+ x, 60+ y);
		ClimatMontagneux.eauProfondeGlacée(game, 300+ x, 120+ y);
		ClimatMontagneux.eauProfondeGlacée(game, 300+ x, 180+ y);
		ClimatMontagneux.eauProfondeGlacée(game, 300+ x, 240+ y);
		ClimatMontagneux.eauProfondeGlacée(game, 300+ x, 300+ y);
		ClimatMontagneux.eauProfondeGlacée(game, 300+ x, 360+ y);
		ClimatMontagneux.eauProfondeGlacée(game, 300+ x, 420+ y);

		ClimatMontagneux.eauProfondeGlacée(game, 360+ x, 0+ y);
		ClimatMontagneux.eauProfondeGlacée(game, 360+ x, 60+ y);
		ClimatMontagneux.eauProfondeGlacée(game, 360+ x, 120+ y);
		ClimatMontagneux.eauProfondeGlacée(game, 360+ x, 180+ y);
		ClimatMontagneux.eauProfondeGlacée(game, 360+ x, 240+ y);
		ClimatMontagneux.eauProfondeGlacée(game, 360+ x, 300+ y);
		ClimatMontagneux.eauProfondeGlacée(game, 360+ x, 360+ y);
		ClimatMontagneux.eauProfondeGlacée(game, 360+ x, 420+ y);

		ClimatMontagneux.eauProfondeGlacée(game, 420+ x, 0+ y);
		ClimatMontagneux.eauProfondeGlacée(game, 420+ x, 60+ y);
		ClimatMontagneux.eauProfondeGlacée(game, 420+ x, 120+ y);
		ClimatMontagneux.eauProfondeGlacée(game, 420+ x, 180+ y);
		ClimatMontagneux.eauProfondeGlacée(game, 420+ x, 240+ y);
		ClimatMontagneux.eauProfondeGlacée(game, 420+ x, 300+ y);
		ClimatMontagneux.eauProfondeGlacée(game, 420+ x, 360+ y);
		ClimatMontagneux.eauProfondeGlacée(game, 420+ x, 420+ y);

		ClimatMontagneux.eauProfondeGlacée(game, 480+ x, 0+ y);
		ClimatMontagneux.eauProfondeGlacée(game, 480+ x, 60+ y);
		ClimatMontagneux.eauProfondeGlacée(game, 480+ x, 120+ y);
		ClimatMontagneux.eauProfondeGlacée(game, 480+ x, 180+ y);
		ClimatMontagneux.eauProfondeGlacée(game, 480+ x, 240+ y);
		ClimatMontagneux.eauProfondeGlacée(game, 480+ x, 300+ y);
		ClimatMontagneux.eauProfondeGlacée(game, 480+ x, 360+ y);
		ClimatMontagneux.eauProfondeGlacée(game, 480+ x, 420+ y);

		ClimatMontagneux.eauProfondeGlacée(game, 540+ x, 0+ y);
		ClimatMontagneux.eauProfondeGlacée(game, 540+ x, 60+ y);
		ClimatMontagneux.eauProfondeGlacée(game, 540+ x, 120+ y);
		ClimatMontagneux.eauProfondeGlacée(game, 540+ x, 180+ y);
		ClimatMontagneux.eauProfondeGlacée(game, 540+ x, 240+ y);
		ClimatMontagneux.eauProfondeGlacée(game, 540+ x, 300+ y);
		ClimatMontagneux.eauProfondeGlacée(game, 540+ x, 360+ y);
		ClimatMontagneux.eauProfondeGlacée(game, 540+ x, 420+ y);

//

		game.getBatch().draw(ClimatMontagneux.bordGlacéDroi, 60+ x, 420+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéDroi, 60+ x, 360+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéSupDroi, 120+ x, 300+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéDroi, 120+ x, 240+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéSupDroi, 180+ x, 180+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéDroi, 180+ x, 120+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéSupDroi, 240+ x, 60+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéDroi, 240+ x, 0+ y);


		game.getBatch().draw(ClimatMontagneux.bordGlacéInfDroi, 0+ x, 120+ y);
		game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 0+ x, 60+ y);
		game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 0+ x, 0+ y);
		game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 60+ x, 120+ y);
		game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 60+ x, 60+ y);
		game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 60+ x, 0+ y);
		game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 120+ x, 120+ y);
		game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 120+ x, 60+ y);
		game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 120+ x, 0+ y);
		game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 180+ x, 120+ y);
		game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 180+ x, 60+ y);
		game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 180+ x, 0+ y);

	}

	public static void destroyBody() {
		// TODO Auto-generated method stub
		
	}

	public static void createBodyAndType(World world) {
		// TODO Auto-generated method stub
		
	}

	public static void destroyType() {
		// TODO Auto-generated method stub
		
	}
}
