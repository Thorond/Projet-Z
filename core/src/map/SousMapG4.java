package map;

import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.physics.box2d.World;
import com.mygdx.game.GameMain;

import characters.MonstreAquatique;
import characters.Pnj;
import decors.ClimatMontagneux;
import scenes.MainMenu;

public class SousMapG4 extends Sprite{
	
	public static MonstreAquatique monstre1;
	public static MonstreAquatique monstre2;
	public static MonstreAquatique monstre3;
	public static boolean m1EstCrée = false ;
	public static boolean m2EstCrée = false ;
	public static boolean m3EstCrée = false ;
	
	public static boolean isArbuste1Cut = false;
	public static boolean isArbuste2Cut = false;
	public static boolean isArbuste3Cut = false;
	public static boolean isArbuste4Cut = false;
	public static boolean isArbuste5Cut = false;
	public static boolean isArbuste6Cut = false;
	
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
		
		game.getBatch().draw(ClimatMontagneux.bordGlacéInfDroi, 540+ x, 120+ y);
		game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 540+ x, 60+ y);
		game.getBatch().draw(ClimatMontagneux.murGlacéDroite, 540+ x, 00+ y);

		game.getBatch().draw(ClimatMontagneux.bordGlacéInfDroi, 480+ x, 60+ y);
		game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 480+ x, 0+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéInf, 420+ x, 60+ y);
		game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 420+ x, 0+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéInf, 360+ x, 60+ y);
		game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 360+ x, 0+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéInfDroi, 300+ x, 0+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéInf, 240+ x, 0+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéInf, 180+ x, 0+ y);
		
//		
		
		game.getBatch().draw(ClimatMontagneux.piedGlacéSup, 0+ x, 300+ y);
		game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 0+ x, 360+ y);
		game.getBatch().draw(ClimatMontagneux.piedCassé1Sup, 60+ x, 300+ y);
		game.getBatch().draw(ClimatMontagneux.murGlacéDroite, 60+ x, 360+ y);
		game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 0+ x, 420+ y);
		game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 60+ x, 420+ y);
		game.getBatch().draw(ClimatMontagneux.piedGlacéSup, 120+ x, 360+ y);
		game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 120+ x, 420+ y);
		game.getBatch().draw(ClimatMontagneux.piedGlacéSup, 180+ x, 360+ y);
		game.getBatch().draw(ClimatMontagneux.murGlacéDroite, 180+ x, 420+ y);
		
		game.getBatch().draw(ClimatMontagneux.arbreBasGauche, 240+ x, 420+ y);
		game.getBatch().draw(ClimatMontagneux.arbreBasMilieu, 300+ x, 420+ y);
		game.getBatch().draw(ClimatMontagneux.arbreBasMilieu, 360+ x, 420+ y);
		game.getBatch().draw(ClimatMontagneux.arbreBasMilieu,420+ x, 420+ y);
		game.getBatch().draw(ClimatMontagneux.arbreBasMilieu, 480+ x, 420+ y);
		game.getBatch().draw(ClimatMontagneux.arbreBasDroite, 540+ x, 420+ y);
		
//		
		game.getBatch().draw(ClimatMontagneux.planteGelé, 0+ x, 0+ y);
		game.getBatch().draw(ClimatMontagneux.planteGelé, 0+ x, 60+ y);
		game.getBatch().draw(ClimatMontagneux.planteGelé, 0+ x, 300+ y);
		game.getBatch().draw(ClimatMontagneux.planteGelé3, 60+ x, 120+ y);
		game.getBatch().draw(ClimatMontagneux.planteGelé, 60+ x, 240+ y);
		ClimatMontagneux.arbuste(isArbuste1Cut, game, 120+x,60+ y);
		ClimatMontagneux.arbuste(isArbuste2Cut, game, 120+x,240+ y);
		game.getBatch().draw(ClimatMontagneux.planteGelé3, 120+ x, 300+ y);
		game.getBatch().draw(ClimatMontagneux.planteGelé, 180+ x, 60+ y);
		ClimatMontagneux.arbuste(isArbuste3Cut, game, 180+x,120+ y);
		game.getBatch().draw(ClimatMontagneux.planteGelé, 180+ x, 300+ y);
		game.getBatch().draw(ClimatMontagneux.planteGelé, 240+ x, 240+ y);
		game.getBatch().draw(ClimatMontagneux.planteGelé3, 240+ x, 120+ y);
		game.getBatch().draw(ClimatMontagneux.planteGelé2Cut, 300+ x, 60+ y);
		ClimatMontagneux.arbuste(isArbuste4Cut, game, 300+x,300+ y);
		ClimatMontagneux.arbuste(isArbuste5Cut, game, 360+x,180+ y);
		game.getBatch().draw(ClimatMontagneux.planteGelé, 360+ x, 240+ y);
		game.getBatch().draw(ClimatMontagneux.planteGelé3, 360+ x, 360+ y);
		ClimatMontagneux.arbuste(isArbuste6Cut, game, 420+x,240+ y);
		game.getBatch().draw(ClimatMontagneux.planteGelé, 420+ x, 120+ y);
		game.getBatch().draw(ClimatMontagneux.planteGelé3, 540+ x, 300+ y);
		

		game.getBatch().draw(ClimatMontagneux.tree, -30+ x, 280+ y);
		
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
		Pnj.nbrDeMonstres = 0;
	}

	public static void createBodyAndType(World world) {
		
		CadrillageMap.setTypeDeDécor(2,1,"HerbesHautes");
		CadrillageMap.setTypeDeDécor(2,4,"HerbesHautes");
		CadrillageMap.setTypeDeDécor(3,2,"HerbesHautes");
		CadrillageMap.setTypeDeDécor(5,5,"HerbesHautes");
		CadrillageMap.setTypeDeDécor(6,3,"HerbesHautes");
		if ( CadrillageMap.décorChangé[2][1] == true ) isArbuste1Cut = true;
		if ( CadrillageMap.décorChangé[2][4] == true ) isArbuste2Cut = true;
		if ( CadrillageMap.décorChangé[3][2] == true ) isArbuste3Cut = true;
		if ( CadrillageMap.décorChangé[5][5] == true ) isArbuste4Cut = true;
		if ( CadrillageMap.décorChangé[6][3] == true ) isArbuste5Cut = true;
		CadrillageMap.setTypeDeDécor(7,4,"HerbesHautes");
		if ( CadrillageMap.décorChangé[7][4] == true ) isArbuste6Cut = true;
		
//		========================================================================================
		//		Création des corps des montres
		//========================================================================================
		
		
		
		if ( m2EstCrée == false ) {
			monstre2 = new MonstreAquatique(world ,MonstreAquatique.monstreAquaDroite2 , 150 , 170 , "droite") ;
			Pnj.monstres[1] = monstre2;
			Pnj.nbrDeMonstres = 2;
			m2EstCrée = true;
		} else {
			monstre2.déplacement();
			monstre2.représentation();
			monstre2.updateBody();
		}
		
		if ( m1EstCrée == false ) {
			monstre1 = new MonstreAquatique(world ,MonstreAquatique.monstreAquaFace2 , 360 , 300 , "bas") ;
			Pnj.monstres[0] = monstre1;
			Pnj.nbrDeMonstres = 1;
			m1EstCrée = true;
		} else {
			monstre1.déplacement();
			monstre1.représentation();
			monstre1.updateBody();
		}
		
		if ( m3EstCrée == false ) {
			monstre3 = new MonstreAquatique(world ,MonstreAquatique.monstreAquaDroite2, 230 , 380 , "droite") ;
			Pnj.monstres[2] = monstre3;
			Pnj.nbrDeMonstres = 3;
			m3EstCrée = true;
		} else {
			monstre3.déplacement();
			monstre3.représentation();
			monstre3.updateBody();
		}
	}

	public static void destroyType() {
		// TODO Auto-generated method stub
		isArbuste1Cut = false;
		isArbuste2Cut = false;
		isArbuste3Cut = false;
		isArbuste4Cut = false;
		isArbuste5Cut = false;
		isArbuste6Cut = false;
	}
}
