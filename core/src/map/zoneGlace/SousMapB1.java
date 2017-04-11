package map.zoneGlace;

import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.physics.box2d.Body;
import com.badlogic.gdx.physics.box2d.World;
import com.mygdx.game.GameMain;

import characters.Pnj;
import decors.ClimatMontagneux;
import map.CadrillageMap;

public class SousMapB1 extends Sprite {

	
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
	
	public static void sousMap(GameMain game, int x, int y){
		
		
		ClimatMontagneux.eauProfondeGlacée(game,0+ x, 0+y);
		ClimatMontagneux.eauProfondeGlacée(game,0+ x, 60+y);
		ClimatMontagneux.eauProfondeGlacée(game,0+ x, 120+y);
		ClimatMontagneux.eauProfondeGlacée(game,0+ x, 180+y);
		ClimatMontagneux.eauProfondeGlacée(game,0+ x, 240+y);
		ClimatMontagneux.eauProfondeGlacée(game,0+ x, 300+y);
		ClimatMontagneux.eauProfondeGlacée(game,0+ x, 360+y);
		ClimatMontagneux.eauProfondeGlacée(game,0+ x, 420+y);
		
		game.getBatch().draw(ClimatMontagneux.glace1,60+x,0+y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéSupGau,60+x,0+y);
		ClimatMontagneux.eauProfondeGlacée(game,60+ x, 60+y);
		ClimatMontagneux.eauProfondeGlacée(game,60+ x, 120+y);
		ClimatMontagneux.eauProfondeGlacée(game,60+ x, 180+y);
		ClimatMontagneux.eauProfondeGlacée(game,60+ x, 240+y);
		ClimatMontagneux.eauProfondeGlacée(game,60+ x, 300+y);
		ClimatMontagneux.eauProfondeGlacée(game,60+ x, 360+y);
		ClimatMontagneux.eauProfondeGlacée(game,60+ x, 420+y);
		
		game.getBatch().draw(ClimatMontagneux.glace1,120+x,0+y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéSup,120+x,0+y);
		ClimatMontagneux.eauProfondeGlacée(game,120+ x, 60+y);
		ClimatMontagneux.eauProfondeGlacée(game,120+ x, 120+y);
		ClimatMontagneux.eauProfondeGlacée(game,120+ x, 180+y);
		ClimatMontagneux.eauProfondeGlacée(game,120+ x, 240+y);
		ClimatMontagneux.eauProfondeGlacée(game,120+ x, 300+y);
		ClimatMontagneux.eauProfondeGlacée(game,120+ x, 360+y);
		ClimatMontagneux.eauProfondeGlacée(game,120+ x, 420+y);
		
		
		game.getBatch().draw(ClimatMontagneux.glace1,180+x,0+y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéSup,180+x,0+y);
		ClimatMontagneux.eauProfondeGlacée(game,180+ x, 60+y);
		ClimatMontagneux.eauProfondeGlacée(game,180+ x, 120+y);
		ClimatMontagneux.eauProfondeGlacée(game,180+ x, 180+y);
		ClimatMontagneux.eauProfondeGlacée(game,180+ x, 240+y);
		ClimatMontagneux.eauProfondeGlacée(game,180+ x, 300+y);
		ClimatMontagneux.eauProfondeGlacée(game,180+ x, 360+y);
		ClimatMontagneux.eauProfondeGlacée(game,180+ x, 420+y);
		
		game.getBatch().draw(ClimatMontagneux.glace1,240+x,0+y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéSup,240+x,0+y);
		ClimatMontagneux.eauProfondeGlacée(game,240+ x, 60+y);
		ClimatMontagneux.eauProfondeGlacée(game,240+ x, 120+y);
		ClimatMontagneux.eauProfondeGlacée(game,240+ x, 180+y);
		ClimatMontagneux.eauProfondeGlacée(game,240+ x, 240+y);
		ClimatMontagneux.eauProfondeGlacée(game,240+ x, 300+y);
		ClimatMontagneux.eauProfondeGlacée(game,240+ x, 360+y);
		ClimatMontagneux.eauProfondeGlacée(game,240+ x, 420+y);
		
		game.getBatch().draw(ClimatMontagneux.glace1,300+x,0+y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéSup,300+x,0+y);
		ClimatMontagneux.eauProfondeGlacée(game,300+ x, 60+y);
		ClimatMontagneux.eauProfondeGlacée(game,300+ x, 120+y);
		ClimatMontagneux.eauProfondeGlacée(game,300+ x, 180+y);
		ClimatMontagneux.eauProfondeGlacée(game,300+ x, 240+y);
		ClimatMontagneux.eauProfondeGlacée(game,300+ x, 300+y);
		ClimatMontagneux.eauProfondeGlacée(game,300+ x, 360+y);
		ClimatMontagneux.eauProfondeGlacée(game,300+ x, 420+y);
		
		game.getBatch().draw(ClimatMontagneux.glace1,360+x,0+y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéSupDroi,360+x,0+y);
		ClimatMontagneux.eauProfondeGlacée(game,360+ x, 60+y);
		ClimatMontagneux.eauProfondeGlacée(game,360+ x, 120+y);
		ClimatMontagneux.eauProfondeGlacée(game,360+ x, 180+y);
		ClimatMontagneux.eauProfondeGlacée(game,360+ x, 240+y);
		ClimatMontagneux.eauProfondeGlacée(game,360+ x, 300+y);
		ClimatMontagneux.eauProfondeGlacée(game,360+ x, 360+y);
		ClimatMontagneux.eauProfondeGlacée(game,360+ x, 420+y);
		
		ClimatMontagneux.eauProfondeGlacée(game,420+ x, 0+y);
		ClimatMontagneux.eauProfondeGlacée(game,420+ x, 60+y);
		ClimatMontagneux.eauProfondeGlacée(game,420+ x, 120+y);
		ClimatMontagneux.eauProfondeGlacée(game,420+ x, 180+y);
		ClimatMontagneux.eauProfondeGlacée(game,420+ x, 240+y);
		ClimatMontagneux.eauProfondeGlacée(game,420+ x, 300+y);
		ClimatMontagneux.eauProfondeGlacée(game,420+ x, 360+y);
		ClimatMontagneux.eauProfondeGlacée(game,420+ x, 420+y);
		
		ClimatMontagneux.eauProfondeGlacée(game,480+ x, 0+y);
		ClimatMontagneux.eauProfondeGlacée(game,480+ x, 60+y);
		ClimatMontagneux.eauProfondeGlacée(game,480+ x, 120+y);
		ClimatMontagneux.eauProfondeGlacée(game,480+ x, 180+y);
		ClimatMontagneux.eauProfondeGlacée(game,480+ x, 240+y);
		ClimatMontagneux.eauProfondeGlacée(game,480+ x, 300+y);
		ClimatMontagneux.eauProfondeGlacée(game,480+ x, 360+y);
		ClimatMontagneux.eauProfondeGlacée(game,480+ x, 420+y);
		
		ClimatMontagneux.eauProfondeGlacée(game,540+ x, 0+y);
		ClimatMontagneux.eauProfondeGlacée(game,540+ x, 60+y);
		ClimatMontagneux.eauProfondeGlacée(game,540+ x, 120+y);
		ClimatMontagneux.eauProfondeGlacée(game,540+ x, 180+y);
		ClimatMontagneux.eauProfondeGlacée(game,540+ x, 240+y);
		ClimatMontagneux.eauProfondeGlacée(game,540+ x, 300+y);
		ClimatMontagneux.eauProfondeGlacée(game,540+ x, 360+y);
		ClimatMontagneux.eauProfondeGlacée(game,540+ x, 420+y);
		
		game.getBatch().draw(ClimatMontagneux.glaceFragmentée, 0+ x, 0+ y);
		game.getBatch().draw(ClimatMontagneux.glaceFragmentée, 0+ x, 60+ y);
		game.getBatch().draw(ClimatMontagneux.glaceFragmentée, 0+ x, 120+ y);
		game.getBatch().draw(ClimatMontagneux.glaceFragmentée, 0+ x, 180+ y);
		game.getBatch().draw(ClimatMontagneux.glaceFragmentée, 0+ x, 240+ y);
		game.getBatch().draw(ClimatMontagneux.morceauGlaceHaut, 0+ x, 300+ y);
		
		game.getBatch().draw(ClimatMontagneux.glaceFragmentée, 60+ x, 60+ y);
		game.getBatch().draw(ClimatMontagneux.glaceFragmentée, 60+ x, 120+ y);
		game.getBatch().draw(ClimatMontagneux.glaceFragmentée, 60+ x, 180+ y);
		game.getBatch().draw(ClimatMontagneux.glaceFragmentéHautDroite, 60+ x, 240+ y);
		game.getBatch().draw(ClimatMontagneux.morceauGlaceHautDroite, 60+ x, 300+ y);
		
		game.getBatch().draw(ClimatMontagneux.glaceFragmentée, 120+ x, 60+ y);
		game.getBatch().draw(ClimatMontagneux.glaceFragmentée, 120+ x, 120+ y);
		game.getBatch().draw(ClimatMontagneux.glaceFragmentéHautDroite, 120+ x, 180+ y);
		game.getBatch().draw(ClimatMontagneux.morceauGlaceHautDroite, 120+ x, 240+ y);
		
		game.getBatch().draw(ClimatMontagneux.glaceFragmentée, 180+ x, 60+ y);
		game.getBatch().draw(ClimatMontagneux.glaceFragmentée, 180+ x, 120+ y);
		game.getBatch().draw(ClimatMontagneux.morceauGlaceHaut, 180+ x, 180+ y);

		game.getBatch().draw(ClimatMontagneux.glaceFragmentée, 240+ x, 60+ y);
		game.getBatch().draw(ClimatMontagneux.glaceFragmentéHautDroite, 240+ x, 120+ y);
		game.getBatch().draw(ClimatMontagneux.morceauGlaceHautDroite, 240+ x, 180+ y);
		
		game.getBatch().draw(ClimatMontagneux.glaceFragmentée, 300+ x, 60+ y);
		game.getBatch().draw(ClimatMontagneux.morceauGlaceHaut, 300+ x, 120+ y);
		
		game.getBatch().draw(ClimatMontagneux.glaceFragmentée, 360+ x, 60+ y);
		game.getBatch().draw(ClimatMontagneux.morceauGlaceHaut, 360+ x, 120+ y);
		
		game.getBatch().draw(ClimatMontagneux.glaceFragmentée, 420+ x, 0+ y);
		game.getBatch().draw(ClimatMontagneux.glaceFragmentéHautDroite, 420+ x, 60+ y);
		game.getBatch().draw(ClimatMontagneux.morceauGlaceHautDroite, 420+ x, 120+ y);
		
		game.getBatch().draw(ClimatMontagneux.glaceFragmentéHautDroite, 480+ x, 00+ y);
		game.getBatch().draw(ClimatMontagneux.morceauGlaceHautDroite, 480+ x, 60+ y);

		game.getBatch().draw(ClimatMontagneux.morceauGlaceHautDroite, 540+ x, 0+ y);
				
	}
	
	public static void createBodyAndType(World world){
		
		CadrillageMap.setTypeDeDécor(0, 5, "EauProfonde");
		CadrillageMap.setTypeDeDécor(1, 4, "EauProfonde");
		CadrillageMap.setTypeDeDécor(2, 3, "EauProfonde");
		CadrillageMap.setTypeDeDécor(3, 3, "EauProfonde");
		CadrillageMap.setTypeDeDécor(4, 2, "EauProfonde");
		CadrillageMap.setTypeDeDécor(5, 2, "EauProfonde");
		CadrillageMap.setTypeDeDécor(6, 2, "EauProfonde");
		CadrillageMap.setTypeDeDécor(7, 1, "EauProfonde");	
		CadrillageMap.setTypeDeDécor(8, 0, "EauProfonde");	
	}
	
	public static void destroyBody(){
	}
	

	
}
