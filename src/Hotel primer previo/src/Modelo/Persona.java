
package Modelo;

/**
 *
 * @author estudiante
 */
public class Persona {
    
    String nombre;
    String apellido;
    long cedula;
    long telefono;

    public Persona(String nombre, String apellido, long cedula, long telefono) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.cedula = cedula;
        this.telefono = telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public long getCedula() {
        return cedula;
    }

    public void setCedula(long cedula) {
        this.cedula = cedula;
    }

    public long getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "\n huesped{" + "nombre=" + nombre + ", apellido=" + apellido + ", cedula=" + cedula + ", telefono=" + telefono + '}';
    }
    
    
    
}
