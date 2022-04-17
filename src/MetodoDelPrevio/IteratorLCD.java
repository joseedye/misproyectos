package MetodoDelPrevio;

import java.util.Iterator;

public class IteratorLCD<T> implements Iterator<T>
{
    
    ////////////////////////////////////////////////////////////
    // IteratorLCD - Atributos /////////////////////////////////
    ////////////////////////////////////////////////////////////
    
    /*
     * Nodo cabecera de la Lista
     */
    private NodoD<T> cab;            
    
    /*
     * Nodo de la Lista a Iterar
     */
    private NodoD<T> posicion;   
    
    
    
	
    ////////////////////////////////////////////////////////////
    // IteratorLCD - Implementacion de Metodos /////////////////
    ////////////////////////////////////////////////////////////
    
    /**
     * Constructor con parametros de la clase <br>
     * <b> post: </b> Se crea un iterador de lista circular doble. <br>
     * @param cab es de tipo Nodo<T> que contiene el nodo cabeza de la lista
     */
    IteratorLCD(NodoD<T> cab) {

        this.cab=cab;                       
        this.posicion=this.cab.getSig();

    }
    
    /**
     * Metodo que informa si existe otro elemento en la lista para seguir iterando<br>
     * <b> post: </b> Se retorna si existen aun datos por iterar en la Lista. <br>
     * @return un tipo boolean que informa si existe o no un dato en la lista, desde la posición 
     * actual del cursor.
     */
    @Override
    public boolean hasNext() {
            return (this.posicion!=this.cab);
    }
    
    /**
     * Metodo que retorna un dato de la posición actual del cursor del iterador.<br>
     * <b> post: </b> Se ha retornado el dato en la posicion actual de la iteracion. <br>
     * El cursor queda en la siguiente posición.
     * @return un tipo T que contiene el dato actual
     */
    @Override
    public T next() {
        if(!this.hasNext())
            return (null);
        this.posicion=this.posicion.getSig();
        return(this.posicion.getAnt().getInfo());
    }
    
    /**
     *
     */
    @Override
    public void remove() {}

}//Fin  de la clase IteratorLCD