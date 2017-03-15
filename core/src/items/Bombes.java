package items;

import characters.MainCharacter;
import characters.Pnj;
import map.CoordCart;

public class Bombes extends Item {
	
	public Bombes( int nombre) {
		super("  b", nombre);
	}

	private  int dégéts = 4 ;
	

	public  int getNombreItem() {
		return nombreItem;
	}


	public  void setNombreItem(int nombreItem) {
		this.nombreItem = nombreItem;
	}


	public  int getDégéts() {
		return dégéts;
	}


	public  void setDégéts(int dégéts) {
		this.dégéts = dégéts;
	}
		
	
		
//	dépot de bombes
	public  int[] bombes = new int[] {9,9,9,9,9,9,9,9,9,9};
	public  CoordCart[] coordBombes = new CoordCart[10];
	public  boolean bombeDéposée = false;
	
	
	public void utilisationItem(MainCharacter cha){
		for ( int i =0; i< bombes.length ; i++){
			if ( bombes[i] == 9 ){
				bombes[i]=0;
				coordBombes[i]= new CoordCart(cha.position.getX(),cha.position.getY());
				break;
			}
		}
		bombeDéposée = true;
		this.setNombreItem(this.getNombreItem()-1);
	}
	
	
//	explosion de la bombe
	
	public  void délaiExplosion( Decor[][] carte , Pnj[] pnjTa){
		boolean présent = false;
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
						pnjTa[k].setHealth(pnjTa[k].getHealth() - this.getDégéts());
					} else if (  pnjTa[k].position.getX()  == coordBombes[i].getX()-1 && pnjTa[k].position.getY() == coordBombes[i].getY()){
						pnjTa[k].setHealth(pnjTa[k].getHealth() - this.getDégéts());
					} else if (  pnjTa[k].position.getX()  == coordBombes[i].getX()+1 && pnjTa[k].position.getY() == coordBombes[i].getY()){
						pnjTa[k].setHealth(pnjTa[k].getHealth() - this.getDégéts());
					} else if (  pnjTa[k].position.getX()  == coordBombes[i].getX() && pnjTa[k].position.getY() == coordBombes[i].getY()-1){
						pnjTa[k].setHealth(pnjTa[k].getHealth() - this.getDégéts());
					} else if (  pnjTa[k].position.getX()  == coordBombes[i].getX() && pnjTa[k].position.getY() == coordBombes[i].getY()+1){
						pnjTa[k].setHealth(pnjTa[k].getHealth() - this.getDégéts());
					}  
				}
				
				bombes[i]=9;
			}
			else if ( bombes[i] != 9){
				bombes[i]++;
				présent = true;
			}
		}
		if ( présent == false) bombeDéposée = false;
	}

}
