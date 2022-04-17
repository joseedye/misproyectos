package profesor;

import java.util.ArrayList;

public class ListaProfesores {

    ArrayList <Profesor> arreglo; 
  
  public ListaProfesores(){
   arreglo = new ArrayList <Profesor>();
  }
  
  public String imprimirLista (int i){
    String rta=null;
    rta = "posicion "+i+" "+arreglo.get(i).toString();
    
    return rta;
    }
  
  public double importeTotalNominaProfesorado(){
      float rta = 0;
      for (int i=0;i<3;i++){
        rta = rta + arreglo.get(i).importeNomina();}
    return rta;  
  }
  
}
