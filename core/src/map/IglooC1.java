package map;

import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.physics.box2d.World;
import com.mygdx.game.GameMain;

import decors.ClimatMontagneux;
import items.Bouclier;
import menus.MenuGameover;
import scenes.MainMenu;

public class IglooC1 extends Sprite{
	
	public static void représentation(GameMain game, int x, int y){
		
		game.getBatch().draw(MenuGameover.gameOverT,0,0);
		
		game.getBatch().draw(ClimatMontagneux.murSombreGlacéCentre, 0+ x, 180+ y);		
		game.getBatch().draw(ClimatMontagneux.murSombreGlacéCentre, 0 + x,240 + y);
		game.getBatch().draw(ClimatMontagneux.murSombreGlacéCentre, 0+ x, 300+ y);
		game.getBatch().draw(ClimatMontagneux.murSombreGlacéCentre, 0+ x, 360+ y);

		game.getBatch().draw(ClimatMontagneux.murSombreGlacéCentre, 60+ x, 120+ y);
		game.getBatch().draw(ClimatMontagneux.murSombreGlacéCentre, 60+ x, 180+ y);		
		game.getBatch().draw(ClimatMontagneux.glace1, 60+ x, 240+ y);	
		game.getBatch().draw(ClimatMontagneux.glace1, 60+ x, 300+ y);
		game.getBatch().draw(ClimatMontagneux.murSombreGlacéCentre, 60+ x, 360+ y);
		game.getBatch().draw(ClimatMontagneux.murSombreGlacéCentre, 60+ x, 420+ y);

		game.getBatch().draw(ClimatMontagneux.murSombreGlacéCentre, 120+ x, 60+ y);
		game.getBatch().draw(ClimatMontagneux.murSombreGlacéCentre, 120+ x, 120+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 120+ x, 180+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 120+ x, 240+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 120+ x, 300+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 120+ x, 360+ y);
		game.getBatch().draw(ClimatMontagneux.murSombreGlacéCentre, 120+ x, 420+ y);
		
		game.getBatch().draw(ClimatMontagneux.murSombreGlacéCentre, 180+ x, 0+ y);
		game.getBatch().draw(ClimatMontagneux.murSombreGlacéCentre, 180+ x, 60+ y);
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

		game.getBatch().draw(ClimatMontagneux.murSombreGlacéCentre, 360+ x, 0+ y);
		game.getBatch().draw(ClimatMontagneux.murSombreGlacéCentre, 360+ x, 60+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 360+ x, 120+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 360+ x, 180+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 360+ x, 240+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 360+ x, 300+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 360+ x, 360+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 360+ x, 420+ y);

		game.getBatch().draw(ClimatMontagneux.murSombreGlacéCentre, 420+ x, 60+ y);
		game.getBatch().draw(ClimatMontagneux.murSombreGlacéCentre, 420+ x, 120+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 420+ x, 180+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 420+ x, 240+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 420+ x, 300+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 420+ x, 360+ y);
		game.getBatch().draw(ClimatMontagneux.murSombreGlacéCentre, 420+ x, 420+ y);

		game.getBatch().draw(ClimatMontagneux.murSombreGlacéCentre, 480+ x, 120+ y);
		game.getBatch().draw(ClimatMontagneux.murSombreGlacéCentre, 480+ x, 180+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 480+ x, 240+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 480+ x, 300+ y);
		game.getBatch().draw(ClimatMontagneux.murSombreGlacéCentre, 480+ x, 360+ y);
		game.getBatch().draw(ClimatMontagneux.murSombreGlacéCentre, 480+ x, 420+ y);

		game.getBatch().draw(ClimatMontagneux.murSombreGlacéCentre, 540+ x, 180+ y);
		game.getBatch().draw(ClimatMontagneux.murSombreGlacéCentre, 540+ x, 240+ y);
		game.getBatch().draw(ClimatMontagneux.murSombreGlacéCentre, 540+ x, 300+ y);
		game.getBatch().draw(ClimatMontagneux.murSombreGlacéCentre, 540+ x, 360+ y);
		
		
		game.getBatch().draw(ClimatMontagneux.fourure1, 180+ x, 210+ y);
		
		game.getBatch().draw(ClimatMontagneux.caisseIgloo, 50+ x, 280+ y);
		game.getBatch().draw(ClimatMontagneux.caisseIgloo, 50+ x, 240+ y);
		game.getBatch().draw(ClimatMontagneux.caisseIgloo, 92+ x, 280+ y);
		game.getBatch().draw(ClimatMontagneux.caisseIgloo, 92+ x, 240+ y);
		game.getBatch().draw(ClimatMontagneux.fourure2, 80+ x, 260+ y);
		
		game.getBatch().draw(ClimatMontagneux.tonneauIgloo, 180+ x, 420+ y);
		game.getBatch().draw(ClimatMontagneux.tonneauIgloo, 240+ x, 420+ y);
		game.getBatch().draw(ClimatMontagneux.tonneauIgloo, 300+ x, 420+ y);
		game.getBatch().draw(ClimatMontagneux.caisseIgloo, 200+ x, 380+ y);
		game.getBatch().draw(ClimatMontagneux.tonneauIgloo, 260+ x, 380+ y);
		game.getBatch().draw(ClimatMontagneux.caisseIgloo, 320+ x, 380+ y);

		game.getBatch().draw(ClimatMontagneux.tonneauIgloo, 410+ x, 340+ y);
		game.getBatch().draw(ClimatMontagneux.tonneauIgloo, 470+ x, 280+ y);
		game.getBatch().draw(ClimatMontagneux.tonneauIgloo, 470+ x, 240+ y);
		game.getBatch().draw(ClimatMontagneux.tonneauIgloo, 410+ x, 300+ y);
		
		ClimatMontagneux.annimationTorcheIgloo(game, 180, 180);
		ClimatMontagneux.annimationTorcheIgloo(game, 360, 180);
		
		if ( !(Bouclier.isBouclierPris) ) game.getBatch().draw(Bouclier.bouclier, 430+ x, 290+ y);
		else if ( Bouclier.annimationBouclier ) game.getBatch().draw(Bouclier.bouclier, MainMenu.Link.getX() + x, MainMenu.Link.getY() + 60 + y);
	}

	public static void destroyBody() {
		// TODO Auto-generated method stub
		
	}

	public static void createBodyAndType(World world) {
		// TODO Auto-generated method stub
		
	}

	public static void destroyType() {
		// TODO Auto-generated method stub
		
	}
}

