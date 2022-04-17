/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Hotel;
import Modelo.Persona;
import Vistas.Hot;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author estudiante
 */
public class Control implements ActionListener {
     
    private Hotel hotel;
    private Hot h;
    
    public Control(Hotel hotel,Hot h){
        this.hotel=hotel;
        this.h=h; 
        iniciar();
        
    }
    
    public void iniciar(){
        
     iniciarcomboH();
     iniciarcomboI();
     iniciarcomboR();   
     this.h.jButton1.addActionListener(this);
     this.h.jButton2.addActionListener(this);
     this.h.jButton3.addActionListener(this);
     this.h.jButton4.addActionListener(this);
     this.h.jButton5.addActionListener(this);
     this.h.jButton6.addActionListener(this);
     this.h.jButton7.addActionListener(this);
     this.h.jButton8.addActionListener(this);
     this.h.jButton9.addActionListener(this);
     
     this.h.mhabit.addActionListener(this);
     this.h.modtem.addActionListener(this);
     this.h.salida.addActionListener(this);
     
    }
    

    @Override
    public void actionPerformed(ActionEvent e) {
        //primer piso
        if(e.getSource().equals( h.jButton5)){
         h.rta.setText( h.h.habitacionDispo(1));
          }
        //segundo piso
        if(e.getSource().equals( h.jButton1)){
         h.rta.setText( h.h.habitacionDispo(2));
          }
        //tercer piso
        if(e.getSource().equals( h.jButton4)){
         h.rta.setText( h.h.habitacionDispo(3));
          }
        
        //alquilar
        if(e.getSource().equals( h.jButton2)){
            
        
          if(h.nombre.getText().equals("")||h.apellido.getText().equals("")||h.cedula.getText().equals("")||h.telefono.getText().equals("")){
        h.rta.setText("ingrese datos");
        }
        else{
           String numero = (String)h.comboR.getSelectedItem(); 
             int hab = Integer.parseInt(numero);
          
        
        long eee = Long.parseLong(h.cedula.getText());
        long aaa = Long.parseLong(h.telefono.getText());
       
        if(h.h.alquilar_habitacion(hab, new Persona (h.nombre.getText(),h.apellido.getText(),eee,aaa))){
       h.rta.setText("se agrego como responsable el señor/a "+h.nombre.getText()+" correctamente en la habitacion "+numero);
        }
        else
        {
         h.rta.setText("no se pudo registar ");
        }
        limpiarR();
          }
        }
        
        
        //añadir     huesped 
        if(e.getSource().equals( h.jButton7)){
         String numero = (String)h.comboH.getSelectedItem();
        int hab = Integer.parseInt(numero);
        long eee = Long.parseLong(h.ee.getText());
        long aaa = Long.parseLong(h.aa.getText());
     
        Persona ppp = new Persona(h.nombre1.getText(),h.apellido1.getText(),eee,aaa);
       if( h.h.anadirPersona(hab,ppp )){
           h.rta.setText("se agrego correctamente el huesped");
       }else{ h.rta.setText("no hay cupo o aun no se ha registrado un responsable");}
        limpiarH();
          }
        
        
        //modificar
        if(e.getSource().equals( h.jButton8)){
         String numero = (String)h.comboI.getSelectedItem();  
       int hab = Integer.parseInt(numero);
       int eee = Integer.parseInt(h.mhuespedes.getText());
       h.h.modificar_cantidad_huespedes(hab,eee);
       h.mhuespedes.setText("");
          }
        
        
         //cambiar    presio hab
        if(e.getSource().equals( h.jButton3)){
        String numero = (String)h.comboI.getSelectedItem();
        int hab = Integer.parseInt(numero);
       double a = Double.parseDouble(h.nuevopresio.getText());
    
           h.h.cambiar_presio_Habitacion(hab, a);
           h.nuevopresio.setText("");
          }
        
        
        //modificar numero de habitacion
        if(e.getSource().equals( h.mhabit)){
         String numero = (String)h.comboI.getSelectedItem();  
       int hab = Integer.parseInt(numero);
       int eee = Integer.parseInt(h.nhabit.getText());
       h.h.modificarNumero_habitacion(hab, eee);
       h.nhabit.setText("");
       h.comboI.removeAllItems();
       h.comboH.removeAllItems();
       h.comboR.removeAllItems();
       iniciarcomboI();
       iniciarcomboH();
       iniciarcomboR();
        }
       //modificar temporada
        if(e.getSource().equals( h.modtem)){
         String numero = (String)h.comboI.getSelectedItem();  
       int hab = Integer.parseInt(numero);
       
       h.h.modificar_temporada(hab, h.modtempo.getText());
      
       h.modtempo.setText("");
          }
        
         //dar salidaa
        if(e.getSource().equals( h.salida)){
          String numero = (String)h.comboI.getSelectedItem();  
       int hab = Integer.parseInt(numero);
       h.h.darSalida(hab);
          }
        
        
        //obtner info
        if(e.getSource().equals( h.jButton6)){
        String numero = (String)h.comboI.getSelectedItem();
        int hab = Integer.parseInt(numero);
         h.rta.setText(h.h.obtenerInfo(hab));
        }
        
        
       //informacion total
        if(e.getSource().equals( h.jButton9)){
         h.rta.setText( h.h.listar_info_personas());
          }
        
        
   }
       public void iniciarcomboH(){
        for (int i = 0; i < h.h.getHabitacion().size(); i++) {
             h.comboH.addItem(h.h.getHabitacion().get(i).getNum_habitacion()+"");
        }
       
    }
    
    public void iniciarcomboI(){
        for (int i = 0; i <h.h.getHabitacion().size(); i++) {
             h.comboI.addItem(h.h.getHabitacion().get(i).getNum_habitacion()+"");
        }
        
    }
    
     public void iniciarcomboR(){
        for (int i = 0; i < h.h.getHabitacion().size(); i++) {
             h.comboR.addItem(h.h.getHabitacion().get(i).getNum_habitacion()+"");
        }
        
    }
    
    
    
    public void limpiarR(){
         
          h.nombre.setText("");
          h.apellido.setText("");
          h.cedula.setText("");
          h.telefono.setText("");
          
                  }
    
    public void limpiarH(){
      
      
        h.nombre1.setText("");
        h.apellido1.setText("");
        h.ee.setText("");
        h.aa.setText("");
        
    }
    
    
}
