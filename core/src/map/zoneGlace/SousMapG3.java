package map.zoneGlace;

import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.physics.box2d.Body;
import com.badlogic.gdx.physics.box2d.World;
import com.mygdx.game.GameMain;

import characters.MonstreAquatique;
import characters.Pnj;
import decors.ClimatMontagneux;
import map.CadrillageMap;
import scenes.MainMenu;

public class SousMapG3 extends Sprite{

	public static Body cote1 ;
	public static boolean isCote1Created;
	public static Body cote2 ;
	public static boolean isCote2Created;
	public static Body cote3 ;
	public static boolean isCote3Created;
	public static Body cote4 ;
	public static boolean isCote4Created;
	public static Body cote5 ;
	public static boolean isCote5Created;
	public static Body cote6 ;
	public static boolean isCote6Created;
	public static Body cote7 ;
	public static boolean isCote7Created;
	public static Body cote8 ;
	public static boolean isCote8Created;

    public static Body arbre1;
    public static boolean isarbre1Created;


    public static boolean isArbuste1Cut = false;

    public static Body arbuste1;
    public static boolean isarbuste1Created;
    public static Body arbuste2;
    public static boolean isarbuste2Created;
	
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

		ClimatMontagneux.placerMurSombreGlacéDroite(game, 240+ x, 180+ y);
		ClimatMontagneux.placerMurSombreGlacéDroite3(game, 240+ x, 120+ y);
		ClimatMontagneux.placerMurSombreGlacéDroite(game, 300+ x, 120+ y);
		ClimatMontagneux.placerMurSombreGlacéDroite3(game, 300+ x, 60+ y);
		ClimatMontagneux.placerMurSombreGlacéCentre(game, 300+ x,0+ y);
		ClimatMontagneux.placerMurSombreGlacéDroite(game, 360+ x, 60+ y);
		ClimatMontagneux.placerMurSombreGlacéDroite3(game, 360+ x, 0+ y);
		
		
		
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
		
		game.getBatch().draw(ClimatMontagneux.tree, 450+ x, 50+ y);
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
        ClimatMontagneux.arbuste(isArbuste1Cut, game, 360+x,140+ y);
		game.getBatch().draw(ClimatMontagneux.planteGelé, 420+ x, 180+ y);
		game.getBatch().draw(ClimatMontagneux.planteGelé3, 300+ x, 420+ y);
		game.getBatch().draw(ClimatMontagneux.planteGelé2Cut, 180+ x, 360+ y);
		game.getBatch().draw(ClimatMontagneux.planteGelé3, 240+ x, 300+ y);

		game.getBatch().draw(ClimatMontagneux.tree, 540+ x, 420+ y);
		game.getBatch().draw(ClimatMontagneux.tree, 480+ x, 420+ y);
		game.getBatch().draw(ClimatMontagneux.tree, 510+ x, 390+ y);
		game.getBatch().draw(ClimatMontagneux.tree, 570+ x, 360+ y);

		game.getBatch().draw(ClimatMontagneux.tree, 590+ x, 50+ y);


		game.getBatch().draw(ClimatMontagneux.arbreSommetGauche, 240+ x, 0+ y);
		game.getBatch().draw(ClimatMontagneux.arbreSommetMilieu, 300+ x, 0+ y);
		game.getBatch().draw(ClimatMontagneux.arbreSommetMilieu, 360+ x, 0+ y);
		game.getBatch().draw(ClimatMontagneux.arbreSommetMilieu, 420+ x, 0+ y);
		game.getBatch().draw(ClimatMontagneux.arbreSommetMilieu, 480+ x, 0+ y);
		game.getBatch().draw(ClimatMontagneux.arbreSommetDroite, 540+ x, 0+ y);
		
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
		if ( isCote1Created) MainMenu.world.destroyBody(cote1);
		isCote1Created = false;

		if ( isCote2Created) MainMenu.world.destroyBody(cote2);
		isCote2Created = false;

		if ( isCote3Created) MainMenu.world.destroyBody(cote3);
		isCote3Created = false;

		if ( isCote4Created) MainMenu.world.destroyBody(cote4);
		isCote4Created = false;

		if ( isCote5Created) MainMenu.world.destroyBody(cote5);
		isCote5Created = false;

		if ( isCote6Created) MainMenu.world.destroyBody(cote6);
		isCote6Created = false;

		if ( isCote7Created) MainMenu.world.destroyBody(cote7);
		isCote7Created = false;

		if ( isCote8Created) MainMenu.world.destroyBody(cote8);
		isCote8Created = false;

        if ( isarbre1Created) MainMenu.world.destroyBody(arbre1);
        isarbre1Created = false;

        if ( isarbuste1Created) MainMenu.world.destroyBody(arbuste1);
        isarbuste1Created = false;

        if ( isarbuste2Created) MainMenu.world.destroyBody(arbuste2);
        isarbuste2Created = false;

//		destruction monstres
		if ( m1EstCrée )MainMenu.world.destroyBody(monstre1.getBody());
		if ( m2EstCrée )MainMenu.world.destroyBody(monstre2.getBody());
		m1EstCrée = false;
		m2EstCrée = false;
		Pnj.nbrDeMonstres = 0;
	}

	public static void createBodyAndType(World world) {
		// TODO Auto-generated method stub

//        haut droite frontière
        if ( isCote1Created == false ) {
            cote1 = ClimatMontagneux.createBody(590,400,60,60);
            isCote1Created = true;
        }
        if ( isCote2Created == false ) {
            cote2 = ClimatMontagneux.createBody(530,430,60,60);
            isCote2Created = true;
        }
//        bas droite frontière
        if ( isCote3Created == false ) {
            cote3 = ClimatMontagneux.createBody(510,60,180,120);
            isCote3Created = true;
        }
//         iceberg
        if ( isCote4Created == false ) {
            cote4 = ClimatMontagneux.createBody(150,180,120,120);
            isCote4Created = true;
        }
        if ( isCote5Created == false ) {
            cote5 = ClimatMontagneux.createBody(70,380,60,120);
            isCote5Created = true;
        }
        if ( isCote6Created == false ) {
            cote6 = ClimatMontagneux.createBody(490,450,60,60);
            isCote6Created = true;
        }
        if ( isCote7Created == false ) {
            cote7 = ClimatMontagneux.createBody(110,480,60,60);
            isCote7Created = true;
        }
        if ( isCote8Created == false ) {
            cote8 = ClimatMontagneux.createBody(440,480,60,60);
            isCote8Created = true;
        }

        if ( isarbre1Created == false ) {
            arbre1 = ClimatMontagneux.createBodyPerso("arbre", "static",90,260);
            isarbre1Created = true;
        }

        CadrillageMap.setTypeDeDécor(6,2,"HerbesHautes");
        if ( CadrillageMap.décorChangé[6][2] == true ) isArbuste1Cut = true;

        if ( isarbuste1Created == false ) {
            arbuste1 = ClimatMontagneux.createBodyPerso("tonneau", "static",360,140);
            isarbuste1Created = true;
        }
        if ( isarbuste2Created == false ) {
            arbuste2 = ClimatMontagneux.createBodyPerso("tonneau", "static",180,360);
            isarbuste2Created = true;
        }

//		========================================================================================
		//		Création des corps des montres
		//========================================================================================
		
		
		
		if ( m2EstCrée == false ) {
			monstre2 = new MonstreAquatique(world ,MonstreAquatique.monstreAquaDroite2, 150 , 380 , "droite") ;
			Pnj.monstres[1] = monstre2;
			Pnj.nbrDeMonstres = 2;
			m2EstCrée = true;
		} else {
			monstre2.déplacement();
			monstre2.représentation();
			monstre2.updateBody();
		}
		
		if ( m1EstCrée == false ) {
			monstre1 = new MonstreAquatique(world ,MonstreAquatique.monstreAquaFace2, 460 , 300 , "bas") ;
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
