package serealizando;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Creando 
{
    public static void main(String args[])
    {
        File folder = new File("k:" + File.separator + "pruebas"+ File.separator + "Rosa");   
        folder.mkdir();
        
        File ruta = new File("k:" + File.separator + "pruebas"+ File.separator + "Jairo.txt");  
        String archivo_destino = ruta.getAbsolutePath();
        
        try
        {
            ruta.createNewFile();
        } catch (IOException ex) {
            Logger.getLogger(Creando.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        Escribiendo acceder = new Escribiendo();
        acceder.Escribir(archivo_destino);
        
        System.out.println(folder.getAbsolutePath());
        System.out.println(folder.exists());
        
        System.out.println(ruta.getAbsolutePath());
        System.out.println(ruta.exists());
    }
}

