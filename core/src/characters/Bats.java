package characters;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.physics.box2d.World;

import scenes.MainMenu;

public class Bats extends Pnj{
	
	
	
	public boolean textBas1 = true;
	public boolean textBas2 = true;
	public static Texture batBas1 = new Texture("monstres/bat/batBas1.png");
	public static Texture batBas2 = new Texture("monstres/bat/batBas2.png");
	public static Texture batBas3 = new Texture("monstres/bat/batBas3.png");
	public boolean textGauche1 = true;
	public boolean textGauche2 = true;
	public static Texture batGauche1 = new Texture("monstres/bat/batGauche1.png");
	public static Texture batGauche2 = new Texture("monstres/bat/batGauche2.png");
	public static Texture batGauche3 = new Texture("monstres/bat/batGauche3.png");
	public boolean textHaut1 = true;
	public boolean textHaut2 = true;
	public static Texture batHaut1 = new Texture("monstres/bat/batHaut1.png");
	public static Texture batHaut2 = new Texture("monstres/bat/batHaut2.png");
	public static Texture batHaut3 = new Texture("monstres/bat/batHaut3.png");
	public boolean textDroite1 = true;
	public boolean textDroite2 = true;
	public static Texture batDroite1 = new Texture("monstres/bat/batDroite1.png");
	public static Texture batDroite2 = new Texture("monstres/bat/batDroite2.png");
	public static Texture batDroite3 = new Texture("monstres/bat/batDroite3.png");

	public Bats(World world,Texture text, int HM, int health, int strength, float x, float y, String direction) {
		super(world,text, HM, health, strength, x, y, direction);
		// TODO Auto-generated constructor stub
	}
	
	public void représentationBat(){
		if (this.getDirection().equals("gauche")){
			if ( System.currentTimeMillis() - MainMenu.start > 200) {
				
				if (this.textGauche1 == true){
					this.setTexture(batGauche1);
					this.textGauche1 = false;
					this.textGauche2 = true;
				} else if (this.textGauche2 == true ) {
					this.setTexture(batGauche2);
					this.textGauche2 = false;
				} else {
					this.setTexture(batGauche3);
					this.textGauche1 = true;
				}
				MainMenu.start = System.currentTimeMillis();
			} 
		}
		else if (this.getDirection().equals("droite")){
			if ( System.currentTimeMillis() - MainMenu.start > 200) {
				if (this.textDroite1 == true){
					this.setTexture(batDroite1);
					this.textDroite1 = false;
					this.textDroite2 = true;
				} else if (this.textDroite2 == true ) {
					this.setTexture(batDroite2);
					this.textDroite2 = false;
				} else {
					this.setTexture(batDroite3);
					this.textDroite1 = true;
				}
				MainMenu.start = System.currentTimeMillis();
			}
		}
		else if (this.getDirection().equals("haut")){
			if ( System.currentTimeMillis() - MainMenu.start > 200) {
				if (this.textHaut1 == true){
					this.setTexture(batHaut1);
					this.textHaut1 = false;
					this.textHaut2 = true;
				} else if (this.textHaut2 == true ) {
					this.setTexture(batHaut2);
					this.textHaut2 = false;
				} else {
					this.setTexture(batHaut3);
					this.textHaut1 = true;
				}
				MainMenu.start = System.currentTimeMillis();
			}
		}
		else if (this.getDirection().equals("bas")){
			if ( System.currentTimeMillis() - MainMenu.start > 200) {
				if (this.textBas1 == true){
					this.setTexture(batBas1);
					this.textBas1 = false;
					this.textBas2 = true;
				} else if (this.textBas2 == true ) {
					this.setTexture(batBas2);
					this.textBas2 = false;
				} else {
					this.setTexture(batBas3);
					this.textBas1 = true;
				}
				MainMenu.start = System.currentTimeMillis();
			}
		}
	}

}
