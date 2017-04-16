package map.zoneGlace;

import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.physics.box2d.World;
import com.mygdx.game.GameMain;

import decors.ClimatMontagneux;
import decors.DonjonGlace;
import items.CoeurDeVie;
import map.CadrillageMap;
import scenes.MainMenu;

public class SousMapI1 extends Sprite{


    public static boolean isReceptaclePris = false; // à sauvegarder
	
	public static void sousMap(GameMain game, int x, int y){
		
		game.getBatch().draw(ClimatMontagneux.glace1, 0+ x, 0+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 0+ x, 60+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 0+ x, 120+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 0+ x, 180+ y);		
		game.getBatch().draw(ClimatMontagneux.glace1, 0 + x,240 + y);
		game.getBatch().draw(ClimatMontagneux.glace1, 0+ x, 300+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 0+ x, 360+ y);
		ClimatMontagneux.eauProfondeGlacée(game, 0+ x, 420+ y);
		
		game.getBatch().draw(ClimatMontagneux.glace1, 60+ x, 0+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 60+ x, 60+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 60+ x, 120+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 60+ x, 180+ y);		
		game.getBatch().draw(ClimatMontagneux.glace1, 60+ x, 240+ y);	
		game.getBatch().draw(ClimatMontagneux.glace1, 60+ x, 300+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 60+ x, 360+ y);
		ClimatMontagneux.eauProfondeGlacée(game, 60+ x, 420+ y);
		
		game.getBatch().draw(ClimatMontagneux.glace1, 120+ x, 0+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 120+ x, 60+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 120+ x, 120+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 120+ x, 180+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 120+ x, 240+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 120+ x, 300+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 120+ x, 360+ y);
		ClimatMontagneux.eauProfondeGlacée(game, 120+ x, 420+ y);
		
		game.getBatch().draw(ClimatMontagneux.glace1, 180+ x, 0+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 180+ x, 60+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 180+ x, 120+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 180+ x, 180+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 180+ x, 240+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 180+ x, 300+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 180+ x, 360+ y);
		ClimatMontagneux.eauProfondeGlacée(game, 180+ x, 420+ y);
		
		game.getBatch().draw(ClimatMontagneux.glace1, 240+ x, 0+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 240+ x, 60+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 240+ x, 120+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 240+ x, 180+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 240+ x, 240+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 240+ x, 300+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 240+ x, 360+ y);
		ClimatMontagneux.eauProfondeGlacée(game, 240+ x, 420+ y);
		
		game.getBatch().draw(ClimatMontagneux.glace1, 300+ x, 0+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 300+ x, 60+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 300+ x, 120+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 300+ x, 180+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 300+ x, 240+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 300+ x, 300+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 300+ x, 360+ y);
		ClimatMontagneux.eauProfondeGlacée(game, 300+ x, 420+ y);
		
		game.getBatch().draw(ClimatMontagneux.glace1, 360+ x, 0+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 360+ x, 60+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 360+ x, 120+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 360+ x, 180+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 360+ x, 240+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 360+ x, 300+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 360+ x, 360+ y);
		ClimatMontagneux.eauProfondeGlacée(game, 360+ x, 420+ y);
		
		game.getBatch().draw(ClimatMontagneux.glace1, 420+ x, 0+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 420+ x, 60+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 420+ x, 120+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 420+ x, 180+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 420+ x, 240+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 420+ x, 300+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 420+ x, 360+ y);
		ClimatMontagneux.eauProfondeGlacée(game, 420+ x, 420+ y);
		
		game.getBatch().draw(ClimatMontagneux.glace1, 480+ x, 0+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 480+ x, 60+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 480+ x, 120+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 480+ x, 180+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 480+ x, 240+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 480+ x, 300+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 480+ x, 360+ y);
		ClimatMontagneux.eauProfondeGlacée(game, 480+ x, 420+ y);


		ClimatMontagneux.eauProfondeGlacée(game, 540+ x, 0+ y);
		ClimatMontagneux.eauProfondeGlacée(game, 540+ x, 60+ y);
		ClimatMontagneux.eauProfondeGlacée(game, 540+ x, 120+ y);
		ClimatMontagneux.eauProfondeGlacée(game, 540+ x, 180+ y);
		ClimatMontagneux.eauProfondeGlacée(game, 540+ x, 240+ y);
		ClimatMontagneux.eauProfondeGlacée(game, 540+ x, 300+ y);
		ClimatMontagneux.eauProfondeGlacée(game, 540+ x, 360+ y);
		ClimatMontagneux.eauProfondeGlacée(game, 540+ x, 420+ y);
//

		game.getBatch().draw(ClimatMontagneux.bordGlacéSup, 0+ x, 360+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéSup, 60+ x, 360+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéSup, 120+ x, 360+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéSup, 180+ x, 360+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéSup, 240+ x, 360+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéSup, 300+ x, 360+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéSup, 360+ x, 360+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéSup, 420+ x, 360+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéSupDroi, 480+ x, 360+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéDroi, 480+ x, 300+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéDroi, 480+ x, 240+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéDroi, 480+ x, 180+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéDroi, 480+ x, 120+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéDroi, 480+ x, 60+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéDroi, 480+ x, 0+ y);

		game.getBatch().draw(ClimatMontagneux.bordGlacéDroi, 180+ x, 300+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéDroi, 180+ x, 240+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéDroi, 180+ x, 180+ y);

		game.getBatch().draw(ClimatMontagneux.bordGlacéInf, 240+ x, 360+ y);
		game.getBatch().draw(ClimatMontagneux.murSombreGlacéCentre2, 240+ x, 300+ y);
		game.getBatch().draw(ClimatMontagneux.glaceSombre3, 240+ x, 240+ y);
		game.getBatch().draw(ClimatMontagneux.entréGrotteArc, 240+ x, 180+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéInf, 300+ x, 360+ y);
		game.getBatch().draw(ClimatMontagneux.murSombreGlacéCentre2, 300+ x, 300+ y);
		game.getBatch().draw(ClimatMontagneux.glaceSombre3, 300+ x, 240+ y);
		game.getBatch().draw(ClimatMontagneux.entréGrotteArc, 300+ x, 180+ y);

		game.getBatch().draw(ClimatMontagneux.bordGlacéGau, 360+ x, 300+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéGau, 360+ x, 240+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéGau, 360+ x, 180+ y);

//


        game.getBatch().draw(ClimatMontagneux.planteGelé, 110+ x, 60+ y);
        game.getBatch().draw(ClimatMontagneux.planteGelé3, 110+ x, 120+ y);
        game.getBatch().draw(ClimatMontagneux.planteGelé3, 110+ x, 240+ y);
        game.getBatch().draw(ClimatMontagneux.planteGelé, 110+ x, 300+ y);

        game.getBatch().draw(ClimatMontagneux.planteGelé, 420+ x, 60+ y);
        game.getBatch().draw(ClimatMontagneux.planteGelé, 480+ x, 60+ y);
        game.getBatch().draw(ClimatMontagneux.planteGelé, 420+ x, 0+ y);
        game.getBatch().draw(ClimatMontagneux.planteGelé, 480+ x, 0+ y);

		game.getBatch().draw(DonjonGlace.murHorizontal, 92+ x, 350+ y);
		game.getBatch().draw(DonjonGlace.murHorizontal, 2+ x, 350+ y);
		game.getBatch().draw(DonjonGlace.murHorizontal, -88+ x, 350+ y);
		game.getBatch().draw(DonjonGlace.murVertical, 162+ x, 270+ y);
		game.getBatch().draw(DonjonGlace.murVertical, 162+ x, 100+ y);
		game.getBatch().draw(DonjonGlace.murVertical, 162+ x, -70+ y);


        game.getBatch().draw(ClimatMontagneux.tree, 0+ x, 300+ y);
        game.getBatch().draw(ClimatMontagneux.tree, 60+ x, 300+ y);

        game.getBatch().draw(ClimatMontagneux.tree, 250+ x, 380+ y);
        game.getBatch().draw(ClimatMontagneux.tree, 310+ x, 380+ y);
        game.getBatch().draw(ClimatMontagneux.tree, 370+ x, 380+ y);
        game.getBatch().draw(ClimatMontagneux.tree, 430+ x, 380+ y);
        game.getBatch().draw(ClimatMontagneux.tree, 490+ x, 380+ y);

        game.getBatch().draw(ClimatMontagneux.tree, 350+ x, 340+ y);
        game.getBatch().draw(ClimatMontagneux.tree, 410+ x, 340+ y);
        game.getBatch().draw(ClimatMontagneux.tree, 470+ x, 340+ y);

        game.getBatch().draw(ClimatMontagneux.tree, 370+ x, 300+ y);
        game.getBatch().draw(ClimatMontagneux.tree, 430+ x, 300+ y);
        game.getBatch().draw(ClimatMontagneux.tree, 490+ x, 300+ y);

        game.getBatch().draw(ClimatMontagneux.tree, 350+ x, 260+ y);
        game.getBatch().draw(ClimatMontagneux.tree, 410+ x, 260+ y);
        game.getBatch().draw(ClimatMontagneux.tree, 470+ x, 260+ y);

        game.getBatch().draw(ClimatMontagneux.tree, 370+ x, 220+ y);
        game.getBatch().draw(ClimatMontagneux.tree, 430+ x, 220+ y);
        game.getBatch().draw(ClimatMontagneux.tree, 490+ x, 220+ y);

        game.getBatch().draw(ClimatMontagneux.tree, 350+ x, 180+ y);
        game.getBatch().draw(ClimatMontagneux.tree, 410+ x, 180+ y);
        game.getBatch().draw(ClimatMontagneux.tree, 470+ x, 180+ y);

        game.getBatch().draw(ClimatMontagneux.tree, 370+ x, 140+ y);
        game.getBatch().draw(ClimatMontagneux.tree, 430+ x, 140+ y);
        game.getBatch().draw(ClimatMontagneux.tree, 490+ x, 140+ y);

        game.getBatch().draw(ClimatMontagneux.tree, 190+ x, 360+ y);
        game.getBatch().draw(ClimatMontagneux.tree, 190+ x, 300+ y);
        game.getBatch().draw(ClimatMontagneux.tree, 190+ x, 240+ y);
        game.getBatch().draw(ClimatMontagneux.tree, 190+ x, 180+ y);
        game.getBatch().draw(ClimatMontagneux.tree, 190+ x, 120+ y);

        game.getBatch().draw(ClimatMontagneux.tree, 190+ x, 60+ y);
        game.getBatch().draw(ClimatMontagneux.tree, 220+ x, 30+ y);

        game.getBatch().draw(ClimatMontagneux.tree, 190+ x, 0+ y);
        game.getBatch().draw(ClimatMontagneux.tree, 250+ x, 0+ y);
        game.getBatch().draw(ClimatMontagneux.tree, 310+ x, 0+ y);
        game.getBatch().draw(ClimatMontagneux.tree, 370+ x, 0+ y);

        game.getBatch().draw(ClimatMontagneux.tree, 220+ x, -30+ y);
        game.getBatch().draw(ClimatMontagneux.tree, 280+ x, -30+ y);
        game.getBatch().draw(ClimatMontagneux.tree, 340+ x, -30+ y);

        game.getBatch().draw(ClimatMontagneux.tree, 190+ x, -60+ y);
        game.getBatch().draw(ClimatMontagneux.tree, 250+ x, -60+ y);
        game.getBatch().draw(ClimatMontagneux.tree, 310+ x, -60+ y);
        game.getBatch().draw(ClimatMontagneux.tree, 370+ x, -60+ y);


		game.getBatch().draw(ClimatMontagneux.piedGlacéSup, 0 + x, 0 + y);
		game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 0 + x, 60 + y);
		game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 0 + x, 120 + y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéInf, 0 + x, 180 + y);
        game.getBatch().draw(ClimatMontagneux.bordGlacéSup, 0 + x, 300 + y);
        game.getBatch().draw(ClimatMontagneux.bordGlacéSupDroi, 60 + x, 300 + y);
        game.getBatch().draw(ClimatMontagneux.bordGlacéDroi, 60 + x, 240 + y);

        game.getBatch().draw(ClimatMontagneux.bordGlacéSupDroi, 60 + x, 0 + y);
		game.getBatch().draw(ClimatMontagneux.murGlacéDroite, 60 + x, 60 + y);
		game.getBatch().draw(ClimatMontagneux.murGlacéDroite, 60 + x, 120 + y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéInfDroi, 60 + x, 180 + y);


        if ( ! (isReceptaclePris) ) game.getBatch().draw(CoeurDeVie.receptacleDeCoeur, 60 + x, 230 + y);
        else if ( isReceptaclePris && MainMenu.Link.annimationAward ) game.getBatch().draw(CoeurDeVie.receptacleDeCoeur, MainMenu.Link.getX() - 7+ x, MainMenu.Link.getY() + 50+ y);




        DonjonGlace.annimationFlag(game, 80 +x , 30 + y);
        DonjonGlace.annimationFlag(game, 80 +x , 330 + y);


    }

	public static void destroyBody() {
		// TODO Auto-generated method stub
		
	}

	public static void createBodyAndType(World world) {
		// TODO Auto-generated method stub
        if ( !(isReceptaclePris)) CadrillageMap.setTypeDeDécor(60/60, 180/60, "receptacleDeCoeur");
	}

	public static void destroyType() {
		// TODO Auto-generated method stub
		
	}
}
