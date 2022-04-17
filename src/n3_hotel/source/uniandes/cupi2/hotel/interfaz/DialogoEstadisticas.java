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
 * Di�logo usado para mostrar las estad�sticas del hotel.
 */
@SuppressWarnings("serial")
public class DialogoEstadisticas extends JDialog implements ActionListener
{

    // -----------------------------------------------------------------
    // Constantes
    // -----------------------------------------------------------------
    /**
     * Comando para cerrar la ventana.
     */
    public final static String CERRAR = "Cerrar";

    // -----------------------------------------------------------------
    // Atributos de la interfaz
    // -----------------------------------------------------------------

    /**
     * Etiqueta para la habitaci�n con mayor consumo.
     */
    private JLabel lblMayorConsumo;

    /**
     * Etiqueta para la habitaci�n con mayor deuda.
     */
    private JLabel lblMayorDeuda;

    /**
     * Etiqueta para la cantidad de habitaciones disponibles.
     */
    private JLabel lblDisponibles;

    /**
     * Etiqueta para la cantidad de habitaciones ocupadas.
     */
    private JLabel lblOcupadas;

    /**
     * Bot�n para cerrar la ventana.
     */
    private JButton btnCerrar;

    // -----------------------------------------------------------------
    // Constructores
    // -----------------------------------------------------------------

    /**
     * Crea el di�logo con las estad�sticas del hotel.
     * @param mayorConsumo Habitaci�n con mayor consumo.
     * @param mayorDeuda Habitaci�n con mayor deuda.
     * @param habitacionesDisponibles Cantidad de habitaciones disponibles.
     * @param habitacionesOcupadas Cantidad de habitaciones ocupadas.
     * @param pPrincipal Interfaz principal
     */
    public DialogoEstadisticas( String mayorConsumo, String mayorDeuda, String habitacionesDisponibles, String habitacionesOcupadas, InterfazHotel pPrincipal )
    {
        setLayout( new BorderLayout( ) );
        setSize( 300, 200 );
        setTitle( "Estad�sticas del hotel" );
        setLocationRelativeTo( pPrincipal );

        JPanel campos = new JPanel( );
        campos.setLayout( new GridLayout( 4, 1, 5, 5 ) );
        campos.setBorder( new EmptyBorder( 20, 20, 20, 20 ) );
        add( campos, BorderLayout.CENTER );

        lblMayorConsumo = new JLabel( "Habitaci�n con mayor consumo: " + mayorConsumo );
        campos.add( lblMayorConsumo );

        lblMayorDeuda = new JLabel( "Habitaci�n con mayor deuda: " + mayorDeuda );
        campos.add( lblMayorDeuda );

        lblDisponibles = new JLabel( "Habitaciones disponibles: " + habitacionesDisponibles );
        campos.add( lblDisponibles );

        lblOcupadas = new JLabel( "Habitaciones ocupadas: " + habitacionesOcupadas );
        campos.add( lblOcupadas );

        JPanel botones = new JPanel( );
        botones.setBorder( new EmptyBorder( 0, 0, 5, 0 ) );
        add( botones, BorderLayout.SOUTH );

        btnCerrar = new JButton( "Cerrar" );
        btnCerrar.addActionListener( this );
        btnCerrar.setActionCommand( CERRAR );
        botones.add( btnCerrar );
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

        if( comando.equals( CERRAR ) )
        {
            dispose( );
        }

    }
}