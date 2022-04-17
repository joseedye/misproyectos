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
public class ThrSum extends Thread{

    public int inicial;
    public int fin ;
    int valor;
    int []a;
    
    public ThrSum(int inicial,int fin,int[] a) {
    this.inicial= inicial;
    this.fin=fin;
    this.a=a;
    }
    //posicion de l segmento a sumar
    
    public void run(){
        for (int i = inicial; i < fin; i++) {
           valor = valor+a[i]; 
        }
        System.out.println("se sumo el valor de "+ valor);
    }
    
    
            
}
