
package tiendamascotas.Modelo;

/**
 *
 * @author jose eduardo
 */
public class Mascota {

 private Integer codigo;
 private String Nombre;
 private String Raza;
 private String Dueño;

    public Mascota() {
    }

    public Mascota(Integer codigo, String Nombre, String Raza, String Dueño) {
        this.codigo = codigo;
        this.Nombre = Nombre;
        this.Raza = Raza;
        this.Dueño = Dueño;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getRaza() {
        return Raza;
    }

    public void setRaza(String Raza) {
        this.Raza = Raza;
    }

    public String getDueño() {
        return Dueño;
    }

    public void setDueño(String Dueño) {
        this.Dueño = Dueño;
    }
 
 

    
}
