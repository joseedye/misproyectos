
package tiendamascotas.Modelo;

/**
 *
 * @author jose eduardo
 */
public class Dueño {
    
    private Integer Cedula;
    private String Nombre;
    private String Direccion;

    public Dueño() {
    }

    public Dueño(Integer Cedula, String Nombre, String Direccion) {
        this.Cedula = Cedula;
        this.Nombre = Nombre;
        this.Direccion = Direccion;
    }

    public Integer getCedula() {
        return Cedula;
    }

    public void setCedula(Integer Cedula) {
        this.Cedula = Cedula;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }
    
    
    
    
}
