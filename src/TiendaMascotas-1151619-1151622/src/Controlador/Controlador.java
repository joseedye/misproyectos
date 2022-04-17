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
import tiendamascotas.vista.Vista;

/**
 *
 * @author jose eduardo
 */
public class Controlador implements ActionListener{
     Vista vista;
   
     String sql = "";
     List<DuenoDTO> usuarios; 
     List <MascotaDTO> mascota;
     List <TratamientoDTO> tratamiento;
     int i=0;
     
     
     
     private static final String SQL_INSERT = "INSERT INTO " + "due" + " (cedula, nom, dir) VALUES (?,?,?)";
     private static final String SQL_INSERTTRATAMIENTO = "INSERT INTO " + "tratamiento" + " (codigo,descuento, fecha) VALUES (?,?,?)";
     
     private static final Conexion CON = Conexion.getInstance();
    public Controlador(Vista vis) {
        this.vista=vis;
       
        tratamiento = new ArrayList();
        mascota  = new ArrayList();
        usuarios  = new ArrayList();
        init();
    }

   private void init() {
       vista.setVisible(true);
       vista.setLocationRelativeTo(null);
       vista.jButton1.addActionListener(this);
       vista.jButton2.addActionListener(this);
   }
  
    @Override 
    public void actionPerformed(ActionEvent e) {
        System.out.println("accion a algunn booton");
        if (e.getSource().equals(vista.jButton2)){
            System.out.println("este es boton2");
            borrar();
        }
        
        
        
        
        
        
         if (e.getSource().equals(vista.jButton1)){
        Integer codig = Integer.parseInt(vista.codigoMascota.getText());
       // MascotaDAO m = new MascotaDAO(codig,vista.NombreMascota.getText(),vista.Raza.getText(),vista.NombreDueño.getText());
        
        Integer cedul = Integer.parseInt(vista.Cedula.getText());
        DuenoDTO d = new DuenoDTO(cedul,vista.NombreDueño.getText(),vista.Direccion.getText());
        
        Integer cod = Integer.parseInt(vista.Tratamiento.getText());
        TratamientoDTO tra = new TratamientoDTO (cod,1,"2018");
       
        
        //AGREGAR TABLA 
//        if(agregar_dueno_bd(d)&&agregar_mascota_bd(m)&&agregar_tratamiento_bd(tra)){
////            agregar_dueno(d);
////            agregar_mascota(m);
//            agregar_tratamiento(tra);
//            mostrarTabla();
//            JOptionPane.showMessageDialog(null,"registro correcto");
//            limpiar();
//        }else{
//            JOptionPane.showMessageDialog(null,"no se pudo completar el registro");
//        }
         }
  }
    
    public boolean agregar_dueno_bd (DuenoDTO dueno){
        
        //ejecutar la consulta
       PreparedStatement ps;
        
        try{
            // linea de hacer consultas  a la base de datos
         ps = CON.getCnn().prepareStatement(SQL_INSERT);
         
            //asignar un valor a los signos de pregunta que estan en SQL-INSERT
            ps.setString(1,dueno.getCedula()+"");
            ps.setString(2,dueno.getNombre());
            ps.setString(3,dueno.getDireccion());
            
            //
            if(ps.executeUpdate()>0){
                return (true);
            };
            

    }catch (SQLException ex){
         Logger.getLogger(Controlador.class.getName()).log(Level.SEVERE, null, ex);
         return (false);
     }
       return (false); 
    }
    
    public void agregar_dueno (DuenoDTO dueno){
    usuarios.add(dueno);
    }
    
    public boolean agregar_mascota_bd (MascotaDTO mascota){
return false;
    }
   
    public void agregar_mascota (MascotaDTO mascotaa){
     mascota.add(mascotaa);
     }
    
    public void mostrarTabla() {
        
//        String matriz[][] = new String [usuarios.size()][4];
//        for (int i = 0; i <usuarios.size(); i++) {
//          matriz [i][0] = mascota.get(i).getNombre()+"";
//          matriz [i][1] = mascota.get(i).getRaza()+"";
//          matriz [i][2] = usuarios.get(i).getNombre()+"";
//          matriz [i][3] = usuarios.get(i).getCedula()+"";
//          
//          
//        }
//         vista.jTable1.setModel(new javax.swing.table.DefaultTableModel(
//           matriz,
//            new String [] {
//                "nombre mascota","raza", "dueño", "documento"
//            }
//        ));
        
        
        
        
    }
    
    public boolean agregar_tratamiento_bd (TratamientoDTO tratamiento){
       PreparedStatement ps;
        
        try{
         ps = CON.getCnn().prepareStatement(SQL_INSERTTRATAMIENTO);
          
            ps.setString(1,tratamiento.getCodigo_Tratamiento()+"");
            ps.setString(2,"1");
            ps.setString(3,tratamiento.getFecha());
            ps.executeUpdate();
            return (true);

    }catch (SQLException ex){
         Logger.getLogger(Controlador.class.getName()).log(Level.SEVERE, null, ex);
         return (false);
     }
    }
    
     public void agregar_tratamiento (TratamientoDTO tratamiento){
         this.tratamiento.add(tratamiento);
     }
     
    public void limpiar(){
        vista.Cedula.setText("");
        vista.Direccion.setText("");
        vista.NombreDueño.setText("");
        vista.NombreMascota.setText("");
        vista.codigoMascota.setText("");
        vista.Raza.setText("");
        vista.Tratamiento.setText("");
    }

    public boolean borrar (){
        int fila = vista.jTable1.getSelectedRow();
        if(fila==-1){JOptionPane.showMessageDialog(null, "no ha seleccionado ninguna fila");}
        if(fila>=0){
        String  cedulaaEliminar = this.buscarCedula(fila)+"";
        String  nombre = this.buscarMascota(fila);
        String  codigo = this.buscarMascota(fila)+"";
        PreparedStatement ps;
        try{
        int bd = fila+1;
         ps = CON.getCnn().prepareStatement("DELETE FROM `due` WHERE `cedula` ="+cedulaaEliminar);
         ps.executeUpdate();  
         ps = CON.getCnn().prepareStatement("DELETE FROM `mascota` WHERE `nombre` ="+nombre);
         ps.executeUpdate();
         ps = CON.getCnn().prepareStatement("DELETE FROM `tratamiento` WHERE `codigo` ="+codigo);
         ps.executeUpdate();
        tratamiento.remove(fila);
        mascota.remove(fila);
        usuarios.remove(fila);
        mostrarTabla();
        return (true);

       }catch (SQLException ex){
         Logger.getLogger(Controlador.class.getName()).log(Level.SEVERE, null, ex);
         return (false);
        }
        }
        return false;
        
    }
    
    public long buscarCedula(int pos){
       return usuarios.get(pos).getCedula();
    }
    
    public String buscarMascota(int pos){
       return "";// this.mascota.get(pos).getNombre();
    }
    
    public int buscarCodigo(int pos){
       return this.tratamiento.get(pos).getCodigo_Tratamiento();
    }
    
    public boolean editar (){
        
        int fila = vista.jTable1.getSelectedRow();
        System.out.println("fila"+fila);
        if(fila==-1){JOptionPane.showMessageDialog(null, "no ha seleccionado ninguna fila");}
        if(fila>=0){
//        PreparedStatement ps;
//        System.out.println("voy a editar");
//        try{
//          
//        return (true);
//
//       }catch (SQLException ex){
//         Logger.getLogger(Controlador.class.getName()).log(Level.SEVERE, null, ex);
//         return (false);
//        }
        }
        return false;
    
    }
}
