package NewProyect;
public class Huesped {
    
    private String nombre;
    private String cedula;
    private int edad;

    public Huesped(String nombre, String cedula, int edad) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Huesped{" + "nombre=" + nombre + ", cedula=" + cedula + ", edad=" + edad + '}';
    }
    
    
    
    
    
}
