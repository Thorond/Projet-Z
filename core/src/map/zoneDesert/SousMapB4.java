package map.zoneDesert;

import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.physics.box2d.Body;
import com.badlogic.gdx.physics.box2d.World;
import com.mygdx.game.GameMain;

import decors.ClimatMontagneux;
import scenes.MainMenu;

public class SousMapB4 extends Sprite{
	
	public static Body bosquet2 ;
	public static boolean isBosquet2Created;
	
	public static Body mur1 ;
	public static boolean ismur1Created;
	public static Body mur2 ;
	public static boolean ismur2Created;
	
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
		
		game.getBatch().draw(ClimatMontagneux.arbreBasGauche, 180+ x, 420+ y);
		game.getBatch().draw(ClimatMontagneux.arbreBasMilieu, 240+ x, 420+ y);
		game.getBatch().draw(ClimatMontagneux.arbreBasMilieu, 300+ x, 420+ y);
		game.getBatch().draw(ClimatMontagneux.arbreBasMilieu, 360+ x, 420+ y);
		game.getBatch().draw(ClimatMontagneux.arbreBasMilieu, 420+ x, 420+ y);
		game.getBatch().draw(ClimatMontagneux.arbreBasMilieu, 480+ x, 420+ y);
		game.getBatch().draw(ClimatMontagneux.arbreBasMilieu, 540+ x, 420+ y);

		game.getBatch().draw(ClimatMontagneux.tree, 70+ x, 440+ y);
		game.getBatch().draw(ClimatMontagneux.tree, 120+ x, 430+ y);
		
//		
		
		game.getBatch().draw(ClimatMontagneux.bordGlacéSup, 540+ x, 300+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéSup, 480+ x, 300+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéSup, 420+ x, 300+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéSup, 360+ x, 300+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéSup, 300+ x, 300+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéSup, 240+ x, 300+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéSup, 180+ x, 300+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéSup, 120+ x, 300+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéSup, 60+ x, 300+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéSup, 0+ x, 300+ y);
		
		game.getBatch().draw(ClimatMontagneux.bordGlacéSup, 540+ x, 240+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéSup, 480+ x, 240+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéSup, 420+ x, 240+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéSup, 360+ x, 240+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéSup, 300+ x, 240+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéSup, 240+ x, 240+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéSup, 180+ x, 240+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéSupGau, 120+ x, 240+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéGau, 120+ x, 180+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéGau, 120+ x, 120+ y);
		game.getBatch().draw(ClimatMontagneux.escalierGlacé, 120+ x, 60+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéInf, 180+ x, 120+ y);
		game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 180+ x, 60+ y);
		game.getBatch().draw(ClimatMontagneux.piedCassé1Sup, 180+ x, 0+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéGau, 240+ x, 60+ y);
		game.getBatch().draw(ClimatMontagneux.cheminGlace, 240+ x, 0+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéInfDroi, 300+ x, 60+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéInfDroi, 360+ x, 120+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéInf, 420+ x, 180+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéInf, 480+ x, 180+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéInf, 540+ x, 180+ y);
		
//		
		

		ClimatMontagneux.eauProfonde(game,300+x,0+y);
		ClimatMontagneux.eauProfonde300(game,360+x,0+y);
		ClimatMontagneux.eauProfonde(game,360+x,60+y);
		ClimatMontagneux.eauProfonde300(game,420+x,0+y);
		ClimatMontagneux.eauProfonde(game,420+x,60+y);
		ClimatMontagneux.eauProfonde(game,420+x,120+y);
		ClimatMontagneux.eauProfonde(game,480+x,0+y);
		ClimatMontagneux.eauProfonde(game,480+x,60+y);
		ClimatMontagneux.eauProfonde(game,480+x,120+y);
		ClimatMontagneux.eauProfonde(game,540+x,0+y);
		ClimatMontagneux.eauProfonde(game,540+x,60+y);
		ClimatMontagneux.eauProfonde(game,540+x,120+y);
		
	}

	public static void destroyBody() {
		// TODO Auto-generated method stub
		if ( isBosquet2Created) MainMenu.world.destroyBody(bosquet2);
		isBosquet2Created = false;
		
		if ( ismur1Created) MainMenu.world.destroyBody(mur1);
		ismur1Created = false;
		if ( ismur2Created) MainMenu.world.destroyBody(mur2);
		ismur2Created = false;
	}

	public static void createBodyAndType(World world) {
		// TODO Auto-generated method stub
		if ( isBosquet2Created == false ) {
			bosquet2 = ClimatMontagneux.createBody(330,450,520,40);
			isBosquet2Created = true;
		}
		
		if ( ismur1Created == false ) {
			mur1 = ClimatMontagneux.createBody(300,345,600,1);
			ismur1Created = true;
		}
		if ( ismur2Created == false ) {
			mur2 = ClimatMontagneux.createBody(360,285,480,1);
			ismur2Created = true;
		}
	}

	public static void destroyType() {
		// TODO Auto-generated method stub
		
	}
}
