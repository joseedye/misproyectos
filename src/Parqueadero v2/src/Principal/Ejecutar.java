/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Principal;

import Conexion.Conexion;
import Controlador.Controlador;
import Vista.*;

/**
 *
 * @author jose eduardo
 */
public class Ejecutar {
    
    public Ejecutar(){
    Vistas v = new Vistas();
    Controlador c = new Controlador(v);
    }
    
    
    public static void main(String[] args) {
        Ejecutar e = new Ejecutar();
    }
    
    
    
}
