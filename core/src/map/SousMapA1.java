package map;

import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.physics.box2d.Body;
import com.badlogic.gdx.physics.box2d.World;
import com.mygdx.game.GameMain;

import decors.ClimatMontagneux;
import scenes.MainMenu;

public class SousMapA1 extends Sprite {
	
	public static Body bodyMurGauche2;	
	public static boolean isBodyMurGauche2Created;

	
	public static void sousMap(GameMain game, int x, int y){
		
		
		ClimatMontagneux.eauProfondeGlacée(game,0+ x, 0+y);
		ClimatMontagneux.eauProfondeGlacée(game,0+ x, 60+y);
		ClimatMontagneux.eauProfondeGlacée(game,0+ x, 120+y);
		ClimatMontagneux.eauProfondeGlacée(game,0+ x, 180+y);
		ClimatMontagneux.eauProfondeGlacée(game,0+ x, 240+y);
		ClimatMontagneux.eauProfondeGlacée(game,0+ x, 300+y);
		ClimatMontagneux.eauProfondeGlacée(game,0+ x, 360+y);
		ClimatMontagneux.eauProfondeGlacée(game,0+ x, 420+y);
		
		
		ClimatMontagneux.eauProfondeGlacée(game,60+ x, 0+y);
		ClimatMontagneux.eauProfondeGlacée(game,60+ x, 60+y);
		ClimatMontagneux.eauProfondeGlacée(game,60+ x, 120+y);
		ClimatMontagneux.eauProfondeGlacée(game,60+ x, 180+y);
		ClimatMontagneux.eauProfondeGlacée(game,60+ x, 240+y);
		ClimatMontagneux.eauProfondeGlacée(game,60+ x, 300+y);
		ClimatMontagneux.eauProfondeGlacée(game,60+ x, 360+y);
		ClimatMontagneux.eauProfondeGlacée(game,60+ x, 420+y);
		
		ClimatMontagneux.eauProfondeGlacée(game,120+ x, 0+y);
		ClimatMontagneux.eauProfondeGlacée(game,120+ x, 60+y);
		ClimatMontagneux.eauProfondeGlacée(game,120+ x, 120+y);
		ClimatMontagneux.eauProfondeGlacée(game,120+ x, 180+y);
		ClimatMontagneux.eauProfondeGlacée(game,120+ x, 240+y);
		ClimatMontagneux.eauProfondeGlacée(game,120+ x, 300+y);
		ClimatMontagneux.eauProfondeGlacée(game,120+ x, 360+y);
		ClimatMontagneux.eauProfondeGlacée(game,120+ x, 420+y);
		
		ClimatMontagneux.eauProfondeGlacée(game,180+ x, 0+y);
		ClimatMontagneux.eauProfondeGlacée(game,180+ x, 60+y);
		ClimatMontagneux.eauProfondeGlacée(game,180+ x, 120+y);
		ClimatMontagneux.eauProfondeGlacée(game,180+ x, 180+y);
		ClimatMontagneux.eauProfondeGlacée(game,180+ x, 240+y);
		ClimatMontagneux.eauProfondeGlacée(game,180+ x, 300+y);
		ClimatMontagneux.eauProfondeGlacée(game,180+ x, 360+y);
		ClimatMontagneux.eauProfondeGlacée(game,180+ x, 420+y);
		
		ClimatMontagneux.eauProfondeGlacée(game,240+ x, 0+y);
		ClimatMontagneux.eauProfondeGlacée(game,240+ x, 60+y);
		ClimatMontagneux.eauProfondeGlacée(game,240+ x, 120+y);
		ClimatMontagneux.eauProfondeGlacée(game,240+ x, 180+y);
		ClimatMontagneux.eauProfondeGlacée(game,240+ x, 240+y);
		ClimatMontagneux.eauProfondeGlacée(game,240+ x, 300+y);
		ClimatMontagneux.eauProfondeGlacée(game,240+ x, 360+y);
		ClimatMontagneux.eauProfondeGlacée(game,240+ x, 420+y);
		
		ClimatMontagneux.eauProfondeGlacée(game,300+ x, 0+y);
		game.getBatch().draw(ClimatMontagneux.morceauGlaceGauche, 300+x, 0+y);
		ClimatMontagneux.eauProfondeGlacée(game,300+ x, 60+y);
		game.getBatch().draw(ClimatMontagneux.morceauGlaceGauche, 300+x, 60+y);
		ClimatMontagneux.eauProfondeGlacée(game,300+ x, 120+y);
		game.getBatch().draw(ClimatMontagneux.morceauGlaceGauche, 300+x, 120+y);
		ClimatMontagneux.eauProfondeGlacée(game,300+ x, 180+y);
		ClimatMontagneux.eauProfondeGlacée(game,300+ x, 240+y);
		ClimatMontagneux.eauProfondeGlacée(game,300+ x, 300+y);
		ClimatMontagneux.eauProfondeGlacée(game,300+ x, 360+y);
		ClimatMontagneux.eauProfondeGlacée(game,300+ x, 420+y);
		
		ClimatMontagneux.eauProfondeGlacée(game,360+ x, 0+y);
		game.getBatch().draw(ClimatMontagneux.glaceFragmentée, 360+x, 0+y);
		ClimatMontagneux.eauProfondeGlacée(game,360+ x, 60+y);
		game.getBatch().draw(ClimatMontagneux.glaceFragmentée, 360+x, 60+y);
		ClimatMontagneux.eauProfondeGlacée(game,360+ x, 120+y);
		game.getBatch().draw(ClimatMontagneux.glaceFragmentée, 360+x, 120+y);
		game.getBatch().draw(ClimatMontagneux.eauProfondeGlacée, 360+x, 180+y);
		game.getBatch().draw(ClimatMontagneux.glaceFragmentéHautGauche, 360+x, 180+y);
		ClimatMontagneux.eauProfondeGlacée(game,360+ x, 240+y);
		game.getBatch().draw(ClimatMontagneux.morceauGlaceHautGauche, 360+x, 240+y);
		ClimatMontagneux.eauProfondeGlacée(game,360+ x, 300+y);
		ClimatMontagneux.eauProfondeGlacée(game,360+ x, 360+y);
		ClimatMontagneux.eauProfondeGlacée(game,360+ x, 420+y);
		
		ClimatMontagneux.eauProfondeGlacée(game,420+ x, 0+y);
		game.getBatch().draw(ClimatMontagneux.glaceFragmentée, 420+x, 0+y);
		ClimatMontagneux.eauProfondeGlacée(game,420+ x, 60+y);
		game.getBatch().draw(ClimatMontagneux.glaceFragmentée, 420+x, 60+y);
		game.getBatch().draw(ClimatMontagneux.eauProfondeGlacée, 420+x, 120+y);
		game.getBatch().draw(ClimatMontagneux.eauProfondeGlacée, 420+x, 180+y);
		game.getBatch().draw(ClimatMontagneux.glaceFragmentée, 420+x, 120+y);
		game.getBatch().draw(ClimatMontagneux.glaceFragmentée, 420+x, 180+y);
		ClimatMontagneux.eauProfondeGlacée(game,420+ x, 240+y);
		game.getBatch().draw(ClimatMontagneux.morceauGlaceHaut, 420+x, 240+y);
		ClimatMontagneux.eauProfondeGlacée(game,420+ x, 300+y);
		ClimatMontagneux.eauProfondeGlacée(game,420+ x, 360+y);
		ClimatMontagneux.eauProfondeGlacée(game,420+ x, 420+y);
		
		ClimatMontagneux.eauProfondeGlacée(game,480+ x, 0+y);
		game.getBatch().draw(ClimatMontagneux.glaceFragmentée, 480+x, 0+y);
		ClimatMontagneux.eauProfondeGlacée(game,480+ x, 60+y);
		game.getBatch().draw(ClimatMontagneux.glaceFragmentée, 480+x, 60+y);
		game.getBatch().draw(ClimatMontagneux.eauProfondeGlacée, 480+x, 120+y);
		game.getBatch().draw(ClimatMontagneux.eauProfondeGlacée, 480+x, 180+y);
		game.getBatch().draw(ClimatMontagneux.glaceFragmentée, 480+x, 120+y);
		game.getBatch().draw(ClimatMontagneux.glaceFragmentée, 480+x, 180+y);
		ClimatMontagneux.eauProfondeGlacée(game,480+ x, 240+y);
		game.getBatch().draw(ClimatMontagneux.morceauGlaceHaut, 480+x, 240+y);
		ClimatMontagneux.eauProfondeGlacée(game,480+ x, 300+y);
		ClimatMontagneux.eauProfondeGlacée(game,480+ x, 360+y);
		ClimatMontagneux.eauProfondeGlacée(game,480+ x, 420+y);
		
		ClimatMontagneux.eauProfondeGlacée(game,540+ x, 0+y);
		game.getBatch().draw(ClimatMontagneux.glaceFragmentée, 540+x, 0+y);
		ClimatMontagneux.eauProfondeGlacée(game,540+ x, 60+y);
		game.getBatch().draw(ClimatMontagneux.glaceFragmentée, 540+x, 60+y);
		game.getBatch().draw(ClimatMontagneux.eauProfondeGlacée, 540+x, 120+y);
		game.getBatch().draw(ClimatMontagneux.eauProfondeGlacée, 540+x, 180+y);
		game.getBatch().draw(ClimatMontagneux.glaceFragmentée, 540+x, 120+y);
		game.getBatch().draw(ClimatMontagneux.glaceFragmentée, 540+x, 180+y);
		ClimatMontagneux.eauProfondeGlacée(game,540+ x, 240+y);
		game.getBatch().draw(ClimatMontagneux.glaceFragmentéHautGauche, 540+x, 240+y);
		ClimatMontagneux.eauProfondeGlacée(game,540+ x, 300+y);
		ClimatMontagneux.eauProfondeGlacée(game,540+ x, 360+y);
		ClimatMontagneux.eauProfondeGlacée(game,540+ x, 420+y);
		
		game.getBatch().draw(ClimatMontagneux.icebergWater, 60+x, 120+y);
	
	}
	
	public static void createBodyAndType(World world){
		
		CadrillageMap.setTypeDeDécor(240/60, 0, "EauProfonde");
		CadrillageMap.setTypeDeDécor(240/60, 1, "EauProfonde");
		CadrillageMap.setTypeDeDécor(240/60, 2, "EauProfonde");
		CadrillageMap.setTypeDeDécor(300/60, 3, "EauProfonde");
		CadrillageMap.setTypeDeDécor(360/60, 4, "EauProfonde");
		CadrillageMap.setTypeDeDécor(420/60, 4, "EauProfonde");
		CadrillageMap.setTypeDeDécor(480/60, 4, "EauProfonde");
		CadrillageMap.setTypeDeDécor(540/60, 5, "EauProfonde");
		
//		murs gauches
		
		if ( isBodyMurGauche2Created == false ) {
			bodyMurGauche2 = ClimatMontagneux.createBody(0,240,1,480);
			isBodyMurGauche2Created = true;
		}
	}
	
	public static void destroyBody(){
//		murs gauches
		
		if ( isBodyMurGauche2Created)MainMenu.world.destroyBody(bodyMurGauche2);
		isBodyMurGauche2Created = false;
	}
}
