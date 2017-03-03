package map;

public class Map {
	
    public static String[][] typeDeDécor = new String[8][10];
    public static boolean[][] décorChangé = new boolean[8][10] ;
	
    public static void setTypeDeDécor(){
		for ( int i = 0 ; i < 8 ; i++){
			for ( int j = 0 ; j <10; j++){
				typeDeDécor[i][j] = "";
			}
		}
	}
    
	public static void setTypeDeDécor( int i , int j , String décor){
		typeDeDécor[i][j] = décor;
	}
	
	public static void setDécoChangéFaux(){
		for ( int i = 0 ; i < 8 ; i++){
			for ( int j = 0 ; j <10; j++){
				décorChangé[i][j] = false;
			}
		}
	}
	
	public static void setDécorChangé( int i , int j , boolean boo){
		décorChangé[i][j] = boo;
	}


}
