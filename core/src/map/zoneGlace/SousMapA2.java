package map.zoneGlace;

import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.physics.box2d.Body;
import com.badlogic.gdx.physics.box2d.World;
import com.mygdx.game.GameMain;

import characters.Boss;
import characters.MainCharacter;
import decors.ClimatMontagneux;
import items.CoeurDeVie;
import map.CadrillageMap;
import scenes.MainMenu;


public class SousMapA2 extends Sprite{


    public static boolean isReceptaclePris = false; // à sauvegarder
		
//	murs gauches
	
	public static Body bodyMurGauche2;	
	public static boolean isBodyMurGauche2Created;


	public static boolean isTonneau1Cut = false;


	public static Body Tonneau1;
	public static boolean isTonneau1Created;
	
	
	public static void sousMap(GameMain game, int x, int y){
		
		
		ClimatMontagneux.eauProfondeGlacée(game,0+ x, 0+y);
		ClimatMontagneux.eauProfondeGlacée(game,0+ x, 60+y);
		ClimatMontagneux.eauProfondeGlacée(game,0+ x, 120+y);
		ClimatMontagneux.eauProfondeGlacée(game,0+ x, 180+y);
		ClimatMontagneux.eauProfondeGlacée(game,0+ x, 240+y);
		ClimatMontagneux.eauProfondeGlacée(game,0+ x, 300+y);
		ClimatMontagneux.eauProfondeGlacée(game,0+ x, 360+y);
		ClimatMontagneux.eauProfondeGlacée(game,0+ x, 420+y);
		
		
		ClimatMontagneux.eauProfondeGlacée(game,60+ x, 0+y);
		ClimatMontagneux.eauProfondeGlacée(game,60+ x, 60+y);
		ClimatMontagneux.eauProfondeGlacée(game,60+ x, 120+y);
		ClimatMontagneux.eauProfondeGlacée(game,60+ x, 180+y);
		ClimatMontagneux.eauProfondeGlacée(game,60+ x, 240+y);
		ClimatMontagneux.eauProfondeGlacée(game,60+ x, 300+y);
		ClimatMontagneux.eauProfondeGlacée(game,60+ x, 360+y);
		ClimatMontagneux.eauProfondeGlacée(game,60+ x, 420+y);
		
		ClimatMontagneux.eauProfondeGlacée(game,120+ x, 0+y);
		ClimatMontagneux.eauProfondeGlacée(game,120+ x, 60+y);
		ClimatMontagneux.eauProfondeGlacée(game,120+ x, 120+y);
		ClimatMontagneux.eauProfondeGlacée(game,120+ x, 180+y);
		ClimatMontagneux.eauProfondeGlacée(game,120+ x, 240+y);
		ClimatMontagneux.eauProfondeGlacée(game,120+ x, 300+y);
		ClimatMontagneux.eauProfondeGlacée(game,120+ x, 360+y);
		ClimatMontagneux.eauProfondeGlacée(game,120+ x, 420+y);
		
		
		ClimatMontagneux.eauProfondeGlacée(game,180+ x, 0+y);
		ClimatMontagneux.eauProfondeGlacée(game,180+ x, 60+y);
		ClimatMontagneux.eauProfondeGlacée(game,180+ x, 120+y);
		ClimatMontagneux.eauProfondeGlacée(game,180+ x, 180+y);
		ClimatMontagneux.eauProfondeGlacée(game,180+ x, 240+y);
		ClimatMontagneux.eauProfondeGlacée(game,180+ x, 300+y);
		ClimatMontagneux.eauProfondeGlacée(game,180+ x, 360+y);
		ClimatMontagneux.eauProfondeGlacée(game,180+ x, 420+y);
		
		ClimatMontagneux.eauProfondeGlacée(game,240+ x, 0+y);
		ClimatMontagneux.eauProfondeGlacée(game,240+ x, 60+y);
		game.getBatch().draw(ClimatMontagneux.glace2,240+ x, 120+y);
		game.getBatch().draw(ClimatMontagneux.glace2,240+ x, 180+y);
		game.getBatch().draw(ClimatMontagneux.glace2,240+ x, 240+y);
		game.getBatch().draw(ClimatMontagneux.glace2,240+ x, 300+y);
		game.getBatch().draw(ClimatMontagneux.glace2,240+ x, 360+y);
		ClimatMontagneux.eauProfondeGlacée(game,240+ x, 420+y);
		
		ClimatMontagneux.eauProfondeGlacée(game,300+ x, 0+y);
		ClimatMontagneux.eauProfondeGlacée(game,300+ x, 60+y);
		game.getBatch().draw(ClimatMontagneux.glace2,300+ x, 120+y);
		game.getBatch().draw(ClimatMontagneux.glace2,300+ x, 180+y);
		game.getBatch().draw(ClimatMontagneux.glace2,300+ x, 240+y);
		game.getBatch().draw(ClimatMontagneux.glace2,300+ x, 300+y);
		game.getBatch().draw(ClimatMontagneux.glace2,300+ x, 360+y);
		game.getBatch().draw(ClimatMontagneux.glace2,300+ x, 420+y);
		
		ClimatMontagneux.eauProfondeGlacée(game,360+ x, 0+y);
		ClimatMontagneux.eauProfondeGlacée(game,360+ x, 60+y);
		game.getBatch().draw(ClimatMontagneux.glace2,360+ x, 120+y);
		game.getBatch().draw(ClimatMontagneux.glace2,360+ x, 180+y);
		game.getBatch().draw(ClimatMontagneux.glace2,360+ x, 240+y);
		game.getBatch().draw(ClimatMontagneux.glace2,360+ x, 300+y);
		game.getBatch().draw(ClimatMontagneux.glace2,360+ x, 360+y);
		game.getBatch().draw(ClimatMontagneux.glace2,360+ x, 420+y);
		
		ClimatMontagneux.eauProfondeGlacée(game,420+ x, 0+y);
		ClimatMontagneux.eauProfondeGlacée(game,420+ x, 60+y);
		game.getBatch().draw(ClimatMontagneux.glace2,420+ x, 120+y);
		game.getBatch().draw(ClimatMontagneux.glace2,420+ x, 180+y);
		game.getBatch().draw(ClimatMontagneux.glace2,420+ x, 240+y);
		game.getBatch().draw(ClimatMontagneux.glace2,420+ x, 300+y);
		game.getBatch().draw(ClimatMontagneux.glace2,420+ x, 360+y);
		game.getBatch().draw(ClimatMontagneux.glace2,420+ x, 420+y);
		
		ClimatMontagneux.eauProfondeGlacée(game,480+ x, 0+y);
		ClimatMontagneux.eauProfondeGlacée(game,480+ x, 60+y);
		game.getBatch().draw(ClimatMontagneux.glace2,480+ x, 120+y);
		game.getBatch().draw(ClimatMontagneux.glace2,480+ x, 180+y);
		game.getBatch().draw(ClimatMontagneux.glace2,480+ x, 240+y);
		game.getBatch().draw(ClimatMontagneux.glace2,480+ x, 300+y);
		game.getBatch().draw(ClimatMontagneux.glace2,480+ x, 360+y);
		game.getBatch().draw(ClimatMontagneux.glace2,480+ x, 420+y);
		
		ClimatMontagneux.eauProfondeGlacée(game,540+ x, 0+y);
		game.getBatch().draw(ClimatMontagneux.glace2,540+ x, 60+y);
		game.getBatch().draw(ClimatMontagneux.glace2,540+ x, 120+y);
		game.getBatch().draw(ClimatMontagneux.glace2,540+ x, 180+y);
		game.getBatch().draw(ClimatMontagneux.glace2,540+ x, 240+y);
		game.getBatch().draw(ClimatMontagneux.glace2,540+ x, 300+y);
		game.getBatch().draw(ClimatMontagneux.glace2,540+ x, 360+y);
		game.getBatch().draw(ClimatMontagneux.glace2,540+ x, 420+y);
		
		game.getBatch().draw(ClimatMontagneux.glaceFragmentéHautGauche,300+x,420+y);
		game.getBatch().draw(ClimatMontagneux.glaceFragmentée,360+x,420+y);
		game.getBatch().draw(ClimatMontagneux.glaceFragmentée,420+x,420+y);
		game.getBatch().draw(ClimatMontagneux.glaceFragmentée,480+x,420+y);
		game.getBatch().draw(ClimatMontagneux.glaceFragmentée,540+x,420+y);
		
		game.getBatch().draw(ClimatMontagneux.glaceFragmentéHautGauche,240+x,360+y);
		game.getBatch().draw(ClimatMontagneux.glaceFragmentée,300+x,360+y);
		game.getBatch().draw(ClimatMontagneux.glaceFragmentée,360+x,360+y);
		game.getBatch().draw(ClimatMontagneux.glaceFragmentée,420+x,360+y);
		game.getBatch().draw(ClimatMontagneux.glaceFragmentée,480+x,360+y);
		game.getBatch().draw(ClimatMontagneux.glaceFragmentée,540+x,360+y);
		
		game.getBatch().draw(ClimatMontagneux.petitMorceauGlaceGauche,180+x,300+y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéSupGau,240+x,300+y);
		game.getBatch().draw(ClimatMontagneux.bordMerGlacéSup,300+x,300+y);
		game.getBatch().draw(ClimatMontagneux.bordMerGlacéSup,360+x,300+y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéSup,420+x,300+y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéSup,480+x,300+y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéSup,540+x,300+y);
		
		game.getBatch().draw(ClimatMontagneux.petitMorceauGlaceGauche,180+x,240+y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéGau,240+x,240+y);
		game.getBatch().draw(ClimatMontagneux.glace1,300+x,240+y);
		game.getBatch().draw(ClimatMontagneux.glace1,360+x,240+y);
		game.getBatch().draw(ClimatMontagneux.glace1,420+x,240+y);
		game.getBatch().draw(ClimatMontagneux.glace1,480+x,240+y);
		game.getBatch().draw(ClimatMontagneux.glace1,540+x,240+y);
		
		game.getBatch().draw(ClimatMontagneux.petitMorceauGlaceGauche,180+x,180+y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéInfGau,240+x,180+y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéInf,300+x,180+y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéInf,360+x,180+y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéInf,420+x,180+y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéInf,480+x,180+y);
		game.getBatch().draw(ClimatMontagneux.glace1,540+x,180+y);
		
		game.getBatch().draw(ClimatMontagneux.morceauGlaceBasGauche,180+x,120+y);
		game.getBatch().draw(ClimatMontagneux.bordGlaceFragmentéeBasGauche,240+x,120+y);
		game.getBatch().draw(ClimatMontagneux.bordGlaceFragmentée,300+x,120+y);
		game.getBatch().draw(ClimatMontagneux.bordGlaceFragmentée,360+x,120+y);
		game.getBatch().draw(ClimatMontagneux.bordGlaceFragmentée,420+x,120+y);
		game.getBatch().draw(ClimatMontagneux.bordGlaceFragmentée,480+x,120+y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéInfGau,540+x,120+y);
		
		game.getBatch().draw(ClimatMontagneux.morceauGlacéInf,300+x,60+y);
		game.getBatch().draw(ClimatMontagneux.morceauGlacéInf,360+x,60+y);
		game.getBatch().draw(ClimatMontagneux.morceauGlacéInf,420+x,60+y);
		game.getBatch().draw(ClimatMontagneux.morceauGlacéInf,480+x,60+y);
		game.getBatch().draw(ClimatMontagneux.bordGlaceFragmentéeBasGauche,540+x,60+y);

//

        game.getBatch().draw(ClimatMontagneux.planteGelé, 240+ x, 300+ y);
        game.getBatch().draw(ClimatMontagneux.planteGelé3, 540+ x, 240+ y);
        game.getBatch().draw(ClimatMontagneux.planteGelé3, 240+ x, 180+ y);

        game.getBatch().draw(ClimatMontagneux.planteGelé3, 300+ x,240+ y);
        game.getBatch().draw(ClimatMontagneux.planteGelé3, 420+ x, 180+ y);
        game.getBatch().draw(ClimatMontagneux.planteGelé, 420+ x, 300+ y);

        game.getBatch().draw(ClimatMontagneux.planteGelé, 480+ x, 240+ y);
        game.getBatch().draw(ClimatMontagneux.planteGelé, 540+ x, 120+ y);
//

        ClimatMontagneux.crate(isTonneau1Cut ,  game , 300 + x , 300 + y);

        if ( isReceptaclePris && MainMenu.Link.annimationAward ) {
            game.getBatch().draw(CoeurDeVie.receptacleDeCoeur, MainMenu.Link.getX() - 7+ x, MainMenu.Link.getY() + 50+ y);
            game.getBatch().draw(CoeurDeVie.texteRéceptacle, 100 + x, 60+y);
        }

        if (MainCharacter.etatScenario >= 0 && MainCharacter.etatScenario <= 5 ) {
            game.getBatch().draw(MainCharacter.zeldaGauche , 240 +x , 200 + y);
            if ( MainCharacter.etatScenario == 0 ) game.getBatch().draw(Boss.texte1,100,60);
            else if ( MainCharacter.etatScenario == 1 ) game.getBatch().draw(Boss.texte2,100,60);
            else if ( MainCharacter.etatScenario == 2 ) game.getBatch().draw(Boss.texte3,100,60);
            else if ( MainCharacter.etatScenario == 3 ) game.getBatch().draw(Boss.texte4,100,60);
            else if ( MainCharacter.etatScenario == 4 ) game.getBatch().draw(Boss.texte5,100,60);
            if ( MainCharacter.etatScenario == 5 ) {
                game.getBatch().draw(MainCharacter.exclamation , 280 + x , 220 + y );
                game.getBatch().draw(Boss.boss1Bas1 ,
                        MainMenu.Link.getX() , MainMenu.Link.getY() +10);
                game.getBatch().draw(Boss.texte6,100,60);
            }
        } else if ( MainCharacter.etatScenario == 6  ) {
            game.getBatch().draw(Boss.boss1Droite1 ,260+x, 200+ y );
            game.getBatch().draw(MainCharacter.zeldaKidna ,260+x, 260+ y );
            game.getBatch().draw(Boss.texte7,100,60);
        } else if ( MainCharacter.etatScenario == 7 )  {
            Boss.transformation(game, 260 + x , 200 + y );
            game.getBatch().draw(MainCharacter.zeldaKidna ,260+x, 260+ y );
            game.getBatch().draw(Boss.texte8,100,60);
        } else if ( MainCharacter.etatScenario == 8 ) {
            if ( MainCharacter.opacité <1 ){
                MainCharacter.cacheNoir.setAlpha(MainCharacter.opacité);
                MainCharacter.cacheNoir.draw(game.getBatch());
                MainCharacter.opacité+=0.005f;
            } else {
                MainCharacter.etatScenario = 9 ;
                MainMenu.Link.setTexture(MainCharacter.linkBasRepos);
                MainCharacter.opacité = 0;
            }
        } else if ( MainCharacter.etatScenario == 9) {
            game.getBatch().draw(Boss.texte9,100,60);
        }
	
	}
	
	public static void createBodyAndType(World world){


        if ( CadrillageMap.décorChangé[5][5] == true ) isTonneau1Cut = true;

        CadrillageMap.setTypeDeDécor(5,5,"HerbesHautes");

        if ( isTonneau1Cut && !(isReceptaclePris)) CadrillageMap.setTypeDeDécor(5, 5, "receptacleDeCoeur");

        destroyBody();

        if ( isTonneau1Created == false && ! isTonneau1Cut) {
            Tonneau1 = ClimatMontagneux.createBodyPerso("tonneau", "static",300,300);
            isTonneau1Created = true;
        }
		
//		murs gauches
		
		if ( isBodyMurGauche2Created == false ) {
			bodyMurGauche2 = ClimatMontagneux.createBody(0,240,1,480);
			isBodyMurGauche2Created = true;
		}
		
	
		
	}
	
	public static void destroyBody(){
		
//		murs gauches
		
		if ( isBodyMurGauche2Created)MainMenu.world.destroyBody(bodyMurGauche2);
		isBodyMurGauche2Created = false;

        if ( isTonneau1Created) MainMenu.world.destroyBody(Tonneau1);
        isTonneau1Created = false;
	}

	
	
}
