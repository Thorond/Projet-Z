package map.zoneGlace;

import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.physics.box2d.Body;
import com.badlogic.gdx.physics.box2d.World;
import com.mygdx.game.GameMain;

import decors.ClimatMontagneux;
import map.CadrillageMap;
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
	public static Body igloo ;
	public static boolean isIglooCreated;
	
	public static Body tonneau1 ;
	public static boolean isTonneau1Created;
	public static Body tonneau2 ;
	public static boolean isTonneau2Created;
	public static Body tonneau3 ;
	public static boolean isTonneau3Created;
	public static Body tonneau4 ;
	public static boolean isTonneau4Created;


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
	
	public static void sousMap(GameMain game, int x, int y){
		
		ClimatMontagneux.eauProfondeGlacée(game,0+ x, 0+y);
		ClimatMontagneux.eauProfondeGlacée(game,0+ x, 60+y);
		ClimatMontagneux.eauProfondeGlacée(game,0+ x, 120+y);
		ClimatMontagneux.eauProfondeGlacée(game,0+ x, 180+y);
		ClimatMontagneux.eauProfondeGlacée(game,0+ x, 240+y);
		ClimatMontagneux.eauProfondeGlacée(game,0+ x, 300+y);
		ClimatMontagneux.eauProfondeGlacée(game,0+ x, 360+y);
		ClimatMontagneux.eauProfondeGlacée(game,0+ x, 420+y);
		
		game.getBatch().draw(ClimatMontagneux.glace1, 60+ x, 0+ y);
		game.getBatch().draw(ClimatMontagneux.piedGlacéSup, 60+ x, 0+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 60+ x, 60+ y);
		game.getBatch().draw(ClimatMontagneux.murEauGlacéGauche, 60+ x, 60+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 60+ x, 120+ y);
		game.getBatch().draw(ClimatMontagneux.murEauGlacéGauche, 60+ x, 120+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 60+ x, 180+ y);	
		game.getBatch().draw(ClimatMontagneux.bordMerGlacéGau, 60+ x, 180+ y);	
		game.getBatch().draw(ClimatMontagneux.glace1, 60+ x, 240+ y);
		game.getBatch().draw(ClimatMontagneux.bordMerGlacéGau, 60+ x, 240+ y);	
		game.getBatch().draw(ClimatMontagneux.glace1, 60+ x, 300+ y);
		game.getBatch().draw(ClimatMontagneux.bordMerGlacéGau, 60+ x, 300+ y);	
		game.getBatch().draw(ClimatMontagneux.glace1, 60+ x, 360+ y);
		game.getBatch().draw(ClimatMontagneux.bordMerGlacéSupGau, 60+ x, 360+ y);	
		ClimatMontagneux.eauProfondeGlacée(game,60+ x, 420+y);
		
		game.getBatch().draw(ClimatMontagneux.glace1, 120+ x, 0+ y);
		game.getBatch().draw(ClimatMontagneux.piedGlacéSup, 120+ x, 0+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 120+ x, 60+ y);
		game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 120+ x, 60+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 120+ x, 120+ y);
		game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 120+ x, 120+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 120+ x, 180+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 120+ x, 240+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 120+ x, 300+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 120+ x, 360+ y);
		game.getBatch().draw(ClimatMontagneux.bordMerGlacéSup, 120+ x, 360+ y);
		ClimatMontagneux.eauProfondeGlacée(game,120+ x, 420+y);
		
		game.getBatch().draw(ClimatMontagneux.glace1, 180+ x, 0+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 180+ x, 60+ y);
		game.getBatch().draw(ClimatMontagneux.escalierGlacé, 180+ x, 60+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 180+ x, 120+ y);
		game.getBatch().draw(ClimatMontagneux.escalierGlacé, 180+ x, 120+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 180+ x, 180+ y);
		game.getBatch().draw(ClimatMontagneux.escalierHaut, 180+ x, 180+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 180+ x, 240+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 180+ x, 300+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 180+ x, 360+ y);
		game.getBatch().draw(ClimatMontagneux.bordMerGlacéSup, 180+ x, 360+ y);
		ClimatMontagneux.eauProfondeGlacée(game,180+ x, 420+y);
		
		game.getBatch().draw(ClimatMontagneux.glace1, 240+ x, 0+ y);
		game.getBatch().draw(ClimatMontagneux.piedGlacéSup, 240+ x, 0+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 240+ x, 60+ y);
		game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 240+ x, 60+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 240+ x, 120+ y);
		game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 240+ x, 120+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 240+ x, 180+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 240+ x, 240+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 240+ x, 300+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 240+ x, 360+ y);
		game.getBatch().draw(ClimatMontagneux.bordMerGlacéSup, 240+ x, 360+ y);
		ClimatMontagneux.eauProfondeGlacée(game,240+ x, 420+y);
		
		game.getBatch().draw(ClimatMontagneux.glace1, 300+ x, 0+ y);
		game.getBatch().draw(ClimatMontagneux.piedGlacéSup, 300+ x, 0+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 300+ x, 60+ y);
		game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 300+ x, 60+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 300+ x, 120+ y);
		game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 300+ x, 120+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 300+ x, 180+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 300+ x, 240+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 300+ x, 300+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 300+ x, 360+ y);
		game.getBatch().draw(ClimatMontagneux.bordMerGlacéSup, 300+ x, 360+ y);
		ClimatMontagneux.eauProfondeGlacée(game,300+ x, 420+y);
		
		game.getBatch().draw(ClimatMontagneux.glace1, 360+ x, 0+ y);
		game.getBatch().draw(ClimatMontagneux.piedGlacéSup, 360+ x, 0+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 360+ x, 60+ y);
		game.getBatch().draw(ClimatMontagneux.murGlacéCentre,360+ x, 60+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 360+ x, 120+ y);
		game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 360+ x, 120+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 360+ x, 180+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 360+ x, 240+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 360+ x, 300+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 360+ x, 360+ y);
		game.getBatch().draw(ClimatMontagneux.bordMerGlacéSup, 360+ x, 360+ y);
		ClimatMontagneux.eauProfondeGlacée(game,360+ x, 420+y);
		
		game.getBatch().draw(ClimatMontagneux.glace1, 420+ x, 0+ y);
		game.getBatch().draw(ClimatMontagneux.piedGlacéSup, 420+ x, 0+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 420+ x, 60+ y);
		game.getBatch().draw(ClimatMontagneux.murGlacéDroite, 420+ x, 60+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 420+ x, 120+ y);
		game.getBatch().draw(ClimatMontagneux.murGlacéDroite, 420+ x, 120+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 420+ x, 180+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéDroi, 420+ x, 180+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 420+ x, 240+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéDroi, 420+ x, 240+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 420+ x, 300+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéDroi, 420+ x, 300+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 420+ x, 360+ y);
		game.getBatch().draw(ClimatMontagneux.bordMerGlacéSupDroi, 420+ x, 360+ y);
		ClimatMontagneux.eauProfondeGlacée(game,420+ x, 420+y);
		
		game.getBatch().draw(ClimatMontagneux.glace1, 480+ x, 0+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 480+ x, 60+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 480+ x, 120+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 480+ x, 180+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 480+ x, 240+ y);
		game.getBatch().draw(ClimatMontagneux.bordMerGlacéSup, 480+ x, 240+ y);
		ClimatMontagneux.eauProfondeGlacée(game,480+ x, 300+y);
		ClimatMontagneux.eauProfondeGlacée(game,480+ x, 360+y);
		ClimatMontagneux.eauProfondeGlacée(game,480+ x, 420+y);
		
		game.getBatch().draw(ClimatMontagneux.glace1, 540+ x, 0+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 540+ x, 60+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 540+ x, 120+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 540+ x, 180+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 540+ x, 240+ y);
		game.getBatch().draw(ClimatMontagneux.bordMerGlacéSup, 540+ x, 240+ y);
		ClimatMontagneux.eauProfondeGlacée(game,540+ x, 300+y);
		ClimatMontagneux.eauProfondeGlacée(game,540+ x, 360+y);
		ClimatMontagneux.eauProfondeGlacée(game,540+ x, 420+y);

//

		game.getBatch().draw(ClimatMontagneux.planteGelé, 120+ x, 180+ y);
		game.getBatch().draw(ClimatMontagneux.planteGelé3, 300+ x, 180+ y);
		game.getBatch().draw(ClimatMontagneux.planteGelé3, 480+ x, 120+ y);

		game.getBatch().draw(ClimatMontagneux.planteGelé, 240+ x, 0+ y);
		game.getBatch().draw(ClimatMontagneux.planteGelé3, 480+ x, 60+ y);
		game.getBatch().draw(ClimatMontagneux.planteGelé3, 540+ x, 00+ y);
		
//		arbre

		game.getBatch().draw(ClimatMontagneux.tree, 480+ x, 240+ y);
		game.getBatch().draw(ClimatMontagneux.grossePierre, 540+ x, 240+ y);
		game.getBatch().draw(ClimatMontagneux.tree, 540+ x, 180+ y);
		game.getBatch().draw(ClimatMontagneux.tronc, 480+ x, 180+ y);
		game.getBatch().draw(ClimatMontagneux.tronc, 540+ x, 120+ y);
		

		game.getBatch().draw(ClimatMontagneux.tree, 60+ x, 360+ y);
		game.getBatch().draw(ClimatMontagneux.tree, 120+ x, 330+ y);
		game.getBatch().draw(ClimatMontagneux.tree, 90+ x, 300+ y);
		game.getBatch().draw(ClimatMontagneux.tronc, 120+ x, 260+ y);

		game.getBatch().draw(ClimatMontagneux.tree, 410+ x, 180+ y);
		
		game.getBatch().draw(ClimatMontagneux.tree, 50+ x, 0+ y);
		
		
//		tonneau 
		
		game.getBatch().draw(ClimatMontagneux.tonneau, 70+ x, 180+ y);
		game.getBatch().draw(ClimatMontagneux.tonneau, 410+ x, 350+ y);
		game.getBatch().draw(ClimatMontagneux.tonneau, 410+ x, 330+ y);
		game.getBatch().draw(ClimatMontagneux.tonneau, 410+ x, 280+ y);
		
//		igloo
		
		game.getBatch().draw(ClimatMontagneux.igloo, 180+ x, 240+ y);
		
		
	
	}
	
	public static void createBodyAndType(World world){
		CadrillageMap.setTypeDeDécor(0, 0, "EauProfonde");
		CadrillageMap.setTypeDeDécor(480/60, 5, "EauProfonde");
		CadrillageMap.setTypeDeDécor(9, 5, "EauProfonde");
		
		if ( isMurAvantGaucheCreated == false ) {
			murAvantGauche = ClimatMontagneux.createBody(70,115,180,110);
			isMurAvantGaucheCreated = true;
		}
		if ( isMurAvantDroiteCreated == false ) {
			murAvantDroite = ClimatMontagneux.createBody(340,115,240,110);
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
		if ( isIglooCreated == false ) {
			igloo = ClimatMontagneux.createBody(260,320,190,160);
			isIglooCreated = true;
		}
		if ( isTonneau1Created == false ) {
			tonneau1 = ClimatMontagneux.createBodyPerso("tonneau","static",70,180);
			isTonneau1Created = true;
		}
		if ( isTonneau2Created == false ) {
			tonneau2 = ClimatMontagneux.createBodyPerso("tonneau","static",410,280);
			isTonneau2Created = true;
		}
		if ( isTonneau3Created == false ) {
			tonneau3 = ClimatMontagneux.createBodyPerso("tonneau","static",410,330);
			isTonneau3Created = true;
		}
		if ( isTonneau4Created == false ) {
			tonneau4 =ClimatMontagneux.createBodyPerso("tonneau","static",410,350);
			isTonneau4Created = true;
		}

        if ( isarbre1Created == false ) {
            arbre1 = ClimatMontagneux.createBodyPerso("arbre", "static",60,0);
            isarbre1Created = true;
        }
        if ( isarbre2Created == false ) {
            arbre2 = ClimatMontagneux.createBodyPerso("arbre", "static",480,180);
            isarbre2Created = true;
        }
        if ( isarbre3Created == false ) {
            arbre3 = ClimatMontagneux.createBodyPerso("arbre", "static",540,120);
            isarbre3Created = true;
        }
        if ( isarbre4Created == false ) {
            arbre4 = ClimatMontagneux.createBodyPerso("arbre", "static",100,280);
            isarbre4Created = true;
        }
        if ( isarbre5Created == false ) {
            arbre5 = ClimatMontagneux.createBodyPerso("arbre", "static",420,180);
            isarbre5Created = true;
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
		if ( isIglooCreated ) MainMenu.world.destroyBody(igloo);
		isIglooCreated = false;
		if ( isTonneau1Created ) MainMenu.world.destroyBody(tonneau1);
		isTonneau1Created = false;
		if ( isTonneau2Created ) MainMenu.world.destroyBody(tonneau2);
		isTonneau2Created = false;
		if ( isTonneau3Created ) MainMenu.world.destroyBody(tonneau3);
		isTonneau3Created = false;
		if ( isTonneau4Created ) MainMenu.world.destroyBody(tonneau4);
		isTonneau4Created = false;


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
	}

}
