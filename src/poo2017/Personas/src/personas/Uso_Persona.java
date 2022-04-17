package personas;

import java.util.Arrays;

public class Uso_Persona {
    public static void main(String[] args) {
        int [] numeros = {2,6,3,1,4,5,9,7,8};
    Trabajador trabajador2 = new Trabajador ("trabajador 2",02,250000);
    trabajador2.subirSueldo(300000);
    Personas [] misPersonas = new Personas[3];
    misPersonas [0] = new Estudiante("edye",100,5,4,2);
    misPersonas [1] = new Trabajador("yeny",1004,500000);
    misPersonas [2] = trabajador2;
    Estudiante nuevoEstudiante = (Estudiante)misPersonas[0];
    Trabajador nuevoEstudiant = (Trabajador)misPersonas[1];
    double nota = nuevoEstudiante.nota();
    double sueldo = trabajador2.sueldo;
    double sueldo2 = nuevoEstudiant.sueldo;
    System.out.println("el estudiante "+ misPersonas[0].getNombre()+" tiene un promedio de "+nota+" y su cedula es "+ +misPersonas[0].cedula);
    System.out.println("el trabajador "+misPersonas[1].getNombre()+" tiene un sueldo de "+ sueldo2 +" y su cedula es "+ misPersonas[1].cedula());
    System.out.println("el trabajador "+misPersonas[2].getNombre()+" tiene un sueldo de"+sueldo+" y su cedula es "+misPersonas[2].cedula);
//    if(nuevoEstudiante instanceof Trabajador){
//        System.out.println("es estudiante");}
   Arrays.sort(numeros);
System.out.println("\n numeros :");
for(int x : numeros)
{System.out.println(" "+x);
}
    }
    }
