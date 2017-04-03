package map;

import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.physics.box2d.World;
import com.mygdx.game.GameMain;

import characters.Pnj;
import characters.Slim;
import characters.SlimPetit;
import decors.ClimatMontagneux;
import scenes.MainMenu;

public class SousMapH5 extends Sprite{
	
	public static Slim monstre1;
	public static Slim monstre2;
	public static Slim monstre3;
	public static boolean m1EstCrée = false ;
	public static boolean m2EstCrée = false ;
	public static boolean m3EstCrée = false ;
	
	public static SlimPetit petitMonstre1;
	public static SlimPetit petitMonstre2;
	public static SlimPetit petitMonstre3;
	public static SlimPetit petitMonstre4;
	public static SlimPetit petitMonstre5;
	public static SlimPetit petitMonstre6;
	public static boolean pm1EstCrée = false ;
	public static boolean pm2EstCrée = false ;
	public static boolean pm3EstCrée = false ;
	public static boolean pm5EstCrée = false ;
	public static boolean pm6EstCrée = false ;
	public static boolean pm4EstCrée = false ;
	
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
		
		game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 0+ x, 300+ y);
		game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 0+ x, 360+ y);
		
		game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 60+ x, 360+ y);
		game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 60+ x, 420+ y);
		
		game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 120+ x, 420+ y);
		
		
//		==================================================================
		//		Placement des dessins des monstres
		//==================================================================
		
		if ( m1EstCrée && monstre1.isAlive() ) { 
			game.getBatch().draw(monstre1,monstre1.getX(), monstre1.getY());
		}
		if ( m2EstCrée && monstre2.isAlive() ) {
			game.getBatch().draw(monstre2.getTexture(), monstre2.getX(), monstre2.getY());
		}
		if ( m3EstCrée && monstre3.isAlive() ) {
			game.getBatch().draw(monstre3.getTexture(), monstre3.getX(), monstre3.getY());
		}
		
		if ( pm1EstCrée && petitMonstre1.isAlive() ) { 
			game.getBatch().draw(petitMonstre1,petitMonstre1.getX(), petitMonstre1.getY());
		}
		if ( pm2EstCrée && petitMonstre2.isAlive() ) {
			game.getBatch().draw(petitMonstre2.getTexture(), petitMonstre2.getX(), petitMonstre2.getY());
		}
		if ( pm3EstCrée && petitMonstre3.isAlive() ) {
			game.getBatch().draw(petitMonstre3.getTexture(), petitMonstre3.getX(), petitMonstre3.getY());
		}
		if ( pm4EstCrée && petitMonstre4.isAlive() ) { 
			game.getBatch().draw(petitMonstre4,petitMonstre4.getX(), petitMonstre4.getY());
		}
		if ( pm5EstCrée && petitMonstre5.isAlive() ) {
			game.getBatch().draw(petitMonstre5.getTexture(), petitMonstre5.getX(), petitMonstre5.getY());
		}
		if ( pm6EstCrée && petitMonstre6.isAlive() ) {
			game.getBatch().draw(petitMonstre6.getTexture(), petitMonstre6.getX(), petitMonstre6.getY());
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
		
		if ( pm6EstCrée && petitMonstre6.isAlive() ) { 
			petitMonstre6.infligéDégatLink();
		}
		if ( pm1EstCrée && petitMonstre1.isAlive() ) {
			petitMonstre1.infligéDégatLink();
		}
		if ( pm2EstCrée && petitMonstre2.isAlive() ) {
			petitMonstre2.infligéDégatLink();
		}
		if ( pm3EstCrée && petitMonstre3.isAlive() ) { 
			petitMonstre3.infligéDégatLink();
		}
		if ( pm4EstCrée && petitMonstre4.isAlive() ) {
			petitMonstre4.infligéDégatLink();
		}
		if ( pm5EstCrée && petitMonstre5.isAlive() ) {
			petitMonstre5.infligéDégatLink();
		}
		
	}

	public static void destroyBody() {
		// TODO Auto-generated method stub
//		destruction monstres
		if ( m1EstCrée )MainMenu.world.destroyBody(monstre1.getBody());
		if ( m2EstCrée )MainMenu.world.destroyBody(monstre2.getBody());
		if ( m3EstCrée )MainMenu.world.destroyBody(monstre3.getBody());
		m1EstCrée = false;
		m2EstCrée = false;
		m3EstCrée = false;
		
		if ( pm1EstCrée )MainMenu.world.destroyBody(petitMonstre1.getBody());
		if ( pm2EstCrée )MainMenu.world.destroyBody(petitMonstre2.getBody());
		if ( pm3EstCrée )MainMenu.world.destroyBody(petitMonstre3.getBody());
		if ( pm4EstCrée )MainMenu.world.destroyBody(petitMonstre4.getBody());
		if ( pm5EstCrée )MainMenu.world.destroyBody(petitMonstre5.getBody());
		if ( pm6EstCrée )MainMenu.world.destroyBody(petitMonstre6.getBody());
		pm1EstCrée = false;
		pm2EstCrée = false;
		pm3EstCrée = false;
		pm4EstCrée = false;
		pm5EstCrée = false;
		pm6EstCrée = false;
		Pnj.nbrDeMonstres = 0;
	}

	public static void createBodyAndType(World world) {
		// TODO Auto-generated method stub
//		========================================================================================
		//		Création des corps des montres
		//========================================================================================
		
		
		
		if ( m2EstCrée == false ) {
			monstre2 = new Slim(world ,Slim.slimGauche1, 150 , 170 , "gauche") ;
			Pnj.monstres[1] = monstre2;
			Pnj.nbrDeMonstres = 2;
			m2EstCrée = true;
		} else if( monstre2.isAlive()){
			monstre2.déplacement();
			monstre2.représentation();
			monstre2.updateBody();
		} else {
			if ( ! pm3EstCrée) {
				petitMonstre3 = new SlimPetit(world, monstre2.getX(), monstre2.getY() ) ;
				Pnj.monstres[Pnj.nbrDeMonstres] = petitMonstre3;
				Pnj.nbrDeMonstres ++;
				pm3EstCrée = true;
			} else if( petitMonstre3.isAlive()){
				petitMonstre3.déplacement();
				petitMonstre3.représentation();
				petitMonstre3.updateBody();
			}
			if ( ! pm4EstCrée) {
				petitMonstre4 = new SlimPetit(world, monstre2.getX(), monstre2.getY() ) ;
				Pnj.monstres[Pnj.nbrDeMonstres] = petitMonstre4;
				Pnj.nbrDeMonstres ++;
				pm4EstCrée = true;
			} else if( petitMonstre4.isAlive()){
				petitMonstre4.déplacement();
				petitMonstre4.représentation();
				petitMonstre4.updateBody();
			}
		}
		
		if ( m1EstCrée == false ) {
			monstre1 = new Slim(world ,Slim.slimHaut1 , 360 , 300 , "bas") ;
			Pnj.monstres[0] = monstre1;
			m1EstCrée = true;
		} else if ( monstre1.isAlive()) {
			monstre1.déplacement();
			monstre1.représentation();
			monstre1.updateBody();
		} else {
			if ( ! pm1EstCrée) {
				petitMonstre1 = new SlimPetit(world, monstre1.getX(), monstre1.getY() ) ;
				Pnj.monstres[Pnj.nbrDeMonstres] = petitMonstre1;
				Pnj.nbrDeMonstres ++;
				pm1EstCrée = true;
			} else if( petitMonstre1.isAlive()){
				petitMonstre1.déplacement();
				petitMonstre1.représentation();
				petitMonstre1.updateBody();
			}
			if ( ! pm2EstCrée) {
				petitMonstre2 = new SlimPetit(world, monstre1.getX(), monstre1.getY() ) ;
				Pnj.monstres[Pnj.nbrDeMonstres] = petitMonstre2;
				Pnj.nbrDeMonstres ++;
				pm2EstCrée = true;
			} else if( petitMonstre2.isAlive()){
				petitMonstre2.déplacement();
				petitMonstre2.représentation();
				petitMonstre2.updateBody();
			}
		}
		
		if ( m3EstCrée == false ) {
			monstre3 = new Slim(world ,Slim.slimDroite1, 230 , 380 , "droite") ;
			Pnj.monstres[2] = monstre3;
			Pnj.nbrDeMonstres = 3;
			m3EstCrée = true;
		} else if (monstre3.isAlive()){
			monstre3.déplacement();
			monstre3.représentation();
			monstre3.updateBody();
		} else {
			if ( ! pm5EstCrée) {
				petitMonstre5 = new SlimPetit(world, monstre3.getX(), monstre3.getY() ) ;
				Pnj.monstres[Pnj.nbrDeMonstres] = petitMonstre5;
				Pnj.nbrDeMonstres ++;
				pm5EstCrée = true;
			} else if( petitMonstre5.isAlive()){
				petitMonstre5.déplacement();
				petitMonstre5.représentation();
				petitMonstre5.updateBody();
			}
			if ( ! pm6EstCrée) {
				petitMonstre6 = new SlimPetit(world, monstre3.getX(), monstre3.getY() ) ;
				Pnj.monstres[Pnj.nbrDeMonstres] = petitMonstre6;
				Pnj.nbrDeMonstres ++;
				pm6EstCrée = true;
			} else if( petitMonstre6.isAlive()){
				petitMonstre6.déplacement();
				petitMonstre6.représentation();
				petitMonstre6.updateBody();
			}
		}
	}

	public static void destroyType() {
		// TODO Auto-generated method stub
		
	}
}
