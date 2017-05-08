package map.zoneGlace;

import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.physics.box2d.Body;
import com.badlogic.gdx.physics.box2d.World;
import com.mygdx.game.GameMain;

import decors.ClimatMontagneux;
import map.CadrillageMap;
import scenes.MainMenu;

public class SousMapA4 extends Sprite{
	
	public static Body bodyMurGauche1;	
	public static boolean isBodyMurGauche1Created;
	
	public static Body bodyMurGauche2;	
	public static boolean isBodyMurGauche2Created;



    public static Body cote1 ;
    public static boolean isCote1Created;
    public static Body cote2 ;
    public static boolean isCote2Created;
    public static Body cote3 ;
    public static boolean isCote3Created;
    public static Body cote4 ;
    public static boolean isCote4Created;
    public static Body cote5 ;
    public static boolean isCote5Created;
    public static Body cote6 ;
    public static boolean isCote6Created;
	
	public static void sousMap(GameMain game, int x, int y){
		
		ClimatMontagneux.eauProfondeGlacée(game,0+ x, 0+y);
		ClimatMontagneux.eauProfondeGlacée(game,0+ x, 60+y);
		ClimatMontagneux.eauProfondeGlacée(game,0+ x, 120+y);
		ClimatMontagneux.eauProfondeGlacée(game,0+ x, 180+y);
		ClimatMontagneux.eauProfondeGlacée(game,0+ x, 240+y);
		ClimatMontagneux.eauProfondeGlacée(game,0+ x, 300+y);
		ClimatMontagneux.eauProfondeGlacée(game,0+ x, 360+y);
		ClimatMontagneux.eauProfondeGlacée(game,0+ x, 420+y);
		
		ClimatMontagneux.eauProfondeGlacée(game,60+ x, 0+y);
		ClimatMontagneux.eauProfondeGlacée(game,60+ x, 60+y);
		ClimatMontagneux.eauProfondeGlacée(game,60+ x, 120+y);
		ClimatMontagneux.eauProfondeGlacée(game,60+ x, 180+y);
		ClimatMontagneux.eauProfondeGlacée(game,60+ x, 240+y);
		ClimatMontagneux.eauProfondeGlacée(game,60+ x, 300+y);
		ClimatMontagneux.eauProfondeGlacée(game,60+ x, 360+y);
		ClimatMontagneux.eauProfondeGlacée(game,60+ x, 420+y);
		
		game.getBatch().draw(ClimatMontagneux.glace1, 120+ x, 0+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 120+ x, 60+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 120+ x, 120+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 120+ x, 180+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 120+ x, 240+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 120+ x, 300+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 120+ x, 360+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 120+ x, 420+ y);
		
		game.getBatch().draw(ClimatMontagneux.glace1, 180+ x, 0+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 180+ x, 60+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 180+ x, 120+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 180+ x, 180+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 180+ x, 240+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 180+ x, 300+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 180+ x, 360+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 180+ x, 420+ y);
		
		game.getBatch().draw(ClimatMontagneux.glace1, 240+ x, 0+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 240+ x, 60+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 240+ x, 120+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 240+ x, 180+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 240+ x, 240+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 240+ x, 300+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 240+ x, 360+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 240+ x, 420+ y);
		
		game.getBatch().draw(ClimatMontagneux.glace1, 300+ x, 0+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 300+ x, 60+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 300+ x, 120+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 300+ x, 180+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 300+ x, 240+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 300+ x, 300+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 300+ x, 360+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 300+ x, 420+ y);
		
		game.getBatch().draw(ClimatMontagneux.glace1, 360+ x, 0+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 360+ x, 60+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 360+ x, 120+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 360+ x, 180+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 360+ x, 240+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 360+ x, 300+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 360+ x, 360+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 360+ x, 420+ y);
		
		game.getBatch().draw(ClimatMontagneux.glace1, 420+ x, 0+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 420+ x, 60+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 420+ x, 120+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 420+ x, 180+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 420+ x, 240+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 420+ x, 300+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 420+ x, 360+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 420+ x, 420+ y);
		
		game.getBatch().draw(ClimatMontagneux.glace1, 480+ x, 0+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 480+ x, 60+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 480+ x, 120+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 480+ x, 180+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 480+ x, 240+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 480+ x, 300+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 480+ x, 360+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 480+ x, 420+ y);
		
		game.getBatch().draw(ClimatMontagneux.glace1, 540+ x, 0+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 540+ x, 60+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 540+ x, 120+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 540+ x, 180+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 540+ x, 240+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 540+ x, 300+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 540+ x, 360+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 540+ x, 420+ y);
		
//		
		
		game.getBatch().draw(ClimatMontagneux.bordGlacéSup, 540+ x, 300+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéSupDroi, 480+ x, 360+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéDroi, 420+ x, 420+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéGau, 300+ x, 420+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéSupGau, 240+ x, 360+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéSup, 180+ x, 300+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéSupGau, 120+ x, 300+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéGau, 120+ x, 240+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéGau, 120+ x, 180+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéGau, 120+ x, 120+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéGau, 120+ x, 60+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéGau, 120+ x, 0+ y);
		
		game.getBatch().draw(ClimatMontagneux.bordGlacéGau, 120+ x, 420+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéGau, 120+ x, 360+ y);

//
		game.getBatch().draw(ClimatMontagneux.murSombreGlacéCentre2, 540 + x , 295 + y);
        game.getBatch().draw(ClimatMontagneux.bordGlacéSup, 540 + x , 235 + y);
        game.getBatch().draw(ClimatMontagneux.bordGlacéDroi, 480 + x , 295 + y);

        game.getBatch().draw(ClimatMontagneux.tree, 450+ x, 360+ y);

        game.getBatch().draw(ClimatMontagneux.arbreSommetGauche, 420+ x, 360+ y);
        game.getBatch().draw(ClimatMontagneux.arbreSommetDroite, 480+ x, 360+ y);
        game.getBatch().draw(ClimatMontagneux.arbreCentreGauche, 420+ x, 300+ y);
        game.getBatch().draw(ClimatMontagneux.arbreCentreDroite, 480+ x, 300+ y);
		game.getBatch().draw(ClimatMontagneux.arbreCentreGauche, 420+ x, 240+ y);
		game.getBatch().draw(ClimatMontagneux.arbreCentreDroite, 480+ x, 240+ y);
		game.getBatch().draw(ClimatMontagneux.arbreBasGauche, 420+ x, 180+ y);
		game.getBatch().draw(ClimatMontagneux.arbreBasDroite, 480+ x, 180+ y);
		game.getBatch().draw(ClimatMontagneux.arbreBasGauche, 480+ x, 120+ y);
		game.getBatch().draw(ClimatMontagneux.arbreSommetGauche, 480+ x, 180+ y);
		game.getBatch().draw(ClimatMontagneux.arbreBasMilieu, 540+ x, 120+ y);
		game.getBatch().draw(ClimatMontagneux.arbreSommetMilieu, 540+ x, 180+ y);


        PlacementMainZoneGlace.détectionEscalier(MainMenu.Link);
	}

	public static void destroyBody() {
		// TODO Auto-generated method stub
//		murs gauches
		
		if ( isBodyMurGauche2Created)MainMenu.world.destroyBody(bodyMurGauche2);
		isBodyMurGauche2Created = false;
		
		if ( isBodyMurGauche1Created)MainMenu.world.destroyBody(bodyMurGauche1);
		isBodyMurGauche1Created = false;


        if ( isCote1Created) MainMenu.world.destroyBody(cote1);
        isCote1Created = false;

        if ( isCote2Created) MainMenu.world.destroyBody(cote2);
        isCote2Created = false;

        if ( isCote3Created) MainMenu.world.destroyBody(cote3);
        isCote3Created = false;

        if ( isCote4Created) MainMenu.world.destroyBody(cote4);
        isCote4Created = false;

        if ( isCote5Created) MainMenu.world.destroyBody(cote5);
        isCote5Created = false;

        if ( isCote6Created) MainMenu.world.destroyBody(cote6);
        isCote6Created = false;

    }

	public static void createBodyAndType(World world) {
		// TODO Auto-generated method stub
//		murs gauches
        CadrillageMap.setTypeDeDécor(9,5,"Escalier");
        CadrillageMap.setTypeDeDécor(8,5,"Escalier");

		if ( isBodyMurGauche2Created == false ) {
			bodyMurGauche2 = ClimatMontagneux.createBody(00,240,1,480);
			isBodyMurGauche2Created = true;
		}
		
		if ( isBodyMurGauche1Created == false ) {
			bodyMurGauche1 = ClimatMontagneux.createBody(110,180,1,360);
			isBodyMurGauche1Created = true;
		}



        if ( isCote1Created == false ) {
            cote1 = ClimatMontagneux.createBody(570,350,90,1);
            isCote1Created = true;
        }
        if ( isCote2Created == false ) {
            cote2 = ClimatMontagneux.createBody(465,300,110,210);
            isCote2Created = true;
        }
        if ( isCote3Created == false ) {
            cote3 = ClimatMontagneux.createBody(570,170,120,100);
            isCote3Created = true;
        }
//        if ( isCote4Created == false ) {
//            cote4 = ClimatMontagneux.createBody(300,440,600,60);
//            isCote4Created = true;
//        }
//        if ( isCote5Created == false ) {
//            cote5 = ClimatMontagneux.createBody(560,390,60,180);
//            isCote5Created = true;
//        }
//        if ( isCote6Created == false ) {
//            cote6 = ClimatMontagneux.createBody(460,440,240,60);
//            isCote6Created = true;
//        }
	}

	public static void destroyType() {
		// TODO Auto-generated method stub

	}
}
