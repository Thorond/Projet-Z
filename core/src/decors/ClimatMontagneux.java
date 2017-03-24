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
import scenes.MainMenu;

public class ClimatMontagneux {
	
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
	
	public static Body createBodyPerso( String décor, String type, float x, float y){
		BodyDef bodyDef = new BodyDef();
		if ( type.equals("static")) bodyDef.type = BodyDef.BodyType.StaticBody;
		else if ( type.equals("kinematic")) bodyDef.type = BodyDef.BodyType.KinematicBody;
		else if ( type.equals("Dynamic")) bodyDef.type = BodyDef.BodyType.DynamicBody;
		
		if ( décor.equals("tronc") || décor.equals("grossePierre") 
				|| décor.equals("tonneau")) bodyDef.position.set((x+10)/MainMenu.PPM,(y+20)/MainMenu.PPM);
		else if (décor.equals("arbre")) bodyDef.position.set((x+10)/MainMenu.PPM,(y+30)/MainMenu.PPM);
		body = world.createBody(bodyDef);
		
		PolygonShape shape = new PolygonShape();
		if (décor.equals("tronc") ) shape.setAsBox((2 / 2)/MainMenu.PPM  +2, (2 / 2)/MainMenu.PPM+2);
		else if ( décor.equals("tonneau")) shape.setAsBox((10 / 2)/MainMenu.PPM +2 , (10 / 2)/MainMenu.PPM +2);
		else if (décor.equals("grossePierre")) shape.setAsBox((20 / 2)/MainMenu.PPM  +5, (20 / 2)/MainMenu.PPM + 5);
		else if (décor.equals("arbre")) shape.setAsBox((30 / 2)/MainMenu.PPM  , (60 / 2)/MainMenu.PPM);
		
		FixtureDef fixtureDef = new FixtureDef();
		fixtureDef.shape = shape;
		fixtureDef.density = 1;
		
		Fixture fixture = body.createFixture(fixtureDef);
		
		shape.dispose();
		
		return body;
	}

	
//	objets

	public static Texture emplacementBombe = new Texture("climatMontagneux/emplacementBombe.png");
	public static Texture crate = new Texture("climatMontagneux/Crate.png");
	public static Texture igloo = new Texture("climatMontagneux/Igloo.png");
	public static Texture tree = new Texture("climatMontagneux/Tree.png");
	public static Texture buisson = new Texture("climatMontagneux/Bush.png");
	public static void buisson(boolean isCut,GameMain game, int x, int y ){
		if ( isCut == false) game.getBatch().draw(ClimatMontagneux.buisson, x, y);
	}
	public static Texture petitePierre = new Texture("climatMontagneux/stone1.png");
	public static void petitePierre(boolean isCut,GameMain game, int x, int y ){
		if ( isCut == false) game.getBatch().draw(ClimatMontagneux.petitePierre, x, y);
	}
	public static Texture grossePierre = new Texture("climatMontagneux/stone2.png");
	public static Texture tronc = new Texture("climatMontagneux/ChoppedTree.png");
	public static Texture tonneau = new Texture("climatMontagneux/Barrel.png");
	public static Texture signTête = new Texture("climatMontagneux/signTête.png");
	
	public static Texture coffreBleuFermé = new Texture("climatMontagneux/coffreBleuFermé.png");
	public static Texture coffreBleuOuvert1 = new Texture("climatMontagneux/coffreBleuOuvert1.png");
	public static Texture coffreBleuOuvert2 = new Texture("climatMontagneux/coffreBleuOuvert2.png");
	public static Texture coffreBleuOuvert3 = new Texture("climatMontagneux/coffreBleuOuvert3.png");
	
	public static void annimationCoffre( GameMain game){
		
	}
	
	public static Texture fourure1 = new Texture("climatMontagneux/fourure1.png");
	public static Texture fourure2 = new Texture("climatMontagneux/fourure2.png");
	
	public static Texture torche1 = new Texture("Divers/torche1.png");
	public static Texture torche2 = new Texture("Divers/torche2.png");
	public static Texture torche3 = new Texture("Divers/torche3.png");
	
	public static void annimationTorche(GameMain game, int x, int y){
//		j'ai laissé les même etat et le même boolean que pour l'igloo car il est très peu probable que l'on mette les grosses en même temps
//		que les petites
		if ( ! ( etatTorche1 ) && ! ( etatTorche2 ) ) game.getBatch().draw(torche2,x,y);
		else if ( etatTorche1 && !(etatTorche2)) game.getBatch().draw(torche1,x,y);
		else if ( !(etatTorche1) && etatTorche2) game.getBatch().draw(torche3,x,y);
		else game.getBatch().draw(torche1,x,y);
		if ( System.currentTimeMillis() - annimationTorche > 200){
			if ( ! ( etatTorche1 ) && ! ( etatTorche2 ) ) etatTorche1 = true;
			else if ( etatTorche1 && !(etatTorche2)) {
				etatTorche2 = true;
				etatTorche1 = false;
			}
			else if ( !(etatTorche1) && etatTorche2) etatTorche1 = true;
			else {
				etatTorche1 = false;
				etatTorche2 = false;
			}
			annimationTorche = System.currentTimeMillis();
		}
	}

	
//	objets igloo 
	
	public static Texture tonneauIgloo = new Texture("climatMontagneux/BarrelIgloo.png");
	public static Texture caisseIgloo = new Texture("climatMontagneux/CrateIgloo.png");
	
	public static Texture torche1Igloo = new Texture("Divers/torche1Igloo.png");
	public static Texture torche2Igloo = new Texture("Divers/torche2Igloo.png");
	public static Texture torche3Igloo = new Texture("Divers/torche3Igloo.png");
	
	public static boolean etatTorche1 = false;
	public static boolean etatTorche2 = false;
	public static long annimationTorche = System.currentTimeMillis();
	
	public static void annimationTorcheIgloo(GameMain game, int x, int y){
		if ( ! ( etatTorche1 ) && ! ( etatTorche2 ) ) game.getBatch().draw(torche2Igloo,x,y);
		else if ( etatTorche1 && !(etatTorche2)) game.getBatch().draw(torche1Igloo,x,y);
		else if ( !(etatTorche1) && etatTorche2) game.getBatch().draw(torche3Igloo,x,y);
		else game.getBatch().draw(torche1Igloo,x,y);
		if ( System.currentTimeMillis() - annimationTorche > 200){
			if ( ! ( etatTorche1 ) && ! ( etatTorche2 ) ) etatTorche1 = true;
			else if ( etatTorche1 && !(etatTorche2)) {
				etatTorche2 = true;
				etatTorche1 = false;
			}
			else if ( !(etatTorche1) && etatTorche2) etatTorche1 = true;
			else {
				etatTorche1 = false;
				etatTorche2 = false;
			}
			annimationTorche = System.currentTimeMillis();
		}
	}
	
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
	
	public static Texture  bordGlacéDroi = new Texture("climatMontagneux/bordGlacéDroi.png");
	public static Texture  bordGlacéGau  = new Texture("climatMontagneux/bordGlacéGau.png");
	public static Texture  bordGlacéInf = new Texture("climatMontagneux/bordGlacéInf.png");
	public static Texture  bordGlacéSup = new Texture("climatMontagneux/bordGlacéSup.png");
	public static Texture  bordGlacéInfDroi= new Texture("climatMontagneux/bordGlacéInfDroi.png");
	public static Texture  bordGlacéInfGau = new Texture("climatMontagneux/bordGlacéInfGau.png");
	public static Texture  bordGlacéSupDroi = new Texture("climatMontagneux/bordGlacéSupDroi.png");
	public static Texture  bordGlacéSupGau= new Texture("climatMontagneux/bordGlacéSupGau.png");
	
	public static Texture  bordMerGlacéDroi= new Texture("climatMontagneux/bordMerGlacéDroi.png");
	public static Texture  bordMerGlacéGau= new Texture("climatMontagneux/bordMerGlacéGau.png");
	public static Texture  bordMerGlacéInf= new Texture("climatMontagneux/bordMerGlacéInf.png");
	public static Texture  bordMerGlacéSup= new Texture("climatMontagneux/bordMerGlacéSup.png");
	public static Texture  bordMerGlacéInfDroi= new Texture("climatMontagneux/bordMerGlacéInfDroi.png");
	public static Texture  bordMerGlacéInfGau= new Texture("climatMontagneux/bordMerGlacéInfGau.png");
	public static Texture  bordMerGlacéSupDroi= new Texture("climatMontagneux/bordMerGlacéSupDroi.png");
	public static Texture  bordMerGlacéSupGau= new Texture("climatMontagneux/bordMerGlacéSupGau.png");
	
	public static Texture  ciel= new Texture("climatMontagneux/ciel.png");
	public static Texture  escalierGlacé= new Texture("climatMontagneux/escalieGlacé.png");
	public static Texture  escalierHaut= new Texture("climatMontagneux/escalierHaut.png");
	public static Texture  glace1= new Texture("climatMontagneux/glace1.png");
	public static Texture  glace2= new Texture("climatMontagneux/glace2.png");
	
	public static Texture  merGlacéCassé1Sup= new Texture("climatMontagneux/merGlacéCassé1Sup.png");
	public static Texture  merGlacéCassé2Sup= new Texture("climatMontagneux/merGlacéCassé2Sup.png");
	public static Texture  merGlacéSup= new Texture("climatMontagneux/merGlacéSup.png");
	public static Texture  piedCassé1Sup= new Texture("climatMontagneux/piedCassé1Sup.png");
	public static Texture  piedCassé2Sup= new Texture("climatMontagneux/piedCassé2Sup.png");
	public static Texture  piedGlacéSup= new Texture("climatMontagneux/piedGlacéSup.png");
	
	public static Texture angleBasGauche = new Texture("climatMontagneux/angleBasGauche.png");
	
	public static Texture glaceFragmentée = new Texture("climatMontagneux/glaceFragmentée.png");
	public static Texture glaceFragmentéHautGauche = new Texture("climatMontagneux/glaceFragmentéHautGauche.png");
	public static Texture glaceFragmentéHautDroite = new Texture("climatMontagneux/glaceFragmentéeHautDroite.png");
	public static Texture glaceFragmentéBasGauche= new Texture("climatMontagneux/glaceFragmentéeBasGauche.png");
	public static Texture glaceFragmentéBasDroite= new Texture("climatMontagneux/glaceFragmentéeBasDroite.png");
	public static Texture morceauGlaceHautGauche = new Texture("climatMontagneux/morceauGlaceHautGauche.png");
	public static Texture morceauGlaceHautDroite = new Texture("climatMontagneux/morceauGlaceHautDroite.png");
	public static Texture morceauGlaceHaut = new Texture("climatMontagneux/morceauGlaceHaut.png");
	public static Texture morceauGlaceGauche = new Texture("climatMontagneux/morceauGlaceGauche.png");
	public static Texture petitMorceauGlaceGauche = new Texture("climatMontagneux/petitMorceauGlaceGauche.png");
	public static Texture morceauGlaceDroite= new Texture("climatMontagneux/morceauGlaceDroite.png");
	public static Texture morceauGlaceBasDroite = new Texture("climatMontagneux/morceauGlaceBasDroite.png");
	public static Texture morceauGlaceBasGauche = new Texture("climatMontagneux/morceauGlaceBasGauche.png");
	public static Texture morceauGlacéInf = new Texture("climatMontagneux/morceauGlacéInf.png");
	public static Texture bordGlaceFragmentée= new Texture("climatMontagneux/bordGlaceFragmentée.png");
	public static Texture bordGlaceFragmentéeBasDroite= new Texture("climatMontagneux/bordGlaceFragmentéeBasDroite.png");
	public static Texture bordGlaceFragmentéeBasGauche= new Texture("climatMontagneux/bordGlaceFragmentéeBasGauche.png");
	public static Texture bordSombreDroiteGlaceFragmentée= new Texture("climatMontagneux/bordSombreDroiteGlaceFragmentée.png");
	public static Texture bordSombreGaucheGlaceFragmentée= new Texture("climatMontagneux/bordSombreGaucheGlaceFragmentée.png");
	public static Texture bordSombreGlaceFragmentéeBasDroite= new Texture("climatMontagneux/bordSombreGlaceFragmentéeBasDroite.png");
	public static Texture bordSombreGlaceFragmentéeBasGauche= new Texture("climatMontagneux/bordSombreGlaceFragmentéeBasGauche.png");
	
	public static Texture murEauGlacéCentre= new Texture("climatMontagneux/murEauGlacéCentre.png");
	public static Texture murEauGlacéDroite= new Texture("climatMontagneux/murEauGlacéDroite.png");
	public static Texture murEauGlacéGauche= new Texture("climatMontagneux/murEauGlacéGauche.png");
	public static Texture murGlacéCentre= new Texture("climatMontagneux/murGlacéCentre.png");
	public static Texture murGlacéDroite= new Texture("climatMontagneux/murGlacéDroite.png");
	public static Texture murGlacéGauche= new Texture("climatMontagneux/murGlacéGauche.png");
	public static Texture murSombreGlacéCentre= new Texture("climatMontagneux/murSombreGlacéCentre.png");
	public static Texture murSombreGlacéCentre2= new Texture("climatMontagneux/murSombreGlacéCentre2.png");
	public static Texture murSombreGlacéDroite= new Texture("climatMontagneux/murSombreGlacéDroite.png");
	public static Texture murSombreGlacéDroite2= new Texture("climatMontagneux/murSombreGlacéDroite2.png");
	public static Texture murSombreGlacéDroite3= new Texture("climatMontagneux/murSombreGlacéDroite3.png");
	public static Texture murSombreGlacéGauche= new Texture("climatMontagneux/murSombreGlacéGauche.png");
	public static Texture murSombreGlacéGauche2= new Texture("climatMontagneux/murSombreGlacéGauche2.png");
	public static Texture murSombreGlacéGauche3= new Texture("climatMontagneux/murSombreGlacéGauche3.png");
	
	public static Texture cheminGlace = new Texture("climatMontagneux/cheminGlace.png");
	public static Texture cheminGlaceHori = new Texture("climatMontagneux/cheminGlaceHori.png");
	public static Texture cheminGlaceBas = new Texture("climatMontagneux/cheminGlaceBas.png");
	public static Texture cheminGlaceHautDroit= new Texture("climatMontagneux/cheminGlaceHautDroit.png");
	public static Texture cheminGlaceHautGauche = new Texture("climatMontagneux/cheminGlaceHautGauche.png");
	
//	public static Texture = new Texture("climatMontagneux/.png");
	
	public static Texture icebergWater = new Texture("climatMontagneux/iceBergWater.png");
	
	
//	eau de mer 
	public static Texture eauProfondeGlacée = new Texture("climatMontagneux/eauProfondeGlacée.png");
	public static Texture eauProfondeGlacée2 = new Texture("climatMontagneux/eauProfondeGlacée2.png");
	
	public static boolean etat1 = false;
	public static long startEau = System.currentTimeMillis();

	public static void setDamageEau(MainCharacter cha) {
		cha.setHealth(cha.getHealth() - 2 );
		if (cha.getHealth() > 0){
			if ( cha.getDirection().equals("bas")) cha.getBody().setTransform(cha.getBody().getPosition().x, cha.getBody().getPosition().y + 30, 0);
			else if ( cha.getDirection().equals("haut")) cha.getBody().setTransform(cha.getBody().getPosition().x, cha.getBody().getPosition().y - 30, 0);
			else if ( cha.getDirection().equals("droite")) cha.getBody().setTransform(cha.getBody().getPosition().x -30, cha.getBody().getPosition().y , 0);
			else if ( cha.getDirection().equals("gauche")) cha.getBody().setTransform(cha.getBody().getPosition().x +30, cha.getBody().getPosition().y , 0);
		}
		
	}
	
	public static void eauProfondeGlacée(GameMain game, int x, int y){
		if ( etat1 == false ) game.getBatch().draw(eauProfondeGlacée, x, y);
		else game.getBatch().draw(eauProfondeGlacée2, x, y);		
		if ( System.currentTimeMillis() - startEau > 500){
			startEau = System.currentTimeMillis();
			if ( etat1 == false ) etat1=true;
			else etat1=false;
		}
		
	}
	
//	eau derivière
	public static Texture eauProfonde = new Texture("map/eauProfonde2.png");
	public static Texture eauProfonde2 = new Texture("map/eauProfonde3.png");
	
	public static boolean etat2 = false;
	public static long startEau2 = System.currentTimeMillis();
	
	public static boolean etat3 = false;
	public static long startEau3 = System.currentTimeMillis();
	
	public static boolean etat4 = false;
	public static long startEau4 = System.currentTimeMillis();

	public static void eauProfonde(GameMain game, int x, int y){
		if ( etat2 == false ) game.getBatch().draw(eauProfonde, x, y);
		else game.getBatch().draw(eauProfonde2, x, y);		
		if ( System.currentTimeMillis() - startEau2 > 1000){
			startEau2 = System.currentTimeMillis();
			if ( etat2 == false ) etat2=true;
			else etat2=false;
		}
		
	}
	
	public static void eauProfonde150(GameMain game, int x, int y){
		if ( etat3 == false ) game.getBatch().draw(eauProfonde, x, y);
		else game.getBatch().draw(eauProfonde2, x, y);		
		if ( System.currentTimeMillis() - startEau3 > 150){
			startEau3 = System.currentTimeMillis();
			if ( etat3 == false ) etat3=true;
			else etat3=false;
		}
		
	}
	
	public static void eauProfonde300(GameMain game, int x, int y){
		if ( etat4 == false ) game.getBatch().draw(eauProfonde, x, y);
		else game.getBatch().draw(eauProfonde2, x, y);		
		if ( System.currentTimeMillis() - startEau4 > 300){
			startEau4 = System.currentTimeMillis();
			if ( etat4 == false ) etat4=true;
			else etat4=false;
		}
		
	}
	
//	cascade 
	
	public static Texture cascade1 = new Texture("map/cascade1.png");
	public static Texture cascade2 = new Texture("map/cascade2.png");
	public static Texture cascade3 = new Texture("map/cascade3.png");
	public static Texture cascade4 = new Texture("map/cascade4.png");
	
	public static int etatCascade = 1;
	public static long variationCascade = System.currentTimeMillis();
	
	public static void annimationCascade(GameMain game, int x, int y){
		if (etatCascade == 1) game.getBatch().draw(cascade1, x+2, y);
		else if (etatCascade == 2) game.getBatch().draw(cascade2, x, y);
		else if (etatCascade == 3) game.getBatch().draw(cascade3, x, y);
		else if (etatCascade == 4) game.getBatch().draw(cascade4, x, y);
		if ( System.currentTimeMillis() - variationCascade > 150){
			variationCascade = System.currentTimeMillis();
			if (etatCascade == 1) etatCascade = 2;
			else if (etatCascade == 2) etatCascade = 3;
			else if (etatCascade == 3) etatCascade = 4;
			else if (etatCascade == 4) etatCascade = 1;
		}
	}
	
//	trou
	
	public static void setDamageTrou(MainCharacter cha) {
		// TODO Auto-generated method stub
		cha.setHealth(cha.getHealth() - 5 );
		if (cha.getHealth() > 0){
			if ( cha.getDirection().equals("bas")) cha.getBody().setTransform(cha.getBody().getPosition().x, cha.getBody().getPosition().y + 30, 0);
			else if ( cha.getDirection().equals("haut")) cha.getBody().setTransform(cha.getBody().getPosition().x, cha.getBody().getPosition().y - 30, 0);
			else if ( cha.getDirection().equals("droite")) cha.getBody().setTransform(cha.getBody().getPosition().x -30, cha.getBody().getPosition().y , 0);
			else if ( cha.getDirection().equals("gauche")) cha.getBody().setTransform(cha.getBody().getPosition().x +30, cha.getBody().getPosition().y , 0);
		}
	}

}
