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

package uniandes.cupi2.hotel.mundo;

import uniandes.cupi2.hotel.mundo.Habitacion.Categoria;
import uniandes.cupi2.hotel.mundo.Servicio.Tipo;

/**
 * Representa el hotel.
 */
public class Hotel
{

    // -----------------------------------------------------------------
    // Constantes
    // -----------------------------------------------------------------

    /**
     * Representa la cantidad de habitaciones del hotel.
     */
    // TODO Parte 4 Punto A: Declarar la constante CANTIDAD_HABITACIONES seg�n el modelo del mundo.

    // -----------------------------------------------------------------
    // Atributos
    // -----------------------------------------------------------------

    /**
     * Representa el conjunto de habitaciones del hotel.
     */
    // TODO Parte 4 Punto B: Declarar el atributo habitaciones seg�n el modelo del mundo.

    // -----------------------------------------------------------------
    // Constructores
    // -----------------------------------------------------------------

    /**
     * Construye un nuevo hotel.<br>
     * Las habitaciones se deber�n inicializar con n�meros desde el 1 al 20.<br>
     * <b>post: </b> Se inicializaron todas las habitaciones con los valores definidos en la documentaci�n.<br>
     */
    public Hotel( )
    {
        // TODO Parte 4 Punto C: Completar el m�todo constructor de la clase.
        // Inicializar los nuevos atributos con la informaci�n recibida por par�metro.
    	// Debe usar un ciclo para inicializar las habitaciones
    }

    // -----------------------------------------------------------------
    // M�todos
    // -----------------------------------------------------------------

    /**
     * Retorna la habitaci�n identificada con el n�mero ingresado por par�metro.<br>
     * <b> pre: </b> El arreglo de habitaciones se encuentra inicializado.<br>
     * @param pNumeroHabitacion N�mero de la habitaci�n a consultar.
     * @return Habitaci�n identificada con el n�mero ingresado, null en caso de no encontrarla.
     */
    public Habitacion darHabitacion( int pNumeroHabitacion )
    {
        // TODO Parte 4 Punto D: Completar el m�todo seg�n la documentaci�n dada.
    }

    /**
     * Retorna el consumo de la habitaci�n identificada con el n�mero ingresado por par�metro.<br>
     * @param pNumeroHabitacion N�mero de la habitaci�n a consultar. 0 < pNumeroHabitacion <= CANTIDAD_HABITACIONES
     * @return Consumo de la habitaci�n identificada con el n�mero ingresado por par�metro.
     */
    public double darConsumo( int pNumeroHabitacion )
    {
        // TODO Parte 4 Punto E: Completar el m�todo seg�n la documentaci�n dada.
    }

    /**
     * Retorna la deuda de la habitaci�n identificada con el n�mero ingresado por par�metro.<br>
     * @param pNumeroHabitacion N�mero de la habitaci�n a consultar. 0 < pNumeroHabitacion <= CANTIDAD_HABITACIONES
     * @return Deuda de la habitaci�n identificada con el n�mero ingresado por par�metro.
     */
    public double darDeuda( int pNumeroHabitacion )
    {
        // TODO Parte 4 Punto F: Completar el m�todo seg�n la documentaci�n dada.
    }

    /**
     * Retorna la habitaci�n con mayor consumo dentro del hotel.<br>
     * En caso de que exista m�s de una habitaci�n con el mayor consumo, se debe retornar la �ltima habitaci�n encontrada.<br>
     * En caso de que el mayor consumo encontrado sea 0, se debe retornar null.
     * @return Habitaci�n con mayor consumo dentro del hotel, null si el mayor consumo encontrado es cero.
     */
    public Habitacion darHabitacionMayorConsumo( )
    {
        // TODO Parte 4 Punto G: Completar el m�todo seg�n la documentaci�n dada.
    }

    /**
     * Retorna la habitaci�n con mayor deuda dentro del hotel.<br>
     * En caso de que exista m�s de una habitaci�n con la mayor deuda, se debe retornar la �ltima habitaci�n encontrado.<br>
     * En caso de que la mayor deuda encontrada sea 0, se debe retornar null.
     * @return Habitaci�n con mayor deuda dentro del hotel, null si la mayor deuda encontrada es cero.
     */
    public Habitacion darHabitacionMayorDeuda( )
    {
        // TODO Parte 4 Punto H: Completar el m�todo seg�n la documentaci�n dada.
    }

    /**
     * Retorna la cantidad de habitaciones disponibles en el hotel.<br>
     * @return Cantidad de habitaciones disponibles en el hotel.
     */
    public int darCantidadHabitacionesDisponibles( )
    {
        // TODO Parte 4 Punto I: Completar el m�todo seg�n la documentaci�n dada.
    }

    /**
     * Retorna la cantidad de habitaciones ocupadas en el hotel.<br>
     * @return Cantidad de habitaciones ocupadas en el hotel.
     */
    public int darCantidadHabitacionesOcupadas( )
    {
        // TODO Parte 4 Punto J: Completar el m�todo seg�n la documentaci�n dada.
    }

    /**
     * Retorna la cantidad de servicios adquiridos, de un tipo especificado por par�metro en una habitaci�n espec�fica.<br>
     * @param pNumeroHabitacion N�mero de la habitaci�n. 0 < pNumeroHabitacion <= CANTIDAD_HABITACIONES.
     * @param pTipo Tipo del servicio a consultar. pTipo == {Tipo.MINI_BAR , Tipo.INTERNET, Tipo.SPA, Tipo.PELICULAS}.
     * @return Retorna la cantidad de servicios del tipo especificado adquiridos en la habitaci�n dada.
     */
    public int darCantidadServiciosHabitacion( int pNumeroHabitacion, Tipo pTipo )
    {
        // TODO Parte 4 Punto K: Completar el m�todo seg�n la documentaci�n dada.
    }

    /**
     * Retorna el servicio m�s solicitado en la habitaci�n identificada por el n�mero ingresado por par�metro.<br>
     * @param pNumeroHabitacion N�mero de la habitaci�n sobre la que se quiere hacer la consulta. 0 < pNumeroHabitacion <= CANTIDAD_HABITACIONES.
     * @return Tipo del servicio m�s solicitado en la habitaci�n, null en caso de que la habitaci�n no tenga servicios.
     */
    public Tipo darServicioMasSolicitado( int pNumeroHabitacion )
    {
        // TODO Parte 4 Punto L: Completar el m�todo seg�n la documentaci�n dada.
    }

    /**
     * Busca la primera habitaci�n que contenga el hu�sped identificado con la c�dula ingresada por par�metro.<br>
     * @param pCedulaHuesped C�dula del hu�sped. pCedulaHuesped != null.
     * @return Habitaci�n del hu�sped identificado con la c�dula ingresada, null en caso de no encontrarla.
     */
    public Habitacion buscarHabitacionPorHuesped( String pCedulaHuesped )
    {
        // TODO Parte 4 Punto M: Completar el m�todo seg�n la documentaci�n dada.
    }

    /**
     * Registra un nuevo hu�sped en la habitaci�n ingresada por par�metro.<br>
     * <b>post: </b> Se registr� el hu�sped en la habitaci�n identificada con el n�mero ingresado por par�metro.
     * @param pNumeroHabitacion N�mero de la habitaci�n. 0 < pNumeroHabitacion <= CANTIDAD_HABITACIONES.
     * @param pNombre Nombre del hu�sped. pNombre != null.
     * @param pCedula C�dula del hu�sped. pCedula != null.
     * @return True si fue posible registrar el hu�sped, false de lo contrario.
     */
    public boolean registrarHuesped( int pNumeroHabitacion, String pNombre, String pCedula )
    {
        // TODO Parte 4 Punto N: Completar el m�todo seg�n la documentaci�n dada.
    }

    /**
     * Da salida al hu�sped alojado en la habitaci�n identificada con el n�mero ingresado por par�metro.<br>
     * <b>post: </b> Se dio salida al hu�sped de la habitaci�n identificada con el n�mero ingresado por par�metro.
     * @param pNumeroHabitacion N�mero de la habitaci�n. 0 < pNumeroHabitacion <= CANTIDAD_HABITACIONES.
     * @return True si fue posible dar salida al hu�sped, false de lo contrario.
     */
    public boolean darSalidaHuesped( int pNumeroHabitacion )
    {
        // TODO Parte 4 Punto O: Completar el m�todo seg�n la documentaci�n dada.
    }

    /**
     * Adquiere un nuevo servicio en la habitaci�n identificada por el n�mero ingresado por par�metro.<br>
     * <b>pre: </b> La habitaci�n se encuentra ocupada.<br>
     * <b>post: </b> Se adquiri� un nuevo servicio para en la habitaci�n ingresada por par�metro.
     * @param pNumeroHabitacion N�mero de la habitaci�n. 0 < pNumeroHabitacion <= CANTIDAD_HABITACIONES.
     * @param pTipo Tipo del servicio a adquirir. pTipo == {Tipo.MINI_BAR , Tipo.INTERNET, Tipo.SPA, Tipo.PELICULAS}.
     * @param pCosto Costo del servicio a adquirir. pCosto > 0.
     */
    public void adquirirServicio( int pNumeroHabitacion, Tipo pTipo, double pCosto )
    {
        // TODO Parte 4 Punto P: Completar el m�todo seg�n la documentaci�n dada.
    }

    /**
     * Paga un servicio, dentro de la habitaci�n ingresada por par�metro.<br>
     * <b>pre: </b> Existe un servicio con el identificador dado.<br>
     * <b>pos: </b> Se pag� el servicio en la habitaci�n ingresada.<br>
     * @param pNumeroHabitacion N�mero de la habitaci�n. 0 < pNumeroHabitacion <= CANTIDAD_HABITACIONES.
     * @param pIdentificador Identificador del servicio. pIdentificador > 0.
     */
    public void pagarServicio( int pNumeroHabitacion, int pIdentificador )
    {
        // TODO Parte 4 Punto Q: Completar el m�todo seg�n la documentaci�n dada.
    }

    // -----------------------------------------------------------------
    // Puntos de Extensi�n
    // -----------------------------------------------------------------

    /**
     * Extensi�n 1.
     * 
     * @return respuesta1.
     */
    public String metodo1( )
    {
        return "Respuesta 1";
    }

    /**
     * Extensi�n 2.
     * 
     * @return respuesta2.
     */
    public String metodo2( )
    {
        return "Respuesta 2";
    }
}
