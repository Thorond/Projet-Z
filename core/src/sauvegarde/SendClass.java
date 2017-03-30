package sauvegarde;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

import map.PlacementMain;

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
      System.out.println(PlacementMain.positionSousMap);
   }catch(IOException ioe){
      System.out.println(ioe);
    }
  }
}