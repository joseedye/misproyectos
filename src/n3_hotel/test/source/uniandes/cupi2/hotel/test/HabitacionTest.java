/**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 * Universidad  de  los Andes   (Bogot� - Colombia)
 * Departamento de  Ingenier�a  de  Sistemas    y   Computaci�n
 * Licenciado   bajo    el  esquema Academic Free License versi�n 2.1
 *      
 * Proyecto Cupi2   (http://cupi2.uniandes.edu.co)
 * Ejercicio: n3_hotel
 * Autor: Equipo Cupi2 2017
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 */

package uniandes.cupi2.hotel.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import uniandes.cupi2.hotel.mundo.Habitacion;
import uniandes.cupi2.hotel.mundo.Habitacion.Categoria;
import uniandes.cupi2.hotel.mundo.Servicio.Tipo;

/**
 * Clase usada para verificar que los m�todos de la clase Habitacion est�n correctamente implementados.
 */
public class HabitacionTest
{

    // -----------------------------------------------------------------
    // Atributos
    // -----------------------------------------------------------------

    /**
     * Habitaci�n en la que se realizar�n las pruebas.
     */
    private Habitacion habitacion;

    // -----------------------------------------------------------------
    // Escenarios
    // -----------------------------------------------------------------
    /**
     * Crea una instancia de la clase Habitacion. Se crea con categor�a EJECUTIVA.
     */
    @Before
    public void setupEscenario1( )
    {
        habitacion = new Habitacion( 1, Categoria.EJECUTIVA );
    }

    /**
     * Crea una instancia de la clase Habitacion. Se crea con categor�a DOBLE.
     */
    public void setupEscenario2( )
    {
        habitacion = new Habitacion( 2, Categoria.DOBLE );
    }

    /**
     * Crea una instancia de la clase Habitacion. Se crea con categor�a SUITE.
     */
    public void setupEscenario3( )
    {
        habitacion = new Habitacion( 3, Categoria.SUITE );
    }

    /**
     * Crea una instancia de la clase Habitacion. Se crea con categor�a PRESIDENCIAL.
     */
    public void setupEscenario4( )
    {
        habitacion = new Habitacion( 4, Categoria.PRESIDENCIAL );
    }

    // -----------------------------------------------------------------
    // M�todos de prueba
    // -----------------------------------------------------------------
    /**
     * <b>Prueba 1</b> : verifica el m�todo constructor de la Habitaci�n.<br>
     * <b>M�todos a probar: </b><br>
     * Habitacion<br>
     * darNumero<br>
     * darCategoria<br>
     * darServicio<br>
     * darHuesped<br>
     * <b>Casos de prueba:</b><br>
     * 1. Se crea la habitaci�n EJECUTIVA correctamente.<br>
     * 2. Se crea la habitaci�n DOBLE correctamente. <br>
     * 3. Se crea la habitaci�n SUITE correctamente. <br>
     * 4. Se crea la habitaci�n PRESIDENCIAL correctamente.
     */
    @Test
    public void testHabitacion( )
    {
        // Caso de prueba 1
        assertEquals( "El n�mero asignado a la habitaci�n no corresponde.", 1, habitacion.darNumero( ) );
        assertEquals( "La categor�a asignada a la habitaci�n no corresponde.", Categoria.EJECUTIVA, habitacion.darCategoria( ) );
        assertTrue( "El arreglo de servicios no fue inicializado.", habitacion.darServicios( ) != null );
        assertEquals( "El hu�sped no fue inicializado en null.", null, habitacion.darHuesped( ) );

        // Caso de prueba 2
        setupEscenario2( );
        assertEquals( "El n�mero asignado a la habitaci�n no corresponde.", 2, habitacion.darNumero( ) );
        assertEquals( "La categor�a asignada a la habitaci�n no corresponde.", Categoria.DOBLE, habitacion.darCategoria( ) );
        assertTrue( "El arreglo de servicios no fue inicializado.", habitacion.darServicios( ) != null );
        assertEquals( "El hu�sped no fue inicializado en null.", null, habitacion.darHuesped( ) );

        // Caso de prueba 3
        setupEscenario3( );
        assertEquals( "El n�mero asignado a la habitaci�n no corresponde.", 3, habitacion.darNumero( ) );
        assertEquals( "La categor�a asignada a la habitaci�n no corresponde.", Categoria.SUITE, habitacion.darCategoria( ) );
        assertTrue( "El arreglo de servicios no fue inicializado.", habitacion.darServicios( ) != null );
        assertEquals( "El hu�sped no fue inicializado en null.", null, habitacion.darHuesped( ) );

        // Caso de prueba 4
        setupEscenario4( );
        assertEquals( "El n�mero asignado a la habitaci�n no corresponde.", 4, habitacion.darNumero( ) );
        assertEquals( "La categor�a asignada a la habitaci�n no corresponde.", Categoria.PRESIDENCIAL, habitacion.darCategoria( ) );
        assertTrue( "El arreglo de servicios no fue inicializado.", habitacion.darServicios( ) != null );
        assertEquals( "El hu�sped no fue inicializado en null.", null, habitacion.darHuesped( ) );

    }

    /**
     * <b>Prueba 2</b> : verifica el m�todo darConsumoTotal.<br>
     * <b>M�todos a probar: </b><br>
     * darConsumoTotal<br>
     * adquirirServicio<br>
     * pagarServicio<br>
     * <b>Casos de prueba:</b><br>
     * 1. Se calcula el consumo total, todos los servicios deber�an adquirirse.<br>
     * 2. Se calcula el consumo total, todos los servicios deber�an adquirirse.<br>
     * 3. Se calcula el consumo total, pagando los servicios.<br>
     * 4. Se calcula el consumo total, usando el servicio de SPA y pagando servicios.
     */
    @Test
    public void testDarConsumoTotal( )
    {
        // Caso de prueba 1
        habitacion.registrarHuesped( "Juan", "1234" );
        habitacion.adquirirServicio( Tipo.INTERNET, 120 );
        assertEquals( "El consumo total de la habitaci�n no fue calculado correctamente.", 120, habitacion.darConsumoTotal( ), 0.001 );
        habitacion.adquirirServicio( Tipo.PELICULAS, 145 );
        assertEquals( "El consumo total de la habitaci�n no fue calculado correctamente.", 265, habitacion.darConsumoTotal( ), 0.001 );
        habitacion.adquirirServicio( Tipo.MINI_BAR, 20 );
        assertEquals( "El consumo total de la habitaci�n no fue calculado correctamente.", 285, habitacion.darConsumoTotal( ), 0.001 );

        // Caso de prueba 2
        setupEscenario2( );
        habitacion.registrarHuesped( "Juan", "1234" );
        habitacion.adquirirServicio( Tipo.INTERNET, 120 );
        assertEquals( "El consumo total de la habitaci�n no fue calculado correctamente.", 120, habitacion.darConsumoTotal( ), 0.001 );
        habitacion.adquirirServicio( Tipo.SPA, 145 );
        assertEquals( "El consumo total de la habitaci�n no fue calculado correctamente.", 265, habitacion.darConsumoTotal( ), 0.001 );
        habitacion.adquirirServicio( Tipo.MINI_BAR, 20 );
        assertEquals( "El consumo total de la habitaci�n no fue calculado correctamente.", 285, habitacion.darConsumoTotal( ), 0.001 );

        // Caso de prueba 3
        assertEquals( "El consumo total de la habitaci�n no fue calculado correctamente.", 285, habitacion.darConsumoTotal( ), 0.001 );
        habitacion.pagarServicio( 1 );
        assertEquals( "El consumo total de la habitaci�n no fue calculado correctamente.", 285, habitacion.darConsumoTotal( ), 0.001 );
        habitacion.pagarServicio( 2 );
        assertEquals( "El consumo total de la habitaci�n no fue calculado correctamente.", 285, habitacion.darConsumoTotal( ), 0.001 );
        habitacion.pagarServicio( 3 );
        assertEquals( "El consumo total de la habitaci�n no fue calculado correctamente.", 285, habitacion.darConsumoTotal( ), 0.001 );

        // Caso de prueba 4
        setupEscenario3( );
        habitacion.registrarHuesped( "Juan", "1234" );
        habitacion.adquirirServicio( Tipo.INTERNET, 145.5 );
        assertEquals( "El consumo total de la habitaci�n no fue calculado correctamente.", 145.5, habitacion.darConsumoTotal( ), 0.001 );
        habitacion.adquirirServicio( Tipo.MINI_BAR, 20 );
        assertEquals( "El consumo total de la habitaci�n no fue calculado correctamente.", 165.5, habitacion.darConsumoTotal( ), 0.001 );
        habitacion.pagarServicio( 2 );
        assertEquals( "El consumo total de la habitaci�n no fue calculado correctamente.", 165.5, habitacion.darConsumoTotal( ), 0.001 );
        habitacion.pagarServicio( 1 );
        assertEquals( "El consumo total de la habitaci�n no fue calculado correctamente.", 165.5, habitacion.darConsumoTotal( ), 0.001 );

    }

    /**
     * <b>Prueba 3</b> : verifica el m�todo darDeudaTotal.<br>
     * <b>M�todos a probar: </b><br>
     * darDeudaTotal<br>
     * adquirirServicio<br>
     * pagarServicio<br>
     * <b>Casos de prueba:</b><br>
     * 1. Se calcula la deuda total, todos los servicios deber�an adquirirse.<br>
     * 2. Se calcula la deuda total, todos los servicios deber�an adquirirse.<br>
     * 3. Se calcula la deuda total, pagando los servicios.<br>
     * 4. Se calcula la deuda total, pagando servicios.<br>
     */
    @Test
    public void testDarDeudaTotal( )
    {
        // Caso de prueba 1
        habitacion.registrarHuesped( "Juan", "1234" );
        habitacion.adquirirServicio( Tipo.INTERNET, 120 );
        assertEquals( "El consumo total de la habitaci�n no fue calculado correctamente.", 120, habitacion.darDeudaTotal( ), 0.001 );
        habitacion.adquirirServicio( Tipo.PELICULAS, 145 );
        assertEquals( "El consumo total de la habitaci�n no fue calculado correctamente.", 265, habitacion.darDeudaTotal( ), 0.001 );
        habitacion.adquirirServicio( Tipo.MINI_BAR, 20 );
        assertEquals( "El consumo total de la habitaci�n no fue calculado correctamente.", 285, habitacion.darDeudaTotal( ), 0.001 );

        // Caso de prueba 2
        setupEscenario2( );
        habitacion.registrarHuesped( "Juan", "1234" );
        habitacion.adquirirServicio( Tipo.INTERNET, 120 );
        assertEquals( "El consumo total de la habitaci�n no fue calculado correctamente.", 120, habitacion.darDeudaTotal( ), 0.001 );
        habitacion.adquirirServicio( Tipo.SPA, 145 );
        assertEquals( "El consumo total de la habitaci�n no fue calculado correctamente.", 265, habitacion.darDeudaTotal( ), 0.001 );
        habitacion.adquirirServicio( Tipo.MINI_BAR, 20 );
        assertEquals( "El consumo total de la habitaci�n no fue calculado correctamente.", 285, habitacion.darDeudaTotal( ), 0.001 );

        // Caso de prueba 3
        assertEquals( "El consumo total de la habitaci�n no fue calculado correctamente.", 285, habitacion.darDeudaTotal( ), 0.001 );
        habitacion.pagarServicio( 1 );
        assertEquals( "El consumo total de la habitaci�n no fue calculado correctamente.", 165, habitacion.darDeudaTotal( ), 0.001 );
        habitacion.pagarServicio( 2 );
        assertEquals( "El consumo total de la habitaci�n no fue calculado correctamente.", 20, habitacion.darDeudaTotal( ), 0.001 );
        habitacion.pagarServicio( 3 );
        assertEquals( "El consumo total de la habitaci�n no fue calculado correctamente.", 0, habitacion.darDeudaTotal( ), 0.001 );

        // Caso de prueba 4
        setupEscenario3( );
        habitacion.registrarHuesped( "Juan", "1234" );
        habitacion.adquirirServicio( Tipo.INTERNET, 145.5 );
        assertEquals( "El consumo total de la habitaci�n no fue calculado correctamente.", 145.5, habitacion.darDeudaTotal( ), 0.001 );
        habitacion.adquirirServicio( Tipo.SPA, 37 );
        assertEquals( "El consumo total de la habitaci�n no fue calculado correctamente.", 182.5, habitacion.darDeudaTotal( ), 0.001 );
        habitacion.adquirirServicio( Tipo.MINI_BAR, 20 );
        assertEquals( "El consumo total de la habitaci�n no fue calculado correctamente.", 202.5, habitacion.darDeudaTotal( ), 0.001 );
        habitacion.pagarServicio( 3 );
        assertEquals( "El consumo total de la habitaci�n no fue calculado correctamente.", 182.5, habitacion.darDeudaTotal( ), 0.001 );
        habitacion.pagarServicio( 2 );
        assertEquals( "El consumo total de la habitaci�n no fue calculado correctamente.", 145.5, habitacion.darDeudaTotal( ), 0.001 );
        habitacion.pagarServicio( 1 );
        assertEquals( "El consumo total de la habitaci�n no fue calculado correctamente.", 0, habitacion.darDeudaTotal( ), 0.001 );

    }

    /**
     * <b>Prueba 4</b> : verifica el m�todo estaOcupada.<br>
     * <b>M�todos a probar: </b><br>
     * estaOcupada<br>
     * registrarHuesped<br>
     * darSalidaHuesped<br>
     * <b>Casos de prueba:</b><br>
     * 1. Se prueba sin hu�sped, se registra un hu�sped, y luego se le da salida de nuevo.
     */
    @Test
    public void testEstaOcupada( )
    {
        // Caso de prueba 1
        assertEquals( "La habitaci�n no deber�a estar ocupada.", false, habitacion.estaOcupada( ) );
        habitacion.registrarHuesped( "Carlos", "123456" );
        assertEquals( "La habitaci�n deber�a estar ocupada.", true, habitacion.estaOcupada( ) );
        habitacion.darSalidaHuesped( );
        assertEquals( "La habitaci�n no deber�a estar ocupada.", false, habitacion.estaOcupada( ) );
    }

    /**
     * <b>Prueba 5</b> : verifica el m�todo registrarHuesped.<br>
     * <b>M�todos a probar: </b><br>
     * registrarHuesped<br>
     * darSalidaHuesped<br>
     * <b>Casos de prueba:</b><br>
     * 1. Se prueba sin hu�sped, se registra un hu�sped, y luego se le da salida de nuevo.<br>
     */
    @Test
    public void testRegistrarHuesped( )
    {
        // Caso de prueba 1
        assertEquals( "La habitaci�n no deber�a estar ocupada.", false, habitacion.estaOcupada( ) );
        boolean registra = habitacion.registrarHuesped( "Carlos", "123456" );
        assertEquals( "Se deber�a registrar el hu�sped.", true, registra );
        assertEquals( "La habitaci�n deber�a estar ocupada.", true, habitacion.estaOcupada( ) );
        assertEquals( "El huesped de la habitaci�n no deber�a ser null", true, habitacion.darHuesped( ) != null );
    }

    /**
     * <b>Prueba 6</b> : verifica el m�todo darSalidaHuesped.<br>
     * <b>M�todos a probar: </b><br>
     * registrarHuesped<br>
     * darSalidaHuesped<br>
     * adquirirServicio<br>
     * pagarServicio<br>
     * <b>Casos de prueba:</b><br>
     * 1. Se da salida a un hu�sped sin servicios adquiridos.<br>
     * 2. No se da salida a un hu�sped con servicios adquiridos no pagados.<br>
     * 3. Se da salida a un hu�sped con servicios adquiridos y pagados.<br>
     */
    @Test
    public void testDarSalidarHuesped( )
    {
        // Caso de prueba 1
        habitacion.registrarHuesped( "Carlos", "123456" );
        boolean daSalida = habitacion.darSalidaHuesped( );
        assertEquals( "El hu�sped de la habitaci�n deber�a ser null", true, habitacion.darHuesped( ) == null );
        assertEquals( "El m�todo debi� dar salida", true, daSalida );
        assertEquals( "El arreglo de servicios deber�a existir", true, habitacion.darServicios( ) != null );
        assertEquals( "No deber�an existir servicios registrados", 0, habitacion.darServicios( ).size( ), 0.0001 );

        // Caso de prueba 2
        setupEscenario2( );
        habitacion.registrarHuesped( "Carlos", "123456" );
        habitacion.adquirirServicio( Tipo.INTERNET, 500 );
        daSalida = habitacion.darSalidaHuesped( );
        assertEquals( "El hu�sped de la habitaci�n no deber�a ser null", true, habitacion.darHuesped( ) != null );
        assertEquals( "No se debi� dar salida al hu�sped", false, daSalida );

        // Caso de prueba 3
        setupEscenario3( );
        habitacion.registrarHuesped( "Carlos", "123456" );
        habitacion.adquirirServicio( Tipo.SPA, 850 );
        habitacion.pagarServicio( 1 );
        daSalida = habitacion.darSalidaHuesped( );
        assertEquals( "El hu�sped de la habitaci�n deber�a ser null", true, habitacion.darHuesped( ) == null );
        assertEquals( "El m�todo debi� dar salida", true, daSalida );
        assertEquals( "El arreglo de servicios deber�a existir", true, habitacion.darServicios( ) != null );
        assertEquals( "No deber�an existir servicios registrados", 0, habitacion.darServicios( ).size( ), 0.0001 );

    }

    /**
     * <b>Prueba 7</b> : verifica el m�todo pagarServicio.<br>
     * <b>M�todos a probar: </b><br>
     * pagarServicio<br>
     * registrarHuesped<br>
     * adquirirServicio<br>
     * <b>Casos de prueba:</b><br>
     * 1. Se paga un servicio registrado.<br>
     * 2. Se paga un servicio de dos registrados.<br>
     * 2. Se registran 50 servicios y se pagan correctamente.<br>
     */
    @Test
    public void testPagarServicio( )
    {
        // Caso de prueba 1
        habitacion.registrarHuesped( "Carlos", "123456" );
        habitacion.adquirirServicio( Tipo.INTERNET, 500 );
        habitacion.pagarServicio( 1 );
        assertEquals( "La habitaci�n no deber�a tener deuda", habitacion.darDeudaTotal( ), 0, 0.001 );

        // Caso de prueba 2
        setupEscenario2( );
        habitacion.registrarHuesped( "Carlos", "123456" );
        habitacion.adquirirServicio( Tipo.INTERNET, 500 );
        habitacion.adquirirServicio( Tipo.MINI_BAR, 500 );
        habitacion.pagarServicio( 1 );
        assertEquals( "La habitaci�n deber�a tener deuda", habitacion.darDeudaTotal( ), 500, 0.001 );

        // Caso de prueba 3
        setupEscenario2( );
        habitacion.registrarHuesped( "Carlos", "123456" );
        for( int i = 0; i < 50; i++ )
        {
            habitacion.adquirirServicio( Tipo.PELICULAS, 10 );
        }

        for( int i = 50; i > 0; i-- )
        {
            assertEquals( "La habitaci�n deber�a tener deuda", habitacion.darDeudaTotal( ), i * 10, 0.001 );
            habitacion.pagarServicio( i );
        }
    }

    /**
     * <b>Prueba 8</b> : verifica el m�todo adquirirServicio.<br>
     * <b>M�todos a probar: </b><br>
     * adquirirServicio<br>
     * pagarServicio<br>
     * registrarHuesped<br>
     * <b>Casos de prueba:</b><br>
     * 1. Se adquiere un servicio en la habitaci�n.<br>
     * 2. Se adquieren 50 servicios en la habitaci�n entre SPA y MINI_BAR.<br>
     */
    @Test
    public void testAdquirirServicio( )
    {
        // Caso de prueba 1
        habitacion.registrarHuesped( "Carlos", "123456" );
        habitacion.adquirirServicio( Tipo.INTERNET, 500 );
        assertEquals( "La habitaci�n deber�a tener servicios", 1, habitacion.darServicios( ).size( ), 0.0001 );
        assertEquals( "El servicio deber�a tener '1' como identificador", 1, habitacion.darServicios( ).get( 0 ).darIdentificador( ), 0.0001 );

        // Caso de prueba 2
        setupEscenario2( );
        habitacion.registrarHuesped( "Carlos", "123456" );
        for( int i = 1; i <= 50; i++ )
        {
            Tipo tipoServicio = Tipo.SPA;

            if( i % 2 == 0 )
            {
                tipoServicio = Tipo.MINI_BAR;
            }

            habitacion.adquirirServicio( tipoServicio, 250 );
            assertEquals( "El n�mero de servicios de la habitaci�n no corresponde", i, habitacion.darServicios( ).size( ), 0.0001 );
            assertEquals( "El identificador del servicio no corresponde", i, habitacion.darServicios( ).get( i - 1 ).darIdentificador( ), 0.0001 );
        }

    }

    /**
     * <b>Prueba 9</b> : verifica el m�todo darVecesServicioSolicitado.<br>
     * <b>M�todos a probar: </b><br>
     * darVecesServicioSolicitado<br>
     * adquirirServicio<br>
     * pagarServicio<br>
     * <b>Casos de prueba:</b><br>
     * 1. No se solicita ning�n servicio.<br>
     * 2. Se solicitan 100 servicios de cada tipo.<br>
     */
    @Test
    public void testDarVecesServicioSolicitado( )
    {
        habitacion.registrarHuesped( "Carlos", "1234" );
        
        // Caso de prueba 1
        assertEquals( "El servicio no fue solicitado", 0, habitacion.darVecesServicioSolicitado( Tipo.INTERNET ), 0.0001 );
        assertEquals( "El servicio no fue solicitado", 0, habitacion.darVecesServicioSolicitado( Tipo.MINI_BAR ), 0.0001 );
        assertEquals( "El servicio no fue solicitado", 0, habitacion.darVecesServicioSolicitado( Tipo.SPA ), 0.0001 );
        assertEquals( "El servicio no fue solicitado", 0, habitacion.darVecesServicioSolicitado( Tipo.PELICULAS ), 0.0001 );

        // Caso de prueba 2
        for( int i = 0; i < 100; i++ )
        {
            habitacion.adquirirServicio( Tipo.INTERNET, 200 );
            habitacion.adquirirServicio( Tipo.MINI_BAR, 200 );
            habitacion.adquirirServicio( Tipo.SPA, 200 );
            habitacion.adquirirServicio( Tipo.PELICULAS, 200 );
        }

        assertEquals( "El n�mero de veces que fue solicitado el servicio no corresponde", 100, habitacion.darVecesServicioSolicitado( Tipo.INTERNET ), 0.0001 );
        assertEquals( "El n�mero de veces que fue solicitado el servicio no corresponde", 100, habitacion.darVecesServicioSolicitado( Tipo.MINI_BAR ), 0.0001 );
        assertEquals( "El n�mero de veces que fue solicitado el servicio no corresponde", 100, habitacion.darVecesServicioSolicitado( Tipo.SPA ), 0.0001 );
        assertEquals( "El n�mero de veces que fue solicitado el servicio no corresponde", 100, habitacion.darVecesServicioSolicitado( Tipo.PELICULAS ), 0.0001 );

    }

    /**
     * <b>Prueba 10</b> : verifica el m�todo darServicioMasSolicitado.<br>
     * <b>M�todos a probar: </b><br>
     * darServicioMasSolicitado<br>
     * adquirirServicio<br>
     * <b>Casos de prueba:</b><br>
     * 1. No se solicita ning�n servicio.<br>
     * 2. Se solicita 3 veces cada servicio.<br>
     * 3. Se solicita 8 veces SPA y 7 veces MINIBAR.<br>
     * 4. Se solicita 25 veces SPA y 29 veces MINIBAR, 15 veces PELICULAS y 35 veces INTERNET.<br>
     */
    @Test
    public void darServicioMasSolicitado( )
    {
        habitacion.registrarHuesped( "Juan", "1234" );
        
        // Caso de prueba 1
        assertEquals( "No deber�a retornar ning�n servicio", null, habitacion.darServicioMasSolicitado( ) );

        // Caso de prueba 2
        for( int i = 0; i < 3; i++ )
        {
            habitacion.adquirirServicio( Tipo.INTERNET, 200 );
            habitacion.adquirirServicio( Tipo.MINI_BAR, 200 );
            habitacion.adquirirServicio( Tipo.SPA, 200 );
            habitacion.adquirirServicio( Tipo.PELICULAS, 200 );
        }

        assertEquals( "Deber�a retornar alg�n servicio", true, habitacion.darServicioMasSolicitado( ) != null );
        
        // Caso de prueba 3
        setupEscenario2( );
        habitacion.registrarHuesped( "Juan", "1234" );

        for( int i = 0; i < 8; i++ )
        {
            habitacion.adquirirServicio( Tipo.SPA, 200 );
        }
        
        for( int i = 0; i < 7; i++ )
        {
            habitacion.adquirirServicio( Tipo.MINI_BAR, 200 );
        }

        assertEquals( "El servicio retornado no corresponde", Tipo.SPA, habitacion.darServicioMasSolicitado( ) );
        
        // Caso de prueba 4
        setupEscenario2( );
        habitacion.registrarHuesped( "Juan", "1234" );

        for( int i = 0; i < 25; i++ )
        {
            habitacion.adquirirServicio( Tipo.SPA, 200 );
        }
        
        for( int i = 0; i < 29; i++ )
        {
            habitacion.adquirirServicio( Tipo.MINI_BAR, 200 );
        }
        
        for( int i = 0; i < 15; i++ )
        {
            habitacion.adquirirServicio( Tipo.PELICULAS, 200 );
        }
        
        for( int i = 0; i < 35; i++ )
        {
            habitacion.adquirirServicio( Tipo.INTERNET, 200 );
        }

        assertEquals( "El servicio retornado no corresponde", Tipo.INTERNET, habitacion.darServicioMasSolicitado( ) );
        

    }

}
