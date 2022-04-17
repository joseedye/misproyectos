/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listaenlazada;

/**
 *
 * @author acer
 */
public class Nodo {
  int dato;
  Nodo siguiente;
  int info;
  
    public Nodo (int dato){
        this.dato=dato;   
        this.info=dato;
    }
 public void verNodo(){
     System.out.println("{"+info+"}");
   }    
}
