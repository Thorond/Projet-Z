package map.zoneGlace;

import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.physics.box2d.Body;
import com.badlogic.gdx.physics.box2d.World;
import com.mygdx.game.GameMain;

import decors.ClimatMontagneux;
import items.Coffre;
import items.Essence;
import map.CadrillageMap;
import scenes.MainMenu;

public class SousMapG5 extends Sprite{



	public static boolean ouvertureCoffre = false; // à sauvegarder
	public static boolean coffreOuvert = false; // à sauvegarder


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
    public static Body cote9 ;
    public static boolean isCote9Created;
    public static Body cote10 ;
    public static boolean isCote10Created;

    public static Body bosquet1 ;
    public static boolean isBosquet1Created;

	public static void sousMap(GameMain game, int x, int y){
		
		game.getBatch().draw(ClimatMontagneux.glace1, 0+ x, 0+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 0+ x, 60+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 0+ x, 120+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 0+ x, 180+ y);		
		game.getBatch().draw(ClimatMontagneux.glace1, 0+ x,240 + y);
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
		
//


		game.getBatch().draw(ClimatMontagneux.bordGlacéInfDroi, 0+ x, 360+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéInf, 60+ x, 420+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéInfDroi, 120+ x, 420+ y);

		game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 0+ x, 300+ y);
		game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 0+ x, 240+ y);
		game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 0+ x, 180+ y);
		game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 0+ x, 120+ y);
		
		game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 60+ x, 360+ y);
		game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 60+ x, 300+ y);
		game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 60+ x, 180+ y);
		game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 60+ x, 120+ y);

		game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 120+ x, 360+ y);
		game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 120+ x, 300+ y);
		game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 120+ x, 180+ y);
		game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 120+ x, 120+ y);
		
		game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 180+ x, 420+ y);
		game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 180+ x, 360+ y);
		game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 180+ x, 180+ y);
		game.getBatch().draw(ClimatMontagneux.murGlacéDroite, 180+ x, 120+ y);
		
		game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 240+ x, 420+ y);
		game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 240+ x, 360+ y);
		game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 240+ x, 240+ y);
		game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 240+ x, 180+ y);
		
		game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 300+ x, 420+ y);
		game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 300+ x, 360+ y);
		game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 300+ x, 240+ y);
		game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 300+ x, 180+ y);
		
		game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 360+ x, 420+ y);
		game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 360+ x, 240+ y);
		game.getBatch().draw(ClimatMontagneux.murGlacéDroite, 360+ x, 180+ y);
		
		game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 420+ x, 420+ y);
		game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 420+ x, 300+ y);
		game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 420+ x, 240+ y);
		
		game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 480+ x, 420+ y);
		game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 480+ x, 300+ y);
		game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 480+ x, 240+ y);
		
		game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 540+ x, 300+ y);
		game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 540+ x, 240+ y);
		

		game.getBatch().draw(ClimatMontagneux.bordGlacéInf, 60+ x, 240+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéInf, 120+ x, 240+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéInfDroi, 180+ x, 240+ y);
		game.getBatch().draw(ClimatMontagneux.piedGlacéSup, 180+ x, 300+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéInf, 240+ x, 300+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéInf, 300+ x, 300+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéInfDroi, 360+ x, 300+ y);
		game.getBatch().draw(ClimatMontagneux.piedGlacéSup, 360+ x, 360+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéInf, 420+ x, 360+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéInf, 480+ x, 360+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéInfDroi, 540+ x, 360+ y);
		game.getBatch().draw(ClimatMontagneux.piedGlacéSup, 540+ x, 420+ y);

		game.getBatch().draw(ClimatMontagneux.piedGlacéSup, 00+ x, 60+ y);
		game.getBatch().draw(ClimatMontagneux.piedGlacéSup, 60+ x, 60+ y);
		game.getBatch().draw(ClimatMontagneux.piedGlacéSup, 120+ x, 60+ y);
		game.getBatch().draw(ClimatMontagneux.piedGlacéSup, 180+ x, 60+ y);
		game.getBatch().draw(ClimatMontagneux.piedGlacéSup, 240+ x, 120+ y);
		game.getBatch().draw(ClimatMontagneux.piedGlacéSup, 300+ x, 120+ y);
		game.getBatch().draw(ClimatMontagneux.piedGlacéSup, 360+ x, 120+ y);
		game.getBatch().draw(ClimatMontagneux.piedGlacéSup, 420+ x, 180+ y);
		game.getBatch().draw(ClimatMontagneux.piedGlacéSup, 480+ x, 180+ y);
		game.getBatch().draw(ClimatMontagneux.piedGlacéSup, 540+ x, 180+ y);

		game.getBatch().draw(ClimatMontagneux.bordGlacéInf, 0+ x, 0+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéInf, 60+ x, 0+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéInf, 120+ x, 0+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéInf, 180+ x, 0+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéInf, 240+ x, 0+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéInf, 300+ x, 0+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéInf, 360+ x, 0+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéInf, 420+ x, 0+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéInf, 480+ x, 0+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéInf, 540+ x, 0+ y);


        game.getBatch().draw(ClimatMontagneux.tree, -50+ x, 70+ y);
        game.getBatch().draw(ClimatMontagneux.tree, 10+ x, 70+ y);
        game.getBatch().draw(ClimatMontagneux.tree, 70+ x, 70+ y);
        game.getBatch().draw(ClimatMontagneux.tree, 130+ x, 70+ y);
        game.getBatch().draw(ClimatMontagneux.tree, 190+ x, 70+ y);
        game.getBatch().draw(ClimatMontagneux.tree, 250+ x, 130+ y);
        game.getBatch().draw(ClimatMontagneux.tree, 310+ x, 130+ y);
        game.getBatch().draw(ClimatMontagneux.tree, 370+ x, 130+ y);
        game.getBatch().draw(ClimatMontagneux.tree, 430+ x, 190+ y);
        game.getBatch().draw(ClimatMontagneux.tree, 490+ x, 190+ y);
        game.getBatch().draw(ClimatMontagneux.tree, 550+ x, 190+ y);

        game.getBatch().draw(ClimatMontagneux.tree, 430+ x, 20+ y);
        game.getBatch().draw(ClimatMontagneux.tree, 490+ x, 20+ y);
        game.getBatch().draw(ClimatMontagneux.tree, 550+ x, 20+ y);


        game.getBatch().draw(ClimatMontagneux.planteGelé, 0+ x, 10+ y);
        game.getBatch().draw(ClimatMontagneux.planteGelé, 0+ x, 390+ y);
        game.getBatch().draw(ClimatMontagneux.planteGelé3, 120+ x, 10+ y);
        game.getBatch().draw(ClimatMontagneux.planteGelé, 430+ x, 150+ y);
        game.getBatch().draw(ClimatMontagneux.planteGelé, 550+ x, 420+ y);;
        game.getBatch().draw(ClimatMontagneux.planteGelé, 250+ x, 320+ y);
        game.getBatch().draw(ClimatMontagneux.planteGelé, 250+ x, 70+ y);
        game.getBatch().draw(ClimatMontagneux.planteGelé3, 430+ x, 380+ y);

        if ( ouvertureCoffre == false ) game.getBatch().draw(ClimatMontagneux.coffreBleuFermé, 70+ x,260+ y);
        else {
            if ( coffreOuvert == false ) {
                if ( Coffre.ouvert1 == true && Coffre.ouvert2 == true ){
                    coffreOuvert = true;
                }
                Coffre.annimationCoffreBleu(game, 70+ x,260+ y);

            } else {
                game.getBatch().draw(ClimatMontagneux.coffreBleuOuvert3, 70+ x,260+ y);
            }

        }
        if ( MainMenu.Link.annimationAward ) {
			game.getBatch().draw(Essence.essenceOrange, MainMenu.Link.getX() +5, MainMenu.Link.getY() +50);
			game.getBatch().draw(Essence.texteEssence25, 100 + x, 10+y);
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

        if ( isCote9Created) MainMenu.world.destroyBody(cote9);
        isCote9Created = false;

        if ( isCote10Created) MainMenu.world.destroyBody(cote10);
        isCote10Created = false;

        if ( isBosquet1Created) MainMenu.world.destroyBody(bosquet1);
        isBosquet1Created = false;
	}

	public static void createBodyAndType(World world) {
		// TODO Auto-generated method stub

        CadrillageMap.setTypeDeDécor(1,4, "coffreBleu");


        if ( isCote1Created == false ) {
            cote1 = ClimatMontagneux.createBody(50,220,100,280);
            isCote1Created = true;
        }
        if ( isCote2Created == false ) {
            cote2 = ClimatMontagneux.createBody(170,160,120,160);
            isCote2Created = true;
        }
        if ( isCote3Created == false ) {
            cote3 = ClimatMontagneux.createBody(320,220,180,160);
            isCote3Created = true;
        }
        if ( isCote4Created == false ) {
            cote4 = ClimatMontagneux.createBody(500,280,180,160);
            isCote4Created = true;
        }
        if ( isCote5Created == false ) {
            cote5 = ClimatMontagneux.createBody(110,360,120,120);
            isCote5Created = true;
        }
        if ( isCote6Created == false ) {
            cote6 = ClimatMontagneux.createBody(260,420,180,120);
            isCote6Created = true;
        }
        if ( isCote7Created == false ) {
            cote7 = ClimatMontagneux.createBody(440,450,180,60);
            isCote7Created = true;
        }
        if ( isCote8Created == false ) {
            cote8 = ClimatMontagneux.createBody(570,460,80,1);
            isCote8Created = true;
        }
        if ( isCote9Created == false ) {
            cote9 = ClimatMontagneux.createBody(580,390,1,60);
            isCote9Created = true;
        }
        if ( isCote10Created == false ) {
            cote10 = ClimatMontagneux.createBody(300,0,600,1);
            isCote10Created = true;
        }
        if ( isBosquet1Created == false ) {
            bosquet1 = ClimatMontagneux.createBody(500,40,180,90);
            isBosquet1Created = true;
        }
	}

	public static void destroyType() {
		// TODO Auto-generated method stub
		
	}
}
