package NewProyect;
public class Servicio {
    
    private String id;
    String tipoServicio;
    private double costo;
    public boolean pagado;

    public Servicio(String id, String tipoServicio, double costo, boolean pagado) {
        this.id = id;
        this.tipoServicio = tipoServicio;
        this.costo = costo;
        this.pagado = pagado;
    }

    @Override
    public String toString() {
        return "Servicio{" + "id=" + id + ", tipoServicio=" + tipoServicio + ", costo=" + costo + ", pagado=" + pagado + '}';
    }
    

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTipoServicio() {
        return tipoServicio;
    }

    public void setTipoServicio(String tipoServicio) {
        this.tipoServicio = tipoServicio;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    public boolean isPagado() {
        return pagado;
    }

    public void setPagado(boolean pagado) {
        this.pagado = pagado;
    }
    
    
    
    
    
    
}
