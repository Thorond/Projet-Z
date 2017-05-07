package map.zoneGlace;

import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.physics.box2d.Body;
import com.badlogic.gdx.physics.box2d.World;
import com.mygdx.game.GameMain;

import decors.ClimatMontagneux;
import map.CadrillageMap;
import scenes.MainMenu;

public class SousMapB4 extends Sprite{
	
	public static Body bosquet2 ;
	public static boolean isBosquet2Created;
	
	public static Body mur1 ;
	public static boolean ismur1Created;
	public static Body mur2 ;
	public static boolean ismur2Created;


    public static boolean isBuisson1Cut = false;
    public static boolean isBuisson2Cut = false;
    public static boolean isBuisson3Cut = false;
    public static boolean isBuisson4Cut = false;
    public static boolean isBuisson5Cut = false;
    public static boolean isBuisson6Cut = false;
    public static boolean isBuisson7Cut = false;


    public static Body cote1 ;
    public static boolean isCote1Created;
    public static Body cote2 ;
    public static boolean isCote2Created;
    public static Body cote3 ;
    public static boolean isCote3Created;
    public static Body cote4 ;
    public static boolean isCote4Created;

    public static Body arbre1;
    public static boolean isarbre1Created;


    public static void sousMap(GameMain game, int x, int y){
		
		game.getBatch().draw(ClimatMontagneux.glace1, 0+ x, 0+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 0+ x, 60+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 0+ x, 120+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 0+ x, 180+ y);		
		game.getBatch().draw(ClimatMontagneux.glace1, 0 + x,240 + y);
		game.getBatch().draw(ClimatMontagneux.glace1, 0+ x, 300+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 0+ x, 360+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 0+ x, 420+ y);
		
		game.getBatch().draw(ClimatMontagneux.glace1, 60+ x, 0+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 60+ x, 60+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 60+ x, 120+ y);
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
		
		game.getBatch().draw(ClimatMontagneux.arbreBasGauche, 180+ x, 420+ y);
		game.getBatch().draw(ClimatMontagneux.arbreBasMilieu, 240+ x, 420+ y);
		game.getBatch().draw(ClimatMontagneux.arbreBasMilieu, 300+ x, 420+ y);
		game.getBatch().draw(ClimatMontagneux.arbreBasMilieu, 360+ x, 420+ y);
		game.getBatch().draw(ClimatMontagneux.arbreBasMilieu, 420+ x, 420+ y);
		game.getBatch().draw(ClimatMontagneux.arbreBasMilieu, 480+ x, 420+ y);
		game.getBatch().draw(ClimatMontagneux.arbreBasMilieu, 540+ x, 420+ y);

		game.getBatch().draw(ClimatMontagneux.tree, 70+ x, 440+ y);
		game.getBatch().draw(ClimatMontagneux.tree, 120+ x, 430+ y);
		
//		
		
		game.getBatch().draw(ClimatMontagneux.bordGlacéSup, 540+ x, 300+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéSup, 480+ x, 300+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéSup, 420+ x, 300+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéSup, 360+ x, 300+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéSup, 300+ x, 300+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéSup, 240+ x, 300+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéSup, 180+ x, 300+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéSup, 120+ x, 300+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéSup, 60+ x, 300+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéSup, 0+ x, 300+ y);
		
		game.getBatch().draw(ClimatMontagneux.bordGlacéSup, 540+ x, 240+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéSup, 480+ x, 240+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéSup, 420+ x, 240+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéSup, 360+ x, 240+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéSup, 300+ x, 240+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéSup, 240+ x, 240+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéSup, 180+ x, 240+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéSupGau, 120+ x, 240+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéGau, 120+ x, 180+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéGau, 120+ x, 120+ y);
		game.getBatch().draw(ClimatMontagneux.escalierGlacé, 120+ x, 60+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéInf, 180+ x, 120+ y);
		game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 180+ x, 60+ y);
		game.getBatch().draw(ClimatMontagneux.piedCassé1Sup, 180+ x, 0+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéGau, 240+ x, 60+ y);
		game.getBatch().draw(ClimatMontagneux.cheminGlace, 240+ x, 0+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéInfDroi, 300+ x, 60+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéInfDroi, 360+ x, 120+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéInf, 420+ x, 180+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéInf, 480+ x, 180+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéInf, 540+ x, 180+ y);
		
//		
		

		ClimatMontagneux.eauProfonde(game,300+x,0+y);
		ClimatMontagneux.eauProfonde300(game,360+x,0+y);
		ClimatMontagneux.eauProfonde(game,360+x,60+y);
		ClimatMontagneux.eauProfonde300(game,420+x,0+y);
		ClimatMontagneux.eauProfonde(game,420+x,60+y);
		ClimatMontagneux.eauProfonde(game,420+x,120+y);
		ClimatMontagneux.eauProfonde(game,480+x,0+y);
		ClimatMontagneux.eauProfonde(game,480+x,60+y);
		ClimatMontagneux.eauProfonde(game,480+x,120+y);
		ClimatMontagneux.eauProfonde(game,540+x,0+y);
		ClimatMontagneux.eauProfonde(game,540+x,60+y);
		ClimatMontagneux.eauProfonde(game,540+x,120+y);

//


		game.getBatch().draw(ClimatMontagneux.arbreBasMilieu, 0+ x, 120+ y);
		game.getBatch().draw(ClimatMontagneux.arbreSommetMilieu, 0+ x, 180+ y);
		game.getBatch().draw(ClimatMontagneux.arbreBasDroite, 60+ x, 120+ y);
		game.getBatch().draw(ClimatMontagneux.arbreSommetDroite, 60+ x, 180+ y);


		game.getBatch().draw(ClimatMontagneux.tree, 0+ x, 300+ y);

        game.getBatch().draw(ClimatMontagneux.tree, 240+ x, 80+ y);
        game.getBatch().draw(ClimatMontagneux.tree, 300+ x, 80+ y);
        game.getBatch().draw(ClimatMontagneux.tree, 240+ x, 20+ y);

//		buissons

        game.getBatch().draw(ClimatMontagneux.planteGelé, 480+ x, 300+ y);
        game.getBatch().draw(ClimatMontagneux.planteGelé3, 420+ x, 200+ y);
        game.getBatch().draw(ClimatMontagneux.planteGelé3, 310+ x, 300+ y);
        game.getBatch().draw(ClimatMontagneux.planteGelé, 240+ x, 190+ y);
        game.getBatch().draw(ClimatMontagneux.planteGelé3, 0+ x, 0+ y);
        game.getBatch().draw(ClimatMontagneux.planteGelé, 130+ x, 240+ y);
        game.getBatch().draw(ClimatMontagneux.planteGelé3, 50+ x, 240+ y);


        ClimatMontagneux.buisson(isBuisson1Cut,game, 0+x, 420+y);
        ClimatMontagneux.buisson(isBuisson2Cut,game, 60+x, 360+y);
        ClimatMontagneux.buisson(isBuisson3Cut,game, 180+x, 360+y);
        ClimatMontagneux.buisson(isBuisson4Cut,game, 240+x, 360+y);
        ClimatMontagneux.buisson(isBuisson5Cut,game, 300+x, 360+y);
        ClimatMontagneux.buisson(isBuisson6Cut,game, 420+x, 360+y);
        ClimatMontagneux.buisson(isBuisson7Cut,game, 480+x, 360+y);
		
	}

	public static void destroyBody() {
		// TODO Auto-generated method stub
		if ( isBosquet2Created) MainMenu.world.destroyBody(bosquet2);
		isBosquet2Created = false;
		
		if ( ismur1Created) MainMenu.world.destroyBody(mur1);
		ismur1Created = false;
		if ( ismur2Created) MainMenu.world.destroyBody(mur2);
		ismur2Created = false;


        if ( isCote1Created) MainMenu.world.destroyBody(cote1);
        isCote1Created = false;

        if ( isCote2Created) MainMenu.world.destroyBody(cote2);
        isCote2Created = false;

        if ( isCote3Created) MainMenu.world.destroyBody(cote3);
        isCote3Created = false;

        if ( isCote4Created) MainMenu.world.destroyBody(cote4);
        isCote4Created = false;

        if ( isarbre1Created) MainMenu.world.destroyBody(arbre1);
        isarbre1Created = false;
	}

	public static void createBodyAndType(World world) {
		// TODO Auto-generated method stub
		if ( isBosquet2Created == false ) {
			bosquet2 = ClimatMontagneux.createBody(330,450,520,40);
			isBosquet2Created = true;
		}
		
		if ( ismur1Created == false ) {
			mur1 = ClimatMontagneux.createBody(300,345,600,1);
			ismur1Created = true;
		}
		if ( ismur2Created == false ) {
			mur2 = ClimatMontagneux.createBody(360,285,480,1);
			ismur2Created = true;
		}

        CadrillageMap.setTypeDeDécor(0,7,"HerbesHautes");
        CadrillageMap.setTypeDeDécor(1,6,"HerbesHautes");
        CadrillageMap.setTypeDeDécor(3,6,"HerbesHautes");
        CadrillageMap.setTypeDeDécor(4,6,"HerbesHautes");
        CadrillageMap.setTypeDeDécor(5,6,"HerbesHautes");
        CadrillageMap.setTypeDeDécor(7,6,"HerbesHautes");
        CadrillageMap.setTypeDeDécor(8,6,"HerbesHautes");
        if ( CadrillageMap.décorChangé[0][7] == true ) isBuisson1Cut = true;
        if ( CadrillageMap.décorChangé[1][6] == true ) isBuisson2Cut = true;
        if ( CadrillageMap.décorChangé[3][6] == true ) isBuisson3Cut = true;
        if ( CadrillageMap.décorChangé[4][6] == true ) isBuisson4Cut = true;
        if ( CadrillageMap.décorChangé[5][6] == true ) isBuisson5Cut = true;
        if ( CadrillageMap.décorChangé[7][6] == true ) isBuisson6Cut = true;
        if ( CadrillageMap.décorChangé[8][6] == true ) isBuisson7Cut = true;


        if ( isCote1Created == false ) {
            cote1 = ClimatMontagneux.createBody(50,170,120,100);
            isCote1Created = true;
        }
        if ( isCote2Created == false ) {
            cote2 = ClimatMontagneux.createBody(110,170,1,220);
            isCote2Created = true;
        }
        if ( isCote3Created == false ) {
            cote3 = ClimatMontagneux.createBody(290,70,120,160);
            isCote3Created = true;
        }
        if ( isCote4Created == false ) {
            cote4 = ClimatMontagneux.createBody(200,90,60,60);
            isCote4Created = true;
        }

        if ( isarbre1Created == false ) {
            arbre1 = ClimatMontagneux.createBodyPerso("arbre", "static",0,300);
            isarbre1Created = true;
        }
	}

	public static void destroyType() {
		// TODO Auto-generated method stub

        isBuisson1Cut = false;
        isBuisson2Cut = false;
        isBuisson3Cut = false;
        isBuisson4Cut = false;
        isBuisson5Cut = false;
        isBuisson6Cut = false;
        isBuisson7Cut = false;
	}
}
