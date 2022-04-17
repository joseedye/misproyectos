/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import ufps.util.colecciones_seed.Pila;

/**
 *
 * @author acer
 */
public class Facultad {
 byte cod_facultad;
 Pila <Libro> libros;

    public Facultad() {
    }

    public Facultad(byte cod_facultad, Pila<Libro> libros) {
        this.cod_facultad = cod_facultad;
        this.libros = libros;
    }

    

    public byte getCod_facultad() {
        return cod_facultad;
    }

    public Pila<Libro> getLibros() {
        return libros;
    }

    public void setLibros(Pila<Libro> libros) {
        this.libros = libros;
    }
    

    public void setCod_facultad(byte cod_facultad) {
        this.cod_facultad = cod_facultad;
    }

    @Override
    public String toString() {
        return "Facultad{" + "cod_facultad=" + cod_facultad + ", libros=" + libros + '}';
    }

    
 
}
