
package serealizando;

import java.io.Serializable;
import java.util.Date;
import java.util.GregorianCalendar;

public class Empleado implements Serializable
{
    private final String nombre;
    private double sueldo;
    private final Date fechaContrato;
    private static final long serialVersionUID = 1L;
    
    public Empleado(String n, double s, int anio, int mes, int dia)
    {
        this.nombre= n;
        this.sueldo= s;
        GregorianCalendar calendario= new GregorianCalendar(anio, mes-1,dia);
        this.fechaContrato= calendario.getTime();
    }
    public String getNombre()
    {
        return nombre;
    }
    public double getSueldo()
    {
        return sueldo;
    }
    public Date getfechaContrato()
    {
        return this.fechaContrato;
    }
    public void subirSueldo(double porcentaje)
    {
        double aumento=sueldo*porcentaje/100;
        sueldo +=aumento;
    }
    @Override
    public String toString()
    {
        return "Su Nombre es " + nombre + ",y su sueldo es  " + sueldo + ", Fecha de Contratacion " + this.fechaContrato;
    }
}
