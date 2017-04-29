package characters;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.physics.box2d.World;

import map.CadrillageMap;
import scenes.MainMenu;

public class Slim extends Pnj{
	
	public long startS = System.currentTimeMillis();
	
	public int texture = 0;
	public static Texture slimGauche1 = new Texture("monstres/Slim/slimGauche1.png");
	public static Texture slimGauche2 = new Texture("monstres/Slim/slimGauche2.png");
	public static Texture slimGauche3 = new Texture("monstres/Slim/slimGauche3.png");
	public static Texture slimHaut1 = new Texture("monstres/Slim/slimHaut1.png");
	public static Texture slimHaut2 = new Texture("monstres/Slim/slimHaut2.png");
	public static Texture slimHaut3 = new Texture("monstres/Slim/slimHaut3.png");
	public static Texture slimDroite1 = new Texture("monstres/Slim/slimDroite1.png");
	public static Texture slimDroite2 = new Texture("monstres/Slim/slimDroite2.png");
	public static Texture slimDroite3 = new Texture("monstres/Slim/slimDroite3.png");
	

	public Slim(World world,Texture text,  float x, float y, String direction) {
		super(world,text, 8, 8, 2, x, y, direction);
	}

//	déplacement aléatoire
	@Override
	public void déplacementAléa(){
		double tempo = Math.random();
		if ( System.currentTimeMillis() - startS > 2000) {
			if ( tempo < 0.25 && this.getBody().getPosition().x > 90/MainMenu.PPM ) {
				if (!CadrillageMap.typeDeDécor[(int) (this.getBody().getPosition().x * MainMenu.PPM / 60) - 1][(int) (this.getBody().getPosition().y * MainMenu.PPM / 60) ].equals("Trou")
						&& !CadrillageMap.typeDeDécor[(int) (this.getBody().getPosition().x * MainMenu.PPM / 60) - 1][(int) (this.getBody().getPosition().y * MainMenu.PPM / 60) ].equals("EauProfonde")){
					this.getBody().applyLinearImpulse(new Vector2(-20000f, 0), this.getBody().getWorldCenter(), true);
					this.setDirection("gauche");
				}
			}
			else if (tempo > 0.25 && tempo < 0.5 && this.getBody().getPosition().x < 480/MainMenu.PPM ) {
				if (!CadrillageMap.typeDeDécor[(int) (this.getBody().getPosition().x * MainMenu.PPM / 60) + 1][(int) (this.getBody().getPosition().y * MainMenu.PPM / 60) ].equals("Trou")
						&& !CadrillageMap.typeDeDécor[(int) (this.getBody().getPosition().x * MainMenu.PPM / 60) + 1][(int) (this.getBody().getPosition().y * MainMenu.PPM / 60) ].equals("EauProfonde")) {
					this.getBody().applyLinearImpulse(new Vector2(+20000f, 0), this.getBody().getWorldCenter(), true);
					this.setDirection("droite");

				}
			}
			else if (tempo > 0.5 && tempo < 0.75 && this.getBody().getPosition().y > 90/MainMenu.PPM ){
				if (!CadrillageMap.typeDeDécor[(int) (this.getBody().getPosition().x * MainMenu.PPM / 60) ][(int) (this.getBody().getPosition().y * MainMenu.PPM / 60) - 1].equals("Trou")
						&& !CadrillageMap.typeDeDécor[(int) (this.getBody().getPosition().x * MainMenu.PPM / 60) ][(int) (this.getBody().getPosition().y * MainMenu.PPM / 60) - 1].equals("EauProfonde")) {
					this.getBody().applyLinearImpulse(new Vector2(0, -20000f), this.getBody().getWorldCenter(), true);
					this.setDirection("bas");
				}
			}
			else if (tempo > 0.75 && this.getBody().getPosition().y < 360/MainMenu.PPM){
				if (!CadrillageMap.typeDeDécor[(int) (this.getBody().getPosition().x * MainMenu.PPM / 60) ][(int) (this.getBody().getPosition().y * MainMenu.PPM / 60) + 1].equals("Trou")
						&& !CadrillageMap.typeDeDécor[(int) (this.getBody().getPosition().x * MainMenu.PPM / 60) ][(int) (this.getBody().getPosition().y * MainMenu.PPM / 60) + 1].equals("EauProfonde")) {
					this.getBody().applyLinearImpulse(new Vector2(0, +20000f), this.getBody().getWorldCenter(), true);
					this.setDirection("haut");
				}
			}
			startS = System.currentTimeMillis();
			arrét = false;
		}
		if (System.currentTimeMillis() - startS > 1500 ) {
//			ralentissement des pnjs
			this.getBody().setLinearVelocity(this.getBody().getLinearVelocity().x / 100f, this.getBody().getLinearVelocity().y / 100f);
			arrét = true;
		}
	}
	

		
	
	public void représentation(){
		if (this.getDirection().equals("gauche")){
			if ( System.currentTimeMillis() - this.start > 400) {
				
				if (this.texture == 0){
					this.setTexture(slimGauche1);
					this.texture = 1;
				} else if (this.texture == 1 ) {
					this.setTexture(slimGauche2);
					this.texture = 2;
				} else {
					this.setTexture(slimGauche3);
					this.texture = 0;
				}
				this.start = System.currentTimeMillis();
			} 
		}
		else if (this.getDirection().equals("droite")){
			if ( System.currentTimeMillis() - this.start > 400) {
				if (this.texture == 0){
					this.setTexture(slimDroite1);
					this.texture = 1;
				} else if (this.texture == 1 ) {
					this.setTexture(slimDroite2);
					this.texture = 2;
				} else {
					this.setTexture(slimDroite3);
					this.texture = 0;
				}
				this.start = System.currentTimeMillis();
			}
		}
		else if (this.getDirection().equals("haut") || this.getDirection().equals("bas")){
			if ( System.currentTimeMillis() - this.start > 400) {
				if (this.texture == 0){
					this.setTexture(slimHaut1);
					this.texture = 1;
				} else if (this.texture == 1 ) {
					this.setTexture(slimHaut2);
					this.texture = 2;
				} else {
					this.setTexture(slimHaut3);
					this.texture = 0;
				}
				this.start = System.currentTimeMillis();
			}
		}
	}


}
