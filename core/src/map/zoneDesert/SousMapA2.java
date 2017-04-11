package map.zoneDesert;

import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.physics.box2d.Body;
import com.badlogic.gdx.physics.box2d.World;
import com.mygdx.game.GameMain;

import decors.ClimatMontagneux;
import map.CadrillageMap;
import scenes.MainMenu;


public class SousMapA2 extends Sprite{
		
//	murs gauches
	
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
		ClimatMontagneux.eauProfondeGlacée(game,300+ x, 60+y);
		ClimatMontagneux.eauProfondeGlacée(game,300+ x, 120+y);
		ClimatMontagneux.eauProfondeGlacée(game,300+ x, 180+y);
		ClimatMontagneux.eauProfondeGlacée(game,300+ x, 240+y);
		ClimatMontagneux.eauProfondeGlacée(game,300+ x, 300+y);
		ClimatMontagneux.eauProfondeGlacée(game,300+ x, 360+y);
		ClimatMontagneux.eauProfondeGlacée(game,300+ x, 420+y);
		
		ClimatMontagneux.eauProfondeGlacée(game,360+ x, 0+y);
		ClimatMontagneux.eauProfondeGlacée(game,360+ x, 60+y);
		ClimatMontagneux.eauProfondeGlacée(game,360+ x, 120+y);
		ClimatMontagneux.eauProfondeGlacée(game,360+ x, 180+y);
		ClimatMontagneux.eauProfondeGlacée(game,360+ x, 240+y);
		ClimatMontagneux.eauProfondeGlacée(game,360+ x, 300+y);
		ClimatMontagneux.eauProfondeGlacée(game,360+ x, 360+y);
		ClimatMontagneux.eauProfondeGlacée(game,360+ x, 420+y);
		
		ClimatMontagneux.eauProfondeGlacée(game,420+ x, 0+y);
		ClimatMontagneux.eauProfondeGlacée(game,420+ x, 60+y);
		ClimatMontagneux.eauProfondeGlacée(game,420+ x, 120+y);
		ClimatMontagneux.eauProfondeGlacée(game,420+ x, 180+y);
		ClimatMontagneux.eauProfondeGlacée(game,420+ x, 240+y);
		ClimatMontagneux.eauProfondeGlacée(game,420+ x, 300+y);
		ClimatMontagneux.eauProfondeGlacée(game,420+ x, 360+y);
		ClimatMontagneux.eauProfondeGlacée(game,420+ x, 420+y);
		
		ClimatMontagneux.eauProfondeGlacée(game,480+ x, 0+y);
		ClimatMontagneux.eauProfondeGlacée(game,480+ x, 60+y);
		ClimatMontagneux.eauProfondeGlacée(game,480+ x, 120+y);
		ClimatMontagneux.eauProfondeGlacée(game,480+ x, 180+y);
		ClimatMontagneux.eauProfondeGlacée(game,480+ x, 240+y);
		ClimatMontagneux.eauProfondeGlacée(game,480+ x, 300+y);
		ClimatMontagneux.eauProfondeGlacée(game,480+ x, 360+y);
		ClimatMontagneux.eauProfondeGlacée(game,480+ x, 420+y);
		
		ClimatMontagneux.eauProfondeGlacée(game,540+ x, 0+y);
		ClimatMontagneux.eauProfondeGlacée(game,540+ x, 60+y);
		ClimatMontagneux.eauProfondeGlacée(game,540+ x, 120+y);
		ClimatMontagneux.eauProfondeGlacée(game,540+ x, 180+y);
		ClimatMontagneux.eauProfondeGlacée(game,540+ x, 240+y);
		ClimatMontagneux.eauProfondeGlacée(game,540+ x, 300+y);
		ClimatMontagneux.eauProfondeGlacée(game,540+ x, 360+y);
		ClimatMontagneux.eauProfondeGlacée(game,540+ x, 420+y);
		
		game.getBatch().draw(ClimatMontagneux.glaceFragmentéHautGauche,300+x,420+y);
		game.getBatch().draw(ClimatMontagneux.glaceFragmentée,360+x,420+y);
		game.getBatch().draw(ClimatMontagneux.glaceFragmentée,420+x,420+y);
		game.getBatch().draw(ClimatMontagneux.glaceFragmentée,480+x,420+y);
		game.getBatch().draw(ClimatMontagneux.glaceFragmentée,540+x,420+y);
		
		game.getBatch().draw(ClimatMontagneux.glaceFragmentéHautGauche,240+x,360+y);
		game.getBatch().draw(ClimatMontagneux.glaceFragmentée,300+x,360+y);
		game.getBatch().draw(ClimatMontagneux.glaceFragmentée,360+x,360+y);
		game.getBatch().draw(ClimatMontagneux.glaceFragmentée,420+x,360+y);
		game.getBatch().draw(ClimatMontagneux.glaceFragmentée,480+x,360+y);
		game.getBatch().draw(ClimatMontagneux.glaceFragmentée,540+x,360+y);
		
		game.getBatch().draw(ClimatMontagneux.petitMorceauGlaceGauche,180+x,300+y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéSupGau,240+x,300+y);
		game.getBatch().draw(ClimatMontagneux.bordMerGlacéSup,300+x,300+y);
		game.getBatch().draw(ClimatMontagneux.crate,300+x,300+y);
		game.getBatch().draw(ClimatMontagneux.bordMerGlacéSup,360+x,300+y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéSup,420+x,300+y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéSup,480+x,300+y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéSup,540+x,300+y);
		
		game.getBatch().draw(ClimatMontagneux.petitMorceauGlaceGauche,180+x,240+y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéGau,240+x,240+y);
		game.getBatch().draw(ClimatMontagneux.glace1,300+x,240+y);
		game.getBatch().draw(ClimatMontagneux.glace1,360+x,240+y);
		game.getBatch().draw(ClimatMontagneux.glace1,420+x,240+y);
		game.getBatch().draw(ClimatMontagneux.glace1,480+x,240+y);
		game.getBatch().draw(ClimatMontagneux.glace1,540+x,240+y);
		
		game.getBatch().draw(ClimatMontagneux.petitMorceauGlaceGauche,180+x,180+y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéInfGau,240+x,180+y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéInf,300+x,180+y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéInf,360+x,180+y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéInf,420+x,180+y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéInf,480+x,180+y);
		game.getBatch().draw(ClimatMontagneux.glace1,540+x,180+y);
		
		game.getBatch().draw(ClimatMontagneux.morceauGlaceBasGauche,180+x,120+y);
		game.getBatch().draw(ClimatMontagneux.bordGlaceFragmentéeBasGauche,240+x,120+y);
		game.getBatch().draw(ClimatMontagneux.bordGlaceFragmentée,300+x,120+y);
		game.getBatch().draw(ClimatMontagneux.bordGlaceFragmentée,360+x,120+y);
		game.getBatch().draw(ClimatMontagneux.bordGlaceFragmentée,420+x,120+y);
		game.getBatch().draw(ClimatMontagneux.bordGlaceFragmentée,480+x,120+y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéInfGau,540+x,120+y);
		
		game.getBatch().draw(ClimatMontagneux.morceauGlacéInf,300+x,60+y);
		game.getBatch().draw(ClimatMontagneux.morceauGlacéInf,360+x,60+y);
		game.getBatch().draw(ClimatMontagneux.morceauGlacéInf,420+x,60+y);
		game.getBatch().draw(ClimatMontagneux.morceauGlacéInf,480+x,60+y);
		game.getBatch().draw(ClimatMontagneux.bordGlaceFragmentéeBasGauche,540+x,60+y);
		
		
	
	}
	
	public static void createBodyAndType(World world){
		
		CadrillageMap.setTypeDeDécor(180/60,120/60,"EauProfonde");
		CadrillageMap.setTypeDeDécor(180/60,180/60,"EauProfonde");
		CadrillageMap.setTypeDeDécor(180/60,240/60,"EauProfonde");
		CadrillageMap.setTypeDeDécor(180/60,300/60,"EauProfonde");
		CadrillageMap.setTypeDeDécor(180/60,360/60,"EauProfonde");
		
		CadrillageMap.setTypeDeDécor(240/60,60/60,"EauProfonde");
		CadrillageMap.setTypeDeDécor(240/60,420/60,"EauProfonde");
		
		CadrillageMap.setTypeDeDécor(300/60,60/60,"EauProfonde");
		CadrillageMap.setTypeDeDécor(360/60,60/60,"EauProfonde");
		CadrillageMap.setTypeDeDécor(420/60,60/60,"EauProfonde");
		CadrillageMap.setTypeDeDécor(480/60,60/60,"EauProfonde");
		
		CadrillageMap.setTypeDeDécor(540/60,0/60,"EauProfonde");
		
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
