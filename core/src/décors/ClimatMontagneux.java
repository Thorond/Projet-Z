package d�cors;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.physics.box2d.Body;
import com.badlogic.gdx.physics.box2d.BodyDef;
import com.badlogic.gdx.physics.box2d.Fixture;
import com.badlogic.gdx.physics.box2d.FixtureDef;
import com.badlogic.gdx.physics.box2d.PolygonShape;
import com.badlogic.gdx.physics.box2d.World;
import com.mygdx.game.GameMain;

import characters.MainCharacter;
import map.Map;
import scenes.MainMenu;

public class ClimatMontagneux {
	
	public static World world = MainMenu.world;
	public static Body body;
	
	public static Body createBody(float x, float y,  int largeur, int taille){
		BodyDef bodyDef = new BodyDef();
		bodyDef.type = BodyDef.BodyType.StaticBody;
		bodyDef.position.set(x,y);
		body = world.createBody(bodyDef);
		
		PolygonShape shape = new PolygonShape();
		shape.setAsBox(largeur / 2  , taille / 2);
		
		FixtureDef fixtureDef = new FixtureDef();
		fixtureDef.shape = shape;
		fixtureDef.density = 1;
		
		Fixture fixture = body.createFixture(fixtureDef);
		
		shape.dispose();
		
		return body;
	}
	
	public static Body createBodyPerso( String d�cor, String type, float x, float y){
		BodyDef bodyDef = new BodyDef();
		if ( type.equals("static")) bodyDef.type = BodyDef.BodyType.StaticBody;
		else if ( type.equals("kinematic")) bodyDef.type = BodyDef.BodyType.KinematicBody;
		else if ( type.equals("Dynamic")) bodyDef.type = BodyDef.BodyType.DynamicBody;
		
		if ( d�cor.equals("tronc") || d�cor.equals("grossePierre") 
				|| d�cor.equals("tonneau")) bodyDef.position.set(x+10,y+20);
		else if (d�cor.equals("arbre")) bodyDef.position.set(x+10,y+30);
		body = world.createBody(bodyDef);
		
		PolygonShape shape = new PolygonShape();
		if (d�cor.equals("tronc") ) shape.setAsBox(2 / 2  , 2 / 2);
		else if ( d�cor.equals("tonneau")) shape.setAsBox(10 / 2  , 10 / 2);
		else if (d�cor.equals("grossePierre")) shape.setAsBox(20 / 2  , 20 / 2);
		else if (d�cor.equals("arbre")) shape.setAsBox(30 / 2  , 50 / 2);
		
		FixtureDef fixtureDef = new FixtureDef();
		fixtureDef.shape = shape;
		fixtureDef.density = 1;
		
		Fixture fixture = body.createFixture(fixtureDef);
		
		shape.dispose();
		
		return body;
	}

	
//	objets
	
	public static Texture crate = new Texture("climatMontagneux/Crate.png");
	public static Texture igloo = new Texture("climatMontagneux/Igloo.png");
	public static Texture tree = new Texture("climatMontagneux/Tree.png");
	public static Texture buisson = new Texture("climatMontagneux/Bush.png");
	public static void buisson(boolean isCut,GameMain game, int x, int y ){
		if ( isCut == false) game.getBatch().draw(ClimatMontagneux.buisson, x, y);
	}
	public static Texture petitePierre = new Texture("climatMontagneux/stone1.png");
	public static Texture grossePierre = new Texture("climatMontagneux/stone2.png");
	public static Texture tronc = new Texture("climatMontagneux/ChoppedTree.png");
	public static Texture tonneau = new Texture("climatMontagneux/Barrel.png");
	
//	tile
	public static Texture  arbreBasDroite = new Texture("climatMontagneux/arbreBasDroite.png");
	public static Texture  arbreBasGauche = new Texture("climatMontagneux/arbreBasGauche.png");
	public static Texture  arbreBasMilieu = new Texture("climatMontagneux/arbreBasMilieu.png");
	public static Texture  arbreCentreDroite = new Texture("climatMontagneux/arbreCentreDroite.png");
	public static Texture  arbreCentreGauche = new Texture("climatMontagneux/arbreCentreGauche.png");
	public static Texture  arbreCentreMilieu = new Texture("climatMontagneux/arbreCentreMilieu.png");
	public static Texture  arbreSommetDroite = new Texture("climatMontagneux/arbreSommetDroite.png");
	public static Texture  arbreSommetGauche = new Texture("climatMontagneux/arbreSommetGau.png");
	public static Texture  arbreSommetMilieu = new Texture("climatMontagneux/arbreSommetMilieu.png");
	
	public static Texture  bordGlac�Droi = new Texture("climatMontagneux/bordGlac�Droi.png");
	public static Texture  bordGlac�Gau  = new Texture("climatMontagneux/bordGlac�Gau.png");
	public static Texture  bordGlac�Inf = new Texture("climatMontagneux/bordGlac�Inf.png");
	public static Texture  bordGlac�Sup = new Texture("climatMontagneux/bordGlac�Sup.png");
	public static Texture  bordGlac�InfDroi= new Texture("climatMontagneux/bordGlac�InfDroi.png");
	public static Texture  bordGlac�InfGau = new Texture("climatMontagneux/bordGlac�InfGau.png");
	public static Texture  bordGlac�SupDroi = new Texture("climatMontagneux/bordGlac�SupDroi.png");
	public static Texture  bordGlac�SupGau= new Texture("climatMontagneux/bordGlac�SupGau.png");
	
	public static Texture  bordMerGlac�Droi= new Texture("climatMontagneux/bordMerGlac�Droi.png");
	public static Texture  bordMerGlac�Gau= new Texture("climatMontagneux/bordMerGlac�Gau.png");
	public static Texture  bordMerGlac�Inf= new Texture("climatMontagneux/bordMerGlac�Inf.png");
	public static Texture  bordMerGlac�Sup= new Texture("climatMontagneux/bordMerGlac�Sup.png");
	public static Texture  bordMerGlac�InfDroi= new Texture("climatMontagneux/bordMerGlac�InfDroi.png");
	public static Texture  bordMerGlac�InfGau= new Texture("climatMontagneux/bordMerGlac�InfGau.png");
	public static Texture  bordMerGlac�SupDroi= new Texture("climatMontagneux/bordMerGlac�SupDroi.png");
	public static Texture  bordMerGlac�SupGau= new Texture("climatMontagneux/bordMerGlac�SupGau.png");
	
	public static Texture  ciel= new Texture("climatMontagneux/ciel.png");
	public static Texture  escalierGlac�= new Texture("climatMontagneux/escalieGlac�.png");
	public static Texture  escalierHaut= new Texture("climatMontagneux/escalierHaut.png");
	public static Texture  glace1= new Texture("climatMontagneux/glace1.png");
	public static Texture  glace2= new Texture("climatMontagneux/glace2.png");
	
	public static Texture  merGlac�Cass�1Sup= new Texture("climatMontagneux/merGlac�Cass�1Sup.png");
	public static Texture  merGlac�Cass�2Sup= new Texture("climatMontagneux/merGlac�Cass�2Sup.png");
	public static Texture  merGlac�Sup= new Texture("climatMontagneux/merGlac�Sup.png");
	public static Texture  piedCass�1Sup= new Texture("climatMontagneux/piedCass�1Sup.png");
	public static Texture  piedCass�2Sup= new Texture("climatMontagneux/piedCass�2Sup.png");
	public static Texture  piedGlac�Sup= new Texture("climatMontagneux/piedGlac�Sup.png");
	
	public static Texture angleBasGauche = new Texture("climatMontagneux/angleBasGauche.png");
	
	public static Texture glaceFragment�e = new Texture("climatMontagneux/glaceFragment�e.png");
	public static Texture glaceFragment�HautGauche = new Texture("climatMontagneux/glaceFragment�HautGauche.png");
	public static Texture glaceFragment�HautDroite = new Texture("climatMontagneux/glaceFragment�eHautDroite.png");
	public static Texture glaceFragment�BasGauche= new Texture("climatMontagneux/glaceFragment�eBasGauche.png");
	public static Texture glaceFragment�BasDroite= new Texture("climatMontagneux/glaceFragment�eBasDroite.png");
	public static Texture morceauGlaceHautGauche = new Texture("climatMontagneux/morceauGlaceHautGauche.png");
	public static Texture morceauGlaceHautDroite = new Texture("climatMontagneux/morceauGlaceHautDroite.png");
	public static Texture morceauGlaceHaut = new Texture("climatMontagneux/morceauGlaceHaut.png");
	public static Texture morceauGlaceGauche = new Texture("climatMontagneux/morceauGlaceGauche.png");
	public static Texture petitMorceauGlaceGauche = new Texture("climatMontagneux/petitMorceauGlaceGauche.png");
	public static Texture morceauGlaceDroite= new Texture("climatMontagneux/morceauGlaceDroite.png");
	public static Texture morceauGlaceBasDroite = new Texture("climatMontagneux/morceauGlaceBasDroite.png");
	public static Texture morceauGlaceBasGauche = new Texture("climatMontagneux/morceauGlaceBasGauche.png");
	public static Texture morceauGlac�Inf = new Texture("climatMontagneux/morceauGlac�Inf.png");
	public static Texture bordGlaceFragment�e= new Texture("climatMontagneux/bordGlaceFragment�e.png");
	public static Texture bordGlaceFragment�eBasDroite= new Texture("climatMontagneux/bordGlaceFragment�eBasDroite.png");
	public static Texture bordGlaceFragment�eBasGauche= new Texture("climatMontagneux/bordGlaceFragment�eBasGauche.png");
	public static Texture bordSombreDroiteGlaceFragment�e= new Texture("climatMontagneux/bordSombreDroiteGlaceFragment�e.png");
	public static Texture bordSombreGaucheGlaceFragment�e= new Texture("climatMontagneux/bordSombreGaucheGlaceFragment�e.png");
	public static Texture bordSombreGlaceFragment�eBasDroite= new Texture("climatMontagneux/bordSombreGlaceFragment�eBasDroite.png");
	public static Texture bordSombreGlaceFragment�eBasGauche= new Texture("climatMontagneux/bordSombreGlaceFragment�eBasGauche.png");
	
	public static Texture murEauGlac�Centre= new Texture("climatMontagneux/murEauGlac�Centre.png");
	public static Texture murEauGlac�Droite= new Texture("climatMontagneux/murEauGlac�Droite.png");
	public static Texture murEauGlac�Gauche= new Texture("climatMontagneux/murEauGlac�Gauche.png");
	public static Texture murGlac�Centre= new Texture("climatMontagneux/murGlac�Centre.png");
	public static Texture murGlac�Droite= new Texture("climatMontagneux/murGlac�Droite.png");
	public static Texture murGlac�Gauche= new Texture("climatMontagneux/murGlac�Gauche.png");
	public static Texture murSombreGlac�Centre= new Texture("climatMontagneux/murSombreGlac�Centre.png");
	public static Texture murSombreGlac�Centre2= new Texture("climatMontagneux/murSombreGlac�Centre2.png");
	public static Texture murSombreGlac�Droite= new Texture("climatMontagneux/murSombreGlac�Droite.png");
	public static Texture murSombreGlac�Droite2= new Texture("climatMontagneux/murSombreGlac�Droite2.png");
	public static Texture murSombreGlac�Droite3= new Texture("climatMontagneux/murSombreGlac�Droite3.png");
	public static Texture murSombreGlac�Gauche= new Texture("climatMontagneux/murSombreGlac�Gauche.png");
	public static Texture murSombreGlac�Gauche2= new Texture("climatMontagneux/murSombreGlac�Gauche2.png");
	public static Texture murSombreGlac�Gauche3= new Texture("climatMontagneux/murSombreGlac�Gauche3.png");
	
	public static Texture cheminGlace = new Texture("climatMontagneux/cheminGlace.png");
	public static Texture cheminGlaceHori = new Texture("climatMontagneux/cheminGlaceHori.png");
	public static Texture cheminGlaceBas = new Texture("climatMontagneux/cheminGlaceBas.png");
	public static Texture cheminGlaceHautDroit= new Texture("climatMontagneux/cheminGlaceHautDroit.png");
	public static Texture cheminGlaceHautGauche = new Texture("climatMontagneux/cheminGlaceHautGauche.png");
	
//	public static Texture = new Texture("climatMontagneux/.png");
	
	public static Texture icebergWater = new Texture("climatMontagneux/iceBergWater.png");
	
	
//	eau
	public static Texture eauProfondeGlac�e = new Texture("climatMontagneux/eauProfondeGlac�e.png");
	public static Texture eauProfondeGlac�e2 = new Texture("climatMontagneux/eauProfondeGlac�e2.png");
	
	public static boolean etat1 = false;
	public static long startEau = System.currentTimeMillis();

	public static void setDamageEau(MainCharacter cha) {
		cha.setHealth(cha.getHealth() - 2 );
		if ( cha.getDirection().equals("bas")) cha.getBody().setTransform(cha.getBody().getPosition().x, cha.getBody().getPosition().y + 30, 0);
		else if ( cha.getDirection().equals("haut")) cha.getBody().setTransform(cha.getBody().getPosition().x, cha.getBody().getPosition().y - 30, 0);
		else if ( cha.getDirection().equals("droite")) cha.getBody().setTransform(cha.getBody().getPosition().x -30, cha.getBody().getPosition().y , 0);
		else if ( cha.getDirection().equals("gauche")) cha.getBody().setTransform(cha.getBody().getPosition().x +30, cha.getBody().getPosition().y , 0);
	}
	
	public static void eauProfondeGlac�e(GameMain game, int x, int y){
		if ( etat1 == false ) game.getBatch().draw(eauProfondeGlac�e, x, y);
		else game.getBatch().draw(eauProfondeGlac�e2, x, y);		
		if ( System.currentTimeMillis() - startEau > 500){
			startEau = System.currentTimeMillis();
			if ( etat1 == false ) etat1=true;
			else etat1=false;
		}
		
	}
	
//	trou
	
	public static void setDamageTrou(MainCharacter cha) {
		// TODO Auto-generated method stub
		cha.setHealth(cha.getHealth() - 5 );
		if ( cha.getDirection().equals("bas")) cha.getBody().setTransform(cha.getBody().getPosition().x, cha.getBody().getPosition().y + 30, 0);
		else if ( cha.getDirection().equals("haut")) cha.getBody().setTransform(cha.getBody().getPosition().x, cha.getBody().getPosition().y - 30, 0);
		else if ( cha.getDirection().equals("droite")) cha.getBody().setTransform(cha.getBody().getPosition().x -30, cha.getBody().getPosition().y , 0);
		else if ( cha.getDirection().equals("gauche")) cha.getBody().setTransform(cha.getBody().getPosition().x +30, cha.getBody().getPosition().y , 0);
	}

}
