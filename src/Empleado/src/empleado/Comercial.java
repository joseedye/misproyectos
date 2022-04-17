/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empleado;

/**
 *
 * @author jose eduardo rozo
 */
public class Comercial extends Empleado{
    double comision;

    public Comercial(String nombre, Integer edad, double salario) {
        super(nombre, edad, salario);
       }

    @Override
    public String toString() {
    return "Comercial{ nombre "+nombre+" edad "+edad+
            " salario "+salario+"comision"+comision+ "}"; 
    }

    
    
    public double getComision() {
        return comision;
    }

    public void setComision(double comision) {
        this.comision = comision;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    
    
    @Override
    public void plus() {
        if(edad>30&&comision>20000){
            salario +=PLUS+comision;}
       
    }
}
