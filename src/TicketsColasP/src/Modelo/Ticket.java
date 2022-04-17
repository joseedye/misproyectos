/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.Date;

/**
 *
 * @author acer
 */
public class Ticket {
    
     Estudiante estudiante;
     Caja caja;
     Date fecha;

    public Ticket() {
    }

    public Ticket(Estudiante estudiante, Caja caja, Date fecha) {
        this.estudiante = estudiante;
        this.caja = caja;
        this.fecha = fecha;
    }

    public Estudiante getEstudiante() {
        return estudiante;
    }

    public void setEstudiante(Estudiante estudiante) {
        this.estudiante = estudiante;
    }

    public Caja getCaja() {
        return caja;
    }

    public void setCaja(Caja caja) {
        this.caja = caja;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
    
     
    
    
    
}
