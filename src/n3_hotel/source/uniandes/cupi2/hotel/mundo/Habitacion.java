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

import java.util.ArrayList;

import uniandes.cupi2.hotel.mundo.Servicio.Tipo;

/**
 * Representa una habitaci�n dentro del hotel.
 */
public class Habitacion
{

    // -----------------------------------------------------------------
    // Constantes
    // -----------------------------------------------------------------

    /**
     * Define las posibles categor�as de la habitaci�n.
     */
    // TODO Parte 3 Punto A: Declarar la enumeraci�n Categoria seg�n el modelo del mundo.


    // -----------------------------------------------------------------
    // Atributos
    // -----------------------------------------------------------------

    /**
     * N�mero de la habitaci�n.
     */
    // TODO Parte 3 Punto B: Declarar el atributo numero seg�n el modelo del mundo.

    /**
     * Categor�a de la habitaci�n
     */
    // TODO Parte 3 Punto C: Declarar el atributo categoria seg�n el modelo del mundo.

    /**
     * Servicios consumidos por la habitaci�n.
     */
    // TODO Parte 3 Punto D: Declarar el atributo servicios seg�n el modelo del mundo.

    /**
     * Hu�sped hospedado en la habitaci�n.
     */
    // TODO Parte 3 Punto E: Declarar el atributo huesped seg�n el modelo del mundo.

    // -----------------------------------------------------------------
    // Constructores
    // -----------------------------------------------------------------

    /**
     * Crea una habitaci�n usando la informaci�n recibida por par�metro. <br>
     * <b>post: </b> Se inicializaron los atributos pNumero y pCategoria con los valores recibidos por par�metro.<br>
     * Se inicializ� la lista de servicios.<br>
     * Se inicializ� el atributo huesped en null.
     * @param pNumero N�mero de la habitaci�n. 0 < pNumero < 21
     * @param pCategoria pCategoria == { Categoria.EJECUTIVA, Categoria.DOBLE, Categoria.SUITE, Categoria.PRESIDENCIAL}
     */
    public Habitacion( int pNumero, Categoria pCategoria )
    {
        // TODO Parte 3 Punto F: Completar el m�todo constructor de la clase.
        // Inicializar los nuevos atributos con la informaci�n recibida por par�metro.
    }

    // -----------------------------------------------------------------
    // M�todos
    // -----------------------------------------------------------------

    /**
     * Retorna el n�mero de la habitaci�n.<br>
     * @return N�mero de la habitaci�n.
     */
    public int darNumero( )
    {
        // TODO Parte 3 Punto G: Completar el m�todo seg�n la documentaci�n dada.
    }

    /**
     * Retorna la categor�a de la habitaci�n.<br>
     * @return Categor�a de la habitaci�n.
     */
    public Categoria darCategoria( )
    {
        // TODO Parte 3 Punto H: Completar el m�todo seg�n la documentaci�n dada.
    }

    /**
     * Retorna la lista de servicios de la habitaci�n.<br>
     * @return Servicios de la habitaci�n.
     */
    public ArrayList<Servicio> darServicios( )
    {
        // TODO Parte 3 Punto I: Completar el m�todo seg�n la documentaci�n dada.
    }

    /**
     * Retorna el hu�sped de la habitaci�n.<br>
     * @return El hu�sped que ocupa la habitaci�n, null si est� desocupada.
     */
    public Huesped darHuesped( )
    {
        // TODO Parte 3 Punto J: Completar el m�todo seg�n la documentaci�n dada.
    }

    /**
     * Retorna el consumo total de la habitaci�n.<br>
     * @return Consumo total de la habitaci�n.
     */
    public double darConsumoTotal( )
    {
        // TODO Parte 3 Punto K: Completar el m�todo seg�n la documentaci�n dada.
    	// Debe usar un foreach como parte de la soluci�n
    }

    /**
     * Retorna la deuda total de la habitaci�n.<br>
     * @return Deuda total de la habitaci�n.<br>
     */
    public double darDeudaTotal( )
    {
        // TODO Parte 3 Punto L: Completar el m�todo seg�n la documentaci�n dada.
    	// Debe usar un foreach como parte de la soluci�n
    }

    /**
     * Indica si la habitaci�n se encuentra ocupada.<br>
     * @return True en caso de que se encuentre ocupada, false de lo contrario.
     */
    public boolean estaOcupada( )
    {
        // TODO Parte 3 Punto M: Completar el m�todo seg�n la documentaci�n dada.
    }

    /**
     * Permite registrar un hu�sped en la habitaci�n, si esta se encuentra desocupada.<br>
     * <b>post: </b> Se registr� un nuevo hu�sped en la habitaci�n.<br>
     * @param pNombre Nombre del hu�sped. pNombre != null.
     * @param pCedula C�dula del hu�sped. pCedula != null.
     * @return True si se registr� un nuevo hu�sped, false si la habitaci�n ya estaba ocupada.
     */
    public boolean registrarHuesped( String pNombre, String pCedula )
    {
        // TODO Parte 3 Punto O: Completar el m�todo seg�n la documentaci�n dada.
    }

    /**
     * Permite dar salida al hu�sped si la habitaci�n est� ocupada y no tiene ning�n servicio por pagar.<br>
     * <b>post: </b> Se dio salida al hu�sped de la habitaci�n y se eliminaron todos los servicios de la lista.<br>
     * @return True si se dio salida al hu�sped, false de lo contrario.
     */
    public boolean darSalidaHuesped( )
    {
        // TODO Parte 3 Punto P: Completar el m�todo seg�n la documentaci�n dada.
    }

    /**
     * Permite pagar el servicio identificado por par�metro.<br>
     * <b>pre: </b> Existe un servicio con el identificador pIdentificador.<br>
     * <b>post: </b> Se pag� el servicio identificado con el par�metro recibido.
     * @param pIdentificador Identificador del servicio a pagar. pIdentificador > 0.
     */
    public void pagarServicio( int pIdentificador )
    {
        // TODO Parte 3 Punto Q: Completar el m�todo seg�n la documentaci�n dada.
    }

    /**
     * Permite adquirir un nuevo servicio en la habitaci�n.<br>
     * El identificador de los servicios es secuencial iniciando en '1' si no hay servicios adquiridos, y debe aumentar en uno por cada nuevo servicio. <br>
     * <b>pre: </b> La habitaci�n se encuentra ocupada.<br>
     * <b>post: </b> Se cre� el servicio y se agreg� a la lista de servicios de la habitaci�n.
     * @param pTipo Tipo del servicio. pTipo == {Tipo.MINI_BAR , Tipo.INTERNET, Tipo.SPA, Tipo.PELICULAS}.
     * @param pCosto Costo del servicio. pCosto > 0.
     */
    public void adquirirServicio( Tipo pTipo, double pCosto )
    {
        // TODO Parte 3 Punto R: Completar el m�todo seg�n la documentaci�n dada.
    }

    /**
     * Retorna la cantidad de veces que fue solicitado un servicio del tipo ingresado por par�metro.<br>
     * @param pTipo Tipo del servicio que se quiere consultar. pTipo == {Tipo.MINI_BAR , Tipo.INTERNET, Tipo.SPA, Tipo.PELICULAS}.
     * @return Cantidad de veces que el servicio identificado con el par�metro fue solicitado.
     */
    public int darVecesServicioSolicitado( Tipo pTipo )
    {
        // TODO Parte 3 Punto S: Completar el m�todo seg�n la documentaci�n dada.
    }

    /**
     * Retorna el tipo del servicio m�s solicitado en la habitaci�n.<br>
     * Si hay dos tipos de servicio solicitados el mismo n�mero de veces, puede retornar cualquiera de los dos.
     * @return Tipo del servicio m�s solicitado, null en caso de que la habitaci�n no tenga servicios.
     */
    public Tipo darServicioMasSolicitado( )
    {
        // TODO Parte 3 Punto T: Completar el m�todo seg�n la documentaci�n dada.
    }

}
