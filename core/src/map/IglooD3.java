package map;

import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.physics.box2d.Body;
import com.badlogic.gdx.physics.box2d.World;
import com.mygdx.game.GameMain;

import characters.Ghost;
import decors.ClimatMontagneux;
import menus.MenuGameover;
import scenes.MainMenu;

public class IglooD3 extends Sprite {

	public static Body cote1;
	public static boolean isCote1Created;
	public static Body cote2;
	public static boolean isCote2Created;
	public static Body cote3;
	public static boolean isCote3Created;
	public static Body cote4;
	public static boolean isCote4Created;
	public static Body cote5;
	public static boolean isCote5Created;
	public static Body cote6;
	public static boolean isCote6Created;
	public static Body cote7;
	public static boolean isCote7Created;
	public static Body cote8;
	public static boolean isCote8Created;
	public static Body cote9;
	public static boolean isCote9Created;
	public static Body cote10;
	public static boolean isCote10Created;
	public static Body cote11;
	public static boolean isCote11Created;

	public static Body torche1;
	public static boolean isTorche1Created;
	public static Body torche2;
	public static boolean isTorche2Created;

	public static void représentation(GameMain game, int x, int y) {

		game.getBatch().draw(MenuGameover.gameOverT, 0, 0);

		game.getBatch().draw(ClimatMontagneux.murSombreGlacéCentre, 0 + x, 180 + y);
		game.getBatch().draw(ClimatMontagneux.murSombreGlacéCentre, 0 + x, 240 + y);
		game.getBatch().draw(ClimatMontagneux.murSombreGlacéCentre, 0 + x, 300 + y);
		game.getBatch().draw(ClimatMontagneux.murSombreGlacéCentre, 0 + x, 360 + y);

		game.getBatch().draw(ClimatMontagneux.murSombreGlacéCentre, 60 + x, 120 + y);
		game.getBatch().draw(ClimatMontagneux.murSombreGlacéCentre, 60 + x, 180 + y);
		game.getBatch().draw(ClimatMontagneux.glaceSombre, 60 + x, 240 + y);
		game.getBatch().draw(ClimatMontagneux.glaceSombre, 60 + x, 300 + y);
		game.getBatch().draw(ClimatMontagneux.murSombreGlacéCentre, 60 + x, 360 + y);
		game.getBatch().draw(ClimatMontagneux.murSombreGlacéCentre, 60 + x, 420 + y);

		game.getBatch().draw(ClimatMontagneux.murSombreGlacéCentre, 120 + x, 60 + y);
		game.getBatch().draw(ClimatMontagneux.murSombreGlacéCentre, 120 + x, 120 + y);
		game.getBatch().draw(ClimatMontagneux.glaceSombre, 120 + x, 180 + y);
		game.getBatch().draw(ClimatMontagneux.glaceSombre, 120 + x, 240 + y);
		game.getBatch().draw(ClimatMontagneux.glaceSombre, 120 + x, 300 + y);
		game.getBatch().draw(ClimatMontagneux.glaceSombre, 120 + x, 360 + y);
		game.getBatch().draw(ClimatMontagneux.murSombreGlacéCentre, 120 + x, 420 + y);

		game.getBatch().draw(ClimatMontagneux.murSombreGlacéCentre, 180 + x, 0 + y);
		game.getBatch().draw(ClimatMontagneux.murSombreGlacéCentre, 180 + x, 60 + y);
		game.getBatch().draw(ClimatMontagneux.glaceSombre, 180 + x, 120 + y);
		game.getBatch().draw(ClimatMontagneux.glaceSombre, 180 + x, 180 + y);
		game.getBatch().draw(ClimatMontagneux.glaceSombre, 180 + x, 240 + y);
		game.getBatch().draw(ClimatMontagneux.glaceSombre, 180 + x, 300 + y);
		game.getBatch().draw(ClimatMontagneux.glaceSombre, 180 + x, 360 + y);
		game.getBatch().draw(ClimatMontagneux.glaceSombre, 180 + x, 420 + y);

		game.getBatch().draw(ClimatMontagneux.glaceSombre, 240 + x, 0 + y);
		game.getBatch().draw(ClimatMontagneux.glaceSombre, 240 + x, 60 + y);
		game.getBatch().draw(ClimatMontagneux.glaceSombre, 240 + x, 120 + y);
		game.getBatch().draw(ClimatMontagneux.glaceSombre, 240 + x, 180 + y);
		game.getBatch().draw(ClimatMontagneux.glaceSombre, 240 + x, 240 + y);
		game.getBatch().draw(ClimatMontagneux.glaceSombre, 240 + x, 300 + y);
		game.getBatch().draw(ClimatMontagneux.glaceSombre, 240 + x, 360 + y);
		game.getBatch().draw(ClimatMontagneux.glaceSombre, 240 + x, 420 + y);

		game.getBatch().draw(ClimatMontagneux.glaceSombre, 300 + x, 0 + y);
		game.getBatch().draw(ClimatMontagneux.glaceSombre, 300 + x, 60 + y);
		game.getBatch().draw(ClimatMontagneux.glaceSombre, 300 + x, 120 + y);
		game.getBatch().draw(ClimatMontagneux.glaceSombre, 300 + x, 180 + y);
		game.getBatch().draw(ClimatMontagneux.glaceSombre, 300 + x, 240 + y);
		game.getBatch().draw(ClimatMontagneux.glaceSombre, 300 + x, 300 + y);
		game.getBatch().draw(ClimatMontagneux.glaceSombre, 300 + x, 360 + y);
		game.getBatch().draw(ClimatMontagneux.glaceSombre, 300 + x, 420 + y);

		game.getBatch().draw(ClimatMontagneux.murSombreGlacéCentre, 360 + x, 0 + y);
		game.getBatch().draw(ClimatMontagneux.murSombreGlacéCentre, 360 + x, 60 + y);
		game.getBatch().draw(ClimatMontagneux.glaceSombre, 360 + x, 120 + y);
		game.getBatch().draw(ClimatMontagneux.glaceSombre, 360 + x, 180 + y);
		game.getBatch().draw(ClimatMontagneux.glaceSombre, 360 + x, 240 + y);
		game.getBatch().draw(ClimatMontagneux.glaceSombre, 360 + x, 300 + y);
		game.getBatch().draw(ClimatMontagneux.glaceSombre, 360 + x, 360 + y);
		game.getBatch().draw(ClimatMontagneux.glaceSombre, 360 + x, 420 + y);

		game.getBatch().draw(ClimatMontagneux.murSombreGlacéCentre, 420 + x, 60 + y);
		game.getBatch().draw(ClimatMontagneux.murSombreGlacéCentre, 420 + x, 120 + y);
		game.getBatch().draw(ClimatMontagneux.glaceSombre, 420 + x, 180 + y);
		game.getBatch().draw(ClimatMontagneux.glaceSombre, 420 + x, 240 + y);
		game.getBatch().draw(ClimatMontagneux.glaceSombre, 420 + x, 300 + y);
		game.getBatch().draw(ClimatMontagneux.glaceSombre, 420 + x, 360 + y);
		game.getBatch().draw(ClimatMontagneux.murSombreGlacéCentre, 420 + x, 420 + y);

		game.getBatch().draw(ClimatMontagneux.murSombreGlacéCentre, 480 + x, 120 + y);
		game.getBatch().draw(ClimatMontagneux.murSombreGlacéCentre, 480 + x, 180 + y);
		game.getBatch().draw(ClimatMontagneux.glaceSombre, 480 + x, 240 + y);
		game.getBatch().draw(ClimatMontagneux.glaceSombre, 480 + x, 300 + y);
		game.getBatch().draw(ClimatMontagneux.murSombreGlacéCentre, 480 + x, 360 + y);
		game.getBatch().draw(ClimatMontagneux.murSombreGlacéCentre, 480 + x, 420 + y);

		game.getBatch().draw(ClimatMontagneux.murSombreGlacéCentre, 540 + x, 180 + y);
		game.getBatch().draw(ClimatMontagneux.murSombreGlacéCentre, 540 + x, 240 + y);
		game.getBatch().draw(ClimatMontagneux.murSombreGlacéCentre, 540 + x, 300 + y);
		game.getBatch().draw(ClimatMontagneux.murSombreGlacéCentre, 540 + x, 360 + y);

		
		game.getBatch().draw(ClimatMontagneux.ombreTorche, 130 + ClimatMontagneux.déplacementOmbreTorche + x, 250 + y);
		game.getBatch().draw(ClimatMontagneux.ombreTorche, 370 + ClimatMontagneux.déplacementOmbreTorche + x, 250 + y);
		ClimatMontagneux.annimationTorcheIgloo(game, 140, 280);
		ClimatMontagneux.annimationTorcheIgloo(game, 380, 280);
		
		Ghost.annimationAttente1(game, 270, 360);

	}

	public static void destroyBody() {
		// TODO Auto-generated method stub
		if (isCote1Created)
			MainMenu.world.destroyBody(cote1);
		isCote1Created = false;

		if (isCote2Created)
			MainMenu.world.destroyBody(cote2);
		isCote2Created = false;

		if (isCote3Created)
			MainMenu.world.destroyBody(cote3);
		isCote3Created = false;

		if (isCote4Created)
			MainMenu.world.destroyBody(cote4);
		isCote4Created = false;

		if (isCote5Created)
			MainMenu.world.destroyBody(cote5);
		isCote5Created = false;

		if (isCote6Created)
			MainMenu.world.destroyBody(cote6);
		isCote6Created = false;

		if (isCote7Created)
			MainMenu.world.destroyBody(cote7);
		isCote7Created = false;

		if (isCote8Created)
			MainMenu.world.destroyBody(cote8);
		isCote8Created = false;

		if (isCote9Created)
			MainMenu.world.destroyBody(cote9);
		isCote9Created = false;

		if (isCote10Created)
			MainMenu.world.destroyBody(cote10);
		isCote10Created = false;

		if (isCote11Created)
			MainMenu.world.destroyBody(cote11);
		isCote11Created = false;

		if (isTorche1Created)
			MainMenu.world.destroyBody(torche1);
		isTorche1Created = false;

		if (isTorche2Created)
			MainMenu.world.destroyBody(torche2);
		isTorche2Created = false;
	}

	public static void createBodyAndType(World world) {
		// TODO Auto-generated method stub
		if (isCote1Created == false) {
			cote1 = ClimatMontagneux.createBody(190, 50, 60, 110);
			isCote1Created = true;
		}
		if (isCote2Created == false) {
			cote2 = ClimatMontagneux.createBody(360, 50, 60, 110);
			isCote2Created = true;
		}
		if (isCote3Created == false) {
			cote3 = ClimatMontagneux.createBody(130, 110, 60, 110);
			isCote3Created = true;
		}
		if (isCote4Created == false) {
			cote4 = ClimatMontagneux.createBody(420, 110, 60, 110);
			isCote4Created = true;
		}
		if (isCote5Created == false) {
			cote5 = ClimatMontagneux.createBody(70, 170, 60, 110);
			isCote5Created = true;
		}
		if (isCote6Created == false) {
			cote6 = ClimatMontagneux.createBody(480, 170, 60, 110);
			isCote6Created = true;
		}
		if (isCote7Created == false) {
			cote7 = ClimatMontagneux.createBody(70, 410, 60, 110);
			isCote7Created = true;
		}
		if (isCote8Created == false) {
			cote8 = ClimatMontagneux.createBody(480, 410, 60, 110);
			isCote8Created = true;
		}
		if (isCote9Created == false) {
			cote9 = ClimatMontagneux.createBody(10, 295, 60, 80);
			isCote9Created = true;
		}
		if (isCote10Created == false) {
			cote10 = ClimatMontagneux.createBody(540, 290, 60, 110);
			isCote10Created = true;
		}
		if (isCote11Created == false) {
			cote11 = ClimatMontagneux.createBody(300, 450, 360, 60);
			isCote11Created = true;
		}

		if (isTorche1Created == false) {
			torche1 = ClimatMontagneux.createBodyPerso("arbre", "static", 140, 280);
			isTorche1Created = true;
		}
		if (isTorche2Created == false) {
			torche2 = ClimatMontagneux.createBodyPerso("arbre", "static", 380, 280);
			isTorche2Created = true;
		}
	}

	public static void destroyType() {
		// TODO Auto-generated method stub

	}
}
