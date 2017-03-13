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
	
//	déplacement aléatoire
	
	public void déplacementAléa(){
		double tempo = Math.random();
		if ( System.currentTimeMillis() - start > 2000) {
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
		double tempo = Math.random();
		if ( tempo < 0.5 ) CoeurDeVie.remplirCoeurDeVies((int) this.getBody().getPosition().x , (int) this.getBody().getPosition().y );
	}
	
//	subir dégats et mort
	
	public void subirDégats( MainCharacter cha, String direction){
		if ( this.getHealth() > 0 && this.getHealth() - cha.getStrength() <= 0 ) {
			this.drop();
			this.getBody().setTransform(-100, -100, 0);
		} else {
			if ( direction.equals("droite")) this.getBody().setTransform(this.getBody().getPosition().x +30, this.getBody().getPosition().y, 0);
			else if ( direction.equals("gauche")) this.getBody().setTransform(this.getBody().getPosition().x -30, this.getBody().getPosition().y, 0);
			else if ( direction.equals("haut")) this.getBody().setTransform(this.getBody().getPosition().x, this.getBody().getPosition().y +30, 0);
			else if ( direction.equals("bas")) this.getBody().setTransform(this.getBody().getPosition().x, this.getBody().getPosition().y -30, 0);
		}
		this.setHealth(this.getHealth() - cha.getStrength());
	}
//
////position relative par rapport é Link
//	
//	public static String positionToLinkX(MainCharacter Link,CoordCart ennemie){
//		if (Link.position.getX() < ennemie.getX())
//			return "droite";
//		else if (Link.position.getX() > ennemie.getX())
//			return "gauche";
//		else
//			return "méme niveau";
//	}
//	
//	public static String positionToLinkY(MainCharacter Link,CoordCart ennemie){
//		if (Link.position.getY() < ennemie.getY())
//			return "haut";
//		else if (Link.position.getY() > ennemie.getY())
//			return "bas";
//		else {
//			return "méme niveau";
//		}
//	}
//	
//	//réduction de distance é Link
//	
//	public static void déplacementToLink(MainCharacter Link,CoordCart ennemie){
//		if ( positionToLinkX(Link, ennemie) == "droite"){
//			ennemie.setX(ennemie.getX()-1);
//		} else if (positionToLinkX(Link, ennemie) == "gauche"){
//			ennemie.setX(ennemie.getX()+1);
//		}
//			
//		if ( positionToLinkY(Link, ennemie) == "haut"){
//			ennemie.setY(ennemie.getY()-1);
//		} else if ( positionToLinkY(Link, ennemie) == "bas"){
//			ennemie.setY(ennemie.getY()+1);
//		}
//	}
//	
//	
//	
//	//distance relative par rapport é Link entre 1 et 3
//	
//	public static boolean distanceLinkInf1Sup3(MainCharacter Link, CoordCart ennemie){
//		if ( Link.position.distanceTo(ennemie) >1 && Link.position.distanceTo(ennemie) < 3 )
//			return true;
//		else
//			return false;
//	}
//	
//	//distance relative par rapport é Link inférieur é 1 
//	
//	public static boolean distanceLinkSup1(MainCharacter Link, CoordCart ennemie){
//		if ( Link.position.distanceTo(ennemie) <= 1 )
//			return true;
//		else
//			return false;
//	}
	
	
//	dégat infligé au monstre
	
	public static void infligeDégat(MainCharacter Link, Pnj pnj){
		Link.setHealth(Link.getHealth()- pnj.getStrength());
	}
	
}
