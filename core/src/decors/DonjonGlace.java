package decors;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.physics.box2d.Body;
import com.badlogic.gdx.physics.box2d.BodyDef;
import com.badlogic.gdx.physics.box2d.Fixture;
import com.badlogic.gdx.physics.box2d.FixtureDef;
import com.badlogic.gdx.physics.box2d.PolygonShape;
import com.badlogic.gdx.physics.box2d.World;
import com.mygdx.game.GameMain;

import scenes.MainMenu;

public class DonjonGlace {
	
	public static World world = MainMenu.world;
	public static Body body;
	
	public static Body createBody(float x, float y,  int largeur, int taille){
		BodyDef bodyDef = new BodyDef();
		bodyDef.type = BodyDef.BodyType.StaticBody;
		bodyDef.position.set(x/MainMenu.PPM,y/MainMenu.PPM);
		body = world.createBody(bodyDef);
		
		PolygonShape shape = new PolygonShape();
		shape.setAsBox(largeur / (2*MainMenu.PPM)  , taille / (2*MainMenu.PPM));
		
		FixtureDef fixtureDef = new FixtureDef();
		fixtureDef.shape = shape;
		fixtureDef.density = 1;
		
		Fixture fixture = body.createFixture(fixtureDef);
		
		shape.dispose();
		
		return body;
	}
	
//	clé
	

	public static Texture  CléEntière= new Texture("donjon/donjonGlace/clé/CléEntière.png");
	public static Texture  CléEntièreVide= new Texture("donjon/donjonGlace/clé/CléEntièreVide.png");
	public static Texture  CléBasse= new Texture("donjon/donjonGlace/clé/CléBasse.png");
	public static Texture  CléMilieu= new Texture("donjon/donjonGlace/clé/CléMilieu.png");
	public static Texture  CléHaute= new Texture("donjon/donjonGlace/clé/HautClé.png");
	public static boolean isCléBasseTrouvé = false; // à sauvegarder 
	public static boolean isCléHauteTrouvé = false; // à sauvegarder 
	public static boolean isCléMilieuTrouvé = false; // à sauvegarder 
	
//	tile

	public static boolean transitionGate = true;
	public static int variationX = 0;
	public static int variationY = 0;
	public static long changementVariation = System.currentTimeMillis();
	
	public static int ouvertureGate = -1;
	public static long changementOuverture = System.currentTimeMillis();
	public static Texture  gate2Fermé = new Texture("donjon/donjonGlace/gate2Fermé.png");
	public static Texture  gate2Ouvert1 = new Texture("donjon/donjonGlace/gate2Ouvert1.png");
	public static Texture  gate2Ouvert2 = new Texture("donjon/donjonGlace/gate2Ouvert2.png");
	
	public static void annimationOuvertureGate(GameMain game, int x, int y){
		if ( transitionGate ) {
			if ( ouvertureGate == 0 ) game.getBatch().draw(DonjonGlace.gate2Fermé, 540 + variationX + x, 185 + variationY + y);
			else if ( ouvertureGate == 1 ) game.getBatch().draw(DonjonGlace.gate2Ouvert1, 533 + variationX + x, 165 + variationY + y);
			else if ( ouvertureGate == 2 ) game.getBatch().draw(DonjonGlace.gate2Ouvert2, 527 + variationX + x, 147 + variationY + y);
			else if ( ouvertureGate == 3 ) {
				transitionGate = false;
				variationX = 0;
				variationY = 0;
			}
		}
		if (System.currentTimeMillis() - changementOuverture > 4000 ){
			if ( ouvertureGate == -1 ) ouvertureGate = 0;
			else if ( ouvertureGate == 0 ) ouvertureGate = 1;
			else if ( ouvertureGate == 1 ) ouvertureGate = 2;
			else if ( ouvertureGate == 2 ) ouvertureGate = 3;
			changementOuverture = System.currentTimeMillis();
		}
		if (System.currentTimeMillis() - changementVariation > 100 ){
			double aléaX = Math.random();
			if ( aléaX > 0.5 ){
				if ( variationX < 2  ) variationX += 1 ;
			}else {
				if ( variationX > -2  ) variationX -= 1;
			}
			double aléaY = Math.random();
			if ( aléaY > 0.5 ){
				if ( variationY < 2  ) variationY += 1 ;
			}else {
				if ( variationY > -2  ) variationY -= 1;
			}
			changementVariation = System.currentTimeMillis();
		}
	}
	

	public static Texture  murVertical = new Texture("donjon/donjonGlace/murVertical.png");
	public static Texture  murHorizontal = new Texture("donjon/donjonGlace/murHorizontal.png");

}
