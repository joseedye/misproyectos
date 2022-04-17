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

import uniandes.cupi2.hotel.mundo.Huesped;

/**
 * Clase usada para verificar que los m�todos de la clase Huesped est�n correctamente implementados.
 */
public class HuespedTest
{

    // -----------------------------------------------------------------
    // Atributos
    // -----------------------------------------------------------------

    /**
     * Huesped en el que se realizar�n las pruebas.
     */
    private Huesped huesped;

    // -----------------------------------------------------------------
    // Escenarios
    // -----------------------------------------------------------------
    /**
     * Crea una instancia de la clase Huesped. Este m�todo se ejecuta antes de cada m�todo de prueba.
     */
    @Before
    public void setupEscenario1( )
    {
    		huesped = new Huesped("Juan", "1234567");
    }
    
    /**
     * Escenario que
     */
    public void setupEscenario2( )
    {
    	
    }

    // -----------------------------------------------------------------
    // M�todos de prueba
    // -----------------------------------------------------------------
    /**
     * <b>Prueba 1</b> : verifica el m�todo constructor de la clase Huesped.<br>
     * <b>M�todos a probar: </b><br>
     * Huesped<br>
     * darNombre<br>
     * darCedula<br>
     * <b>Casos de prueba:</b><br>
     * 1. Se crea el hu�sped correctamente.
     */
    @Test
    public void testHuesped( )
    {
        // Caso de prueba 1
        assertEquals( "El nombre asignado al hu�sped no corresponde", "Juan", huesped.darNombre() );
        assertEquals( "La c�dula asignada al hu�sped no corresponde", "1234567", huesped.darCedula() );

    }
    

}
