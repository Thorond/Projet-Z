package map;

import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.physics.box2d.Body;
import com.badlogic.gdx.physics.box2d.World;
import com.mygdx.game.GameMain;

import d�cors.ClimatMontagneux;
import scenes.MainMenu;

public class SousMapC1 extends Sprite {
	
	public static Body murAvantGauche ;
	public static boolean isMurAvantGaucheCreated;
	public static Body murAvantDroite ;
	public static boolean isMurAvantDroiteCreated;
	public static Body murArriere ;
	public static boolean isMurArriereCreated;
	public static Body murGauche ;
	public static boolean isMurGaucheCreated;
	public static Body murDroite ;
	public static boolean isMurDroiteCreated;
	
	public static void sousMapC1(GameMain game, int x, int y){
		
		ClimatMontagneux.eauProfondeGlac�e(game,0+ x, 0+y);
		ClimatMontagneux.eauProfondeGlac�e(game,0+ x, 60+y);
		ClimatMontagneux.eauProfondeGlac�e(game,0+ x, 120+y);
		ClimatMontagneux.eauProfondeGlac�e(game,0+ x, 180+y);
		ClimatMontagneux.eauProfondeGlac�e(game,0+ x, 240+y);
		ClimatMontagneux.eauProfondeGlac�e(game,0+ x, 300+y);
		ClimatMontagneux.eauProfondeGlac�e(game,0+ x, 360+y);
		ClimatMontagneux.eauProfondeGlac�e(game,0+ x, 420+y);
		
		game.getBatch().draw(ClimatMontagneux.glace1, 60+ x, 0+ y);
		game.getBatch().draw(ClimatMontagneux.piedGlac�Sup, 60+ x, 0+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 60+ x, 60+ y);
		game.getBatch().draw(ClimatMontagneux.murEauGlac�Gauche, 60+ x, 60+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 60+ x, 120+ y);
		game.getBatch().draw(ClimatMontagneux.murEauGlac�Gauche, 60+ x, 120+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 60+ x, 180+ y);	
		game.getBatch().draw(ClimatMontagneux.bordMerGlac�Gau, 60+ x, 180+ y);	
		game.getBatch().draw(ClimatMontagneux.glace1, 60+ x, 240+ y);
		game.getBatch().draw(ClimatMontagneux.bordMerGlac�Gau, 60+ x, 240+ y);	
		game.getBatch().draw(ClimatMontagneux.glace1, 60+ x, 300+ y);
		game.getBatch().draw(ClimatMontagneux.bordMerGlac�Gau, 60+ x, 300+ y);	
		game.getBatch().draw(ClimatMontagneux.glace1, 60+ x, 360+ y);
		game.getBatch().draw(ClimatMontagneux.bordMerGlac�SupGau, 60+ x, 360+ y);	
		ClimatMontagneux.eauProfondeGlac�e(game,60+ x, 420+y);
		
		game.getBatch().draw(ClimatMontagneux.glace1, 120+ x, 0+ y);
		game.getBatch().draw(ClimatMontagneux.piedGlac�Sup, 120+ x, 0+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 120+ x, 60+ y);
		game.getBatch().draw(ClimatMontagneux.murGlac�Centre, 120+ x, 60+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 120+ x, 120+ y);
		game.getBatch().draw(ClimatMontagneux.murGlac�Centre, 120+ x, 120+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 120+ x, 180+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 120+ x, 240+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 120+ x, 300+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 120+ x, 360+ y);
		game.getBatch().draw(ClimatMontagneux.bordMerGlac�Sup, 120+ x, 360+ y);
		ClimatMontagneux.eauProfondeGlac�e(game,120+ x, 420+y);
		
		game.getBatch().draw(ClimatMontagneux.glace1, 180+ x, 0+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 180+ x, 60+ y);
		game.getBatch().draw(ClimatMontagneux.escalierGlac�, 180+ x, 60+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 180+ x, 120+ y);
		game.getBatch().draw(ClimatMontagneux.escalierGlac�, 180+ x, 120+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 180+ x, 180+ y);
		game.getBatch().draw(ClimatMontagneux.escalierHaut, 180+ x, 180+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 180+ x, 240+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 180+ x, 300+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 180+ x, 360+ y);
		game.getBatch().draw(ClimatMontagneux.bordMerGlac�Sup, 180+ x, 360+ y);
		ClimatMontagneux.eauProfondeGlac�e(game,180+ x, 420+y);
		
		game.getBatch().draw(ClimatMontagneux.glace1, 240+ x, 0+ y);
		game.getBatch().draw(ClimatMontagneux.piedGlac�Sup, 240+ x, 0+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 240+ x, 60+ y);
		game.getBatch().draw(ClimatMontagneux.murGlac�Centre, 240+ x, 60+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 240+ x, 120+ y);
		game.getBatch().draw(ClimatMontagneux.murGlac�Centre, 240+ x, 120+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 240+ x, 180+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 240+ x, 240+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 240+ x, 300+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 240+ x, 360+ y);
		game.getBatch().draw(ClimatMontagneux.bordMerGlac�Sup, 240+ x, 360+ y);
		ClimatMontagneux.eauProfondeGlac�e(game,240+ x, 420+y);
		
		game.getBatch().draw(ClimatMontagneux.glace1, 300+ x, 0+ y);
		game.getBatch().draw(ClimatMontagneux.piedGlac�Sup, 300+ x, 0+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 300+ x, 60+ y);
		game.getBatch().draw(ClimatMontagneux.murGlac�Centre, 300+ x, 60+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 300+ x, 120+ y);
		game.getBatch().draw(ClimatMontagneux.murGlac�Centre, 300+ x, 120+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 300+ x, 180+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 300+ x, 240+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 300+ x, 300+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 300+ x, 360+ y);
		game.getBatch().draw(ClimatMontagneux.bordMerGlac�Sup, 300+ x, 360+ y);
		ClimatMontagneux.eauProfondeGlac�e(game,300+ x, 420+y);
		
		game.getBatch().draw(ClimatMontagneux.glace1, 360+ x, 0+ y);
		game.getBatch().draw(ClimatMontagneux.piedGlac�Sup, 360+ x, 0+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 360+ x, 60+ y);
		game.getBatch().draw(ClimatMontagneux.murGlac�Centre,360+ x, 60+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 360+ x, 120+ y);
		game.getBatch().draw(ClimatMontagneux.murGlac�Centre, 360+ x, 120+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 360+ x, 180+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 360+ x, 240+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 360+ x, 300+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 360+ x, 360+ y);
		game.getBatch().draw(ClimatMontagneux.bordMerGlac�Sup, 360+ x, 360+ y);
		ClimatMontagneux.eauProfondeGlac�e(game,360+ x, 420+y);
		
		game.getBatch().draw(ClimatMontagneux.glace1, 420+ x, 0+ y);
		game.getBatch().draw(ClimatMontagneux.piedGlac�Sup, 420+ x, 0+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 420+ x, 60+ y);
		game.getBatch().draw(ClimatMontagneux.murGlac�Droite, 420+ x, 60+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 420+ x, 120+ y);
		game.getBatch().draw(ClimatMontagneux.murGlac�Droite, 420+ x, 120+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 420+ x, 180+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlac�Droi, 420+ x, 180+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 420+ x, 240+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlac�Droi, 420+ x, 240+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 420+ x, 300+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlac�Droi, 420+ x, 300+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 420+ x, 360+ y);
		game.getBatch().draw(ClimatMontagneux.bordMerGlac�SupDroi, 420+ x, 360+ y);
		ClimatMontagneux.eauProfondeGlac�e(game,420+ x, 420+y);
		
		game.getBatch().draw(ClimatMontagneux.glace1, 480+ x, 0+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 480+ x, 60+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 480+ x, 120+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 480+ x, 180+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 480+ x, 240+ y);
		game.getBatch().draw(ClimatMontagneux.bordMerGlac�Sup, 480+ x, 240+ y);
		ClimatMontagneux.eauProfondeGlac�e(game,480+ x, 300+y);
		ClimatMontagneux.eauProfondeGlac�e(game,480+ x, 360+y);
		ClimatMontagneux.eauProfondeGlac�e(game,480+ x, 420+y);
		
		game.getBatch().draw(ClimatMontagneux.glace1, 540+ x, 0+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 540+ x, 60+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 540+ x, 120+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 540+ x, 180+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 540+ x, 240+ y);
		game.getBatch().draw(ClimatMontagneux.bordMerGlac�Sup, 540+ x, 240+ y);
		ClimatMontagneux.eauProfondeGlac�e(game,540+ x, 300+y);
		ClimatMontagneux.eauProfondeGlac�e(game,540+ x, 360+y);
		ClimatMontagneux.eauProfondeGlac�e(game,540+ x, 420+y);
		
//		igloo
		
		game.getBatch().draw(ClimatMontagneux.igloo, 180+ x, 240+ y);
		
		
	
	}
	
	public static void createBodyAndType(World world){
		Map.setTypeDeD�cor(0, 0, "EauProfonde");
		Map.setTypeDeD�cor(480/60, 5, "EauProfonde");
		Map.setTypeDeD�cor(9, 5, "EauProfonde");
		
		if ( isMurAvantGaucheCreated == false ) {
			murAvantGauche = ClimatMontagneux.createBody(60,100,180,100);
			isMurAvantGaucheCreated = true;
		}
		if ( isMurAvantDroiteCreated == false ) {
			murAvantDroite = ClimatMontagneux.createBody(340,100,240,100);
			isMurAvantDroiteCreated = true;
		}
		if ( isMurArriereCreated == false ) {
			murArriere = ClimatMontagneux.createBody(280,420,500,5);
			isMurArriereCreated = true;
		}
		if ( isMurGaucheCreated == false ) {
			murGauche = ClimatMontagneux.createBody(60,280,1,210);
			isMurGaucheCreated = true;
		}
		if ( isMurDroiteCreated == false ) {
			murDroite = ClimatMontagneux.createBody(460,280,1,210);
			isMurDroiteCreated = true;
		}
		
		
	}
	
	public static void destroyBody(){
		if ( isMurAvantGaucheCreated ) MainMenu.world.destroyBody(murAvantGauche);
		isMurAvantGaucheCreated = false;
		if ( isMurAvantDroiteCreated ) MainMenu.world.destroyBody(murAvantDroite);
		isMurAvantDroiteCreated = false;
		if ( isMurArriereCreated ) MainMenu.world.destroyBody(murArriere);
		isMurArriereCreated = false;
		if ( isMurGaucheCreated ) MainMenu.world.destroyBody(murGauche);
		isMurGaucheCreated = false;
		if ( isMurDroiteCreated ) MainMenu.world.destroyBody(murDroite);
		isMurDroiteCreated = false;
	}

}
