/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SumadorConcurrente;

/**
 *
 * @author acer
 */
public class PruebaThrSum {
 
    
    public static void main(String[] args) {
       int datArr [] = new int [1000];
        for (int i = 0; i < 1000; i++) {
            datArr[i]= (int) (Math.random() * (1 - 10 + 1) + 10);
//            System.out.println(datArr[i]);
        }
        
        //crear y lanzar hilos
        for (int i = 0; i < 100; i++) {
            ThrSum t = new ThrSum((int) (Math.random() * (1 - 300 + 1) + 300),(int) (Math.random() * (1 - 300 + 1) + 300),datArr);
            t.start();
        }
        
    }
    
    
}
