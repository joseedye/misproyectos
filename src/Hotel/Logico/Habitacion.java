package Logico;
import java.util.ArrayList;
public class Habitacion {
    private int numeroHabitacion;
    private String categoria;
    static final String EJECUTIVA="EJECUTIVA";
    static final String DOBLE="DOBLE";
    static final String SUITE="SUITE";
    static final String PRESIDENCIAL="PRESIDENCIAL";
    private ArrayList<Servicio> servicios;
    private Responsable responsable;
    private Huesped[] huespedes;

    public Habitacion(int numeroHabitacion, String categoria) {
        this.numeroHabitacion = numeroHabitacion;
        this.categoria = categoria;
        switch(categoria){
            case EJECUTIVA:
                huespedes=new Huesped[1];
                break;
            case DOBLE:
                huespedes=new Huesped[2];
                break;
            case SUITE:
                huespedes=new Huesped[5];
                break;
            case PRESIDENCIAL:
                huespedes=new Huesped[10];
                break;
        }
    }
    public boolean estaDisponible(){
        for(Huesped h:huespedes){
            if(h!=null)
                return false;
        }
        return true;
    }
    public boolean registrarResponsable(String nombre, String cedula, int edad){
        if(edad<18)
            return false;
        Responsable r=new Responsable(nombre, cedula, edad);
        this.responsable=r;
        return true;
    }
    
    public boolean registrarHuesped(String nombre, String cedula, int edad, String identificador,
            int tipo, double costo){
        if(!registrarServicio(identificador, tipo, costo))
            return false;
        Huesped h=new Huesped(nombre, cedula, edad);
        for(int i=0;i<huespedes.length;i++){
            if(huespedes[i]==null){
                huespedes[i]=h;
                return true;
            }
        }
        return false;
    }
    
    public int cantidadEspaciosDisponibles(){
        int cant=0;
        for(Huesped h:huespedes){
            if(h==null)
                cant++;
        }
        return cant;
    }
    
    public boolean registrarServicio(String identificador, int tipo, double costo){
        if(tipo==Servicio.SPA&&(!this.categoria.equalsIgnoreCase(PRESIDENCIAL)||
                !this.categoria.equalsIgnoreCase(SUITE))){
            return false;
        }
        Servicio s=new Servicio(identificador, tipo, costo);
        servicios.add(s);
        return true;
    }
    
    public boolean estaHuesped(String cedula){
        for(Huesped h:huespedes){
            if(h.getCedula().equalsIgnoreCase(cedula))
                return true;
        }
        return false;
    }
    
    public double calcularCostoTotal(){
        double total=0;
        for(Servicio s:servicios){
            total+=s.getCosto();
        }
        return total;
    }
    
    public double calcularDeudaTotal(){
        double total=0;
        for(Servicio s:servicios){
            if(!s.isPagado())
                total+=s.getCosto();
        }
        return total;
    }

    public boolean darSalida(){
        if(!pazysalvo())
            return false;
        for(int i=0;i<huespedes.length;i++){
            huespedes[i]=null;
        }
        servicios.clear();
        responsable=null;
        return true;
    }
    public double pagarServicio(String identificador){
        for(Servicio s:servicios){
            if(s.getIdentificador().equalsIgnoreCase(identificador)){
                if(s.isPagado())
                    return 0;
                s.setPagado(true);
                return s.getCosto();
            }
        }
        return -1;
    }
    public boolean pazysalvo(){
        for(Servicio s:servicios){
            if(!s.isPagado())
                return false;
        }
        return true;
    }
    
    
    public int getNumeroHabitacion() {
        return numeroHabitacion;
    }

    public void setNumeroHabitacion(int numeroHabitacion) {
        this.numeroHabitacion = numeroHabitacion;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public Responsable getResponsable() {
        return responsable;
    }

    public void setResponsable(Responsable responsable) {
        this.responsable = responsable;
    }

    
}
