package profesor ;
public class ProfesorOcacional extends Profesor {
    String nombre;
    String apellido;
    String edad;
    float salario;
    public ProfesorOcacional(String nombre, String apellido, String edad,float salario) {
        super(nombre, apellido, edad);
        this.nombre=nombre;
        this.apellido=apellido;
        this.edad=edad;
        this.salario=salario;
    }
    
    public float salario(){
        return this.salario;
    }

    @Override
    public String toString() {
        return "ProfesorOcacional{" + "nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + '}';
    }

    @Override
    public float importeNomina() {
       return (float)4.5*salario;
          }
    
}
