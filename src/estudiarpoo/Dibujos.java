/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estudiarpoo;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author acer
 */
public class Dibujos extends Thread {
    
    Carrera c ;
    int max = 600;
    int x = 0,y=0;
    
    public Dibujos(Carrera c,int x) {
    this.c=c;
    this.x =x;
    this.y =x;
        }
    
    public void run(){
        while(x<max||y<max){
            x=x+getIntegerRandom(3,10);
            y=y+getIntegerRandom(3,10);
            
            try {
                Thread.sleep(70);
                c.pintar1(x);
                c.pintar2(y);
            } catch (InterruptedException ex) {
                Logger.getLogger(Dibujos.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
        
        if(x>y){System.out.println("gano el 1");}
        if(y>=x){System.out.println("gano el 2");}
        
        
    }
    
    
    public int getIntegerRandom(int MIN, int MAX) {
        return (int) (Math.random() * (MIN - MAX + 1) + MAX);
    }
    
}
