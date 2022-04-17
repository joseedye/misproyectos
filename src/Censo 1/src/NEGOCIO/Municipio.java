/*
 * Municipio.java
 * 
 * Created on 02-nov-2007, 11:26:06
 * 
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */
package NEGOCIO;

/**
 *
 * @author Administrador
 */
import java.util.*;

public class Municipio {

    private String nombre;
    private int poblacion;
    private int totalHombres;
    private int totalMujeres;
    private float edadPromedio;
    private float ingresoPromedio;
    private float temperaturaMedia;
    private int categoria;  //1..5
    private Alcalde myAlcalde;

    //permite crear un municipio con la informacion digitada
    public Municipio(String nombre, int totalM, int totalHombres, int edadPromedio,
            int ingresoPromedio, int temperaturaMedia, int categoria, Alcalde a) {
        this.nombre = nombre;
        this.totalMujeres = totalM;
        this.totalHombres = totalHombres;
        this.edadPromedio = edadPromedio;
        this.ingresoPromedio = ingresoPromedio;
        this.temperaturaMedia = temperaturaMedia;
        this.categoria = categoria;
        this.myAlcalde = a;

    }

    //da el nombre del muncipio 
    public String getNombre() {
        return this.nombre;
    }

    //actualiza el nombre de un municipio
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    //da la poblacion de un municipio
    public int getPoblacion() {
       this.poblacion= this.totalHombres+this.totalMujeres;
       return this.poblacion;
    }

    //actualiza la poblacion de un municipio 
    public void setPoblacion(int poblacion) {
        this.poblacion = poblacion;
    }

    //da la edad promedio en el municipio
    public float getEdadPromedio() {
        return this.edadPromedio;
    }

    //actualiza  la edad promedio de un municipio
    public void setEdadPromedio(int edadPromedio) {
        this.edadPromedio = edadPromedio;
    }

    //da los ingresos promedios de un municipio
    public float getIngresoPromedio() {
        return this.ingresoPromedio;
    }

    //actualiza el promedio ingreso de un municipio
    public void setIngresoPromedio(int ingresoPromedio) {
        this.ingresoPromedio = ingresoPromedio;
    }

    //da el total de hombre de un municipio
    public int getTotalHombres() {
        return this.totalHombres;
    }

    //actualiza el total de hombre de un municipio
    public void setTotalHombres(int totalHombres) {
        this.totalHombres = totalHombres;
    }

    //da el total de mujeres de un municipio
    public int getTotalMujeres() {
        return (this.poblacion - this.totalHombres);
    }

    //actualiza la temperatura media  de un municipio 
    public float getTemperaturaMedia() {
        return this.temperaturaMedia;
    }

    //dat la temperatura media de un municipio
    public void setTemperaturaMedia(int temperaturaMedia) {
        this.temperaturaMedia = temperaturaMedia;
    }

    //da la categoria de un municipio
    public int getCategoria() {
        return this.categoria;
    }

    //actualiza la categoria de un municipio 
    public void setCategoria(int categoria) {
        this.categoria = categoria;
    }

    /**
     * @param totalMujeres the totalMujeres to set
     */
    public void setTotalMujeres(int totalMujeres) {
        this.totalMujeres = totalMujeres;
    }

    public Alcalde getMyAlcalde() {
        return myAlcalde;
    }

    public void setMyAlcalde(Alcalde myAlcalde) {
        this.myAlcalde = myAlcalde;
    }

    
    
    
    
    
    
    
    
    
    

    public String toString() {
        return "\nNombre: " + this.nombre + "\n" + "Poblacion: " + this.poblacion + "\n" + "Total Hombres: "
                + this.totalHombres + "\n" + "Total Mujeres: " + this.totalMujeres + "\n" + "Edad Promedio: "
                + "\n" + this.edadPromedio + "\n" + "Ingreso Promedio: " + "\n" + this.ingresoPromedio
                + "\n" + "Temperatura Media: " + "\n" + this.temperaturaMedia + "\n" + "Categoria: "
                + "\n" + this.categoria+this.mostarAlcalde();
    }
    
    //quiez 
    public String mostrarMunicipio(){
        return "\nnombre:  "+this.nombre+ "\n"+ "promedio ingreso: "+this.ingresoPromedio+"\n"+"categoria: "+this.categoria+"\n"+"alcalde: "+this.mostarAlcalde()+"\n";
    
    }
    public String mostrarMunicipio2(){
    return   "nombre:  "+this.nombre+ "\n"+ "total poblacion "+this.poblacion+"promedio ingreso "+this.ingresoPromedio+"\n"+" alcalde "+this.mostarAlcalde()+"\n";
    }
    
    public String mostarAlcalde(){
    if(this.myAlcalde!=null){
       return this.myAlcalde.getNombre();
    } 
      return "no tiene asignao alcalde";
    }
}
