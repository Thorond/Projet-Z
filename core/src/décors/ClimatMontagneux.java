package décors;

import com.badlogic.gdx.graphics.Texture;
import com.mygdx.game.GameMain;

import characters.MainCharacter;

public class ClimatMontagneux {
	
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
	public static Texture  glace1= new Texture("climatMontagneux/glace1.png");
	public static Texture  glace2= new Texture("climatMontagneux/glace2.png");
	
	public static Texture  merGlacéCassé1Sup= new Texture("climatMontagneux/merGlacéCassé1Sup.png");
	public static Texture  merGlacéCassé2Sup= new Texture("climatMontagneux/merGlacéCassé2Sup.png");
	public static Texture  merGlacéSup= new Texture("climatMontagneux/merGlacéSup.png");
	public static Texture  piedCassé1Sup= new Texture("climatMontagneux/piedCassé1Sup.png");
	public static Texture  piedCassé2Sup= new Texture("climatMontagneux/piedCassé2Sup.png");
	public static Texture  piedGlacéSup= new Texture("climatMontagneux/piedGlacéSup.png");
	
	public static Texture glaceFragmentée = new Texture("climatMontagneux/glaceFragmentée.png");
	public static Texture glaceFragmentéHautGauche = new Texture("climatMontagneux/glaceFragmentéHautGauche.png");
	public static Texture morceauGlaceHautGauche = new Texture("climatMontagneux/morceauGlaceHautGauche.png");
	public static Texture morceauGlaceHaut = new Texture("climatMontagneux/morceauGlaceHaut.png");
	public static Texture morceauGlaceGauche = new Texture("climatMontagneux/morceauGlaceGauche.png");
	
	public static Texture icebergWater = new Texture("climatMontagneux/iceBergWater.png");
	
	
//	eau
	public static Texture eauProfondeGlacée = new Texture("climatMontagneux/eauProfondeGlacée.png");
	public static Texture eauProfondeGlacée2 = new Texture("climatMontagneux/eauProfondeGlacée2.png");
	
	public static boolean etat1 = false;
	public static long startEau = System.currentTimeMillis();

	public static void setDamage(MainCharacter cha) {
		cha.setHealth(cha.getHealth() - 2 );
		if ( cha.getDirection().equals("bas")) cha.getBody().setTransform(cha.getBody().getPosition().x, cha.getBody().getPosition().y + 60, 0);
		else if ( cha.getDirection().equals("haut")) cha.getBody().setTransform(cha.getBody().getPosition().x, cha.getBody().getPosition().y - 60, 0);
		else if ( cha.getDirection().equals("droite")) cha.getBody().setTransform(cha.getBody().getPosition().x -60, cha.getBody().getPosition().y , 0);
		else if ( cha.getDirection().equals("gauche")) cha.getBody().setTransform(cha.getBody().getPosition().x +60, cha.getBody().getPosition().y , 0);
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

}
