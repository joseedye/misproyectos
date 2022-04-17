/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciocolas;

/**
 *
 * @author jose eduardo rozo
 */
public class EjercicioColas {

   // metodo que reconoce se por cada dos "a" hay una "b", sin inportar er orden
    public boolean esReconocedor(String cadena){
        if (cadena.isEmpty())
            throw new RuntimeException("EXPRESION VACIA");
        
         Pila<String> p = new Pila<>();
         
         char [] cadenaDos = cadena.toCharArray();
         
       for (int i = 0; i < cadenaDos.length; i++) {
          
            if('a' == cadenaDos[i]){
                p.apilar("a");
            }
            else 
            {
               if('b' == cadenaDos[i]){
                   if(p.getTamanio()<2){return (false);}
                p.desapilar();
                p.desapilar();
            }
                
            }
            
        }
        return p.esVacia();
    }
    
    // metodo que reconoce se por cada dos "a" hay una "b", ordenadamente
    public boolean esReconocedorOrdenada(String cadena){
        if (cadena.isEmpty())
            throw new RuntimeException("EXPRESION VACIA");
        
         Pila<String> p = new Pila<>();
         boolean puedoAgregar = true;
         char [] cadenaDos = cadena.toCharArray();
         
       for (int i = 0; i < cadenaDos.length; i++) {
          
            if('a' == cadenaDos[i]&&puedoAgregar){
                p.apilar("a");
            }
            else 
            {
               if('b' == cadenaDos[i]){
                   if(p.getTamanio()<2){return (false);}
                   
                p.desapilar();
                p.desapilar();
                puedoAgregar=false;
            }
                
            }
            
        }
        return p.esVacia();
    }
    
}

