package map.zoneGlace;

import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.physics.box2d.Body;
import com.badlogic.gdx.physics.box2d.World;
import com.mygdx.game.GameMain;

import decors.ClimatMontagneux;
import map.CadrillageMap;
import scenes.MainMenu;

public class SousMapE5 extends Sprite{
	
	public static Body cote1 ;
	public static boolean isCote1Created;
	public static Body cote2 ;
	public static boolean isCote2Created;
	public static Body cote3 ;
	public static boolean isCote3Created;
	
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
		
		game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 180+ x, 420+ y);
		game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 180+ x, 360+ y);
		game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 180+ x, 300+ y);
		game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 180+ x, 240+ y);
		
		game.getBatch().draw(ClimatMontagneux.escalierGlacé, 240+ x, 420+ y);
		game.getBatch().draw(ClimatMontagneux.escalierGlacé, 240+ x, 360+ y);
		game.getBatch().draw(ClimatMontagneux.escalierGlacé, 240+ x, 300+ y);
		game.getBatch().draw(ClimatMontagneux.escalierGlacé, 240+ x, 240+ y);

		game.getBatch().draw(ClimatMontagneux.cheminGlace, 240+ x, 180+ y);
		game.getBatch().draw(ClimatMontagneux.cheminGlace, 240+ x, 120+ y);
		game.getBatch().draw(ClimatMontagneux.cheminGlace, 240+ x, 60+ y);
		
		game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 300+ x, 420+ y);
		game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 300+ x, 360+ y);
		game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 300+ x, 300+ y);
		game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 300+ x, 240+ y);
		
		game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 360+ x, 420+ y);
		game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 360+ x, 360+ y);
		game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 360+ x, 300+ y);
		game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 360+ x, 240+ y);
		
		game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 540+ x, 420+ y);
		game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 540+ x, 360+ y);
		game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 540+ x, 300+ y);
		game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 540+ x, 240+ y);
		
		game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 0+ x, 420+ y);
		game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 0+ x, 360+ y);
		game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 60+ x, 420+ y);
		game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 60+ x, 360+ y);
		game.getBatch().draw(ClimatMontagneux.murGlacéGauche, 60+ x, 300+ y);
		
		game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 120+ x, 420+ y);
		game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 120+ x, 360+ y);
		game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 120+ x, 300+ y);
		game.getBatch().draw(ClimatMontagneux.murGlacéGauche, 120+ x, 240+ y);

		ClimatMontagneux.eauProfonde300(game,360+x,180+y);
		ClimatMontagneux.eauProfonde150(game,420+x,180+y);
		ClimatMontagneux.eauProfonde150(game,480+x,180+y);
		ClimatMontagneux.eauProfonde300(game,360+x,120+y);
		ClimatMontagneux.eauProfonde300(game,420+x,120+y);
		ClimatMontagneux.eauProfonde300(game,480+x,120+y);
		ClimatMontagneux.eauProfonde300(game,540+x,180+y);
		ClimatMontagneux.eauProfonde300(game,540+x,120+y);

		ClimatMontagneux.eauProfonde(game,00+x,120+y);
		ClimatMontagneux.eauProfonde(game,00+x,240+y);
		ClimatMontagneux.eauProfonde(game,00+x,180+y);
		ClimatMontagneux.eauProfonde(game,60+x,60+y);
		ClimatMontagneux.eauProfonde(game,60+x,120+y);
		ClimatMontagneux.eauProfonde(game,60+x,180+y);
		ClimatMontagneux.eauProfonde(game,120+x,180+y);
		ClimatMontagneux.eauProfonde(game,120+x,120+y);
		ClimatMontagneux.eauProfonde(game,120+x,60+y);
		ClimatMontagneux.eauProfonde(game,180+x,180+y);
		ClimatMontagneux.eauProfonde(game,180+x,120+y);
		ClimatMontagneux.eauProfonde(game,180+x,60+y);
		
		ClimatMontagneux.eauProfonde(game,300+x,180+y);
		ClimatMontagneux.eauProfonde(game,300+x,120+y);
		ClimatMontagneux.eauProfonde(game,300+x,60+y);
		ClimatMontagneux.eauProfonde(game,360+x,60+y);
		ClimatMontagneux.eauProfonde(game,420+x,60+y);
		ClimatMontagneux.eauProfonde(game,480+x,60+y);
		ClimatMontagneux.eauProfonde(game,540+x,60+y);
		ClimatMontagneux.eauProfonde300(game,540+x,120+y);
		ClimatMontagneux.eauProfonde300(game,540+x,180+y);
		

		game.getBatch().draw(ClimatMontagneux.bordGlacéInf, 00+ x, 300+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéInfGau, 60+ x, 240+ y);
		game.getBatch().draw(ClimatMontagneux.tree, 00+ x, 320+ y);
		game.getBatch().draw(ClimatMontagneux.tree, 60+ x, 260+ y);
		
		game.getBatch().draw(ClimatMontagneux.bordGlacéSupDroi, 0+ x, 60+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéInf, 0+ x, 0+ y);
		game.getBatch().draw(ClimatMontagneux.cheminGlaceHori, 60+ x, 00+ y);
		game.getBatch().draw(ClimatMontagneux.cheminGlaceHori, 120+ x, 00+ y);
		game.getBatch().draw(ClimatMontagneux.cheminGlaceHori, 180+ x, 00+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéInf, 240+ x, 00+ y);
		game.getBatch().draw(ClimatMontagneux.cheminGlaceHori, 300+ x, 00+ y);
		game.getBatch().draw(ClimatMontagneux.cheminGlaceHori, 360+ x, 00+ y);
		game.getBatch().draw(ClimatMontagneux.cheminGlaceHori, 420+ x, 00+ y);
		game.getBatch().draw(ClimatMontagneux.cheminGlaceHori, 480+ x, 00+ y);
		game.getBatch().draw(ClimatMontagneux.cheminGlaceHori, 540+ x, 00+ y);
		
		game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 420+ x, 420+ y);
		game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 420+ x, 360+ y);
		game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 420+ x, 300+ y);
		game.getBatch().draw(ClimatMontagneux.murGlacéGauche, 420+ x, 240+ y);
		game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 480+ x, 420+ y);
		game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 480+ x, 360+ y);
		game.getBatch().draw(ClimatMontagneux.murGlacéCentre, 480+ x, 300+ y);
		game.getBatch().draw(ClimatMontagneux.murGlacéGauche, 480+ x, 240+ y);
		ClimatMontagneux.annimationCascade(game, 440+x, 200+y);


		game.getBatch().draw(ClimatMontagneux.planteGelé, 0+ x, 60+ y);
		game.getBatch().draw(ClimatMontagneux.planteGelé3, 60+ x, 0+ y);
		game.getBatch().draw(ClimatMontagneux.planteGelé, 180+ x, 0+ y);
		game.getBatch().draw(ClimatMontagneux.planteGelé3, 240+ x, 0+ y);
		game.getBatch().draw(ClimatMontagneux.planteGelé, 450+ x, 0+ y);
		
	}

	public static void destroyBody() {
		// TODO Auto-generated method stub
		if ( isCote1Created) MainMenu.world.destroyBody(cote1);
		isCote1Created = false;
		
		if ( isCote2Created) MainMenu.world.destroyBody(cote2);
		isCote2Created = false;

		if ( isCote3Created) MainMenu.world.destroyBody(cote3);
		isCote3Created = false;
	}

	public static void createBodyAndType(World world) {
		// TODO Auto-generated method stub
		
		if ( isCote1Created == false ) {
			cote1 = ClimatMontagneux.createBody(130,360,180,240);
			isCote1Created = true;
		}
		if ( isCote2Created == false ) {
			cote2 = ClimatMontagneux.createBody(430,360,300,240);
			isCote2Created = true;
		}
		if ( isCote3Created == false ) {
			cote3 = ClimatMontagneux.createBody(300,0,600,1);
			isCote3Created = true;
		}
		
	}

	public static void destroyType() {
		// TODO Auto-generated method stub
		
	}
}
