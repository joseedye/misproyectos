/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iglesia;

import java.awt.List;
import static java.lang.Thread.sleep;
import java.util.ArrayList;

/**
 *
 * @author acer
 */
public class Iglesia implements Runnable {

    ArrayList<String> entra;
    int maximo = 50;
    Portero p;
    public Iglesia(Portero p) {
        entra = new ArrayList();
        this.p =p;
    }

    @Override
    public void run() {
      for(int i = 0; i <=50; i++){
            p.salir();
            try {
               sleep(500);

            } catch (InterruptedException ex) {
                
            }
        }
    }

    public boolean is_llena() {
        return entra.size() == maximo;
    }



}
