package characters;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.physics.box2d.Body;
import com.badlogic.gdx.physics.box2d.BodyDef;
import com.badlogic.gdx.physics.box2d.Fixture;
import com.badlogic.gdx.physics.box2d.FixtureDef;
import com.badlogic.gdx.physics.box2d.PolygonShape;
import com.badlogic.gdx.physics.box2d.World;

import scenes.MainMenu;


public class Characters extends Sprite{
	
	private int HealthMax;
	private int Health;
	private int Strength;
	public String direction;
	
	private World world;
	private Body body;
	
	public Characters(World world,Texture texture, int HM, int health, int strength, float x, float y, String direction){
		super(texture);
		setPosition( x - this.getWidth()/2 , y - this.getHeight()/2);
		this.HealthMax = HM;
		this.Health = health;
		this.Strength = strength;
		this.direction = direction;
		this.world=world;
		createBody(x,y);
	}
	
	
	
	void createBody(float x, float y){
		BodyDef bodyDef = new BodyDef();
		bodyDef.type = BodyDef.BodyType.DynamicBody;
		bodyDef.position.set(x/MainMenu.PPM,y/MainMenu.PPM);
		body = world.createBody(bodyDef);
		
		PolygonShape shape = new PolygonShape();
		shape.setAsBox((getWidth() / 2.4f)/MainMenu.PPM , (getHeight() / 2.4f)/MainMenu.PPM);
		
		FixtureDef fixtureDef = new FixtureDef();
		fixtureDef.shape = shape;
		fixtureDef.density = 1;
		
		Fixture fixture = body.createFixture(fixtureDef);
		
		shape.dispose();
	}
	
	public void updateBody(){
		this.setPosition(this.getBody().getPosition().x *MainMenu.PPM , this.getBody().getPosition().y*MainMenu.PPM);
	}
	
	public Body getBody(){
		return this.body;
	}
	
	public int getHealthMax() {
		return HealthMax;
	}


	public void setHealthMax(int healthMax) {
		HealthMax = healthMax;
	}

	public int getHealth() {
		return Health;
	}

	public void setHealth(int health) {
		Health = health;
	}

	public int getStrength() {
		return Strength;
	}

	public void setStrength(int strength) {
		Strength = strength;
	}
	
//	direction du personnage
	
	public void setDirection(String dir){
		this.direction = dir;
	}
	
	public String getDirection(){
		return direction;
	}


	

	

}
