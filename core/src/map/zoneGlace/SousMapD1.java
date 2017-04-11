package map.zoneGlace;

import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.physics.box2d.World;
import com.mygdx.game.GameMain;

import decors.ClimatMontagneux;

public class SousMapD1 extends Sprite{
	
	public static void sousMap(GameMain game, int x, int y){
		
		game.getBatch().draw(ClimatMontagneux.glace1, 0+ x, 0+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 0+ x, 60+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 0+ x, 120+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 0+ x, 180+ y);	
		game.getBatch().draw(ClimatMontagneux.eauProfondeGlacée, 0+ x, 240+ y);		
		game.getBatch().draw(ClimatMontagneux.bordGlacéSup, 0 + x,240 + y);
		ClimatMontagneux.eauProfondeGlacée(game,0+ x, 300+y);
		ClimatMontagneux.eauProfondeGlacée(game,0+ x, 360+y);
		ClimatMontagneux.eauProfondeGlacée(game,0+ x, 420+y);
		
		game.getBatch().draw(ClimatMontagneux.glace1, 60+ x, 0+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 60+ x, 60+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 60+ x, 120+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 60+ x, 180+ y);	
		game.getBatch().draw(ClimatMontagneux.eauProfondeGlacée, 60+ x, 240+ y);		
		game.getBatch().draw(ClimatMontagneux.bordGlacéSup, 60+ x, 240+ y);	
		ClimatMontagneux.eauProfondeGlacée(game,60+ x, 300+y);
		ClimatMontagneux.eauProfondeGlacée(game,60+ x, 360+y);
		ClimatMontagneux.eauProfondeGlacée(game,60+ x, 420+y);
		
		game.getBatch().draw(ClimatMontagneux.glace1, 120+ x, 0+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 120+ x, 60+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 120+ x, 120+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 120+ x, 180+ y);
		game.getBatch().draw(ClimatMontagneux.eauProfondeGlacée, 120+ x, 240+ y);		
		game.getBatch().draw(ClimatMontagneux.bordGlacéSupDroi, 120+ x, 240+ y);
		ClimatMontagneux.eauProfondeGlacée(game,120+ x, 300+y);
		ClimatMontagneux.eauProfondeGlacée(game,120+ x, 360+y);
		ClimatMontagneux.eauProfondeGlacée(game,120+ x, 420+y);
		
		game.getBatch().draw(ClimatMontagneux.glace1, 180+ x, 0+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 180+ x, 60+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 180+ x, 120+ y);
		game.getBatch().draw(ClimatMontagneux.eauProfondeGlacée, 180+ x, 180+ y);		
		game.getBatch().draw(ClimatMontagneux.bordGlacéSupDroi, 180+ x, 180+ y);
		ClimatMontagneux.eauProfondeGlacée(game,180+ x, 240+y);
		ClimatMontagneux.eauProfondeGlacée(game,180+ x, 300+y);
		ClimatMontagneux.eauProfondeGlacée(game,180+ x, 360+y);
		ClimatMontagneux.eauProfondeGlacée(game,180+ x, 420+y);
		
		game.getBatch().draw(ClimatMontagneux.glace1, 240+ x, 0+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 240+ x, 60+ y);
		game.getBatch().draw(ClimatMontagneux.eauProfondeGlacée, 240+ x, 120+ y);		
		game.getBatch().draw(ClimatMontagneux.bordGlacéSup, 240+ x, 120+ y);
		ClimatMontagneux.eauProfondeGlacée(game,240+ x, 180+y);
		ClimatMontagneux.eauProfondeGlacée(game,240+ x, 240+y);
		ClimatMontagneux.eauProfondeGlacée(game,240+ x, 300+y);
		ClimatMontagneux.eauProfondeGlacée(game,240+ x, 360+y);
		ClimatMontagneux.eauProfondeGlacée(game,240+ x, 420+y);
		
		game.getBatch().draw(ClimatMontagneux.glace1, 300+ x, 0+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 300+ x, 60+ y);
		game.getBatch().draw(ClimatMontagneux.eauProfondeGlacée, 300+ x, 120+ y);		
		game.getBatch().draw(ClimatMontagneux.bordGlacéSupDroi, 300+ x, 120+ y);
		ClimatMontagneux.eauProfondeGlacée(game,300+ x, 180+y);
		ClimatMontagneux.eauProfondeGlacée(game,300+ x, 240+y);
		ClimatMontagneux.eauProfondeGlacée(game,300+ x, 300+y);
		ClimatMontagneux.eauProfondeGlacée(game,300+ x, 360+y);
		ClimatMontagneux.eauProfondeGlacée(game,300+ x, 420+y);
		
		game.getBatch().draw(ClimatMontagneux.glace1, 360+ x, 0+ y);
		game.getBatch().draw(ClimatMontagneux.eauProfondeGlacée, 360+ x, 60+ y);		
		game.getBatch().draw(ClimatMontagneux.bordGlacéSupDroi, 360+ x, 60+ y);
		ClimatMontagneux.eauProfondeGlacée(game,360+ x, 120+y);
		ClimatMontagneux.eauProfondeGlacée(game,360+ x, 180+y);
		ClimatMontagneux.eauProfondeGlacée(game,360+ x, 240+y);
		ClimatMontagneux.eauProfondeGlacée(game,360+ x, 300+y);
		ClimatMontagneux.eauProfondeGlacée(game,360+ x, 360+y);
		ClimatMontagneux.eauProfondeGlacée(game,360+ x, 420+y);
		
		game.getBatch().draw(ClimatMontagneux.eauProfondeGlacée, 420+ x, 0+ y);	
		game.getBatch().draw(ClimatMontagneux.bordGlacéSupDroi, 420+ x, 0+ y);
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
		
		game.getBatch().draw(ClimatMontagneux.tree, 420+ x, 30+ y);
		game.getBatch().draw(ClimatMontagneux.tree, 350+ x, 80+ y);
		game.getBatch().draw(ClimatMontagneux.tree, 360+ x, 30+ y);
		game.getBatch().draw(ClimatMontagneux.tree, 340+ x, -15+ y);
		game.getBatch().draw(ClimatMontagneux.tree, 480+ x, -30+ y);
		game.getBatch().draw(ClimatMontagneux.tree, 420+ x, -30+ y);

		game.getBatch().draw(ClimatMontagneux.tree, 60+ x, 240+ y);
		game.getBatch().draw(ClimatMontagneux.tree, 120+ x, 210+ y);
		game.getBatch().draw(ClimatMontagneux.tronc, 90+ x, 180+ y);
		
		game.getBatch().draw(ClimatMontagneux.tree, 00+ x, 180+ y);
		game.getBatch().draw(ClimatMontagneux.tree, 60+ x, 150+ y);
		game.getBatch().draw(ClimatMontagneux.tronc, 30+ x, 120+ y);
		
		game.getBatch().draw(ClimatMontagneux.tronc, 120+ x, 120+ y);
		game.getBatch().draw(ClimatMontagneux.tree, 180+ x, 150+ y);
		game.getBatch().draw(ClimatMontagneux.tronc, 150+ x, 90+ y);
		
		game.getBatch().draw(ClimatMontagneux.tree, 210+ x, 90+ y);
		game.getBatch().draw(ClimatMontagneux.tree, 270+ x, 120+ y);
		game.getBatch().draw(ClimatMontagneux.tree, 240+ x, 60+ y);

		game.getBatch().draw(ClimatMontagneux.tronc, 280+ x, 30+ y);
		game.getBatch().draw(ClimatMontagneux.tronc, 60+ x, 90+ y);
		game.getBatch().draw(ClimatMontagneux.tronc, 90+ x, 60+ y);
		game.getBatch().draw(ClimatMontagneux.tronc, 140+ x, 50+ y);
		

	}

	public static void destroyBody() {
		// TODO Auto-generated method stub
		
	}

	public static void createBodyAndType(World world) {
		// TODO Auto-generated method stub
		
	}

	public static void destroyType() {
		// TODO Auto-generated method stub
		
	}
}
