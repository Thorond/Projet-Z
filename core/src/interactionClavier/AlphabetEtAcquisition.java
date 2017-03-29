package interactionClavier;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.graphics.Texture;
import com.mygdx.game.GameMain;

import characters.Ghost;

public class AlphabetEtAcquisition {

	public static boolean isAlphabetUtilisé = false;
	
	
	public static Texture  A = new Texture("texte/alphabet/A.png");
	public static Texture  B = new Texture("texte/alphabet/B.png");
	public static Texture  C = new Texture("texte/alphabet/C.png");
	public static Texture  D = new Texture("texte/alphabet/D.png");
	public static Texture  E = new Texture("texte/alphabet/E.png");
	public static Texture  F = new Texture("texte/alphabet/F.png");
	public static Texture  G = new Texture("texte/alphabet/G.png");
	public static Texture  H = new Texture("texte/alphabet/H.png");
	public static Texture  I = new Texture("texte/alphabet/I.png");
	public static Texture  J = new Texture("texte/alphabet/J.png");
	public static Texture  K = new Texture("texte/alphabet/K.png");
	public static Texture  L = new Texture("texte/alphabet/L.png");
	public static Texture  M = new Texture("texte/alphabet/M.png");
	public static Texture  N = new Texture("texte/alphabet/N.png");
	public static Texture  O = new Texture("texte/alphabet/O.png");
	public static Texture  P = new Texture("texte/alphabet/P.png");
	public static Texture  Q = new Texture("texte/alphabet/Q.png");
	public static Texture  R = new Texture("texte/alphabet/R.png");
	public static Texture  S = new Texture("texte/alphabet/S.png");
	public static Texture  T = new Texture("texte/alphabet/T.png");
	public static Texture  U = new Texture("texte/alphabet/U.png");
	public static Texture  V = new Texture("texte/alphabet/V.png");
	public static Texture  W = new Texture("texte/alphabet/W.png");
	public static Texture  X = new Texture("texte/alphabet/X.png");
	public static Texture  Y = new Texture("texte/alphabet/Y.png");
	public static Texture  Z = new Texture("texte/alphabet/Z.png");
	
	public static long timerCligno = System.currentTimeMillis();
	public static boolean isAffi = true;
	public static Texture  underScore = new Texture("texte/alphabet/_.png");
	
	public static Texture transcription(String lettre){
		if ( lettre.equals("A")) return A;
		else if ( lettre.equals("B")) return B;
		else if ( lettre.equals("C")) return C;
		else if ( lettre.equals("D")) return D;
		else if ( lettre.equals("E")) return E;
		else if ( lettre.equals("F")) return F;
		else if ( lettre.equals("G")) return G;
		else if ( lettre.equals("H")) return H;
		else if ( lettre.equals("I")) return I;
		else if ( lettre.equals("J")) return J;
		else if ( lettre.equals("K")) return K;
		else if ( lettre.equals("L")) return L;
		else if ( lettre.equals("M")) return M;
		else if ( lettre.equals("N")) return N;
		else if ( lettre.equals("O")) return O;
		else if ( lettre.equals("P")) return P;
		else if ( lettre.equals("Q")) return Q;
		else if ( lettre.equals("R")) return R;
		else if ( lettre.equals("S")) return S;
		else if ( lettre.equals("T")) return T;
		else if ( lettre.equals("U")) return U;
		else if ( lettre.equals("V")) return V;
		else if ( lettre.equals("W")) return W;
		else if ( lettre.equals("X")) return X;
		else if ( lettre.equals("Y")) return Y;
		else if ( lettre.equals("Z")) return Z;
		else return null;
	}
	
	public static Texture  cadreTexte = new Texture("texte/cadreTexte.png");
	
	
	public static String motTapé ="";
	public static int placeDernièreLettre = -1 ;
	public static String[] motDécomposé = new String[10];
	
	public static void acquisitionTouche(){
		if (placeDernièreLettre < 9){
			if ( Gdx.input.isKeyJustPressed(Input.Keys.A) ) {
				placeDernièreLettre+=1;
				motDécomposé[placeDernièreLettre] = "A";
			} else if ( Gdx.input.isKeyJustPressed(Input.Keys.B) ) {
				placeDernièreLettre+=1;
				motDécomposé[placeDernièreLettre] = "B";
			} else if ( Gdx.input.isKeyJustPressed(Input.Keys.C) ) {
				placeDernièreLettre+=1;
				motDécomposé[placeDernièreLettre] = "C";
			} else if ( Gdx.input.isKeyJustPressed(Input.Keys.D) ) {
				placeDernièreLettre+=1;
				motDécomposé[placeDernièreLettre] = "D";
			} else if ( Gdx.input.isKeyJustPressed(Input.Keys.E) ) {
				placeDernièreLettre+=1;
				motDécomposé[placeDernièreLettre] = "E";
			} else if ( Gdx.input.isKeyJustPressed(Input.Keys.F) ) {
				placeDernièreLettre+=1;
				motDécomposé[placeDernièreLettre] = "F";
			} else if ( Gdx.input.isKeyJustPressed(Input.Keys.G) ) {
				placeDernièreLettre+=1;
				motDécomposé[placeDernièreLettre] = "G";
			} else if ( Gdx.input.isKeyJustPressed(Input.Keys.H) ) {
				placeDernièreLettre+=1;
				motDécomposé[placeDernièreLettre] = "H";
			} else if ( Gdx.input.isKeyJustPressed(Input.Keys.I) ) {
				placeDernièreLettre+=1;
				motDécomposé[placeDernièreLettre] = "I";
			} else if ( Gdx.input.isKeyJustPressed(Input.Keys.J) ) {
				placeDernièreLettre+=1;
				motDécomposé[placeDernièreLettre] = "J";
			} else if ( Gdx.input.isKeyJustPressed(Input.Keys.K) ) {
				placeDernièreLettre+=1;
				motDécomposé[placeDernièreLettre] = "K";
			} else if ( Gdx.input.isKeyJustPressed(Input.Keys.L) ) {
				placeDernièreLettre+=1;
				motDécomposé[placeDernièreLettre] = "L";
			} else if ( Gdx.input.isKeyJustPressed(Input.Keys.M) ) {
				placeDernièreLettre+=1;
				motDécomposé[placeDernièreLettre] = "M";
			} else if ( Gdx.input.isKeyJustPressed(Input.Keys.N) ) {
				placeDernièreLettre+=1;
				motDécomposé[placeDernièreLettre] = "N";
			} else if ( Gdx.input.isKeyJustPressed(Input.Keys.O) ) {
				placeDernièreLettre+=1;
				motDécomposé[placeDernièreLettre] = "O";
			} else if ( Gdx.input.isKeyJustPressed(Input.Keys.P) ) {
				placeDernièreLettre+=1;
				motDécomposé[placeDernièreLettre] = "P";
			} else if ( Gdx.input.isKeyJustPressed(Input.Keys.Q) ) {
				placeDernièreLettre+=1;
				motDécomposé[placeDernièreLettre] = "Q";
			} else if ( Gdx.input.isKeyJustPressed(Input.Keys.R) ) {
				placeDernièreLettre+=1;
				motDécomposé[placeDernièreLettre] = "R";
			} else if ( Gdx.input.isKeyJustPressed(Input.Keys.S) ) {
				placeDernièreLettre+=1;
				motDécomposé[placeDernièreLettre] = "S";
			} else if ( Gdx.input.isKeyJustPressed(Input.Keys.T) ) {
				placeDernièreLettre+=1;
				motDécomposé[placeDernièreLettre] = "T";
			} else if ( Gdx.input.isKeyJustPressed(Input.Keys.U) ) {
				placeDernièreLettre+=1;
				motDécomposé[placeDernièreLettre] = "U";
			} else if ( Gdx.input.isKeyJustPressed(Input.Keys.V) ) {
				placeDernièreLettre+=1;
				motDécomposé[placeDernièreLettre] = "V";
			} else if ( Gdx.input.isKeyJustPressed(Input.Keys.W) ) {
				placeDernièreLettre+=1;
				motDécomposé[placeDernièreLettre] = "W";
			} else if ( Gdx.input.isKeyJustPressed(Input.Keys.X) ) {
				placeDernièreLettre+=1;
				motDécomposé[placeDernièreLettre] = "X";
			} else if ( Gdx.input.isKeyJustPressed(Input.Keys.Y) ) {
				placeDernièreLettre+=1;
				motDécomposé[placeDernièreLettre] = "Y";
			} else if ( Gdx.input.isKeyJustPressed(Input.Keys.Z) ) {
				placeDernièreLettre+=1;
				motDécomposé[placeDernièreLettre] = "Z";
			} 
		} 
		if ( Gdx.input.isKeyJustPressed(Input.Keys.DEL) && placeDernièreLettre >= 0 ) {
			motDécomposé[placeDernièreLettre] = "";
			placeDernièreLettre-=1;
		}
		if ( Gdx.input.isKeyJustPressed(Input.Keys.ENTER)){
			motTapé = "";
			for ( int i = 0 ; i <= placeDernièreLettre ; i++ ){
				motTapé += motDécomposé[i];
			}
			isAlphabetUtilisé = false;
//			lorsque l'on fait appel a cette fonction pour le scenario 1 du fantôme 
			if ( Ghost.etatScenario == 9 ){
				if ( motTapé.equals("OMBRE") || motTapé.equals("CHIEN") ) Ghost.etatScenario = 11;
				else Ghost.etatScenario = 10;
			}
		}
	}
	
	public static void affichageMot(GameMain game ) {
		int placement =150;
		game.getBatch().draw(cadreTexte, 100 , 60 );
		for ( int i = 0 ; i < 10 ; i++ ){
			if ( i == placeDernièreLettre + 1 ){
				if ( isAffi ) game.getBatch().draw(underScore, placement , 140);
				if ( System.currentTimeMillis() - timerCligno > 400 ){
					if ( isAffi ) isAffi = false;
					else isAffi = true;
					timerCligno = System.currentTimeMillis();
				}
			} else game.getBatch().draw(underScore, placement , 140);
			placement += 30 ;
		}
		
		placement = 150;
		int ajustement = 0 ;
		for ( int i = 0 ; i <= placeDernièreLettre ; i++ ){
			if ( motDécomposé[i].equals("G") || motDécomposé[i].equals("Q") || motDécomposé[i].equals("Y") ) ajustement = -10 ;
			game.getBatch().draw(transcription(motDécomposé[i]), placement , 150 + ajustement);
			placement+=30;
			ajustement = 0;
		}
	}
	
}
