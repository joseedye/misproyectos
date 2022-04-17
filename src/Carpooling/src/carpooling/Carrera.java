
package carpooling;

/**
 *
 * @author Cristian Bustos
 */

public class Carrera {
    
    private String nombre_cliente;
    private String telefono_cliente;
    private String medio_pago;
    private String inicio;
    private String fin;
    private String estado;

    public Carrera(String nombre_cliente, String telefono_cliente, String medio_pago, String inicio, String fin, String estado) {
        this.nombre_cliente = nombre_cliente;
        this.telefono_cliente = telefono_cliente;
        this.medio_pago = medio_pago;
        this.inicio = inicio;
        this.fin = fin;
        this.estado = estado;
    }

    public String getNombre_cliente() {
        return nombre_cliente;
    }

    public void setNombre_cliente(String nombre_cliente) {
        this.nombre_cliente = nombre_cliente;
    }

    public String getTelefono_cliente() {
        return telefono_cliente;
    }

    public void setTelefono_cliente(String telefono_cliente) {
        this.telefono_cliente = telefono_cliente;
    }

    public String getMedio_pago() {
        return medio_pago;
    }

    public void setMedio_pago(String medio_pago) {
        this.medio_pago = medio_pago;
    }

    public String getInicio() {
        return inicio;
    }

    public void setInicio(String inicio) {
        this.inicio = inicio;
    }

    public String getFin() {
        return fin;
    }

    public void setFin(String fin) {
        this.fin = fin;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Carrera : \n" + "Nombre Cliente = " + nombre_cliente + "\nTelefono Cliente = " + 
                telefono_cliente + "\nMedio Pago = " + medio_pago + "\nInicio = " + inicio + "\nFin = " + fin;
    }
    
    
    
}
