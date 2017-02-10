package characters;

import map.CoordCart;

public class Character {
	
	private int Health;
	private int Strenght;
	public CoordCart position;
	
	
	public Character( int health, int strenght, CoordCart position){
		this.Health = health;
		this.Strenght = strenght;
		this.position = position;
	}

	public int getHealth() {
		return Health;
	}

	public void setHealth(int health) {
		Health = health;
	}

	public int getStrenght() {
		return Strenght;
	}

	public void setStrenght(int strenght) {
		Strenght = strenght;
	}

	


}
