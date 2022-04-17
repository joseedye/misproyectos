package personas;
public class Personas {
String nombre ;
int cedula;
int Id;
int IdSiguiente =0;

    public Personas(String nombre, int cedula) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.Id = IdSiguiente;
        IdSiguiente = IdSiguiente +1;
    }

    public String getNombre (){
    return this.nombre;
    }
    
    public int cedula(){
    return this.cedula;
    }
}
