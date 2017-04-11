package map.zoneDesert;

import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.physics.box2d.Body;
import com.badlogic.gdx.physics.box2d.World;
import com.mygdx.game.GameMain;

import decors.ClimatMontagneux;
import scenes.MainMenu;

public class SousMapD4 extends Sprite{
	
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
	public static Body cote6 ;
	public static boolean isCote6Created;
	
	public static Body arbre1;
	public static boolean isArbre1Created;
	
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
		
		game.getBatch().draw(ClimatMontagneux.murGlacéGauche, 240+ x, 420+ y);
		game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 300+ x, 420+ y);
		game.getBatch().draw(ClimatMontagneux.piedCassé1Sup, 240+ x, 360+ y);
		game.getBatch().draw(ClimatMontagneux.piedCassé2Sup, 300+ x, 360+ y);
		
		game.getBatch().draw(ClimatMontagneux.murGlacéGauche, 360+ x, 300+ y);
		game.getBatch().draw(ClimatMontagneux.murGlacéGauche, 360+ x, 360+ y);
		game.getBatch().draw(ClimatMontagneux.piedCassé1Sup, 360+ x, 240+ y);
		game.getBatch().draw(ClimatMontagneux.escalierGlacé, 420+ x, 300+ y);
		game.getBatch().draw(ClimatMontagneux.escalierGlacé, 420+ x, 360+ y);
		game.getBatch().draw(ClimatMontagneux.escalierHaut, 420+ x, 420+ y);
		game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 480+ x, 360+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéInf, 480+ x, 420+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéInfGau, 360+ x, 420+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéGau, 540+ x, 420+ y);
		game.getBatch().draw(ClimatMontagneux.tree, 540+ x, 420+ y);
		
		
		game.getBatch().draw(ClimatMontagneux.bordGlacéGau, 540+ x, 360+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéSupGau, 480+ x, 300+ y);
		game.getBatch().draw(ClimatMontagneux.escalierGlacé, 480+ x, 240+ y);
		game.getBatch().draw(ClimatMontagneux.escalierGlacé, 480+ x, 180+ y);
		game.getBatch().draw(ClimatMontagneux.escalierGlacé, 480+ x, 120+ y);
		game.getBatch().draw(ClimatMontagneux.escalierGlacé, 480+ x, 60+ y);
		
		game.getBatch().draw(ClimatMontagneux.bordGlacéGau, 540+ x, 240+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéInfGau, 540+ x, 180+ y);
		game.getBatch().draw(ClimatMontagneux.murGlacéGauche, 540+ x, 120+ y);
		game.getBatch().draw(ClimatMontagneux.murGlacéGauche, 540+ x, 60+ y);
		game.getBatch().draw(ClimatMontagneux.murGlacéGauche, 540+ x, 0+ y);
		

		ClimatMontagneux.eauProfonde(game,00+x,0+y);
		ClimatMontagneux.eauProfonde(game,60+x,0+y);
		ClimatMontagneux.eauProfonde(game,120+x,0+y);
		ClimatMontagneux.eauProfonde(game,180+x,0+y);
		ClimatMontagneux.eauProfonde(game,240+x,0+y); 
		
		ClimatMontagneux.eauProfonde(game,00+x,60+y);
		ClimatMontagneux.eauProfonde(game,60+x,60+y);
		ClimatMontagneux.eauProfonde(game,120+x,60+y);
		ClimatMontagneux.eauProfonde(game,180+x,60+y);

		ClimatMontagneux.eauProfonde(game,00+x,120+y);
		ClimatMontagneux.eauProfonde(game,60+x,120+y);
		ClimatMontagneux.eauProfonde(game,120+x,120+y);
		ClimatMontagneux.eauProfonde(game,180+x,120+y);
		ClimatMontagneux.eauProfonde(game,240+x,120+y);

		ClimatMontagneux.eauProfonde(game,00+x,180+y);
		ClimatMontagneux.eauProfonde(game,60+x,180+y);
		ClimatMontagneux.eauProfonde(game,120+x,180+y);
		ClimatMontagneux.eauProfonde(game,180+x,180+y);
		ClimatMontagneux.eauProfonde(game,240+x,180+y);

		ClimatMontagneux.eauProfonde(game,00+x,240+y);
		ClimatMontagneux.eauProfonde(game,60+x,240+y);
		ClimatMontagneux.eauProfonde(game,120+x,240+y);
		ClimatMontagneux.eauProfonde(game,180+x,240+y);

		ClimatMontagneux.eauProfonde(game,60+x,300+y);
		ClimatMontagneux.eauProfonde(game,120+x,300+y);
		

		game.getBatch().draw(ClimatMontagneux.bordGlacéInfDroi, 0+ x, 300+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéInf, 60+ x, 360+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéInf, 120+ x, 360+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéInfGau, 180+ x, 300+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéInfGau, 240+ x, 240+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéGau, 300+ x, 180+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéGau, 300+ x, 120+ y);
		game.getBatch().draw(ClimatMontagneux.cheminGlaceHori, 240+ x, 60+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéGau, 300+ x, 0+ y);
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
		
		if ( isCote6Created) MainMenu.world.destroyBody(cote6);
		isCote6Created = false;
		
		if ( isArbre1Created) MainMenu.world.destroyBody(arbre1);
		isArbre1Created = false;
	}

	public static void createBodyAndType(World world) {
		// TODO Auto-generated method stub
		if ( isCote1Created == false ) {
			cote1 = ClimatMontagneux.createBody(280,450,120,60);
			isCote1Created = true;
		}
		if ( isCote2Created == false ) {
			cote2 = ClimatMontagneux.createBody(370,360,60,120);
			isCote2Created = true;
		}
		if ( isCote3Created == false ) {
			cote3 = ClimatMontagneux.createBody(460,240,1,360);
			isCote3Created = true;
		}
		if ( isCote4Created == false ) {
			cote4 = ClimatMontagneux.createBody(520,150,1,280);
			isCote4Created = true;
		}
		if ( isCote5Created == false ) {
			cote5 = ClimatMontagneux.createBody(570,205,60,1);
			isCote5Created = true;
		}
		if ( isCote6Created == false ) {
			cote6 = ClimatMontagneux.createBody(490,390,60,60);
			isCote6Created = true;
		}
		
		if ( isArbre1Created == false ) {
			arbre1 = ClimatMontagneux.createBodyPerso("arbre", "static",540,420);
			isArbre1Created = true;
		}
	}

	public static void destroyType() {
		// TODO Auto-generated method stub
		
	}
}
