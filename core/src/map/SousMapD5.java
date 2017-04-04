package map;

import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.physics.box2d.World;
import com.mygdx.game.GameMain;

import decors.ClimatMontagneux;
import items.Coffre;

public class SousMapD5 extends Sprite{
	
	public static boolean ouvertureCoffre = false; // à sauvegarder
	public static boolean coffreOuvert = false; // à sauvegarder
	
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

		ClimatMontagneux.eauProfonde(game,00+x,420+y);
		ClimatMontagneux.eauProfonde(game,60+x,420+y);
		ClimatMontagneux.eauProfonde(game,120+x,420+y);
		ClimatMontagneux.eauProfonde(game,120+x,360+y);
		ClimatMontagneux.eauProfonde(game,180+x,420+y);
		ClimatMontagneux.eauProfonde(game,180+x,360+y);
		ClimatMontagneux.eauProfonde(game,240+x,420+y);
		ClimatMontagneux.eauProfonde(game,240+x,360+y);
		ClimatMontagneux.eauProfonde(game,240+x,300+y);
		ClimatMontagneux.eauProfonde(game,300+x,300+y);
		ClimatMontagneux.eauProfonde(game,300+x,240+y);
		ClimatMontagneux.eauProfonde(game,300+x,420+y);
		ClimatMontagneux.eauProfonde(game,300+x,360+y);
		ClimatMontagneux.eauProfonde(game,360+x,180+y);
		ClimatMontagneux.eauProfonde(game,360+x,240+y);
		ClimatMontagneux.eauProfonde(game,360+x,300+y);
		ClimatMontagneux.eauProfonde(game,360+x,360+y);
		ClimatMontagneux.eauProfonde(game,420+x,180+y);
		ClimatMontagneux.eauProfonde(game,420+x,240+y);
		ClimatMontagneux.eauProfonde(game,420+x,300+y);
		ClimatMontagneux.eauProfonde(game,480+x,180+y);
		ClimatMontagneux.eauProfonde(game,480+x,240+y);
		ClimatMontagneux.eauProfonde(game,480+x,300+y);
		ClimatMontagneux.eauProfonde(game,540+x,180+y);
		ClimatMontagneux.eauProfonde(game,540+x,240+y);
		ClimatMontagneux.eauProfonde(game,540+x,300+y);
		
		

		game.getBatch().draw(ClimatMontagneux.bordGlacéGau, 60+ x, 0+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéGau, 60+ x, 60+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéGau, 60+ x, 120+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéGau, 60+ x, 180+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéGau, 60+ x, 240+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéGau, 60+ x, 300+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéSupGau, 60+ x, 360+ y);
		game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 0+ x, 360+ y);
		game.getBatch().draw(ClimatMontagneux.piedCassé2Sup, 0+ x,300+ y);
		
		game.getBatch().draw(ClimatMontagneux.tree, -40+ x, 300+ y);
		game.getBatch().draw(ClimatMontagneux.tree, -40+ x, 240+ y);
		game.getBatch().draw(ClimatMontagneux.tree, -40+ x, 180+ y);
		game.getBatch().draw(ClimatMontagneux.tree, -40+ x, 120+ y);
		game.getBatch().draw(ClimatMontagneux.tree, -40+ x, 60+ y);
		game.getBatch().draw(ClimatMontagneux.tree, -40+ x, 0+ y);

		if ( ouvertureCoffre == false ) game.getBatch().draw(ClimatMontagneux.coffreBleuFermé, 20+ x, 300+ y);
		else {
			if ( coffreOuvert == false ) {
				if ( Coffre.ouvert1 == true && Coffre.ouvert2 == true ){
					coffreOuvert = true;
				}
				Coffre.annimationCoffreBleu(game, 20, 300);
				
			} else {
				game.getBatch().draw(ClimatMontagneux.coffreBleuOuvert3, 20+ x, 300+ y);
			}
			
		}
	}

	public static void destroyBody() {
		// TODO Auto-generated method stub
		
	}

	public static void createBodyAndType(World world) {
		// TODO Auto-generated method stub

		CadrillageMap.setTypeDeDécor(0,300/60, "coffreBleu");
	}

	public static void destroyType() {
		// TODO Auto-generated method stub
		
	}
}
