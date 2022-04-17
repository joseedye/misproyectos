package MetodoDelPrevio;

/**
 * Write a description of class ExceptionUFPS here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ExceptionUFPS extends Exception
{
     /**
     * Constructor con mensaje
     * @param mensaje Mensaje de error
     */
    public ExceptionUFPS(String mensaje)
    {
        super(mensaje);
    }
    
    /**
     * Metodo que retorna el mensaje de error para la excepcion generada. <br>
     * @return Mensaje de error representativo de la Excepcion generada.
     */
    public String getMensaje(){
        return (super.getMessage());
    }
}
