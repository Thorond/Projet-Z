package map;

import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.physics.box2d.World;
import com.mygdx.game.GameMain;

import decors.ClimatMontagneux;

public class SousMapE2 extends Sprite{
	
	public static void sousMap(GameMain game, int x, int y){
		
		game.getBatch().draw(ClimatMontagneux.glace1, 0+ x, 0+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 0+ x, 60+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 0+ x, 120+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 0+ x, 180+ y);		
		game.getBatch().draw(ClimatMontagneux.glace1, 0 + x,240 + y);
		game.getBatch().draw(ClimatMontagneux.glace1, 0+ x, 300+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 0+ x, 360+ y);
		ClimatMontagneux.eauProfondeGlacée(game,0+ x, 420+y);
		
		game.getBatch().draw(ClimatMontagneux.glace1, 60+ x, 0+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 60+ x, 60+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 60+ x, 120+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 60+ x, 180+ y);		
		game.getBatch().draw(ClimatMontagneux.glace1, 60+ x, 240+ y);	
		game.getBatch().draw(ClimatMontagneux.glace1, 60+ x, 300+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 60+ x, 360+ y);
		ClimatMontagneux.eauProfondeGlacée(game,60+ x, 420+y);
		
		game.getBatch().draw(ClimatMontagneux.glace1, 120+ x, 0+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 120+ x, 60+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 120+ x, 120+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 120+ x, 180+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 120+ x, 240+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 120+ x, 300+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 120+ x, 360+ y);
		ClimatMontagneux.eauProfondeGlacée(game,120+ x, 420+y);
		
		game.getBatch().draw(ClimatMontagneux.glace1, 180+ x, 0+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 180+ x, 60+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 180+ x, 120+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 180+ x, 180+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 180+ x, 240+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 180+ x, 300+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 180+ x, 360+ y);
		ClimatMontagneux.eauProfondeGlacée(game,180+ x, 420+y);
		
		game.getBatch().draw(ClimatMontagneux.glace1, 240+ x, 0+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 240+ x, 60+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 240+ x, 120+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 240+ x, 180+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 240+ x, 240+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 240+ x, 300+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 240+ x, 360+ y);
		ClimatMontagneux.eauProfondeGlacée(game,240+ x, 420+y);
		
		game.getBatch().draw(ClimatMontagneux.glace1, 300+ x, 0+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 300+ x, 60+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 300+ x, 120+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 300+ x, 180+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 300+ x, 240+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 300+ x, 300+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 300+ x, 360+ y);
		ClimatMontagneux.eauProfondeGlacée(game,300+ x, 420+y);
		
		game.getBatch().draw(ClimatMontagneux.glace1, 360+ x, 0+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 360+ x, 60+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 360+ x, 120+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 360+ x, 180+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 360+ x, 240+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 360+ x, 300+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 360+ x, 360+ y);
		ClimatMontagneux.eauProfondeGlacée(game,360+ x, 420+y);
		
		game.getBatch().draw(ClimatMontagneux.glace1, 420+ x, 0+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 420+ x, 60+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 420+ x, 120+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 420+ x, 180+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 420+ x, 240+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 420+ x, 300+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 420+ x, 360+ y);
		ClimatMontagneux.eauProfondeGlacée(game,420+ x, 420+y);
		
		game.getBatch().draw(ClimatMontagneux.glace1, 480+ x, 0+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 480+ x, 60+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 480+ x, 120+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 480+ x, 180+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 480+ x, 240+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 480+ x, 300+ y);
		ClimatMontagneux.eauProfondeGlacée(game,480+ x, 360+y);
		ClimatMontagneux.eauProfondeGlacée(game,480+ x, 420+y);
		
		game.getBatch().draw(ClimatMontagneux.glace1, 540+ x, 0+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 540+ x, 60+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 540+ x, 120+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 540+ x, 180+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 540+ x, 240+ y);
		ClimatMontagneux.eauProfondeGlacée(game,540+ x, 300+y);
		ClimatMontagneux.eauProfondeGlacée(game,540+ x, 360+y);
		ClimatMontagneux.eauProfondeGlacée(game,540+ x, 420+y);
		
		game.getBatch().draw(ClimatMontagneux.glaceFragmentéHautGauche, 60+ x, 420+ y);
		game.getBatch().draw(ClimatMontagneux.cheminGlace, 120+ x, 420+ y);
		game.getBatch().draw(ClimatMontagneux.glaceFragmentéHautDroite, 180+ x, 420+ y);
		game.getBatch().draw(ClimatMontagneux.morceauGlaceHaut, 240+ x, 420+ y);
		game.getBatch().draw(ClimatMontagneux.morceauGlaceHautDroite, 300+ x, 420+ y);
		game.getBatch().draw(ClimatMontagneux.morceauGlaceHautGauche, 360+ x, 420+ y);
		game.getBatch().draw(ClimatMontagneux.morceauGlaceHautGauche, 0+ x, 420+ y);
		game.getBatch().draw(ClimatMontagneux.morceauGlaceHaut, 420+ x, 420+ y);
		game.getBatch().draw(ClimatMontagneux.glaceFragmentéHautDroite, 480+ x, 360+ y);
		game.getBatch().draw(ClimatMontagneux.glaceFragmentéHautDroite, 540+ x, 300+ y);
		game.getBatch().draw(ClimatMontagneux.morceauGlaceHautDroite, 480+ x, 420+ y);
		game.getBatch().draw(ClimatMontagneux.morceauGlaceHautDroite, 540+ x, 360+ y);
		
		game.getBatch().draw(ClimatMontagneux.bordGlacéSup, 60+ x, 360+ y);
		game.getBatch().draw(ClimatMontagneux.glace1,120+ x, 360+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéSup, 180+ x, 360+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéSup, 240+ x, 360+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéSup, 300+ x, 360+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéSup, 360+ x, 360+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéSupDroi, 420+ x, 360+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéSupDroi, 480+ x, 300+ y);
		
		game.getBatch().draw(ClimatMontagneux.bordGlacéSup, 00+ x, 240+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéDroi, 60+ x, 300+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéGau, 180+ x, 300+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéSup, 60+ x, 240+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéSup, 180+ x, 240+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéSup, 240+ x, 240+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéSup, 300+ x, 240+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéSup, 360+ x, 240+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéSup, 420+ x, 240+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéSup, 480+ x, 240+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéSup, 540+ x, 240+ y);
		
		game.getBatch().draw(ClimatMontagneux.bordGlacéSup, 00+ x, 180+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéSup, 60+ x, 180+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéSup,120+ x, 180+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéSup, 180+ x, 180+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéSup, 240+ x, 180+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéSup, 300+ x, 180+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéSup, 360+ x, 180+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéSupDroi, 420+ x, 180+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéDroi, 420+ x, 120+ y);
		
		game.getBatch().draw(ClimatMontagneux.bordGlacéSupGau, 00+ x, 0+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéSup, 60+ x, 0+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéSup,120+ x, 0+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéSup, 180+ x, 0+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéSup, 240+ x, 0+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéSup, 300+ x, 0+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéSup, 360+ x, 0+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéSupDroi, 420+ x, 0+ y);
		
		game.getBatch().draw(ClimatMontagneux.tree, 00+ x, 0+ y);
		game.getBatch().draw(ClimatMontagneux.tree, 60+ x, 0+ y);
		game.getBatch().draw(ClimatMontagneux.tree,120+ x, 0+ y);
		game.getBatch().draw(ClimatMontagneux.tree, 180+ x, 0+ y);
		game.getBatch().draw(ClimatMontagneux.tree, 240+ x, 0+ y);
		game.getBatch().draw(ClimatMontagneux.grossePierre, 300+ x, 0+ y);
		game.getBatch().draw(ClimatMontagneux.tree, 360+ x, 0+ y);
		game.getBatch().draw(ClimatMontagneux.tree, 420+ x, 0+ y);
		
		game.getBatch().draw(ClimatMontagneux.tree, 00+ x, -60+ y);
		game.getBatch().draw(ClimatMontagneux.tree, 60+ x, -60+ y);
		game.getBatch().draw(ClimatMontagneux.tree,120+ x, -60+ y);
		game.getBatch().draw(ClimatMontagneux.tree, 180+ x, -60+ y);
		game.getBatch().draw(ClimatMontagneux.tree, 240+ x, -60+ y);
		game.getBatch().draw(ClimatMontagneux.tree, 300+ x, -60+ y);
		game.getBatch().draw(ClimatMontagneux.tree, 360+ x, -60+ y);
		game.getBatch().draw(ClimatMontagneux.tree, 420+ x, -60+ y);
		

		game.getBatch().draw(ClimatMontagneux.arbreBasGauche, 540+ x, 120+ y);
		game.getBatch().draw(ClimatMontagneux.arbreCentreGauche, 540+ x, 180+ y);
		game.getBatch().draw(ClimatMontagneux.arbreSommetGauche, 540+ x, 240+ y);
		
		game.getBatch().draw(ClimatMontagneux.tree, 570+ x, 90+ y);
		
		game.getBatch().draw(ClimatMontagneux.arbreCentreGauche, 540+ x, 0+ y);
		game.getBatch().draw(ClimatMontagneux.arbreSommetGauche, 540+ x, 60+ y);
		
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
