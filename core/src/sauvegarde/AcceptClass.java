package sauvegarde;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.IOException;

public class AcceptClass {

 public static Sauvegarde acceptClass()
 {
    Sauvegarde o=null;
    try{
      FileInputStream fis = new FileInputStream("../Sauvegarde.ser");
      ObjectInputStream ois = new ObjectInputStream(fis);
      o = (Sauvegarde)ois.readObject();
      ois.close();
      fis.close();
    }
    catch(IOException ioe)
    {
       ioe.printStackTrace();
       return o;
    }catch(ClassNotFoundException cnfe)
     {
       System.out.println("Sauvegarde Class is not found.");
       cnfe.printStackTrace();
       return o;
     }
    return o;
 }
}
