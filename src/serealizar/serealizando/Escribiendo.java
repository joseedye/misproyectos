
package serealizando;

import java.io.FileWriter;
import java.io.IOException;

public class Escribiendo
{
    public void Escribir(String ruta_archivo)
    {
        String frase = "Esta es una prueba de como crear un archivo de tipo texto...";
        
        try
        {
            FileWriter escritura = new FileWriter(ruta_archivo);
            for(int i=0; i<frase.length();i++)
            {
                escritura.write(frase.charAt(i));
            }
            escritura.close();
        }catch (IOException e){}
    }
    
}
