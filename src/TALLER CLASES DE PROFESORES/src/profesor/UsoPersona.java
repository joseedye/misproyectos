package profesor;

public class UsoPersona {   
    
    
    public static void main(String[] args) {
    ListaProfesores l = new ListaProfesores();
    Profesor p1 = new ProfesorCatedra("eduardo","rozo","20","auxiliar");
    Profesor p2 = new ProfesorOcacional("yeny","villalba","23",6000);
    Profesor p3 = new ProfesorPlanta("otro","pro","10","titular");
    l.arreglo.add(p1);
    l.arreglo.add(p2);
    l.arreglo.add(p3);
   
    for (int i=0;i<3;i++){
        System.out.println("___ "+l.imprimirLista(i)); 
        
    }System.out.println("----"+l.importeTotalNominaProfesorado());
    }
    
    
    /*
     Profesor [] a= new Profesor [3];
    ListaProfesores l = new ListaProfesores();
    Profesor p1 = new ProfesorCatedra("eduardo","rozo","20");
    Profesor p2 = new ProfesorOcacional("yeny","villalba","23");
    Profesor p3 = new ProfesorPlanta("otro","pro","10");
     a[0]= p1;a[1]=p2;a[2]=p3;
    for (int i=0;i<3;i++){
        System.out.println("posicion "+i+" "+a[i].toString());
    }
    */
    
    
    
    
}
