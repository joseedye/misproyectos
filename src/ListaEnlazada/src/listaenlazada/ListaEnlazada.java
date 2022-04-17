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
public class ListaEnlazada {
    Nodo primero;
      
     public ListaEnlazada(){
         primero = null;
     } 
    
     public boolean vacia (){
     if(primero==null){
        return(true);
     }else{
        return (false);
      }
  }

   public void InsertarEnPrimero(int Dato){
       Nodo Temporal = new Nodo(Dato);//crea el primer nodo temporal
       Temporal.siguiente = primero;  //corre al primero
       primero = Temporal;//lo coloca d e primero
   }
   
   public void borrarPrimero (){
   primero = primero.siguiente;
   }
   
   public String Listar(){
   String dato= "" ;
   Nodo aux = primero;
   
   while (aux!=null){
    dato+="{"+aux.info+"}";   
    aux = aux.siguiente; 
   }
   return (dato);
   }
   
   public void borrarUltimo(){
    Nodo anterior = primero;
    Nodo actual= primero;
    
    while (actual.siguiente != null){
        anterior=actual;
        actual=actual.siguiente;
         }
    anterior.siguiente = null;
    
   }
   
     public void borrarPosicion(int pos){
     Nodo anterior = primero;
     Nodo actual = primero;
     int k=0;
     if(pos>0){
        while (k!=pos && actual.siguiente !=null){
            anterior = actual;
            actual = actual.siguiente;
            k++;
            System.out.println("k "+k);
        }
        anterior.siguiente=actual.siguiente;
     }
     }      
        }
     