package map.zoneGlace;

import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.physics.box2d.Body;
import com.badlogic.gdx.physics.box2d.World;
import com.mygdx.game.GameMain;

import decors.ClimatMontagneux;
import items.CoeurDeVie;
import map.CadrillageMap;
import scenes.MainMenu;

public class SousMapF4 extends Sprite{

	public static boolean isReceptaclePris = false; // à sauvegarder
	
	public static Body cote1 ;
	public static boolean isCote1Created;
	public static Body cote2 ;
	public static boolean isCote2Created;

	public static Body arbre1;
	public static boolean isarbre1Created;
	public static Body arbre2;
	public static boolean isarbre2Created;
	public static Body arbre3;
	public static boolean isarbre3Created;
	public static Body arbre4;
	public static boolean isarbre4Created;
	public static Body arbre5;
	public static boolean isarbre5Created;
	public static Body arbre6;
	public static boolean isarbre6Created;
	public static Body arbre7;
	public static boolean isarbre7Created;
	public static Body arbre8;
	public static boolean isarbre8Created;

	public static Body petitePierre1;
	public static boolean isPetitePierre1Created;
	public static boolean isPetitePierre1Déplacé = false;
	public static Body petitePierre2;
	public static boolean isPetitePierre2Created;
	public static boolean isPetitePierre2Déplacé = false;

	public static Body bosquet1 ;
	public static boolean isBosquet1Created;
	public static Body bosquet2 ;
	public static boolean isBosquet2Created;
	public static Body bosquet3 ;
	public static boolean isBosquet3Created;
	
	public static void sousMap(GameMain game, int x, int y){
		
		ClimatMontagneux.eauProfonde(game,0+ x, 0+y);
		ClimatMontagneux.eauProfonde(game,0+ x, 60+y);
		ClimatMontagneux.eauProfonde(game,0+ x, 120+y);
		ClimatMontagneux.eauProfonde(game,0+ x, 180+y);	
		game.getBatch().draw(ClimatMontagneux.glace1, 0 + x,240 + y);
		game.getBatch().draw(ClimatMontagneux.glace1, 0+ x, 300+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 0+ x, 360+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 0+ x, 420+ y);
		
		game.getBatch().draw(ClimatMontagneux.glace1, 60+ x, 0+ y);
		ClimatMontagneux.eauProfonde(game,60+ x, 60+y);
		ClimatMontagneux.eauProfonde(game,60+ x, 120+y);
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
		
		game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 0+ x, 420+ y);
		game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 60+ x, 420+ y);
		game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 120+ x, 420+ y);
		game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 180+ x, 420+ y);
		game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 240+ x, 420+ y);
		game.getBatch().draw(ClimatMontagneux.escalierGlacé, 300+ x, 420+ y);
		game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 360+ x, 420+ y);
		game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 420+ x, 420+ y);
		game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 480+ x, 420+ y);
		game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 540+ x, 420+ y);
		
		game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 0+ x, 360+ y);
		game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 60+ x, 360+ y);
		game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 120+ x, 360+ y);
		game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 180+ x, 360+ y);
		game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 240+ x, 360+ y);
		game.getBatch().draw(ClimatMontagneux.escalierGlacé, 300+ x, 360+ y);
		game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 360+ x, 360+ y);
		game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 420+ x, 360+ y);
		game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 480+ x, 360+ y);
		game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 540+ x, 360+ y);
		
		game.getBatch().draw(ClimatMontagneux.piedCassé1Sup, 0+ x, 300+ y);
		game.getBatch().draw(ClimatMontagneux.piedGlacéSup, 60+ x, 300+ y);
		game.getBatch().draw(ClimatMontagneux.piedGlacéSup, 120+ x, 300+ y);
		game.getBatch().draw(ClimatMontagneux.piedCassé1Sup, 180+ x, 300+ y);
		game.getBatch().draw(ClimatMontagneux.piedGlacéSup, 240+ x, 300+ y);
		game.getBatch().draw(ClimatMontagneux.piedCassé2Sup, 360+ x, 300+ y);
		game.getBatch().draw(ClimatMontagneux.piedCassé1Sup, 420+ x, 300+ y);
		game.getBatch().draw(ClimatMontagneux.piedGlacéSup, 480+ x, 300+ y);
		game.getBatch().draw(ClimatMontagneux.piedGlacéSup, 540+ x, 300+ y);
		

		game.getBatch().draw(ClimatMontagneux.bordGlacéInf, 0+ x, 240+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéInfGau, 60+ x, 180+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéGau, 120+ x, 120+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéGau, 120+ x, 60+ y);
		game.getBatch().draw(ClimatMontagneux.cheminGlaceHori, 60+ x, 0+ y);
		
		game.getBatch().draw(ClimatMontagneux.bordGlacéInf, 120+ x, 0+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéInf, 180+ x, 0+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéInf, 240+ x, 0+ y);
		

		game.getBatch().draw(ClimatMontagneux.planteGelé, 60+ x, 300+ y);
		game.getBatch().draw(ClimatMontagneux.planteGelé, 120+ x, 240+ y);
		game.getBatch().draw(ClimatMontagneux.planteGelé, 120+ x, 120+ y);
		game.getBatch().draw(ClimatMontagneux.planteGelé, 180+ x, 240+ y);
		game.getBatch().draw(ClimatMontagneux.planteGelé, 180+ x, 180+ y);
		game.getBatch().draw(ClimatMontagneux.planteGelé, 240+ x, 240+ y);
		game.getBatch().draw(ClimatMontagneux.planteGelé, 240+ x, 180+ y);
		game.getBatch().draw(ClimatMontagneux.planteGelé, 360+ x, 180+ y);

		ClimatMontagneux.petitePierre(isPetitePierre1Déplacé,game, 420+x, 180+y);
		ClimatMontagneux.petitePierre(isPetitePierre2Déplacé,game, 360+x, 300+y);

		game.getBatch().draw(ClimatMontagneux.tree, 570+ x, 280+ y);
		game.getBatch().draw(ClimatMontagneux.tree, 420+ x, 250+ y);
		game.getBatch().draw(ClimatMontagneux.tree, 540+ x, 250+ y);
		game.getBatch().draw(ClimatMontagneux.tree, 450+ x, 220+ y);
		game.getBatch().draw(ClimatMontagneux.tree, 510+ x, 220+ y);
		game.getBatch().draw(ClimatMontagneux.tree, 480+ x, 190+ y);
		
		game.getBatch().draw(ClimatMontagneux.tree, 360+ x, 130+ y);
		game.getBatch().draw(ClimatMontagneux.tree, 330+ x, 100+ y);
		game.getBatch().draw(ClimatMontagneux.tree, 390+ x, 100+ y);
		game.getBatch().draw(ClimatMontagneux.tree, 240+ x, 70+ y);
		game.getBatch().draw(ClimatMontagneux.tree, 300+ x, 70+ y);
		game.getBatch().draw(ClimatMontagneux.tree, 360+ x, 70+ y);
		game.getBatch().draw(ClimatMontagneux.tree, 150+ x, 40+ y);
		game.getBatch().draw(ClimatMontagneux.tree, 210+ x, 40+ y);
		game.getBatch().draw(ClimatMontagneux.tree, 270+ x, 40+ y);
		game.getBatch().draw(ClimatMontagneux.tree, 330+ x, 40+ y);
		game.getBatch().draw(ClimatMontagneux.tree, 120+ x, 10+ y);
		game.getBatch().draw(ClimatMontagneux.tree, 180+ x, 10+ y);
		game.getBatch().draw(ClimatMontagneux.tree, 240+ x, 10+ y);
		game.getBatch().draw(ClimatMontagneux.tree, 300+ x, 10+ y);
		game.getBatch().draw(ClimatMontagneux.tree, 60+ x, 10+ y);
		

		game.getBatch().draw(ClimatMontagneux.planteGelé, 360+ x, 0+ y);
		game.getBatch().draw(ClimatMontagneux.planteGelé, 420+ x, 60+ y);
		game.getBatch().draw(ClimatMontagneux.planteGelé, 540+ x, 00+ y);
		game.getBatch().draw(ClimatMontagneux.planteGelé, 540+ x, 180+ y);

		if ( ! (isReceptaclePris) ) game.getBatch().draw(CoeurDeVie.receptacleDeCoeur, 480+ x, 300+ y);
		else if ( isReceptaclePris && MainMenu.Link.annimationAward ) game.getBatch().draw(CoeurDeVie.receptacleDeCoeur, MainMenu.Link.getX() - 7+ x, MainMenu.Link.getY() + 50+ y);

	}

	public static void destroyBody() {
		// TODO Auto-generated method stub
		if ( isCote1Created) MainMenu.world.destroyBody(cote1);
		isCote1Created = false;
		
		if ( isCote2Created) MainMenu.world.destroyBody(cote2);
		isCote2Created = false;

		if ( isarbre1Created) MainMenu.world.destroyBody(arbre1);
		isarbre1Created = false;

		if ( isarbre2Created) MainMenu.world.destroyBody(arbre2);
		isarbre2Created = false;

		if ( isarbre3Created) MainMenu.world.destroyBody(arbre3);
		isarbre3Created = false;

		if ( isarbre4Created) MainMenu.world.destroyBody(arbre4);
		isarbre4Created = false;

		if ( isarbre5Created) MainMenu.world.destroyBody(arbre5);
		isarbre5Created = false;

		if ( isarbre6Created) MainMenu.world.destroyBody(arbre6);
		isarbre6Created = false;

		if ( isarbre7Created) MainMenu.world.destroyBody(arbre7);
		isarbre7Created = false;

		if ( isarbre8Created) MainMenu.world.destroyBody(arbre8);
		isarbre8Created = false;

		if ( isPetitePierre1Created) MainMenu.world.destroyBody(petitePierre1);
		isPetitePierre1Created = false;

		if ( isPetitePierre2Created) MainMenu.world.destroyBody(petitePierre2);
		isPetitePierre2Created = false;

		if ( isBosquet1Created) MainMenu.world.destroyBody(bosquet1);
		isBosquet1Created = false;

		if ( isBosquet2Created) MainMenu.world.destroyBody(bosquet2);
		isBosquet2Created = false;

		if ( isBosquet3Created) MainMenu.world.destroyBody(bosquet3);
		isBosquet3Created = false;
	}

	public static void createBodyAndType(World world) {
		// TODO Auto-generated method stub
		
		if ( isCote1Created == false ) {
			cote1 = ClimatMontagneux.createBody(140,420,290,120);
			isCote1Created = true;
		}
		if ( isCote2Created == false ) {
			cote2 = ClimatMontagneux.createBody(460,420,240,120);
			isCote2Created = true;
		}

		if ( isarbre1Created == false ) {
			arbre1 = ClimatMontagneux.createBodyPerso("arbre", "static",570,260);
			isarbre1Created = true;
		}
		if ( isarbre2Created == false ) {
			arbre2 = ClimatMontagneux.createBodyPerso("arbre", "static",530,230);
			isarbre2Created = true;
		}
		if ( isarbre3Created == false ) {
			arbre3 = ClimatMontagneux.createBodyPerso("arbre", "static",490,200);
			isarbre3Created = true;
		}
		if ( isarbre4Created == false ) {
			arbre4 = ClimatMontagneux.createBodyPerso("arbre", "static",460,230);
			isarbre4Created = true;
		}
		if ( isarbre5Created == false ) {
			arbre5 = ClimatMontagneux.createBodyPerso("arbre", "static",430,255);
			isarbre5Created = true;
		}
		if ( isarbre6Created == false ) {
			arbre6 = ClimatMontagneux.createBodyPerso("arbre", "static",370,130);
			isarbre6Created = true;
		}
		if ( isarbre7Created == false ) {
			arbre7 = ClimatMontagneux.createBodyPerso("arbre", "static",340,100);
			isarbre7Created = true;
		}
		if ( isarbre8Created == false ) {
			arbre8 = ClimatMontagneux.createBodyPerso("arbre", "static",400,100);
			isarbre8Created = true;
		}

		CadrillageMap.setTypeDeDécor(420/60, 180/60, "petitePierre");
		if ( CadrillageMap.décorChangé[420/60][180/60] == true ) isPetitePierre1Déplacé = true;
		if ( isPetitePierre1Created == false && isPetitePierre1Déplacé == false) {
			petitePierre1 = ClimatMontagneux.createBodyPerso("grossePierre", "static", 420,180);
			isPetitePierre1Created = true;
		}
		CadrillageMap.setTypeDeDécor(360/60, 300/60, "petitePierre");
		if ( CadrillageMap.décorChangé[360/60][300/60] == true ) isPetitePierre2Déplacé = true;
		if ( isPetitePierre2Created == false && isPetitePierre2Déplacé == false) {
			petitePierre2 = ClimatMontagneux.createBodyPerso("grossePierre", "static", 360,300);
			isPetitePierre2Created = true;
		}

		if ( isBosquet1Created == false ) {
			bosquet1 = ClimatMontagneux.createBody(220,40,280,80);
			isBosquet1Created = true;
		}
		if ( isBosquet2Created == false ) {
			bosquet2 = ClimatMontagneux.createBody(270,80,250,60);
			isBosquet2Created = true;
		}
		if ( isBosquet3Created == false ) {
			bosquet3 = ClimatMontagneux.createBody(340,120,210,30);
			isBosquet3Created = true;
		}


		if ( !(isReceptaclePris)) CadrillageMap.setTypeDeDécor(480/60, 300/60, "receptacleDeCoeur");
	}

	public static void destroyType() {
		// TODO Auto-generated method stub
		isPetitePierre1Déplacé = false;
		isPetitePierre2Déplacé = false;
	}
}