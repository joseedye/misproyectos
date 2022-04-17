/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hilos;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author acer
 */
public class HilosVarios2 extends Thread{
Thread hilo;
    public HilosVarios2(Thread hilo) {
        this.hilo=hilo;
        
    }
    
    
    
    public void run (){
    try {
        hilo.join();
    } catch (InterruptedException ex) {
        Logger.getLogger(HilosVarios2.class.getName()).log(Level.SEVERE, null, ex);
    }
        for (int i = 0; i < 10; i++) {
            
            try {
                
               System.out.println("hola "+this.getName()); 
               Thread.sleep(300);
         
            } catch (Exception e) {
            }
            
        }
    };
    
    
}
