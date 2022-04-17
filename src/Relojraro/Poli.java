/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Relojraro;

/**
 *
 * @author joseeduardo
 */
class Poli {
    long numero;  boolean esPoli=false;
    void algoritmo(){
        long cantidad = numero;    boolean b=true; long prueba = numero;   
        long original=numero;      long cont=0;    
        while (b){
          while (cantidad !=0){cantidad = cantidad/10;   cont = cont +1;}
            
          if( prueba % cont == 0 ){cantidad= prueba/10; cont =0;}else {b=false;esPoli=false;}
          
          if (prueba>=0&&prueba<=9){b=false;esPoli=true;}
          prueba=cantidad;
         }
            }

    public static void main (String [] args)
    { 
        Poli r = new Poli();
        Consola c = new Consola();
        r.numero=c.leerLong("numero");
        r.algoritmo();
        if (r.esPoli==true){c.imprimir("esPoli");}else {c.imprimir("no esPoli");}
    }
}