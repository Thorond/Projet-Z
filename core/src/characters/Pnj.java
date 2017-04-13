package characters;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.physics.box2d.World;

import items.Bombe;
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
	public static Pnj[] monstres = new Pnj[20];
	
//	déplacement aléatoire
	
	public void déplacementAléa(){
		double tempo = Math.random();
		if ( System.currentTimeMillis() - start > 1000) {
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
		if (System.currentTimeMillis() - start > 700 ) {
//			ralentissement des pnjs
			this.getBody().setLinearVelocity(this.getBody().getLinearVelocity().x / 100f, this.getBody().getLinearVelocity().y / 100f);
			arrét = true;
		}
		
	}
	
	
//	déplacement vers le joueur 
	
	public void déplacementVersJoueur(){
		if ( this.getX() - MainMenu.Link.getX() > 30 ){
			this.getBody().applyLinearImpulse(new Vector2(-40000f,0), this.getBody().getWorldCenter(), true);
			this.setDirection("gauche");
		}
		else if (this.getX() - MainMenu.Link.getX() < -50 ){
			this.getBody().applyLinearImpulse(new Vector2(+40000f,0), this.getBody().getWorldCenter(), true);
			this.setDirection("droite");
		} else {
			this.getBody().setLinearVelocity( new Vector2(0,this.getBody().getLinearVelocity().y));
		}
		if (this.getY() - MainMenu.Link.getY() > 30){
			this.getBody().applyLinearImpulse(new Vector2(0,-40000f), this.getBody().getWorldCenter(), true);
			this.setDirection("bas");
		}
		else if (this.getY() - MainMenu.Link.getY() < -50){
			this.getBody().applyLinearImpulse(new Vector2(0,+40000f), this.getBody().getWorldCenter(), true);
			this.setDirection("haut");
		}  else {
			this.getBody().setLinearVelocity( new Vector2(this.getBody().getLinearVelocity().x,0));
		}
		if ( this.getBody().getLinearVelocity().x == 0 && this.getBody().getLinearVelocity().y == 0 ) arrét = true;
		else arrét = false;
	}
	
//	déplacement global 
	
	public void déplacement(){
		if ( this.isHit ){
			if ( System.currentTimeMillis() - this.timerHit > 300 ) this.isHit = false;
		}else {
			if (this.isAttacked) this.déplacementVersJoueur();
			else if (this.isAlive()) this.déplacementAléa();
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
			if ( direction.equals("droite")) {
				this.isHit = true;
				this.timerHit = System.currentTimeMillis();
				this.getBody().applyLinearImpulse(new Vector2(+600000,0), this.getBody().getWorldCenter(), true);

			}
			else if ( direction.equals("gauche")) {
				this.isHit = true;
				this.timerHit = System.currentTimeMillis();
				this.getBody().applyLinearImpulse(new Vector2(-600000,0), this.getBody().getWorldCenter(), true);

			}
			else if ( direction.equals("haut")) {
				this.isHit = true;
				this.timerHit = System.currentTimeMillis();
				this.getBody().applyLinearImpulse(new Vector2(0,+600000), this.getBody().getWorldCenter(), true);

			}
			else if ( direction.equals("bas")) {
				this.isHit = true;
				this.timerHit = System.currentTimeMillis();
				this.getBody().applyLinearImpulse(new Vector2(0,-600000), this.getBody().getWorldCenter(), true);

			}
			this.isAttacked = true;
		}
		this.setHealth(this.getHealth() - cha);
	}
	
//	 subir dégàt par bombe 
	
	public void subirDégatsBombe( Bombe cha, int x, int y ){
		if ( this.getHealth() > 0 && this.getHealth() - cha.getDégàts() <= 0 ) {
			this.drop();
//			est ce la meilleure solution?
			this.isAttacked = false;
			this.getBody().setTransform(-500, -500, 0);
		} else {
			if ( x + this.getWidth() / 2 >= (int) this.getBody().getPosition().x * MainMenu.PPM  -60 
					&& x <= (int) this.getBody().getPosition().x * MainMenu.PPM  
					&& y +this.getHeight() / 2 >= (int) this.getBody().getPosition().y * MainMenu.PPM  
					&& y <= (int) this.getBody().getPosition().y * MainMenu.PPM  + this.getHeight() / 2  ){
				this.isHit = true;
				this.timerHit = System.currentTimeMillis();
				this.getBody().applyLinearImpulse(new Vector2(+600000,0), this.getBody().getWorldCenter(), true);

			}else if ((int) this.getBody().getPosition().x * MainMenu.PPM - x < 0 
					&& x <= (int) this.getBody().getPosition().x * MainMenu.PPM + this.getWidth() / 2 +60
					&& y +cha.getHeight() / 2 >= (int) this.getBody().getPosition().y * MainMenu.PPM 
					&& y <= (int) this.getBody().getPosition().y * MainMenu.PPM + this.getHeight() / 2  ){
				this.isHit = true;
				this.timerHit = System.currentTimeMillis();
				this.getBody().applyLinearImpulse(new Vector2(-600000,0), this.getBody().getWorldCenter(), true);

			}
		
			if (x+ cha.getWidth() / 2 >= (int) this.getBody().getPosition().x * MainMenu.PPM  
					&& x <= (int) this.getBody().getPosition().x * MainMenu.PPM + this.getWidth() / 2 
					&& y +cha.getHeight() / 2 >= (int) this.getBody().getPosition().y * MainMenu.PPM -60
					&& (int) this.getBody().getPosition().y * MainMenu.PPM - y > 0 ){
				this.isHit = true;
				this.timerHit = System.currentTimeMillis();
				this.getBody().applyLinearImpulse(new Vector2(0,+600000), this.getBody().getWorldCenter(), true);

			}
			else if (x + cha.getWidth() / 2 >= (int) this.getBody().getPosition().x * MainMenu.PPM   
					&& x <= (int) this.getBody().getPosition().x * MainMenu.PPM   + this.getWidth() / 2 
					&& (int) this.getBody().getPosition().y * MainMenu.PPM   - y < 0
					&& y <= (int) this.getBody().getPosition().y * MainMenu.PPM   + this.getHeight() / 2  +60){
				this.isHit = true;
				this.timerHit = System.currentTimeMillis();
				this.getBody().applyLinearImpulse(new Vector2(0,-600000), this.getBody().getWorldCenter(), true);

			}
			this.isAttacked = true;
		}
		this.setHealth(this.getHealth() - cha.getDégàts());
	}
	
	
// infligé des dégats 

	
	public void infligéDégatLink(){
		
		
		if ( MainMenu.Link.getX() + MainMenu.Link.getWidth() / 2 >= this.getX() -25 
				&& MainMenu.Link.getX() <= this.getX() 
				&& MainMenu.Link.getY() +MainMenu.Link.getHeight() / 2 >= this.getY() 
				&& MainMenu.Link.getY() <= this.getY() + this.getHeight() / 2  ){
			MainMenu.Link.isHit = true;
			MainMenu.Link.timerHit = System.currentTimeMillis();
			MainMenu.Link.getBody().applyLinearImpulse(new Vector2(-600000,0), MainMenu.Link.getBody().getWorldCenter(), true);
			if ( MainMenu.Link.getDirection().equals("droite") && Bouclier.isBouclierUtilisé){ // utilisation du bouclier
				
			} else MainMenu.Link.setHealth(MainMenu.Link.getHealth() - this.getStrength());
		}
		else if (this.getX() - MainMenu.Link.getX() < 0 
				&& MainMenu.Link.getX() <= this.getX() + this.getWidth() / 2 +25
				&& MainMenu.Link.getY() +MainMenu.Link.getHeight() / 2 >= this.getY() 
				&& MainMenu.Link.getY() <= this.getY() + this.getHeight() / 2  ){
			MainMenu.Link.isHit = true;
			MainMenu.Link.timerHit = System.currentTimeMillis();
			MainMenu.Link.getBody().applyLinearImpulse(new Vector2(+600000,0), MainMenu.Link.getBody().getWorldCenter(), true);

			if ( MainMenu.Link.getDirection().equals("gauche") && Bouclier.isBouclierUtilisé){ // utilisation du bouclier
				
			} else MainMenu.Link.setHealth(MainMenu.Link.getHealth() - this.getStrength());
		} 
	
		if (MainMenu.Link.getX() + MainMenu.Link.getWidth() / 2 >= this.getX()  
				&& MainMenu.Link.getX() <= this.getX() + this.getWidth() / 2 
				&& MainMenu.Link.getY() +MainMenu.Link.getHeight() / 2 >= this.getY() -30
				&& this.getY() - MainMenu.Link.getY() > 0 ){
			MainMenu.Link.isHit = true;
			MainMenu.Link.timerHit = System.currentTimeMillis();
			MainMenu.Link.getBody().applyLinearImpulse(new Vector2(0,-600000), MainMenu.Link.getBody().getWorldCenter(), true);

			if ( MainMenu.Link.getDirection().equals("haut") && Bouclier.isBouclierUtilisé){ // utilisation du bouclier

			} else MainMenu.Link.setHealth(MainMenu.Link.getHealth() - this.getStrength());
		}
		else if (MainMenu.Link.getX() + MainMenu.Link.getWidth() / 2 >= this.getX()  
				&& MainMenu.Link.getX() <= this.getX() + this.getWidth() / 2 
				&& this.getY() - MainMenu.Link.getY() < 0
				&& MainMenu.Link.getY() <= this.getY() + this.getHeight() / 2  +25){
			MainMenu.Link.isHit = true;
			MainMenu.Link.timerHit = System.currentTimeMillis();
			MainMenu.Link.getBody().applyLinearImpulse(new Vector2(0,+600000), MainMenu.Link.getBody().getWorldCenter(), true);

			if ( MainMenu.Link.getDirection().equals("bas") && Bouclier.isBouclierUtilisé){ // utilisation du bouclier

			} else MainMenu.Link.setHealth(MainMenu.Link.getHealth() - this.getStrength());
		}
			
		
	}
	

	
}
