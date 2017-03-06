package map;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.physics.box2d.Body;
import com.badlogic.gdx.physics.box2d.World;
import com.mygdx.game.GameMain;

import characters.Pnj;
import décors.HerbesBasses;
import décors.HerbesHautes;
import décors.MurDroitSolideHaut;
import décors.RacineGaucheArbre;
import scenes.MainMenu;

public class SousMapB1 extends Sprite {
	
	public static Texture sousMapB1 = new Texture("Corps.png");
	
	public static Body body1;
	public static boolean isBody1Created;
	public static Body body2;
	public static boolean isBody2Created;
	
	public static Body bodyMur1;
	public static Body bodyMur2;
	public static Body bodyMur3;
	public static Body bodyMur4;
	public static Body bodyMur5;
	public static Body bodyMur6;
	public static Body bodyMur7;
	public static Body bodyMur8;
	public static Body bodyMur9;
	public static Body bodyMur10;
	public static boolean isBodyMur1Created;
	public static boolean isBodyMur2Created;
	public static boolean isBodyMur3Created;
	public static boolean isBodyMur4Created;
	public static boolean isBodyMur5Created;
	public static boolean isBodyMur6Created;
	public static boolean isBodyMur7Created;
	public static boolean isBodyMur8Created;
	public static boolean isBodyMur9Created;
	public static boolean isBodyMur10Created;
	
	public static Pnj monstre1;
	public static Pnj monstre2;
	public static Pnj monstre3;
	public static boolean m1EstCrée = false ;
	public static boolean m2EstCrée = false ;
	public static boolean m3EstCrée = false ;
	
	public static boolean monstresPrésent = true;
	public static Pnj[] monstres = new Pnj[3];
	
	public static void sousMapB1(GameMain game, int x, int y){
		
		
		if ( Map.décorChangé[0][0] == false ) game.getBatch().draw(HerbesHautes.gazon, 0+x, 0+y);
		else game.getBatch().draw(HerbesBasses.gazonNeutre, 0 + x, 0 + y);
		game.getBatch().draw(HerbesBasses.gazonNeutre, 0 + x, 60 + y);
		game.getBatch().draw(HerbesHautes.gazon, 0+ x, 120+ y);
		game.getBatch().draw(HerbesHautes.gazon, 0+ x, 180+ y);		
		if ( Map.décorChangé[0][240 /60 ] == false ) game.getBatch().draw(HerbesHautes.gazon, 0+x, 240+y);
		else game.getBatch().draw(HerbesBasses.gazonNeutre, 0 + x, 240+y);
		game.getBatch().draw(HerbesHautes.gazon, 0+ x, 300+ y);
		game.getBatch().draw(HerbesHautes.gazon, 0+ x, 360+ y);
		game.getBatch().draw(MurDroitSolideHaut.murDroitSolideHaut, 0+ x, 420+ y);
		
		
		game.getBatch().draw(HerbesHautes.gazon, 60+ x, 0+ y);
		game.getBatch().draw(HerbesHautes.gazon, 60+ x, 60+ y);
		game.getBatch().draw(HerbesHautes.gazon, 60+ x, 120+ y);
		game.getBatch().draw(HerbesHautes.gazon, 60+ x, 180+ y);		
		if ( Map.décorChangé[60 / 60 ][ 240 / 60] == false ) game.getBatch().draw(HerbesHautes.gazon, 60+ x, 240+ y);
		else game.getBatch().draw(HerbesBasses.gazonNeutre, 60+ x, 240+ y);	
		game.getBatch().draw(HerbesHautes.gazon, 60+ x, 300+ y);
		game.getBatch().draw(HerbesHautes.gazon, 60+ x, 360+ y);
		game.getBatch().draw(MurDroitSolideHaut.murDroitSolideHaut, 60+ x, 420+ y);
		
		game.getBatch().draw(HerbesHautes.gazon, 120+ x, 0+ y);
		game.getBatch().draw(HerbesHautes.gazon, 120+ x, 60+ y);
		game.getBatch().draw(HerbesHautes.gazon, 120+ x, 120+ y);
		game.getBatch().draw(HerbesHautes.gazon, 120+ x, 180+ y);
		game.getBatch().draw(HerbesHautes.gazon, 120+ x, 240+ y);
		game.getBatch().draw(HerbesHautes.gazon, 120+ x, 300+ y);
		game.getBatch().draw(HerbesHautes.gazon, 120+ x, 360+ y);
		game.getBatch().draw(MurDroitSolideHaut.murDroitSolideHaut, 120+ x, 420+ y);
		
		game.getBatch().draw(HerbesHautes.gazon, 180+ x, 0+ y);
		game.getBatch().draw(HerbesHautes.gazon, 180+ x, 60+ y);
		game.getBatch().draw(HerbesHautes.gazon, 180+ x, 120+ y);
		game.getBatch().draw(HerbesHautes.gazon, 180+ x, 180+ y);
		game.getBatch().draw(HerbesHautes.gazon, 180+ x, 240+ y);
		game.getBatch().draw(HerbesHautes.gazon, 180+ x, 300+ y);
		game.getBatch().draw(HerbesHautes.gazon, 180+ x, 360+ y);
		game.getBatch().draw(MurDroitSolideHaut.murDroitSolideHaut, 180+ x, 420+ y);
		
		game.getBatch().draw(HerbesHautes.gazon, 240+ x, 0+ y);
		game.getBatch().draw(HerbesHautes.gazon, 240+ x, 60+ y);
		game.getBatch().draw(HerbesHautes.gazon, 240+ x, 120+ y);
		game.getBatch().draw(HerbesHautes.gazon, 240+ x, 180+ y);
		game.getBatch().draw(HerbesHautes.gazon, 240+ x, 240+ y);
		game.getBatch().draw(HerbesHautes.gazon, 240+ x, 300+ y);
		game.getBatch().draw(HerbesHautes.gazon, 240+ x, 360+ y);
		game.getBatch().draw(MurDroitSolideHaut.murDroitSolideHaut, 240+ x, 420+ y);
		
		game.getBatch().draw(HerbesHautes.gazon, 300+ x, 0+ y);
		game.getBatch().draw(HerbesHautes.gazon, 300+ x, 60+ y);
		game.getBatch().draw(HerbesHautes.gazon, 300+ x, 120+ y);
		game.getBatch().draw(HerbesHautes.gazon, 300+ x, 180+ y);
		game.getBatch().draw(HerbesHautes.gazon, 300+ x, 240+ y);
		game.getBatch().draw(HerbesHautes.gazon, 300+ x, 300+ y);
		game.getBatch().draw(HerbesHautes.gazon, 300+ x, 360+ y);
		game.getBatch().draw(MurDroitSolideHaut.murDroitSolideHaut, 300+ x, 420+ y);
		
		game.getBatch().draw(HerbesHautes.gazon, 360+ x, 0+ y);
		game.getBatch().draw(HerbesHautes.gazon, 360+ x, 60+ y);
		game.getBatch().draw(HerbesHautes.gazon, 360+ x, 120+ y);
		game.getBatch().draw(HerbesHautes.gazon, 360+ x, 180+ y);
		game.getBatch().draw(HerbesHautes.gazon, 360+ x, 240+ y);
		game.getBatch().draw(RacineGaucheArbre.map6060, 360+ x, 300+ y);
		game.getBatch().draw(HerbesHautes.gazon, 360+ x, 360+ y);
		game.getBatch().draw(MurDroitSolideHaut.murDroitSolideHaut, 360+ x, 420+ y);
		
		game.getBatch().draw(HerbesHautes.gazon, 420+ x, 0+ y);
		game.getBatch().draw(HerbesHautes.gazon, 420+ x, 60+ y);
		game.getBatch().draw(HerbesHautes.gazon, 420+ x, 120+ y);
		game.getBatch().draw(RacineGaucheArbre.map6060, 420+ x, 180+ y);
		game.getBatch().draw(HerbesHautes.gazon, 420+ x, 240+ y);
		game.getBatch().draw(HerbesHautes.gazon, 420+ x, 300+ y);
		game.getBatch().draw(HerbesHautes.gazon, 420+ x, 360+ y);
		game.getBatch().draw(MurDroitSolideHaut.murDroitSolideHaut, 420+ x, 420+ y);
		
		game.getBatch().draw(HerbesHautes.gazon, 480+ x, 0+ y);
		game.getBatch().draw(HerbesHautes.gazon, 480+ x, 60+ y);
		game.getBatch().draw(HerbesHautes.gazon, 480+ x, 120+ y);
//		game.getBatch().draw(Trou.trou, 480, 180);
		game.getBatch().draw(HerbesHautes.gazon, 480+ x, 240+ y);
		game.getBatch().draw(HerbesHautes.gazon, 480+ x, 300+ y);
		game.getBatch().draw(HerbesHautes.gazon, 480+ x, 360+ y);
		game.getBatch().draw(MurDroitSolideHaut.murDroitSolideHaut, 480+ x, 420+ y);
		
		game.getBatch().draw(HerbesHautes.gazon, 540+ x, 0+ y);
		game.getBatch().draw(HerbesHautes.gazon, 540+ x, 60+ y);
		game.getBatch().draw(HerbesHautes.gazon, 540+ x, 120+ y);
		game.getBatch().draw(HerbesHautes.gazon, 540+ x, 180+ y);
		game.getBatch().draw(HerbesHautes.gazon, 540+ x, 240+ y);
		game.getBatch().draw(HerbesHautes.gazon, 540+ x, 300+ y);
		game.getBatch().draw(HerbesHautes.gazon, 540+ x, 360+ y);
		game.getBatch().draw(MurDroitSolideHaut.murDroitSolideHaut, 540+ x, 420+ y);
		
		
//		==================================================================
//						Placement des dessins des monstres
//		==================================================================
		
		if ( monstre1.isAlive() ) game.getBatch().draw(monstre1, monstre1.getBody().getPosition().x + x, monstre1.getBody().getPosition().y + y);
		if ( monstre2.isAlive() ) game.getBatch().draw(monstre2, monstre2.getBody().getPosition().x + x, monstre2.getBody().getPosition().y + y);
		if ( monstre3.isAlive() ) game.getBatch().draw(monstre3, monstre3.getBody().getPosition().x + x, monstre3.getBody().getPosition().y + y);
		
	}
	
	public static void createBodyAndType(World world){
		
		Map.setTypeDeDécor(0, 0, "HerbesHautes");
		
		Map.setTypeDeDécor(0, 240 / 60, "HerbesHautes");
		
		Map.setTypeDeDécor(60 / 60, 240 / 60, "HerbesHautes");
		
		if ( isBody1Created == false ) {
			body1 = RacineGaucheArbre.createBody(370,315);
			isBody1Created = true;
		}
		
		if ( isBody2Created == false ) {
			body2 = RacineGaucheArbre.createBody(430,200);
			isBody2Created = true;
		}
		
		Map.setTypeDeDécor(480/60, 180/60, "trou");
		
//		========================================================================================
//							Création des corps du mur supérieur
//		========================================================================================
		
		if ( isBodyMur1Created == false ) {
			bodyMur1 = MurDroitSolideHaut.createBody(0,430);
			isBodyMur1Created = true;
		}
		if ( isBodyMur2Created == false ) {
			bodyMur2 = MurDroitSolideHaut.createBody(60,430);
			isBodyMur2Created = true;
		}
		if ( isBodyMur3Created == false ) {
			bodyMur3 = MurDroitSolideHaut.createBody(120,430);
			isBodyMur3Created = true;
		}
		if ( isBodyMur4Created == false ) {
			bodyMur4 = MurDroitSolideHaut.createBody(180,430);
			isBodyMur4Created = true;
		}
		if ( isBodyMur5Created == false ) {
			bodyMur5 = MurDroitSolideHaut.createBody(240,430);
			isBodyMur5Created = true;
		}
		if ( isBodyMur6Created == false ) {
			bodyMur6 = MurDroitSolideHaut.createBody(300,430);
			isBodyMur6Created = true;
		}
		if ( isBodyMur7Created == false ) {
			bodyMur7 = MurDroitSolideHaut.createBody(360,430);
			isBodyMur7Created = true;
		}
		if ( isBodyMur8Created == false ) {
			bodyMur8 = MurDroitSolideHaut.createBody(420,430);
			isBodyMur8Created = true;
		}
		if ( isBodyMur9Created == false ) {
			bodyMur9 = MurDroitSolideHaut.createBody(480,430);
			isBodyMur9Created = true;
		}
		if ( isBodyMur10Created == false ) {
			bodyMur10 = MurDroitSolideHaut.createBody(540,430);
			isBodyMur10Created = true;
		}
		
		
//		========================================================================================
//									Création des corps des montres
//		========================================================================================
		
		if ( m1EstCrée == false ) {
			monstre1 = new Pnj(world , 20 , 10 , 4 , 350 , 200 , "bas") ;
			monstres[0] = monstre1;
			m1EstCrée = true;
		}
		else monstre1.déplacementAléa();

		if ( m2EstCrée == false ) {
			monstre2 = new Pnj(world , 20 , 10 , 4 , 100 , 200 , "bas") ;
			monstres[1] = monstre2;
			m2EstCrée = true;
		}
		else monstre2.déplacementAléa();

		if ( m3EstCrée == false ) {
			monstre3 = new Pnj(world , 20 , 10 , 4 , 150 , 400 , "bas") ;
			monstres[2] = monstre3;
			m3EstCrée = true;
		}
		else monstre3.déplacementAléa();
		
	}
	
	public static void destroyBody(){
//		déstruction du corps des arbres et des monstres
		MainMenu.world.destroyBody(body1);
		MainMenu.world.destroyBody(body2);
		MainMenu.world.destroyBody(monstre1.getBody());
		MainMenu.world.destroyBody(monstre2.getBody());
		MainMenu.world.destroyBody(monstre3.getBody());
		SousMapB1.isBody1Created = false;
		SousMapB1.isBody2Created = false;
		m1EstCrée = false;
		m2EstCrée = false;
		m3EstCrée = false;
//		déstruction du corps des murs
		MainMenu.world.destroyBody(bodyMur1);
		MainMenu.world.destroyBody(bodyMur2);
		MainMenu.world.destroyBody(bodyMur3);
		MainMenu.world.destroyBody(bodyMur4);
		MainMenu.world.destroyBody(bodyMur5);
		MainMenu.world.destroyBody(bodyMur6);
		MainMenu.world.destroyBody(bodyMur7);
		MainMenu.world.destroyBody(bodyMur8);
		MainMenu.world.destroyBody(bodyMur9);
		MainMenu.world.destroyBody(bodyMur10);
		isBodyMur1Created = false;
		isBodyMur2Created = false;
		isBodyMur3Created = false;
		isBodyMur4Created = false;
		isBodyMur5Created = false;
		isBodyMur6Created = false;
		isBodyMur7Created = false;
		isBodyMur8Created = false;
		isBodyMur9Created = false;
		isBodyMur10Created = false;
	}
	

	
}
