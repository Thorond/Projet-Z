package map;

import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.physics.box2d.Body;
import com.badlogic.gdx.physics.box2d.World;
import com.mygdx.game.GameMain;

import décors.ClimatMontagneux;
import scenes.MainMenu;

public class SousMapC2 extends Sprite {
	
	public static Body bosquet1 ;
	public static boolean isBosquet1Created;
	
	public static void sousMapC2(GameMain game, int x, int y){
		
		game.getBatch().draw(ClimatMontagneux.glace1, 0+ x, 0+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 0+ x, 60+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 0+ x, 120+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 0+ x, 180+ y);		
		game.getBatch().draw(ClimatMontagneux.glace1, 0 + x,240 + y);
		game.getBatch().draw(ClimatMontagneux.glace1, 0+ x, 300+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 0+ x, 360+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 0+ x, 420+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéSup, 0+ x, 420+ y);
		
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
		
//		petitBosquet
		
		game.getBatch().draw(ClimatMontagneux.arbreBasMilieu, 0+ x, 300+ y);
		game.getBatch().draw(ClimatMontagneux.arbreCentreMilieu, 0+ x, 360+ y);
		game.getBatch().draw(ClimatMontagneux.arbreSommetMilieu, 0+ x, 420+ y);
		game.getBatch().draw(ClimatMontagneux.arbreBasDroite, 60+ x, 300+ y);
		game.getBatch().draw(ClimatMontagneux.arbreCentreDroite, 60+ x, 360+ y);
		game.getBatch().draw(ClimatMontagneux.arbreSommetDroite, 60+ x, 420+ y);
		
		game.getBatch().draw(ClimatMontagneux.arbreBasGauche, 360+ x, 60+ y);
		game.getBatch().draw(ClimatMontagneux.arbreCentreGauche, 360+ x, 120+ y);
		game.getBatch().draw(ClimatMontagneux.arbreCentreGauche, 360+ x, 180+ y);
		game.getBatch().draw(ClimatMontagneux.arbreSommetGauche, 360+ x, 240+ y);
		game.getBatch().draw(ClimatMontagneux.arbreBasMilieu, 420+ x,60+ y);
		game.getBatch().draw(ClimatMontagneux.arbreCentreMilieu, 420+ x, 120+ y);
		game.getBatch().draw(ClimatMontagneux.arbreCentreMilieu, 420+ x, 180+ y);
		game.getBatch().draw(ClimatMontagneux.arbreSommetMilieu, 420+ x, 240+ y);
		game.getBatch().draw(ClimatMontagneux.arbreBasMilieu, 480+ x,60+ y);
		game.getBatch().draw(ClimatMontagneux.arbreCentreMilieu, 480+ x, 120+ y);
		game.getBatch().draw(ClimatMontagneux.arbreCentreMilieu, 480+ x, 180+ y);
		game.getBatch().draw(ClimatMontagneux.arbreSommetMilieu, 480+ x, 240+ y);
		game.getBatch().draw(ClimatMontagneux.arbreBasDroite, 540+ x, 60+ y);
		game.getBatch().draw(ClimatMontagneux.arbreCentreDroite, 540+ x, 120+ y);
		game.getBatch().draw(ClimatMontagneux.arbreCentreDroite, 540+ x, 180+ y);
		game.getBatch().draw(ClimatMontagneux.arbreSommetDroite, 540+ x, 240+ y);
		
		game.getBatch().draw(ClimatMontagneux.buisson, 60+ x, 60+ y);
		game.getBatch().draw(ClimatMontagneux.buisson, 60+ x, 180+ y);
		game.getBatch().draw(ClimatMontagneux.buisson, 120+ x, 180+ y);
		game.getBatch().draw(ClimatMontagneux.buisson, 240+ x, 60+ y);
		game.getBatch().draw(ClimatMontagneux.buisson, 300+ x, 120+ y);
	
	}
	
	public static void createBodyAndType(World world){
		
		if ( isBosquet1Created == false ) {
			bosquet1 = ClimatMontagneux.createBody(450,180,220,200);
			isBosquet1Created = true;
		}
		
	}
	
	public static void destroyBody(){
		if ( isBosquet1Created) MainMenu.world.destroyBody(bosquet1);
		isBosquet1Created = false;
	}
}
