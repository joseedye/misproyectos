/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iglesia;

import java.util.ArrayList;

/**
 *
 * @author acer
 */
public class Ejecutar extends Thread {

    public static void main(String[] args) {

        ArrayList<String> cola = new ArrayList();

        for (int i = 0; i < 500; i++) {
            int j = i + 1;
            String nombre = "persona numero " + j;
            cola.add(nombre);

        }

        Portero p = new Portero(cola);

//        p.run();
//         p.i.run();
(new Thread (p) ).start();
(new Thread (p.i) ).start();


    }
}
