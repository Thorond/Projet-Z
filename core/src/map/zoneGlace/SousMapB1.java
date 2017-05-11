package map.zoneGlace;

import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.physics.box2d.Body;
import com.badlogic.gdx.physics.box2d.World;
import com.mygdx.game.GameMain;

import characters.Pnj;
import decors.ClimatMontagneux;
import map.CadrillageMap;

public class SousMapB1 extends Sprite {

	
	public static void sousMap(GameMain game, int x, int y){
		
		
		game.getBatch().draw(ClimatMontagneux.glace1,0+ x, 0+y);
		game.getBatch().draw(ClimatMontagneux.glace1,0+ x, 60+y);
		game.getBatch().draw(ClimatMontagneux.glace1,0+ x, 120+y);
		game.getBatch().draw(ClimatMontagneux.glace1,0+ x, 180+y);
		game.getBatch().draw(ClimatMontagneux.glace1,0+ x, 240+y);
		ClimatMontagneux.eauProfondeGlacée(game,0+ x, 300+y);
		ClimatMontagneux.eauProfondeGlacée(game,0+ x, 360+y);
		ClimatMontagneux.eauProfondeGlacée(game,0+ x, 420+y);
		
		game.getBatch().draw(ClimatMontagneux.glace1,60+x,0+y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéSupGau,60+x,0+y);
		game.getBatch().draw(ClimatMontagneux.glace1,60+ x, 60+y);
		game.getBatch().draw(ClimatMontagneux.glace1,60+ x, 120+y);
		game.getBatch().draw(ClimatMontagneux.glace1,60+ x, 180+y);
		game.getBatch().draw(ClimatMontagneux.glace1,60+ x, 240+y);
		ClimatMontagneux.eauProfondeGlacée(game,60+ x, 300+y);
		ClimatMontagneux.eauProfondeGlacée(game,60+ x, 360+y);
		ClimatMontagneux.eauProfondeGlacée(game,60+ x, 420+y);
		
		game.getBatch().draw(ClimatMontagneux.glace1,120+x,0+y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéSup,120+x,0+y);
		game.getBatch().draw(ClimatMontagneux.glace1,120+ x, 60+y);
		game.getBatch().draw(ClimatMontagneux.glace1,120+ x, 120+y);
		game.getBatch().draw(ClimatMontagneux.glace1,120+ x, 180+y);
		ClimatMontagneux.eauProfondeGlacée(game,120+ x, 240+y);
		ClimatMontagneux.eauProfondeGlacée(game,120+ x, 300+y);
		ClimatMontagneux.eauProfondeGlacée(game,120+ x, 360+y);
		ClimatMontagneux.eauProfondeGlacée(game,120+ x, 420+y);
		
		
		game.getBatch().draw(ClimatMontagneux.glace1,180+x,0+y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéSup,180+x,0+y);
		game.getBatch().draw(ClimatMontagneux.glace1,180+ x, 60+y);
		game.getBatch().draw(ClimatMontagneux.glace1,180+ x, 120+y);
		ClimatMontagneux.eauProfondeGlacée(game,180+ x, 180+y);
		ClimatMontagneux.eauProfondeGlacée(game,180+ x, 240+y);
		ClimatMontagneux.eauProfondeGlacée(game,180+ x, 300+y);
		ClimatMontagneux.eauProfondeGlacée(game,180+ x, 360+y);
		ClimatMontagneux.eauProfondeGlacée(game,180+ x, 420+y);
		
		game.getBatch().draw(ClimatMontagneux.glace1,240+x,0+y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéSup,240+x,0+y);
		game.getBatch().draw(ClimatMontagneux.glace1,240+ x, 60+y);
		game.getBatch().draw(ClimatMontagneux.glace1,240+ x, 120+y);
		ClimatMontagneux.eauProfondeGlacée(game,240+ x, 180+y);
		ClimatMontagneux.eauProfondeGlacée(game,240+ x, 240+y);
		ClimatMontagneux.eauProfondeGlacée(game,240+ x, 300+y);
		ClimatMontagneux.eauProfondeGlacée(game,240+ x, 360+y);
		ClimatMontagneux.eauProfondeGlacée(game,240+ x, 420+y);
		
		game.getBatch().draw(ClimatMontagneux.glace1,300+x,0+y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéSup,300+x,0+y);
		game.getBatch().draw(ClimatMontagneux.glace1,300+ x, 60+y);
		ClimatMontagneux.eauProfondeGlacée(game,300+ x, 120+y);
		ClimatMontagneux.eauProfondeGlacée(game,300+ x, 180+y);
		ClimatMontagneux.eauProfondeGlacée(game,300+ x, 240+y);
		ClimatMontagneux.eauProfondeGlacée(game,300+ x, 300+y);
		ClimatMontagneux.eauProfondeGlacée(game,300+ x, 360+y);
		ClimatMontagneux.eauProfondeGlacée(game,300+ x, 420+y);
		
		game.getBatch().draw(ClimatMontagneux.glace1,360+x,0+y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéSupDroi,360+x,0+y);
		game.getBatch().draw(ClimatMontagneux.glace1,360+ x, 60+y);
		ClimatMontagneux.eauProfondeGlacée(game,360+ x, 120+y);
		ClimatMontagneux.eauProfondeGlacée(game,360+ x, 180+y);
		ClimatMontagneux.eauProfondeGlacée(game,360+ x, 240+y);
		ClimatMontagneux.eauProfondeGlacée(game,360+ x, 300+y);
		ClimatMontagneux.eauProfondeGlacée(game,360+ x, 360+y);
		ClimatMontagneux.eauProfondeGlacée(game,360+ x, 420+y);
		
		game.getBatch().draw(ClimatMontagneux.glace1,420+ x, 0+y);
		game.getBatch().draw(ClimatMontagneux.glace1,420+ x, 60+y);
		ClimatMontagneux.eauProfondeGlacée(game,420+ x, 120+y);
		ClimatMontagneux.eauProfondeGlacée(game,420+ x, 180+y);
		ClimatMontagneux.eauProfondeGlacée(game,420+ x, 240+y);
		ClimatMontagneux.eauProfondeGlacée(game,420+ x, 300+y);
		ClimatMontagneux.eauProfondeGlacée(game,420+ x, 360+y);
		ClimatMontagneux.eauProfondeGlacée(game,420+ x, 420+y);
		
		game.getBatch().draw(ClimatMontagneux.glace1,480+ x, 0+y);
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

	}
	
	public static void destroyBody(){
	}
	

	
}
