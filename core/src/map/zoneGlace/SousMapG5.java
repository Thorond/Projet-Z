package map.zoneGlace;

import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.physics.box2d.World;
import com.mygdx.game.GameMain;

import decors.ClimatMontagneux;
import items.Coffre;
import map.CadrillageMap;
import scenes.MainMenu;

public class SousMapG5 extends Sprite{



	public static boolean ouvertureCoffre = false; // à sauvegarder
	public static boolean coffreOuvert = false; // à sauvegarder


	public static void sousMap(GameMain game, int x, int y){
		
		game.getBatch().draw(ClimatMontagneux.glace1, 0+ x, 0+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 0+ x, 60+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 0+ x, 120+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 0+ x, 180+ y);		
		game.getBatch().draw(ClimatMontagneux.glace1, 0+ x,240 + y);
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


		game.getBatch().draw(ClimatMontagneux.bordGlacéInfDroi, 0+ x, 360+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéInf, 60+ x, 420+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéInfDroi, 120+ x, 420+ y);

		game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 0+ x, 300+ y);
		game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 0+ x, 240+ y);
		game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 0+ x, 180+ y);
		game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 0+ x, 120+ y);
		
		game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 60+ x, 360+ y);
		game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 60+ x, 300+ y);
		game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 60+ x, 180+ y);
		game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 60+ x, 120+ y);

		game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 120+ x, 360+ y);
		game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 120+ x, 300+ y);
		game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 120+ x, 180+ y);
		game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 120+ x, 120+ y);
		
		game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 180+ x, 420+ y);
		game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 180+ x, 360+ y);
		game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 180+ x, 180+ y);
		game.getBatch().draw(ClimatMontagneux.murGlacéDroite, 180+ x, 120+ y);
		
		game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 240+ x, 420+ y);
		game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 240+ x, 360+ y);
		game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 240+ x, 240+ y);
		game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 240+ x, 180+ y);
		
		game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 300+ x, 420+ y);
		game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 300+ x, 360+ y);
		game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 300+ x, 240+ y);
		game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 300+ x, 180+ y);
		
		game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 360+ x, 420+ y);
		game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 360+ x, 240+ y);
		game.getBatch().draw(ClimatMontagneux.murGlacéDroite, 360+ x, 180+ y);
		
		game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 420+ x, 420+ y);
		game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 420+ x, 300+ y);
		game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 420+ x, 240+ y);
		
		game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 480+ x, 420+ y);
		game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 480+ x, 300+ y);
		game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 480+ x, 240+ y);
		
		game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 540+ x, 300+ y);
		game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 540+ x, 240+ y);
		

		game.getBatch().draw(ClimatMontagneux.bordGlacéInf, 60+ x, 240+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéInf, 120+ x, 240+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéInfDroi, 180+ x, 240+ y);
		game.getBatch().draw(ClimatMontagneux.piedGlacéSup, 180+ x, 300+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéInf, 240+ x, 300+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéInf, 300+ x, 300+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéInfDroi, 360+ x, 300+ y);
		game.getBatch().draw(ClimatMontagneux.piedGlacéSup, 360+ x, 360+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéInf, 420+ x, 360+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéInf, 480+ x, 360+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéInfDroi, 540+ x, 360+ y);
		game.getBatch().draw(ClimatMontagneux.piedGlacéSup, 540+ x, 420+ y);

		game.getBatch().draw(ClimatMontagneux.piedGlacéSup, 00+ x, 60+ y);
		game.getBatch().draw(ClimatMontagneux.piedGlacéSup, 60+ x, 60+ y);
		game.getBatch().draw(ClimatMontagneux.piedGlacéSup, 120+ x, 60+ y);
		game.getBatch().draw(ClimatMontagneux.piedGlacéSup, 180+ x, 60+ y);
		game.getBatch().draw(ClimatMontagneux.piedGlacéSup, 240+ x, 120+ y);
		game.getBatch().draw(ClimatMontagneux.piedGlacéSup, 300+ x, 120+ y);
		game.getBatch().draw(ClimatMontagneux.piedGlacéSup, 360+ x, 120+ y);
		game.getBatch().draw(ClimatMontagneux.piedGlacéSup, 420+ x, 180+ y);
		game.getBatch().draw(ClimatMontagneux.piedGlacéSup, 480+ x, 180+ y);
		game.getBatch().draw(ClimatMontagneux.piedGlacéSup, 540+ x, 180+ y);

		game.getBatch().draw(ClimatMontagneux.bordGlacéInf, 0+ x, 0+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéInf, 60+ x, 0+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéInf, 120+ x, 0+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéInf, 180+ x, 0+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéInf, 240+ x, 0+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéInf, 300+ x, 0+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéInf, 360+ x, 0+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéInf, 420+ x, 0+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéInf, 480+ x, 0+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéInf, 540+ x, 0+ y);


        game.getBatch().draw(ClimatMontagneux.tree, -50+ x, 70+ y);
        game.getBatch().draw(ClimatMontagneux.tree, 10+ x, 70+ y);
        game.getBatch().draw(ClimatMontagneux.tree, 70+ x, 70+ y);
        game.getBatch().draw(ClimatMontagneux.tree, 130+ x, 70+ y);
        game.getBatch().draw(ClimatMontagneux.tree, 190+ x, 70+ y);
        game.getBatch().draw(ClimatMontagneux.tree, 250+ x, 130+ y);
        game.getBatch().draw(ClimatMontagneux.tree, 310+ x, 130+ y);
        game.getBatch().draw(ClimatMontagneux.tree, 370+ x, 130+ y);
        game.getBatch().draw(ClimatMontagneux.tree, 430+ x, 190+ y);
        game.getBatch().draw(ClimatMontagneux.tree, 490+ x, 190+ y);
        game.getBatch().draw(ClimatMontagneux.tree, 550+ x, 190+ y);

        game.getBatch().draw(ClimatMontagneux.tree, 430+ x, 20+ y);
        game.getBatch().draw(ClimatMontagneux.tree, 490+ x, 20+ y);
        game.getBatch().draw(ClimatMontagneux.tree, 550+ x, 20+ y);

        if ( ouvertureCoffre == false ) game.getBatch().draw(ClimatMontagneux.coffreBleuFermé, 70+ x,260+ y);
        else {
            if ( coffreOuvert == false ) {
                if ( Coffre.ouvert1 == true && Coffre.ouvert2 == true ){
                    coffreOuvert = true;
                }
                Coffre.annimationCoffreBleu(game, 70+ x,260+ y);

            } else {
                game.getBatch().draw(ClimatMontagneux.coffreBleuOuvert3, 70+ x,260+ y);
            }

        }
        if ( MainMenu.Link.annimationAward ) {
//			game.getBatch().draw(DonjonGlace.CléHaute, MainMenu.Link.getX() - 10, MainMenu.Link.getY() +10);
//			game.getBatch().draw(DonjonGlace.texteClé, 100 + x, 10+y);
        }
		
	}

	public static void destroyBody() {
		// TODO Auto-generated method stub
		
	}

	public static void createBodyAndType(World world) {
		// TODO Auto-generated method stub

        CadrillageMap.setTypeDeDécor(1,4, "coffreBleu");
	}

	public static void destroyType() {
		// TODO Auto-generated method stub
		
	}
}
