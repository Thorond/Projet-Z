package characters;

import library.Console;
import map.CoordCart;
import objets.Décors;
import objets.Items;
import test.Représentation;

public class MainCharacter extends Character {
	
	private Items[] objets = new Items[] {new Items(), new Items()};
	public String direction = "bas";
	
	public MainCharacter(int health, int strenght, CoordCart position){
		super(health,strenght, position);
	}
//	direction du personnage
	
	public void setDirection(String dir){
		this.direction = dir;
	}
	
	public String getDirection(){
		return direction;
	}
	
	
	
//	 création et affichage des deux items actuellement utilisés.
	
	public void setObjets1(Items ite){
		objets[0]=ite;
	}
	public void setObjets2(Items ite){
		objets[1]=ite;
	}
	
	public Items[] getObjets(){
		return objets;
	}
	
	public String entête;
	
	public  void setEntête(){
		entête = "    K[" + this.objets[0].getNombreItem() + this.objets[0].getGraphisme() + "]  " + "L[" + this.objets[1].getNombreItem() + this.objets[1].getGraphisme() +"]    " ;
		for ( int k = 0; k< this.getHealth(); k++){
			entête += "c";
		}
		System.out.println(entête);
	}


	
//	création du sac et affichage
	public int nbrItems = 0;
	public Items[] ensembleDesItems = new Items[] { new Items(), new Items(), new Items(), new Items(), new Items()} ;
	
	public void setItems(Items ite){
		if ( this.objets[0].getGraphisme() == "" ) {
			this.objets[0] = ite;
		} else if ( this.objets[1].getGraphisme() == ""  ){
			this.objets[1] = ite;
		} else if (this.objets[0].getGraphisme() != ite.getGraphisme() && this.objets[1].getGraphisme() != ite.getGraphisme()){
			ensembleDesItems[nbrItems]=ite;
			nbrItems++;
		}
	}
	
	public void affichageSac(){
		String sac= "";
		for ( int i = 0; i < ensembleDesItems.length ; i++){
			if (ensembleDesItems[i].getGraphisme() != "")
				sac += ensembleDesItems[i].getNombreItem() + " " + ensembleDesItems[i].getGraphisme();
		}
		System.out.println(sac);
	}
	
//	choix items
	
	public void acquisitionItemsK(Items ite){
		
	}
	public void acquisitionItemsL(Items ite){
		
	}
	
	

//  affichage en fonction du clavier
	
	public void display(Décors[][] carte){

		String choix;

		do {
			choix = Console.readLine("Déplacement");
			if ( choix.equals("m")){
				this.affichageSac();
			}else {
				if (choix.equals("q" ) && this.position.getY() > 0 && carte[this.position.getX()][this.position.getY()-1].getObstacle() == false){
					this.position.setY(this.position.getY()-1);
					this.setDirection("gauche");
				}
				else if (choix.equals("d") && this.position.getY() < 19 && carte[this.position.getX()][this.position.getY()+1].getObstacle() == false){
					this.position.setY(this.position.getY()+1);
					this.setDirection("droite");
				}
				else if (choix.equals("s") && this.position.getX() < 15 && carte[this.position.getX()+1][this.position.getY()].getObstacle() == false){
					this.position.setX(this.position.getX()+1);
					this.setDirection("bas");
				}
				else if (choix.equals("z") && this.position.getX() > 0 && carte[this.position.getX()-1][this.position.getY()].getObstacle() == false){
					this.position.setX(this.position.getX()-1);
					this.setDirection("haut");
				}
				else if (choix.equals("l") && objets[1].getNombreItem() > 0 ){
					objets[1].utilisationItem(this);
					this.setItems(objets[1]);
				}
				else if (choix.equals("f")) System.out.println("** Jeu fermé **");
				Représentation.représentation();
			}
			
		}
		while (!(choix.equals("f")));
	}
	

}
