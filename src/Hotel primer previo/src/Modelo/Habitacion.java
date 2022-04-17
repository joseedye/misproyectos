/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.ArrayList;

/**
 *
 * @author estudiante
 */
public class Habitacion {
    int piso;
    double precio_alquiler;
    String temporada;
    int num_habitacion;
    int cap_maxima;
    int can_disponible;
    Persona responsable;
    //Responsable 
    ArrayList<Persona> huespedes;
    
    public Habitacion(int piso, double precio_alquiler, String temporada,int numero_habitacion,int capacidad) {
        this.piso = piso;
        this.precio_alquiler = precio_alquiler;
        this.temporada = temporada;
        this.num_habitacion=numero_habitacion;
        this.cap_maxima=capacidad;
        huespedes = new ArrayList<>();
        can_disponible=capacidad; 
        responsable=null;
    }

    public int getPiso() {
        return piso;
    }

    public void setPiso(int piso) {
        this.piso = piso;
    }

    public double getPrecio_alquiler() {
        return precio_alquiler;
    }

    public void setPrecio_alquiler(double precio_alquiler) {
        this.precio_alquiler = precio_alquiler;
    }

    public String getTemporada() {
        return temporada;
    }

    public void setTemporada(String temporada) {
        this.temporada = temporada;
    }

    public int getNum_habitacion() {
        return num_habitacion;
    }

    public void setNum_habitacion(int num_habitacion) {
        this.num_habitacion = num_habitacion;
       
    }

    public int getCap_maxima() {
        return cap_maxima;
    }

    public void setCap_maxima(int cap_maxima) {
        this.cap_maxima = cap_maxima;
    }

    public ArrayList<Persona> getHuespedes() {
        return huespedes;
    }
    
    public void addHuespedes(Persona huespedess) {
        if (can_disponible>0){
       huespedes.add(huespedess);
       can_disponible--;}
       
    }
    
    public void addResponsable(Persona responsabl) {
       this.responsable=responsabl;
       can_disponible--;
       
    }
  

    public void setHuespedes(ArrayList<Persona> huespedes) {
        this.huespedes = huespedes;
    }

    @Override
    public String toString() {
        return "\n Habitacion{" + "piso=" + piso + ", precio_alquiler=" + precio_alquiler + ",\n temporada=" + temporada + ", num_habitacion=" + num_habitacion + ", cap_maxima=" + cap_maxima +",\n responsable { " +getResponsable()+ ",\n huespedes " + huespedes ;
    }

    public Persona getResponsable() {
        return responsable;
    }
    
    public void estadoFabrica(){
        huespedes.clear();
        can_disponible=this.cap_maxima; 
        responsable=null;
        
    }
    
    
}
