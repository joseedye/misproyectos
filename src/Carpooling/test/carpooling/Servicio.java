/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carpooling;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author estudiante
 */
public class Servicio {

    private String categoria;
    private int tarifaMin;
    private int tarifaTime;
    private int tarifaDist;
    private ArrayList<Conductor> cond;

    public Servicio() {
        
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public int getTarifaMin() {
        return tarifaMin;
    }

    public void setTarifaMin(int tarifaMin) {
        this.tarifaMin = tarifaMin;
    }

    public int getTarifaTime() {
        return tarifaTime;
    }

    public void setTarifaTime(int tarifaTime) {
        this.tarifaTime = tarifaTime;
    }

    public int getTarifaDist() {
        return tarifaDist;
    }

    public void setTarifaDist(int tarifaDist) {
        this.tarifaDist = tarifaDist;
    }
    
    public String añadirConductor(String nom, String ced, String placa, int mod) {
        String cad = "";
        Conductor c = this.buscarConductor(ced);
        if (c != null) {
            cad = "Ya existe un conductor con esta cedula";
        } else {
            Conductor con = new Conductor(nom, ced, placa, mod);
            cond.add(con);
            cad = "Se añadio un " + con.toString();
        }
        return cad;
    }

    private Conductor buscarConductor(String ced) {
        Conductor x = null;
        for (int i = 0; i < this.cond.size(); i++) {
            if (cond.get(i) != null && cond.get(i).getCedula().equalsIgnoreCase(ced)) {
                x = cond.get(i);
                break;
            }
        }
        return x;
    }

    public String eliminarConductor(String ced) {
        String cad = "";
        Conductor c = this.buscarConductor(ced);
        for (int i = 0; i < cond.size(); i++) {
            if (c == cond.get(i)) {
                cad = "Se elimino el conductor " + c.getNombre();
                cond.remove(i);
            }
        }
        return cad;
    }

    public String modeloMasPopular() {
        String cad = "";
        int aux = 0;
        for (int i = 0; i < cond.size(); i++) {
            for (int j = i + 1; j < cond.size(); j++) {
                if (cond.get(i).getModelo() < cond.get(j).getModelo()) {
                    aux = cond.get(i).getModelo();
                    cond.set(i, cond.get(j));
                    cond.set(aux, cond.get(i));
                    cad = "El modelo mas popular es " + cond.get(i).getModelo(); 
                }
            }
        }
        return cad;
    }
    
    public void establecerTarifas(int tarifaM, int tarifaT, int tarifaD){
        this.tarifaMin = tarifaM;
        this.tarifaTime = tarifaT;
        this.tarifaDist = tarifaD;
    }
    
    public int costoCarrera(){
        int minutos = Integer.parseInt(JOptionPane.showInputDialog("Cuantos minutos tardo en llegar?"));
        int distancia = Integer.parseInt(JOptionPane.showInputDialog("Cual fue la distancia recorrida?"));
        int costoAdicional = (this.tarifaTime * minutos) + (this.tarifaDist * distancia);
        int costo = (this.tarifaMin + costoAdicional);
        return costo;
    }

//    
//    private int costos(){
//        costoAdicional = (tarifaTime*duracion)+ (tarifaDist*distancia);
//        costoCarrera = tarifaMin*costoAdicional;
//        
//    }
    
    
}
