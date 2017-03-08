package map;

import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.physics.box2d.Body;
import com.badlogic.gdx.physics.box2d.World;
import com.mygdx.game.GameMain;

import d�cors.ClimatMontagneux;
import d�cors.MurDroitSolideHaut;
import scenes.MainMenu;


public class SousMapA2 extends Sprite{
		
//	murs gauches
	
	public static Body bodyMurGauche2;
	public static Body bodyMurGauche3;
	public static Body bodyMurGauche4;
	public static Body bodyMurGauche5;
	public static Body bodyMurGauche6;
	public static Body bodyMurGauche7;
	public static Body bodyMurGauche8;
	public static Body bodyMurGauche9;
	
	public static boolean isBodyMurGauche2Created;
	public static boolean isBodyMurGauche3Created;
	public static boolean isBodyMurGauche4Created;
	public static boolean isBodyMurGauche5Created;
	public static boolean isBodyMurGauche6Created;
	public static boolean isBodyMurGauche7Created;
	public static boolean isBodyMurGauche8Created;
	public static boolean isBodyMurGauche9Created;
	
	
	public static void sousMapA2(GameMain game, int x, int y){
		
		
		ClimatMontagneux.eauProfondeGlac�e(game,0+ x, 0+y);
		ClimatMontagneux.eauProfondeGlac�e(game,0+ x, 60+y);
		ClimatMontagneux.eauProfondeGlac�e(game,0+ x, 120+y);
		ClimatMontagneux.eauProfondeGlac�e(game,0+ x, 180+y);
		ClimatMontagneux.eauProfondeGlac�e(game,0+ x, 240+y);
		ClimatMontagneux.eauProfondeGlac�e(game,0+ x, 300+y);
		ClimatMontagneux.eauProfondeGlac�e(game,0+ x, 360+y);
		ClimatMontagneux.eauProfondeGlac�e(game,0+ x, 420+y);
		
		
		ClimatMontagneux.eauProfondeGlac�e(game,60+ x, 0+y);
		ClimatMontagneux.eauProfondeGlac�e(game,60+ x, 60+y);
		ClimatMontagneux.eauProfondeGlac�e(game,60+ x, 120+y);
		ClimatMontagneux.eauProfondeGlac�e(game,60+ x, 180+y);
		ClimatMontagneux.eauProfondeGlac�e(game,60+ x, 240+y);
		ClimatMontagneux.eauProfondeGlac�e(game,60+ x, 300+y);
		ClimatMontagneux.eauProfondeGlac�e(game,60+ x, 360+y);
		ClimatMontagneux.eauProfondeGlac�e(game,60+ x, 420+y);
		
		ClimatMontagneux.eauProfondeGlac�e(game,120+ x, 0+y);
		ClimatMontagneux.eauProfondeGlac�e(game,120+ x, 60+y);
		ClimatMontagneux.eauProfondeGlac�e(game,120+ x, 120+y);
		ClimatMontagneux.eauProfondeGlac�e(game,120+ x, 180+y);
		ClimatMontagneux.eauProfondeGlac�e(game,120+ x, 240+y);
		ClimatMontagneux.eauProfondeGlac�e(game,120+ x, 300+y);
		ClimatMontagneux.eauProfondeGlac�e(game,120+ x, 360+y);
		ClimatMontagneux.eauProfondeGlac�e(game,120+ x, 420+y);
		
		
		ClimatMontagneux.eauProfondeGlac�e(game,180+ x, 0+y);
		ClimatMontagneux.eauProfondeGlac�e(game,180+ x, 60+y);
		ClimatMontagneux.eauProfondeGlac�e(game,180+ x, 120+y);
		ClimatMontagneux.eauProfondeGlac�e(game,180+ x, 180+y);
		ClimatMontagneux.eauProfondeGlac�e(game,180+ x, 240+y);
		ClimatMontagneux.eauProfondeGlac�e(game,180+ x, 300+y);
		ClimatMontagneux.eauProfondeGlac�e(game,180+ x, 360+y);
		ClimatMontagneux.eauProfondeGlac�e(game,180+ x, 420+y);
		
		ClimatMontagneux.eauProfondeGlac�e(game,240+ x, 0+y);
		ClimatMontagneux.eauProfondeGlac�e(game,240+ x, 60+y);
		ClimatMontagneux.eauProfondeGlac�e(game,240+ x, 120+y);
		ClimatMontagneux.eauProfondeGlac�e(game,240+ x, 180+y);
		ClimatMontagneux.eauProfondeGlac�e(game,240+ x, 240+y);
		ClimatMontagneux.eauProfondeGlac�e(game,240+ x, 300+y);
		ClimatMontagneux.eauProfondeGlac�e(game,240+ x, 360+y);
		ClimatMontagneux.eauProfondeGlac�e(game,240+ x, 420+y);
		
		ClimatMontagneux.eauProfondeGlac�e(game,300+ x, 0+y);
		ClimatMontagneux.eauProfondeGlac�e(game,300+ x, 60+y);
		ClimatMontagneux.eauProfondeGlac�e(game,300+ x, 120+y);
		ClimatMontagneux.eauProfondeGlac�e(game,300+ x, 180+y);
		ClimatMontagneux.eauProfondeGlac�e(game,300+ x, 240+y);
		ClimatMontagneux.eauProfondeGlac�e(game,300+ x, 300+y);
		ClimatMontagneux.eauProfondeGlac�e(game,300+ x, 360+y);
		ClimatMontagneux.eauProfondeGlac�e(game,300+ x, 420+y);
		
		ClimatMontagneux.eauProfondeGlac�e(game,360+ x, 0+y);
		ClimatMontagneux.eauProfondeGlac�e(game,360+ x, 60+y);
		ClimatMontagneux.eauProfondeGlac�e(game,360+ x, 120+y);
		ClimatMontagneux.eauProfondeGlac�e(game,360+ x, 180+y);
		ClimatMontagneux.eauProfondeGlac�e(game,360+ x, 240+y);
		ClimatMontagneux.eauProfondeGlac�e(game,360+ x, 300+y);
		ClimatMontagneux.eauProfondeGlac�e(game,360+ x, 360+y);
		ClimatMontagneux.eauProfondeGlac�e(game,360+ x, 420+y);
		
		ClimatMontagneux.eauProfondeGlac�e(game,420+ x, 0+y);
		ClimatMontagneux.eauProfondeGlac�e(game,420+ x, 60+y);
		ClimatMontagneux.eauProfondeGlac�e(game,420+ x, 120+y);
		ClimatMontagneux.eauProfondeGlac�e(game,420+ x, 180+y);
		ClimatMontagneux.eauProfondeGlac�e(game,420+ x, 240+y);
		ClimatMontagneux.eauProfondeGlac�e(game,420+ x, 300+y);
		ClimatMontagneux.eauProfondeGlac�e(game,420+ x, 360+y);
		ClimatMontagneux.eauProfondeGlac�e(game,420+ x, 420+y);
		
		ClimatMontagneux.eauProfondeGlac�e(game,480+ x, 0+y);
		ClimatMontagneux.eauProfondeGlac�e(game,480+ x, 60+y);
		ClimatMontagneux.eauProfondeGlac�e(game,480+ x, 120+y);
		ClimatMontagneux.eauProfondeGlac�e(game,480+ x, 180+y);
		ClimatMontagneux.eauProfondeGlac�e(game,480+ x, 240+y);
		ClimatMontagneux.eauProfondeGlac�e(game,480+ x, 300+y);
		ClimatMontagneux.eauProfondeGlac�e(game,480+ x, 360+y);
		ClimatMontagneux.eauProfondeGlac�e(game,480+ x, 420+y);
		
		ClimatMontagneux.eauProfondeGlac�e(game,540+ x, 0+y);
		ClimatMontagneux.eauProfondeGlac�e(game,540+ x, 60+y);
		ClimatMontagneux.eauProfondeGlac�e(game,540+ x, 120+y);
		ClimatMontagneux.eauProfondeGlac�e(game,540+ x, 180+y);
		ClimatMontagneux.eauProfondeGlac�e(game,540+ x, 240+y);
		ClimatMontagneux.eauProfondeGlac�e(game,540+ x, 300+y);
		ClimatMontagneux.eauProfondeGlac�e(game,540+ x, 360+y);
		ClimatMontagneux.eauProfondeGlac�e(game,540+ x, 420+y);
		
		game.getBatch().draw(ClimatMontagneux.glaceFragment�HautGauche,300+x,420+y);
		game.getBatch().draw(ClimatMontagneux.glaceFragment�e,360+x,420+y);
		game.getBatch().draw(ClimatMontagneux.glaceFragment�e,420+x,420+y);
		game.getBatch().draw(ClimatMontagneux.glaceFragment�e,480+x,420+y);
		game.getBatch().draw(ClimatMontagneux.glaceFragment�e,540+x,420+y);
		
		game.getBatch().draw(ClimatMontagneux.glaceFragment�HautGauche,240+x,360+y);
		game.getBatch().draw(ClimatMontagneux.glaceFragment�e,300+x,360+y);
		game.getBatch().draw(ClimatMontagneux.glaceFragment�e,360+x,360+y);
		game.getBatch().draw(ClimatMontagneux.glaceFragment�e,420+x,360+y);
		game.getBatch().draw(ClimatMontagneux.glaceFragment�e,480+x,360+y);
		game.getBatch().draw(ClimatMontagneux.glaceFragment�e,540+x,360+y);
		
		game.getBatch().draw(ClimatMontagneux.petitMorceauGlaceGauche,180+x,300+y);
		game.getBatch().draw(ClimatMontagneux.bordGlac�SupGau,240+x,300+y);
		game.getBatch().draw(ClimatMontagneux.bordMerGlac�Sup,300+x,300+y);
		game.getBatch().draw(ClimatMontagneux.crate,300+x,300+y);
		game.getBatch().draw(ClimatMontagneux.bordMerGlac�Sup,360+x,300+y);
		game.getBatch().draw(ClimatMontagneux.bordGlac�Sup,420+x,300+y);
		game.getBatch().draw(ClimatMontagneux.bordGlac�Sup,480+x,300+y);
		game.getBatch().draw(ClimatMontagneux.bordGlac�Sup,540+x,300+y);
		
		game.getBatch().draw(ClimatMontagneux.petitMorceauGlaceGauche,180+x,240+y);
		game.getBatch().draw(ClimatMontagneux.bordGlac�Gau,240+x,240+y);
		game.getBatch().draw(ClimatMontagneux.glace1,300+x,240+y);
		game.getBatch().draw(ClimatMontagneux.glace1,360+x,240+y);
		game.getBatch().draw(ClimatMontagneux.glace1,420+x,240+y);
		game.getBatch().draw(ClimatMontagneux.glace1,480+x,240+y);
		game.getBatch().draw(ClimatMontagneux.glace1,540+x,240+y);
		
		game.getBatch().draw(ClimatMontagneux.petitMorceauGlaceGauche,180+x,180+y);
		game.getBatch().draw(ClimatMontagneux.bordGlac�InfGau,240+x,180+y);
		game.getBatch().draw(ClimatMontagneux.bordGlac�Inf,300+x,180+y);
		game.getBatch().draw(ClimatMontagneux.bordGlac�Inf,360+x,180+y);
		game.getBatch().draw(ClimatMontagneux.bordGlac�Inf,420+x,180+y);
		game.getBatch().draw(ClimatMontagneux.bordGlac�Inf,480+x,180+y);
		game.getBatch().draw(ClimatMontagneux.glace1,540+x,180+y);
		
		game.getBatch().draw(ClimatMontagneux.morceauGlaceBasGauche,180+x,120+y);
		game.getBatch().draw(ClimatMontagneux.bordGlaceFragment�eBasGauche,240+x,120+y);
		game.getBatch().draw(ClimatMontagneux.bordGlaceFragment�e,300+x,120+y);
		game.getBatch().draw(ClimatMontagneux.bordGlaceFragment�e,360+x,120+y);
		game.getBatch().draw(ClimatMontagneux.bordGlaceFragment�e,420+x,120+y);
		game.getBatch().draw(ClimatMontagneux.bordGlaceFragment�e,480+x,120+y);
		game.getBatch().draw(ClimatMontagneux.bordGlac�InfGau,540+x,120+y);
		
		game.getBatch().draw(ClimatMontagneux.morceauGlac�Inf,300+x,60+y);
		game.getBatch().draw(ClimatMontagneux.morceauGlac�Inf,360+x,60+y);
		game.getBatch().draw(ClimatMontagneux.morceauGlac�Inf,420+x,60+y);
		game.getBatch().draw(ClimatMontagneux.morceauGlac�Inf,480+x,60+y);
		game.getBatch().draw(ClimatMontagneux.bordGlaceFragment�eBasGauche,540+x,60+y);
	
	}
	
	public static void createBodyAndType(World world){
		
		Map.setTypeDeD�cor(180/60,120/60,"EauProfonde");
		Map.setTypeDeD�cor(180/60,180/60,"EauProfonde");
		Map.setTypeDeD�cor(180/60,240/60,"EauProfonde");
		Map.setTypeDeD�cor(180/60,300/60,"EauProfonde");
		Map.setTypeDeD�cor(180/60,360/60,"EauProfonde");
		
		Map.setTypeDeD�cor(240/60,60/60,"EauProfonde");
		Map.setTypeDeD�cor(240/60,420/60,"EauProfonde");
		
		Map.setTypeDeD�cor(300/60,60/60,"EauProfonde");
		Map.setTypeDeD�cor(360/60,60/60,"EauProfonde");
		Map.setTypeDeD�cor(420/60,60/60,"EauProfonde");
		Map.setTypeDeD�cor(480/60,60/60,"EauProfonde");
		
		Map.setTypeDeD�cor(540/60,0/60,"EauProfonde");
		
//		murs gauches
		
		if ( isBodyMurGauche2Created == false ) {
			bodyMurGauche2 = MurDroitSolideHaut.createBody(0,0);
			isBodyMurGauche2Created = true;
		}
		if ( isBodyMurGauche3Created == false ) {
			bodyMurGauche3 = MurDroitSolideHaut.createBody(0,60);
			isBodyMurGauche3Created = true;
		}
		if ( isBodyMurGauche4Created == false ) {
			bodyMurGauche4 = MurDroitSolideHaut.createBody(0,120);
			isBodyMurGauche4Created = true;
		}
		if ( isBodyMurGauche5Created == false ) {
			bodyMurGauche5 = MurDroitSolideHaut.createBody(0,180);
			isBodyMurGauche5Created = true;
		}
		if ( isBodyMurGauche6Created == false ) {
			bodyMurGauche6 = MurDroitSolideHaut.createBody(0,240);
			isBodyMurGauche6Created = true;
		}
		if ( isBodyMurGauche7Created == false ) {
			bodyMurGauche7 = MurDroitSolideHaut.createBody(0,300);
			isBodyMurGauche7Created = true;
		}
		if ( isBodyMurGauche8Created == false ) {
			bodyMurGauche8 = MurDroitSolideHaut.createBody(0,360);
			isBodyMurGauche8Created = true;
		}
		if ( isBodyMurGauche9Created == false ) {
			bodyMurGauche9 = MurDroitSolideHaut.createBody(0,420);
			isBodyMurGauche9Created = true;
		}
		
		
		
//		========================================================================================
//									Cr�ation des corps des montres
//		========================================================================================
		
		
	}
	
	public static void destroyBody(){
//		d�struction du corps des arbres et des monstres
		
		
//		murs gauches
		
		if ( isBodyMurGauche2Created)MainMenu.world.destroyBody(bodyMurGauche2);
		if ( isBodyMurGauche3Created)MainMenu.world.destroyBody(bodyMurGauche3);
		if ( isBodyMurGauche4Created)MainMenu.world.destroyBody(bodyMurGauche4);
		if ( isBodyMurGauche5Created)MainMenu.world.destroyBody(bodyMurGauche5);
		if ( isBodyMurGauche6Created)MainMenu.world.destroyBody(bodyMurGauche6);
		if ( isBodyMurGauche7Created)MainMenu.world.destroyBody(bodyMurGauche7);
		if ( isBodyMurGauche8Created)MainMenu.world.destroyBody(bodyMurGauche8);
		if ( isBodyMurGauche9Created)MainMenu.world.destroyBody(bodyMurGauche9);
		isBodyMurGauche2Created = false;
		isBodyMurGauche3Created = false;
		isBodyMurGauche4Created = false;
		isBodyMurGauche5Created = false;
		isBodyMurGauche6Created = false;
		isBodyMurGauche7Created = false;
		isBodyMurGauche8Created = false;
		isBodyMurGauche9Created = false;
	}
	
	
}
