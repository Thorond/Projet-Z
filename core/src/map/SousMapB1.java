package map;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.physics.box2d.Body;
import com.badlogic.gdx.physics.box2d.World;
import com.mygdx.game.GameMain;

import characters.Pnj;
import d�cors.HerbesBasses;
import d�cors.HerbesHautes;
import d�cors.RacineGaucheArbre;
import scenes.MainMenu;

public class SousMapB1 extends Sprite {
	
	public static Texture sousMapB1 = new Texture("Corps.png");
	
	public static Body body1;
	public static boolean isBody1Created;
	public static Body body2;
	public static boolean isBody2Created;
	public static int x;
	public static int y;
	
	public static Pnj monstre1;
	public static Pnj monstre2;
	public static Pnj monstre3;
	public static boolean m1EstCr�e = false ;
	public static boolean m2EstCr�e = false ;
	public static boolean m3EstCr�e = false ;
	
	public static boolean monstresPr�sent = true;
	public static Pnj[] monstres = new Pnj[3];
	
	public static void sousMapB1(GameMain game, int x, int y){
		
		
		if ( Map.d�corChang�[0][0] == false ) game.getBatch().draw(HerbesHautes.gazon, 0+x, 0+y);
		else game.getBatch().draw(HerbesBasses.gazonNeutre, 0 + x, 0 + y);
		game.getBatch().draw(HerbesBasses.gazonNeutre, 0 + x, 60 + y);
		game.getBatch().draw(HerbesHautes.gazon, 0+ x, 120+ y);
		game.getBatch().draw(HerbesHautes.gazon, 0+ x, 180+ y);		
		if ( Map.d�corChang�[0][240 /60 ] == false ) game.getBatch().draw(HerbesHautes.gazon, 0+x, 240+y);
		else game.getBatch().draw(HerbesBasses.gazonNeutre, 0 + x, 240+y);
		game.getBatch().draw(HerbesHautes.gazon, 0+ x, 300+ y);
		game.getBatch().draw(HerbesHautes.gazon, 0+ x, 360+ y);
		game.getBatch().draw(HerbesHautes.gazon, 0+ x, 420+ y);
		
		
		game.getBatch().draw(HerbesHautes.gazon, 60+ x, 0+ y);
		game.getBatch().draw(HerbesHautes.gazon, 60+ x, 60+ y);
		game.getBatch().draw(HerbesHautes.gazon, 60+ x, 120+ y);
		game.getBatch().draw(HerbesHautes.gazon, 60+ x, 180+ y);		
		if ( Map.d�corChang�[60 / 60 ][ 240 / 60] == false ) game.getBatch().draw(HerbesHautes.gazon, 60+ x, 240+ y);
		else game.getBatch().draw(HerbesBasses.gazonNeutre, 60+ x, 240+ y);	
		game.getBatch().draw(HerbesHautes.gazon, 60+ x, 300+ y);
		game.getBatch().draw(HerbesHautes.gazon, 60+ x, 360+ y);
		game.getBatch().draw(HerbesHautes.gazon, 60+ x, 420+ y);
		
		game.getBatch().draw(HerbesHautes.gazon, 120+ x, 0+ y);
		game.getBatch().draw(HerbesHautes.gazon, 120+ x, 60+ y);
		game.getBatch().draw(HerbesHautes.gazon, 120+ x, 120+ y);
		game.getBatch().draw(HerbesHautes.gazon, 120+ x, 180+ y);
		game.getBatch().draw(HerbesHautes.gazon, 120+ x, 240+ y);
		game.getBatch().draw(HerbesHautes.gazon, 120+ x, 300+ y);
		game.getBatch().draw(HerbesHautes.gazon, 120+ x, 360+ y);
		game.getBatch().draw(HerbesHautes.gazon, 120+ x, 420+ y);
		
		game.getBatch().draw(HerbesHautes.gazon, 180+ x, 0+ y);
		game.getBatch().draw(HerbesHautes.gazon, 180+ x, 60+ y);
		game.getBatch().draw(HerbesHautes.gazon, 180+ x, 120+ y);
		game.getBatch().draw(HerbesHautes.gazon, 180+ x, 180+ y);
		game.getBatch().draw(HerbesHautes.gazon, 180+ x, 240+ y);
		game.getBatch().draw(HerbesHautes.gazon, 180+ x, 300+ y);
		game.getBatch().draw(HerbesHautes.gazon, 180+ x, 360+ y);
		game.getBatch().draw(HerbesHautes.gazon, 180+ x, 420+ y);
		
		game.getBatch().draw(HerbesHautes.gazon, 240+ x, 0+ y);
		game.getBatch().draw(HerbesHautes.gazon, 240+ x, 60+ y);
		game.getBatch().draw(HerbesHautes.gazon, 240+ x, 120+ y);
		game.getBatch().draw(HerbesHautes.gazon, 240+ x, 180+ y);
		game.getBatch().draw(HerbesHautes.gazon, 240+ x, 240+ y);
		game.getBatch().draw(HerbesHautes.gazon, 240+ x, 300+ y);
		game.getBatch().draw(HerbesHautes.gazon, 240+ x, 360+ y);
		game.getBatch().draw(HerbesHautes.gazon, 240+ x, 420+ y);
		
		game.getBatch().draw(HerbesHautes.gazon, 300+ x, 0+ y);
		game.getBatch().draw(HerbesHautes.gazon, 300+ x, 60+ y);
		game.getBatch().draw(HerbesHautes.gazon, 300+ x, 120+ y);
		game.getBatch().draw(HerbesHautes.gazon, 300+ x, 180+ y);
		game.getBatch().draw(HerbesHautes.gazon, 300+ x, 240+ y);
		game.getBatch().draw(HerbesHautes.gazon, 300+ x, 300+ y);
		game.getBatch().draw(HerbesHautes.gazon, 300+ x, 360+ y);
		game.getBatch().draw(HerbesHautes.gazon, 300+ x, 420+ y);
		
		game.getBatch().draw(HerbesHautes.gazon, 360+ x, 0+ y);
		game.getBatch().draw(HerbesHautes.gazon, 360+ x, 60+ y);
		game.getBatch().draw(HerbesHautes.gazon, 360+ x, 120+ y);
		game.getBatch().draw(HerbesHautes.gazon, 360+ x, 180+ y);
		game.getBatch().draw(HerbesHautes.gazon, 360+ x, 240+ y);
		game.getBatch().draw(RacineGaucheArbre.map6060, 360+ x, 300+ y);
		game.getBatch().draw(HerbesHautes.gazon, 360+ x, 360+ y);
		game.getBatch().draw(HerbesHautes.gazon, 360+ x, 420+ y);
		
		game.getBatch().draw(HerbesHautes.gazon, 420+ x, 0+ y);
		game.getBatch().draw(HerbesHautes.gazon, 420+ x, 60+ y);
		game.getBatch().draw(HerbesHautes.gazon, 420+ x, 120+ y);
		game.getBatch().draw(RacineGaucheArbre.map6060, 420+ x, 180+ y);
		game.getBatch().draw(HerbesHautes.gazon, 420+ x, 240+ y);
		game.getBatch().draw(HerbesHautes.gazon, 420+ x, 300+ y);
		game.getBatch().draw(HerbesHautes.gazon, 420+ x, 360+ y);
		game.getBatch().draw(HerbesHautes.gazon, 420+ x, 420+ y);
		
		game.getBatch().draw(HerbesHautes.gazon, 480+ x, 0+ y);
		game.getBatch().draw(HerbesHautes.gazon, 480+ x, 60+ y);
		game.getBatch().draw(HerbesHautes.gazon, 480+ x, 120+ y);
//		game.getBatch().draw(Trou.trou, 480, 180);
		game.getBatch().draw(HerbesHautes.gazon, 480+ x, 240+ y);
		game.getBatch().draw(HerbesHautes.gazon, 480+ x, 300+ y);
		game.getBatch().draw(HerbesHautes.gazon, 480+ x, 360+ y);
		game.getBatch().draw(HerbesHautes.gazon, 480+ x, 420+ y);
		
		game.getBatch().draw(HerbesHautes.gazon, 540+ x, 0+ y);
		game.getBatch().draw(HerbesHautes.gazon, 540+ x, 60+ y);
		game.getBatch().draw(HerbesHautes.gazon, 540+ x, 120+ y);
		game.getBatch().draw(HerbesHautes.gazon, 540+ x, 180+ y);
		game.getBatch().draw(HerbesHautes.gazon, 540+ x, 240+ y);
		game.getBatch().draw(HerbesHautes.gazon, 540+ x, 300+ y);
		game.getBatch().draw(HerbesHautes.gazon, 540+ x, 360+ y);
		game.getBatch().draw(HerbesHautes.gazon, 540+ x, 420+ y);
		
		
//		==================================================================
//						Placement des dessins des monstres
//		==================================================================
		
		if ( monstre1.isAlive() ) game.getBatch().draw(monstre1, monstre1.getBody().getPosition().x + x, monstre1.getBody().getPosition().y + y);
		if ( monstre2.isAlive() ) game.getBatch().draw(monstre2, monstre2.getBody().getPosition().x + x, monstre2.getBody().getPosition().y + y);
		if ( monstre3.isAlive() ) game.getBatch().draw(monstre3, monstre3.getBody().getPosition().x + x, monstre3.getBody().getPosition().y + y);
		
	}
	
	public static void createBodyAndType(World world){
		
		Map.setTypeDeD�cor(0, 0, "HerbesHautes");
		
		Map.setTypeDeD�cor(0, 240 / 60, "HerbesHautes");
		
		Map.setTypeDeD�cor(60 / 60, 240 / 60, "HerbesHautes");
		
		if ( isBody1Created == false ) {
			body1 = RacineGaucheArbre.createBody(370,315);
			isBody1Created = true;
		}
		
		if ( isBody2Created == false ) {
			body2 = RacineGaucheArbre.createBody(430,200);
			isBody2Created = true;
		}
		
		Map.setTypeDeD�cor(480/60, 180/60, "trou");
		
		
		if ( m1EstCr�e == false ) {
			monstre1 = new Pnj(world , 20 , 10 , 4 , 350 , 200 , "bas") ;
			monstres[0] = monstre1;
			m1EstCr�e = true;
		}
		else monstre1.d�placementAl�a();

		if ( m2EstCr�e == false ) {
			monstre2 = new Pnj(world , 20 , 10 , 4 , 100 , 200 , "bas") ;
			monstres[1] = monstre2;
			m2EstCr�e = true;
		}
		else monstre2.d�placementAl�a();

		if ( m3EstCr�e == false ) {
			monstre3 = new Pnj(world , 20 , 10 , 4 , 150 , 400 , "bas") ;
			monstres[2] = monstre3;
			m3EstCr�e = true;
		}
		else monstre3.d�placementAl�a();
		
	}
	
	public static void destroyBody(){
		MainMenu.world.destroyBody(body1);
		MainMenu.world.destroyBody(body2);
		MainMenu.world.destroyBody(monstre1.getBody());
		MainMenu.world.destroyBody(monstre2.getBody());
		MainMenu.world.destroyBody(monstre3.getBody());
		SousMapB1.isBody1Created = false;
		SousMapB1.isBody2Created = false;
		m1EstCr�e = false;
		m2EstCr�e = false;
		m3EstCr�e = false;
	}
	

	
}
