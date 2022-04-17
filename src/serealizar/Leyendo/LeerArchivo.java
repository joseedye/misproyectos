
package Leyendo;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author Jairo
 */
public class LeerArchivo 
{
    public void Leer()
    {
     try {
         
          FileReader Leer=new FileReader("b:" + File.separator + "pruebas"+ File.separator + "Jairo.txt");
          int c=Leer.read();
          
          while(c!=-1)
          {
              char letra= (char)c;
              System.out.print(letra);
              c=Leer.read();
          }
         } catch (IOException ex){
           System.out.println("No se encontro el Achivo");
         }
    }
}