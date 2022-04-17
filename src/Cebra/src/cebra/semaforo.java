/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cebra;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Astrid Caicedo
 */
public class semaforo extends Thread {
    
    private int b ;
    private boolean e ;
    private String []color = new String [3] ;
    private String colo = "";
    private int cont ;

    private void hiloo() {
        this.color [0]= "ROJO";
        this.color [1]= "AMARILLO";
        this.color [2]= "VERDE";
        this.b = 0;
        this.e = true;
        this.cont = 0; 
    }
    
    
    @Override
    public void run(){
     this.hiloo();
     this.colorS();
        
    }
    private void colorS(){
          
        try {
            while (e){
                 for (int i = 0; i < color.length; i++) {
                if (color[i].equalsIgnoreCase("rojo") && e) {
                    b = 10;
                    colo = "ROJO";
                    System.out.println(colo);
                    Thread.sleep(b*1000);
                    
                }else 
                  if (color[i].equalsIgnoreCase("amarillo") && e) {
                    b = 3;
                    colo = ("AMARILLO");
                    System.out.println(colo);
                    Thread.sleep(b*1000);
                }else 
                    if (color[i].equalsIgnoreCase("verdE") && e) {
                    b = 5;
                    colo = ("VERDE");
                    System.out.println(colo);
                    Thread.sleep(b*1000);
                }
            }
            }
            this.stop();
           
            
        } catch (InterruptedException ex) {
            Logger.getLogger(semaforo.class.getName()).log(Level.SEVERE, null, ex);
        }
       
    }

    public void setE(boolean e) {
        this.e = e;
    }

    public String getColo() {
        return colo;
    }

    public boolean getE() {
        return e;
    }
    
    
}
