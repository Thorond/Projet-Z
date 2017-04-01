package map;

import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.physics.box2d.World;
import com.mygdx.game.GameMain;

import characters.MonstreAquatique;
import characters.Pnj;
import decors.ClimatMontagneux;
import scenes.MainMenu;

public class SousMapG3 extends Sprite{
	
	public static MonstreAquatique monstre1;
	public static MonstreAquatique monstre2;
	public static boolean m1EstCrée = false ;
	public static boolean m2EstCrée = false ;
	
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
		
//		

		game.getBatch().draw(ClimatMontagneux.bordGlacéDroi, 240+ x, 0+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéSupDroi, 240+ x, 60+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéDroi, 180+ x, 120+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéDroi, 180+ x, 180+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéInf, 240+ x, 240+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéInfGau, 300+ x, 180+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéInfGau, 360+ x, 120+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéGau, 420+ x, 60+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéGau, 420+ x, 0+ y);

		game.getBatch().draw(ClimatMontagneux.murSombreGlacéDroite, 240+ x, 180+ y);
		game.getBatch().draw(ClimatMontagneux.murSombreGlacéDroite3, 240+ x, 120+ y);
		game.getBatch().draw(ClimatMontagneux.murSombreGlacéDroite, 300+ x, 120+ y);
		game.getBatch().draw(ClimatMontagneux.murSombreGlacéDroite3, 300+ x, 60+ y);
		game.getBatch().draw(ClimatMontagneux.murSombreGlacéCentre, 300+ x,0+ y);
		game.getBatch().draw(ClimatMontagneux.murSombreGlacéDroite, 360+ x, 60+ y);
		game.getBatch().draw(ClimatMontagneux.murSombreGlacéDroite3, 360+ x, 0+ y);
		
		
		
		game.getBatch().draw(ClimatMontagneux.tree, 30+ x, 440+ y);
		game.getBatch().draw(ClimatMontagneux.tree, 90+ x, 460+ y);
		game.getBatch().draw(ClimatMontagneux.tree, 60+ x, 400+ y);
		game.getBatch().draw(ClimatMontagneux.tree, 30+ x, 370+ y);
		game.getBatch().draw(ClimatMontagneux.tree, -20+ x, 340+ y);
		game.getBatch().draw(ClimatMontagneux.tree, 60+ x, 340+ y);
		game.getBatch().draw(ClimatMontagneux.tree, 30+ x, 310+ y);
		game.getBatch().draw(ClimatMontagneux.tree, 10+ x, 270+ y);
		game.getBatch().draw(ClimatMontagneux.tree, 60+ x, 290+ y);
		game.getBatch().draw(ClimatMontagneux.tree, 90+ x, 260+ y);
		game.getBatch().draw(ClimatMontagneux.tree, 40+ x, 240+ y);
		game.getBatch().draw(ClimatMontagneux.tree, -10+ x, 210+ y);
		
		game.getBatch().draw(ClimatMontagneux.iceberg2, 60+ x, 120+ y);

		game.getBatch().draw(ClimatMontagneux.tree, 10+ x, 180+ y);
		game.getBatch().draw(ClimatMontagneux.tree, -30+ x, 150+ y);
		game.getBatch().draw(ClimatMontagneux.tree, 20+ x, 120+ y);
		game.getBatch().draw(ClimatMontagneux.tree, 60+ x, 90+ y);
		game.getBatch().draw(ClimatMontagneux.tree, 10+ x, 80+ y);
		game.getBatch().draw(ClimatMontagneux.tree, 120+ x, 70+ y);

		
		game.getBatch().draw(ClimatMontagneux.tree, 430+ x, 450+ y);
		game.getBatch().draw(ClimatMontagneux.tree, 510+ x, 460+ y);

		game.getBatch().draw(ClimatMontagneux.arbreSommetDroite, 180+ x, 60+ y);
		game.getBatch().draw(ClimatMontagneux.arbreSommetMilieu, 120+ x, 60+ y);
		game.getBatch().draw(ClimatMontagneux.arbreSommetMilieu, 60+ x, 60+ y);
		game.getBatch().draw(ClimatMontagneux.arbreSommetMilieu, 0+ x, 60+ y);
		game.getBatch().draw(ClimatMontagneux.arbreCentreDroite, 180+ x, 0+ y);
		game.getBatch().draw(ClimatMontagneux.arbreCentreMilieu, 120+ x, 0+ y);
		game.getBatch().draw(ClimatMontagneux.arbreCentreMilieu, 60+ x, 0+ y);
		game.getBatch().draw(ClimatMontagneux.arbreCentreMilieu, 0+ x, 0+ y);
		

		game.getBatch().draw(ClimatMontagneux.tree, 240+ x, 80+ y);
		game.getBatch().draw(ClimatMontagneux.tree, 250+ x, 20+ y);
		game.getBatch().draw(ClimatMontagneux.tree, 240+ x, -30+ y);
		
		game.getBatch().draw(ClimatMontagneux.tree, 450+ x, 60+ y);
		game.getBatch().draw(ClimatMontagneux.tree, 510+ x, 50+ y);
		game.getBatch().draw(ClimatMontagneux.tree, 420+ x, 30+ y);
		game.getBatch().draw(ClimatMontagneux.tree, 480+ x, 20+ y);
		game.getBatch().draw(ClimatMontagneux.tree, 540+ x, 10+ y);
		game.getBatch().draw(ClimatMontagneux.tree, 450+ x, -10+ y);
		game.getBatch().draw(ClimatMontagneux.tree, 510+ x, -20+ y);
		

		game.getBatch().draw(ClimatMontagneux.planteGelé3, 540+ x, 360+ y);
		game.getBatch().draw(ClimatMontagneux.planteGelé3, 480+ x, 180+ y);
		game.getBatch().draw(ClimatMontagneux.planteGelé, 480+ x, 420+ y);
		game.getBatch().draw(ClimatMontagneux.planteGelé3, 360+ x, 240+ y);
		game.getBatch().draw(ClimatMontagneux.planteGelé2, 360+ x, 140+ y);
		game.getBatch().draw(ClimatMontagneux.planteGelé, 420+ x, 180+ y);
		game.getBatch().draw(ClimatMontagneux.planteGelé3, 300+ x, 420+ y);
		game.getBatch().draw(ClimatMontagneux.planteGelé2Cut, 180+ x, 420+ y);
		game.getBatch().draw(ClimatMontagneux.planteGelé3, 240+ x, 300+ y);
		
//		==================================================================
		//		Placement des dessins des monstres
		//==================================================================
		
		if ( m1EstCrée && monstre1.isAlive() ) { 
			game.getBatch().draw(monstre1,monstre1.getX(), monstre1.getY());
		}
		if ( m2EstCrée && monstre2.isAlive() ) {
			game.getBatch().draw(monstre2.getTexture(), monstre2.getX(), monstre2.getY());
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
	}

	public static void destroyBody() {
		// TODO Auto-generated method stub
//		destruction monstres
		if ( m1EstCrée )MainMenu.world.destroyBody(monstre1.getBody());
		if ( m2EstCrée )MainMenu.world.destroyBody(monstre2.getBody());
		m1EstCrée = false;
		m2EstCrée = false;
		Pnj.nbrDeMonstres = 0;
	}

	public static void createBodyAndType(World world) {
		// TODO Auto-generated method stub
//		========================================================================================
		//		Création des corps des montres
		//========================================================================================
		
		
		
		if ( m2EstCrée == false ) {
			monstre2 = new MonstreAquatique(world ,MonstreAquatique.monstreAquaDroite2, 10 , 10 , 2 , 150 , 380 , "droite") ;
			Pnj.monstres[1] = monstre2;
			Pnj.nbrDeMonstres = 2;
			m2EstCrée = true;
		} else {
			monstre2.déplacement();
			monstre2.représentation();
			monstre2.updateBody();
		}
		
		if ( m1EstCrée == false ) {
			monstre1 = new MonstreAquatique(world ,MonstreAquatique.monstreAquaFace2, 10 , 10 , 2 , 460 , 300 , "bas") ;
			Pnj.monstres[0] = monstre1;
			m1EstCrée = true;
		} else {
			monstre1.déplacement();
			monstre1.représentation();
			monstre1.updateBody();
		}
	}

	public static void destroyType() {
		// TODO Auto-generated method stub
		
	}
}
