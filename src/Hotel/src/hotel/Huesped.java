package hotel;
/**
 *
 * @author jose eduardo rozo
 */
public class Huesped {
    String nombre;
    int cedula ;
    int edad;

    public Huesped(String nombre, int cedula, int edad) {
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

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
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
