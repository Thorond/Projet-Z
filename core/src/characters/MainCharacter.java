package characters;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.physics.box2d.Body;
import com.badlogic.gdx.physics.box2d.BodyDef;
import com.badlogic.gdx.physics.box2d.Fixture;
import com.badlogic.gdx.physics.box2d.FixtureDef;
import com.badlogic.gdx.physics.box2d.PolygonShape;
import com.badlogic.gdx.physics.box2d.World;

import items.Bombe;
import items.Bouclier;
import items.Epee;
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

    public boolean tombe = false;
    public long timerChute = System.currentTimeMillis();
    public float tailleChute = 1;
    public long timerChuteTotal = System.currentTimeMillis();
	public static Texture linkTombé = new Texture("Personnage/linkTombé.png");
	public static Texture linkEauDroite = new Texture("Personnage/linkEauDroite.png");
	public static Texture linkEauGauche = new Texture("Personnage/linkEauGauche.png");
	
	public static Texture linkBasReposBouclier = new Texture("Personnage/link1Bouclier.png");
	public static Texture linkBas1Bouclier = new Texture("Personnage/linkBouclier.png");
	public static Texture linkBas2Bouclier = new Texture("Personnage/link2Bouclier.png");
	public static Texture linkGaucheReposBouclier = new Texture("Personnage/link4Bouclier.png");
	public static Texture linkGauche1Bouclier = new Texture("Personnage/link3Bouclier.png");
	public static Texture linkGauche2Bouclier = new Texture("Personnage/link5Bouclier.png");
	public static Texture linkHautReposBouclier = new Texture("Personnage/link10Bouclier.png");
	public static Texture linkHaut1Bouclier = new Texture("Personnage/link11Bouclier.png");
	public static Texture linkHaut2Bouclier = new Texture("Personnage/link9Bouclier.png");
	public static Texture linkDroiteReposBouclier = new Texture("Personnage/link7Bouclier.png");
	public static Texture linkDroite1Bouclier = new Texture("Personnage/link8Bouclier.png");
	public static Texture linkDroite2Bouclier = new Texture("Personnage/link6Bouclier.png");


    public String zone = "zoneGlace"; // à sauvegarder


	
	public boolean annimationAward = false;
	public static Texture linkAward = new Texture("Personnage/linkAward.png");
	
	
	public static Texture coeurPlein = new Texture("Divers/coeur/coeurPlein.png");
	public static Texture coeurMoitié = new Texture("Divers/coeur/coeur1-2.png");
	public static Texture coeurUnQuart = new Texture("Divers/coeur/coeur1-4.png");
	public static Texture coeurTroisQuart = new Texture("Divers/coeur/coeur3-4.png");
	public static Texture coeurVide = new Texture("Divers/coeur/coeurVide.png");


    public MainCharacter(World world, int HM, int health, int strength, float x, float y, String direction){
		super( world,linkBasRepos, HM, health, strength, x,  y, direction);
		this.world = world;
		createBody();
	}
	
//	==========================================================================
//	cette fonction permet de créer le corps solide de notre personnage
//	à l'aide d'une fonction de libGDX
//	==========================================================================
	
	public void createBody(){
		BodyDef bodyDef = new BodyDef();
		bodyDef.type = BodyDef.BodyType.DynamicBody;
		bodyDef.position.set(getX()/MainMenu.PPM,getY()/MainMenu.PPM);
		body = world.createBody(bodyDef);
		
		PolygonShape shape = new PolygonShape();
		shape.setAsBox(getWidth() / (2*MainMenu.PPM) , getWidth() / (2*MainMenu.PPM));
		
		FixtureDef fixtureDef = new FixtureDef();
		fixtureDef.shape = shape;
		fixtureDef.density = 1;
		
		Fixture fixture = body.createFixture(fixtureDef);
		
		shape.dispose();
	}
	
//	ici on donne la position du corp à la position des graphismes
	
	public void updatePlayer(){
		if ( this.getTexture() == Epee.linkEpéeBasGauche ) this.setPosition(this.getBody().getPosition().x*MainMenu.PPM -20, (this.getBody().getPosition().y)*MainMenu.PPM -30);
		else if (this.getTexture() == Epee.linkEpéeBasDroite || this.getTexture() == Epee.linkEpéeBasDroiteDroite ) this.setPosition(this.getBody().getPosition().x*MainMenu.PPM, (this.getBody().getPosition().y)*MainMenu.PPM -30);
		else if ( this.getTexture() == Epee.linkEpéeGaucheHaut
				 || this.getTexture() == Epee.linkEpéeGaucheBas || this.getTexture() == Epee.linkEpéeBasGaucheHaut ) this.setPosition(this.getBody().getPosition().x*MainMenu.PPM -30, (this.getBody().getPosition().y)*MainMenu.PPM );
		else this.setPosition(body.getPosition().x *MainMenu.PPM, body.getPosition().y *MainMenu.PPM );
	}
	
	public Body getBody(){
		return this.body;
	}
	
//	cette fonction représente l'annimation des graphismes du personnage principale
	public static boolean changementDeVitesse = false;
	public void représentationLink(MainCharacter cha){
		int vitesseMouvements ;
		if ( changementDeVitesse == true){
			if (Bouclier.isBouclierUtilisé == true ) {
				vitesseMouvements = 400;
			} else if ( Ghost.etatScenario !=0 && Ghost.etatScenario < 16 ) vitesseMouvements = 600;
			else {
				vitesseMouvements = 200;
			}
			changementDeVitesse = false;
		}
		
		if (Bouclier.isBouclierUtilisé == true) {
			vitesseMouvements = 400;
		}else if ( Ghost.etatScenario !=0 && Ghost.etatScenario < 14 ) vitesseMouvements = 600; 
		else vitesseMouvements = 200;
		
		if (cha.getDirection().equals("gauche") ){
			if ( System.currentTimeMillis() - MainMenu.start > vitesseMouvements) {
				
				if (MainCharacter.textGauche1 == true){
					if (Bouclier.isBouclierUtilisé == true) cha.setTexture(MainCharacter.linkGauche1Bouclier);
					else cha.setTexture(MainCharacter.linkGauche1);
					MainCharacter.textGauche1 = false;
				} else {
					if (Bouclier.isBouclierUtilisé == true) cha.setTexture(MainCharacter.linkGauche2Bouclier);
					else cha.setTexture(MainCharacter.linkGauche2);
					MainCharacter.textGauche1 = true;
				}
				MainMenu.start = System.currentTimeMillis();
			} 
		}
		else if (cha.getDirection().equals("droite")){
			if ( System.currentTimeMillis() - MainMenu.start > vitesseMouvements) {
				if (MainCharacter.textDroite1 == true){
					if (Bouclier.isBouclierUtilisé == true) cha.setTexture(MainCharacter.linkDroite1Bouclier);
					else cha.setTexture(MainCharacter.linkDroite1);
					MainCharacter.textDroite1 = false;
				} else {
					if (Bouclier.isBouclierUtilisé == true) cha.setTexture(MainCharacter.linkDroite2Bouclier);
					else cha.setTexture(MainCharacter.linkDroite2);
					MainCharacter.textDroite1 = true;
				}
				MainMenu.start = System.currentTimeMillis();
			}
		}
		else if (cha.getDirection().equals("haut")){
			if ( System.currentTimeMillis() - MainMenu.start > vitesseMouvements) {
				if (MainCharacter.textHaut1 == true){
					if (Bouclier.isBouclierUtilisé == true) cha.setTexture(MainCharacter.linkHaut1Bouclier);
					else cha.setTexture(MainCharacter.linkHaut1);
					MainCharacter.textHaut1 = false;
				} else {
					if (Bouclier.isBouclierUtilisé == true) cha.setTexture(MainCharacter.linkHaut2Bouclier);
					else cha.setTexture(MainCharacter.linkHaut2);
					MainCharacter.textHaut1 = true;
				}
				MainMenu.start = System.currentTimeMillis();
			}
		}
		else if (cha.getDirection().equals("bas")){
			if ( System.currentTimeMillis() - MainMenu.start > vitesseMouvements) {
				if (MainCharacter.textBas1 == true){
					if (Bouclier.isBouclierUtilisé == true) cha.setTexture(MainCharacter.linkBas1Bouclier);
					else cha.setTexture(MainCharacter.linkBas1);
					MainCharacter.textBas1 = false;
				} else {
					if (Bouclier.isBouclierUtilisé == true) cha.setTexture(MainCharacter.linkBas2Bouclier);
					else cha.setTexture(MainCharacter.linkBas2);
					MainCharacter.textBas1 = true;
				}
				MainMenu.start = System.currentTimeMillis();
			}
		}
		
	}
	
//	
	
	public boolean isAlive = true;

	public void subirDégatsBombe(Bombe cha, int x, int y) {
		if ( x + this.getWidth() / 2 >= (int) this.getBody().getPosition().x * MainMenu.PPM  -60 
				&& x <= (int) this.getBody().getPosition().x * MainMenu.PPM  
				&& y +this.getHeight() / 2 >= (int) this.getBody().getPosition().y * MainMenu.PPM  
				&& y <= (int) this.getBody().getPosition().y * MainMenu.PPM  + this.getHeight() / 2  ){
			MainMenu.Link.isHit = true;
			MainMenu.Link.timerHit = System.currentTimeMillis();
			MainMenu.Link.getBody().applyLinearImpulse(new Vector2(+600000,0), MainMenu.Link.getBody().getWorldCenter(), true);

		}else if ((int) this.getBody().getPosition().x * MainMenu.PPM - x < 0 
				&& x <= (int) this.getBody().getPosition().x * MainMenu.PPM + this.getWidth() / 2 +60
				&& y +cha.getHeight() / 2 >= (int) this.getBody().getPosition().y * MainMenu.PPM 
				&& y <= (int) this.getBody().getPosition().y * MainMenu.PPM + this.getHeight() / 2  ){
			MainMenu.Link.isHit = true;
			MainMenu.Link.timerHit = System.currentTimeMillis();
			MainMenu.Link.getBody().applyLinearImpulse(new Vector2(-600000,0), MainMenu.Link.getBody().getWorldCenter(), true);

		}
	
		if (x+ cha.getWidth() / 2 >= (int) this.getBody().getPosition().x * MainMenu.PPM  
				&& x <= (int) this.getBody().getPosition().x * MainMenu.PPM + this.getWidth() / 2 
				&& y +cha.getHeight() / 2 >= (int) this.getBody().getPosition().y * MainMenu.PPM -60
				&& (int) this.getBody().getPosition().y * MainMenu.PPM - y > 0 ){
			MainMenu.Link.isHit = true;
			MainMenu.Link.timerHit = System.currentTimeMillis();
			MainMenu.Link.getBody().applyLinearImpulse(new Vector2(0,+600000), MainMenu.Link.getBody().getWorldCenter(), true);

		}
		else if (x + cha.getWidth() / 2 >= (int) this.getBody().getPosition().x * MainMenu.PPM   
				&& x <= (int) this.getBody().getPosition().x * MainMenu.PPM   + this.getWidth() / 2 
				&& (int) this.getBody().getPosition().y * MainMenu.PPM   - y < 0
				&& y <= (int) this.getBody().getPosition().y * MainMenu.PPM   + this.getHeight() / 2  +60){
			MainMenu.Link.isHit = true;
			MainMenu.Link.timerHit = System.currentTimeMillis();
			MainMenu.Link.getBody().applyLinearImpulse(new Vector2(0,-600000), MainMenu.Link.getBody().getWorldCenter(), true);

		}
		
	}

//     histoire


    public static int etatScenario = -1 ;

    public static Texture zeldaGauche = new Texture("Personnage/zelda/zeldaGauche.png");
    public static Texture zeldaKidna = new Texture("Personnage/zelda/zeldaKidna.png");
    public static Texture zeldaBas1 = new Texture("Personnage/zelda/zeldaBas1.png");
    public static Texture zeldaBas2 = new Texture("Personnage/zelda/zeldaBas2.png");
    public static Texture exclamation = new Texture("Personnage/zelda/exclamation.png");

    public static void updateJoueur(float dt ){
        if ( Gdx.input.isKeyJustPressed(Input.Keys.ENTER)){
            if ( etatScenario >= 0 ) etatScenario ++ ;
            if ( etatScenario == 5 ) {
                MainMenu.Link.setTexture(MainCharacter.linkTombé);
            }

        }
    }
	

}
