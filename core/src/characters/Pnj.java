package characters;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.physics.box2d.Body;
import com.badlogic.gdx.physics.box2d.BodyDef;
import com.badlogic.gdx.physics.box2d.Fixture;
import com.badlogic.gdx.physics.box2d.FixtureDef;
import com.badlogic.gdx.physics.box2d.PolygonShape;
import com.badlogic.gdx.physics.box2d.World;

import scenes.MainMenu;

public class Pnj extends Characters{
	
	public String direction;
	private World world;
	private Body body;
	public long start;
	public boolean arrêt = false;
	
	public static Texture linkPetit = new Texture("linkPetit.png");
	
	public Pnj(World world, int HM, int health, int strength, float x, float y, String direction){
		super(world,linkPetit, HM, health, strength, x,  y, direction);
		this.world = world;
		createBody(x,y);
		start = System.currentTimeMillis();
	}
	
	
	public void setDirection(String dir){
		this.direction = dir;
	}
	
	public String getDirection(){
		return direction;
	}
	
	
//	déplacement aléatoire
	
	public void déplacementAléa(){
		double tempo = Math.random();
		if ( System.currentTimeMillis() - start > 1000) {
			if ( tempo < 0.25 && this.getBody().getPosition().x > 60 ){
				this.getBody().applyLinearImpulse(new Vector2(-100000f,0), this.getBody().getWorldCenter(), true);
				this.setDirection("gauche");
			}
			else if (tempo > 0.25 && tempo < 0.5 && this.getBody().getPosition().x < 540 ){
				this.getBody().applyLinearImpulse(new Vector2(+100000f,0), this.getBody().getWorldCenter(), true);
				this.setDirection("droite");
			}
			else if (tempo > 0.5 && tempo < 0.75 && this.getBody().getPosition().y > 60 ){
				this.getBody().applyLinearImpulse(new Vector2(0,-100000f), this.getBody().getWorldCenter(), true);
				this.setDirection("bas");
			}
			else if (tempo > 0.75 && this.getBody().getPosition().y < 420){
				this.getBody().applyLinearImpulse(new Vector2(0,+100000f), this.getBody().getWorldCenter(), true);
				this.setDirection("haut");
			}
			start = System.currentTimeMillis();
			arrêt = false;
		} 
		if (System.currentTimeMillis() - start > 800 && arrêt == false) {
			this.getBody().setLinearVelocity(this.getBody().getLinearVelocity().x / 1.2f, this.getBody().getLinearVelocity().y / 1.2f);
			if ( System.currentTimeMillis() - start > 900 ) arrêt = true;
		}
		
	}
	
	void createBody(float x, float y){
		BodyDef bodyDef = new BodyDef();
		bodyDef.type = BodyDef.BodyType.DynamicBody;
		bodyDef.position.set(x,y);
		body = world.createBody(bodyDef);
		
		PolygonShape shape = new PolygonShape();
		shape.setAsBox(getWidth() / 2 , getHeight() / 2);
		
		FixtureDef fixtureDef = new FixtureDef();
		fixtureDef.shape = shape;
		fixtureDef.density = 1;
		
		Fixture fixture = body.createFixture(fixtureDef);
		
		shape.dispose();
	}
	
	public void updatePlayer(){
		this.setPosition(body.getPosition().x, body.getPosition().y);
	}
	
	public Body getBody(){
		return this.body;
	}
	
//	public void représentationLink(MainCharacter cha){
//		if (cha.getDirection().equals("gauche")){
//			if ( System.currentTimeMillis() - MainMenu.start > 250) {
//				
//				if (MainCharacter.textGauche1 == true){
//					cha.setTexture(MainCharacter.linkGauche1);
//					MainCharacter.textGauche1 = false;
//				} else {
//					cha.setTexture(MainCharacter.linkGauche2);
//					MainCharacter.textGauche1 = true;
//				}
//				MainMenu.start = System.currentTimeMillis();
//			} 
//		}
//		else if (cha.getDirection().equals("droite")){
//			if ( System.currentTimeMillis() - MainMenu.start > 250) {
//				if (MainCharacter.textDroite1 == true){
//					cha.setTexture(MainCharacter.linkDroite1);
//					MainCharacter.textDroite1 = false;
//				} else {
//					cha.setTexture(MainCharacter.linkDroite2);
//					MainCharacter.textDroite1 = true;
//				}
//				MainMenu.start = System.currentTimeMillis();
//			}
//		}
//		else if (cha.getDirection().equals("haut")){
//			if ( System.currentTimeMillis() - MainMenu.start > 250) {
//				if (MainCharacter.textHaut1 == true){
//					cha.setTexture(MainCharacter.linkHaut1);
//					MainCharacter.textHaut1 = false;
//				} else {
//					cha.setTexture(MainCharacter.linkHaut2);
//					MainCharacter.textHaut1 = true;
//				}
//				MainMenu.start = System.currentTimeMillis();
//			}
//		}
//		else if (cha.getDirection().equals("bas")){
//			if ( System.currentTimeMillis() - MainMenu.start > 250) {
//				if (MainCharacter.textBas1 == true){
//					cha.setTexture(MainCharacter.linkBas1);
//					MainCharacter.textBas1 = false;
//				} else {
//					cha.setTexture(MainCharacter.linkBas2);
//					MainCharacter.textBas1 = true;
//				}
//				MainMenu.start = System.currentTimeMillis();
//			}
//		}
//	}
	
	
//	est en vie
	
	public boolean isAlive(){
		if (this.getHealth() > 0 ) return true;
		else return false;
	}
	
//	drop des monstres
	
	public void drop(){
		
	}
	
//	subir dégats et mort
	
	public void subirDégats( int dégat){
		if ( this.getHealth() > 0 && this.getHealth() - dégat <= 0 ) this.drop();
		this.setHealth(this.getHealth() - dégat);
		
	}
//
////position relative par rapport à Link
//	
//	public static String positionToLinkX(MainCharacter Link,CoordCart ennemie){
//		if (Link.position.getX() < ennemie.getX())
//			return "droite";
//		else if (Link.position.getX() > ennemie.getX())
//			return "gauche";
//		else
//			return "même niveau";
//	}
//	
//	public static String positionToLinkY(MainCharacter Link,CoordCart ennemie){
//		if (Link.position.getY() < ennemie.getY())
//			return "haut";
//		else if (Link.position.getY() > ennemie.getY())
//			return "bas";
//		else {
//			return "même niveau";
//		}
//	}
//	
//	//réduction de distance à Link
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
//	//distance relative par rapport à Link entre 1 et 3
//	
//	public static boolean distanceLinkInf1Sup3(MainCharacter Link, CoordCart ennemie){
//		if ( Link.position.distanceTo(ennemie) >1 && Link.position.distanceTo(ennemie) < 3 )
//			return true;
//		else
//			return false;
//	}
//	
//	//distance relative par rapport à Link inférieur à 1 
//	
//	public static boolean distanceLinkSup1(MainCharacter Link, CoordCart ennemie){
//		if ( Link.position.distanceTo(ennemie) <= 1 )
//			return true;
//		else
//			return false;
//	}
	
	
//	dégât infligé 
	
	public static void infligeDégât(MainCharacter Link, Pnj pnj){
		Link.setHealth(Link.getHealth()- pnj.getStrength());
	}
	
}
