package characters;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.graphics.Texture;
import com.mygdx.game.GameMain;

import decors.ClimatMontagneux;
import items.Bombe;
import items.Essence;
import map.zoneGlace.IglooC5;
import menus.MenuSac;
import scenes.MainMenu;

public class VieuxMarchand {

	public static int etatAttente1 = 0;
	public static long startAttente1 = System.currentTimeMillis();
	public static Texture  vieuxMarchandDroite1 = new Texture("monstres/vieuxMarchand/vieuxMarchandDroite1.png");
	public static Texture  vieuxMarchandDroite2 = new Texture("monstres/vieuxMarchand/vieuxMarchandDroite2.png");
	
	public static Texture  texte0 = new Texture("texte/vieuxMarchand/texte0.png");
	public static Texture  texte1 = new Texture("texte/vieuxMarchand/texte1.png");
	public static Texture  texte2 = new Texture("texte/vieuxMarchand/texte2.png");
	public static Texture  texte3 = new Texture("texte/vieuxMarchand/texte3.png");
	public static Texture  texte4 = new Texture("texte/vieuxMarchand/texte4.png");
	public static Texture  texte5 = new Texture("texte/vieuxMarchand/texte5.png");
	
	public static void annimationAttente1(GameMain game, int x , int y){
		if ( etatAttente1 == 0 ) game.getBatch().draw(vieuxMarchandDroite1,x,y);
		else game.getBatch().draw(vieuxMarchandDroite2,x,y);
		if ( System.currentTimeMillis() - startAttente1 > 1600 ){
			if ( etatAttente1 == 0 ) etatAttente1 = 1;
			else etatAttente1 = 0;
			startAttente1 = System.currentTimeMillis();
		}
	}

	public static void discussionAchat(GameMain game) {
		if ( IglooC5.étatAchat == 1 ) game.getBatch().draw(texte0,100,60);
		else if ( IglooC5.étatAchat == 4 ) game.getBatch().draw(texte4,100,60);
		else if ( IglooC5.étatAchat == 2 || IglooC5.étatAchat == 5 ) game.getBatch().draw(texte1,100,60);
		else if ( IglooC5.étatAchat == 7 ) game.getBatch().draw(texte2,100,60);
		else if ( IglooC5.étatAchat == 8 ) game.getBatch().draw(texte3,100,60);
		else if ( IglooC5.étatAchat == 9 ) game.getBatch().draw(texte5,100,60);
	}


    //	lorsque le joueur achète quelque chose
    public static void updateAchat(float dt){
        if ( Gdx.input.isKeyJustPressed(Input.Keys.ENTER) ){
            if ( IglooC5.étatAchat == 1 ) IglooC5.étatAchat = 2;
            else if ( IglooC5.étatAchat == 4 ) IglooC5.étatAchat = 5;
            else if ( ! (IglooC5.étatAchat == 2)  && ! (IglooC5.étatAchat == 5) ){
                IglooC5.étatAchat = 10;
            }
        } else if ( Gdx.input.isKeyJustPressed(Input.Keys.K) ) {
            if ( IglooC5.étatAchat == 2 ) {
                if ( Essence.nombreEssence >= 50 ){
                    if( Bombe.isBombeRécupéré == false ) {
                        Bombe.isBombeRécupéré = true;
                        MenuSac.setItem(MainMenu.bombe);
                    }
                    MainMenu.bombe.setNombreItem(MainMenu.bombe.getNombreItem() + 10);
                    Essence.nombreEssence -= 50 ;
                    IglooC5.étatAchat = 7;
                } else {
                    IglooC5.étatAchat = 8;
                }

            }
            else if ( IglooC5.étatAchat == 5 ) {
                if ( Essence.nombreEssence >= 20 ){
                    if ( !ClimatMontagneux.isCarottesPrise ) ClimatMontagneux.isCarottesPrise = true;
                    Essence.nombreEssence -= 20 ;
                    IglooC5.étatAchat = 7;
                } else {
                    IglooC5.étatAchat = 8;
                }
            }
        }else if ( Gdx.input.isKeyJustPressed(Input.Keys.L) ) {
            if( IglooC5.étatAchat == 2 || IglooC5.étatAchat == 5  ){
                IglooC5.étatAchat = 9;
            }
        }
    }
	
}
