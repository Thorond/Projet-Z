package map;

import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.physics.box2d.Body;
import com.badlogic.gdx.physics.box2d.World;
import com.mygdx.game.GameMain;

import d�cors.ClimatMontagneux;
import items.CoeurDeVie;
import scenes.MainMenu;

public class SousMapB3 extends Sprite{
	
	public static boolean pontCasse = false;
	
	public static Body bosquet1 ;
	public static boolean isBosquet1Created;
	public static Body bosquet2 ;
	public static boolean isBosquet2Created;
	
	public static void sousMapB3(GameMain game, int x, int y){
		
		game.getBatch().draw(ClimatMontagneux.glace1, 0+ x, 0+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 0+ x, 60+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 0+ x, 120+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 0+ x, 180+ y);		
		game.getBatch().draw(ClimatMontagneux.glace1, 0 + x,240 + y);
		game.getBatch().draw(ClimatMontagneux.glace1, 0+ x, 300+ y);
		ClimatMontagneux.eauProfondeGlac�e(game,0+ x, 360+y);
		ClimatMontagneux.eauProfondeGlac�e(game,0+ x, 420+y);
		
		game.getBatch().draw(ClimatMontagneux.glace1, 60+ x, 0+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 60+ x, 60+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 60+ x, 120+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 60+ x, 180+ y);		
		game.getBatch().draw(ClimatMontagneux.glace1, 60+ x, 240+ y);	
		game.getBatch().draw(ClimatMontagneux.glace1, 60+ x, 300+ y);
		ClimatMontagneux.eauProfondeGlac�e(game,60+ x, 360+y);
		ClimatMontagneux.eauProfondeGlac�e(game,60+ x, 420+y);
		
		game.getBatch().draw(ClimatMontagneux.glace1, 120+ x, 0+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 120+ x, 60+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 120+ x, 120+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 120+ x, 180+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 120+ x, 240+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 120+ x, 300+ y);
		ClimatMontagneux.eauProfondeGlac�e(game,120+ x, 360+y);
		ClimatMontagneux.eauProfondeGlac�e(game,120+ x, 420+y);
		
		game.getBatch().draw(ClimatMontagneux.glace1, 180+ x, 0+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 180+ x, 60+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 180+ x, 120+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 180+ x, 180+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 180+ x, 240+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 180+ x, 300+ y);
		ClimatMontagneux.eauProfondeGlac�e(game,180+ x, 360+y);
		ClimatMontagneux.eauProfondeGlac�e(game,180+ x, 420+y);
		
		game.getBatch().draw(ClimatMontagneux.glace1, 240+ x, 0+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 240+ x, 60+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 240+ x, 120+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 240+ x, 180+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 240+ x, 240+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 240+ x, 300+ y);
		ClimatMontagneux.eauProfondeGlac�e(game,240+ x, 360+y);
		ClimatMontagneux.eauProfondeGlac�e(game,240+ x, 420+y);
		
		game.getBatch().draw(ClimatMontagneux.glace1, 300+ x, 0+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 300+ x, 60+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 300+ x, 120+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 300+ x, 180+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 300+ x, 240+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 300+ x, 300+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 300+ x, 360+ y);
		ClimatMontagneux.eauProfondeGlac�e(game,300+ x, 420+y);
		
		game.getBatch().draw(ClimatMontagneux.glace1, 360+ x, 0+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 360+ x, 60+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 360+ x, 120+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 360+ x, 180+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 360+ x, 240+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 360+ x, 300+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 360+ x, 360+ y);
		ClimatMontagneux.eauProfondeGlac�e(game,360+ x, 420+y);
		
		game.getBatch().draw(ClimatMontagneux.glace1, 420+ x, 0+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 420+ x, 60+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 420+ x, 120+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 420+ x, 180+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 420+ x, 240+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 420+ x, 300+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 420+ x, 360+ y);
		ClimatMontagneux.eauProfondeGlac�e(game,420+ x, 420+y);
		
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
		
		
		game.getBatch().draw(ClimatMontagneux.bordGlac�SupDroi, 180+ x, 60+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlac�Droi, 120+ x, 120+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlac�Droi, 120+ x, 180+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlac�Droi, 120+ x, 240+ y);
		game.getBatch().draw(ClimatMontagneux.cheminGlaceHori, 180+ x, 300+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlac�Inf, 300+ x, 300+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlac�Inf, 360+ x, 300+ y);
		
		game.getBatch().draw(ClimatMontagneux.bordGlac�Sup, 240+ x, 00+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlac�Sup, 300+ x, 00+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlac�Sup, 360+ x, 00+ y);
		
		game.getBatch().draw(ClimatMontagneux.bordMerGlac�Sup, 00+ x, 300+ y);
		game.getBatch().draw(ClimatMontagneux.bordMerGlac�Sup, 60+ x, 300+ y);
		game.getBatch().draw(ClimatMontagneux.bordMerGlac�Sup, 120+ x, 300+ y);
		game.getBatch().draw(ClimatMontagneux.bordMerGlac�SupGau, 300+ x, 360+ y);
		game.getBatch().draw(ClimatMontagneux.bordMerGlac�Sup, 360+ x, 360+ y);
		game.getBatch().draw(ClimatMontagneux.bordMerGlac�Sup, 420+ x, 360+ y);
		game.getBatch().draw(ClimatMontagneux.bordMerGlac�Gau, 480+ x, 420+ y);
		
		game.getBatch().draw(ClimatMontagneux.bordGlac�SupGau, 420+ x, 60+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlac�Gau, 480+ x, 120+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlac�Gau, 480+ x, 180+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlac�Gau, 480+ x, 240+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlac�Inf, 420+ x, 300+ y);
		
//		arbre 
		
		
		game.getBatch().draw(ClimatMontagneux.tree, 60+ x, 330+ y);
		game.getBatch().draw(ClimatMontagneux.tree, 60+ x, 270+ y);
		game.getBatch().draw(ClimatMontagneux.tree, 60+ x, 210+ y);
		game.getBatch().draw(ClimatMontagneux.tree, 60+ x, 150+ y);
		game.getBatch().draw(ClimatMontagneux.tree, 60+ x, 90+ y);
		game.getBatch().draw(ClimatMontagneux.tree, 60+ x, 30+ y);
		
		game.getBatch().draw(ClimatMontagneux.tree, 120+ x, 300+ y);
		game.getBatch().draw(ClimatMontagneux.tree, 120+ x, 240+ y);
		game.getBatch().draw(ClimatMontagneux.tree, 120+ x, 180+ y);
		game.getBatch().draw(ClimatMontagneux.tree, 120+ x, 120+ y);
		game.getBatch().draw(ClimatMontagneux.tree, 120+ x, 60+ y);
		game.getBatch().draw(ClimatMontagneux.tree, 120+ x, 00+ y);
		
			
		
//		trou
		if ( pontCasse == false ){

			game.getBatch().draw(ClimatMontagneux.cheminGlaceHori, 240+ x, 300+ y);
		
			game.getBatch().draw(ClimatMontagneux.murSombreGlac�Centre, 240+ x, 60+ y);
			game.getBatch().draw(ClimatMontagneux.murSombreGlac�Centre, 300+ x, 60+ y);
			game.getBatch().draw(ClimatMontagneux.murSombreGlac�Centre, 360+ x, 60+ y);
			
			game.getBatch().draw(ClimatMontagneux.murSombreGlac�Centre, 180+ x, 120+ y);
			game.getBatch().draw(ClimatMontagneux.murSombreGlac�Centre, 240+ x, 120+ y);
			game.getBatch().draw(ClimatMontagneux.murSombreGlac�Centre, 300+ x, 120+ y);
			game.getBatch().draw(ClimatMontagneux.murSombreGlac�Centre, 360+ x, 120+ y);
			game.getBatch().draw(ClimatMontagneux.murSombreGlac�Droite3, 420+ x, 120+ y);
			
			game.getBatch().draw(ClimatMontagneux.murSombreGlac�Gauche3, 180+ x, 180+ y);
			game.getBatch().draw(ClimatMontagneux.murSombreGlac�Centre, 240+ x, 180+ y);
			game.getBatch().draw(ClimatMontagneux.murSombreGlac�Centre, 300+ x, 180+ y);
			game.getBatch().draw(ClimatMontagneux.murSombreGlac�Droite3, 360+ x, 180+ y);
			game.getBatch().draw(ClimatMontagneux.murSombreGlac�Droite, 420+ x, 180+ y);
			
			game.getBatch().draw(ClimatMontagneux.murSombreGlac�Gauche, 180+ x, 240+ y);
			game.getBatch().draw(ClimatMontagneux.murSombreGlac�Centre2, 240+ x, 240+ y);
			game.getBatch().draw(ClimatMontagneux.murSombreGlac�Centre2, 300+ x, 240+ y);
			game.getBatch().draw(ClimatMontagneux.murSombreGlac�Droite, 360+ x, 240+ y);
			game.getBatch().draw(ClimatMontagneux.murGlac�Centre, 420+ x, 240+ y);
			
			game.getBatch().draw(CoeurDeVie.receptacleDeCoeur, 300+ x, 180+ y);
		} else {
			ClimatMontagneux.eauProfondeGlac�e(game,240+ x, 300+y);
			ClimatMontagneux.eauProfondeGlac�e(game,240+ x, 60+y);
			ClimatMontagneux.eauProfondeGlac�e(game,300+ x, 60+y);
			ClimatMontagneux.eauProfondeGlac�e(game,360+ x, 60+y);
			ClimatMontagneux.eauProfondeGlac�e(game,180+ x, 120+y);
			ClimatMontagneux.eauProfondeGlac�e(game,240+ x, 120+y);
			ClimatMontagneux.eauProfondeGlac�e(game,300+ x, 120+y);
			ClimatMontagneux.eauProfondeGlac�e(game,360+ x, 120+y);
			ClimatMontagneux.eauProfondeGlac�e(game,420+ x, 120+y);
			ClimatMontagneux.eauProfondeGlac�e(game,180+ x, 180+y);
			ClimatMontagneux.eauProfondeGlac�e(game,240+ x, 180+y);
			ClimatMontagneux.eauProfondeGlac�e(game,300+ x, 180+y);
			ClimatMontagneux.eauProfondeGlac�e(game,360+ x, 180+y);
			ClimatMontagneux.eauProfondeGlac�e(game,420+ x, 180+y);
			ClimatMontagneux.eauProfondeGlac�e(game,180+ x, 240+y);
			ClimatMontagneux.eauProfondeGlac�e(game,240+ x, 240+y);
			ClimatMontagneux.eauProfondeGlac�e(game,300+ x, 240+y);
			ClimatMontagneux.eauProfondeGlac�e(game,360+ x, 240+y);
			ClimatMontagneux.eauProfondeGlac�e(game,420+ x, 240+y);
			
			game.getBatch().draw(CoeurDeVie.receptacleDeCoeur, 480+ x, 120+ y);
		}
		
		game.getBatch().draw(ClimatMontagneux.tree, 180+ x, 60+ y);
		
		game.getBatch().draw(ClimatMontagneux.arbreBasGauche, 180+ x, 0+ y);
		game.getBatch().draw(ClimatMontagneux.arbreSommetGauche, 180+ x, 60+ y);
		game.getBatch().draw(ClimatMontagneux.arbreBasMilieu, 240+ x, 0+ y);
		game.getBatch().draw(ClimatMontagneux.arbreSommetMilieu, 240+ x, 60+ y);
		game.getBatch().draw(ClimatMontagneux.arbreBasMilieu, 300+ x, 0+ y);
		game.getBatch().draw(ClimatMontagneux.arbreSommetMilieu, 300+ x, 60+ y);
		game.getBatch().draw(ClimatMontagneux.arbreBasMilieu, 360+ x, 0+ y);
		game.getBatch().draw(ClimatMontagneux.arbreSommetMilieu, 360+ x, 60+ y);
		game.getBatch().draw(ClimatMontagneux.arbreBasMilieu, 420+ x, 0+ y);
		game.getBatch().draw(ClimatMontagneux.arbreSommetMilieu, 420+ x, 60+ y);
		game.getBatch().draw(ClimatMontagneux.arbreBasMilieu, 480+ x, 0+ y);
		game.getBatch().draw(ClimatMontagneux.arbreSommetMilieu, 480+ x, 60+ y);
		game.getBatch().draw(ClimatMontagneux.arbreBasMilieu, 540+ x, 0+ y);
		game.getBatch().draw(ClimatMontagneux.arbreSommetMilieu, 540+ x, 60+ y);
		
	}

	public static void destroyBody() {
		// TODO Auto-generated method stub
		if ( isBosquet1Created) MainMenu.world.destroyBody(bosquet1);
		isBosquet1Created = false;
		
		if ( isBosquet2Created) MainMenu.world.destroyBody(bosquet2);
		isBosquet2Created = false;
	}

	public static void createBodyAndType(World world) {
		if ( pontCasse == false ){
			Map.setTypeDeD�cor(180/60,120/60,"Trou");
			Map.setTypeDeD�cor(180/60,180/60,"Trou");
			Map.setTypeDeD�cor(180/60,240/60,"Trou");
			Map.setTypeDeD�cor(240/60,60/60,"Trou");
			Map.setTypeDeD�cor(300/60,60/60,"Trou");
			Map.setTypeDeD�cor(360/60,60/60,"Trou");
			Map.setTypeDeD�cor(420/60,120/60,"Trou");
			Map.setTypeDeD�cor(420/60,180/60,"Trou");
			Map.setTypeDeD�cor(420/60,240/60,"Trou");
			Map.setTypeDeD�cor(240/60,240/60,"Trou");
			Map.setTypeDeD�cor(300/60,240/60,"Trou");
			Map.setTypeDeD�cor(360/60,240/60,"Trou");
		} else {
			Map.setTypeDeD�cor(240/60,300/60,"EauProfonde");
			Map.setTypeDeD�cor(180/60,120/60,"EauProfonde");
			Map.setTypeDeD�cor(180/60,180/60,"EauProfonde");
			Map.setTypeDeD�cor(180/60,240/60,"EauProfonde");
			Map.setTypeDeD�cor(240/60,60/60,"EauProfonde");
			Map.setTypeDeD�cor(300/60,60/60,"EauProfonde");
			Map.setTypeDeD�cor(360/60,60/60,"EauProfonde");
			Map.setTypeDeD�cor(420/60,120/60,"EauProfonde");
			Map.setTypeDeD�cor(420/60,180/60,"EauProfonde");
			Map.setTypeDeD�cor(420/60,240/60,"EauProfonde");
			Map.setTypeDeD�cor(240/60,240/60,"EauProfonde");
			Map.setTypeDeD�cor(300/60,240/60,"EauProfonde");
			Map.setTypeDeD�cor(360/60,240/60,"EauProfonde");
		}
		Map.setTypeDeD�cor(0/60,360/60,"EauProfonde");
		Map.setTypeDeD�cor(60/60,360/60,"EauProfonde");
		Map.setTypeDeD�cor(120/60,360/60,"EauProfonde");
		Map.setTypeDeD�cor(180/60,360/60,"EauProfonde");
		Map.setTypeDeD�cor(240/60,360/60,"EauProfonde");
		Map.setTypeDeD�cor(300/60,420/60,"EauProfonde");
		Map.setTypeDeD�cor(360/60,420/60,"EauProfonde");
		Map.setTypeDeD�cor(420/60,420/60,"EauProfonde");
		
		if ( isBosquet1Created == false ) {
			bosquet1 = ClimatMontagneux.createBody(110,220,110,400);
			isBosquet1Created = true;
		}
		if ( isBosquet2Created == false ) {
			bosquet2 = ClimatMontagneux.createBody(340,60,550,80);
			isBosquet2Created = true;
		}
		
	}

	public static void destroyType() {
		// TODO Auto-generated method stub
		
	}
}
