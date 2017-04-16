package map.zoneGlace;

import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.physics.box2d.Body;
import com.badlogic.gdx.physics.box2d.World;
import com.mygdx.game.GameMain;

import decors.ClimatMontagneux;
import decors.DonjonGlace;
import scenes.MainMenu;

public class SousMapH3 extends Sprite{


	public static Body bosquet1 ;
	public static boolean isBosquet1Created;
    public static Body bosquet2 ;
    public static boolean isBosquet2Created;
	
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
		

		
		
		game.getBatch().draw(ClimatMontagneux.bordGlacéSupDroi, 00+ x, 420+ y);

		game.getBatch().draw(ClimatMontagneux.bordGlacéSupDroi, 60+ x, 360+ y);
		ClimatMontagneux.placerMurSombreGlacéCentre(game, 60+ x, 420+ y);

		game.getBatch().draw(ClimatMontagneux.bordGlacéSupDroi, 120+ x, 300+ y);
		ClimatMontagneux.placerMurSombreGlacéCentre(game, 120+ x, 420+ y);
		ClimatMontagneux.placerMurSombreGlacéCentre(game, 120+ x, 360+ y);

		game.getBatch().draw(ClimatMontagneux.bordGlacéSupDroi, 180+ x, 240+ y);
		ClimatMontagneux.placerMurSombreGlacéCentre(game, 180+ x, 300+ y);
		ClimatMontagneux.placerMurSombreGlacéCentre(game, 180+ x, 360+ y);
		ClimatMontagneux.placerMurSombreGlacéDroite3(game, 180+ x, 420+ y);

		game.getBatch().draw(ClimatMontagneux.bordGlacéSup, 240+ x, 180+ y);
		ClimatMontagneux.placerMurSombreGlacéCentre(game, 240+ x, 240+ y);
		ClimatMontagneux.placerMurSombreGlacéCentre(game, 240+ x, 300+ y);
		ClimatMontagneux.placerMurSombreGlacéDroite3(game, 240+ x, 360+ y);
		ClimatMontagneux.placerMurSombreGlacéDroite(game, 240+ x, 420+ y);

		game.getBatch().draw(ClimatMontagneux.bordGlacéSup, 300+ x, 180+ y);
		ClimatMontagneux.placerMurSombreGlacéCentre(game, 300+ x, 240+ y);
		ClimatMontagneux.placerMurSombreGlacéDroite3(game, 300+ x, 300+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéInfGau, 300+ x, 360+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéGau, 300+ x, 420+ y);

		game.getBatch().draw(ClimatMontagneux.bordGlacéSup, 360+ x, 180+ y);
		ClimatMontagneux.placerMurSombreGlacéDroite3(game, 360+ x, 240+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéInfGau, 360+ x, 300+ y);

		game.getBatch().draw(ClimatMontagneux.bordGlacéGau, 420+ x, 240+ y);

		game.getBatch().draw(ClimatMontagneux.bordGlacéDroi, 360+ x, 180+ y);
		
		game.getBatch().draw(ClimatMontagneux.bordGlacéSupDroi, 420+ x, 120+ y);
		ClimatMontagneux.placerMurSombreGlacéDroite3(game, 420+ x, 180+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéInf, 420+ x, 240+ y);
		
		game.getBatch().draw(ClimatMontagneux.bordGlacéSupDroi, 480+ x, 60+ y);
		ClimatMontagneux.placerMurSombreGlacéDroite3(game, 480+ x, 120+ y);
		ClimatMontagneux.placerMurSombreGlacéDroite(game, 480+ x, 180+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéInf, 480+ x, 240+ y);
		
		game.getBatch().draw(ClimatMontagneux.bordGlacéSupDroi, 540+ x, 00+ y);
		ClimatMontagneux.placerMurSombreGlacéDroite3(game, 540+ x, 60+ y);
		ClimatMontagneux.placerMurSombreGlacéDroite(game, 540+ x, 120+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéInf, 540+ x, 180+ y);
		
//		

		game.getBatch().draw(DonjonGlace.murVertical, 310+ x, 450+ y);
		game.getBatch().draw(DonjonGlace.murHorizontal, 330+ x, 450+ y);
		game.getBatch().draw(DonjonGlace.murHorizontal, 420+ x, 450+ y);
		game.getBatch().draw(DonjonGlace.murHorizontal, 510+ x, 450+ y);
		
//		
		game.getBatch().draw(ClimatMontagneux.planteGelé, 0+ x, 120+ y);
		game.getBatch().draw(ClimatMontagneux.planteGelé3, 00+ x, 240+ y);
		game.getBatch().draw(ClimatMontagneux.planteGelé, 60+ x, 140+ y);
		game.getBatch().draw(ClimatMontagneux.planteGelé, 180+ x, 180+ y);
		game.getBatch().draw(ClimatMontagneux.planteGelé3, 300+ x, 60+ y);
		game.getBatch().draw(ClimatMontagneux.planteGelé2Cut, 300+ x, 420+ y);
        game.getBatch().draw(ClimatMontagneux.planteGelé2Cut, 300+ x, 380+ y);
        game.getBatch().draw(ClimatMontagneux.planteGelé3, 360+ x, 320+ y);
        game.getBatch().draw(ClimatMontagneux.planteGelé3, 420+ x, 380+ y);

		game.getBatch().draw(ClimatMontagneux.iceberg2, 420+ x, 240+ y);
		
		game.getBatch().draw(ClimatMontagneux.tree, 00+ x, 420+ y);
		game.getBatch().draw(ClimatMontagneux.tree, 60+ x, 360+ y);
		game.getBatch().draw(ClimatMontagneux.tree, 120+ x, 300+ y);
		game.getBatch().draw(ClimatMontagneux.tree, 180+ x, 240+ y);
		game.getBatch().draw(ClimatMontagneux.tree, 240+ x, 180+ y);
		game.getBatch().draw(ClimatMontagneux.tree, 300+ x, 180+ y);
		game.getBatch().draw(ClimatMontagneux.tree, 420+ x, 120+ y);
		game.getBatch().draw(ClimatMontagneux.tree, 480+ x, 60+ y);
		game.getBatch().draw(ClimatMontagneux.tree, 540+ x, 0+ y);
		
		game.getBatch().draw(ClimatMontagneux.tree, 30+ x, 330+ y);
		game.getBatch().draw(ClimatMontagneux.tree, 90+ x, 270+ y);
		game.getBatch().draw(ClimatMontagneux.tree, 150+ x, 210+ y);
		game.getBatch().draw(ClimatMontagneux.tree, 210+ x, 150+ y);
		game.getBatch().draw(ClimatMontagneux.tree, 270+ x, 150+ y);
		game.getBatch().draw(ClimatMontagneux.tree, 390+ x, 90+ y);

		game.getBatch().draw(ClimatMontagneux.tree, -30+ x, 360+ y);
		game.getBatch().draw(ClimatMontagneux.tree, 40+ x, 300+ y);
		game.getBatch().draw(ClimatMontagneux.tree, 100+ x, 240+ y);
		game.getBatch().draw(ClimatMontagneux.tree, 430+ x, 60+ y);
		game.getBatch().draw(ClimatMontagneux.tree, 450+ x, 30+ y);
		game.getBatch().draw(ClimatMontagneux.tree, 490+ x, 0+ y);

        game.getBatch().draw(ClimatMontagneux.tree, 510+ x, -30+ y);
        game.getBatch().draw(ClimatMontagneux.tree, 480+ x, -60+ y);
        game.getBatch().draw(ClimatMontagneux.tree, 540+ x, -60+ y);

		game.getBatch().draw(ClimatMontagneux.tree, -10+ x, 50+ y);
		
		game.getBatch().draw(ClimatMontagneux.tree, 60+ x, 30+ y);
		game.getBatch().draw(ClimatMontagneux.tree, 150+ x, 30+ y);
		game.getBatch().draw(ClimatMontagneux.tree, 30+ x, 0+ y);
		game.getBatch().draw(ClimatMontagneux.tree, 120+ x, 0+ y);
		game.getBatch().draw(ClimatMontagneux.tree, 210+ x, 0+ y);
		game.getBatch().draw(ClimatMontagneux.tree, 0+ x, -30+ y);
		game.getBatch().draw(ClimatMontagneux.tree, 90+ x, -30+ y);
		game.getBatch().draw(ClimatMontagneux.tree, 180+ x, -30+ y);
		game.getBatch().draw(ClimatMontagneux.tree, 270+ x, -30+ y);
		game.getBatch().draw(ClimatMontagneux.tree, 40+ x, -60+ y);
		game.getBatch().draw(ClimatMontagneux.tree, 130+ x, -60+ y);
		game.getBatch().draw(ClimatMontagneux.tree, 220+ x, -60+ y);
		game.getBatch().draw(ClimatMontagneux.tree, 310+ x, -60+ y);

        game.getBatch().draw(ClimatMontagneux.tree, 570+ x, 320+ y);
        game.getBatch().draw(ClimatMontagneux.tree, 570+ x, 260+ y);
        game.getBatch().draw(ClimatMontagneux.tree, 540+ x, 200+ y);
		
		
		
	}

	public static void destroyBody() {
		// TODO Auto-generated method stub

        if ( isBosquet1Created) MainMenu.world.destroyBody(bosquet1);
        isBosquet1Created = false;

        if ( isBosquet2Created) MainMenu.world.destroyBody(bosquet2);
        isBosquet2Created = false;
	}

	public static void createBodyAndType(World world) {
		// TODO Auto-generated method stub

        if ( isBosquet1Created == false ) {
            bosquet1 = ClimatMontagneux.createBody(170,10,360,50);
            isBosquet1Created = true;
        }
        if ( isBosquet2Created == false ) {
            bosquet2 = ClimatMontagneux.createBody(530,30,120,90);
            isBosquet2Created = true;
        }
	}

	public static void destroyType() {
		// TODO Auto-generated method stub
		
	}
}
