
package serealizando;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Serealizando {

    public static void main(String[] args) 
    {
        Administrador jefe = new Administrador("Jairo", 38000, 2005, 12,15);
        jefe.setIncentivo(5000);
        jefe.subirSueldo(10);
        
        Empleado[] personal = new Empleado[3];
        
        personal[0]=jefe;
        personal[1]= new Empleado ("Rosa", 25000, 2008, 10,1);
        personal[2]= new Empleado ("Nelsy", 18000, 2012, 9,15);
        try
        {
            try (ObjectOutputStream escribiendo_fichero = new ObjectOutputStream(new FileOutputStream("k:/Pruebas/empleado.dat"))) {
                escribiendo_fichero.writeObject(personal);
                escribiendo_fichero.close();
            }
            
            Empleado[] personal_recuperado;
            
            try (ObjectInputStream recuperando_fichero = new ObjectInputStream(new FileInputStream("k:/Pruebas/empleado.dat"))) {
                personal_recuperado = (Empleado[]) recuperando_fichero.readObject();
            }
            
            for(Empleado e: personal_recuperado)
            {
                System.out.println(e);
            }
        }catch(Exception e)
        {}
    }
    
}
