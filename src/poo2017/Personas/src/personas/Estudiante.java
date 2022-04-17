package personas;
public class Estudiante extends Personas implements Interface1 {
int nota1,nota2,nota3;
    public Estudiante(String nombre, int cedula,int nota,int not,int no) {
        super(nombre, cedula);
        this.nota1=nota;
        this.nota2=not;
        this.nota3=no;
    }

    @Override
    public double nota() {
    double rta=0;
    if(comprobarNota(nota1)&&comprobarNota(nota2)&&comprobarNota(nota3)){
    rta = (nota1+nota2+nota3)/3;}
    return rta;
    }
    
    public boolean comprobarNota(double notas){
    boolean rta=false;
    if(notas<=maximaNota){rta=true;}
    return rta;
    }
    
    public String getNombre (){
    return this.nombre;
    }
    
}
