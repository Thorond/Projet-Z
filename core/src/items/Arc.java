package items;

import com.badlogic.gdx.graphics.Texture;

import characters.MainCharacter;
import map.zoneGlace.PlacementMainZoneGlace;
import menus.MenuSac;
import scenes.MainMenu;

/**
 * Created by arnOo on 07/04/2017.
 */

public class Arc extends Item{

    public static Texture arcT = new Texture("items/arc/arc.png");
    public static Texture carquois = new Texture("items/arc/carquois.png");
    public static Texture tombe = new Texture("items/arc/graveStone.png");
    public static Texture texte0 = new Texture("items/arc/texte0.png");
    public static Texture indiceArc1 = new Texture("items/arc/indiceArc1.png");
    public static Texture indiceArc2 = new Texture("items/arc/indiceArc2.png");

    public Arc(){
        super(arcT,1);
    }

    public static boolean isArcPris = false; // a sauvegarder

    public static Texture texteArc = new Texture("texte/texteArc.png");

    @Override
    public void utilisationItem( MainCharacter cha) {
       Flèches.déplacementInitial(cha.getDirection(), cha.getX(), cha.getY());
        MainMenu.arc.setNombreItem(Flèches.nombreFlèche);
    }

    public static void utilisationNonJoueur(String direction , float x ,float  y){
        Flèches.déplacementInitialNonJoueur(direction , x ,y);
    }

    public static void détection(MainCharacter link) {
        if ( isArcPris == false && PlacementMainZoneGlace.positionSousMap.equals("GrotteI1Salle4") ) {
            if ( link.getX() > 280 && link.getX() < 320
                    && link.getY() > 280 && link.getY() < 320 ) {
                Arc.isArcPris = true;
                MainMenu.Link.annimationAward = true;
                MenuSac.setItem(MainMenu.arc);
                Flèches.nombreFlèche += 20;
                MainMenu.arc.setNombreItem(Flèches.nombreFlèche);
            }
        }
    }
}
