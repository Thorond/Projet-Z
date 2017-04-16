package map.zoneGlace;

import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.physics.box2d.Body;
import com.badlogic.gdx.physics.box2d.World;
import com.mygdx.game.GameMain;

import decors.ClimatMontagneux;
import map.CadrillageMap;
import scenes.MainMenu;

public class SousMapC4 extends Sprite{

	public static Body mur1 ;
	public static boolean ismur1Created;
	public static Body mur2 ;
	public static boolean ismur2Created;
	public static Body mur3 ;
	public static boolean ismur3Created;
	public static Body mur4 ;
	public static boolean ismur4Created;
	
	public static Body bosquet2 ;
	public static boolean isBosquet2Created;


    public static boolean isBuisson1Cut = false;
    public static boolean isBuisson2Cut = false;
    public static boolean isBuisson3Cut = false;
    public static boolean isBuisson4Cut = false;
    public static boolean isBuisson5Cut = false;
    public static boolean isBuisson6Cut = false;
    public static boolean isBuisson7Cut = false;

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
		
		
		game.getBatch().draw(ClimatMontagneux.arbreBasDroite, 0+ x, 420+ y);
		
//		
		game.getBatch().draw(ClimatMontagneux.bordGlacéGau, 240+ x, 420+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéGau, 240+ x, 360+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéSup, 180+ x, 300+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéSup, 120+ x, 300+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéSup, 60+ x, 300+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéSup, 0+ x, 300+ y);
		
		game.getBatch().draw(ClimatMontagneux.bordGlacéGau, 300+ x, 420+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéGau, 300+ x, 360+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéGau, 300+ x, 300+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéSup, 240+ x, 240+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéSup, 180+ x, 240+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéSup, 120+ x, 240+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéSup, 60+ x, 240+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéSup, 0+ x, 240+ y);
		

		game.getBatch().draw(ClimatMontagneux.bordGlacéInf, 0+ x, 180+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéInf, 60+ x, 180+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéInf, 120+ x, 180+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéInf, 180+ x, 180+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéInf, 240+ x, 180+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéInf, 300+ x, 180+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéInf, 360+ x, 180+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéInfDroi, 420+ x, 180+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéInfDroi, 480+ x, 240+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéInf, 540+ x, 300+ y);


		game.getBatch().draw(ClimatMontagneux.herbeGlace120, 360+ x, 420+ y);

		ClimatMontagneux.eauProfonde(game,00+x,0+y);
		ClimatMontagneux.eauProfonde(game,00+x,60+y);
		ClimatMontagneux.eauProfonde(game,00+x,120+y);
		ClimatMontagneux.eauProfonde(game,60+x,0+y);
		ClimatMontagneux.eauProfonde(game,60+x,60+y);
		ClimatMontagneux.eauProfonde(game,60+x,120+y);
		ClimatMontagneux.eauProfonde(game,120+x,0+y);
		ClimatMontagneux.eauProfonde(game,120+x,60+y);
		ClimatMontagneux.eauProfonde(game,120+x,120+y);
		ClimatMontagneux.eauProfonde(game,180+x,0+y);
		ClimatMontagneux.eauProfonde(game,180+x,60+y);
		ClimatMontagneux.eauProfonde(game,180+x,120+y);
		ClimatMontagneux.eauProfonde(game,240+x,0+y);
		ClimatMontagneux.eauProfonde(game,240+x,60+y);
		ClimatMontagneux.eauProfonde(game,240+x,120+y);
		ClimatMontagneux.eauProfonde(game,300+x,0+y);
		ClimatMontagneux.eauProfonde(game,300+x,60+y);
		ClimatMontagneux.eauProfonde(game,300+x,120+y);
		ClimatMontagneux.eauProfonde(game,360+x,0+y);
		ClimatMontagneux.eauProfonde(game,360+x,60+y);
		ClimatMontagneux.eauProfonde(game,360+x,120+y);
		ClimatMontagneux.eauProfonde(game,420+x,0+y);
		ClimatMontagneux.eauProfonde(game,420+x,60+y);
		ClimatMontagneux.eauProfonde(game,420+x,120+y);
		ClimatMontagneux.eauProfonde(game,480+x,0+y);
		ClimatMontagneux.eauProfonde(game,480+x,60+y);
		ClimatMontagneux.eauProfonde(game,480+x,120+y);
		ClimatMontagneux.eauProfonde(game,480+x,180+y);
		ClimatMontagneux.eauProfonde(game,540+x,0+y);
		ClimatMontagneux.eauProfonde(game,540+x,60+y);
		ClimatMontagneux.eauProfonde(game,540+x,120+y);
		ClimatMontagneux.eauProfonde(game,540+x,180+y);
		ClimatMontagneux.eauProfonde(game,540+x,240+y);


        game.getBatch().draw(ClimatMontagneux.tree, 360+ x, 200+ y);
        game.getBatch().draw(ClimatMontagneux.tree, 420+ x, 200+ y);
        game.getBatch().draw(ClimatMontagneux.tree, 480+ x, 260+ y);



//		buissons

        game.getBatch().draw(ClimatMontagneux.planteGelé, 480+ x, 360+ y);
        game.getBatch().draw(ClimatMontagneux.planteGelé3, 240+ x, 310+ y);
        game.getBatch().draw(ClimatMontagneux.planteGelé3, 310+ x, 350+ y);
        game.getBatch().draw(ClimatMontagneux.planteGelé, 240+ x, 190+ y);
        game.getBatch().draw(ClimatMontagneux.planteGelé3, 180+ x, 420+ y);
        game.getBatch().draw(ClimatMontagneux.planteGelé, 60+ x, 240+ y);
        game.getBatch().draw(ClimatMontagneux.planteGelé3, 50+ x, 360+ y);


        ClimatMontagneux.buisson(isBuisson1Cut,game, 300+x, 240+y);
        ClimatMontagneux.buisson(isBuisson2Cut,game, 360+x, 300+y);
        ClimatMontagneux.buisson(isBuisson3Cut,game, 360+x, 360+y);
        ClimatMontagneux.buisson(isBuisson4Cut,game, 420+x, 300+y);
        ClimatMontagneux.buisson(isBuisson5Cut,game, 420+x, 360+y);
        ClimatMontagneux.buisson(isBuisson6Cut,game, 120+x, 180+y);
        ClimatMontagneux.buisson(isBuisson7Cut,game, 540+x, 420+y);

	}

	public static void destroyBody() {
		// TODO Auto-generated method stub
		if ( ismur1Created) MainMenu.world.destroyBody(mur1);
		ismur1Created = false;
		if ( ismur2Created) MainMenu.world.destroyBody(mur2);
		ismur2Created = false;
		if ( ismur3Created) MainMenu.world.destroyBody(mur3);
		ismur3Created = false;
		if ( ismur4Created) MainMenu.world.destroyBody(mur4);
		ismur4Created = false;
		
		if ( isBosquet2Created) MainMenu.world.destroyBody(bosquet2);
		isBosquet2Created = false;
	}

	public static void createBodyAndType(World world) {
		// TODO Auto-generated method stub

		
		if ( ismur1Created == false ) {
			mur1 = ClimatMontagneux.createBody(120,345,220,1);
			ismur1Created = true;
		}
		if ( ismur2Created == false ) {
			mur2 = ClimatMontagneux.createBody(140,285,270,1);
			ismur2Created = true;
		}
		if ( ismur3Created == false ) {
			mur3 = ClimatMontagneux.createBody(225,420,1,120);
			ismur3Created = true;
		}
		if ( ismur4Created == false ) {
			mur4 = ClimatMontagneux.createBody(285,390,1,180);
			ismur4Created = true;
		}
		
		if ( isBosquet2Created == false ) {
			bosquet2 = ClimatMontagneux.createBody(10,450,60,40);
			isBosquet2Created = true;
		}

        CadrillageMap.setTypeDeDécor(5,4,"HerbesHautes");
        CadrillageMap.setTypeDeDécor(6,5,"HerbesHautes");
        CadrillageMap.setTypeDeDécor(6,6,"HerbesHautes");
        CadrillageMap.setTypeDeDécor(7,5,"HerbesHautes");
        CadrillageMap.setTypeDeDécor(7,6,"HerbesHautes");
        CadrillageMap.setTypeDeDécor(2,3,"HerbesHautes");
        CadrillageMap.setTypeDeDécor(9,7,"HerbesHautes");
        if ( CadrillageMap.décorChangé[5][4] == true ) isBuisson1Cut = true;
        if ( CadrillageMap.décorChangé[6][5] == true ) isBuisson2Cut = true;
        if ( CadrillageMap.décorChangé[6][6] == true ) isBuisson3Cut = true;
        if ( CadrillageMap.décorChangé[7][5] == true ) isBuisson4Cut = true;
        if ( CadrillageMap.décorChangé[7][6] == true ) isBuisson5Cut = true;
        if ( CadrillageMap.décorChangé[2][3] == true ) isBuisson6Cut = true;
        if ( CadrillageMap.décorChangé[9][7] == true ) isBuisson7Cut = true;
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
