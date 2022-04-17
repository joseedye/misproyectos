/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Negocio.SistemaTicket;

/**
 *
 * @author acer
 */
public class Vista {
    SistemaTicket st;

    public Vista() {
        st = new SistemaTicket();
    }
    
    public static void main(String[] args) {
        Vista v = new Vista();
    }
    
    
}
