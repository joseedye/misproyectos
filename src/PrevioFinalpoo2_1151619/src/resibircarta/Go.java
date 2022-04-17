/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package resibircarta;

import java.util.Random;
import java.util.concurrent.Semaphore;

/**
 *
 * @author acer
 */
public class Go {
    private static Semaphore recibeCarta,fabricaJugetes;
    private static int tam;
    
    
    
    //crear los semaforos y ejecutarlos
    public static void main(String[] args) {
         recibeCarta = new Semaphore(1,true);

       
        tam = 1;//(int) (Math.random() * (1 - 50 + 1) + 50);
      
	 //Throw concurrente proccess
//                tam = r.nextInt();
                for (int i = 0; i < tam; i++) {
//                    System.out.println("b");
                recibeCarta = new Semaphore(1,true);
                (new Thread(new RecibirCarta(recibeCarta))).start();
                 }
                System.out.println("se entregaron "+tam+" jugetes");
		 
		 
    
    
}
}
