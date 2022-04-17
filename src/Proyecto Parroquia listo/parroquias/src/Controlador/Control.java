/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Vista.Formulario_Registro;
import dao.DiezmoDAO;
import dao.FeligresDAO;
import dto.DiezmoDTO;
import dto.FeligresDTO;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author acer
 */
public class Control implements ActionListener {

    Formulario_Registro vista;

    public Control(Formulario_Registro v) {
        this.vista = v;
        this.vista.setVisible(true);
        this.vista.setLocationRelativeTo(null);
        this.escuchadores();
    }

    private void escuchadores() {
        vista.btnactualizar.addActionListener(this);
        vista.btnbuscar.addActionListener(this);
        vista.btnconsultar.addActionListener(this);
        vista.btneliminar.addActionListener(this);
        vista.btnguardar.addActionListener(this);
        vista.btnpagar.addActionListener(this);
        vista.btntotalizar.addActionListener(this);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        //agregar
        if (e.getSource().equals(vista.btnguardar)) {
                  System.out.println("agregar ");
                       
            FeligresDTO nuevo = new FeligresDTO(vista.txtcedula.getText(), vista.txtnombre.getText(),vista.txtapellidos.getText(),
                    vista.txtdireccion.getText(), vista.txttelefono.getText(), vista.txtestrato.getText(), vista.txtestado.getText());
            System.out.println("se creo en nuevo dto ");
            FeligresDAO nuevo2 = new FeligresDAO();
            System.out.println("se creo el dao");
            if (nuevo2.create(nuevo)) {
                vista.txtrta.setText("se agrego un nuevo usuario "+nuevo.getNombre());
                limpiar();
            } else {
                vista.txtrta.setText("no se pudo agregar el usuario "+nuevo.getNombre()+"\n pruebe con otra cedula");
            };
        }

        //consultar diezmo
        
        if (e.getSource().equals(vista.btnconsultar)) {
          FeligresDAO nuevo = new FeligresDAO();
          FeligresDTO nuevo2 = nuevo.read(vista.txtceduladiesmo.getText());
          if (nuevo2 == null) {
               vista.txtrta.setText("no esta registrado el usuario");
            }
             vista.txtrta.setText("si esta registrado el usuario ");
         }

        //eliminar
        if (e.getSource().equals(vista.btneliminar)) {
            FeligresDAO nuevo = new FeligresDAO();
            String cedula = vista.txtcedula.getText();
            if(nuevo.delete(cedula)){vista.txtrta.setText("se elimino la cedula "+cedula);limpiar();}
            else{vista.txtrta.setText("cedula incorrecta");}
       
        }

        //actualizar
        if (e.getSource().equals(vista.btnactualizar)) {
            
            FeligresDTO nuevo1 = new FeligresDTO(vista.txtcedula.getText(), vista.txtnombre.getText(),vista.txtapellidos.getText(),
                    vista.txtdireccion.getText(), vista.txttelefono.getText(), vista.txtestrato.getText(), vista.txtestado.getText());
            FeligresDAO nuevo = new FeligresDAO();
            
            if (nuevo.update(nuevo1)) {
                vista.txtrta.setText("se actualizo el usuario "+nuevo1.getNombre());
                limpiar();
                
            } else {
                vista.txtrta.setText("no se actualizo porque el usuario no existe.  \n----pruebe con otra cedula");
            };
            
        }

        //buscar
        
        if (e.getSource().equals(vista.btnbuscar)) {
            
          FeligresDAO nuevo = new FeligresDAO();
          FeligresDTO nuevo2 = nuevo.read(vista.txtcedula.getText());
          if (nuevo2 == null) {
               vista.txtrta.setText("no esta registrado el usuario");
            }
             vista.txtrta.setText("si esta registrado el usuario "+nuevo2.getNombre());
        }

        //pagar dizmo
        if (e.getSource().equals(vista.btnpagar)) {
            
          FeligresDAO nuevo = new FeligresDAO();
          FeligresDTO nuevo2 = nuevo.read(vista.txtceduladiesmo.getText());
          if (nuevo2 != null) {
            
            DiezmoDTO nuevo1 = new DiezmoDTO(vista.txtceduladiesmo.getText(), vista.txtvalordiesmo.getText());
            DiezmoDAO nuevo3 = new DiezmoDAO();
            
            if(nuevo3.create(nuevo1))vista.txtrta.setText(" se registro el pagoa nombre de "+nuevo2.getNombre());
          }
            else
            {vista.txtrta.setText("usuario invalido registrese para continuar");};
            
        }

        //totalizar diezmo
        if (e.getSource().equals(vista.btntotalizar)) {
            
            DiezmoDAO nuevo = new DiezmoDAO();
            double rta = 0;
            List<DiezmoDTO> nuevo1 = nuevo.readAll();
            Iterator it = nuevo1.iterator();
            
            while (it.hasNext()) {
                DiezmoDTO temp = (DiezmoDTO) it.next();
                rta += Double.parseDouble(temp.getValor());
            }
            vista.txtrta.setText("total = "+rta);
        }
    }
    
    private void limpiar(){
    vista.txtcedula.setText("");
    vista.txtnombre.setText("");
    vista.txtapellidos.setText("");
    vista.txtdireccion.setText("");
    vista.txttelefono.setText("");
    vista.txtestrato.setText("");
    vista.txtestado.setText("");
    vista.txtfechan.setText("");
            
    
    }
}
