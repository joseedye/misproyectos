/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;
 
import Conexion.Conexion;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import dao.*;
import dto.*;
import Vista.Vistas;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author jose eduardo
 */
public class Controlador implements ActionListener{
    Vistas vista;
    String sql = "";
    List<VehiculoDTO> vehiculos; 
    int i=0;
    
    public Controlador(Vistas vis) {
    this.vista=vis;
    init();
    }

   private void init() {
       vista.setVisible(true);
       vista.setLocationRelativeTo(null);
       this.listener();
       this.limpiarFormulario();
   }
   
   private void listener(){
       vista.btnagregar.addActionListener(this);
       vista.btnlimpiar.addActionListener(this);
       vista.btnreiniciar.addActionListener(this);
       vista.btntotalizar.addActionListener(this);
   
   }
  
    @Override 
    public void actionPerformed(ActionEvent e) {
        
        
        //boton agregar
        if (e.getSource().equals(vista.btnagregar)){
           int valor =10;
            System.out.println("1");
           VehiculoDTO nuevo = new VehiculoDTO(vista.txtplaca.getText(),Integer.parseInt(vista.txtmodelo.getText()),1,valor);
           System.out.println("2");
           VehiculoDAO nuevo1 = new VehiculoDAO();
           System.out.println("3");
           if(nuevo1.create(nuevo)){System.out.println("se creo usuario");};
//        if(!existe(nuevo)){
//        VehiculoDAO da = new VehiculoDAO();
//        da.create(nuevo);
//        }else{System.out.println("este usuario ya existe");}
        }
        
        
        //boton limpiar
       if (e.getSource().equals(vista.btnlimpiar)){
           this.limpiarFormulario();
       }
        
        //boton reiniciar
       if (e.getSource().equals(vista.btnreiniciar)){
           VehiculoDAO nuevo1 = new VehiculoDAO();
           nuevo1.deletee(); 
       } 
       
         //boton totalizar
       if (e.getSource().equals(vista.btntotalizar)){
        VehiculoDAO nuevo1 = new VehiculoDAO();
        vehiculos = nuevo1.readAll();
        

       }
        
}
    
    private void limpiarFormulario() {
        vista.txtcarros.setText(null);
        vista.txtfecha.setText(null);
        vista.txtmodelo.setText(null);
        vista.txtmotos.setText(null);
        vista.txtplaca.setText(null);
        vista.txtrta.setText(null);
    }

   
}
