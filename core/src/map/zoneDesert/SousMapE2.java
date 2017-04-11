package map.zoneDesert;

import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.physics.box2d.Body;
import com.badlogic.gdx.physics.box2d.World;
import com.mygdx.game.GameMain;

import decors.ClimatMontagneux;
import map.CadrillageMap;
import scenes.MainMenu;

public class SousMapE2 extends Sprite{
	
	public static Body bosquet1 ;
	public static boolean isBosquet1Created;
	public static Body bosquet2 ;
	public static boolean isBosquet2Created;
	
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
	
	public static Body bord ;
	public static boolean isBordCreated;
	
	public static void sousMap(GameMain game, int x, int y){
		
		game.getBatch().draw(ClimatMontagneux.glace1, 0+ x, 0+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 0+ x, 60+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 0+ x, 120+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 0+ x, 180+ y);		
		game.getBatch().draw(ClimatMontagneux.glace1, 0 + x,240 + y);
		game.getBatch().draw(ClimatMontagneux.glace1, 0+ x, 300+ y);
		game.getBatch().draw(ClimatMontagneux.eauProfonde, 0+ x, 360+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéSup, 0+ x, 360+ y);
		ClimatMontagneux.eauProfondeGlacée(game,0+ x, 420+y);
		
		game.getBatch().draw(ClimatMontagneux.glace1, 60+ x, 0+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 60+ x, 60+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 60+ x, 120+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 60+ x, 180+ y);		
		game.getBatch().draw(ClimatMontagneux.glace1, 60+ x, 240+ y);	
		game.getBatch().draw(ClimatMontagneux.glace1, 60+ x, 300+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 60+ x, 360+ y);
		ClimatMontagneux.eauProfondeGlacée(game,60+ x, 420+y);
		
		game.getBatch().draw(ClimatMontagneux.glace1, 120+ x, 0+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 120+ x, 60+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 120+ x, 120+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 120+ x, 180+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 120+ x, 240+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 120+ x, 300+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 120+ x, 360+ y);
		ClimatMontagneux.eauProfondeGlacée(game,120+ x, 420+y);
		
		game.getBatch().draw(ClimatMontagneux.glace1, 180+ x, 0+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 180+ x, 60+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 180+ x, 120+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 180+ x, 180+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 180+ x, 240+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 180+ x, 300+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 180+ x, 360+ y);
		ClimatMontagneux.eauProfondeGlacée(game,180+ x, 420+y);
		
		game.getBatch().draw(ClimatMontagneux.glace1, 240+ x, 0+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 240+ x, 60+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 240+ x, 120+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 240+ x, 180+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 240+ x, 240+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 240+ x, 300+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 240+ x, 360+ y);
		ClimatMontagneux.eauProfondeGlacée(game,240+ x, 420+y);
		
		game.getBatch().draw(ClimatMontagneux.glace1, 300+ x, 0+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 300+ x, 60+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 300+ x, 120+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 300+ x, 180+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 300+ x, 240+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 300+ x, 300+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 300+ x, 360+ y);
		ClimatMontagneux.eauProfondeGlacée(game,300+ x, 420+y);
		
		game.getBatch().draw(ClimatMontagneux.glace1, 360+ x, 0+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 360+ x, 60+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 360+ x, 120+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 360+ x, 180+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 360+ x, 240+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 360+ x, 300+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 360+ x, 360+ y);
		ClimatMontagneux.eauProfondeGlacée(game,360+ x, 420+y);
		
		game.getBatch().draw(ClimatMontagneux.glace1, 420+ x, 0+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 420+ x, 60+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 420+ x, 120+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 420+ x, 180+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 420+ x, 240+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 420+ x, 300+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 420+ x, 360+ y);
		ClimatMontagneux.eauProfondeGlacée(game,420+ x, 420+y);
		
		game.getBatch().draw(ClimatMontagneux.glace1, 480+ x, 0+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 480+ x, 60+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 480+ x, 120+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 480+ x, 180+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 480+ x, 240+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 480+ x, 300+ y);
		ClimatMontagneux.eauProfondeGlacée(game,480+ x, 360+y);
		ClimatMontagneux.eauProfondeGlacée(game,480+ x, 420+y);
		
		game.getBatch().draw(ClimatMontagneux.glace1, 540+ x, 0+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 540+ x, 60+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 540+ x, 120+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 540+ x, 180+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 540+ x, 240+ y);
		ClimatMontagneux.eauProfondeGlacée(game,540+ x, 300+y);
		ClimatMontagneux.eauProfondeGlacée(game,540+ x, 360+y);
		ClimatMontagneux.eauProfondeGlacée(game,540+ x, 420+y);

		
		
		game.getBatch().draw(ClimatMontagneux.glaceFragmentéHautGauche, 60+ x, 420+ y);
		game.getBatch().draw(ClimatMontagneux.cheminGlace, 120+ x, 420+ y);
		game.getBatch().draw(ClimatMontagneux.glaceFragmentéHautDroite, 180+ x, 420+ y);
		game.getBatch().draw(ClimatMontagneux.morceauGlaceHaut, 240+ x, 420+ y);
		game.getBatch().draw(ClimatMontagneux.morceauGlaceHautDroite, 300+ x, 420+ y);
		game.getBatch().draw(ClimatMontagneux.morceauGlaceHautGauche, 360+ x, 420+ y);
		game.getBatch().draw(ClimatMontagneux.morceauGlaceHautGauche, 0+ x, 420+ y);
		game.getBatch().draw(ClimatMontagneux.morceauGlaceHaut, 420+ x, 420+ y);
		game.getBatch().draw(ClimatMontagneux.glaceFragmentéHautDroite, 480+ x, 360+ y);
		game.getBatch().draw(ClimatMontagneux.glaceFragmentéHautDroite, 540+ x, 300+ y);
		game.getBatch().draw(ClimatMontagneux.morceauGlaceHautDroite, 480+ x, 420+ y);
		game.getBatch().draw(ClimatMontagneux.morceauGlaceHautDroite, 540+ x, 360+ y);
		
		game.getBatch().draw(ClimatMontagneux.bordGlacéSup, 60+ x, 360+ y);
		game.getBatch().draw(ClimatMontagneux.glace1,120+ x, 360+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéSup, 180+ x, 360+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéSup, 240+ x, 360+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéSup, 300+ x, 360+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéSup, 360+ x, 360+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéSupDroi, 420+ x, 360+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéSupDroi, 480+ x, 300+ y);
		


		game.getBatch().draw(ClimatMontagneux.bordGlacéGau, 180+ x, 300+ y);
		game.getBatch().draw(ClimatMontagneux.herbeGlace120, 300+ x, 300+ y);
		game.getBatch().draw(ClimatMontagneux.tree, 210+ x, 300+ y);
		game.getBatch().draw(ClimatMontagneux.tree, 300+ x, 300+ y);
		game.getBatch().draw(ClimatMontagneux.tree, 420+ x, 360+ y);
		game.getBatch().draw(ClimatMontagneux.tree, 240+ x, 270+ y);
		game.getBatch().draw(ClimatMontagneux.petitePierre, 340+ x, 290+ y);
		
		game.getBatch().draw(ClimatMontagneux.bordGlacéSup, 00+ x, 240+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéDroi, 60+ x, 300+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéSup, 60+ x, 240+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéSup, 180+ x, 240+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéSup, 240+ x, 240+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéSup, 300+ x, 240+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéSup, 360+ x, 240+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéSup, 420+ x, 240+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéSup, 480+ x, 240+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéSup, 540+ x, 240+ y);
		
		game.getBatch().draw(ClimatMontagneux.bordGlacéSup, 00+ x, 180+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéSup, 60+ x, 180+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéSup,120+ x, 180+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéSup, 180+ x, 180+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéSup, 240+ x, 180+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéSup, 300+ x, 180+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéSup, 360+ x, 180+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéSupDroi, 420+ x, 180+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéDroi, 420+ x, 120+ y);
		

		game.getBatch().draw(ClimatMontagneux.herbeGlace120, 300+ x, 60+ y);
		
		game.getBatch().draw(ClimatMontagneux.arbreBasGauche, 60+ x, 30+ y);
		game.getBatch().draw(ClimatMontagneux.arbreBasMilieu,120+ x,30+ y);
		game.getBatch().draw(ClimatMontagneux.arbreBasMilieu, 180+ x,30+ y);
		game.getBatch().draw(ClimatMontagneux.arbreBasDroite, 240+ x, 30+ y);
		game.getBatch().draw(ClimatMontagneux.arbreSommetGauche, 60+ x, 90+ y);
		game.getBatch().draw(ClimatMontagneux.arbreSommetMilieu,120+ x,90+ y);
		game.getBatch().draw(ClimatMontagneux.arbreSommetMilieu, 180+ x,90+ y);
		game.getBatch().draw(ClimatMontagneux.arbreSommetDroite, 240+ x, 90+ y);
		
		game.getBatch().draw(ClimatMontagneux.bordGlacéSupGau, 00+ x, 0+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéSup, 60+ x, 0+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéSup,120+ x, 0+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéSup, 180+ x, 0+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéSup, 240+ x, 0+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéSup, 300+ x, 0+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéSup, 360+ x, 0+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéSupDroi, 420+ x, 0+ y);
		

		game.getBatch().draw(ClimatMontagneux.herbeGlace, 120+ x, 180+ y);

		
		game.getBatch().draw(ClimatMontagneux.tree, 00+ x, 0+ y);
		game.getBatch().draw(ClimatMontagneux.tree, 60+ x, 0+ y);
		game.getBatch().draw(ClimatMontagneux.tree,120+ x, 0+ y);
		game.getBatch().draw(ClimatMontagneux.tree, 180+ x, 0+ y);
		game.getBatch().draw(ClimatMontagneux.tree, 240+ x, 0+ y);
		game.getBatch().draw(ClimatMontagneux.grossePierre, 300+ x, 0+ y);
		game.getBatch().draw(ClimatMontagneux.tree, 360+ x, 0+ y);
		game.getBatch().draw(ClimatMontagneux.tree, 420+ x, 0+ y);
		
		game.getBatch().draw(ClimatMontagneux.tree, 00+ x, -60+ y);
		game.getBatch().draw(ClimatMontagneux.tree, 60+ x, -60+ y);
		game.getBatch().draw(ClimatMontagneux.tree,120+ x, -60+ y);
		game.getBatch().draw(ClimatMontagneux.tree, 180+ x, -60+ y);
		game.getBatch().draw(ClimatMontagneux.tree, 240+ x, -60+ y);
		game.getBatch().draw(ClimatMontagneux.tree, 300+ x, -60+ y);
		game.getBatch().draw(ClimatMontagneux.tree, 360+ x, -60+ y);
		game.getBatch().draw(ClimatMontagneux.tree, 420+ x, -60+ y);
		

		game.getBatch().draw(ClimatMontagneux.arbreBasGauche, 540+ x, 120+ y);
		game.getBatch().draw(ClimatMontagneux.arbreCentreGauche, 540+ x, 180+ y);
		game.getBatch().draw(ClimatMontagneux.arbreSommetGauche, 540+ x, 240+ y);
		
		game.getBatch().draw(ClimatMontagneux.tree, 570+ x, 90+ y);
		
		game.getBatch().draw(ClimatMontagneux.arbreCentreGauche, 540+ x, 0+ y);
		game.getBatch().draw(ClimatMontagneux.arbreSommetGauche, 540+ x, 60+ y);
		
	}

	public static void destroyBody() {
		// TODO Auto-generated method stub
		if ( isBosquet1Created) MainMenu.world.destroyBody(bosquet1);
		isBosquet1Created = false;
		
		if ( isBosquet2Created) MainMenu.world.destroyBody(bosquet2);
		isBosquet2Created = false;
		
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
		
		if ( isBordCreated) MainMenu.world.destroyBody(bord);
		isBordCreated = false;
	}

	public static void createBodyAndType(World world) {
		// TODO Auto-generated method stub
		CadrillageMap.setTypeDeDécor(0, 7, "EauProfonde");
		CadrillageMap.setTypeDeDécor(5, 7, "EauProfonde");
		CadrillageMap.setTypeDeDécor(6, 7, "EauProfonde");
		CadrillageMap.setTypeDeDécor(8, 7, "EauProfonde");
		CadrillageMap.setTypeDeDécor(9, 7, "EauProfonde");
		CadrillageMap.setTypeDeDécor(9, 6, "EauProfonde");
		
		if ( isBosquet1Created == false ) {
			bosquet1 = ClimatMontagneux.createBody(230,35,460,60);
			isBosquet1Created = true;
		}
		if ( isBosquet2Created == false ) {
			bosquet2 = ClimatMontagneux.createBody(550,150,50,300);
			isBosquet2Created = true;
		}
		
		if ( isCote1Created == false ) {
			cote1 = ClimatMontagneux.createBody(235,225,450,1);
			isCote1Created = true;
		}
		if ( isCote2Created == false ) {
			cote2 = ClimatMontagneux.createBody(375,285,410,1);
			isCote2Created = true;
		}
		if ( isCote3Created == false ) {
			cote3 = ClimatMontagneux.createBody(50,285,110,1);
			isCote3Created = true;
		}
		if ( isCote4Created == false ) {
			cote4 = ClimatMontagneux.createBody(110,315,1,60);
			isCote4Created = true;
		}
		if ( isCote5Created == false ) {
			cote5 = ClimatMontagneux.createBody(170,315,1,60);
			isCote5Created = true;
		}
		if ( isCote6Created == false ) {
			cote6 = ClimatMontagneux.createBody(460,175,1,100);
			isCote6Created = true;
		}
		
		if ( isBordCreated == false ) {
			bord = ClimatMontagneux.createBody(560,240,1,480);
			isBordCreated = true;
		}
	}

	public static void destroyType() {
		// TODO Auto-generated method stub
		
	}
}
