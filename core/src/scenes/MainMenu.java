package scenes;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.audio.Music;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.physics.box2d.Box2DDebugRenderer;
import com.badlogic.gdx.physics.box2d.World;
import com.mygdx.game.GameMain;

import characters.Dompteuse;
import characters.Ghost;
import characters.MainCharacter;
import characters.Marchand;
import characters.Pnj;
import characters.SnowMan;
import characters.Tigre;
import characters.VieuxMarchand;
import decors.DonjonGlace;
import decors.Totem;
import interactionClavier.AlphabetEtAcquisition;
import items.Arc;
import items.Bombe;
import items.Bouclier;
import items.CoeurDeVie;
import items.Coffre;
import items.Epee;
import items.Essence;
import items.Flèches;
import items.GantDeForce;
import items.Plume;
import items.Potion;
import items.Torche;
import map.CadrillageMap;
import map.zoneDesert.GestionDesMapsZoneDesert;
import map.zoneDesert.PlacementMainZoneDesert;
import map.zoneGlace.GestionDesMapsZoneGlace;
import map.zoneGlace.IglooC1;
import map.zoneGlace.IglooC5;
import map.zoneGlace.PlacementMainZoneGlace;
import map.zoneGlace.SousMapD5;
import map.zoneGlace.SousMapF1;
import menus.Carte;
import menus.MenuDémarrer;
import menus.MenuGameover;
import menus.MenuPause;
import menus.MenuSac;
import sauvegarde.AcceptClass;
import sauvegarde.Sauvegarde;
import sauvegarde.SendClass;

public class MainMenu implements Screen{

    public static World world;
	private GameMain game;

    // définition du personnage principal
	public static MainCharacter Link;

	/*
	définition des items
    */
	public static Epee épée = new Epee();
	public static Plume plume = new Plume();
	public static GantDeForce gantDeForce = new GantDeForce();
	public static Bouclier bouclier = new Bouclier();
	public static Bombe bombe = new Bombe();
	public static Arc arc = new Arc();
	public static Potion potion = new Potion();
    public static Torche torche = new Torche();

    // définition de la musique ( même si pas utiliser au final )
    public static Music music =  Gdx.audio.newMusic(Gdx.files.internal("musique/Lamabe.mp3"));

    // définition de la classe sauvegarde
	public static Sauvegarde sauvegarde  = AcceptClass.acceptClass();
//	= AcceptClass.acceptClass() à utiliser en cas de nouvelle class sauvegarde

    // ces deux fonctions aident à voir les corps en jeu
	public static OrthographicCamera box2DCamera;
	private Box2DDebugRenderer debugRenderer;
	
	public static long start;
	
	public static float PPM = 1.5f; // "vitesse" du joueur
	
	public static BitmapFont font ;

	public MainMenu(GameMain game){

//		fonctions libGDX

//        musique démarrage
        music.play();
        music.setLooping(true); // joue la musique en boucle
        music.dispose();

        this.game = game;

		box2DCamera = new OrthographicCamera();
		box2DCamera.setToOrtho(false, 600 / MainMenu.PPM, 480 /MainMenu.PPM);
		box2DCamera.position.set(300,240,0);

		this.debugRenderer = new Box2DDebugRenderer();

        // permet d'écrire en jeu
		font = new BitmapFont();

        // défini les propriétés du jeu, fonction libgdx
		world = new World(new Vector2(0,0),true);

        //Caractérisation du personnage principal
//        Link = new MainCharacter(world, 4, 1, 4 , 400 , 200 , "bas");
        Link = new MainCharacter(world, 4, 1, 4 , -50 , -50 , "bas");

        // récupération des données de la sauvegarde
        sauvegarde.chargerSauvegarde();


//      // Utile pour développer, au lieu d'aller chercher les items on les a déjà
//		MenuSac.setItem(plume);
//		MenuSac.setItem(épée);
//		MenuSac.setItem(gantDeForce);
//		MenuSac.setItem(bombe);
//		MenuSac.setItem(arc);
//		MenuSac.setItem(bouclier);
//        MenuSac.setItem(potion);
//		bombe.setNombreItem(40);
//        Flèches.nombreFlèche = 30;
//        MenuSac.setItem(torche);

        // placement des items récupérés dans le sac quand le joueur ouvre de nouveau le jeu
		if ( Epee.isEpéePrise )	MenuSac.setItem(épée);
		if ( Bouclier.isBouclierPris) MenuSac.setItem(bouclier);
        if ( Plume.isPlumePrise) MenuSac.setItem(plume);
        if ( GantDeForce.isGantDeForcePris) MenuSac.setItem(gantDeForce);
        if ( Bombe.isBombeRécupéré ) {
            MenuSac.setItem(bombe);
            bombe.setNombreItem(sauvegarde.nombreBombe );
        }
        if ( Arc.isArcPris) MenuSac.setItem(arc);
        if ( Potion.isPotionRécupérer ) MenuSac.setItem(potion);
        if ( Torche.isTorchePrise ) MenuSac.setItem(torche);

		start = System.currentTimeMillis();

		CadrillageMap.setTypeDeDécor();
		CadrillageMap.setDécoChangéFaux();


	}

    // acquisition des choix du joueur pour le game over
	void updateGO(float dt){
		if (Gdx.input.isKeyJustPressed(Input.Keys.S) ){
			if ( MenuGameover.choix == 1) MenuGameover.choix++;	
			else MenuGameover.choix = 1;
		} else if (Gdx.input.isKeyJustPressed(Input.Keys.Z)){
			if ( MenuGameover.choix == 2) MenuGameover.choix--;	
			else MenuGameover.choix =2;
		}
		if (Gdx.input.isKeyJustPressed(Input.Keys.ENTER) ){
			if (MenuGameover.choix == 1) MenuGameover.isGO = false;
			else if (MenuGameover.choix == 2){
				MenuDémarrer.isInGame = false;
				MenuDémarrer.choix=0;
			}
		}
	}

    // acquisition des choix du joueur quand il est dans le sac
	void updateSac(float dt){
		if (Gdx.input.isKeyJustPressed(Input.Keys.Q) && MenuSac.itemSelect > 1){
			MenuSac.itemSelect--;		
		} else if (Gdx.input.isKeyJustPressed(Input.Keys.D) && MenuSac.itemSelect < 9){
			MenuSac.itemSelect++;	
		} else if (Gdx.input.isKeyJustPressed(Input.Keys.Z) && MenuSac.itemSelect > 3){
			MenuSac.itemSelect-=3;	
		} else if (Gdx.input.isKeyJustPressed(Input.Keys.S) && MenuSac.itemSelect <7){
			MenuSac.itemSelect+=3;
		}
		if (Gdx.input.isKeyJustPressed(Input.Keys.K) &&  MenuSac.itemSelect <= MenuSac.nbrItems){
			MenuSac.acquisitionItemsK();
		} else if (Gdx.input.isKeyJustPressed(Input.Keys.L) &&  MenuSac.itemSelect <= MenuSac.nbrItems){
			MenuSac.acquisitionItemsL();
		}
		
		
		if (Gdx.input.isKeyJustPressed(Input.Keys.M)){
			MenuSac.isSacAffiché = false;
		}
	}
	
//	premier scenario avec le fantôme 
	void updateSc1Ghost(float dt){
//		déplacement du joueur vers ghost
		if ( Link.getBody().getPosition().x > 275/PPM ) {
			Link.getBody().applyLinearImpulse(new Vector2(-100f,0), Link.getBody().getWorldCenter(), true);
			Link.setDirection("gauche");
			Link.représentationLink(Link);
		}
		else if ( Link.getBody().getPosition().x < 265/PPM ) {
			Link.getBody().applyLinearImpulse(new Vector2(100f,0), Link.getBody().getWorldCenter(), true);
			Link.setDirection("droite");
			Link.représentationLink(Link);
		} else {
			Link.getBody().setLinearVelocity(0,Link.getBody().getLinearVelocity().y);
			if ( Link.getBody().getPosition().y < 270/PPM ) {
				Link.getBody().applyLinearImpulse(new Vector2(0,+100f), Link.getBody().getWorldCenter(), true);
				Link.setDirection("haut");
				Link.représentationLink(Link);
			} else {
				Link.setTexture(MainCharacter.linkHautRepos);
				Link.getBody().setLinearVelocity(0,0);
			}
		}
		
//		choix du joueurs
		if ( Ghost.etatScenario != 7 && Ghost.etatScenario < 9  && Gdx.input.isKeyJustPressed(Input.Keys.ENTER)) {
			Ghost.etatScenario ++;
		} else if ( ( Ghost.etatScenario == 7 || Ghost.etatScenario == 10 ) && Gdx.input.isKeyJustPressed(Input.Keys.K) ){
			Ghost.etatScenario = 8;
		} else if ( ( Ghost.etatScenario == 7 || Ghost.etatScenario == 10 ) && Gdx.input.isKeyJustPressed(Input.Keys.L) ){
			Ghost.etatScenario = 14;
		} else if ( Ghost.etatScenario == 11 && Gdx.input.isKeyJustPressed(Input.Keys.ENTER) ){
			Ghost.etatScenario = 18;
		}
		if (Ghost.etatScenario == 9 ) AlphabetEtAcquisition.isAlphabetUtilisé = true;
	}
	
//	lorsque le joueur tape au clavier
	void updateAlEtAc(float dt){
		AlphabetEtAcquisition.acquisitionTouche();
	}


//	 ********************************************************************

    // update principale, elle permet toutes les acquisitions des touches en jeu et aussi
    // permet l'intéraction du personnage principale avec les décors et items et objets

	void updateInGame(float dt){
		if ( Link.isAlive){
			if ( Link.annimationAward){
//				annimation de récupération de l'épée
				Link.setTexture(MainCharacter.linkAward);
				Link.getBody().setLinearVelocity(Link.getBody().getLinearVelocity().x / 2f, Link.getBody().getLinearVelocity().y / 2f);
				if ( Gdx.input.isKeyJustPressed(Input.Keys.ENTER)){
					Link.annimationAward = false;
				}
			} else if (Epee.typeAttaque != 0){


				if ( Epee.typeAttaque != 0 ){

					if ( Epee.typeAttaque  == 1 ) {
						épée.annimationEpée(Link);
					} else if ( Epee.typeAttaque  == 2 ){
						épée.annimationEpéeTournante(Link);
					}

					if ( ! épée.dégatEffectué ){
						épée.utilisationItem(Link);
						épée.dégatEffectué = true;
					}
				}

			} else {
				if ( (Link.zone.equals("zoneGlace") && PlacementMainZoneGlace.défilement == false)
						|| (Link.zone.equals("zoneDesert") && PlacementMainZoneDesert.défilement == false) ){
	//				choix clavier du joueur
					
					if (Gdx.input.isKeyJustPressed(Input.Keys.ENTER ) ) {
						if ( PlacementMainZoneGlace.positionSousMap.equals("G1" )){
							if ( Totem.étatTexte >0 && Totem.étatTexte < 4 ) Totem.étatTexte ++ ;
							else if ( Totem.étatTexte == 5 ) Totem.étatTexte = 0;
						}
					}
					if ( Link.tombe){
						Link.setTexture(MainCharacter.linkTombé);
						if (System.currentTimeMillis() - Link.timerChute > 100) {
							Link.setSize(Link.getTexture().getWidth() / Link.tailleChute , Link.getTexture().getHeight() / Link.tailleChute );
							Link.timerChute = System.currentTimeMillis();
							Link.tailleChute += 0.3f;
							MainMenu.Link.getBody().setTransform(Link.getBody().getPosition().x + 2, Link.getBody().getPosition().y + 2, 0);

						}
						if (System.currentTimeMillis() - Link.timerChuteTotal > 1000) {
							Link.tailleChute = 1;
							Link.tombe = false;
							if (Link.getHealth() > 0) {
								MainMenu.Link.getBody().setTransform(PlacementMainZoneGlace.positionRelativeX, PlacementMainZoneGlace.positionRelativeY, 0);
							}

						}
					} else {
						if (Link.isHit) {


							if (System.currentTimeMillis() - Link.timerHit > 300) {
								Link.isHit = false;
							}
						} else if ( Plume.isPlumeUtilisée ){
							Plume.timerPlume(Link);
						} else {

							//					déplacement
							if (Gdx.input.isKeyPressed(Input.Keys.Q)) {
								Link.getBody().applyLinearImpulse(new Vector2(-100000f, 0), Link.getBody().getWorldCenter(), true);
								if (Bouclier.isBouclierUtilisé) ; // que le joueur garde sa défense
								else Link.setDirection("gauche");
								Link.représentationLink(Link);


							} else if (Gdx.input.isKeyPressed(Input.Keys.D)) {
								Link.getBody().applyLinearImpulse(new Vector2(+100000f, 0), Link.getBody().getWorldCenter(), true);
								if (Bouclier.isBouclierUtilisé) ; // que le joueur garde sa défense
								else Link.setDirection("droite");
								Link.représentationLink(Link);

							} else if (Gdx.input.isKeyPressed(Input.Keys.Z)) {
								Link.getBody().applyLinearImpulse(new Vector2(0, +100000f), Link.getBody().getWorldCenter(), true);
								if (Bouclier.isBouclierUtilisé) ; // que le joueur garde sa défense
								else Link.setDirection("haut");
								Link.représentationLink(Link);

							} else if (Gdx.input.isKeyPressed(Input.Keys.S)) {
								Link.getBody().applyLinearImpulse(new Vector2(0, -100000f), Link.getBody().getWorldCenter(), true);
								if (Bouclier.isBouclierUtilisé) ; // que le joueur garde sa défense
								else Link.setDirection("bas");
								Link.représentationLink(Link);

							} else {
								Link.getBody().setLinearVelocity(Link.getBody().getLinearVelocity().x / 1.2f, Link.getBody().getLinearVelocity().y / 1.2f);
								if (Link.getDirection().equals("bas")) {
									if (Bouclier.isBouclierUtilisé)
										Link.setTexture(MainCharacter.linkBasReposBouclier);
									else Link.setTexture(MainCharacter.linkBasRepos);
								} else if (Link.getDirection().equals("haut")) {
									if (Bouclier.isBouclierUtilisé)
										Link.setTexture(MainCharacter.linkHautReposBouclier);
									else Link.setTexture(MainCharacter.linkHautRepos);
								} else if (Link.getDirection().equals("gauche")) {
									if (Bouclier.isBouclierUtilisé)
										Link.setTexture(MainCharacter.linkGaucheReposBouclier);
									else Link.setTexture(MainCharacter.linkGaucheRepos);
								} else if (Link.getDirection().equals("droite")) {
									if (Bouclier.isBouclierUtilisé)
										Link.setTexture(MainCharacter.linkDroiteReposBouclier);
									else Link.setTexture(MainCharacter.linkDroiteRepos);
								}
							}


							if (!(Gdx.input.isKeyPressed(Input.Keys.Q)) && !(Gdx.input.isKeyPressed(Input.Keys.D)))
								Link.getBody().setLinearVelocity(Link.getBody().getLinearVelocity().x / 1.2f, Link.getBody().getLinearVelocity().y);
							if (!(Gdx.input.isKeyPressed(Input.Keys.Z)) && !(Gdx.input.isKeyPressed(Input.Keys.S)))
								Link.getBody().setLinearVelocity(Link.getBody().getLinearVelocity().x, Link.getBody().getLinearVelocity().y / 1.2f);


						}

//                        //	mettre le jeu en pause et sauvegarder pour le développeur
//						if (Gdx.input.isKeyJustPressed(Input.Keys.I)) {
//							if (Link.zone.equals("zoneGlace"))
//								sauvegarde = new Sauvegarde(Link , PlacementMainZoneGlace.positionSousMap, "zoneGlace");
//							else
//								sauvegarde = new Sauvegarde(Link, PlacementMainZoneDesert.positionSousMap, "zoneDesert");
//
//							SendClass.sendClass(sauvegarde);
//						}

						if (Gdx.input.isKeyJustPressed(Input.Keys.O)) {
							for (int l = 0; l < Pnj.nbrDeMonstres; l++)
								Pnj.monstres[l].getBody().setLinearVelocity(0, 0); // stopper le mouvement des monstres
							Link.getBody().setLinearVelocity(Link.getBody().getLinearVelocity().x / 100f, Link.getBody().getLinearVelocity().y / 100f);
							MenuPause.isPause = true;
						}
						if (Gdx.input.isKeyJustPressed(Input.Keys.P)) {
							for (int l = 0; l < Pnj.nbrDeMonstres; l++)
								Pnj.monstres[l].getBody().setLinearVelocity(0, 0);
							Link.getBody().setLinearVelocity(Link.getBody().getLinearVelocity().x / 100f, Link.getBody().getLinearVelocity().y / 100f);
							Carte.isAfficher = true;
						}


						//				intéraction avec l'environnement;
                        //  lorsqu'il est dans un igloo il n'a pas le droit d'utiliser un item
						if (Gdx.input.isKeyJustPressed(Input.Keys.K) && MenuSac.itemKOccupé
								&& !PlacementMainZoneGlace.positionSousMap.equals("IglooC1")
								&& !PlacementMainZoneGlace.positionSousMap.equals("IglooD3")
								&& !PlacementMainZoneGlace.positionSousMap.equals("IglooC5")) {
							MenuSac.itemsKL[0].utilisationItem(Link);
						} else if (Gdx.input.isKeyJustPressed(Input.Keys.L) && MenuSac.itemLOccupé
								&& !PlacementMainZoneGlace.positionSousMap.equals("IglooC1")
								&& !PlacementMainZoneGlace.positionSousMap.equals("IglooD3")
								&& !PlacementMainZoneGlace.positionSousMap.equals("IglooC5")) {
							MenuSac.itemsKL[1].utilisationItem(Link);
						} else if (Gdx.input.isKeyJustPressed(Input.Keys.M)) {
							for (int l = 0; l < Pnj.nbrDeMonstres; l++)
								Pnj.monstres[l].getBody().setLinearVelocity(0, 0);
							Link.getBody().setLinearVelocity(Link.getBody().getLinearVelocity().x / 100f, Link.getBody().getLinearVelocity().y / 100f);
							MenuSac.isSacAffiché = true;
						}
                        // cas particulier du bouclier et de l'épée pour la seconde attaque
                        // en effet, il faut que le joueur garde
                        // le doigt appuyé pour garder le bouclier actif ou lancer la seconde attaque
						if (Bouclier.isBouclierUtilisé && Gdx.input.isKeyPressed(Input.Keys.K)) {
							MenuSac.itemsKL[0].utilisationItem(Link);
						} else if (Bouclier.isBouclierUtilisé && Gdx.input.isKeyPressed(Input.Keys.L)) {
							MenuSac.itemsKL[1].utilisationItem(Link);
						} else if (Bouclier.isBouclierUtilisé && (!(Gdx.input.isKeyPressed(Input.Keys.K)) && !(Gdx.input.isKeyPressed(Input.Keys.L)))) {
							Bouclier.isBouclierUtilisé = false;
							MainCharacter.changementDeVitesse = true;
						}
						if (Bouclier.isBouclierUtilisé && Epee.isEpéeUtilisé) {
							Epee.typeAttaque = 1;
						} else {
							if (Epee.isEpéeUtilisé && (!(Gdx.input.isKeyPressed(Input.Keys.K)) && !(Gdx.input.isKeyPressed(Input.Keys.L)))) {
								if (System.currentTimeMillis() - Epee.timerToucheAppuyé > 700) {
									Epee.typeAttaque = 2;
								} else Epee.typeAttaque = 1;

							}
						}

                        //********************************** première zone *******************
                        // acquisition de la part du personnage principale des éléments apparessant sur le décors
						if (Link.zone.equals("zoneGlace")) {
							if (Link.getDirection().equals("haut")
									&& CadrillageMap.typeDeDécor[(int) (Link.getBody().getPosition().x * PPM / 60)][(int) (Link.getBody().getPosition().y * PPM / 60)].equals("épée")
									&& CadrillageMap.décorChangé[(int) (Link.getBody().getPosition().x * PPM / 60)][(int) (Link.getBody().getPosition().y * PPM / 60)] == false) {
								Epee.isEpéePrise = true;
								CadrillageMap.décorChangé[(int) (Link.getBody().getPosition().x * PPM / 60)][(int) (Link.getBody().getPosition().y * PPM / 60)] = true;
								MainMenu.Link.annimationAward = true;
								SousMapF1.destroyBody();
								MenuSac.setItem(épée);
							}
							;
							if (PlacementMainZoneGlace.positionSousMap.equals("IglooC1") && Link.getDirection().equals("haut") && !(Bouclier.isBouclierPris)
									&& Link.getX() > 420
									&& Link.getY() > 270) {
								Bouclier.isBouclierPris = true;
								MainMenu.Link.annimationAward = true;
								IglooC1.destroyBody();
								MenuSac.setItem(bouclier);
							}
							;
							Arc.détection(Link);
                            Torche.récupérationTorche();
							if (PlacementMainZoneGlace.positionSousMap.equals("IglooC5"))
								IglooC5.détectionItem(Link);
							Plume.récupérationPlume();
                            //	 démarage scenario 1
							if (Ghost.etatScenario == 0 && PlacementMainZoneGlace.positionSousMap.equals("IglooD3") && Link.getDirection().equals("haut")
									&& Link.getBody().getPosition().x > 190 / PPM && Link.getBody().getPosition().x < 410 / PPM
									&& Link.getBody().getPosition().y > 200 / PPM) {
								Ghost.etatScenario = 1;
								Link.getBody().setLinearVelocity(0, 0);

							}

                            Coffre.détectionCoffres( Link, PPM );
							SnowMan.détection(Link);
						} else if (Link.zone.equals("zoneDesert")) {
						}

						PlacementMainZoneGlace.setDéplacement(Link);
                        // détection des éléments de décors blessant le personnage principale
                        // uniquement lorsque la plume n'est pas utilisée
                        if ( ! Plume.isPlumeUtilisée
								&& Link.getBody().getPosition().x > 0 && Link.getBody().getPosition().x * PPM < 600
                                && Link.getBody().getPosition().y > 0 && Link.getBody().getPosition().y * PPM < 480) {
                            PlacementMainZoneGlace.détectionTrou(Link);
                            PlacementMainZoneGlace.détectionEauP(Link);
                        }
						Flèches.déplacement(Link);
                        //	Récuparation du réceptacle
						CoeurDeVie.détectionReceptable(Link);
                        //  Récupération des flèches à terre
                        Flèches.détectionFlèches(Link);
                        //	récupération de la vie par les coeurs de vie
						CoeurDeVie.détectionCoeur(Link);
                        //	Récupération essences
						Essence.détectionEssence(Link);
					}
				}
			}
            // Est ce que le joueur est mort?
			if ( MainMenu.Link.getHealth() <= 0) {
				MainMenu.Link.isAlive = false;
				MenuGameover.isGO = true;
				Link.getBody().setLinearVelocity(0, 0);
			}
		} else {
            //	'accélérer' le GameOver
			if (Gdx.input.isKeyJustPressed(Input.Keys.ENTER) ){
				MenuGameover.opacitéGO = 0.99f;
			}
		}
	}

	@Override
	public void show() {
		// TODO Auto-generated method stub

	}

	@Override
	public void render(float delta) {

        // code libgdx
		Gdx.gl.glClearColor(1, 0, 0, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		
		
		game.getBatch().begin();

        // vérification de l'état du jeu et affichage en fonction
		if ( ! MenuDémarrer.isInGame ){ // en jeu
			MenuDémarrer.affichageMenuDémarrer(game);
			MenuDémarrer.updateDémarrage(delta);
		} else {
			if (Link.isAlive && MenuGameover.isGO) { // game over
				MenuGameover.affichageMenuGO(game);
				updateGO(delta);
			} else if (MenuPause.isPause ) {        // menu pause
				MenuPause.updatePause(delta);
				MenuPause.affichageMenuPause(game);
			} else if ( Carte.isAfficher ) {        // carte
				Carte.updateCarte(delta);
				Carte.représentation(game);
			} else {
				if (MenuSac.isSacAffiché ) {        // sac
					updateSac(delta);
					MenuSac.affichéSac(game);
				} else {
//				appelle des fonctions update en fonction de l'état du jeu
                    if ( MainCharacter.etatScenario != -1 && MainCharacter.etatScenario != 10
                            && MainCharacter.etatScenario != 13 && MainCharacter.etatScenario != 17 )
                        MainCharacter.updateJoueur(delta);
                    else if (Ghost.etatScenario != 0 && Ghost.etatScenario != 9 && Ghost.etatScenario < 14)
						updateSc1Ghost(delta);
					else if (AlphabetEtAcquisition.isAlphabetUtilisé) updateAlEtAc(delta);
					else if (IglooC5.étatAchat > 0 && IglooC5.étatAchat < 10) VieuxMarchand.updateAchat(delta);
					else if (SnowMan.étatTexte > 0 && SnowMan.étatTexte < 11) SnowMan.update(delta);
					else if (SousMapD5.étatTexteTombe > 0) SousMapD5.updateTombe(delta);
					else if (Dompteuse.etatScenario != 0 && Dompteuse.etatScenario != 3 ) Dompteuse.updateDompteuse(delta);
                    else if (Marchand.etatScenario != 0 && Marchand.etatScenario < 7 ) Marchand.updateMarchand(delta);
					else updateInGame(delta);

					Link.updatePlayer();

                    // permet le défilement des maps quand le joueur change de map
					if (Link.zone.equals("zoneGlace")) {
						if (PlacementMainZoneGlace.défilement == false) {
							PlacementMainZoneGlace.posiSousMap(Link);
						}

						if (PlacementMainZoneGlace.défilement == true) {
							GestionDesMapsZoneGlace.défilementDeMap(game);
						} else {
							if ( ! Link.tombe )Link.setSize(Link.getTexture().getWidth(), Link.getTexture().getHeight());
							GestionDesMapsZoneGlace.affichageDeSousCarte(game);
						}
					} else if (Link.zone.equals("zoneDesert")) {
						if (PlacementMainZoneDesert.défilement == false) {
							PlacementMainZoneDesert.posiSousMap(Link);
						}

						if (PlacementMainZoneDesert.défilement == true) {
							GestionDesMapsZoneDesert.défilementDeMap(game);
						} else {
							if ( ! Link.tombe ) Link.setSize(Link.getTexture().getWidth(), Link.getTexture().getHeight());
							GestionDesMapsZoneDesert.affichageDeSousCarte(game);
						}
					}


					// affichage des coeurs de vie par terre
                    CoeurDeVie.représentationCoeur(game);
					// affichage des essences par terre
					Essence.représentationEssence(game);
                    // affichage des flèches par terre
                    Flèches.représentationFlèchesDrop(game);
                    // affichage des flèches tirées
					Flèches.représentationFlèches(game);
                    // affichage des bombes déposées
					Bombe.représentationBombe(game);
                    // affichage du tigre quand on la libéré
					Tigre.représentationPoursuite(world, game);


//				Link.setColor(0.8f,0.8f,0,1f); code qu'il aurait fallu utiliser pour changer la couleur du personnage

                    // affichage de la plume
                    if ( Plume.isPlumeUtilisée ){
                        game.getBatch().draw(Plume.plume, Link.getX()-5,Link.getY()-5);
                    }

                    //	affichage du personnage principal
					Link.draw(game.getBatch());

                    // cache noir quand le joueur est dans certaine pièce du donjon
                    // en fonction de l'état de l'item torche
                    if ( PlacementMainZoneGlace.positionSousMap.equals("DonjonSalle7")
                            || PlacementMainZoneGlace.positionSousMap.equals("DonjonSalle8")
                            || PlacementMainZoneGlace.positionSousMap.equals("DonjonSalle9") ) {
                        if (!Torche.isTorcheUtilisée)
                            game.getBatch().draw(DonjonGlace.ombreGlobale, MainMenu.Link.getX() - 643, MainMenu.Link.getY() - 465);
                        else
                            game.getBatch().draw(DonjonGlace.ombreGlobaleDiminué, MainMenu.Link.getX() - 643, MainMenu.Link.getY() - 465);
                    }
                }

			    // affichage du texte de la map des  totems
				if (Totem.étatTexte > 0) Totem.représentationTexte(game);
                // affichage du dialogue avec le fantome et de la fenêtre de réponse du joueur
				if (Ghost.etatScenario > 0 && Ghost.etatScenario < 14) Ghost.scenario1(game);
				if (AlphabetEtAcquisition.isAlphabetUtilisé)
					AlphabetEtAcquisition.affichageMot(game);
                //	affichage du dialogue avec le vieux marchand
				if (IglooC5.étatAchat > 0) VieuxMarchand.discussionAchat(game);
                //	affichage du dialogue avec le bonhomme de neige
				if (SnowMan.étatTexte > 0 && SnowMan.étatTexte < 11)
					SnowMan.représentationTexte(game);

				//		=============================================================================================
				//     						  affichage les items à la fois en jeu et dans menuSac
				// la potion affiche le temps avant la prochaine utilisation
                potion.affichageTemps();

				if (MenuSac.itemKOccupé) MenuSac.affichageItemK(game);
				if (MenuSac.itemLOccupé) MenuSac.affichageItemL(game);


				//		=============================================================================================
				//								affichage la vie à la fois en jeu et dans menuSac
				CoeurDeVie.représentationNombreCoeur(game, Link);

                //	affichage du nommbres d'essences que possède le joueur
				Essence.représentationNombreEssence(game, font);

				//		affichage du gameover
				MenuGameover.GameOver(game);
			}
		}

        // affichage de la sauvegarde
        MenuPause.affichageSauvegarde(game);

		game.getBatch().end();
		
		
//		afficher les corps pour visualiser ce avec quoi on travaille
//		this.debugRenderer.render(world, box2DCamera.combined);

        // code libgdx
		world.step(Gdx.graphics.getDeltaTime(), 6, 2);
		
	}

	@Override
	public void resize(int width, int height) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void pause() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void resume() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void hide() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void dispose() {
		// TODO Auto-generated method stub
		Link.getTexture().dispose();
	}

}
