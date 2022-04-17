/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ufps.mundo;
import ufps.util.*;
/**
 *
 * @author Usuario
 */
public class TestLeerArchivoURL {
    
    public static void main(String args[])
    {
    ArchivoLeerURL file=new ArchivoLeerURL("http://sandbox1.ufps.edu.co/datos/datos.txt");
    Object v[]=file.leerArchivo();
    for(Object datos:v)
        System.out.println(datos.toString());
    
    
    }
    
}
