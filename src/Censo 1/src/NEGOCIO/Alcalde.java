/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package NEGOCIO;

/**
 *
 * @author estudiante
 */
public class Alcalde {

    private String nombre;
    private String SueldoBase;
    private String direccion;
    private String cedula;

    public Alcalde(String nom,String sueldoBase,String direccion,String cedula){
    this.SueldoBase=sueldoBase;
    this.cedula=cedula;
    this.direccion=direccion;
    this.nombre=nom;


    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getSueldoBase() {
        return SueldoBase;
    }

    public void setSueldoBase(String SueldoBase) {
        this.SueldoBase = SueldoBase;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    
    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }
}
