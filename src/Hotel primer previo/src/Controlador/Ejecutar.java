/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Hotel;
import Vistas.Hot;

/**
 *
 * @author acer
 */
public class Ejecutar {
    public static void main(String[] args) {
        Hotel hotel = new Hotel();
        Hot hh = new Hot();
        Control c = new Control(hotel,hh);
    }
    
}
