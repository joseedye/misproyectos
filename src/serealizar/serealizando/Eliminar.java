
package serealizando;

import java.io.File;

public class Eliminar 
{
    public static void main(String []args)
    {
         File ruta = new File("K:" + File.separator + "pruebas"+ File.separator + "Jairo.txt");  
         ruta.delete();
    }
}
