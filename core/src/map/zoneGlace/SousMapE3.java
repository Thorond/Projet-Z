package map.zoneGlace;

import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.physics.box2d.Body;
import com.badlogic.gdx.physics.box2d.World;
import com.mygdx.game.GameMain;

import characters.Bats;
import characters.Pnj;
import decors.ClimatMontagneux;
import scenes.MainMenu;

public class SousMapE3 extends Sprite{
	
	public static Body bosquet1 ;
	public static boolean isBosquet1Created;
	public static Body bosquet2 ;
	public static boolean isBosquet2Created;
	public static Body bosquet3 ;
	public static boolean isBosquet3Created;
	public static Body bosquet4 ;
	public static boolean isBosquet4Created;
	public static Body bosquet5 ;
	public static boolean isBosquet5Created;
	public static Body bosquet6 ;
	public static boolean isBosquet6Created;
	public static Body bosquet6b ;
	public static boolean isBosquet6bCreated;
	public static Body bosquet7;
	public static boolean isBosquet7Created;
	
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
		game.getBatch().draw(ClimatMontagneux.tree, 0+ x, -60+ y);
		
		game.getBatch().draw(ClimatMontagneux.tree, 240+ x, -40+ y);
		game.getBatch().draw(ClimatMontagneux.tree, 180+ x, -40+ y);
		game.getBatch().draw(ClimatMontagneux.tree, 300+ x, -40+ y);


//

        game.getBatch().draw(ClimatMontagneux.planteGelé, 480+ x, 420+ y);
        game.getBatch().draw(ClimatMontagneux.planteGelé3, 60+ x, 360+ y);
        game.getBatch().draw(ClimatMontagneux.planteGelé3, 120+ x, 300+ y);

        game.getBatch().draw(ClimatMontagneux.planteGelé3, 240+ x, 360+ y);
        game.getBatch().draw(ClimatMontagneux.planteGelé3, 120+ x, 00+ y);

        game.getBatch().draw(ClimatMontagneux.planteGelé, 420+ x, 0+ y);
        game.getBatch().draw(ClimatMontagneux.planteGelé, 480+ x, 60+ y);
        game.getBatch().draw(ClimatMontagneux.planteGelé, 360+ x, 300+ y);


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
		
		if ( isBosquet1Created) MainMenu.world.destroyBody(bosquet1);
		isBosquet1Created = false;
		
		if ( isBosquet2Created) MainMenu.world.destroyBody(bosquet2);
		isBosquet2Created = false;
		
		if ( isBosquet3Created) MainMenu.world.destroyBody(bosquet3);
		isBosquet3Created = false;
		
		if ( isBosquet4Created) MainMenu.world.destroyBody(bosquet4);
		isBosquet4Created = false;
		
		if ( isBosquet5Created) MainMenu.world.destroyBody(bosquet5);
		isBosquet5Created = false;
		
		if ( isBosquet6Created) MainMenu.world.destroyBody(bosquet6);
		isBosquet6Created = false;
		
		if ( isBosquet6bCreated) MainMenu.world.destroyBody(bosquet6b);
		isBosquet6bCreated = false;
		
		if ( isBosquet7Created) MainMenu.world.destroyBody(bosquet7);
		isBosquet7Created = false;
		
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
		
		if ( isBosquet1Created == false ) {
			bosquet1 = ClimatMontagneux.createBody(230,455,460,60);
			isBosquet1Created = true;
		}
		if ( isBosquet2Created == false ) {
			bosquet2 = ClimatMontagneux.createBody(20,240,50,480);
			isBosquet2Created = true;
		}
		if ( isBosquet3Created == false ) {
			bosquet3 = ClimatMontagneux.createBody(560,240,50,480);
			isBosquet3Created = true;
		}
		if ( isBosquet4Created == false ) {
			bosquet4 = ClimatMontagneux.createBody(80,240,50,130);
			isBosquet4Created = true;
		}
		if ( isBosquet5Created == false ) {
			bosquet5 = ClimatMontagneux.createBody(490,210,50,150);
			isBosquet5Created = true;
		}
		if ( isBosquet6Created == false ) {
			bosquet6 = ClimatMontagneux.createBody(260,240,60,130);
			isBosquet6Created = true;
		}
		if ( isBosquet6bCreated == false ) {
			bosquet6b = ClimatMontagneux.createBody(315,180,50,130);
			isBosquet6bCreated = true;
		}
		if ( isBosquet7Created == false ) {
			bosquet7 = ClimatMontagneux.createBody(255,15,170,30);
			isBosquet7Created = true;
		}
		
		
//		========================================================================================
		//		Création des corps des montres
		//========================================================================================
		
		
		
		if ( m2EstCrée == false ) {
			monstre2 = new Bats(world ,Bats.batDroite1, 8,8,1, 400 , 200 , "droite") ;
			Pnj.monstres[1] = monstre2;
			m2EstCrée = true;
		} else {
			monstre2.déplacement();
			monstre2.représentationBat();
			monstre2.updateBody();
		}
		
		if ( m1EstCrée == false ) {
			monstre1 = new Bats(world ,Bats.batBas1, 8,8,1 , 200 , 360 , "bas") ;
			Pnj.monstres[0] = monstre1;
			m1EstCrée = true;
		} else {
			monstre1.déplacement();
			monstre1.représentationBat();
			monstre1.updateBody();
		}
		
		if ( m3EstCrée == false ) {
			monstre3 = new Bats(world ,Bats.batBas1,8,8,1 , 90 , 360 , "bas") ;
			Pnj.monstres[2] = monstre3;
			m3EstCrée = true;
		} else {
			monstre3.déplacement();
			monstre3.représentationBat();
			monstre3.updateBody();
		}
		
		if ( m4EstCrée == false ) {
			monstre4 = new Bats(world ,Bats.batGauche1, 8,8,1 , 200 , 120 , "gauche") ;
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
