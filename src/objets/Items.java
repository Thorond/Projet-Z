package objets;

import characters.MainCharacter;

public class Items {
	
	protected String graphisme;
	protected int nombreItem;
	
	public Items(){
		this.graphisme ="";
		this.nombreItem =1;
	}
	
	public Items(String gra, int nombre){
		this.graphisme = gra;
		this.nombreItem = nombre;
	}
	
	public  void setGraphisme( String gra){
		graphisme = gra;
	}
	
	public  String getGraphisme(){
		return graphisme;
	}
	
	public  void setNombreItem(int nbr){
		nombreItem = nbr;
	}
	public  int getNombreItem(){
		return nombreItem;
	}
		
	public void utilisationItem(MainCharacter cha) {
	}

}
