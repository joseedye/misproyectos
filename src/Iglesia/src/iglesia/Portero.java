/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iglesia;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import static java.lang.Thread.sleep;
import java.util.ArrayList;
import java.util.Queue;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author acer
 */
public class Portero extends Thread{
   Iglesia i;
   ArrayList <String> cola = new ArrayList();
   Vista v = new Vista();
   
   public Portero(ArrayList cola){
       v.setVisible(true);
      i= new Iglesia(this);
      
       this.cola=cola;
   }

   public void run(){
        
        for(int i = 0; i <=50; i++){
            agg();
            try {
                sleep(500);
                

            } catch (InterruptedException ex) {
                
            }
        }
        this.i.run();
        if(!i.is_llena()){run();}
              
        
    }
  
   public void agg(){
   if(!i.is_llena()){
        i.entra.add(cola.get(0));
//        v.txt.setText(v.txt.getText() +"\nentro la persona "+cola.get(0).toString());
         cola.remove(0);
//        agg();
        }
   }
   
   public void salir (){
   
//   System.out.println(" se elimino la persona "+i.entra.get(0));
//  
   
    for(int k = 0; k <=1000; k++){
         try {
             if(i.entra.size()!=0){
//            v.txt.setText(v.txt.getText() +"\nsalio la persona "+i.entra.get(0).toString());
             i.entra.remove(0);}
           
                sleep(1000);
                
            } catch (InterruptedException ex) {
                
            }
        }
      
//   agg();
   //generar hilo
    }

   
   }
  
