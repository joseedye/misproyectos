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
public class RecibirCarta extends Thread{

      protected Semaphore RecibirCarta;
      private static Semaphore fabricaJugetes;


    public RecibirCarta(Semaphore recibeCarta)  {
        this.RecibirCarta = recibeCarta;
         fabricaJugetes = new Semaphore(1,true);

    }

    
	public void run()  {
		try {
			sleep(400);
                      	this.RecibirCarta.acquire();


		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
                System.out.println("santa recibio la carta ");
		this.RecibirCarta.release(1);
                (new Thread(new FabricarJugetes(fabricaJugetes))).start();

	}
    }
    

