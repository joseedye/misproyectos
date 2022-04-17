/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package resibircarta;

import java.util.concurrent.Semaphore;

/**
 *
 * @author acer
 */
public class FabricarJugetes extends Thread{

   protected Semaphore carta;
   protected Semaphore organizarenbolsa;
    
    public FabricarJugetes(Semaphore carta) {
        this.carta = carta;
        organizarenbolsa = new Semaphore(1,true);
    }
    
    
    public void run()  {
     		try {
                	this.carta.acquire();

			sleep(400);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("se fabrico el jugete");
                this.organizarenbolsa.release(1);
                (new Thread(new OrganizarJugetes(organizarenbolsa))).start();

	}
        
    }
    
    

