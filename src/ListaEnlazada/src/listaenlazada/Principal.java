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
public class Principal {
    public static void main(String[] args) {
        ListaEnlazada miLista = new ListaEnlazada();
        miLista.InsertarEnPrimero(10);
        miLista.InsertarEnPrimero(15);
        miLista.InsertarEnPrimero(30);
        miLista.InsertarEnPrimero(50);
        miLista.InsertarEnPrimero(40);
        miLista.InsertarEnPrimero(60);
        System.out.println(miLista.Listar());
        System.out.println("borrar");
       // miLista.borrarUltimo();
        miLista.borrarPosicion(3);
        System.out.println(miLista.Listar());
        System.out.println();
    }  
}
