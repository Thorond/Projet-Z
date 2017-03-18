package menus;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.physics.box2d.World;

import scenes.MainMenu;

public class Menu {
	
public static World world = MainMenu.world;
	
	public static Texture fond = new Texture("menus/fondMaron.png");
	public static Texture flècheGauche = new Texture("menus/arrowBlue_left.png");
	public static Texture flècheDroite = new Texture("menus/arrowBlue_right.png");
	public static Texture fondItem = new Texture("menus/panelInset_beige.png");
	public static Texture fondItem1 = new Texture("menus/buttonSquare_beige.png");
	public static Texture fondItem2 = new Texture("menus/buttonSquare_beige_pressed.png");
	
	public static Texture boutonRetour = new Texture("menus/boutonRetour.png");
	public static Texture boutonPresséRetour = new Texture("menus/boutonPresséRetour.png");
	public static Texture boutonReprendre = new Texture("menus/boutonReprendre.png");
	public static Texture boutonPresséReprendre = new Texture("menus/boutonPresséReprendre.png");
	

}
