package map.zoneGlace;

import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.physics.box2d.Body;
import com.badlogic.gdx.physics.box2d.World;
import com.mygdx.game.GameMain;

import characters.Pnj;
import characters.Squelette;
import decors.ClimatMontagneux;
import decors.DonjonGlace;
import items.Arc;
import map.CadrillageMap;
import scenes.MainMenu;

public class SousMapI3 extends Sprite{

    public static boolean isBuisson1Cut = false;
    public static boolean isBuisson2Cut = false;
    public static boolean isBuisson3Cut = false;
    public static boolean isBuisson4Cut = false;
    public static boolean isBuisson5Cut = false;
    public static boolean isBuisson6Cut = false;

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
    public static Body cote7 ;
    public static boolean isCote7Created;
    public static Body cote8 ;
    public static boolean isCote8Created;

    public static Body tombe;
    public static boolean istombeCreated;
    public static Body tombe2;
    public static boolean istombe2Created;
    public static Body tombe3;
    public static boolean istombe3Created;
    public static Body tombe4;
    public static boolean istombe4Created;


    public static Squelette monstre1;
    public static Squelette monstre2;
    public static boolean m1EstCrée = false ;
    public static boolean m2EstCrée = false ;
	
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

		ClimatMontagneux.eauProfondeGlacée(game, 540+ x, 0+ y);
		ClimatMontagneux.eauProfondeGlacée(game, 540+ x, 60+ y);
		ClimatMontagneux.eauProfondeGlacée(game, 540+ x, 120+ y);
		ClimatMontagneux.eauProfondeGlacée(game, 540+ x, 180+ y);
		ClimatMontagneux.eauProfondeGlacée(game, 540+ x, 240+ y);
		ClimatMontagneux.eauProfondeGlacée(game, 540+ x, 300+ y);
		ClimatMontagneux.eauProfondeGlacée(game, 540+ x, 360+ y);
		ClimatMontagneux.eauProfondeGlacée(game, 540+ x, 420+ y);

//

		game.getBatch().draw(DonjonGlace.murHorizontal, 0+ x, 450+ y);
		game.getBatch().draw(DonjonGlace.murHorizontal, 90+ x, 450+ y);


		game.getBatch().draw(ClimatMontagneux.bordGlacéInfGau, 0+ x, 120+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéInf, 60+ x, 120+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéInfGau, 120+ x, 60+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéInf, 180+ x, 60+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéInfDroi, 240+ x, 60+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéInf, 300+ x, 120+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéInfDroi, 360+ x, 120+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéInfDroi, 420+ x, 180+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéDroi, 420+ x, 240+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéInfDroi, 480+ x, 300+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéDroi, 480+ x, 360+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéDroi, 480+ x, 420+ y);


		game.getBatch().draw(ClimatMontagneux.murSombreGlacéCentre2, 0+ x, 60+ y);
		game.getBatch().draw(ClimatMontagneux.murSombreGlacéCentre, 0+ x, 0+ y);
		game.getBatch().draw(ClimatMontagneux.murSombreGlacéCentre2, 60+ x, 60+ y);
		game.getBatch().draw(ClimatMontagneux.murSombreGlacéCentre, 60+ x, 0+ y);
		game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 120+ x, 0+ y);
		game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 180+ x, 0+ y);
		game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 240+ x, 0+ y);
		game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 300+ x, 60+ y);
		game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 360+ x, 60+ y);
		game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 300+ x, 0+ y);
		game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 360+ x, 0+ y);
		game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 420+ x, 120+ y);
		game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 420+ x, 60+ y);
		game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 420+ x, 0+ y);
		game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 480+ x, 240+ y);
		game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 480+ x, 180+ y);
		game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 480+ x, 120+ y);
		game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 480+ x, 60+ y);
		game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 480+ x, 0+ y);

//

        game.getBatch().draw(ClimatMontagneux.herbeGlace120, 120+ x, 300+ y);
        game.getBatch().draw(ClimatMontagneux.herbeGlace120, 350+ x, 240+ y);
        game.getBatch().draw(ClimatMontagneux.herbeGlace120, 300+ x, 300+ y);

//


        game.getBatch().draw(ClimatMontagneux.planteGelé , 240+ x, 360+ y);
        game.getBatch().draw(ClimatMontagneux.planteGelé3 , 400+ x, 300+ y);
        game.getBatch().draw(ClimatMontagneux.planteGelé , 480+ x, 420+ y);
        game.getBatch().draw(ClimatMontagneux.planteGelé3 , 180+ x, 120+ y);
        game.getBatch().draw(ClimatMontagneux.planteGelé , 180+ x, 180+ y);
        game.getBatch().draw(ClimatMontagneux.planteGelé3 , 180+ x, 300+ y);

        game.getBatch().draw(ClimatMontagneux.planteGelé3 , 00+ x, 120+ y);
        game.getBatch().draw(ClimatMontagneux.planteGelé3 , 110+ x, 360+ y);

//

        game.getBatch().draw(ClimatMontagneux.tree, 480+ x, 420+ y);
        game.getBatch().draw(ClimatMontagneux.tree, 480+ x, 370+ y);
        game.getBatch().draw(ClimatMontagneux.tree, 480+ x, 320+ y);

		game.getBatch().draw(ClimatMontagneux.tree, -30+ x, 320+ y);
		game.getBatch().draw(ClimatMontagneux.tree, -30+ x, 260+ y);
        game.getBatch().draw(ClimatMontagneux.tree, 0+ x, 200+ y);
        game.getBatch().draw(ClimatMontagneux.tree, 0+ x, 140+ y);
        game.getBatch().draw(ClimatMontagneux.tree, 60+ x, 140+ y);
        game.getBatch().draw(ClimatMontagneux.tree, 120+ x, 140+ y);
        game.getBatch().draw(ClimatMontagneux.tree, 120+ x, 80+ y);
        game.getBatch().draw(ClimatMontagneux.tree, 180+ x, 80+ y);
        game.getBatch().draw(ClimatMontagneux.tree, 240+ x, 80+ y);


		game.getBatch().draw(ClimatMontagneux.tree, 0+ x, -30+ y);

        game.getBatch().draw(Arc.tombe,240 + x , 240 + y);
        game.getBatch().draw(Arc.tombe,120 + x , 300 + y);
        game.getBatch().draw(Arc.tombe,360 + x , 300 + y);
        game.getBatch().draw(Arc.tombe,300 + x , 360 + y);

//

        ClimatMontagneux.buisson(isBuisson1Cut,game, 60+x, 360+y);
        ClimatMontagneux.buisson(isBuisson2Cut,game, 300+x, 130+y);
        ClimatMontagneux.buisson(isBuisson3Cut,game, 60+x, 240+y);
        ClimatMontagneux.buisson(isBuisson4Cut,game, 300+x, 300+y);
        ClimatMontagneux.buisson(isBuisson5Cut,game, 360+x, 180+y);
        ClimatMontagneux.buisson(isBuisson6Cut,game, 420+x, 360+y);

        //		==================================================================
        //		Placement des dessins des monstres
        //==================================================================

        if ( m1EstCrée && monstre1.isAlive() ) {
            game.getBatch().draw(monstre1,monstre1.getX(), monstre1.getY());
        }
        if ( m2EstCrée && monstre2.isAlive() ) {
            game.getBatch().draw(monstre2.getTexture(), monstre2.getX(), monstre2.getY());
        }
        //==================================================================
        //		      			dégats des monstres
        //==================================================================

        if ( m1EstCrée && monstre1.isAlive() ) {
            monstre1.infligéDégatLink();
        }
        if ( m2EstCrée && monstre2.isAlive() ) {
            monstre2.infligéDégatLink();
        }

	}

	public static void destroyBody() {
		// TODO Auto-generated method stub


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

        if ( isCote7Created) MainMenu.world.destroyBody(cote7);
        isCote7Created = false;

        if ( isCote8Created) MainMenu.world.destroyBody(cote8);
        isCote8Created = false;


        if ( istombeCreated) MainMenu.world.destroyBody(tombe);
        istombeCreated = false;

        if ( istombe2Created) MainMenu.world.destroyBody(tombe2);
        istombe2Created = false;

        if ( istombe3Created) MainMenu.world.destroyBody(tombe3);
        istombe3Created = false;

        if ( istombe4Created) MainMenu.world.destroyBody(tombe4);
        istombe4Created = false;


        //		destruction monstres
        if ( m1EstCrée )MainMenu.world.destroyBody(monstre1.getBody());
        if ( m2EstCrée )MainMenu.world.destroyBody(monstre2.getBody());
        m1EstCrée = false;
        m2EstCrée = false;

        Pnj.nbrDeMonstres = 0 ;
	}

	public static void createBodyAndType(World world) {
		// TODO Auto-generated method stub


        CadrillageMap.setTypeDeDécor(1,6,"HerbesHautes");
        CadrillageMap.setTypeDeDécor(5,2,"HerbesHautes");
        CadrillageMap.setTypeDeDécor(1,4,"HerbesHautes");
        CadrillageMap.setTypeDeDécor(5,5,"HerbesHautes");
        CadrillageMap.setTypeDeDécor(6,3,"HerbesHautes");
        CadrillageMap.setTypeDeDécor(7,6,"HerbesHautes");
        if ( CadrillageMap.décorChangé[1][6] == true ) isBuisson1Cut = true;
        if ( CadrillageMap.décorChangé[5][2] == true ) isBuisson2Cut = true;
        if ( CadrillageMap.décorChangé[1][4] == true ) isBuisson3Cut = true;
        if ( CadrillageMap.décorChangé[5][5] == true ) isBuisson4Cut = true;
        if ( CadrillageMap.décorChangé[6][3] == true ) isBuisson5Cut = true;
        if ( CadrillageMap.décorChangé[7][6] == true ) isBuisson6Cut = true;


        if ( isCote1Created == false ) {
            cote1 = ClimatMontagneux.createBody(500,240,60,480);
            isCote1Created = true;
        }
        if ( isCote2Created == false ) {
            cote2 = ClimatMontagneux.createBody(440,120,60,120);
            isCote2Created = true;
        }
        if ( isCote3Created == false ) {
            cote3 = ClimatMontagneux.createBody(340,60,120,120);
            isCote3Created = true;
        }
        if ( isCote4Created == false ) {
            cote4 = ClimatMontagneux.createBody(220,80,120,130);
            isCote4Created = true;
        }
        if ( isCote5Created == false ) {
            cote5 = ClimatMontagneux.createBodyPerso("arbre", "static",0,200);
            isCote5Created = true;
        }
        if ( isCote6Created == false ) {
            cote6 = ClimatMontagneux.createBody(70,120,180,180);
            isCote6Created = true;
        }
        if ( isCote7Created == false ) {
            cote7 = ClimatMontagneux.createBody(10,460,300,20);
            isCote7Created = true;
        }
        if ( isCote8Created == false ) {
            cote8 = ClimatMontagneux.createBody(-20,310,60,140);
            isCote8Created = true;
        }

        if ( istombeCreated == false ) {
            tombe = ClimatMontagneux.createBodyPerso("grossePierre", "static",240,240);
            istombeCreated = true;
        }

        if ( istombe2Created == false ) {
            tombe2 = ClimatMontagneux.createBodyPerso("grossePierre", "static",120,300);
            istombe2Created = true;
        }

        if ( istombe3Created == false ) {
            tombe3 = ClimatMontagneux.createBodyPerso("grossePierre", "static",360,300);
            istombe3Created = true;
        }

        if ( istombe4Created == false ) {
            tombe4 = ClimatMontagneux.createBodyPerso("grossePierre", "static",300,360);
            istombe4Created = true;
        }


//		========================================================================================
        //		Création des corps des montres
        //========================================================================================


        if ( m1EstCrée == false ) {
            monstre1 = new Squelette(world ,Squelette.squeletteBas2 , 200 , 360 , "bas") ;
            Pnj.monstres[0] = monstre1;
            m1EstCrée = true;
        } else {
            monstre1.déplacement();
            monstre1.représentation();
            monstre1.attaque(MainMenu.Link);
            monstre1.updateBody();
        }

        if ( m2EstCrée == false ) {
            monstre2 = new Squelette(world ,Squelette.squeletteDroite2, 400 , 200 , "droite") ;
            Pnj.monstres[1] = monstre2;
            Pnj.nbrDeMonstres = 2 ;
            m2EstCrée = true;
        } else {
            monstre2.déplacement();
            monstre2.représentation();
            monstre2.attaque(MainMenu.Link);
            monstre2.updateBody();
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
	}
}
