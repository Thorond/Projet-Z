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
	
	public static Texture linkPetit = new Texture("linkPetit.png");
	
	public static Texture coeurPlein = new Texture("Divers/coeurPlein.png");
	public static Texture coeurMoitié = new Texture("Divers/coeur1-2.png");
	public static Texture coeurUnQuart = new Texture("Divers/coeur1-4.png");
	public static Texture coeurTroisQuart = new Texture("Divers/coeur3-4.png");
	
	public MainCharacter(World world, int health, int strenght, float x, float y, String direction){
		super( world,linkPetit, health, strenght, x,  y, direction);
		this.world = world;
		createBody();
	}
	
	void createBody(){
		BodyDef bodyDef = new BodyDef();
		bodyDef.type = BodyDef.BodyType.DynamicBody;
		bodyDef.position.set(getX(),getY());
		body = world.createBody(bodyDef);
		
		PolygonShape shape = new PolygonShape();
		shape.setAsBox(getWidth() / 2 , getHeight() / 2);
		
		FixtureDef fixtureDef = new FixtureDef();
		fixtureDef.shape = shape;
		fixtureDef.density = 1;
		
		Fixture fixture = body.createFixture(fixtureDef);
		
		shape.dispose();
	}
	
	public void updatePlayer(){
		this.setPosition(body.getPosition().x, body.getPosition().y);
	}
	
	public Body getBody(){
		return this.body;
	}
	
	public void représentationLink(MainCharacter cha){
		if (cha.getDirection().equals("gauche")){
			if ( System.currentTimeMillis() - MainMenu.start > 250) {
				
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
			if ( System.currentTimeMillis() - MainMenu.start > 250) {
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
			if ( System.currentTimeMillis() - MainMenu.start > 250) {
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
			if ( System.currentTimeMillis() - MainMenu.start > 250) {
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
