/**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 * Universidad	de	los	Andes	(Bogotá	- Colombia)
 * Departamento	de	Ingeniería	de	Sistemas	y	Computación
 * Licenciado	bajo	el	esquema	Academic Free License versión 2.1
 * 		
 * Proyecto	Cupi2	(http://cupi2.uniandes.edu.co)
 * Ejercicio: n3_hotel
 * Autor: Equipo Cupi2 2017
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 */

package uniandes.cupi2.hotel.mundo;

import java.util.ArrayList;

import uniandes.cupi2.hotel.mundo.Servicio.Tipo;

/**
 * Representa una habitación dentro del hotel.
 */
public class Habitacion
{

    // -----------------------------------------------------------------
    // Constantes
    // -----------------------------------------------------------------

    /**
     * Define las posibles categorías de la habitación.
     */
    // TODO Parte 3 Punto A: Declarar la enumeración Categoria según el modelo del mundo.


    // -----------------------------------------------------------------
    // Atributos
    // -----------------------------------------------------------------

    /**
     * Número de la habitación.
     */
    // TODO Parte 3 Punto B: Declarar el atributo numero según el modelo del mundo.

    /**
     * Categoría de la habitación
     */
    // TODO Parte 3 Punto C: Declarar el atributo categoria según el modelo del mundo.

    /**
     * Servicios consumidos por la habitación.
     */
    // TODO Parte 3 Punto D: Declarar el atributo servicios según el modelo del mundo.

    /**
     * Huésped hospedado en la habitación.
     */
    // TODO Parte 3 Punto E: Declarar el atributo huesped según el modelo del mundo.

    // -----------------------------------------------------------------
    // Constructores
    // -----------------------------------------------------------------

    /**
     * Crea una habitación usando la información recibida por parámetro. <br>
     * <b>post: </b> Se inicializaron los atributos pNumero y pCategoria con los valores recibidos por parámetro.<br>
     * Se inicializó la lista de servicios.<br>
     * Se inicializó el atributo huesped en null.
     * @param pNumero Número de la habitación. 0 < pNumero < 21
     * @param pCategoria pCategoria == { Categoria.EJECUTIVA, Categoria.DOBLE, Categoria.SUITE, Categoria.PRESIDENCIAL}
     */
    public Habitacion( int pNumero, Categoria pCategoria )
    {
        // TODO Parte 3 Punto F: Completar el método constructor de la clase.
        // Inicializar los nuevos atributos con la información recibida por parámetro.
    }

    // -----------------------------------------------------------------
    // Métodos
    // -----------------------------------------------------------------

    /**
     * Retorna el número de la habitación.<br>
     * @return Número de la habitación.
     */
    public int darNumero( )
    {
        // TODO Parte 3 Punto G: Completar el método según la documentación dada.
    }

    /**
     * Retorna la categoría de la habitación.<br>
     * @return Categoría de la habitación.
     */
    public Categoria darCategoria( )
    {
        // TODO Parte 3 Punto H: Completar el método según la documentación dada.
    }

    /**
     * Retorna la lista de servicios de la habitación.<br>
     * @return Servicios de la habitación.
     */
    public ArrayList<Servicio> darServicios( )
    {
        // TODO Parte 3 Punto I: Completar el método según la documentación dada.
    }

    /**
     * Retorna el huésped de la habitación.<br>
     * @return El huésped que ocupa la habitación, null si está desocupada.
     */
    public Huesped darHuesped( )
    {
        // TODO Parte 3 Punto J: Completar el método según la documentación dada.
    }

    /**
     * Retorna el consumo total de la habitación.<br>
     * @return Consumo total de la habitación.
     */
    public double darConsumoTotal( )
    {
        // TODO Parte 3 Punto K: Completar el método según la documentación dada.
    	// Debe usar un foreach como parte de la solución
    }

    /**
     * Retorna la deuda total de la habitación.<br>
     * @return Deuda total de la habitación.<br>
     */
    public double darDeudaTotal( )
    {
        // TODO Parte 3 Punto L: Completar el método según la documentación dada.
    	// Debe usar un foreach como parte de la solución
    }

    /**
     * Indica si la habitación se encuentra ocupada.<br>
     * @return True en caso de que se encuentre ocupada, false de lo contrario.
     */
    public boolean estaOcupada( )
    {
        // TODO Parte 3 Punto M: Completar el método según la documentación dada.
    }

    /**
     * Permite registrar un huésped en la habitación, si esta se encuentra desocupada.<br>
     * <b>post: </b> Se registró un nuevo huésped en la habitación.<br>
     * @param pNombre Nombre del huésped. pNombre != null.
     * @param pCedula Cédula del huésped. pCedula != null.
     * @return True si se registró un nuevo huésped, false si la habitación ya estaba ocupada.
     */
    public boolean registrarHuesped( String pNombre, String pCedula )
    {
        // TODO Parte 3 Punto O: Completar el método según la documentación dada.
    }

    /**
     * Permite dar salida al huésped si la habitación está ocupada y no tiene ningún servicio por pagar.<br>
     * <b>post: </b> Se dio salida al huésped de la habitación y se eliminaron todos los servicios de la lista.<br>
     * @return True si se dio salida al huésped, false de lo contrario.
     */
    public boolean darSalidaHuesped( )
    {
        // TODO Parte 3 Punto P: Completar el método según la documentación dada.
    }

    /**
     * Permite pagar el servicio identificado por parámetro.<br>
     * <b>pre: </b> Existe un servicio con el identificador pIdentificador.<br>
     * <b>post: </b> Se pagó el servicio identificado con el parámetro recibido.
     * @param pIdentificador Identificador del servicio a pagar. pIdentificador > 0.
     */
    public void pagarServicio( int pIdentificador )
    {
        // TODO Parte 3 Punto Q: Completar el método según la documentación dada.
    }

    /**
     * Permite adquirir un nuevo servicio en la habitación.<br>
     * El identificador de los servicios es secuencial iniciando en '1' si no hay servicios adquiridos, y debe aumentar en uno por cada nuevo servicio. <br>
     * <b>pre: </b> La habitación se encuentra ocupada.<br>
     * <b>post: </b> Se creó el servicio y se agregó a la lista de servicios de la habitación.
     * @param pTipo Tipo del servicio. pTipo == {Tipo.MINI_BAR , Tipo.INTERNET, Tipo.SPA, Tipo.PELICULAS}.
     * @param pCosto Costo del servicio. pCosto > 0.
     */
    public void adquirirServicio( Tipo pTipo, double pCosto )
    {
        // TODO Parte 3 Punto R: Completar el método según la documentación dada.
    }

    /**
     * Retorna la cantidad de veces que fue solicitado un servicio del tipo ingresado por parámetro.<br>
     * @param pTipo Tipo del servicio que se quiere consultar. pTipo == {Tipo.MINI_BAR , Tipo.INTERNET, Tipo.SPA, Tipo.PELICULAS}.
     * @return Cantidad de veces que el servicio identificado con el parámetro fue solicitado.
     */
    public int darVecesServicioSolicitado( Tipo pTipo )
    {
        // TODO Parte 3 Punto S: Completar el método según la documentación dada.
    }

    /**
     * Retorna el tipo del servicio más solicitado en la habitación.<br>
     * Si hay dos tipos de servicio solicitados el mismo número de veces, puede retornar cualquiera de los dos.
     * @return Tipo del servicio más solicitado, null en caso de que la habitación no tenga servicios.
     */
    public Tipo darServicioMasSolicitado( )
    {
        // TODO Parte 3 Punto T: Completar el método según la documentación dada.
    }

}
