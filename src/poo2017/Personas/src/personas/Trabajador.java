package personas;
public class Trabajador extends Personas{
    double sueldo;
    public Trabajador(String nombre, int cedula,double sueldo) {
        super(nombre, cedula);
        this.sueldo=sueldo;
    }
    public void subirSueldo(double nuevoSueldo){
    this.sueldo=nuevoSueldo;
    }
    
    @Override
    public int cedula(){
    return this.cedula;
    }
}
