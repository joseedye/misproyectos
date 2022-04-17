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
public abstract class  Empleado {

  String nombre;
  Integer edad;
  double salario ;
  static final Integer PLUS = 3000;

    public Empleado(String nombre, Integer edad, double salario) {
        this.nombre = nombre;
        this.edad = edad;
        this.salario = salario;
    }
    
    public abstract void plus();
  
}
