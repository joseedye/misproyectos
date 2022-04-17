/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import ufps.util.colecciones_seed.*;

/**
 *
 * @author acer
 */
public class Caja {
    byte id;
    ColaP  <Estudiante> est;

    public Caja() {
    }

    public Caja(byte id, ColaP<Estudiante> est) {
        
        this.id = id;
        this.est = est;
    }

    public byte getId() {
        return id;
    }

    public void setId(byte id) {
        this.id = id;
    }

    public ColaP<Estudiante> getEst() {
        return est;
    }

    public void setEst(ColaP<Estudiante> est) {
        this.est = est;
    }
    
    
}
