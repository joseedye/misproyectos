/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Principal;

import Controlador.Controlador;
import tiendamascotas.vista.Vista;

/**
 *
 * @author jose eduardo
 */
public class Ejecutar {
    
    public static void main(String[] args) {
        Vista v = new Vista();
        Controlador c = new Controlador(v);
    }
    
    
    
}
