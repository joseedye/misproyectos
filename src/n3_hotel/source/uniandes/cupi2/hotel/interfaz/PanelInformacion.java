/**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 * Universidad	de	los	Andes	(Bogot�	- Colombia)
 * Departamento	de	Ingenier�a	de	Sistemas	y	Computaci�n
 * Licenciado	bajo el	esquema	Academic Free License versi�n 2.1
 * 		
 * Proyecto	Cupi2	(http://cupi2.uniandes.edu.co)
 * Ejercicio: n3_hotel
 * Autor: Equipo Cupi2 2017
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 */

package uniandes.cupi2.hotel.interfaz;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.util.ArrayList;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

/**
 * Contiene la informaci�n de la habitaci�n seleccionada actualmente.
 */
@SuppressWarnings("serial")
public class PanelInformacion extends JPanel implements ActionListener
{
    // -----------------------------------------------------------------
    // Constantes
    // -----------------------------------------------------------------

    /**
     * Ruta a la imagen del bot�n para registrar un hu�sped
     */
    private static final String REGISTRAR_HUESPED = "data/img/nuevoHuesped.png";
    /**
     * Ruta a la imagen del bot�n para dar salida a un hu�sped
     */
    private static final String DAR_SALIDA_HUESPED = "data/img/darSalidaHuesped.png";
    /**
     * Ruta a la imagen del bot�n para adquirir un servicio
     */
    private static final String ADQUIRIR_SERVICIO = "data/img/comprar.png";
    /**
     * Ruta a la imagen del bot�n para pagar un servicio
     */
    private static final String PAGAR_SERVICIO = "data/img/pagar.png";
    /**
     * Ruta a la fuente usada en la factura
     */
    private static final String FUENTE_FACTURA = "data/img/font.ttf";

    /**
     * Separador de la factura
     */
    private static final String SEPARADOR = "-------------------------------";

    /**
     * Banner de la factura
     */
    private static final String BANNER_FACTURA = "\n          HOTEL CUPI2 \n       FACTURA DE VENTA \n" + SEPARADOR;

    // -----------------------------------------------------------------
    // Atributos
    // -----------------------------------------------------------------

    /**
     * Ventana principal de la aplicaci�n
     */
    private InterfazHotel principal;

    // -----------------------------------------------------------------
    // Atributos de la interfaz
    // -----------------------------------------------------------------

    /**
     * N�mero de la habitaci�n
     */
    private JTextField txtNumero;

    /**
     * Categor�a de la habitaci�n
     */
    private JTextField txtCategoria;

    /**
     * Factura de la habitaci�n
     */
    private JTextArea txtFactura;

    // -----------------------------------------------------------------
    // Constructores
    // -----------------------------------------------------------------

    /**
     * Construye el panel <br>
     * <b>post:</b> Todos los componentes gr�ficos fueron inicializados.
     * @param pInterfaz Interfaz principal de la aplicaci�n. pInterfaz != null
     */
    public PanelInformacion( InterfazHotel pInterfaz )
    {
        principal = pInterfaz;
        setLayout( new BorderLayout( ) );

        ArrayList<JTextField> camposDeTexto = new ArrayList<JTextField>( );

        txtNumero = new JTextField( );
        txtCategoria = new JTextField( );

        camposDeTexto.add( txtNumero );
        camposDeTexto.add( txtCategoria );

        JButton btnRegistrar = new JButton( "Registrar" );
        btnRegistrar.addActionListener( this );
        btnRegistrar.setActionCommand( REGISTRAR_HUESPED );
        ImageIcon iconoRegistrar = new ImageIcon( REGISTRAR_HUESPED );
        iconoRegistrar = new ImageIcon( iconoRegistrar.getImage( ).getScaledInstance( 28, 28, java.awt.Image.SCALE_SMOOTH ) );

        JButton btnDarSalida = new JButton( "Dar salida" );
        btnDarSalida.addActionListener( this );
        btnDarSalida.setActionCommand( DAR_SALIDA_HUESPED );
        ImageIcon iconoDarSalida = new ImageIcon( DAR_SALIDA_HUESPED );
        iconoDarSalida = new ImageIcon( iconoDarSalida.getImage( ).getScaledInstance( 28, 28, java.awt.Image.SCALE_SMOOTH ) );

        JButton btnAdquirirServicio = new JButton( "Adquirir" );
        btnAdquirirServicio.addActionListener( this );
        btnAdquirirServicio.setActionCommand( ADQUIRIR_SERVICIO );
        ImageIcon iconoComprar = new ImageIcon( ADQUIRIR_SERVICIO );
        iconoComprar = new ImageIcon( iconoComprar.getImage( ).getScaledInstance( 28, 28, java.awt.Image.SCALE_SMOOTH ) );

        JButton btnPagarServicio = new JButton( "Pagar" );
        btnPagarServicio.addActionListener( this );
        btnPagarServicio.setActionCommand( PAGAR_SERVICIO );
        ImageIcon iconoPagar = new ImageIcon( PAGAR_SERVICIO );
        iconoPagar = new ImageIcon( iconoPagar.getImage( ).getScaledInstance( 28, 28, java.awt.Image.SCALE_SMOOTH ) );

        JPanel panelHabitacion = new JPanel( new GridLayout( 2, 2 ) );

        panelHabitacion.add( new JLabel( "N�mero" ) );
        panelHabitacion.add( txtNumero );
        panelHabitacion.add( new JLabel( "Categor�a" ) );
        panelHabitacion.add( txtCategoria );

        TitledBorder b = BorderFactory.createTitledBorder( "Habitaci�n" );

        for( JTextField campo : camposDeTexto )
        {
            campo.setEditable( false );
            campo.setBackground( Color.WHITE );
        }

        JPanel panelHuesped = new JPanel( new GridLayout( 1, 2 ) );

        panelHuesped.add( btnRegistrar );
        panelHuesped.add( btnDarSalida );

        TitledBorder bHuesped = BorderFactory.createTitledBorder( "Hu�sped" );
        panelHuesped.setBorder( bHuesped );

        JPanel panelSuperior = new JPanel( new BorderLayout( ) );

        panelSuperior.add( panelHabitacion, BorderLayout.NORTH );
        panelSuperior.add( panelHuesped, BorderLayout.CENTER );

        JPanel panelFactura = new JPanel( );
        TitledBorder bFactura = BorderFactory.createTitledBorder( "Factura" );
        panelFactura.setBorder( bFactura );

        JPanel panelServicios = new JPanel( new GridLayout( 1, 2 ) );
        TitledBorder bServicios = BorderFactory.createTitledBorder( "Servicios" );
        panelServicios.setBorder( bServicios );
        panelServicios.add( btnAdquirirServicio );
        panelServicios.add( btnPagarServicio );

        txtFactura = new JTextArea( 20, 32 );

        txtFactura.setText( BANNER_FACTURA );

        Font fuenteFactura = null;

        try
        {
            fuenteFactura = Font.createFont( Font.TRUETYPE_FONT, new File( FUENTE_FACTURA ) ).deriveFont( 12f );
        }
        catch( Exception e )
        {
            // Error cargando la fuente
        }

        JScrollPane scrollFactura = new JScrollPane( txtFactura );
        if( fuenteFactura != null )
        {
            txtFactura.setFont( fuenteFactura );
        }
        panelFactura.add( scrollFactura );
        txtFactura.setBackground( Color.WHITE );
        txtFactura.setEditable( false );

        add( panelSuperior, BorderLayout.NORTH );
        add( panelFactura, BorderLayout.CENTER );
        add( panelServicios, BorderLayout.SOUTH );
        setBorder( b );


    }

    /**
     * Permite actualizar el panel, con la informaci�n ingresada por par�metro.
     * @param pNumeroHabitacion N�mero de la habitaci�n
     * @param pCategoria Categor�a de la habitaci�n
     * @param pNombreHuesped Nombre del hu�sped
     * @param pCedulaHuesped C�dula del hu�sped
     * @param pNumMiniBar Veces que fue pedido el servicio de MiniBar
     * @param pNumInternet Veces que fue pedido el servicio de Internet
     * @param pNumSpa Veces que fue pedido el servicio de SPA
     * @param pNumPeliculas Veces que fue pedido el servicio de pel�culas
     * @param servicios Arreglo de servicios consumidos por la habitaci�n
     * @param consumoTotal Consumo total de la habitaci�n
     * @param deudaTotal Deuda total de la habitaci�n
     * @param servicioMasSolicitado Servicio m�s solicitado en la habitaci�n
     */
    public void actualizar( String pNumeroHabitacion, String pCategoria, String pNombreHuesped, String pCedulaHuesped, int pNumMiniBar, int pNumInternet, int pNumSpa, int pNumPeliculas, String[] servicios, double consumoTotal, double deudaTotal,
            String servicioMasSolicitado )
    {
        txtNumero.setText( pNumeroHabitacion );
        txtCategoria.setText( pCategoria );
        String contenido = BANNER_FACTURA;
        if( pNombreHuesped != null )
        {
            contenido += "\n CLIENTE: " + pNombreHuesped + "\n C�DULA: " + pCedulaHuesped;

            contenido += "\n" + SEPARADOR;

            if( pNumMiniBar > 0 )
            {
                contenido += "\n TOTAL MINI_BAR: " + pNumMiniBar;
            }

            if( pNumInternet > 0 )
            {
                contenido += "\n TOTAL INTERNET: " + pNumInternet;
            }

            if( pNumSpa > 0 )
            {
                contenido += "\n TOTAL SPA: " + pNumSpa;
            }

            if( pNumPeliculas > 0 )
            {
                contenido += "\n TOTAL PELICULAS: " + pNumPeliculas;
            }
            contenido += "\n" + SEPARADOR;

            for( String servicio : servicios )
            {

                contenido += servicio;
            }

            if( servicios.length > 0 )
            {
                contenido += "\n" + SEPARADOR + "\n";
                contenido += "CONSUMO TOTAL: $" + consumoTotal + "\n";
                contenido += "DEUDA TOTAL: $" + deudaTotal + "\n";
                contenido += "M�S SOLICITADO: " + servicioMasSolicitado + "\n";
            }

        }
        else
        {
            contenido += "\n \n      (HABITACI�N VAC�A) \n \n" + SEPARADOR;
        }

        txtFactura.setText( contenido );
    }

    /**
     * Recibe los eventos de los botones de la interfaz
     * @param pEvento Evento que dispara el m�todo.
     */
    @Override
    public void actionPerformed( ActionEvent pEvento )
    {
        String comando = pEvento.getActionCommand( );

        if( comando.equals( REGISTRAR_HUESPED ) )
        {
            principal.dialogoRegistrarHuesped( );
        }
        else if( comando.equals( DAR_SALIDA_HUESPED ) )
        {
            principal.darSalidaHuesped( );
        }
        else if( comando.equals( ADQUIRIR_SERVICIO ) )
        {
            principal.dialogoAdquirirServicio( );
        }
        else if( comando.equals( PAGAR_SERVICIO ) )
        {
            principal.dialogoPagarServicio( );
        }

    }

    // -----------------------------------------------------------------
    // M�todos
    // -----------------------------------------------------------------

}
