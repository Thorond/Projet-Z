package map.zoneDesert;

import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.physics.box2d.Body;
import com.badlogic.gdx.physics.box2d.World;
import com.mygdx.game.GameMain;

import decors.ClimatMontagneux;
import scenes.MainMenu;

public class SousMapF5 extends Sprite{

	public static Body cote1 ;
	public static boolean isCote1Created;
	public static Body cote2 ;
	public static boolean isCote2Created;
	public static Body cote3 ;
	public static boolean isCote3Created;
	public static Body cote4 ;
	public static boolean isCote4Created;
	public static Body arbre ;
	public static boolean isarbreCreated;
	public static Body cote5 ;
	public static boolean isCote5Created;
	
	public static void sousMap(GameMain game, int x, int y){
		
		game.getBatch().draw(ClimatMontagneux.glace1, 0+ x, 0+ y);
		ClimatMontagneux.eauProfonde(game,00+x,60+y);
		ClimatMontagneux.eauProfonde(game,0+x,120+y);
		ClimatMontagneux.eauProfonde(game,0+x,180+y);	
		game.getBatch().draw(ClimatMontagneux.glace1, 0 + x,240 + y);
		game.getBatch().draw(ClimatMontagneux.glace1, 0+ x, 300+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 0+ x, 360+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 0+ x, 420+ y);
		
		game.getBatch().draw(ClimatMontagneux.glace1, 60+ x, 0+ y);
		ClimatMontagneux.eauProfonde(game,60+x,60+y);
		ClimatMontagneux.eauProfonde(game,60+x,120+y);
		ClimatMontagneux.eauProfonde(game,60+x,180+y);	
		game.getBatch().draw(ClimatMontagneux.glace1, 60+ x, 240+ y);	
		game.getBatch().draw(ClimatMontagneux.glace1, 60+ x, 300+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 60+ x, 360+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 60+ x, 420+ y);
		
		game.getBatch().draw(ClimatMontagneux.glace1, 120+ x, 0+ y);
		ClimatMontagneux.eauProfonde(game,120+x,60+y);
		ClimatMontagneux.eauProfonde(game,120+x,120+y);
		ClimatMontagneux.eauProfonde(game,120+x,180+y);
		game.getBatch().draw(ClimatMontagneux.glace1, 120+ x, 240+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 120+ x, 300+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 120+ x, 360+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 120+ x, 420+ y);
		
		game.getBatch().draw(ClimatMontagneux.glace1, 180+ x, 0+ y);
		ClimatMontagneux.eauProfonde(game,180+x,60+y);
		ClimatMontagneux.eauProfonde(game,180+x,120+y);
		ClimatMontagneux.eauProfonde(game,180+x,180+y);
		game.getBatch().draw(ClimatMontagneux.glace1, 180+ x, 240+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 180+ x, 300+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 180+ x, 360+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 180+ x, 420+ y);

		ClimatMontagneux.eauProfonde(game,240+x,0+y);
		ClimatMontagneux.eauProfonde(game,240+x,60+y);
		ClimatMontagneux.eauProfonde(game,240+x,120+y);
		ClimatMontagneux.eauProfonde(game,240+x,180+y);
		game.getBatch().draw(ClimatMontagneux.glace1, 240+ x, 240+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 240+ x, 300+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 240+ x, 360+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 240+ x, 420+ y);
		
		ClimatMontagneux.eauProfonde(game,300+x,60+y);
		ClimatMontagneux.eauProfonde(game,300+x,120+y);
		ClimatMontagneux.eauProfonde(game,300+x,0+y);
		game.getBatch().draw(ClimatMontagneux.glace1, 300+ x, 180+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 300+ x, 240+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 300+ x, 300+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 300+ x, 360+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 300+ x, 420+ y);
		
		ClimatMontagneux.eauProfonde(game,360+x,0+y);
		ClimatMontagneux.eauProfonde(game,360+x,60+y);
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
		
		game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 0+ x, 420+ y);
		game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 0+ x, 360+ y);
		game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 0+ x, 300+ y);
		game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 0+ x, 240+ y);
		
		game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 60+ x, 420+ y);
		game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 60+ x, 360+ y);
		game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 60+ x, 300+ y);
		game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 60+ x, 240+ y);
		
		game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 120+ x, 420+ y);
		game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 120+ x, 360+ y);
		game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 120+ x, 300+ y);
		game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 120+ x, 240+ y);
		
		game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 180+ x, 420+ y);
		game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 180+ x, 360+ y);
		game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 180+ x, 300+ y);
		game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 180+ x, 240+ y);
		
		game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 240+ x, 420+ y);
		game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 240+ x, 360+ y);
		game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 240+ x, 300+ y);
		game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 240+ x, 240+ y);

		game.getBatch().draw(ClimatMontagneux.bordGlacéInfGau, 300+ x, 420+ y);
		game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 300+ x, 360+ y);
		game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 300+ x, 300+ y);
		game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 300+ x, 240+ y);
		game.getBatch().draw(ClimatMontagneux.murGlacéGauche, 300+ x, 180+ y);

		game.getBatch().draw(ClimatMontagneux.bordGlacéInfGau, 360+ x, 360+ y);
		game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 360+ x, 300+ y);
		game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 360+ x, 240+ y);
		game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 360+ x, 180+ y);
		game.getBatch().draw(ClimatMontagneux.murGlacéGauche, 360+ x, 120+ y);

		game.getBatch().draw(ClimatMontagneux.bordGlacéInf, 420+ x, 360+ y);
		game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 420+ x, 300+ y);
		game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 420+ x, 240+ y);
		game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 420+ x, 180+ y);
		game.getBatch().draw(ClimatMontagneux.porteCaverne, 420+ x, 120+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéGau, 420+ x, 60+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéInfGau, 420+ x, 0+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéInf, 480+ x, 0+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéInf, 540+ x, 0+ y);

		game.getBatch().draw(ClimatMontagneux.bordGlacéInf, 480+ x, 360+ y);
		game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 480+ x, 300+ y);
		game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 480+ x, 240+ y);
		game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 480+ x, 180+ y);
		game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 480+ x, 120+ y);
		game.getBatch().draw(ClimatMontagneux.piedCassé1Sup, 480+ x, 60+ y);

		game.getBatch().draw(ClimatMontagneux.bordGlacéInf, 540+ x, 360+ y);
		game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 540+ x, 300+ y);
		game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 540+ x, 240+ y);
		game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 540+ x, 180+ y);
		game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 540+ x, 120+ y);
		game.getBatch().draw(ClimatMontagneux.piedGlacéSup, 540+ x, 60+ y);

		game.getBatch().draw(ClimatMontagneux.cheminGlaceHori, 0+ x, 0+ y);
		game.getBatch().draw(ClimatMontagneux.cheminGlaceHori, 60+ x, 0+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéSup, 120+ x, 0+ y);
		game.getBatch().draw(ClimatMontagneux.cheminGlaceHori, 180+ x, 0+ y);

//		arbres

		game.getBatch().draw(ClimatMontagneux.tree, 190+ x, 10+ y);

		game.getBatch().draw(ClimatMontagneux.tree, 490+ x, 70+ y);
		game.getBatch().draw(ClimatMontagneux.tree, 550+ x, 70+ y);
		
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

		if ( isarbreCreated) MainMenu.world.destroyBody(arbre);
		isarbreCreated = false;

		if ( isCote5Created) MainMenu.world.destroyBody(cote5);
		isCote5Created = false;
	}

	public static void createBodyAndType(World world) {
		// TODO Auto-generated method stub


		if ( isCote1Created == false ) {
			cote1 = ClimatMontagneux.createBody(300,360,1,240);
			isCote1Created = true;
		}
		if ( isCote2Created == false ) {
			cote2 = ClimatMontagneux.createBody(330,300,60,240);
			isCote2Created = true;
		}
		if ( isCote3Created == false ) {
			cote3 = ClimatMontagneux.createBody(420,270,120,180);
			isCote3Created = true;
		}
		if ( isCote4Created == false ) {
			cote4 = ClimatMontagneux.createBody(540,220,120,280);
			isCote4Created = true;
		}
		if ( isarbreCreated == false ) {
			arbre = ClimatMontagneux.createBodyPerso("arbre", "static", 180,0);
			isarbreCreated = true;
		}
		if ( isCote5Created == false ) {
			cote5 = ClimatMontagneux.createBody(50,0,100,1);
			isCote5Created = true;
		}
	}

	public static void destroyType() {
		// TODO Auto-generated method stub
		
	}
}
