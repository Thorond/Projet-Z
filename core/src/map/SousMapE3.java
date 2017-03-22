package map;

import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.physics.box2d.World;
import com.mygdx.game.GameMain;

import characters.Bats;
import characters.Pnj;
import decors.ClimatMontagneux;
import scenes.MainMenu;

public class SousMapE3 extends Sprite{
	
	public static Bats monstre1;
	public static Bats monstre2;
	public static boolean m1EstCrée = false ;
	public static boolean m2EstCrée = false ;
	public static Bats monstre3;
	public static Bats monstre4;
	public static boolean m3EstCrée = false ;
	public static boolean m4EstCrée = false ;
	
	
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
		
		
		game.getBatch().draw(ClimatMontagneux.tree, 00+ x, 420+ y);
		game.getBatch().draw(ClimatMontagneux.tree, 60+ x, 420+ y);
		game.getBatch().draw(ClimatMontagneux.tree,120+ x, 420+ y);
		game.getBatch().draw(ClimatMontagneux.tree, 180+ x, 420+ y);
		game.getBatch().draw(ClimatMontagneux.tree, 240+ x, 420+ y);
		game.getBatch().draw(ClimatMontagneux.tree, 300+ x, 420+ y);
		game.getBatch().draw(ClimatMontagneux.tree, 360+ x, 420+ y);
		game.getBatch().draw(ClimatMontagneux.tree, 420+ x, 420+ y);
		
		game.getBatch().draw(ClimatMontagneux.arbreBasGauche, 540+ x, 360+ y);
		game.getBatch().draw(ClimatMontagneux.arbreCentreGauche, 540+ x, 420+ y);
		
		game.getBatch().draw(ClimatMontagneux.arbreBasGauche, 540+ x, 240+ y);
		game.getBatch().draw(ClimatMontagneux.arbreCentreGauche, 540+ x, 300+ y);
		game.getBatch().draw(ClimatMontagneux.arbreSommetGauche, 540+ x, 360+ y);
		
		game.getBatch().draw(ClimatMontagneux.arbreBasGauche, 480+ x, 120+ y);
		game.getBatch().draw(ClimatMontagneux.arbreCentreGauche, 480+ x, 180+ y);
		game.getBatch().draw(ClimatMontagneux.arbreSommetGauche, 480+ x, 240+ y);
		game.getBatch().draw(ClimatMontagneux.arbreBasMilieu, 540+ x, 120+ y);
		game.getBatch().draw(ClimatMontagneux.arbreCentreMilieu, 540+ x, 180+ y);
		game.getBatch().draw(ClimatMontagneux.arbreSommetMilieu, 540+ x, 240+ y);
		
		game.getBatch().draw(ClimatMontagneux.arbreBasGauche, 540+ x, 0+ y);
		game.getBatch().draw(ClimatMontagneux.arbreCentreGauche, 540+ x, 60+ y);
		game.getBatch().draw(ClimatMontagneux.arbreSommetGauche, 540+ x, 120+ y);
		
		game.getBatch().draw(ClimatMontagneux.tree, 540+ x, -60+ y);
		
		game.getBatch().draw(ClimatMontagneux.tree, 240+ x, 240+ y);
		game.getBatch().draw(ClimatMontagneux.tree, 240+ x, 180+ y);
		game.getBatch().draw(ClimatMontagneux.tree, 300+ x, 180+ y);
		game.getBatch().draw(ClimatMontagneux.tree, 300+ x, 120+ y);
		
		game.getBatch().draw(ClimatMontagneux.tree, 60+ x, 240+ y);
		game.getBatch().draw(ClimatMontagneux.tree, 60+ x, 180+ y);
		
		game.getBatch().draw(ClimatMontagneux.tree, 0+ x, 420+ y);
		game.getBatch().draw(ClimatMontagneux.tree, 0+ x, 360+ y);
		game.getBatch().draw(ClimatMontagneux.tree, 0+ x, 300+ y);
		game.getBatch().draw(ClimatMontagneux.tree, 0+ x, 240+ y);
		game.getBatch().draw(ClimatMontagneux.tree, 0+ x, 180+ y);
		game.getBatch().draw(ClimatMontagneux.tree, 0+ x, 120+ y);
		game.getBatch().draw(ClimatMontagneux.tree, 0+ x, 60+ y);
		game.getBatch().draw(ClimatMontagneux.tree, 0+ x, 0+ y);
		
		game.getBatch().draw(ClimatMontagneux.tree, 240+ x, -40+ y);
		game.getBatch().draw(ClimatMontagneux.tree, 180+ x, -40+ y);
		game.getBatch().draw(ClimatMontagneux.tree, 300+ x, -40+ y);
		
//		==================================================================
		//		Placement des dessins des monstres
		//==================================================================
		
		if ( m1EstCrée && monstre1.isAlive() ) { 
			game.getBatch().draw(monstre1,monstre1.getX(), monstre1.getY());
		}
		if ( m2EstCrée && monstre2.isAlive() ) {
			game.getBatch().draw(monstre2.getTexture(), monstre2.getX(), monstre2.getY());
		}
		if ( m1EstCrée && monstre3.isAlive() ) { 
			game.getBatch().draw(monstre3,monstre3.getX(), monstre3.getY());
		}
		if ( m2EstCrée && monstre4.isAlive() ) {
			game.getBatch().draw(monstre4.getTexture(), monstre4.getX(), monstre4.getY());
		}
		//==================================================================
		//		      			dégats des monstres
		//==================================================================
		
		if ( m1EstCrée && monstre1.isAlive() ) { 
			monstre1.infligéDégatLink();
		}
		if ( m2EstCrée && monstre2.isAlive() ) {
			monstre2.infligéDégatLink();
		}
		if ( m3EstCrée && monstre3.isAlive() ) { 
			monstre3.infligéDégatLink();
		}
		if ( m4EstCrée && monstre4.isAlive() ) {
			monstre4.infligéDégatLink();
		}
	}

	public static void destroyBody() {
		// TODO Auto-generated method stub
		
//		destruction monstres
		if ( m1EstCrée )MainMenu.world.destroyBody(monstre1.getBody());
		if ( m2EstCrée )MainMenu.world.destroyBody(monstre2.getBody());
		m1EstCrée = false;
		m2EstCrée = false;
		if ( m3EstCrée )MainMenu.world.destroyBody(monstre3.getBody());
		if ( m4EstCrée )MainMenu.world.destroyBody(monstre4.getBody());
		m3EstCrée = false;
		m4EstCrée = false;
		
		Pnj.nbrDeMonstres = 0 ;
	}

	public static void createBodyAndType(World world) {
		// TODO Auto-generated method stub
//		========================================================================================
		//		Création des corps des montres
		//========================================================================================
		
		
		
		if ( m2EstCrée == false ) {
			monstre2 = new Bats(world ,Bats.batDroite1, 20 , 10 , 4 , 400 , 200 , "droite") ;
			Pnj.monstres[1] = monstre2;
			m2EstCrée = true;
		} else {
			monstre2.déplacement();
			monstre2.représentationBat();
			monstre2.updateBody();
		}
		
		if ( m1EstCrée == false ) {
			monstre1 = new Bats(world ,Bats.batBas1, 20 , 10 , 4 , 200 , 360 , "bas") ;
			Pnj.monstres[0] = monstre1;
			m1EstCrée = true;
		} else {
			monstre1.déplacement();
			monstre1.représentationBat();
			monstre1.updateBody();
		}
		
		if ( m3EstCrée == false ) {
			monstre3 = new Bats(world ,Bats.batBas1, 20 , 10 , 4 , 90 , 360 , "bas") ;
			Pnj.monstres[2] = monstre3;
			m3EstCrée = true;
		} else {
			monstre3.déplacement();
			monstre3.représentationBat();
			monstre3.updateBody();
		}
		
		if ( m4EstCrée == false ) {
			monstre4 = new Bats(world ,Bats.batGauche1, 20 , 10 , 4 , 200 , 120 , "gauche") ;
			Pnj.monstres[3] = monstre4;
			Pnj.nbrDeMonstres = 4 ;
			m4EstCrée = true;
		} else {
			monstre4.déplacement();
			monstre4.représentationBat();
			monstre4.updateBody();
		}
	}

	public static void destroyType() {
		// TODO Auto-generated method stub
		
	}
}
