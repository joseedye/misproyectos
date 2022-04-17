/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package NEGOCIO;

/**
 *
 * @author estudiante
 */

import java.util.ArrayList;
public class Departamento {
    
    private ArrayList<Municipio> myMunicipios;
    private String nomDepar;
    private float promeIng;
    private int totalPoblacion;

    public Departamento() {
    }
    
    public Departamento(String nomDepar) {
        this.nomDepar = nomDepar;
        this.myMunicipios=new ArrayList<Municipio>();
    }


      
    public String getNomDepar() {
        return nomDepar;
    }

    public void setNomDepar(String nomDepar) {
        this.nomDepar = nomDepar;
    }

    public float getPromeIng() {
        return promeIng;
    }

    public void setPromeIng(float promeIng) {
        this.promeIng = promeIng;
    }

    public int getTotalPoblacion() {
        return totalPoblacion;
    }

    public void setTotalPoblacion(int totalPoblacion) {
        this.totalPoblacion = totalPoblacion;
    }

    public String consultarMunicipio() {
        String cad = "";
        if(!this.myMunicipios.isEmpty()){
            for(Municipio myM:this.myMunicipios){
                cad=cad+myM.toString();
            }
            
        }
        return cad;
    }

    
    
    public String consultarMunicipiosConAlcalde(){
     String c = "";
         
     if(!this.myMunicipios.isEmpty()){
        for(Municipio myM:this.myMunicipios){
            if(myM.getMyAlcalde()!=null){
                c=c+myM.getNombre()+"/";
            }
        }
      }
        return c;
    } 
    
    public String dessasignarAlcalde(String nomM){
       
        Municipio m = this.buscarMunicipio(nomM);
       
        m.setMyAlcalde(null);
        return "El alcalde del municipio: "+nomM+ " a sido dessasignado";
            
        
    }
    public String consultarInfoMunicipio (String nomM){
         
        Municipio m = this.buscarMunicipio(nomM);
       
         return  m.mostrarMunicipio();
    
     
           
    }
//valida si el municipio esta o no esta con un respectivo nombre
    public boolean validarMunicipio(String nomM) {
        boolean x = false;
        Municipio m = this.buscarMunicipio(nomM);
        if (m != null) {
            x = true;
        }
        return x;
    }

    private Municipio buscarMunicipio(String nomM) {
        Municipio m = null;
        //pregunta si esta vacio el array de municipios
        if(!this.myMunicipios.isEmpty()){
         //busca mediante un for-each
            for(Municipio myMun:this.myMunicipios){
                if(myMun.getNombre().equalsIgnoreCase(nomM)){
                    m=myMun;
                    break;//se sale del for, apenas lo encuentra
                }
            }
        }
        return m;
     }

    public boolean buscarAlcaldeMunicipio(Alcalde myAlcalde) {
      boolean x=false;
      if(!this.myMunicipios.isEmpty()){
        for(Municipio myM:this.myMunicipios){
            if(myM.getMyAlcalde()==myAlcalde){
                x=true;
            }
        }
    }    
     return x;
  }

  

  public String registrarMunicipio(String nombre, int totalM, int totalHombres, int edadPromedio,
            int ingresoPromedio, int temperaturaMedia, int categoria, Alcalde a) {
      //agrega un municipio al array  
        this.myMunicipios.add(new Municipio(nombre, totalM, totalHombres, edadPromedio, ingresoPromedio, temperaturaMedia, categoria, a));
      //actualiza  la poblacion del departamento
        this.totalPoblacion=this.totalPoblacion+(totalM+totalHombres);
      //actualiza el promedio de ingresos...
        this.promeIng=(this.promeIng+ingresoPromedio)/this.myMunicipios.size();
        return "Registro exitoso...";
    }

    public String toString() {
        return "Nombre Departamento: " + this.nomDepar + "\n" + "Promedio Ingresos: "
                + this.promeIng + "Total Poblacion: " + this.totalPoblacion + "\n";
    }

    //quiez
    public String buscarMuniIngreso() {
        String cad = "";
    
        return cad;
    }

    public void eliminarMuniIngr() {
        
      
    }
   
    public String mostarinfoMuni(){
           return null;    
    }
}
