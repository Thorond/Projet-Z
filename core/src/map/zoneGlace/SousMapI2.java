package map.zoneGlace;

import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.physics.box2d.World;
import com.mygdx.game.GameMain;

import decors.ClimatMontagneux;
import decors.DonjonGlace;

public class SousMapI2 extends Sprite{
	
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

		ClimatMontagneux.eauProfondeGlacée(game, 540+ x, 0+ y);
		ClimatMontagneux.eauProfondeGlacée(game, 540+ x, 60+ y);
		ClimatMontagneux.eauProfondeGlacée(game, 540+ x, 120+ y);
		ClimatMontagneux.eauProfondeGlacée(game, 540+ x, 180+ y);
		ClimatMontagneux.eauProfondeGlacée(game, 540+ x, 240+ y);
		ClimatMontagneux.eauProfondeGlacée(game, 540+ x, 300+ y);
		ClimatMontagneux.eauProfondeGlacée(game, 540+ x, 360+ y);
		ClimatMontagneux.eauProfondeGlacée(game, 540+ x, 420+ y);

        //


        game.getBatch().draw(ClimatMontagneux.piedGlacéSup, 0 + x, 180 + y);
        game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 0 + x, 240 + y);
        game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 0 + x, 300 + y);
        game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 0 + x, 360 + y);
        game.getBatch().draw(ClimatMontagneux.bordGlacéInf, 0 + x, 420 + y);

        game.getBatch().draw(ClimatMontagneux.piedGlacéSup, 60 + x, 180 + y);
        game.getBatch().draw(ClimatMontagneux.murGlacéDroite, 60 + x, 240 + y);
        game.getBatch().draw(ClimatMontagneux.murGlacéDroite, 60 + x, 300 + y);
        game.getBatch().draw(ClimatMontagneux.murGlacéDroite, 60 + x, 360 + y);
        game.getBatch().draw(ClimatMontagneux.bordGlacéInfDroi, 60 + x, 420 + y);

//

        game.getBatch().draw(ClimatMontagneux.bordGlacéDroi, 480+ x, 420+ y);
        game.getBatch().draw(ClimatMontagneux.bordGlacéDroi, 480+ x, 360+ y);
        game.getBatch().draw(ClimatMontagneux.bordGlacéDroi, 480+ x, 300+ y);
        game.getBatch().draw(ClimatMontagneux.bordGlacéDroi, 480+ x, 240+ y);
        game.getBatch().draw(ClimatMontagneux.bordGlacéDroi, 480+ x, 180+ y);
        game.getBatch().draw(ClimatMontagneux.bordGlacéDroi, 480+ x, 120+ y);
        game.getBatch().draw(ClimatMontagneux.bordGlacéDroi, 480+ x, 60+ y);
        game.getBatch().draw(ClimatMontagneux.bordGlacéDroi, 480+ x, 0+ y);
//

        game.getBatch().draw(ClimatMontagneux.tree, 100+ x, 180+ y);
        game.getBatch().draw(ClimatMontagneux.tree, 100+ x, 120+ y);
        game.getBatch().draw(ClimatMontagneux.tree, 100+ x, 60+ y);
        game.getBatch().draw(ClimatMontagneux.tree, 100+ x, 0+ y);
        game.getBatch().draw(ClimatMontagneux.tree, 40+ x, 0+ y);
        game.getBatch().draw(ClimatMontagneux.tree, -20+ x, 0+ y);

//

        game.getBatch().draw(DonjonGlace.murVertical, 162+ x, 410+ y);
        game.getBatch().draw(DonjonGlace.murVertical, 162+ x, 240+ y);
        game.getBatch().draw(DonjonGlace.murVertical, 162+ x, 70+ y);
        game.getBatch().draw(DonjonGlace.murVertical, 162+ x, -10+ y);

        game.getBatch().draw(DonjonGlace.murHorizontal, 0+ x, -30+ y);
        game.getBatch().draw(DonjonGlace.murHorizontal, 90+ x, -30+ y);

        game.getBatch().draw(ClimatMontagneux.bordGlacéSupGau, 300 + x , 240 + y);
        game.getBatch().draw(ClimatMontagneux.bordGlacéSupDroi, 360 + x , 240 + y);
        game.getBatch().draw(ClimatMontagneux.bordGlacéInfGau, 300 + x , 180 + y);
        game.getBatch().draw(ClimatMontagneux.bordGlacéInfDroi, 360 + x , 180 + y);
        game.getBatch().draw(ClimatMontagneux.murGlacéGauche, 300 + x , 120 + y);
        game.getBatch().draw(ClimatMontagneux.murGlacéDroite, 360 + x , 120 + y);
        game.getBatch().draw(ClimatMontagneux.piedGlacéSup, 300 + x , 60 + y);
        game.getBatch().draw(ClimatMontagneux.piedGlacéSup, 360 + x , 60 + y);

        game.getBatch().draw(ClimatMontagneux.tree, 300 + x , 250 + y );
        game.getBatch().draw(ClimatMontagneux.tree, 360 + x , 250 + y );
        game.getBatch().draw(ClimatMontagneux.tree, 330 + x , 225 + y );
        game.getBatch().draw(ClimatMontagneux.tree, 300 + x , 200 + y );
        game.getBatch().draw(ClimatMontagneux.tree, 360 + x , 200 + y );


//


		game.getBatch().draw(ClimatMontagneux.tree, 220+ x, 450+ y);
		game.getBatch().draw(ClimatMontagneux.tree, 280+ x, 450+ y);
		game.getBatch().draw(ClimatMontagneux.tree, 340+ x, 450+ y);

		game.getBatch().draw(ClimatMontagneux.tree, 190+ x, 420+ y);
		game.getBatch().draw(ClimatMontagneux.tree, 250+ x, 420+ y);
		game.getBatch().draw(ClimatMontagneux.tree, 310+ x, 420+ y);
		game.getBatch().draw(ClimatMontagneux.tree, 370+ x, 420+ y);

        game.getBatch().draw(ClimatMontagneux.tree, 220+ x, 390+ y);
        game.getBatch().draw(ClimatMontagneux.tree, 190+ x, 360+ y);

        game.getBatch().draw(ClimatMontagneux.tree, 490+ x, 270+ y);
        game.getBatch().draw(ClimatMontagneux.tree, 470+ x, 240+ y);
        game.getBatch().draw(ClimatMontagneux.tree, 490+ x, 210+ y);
        game.getBatch().draw(ClimatMontagneux.tree, 470+ x, 180+ y);
        game.getBatch().draw(ClimatMontagneux.tree, 490+ x, 150+ y);
        game.getBatch().draw(ClimatMontagneux.tree, 470+ x, 120+ y);
        game.getBatch().draw(ClimatMontagneux.tree, 490+ x, 90+ y);
        game.getBatch().draw(ClimatMontagneux.tree, 470+ x, 60+ y);
        game.getBatch().draw(ClimatMontagneux.tree, 490+ x, 30+ y);
        game.getBatch().draw(ClimatMontagneux.tree, 480+ x, 0+ y);
        game.getBatch().draw(ClimatMontagneux.tree, 480+ x, -60+ y);

//

        game.getBatch().draw(ClimatMontagneux.herbeGlace120, 240+ x, 0+ y);
        game.getBatch().draw(ClimatMontagneux.herbeGlace120, 180+ x, 60+ y);
        game.getBatch().draw(ClimatMontagneux.herbeGlace120, 180+ x, 120+ y);

//


        game.getBatch().draw(ClimatMontagneux.planteGelé , 240+ x, 0+ y);
        game.getBatch().draw(ClimatMontagneux.planteGelé , 240+ x, 360+ y);
        game.getBatch().draw(ClimatMontagneux.planteGelé3 , 400+ x, 300+ y);
        game.getBatch().draw(ClimatMontagneux.planteGelé , 480+ x, 420+ y);
        game.getBatch().draw(ClimatMontagneux.planteGelé3 , 180+ x, 120+ y);
        game.getBatch().draw(ClimatMontagneux.planteGelé , 180+ x, 180+ y);
        game.getBatch().draw(ClimatMontagneux.planteGelé3 , 180+ x, 300+ y);
        game.getBatch().draw(ClimatMontagneux.planteGelé , 360+ x, 60+ y);

        game.getBatch().draw(ClimatMontagneux.planteGelé3 , 00+ x, 120+ y);
        game.getBatch().draw(ClimatMontagneux.planteGelé3 , 110+ x, 360+ y);


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
