/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Principal;

import Controlador.Control;
import Servicios.Conexion;
import Vista.Formulario_Registro;

/**
 *
 * @author acer
 */
public class Ejecutar {
    
    public Ejecutar(){
    Formulario_Registro nuevoformulario = new Formulario_Registro();
    Control control = new Control (nuevoformulario);
//       Conexion  cn = Conexion.getInstance();//getConnection
//       cn.getCnn();
    }
    
    public static void main(String[] args) {
        Ejecutar ejecutar = new Ejecutar();
    }
}
