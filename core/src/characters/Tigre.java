package characters;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.physics.box2d.World;
import com.mygdx.game.GameMain;

import map.zoneGlace.PlacementMainZoneGlace;
import scenes.MainMenu;

public class Tigre extends Pnj{
	
	public long start = System.currentTimeMillis();
	
	public int textBas = 0;
	public static Texture tigreBas1 = new Texture("monstres/tigre/tigreBas1.png");
	public static Texture tigreBas2 = new Texture("monstres/tigre/tigreBas2.png");
	public static Texture tigreBas3 = new Texture("monstres/tigre/tigreBas3.png");
	public int textGauche = 0;
	public static Texture tigreGauche1 = new Texture("monstres/tigre/tigreGauche1.png");
	public static Texture tigreGauche2 = new Texture("monstres/tigre/tigreGauche2.png");
	public static Texture tigreGauche3 = new Texture("monstres/tigre/tigreGauche3.png");
	public int textHaut = 0;
	public static Texture tigreHaut1 = new Texture("monstres/tigre/tigreHaut1.png");
	public static Texture tigreHaut2 = new Texture("monstres/tigre/tigreHaut2.png");
	public static Texture tigreHaut3 = new Texture("monstres/tigre/tigreHaut3.png");
	public int textDroite = 0;
	public static Texture tigreDroite1 = new Texture("monstres/tigre/tigreDroite1.png");
	public static Texture tigreDroite2 = new Texture("monstres/tigre/tigreDroite2.png");
	public static Texture tigreDroite3 = new Texture("monstres/tigre/tigreDroite3.png");
	

	public static Texture tigrePiège = new Texture("monstres/tigre/tigrePiège.png");

	public static Tigre tigre;
	public static boolean tigreCrée = false ;
	
	public Tigre(World world,Texture text, float x, float y, String direction) {
		super(world,text, 100, 100, 100, x, y, direction);
	}
	
	@Override
	public void déplacementVersJoueur(){
		if ( PlacementMainZoneGlace.défilement ) this.getBody().setTransform(MainMenu.Link.getBody().getPosition().x,MainMenu.Link.getBody().getPosition().y, 0);
		else {
			if ( this.getX() - MainMenu.Link.getX() > 50 ){
				this.getBody().applyLinearImpulse(new Vector2(-30000f,0), this.getBody().getWorldCenter(), true);
				this.setDirection("gauche");
			}
			else if (this.getX() - MainMenu.Link.getX() < -70 ){
				this.getBody().applyLinearImpulse(new Vector2(+30000f,0), this.getBody().getWorldCenter(), true);
				this.setDirection("droite");
			} else {
				this.getBody().setLinearVelocity( new Vector2(0,this.getBody().getLinearVelocity().y));
			}
			if (this.getY() - MainMenu.Link.getY() > 50){
				this.getBody().applyLinearImpulse(new Vector2(0,-30000f), this.getBody().getWorldCenter(), true);
				this.setDirection("bas");
			}
			else if (this.getY() - MainMenu.Link.getY() < -70){
				this.getBody().applyLinearImpulse(new Vector2(0,+30000f), this.getBody().getWorldCenter(), true);
				this.setDirection("haut");
			}  else {
				this.getBody().setLinearVelocity( new Vector2(this.getBody().getLinearVelocity().x,0));
			}
			if ( this.getBody().getLinearVelocity().x == 0 && this.getBody().getLinearVelocity().y == 0 ) arrét = true;
			else arrét = false;
		}
	}
	
	public void mouvement(){
		if (this.getDirection().equals("gauche")){
			if ( System.currentTimeMillis() - this.start > 250) {
				if (this.arrét ){
					this.setTexture(tigreGauche2);
				} else {
					if (textGauche == 0  ) {
						this.setTexture(tigreGauche1);
						this.textGauche = 1;
					} else if ( textGauche == 1){
						this.setTexture(tigreGauche3);
						this.textGauche = 2;
					} else if ( textGauche == 2){
						this.setTexture(tigreGauche2);
						this.textGauche = 0;
					} 
					this.start = System.currentTimeMillis();
				}
			} 
		}
		else if (this.getDirection().equals("droite")){
			if ( System.currentTimeMillis() - this.start > 250) {
				if (this.arrét){
					this.setTexture(tigreDroite2);
				} else {
					if (textDroite == 0  ) {
						this.setTexture(tigreDroite1);
						this.textDroite = 1;
					} else if ( textDroite == 1){
						this.setTexture(tigreDroite3);
						this.textDroite = 2;
					} else if ( textDroite == 2){
						this.setTexture(tigreDroite2);
						this.textDroite = 0;
					} 
					this.start = System.currentTimeMillis();
				}
			}
		}
		else if (this.getDirection().equals("haut")){
			if ( System.currentTimeMillis() - this.start > 250) {
				if (this.arrét){
					this.setTexture(tigreHaut2);
				} else {
					if (textHaut == 0  ) {
						this.setTexture(tigreHaut1);
						this.textHaut = 1;
					} else if ( textHaut == 1){
						this.setTexture(tigreHaut3);
						this.textHaut = 2;
					} else if ( textHaut == 2){
						this.setTexture(tigreHaut2);
						this.textHaut = 0;
					} 
					this.start = System.currentTimeMillis();
				}
			}
		}
		else if (this.getDirection().equals("bas")){
			if ( System.currentTimeMillis() - this.start > 250) {
				if (this.arrét){
					this.setTexture(tigreBas2);
				} else {
					if (textBas == 0  ) {
						this.setTexture(tigreBas1);
						this.textBas = 1;
					} else if ( textBas == 1){
						this.setTexture(tigreBas3);
						this.textBas = 2;
					} else if ( textBas == 2){
						this.setTexture(tigreBas2);
						this.textBas = 0;
					} 
					this.start = System.currentTimeMillis();
				}
			}
		}
	}
	
	public void représentation(GameMain game){
		if ( tigreCrée && tigre.isAlive() ) { 
			game.getBatch().draw(tigre,tigre.getX(), tigre.getY());
		}
	}
	
	public static void destroyBody() {
		// TODO Auto-generated method stub
//		destruction monstres
		if ( tigreCrée )MainMenu.world.destroyBody(tigre.getBody());
		tigreCrée = false;
	}

	public static void createBody(World world) {
//		========================================================================================
		//		Création du corps du tigre
		//========================================================================================
		
		
		
		if ( tigreCrée == false ) {
			tigre = new Tigre(world ,Tigre.tigreBas2, MainMenu.Link.getX() , MainMenu.Link.getY() , "bas") ;
			tigreCrée = true;
		} else {
			tigre.déplacementVersJoueur();
			tigre.mouvement();
			tigre.updateBody();
		}
	}
	
//	public static void représentation(GameMain game){
//		if (MainMenu.Link.getDirection().equals("gauche")){
//			if (MainMenu.Link.getBody().getLinearVelocity().x > -100  ){
//				game.getBatch().draw(tigreGauche2, MainMenu.Link.getX() +60 , MainMenu.Link.getY());
//			} else {
//				if (textGauche == 0  ) {
//					game.getBatch().draw(tigreGauche1, MainMenu.Link.getX() +60 , MainMenu.Link.getY());
//				} else if ( textGauche == 1){
//					game.getBatch().draw(tigreGauche3, MainMenu.Link.getX() +60 , MainMenu.Link.getY());
//				} else if ( textGauche == 2){
//					game.getBatch().draw(tigreGauche2, MainMenu.Link.getX() +60, MainMenu.Link.getY());
//				} 
//			}
//			if ( System.currentTimeMillis() - start > 250) {
//				if (textGauche == 0  ) {
//					textGauche = 1;
//				} else if ( textGauche == 1){
//					textGauche = 2;
//				} else if ( textGauche == 2){
//					textGauche = 0;
//				} 
//				start = System.currentTimeMillis();
//					
//			} 
//		}
//		else if (MainMenu.Link.getDirection().equals("droite")){
//			if (MainMenu.Link.getBody().getLinearVelocity().x < 100  ){
//				game.getBatch().draw(tigreDroite2, MainMenu.Link.getX() -90 , MainMenu.Link.getY());
//			} else {
//				if (textDroite == 0  ) {
//					game.getBatch().draw(tigreDroite1, MainMenu.Link.getX() -90 , MainMenu.Link.getY());
//				} else if ( textDroite == 1){
//					game.getBatch().draw(tigreDroite3, MainMenu.Link.getX() -90 , MainMenu.Link.getY());
//				} else if ( textDroite == 2){
//					game.getBatch().draw(tigreDroite2, MainMenu.Link.getX() -90, MainMenu.Link.getY());
//				} 
//			}
//			if ( System.currentTimeMillis() - start > 250) {
//				if (textDroite == 0  ) {
//					textDroite = 1;
//				} else if ( textDroite == 1){
//					textDroite = 2;
//				} else if ( textDroite == 2){
//					textDroite = 0;
//				} 
//				start = System.currentTimeMillis();
//					
//			} 
//		}
//		else if (MainMenu.Link.getDirection().equals("haut")){
//			if (MainMenu.Link.getBody().getLinearVelocity().y < 100  ){
//				game.getBatch().draw(tigreHaut2, MainMenu.Link.getX()  , MainMenu.Link.getY() -90);
//			} else {
//				if (textHaut == 0  ) {
//					game.getBatch().draw(tigreHaut1, MainMenu.Link.getX() , MainMenu.Link.getY() -90);
//				} else if ( textHaut == 1){
//					game.getBatch().draw(tigreHaut3, MainMenu.Link.getX() , MainMenu.Link.getY() -90);
//				}
//			}
//			if ( System.currentTimeMillis() - start > 250) {
//				if (textHaut == 0  ) {
//					textHaut = 1;
//				} else if ( textHaut == 1){
//					textHaut = 0;
//				} 
//				start = System.currentTimeMillis();
//					
//			} 
//		}
//		else if (MainMenu.Link.getDirection().equals("bas")){
//			if (MainMenu.Link.getBody().getLinearVelocity().y > -100  ){
//				game.getBatch().draw(tigreBas2, MainMenu.Link.getX()  , MainMenu.Link.getY() +60);
//			} else {
//				if (textBas == 0  ) {
//					game.getBatch().draw(tigreBas1, MainMenu.Link.getX() , MainMenu.Link.getY() +60);
//				} else if ( textBas == 1){
//					game.getBatch().draw(tigreBas3, MainMenu.Link.getX() , MainMenu.Link.getY() +60);
//				}
//			}
//			if ( System.currentTimeMillis() - start > 250) {
//				if (textBas == 0  ) {
//					textBas = 1;
//				} else if ( textBas == 1){
//					textBas = 0;
//				} 
//				start = System.currentTimeMillis();
//					
//			} 
//		}
//	}
}
