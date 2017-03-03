package map;

public class Map {
	
    public static String[][] typeDeDécor = new String[12][12];
    public static boolean[][] décorChangé = new boolean[12][12] ;
	
    public static void setTypeDeDécor(){
		for ( int i = 0 ; i < 12 ; i++){
			for ( int j = 0 ; j <12; j++){
				typeDeDécor[i][j] = "";
			}
		}
	}
    
	public static void setTypeDeDécor( int i , int j , String décor){
		typeDeDécor[i][j] = décor;
	}
	
	public static void setDécoChangéFaux(){
		for ( int i = 0 ; i < 12 ; i++){
			for ( int j = 0 ; j <12; j++){
				décorChangé[i][j] = false;
			}
		}
	}
	
	public static void setDécorChangé( int i , int j , boolean boo){
		décorChangé[i][j] = boo;
	}


}
