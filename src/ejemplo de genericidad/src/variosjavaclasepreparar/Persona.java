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
public class Persona {
    
    private String nombre;
    private long cc;

    public Persona() {
    }

    public Persona(String nombre, long cc) {
        this.nombre = nombre;
        this.cc = cc;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public long getCc() {
        return cc;
    }

    public void setCc(long cc) {
        this.cc = cc;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", cc=" + cc + '}';
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 41 * hash + (int) (this.cc ^ (this.cc >>> 32));
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Persona other = (Persona) obj;
        if (this.cc != other.cc) {
            return false;
        }
        return true;
    }
    
    
    
}
