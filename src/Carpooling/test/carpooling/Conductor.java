/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carpooling;

import java.util.ArrayList;

/**
 *
 * @author estudiante
 */
public class Conductor {

    private String nombre;
    private String cedula;
    private String placa;
    private int modelo;
    private String disponibilidad;
    private ArrayList <Carrera> carr;

    public Conductor(String nombre, String cedula, String placa, int modelo) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.placa = placa;
        this.modelo = modelo;
    }
    
    
    
    public String añadirCarrera(String nom, String tlf, String med, String lugO, String lugD, String estado){
        Carrera carrera = new Carrera(nom, tlf, med, lugO, lugD, estado);
        carr.add(carrera);
        disponibilidad = "Ocupado";
        String cad =  "Se añadio la " + carrera.toString();
        return cad;
    }
    
    public void terminarCarrera(){
        disponibilidad = "Disponible";
    }
    
    public String infoCarrera(String tlf){
        String cad = "";
        for (int i = 0; i < carr.size(); i++) {
            if (carr.get(i) != null && carr.get(i).getTelefono().equalsIgnoreCase(tlf)) {
                cad = carr.get(i).toString();
            }
        }
        return cad;
    }
    
    private Carrera buscarCarrera(String tlf){
        Carrera car = null;
        for (int i = 0; i < carr.size(); i++) {
            if (carr.get(i) != null && carr.get(i).getTelefono().equalsIgnoreCase(tlf)) {
                car = carr.get(i);
                break;
            }
        }
        return car;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public int getModelo() {
        return modelo;
    }

    public void setModelo(int modelo) {
        this.modelo = modelo;
    }

    public String getDisponibilidad() {
        return disponibilidad;
    }

    public void setDisponibilidad(String disponibilidad) {
        this.disponibilidad = disponibilidad;
    }

    @Override
    public String toString() {
        return "Conductor : " + "nombre= " + nombre + ", cedula= " + cedula + ", placa= " + placa + ", modelo= " + modelo;
    }
    
    
    
    
}
