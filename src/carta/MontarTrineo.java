/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carta;

import java.util.concurrent.Semaphore;

/**
 *
 * @author acer
 */
public class MontarTrineo extends Thread {
    
    
    protected Semaphore orgaizarEnBolsa; 
    protected Semaphore renoslistos; 


    public MontarTrineo(Semaphore orgaizarEnBolsa) {
        this.orgaizarEnBolsa = orgaizarEnBolsa;
         renoslistos = new Semaphore(1,true);
    }
    
    
    
    
    
     public void run()  {
          
		try {
			this.orgaizarEnBolsa.acquire();
			
			} catch(Exception e) {
				e.printStackTrace();
			}
		try {
			sleep(400);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("se montaron los jugetes al trineo");
                
                this.renoslistos.release(1);
                (new Thread(new RenosListos(renoslistos,orgaizarEnBolsa))).start();
	}
    
}
