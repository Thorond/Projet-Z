package characters;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.graphics.Texture;
import com.mygdx.game.GameMain;

import decors.ClimatMontagneux;
import decors.DonjonGlace;
import map.zoneGlace.PlacementMainZoneGlace;
import scenes.MainMenu;

public class SnowMan {
	
	public static int étatTexte = 0 ; // à sauvegarder 
	
	public static Texture texte1 = new Texture("texte/iceman/texte0.png");
	public static Texture texte2 = new Texture("texte/iceman/texte1.png");
	public static Texture texte3 = new Texture("texte/iceman/texte2.png");
	public static Texture texte4 = new Texture("texte/iceman/texte3.png");
	public static Texture texte5 = new Texture("texte/iceman/texte4.png");
	public static Texture texte8 = new Texture("texte/iceman/texte9.png");
	public static Texture texte10 = new Texture("texte/iceman/texte10.png");
	
	public static void détection(MainCharacter Link ){
		 if ( étatTexte == 0 && PlacementMainZoneGlace.positionSousMap.equals("E6") && Link.getDirection().equals("bas")
				 && Link.getBody().getPosition().x > 240 / MainMenu.PPM && Link.getBody().getPosition().x < 260 /  MainMenu.PPM 
				 && Link.getBody().getPosition().y < 230 /  MainMenu.PPM  ){
			 étatTexte = 1;
			 Link.getBody().setLinearVelocity(0, 0);
			 
		 }
	}
	
	public static void update(float dlt){
		if (Gdx.input.isKeyJustPressed(Input.Keys.ENTER)){
			if ( étatTexte == 4 || étatTexte == 1  || étatTexte == 2 ){
				étatTexte ++;
			} else if ( étatTexte == 8 || étatTexte ==  10 ) {
				étatTexte = 0;
				MainMenu.Link.getBody().setTransform(MainMenu.Link.getBody().getPosition().x , MainMenu.Link.getBody().getPosition().y + 60, 0);
				MainMenu.Link.setDirection("haut");
			} else if ( étatTexte == 5 ) {
				MainMenu.Link.annimationAward = true;
				étatTexte = 11;
			}
		} else if (Gdx.input.isKeyJustPressed(Input.Keys.K)) {
			if ( étatTexte == 3 ) {
				if ( ClimatMontagneux.isCarottesPrise ){
					étatTexte = 4;
					DonjonGlace.isCléMilieuTrouvé = true;
					ClimatMontagneux.noseFound = true;
				} else {
					étatTexte = 10;
				}
			}
		} else if (Gdx.input.isKeyJustPressed(Input.Keys.L) && étatTexte == 3 ) étatTexte = 8;
	}
	
	public static void représentationTexte(GameMain game ){
		if ( étatTexte == 1 ) game.getBatch().draw(texte1, 100 , 60 );
		else if ( étatTexte == 2 ) game.getBatch().draw(texte2, 100 , 60 );
		else if ( étatTexte == 3 ) game.getBatch().draw(texte3, 100 , 60 );
		else if ( étatTexte == 4 ) game.getBatch().draw(texte4, 100 , 60 );
		else if ( étatTexte == 5 ) game.getBatch().draw(texte5, 100 , 60 );
		else if ( étatTexte == 8 ) game.getBatch().draw(texte8, 100 , 60 );
		else if ( étatTexte == 10 ) game.getBatch().draw(texte10, 100 , 60 );
	}

}
