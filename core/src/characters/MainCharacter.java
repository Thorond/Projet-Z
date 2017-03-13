package characters;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.physics.box2d.Body;
import com.badlogic.gdx.physics.box2d.BodyDef;
import com.badlogic.gdx.physics.box2d.Fixture;
import com.badlogic.gdx.physics.box2d.FixtureDef;
import com.badlogic.gdx.physics.box2d.PolygonShape;
import com.badlogic.gdx.physics.box2d.World;

import scenes.MainMenu;

public class MainCharacter extends Characters {

	public String direction;
	private World world;
	private Body body;
	public static Texture linkBasRepos = new Texture("Personnage/link1.png");
	public static boolean textBas1 = true;
	public static Texture linkBas1 = new Texture("Personnage/link.png");
	public static Texture linkBas2 = new Texture("Personnage/link2.png");
	public static Texture linkGaucheRepos = new Texture("Personnage/link4.png");
	public static boolean textGauche1 = true;
	public static Texture linkGauche1 = new Texture("Personnage/link3.png");
	public static Texture linkGauche2 = new Texture("Personnage/link5.png");
	public static Texture linkHautRepos = new Texture("Personnage/link10.png");
	public static boolean textHaut1 = true;
	public static Texture linkHaut1 = new Texture("Personnage/link11.png");
	public static Texture linkHaut2 = new Texture("Personnage/link9.png");
	public static Texture linkDroiteRepos = new Texture("Personnage/link7.png");
	public static boolean textDroite1 = true;
	public static Texture linkDroite1 = new Texture("Personnage/link8.png");
	public static Texture linkDroite2 = new Texture("Personnage/link6.png");
	
	public static Texture coeurPlein = new Texture("Divers/coeurPlein.png");
	public static Texture coeurMoitié = new Texture("Divers/coeur1-2.png");
	public static Texture coeurUnQuart = new Texture("Divers/coeur1-4.png");
	public static Texture coeurTroisQuart = new Texture("Divers/coeur3-4.png");
	
	public MainCharacter(World world, int HM, int health, int strength, float x, float y, String direction){
		super( world,linkBasRepos, HM, health, strength, x,  y, direction);
		this.world = world;
		createBody();
	}
	
//	==========================================================================
//	cette fonction permet de créer le corp solide de notre personnage
//	à l'aide d'une fonction de libGDX
//	==========================================================================
	
	void createBody(){
		BodyDef bodyDef = new BodyDef();
		bodyDef.type = BodyDef.BodyType.DynamicBody;
		bodyDef.position.set(getX()/MainMenu.PPM,getY()/MainMenu.PPM);
		body = world.createBody(bodyDef);
		
		PolygonShape shape = new PolygonShape();
		shape.setAsBox(getWidth() / (2*MainMenu.PPM) , getHeight() / (2*MainMenu.PPM));
		
		FixtureDef fixtureDef = new FixtureDef();
		fixtureDef.shape = shape;
		fixtureDef.density = 1;
		
		Fixture fixture = body.createFixture(fixtureDef);
		
		shape.dispose();
	}
	
//	ici on donne la position du corp à la position des graphismes
	
	public void updatePlayer(){
		this.setPosition(body.getPosition().x *MainMenu.PPM, body.getPosition().y *MainMenu.PPM);
	}
	
	public Body getBody(){
		return this.body;
	}
	
//	cette fonction représente l'annimation des graphismes du personnage principale
	
	public void représentationLink(MainCharacter cha){
		if (cha.getDirection().equals("gauche")){
			if ( System.currentTimeMillis() - MainMenu.start > 200) {
				
				if (MainCharacter.textGauche1 == true){
					cha.setTexture(MainCharacter.linkGauche1);
					MainCharacter.textGauche1 = false;
				} else {
					cha.setTexture(MainCharacter.linkGauche2);
					MainCharacter.textGauche1 = true;
				}
				MainMenu.start = System.currentTimeMillis();
			} 
		}
		else if (cha.getDirection().equals("droite")){
			if ( System.currentTimeMillis() - MainMenu.start > 200) {
				if (MainCharacter.textDroite1 == true){
					cha.setTexture(MainCharacter.linkDroite1);
					MainCharacter.textDroite1 = false;
				} else {
					cha.setTexture(MainCharacter.linkDroite2);
					MainCharacter.textDroite1 = true;
				}
				MainMenu.start = System.currentTimeMillis();
			}
		}
		else if (cha.getDirection().equals("haut")){
			if ( System.currentTimeMillis() - MainMenu.start > 200) {
				if (MainCharacter.textHaut1 == true){
					cha.setTexture(MainCharacter.linkHaut1);
					MainCharacter.textHaut1 = false;
				} else {
					cha.setTexture(MainCharacter.linkHaut2);
					MainCharacter.textHaut1 = true;
				}
				MainMenu.start = System.currentTimeMillis();
			}
		}
		else if (cha.getDirection().equals("bas")){
			if ( System.currentTimeMillis() - MainMenu.start > 200) {
				if (MainCharacter.textBas1 == true){
					cha.setTexture(MainCharacter.linkBas1);
					MainCharacter.textBas1 = false;
				} else {
					cha.setTexture(MainCharacter.linkBas2);
					MainCharacter.textBas1 = true;
				}
				MainMenu.start = System.currentTimeMillis();
			}
		}
	}
	

}
