/**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 * Universidad  de  los Andes   (Bogot� - Colombia)
 * Departamento de  Ingenier�a  de  Sistemas    y   Computaci�n
 * Licenciado   bajo    el  esquema Academic Free License versi�n 2.1
 *      
 * Proyecto Cupi2   (http://cupi2.uniandes.edu.co)
 * Ejercicio: n3_hotel
 * Autor: Equipo Cupi2 2017
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 */

package uniandes.cupi2.hotel.interfaz;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.border.EmptyBorder;

/**
 * Di�logo para registrar un hu�sped en el hotel.
 */
@SuppressWarnings("serial")
public class DialogoRegistrarHuesped extends JDialog implements ActionListener
{

    // -----------------------------------------------------------------
    // Constantes
    // -----------------------------------------------------------------

    /**
     * Comando para agregar el hu�sped.
     */
    public final static String REGISTRAR = "Registrar huesped";

    /**
     * Comando para cancelar el proceso.
     */
    public final static String CANCELAR = "Cancelar";

    // -----------------------------------------------------------------
    // Atributos
    // -----------------------------------------------------------------

    /**
     * Instancia principal de la aplicaci�n.
     */
    private InterfazHotel principal;

    // -----------------------------------------------------------------
    // Atributos de la interfaz
    // -----------------------------------------------------------------

    /**
     * Campo de texto para el nombre.
     */
    private JTextField txtNombre;

    /**
     * Campo de texto para la c�dula.
     */
    private JTextField txtCedula;

    /**
     * Bot�n para registrar el hu�sped
     */
    private JButton btnRegistrar;

    /**
     * Bot�n para cancelar el proceso.
     */
    private JButton btnCancelar;

    // -----------------------------------------------------------------
    // Constructores
    // -----------------------------------------------------------------

    /**
     * Crea la ventana de di�logo para agregar el hu�sped.
     * @param pPrincipal Instancia principal de la aplicaci�n.
     */
    public DialogoRegistrarHuesped( InterfazHotel pPrincipal )
    {
        principal = pPrincipal;
        setLayout( new BorderLayout( ) );
        setSize( 350, 170 );
        setTitle( "Registrar hu�sped" );
        setLocationRelativeTo( pPrincipal );

        JPanel campos = new JPanel( );
        campos.setLayout( new GridLayout( 2, 2, 3, 3) );
        campos.setBorder( new EmptyBorder( 15 , 15, 15, 15 ) );
        add( campos, BorderLayout.CENTER );

        JLabel lblNombre = new JLabel( "Nombre: " );
        campos.add( lblNombre );
        
        txtNombre = new JTextField( );
        campos.add( txtNombre );
        
        JLabel lblCedula = new JLabel( "C�dula: " );
        campos.add( lblCedula );
        
        txtCedula = new JTextField( );
        campos.add( txtCedula );

        JPanel botones = new JPanel( );
        botones.setBorder( new EmptyBorder( 0, 15, 15, 15 ) );
        botones.setLayout( new GridLayout( 1, 2, 3, 3 ) );
        add( botones, BorderLayout.SOUTH );

        btnRegistrar = new JButton( "Agregar" );
        btnRegistrar.setActionCommand( REGISTRAR );
        btnRegistrar.addActionListener( this );
        botones.add( btnRegistrar );

        btnCancelar = new JButton( "Cancelar" );
        btnCancelar.addActionListener( this );
        btnCancelar.setActionCommand( CANCELAR );
        botones.add( btnCancelar );
    }

    // -----------------------------------------------------------------
    // M�todos
    // -----------------------------------------------------------------

    /**
     * Manejo de eventos del usuario.
     * @param pEvento Evento de usuario. pEvento != null.
     */
    public void actionPerformed( ActionEvent pEvento )
    {
        String comando = pEvento.getActionCommand( );

        if( comando.equals( REGISTRAR ) )
        {
            principal.registrarHuesped( txtNombre.getText( ), txtCedula.getText( ) );
            dispose( );
        }
        else if( comando.equals( CANCELAR ) )
        {
            dispose( );
        }

    }
}