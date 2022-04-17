/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author acer
 */
public class Libro {
    long cod_libro;
    String nombre ;

    public Libro() {
    }

    public Libro(long cod_libro, String nombre) {
        this.cod_libro = cod_libro;
        this.nombre = nombre;
    }

    public long getCod_libro() {
        return cod_libro;
    }

    public void setCod_libro(long cod_libro) {
        this.cod_libro = cod_libro;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Libro{" + "cod_libro=" + cod_libro + ", nombre=" + nombre + '}';
    }
    
    
  
    
}
