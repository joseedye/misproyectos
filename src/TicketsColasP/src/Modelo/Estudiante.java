/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author acer
 */
public class Estudiante {
    int codigo;
    String nombre;
    String email;
    byte semestre;

    public Estudiante() {
    }

    public Estudiante(int codigo, String nombre, String email, byte semestre) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.email = email;
        this.semestre = semestre;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public byte getSemestre() {
        return semestre;
    }

    public void setSemestre(byte semestre) {
        this.semestre = semestre;
    }

    @Override
    public String toString() {
        return "Estudiante{" + "codigo=" + codigo + ", nombre=" + nombre + ", email=" + email + ", semestre=" + semestre + '}';
    }
    
    
}
