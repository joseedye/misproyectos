
package carpooling;

/**
 *
 * @author Cristian Bustos
 */

public class Conductor {
    
    public String nombre;
    private String cedula;
    private String placa_carro;
    private int modelo_carro;
    private Carrera myCarrera;

    public Conductor(String nombre, String cedula, String placa_carro, int modelo_carro) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.placa_carro = placa_carro;
        this.modelo_carro = modelo_carro;
        this.myCarrera = null;
    }
    
    public void aggCarrera(String nombre_cliente, String telefono_cliente, String medio_pago, String inicio, String fin, String estado){
        this.myCarrera = new Carrera ( nombre_cliente,  telefono_cliente,  medio_pago,  inicio,  fin,  estado);
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getPlaca_carro() {
        return placa_carro;
    }

    public void setPlaca_carro(String placa_carro) {
        this.placa_carro = placa_carro;
    }

    public int getModelo_carro() {
        return modelo_carro;
    }

    public void setModelo_carro(int modelo_carro) {
        this.modelo_carro = modelo_carro;
    }

    public Carrera getMyCarrera() {
        return myCarrera;
    }

    public void setMyCarrera(Carrera myCarrera) {
        this.myCarrera = myCarrera;
    }

    @Override
    public String toString() {
        return "Conductor :\n" + "Nombre = " + nombre + "\nCedula = " + cedula +
                "\nPlaca del carro = " + placa_carro + "\nModelo del carro = " + modelo_carro;
    }

   
    
    
}
