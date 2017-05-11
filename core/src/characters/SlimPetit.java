package characters;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.physics.box2d.World;

import scenes.MainMenu;


public class SlimPetit extends Pnj{
	

	public long start = System.currentTimeMillis();	
	public long startS = System.currentTimeMillis();	
	
	public int texture = 0;
	
	public static Texture slimPetitGauche1 = new Texture("monstres/Slim/slimPetitGauche1.png");
	public static Texture slimPetitGauche2 = new Texture("monstres/Slim/slimPetitGauche2.png");
	public static Texture slimPetitGauche3 = new Texture("monstres/Slim/slimPetitGauche3.png");
	public static Texture slimPetitHaut1 = new Texture("monstres/Slim/slimPetitHaut1.png");
	public static Texture slimPetitHaut2 = new Texture("monstres/Slim/slimPetitHaut2.png");
	public static Texture slimPetitHaut3 = new Texture("monstres/Slim/slimPetitHaut3.png");
	public static Texture slimPetitDroite1 = new Texture("monstres/Slim/slimPetitDroite1.png");
	public static Texture slimPetitDroite2 = new Texture("monstres/Slim/slimPetitDroite2.png");
	public static Texture slimPetitDroite3 = new Texture("monstres/Slim/slimPetitDroite3.png");

	public SlimPetit(World world,  float x, float y) {
		super(world,slimPetitHaut1, 12, 12, 3, x, y, "bas");
	}
	
//	déplacement aléatoire
	@Override
	public void déplacementAléa(){
		double tempo = Math.random();
		if ( System.currentTimeMillis() - startS > 1000) {
			if ( tempo < 0.25 && this.getBody().getPosition().x > 90/MainMenu.PPM ){
				this.getBody().applyLinearImpulse(new Vector2(-20000f,0), this.getBody().getWorldCenter(), true);
				this.setDirection("gauche");
			}
			else if (tempo > 0.25 && tempo < 0.5 && this.getBody().getPosition().x < 480/MainMenu.PPM ){
				this.getBody().applyLinearImpulse(new Vector2(+20000f,0), this.getBody().getWorldCenter(), true);
				this.setDirection("droite");
			}
			else if (tempo > 0.5 && tempo < 0.75 && this.getBody().getPosition().y > 90/MainMenu.PPM ){
				this.getBody().applyLinearImpulse(new Vector2(0,-20000f), this.getBody().getWorldCenter(), true);
				this.setDirection("bas");
			}
			else if (tempo > 0.75 && this.getBody().getPosition().y < 360/MainMenu.PPM){
				this.getBody().applyLinearImpulse(new Vector2(0,+20000f), this.getBody().getWorldCenter(), true);
				this.setDirection("haut");
			}
			startS = System.currentTimeMillis();
			arrét = false;
		} 
		if (System.currentTimeMillis() - startS > 750 ) {
//			ralentissement des pnjs
			this.getBody().setLinearVelocity(this.getBody().getLinearVelocity().x / 100f, this.getBody().getLinearVelocity().y / 100f);
			arrét = true;
		}
	}
	
	public void représentation(){
		if (this.getDirection().equals("gauche")){
			if ( System.currentTimeMillis() - this.start > 200) {
				
				if (this.texture == 0){
					this.setTexture(slimPetitGauche1);
					this.texture = 1;
				} else if (this.texture == 1 ) {
					this.setTexture(slimPetitGauche2);
					this.texture = 2;
				} else {
					this.setTexture(slimPetitGauche3);
					this.texture = 0;
				}
				this.start = System.currentTimeMillis();
			} 
		}
		else if (this.getDirection().equals("droite")){
			if ( System.currentTimeMillis() - this.start > 200) {
				if (this.texture == 0){
					this.setTexture(slimPetitDroite1);
					this.texture = 1;
				} else if (this.texture == 1 ) {
					this.setTexture(slimPetitDroite2);
					this.texture = 2;
				} else {
					this.setTexture(slimPetitDroite3);
					this.texture = 0;
				}
				this.start = System.currentTimeMillis();
			}
		}
		else if (this.getDirection().equals("haut") || this.getDirection().equals("bas")){
			if ( System.currentTimeMillis() - this.start > 200) {
				if (this.texture == 0){
					this.setTexture(slimPetitHaut1);
					this.texture = 1;
				} else if (this.texture == 1 ) {
					this.setTexture(slimPetitHaut2);
					this.texture = 2;
				} else {
					this.setTexture(slimPetitHaut3);
					this.texture = 0;
				}
				this.start = System.currentTimeMillis();
			}
		}
	}

}
