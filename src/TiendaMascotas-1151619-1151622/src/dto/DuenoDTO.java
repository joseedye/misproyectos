
package dto;

import dao.*;

/**
 *
 * @author jose eduardo
 */
public class DuenoDTO {
    
    private Integer Cedula;
    private String Nombre;
    private String Direccion;

    public DuenoDTO() {
    }

    public DuenoDTO(Integer Cedula, String Nombre, String Direccion) {
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
