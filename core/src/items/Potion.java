package items;

import com.badlogic.gdx.graphics.Cursor;
import com.badlogic.gdx.graphics.Texture;

import characters.MainCharacter;
import scenes.MainMenu;

/**
 * Created by arnOo on 17/04/2017.
 */

public class Potion extends Item{

    public static Texture potionT = new Texture("items/potion/potionVie.png");

    public Potion(){
        super(potionT,1);
    }

    public static boolean isPotionRécupérer = false; // a sauvegarder

    public static Texture textePotion = new Texture("items/potion/textePotion.png");

    public long trenteMin = 1800000 ;
    public static long utilisationPotion = - 1800001 + System.currentTimeMillis(); // à sauvegarder?

    @Override
    public void utilisationItem( MainCharacter cha) {
        if ( System.currentTimeMillis() - utilisationPotion > trenteMin ) {
            cha.setHealth(cha.getHealth() + cha.getHealthMax() / 2);
            if (cha.getHealth() > cha.getHealthMax()) cha.setHealth(cha.getHealthMax());
            utilisationPotion = System.currentTimeMillis();
        }
    }

    public void affichageTemps(){
        if ( System.currentTimeMillis() - utilisationPotion > trenteMin  )
            MainMenu.potion.setNombreItem( 0 );
        else {
            MainMenu.potion.setNombreItem((int) ( ( trenteMin - (System.currentTimeMillis() - utilisationPotion )) / 60000 )+ 1);
        }
    }
}
