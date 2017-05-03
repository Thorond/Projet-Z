package items;

import com.badlogic.gdx.graphics.Texture;

import characters.MainCharacter;
import map.zoneGlace.PlacementMainZoneGlace;
import menus.MenuSac;
import scenes.MainMenu;

/**
 * Created by arnOo on 02/05/2017.
 */

public class Torche extends Item {

    public static Texture torcheT = new Texture("items/torche/torcheT.png");
    public static Texture texteTorche = new Texture("items/torche/texteTorche.png");

    public Torche(){
        super(torcheT);
    }

    public static boolean isTorchePrise = false; // a sauvegarder
    public static boolean isTorcheUtilisée = false;

    public static void récupérationTorche(){
        if (PlacementMainZoneGlace.positionSousMap.equals("DonjonSalle6") && MainMenu.Link.getDirection().equals("haut") && !(Torche.isTorchePrise)
                && MainMenu.Link.getX() > 220 && MainMenu.Link.getX() < 260
                && MainMenu.Link.getY() > 280 && MainMenu.Link.getY() < 320) {
            Torche.isTorchePrise = true;
            MainMenu.Link.annimationAward = true;
            MenuSac.setItem(MainMenu.torche);
        };
    }

    public void utilisationItem( MainCharacter cha) {


        if ( ! isTorcheUtilisée ) isTorcheUtilisée = true;
        else isTorcheUtilisée = false;
    }



}