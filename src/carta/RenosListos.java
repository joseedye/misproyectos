/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carta;

import static java.lang.Thread.sleep;
import java.util.concurrent.Semaphore;

/**
 *
 * @author acer
 */
public class RenosListos extends Thread{
    
    
    protected Semaphore organizarEnBolsa,montarTrineo; 
    protected Semaphore repartir; 


    public RenosListos(Semaphore organizarEnBolsa,Semaphore montarTrineo) {
        this.montarTrineo = montarTrineo;
        this.organizarEnBolsa=organizarEnBolsa;
        repartir = new Semaphore(1,true);
    }
    
    
    
    
    
     public void run()  {
          
		try {
			this.organizarEnBolsa.acquire();
                        this.montarTrineo.acquire();
			
			} catch(Exception e) {
				e.printStackTrace();
			}
		try {
			sleep(600);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Renos listos");
                
                (new Thread(new RepartirJugetes(repartir))).start();
	}
    
}
