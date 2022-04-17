/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package login;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author jose eduardo rozo
 */
public class Controlador implements ActionListener{
    
    Cuentas c ;
    Login v ;

    public Controlador(Cuentas c, Login l) {
        this.c = c;
        this.v = l;
        iniciar();
    }
    
    public void iniciar(){
       // v.btn.
        //this.h.jButton6.addActionListener(this); 
    }

    @Override
    public void actionPerformed(ActionEvent e) {
      //if(e.getSource().equals( h.jButton4)){
    
    
    }
    
  
    
    
    
}
