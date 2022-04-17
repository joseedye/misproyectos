/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hilos;

/**
 *
 * @author acer
 */
public class Hilos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
            HilosVarios uno  = new HilosVarios();
            HilosVarios2 dos  = new HilosVarios2(uno);
            uno.start();
            dos.start();
    }
    
}
