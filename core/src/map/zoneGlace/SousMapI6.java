package map.zoneGlace;

import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.physics.box2d.Body;
import com.badlogic.gdx.physics.box2d.World;
import com.mygdx.game.GameMain;

import decors.ClimatMontagneux;
import scenes.MainMenu;

public class SousMapI6 extends Sprite{



    public static Body cote1 ;
    public static boolean isCote1Created;

	public static void sousMap(GameMain game, int x, int y){
		
		ClimatMontagneux.eauProfondeGlacée(game, 0+ x, 0+ y);
		ClimatMontagneux.eauProfondeGlacée(game, 0+ x, 60+ y);
		ClimatMontagneux.eauProfondeGlacée(game, 0+ x, 120+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 0+ x, 180+ y);		
		game.getBatch().draw(ClimatMontagneux.glace1, 0 + x,240 + y);
		game.getBatch().draw(ClimatMontagneux.glace1, 0+ x, 300+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 0+ x, 360+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 0+ x, 420+ y);

		ClimatMontagneux.eauProfondeGlacée(game, 60+ x, 0+ y);
		ClimatMontagneux.eauProfondeGlacée(game, 60+ x, 60+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 60+ x, 120+ y);
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
		ClimatMontagneux.eauProfondeGlacée(game, 240+ x, 120+ y);
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
		ClimatMontagneux.eauProfondeGlacée(game, 360+ x, 180+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 360+ x, 240+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 360+ x, 300+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 360+ x, 360+ y);
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

		game.getBatch().draw(ClimatMontagneux.murGlacéDroite, 0+ x, 420+ y);
		game.getBatch().draw(ClimatMontagneux.piedGlacéSup, 0+ x, 360+ y);

		game.getBatch().draw(ClimatMontagneux.piedGlacéSup, 60+ x, 420+ y);
		game.getBatch().draw(ClimatMontagneux.piedGlacéSup, 120+ x, 420+ y);
		game.getBatch().draw(ClimatMontagneux.piedGlacéSup, 180+ x, 420+ y);

		game.getBatch().draw(ClimatMontagneux.murBasMer, 00+ x, 120+ y);
		game.getBatch().draw(ClimatMontagneux.murBasMer, 60+ x, 60+ y);
		game.getBatch().draw(ClimatMontagneux.murBasMer, 120+ x, 60+ y);
		game.getBatch().draw(ClimatMontagneux.murBasMer, 180+ x, 60+ y);
		game.getBatch().draw(ClimatMontagneux.murBasMer, 240+ x, 120+ y);
		game.getBatch().draw(ClimatMontagneux.murBasMer, 300+ x, 120+ y);
		game.getBatch().draw(ClimatMontagneux.murBasMer, 360+ x, 180+ y);


		game.getBatch().draw(ClimatMontagneux.bordMerGlacéInf, 0+ x, 180+ y);
		game.getBatch().draw(ClimatMontagneux.bordMerGlacéInfGau, 60+ x, 120+ y);
		game.getBatch().draw(ClimatMontagneux.bordMerGlacéInf, 120+ x, 120+ y);
		game.getBatch().draw(ClimatMontagneux.bordMerGlacéInfDroi, 180+ x,120+ y);
		game.getBatch().draw(ClimatMontagneux.bordMerGlacéInf, 240+ x, 180+ y);
		game.getBatch().draw(ClimatMontagneux.bordMerGlacéInfDroi, 300+ x, 180+ y);
		game.getBatch().draw(ClimatMontagneux.bordMerGlacéInfDroi, 360+ x, 240+ y);
		game.getBatch().draw(ClimatMontagneux.bordMerGlacéDroi, 360+ x, 300+ y);
		game.getBatch().draw(ClimatMontagneux.bordMerGlacéSupDroi, 360+ x, 360+ y);
		game.getBatch().draw(ClimatMontagneux.bordMerGlacéSupDroi, 300+ x, 420+ y);

//



        game.getBatch().draw(ClimatMontagneux.igloo , 55 + x , 290 + y );
        game.getBatch().draw(ClimatMontagneux.emplacementBombe , 110 + x , 260 + y );
        game.getBatch().draw(ClimatMontagneux.emplacementBombe , 130 + x , 260 + y );

//

        game.getBatch().draw(ClimatMontagneux.tree , 0 + x , 360 + y );
        game.getBatch().draw(ClimatMontagneux.tree , 0 + x , 300 + y );



//
        game.getBatch().draw(ClimatMontagneux.planteGelé, 0+ x, 190+ y);
        game.getBatch().draw(ClimatMontagneux.planteGelé3, 60+ x, 130+ y);
        game.getBatch().draw(ClimatMontagneux.planteGelé, 240+ x, 240+ y);
        game.getBatch().draw(ClimatMontagneux.planteGelé, 300+ x, 420+ y);
        game.getBatch().draw(ClimatMontagneux.planteGelé3, 360+ x, 350+ y);


	}

	public static void destroyBody() {
		// TODO Auto-generated method stub


        if ( isCote1Created) MainMenu.world.destroyBody(cote1);
        isCote1Created = false;
	}

	public static void createBodyAndType(World world) {
		// TODO Auto-generated method stub

        if ( isCote1Created == false ) {
            cote1 = ClimatMontagneux.createBody(110,420,230,240);
            isCote1Created = true;
        }

	}

	public static void destroyType() {
		// TODO Auto-generated method stub
		
	}
}
