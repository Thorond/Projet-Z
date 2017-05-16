package items;

import com.badlogic.gdx.graphics.Texture;

import characters.MainCharacter;
import map.zoneGlace.PlacementMainZoneGlace;
import menus.MenuSac;
import scenes.MainMenu;

public class Plume extends Item {
	
	public static Texture plume = new Texture("items/feather.png");
	public static Texture textPlume = new Texture("texte/textPlume.png");
	
	public Plume(){
		super(plume);
	}
	
	public static boolean isPlumePrise = false; // a sauvegarder 
	
	public static void récupérationPlume(){
		if (PlacementMainZoneGlace.positionSousMap.equals("IglooD3") && MainMenu.Link.getDirection().equals("haut") && !(Plume.isPlumePrise)
				 && MainMenu.Link.getX() >260 && MainMenu.Link.getX() < 280 
				 && MainMenu.Link.getY()>360 ) {
			 Plume.isPlumePrise = true;
			 MainMenu.Link.annimationAward = true;
			 MenuSac.setItem(MainMenu.plume);
		 };
	}
	
	public void utilisationItem( MainCharacter cha) {
//		***** pour developeur ****
//		if ( cha.getDirection().equals("gauche")) {
//			cha.getBody().setTransform(cha.getBody().getPosition().x - Math.min(70, cha.getBody().getPosition().x ), cha.getBody().getPosition().y , 0);
//		} else if ( cha.getDirection().equals("droite")) {
//			cha.getBody().setTransform(cha.getBody().getPosition().x + Math.min(70, 600 -cha.getBody().getPosition().x ), cha.getBody().getPosition().y , 0);
//		} else if ( cha.getDirection().equals("haut")) {
//			cha.getBody().setTransform(cha.getBody().getPosition().x , cha.getBody().getPosition().y + Math.min(70, 480 -cha.getBody().getPosition().y ) , 0);
//		} else if ( cha.getDirection().equals("bas")) {
//			cha.getBody().setTransform(cha.getBody().getPosition().x , cha.getBody().getPosition().y - Math.min(70, cha.getBody().getPosition().y ), 0);
//		}

//         **** pour joueur ****
        isPlumeUtilisée = true;
        timerPlume = System.currentTimeMillis();
    }

    public static boolean isPlumeUtilisée = false;
    public static long timerPlume = System.currentTimeMillis();

    public static void timerPlume(MainCharacter Link){
        if ( System.currentTimeMillis() - timerPlume > 700 && isPlumeUtilisée ){
            isPlumeUtilisée = false ;
        } else {
            if ( Link.getDirection().equals("gauche") || Link.getDirection().equals("droite")){
                if ( Math.abs(Link.getBody().getLinearVelocity().x) < 30 ) isPlumeUtilisée = false;
            }
            if ( Link.getDirection().equals("haut") || Link.getDirection().equals("bas")){
                if ( Math.abs(Link.getBody().getLinearVelocity().y) <30 ) isPlumeUtilisée = false;
            }
        }
    }
	
}
