package characters;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.graphics.Texture;
import com.mygdx.game.GameMain;

import map.zoneGlace.GrotteF5Salle5;
import map.zoneGlace.PlacementMainZoneGlace;
import menus.MenuSac;
import scenes.MainMenu;

/**
 * Created by arnOo on 17/04/2017.
 */

public class Dompteuse {


    public static int etatScenario = 0; // à sauvegarder

    public static Texture dompt = new Texture("monstres/dompteuse/dompteuseTriste.png");

    public static Texture texte1 = new Texture("texte/dompteuse/texte1.png");
    public static Texture texte2 = new Texture("texte/dompteuse/texte2.png");

    public static void affichageDompteuse(GameMain game, int x, int y){
        if ( etatScenario < 10 ) {
            game.getBatch().draw(dompt,x,y);
            if ( etatScenario == 1 ) game.getBatch().draw(texte1,100,10);
            else if ( etatScenario == 2 ) {
                game.getBatch().draw(texte2,100,10);
            }
        }
    }

    public static void détectionDompteuse(MainCharacter Link){
        if (PlacementMainZoneGlace.défilement == false
                && etatScenario == 0
                && Link.getBody().getPosition().x * MainMenu.PPM < 320
                && Link.getBody().getPosition().x * MainMenu.PPM > 280
                && Link.getBody().getPosition().y * MainMenu.PPM < 260
                && Link.getBody().getPosition().y * MainMenu.PPM > 180 ){
            if ( etatScenario == 0 ) etatScenario = 1 ;
            Link.getBody().setLinearVelocity(0,0);
            Link.setTexture(MainCharacter.linkHautRepos);
        }
    }

    public static void updateDompteuse( float dt ){
        if ( Gdx.input.isKeyJustPressed(Input.Keys.ENTER) ){
            if ( etatScenario == 0 ) etatScenario ++;
            else if ( etatScenario == 1 ) {
                if (GrotteF5Salle5.glacierCassé && ! Tigre.tigreRamené ) etatScenario = 2;
                else {
                    etatScenario = 0;
                    MainMenu.Link.getBody().setTransform(MainMenu.Link.getBody().getPosition().x - 30,MainMenu.Link.getBody().getPosition().y , 0 );
                }
            }
            else if ( etatScenario == 2 ) {
                Tigre.tigreRamené = true;
                Tigre.destroyBody();
                etatScenario = 3;
                MainMenu.Link.annimationAward = true;
                MenuSac.setItem(MainMenu.potion);
            }
        }
    }

}
