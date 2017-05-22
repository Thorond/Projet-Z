package items;

import com.badlogic.gdx.graphics.Texture;
import com.mygdx.game.GameMain;

import characters.MainCharacter;
import characters.Pnj;
import map.CadrillageMap;
import map.zoneGlace.PlacementMainZoneGlace;
import map.zoneGlace.SousMapB3;
import scenes.MainMenu;

public class Bombe extends Item {
	
	public static boolean isBombeRécupéré = false; // a sauvegarder 
	
	public static Texture bombeT = new Texture("items/bombe/bombe1.png");
	public static Texture bombe2 = new Texture("items/bombe/bombe2.png");
	public static Texture bombe3 = new Texture("items/bombe/bombe3.png");
	public static Texture explosion = new Texture("items/bombe/explosion.png");
	
	protected boolean estPrésent =false;
	protected int état = 1;
	protected long start;
	protected long startEtat;
	protected int x;
	protected int y;
	
	public static Bombe[] bombes = new Bombe[] { new Bombe(), new Bombe(), new Bombe(), new Bombe(), new Bombe(),
			new Bombe(), new Bombe(), new Bombe(), new Bombe(), new Bombe(),
			new Bombe(), new Bombe(), new Bombe(), new Bombe(), new Bombe(),
			new Bombe(), new Bombe(), new Bombe(), new Bombe(), new Bombe()
	};
	
	public Bombe() {
		super(bombeT, 0);
	}
	
	public Bombe( int nombre) {
		super(bombeT, nombre);
	}

	private  int dégàts = 4 ;
	

	public  int getNombreItem() {
		return nombreItem;
	}


	public  void setNombreItem(int nombreItem) {
		this.nombreItem = nombreItem;
	}


	public  int getDégàts() {
		return dégàts;
	}


	public  void setDégéts(int dégéts) {
		this.dégàts = dégéts;
	}
		
	
		
//	dépot de bombes
	
	
	public void utilisationItem(MainCharacter cha){
		if ( MainMenu.bombe.nombreItem > 0) {
			remplirBombes( (int) cha.getX(), (int) cha.getY());
			MainMenu.bombe.setNombreItem(MainMenu.bombe.getNombreItem() - 1);
		}
	}
	
	
	public void setEstPrésent(boolean boo){
		estPrésent = boo;
		if (boo == true) {
			start = System.currentTimeMillis();
			startEtat = System.currentTimeMillis();
		}
	}
	
	public static void remplirBombes(int X, int Y){
		for ( int i = 0 ; i < bombes.length ; i++ ){
			if ( bombes[i].estPrésent == false ) {
				bombes[i].état = 1;
				bombes[i].setEstPrésent(true);
				bombes[i].x = X;
				bombes[i].y = Y;
				break;
			}
		}
	}

	// tout remettre à 0 ( quand on change de map par exemple )
	public static void réinitialisation(){
		for ( int i = 0 ; i < bombes.length ; i++) bombes[i].setEstPrésent(false);
	}
	
	public static void représentationBombe(GameMain game){
		for ( int i = 0; i< bombes.length ; i++){
			if ( bombes[i].isEstPrésent() ) {
				if ( bombes[i].état == 1 ) game.getBatch().draw(bombeT, bombes[i].getX() -20, bombes[i].getY());
				else if ( bombes[i].état == 2 ) game.getBatch().draw(bombe2, bombes[i].getX() , bombes[i].getY());
				else if ( bombes[i].état == 3 ) game.getBatch().draw(bombe3, bombes[i].getX() , bombes[i].getY());
				else if ( bombes[i].état == 4 ) game.getBatch().draw(explosion, bombes[i].getX() - 20 , bombes[i].getY() - 20);
				if ( System.currentTimeMillis() - bombes[i].startEtat > 500){
					if ( bombes[i].état == 1 ) bombes[i].état = 2;
					else if ( bombes[i].état == 2 ) bombes[i].état = 3;
					else if ( bombes[i].état == 3 ) {
						bombes[i].état = 4;
						bombes[i].explosion();
					}
					else if ( bombes[i].état == 4 ) {
						bombes[i].état = 0;
						bombes[i].setEstPrésent(false);
					}
					bombes[i].startEtat = System.currentTimeMillis();
					
				}
			}
		}
	}
	
//	explosion de la bombe
	public void explosion( ){
	
	//		vérification que des monstres sont présents
		if ( Pnj.nbrDeMonstres > 0){
			// vérification qu'il ne s'agisse pas du boss du donjon
            if ( PlacementMainZoneGlace.positionSousMap.equals("DonjonSalle10")){
                if ( CadrillageMap.typeDeDécor[(int) this.getX() / 60][(int) this.getY() / 60].equals("Résidu")){
                    Pnj.monstres[0].subirDégatsBombe(this, (int) this.getX(), (int) this.getY());
                }
            } else {
                for ( int i = 0; i < Pnj.nbrDeMonstres ; i++) {
                    //				vérification qu'ils soient vivants
                    if (Pnj.monstres[i].isAlive()) {
                        if ((int) this.getX() + 80 >= (int) Pnj.monstres[i].getBody().getPosition().x * MainMenu.PPM
                                && (int) this.getX() - 80 <= (int) Pnj.monstres[i].getBody().getPosition().x * MainMenu.PPM
                                && (int) this.getY() + 80 >= (int) Pnj.monstres[i].getBody().getPosition().y * MainMenu.PPM
                                && (int) this.getY() - 80 <= (int) Pnj.monstres[i].getBody().getPosition().y * MainMenu.PPM) {

                            Pnj.monstres[i].subirDégatsBombe(this, (int) this.getX(), (int) this.getY());
                        }
                    }
                }
			}	
		}
//		dégàt sur le joueur
		
		if ( (int) this.getX() + 60 >= (int) MainMenu.Link.getBody().getPosition().x * MainMenu.PPM 
				&& (int) this.getX() - 60 <= (int) MainMenu.Link.getBody().getPosition().x * MainMenu.PPM  
				&& (int) this.getY() + 60 >= (int) MainMenu.Link.getBody().getPosition().y * MainMenu.PPM 
				&& (int) this.getY() - 60 <= (int) MainMenu.Link.getBody().getPosition().y * MainMenu.PPM ){
			MainMenu.Link.subirDégatsBombe(this, (int) this.getX(), (int) this.getY() );
			MainMenu.Link.setHealth(MainMenu.Link.getHealth() - this.getDégàts() );
		}
		
//		 effet sur les décors 
		if ( CadrillageMap.typeDeDécor[(int) ( (this.getX() + 45 )/ 60 )][(int) ((this.getY()) / 60 )].equals("destructible") ){
			CadrillageMap.setTypeDeDécor((int) ( (this.getX() + 45 )/ 60 ),(int) ((this.getY()) / 60 ), "détruit");

		} else if ( CadrillageMap.typeDeDécor[(int) (( this.getX() ) / 60 )][(int) ((this.getY()+ 45 )/ 60 )].equals("destructible") ){
			CadrillageMap.setTypeDeDécor((int) ( (this.getX()  )/ 60 ),(int) ((this.getY() + 45) / 60 ), "détruit");

		} else if ( CadrillageMap.typeDeDécor[(int) ( this.getX()  / 60 )][(int) ((this.getY()- 45 )/ 60 )].equals("destructible") ){
			CadrillageMap.setTypeDeDécor((int) ( (this.getX()  )/ 60 ),(int) ((this.getY() - 45) / 60 ), "détruit");

		} else if ( CadrillageMap.typeDeDécor[(int) ( (this.getX() - 45) / 60 )][(int) (this.getY() / 60 )].equals("destructible") ){
			CadrillageMap.setTypeDeDécor((int) ( (this.getX() - 45 )/ 60 ),(int) ((this.getY()) / 60 ), "détruit");

		} else if ( CadrillageMap.typeDeDécor[(int) ( this.getX()  / 60 )][(int) (this.getY() / 60 )].equals("destructible") ){
			CadrillageMap.setTypeDeDécor((int) ( (this.getX()  )/ 60 ),(int) ((this.getY()) / 60 ), "détruit");

		}
	}


	public int getÉtat() {
		return état;
	}

	public void setÉtat(int état) {
		this.état = état;
	}

	public long getStart() {
		return start;
	}

	public void setStart(long start) {
		this.start = start;
	}

	public long getStartEtat() {
		return startEtat;
	}

	public void setStartEtat(long startEtat) {
		this.startEtat = startEtat;
	}

	public boolean isEstPrésent() {
		return estPrésent;
	}

	public float getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public float getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}



}
