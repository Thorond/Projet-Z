package map.zoneGlace;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.physics.box2d.Body;
import com.badlogic.gdx.physics.box2d.World;
import com.mygdx.game.GameMain;

import characters.MainCharacter;
import decors.ClimatMontagneux;
import items.Arc;
import items.Coffre;
import items.Essence;
import map.CadrillageMap;
import scenes.MainMenu;

public class SousMapD5 extends Sprite{
	
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


    public static Body tombe;
    public static boolean istombeCreated;
    public static Body tombe2;
    public static boolean istombe2Created;
    public static Body tombe3;
    public static boolean istombe3Created;


    public static Body bosquet1 ;
    public static boolean isBosquet1Created;
    public static Body bosquet2 ;
    public static boolean isBosquet2Created;
    public static Body bosquet3 ;
    public static boolean isBosquet3Created;

    public static Body grossePierre1;
    public static boolean isGrossePierre1Created;
	
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
		
//		

		ClimatMontagneux.eauProfonde(game,00+x,420+y);
		ClimatMontagneux.eauProfonde(game,60+x,420+y);
		ClimatMontagneux.eauProfonde(game,120+x,420+y);
		ClimatMontagneux.eauProfonde(game,120+x,360+y);
		ClimatMontagneux.eauProfonde(game,180+x,420+y);
		ClimatMontagneux.eauProfonde(game,180+x,360+y);
		ClimatMontagneux.eauProfonde(game,240+x,420+y);
		ClimatMontagneux.eauProfonde(game,240+x,360+y);
		ClimatMontagneux.eauProfonde(game,240+x,300+y);
		ClimatMontagneux.eauProfonde(game,300+x,300+y);
		ClimatMontagneux.eauProfonde(game,300+x,240+y);
		ClimatMontagneux.eauProfonde(game,300+x,420+y);
		ClimatMontagneux.eauProfonde(game,300+x,360+y);
		ClimatMontagneux.eauProfonde(game,360+x,180+y);
		ClimatMontagneux.eauProfonde(game,360+x,240+y);
		ClimatMontagneux.eauProfonde(game,360+x,300+y);
		ClimatMontagneux.eauProfonde(game,360+x,360+y);
		ClimatMontagneux.eauProfonde(game,420+x,180+y);
		ClimatMontagneux.eauProfonde(game,420+x,240+y);
		ClimatMontagneux.eauProfonde(game,420+x,300+y);
		ClimatMontagneux.eauProfonde(game,480+x,180+y);
		ClimatMontagneux.eauProfonde(game,480+x,240+y);
		ClimatMontagneux.eauProfonde(game,480+x,300+y);
		ClimatMontagneux.eauProfonde(game,540+x,180+y);
		ClimatMontagneux.eauProfonde(game,540+x,240+y);
		ClimatMontagneux.eauProfonde(game,540+x,300+y);
		
		

		game.getBatch().draw(ClimatMontagneux.bordGlacéInfGau, 60+ x, 0+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéGau, 60+ x, 60+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéGau, 60+ x, 120+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéGau, 60+ x, 180+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéGau, 60+ x, 240+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéGau, 60+ x, 300+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéSupGau, 60+ x, 360+ y);
		game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 0+ x, 360+ y);
		game.getBatch().draw(ClimatMontagneux.piedCassé2Sup, 0+ x,300+ y);
		

		game.getBatch().draw(ClimatMontagneux.bordGlacéInf, 120+ x, 0+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéInf, 180+ x, 0+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéInf, 240+ x, 0+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéInf, 300+ x, 0+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéInf, 360+ x, 0+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéInf, 420+ x, 0+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéInf, 480+ x, 0+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéInf, 540+ x, 0+ y);
		

		game.getBatch().draw(ClimatMontagneux.bordGlacéSup, 120+ x, 300+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéSupDroi, 180+ x, 300+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéSupDroi, 240+ x, 240+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéSupDroi, 300+ x, 180+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéSup, 360+ x, 120+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéSup, 420+ x, 120+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéSup, 480+ x, 120+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéSupDroi, 540+ x, 120+ y);

		game.getBatch().draw(ClimatMontagneux.murGlacéGauche, 540+ x, 420+ y);
		game.getBatch().draw(ClimatMontagneux.cheminGlaceHori, 540+ x, 360+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéInf, 480+ x, 360+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéInfGau, 420+ x, 360+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéInfGau, 360+ x, 420+ y);

        game.getBatch().draw(ClimatMontagneux.planteGelé,0+ x, 60+ y);
        game.getBatch().draw(ClimatMontagneux.planteGelé3,0+ x, 180+ y);

		game.getBatch().draw(ClimatMontagneux.tree, -40+ x, 300+ y);
		game.getBatch().draw(ClimatMontagneux.tree, -40+ x, 240+ y);
		game.getBatch().draw(ClimatMontagneux.tree, -40+ x, 180+ y);
		game.getBatch().draw(ClimatMontagneux.tree, -40+ x, 120+ y);
		game.getBatch().draw(ClimatMontagneux.tree, -40+ x, 60+ y);
		game.getBatch().draw(ClimatMontagneux.tree, -40+ x, 0+ y);
		game.getBatch().draw(ClimatMontagneux.tree, -40+ x, -60+ y);

//
        game.getBatch().draw(ClimatMontagneux.planteGelé, 180+ x, 180+ y);
        game.getBatch().draw(ClimatMontagneux.planteGelé3, 120+ x, 140+ y);
        game.getBatch().draw(ClimatMontagneux.planteGelé3, 260+ x, 100+ y);
        game.getBatch().draw(ClimatMontagneux.planteGelé3, 70+ x, 70+ y);
        game.getBatch().draw(ClimatMontagneux.planteGelé3, 70+ x, 240+ y);
        game.getBatch().draw(ClimatMontagneux.planteGelé, 180+ x, 10+ y);
        game.getBatch().draw(ClimatMontagneux.planteGelé3, 300+ x, 10+ y);
        game.getBatch().draw(ClimatMontagneux.planteGelé3, 300+ x, 180+ y);
        game.getBatch().draw(ClimatMontagneux.planteGelé, 360+ x, 70+ y);
        game.getBatch().draw(ClimatMontagneux.planteGelé, 420+ x, 130+ y);
        game.getBatch().draw(ClimatMontagneux.planteGelé, 480+ x, 420+ y);
        game.getBatch().draw(ClimatMontagneux.planteGelé3, 360+ x, 420+ y);

        game.getBatch().draw(ClimatMontagneux.grossePierre, 480+ x, 10+ y);


        game.getBatch().draw(ClimatMontagneux.tree, 70+ x, 360+ y);
        game.getBatch().draw(ClimatMontagneux.tree, 70+ x, 300+ y);
        game.getBatch().draw(ClimatMontagneux.tree, 130+ x, 300+ y);
        game.getBatch().draw(ClimatMontagneux.tree, 190+ x, 300+ y);
        game.getBatch().draw(ClimatMontagneux.tree, 540+ x, 120+ y);
        game.getBatch().draw(ClimatMontagneux.tree, 480+ x, 120+ y);
        game.getBatch().draw(ClimatMontagneux.tree, 540+ x, 370+ y);

//
		game.getBatch().draw(Arc.tombe, 200+ x, 200+ y);
        game.getBatch().draw(Arc.tombe, 120+ x, 150+ y);
        game.getBatch().draw(Arc.tombe, 160+ x, 70+ y);

//
        if ( étatTexteTombe == 1 ) game.getBatch().draw(Arc.texte0, 100+ x, 10+ y);
        else if ( étatTexteTombe == 2 ) game.getBatch().draw(Arc.indiceArc1, 100+ x, 10+ y);
        else if ( étatTexteTombe == 3 ) game.getBatch().draw(Arc.indiceArc2, 100+ x, 10+ y);

//

		if ( ouvertureCoffre == false ) game.getBatch().draw(ClimatMontagneux.coffreBleuFermé, 20+ x, 300+ y);
		else {
			if ( coffreOuvert == false ) {
				if ( Coffre.ouvert1 == true && Coffre.ouvert2 == true ){
					coffreOuvert = true;
				}
				Coffre.annimationCoffreBleu(game, 20, 300);

			} else {
				game.getBatch().draw(ClimatMontagneux.coffreBleuOuvert3, 20+ x, 300+ y);
			}

		}
        if ( MainMenu.Link.annimationAward ) {
            game.getBatch().draw(Essence.essenceJaune,MainMenu.Link.getX() +5, MainMenu.Link.getY() + 50);
            game.getBatch().draw(Essence.texteEssence10 , 100,30);
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

        if ( istombeCreated) MainMenu.world.destroyBody(tombe);
        istombeCreated = false;

        if ( istombe2Created) MainMenu.world.destroyBody(tombe2);
        istombe2Created = false;

        if ( istombe3Created) MainMenu.world.destroyBody(tombe3);
        istombe3Created = false;

        if ( isBosquet1Created) MainMenu.world.destroyBody(bosquet1);
        isBosquet1Created = false;

        if ( isBosquet2Created) MainMenu.world.destroyBody(bosquet2);
        isBosquet2Created = false;

        if ( isBosquet3Created) MainMenu.world.destroyBody(bosquet3);
        isBosquet3Created = false;


        if ( isGrossePierre1Created) MainMenu.world.destroyBody(grossePierre1);
        isGrossePierre1Created = false;
		
	}

	public static void createBodyAndType(World world) {
		// TODO Auto-generated method stub

		CadrillageMap.setTypeDeDécor(0,300/60, "coffreBleu");


		if ( isCote1Created == false ) {
			cote1 = ClimatMontagneux.createBody(0,240,1,480);
			isCote1Created = true;
		}
		if ( isCote2Created == false ) {
			cote2 = ClimatMontagneux.createBody(50,240,1,480);
			isCote2Created = true;
		}
		if ( isCote3Created == false ) {
			cote3 = ClimatMontagneux.createBody(330,0,540,1);
			isCote3Created = true;
		}
		if ( isCote4Created == false ) {
			cote4 = ClimatMontagneux.createBody(25,360,60,120);
			isCote4Created = true;
		}

        if ( istombeCreated == false ) {
            tombe = ClimatMontagneux.createBodyPerso("grossePierre", "static",200,200);
            istombeCreated = true;
        }
        CadrillageMap.setTypeDeDécor(3,4,"tombe");

        détectionTombe(MainMenu.Link);


        if ( istombe2Created == false ) {
            tombe2 = ClimatMontagneux.createBodyPerso("grossePierre", "static",120,150);
            istombe2Created = true;
        }

        if ( istombe3Created == false ) {
            tombe3 = ClimatMontagneux.createBodyPerso("grossePierre", "static",160,70);
            istombe3Created = true;
        }

        if ( isBosquet1Created == false ) {
            bosquet1 = ClimatMontagneux.createBody(150,330,180,60);
            isBosquet1Created = true;
        }
        if ( isBosquet2Created == false ) {
            bosquet2 = ClimatMontagneux.createBody(530,150,120,60);
            isBosquet2Created = true;
        }
        if ( isBosquet3Created == false ) {
            bosquet3 = ClimatMontagneux.createBody(550,450,60,120);
            isBosquet3Created = true;
        }

        if ( isGrossePierre1Created == false ) {
            grossePierre1 = ClimatMontagneux.createBodyPerso("grossePierre", "static",480,10);
            isGrossePierre1Created = true;
        }
	}

	public static void destroyType() {
		// TODO Auto-generated method stub
		
	}
// **********************************************

    public static int étatTexteTombe = 0;
    public static void détectionTombe(MainCharacter Link){
        if (CadrillageMap.typeDeDécor[(int) (Link.getBody().getPosition().x * MainMenu.PPM / 60)][(int) (Link.getBody().getPosition().y * MainMenu.PPM / 60) + 1].equals("tombe")) {
            if ( étatTexteTombe == 0 ) étatTexteTombe ++;
            Link.setTexture(MainCharacter.linkHautRepos);
            Link.getBody().setLinearVelocity(0,0);
        }
    }

    public static void updateTombe(float dt){
        if (Gdx.input.isKeyJustPressed(Input.Keys.ENTER) ){
            if ( étatTexteTombe < 3) étatTexteTombe ++;
            else {
                étatTexteTombe = 0;
                MainMenu.Link.getBody().setTransform(MainMenu.Link.getBody().getPosition().x  , MainMenu.Link.getBody().getPosition().y -10 , 0);
                MainMenu.Link.setTexture(MainCharacter.linkBasRepos);
            }
        }
    }
}
