/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package variosjavaclasepreparar;

/**
 *
 * @author MADARME
 */
public class Util {
    
    public <T> void imprimir(T obj)
    {
     System.out.println("Imprimo un objeto de la clase:"+obj.getClass().getSimpleName()+": "+obj.toString());
    }
    
    public <T> String compararDosObjetos(T obj1, T obj2)
    {
        if(obj1.equals(obj2))
        {
            return "Son iguales los objetos tipo:"+obj1.getClass().getSimpleName();
        }
     return "No son iguales los objetos tipo:"+obj1.getClass().getSimpleName();
    }
    
    
}
