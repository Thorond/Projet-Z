package map;

import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.physics.box2d.Body;
import com.badlogic.gdx.physics.box2d.World;
import com.mygdx.game.GameMain;

import decors.ClimatMontagneux;
import decors.DonjonGlace;
import decors.Totem;
import scenes.MainMenu;

public class SousMapG1 extends Sprite{
	
	public static Body grossePierre1;
	public static boolean isGrossePierre1Created;
	public static Body grossePierre2;
	public static boolean isGrossePierre2Created;
	public static Body grossePierre3;
	public static boolean isGrossePierre3Created;
	public static Body grossePierre4;
	public static boolean isGrossePierre4Created;
	public static Body grossePierre5;
	public static boolean isGrossePierre5Created;
	public static Body grossePierre6;
	public static boolean isGrossePierre6Created;
	public static Body grossePierre7;
	public static boolean isGrossePierre7Created;
	
	public static Body totem1;
	public static boolean isTotem1Created;
	public static Body totem2;
	public static boolean isTotem2Created;
	
	public static Body gate1;
	public static boolean isGate1Created;
	public static Body gate2;
	public static boolean isGate2Created;
	
	public static Body torche1;
	public static boolean istorche1Created;
	public static Body torche2;
	public static boolean istorche2Created;
	
	public static Body bord1;
	public static boolean isbord1Created;
	public static Body bord2;
	public static boolean isbord2Created;
	
	public static void sousMap(GameMain game, int x, int y){
		
		game.getBatch().draw(ClimatMontagneux.glace1, 0+ x, 0+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 0+ x, 60+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 0+ x, 120+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 0+ x, 180+ y);		
		game.getBatch().draw(ClimatMontagneux.glace1, 0 + x,240 + y);
		game.getBatch().draw(ClimatMontagneux.glace1, 0+ x, 300+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 0+ x, 360+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 0+ x, 420+ y);
		
		game.getBatch().draw(ClimatMontagneux.glace1, 60+ x, 0+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 60+ x, 60+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 60+ x, 120+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 60+ x, 180+ y);		
		game.getBatch().draw(ClimatMontagneux.glace1, 60+ x, 240+ y);	
		game.getBatch().draw(ClimatMontagneux.glace1, 60+ x, 300+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 60+ x, 360+ y);
		game.getBatch().draw(ClimatMontagneux.glace1, 60+ x, 420+ y);
		
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
//		décoration 
		
		game.getBatch().draw(ClimatMontagneux.bordGlacéSupDroi, 0+ x, 0+ y);
		game.getBatch().draw(ClimatMontagneux.murSombreGlacéCentre, 0+ x, 60+ y);
		game.getBatch().draw(ClimatMontagneux.murSombreGlacéCentre, 0+ x, 120+ y);
		game.getBatch().draw(ClimatMontagneux.murSombreGlacéCentre, 0+ x, 180+ y);
		game.getBatch().draw(ClimatMontagneux.murSombreGlacéCentre, 0+ x, 240+ y);
		game.getBatch().draw(ClimatMontagneux.murSombreGlacéCentre, 0+ x, 300+ y);
		game.getBatch().draw(ClimatMontagneux.murSombreGlacéCentre2, 0+ x, 360+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéInfDroi, 0+ x, 420+ y);
		
		game.getBatch().draw(ClimatMontagneux.murSombreGlacéCentre, 60+ x, 0+ y);
		game.getBatch().draw(ClimatMontagneux.murSombreGlacéDroite3, 60+ x, 60+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéInfGau, 60+ x, 120+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéGau, 60+ x, 180+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéGau, 60+ x, 240+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéSupGau, 60+ x, 300+ y);
		game.getBatch().draw(ClimatMontagneux.murSombreGlacéGauche3, 60+ x, 360+ y);
		game.getBatch().draw(ClimatMontagneux.murSombreGlacéGauche, 60+ x, 420+ y);
		
		game.getBatch().draw(ClimatMontagneux.bordUni, 60+ x, 120+ y);
		game.getBatch().draw(ClimatMontagneux.bordUni, 60+ x, 180+ y);
		game.getBatch().draw(ClimatMontagneux.bordUni, 60+ x, 240+ y);
		game.getBatch().draw(ClimatMontagneux.bordUni, 60+ x, 300+ y);
		
		game.getBatch().draw(ClimatMontagneux.murSombreGlacéDroite3, 120+ x, 0+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéInfGau, 120+ x, 60+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéSupGau, 120+ x, 360+ y);
		game.getBatch().draw(ClimatMontagneux.murSombreGlacéGauche3, 120+ x, 420+ y);
		

		
		game.getBatch().draw(ClimatMontagneux.bordGlacéSupGau, 540+ x, 0+ y);
		game.getBatch().draw(ClimatMontagneux.murSombreGlacéCentre, 540+ x, 60+ y);
		game.getBatch().draw(ClimatMontagneux.murSombreGlacéCentre, 540+ x, 120+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéInf, 540+ x, 180+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéSup, 540+ x, 240+ y);
		game.getBatch().draw(ClimatMontagneux.murSombreGlacéCentre, 540+ x, 300+ y);
		game.getBatch().draw(ClimatMontagneux.murSombreGlacéCentre2, 540+ x, 360+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéInfGau, 540+ x, 420+ y);
		
		game.getBatch().draw(ClimatMontagneux.murSombreGlacéCentre,480+ x, 0+ y);
		game.getBatch().draw(ClimatMontagneux.murSombreGlacéGauche3, 480+ x, 60+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéInfDroi, 480+ x, 120+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéDroi, 480+ x, 180+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéDroi, 480+ x, 240+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéSupDroi, 480+ x, 300+ y);
		game.getBatch().draw(ClimatMontagneux.murSombreGlacéDroite3, 480+ x, 360+ y);
		game.getBatch().draw(ClimatMontagneux.murSombreGlacéDroite, 480+ x, 420+ y);
		
		game.getBatch().draw(ClimatMontagneux.murSombreGlacéGauche3, 420+ x, 0+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéInfDroi, 420+ x, 60+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéSupDroi, 420+ x, 360+ y);
		game.getBatch().draw(ClimatMontagneux.murSombreGlacéDroite3, 420+ x, 420+ y);
		
		game.getBatch().draw(ClimatMontagneux.bordUni, 120+ x, 60+ y);
		game.getBatch().draw(ClimatMontagneux.bordUni, 120+ x, 120+ y);
		game.getBatch().draw(ClimatMontagneux.bordUni, 120+ x, 180+ y);
		game.getBatch().draw(ClimatMontagneux.bordUni, 120+ x, 240+ y);
		game.getBatch().draw(ClimatMontagneux.bordUni, 120+ x, 300+ y);
		game.getBatch().draw(ClimatMontagneux.bordUni, 120+ x, 360+ y);
		
		game.getBatch().draw(ClimatMontagneux.bordUni, 180+ x, 60+ y);
		game.getBatch().draw(ClimatMontagneux.bordUni, 180+ x, 120+ y);
		game.getBatch().draw(ClimatMontagneux.bordUni, 180+ x, 180+ y);
		game.getBatch().draw(ClimatMontagneux.bordUni, 180+ x, 240+ y);
		game.getBatch().draw(ClimatMontagneux.bordUni, 180+ x, 300+ y);
		game.getBatch().draw(ClimatMontagneux.bordUni, 180+ x, 360+ y);
		game.getBatch().draw(ClimatMontagneux.bordUni, 180+ x, 420+ y);
		
		game.getBatch().draw(ClimatMontagneux.bordUni, 240+ x, 60+ y);
		game.getBatch().draw(ClimatMontagneux.bordUni, 240+ x, 120+ y);
		game.getBatch().draw(ClimatMontagneux.bordUni, 240+ x, 180+ y);
		game.getBatch().draw(ClimatMontagneux.bordUni, 240+ x, 240+ y);
		game.getBatch().draw(ClimatMontagneux.bordUni, 240+ x, 300+ y);
		game.getBatch().draw(ClimatMontagneux.bordUni, 240+ x, 360+ y);
		game.getBatch().draw(ClimatMontagneux.bordUni, 240+ x, 420+ y);
		
		game.getBatch().draw(ClimatMontagneux.bordUni, 480+ x, 120+ y);
		game.getBatch().draw(ClimatMontagneux.bordUni, 480+ x, 180+ y);
		game.getBatch().draw(ClimatMontagneux.bordUni, 480+ x, 240+ y);
		game.getBatch().draw(ClimatMontagneux.bordUni, 480+ x, 300+ y);
		
		game.getBatch().draw(ClimatMontagneux.bordUni, 420+ x, 60+ y);
		game.getBatch().draw(ClimatMontagneux.bordUni, 420+ x, 120+ y);
		game.getBatch().draw(ClimatMontagneux.bordUni, 420+ x, 180+ y);
		game.getBatch().draw(ClimatMontagneux.bordUni, 420+ x, 240+ y);
		game.getBatch().draw(ClimatMontagneux.bordUni, 420+ x, 300+ y);
		game.getBatch().draw(ClimatMontagneux.bordUni, 420+ x, 360+ y);
		
		game.getBatch().draw(ClimatMontagneux.bordUni, 360+ x, 60+ y);
		game.getBatch().draw(ClimatMontagneux.bordUni, 360+ x, 120+ y);
		game.getBatch().draw(ClimatMontagneux.bordUni, 360+ x, 180+ y);
		game.getBatch().draw(ClimatMontagneux.bordUni, 360+ x, 240+ y);
		game.getBatch().draw(ClimatMontagneux.bordUni, 360+ x, 300+ y);
		game.getBatch().draw(ClimatMontagneux.bordUni, 360+ x, 360+ y);
		game.getBatch().draw(ClimatMontagneux.bordUni, 360+ x, 420+ y);
		
		game.getBatch().draw(ClimatMontagneux.bordUni, 300+ x, 60+ y);
		game.getBatch().draw(ClimatMontagneux.bordUni, 300+ x, 120+ y);
		game.getBatch().draw(ClimatMontagneux.bordUni, 300+ x, 180+ y);
		game.getBatch().draw(ClimatMontagneux.bordUni, 300+ x, 240+ y);
		game.getBatch().draw(ClimatMontagneux.bordUni, 300+ x, 300+ y);
		game.getBatch().draw(ClimatMontagneux.bordUni, 300+ x, 360+ y);
		game.getBatch().draw(ClimatMontagneux.bordUni, 300+ x, 420+ y);
		
		game.getBatch().draw(ClimatMontagneux.bordGlacéInfGau, 180+ x, 0+ y);
		game.getBatch().draw(ClimatMontagneux.socle1, 240+ x, 240+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéSupGau, 180+ x, 420+ y);
	
		
		game.getBatch().draw(ClimatMontagneux.bordGlacéInfDroi, 360+ x, 0+ y);
		game.getBatch().draw(ClimatMontagneux.socle1, 300+ x, 240+ y);
		game.getBatch().draw(ClimatMontagneux.bordGlacéSupDroi, 360+ x, 420+ y);
		

		game.getBatch().draw(ClimatMontagneux.tree, 10+ x, 10+ y);
		game.getBatch().draw(ClimatMontagneux.tree, -30+ x, 0+ y);
		game.getBatch().draw(ClimatMontagneux.tree, 0+ x, -30+ y);
		game.getBatch().draw(ClimatMontagneux.tree, 30+ x, -60+ y);
		
		game.getBatch().draw(ClimatMontagneux.tree, 10+ x, 430+ y);
		game.getBatch().draw(ClimatMontagneux.tree, -30+ x, 430+ y);
		game.getBatch().draw(ClimatMontagneux.tree, 0+ x, 420+ y);
		
		game.getBatch().draw(ClimatMontagneux.tree, 530+ x, 10+ y);
		game.getBatch().draw(ClimatMontagneux.tree, 560+ x, 0+ y);
		game.getBatch().draw(ClimatMontagneux.tree, 530+ x, -30+ y);
		game.getBatch().draw(ClimatMontagneux.tree, 500+ x, -60+ y);
		
		game.getBatch().draw(ClimatMontagneux.tree, 530+ x, 430+ y);
		game.getBatch().draw(ClimatMontagneux.tree, 560+ x, 430+ y);
		game.getBatch().draw(ClimatMontagneux.tree, 530+ x, 420+ y);
		
		game.getBatch().draw(ClimatMontagneux.grossePierre, 1*60 + x, 2*60+ y);
		game.getBatch().draw(ClimatMontagneux.grossePierre, 2*60 + x, 4*60+ y);
		game.getBatch().draw(ClimatMontagneux.grossePierre, 4*60 + x, 6*60+ y);
		game.getBatch().draw(ClimatMontagneux.grossePierre, 5*60 + x, 7*60+ y);
		game.getBatch().draw(ClimatMontagneux.grossePierre, 7*60 + x, 4*60+ y);
		game.getBatch().draw(ClimatMontagneux.grossePierre, 5*60 + x, 2*60+ y);
		game.getBatch().draw(ClimatMontagneux.grossePierre, 7*60 + x, 6*60+ y);
		
		
//		totems et gate
		Totem.représentationTotems(game, x , y);
		if (!(Totem.jeuRésolu)  && mapChargé) {
			Totem.positionInitialLink();
			Totem.déplacementTotems();
		} else if (DonjonGlace.transitionGate ){
			DonjonGlace.annimationOuvertureGate(game, x, y);
		} else {
		}
		
		if ( !(Totem.jeuRésolu) ) game.getBatch().draw(DonjonGlace.gate2Fermé, 540+ x, 185+ y);
		else if ( Totem.jeuRésolu && !(DonjonGlace.transitionGate )) game.getBatch().draw(DonjonGlace.gate2Ouvert2, 527+ x, 147+ y);
		
//		torches
		ClimatMontagneux.annimationTorche(game, 3*60+x, 10+y);
		ClimatMontagneux.annimationTorche(game, 6*60+x, 10+y);
	}

	public static void destroyBody() {
		// TODO Auto-generated method stub
		
		if ( !( Totem.jeuRésolu) && mapChargé == false ){
			Totem.directionTotem1 = "bas";
			Totem.xTotem1 = 6; 
			Totem.yTotem1 = 1;
			Totem.directionTotem2 = "haut";
			Totem.xTotem2 = 3; 
			Totem.yTotem2 = 7; 
		}
		mapChargé = false;
		
		if ( isGrossePierre1Created) MainMenu.world.destroyBody(grossePierre1);
		isGrossePierre1Created = false;
		if ( isGrossePierre2Created) MainMenu.world.destroyBody(grossePierre2);
		isGrossePierre2Created = false;
		if ( isGrossePierre3Created) MainMenu.world.destroyBody(grossePierre3);
		isGrossePierre3Created = false;
		if ( isGrossePierre4Created) MainMenu.world.destroyBody(grossePierre4);
		isGrossePierre4Created = false;
		if ( isGrossePierre5Created) MainMenu.world.destroyBody(grossePierre5);
		isGrossePierre5Created = false;
		if ( isGrossePierre6Created) MainMenu.world.destroyBody(grossePierre6);
		isGrossePierre6Created = false;
		if ( isGrossePierre7Created) MainMenu.world.destroyBody(grossePierre7);
		isGrossePierre7Created = false;
		
		if ( isTotem1Created) MainMenu.world.destroyBody(totem1);
		isTotem1Created = false;
		if ( isTotem2Created) MainMenu.world.destroyBody(totem2);
		isTotem2Created = false;
		
		if ( isGate1Created) MainMenu.world.destroyBody(gate1);
		isGate1Created = false;
		if ( isGate2Created) MainMenu.world.destroyBody(gate2);
		isGate2Created = false;
		
		if ( istorche1Created) MainMenu.world.destroyBody(torche1);
		istorche1Created = false;
		if ( istorche2Created) MainMenu.world.destroyBody(torche2);
		istorche2Created = false;
		
		if ( isbord1Created) MainMenu.world.destroyBody(bord1);
		isbord1Created = false;
		if ( isbord2Created) MainMenu.world.destroyBody(bord2);
		isbord2Created = false;
		
	}
	
	public static boolean mapChargé = false;

	public static void createBodyAndType(World world) {
		// TODO Auto-generated method stub
		CadrillageMap.setTypeDeDécor(0, 1, "Trou");
		CadrillageMap.setTypeDeDécor(0, 2, "Trou");
		CadrillageMap.setTypeDeDécor(0, 3, "Trou");
		CadrillageMap.setTypeDeDécor(0, 4, "Trou");
		CadrillageMap.setTypeDeDécor(0, 5, "Trou");
		CadrillageMap.setTypeDeDécor(0, 6, "Trou");
		CadrillageMap.setTypeDeDécor(1, 0, "Trou");
		CadrillageMap.setTypeDeDécor(1, 1, "Trou");
		CadrillageMap.setTypeDeDécor(1, 6, "Trou");
		CadrillageMap.setTypeDeDécor(1, 7, "Trou");
		CadrillageMap.setTypeDeDécor(2, 0, "Trou");
		CadrillageMap.setTypeDeDécor(2, 7, "Trou");
		
		CadrillageMap.setTypeDeDécor(9, 1, "Trou");
		CadrillageMap.setTypeDeDécor(9, 2, "Trou");
		CadrillageMap.setTypeDeDécor(9, 3, "gate");
		CadrillageMap.setTypeDeDécor(9, 4, "gate");
		CadrillageMap.setTypeDeDécor(9, 5, "Trou");
		CadrillageMap.setTypeDeDécor(9, 6, "Trou");
		CadrillageMap.setTypeDeDécor(8, 0, "Trou");
		CadrillageMap.setTypeDeDécor(8, 1, "Trou");
		CadrillageMap.setTypeDeDécor(8, 6, "Trou");
		CadrillageMap.setTypeDeDécor(8, 7, "Trou");
		CadrillageMap.setTypeDeDécor(7, 0, "Trou");
		CadrillageMap.setTypeDeDécor(7, 7, "Trou");
		
		CadrillageMap.setTypeDeDécor(3, 0, "autre");
		CadrillageMap.setTypeDeDécor(4, 0, "autre");
		CadrillageMap.setTypeDeDécor(5, 0, "autre");
		CadrillageMap.setTypeDeDécor(6, 0, "autre");
		
		CadrillageMap.setTypeDeDécor(1, 2, "grossePierre");
		CadrillageMap.setTypeDeDécor(2, 4, "grossePierre");
		CadrillageMap.setTypeDeDécor(4, 6, "grossePierre");
		CadrillageMap.setTypeDeDécor(5, 7, "grossePierre");
		CadrillageMap.setTypeDeDécor(7, 4, "grossePierre");
		CadrillageMap.setTypeDeDécor(5, 2, "grossePierre");
		CadrillageMap.setTypeDeDécor(7, 6, "grossePierre");
		
		mapChargé = true;
		
		if ( isGrossePierre1Created == false ) {
			grossePierre1 = ClimatMontagneux.createBody(1*60 +15 , 2*60 + 15, 60,60);
			isGrossePierre1Created = true;
		}
		if ( isGrossePierre2Created == false ) {
			grossePierre2 = ClimatMontagneux.createBody(2*60 +15 , 4*60 +15 , 60,60);
			isGrossePierre2Created = true;
		}
		if ( isGrossePierre3Created == false ) {
			grossePierre3 = ClimatMontagneux.createBody(4*60 +15 , 6*60 +15 , 60,60);
			isGrossePierre3Created = true;
		}
		if ( isGrossePierre4Created == false ) {
			grossePierre4 = ClimatMontagneux.createBody(5*60 +15 ,7*60 +15 , 60,60);
			isGrossePierre4Created = true;
		}
		if ( isGrossePierre5Created == false ) {
			grossePierre5 = ClimatMontagneux.createBody(7*60 +15 ,4*60 +15 , 60,60);
			isGrossePierre5Created = true;
		}
		if ( isGrossePierre6Created == false ) {
			grossePierre6 = ClimatMontagneux.createBody(5*60 +15 ,2*60 +15 , 60,60);
			isGrossePierre6Created = true;
		}
		if ( isGrossePierre7Created == false ) {
			grossePierre7 = ClimatMontagneux.createBody( 7*60 +15 ,6*60 +15 ,60,60);
			isGrossePierre7Created = true;
		}
		
		if ( isTotem1Created == false ) {
			totem1 = ClimatMontagneux.createBody( Totem.xTotem1*60 +15 ,Totem.yTotem1*60 +15 ,60,60);
			isTotem1Created = true;
		}
		if ( isTotem2Created == false ) {
			totem2 = ClimatMontagneux.createBody( Totem.xTotem2*60 +15 ,Totem.yTotem2*60 +15 ,60,60);
			isTotem2Created = true;
		}
		
		if (!(Totem.jeuRésolu)  && mapChargé || DonjonGlace.transitionGate) {
			if ( isGate1Created == false ) {
				gate1 = ClimatMontagneux.createBody( 570  ,210 ,30,60);
				isGate1Created = true;
			}
			if ( isGate2Created == false ) {
				gate2 = ClimatMontagneux.createBody( 570 ,270 ,30,60);
				isGate2Created = true;
			}
//		} else if (DonjonGlace.transitionGate ){
		} else {
			if ( isGate1Created == false ) {
				gate1 = ClimatMontagneux.createBody( 570 ,180,30,60);
				isGate1Created = true;
			}
			if ( isGate2Created == false ) {
				gate2 = ClimatMontagneux.createBody( 570 ,300 ,30,60);
				isGate2Created = true;
			}
		}
		
		if ( istorche1Created == false ) {
			torche1 = ClimatMontagneux.createBody( 3*60 +15 ,0*60 +15 ,60,60);
			istorche1Created = true;
		}
		if ( istorche2Created == false ) {
			torche2 = ClimatMontagneux.createBody( 6*60 +15 ,0*60 +15 ,60,60);
			istorche2Created = true;
		}
		
		if ( isbord1Created == false ) {
			bord1 = ClimatMontagneux.createBody( 300 ,460 +15 ,600,1);
			isbord1Created = true;
		}
		if ( isbord2Created == false ) {
			bord2 = ClimatMontagneux.createBody( 20 ,240 +15 ,1,480);
			isbord2Created = true;
		}
	}

	public static void destroyType() {
		// TODO Auto-generated method stub
		
	}
}
