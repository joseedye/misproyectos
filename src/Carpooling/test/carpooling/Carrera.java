/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carpooling;

/**
 *
 * @author estudiante
 */
public class Carrera {
    
    private String nombre;
    private String telefono;
    private String medioPago;
    private String lugarOrigen;
    private String lugarDestino;
    private String estado;

    public Carrera(String nombre, String telefono, String medioPago, String lugarOrigen, String lugarDestino, String estado) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.medioPago = medioPago;
        this.lugarOrigen = lugarOrigen;
        this.lugarDestino = lugarDestino;
        this.estado = estado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getMedioPago() {
        return medioPago;
    }

    public void setMedioPago(String medioPago) {
        this.medioPago = medioPago;
    }

    public String getLugarOrigen() {
        return lugarOrigen;
    }

    public void setLugarOrigen(String lugarOrigen) {
        this.lugarOrigen = lugarOrigen;
    }

    public String getLugarDestino() {
        return lugarDestino;
    }

    public void setLugarDestino(String lugarDestino) {
        this.lugarDestino = lugarDestino;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    

    @Override
    public String toString() {
        return "Carrera : " + "nombre= " + nombre + ", telefono= " + telefono +
                ", medioPago= " + medioPago + ", lugarOrigen= " + lugarOrigen +
                ", lugarDestino= " + lugarDestino + ", estado= " + estado;
    }
    
    
    
    
    
}
