package Control;

public class Temporadas {

    private String nombrbe;

    private Capitulo capitulo;

    private String sinopsis;

    private int duracion;

    private String fecha_produccion;

    private String fecha_estreno;

    private boolean vista;

    private boolean cancelada;

    public Temporadas() {
        
    }

    public Temporadas(String nombrbe, String sinopsis, int duracion, String fecha_produccion, String fecha_estreno) {
        this.nombrbe = nombrbe;
        this.sinopsis = sinopsis;
        this.duracion = duracion;
        this.fecha_produccion = fecha_produccion;
        this.fecha_estreno = fecha_estreno;
    }
    
    

    public void addCapitulo() {
    }

    public String getNombrbe() {
        return nombrbe;
    }

    public void setNombrbe(String nombrbe) {
        this.nombrbe = nombrbe;
    }

    public Capitulo getCapitulo() {
        return capitulo;
    }

    public void setCapitulo(Capitulo capitulo) {
        this.capitulo = capitulo;
    }

    public String getSinopsis() {
        return sinopsis;
    }

    public void setSinopsis(String sinopsis) {
        this.sinopsis = sinopsis;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public String getFecha_produccion() {
        return fecha_produccion;
    }

    public void setFecha_produccion(String fecha_produccion) {
        this.fecha_produccion = fecha_produccion;
    }

    public String getFecha_estreno() {
        return fecha_estreno;
    }

    public void setFecha_estreno(String fecha_estreno) {
        this.fecha_estreno = fecha_estreno;
    }

    public boolean isVista() {
        return vista;
    }

    public void setVista(boolean vista) {
        this.vista = vista;
    }

    public boolean isCancelada() {
        return cancelada;
    }

    public void setCancelada(boolean cancelada) {
        this.cancelada = cancelada;
    }
    
    
}
