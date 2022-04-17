package Logico;
public class Servicio {
    private String identificador;
    private int tipo;
    static final int MINI_BAR=1;
    static final int INTERNET=2;
    static final int SPA=3;
    static final int PELICULAS=4;
    private double costo;
    private boolean pagado;

    public Servicio(String identificador, int tipo, double costo) {
        this.identificador = identificador;
        this.tipo = tipo;
        this.costo = costo;
        this.pagado = false;
    }

    public String getIdentificador() {
        return identificador;
    }

    public void setIdentificador(String identificador) {
        this.identificador = identificador;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
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
