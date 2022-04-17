
package tiendamascotas.Modelo;

/**
 *
 * @author jose eduardo
 */
public class Tratamiento {
    
    private Integer Codigo_Tratamiento;
    private Integer descuento;
    private String fecha;

    public Tratamiento() {
    }

    public Tratamiento(Integer Codigo_Tratamiento, Integer descuento, String fecha) {
        this.Codigo_Tratamiento = Codigo_Tratamiento;
        this.descuento = descuento;
        this.fecha = fecha;
    }

    public Integer getCodigo_Tratamiento() {
        return Codigo_Tratamiento;
    }

    public void setCodigo_Tratamiento(Integer Codigo_Tratamiento) {
        this.Codigo_Tratamiento = Codigo_Tratamiento;
    }

    public Integer getDescuento() {
        return descuento;
    }

    public void setDescuento(Integer descuento) {
        this.descuento = descuento;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
    
    
    
}
