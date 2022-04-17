package serealizando;

import java.io.File;

public class AccesoFicheros 
{
     public static void main(String args[])
    {
        File ruta = new File("k:" + File.separator + "pruebas");
        
        System.out.println(ruta.getAbsolutePath());
        System.out.println(ruta.exists());
         
        String[] nombresArchivos = ruta.list();
         
        for (int i=0; i<nombresArchivos.length; i++)
         {
             System.out.println(nombresArchivos[i]);
             
             File f= new File(ruta.getAbsolutePath(),nombresArchivos[i]);
             
             if (f.isDirectory())
             {
                  String[] archivosSubcarpetas = f.list();
                  
                  for (int j=0; j<archivosSubcarpetas.length; j++)
                  {
                      System.out.println(archivosSubcarpetas[j]);
                  }
             }
         }
    }
    
}
