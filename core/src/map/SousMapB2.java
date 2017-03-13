package map;

import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.physics.box2d.Body;
import com.badlogic.gdx.physics.box2d.World;
import com.mygdx.game.GameMain;

import characters.Bats;
import characters.Pnj;
import decors.ClimatMontagneux;
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
	
	public static Bats monstre1;
	public static Bats monstre2;
	public static boolean m1EstCrée = false ;
	public static boolean m2EstCrée = false ;
	
	public static boolean monstresPrésent = true;
	public static Pnj[] monstres = new Pnj[2];
	
	public static void sousMapB2(GameMain game, int x, int y){
		
		game.getBatch().draw(ClimatMontagneux.glace1, 0+ x, 0+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 0+ x, 60+ y);
		game.getBatch().draw(ClimatMontagneux.angleBasGauche, 0 + x, 0 + y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéInfGau, 0 + x, 60 + y);
		game.getBatch().draw(ClimatMontagneux.glace1, 0+ x, 120+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 0+ x, 180+ y);		
		game.getBatch().draw(ClimatMontagneux.glace1, 0 + x,240 + y);
		game.getBatch().draw(ClimatMontagneux.glace1, 0+ x, 300+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 0+ x, 360+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéGau, 0+ x, 360+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 0+ x, 420+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéSupGau, 0+ x, 420+ y);

		
		game.getBatch().draw(ClimatMontagneux.glace1, 60+ x, 0+ y);
		game.getBatch().draw(ClimatMontagneux.bordMerGlacéInfGau, 60+ x, 0+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 60+ x, 60+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 60+ x, 120+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 60+ x, 180+ y);		
		game.getBatch().draw(ClimatMontagneux.glace1, 60+ x, 240+ y);	
		game.getBatch().draw(ClimatMontagneux.glace1, 60+ x, 300+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 60+ x, 360+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 60+ x, 420+ y);
		
		game.getBatch().draw(ClimatMontagneux.glace1, 120+ x, 0+ y);
		game.getBatch().draw(ClimatMontagneux.bordMerGlacéInf, 120+ x, 0+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 120+ x, 60+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 120+ x, 120+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 120+ x, 180+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 120+ x, 240+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 120+ x, 300+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 120+ x, 360+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 120+ x, 420+ y);
		
		game.getBatch().draw(ClimatMontagneux.glace1, 180+ x, 0+ y);
		game.getBatch().draw(ClimatMontagneux.bordMerGlacéInf, 180+ x, 0+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 180+ x, 60+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 180+ x, 120+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 180+ x, 180+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 180+ x, 240+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 180+ x, 300+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 180+ x, 360+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 180+ x, 420+ y);
		
		game.getBatch().draw(ClimatMontagneux.glace1, 240+ x, 0+ y);
		game.getBatch().draw(ClimatMontagneux.bordMerGlacéInf, 240+ x, 0+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 240+ x, 60+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 240+ x, 120+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 240+ x, 180+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 240+ x, 240+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 240+ x, 300+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 240+ x, 360+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 240+ x, 420+ y);
		
		game.getBatch().draw(ClimatMontagneux.glace1, 300+ x, 0+ y);
		game.getBatch().draw(ClimatMontagneux.bordMerGlacéInf, 300+ x, 0+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 300+ x, 60+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 300+ x, 120+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 300+ x, 180+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 300+ x, 240+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 300+ x, 300+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 300+ x, 360+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 300+ x, 420+ y);
		
		game.getBatch().draw(ClimatMontagneux.glace1, 360+ x, 0+ y);
		game.getBatch().draw(ClimatMontagneux.bordMerGlacéInfDroi, 360+ x, 0+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 360+ x, 60+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 360+ x, 120+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 360+ x, 180+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 360+ x, 240+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 360+ x, 300+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 360+ x, 360+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 360+ x, 420+ y);
		
		ClimatMontagneux.eauProfondeGlacée(game,420+ x, 0+y);
		game.getBatch().draw(ClimatMontagneux.glace1, 420+ x, 60+ y);
		game.getBatch().draw(ClimatMontagneux.bordMerGlacéInf, 420+ x, 60+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 420+ x, 120+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 420+ x, 180+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 420+ x, 240+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 420+ x, 300+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 420+ x, 360+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 420+ x, 420+ y);
		
		game.getBatch().draw(ClimatMontagneux.glace1, 480+ x, 0+ y);
		game.getBatch().draw(ClimatMontagneux.bordMerGlacéGau, 480+ x, 0+ y);
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
		
		
//		==================================================================
//				Placement des dessins des monstres
//		==================================================================

		if ( m1EstCrée && monstre1.isAlive() ) { 
			game.getBatch().draw(monstre1,monstre1.getX(), monstre1.getY());
		} else if ( m1EstCrée == false){
			game.getBatch().draw(Bats.batBas1, 200 + x +30, 400 + y +100);
		}
		if ( m2EstCrée && monstre2.isAlive() ) {
			game.getBatch().draw(monstre2.getTexture(), monstre2.getX(), monstre2.getY());
		}

		
		
	}
	
	public static void createBodyAndType(World world){
		Map.setTypeDeDécor(0,0,"EauProfonde");
		
		Map.setTypeDeDécor(6,0,"HerbesHautes");
		Map.setTypeDeDécor(1,3,"HerbesHautes");
		Map.setTypeDeDécor(2,3,"HerbesHautes");
		Map.setTypeDeDécor(4,1,"HerbesHautes");
		Map.setTypeDeDécor(5,2,"HerbesHautes");
		if ( Map.décorChangé[6][0] == true ) isBuisson1Cut = true;
		if ( Map.décorChangé[1][3] == true ) isBuisson2Cut = true;
		if ( Map.décorChangé[2][3] == true ) isBuisson3Cut = true;
		if ( Map.décorChangé[4][1] == true ) isBuisson4Cut = true;
		if ( Map.décorChangé[5][2] == true ) isBuisson5Cut = true;
		Map.setTypeDeDécor(480/60,120/60,"HerbesHautes");
		Map.setTypeDeDécor(480/60,180/60,"HerbesHautes");
		Map.setTypeDeDécor(540/60,180/60,"HerbesHautes");
		Map.setTypeDeDécor(300/60,360/60,"HerbesHautes");
		Map.setTypeDeDécor(300/60,300/60,"HerbesHautes");
		if ( Map.décorChangé[8][2] == true ) isBuisson6Cut = true;
		if ( Map.décorChangé[8][3] == true ) isBuisson7Cut = true;
		if ( Map.décorChangé[9][3] == true ) isBuisson8Cut = true;
		if ( Map.décorChangé[5][6] == true ) isBuisson9Cut = true;
		if ( Map.décorChangé[5][5] == true ) isBuisson10Cut = true;
		
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
		
//		========================================================================================
//			Création des corps des montres
//	========================================================================================
	
		
		
		if ( m2EstCrée == false ) {
			monstre2 = new Bats(world ,Bats.batDroite1, 20 , 10 , 4 , 340 , 200 , "droite") ;
			monstres[1] = monstre2;
			m2EstCrée = true;
		}
		else {
			monstre2.déplacementAléa();
			monstre2.représentationBat();
			monstre2.updateBody();
		}
		
		if ( m1EstCrée == false ) {
			monstre1 = new Bats(world ,Bats.batBas1, 20 , 10 , 4 , 200 , 400 , "bas") ;
			monstres[0] = monstre1;
			m1EstCrée = true;
		}
		else {
			monstre1.déplacementAléa();
			monstre1.représentationBat();
			monstre1.updateBody();
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
		
//		destruction monstres
		if ( m1EstCrée )MainMenu.world.destroyBody(monstre1.getBody());
		if ( m2EstCrée )MainMenu.world.destroyBody(monstre2.getBody());
		m1EstCrée = false;
		m2EstCrée = false;
		
	}

	
}
