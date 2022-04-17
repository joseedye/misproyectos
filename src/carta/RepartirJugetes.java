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
public class RepartirJugetes extends Thread {

    protected Semaphore renosListos; 

    public RepartirJugetes(Semaphore renosListos) {
        this.renosListos = renosListos;
    }
    
    
    
    
    
     public void run()  {
          
		try {
			this.renosListos.acquire();
                        this.join();
                        
			} catch(Exception e) {
				e.printStackTrace();
			}
		try {
			sleep(600);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("se repartieron los jugetes");
	}
}
