package map.zoneGlace;

import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.physics.box2d.Body;
import com.badlogic.gdx.physics.box2d.World;
import com.mygdx.game.GameMain;

import decors.ClimatMontagneux;
import scenes.MainMenu;

public class SousMapI4 extends Sprite{


    public static Body cote1 ;
    public static boolean isCote1Created;
    public static Body cote8 ;
    public static boolean isCote8Created;
	
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
		ClimatMontagneux.eauProfondeGlacée(game, 60+ x, 60+ y);
		ClimatMontagneux.eauProfondeGlacée(game, 60+ x, 120+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 60+ x, 180+ y);		
		game.getBatch().draw(ClimatMontagneux.glace1, 60+ x, 240+ y);	
		game.getBatch().draw(ClimatMontagneux.glace1, 60+ x, 300+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 60+ x, 360+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 60+ x, 420+ y);

		ClimatMontagneux.eauProfondeGlacée(game, 120+ x, 0+ y);
		ClimatMontagneux.eauProfondeGlacée(game, 120+ x, 60+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 120+ x, 120+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 120+ x, 180+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 120+ x, 240+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 120+ x, 300+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 120+ x, 360+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 120+ x, 420+ y);

		ClimatMontagneux.eauProfondeGlacée(game, 180+ x, 0+ y);
		ClimatMontagneux.eauProfondeGlacée(game, 180+ x, 60+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 180+ x, 120+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 180+ x, 180+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 180+ x, 240+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 180+ x, 300+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 180+ x, 360+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 180+ x, 420+ y);

		ClimatMontagneux.eauProfondeGlacée(game, 240+ x, 0+ y);
		ClimatMontagneux.eauProfondeGlacée(game, 240+ x, 60+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 240+ x, 120+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 240+ x, 180+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 240+ x, 240+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 240+ x, 300+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 240+ x, 360+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 240+ x, 420+ y);

		ClimatMontagneux.eauProfondeGlacée(game, 300+ x, 0+ y);
		ClimatMontagneux.eauProfondeGlacée(game, 300+ x, 60+ y);
		ClimatMontagneux.eauProfondeGlacée(game, 300+ x, 120+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 300+ x, 180+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 300+ x, 240+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 300+ x, 300+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 300+ x, 360+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 300+ x, 420+ y);

		ClimatMontagneux.eauProfondeGlacée(game, 360+ x, 0+ y);
		ClimatMontagneux.eauProfondeGlacée(game, 360+ x, 60+ y);
		ClimatMontagneux.eauProfondeGlacée(game, 360+ x, 120+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 360+ x, 180+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 360+ x, 240+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 360+ x, 300+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 360+ x, 360+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 360+ x, 420+ y);

		ClimatMontagneux.eauProfondeGlacée(game, 420+ x, 0+ y);
		ClimatMontagneux.eauProfondeGlacée(game, 420+ x, 60+ y);
		ClimatMontagneux.eauProfondeGlacée(game, 420+ x, 120+ y);
		ClimatMontagneux.eauProfondeGlacée(game, 420+ x, 180+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 420+ x, 240+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 420+ x, 300+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 420+ x, 360+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 420+ x, 420+ y);

		ClimatMontagneux.eauProfondeGlacée(game, 480+ x, 0+ y);
		ClimatMontagneux.eauProfondeGlacée(game, 480+ x, 60+ y);
		ClimatMontagneux.eauProfondeGlacée(game, 480+ x, 120+ y);
		ClimatMontagneux.eauProfondeGlacée(game, 480+ x, 180+ y);
		ClimatMontagneux.eauProfondeGlacée(game, 480+ x, 240+ y);
		ClimatMontagneux.eauProfondeGlacée(game, 480+ x, 300+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 480+ x, 360+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 480+ x, 420+ y);

		ClimatMontagneux.eauProfondeGlacée(game, 540+ x, 0+ y);
		ClimatMontagneux.eauProfondeGlacée(game, 540+ x, 60+ y);
		ClimatMontagneux.eauProfondeGlacée(game, 540+ x, 120+ y);
		ClimatMontagneux.eauProfondeGlacée(game, 540+ x, 180+ y);
		ClimatMontagneux.eauProfondeGlacée(game, 540+ x, 240+ y);
		ClimatMontagneux.eauProfondeGlacée(game, 540+ x, 300+ y);
		ClimatMontagneux.eauProfondeGlacée(game, 540+ x, 360+ y);
		ClimatMontagneux.eauProfondeGlacée(game, 540+ x, 420+ y);

//

		game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 0+ x, 180+ y);
		game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 0+ x, 360+ y);
		game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 0+ x, 300+ y);
		game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 0+ x, 240+ y);


		game.getBatch().draw(ClimatMontagneux.bordGlacéInfDroi, 0+ x, 420+ y);
		game.getBatch().draw(ClimatMontagneux.murSombreGlacéCentre, 60+ x, 420+ y);
		game.getBatch().draw(ClimatMontagneux.murSombreGlacéCentre, 60+ x, 360+ y);
		game.getBatch().draw(ClimatMontagneux.murSombreGlacéCentre, 60+ x, 300+ y);
		game.getBatch().draw(ClimatMontagneux.murSombreGlacéCentre, 60+ x, 240+ y);
		game.getBatch().draw(ClimatMontagneux.murSombreGlacéCentre, 60+ x, 180+ y);
		game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 120+ x, 420+ y);
		game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 120+ x, 360+ y);
		game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 120+ x, 300+ y);
		game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 120+ x, 240+ y);
		game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 120+ x, 180+ y);
		game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 120+ x, 120+ y);
		game.getBatch().draw(ClimatMontagneux.murBasMer, 120+ x, 60+ y);
		game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 180+ x, 420+ y);
		game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 180+ x, 360+ y);
		game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 180+ x, 300+ y);
		game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 180+ x, 240+ y);
		game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 180+ x, 180+ y);
		game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 180+ x, 120+ y);
		game.getBatch().draw(ClimatMontagneux.murBasMer, 180+ x, 60+ y);
		game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 240+ x, 420+ y);
		game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 240+ x, 360+ y);
		game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 240+ x, 300+ y);
		game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 240+ x, 240+ y);
		game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 240+ x, 180+ y);
		game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 240+ x, 120+ y);
		game.getBatch().draw(ClimatMontagneux.murBasMer, 240+ x, 60+ y);
		game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 300+ x, 420+ y);
		game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 300+ x, 360+ y);
		game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 300+ x, 300+ y);
		game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 300+ x, 240+ y);
		game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 300+ x, 180+ y);
		game.getBatch().draw(ClimatMontagneux.murBasMer, 300+ x, 120+ y);
		game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 360+ x, 420+ y);
		game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 360+ x, 360+ y);
		game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 360+ x, 300+ y);
		game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 360+ x, 240+ y);
		game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 360+ x, 180+ y);
		game.getBatch().draw(ClimatMontagneux.murBasMer, 360+ x, 120+ y);
		game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 420+ x, 420+ y);
		game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 420+ x, 360+ y);
		game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 420+ x, 300+ y);
		game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 420+ x, 240+ y);
		game.getBatch().draw(ClimatMontagneux.murBasMer, 420+ x, 180+ y);
		game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 480+ x, 420+ y);
		game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 480+ x, 360+ y);
		game.getBatch().draw(ClimatMontagneux.murBasMer, 480+ x, 300+ y);



		game.getBatch().draw(ClimatMontagneux.bordGlacéDroi, 0+ x, 120+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéDroi, 0+ x, 60+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéSupDroi, 60+ x, 0+ y);

//
		game.getBatch().draw(ClimatMontagneux.tree, 0+ x, 450+ y);

		game.getBatch().draw(ClimatMontagneux.grossePierre, 0+ x, 120+ y);


        game.getBatch().draw(ClimatMontagneux.tree, 60+ x, 10+ y);
        game.getBatch().draw(ClimatMontagneux.tree, -30+ x, -30+ y);
        game.getBatch().draw(ClimatMontagneux.tree, 30+ x, -30+ y);
        game.getBatch().draw(ClimatMontagneux.tree, 60+ x, -50+ y);
        game.getBatch().draw(ClimatMontagneux.tree, -30+ x, -70+ y);

        game.getBatch().draw(ClimatMontagneux.icebergWater, 150+ x, 50+ y);
        game.getBatch().draw(ClimatMontagneux.iceberg2, 150+ x, -50+ y);
        game.getBatch().draw(ClimatMontagneux.iceberg2, 310+ x, -30+ y);
        game.getBatch().draw(ClimatMontagneux.icebergWater, 310+ x, -180+ y);
	}

	public static void destroyBody() {
		// TODO Auto-generated method stub

        if ( isCote1Created) MainMenu.world.destroyBody(cote1);
        isCote1Created = false;

        if ( isCote8Created) MainMenu.world.destroyBody(cote8);
        isCote8Created = false;
	}

	public static void createBodyAndType(World world) {
		// TODO Auto-generated method stub

        if ( isCote1Created == false ) {
            cote1 = ClimatMontagneux.createBody(30,20,60,60);
            isCote1Created = true;
        }

        if ( isCote8Created == false ) {
            cote8 = ClimatMontagneux.createBody(20,240,60,240);
            isCote8Created = true;
        }
	}

	public static void destroyType() {
		// TODO Auto-generated method stub
		
	}
}
