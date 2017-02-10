package characters;

import map.CoordCart;
import objets.Décors;

public class Pnj extends Character{
	
	public Pnj(int health, int strenght, CoordCart position){
		super(health,strenght, position);
	}
	
//	direction du pnj
	public String direction;
	
	public void setDirection(String dir){
		this.direction = dir;
	}
	
	public String getDirection(){
		return direction;
	}
	
	
//	déplacement aléatoire
	
	public static void déplacementAléa(Pnj pnj, Décors[][] carte){
		double tempo = Math.random();
		if ( tempo < 0.25 && pnj.position.getX() > 0 && carte[pnj.position.getX()-1][pnj.position.getY()].getObstacle() == false){
			pnj.position.setX(pnj.position.getX()-1);
			pnj.setDirection("haut");
		}
		else if (tempo > 0.25 && tempo < 0.5 && pnj.position.getX() < 7 && carte[pnj.position.getX()+1][pnj.position.getY()].getObstacle() == false){
			pnj.position.setX(pnj.position.getX()+1);
			pnj.setDirection("bas");
		}
		else if (tempo > 0.5 && tempo < 0.75 && pnj.position.getY() > 0 && carte[pnj.position.getX()][pnj.position.getY()-1].getObstacle() == false){
			pnj.position.setY(pnj.position.getY()-1);
			pnj.setDirection("gauche");
		}
		else if (tempo > 0.75 && pnj.position.getY() < 9 && carte[pnj.position.getX()][pnj.position.getY()+1].getObstacle() == false){
			pnj.position.setY(pnj.position.getY()+1);
			pnj.setDirection("droite");
		}
	}

}
