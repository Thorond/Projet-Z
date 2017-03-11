package map;

import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.physics.box2d.Body;
import com.badlogic.gdx.physics.box2d.World;
import com.mygdx.game.GameMain;

import d�cors.ClimatMontagneux;
import scenes.MainMenu;

public class SousMapB2 extends Sprite {
	
	public static Body arbre1;
	public static boolean isArbre1Created;
	public static Body bosquet1 ;
	public static boolean isBosquet1Created;
	public static Body bosquet2 ;
	public static boolean isBosquet2Created;
	
	public static boolean isBuisson1Cut = false;
	public static boolean isBuisson2Cut = false;
	public static boolean isBuisson3Cut = false;
	public static boolean isBuisson4Cut = false;
	public static boolean isBuisson5Cut = false;
	public static boolean isBuisson6Cut = false;
	public static boolean isBuisson7Cut = false;
	public static boolean isBuisson8Cut = false;
	public static boolean isBuisson9Cut = false;
	public static boolean isBuisson10Cut = false;
	
	public static void sousMapB2(GameMain game, int x, int y){
		
		game.getBatch().draw(ClimatMontagneux.glace1, 0+ x, 0+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 0+ x, 60+ y);
		game.getBatch().draw(ClimatMontagneux.angleBasGauche, 0 + x, 0 + y);
		game.getBatch().draw(ClimatMontagneux.bordGlac�InfGau, 0 + x, 60 + y);
		game.getBatch().draw(ClimatMontagneux.glace1, 0+ x, 120+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 0+ x, 180+ y);		
		game.getBatch().draw(ClimatMontagneux.glace1, 0 + x,240 + y);
		game.getBatch().draw(ClimatMontagneux.glace1, 0+ x, 300+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 0+ x, 360+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlac�Gau, 0+ x, 360+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 0+ x, 420+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlac�SupGau, 0+ x, 420+ y);

		
		game.getBatch().draw(ClimatMontagneux.glace1, 60+ x, 0+ y);
		game.getBatch().draw(ClimatMontagneux.bordMerGlac�InfGau, 60+ x, 0+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 60+ x, 60+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 60+ x, 120+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 60+ x, 180+ y);		
		game.getBatch().draw(ClimatMontagneux.glace1, 60+ x, 240+ y);	
		game.getBatch().draw(ClimatMontagneux.glace1, 60+ x, 300+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 60+ x, 360+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 60+ x, 420+ y);
		
		game.getBatch().draw(ClimatMontagneux.glace1, 120+ x, 0+ y);
		game.getBatch().draw(ClimatMontagneux.bordMerGlac�Inf, 120+ x, 0+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 120+ x, 60+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 120+ x, 120+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 120+ x, 180+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 120+ x, 240+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 120+ x, 300+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 120+ x, 360+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 120+ x, 420+ y);
		
		game.getBatch().draw(ClimatMontagneux.glace1, 180+ x, 0+ y);
		game.getBatch().draw(ClimatMontagneux.bordMerGlac�Inf, 180+ x, 0+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 180+ x, 60+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 180+ x, 120+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 180+ x, 180+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 180+ x, 240+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 180+ x, 300+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 180+ x, 360+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 180+ x, 420+ y);
		
		game.getBatch().draw(ClimatMontagneux.glace1, 240+ x, 0+ y);
		game.getBatch().draw(ClimatMontagneux.bordMerGlac�Inf, 240+ x, 0+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 240+ x, 60+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 240+ x, 120+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 240+ x, 180+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 240+ x, 240+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 240+ x, 300+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 240+ x, 360+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 240+ x, 420+ y);
		
		game.getBatch().draw(ClimatMontagneux.glace1, 300+ x, 0+ y);
		game.getBatch().draw(ClimatMontagneux.bordMerGlac�Inf, 300+ x, 0+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 300+ x, 60+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 300+ x, 120+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 300+ x, 180+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 300+ x, 240+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 300+ x, 300+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 300+ x, 360+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 300+ x, 420+ y);
		
		game.getBatch().draw(ClimatMontagneux.glace1, 360+ x, 0+ y);
		game.getBatch().draw(ClimatMontagneux.bordMerGlac�InfDroi, 360+ x, 0+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 360+ x, 60+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 360+ x, 120+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 360+ x, 180+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 360+ x, 240+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 360+ x, 300+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 360+ x, 360+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 360+ x, 420+ y);
		
		ClimatMontagneux.eauProfondeGlac�e(game,420+ x, 0+y);
		game.getBatch().draw(ClimatMontagneux.glace1, 420+ x, 60+ y);
		game.getBatch().draw(ClimatMontagneux.bordMerGlac�Inf, 420+ x, 60+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 420+ x, 120+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 420+ x, 180+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 420+ x, 240+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 420+ x, 300+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 420+ x, 360+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 420+ x, 420+ y);
		
		game.getBatch().draw(ClimatMontagneux.glace1, 480+ x, 0+ y);
		game.getBatch().draw(ClimatMontagneux.bordMerGlac�Gau, 480+ x, 0+ y);
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
		
//		petitBosquet
		game.getBatch().draw(ClimatMontagneux.tree, 20+ x, 380+ y);
		
		game.getBatch().draw(ClimatMontagneux.arbreBasGauche, 60+ x, 0+ y);
		game.getBatch().draw(ClimatMontagneux.arbreCentreGauche, 60+ x, 60+ y);
		game.getBatch().draw(ClimatMontagneux.arbreSommetGauche, 60+ x, 120+ y);
		game.getBatch().draw(ClimatMontagneux.arbreBasMilieu, 120+ x,0+ y);
		game.getBatch().draw(ClimatMontagneux.arbreCentreMilieu, 120+ x, 60+ y);
		game.getBatch().draw(ClimatMontagneux.arbreSommetMilieu, 120+ x, 120+ y);
		game.getBatch().draw(ClimatMontagneux.arbreBasDroite, 180+ x, 0+ y);
		game.getBatch().draw(ClimatMontagneux.arbreCentreDroite, 180+ x, 60+ y);
		game.getBatch().draw(ClimatMontagneux.arbreSommetDroite, 180+ x, 120+ y);
		
		game.getBatch().draw(ClimatMontagneux.arbreBasGauche, 360+ x, 300+ y);
		game.getBatch().draw(ClimatMontagneux.arbreCentreGauche, 360+ x, 360+ y);
		game.getBatch().draw(ClimatMontagneux.arbreSommetGauche, 360+ x, 420+ y);
		game.getBatch().draw(ClimatMontagneux.arbreBasMilieu, 420+ x,300+ y);
		game.getBatch().draw(ClimatMontagneux.arbreCentreMilieu, 420+ x, 360+ y);
		game.getBatch().draw(ClimatMontagneux.arbreSommetMilieu, 420+ x, 420+ y);
		game.getBatch().draw(ClimatMontagneux.arbreBasMilieu, 480+ x, 300+ y);
		game.getBatch().draw(ClimatMontagneux.arbreCentreMilieu, 480+ x, 360+ y);
		game.getBatch().draw(ClimatMontagneux.arbreSommetMilieu, 480+ x, 420+ y);
		game.getBatch().draw(ClimatMontagneux.arbreBasMilieu, 540+ x, 300+ y);
		game.getBatch().draw(ClimatMontagneux.arbreCentreMilieu, 540+ x, 360+ y);
		game.getBatch().draw(ClimatMontagneux.arbreSommetMilieu, 540+ x, 420+ y);
		
		ClimatMontagneux.buisson(isBuisson1Cut,game, 360+x, 0+y);
		ClimatMontagneux.buisson(isBuisson2Cut,game, 60+x, 180+y);
		ClimatMontagneux.buisson(isBuisson3Cut,game, 120+x, 180+y);
		ClimatMontagneux.buisson(isBuisson4Cut,game, 240+x, 60+y);
		ClimatMontagneux.buisson(isBuisson5Cut,game, 300+x, 120+y);
		ClimatMontagneux.buisson(isBuisson6Cut,game, 480+x, 120+y);
		ClimatMontagneux.buisson(isBuisson7Cut,game, 480+x, 180+y);
		ClimatMontagneux.buisson(isBuisson8Cut,game, 540+x, 180+y);
		ClimatMontagneux.buisson(isBuisson9Cut,game, 300+x, 360+y);
		ClimatMontagneux.buisson(isBuisson10Cut,game, 300+x, 300+y);
		
	}
	
	public static void createBodyAndType(World world){
		Map.setTypeDeD�cor(0,0,"EauProfonde");
		
		Map.setTypeDeD�cor(6,0,"HerbesHautes");
		Map.setTypeDeD�cor(1,3,"HerbesHautes");
		Map.setTypeDeD�cor(2,3,"HerbesHautes");
		Map.setTypeDeD�cor(4,1,"HerbesHautes");
		Map.setTypeDeD�cor(5,2,"HerbesHautes");
		if ( Map.d�corChang�[6][0] == true ) isBuisson1Cut = true;
		if ( Map.d�corChang�[1][3] == true ) isBuisson2Cut = true;
		if ( Map.d�corChang�[2][3] == true ) isBuisson3Cut = true;
		if ( Map.d�corChang�[4][1] == true ) isBuisson4Cut = true;
		if ( Map.d�corChang�[5][2] == true ) isBuisson5Cut = true;
		Map.setTypeDeD�cor(480/60,120/60,"HerbesHautes");
		Map.setTypeDeD�cor(480/60,180/60,"HerbesHautes");
		Map.setTypeDeD�cor(540/60,180/60,"HerbesHautes");
		Map.setTypeDeD�cor(300/60,360/60,"HerbesHautes");
		Map.setTypeDeD�cor(300/60,300/60,"HerbesHautes");
		if ( Map.d�corChang�[8][2] == true ) isBuisson6Cut = true;
		if ( Map.d�corChang�[8][3] == true ) isBuisson7Cut = true;
		if ( Map.d�corChang�[9][3] == true ) isBuisson8Cut = true;
		if ( Map.d�corChang�[5][6] == true ) isBuisson9Cut = true;
		if ( Map.d�corChang�[5][5] == true ) isBuisson10Cut = true;
		
		if ( isArbre1Created == false ) {
			arbre1 = ClimatMontagneux.createBodyPerso("arbre", "static",20,380);
			isArbre1Created = true;
		}
		
		if ( isBosquet1Created == false ) {
			bosquet1 = ClimatMontagneux.createBody(130,80,150,150);
			isBosquet1Created = true;
		}
		if ( isBosquet2Created == false ) {
			bosquet2 = ClimatMontagneux.createBody(470,370,230,150);
			isBosquet2Created = true;
		}
		
	}
	
	public static void destroyType(){
		isBuisson1Cut = false;
		isBuisson2Cut = false;
		isBuisson3Cut = false;
		isBuisson4Cut = false;
		isBuisson5Cut = false;
		isBuisson6Cut = false;
		isBuisson7Cut = false;
		isBuisson8Cut = false;
		isBuisson9Cut = false;
		isBuisson10Cut = false;
	}
	
	public static void destroyBody(){
		if ( isArbre1Created) MainMenu.world.destroyBody(arbre1);
		isArbre1Created = false;
		
		if ( isBosquet1Created) MainMenu.world.destroyBody(bosquet1);
		isBosquet1Created = false;
		
		if ( isBosquet2Created) MainMenu.world.destroyBody(bosquet2);
		isBosquet2Created = false;

	}

	
}
