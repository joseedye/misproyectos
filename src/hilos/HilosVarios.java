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
public class HilosVarios extends Thread{
    
    public void run (){
        for (int i = 0; i < 10; i++) {
            
            try {
                
               System.out.println("hola "+this.getName()); 
               Thread.sleep(300);
         
            } catch (Exception e) {
            }
            
        }
    };
    
    
}
