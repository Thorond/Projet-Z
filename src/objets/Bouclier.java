package objets;

import characters.MainCharacter;

public class Bouclier extends Items {
	
	
	public Bouclier() {
		super(" bo", 1);
	}
	private  String graphisme = " bo";
	private  int nombreItem = 1;
	
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
	
	public void utilisationItem( MainCharacter cha) {
		// TODO Auto-generated method stub
//		retournera vrai l'utilisation du bouclier
		
	}
	
	
	
}
