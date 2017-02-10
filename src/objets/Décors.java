package objets;


public class Décors {
	
//	Pour les éléments du décor qui seront obstacles et ses coordonnées
	
	public boolean obstacle;
	public String graphisme;

//	
	
	public Décors(boolean boo, String gra ){
		this.obstacle = boo;
		this.graphisme = gra;
	}
	
	public void setObstacle(boolean boo){
		this.obstacle = boo;
	}
	public boolean getObstacle(){
		return this.obstacle;
	}
	
	public void setGraphisme(String str){
		this.graphisme = str;
	}
	public String getGraphisme(){
		return this.graphisme;
	}
	
}
