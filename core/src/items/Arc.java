package items;

import com.badlogic.gdx.graphics.Texture;

import characters.MainCharacter;
import characters.Pnj;
import map.CadrillageMap;
import scenes.MainMenu;

/**
 * Created by arnOo on 07/04/2017.
 */

public class Arc extends Item{

    public static Texture arcT = new Texture("items/arc/arc.png");

    public Arc(){
        super(arcT,1);
    }

    public static boolean isArcPris = false; // a sauvegarder

    public static Texture texteArc = new Texture("texte/texteEpée.png");

    @Override
    public void utilisationItem( MainCharacter cha) {
       Flèches.déplacementInitial(cha.getDirection(), cha.getX(), cha.getY());
    }

    public static void utilisationNonJoueur(String direction , float x ,float  y){
        Flèches.déplacementInitialNonJoueur(direction , x ,y);
    }
}
