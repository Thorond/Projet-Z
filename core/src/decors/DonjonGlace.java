package decors;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.physics.box2d.Body;
import com.badlogic.gdx.physics.box2d.BodyDef;
import com.badlogic.gdx.physics.box2d.Fixture;
import com.badlogic.gdx.physics.box2d.FixtureDef;
import com.badlogic.gdx.physics.box2d.PolygonShape;
import com.badlogic.gdx.physics.box2d.World;
import com.mygdx.game.GameMain;

import characters.MainCharacter;
import map.zoneGlace.DonjonSalle3;
import map.zoneGlace.PlacementMainZoneGlace;
import map.zoneGlace.SousMapH2;
import scenes.MainMenu;
import sun.applet.Main;

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
	public static Texture  texteClé= new Texture("texte/divers/texteClé.png");


	public static Texture  serrure= new Texture("donjon/donjonGlace/serrure.png");

    public static void détectionSerrure(MainCharacter Link){
        if ( Link.getBody().getPosition().x * MainMenu.PPM > 410
                && Link.getBody().getPosition().x * MainMenu.PPM < 450
                && Link.getBody().getPosition().y * MainMenu.PPM > 220){
            if ( ouvertureGrille == -1  && isCléBasseTrouvé && isCléHauteTrouvé
                    && isCléMilieuTrouvé && Link.getDirection().equals("haut")) ouvertureGrille = 0;
        }
    }

//	clé du boss

	public static boolean isCléBossRécupérée = false ; // à sauvegarder
	public static Texture cléBoss = new Texture("donjon/donjonGlace/cléBoss.png");
    public static Texture texteCléBoss = new Texture("donjon/donjonGlace/texteCléBoss.png");
    public static boolean ouverturePorteBoss = false; // à sauvegarder

    public static void détectionSerrureBoss(MainCharacter Link){
        if ( ! PlacementMainZoneGlace.défilement && ! ouverturePorteBoss
                && Link.getBody().getPosition().x * MainMenu.PPM < 70
                && Link.getBody().getPosition().y * MainMenu.PPM < 300
                && Link.getBody().getPosition().y * MainMenu.PPM > 180){
            if ( isCléBossRécupérée && Link.getDirection().equals("gauche")) {
                ouverturePorteBoss = true;
                DonjonSalle3.destroyBody();
            }
        }
    }



	public static Texture  murGlacéPorte1 = new Texture("donjon/donjonGlace/murGlacéPorte1.png");
	public static Texture  murGlacéPorte2 = new Texture("donjon/donjonGlace/murGlacéPorte2.png");
	public static Texture  murGlacéPorte3 = new Texture("donjon/donjonGlace/murGlacéPorte3.png");
	public static Texture  murGlacéPorte4 = new Texture("donjon/donjonGlace/murGlacéPorte4.png");

    public static boolean transitionGrille = false; //

    public static int ouvertureGrille = -1; // à sauvegarder ( -1 à la base , 4 si on veut que ça soit déjà ouvert)
    public static long changementOuvertureGrille = System.currentTimeMillis();

    public static void annimationOuvertureGrille(GameMain game, int x, int y){
        if ( transitionGrille ) {
            if ( ouvertureGrille == 0 ) game.getBatch().draw(DonjonGlace.murGlacéPorte1, 480 + x, 240 + y);
            else if ( ouvertureGrille == 1 ) game.getBatch().draw(DonjonGlace.murGlacéPorte2, 480 + x, 240 + y);
            else if ( ouvertureGrille == 2 ) game.getBatch().draw(DonjonGlace.murGlacéPorte3, 480 + x, 240 + y);
            else if ( ouvertureGrille == 3 ) game.getBatch().draw(DonjonGlace.murGlacéPorte4, 480 + x, 240 + y);
            else if ( ouvertureGrille == 4 ) {
                transitionGrille = false;
            }
        }
        if (System.currentTimeMillis() - changementOuvertureGrille > 3000 ){
            if ( ouvertureGrille == -1 ) ouvertureGrille = 0;
            else if ( ouvertureGrille == 0 ) ouvertureGrille = 1;
            else if ( ouvertureGrille == 1 ) ouvertureGrille = 2;
            else if ( ouvertureGrille == 2 ) {
                ouvertureGrille = 3;
                SousMapH2.destroyBody();
            }
            else if ( ouvertureGrille == 3 ) ouvertureGrille = 4;
            else if ( ouvertureGrille == 4 ) ouvertureGrille = 5;
            changementOuvertureGrille = System.currentTimeMillis();
        }
    }
//

	public static Texture  ombreGlobale = new Texture("donjon/donjonGlace/ombreGlobale.png");
	public static Texture  ombreGlobaleDiminué = new Texture("donjon/donjonGlace/ombreGlobaleDiminué.png");

    public static Texture  flag1 = new Texture("donjon/donjonGlace/flag/flag1.png");
    public static Texture  flag2 = new Texture("donjon/donjonGlace/flag/flag2.png");
    public static Texture  flag3 = new Texture("donjon/donjonGlace/flag/flag3.png");
    public static Texture  flag4 = new Texture("donjon/donjonGlace/flag/flag4.png");
    public static Texture  flag5 = new Texture("donjon/donjonGlace/flag/flag5.png");

    public static long timerFlag = System.currentTimeMillis();
    public static int étatFlag = 0;

    public static void annimationFlag(GameMain game, int x, int y){
        if (étatFlag == 0) game.getBatch().draw(flag1, x , y);
        else if (étatFlag == 1) game.getBatch().draw(flag2, x , y);
        else if (étatFlag == 2) game.getBatch().draw(flag3, x , y);
        else if (étatFlag == 3) game.getBatch().draw(flag4, x , y);
        else if (étatFlag == 4) game.getBatch().draw(flag5, x , y);
        if ( System.currentTimeMillis() - timerFlag > 300 ){
            if (étatFlag == 0) étatFlag ++ ;
            else if (étatFlag == 1) étatFlag ++;
            else if (étatFlag == 2) étatFlag ++;
            else if (étatFlag == 3) étatFlag ++;
            else if (étatFlag == 4) étatFlag = 0;
            timerFlag = System.currentTimeMillis();
        }
    }
	
//	tile

	public static boolean transitionGate = true; // à sauvegarder
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

//    *********carte**********
    public static boolean carteTrouvé = false; // à sauvegarder

    public static Texture  scroll = new Texture("donjon/donjonGlace/scroll.png");
    public static Texture  texteScroll = new Texture("donjon/donjonGlace/texteScroll.png");
    public static Texture  carteDonjon = new Texture("donjon/donjonGlace/carteDonjon.png");

}
