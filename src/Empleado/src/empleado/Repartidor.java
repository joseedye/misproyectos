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
public class Repartidor extends Empleado {
   String zona; 

    public Repartidor(String nombre,Integer edad,double salario,String zona) {
        super(nombre,edad,salario);
        this.zona = zona;
    }
  
    public String getZona() {
        return zona;
    }

    public void setZona(String zona) {
        this.zona = zona;
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
    public String toString() {
    return "Repartidor{ nombre "+ nombre +" edad "+edad+" salario "
            +salario+" zona "+zona;
    }

    @Override
    public void plus() {
    if(edad<25&&(Integer.parseInt(zona)==3))  {
    salario+=PLUS;
    }
    }
   
    
}
