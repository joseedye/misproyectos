/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package resibircarta;

import static java.lang.Thread.sleep;
import java.util.concurrent.Semaphore;

/**
 *
 * @author acer
 */
public class OrganizarJugetes extends Thread{
    
    
    protected Semaphore fabricarJugetes; 
    protected Semaphore montaraltrineo; 

    public OrganizarJugetes(Semaphore fabricarJugetes) {
        this.fabricarJugetes = fabricarJugetes;
         montaraltrineo = new Semaphore(1,true);
    }
    
    
    
    
    
     public void run()  {
          
		try {
			this.fabricarJugetes.acquire();
			
			} catch(Exception e) {
				e.printStackTrace();
			}
		try {
			sleep(600);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("se organizo los jugetes en bolsa");
                
                this.montaraltrineo.release(1);
                (new Thread(new MontarTrineo(montaraltrineo))).start();
	}
    
    
    
}
