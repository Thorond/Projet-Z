package characters;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.physics.box2d.World;

import items.Bouclier;
import items.CoeurDeVie;
import items.Essence;
import scenes.MainMenu;

public class Pnj extends Characters{
	
	public long start;
	public boolean arrét = true;
	public boolean isAttacked = false;
	
	
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
		if ( System.currentTimeMillis() - start > 2000) {
			if ( tempo < 0.25 && this.getBody().getPosition().x > 90/MainMenu.PPM ){
				this.getBody().applyLinearImpulse(new Vector2(-40000f,0), this.getBody().getWorldCenter(), true);
				this.setDirection("gauche");
			}
			else if (tempo > 0.25 && tempo < 0.5 && this.getBody().getPosition().x < 480/MainMenu.PPM ){
				this.getBody().applyLinearImpulse(new Vector2(+40000f,0), this.getBody().getWorldCenter(), true);
				this.setDirection("droite");
			}
			else if (tempo > 0.5 && tempo < 0.75 && this.getBody().getPosition().y > 90/MainMenu.PPM ){
				this.getBody().applyLinearImpulse(new Vector2(0,-40000f), this.getBody().getWorldCenter(), true);
				this.setDirection("bas");
			}
			else if (tempo > 0.75 && this.getBody().getPosition().y < 360/MainMenu.PPM){
				this.getBody().applyLinearImpulse(new Vector2(0,+40000f), this.getBody().getWorldCenter(), true);
				this.setDirection("haut");
			}
			start = System.currentTimeMillis();
			arrét = false;
		} 
		if (System.currentTimeMillis() - start > 1500 ) {
//			ralentissement des pnjs
			this.getBody().setLinearVelocity(this.getBody().getLinearVelocity().x / 100f, this.getBody().getLinearVelocity().y / 100f);
			arrét = true;
		}
		
	}
	
	
//	déplacement vers le joueur 
	
	public void déplacementVersJoueur(){
		if ( System.currentTimeMillis() - start > 400) {
			if ( this.getX() - MainMenu.Link.getX() > 90 ){
				this.getBody().applyLinearImpulse(new Vector2(-60000f,0), this.getBody().getWorldCenter(), true);
				this.setDirection("gauche");
			}
			else if (this.getX() - MainMenu.Link.getX() < 90 ){
				this.getBody().applyLinearImpulse(new Vector2(+60000f,0), this.getBody().getWorldCenter(), true);
				this.setDirection("droite");
			}
			if (this.getY() - MainMenu.Link.getY() > 90){
				this.getBody().applyLinearImpulse(new Vector2(0,-60000f), this.getBody().getWorldCenter(), true);
				this.setDirection("bas");
			}
			else if (this.getY() - MainMenu.Link.getY() < 90){
				this.getBody().applyLinearImpulse(new Vector2(0,+60000f), this.getBody().getWorldCenter(), true);
				this.setDirection("haut");
			}
			start = System.currentTimeMillis();
			arrét = false;
		}
	}
	
//	déplacement global 
	
	public void déplacement(){
		if (this.isAttacked) this.déplacementVersJoueur();
		else if ( this.isAlive())  this.déplacementAléa();
	}
		
	
//	est en vie
	
	public boolean isAlive(){
		if (this.getHealth() > 0 ) return true;
		else return false;
	}
	
//	drop des monstres
	
	public void drop(){
		CoeurDeVie.remplirCoeurDeVies((int) this.getX() , (int) this.getY() );
		Essence.remplirEssences((int) this.getX() , (int) this.getY() );
	}
	
//	subir dégats et mort
	
	public void subirDégats( int cha, String direction){
		if ( this.getHealth() > 0 && this.getHealth() - cha <= 0 ) {
			this.drop();
//			est ce la meilleure solution?
			this.isAttacked = false;
			this.getBody().setTransform(-500, -500, 0);
		} else {
			if ( direction.equals("droite")) this.getBody().setTransform(this.getBody().getPosition().x +30, this.getBody().getPosition().y, 0);
			else if ( direction.equals("gauche")) this.getBody().setTransform(this.getBody().getPosition().x -30, this.getBody().getPosition().y, 0);
			else if ( direction.equals("haut")) this.getBody().setTransform(this.getBody().getPosition().x, this.getBody().getPosition().y +30, 0);
			else if ( direction.equals("bas")) this.getBody().setTransform(this.getBody().getPosition().x, this.getBody().getPosition().y -30, 0);
			this.isAttacked = true;
		}
		this.setHealth(this.getHealth() - cha);
	}
	
	
// infligé des dégats 

	
	public void infligéDégatLink(){
		
		
		if ( MainMenu.Link.getX() + MainMenu.Link.getWidth() / 2 >= this.getX() -25 
				&& MainMenu.Link.getX() <= this.getX() 
				&& MainMenu.Link.getY() +MainMenu.Link.getHeight() / 2 >= this.getY() 
				&& MainMenu.Link.getY() <= this.getY() + this.getHeight() / 2  ){
			MainMenu.Link.getBody().setTransform(MainMenu.Link.getBody().getPosition().x - 30, MainMenu.Link.getBody().getPosition().y , 0);
			if ( MainMenu.Link.getDirection().equals("droite") && Bouclier.isBouclierUtilisé){ // utilisation du bouclier
				
			} else MainMenu.Link.setHealth(MainMenu.Link.getHealth() - this.getStrength());
		}
		else if (this.getX() - MainMenu.Link.getX() < 0 
				&& MainMenu.Link.getX() <= this.getX() + this.getWidth() / 2 +25
				&& MainMenu.Link.getY() +MainMenu.Link.getHeight() / 2 >= this.getY() 
				&& MainMenu.Link.getY() <= this.getY() + this.getHeight() / 2  ){
			MainMenu.Link.getBody().setTransform(MainMenu.Link.getBody().getPosition().x +30, MainMenu.Link.getBody().getPosition().y, 0);
			if ( MainMenu.Link.getDirection().equals("gauche") && Bouclier.isBouclierUtilisé){ // utilisation du bouclier
				
			} else MainMenu.Link.setHealth(MainMenu.Link.getHealth() - this.getStrength());
		} 
	
		if (MainMenu.Link.getX() + MainMenu.Link.getWidth() / 2 >= this.getX()  
				&& MainMenu.Link.getX() <= this.getX() + this.getWidth() / 2 
				&& MainMenu.Link.getY() +MainMenu.Link.getHeight() / 2 >= this.getY() -30
				&& this.getY() - MainMenu.Link.getY() > 0 ){
			MainMenu.Link.getBody().setTransform(MainMenu.Link.getBody().getPosition().x, MainMenu.Link.getBody().getPosition().y - 30, 0);
			if ( MainMenu.Link.getDirection().equals("haut") && Bouclier.isBouclierUtilisé){ // utilisation du bouclier

			} else MainMenu.Link.setHealth(MainMenu.Link.getHealth() - this.getStrength());
		}
		else if (MainMenu.Link.getX() + MainMenu.Link.getWidth() / 2 >= this.getX()  
				&& MainMenu.Link.getX() <= this.getX() + this.getWidth() / 2 
				&& this.getY() - MainMenu.Link.getY() < 0
				&& MainMenu.Link.getY() <= this.getY() + this.getHeight() / 2  +25){
			MainMenu.Link.getBody().setTransform(MainMenu.Link.getBody().getPosition().x, MainMenu.Link.getBody().getPosition().y + 30, 0);
			if ( MainMenu.Link.getDirection().equals("bas") && Bouclier.isBouclierUtilisé){ // utilisation du bouclier

			} else MainMenu.Link.setHealth(MainMenu.Link.getHealth() - this.getStrength());
		}
			
		
	}
	

	
}
