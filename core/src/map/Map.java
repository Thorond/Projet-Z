package map;

public class Map {
	
    public static String[][] typeDeD�cor = new String[12][12];
    public static boolean[][] d�corChang� = new boolean[12][12] ;
	
    public static void setTypeDeD�cor(){
		for ( int i = 0 ; i < 12 ; i++){
			for ( int j = 0 ; j <12; j++){
				typeDeD�cor[i][j] = "";
			}
		}
	}
    
	public static void setTypeDeD�cor( int i , int j , String d�cor){
		typeDeD�cor[i][j] = d�cor;
	}
	
	public static void setD�coChang�Faux(){
		for ( int i = 0 ; i < 12 ; i++){
			for ( int j = 0 ; j <12; j++){
				d�corChang�[i][j] = false;
			}
		}
	}
	
	public static void setD�corChang�( int i , int j , boolean boo){
		d�corChang�[i][j] = boo;
	}


}
