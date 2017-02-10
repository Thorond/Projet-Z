package map;


public class CoordCart {
	
	int x_coord;
	int y_coord;

//	Constructeur par défaut
	public CoordCart(){
		this(0,0);
	}

	public CoordCart (int x, int y) {
		x_coord = x;
		y_coord = y;
	}
	
	public void setX( int x){
		this.x_coord = x;
	}
	public void setY( int y){
		this.y_coord = y;
	}
	
	public int getX(){
		return x_coord;
	}

	public int getY(){
		return y_coord;
	}

    public int distanceToOrigin () {
		return (int) Math.sqrt(Math.pow(x_coord,2)+Math.pow(y_coord,2));
	}
	

	public int distanceTo(CoordCart coord){
		return (int) Math.sqrt(Math.pow(x_coord-coord.x_coord,2)+Math.pow(y_coord-coord.y_coord,2));
	}

	public String toString(){
		return "("+x_coord+", "+y_coord+")";
	}
	
	
}
