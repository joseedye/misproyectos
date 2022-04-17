package hotel;
/**
 *
 * @author jose eduardo rozo
 */
public class Servicio {
  int identificador;
  String tipo;
  double costo;
  boolean pagado;

    public Servicio(int identificador, String tipo, double costo, boolean pagado) {
        this.identificador = identificador;
        this.tipo = tipo;
        this.costo = costo;
        this.pagado = pagado;
    }

    @Override
    public String toString() {
        return "Servicio{" + "identificador=" + identificador + ", tipo=" + tipo + ", costo=" + costo + ", pagado=" + pagado + '}';
    }
  
  

    public int getIdentificador() {
        return identificador;
    }

    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
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
