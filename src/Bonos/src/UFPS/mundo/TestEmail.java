package ufps.mundo;
import ufps.util.*;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Usuario
 */
public class TestEmail {
    
    /**
     *  Se tiene creada la cuenta ejemplo.email.ufps@gmail.com, 
     * para efectos de seguridad, se crea una segunda contraseña usando la verificación
     * de dos pasos de gmail: http://www.youtube.com/watch?v=zMabEyrtPRg&t=2m13s&noredirect=1 
     * la contraseña generada es: nfrbdxklxggkgoko
     * 
     * Para ejecutar el ejercicio debe descargar javamail.jar  y copiar en el lib "mail.jar"
     * 
     */
    
    
    public static void main(String args[])
    {
        String emailUsuarioEmisor="ejemplo.email.ufps@gmail.com";
        String clave="nfrbdxklxggkgoko";
        //Cambia el valor de la variable emailReceptor por el email que desee enviarle mensajes
        String emailReceptor="xxx@dominioxxx.com";
        ServicioEmail email=new ServicioEmail(emailUsuarioEmisor, clave);
        email.enviarEmail(emailReceptor, "Esto es un ejemplo", "Mi cuerpo del mensaje");
        
        
    
    
    }
    
}
