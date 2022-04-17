/**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 * Universidad	de	los	Andes	(Bogot�	- Colombia)
 * Departamento	de	Ingenier�a	de	Sistemas	y	Computaci�n
 * Licenciado	bajo	el	esquema	Academic Free License versi�n 2.1
 * 		
 * Proyecto	Cupi2	(http://cupi2.uniandes.edu.co)
 * Ejercicio: n3_hotel
 * Autor: Equipo Cupi2 2017
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 */

package uniandes.cupi2.hotel.interfaz;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

import uniandes.cupi2.hotel.mundo.Habitacion;
import uniandes.cupi2.hotel.mundo.Hotel;
import uniandes.cupi2.hotel.mundo.Servicio;
import uniandes.cupi2.hotel.mundo.Servicio.Tipo;

/**
 * Clase principal de la interfaz
 */
@SuppressWarnings("serial")
public class InterfazHotel extends JFrame
{
	// -----------------------------------------------------------------
	// Atributos
	// -----------------------------------------------------------------

	/**
	 * Asociaci�n a la clase principal del mundo.
	 */
	private Hotel mundo;

	/**
	 * Identificador de la habitaci�n seleccionada actualmente en la interfaz.
	 */
	private int habitacionActual;

	// -----------------------------------------------------------------
	// Atributos de la interfaz
	// -----------------------------------------------------------------

	/**
	 * Contiene el Banner.
	 */
	private PanelImagen panelImagen;

	/**
	 * Contiene las ventanas del hotel.
	 */
	private PanelHotel panelHotel;

	/**
	 * Contiene la informaci�n de la habitaci�n seleccionada actualmente.
	 */
	private PanelInformacion panelInformacion;

	/**
	 * Panel de botones ubicado en la zona inferior de la interfaz
	 */
	private PanelOpciones panelOpciones;


	// -----------------------------------------------------------------
	// Constructores
	// -----------------------------------------------------------------

	/**
	 * Construye la ventana principal de la aplicaci�n. <br>
	 * <b>post:</b> Todos los componentes de la interfaz fueron inicializados.
	 */
	public InterfazHotel( )
	{
		setTitle( "Hotel" );
		setSize( 800, 685 );
		setLocationRelativeTo( null );
		setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
		setResizable( false );

		mundo = new Hotel( );
		habitacionActual = 0;

		panelImagen = new PanelImagen( );
		add( panelImagen, BorderLayout.NORTH );

		panelHotel = new PanelHotel( this );
		add(panelHotel, BorderLayout.WEST);

		panelInformacion = new PanelInformacion( this );
		add(panelInformacion, BorderLayout.EAST);

		panelOpciones = new PanelOpciones( this );
		add( panelOpciones, BorderLayout.SOUTH );


	}

	// -----------------------------------------------------------------
	// M�todos
	// -----------------------------------------------------------------

	/**
	 * Actualiza la habitaci�n seleccionada actualmente en la interfaz.<br>
	 * @param pHabitacion Nueva habitaci�n seleccionada.
	 */
	public void actualizarHabitacionActual( int pHabitacion )
	{
		habitacionActual = pHabitacion;
	}

	/**
	 * Actualiza los diferentes p�neles de la interfaz, con la habitacionActual.<br>
	 */
	public void actualizarInterfaz()
	{
		String nombreHuesped = null;
		String cedulaHuesped = null;
		if(  mundo.darHabitacion( habitacionActual ).estaOcupada( ) )
		{
			panelHotel.actualizar( true , mundo.darHabitacion( habitacionActual ).darHuesped( ).darNombre( ) );
			nombreHuesped = mundo.darHabitacion( habitacionActual ).darHuesped( ).darNombre( );
			cedulaHuesped = mundo.darHabitacion( habitacionActual ).darHuesped( ).darCedula( );

		}
		else
		{
			panelHotel.actualizar( false , null );
		}

		String numeroHabitacion = mundo.darHabitacion( habitacionActual ).darNumero( )+"";
		String categoria = mundo.darHabitacion( habitacionActual ).darCategoria( )+"";


		ArrayList <Servicio> servicios = mundo.darHabitacion(habitacionActual).darServicios();
		String[] serviciosTxt = new String [servicios.size()];

		for(int i=0; i< servicios.size(); i++)
		{
			Servicio s = servicios.get(i);
			serviciosTxt[i] = "\n"+s.darIdentificador() + " "+s.darTipo() + ": $"+s.darCosto();
			if(s.estaPagado())
			{
				serviciosTxt[i]+= "(PAGADO)";
			}
		}

		String servicioTxt = "Ninguno";
		Tipo servicioMasSolicitado = mundo.darServicioMasSolicitado(habitacionActual);
		if(servicioMasSolicitado != null)
		{
			servicioTxt = servicioMasSolicitado+"";
		}

		panelInformacion.actualizar( numeroHabitacion, categoria, nombreHuesped, cedulaHuesped, mundo.darCantidadServiciosHabitacion(habitacionActual, Tipo.MINI_BAR ), mundo.darCantidadServiciosHabitacion(habitacionActual, Tipo.INTERNET ), mundo.darCantidadServiciosHabitacion(habitacionActual, Tipo.SPA), mundo.darCantidadServiciosHabitacion(habitacionActual, Tipo.PELICULAS), serviciosTxt, mundo.darConsumo(habitacionActual), mundo.darDeuda(habitacionActual), servicioTxt );


	}

	/**
	 * Crea el di�logo para registrar un nuevo hu�sped.<br>
	 */
	public void dialogoRegistrarHuesped()
	{
		if(habitacionActual != 0)
		{
			DialogoRegistrarHuesped dlgRegistrarHuesped = new DialogoRegistrarHuesped(this);
			dlgRegistrarHuesped.setVisible( true );
		}
		else
		{
			String mensaje = "Debe seleccionar una habitaci�n antes de registrar un hu�sped";
			JOptionPane.showMessageDialog( this, mensaje, "Registrar hu�sped", JOptionPane.ERROR_MESSAGE );
		}
	}

	/**
	 * Permite registrar un nuevo hu�sped.<br>
	 * @param pNombre Nombre del hu�sped.
	 * @param pCedula C�dula del hu�sped.
	 */
	public void registrarHuesped( String pNombre, String pCedula )
	{
		boolean respuesta = mundo.registrarHuesped( habitacionActual, pNombre, pCedula );
		if(respuesta)
		{
			actualizarInterfaz();
		}
		else
		{
			String mensaje = "La habitaci�n ya tiene un hu�sped";
			JOptionPane.showMessageDialog( this, mensaje, "Registrar hu�sped", JOptionPane.ERROR_MESSAGE );
		}
	}

	/**
	 * Permite dar salida al hu�sped de la habitaci�n actual. <br>
	 */
	public void darSalidaHuesped( )
	{
		if(habitacionActual != 0)
		{

			boolean respuesta = mundo.darSalidaHuesped(habitacionActual);
			if(respuesta)
			{
				actualizarInterfaz();
			}

			else
			{
				String mensaje = "El hu�sped tiene servicios por pagar";
				if(mundo.darHabitacion(habitacionActual).estaOcupada() == false)
				{
					mensaje = "La habitaci�n se encuentra vac�a";
				}
				JOptionPane.showMessageDialog( this, mensaje, "Dar salida hu�sped", JOptionPane.ERROR_MESSAGE );
			}
		}
		else
		{
			String mensaje = "Debe seleccionar una habitaci�n antes de dar salida a un hu�sped";
			JOptionPane.showMessageDialog( this, mensaje, "Dar salida hu�sped", JOptionPane.ERROR_MESSAGE );
		}
	}

	/**
	 * Abre el di�logo para adquirir un nuevo servicio.<br>
	 */
	public void dialogoAdquirirServicio( )
	{
		if(habitacionActual != 0)
		{
			if(mundo.darHabitacion(habitacionActual).estaOcupada())
			{

				Tipo[] servicios = Servicio.Tipo.values();
				String[] opciones = new String[servicios.length];
				for (int i = 0; i<servicios.length; i++) {

					opciones[i] = servicios[i]+"";    	 		 
				}

				String respuesta = ( String )JOptionPane.showInputDialog( this, "Seleccione el tipo de servicio a contratar", "Adquirir servicio", JOptionPane.QUESTION_MESSAGE, null, opciones, opciones[ 0 ] );

				if(respuesta != null)
				{
					double costo = -1;
					boolean cancela = false;

					while(costo < 0 && !cancela)
					{
						String strCosto = ( String )JOptionPane.showInputDialog( this, "Ingrese el costo del servicio", "Adquirir servicio", JOptionPane.QUESTION_MESSAGE);

						if(strCosto != null)

						{

							try
							{
								costo = Double.parseDouble(strCosto);
								if(costo<0)
								{
									JOptionPane.showMessageDialog( this, "Solo es posible introducir costos num�ricos positivos", "Adquirir servicio", JOptionPane.ERROR_MESSAGE );
								}
							}
							catch(Exception e)
							{
								JOptionPane.showMessageDialog( this, "Solo es posible introducir costos num�ricos positivos", "Adquirir servicio", JOptionPane.ERROR_MESSAGE );
							}
						}

						else
						{
							cancela = true;
						}
					}

					if(!cancela)
					{

						for (int i = 0; i< servicios.length; i++) {

							String servicio = servicios[i]+"";
							if(servicio.equals(respuesta))
							{
								mundo.adquirirServicio(habitacionActual, servicios[i], costo);
								actualizarInterfaz();

							}
						}
					}


				}
			}
			else
			{
				String mensaje = "La habitaci�n no tiene hu�sped";
				JOptionPane.showMessageDialog( this, mensaje, "Adquirir servicio", JOptionPane.ERROR_MESSAGE );
			}


		}
		else
		{
			String mensaje = "Debe seleccionar una habitaci�n antes de adquirir un servicio";
			JOptionPane.showMessageDialog( this, mensaje, "Adquirir servicio", JOptionPane.ERROR_MESSAGE );
		}
	}

	/**
	 * Abre el di�logo para pagar un servicio.<br>
	 */
	public void dialogoPagarServicio ( )
	{
		if(habitacionActual != 0)
		{

			if(mundo.darHabitacion(habitacionActual).estaOcupada())
			{

				ArrayList<Servicio> servicios = mundo.darHabitacion(habitacionActual).darServicios();
				ArrayList <String> opciones = new ArrayList<String>();

				for(int i=0; i<servicios.size(); i++)
				{
					Servicio actual = servicios.get(i);
					if(!actual.estaPagado())
					{
						opciones.add(actual.darIdentificador() + " - "+ actual.darTipo());
					}
				}

				if(opciones.size() == 0)
				{
					String mensaje = "La habitaci�n no tiene servicios por pagar";
					JOptionPane.showMessageDialog( this, mensaje, "Pagar servicio", JOptionPane.INFORMATION_MESSAGE );
				}
				else
				{
					String respuesta = ( String )JOptionPane.showInputDialog( this, "Seleccione el servicio que desea pagar", "Pagar servicio", JOptionPane.QUESTION_MESSAGE, null, opciones.toArray(), opciones.toArray()[0] );

					if(respuesta != null)
					{
						int aPagar = Integer.parseInt(respuesta.split(" - ")[0]);
						mundo.pagarServicio(habitacionActual, aPagar);
						actualizarInterfaz();
					}
				}
			}
			else
			{
				String mensaje = "La habitaci�n se encuentra vac�a";
				JOptionPane.showMessageDialog( this, mensaje, "Pagar servicio", JOptionPane.ERROR_MESSAGE );
			}

		}
		else
		{
			String mensaje = "Debe seleccionar una habitaci�n antes de pagar un servicio";
			JOptionPane.showMessageDialog( this, mensaje, "Pagar servicio", JOptionPane.ERROR_MESSAGE );
		}
	}

	/**
	 * Abre el di�logo con las estad�sticas del hotel.<br>
	 */
	public void dialogoEstadisticas() {
		String mayorConsumo = "NINGUNA";
		if(mundo.darHabitacionMayorConsumo() != null)
		{
			mayorConsumo = mundo.darHabitacionMayorConsumo().darNumero()+"";
		}

		String mayorDeuda = "NINGUNA";
		if(mundo.darHabitacionMayorDeuda() != null)
		{
			mayorDeuda = mundo.darHabitacionMayorDeuda().darNumero()+"";
		}

		String disponibles = mundo.darCantidadHabitacionesDisponibles()+"";
		String ocupadas = mundo.darCantidadHabitacionesOcupadas()+"";
		DialogoEstadisticas dialogo = new DialogoEstadisticas(mayorConsumo, mayorDeuda, disponibles, ocupadas, this);
		dialogo.setVisible(true);

	}

	/**
	 * Abre el di�logo para buscar una habitaci�n por c�dula.
	 */
	public void dialogoBuscarHabitacion() {

		String cedula = ( String )JOptionPane.showInputDialog( this, "Ingrese la c�dula del hu�sped", "Buscar habitaci�n", JOptionPane.QUESTION_MESSAGE);

		if(cedula != null)
		{
			Habitacion habitacionEncontrada = mundo.buscarHabitacionPorHuesped(cedula);
			if(habitacionEncontrada != null)
			{

				ActionEvent evento = new ActionEvent(this, 1, (habitacionEncontrada.darNumero()-1)+"");
				panelHotel.actionPerformed(evento);

			}
			else
			{
				String mensaje = "No se encontr� la habitaci�n con la c�dula dada";
				JOptionPane.showMessageDialog( this, mensaje, "Buscar habitaci�n", JOptionPane.ERROR_MESSAGE );
			}
		}


	}




	// -----------------------------------------------------------------
	// Puntos de extensi�n
	// -----------------------------------------------------------------

	/**
	 * Extensi�n 1
	 */
	public void reqFuncOpcion1( )
	{

		String resultado = mundo.metodo1( );
		JOptionPane.showMessageDialog( this, resultado, "Respuesta 1", JOptionPane.INFORMATION_MESSAGE );
	}

	/**
	 * Extensi�n 2
	 */
	public void reqFuncOpcion2( )
	{

		String resultado = mundo.metodo2( );
		JOptionPane.showMessageDialog( this, resultado, "Respuesta 2", JOptionPane.INFORMATION_MESSAGE );
	}

	// -----------------------------------------------------------------
	// Main
	// -----------------------------------------------------------------

	/**
	 * Este m�todo ejecuta la aplicaci�n, creando una nueva interfaz
	 * @param args Arreglo opcional de argumentos que se recibe por l�nea de comandos
	 */
	public static void main( String[] args )
	{
		try
		{
			// Unifica la interfaz para Mac y para Windows.
			UIManager.setLookAndFeel( UIManager.getCrossPlatformLookAndFeelClassName( ) );

			InterfazHotel interfaz = new InterfazHotel( );
			interfaz.setVisible( true );
		}
		catch( Exception e )
		{
			e.printStackTrace( );
		}
	}










}
