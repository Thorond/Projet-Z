package objets;


public class D�cors {
	
//	Pour les �l�ments du d�cor qui seront obstacles et ses coordonn�es
	
	public boolean obstacle;
	public String graphisme;

//	
	
	public D�cors(boolean boo, String gra ){
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
