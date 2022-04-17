
package serealizando;
import java.io.*;

public class PruebaRuta
{
    public static void main(String args[])
    {
        File fichero = new File("k:" + File.separator + "pruebas");
        
        System.out.println(fichero.getAbsolutePath());
        System.out.println(fichero.exists());
    }
}
