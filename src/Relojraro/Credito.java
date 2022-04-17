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
class Credito {
    int tasa; int meses;  int valorCredito;
    int cantidadTotalIntereses=0;
        void algoritmo(){
        int valorFijo = valorCredito/meses;   int valorParcial=valorCredito;       
        while (valorParcial!=0){
          int interesMensual = (valorParcial*4)/100;
          cantidadTotalIntereses = interesMensual+cantidadTotalIntereses;
          valorParcial=valorParcial-valorFijo;                   
        }
    }
    
    public static void main (String [] args)
    { 
        Credito r = new Credito();
        Consola c = new Consola();
        r.valorCredito=c.leerEntero("valor del credito");
        r.tasa=c.leerEntero("tasa");
        r.meses=c.leerEntero("meses ");
        r.algoritmo();
        c.imprimir("cantidad total de intereses "+r.cantidadTotalIntereses);
            }
}
