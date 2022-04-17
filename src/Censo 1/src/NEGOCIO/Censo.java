/*
 * Pais.java
 * 
 * Created on 02-nov-2007, 11:25:45
 * 
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */
package NEGOCIO;

/**
 *
 * @author Administrador
 */
import java.util.ArrayList;
public class Censo {

 
    private ArrayList<Departamento> myDepartamentos;
    private ArrayList<Alcalde> myAlcaldes;
 
    //constructor de Censo
    public Censo() {
        this.myDepartamentos=new ArrayList<Departamento>();
        this.myAlcaldes=new ArrayList<Alcalde>();
    }

    public String agregarMunicipio(String nombre, int mujeres, int hombre, int edad, int ingre, int temp, int cate, String cedAlcalde, String nomD) {
        Departamento d = this.buscarDepartamento(nomD);

        if (d != null) {
            Alcalde a = this.buscarAlcalde(cedAlcalde);
            return d.registrarMunicipio(nombre, cate, hombre, edad, ingre, temp, cate, a);
        }     


        return "";
    }

    public String registraAlcalde(String nom, String sueldoBase, String direccion, String cedula) {
         
        this.myAlcaldes.add(new Alcalde(nom,sueldoBase,direccion, cedula));
        return "Registro exitoso...";
    }

    public boolean buscarEntreMunicipios(String cedula) {
        boolean x = false;
        Alcalde a = this.buscarAlcalde(cedula);
        if (a == null) {
            return false;
        }
        
        if(!this.myDepartamentos.isEmpty()){ 
           for(Departamento dep:this.myDepartamentos){
               x=dep.buscarAlcaldeMunicipio(a);
               if(x){
                   break;
               }
           }    
        }
        return x;
   }

    public boolean validarAlcalde(String cedula) {
        Alcalde a = this.buscarAlcalde(cedula);
        if (a != null) {
            return true;
        }
        return false;
    }

    private Alcalde buscarAlcalde(String cedAlcalde) {
       Alcalde myA=null;
       if(!this.myAlcaldes.isEmpty()){
          for(Alcalde a: this.myAlcaldes) {
              if(a.getCedula().equalsIgnoreCase(cedAlcalde)){
                  myA=a;
                  break;//salir del for para no continuar buscando
              }
          }
      }
        return myA;
    }


    public String registrarDepartamento(String nomD) {
        String cad = "";
        Departamento dep = this.buscarDepartamento(nomD);

        if (dep != null) {
            return "YA EXISTE ... DIGITE OTRO";
        }
        //adiciona un objeto al Array
        this.myDepartamentos.add(new Departamento(nomD));
        return "Registro exitoso..";
    }

    
    public String cargarDepartamentos() {
        String cad = "";
        if(!this.myDepartamentos.isEmpty()){
            for(Departamento myD:this.myDepartamentos){
                //aqui concatena los nombres de los departamentos.
                cad=cad+myD.getNomDepar()+"/";
            }
        }
        return cad;
    }

    
    public String consultarDepartamento(String nomD) {
        String cad = "";
        Departamento d = this.buscarDepartamento(nomD);
        cad = d.toString() + "\n" + "**Municipios**" + "\n" + d.consultarMunicipio();
        return cad;
    }
//metodo en prueba
    
    
    public String consultarDepartamentoMunicipio(String nomD){
       
        Departamento d = this.buscarDepartamento(nomD);
        return  d.consultarMunicipiosConAlcalde();
      
    }
    
    public String consultarInfoDepartamentoM (String nomD, String nomM){
        
         Departamento d = this.buscarDepartamento(nomD);
       
         return  d.consultarInfoMunicipio(nomM);
       
    }
    
    public String eliminarAlcaldeMunicipio (String nomD, String nomM){
     
        Departamento d = this.buscarDepartamento(nomD);
       
        return  d.dessasignarAlcalde(nomM);
    }

    public boolean validarExistMuni(String nomD, String nomM) {
        Departamento d = this.buscarDepartamento(nomD);
        if (d != null) {
            return d.validarMunicipio(nomM);
        }
        return false;
    }

    

    //METODO PARA BUSCAR UN DEPARTAMENTO DENTRO DE UN ARRAY
    private Departamento buscarDepartamento(String nombreDep) {
        Departamento x = null;
     //aqui pregunta si la coleccion no esta vacia
        if(!this.myDepartamentos.isEmpty()){
    //permite recorrer el array para buscar un departamento
    //igual al que se busca.
           for(Departamento d:this.myDepartamentos){
              if(d.getNomDepar().equalsIgnoreCase(nombreDep)){
                  x=d;
                  break;//salir del for y no buscar mas
              }
          }    
        }
        return x;
    }

    //quiez
    //muestra los qu estan en el rango
    public String mostrar() {
        String cad = "";
        

        return cad;
    }
    //muestra los que no se eliminan

    public String mostrar2(int a) {
         String b="";
         
         return b;
    }
     
}
