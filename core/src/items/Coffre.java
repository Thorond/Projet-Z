package items;

import com.mygdx.game.GameMain;

import decors.ClimatMontagneux;

public class Coffre {
	
	public static long start = System.currentTimeMillis();
	
	public static boolean annimationCoffre = false;
	
	public static boolean ouvert1 = false;
	public static boolean ouvert2 = false;
	
	public static void annimationCoffreBleu(GameMain game, int x , int y){
			annimationCoffre = true;
			if ( ! (ouvert1) && ! (ouvert2 )) {
				game.getBatch().draw(ClimatMontagneux.coffreBleuOuvert1, x, y);
				if ( System.currentTimeMillis() - start > 100 ) {
					ouvert1 = true;
					start = System.currentTimeMillis();
				}
			} else if ( ouvert1 && !(ouvert2)) {
				game.getBatch().draw(ClimatMontagneux.coffreBleuOuvert2, x , y);
				if ( System.currentTimeMillis() - start > 100 ){
					ouvert2 = true;
					start = System.currentTimeMillis();
				}
			} else if ( ouvert1 && ouvert2 ){
				game.getBatch().draw(ClimatMontagneux.coffreBleuOuvert3,x,y);
				ouvert1= false;
				ouvert2=false;			
				drop();
		}
	}
	
	public static void drop(){
		
	}

}
