package profesor;

public class ProfesorCatedra extends Profesor {
    String nombre;
    String apellido;
    String edad;
    String categoria;
    public ProfesorCatedra(String nombre, String apellido, String edad ,String categoria) {
        super(nombre, apellido, edad);
        this.nombre=nombre;
        this.apellido=apellido;
        this.edad=edad;
        this.categoria=categoria;
    }

    @Override
    public String toString() {
        return "ProfesorCatedra{" + "nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + '}';
    }

    @Override
    public float importeNomina() {
        float rta=0;
        if (categoria.equals("instructor")){rta=1000000;}
        if (categoria.equals("auxiliar")){rta=2000000;}
        if (categoria.equals("asociado")){rta=3000000;}
        if (categoria.equals("titular")){rta=4000000;}
     return rta;   
    }
    
}
