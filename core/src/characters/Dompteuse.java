package characters;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.graphics.Texture;
import com.mygdx.game.GameMain;

import items.Potion;
import map.zoneGlace.GrotteF5Salle5;
import map.zoneGlace.PlacementMainZoneGlace;
import menus.MenuSac;
import scenes.MainMenu;

/**
 * Created by arnOo on 17/04/2017.
 */

public class Dompteuse {


    public static int etatScenario = 0; // à sauvegarder
    /* lorsque l'état est à 0 , c'est l'état initiale
    lorsque le joueur détecte la dompteuse, l'état passe à 1, on affiche le premier texte
    après, soit le tigre est en présence du joueur et le scénario passe à l'état 2
    soit il ne l'est pas il le scénario repasse à 0;
    en appuyant sur entrée, l'état scénario sera à 3 et il ne se passera plus rien
    */

    public static Texture domptTriste = new Texture("monstres/dompteuse/dompteuseTriste.png");
    public static boolean état = false;
    public static long timerReprésentation = System.currentTimeMillis();
    public static Texture dompteuseEtat1 = new Texture("monstres/dompteuse/dompteuseEtat1.png");
    public static Texture dompteuseEtat2 = new Texture("monstres/dompteuse/dompteuseEtat2.png");
    public static Texture dompteuseEtat3 = new Texture("monstres/dompteuse/dompteuseEtat3.png");
    public static Texture dompteuseEtat4 = new Texture("monstres/dompteuse/dompteuseEtat4.png");

    public static void représentation1(GameMain game, int x, int y){
        if ( etatScenario == 0 || etatScenario == 1){
            game.getBatch().draw(domptTriste,x,y);
        } else if ( etatScenario == 2 ){
            if ( état ) {
                game.getBatch().draw(dompteuseEtat1,x,y);
            } else {
                game.getBatch().draw(dompteuseEtat2,x,y);
            }
            if ( System.currentTimeMillis() - timerReprésentation > 300 ) {
                if ( état ) état = false;
                else état = true;
                timerReprésentation = System.currentTimeMillis();
            }
        } else if ( etatScenario == 3 ){
            if ( état ) {
                game.getBatch().draw(dompteuseEtat3,x,y);
            } else {
                game.getBatch().draw(dompteuseEtat4,x,y);
            }
            if ( System.currentTimeMillis() - timerReprésentation > 300 ) {
                if ( état ) état = false;
                else état = true;
                timerReprésentation = System.currentTimeMillis();
            }
        }
    }

    public static Texture texte1 = new Texture("texte/dompteuse/texte1.png");
    public static Texture texte2 = new Texture("texte/dompteuse/texte2.png");

    public static void affichageDompteuse(GameMain game, int x, int y){
        if ( etatScenario < 10 ) {
            représentation1(game,x,y);
            if ( etatScenario == 1 ) {
                game.getBatch().draw(texte1,100,20);
            }
            else if ( etatScenario == 2 ) {
                game.getBatch().draw(texte2,100,20);
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
                if ( ! Potion.isPotionRécupérer ) Potion.isPotionRécupérer = true;
            }
        }
    }

}
