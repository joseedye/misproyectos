/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cursointerfaz;

import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author acer
 */ 
//se herada de la clase ventana ya creada en java 
public class Ventana extends JFrame {
    
    public Ventana (){
        colocarPaneles();
        
        // tamaño de la ventana ancho por alto, sin el this tambien funciona
    this.setSize(500,500);
    // establecer titulo
    setTitle("mi primera ventana");
    
    //ejecutar el metodo
    iniciarComponentes();
    
    //centrar ventana
    setLocationRelativeTo(null);
    
    //cuando se pulsa el boton cerrar
    //this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    
    //limitar la ventana para que no se maximise
    //this.setResizable(false);
    
    // tan pequeño como yo quiera
    //this.setMinimumSize(new Dimension (200,200));
    
    //tan grande como yo quiera 
    //this.setMaximumSize(new Dimension (420,420));
    
    // cambiar color de fondo
    // el contentpane es editar el contenido
    this.getContentPane().setBackground(Color.yellow);
    }
    
    private void iniciarComponentes (){
        
     // escuchador de las ventanas
     // el windows adapter se adapta al windows listener, windows focus listener y windows key listener
    addWindowListener(new java.awt.event.WindowAdapter() {
        // aqui dentro esta escuchando el programa
        
        //metodo para cerrar ventana
        @Override
        public void  windowClosing(java.awt.event.WindowEvent evento){System.exit(0);}
    });
            }
    
    
    private void colocarPaneles(){
    //crear panel    
    JPanel panel = new JPanel();
    
    // cambiar color de fondo establecer el fondo
    panel.setBackground(Color.red);
    
    //establecer tamaño al panel no sirve
    // panel.setSize(100,100);
    
    // establecer el tamaño x,y,ancho,alto
    //panel.setBounds(0, 0, 200, 200);
    
    //añadir panel a la ventana y la ocupa toda
    this.getContentPane().add(panel);
    }
    
    
    public static void main(String[] args) {
        Ventana v = new Ventana ();
        v.setVisible(true);
    }
    
    

}
