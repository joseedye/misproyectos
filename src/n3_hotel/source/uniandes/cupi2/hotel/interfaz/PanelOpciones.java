/**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 * Universidad	de	los	Andes	(Bogot?	- Colombia)
 * Departamento	de	Ingenier?a	de	Sistemas	y	Computaci?n
 * Licenciado	bajo	el	esquema	Academic Free License versi?n 2.1
 * 		
 * Proyecto	Cupi2	(http://cupi2.uniandes.edu.co)
 * Ejercicio: n1_calculadoraNotas
 * Autor: Equipo Cupi2 2017
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 */

package uniandes.cupi2.hotel.interfaz;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

/**
 * Contiene los botones ubicados en la parte inferior de la ventana principal.
 */
@SuppressWarnings("serial")
public class PanelOpciones extends JPanel implements ActionListener
{
    // -----------------------------------------------------------------
    // Constantes
    // -----------------------------------------------------------------

    /**
     * Comando para ejecutar la acci?n del bot?n Estad?sticas del hotel.
     */
    private static final String ESTADISTICAS = "Estad?sticas del hotel";

    /**
     * Comando para ejecutar la acci?n del bot?n Estad?sticas del hotel.
     */
    private static final String BUSCAR = "Buscar habitaci?n";

    /**
     * Comando para ejecutar la acci?n del bot?n btnOpcion1.
     */
    private static final String OPCION1 = "Opci?n 1";

    /**
     * Comando para ejecutar la acci?n del bot?n btnOpcion2.
     */
    private static final String OPCION2 = "Opci?n 2";

    // -----------------------------------------------------------------
    // Atributos
    // -----------------------------------------------------------------

    /**
     * Ventana principal de la aplicaci?n
     */
    private InterfazHotel principal;

    // -----------------------------------------------------------------
    // Atributos de la interfaz
    // -----------------------------------------------------------------

    /**
     * Bot?n para las estad?sticas del hotel.
     */
    private JButton btnEstadisticas;

    /**
     * Bot?n para las estad?sticas del hotel.
     */
    private JButton btnBuscar;

    /**
     * Bot?n para la opci?n 1.
     */
    private JButton btnOpcion1;

    /**
     * Bot?n para la opci?n 2.
     */
    private JButton btnOpcion2;

    // -----------------------------------------------------------------
    // Constructores
    // -----------------------------------------------------------------

    /**
     * Construye el panel con los botones <br>
     * <b>post:</b> Todos los botones fueron inicializados.
     * @param pInterfaz Interfaz principal de la aplicaci?n. pInterfaz != null
     */
    public PanelOpciones( InterfazHotel pInterfaz )
    {
        TitledBorder b = BorderFactory.createTitledBorder( "Opciones" );
        setBorder( b );

        principal = pInterfaz;
        setLayout( new GridLayout( 1, 4 ) );

        btnBuscar = new JButton( BUSCAR );
        btnEstadisticas = new JButton( ESTADISTICAS );
        btnOpcion1 = new JButton( OPCION1 );
        btnOpcion2 = new JButton( OPCION2 );

        btnBuscar.addActionListener( this );
        btnEstadisticas.addActionListener( this );
        btnOpcion1.addActionListener( this );
        btnOpcion2.addActionListener( this );

        btnBuscar.setActionCommand( BUSCAR );
        btnEstadisticas.setActionCommand( ESTADISTICAS );
        btnOpcion1.setActionCommand( OPCION1 );
        btnOpcion2.setActionCommand( OPCION2 );

        add( btnBuscar );
        add( btnEstadisticas );
        add( btnOpcion1 );
        add( btnOpcion2 );

    }

    // -----------------------------------------------------------------
    // M?todos
    // -----------------------------------------------------------------

    /**
     * Manejo de eventos del usuario.
     * @param pEvento Evento de usuario. pEvento != null.
     */
    @Override
    public void actionPerformed( ActionEvent pEvento )
    {
        if( pEvento.getActionCommand( ).equals( ESTADISTICAS ) )
        {
            principal.dialogoEstadisticas( );
        }
        else if( pEvento.getActionCommand( ).equals( BUSCAR ) )
        {
            principal.dialogoBuscarHabitacion( );
        }
        else if( pEvento.getActionCommand( ).equals( OPCION1 ) )
        {
            principal.reqFuncOpcion1( );
        }
        else if( pEvento.getActionCommand( ).equals( OPCION2 ) )
        {
            principal.reqFuncOpcion2( );
        }

    }

}
