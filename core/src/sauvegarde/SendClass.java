package sauvegarde;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

import map.zoneGlace.PlacementMainZoneGlace;

import java.io.IOException;

public class SendClass
{
  public static void sendClass(Sauvegarde obj)
  {
    try{ 
      FileOutputStream fos = new FileOutputStream("../Sauvegarde.ser"); 
      ObjectOutputStream oos = new ObjectOutputStream(fos);
      oos.writeObject(obj);
      oos.close();
      fos.close();
      System.out.println("Serialzation Done!!");
      System.out.println(PlacementMainZoneGlace.positionSousMap);
   }catch(IOException ioe){
      System.out.println(ioe);
    }
  }
}