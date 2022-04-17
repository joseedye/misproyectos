package Ventas;

public class Vendedor {
   String cedula;
   String nombre;

    public Vendedor() {
        super();
         cedula="";
         nombre = "";
    }

    public Vendedor(String cedula, String nombre) {
        this.cedula = cedula;
        this.nombre = nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Vendedor{" + "cedula=" + cedula + ", nombre=" + nombre + '}';
    }
   
   
   
}
