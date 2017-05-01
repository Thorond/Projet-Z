package map.zoneGlace;

import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.physics.box2d.World;
import com.mygdx.game.GameMain;

import decors.ClimatMontagneux;
import items.CoeurDeVie;
import map.CadrillageMap;
import scenes.MainMenu;

public class SousMapE1 extends Sprite{


	public static boolean isReceptaclePris = false; // à sauvegarder

	public static void sousMap(GameMain game, int x, int y){
		
		ClimatMontagneux.eauProfondeGlacée(game,0+ x, 0+y);
		ClimatMontagneux.eauProfondeGlacée(game,0+ x, 60+y);
		ClimatMontagneux.eauProfondeGlacée(game,0+ x, 120+y);
		ClimatMontagneux.eauProfondeGlacée(game,0+ x, 180+y);
		ClimatMontagneux.eauProfondeGlacée(game,0+ x, 240+y);
		ClimatMontagneux.eauProfondeGlacée(game,0+ x, 300+y);
		ClimatMontagneux.eauProfondeGlacée(game,0+ x, 360+y);
		ClimatMontagneux.eauProfondeGlacée(game,0+ x, 420+y);
		
		ClimatMontagneux.eauProfondeGlacée(game,60+ x, 0+y);
		ClimatMontagneux.eauProfondeGlacée(game,60+ x, 60+y);
		ClimatMontagneux.eauProfondeGlacée(game,60+ x, 120+y);
		ClimatMontagneux.eauProfondeGlacée(game,60+ x, 180+y);
		ClimatMontagneux.eauProfondeGlacée(game,60+ x, 240+y);
		ClimatMontagneux.eauProfondeGlacée(game,60+ x, 300+y);
		ClimatMontagneux.eauProfondeGlacée(game,60+ x, 360+y);
		ClimatMontagneux.eauProfondeGlacée(game,60+ x, 420+y);

		ClimatMontagneux.eauProfondeGlacée(game,120+ x, 60+y);
		ClimatMontagneux.eauProfondeGlacée(game,120+ x, 180+y);
		ClimatMontagneux.eauProfondeGlacée(game,120+ x, 240+y);
		ClimatMontagneux.eauProfondeGlacée(game,120+ x, 300+y);
		ClimatMontagneux.eauProfondeGlacée(game,120+ x, 360+y);
		ClimatMontagneux.eauProfondeGlacée(game,120+ x, 420+y);
		
		
		ClimatMontagneux.eauProfondeGlacée(game,180+ x, 0+y);
		ClimatMontagneux.eauProfondeGlacée(game,180+ x, 60+y);
		ClimatMontagneux.eauProfondeGlacée(game,180+ x, 120+y);
		ClimatMontagneux.eauProfondeGlacée(game,180+ x, 180+y);
		ClimatMontagneux.eauProfondeGlacée(game,180+ x, 240+y);
		ClimatMontagneux.eauProfondeGlacée(game,180+ x, 300+y);
		ClimatMontagneux.eauProfondeGlacée(game,180+ x, 360+y);
		ClimatMontagneux.eauProfondeGlacée(game,180+ x, 420+y);
		
		ClimatMontagneux.eauProfondeGlacée(game,240+ x, 0+y);
		ClimatMontagneux.eauProfondeGlacée(game,240+ x, 60+y);
		ClimatMontagneux.eauProfondeGlacée(game,240+ x, 120+y);
		ClimatMontagneux.eauProfondeGlacée(game,240+ x, 180+y);
		ClimatMontagneux.eauProfondeGlacée(game,240+ x, 240+y);
		ClimatMontagneux.eauProfondeGlacée(game,240+ x, 300+y);
		ClimatMontagneux.eauProfondeGlacée(game,240+ x, 360+y);
		ClimatMontagneux.eauProfondeGlacée(game,240+ x, 420+y);
		
		ClimatMontagneux.eauProfondeGlacée(game,300+ x, 0+y);
		ClimatMontagneux.eauProfondeGlacée(game,300+ x, 60+y);
		ClimatMontagneux.eauProfondeGlacée(game,300+ x, 180+y);
		ClimatMontagneux.eauProfondeGlacée(game,300+ x, 240+y);
		ClimatMontagneux.eauProfondeGlacée(game,300+ x, 420+y);
		
		ClimatMontagneux.eauProfondeGlacée(game,360+ x, 0+y);
		ClimatMontagneux.eauProfondeGlacée(game,360+ x, 60+y);
		ClimatMontagneux.eauProfondeGlacée(game,360+ x, 120+y);
		ClimatMontagneux.eauProfondeGlacée(game,360+ x, 180+y);
		ClimatMontagneux.eauProfondeGlacée(game,360+ x, 240+y);
		ClimatMontagneux.eauProfondeGlacée(game,360+ x, 420+y);
		
		ClimatMontagneux.eauProfondeGlacée(game,420+ x, 0+y);
		ClimatMontagneux.eauProfondeGlacée(game,420+ x, 60+y);
		ClimatMontagneux.eauProfondeGlacée(game,420+ x, 120+y);
		ClimatMontagneux.eauProfondeGlacée(game,420+ x, 180+y);
		ClimatMontagneux.eauProfondeGlacée(game,420+ x, 240+y);
		ClimatMontagneux.eauProfondeGlacée(game,420+ x, 300+y);
		ClimatMontagneux.eauProfondeGlacée(game,420+ x, 360+y);
		ClimatMontagneux.eauProfondeGlacée(game,420+ x, 420+y);
		
		ClimatMontagneux.eauProfondeGlacée(game,480+ x, 0+y);
		ClimatMontagneux.eauProfondeGlacée(game,480+ x, 60+y);
		ClimatMontagneux.eauProfondeGlacée(game,480+ x, 120+y);
		ClimatMontagneux.eauProfondeGlacée(game,480+ x, 180+y);
		ClimatMontagneux.eauProfondeGlacée(game,480+ x, 240+y);
		ClimatMontagneux.eauProfondeGlacée(game,480+ x, 300+y);
		ClimatMontagneux.eauProfondeGlacée(game,480+ x, 360+y);
		ClimatMontagneux.eauProfondeGlacée(game,480+ x, 420+y);
		
		ClimatMontagneux.eauProfondeGlacée(game,540+ x, 0+y);
		ClimatMontagneux.eauProfondeGlacée(game,540+ x, 60+y);
		ClimatMontagneux.eauProfondeGlacée(game,540+ x, 120+y);
		ClimatMontagneux.eauProfondeGlacée(game,540+ x, 180+y);
		ClimatMontagneux.eauProfondeGlacée(game,540+ x, 240+y);
		ClimatMontagneux.eauProfondeGlacée(game,540+ x, 300+y);
		ClimatMontagneux.eauProfondeGlacée(game,540+ x, 360+y);
		ClimatMontagneux.eauProfondeGlacée(game,540+ x, 420+y);
		
		game.getBatch().draw(ClimatMontagneux.morceauGlaceHautGauche, 60+ x, 0+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 120+ x, 0+ y);
		game.getBatch().draw(ClimatMontagneux.morceauGlaceHaut, 120+ x, 0+ y);
		game.getBatch().draw(ClimatMontagneux.morceauGlaceHautDroite, 180+ x, 0+ y);
		
		game.getBatch().draw(ClimatMontagneux.morceauGlaceGauche, 60+ x, 120+ y);
		game.getBatch().draw(ClimatMontagneux.morceauGlaceHautGauche, 60+ x, 180+ y);
		game.getBatch().draw(ClimatMontagneux.morceauGlaceBasGauche, 60+ x, 60+ y);
		game.getBatch().draw(ClimatMontagneux.morceauGlaceGauche, 60+ x, 120+ y);
		game.getBatch().draw(ClimatMontagneux.morceauGlaceHaut, 120+ x, 180+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 120+ x, 120+ y);
		game.getBatch().draw(ClimatMontagneux.glaceFragmentée, 120+ x, 120+ y);
		game.getBatch().draw(ClimatMontagneux.morceauGlacéInf, 120+ x, 60+ y);
		game.getBatch().draw(ClimatMontagneux.morceauGlaceHautDroite, 180+ x, 180+ y);
		game.getBatch().draw(ClimatMontagneux.morceauGlaceBasDroite, 180+ x, 60+ y);
		game.getBatch().draw(ClimatMontagneux.morceauGlaceDroite, 180+ x, 120+ y);
		
		game.getBatch().draw(ClimatMontagneux.morceauGlaceGauche, 240+ x, 120+ y);
		game.getBatch().draw(ClimatMontagneux.morceauGlaceHautGauche, 240+ x, 180+ y);
		game.getBatch().draw(ClimatMontagneux.morceauGlaceBasGauche, 240+ x, 60+ y);
		game.getBatch().draw(ClimatMontagneux.morceauGlaceGauche, 240+ x, 120+ y);
		game.getBatch().draw(ClimatMontagneux.morceauGlaceHaut, 300+ x, 180+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 300+ x, 120+ y);
		game.getBatch().draw(ClimatMontagneux.glaceFragmentée, 300+ x, 120+ y);
		game.getBatch().draw(ClimatMontagneux.morceauGlacéInf, 300+ x, 60+ y);
		game.getBatch().draw(ClimatMontagneux.morceauGlaceHautDroite, 360+ x, 180+ y);
		game.getBatch().draw(ClimatMontagneux.morceauGlaceBasDroite, 360+ x, 60+ y);
		game.getBatch().draw(ClimatMontagneux.morceauGlaceDroite, 360+ x, 120+ y);
		
		game.getBatch().draw(ClimatMontagneux.morceauGlaceGauche, 240+ x, 300+ y);
		game.getBatch().draw(ClimatMontagneux.morceauGlaceHautGauche, 240+ x, 420+ y);
		game.getBatch().draw(ClimatMontagneux.morceauGlaceBasGauche, 240+ x, 240+ y);
		game.getBatch().draw(ClimatMontagneux.morceauGlaceGauche, 240+ x, 300+ y);
		game.getBatch().draw(ClimatMontagneux.morceauGlaceGauche, 240+ x, 360+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 300+ x, 300+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 360+ x, 300+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 300+ x, 360+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 360+ x, 360+ y);
		game.getBatch().draw(ClimatMontagneux.glaceFragmentée, 300+ x, 300+ y);
		game.getBatch().draw(ClimatMontagneux.glaceFragmentée, 360+ x, 300+ y);
		game.getBatch().draw(ClimatMontagneux.glaceFragmentée, 300+ x, 360+ y);
		game.getBatch().draw(ClimatMontagneux.glaceFragmentée, 360+ x, 360+ y);
		game.getBatch().draw(ClimatMontagneux.morceauGlacéInf, 300+ x, 240+ y);
		game.getBatch().draw(ClimatMontagneux.morceauGlacéInf, 360+ x, 240+ y);
		game.getBatch().draw(ClimatMontagneux.morceauGlaceHaut, 300+ x, 420+ y);
		game.getBatch().draw(ClimatMontagneux.morceauGlaceHaut, 360+ x, 420+ y);
		game.getBatch().draw(ClimatMontagneux.morceauGlaceHautDroite, 420+ x, 420+ y);
		game.getBatch().draw(ClimatMontagneux.morceauGlaceBasDroite, 420+ x, 240+ y);
		game.getBatch().draw(ClimatMontagneux.morceauGlaceDroite, 420+ x, 300+ y);
		game.getBatch().draw(ClimatMontagneux.morceauGlaceDroite, 420+ x, 360+ y);

        if ( ! (isReceptaclePris) ) game.getBatch().draw(CoeurDeVie.receptacleDeCoeur, 335+ x, 360+ y);
        else if ( isReceptaclePris && MainMenu.Link.annimationAward ) {
            game.getBatch().draw(CoeurDeVie.receptacleDeCoeur, MainMenu.Link.getX() - 7+ x, MainMenu.Link.getY() + 50+ y);
            game.getBatch().draw(CoeurDeVie.texteRéceptacle, 100 + x, 60+y);
        }

		
	}

	public static void destroyBody() {
		// TODO Auto-generated method stub
		
	}

	public static void createBodyAndType(World world) {
		// TODO Auto-generated method stub
        if ( !(isReceptaclePris)) CadrillageMap.setTypeDeDécor(300/60, 360/60, "receptacleDeCoeur");
	}

	public static void destroyType() {
		// TODO Auto-generated method stub
		
	}
}
