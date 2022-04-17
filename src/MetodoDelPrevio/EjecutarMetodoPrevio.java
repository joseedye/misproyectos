/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MetodoDelPrevio;

/** 
 *
 * @author jose eduardo rozo
 */
public class EjecutarMetodoPrevio {
    
    public static void main(String[] args) {
         
     ListaCD <Integer> lista = new ListaCD <>();
        for (int i = 0; i < 10; i++) {
            lista.insertarAlFinal(i);
        }
        System.out.println(lista);
        
        ListaCD <Integer> lista2 = new ListaCD <>();
        for (int i = 0; i < 5; i++) {
            lista2.insertarAlFinal(i);
        }
        System.out.println(lista2);
        lista.insertarDespuesDe(lista2,5); 
        System.out.println("lista 1 \n "+lista+"\n lista 2 \n "+lista2);
    }
  
}
