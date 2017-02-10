package objets;

import characters.MainCharacter;
import characters.Pnj;
import map.CoordCart;

public class Bombes extends Items {
	
	public Bombes( int nombre) {
		super("  b", nombre);
	}

	private  int d�g�ts = 4 ;
	
	public  String getGraphisme() {
		return graphisme;
	}


	public  void setGraphisme(String graphisme) {
		this.graphisme = graphisme;
	}


	public  int getNombreItem() {
		return nombreItem;
	}


	public  void setNombreItem(int nombreItem) {
		this.nombreItem = nombreItem;
	}


	public  int getD�g�ts() {
		return d�g�ts;
	}


	public  void setD�g�ts(int d�g�ts) {
		this.d�g�ts = d�g�ts;
	}
		
	
		
//	d�pot de bombes
	public  int[] bombes = new int[] {9,9,9,9,9,9,9,9,9,9};
	public  CoordCart[] coordBombes = new CoordCart[10];
	public  boolean bombeD�pos�e = false;
	
	
	public void utilisationItem(MainCharacter cha){
		for ( int i =0; i< bombes.length ; i++){
			if ( bombes[i] == 9 ){
				bombes[i]=0;
				coordBombes[i]= new CoordCart(cha.position.getX(),cha.position.getY());
				break;
			}
		}
		bombeD�pos�e = true;
		this.setNombreItem(this.getNombreItem()-1);
	}
	
	
//	explosion de la bombe
	
	public  void d�laiExplosion( D�cors[][] carte , Pnj[] pnjTa){
		boolean pr�sent = false;
		for ( int i = 0; i< bombes.length ; i++){
			if (bombes[i] == 3){ 
				if ( carte[coordBombes[i].getX()][coordBombes[i].getY()+1].getGraphisme() == "  *" ) {
					carte[coordBombes[i].getX()][coordBombes[i].getY()+1].setGraphisme("  -");
					carte[coordBombes[i].getX()][coordBombes[i].getY()+1].setObstacle(false);
				} else if (carte[coordBombes[i].getX()][coordBombes[i].getY()-1].getGraphisme() == "  *" ) {
					carte[coordBombes[i].getX()][coordBombes[i].getY()-1].setGraphisme("  -");
					carte[coordBombes[i].getX()][coordBombes[i].getY()-1].setObstacle(false);
				} else if (carte[coordBombes[i].getX()+1][coordBombes[i].getY()].getGraphisme() == "  *" ) {
					carte[coordBombes[i].getX()+1][coordBombes[i].getY()].setGraphisme("  -");
					carte[coordBombes[i].getX()+1][coordBombes[i].getY()].setObstacle(false);
				} else if (carte[coordBombes[i].getX()-1][coordBombes[i].getY()].getGraphisme() == "  *" ) {
					carte[coordBombes[i].getX()-1][coordBombes[i].getY()].setGraphisme("  -"); 
					carte[coordBombes[i].getX()-1][coordBombes[i].getY()].setObstacle(false); 
				}
				
				for ( int k = 0 ; k < pnjTa.length; k++){
					if (  pnjTa[k].position.getX()  == coordBombes[i].getX() && pnjTa[k].position.getY() == coordBombes[i].getY() ){
						pnjTa[k].setHealth(pnjTa[k].getHealth() - this.getD�g�ts());
					} else if (  pnjTa[k].position.getX()  == coordBombes[i].getX()-1 && pnjTa[k].position.getY() == coordBombes[i].getY()){
						pnjTa[k].setHealth(pnjTa[k].getHealth() - this.getD�g�ts());
					} else if (  pnjTa[k].position.getX()  == coordBombes[i].getX()+1 && pnjTa[k].position.getY() == coordBombes[i].getY()){
						pnjTa[k].setHealth(pnjTa[k].getHealth() - this.getD�g�ts());
					} else if (  pnjTa[k].position.getX()  == coordBombes[i].getX() && pnjTa[k].position.getY() == coordBombes[i].getY()-1){
						pnjTa[k].setHealth(pnjTa[k].getHealth() - this.getD�g�ts());
					} else if (  pnjTa[k].position.getX()  == coordBombes[i].getX() && pnjTa[k].position.getY() == coordBombes[i].getY()+1){
						pnjTa[k].setHealth(pnjTa[k].getHealth() - this.getD�g�ts());
					}  else if (  pnjTa[k].position.getX()  == coordBombes[i].getX() && pnjTa[k].position.getY() == coordBombes[i].getY()){
						pnjTa[k].setHealth(pnjTa[k].getHealth() - this.getD�g�ts());
					} 
				}
				
				bombes[i]=9;
			}
			else if ( bombes[i] != 9){
				bombes[i]++;
				pr�sent = true;
			}
		}
		if ( pr�sent == false) bombeD�pos�e = false;
	}


	
	


}
