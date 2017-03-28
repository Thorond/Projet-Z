package characters;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.physics.box2d.World;

public class MonstreAquatique extends Pnj{
	
	public long start = System.currentTimeMillis();
	
	public boolean textBas1 = true;
	public static Texture monstreAquaFace1 = new Texture("monstres/monstreAqua/monstreAquaFace1.png");
	public static Texture monstreAquaFace2 = new Texture("monstres/monstreAqua/monstreAquaFace2.png");
	public static Texture monstreAquaFace3 = new Texture("monstres/monstreAqua/monstreAquaFace3.png");
	public boolean textGauche1 = true;
	public static Texture monstreAquaGauche1 = new Texture("monstres/monstreAqua/monstreAquaGauche1.png");
	public static Texture monstreAquaGauche2 = new Texture("monstres/monstreAqua/monstreAquaGauche2.png");
	public static Texture monstreAquaGauche3 = new Texture("monstres/monstreAqua/monstreAquaGauche3.png");
	public boolean textHaut1 = true;
	public static Texture monstreAquahaut1 = new Texture("monstres/monstreAqua/monstreAquahaut1.png");
	public static Texture monstreAquahaut2 = new Texture("monstres/monstreAqua/monstreAquahaut2.png");
	public static Texture monstreAquahaut3 = new Texture("monstres/monstreAqua/monstreAquahaut3.png");
	public boolean textDroite1 = true;
	public static Texture monstreAquaDroite1 = new Texture("monstres/monstreAqua/monstreAquaDroite1.png");
	public static Texture monstreAquaDroite2 = new Texture("monstres/monstreAqua/monstreAquaDroite2.png");
	public static Texture monstreAquaDroite3 = new Texture("monstres/monstreAqua/monstreAquaDroite3.png");

	public MonstreAquatique(World world,Texture text, int HM, int health, int strength, float x, float y, String direction) {
		super(world,text, HM, health, strength, x, y, direction);
		// TODO Auto-generated constructor stub
	}
	
	public void représentation(){
		if (this.getDirection().equals("gauche")){
			if ( System.currentTimeMillis() - this.start > 500) {
				
				if (this.arrét ){
					this.setTexture(monstreAquaGauche2);
				} else {
					if (this.textGauche1 == true ) {
						this.setTexture(monstreAquaGauche1);
						this.textGauche1 = false;
					} else {
						this.setTexture(monstreAquaGauche3);
						this.textGauche1 = true;
					}
					this.start = System.currentTimeMillis();
				}
					
			} 
		}
		else if (this.getDirection().equals("droite")){
			if ( System.currentTimeMillis() - this.start > 500) {
				if (this.arrét){
					this.setTexture(monstreAquaDroite2);
				} else {
					if (this.textDroite1 == true ) {
						this.setTexture(monstreAquaDroite1);
						this.textDroite1 = false;
					} else {
						this.setTexture(monstreAquaDroite3);
						this.textDroite1 = true;
					}
					this.start = System.currentTimeMillis();
				}
			}
		}
		else if (this.getDirection().equals("haut")){
			if ( System.currentTimeMillis() - this.start > 500) {
				if (this.arrét){
					this.setTexture(monstreAquahaut3);
				} else {
						if (this.textHaut1 == true ) {
						this.setTexture(monstreAquahaut1);
						this.textHaut1 = false;
					} else {
						this.setTexture(monstreAquahaut2);
						this.textHaut1 = true;
					}
					this.start = System.currentTimeMillis();
				}
			}
		}
		else if (this.getDirection().equals("bas")){
			if ( System.currentTimeMillis() - this.start > 500) {
				if (this.arrét){
					this.setTexture(monstreAquaFace2);
				} else {
						if (this.textHaut1 == true ) {
						this.setTexture(monstreAquaFace1);
						this.textHaut1 = false;
					} else {
						this.setTexture(monstreAquaFace3);
						this.textHaut1 = true;
					}
					this.start = System.currentTimeMillis();
				}
			}
		}
	}

}
