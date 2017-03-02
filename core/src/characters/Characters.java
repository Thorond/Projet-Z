package characters;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.physics.box2d.World;


public class Characters extends Sprite{
	
	private int Health;
	private int Strength;
	public String direction;
	
	
	public Characters(World world,Texture texture, int health, int strength, float x, float y, String direction){
		super(texture);
		setPosition( x - this.getWidth()/2 , y - this.getHeight()/2);
		this.Health = health;
		this.Strength = strength;
		this.direction = direction;
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
