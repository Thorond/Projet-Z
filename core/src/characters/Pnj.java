package characters;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.physics.box2d.World;

import items.CoeurDeVie;
import scenes.MainMenu;

public class Pnj extends Characters{
	
	public long start;
	public boolean arrét = false;
	
	
	public Pnj(World world, Texture text ,int HM, int health, int strength, float x, float y, String direction){
		super(world,text, HM, health, strength, x,  y, direction);
		start = System.currentTimeMillis();
	}
	
//	monstres présent sur la map sur laquelle est le joueur 
	
	
	public static int nbrDeMonstres = 0;
	public static Pnj[] monstres = new Pnj[10];
	
//	déplacement aléatoire
	
	public void déplacementAléa(){
		double tempo = Math.random();
		if ( System.currentTimeMillis() - start > 1000) {
			if ( tempo < 0.25 && this.getBody().getPosition().x > 60/MainMenu.PPM ){
				this.getBody().applyLinearImpulse(new Vector2(-100000f,0), this.getBody().getWorldCenter(), true);
				this.setDirection("gauche");
			}
			else if (tempo > 0.25 && tempo < 0.5 && this.getBody().getPosition().x < 510/MainMenu.PPM ){
				this.getBody().applyLinearImpulse(new Vector2(+100000f,0), this.getBody().getWorldCenter(), true);
				this.setDirection("droite");
			}
			else if (tempo > 0.5 && tempo < 0.75 && this.getBody().getPosition().y > 60/MainMenu.PPM ){
				this.getBody().applyLinearImpulse(new Vector2(0,-100000f), this.getBody().getWorldCenter(), true);
				this.setDirection("bas");
			}
			else if (tempo > 0.75 && this.getBody().getPosition().y < 360/MainMenu.PPM){
				this.getBody().applyLinearImpulse(new Vector2(0,+100000f), this.getBody().getWorldCenter(), true);
				this.setDirection("haut");
			}
			start = System.currentTimeMillis();
			arrét = false;
		} 
		if (System.currentTimeMillis() - start > 800 && arrét == false) {
//			ralentissement des pnjs
			this.getBody().setLinearVelocity(this.getBody().getLinearVelocity().x / 1.8f, this.getBody().getLinearVelocity().y / 1.8f);
			if ( System.currentTimeMillis() - start > 900 ) arrét = true;
		}
		
	}
		
	
//	est en vie
	
	public boolean isAlive(){
		if (this.getHealth() > 0 ) return true;
		else return false;
	}
	
//	drop des monstres
	
	public void drop(){
		CoeurDeVie.remplirCoeurDeVies((int) this.getX() , (int) this.getY() );
	}
	
//	subir dégats et mort
	
	public void subirDégats( MainCharacter cha, String direction){
		if ( this.getHealth() > 0 && this.getHealth() - cha.getStrength() <= 0 ) {
			this.drop();
//			est ce la meilleure solution?
			this.getBody().setTransform(-500, -500, 0);
		} else {
			if ( direction.equals("droite")) this.getBody().setTransform(this.getBody().getPosition().x +30, this.getBody().getPosition().y, 0);
			else if ( direction.equals("gauche")) this.getBody().setTransform(this.getBody().getPosition().x -30, this.getBody().getPosition().y, 0);
			else if ( direction.equals("haut")) this.getBody().setTransform(this.getBody().getPosition().x, this.getBody().getPosition().y +30, 0);
			else if ( direction.equals("bas")) this.getBody().setTransform(this.getBody().getPosition().x, this.getBody().getPosition().y -30, 0);
		}
		this.setHealth(this.getHealth() - cha.getStrength());
	}
	
	
// infligé des dégats 

	
	public void infligéDégatLink(){
		
		if (MainMenu.Link.getX() + MainMenu.Link.getWidth() / 2 >= this.getX() -30 
				&& MainMenu.Link.getX() <= this.getX() + this.getWidth() / 2 +25
				&& MainMenu.Link.getY() +MainMenu.Link.getHeight() / 2 >= this.getY() -25
				&& MainMenu.Link.getY() <= this.getY() + this.getHeight() / 2  +25) {
			MainMenu.Link.setHealth(MainMenu.Link.getHealth() - this.getStrength());
			if (MainMenu.Link.getDirection().equals("haut")){
				MainMenu.Link.getBody().setTransform(MainMenu.Link.getBody().getPosition().x, MainMenu.Link.getBody().getPosition().y - 30, 0);
			} else if (MainMenu.Link.getDirection().equals("bas")){
				MainMenu.Link.getBody().setTransform(MainMenu.Link.getBody().getPosition().x, MainMenu.Link.getBody().getPosition().y + 30, 0);
			}  else if (MainMenu.Link.getDirection().equals("droite")){
				MainMenu.Link.getBody().setTransform(MainMenu.Link.getBody().getPosition().x - 30, MainMenu.Link.getBody().getPosition().y , 0);
			}  else if (MainMenu.Link.getDirection().equals("gauche")){
				MainMenu.Link.getBody().setTransform(MainMenu.Link.getBody().getPosition().x +30, MainMenu.Link.getBody().getPosition().y, 0);
			}
			
		}
	}
	

	
}
