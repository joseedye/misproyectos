package NewProyect;
public class Habitacion {

    private String habitacionid;
    private String categoria;

    Huesped[] huespedes;
    Responsable elResponsable;
    Servicio servicios;

    public Habitacion(String habitacionid, String categoria, Responsable elResponsable, Servicio servicios) {
        this.habitacionid = habitacionid;
        this.categoria = categoria;
        huespedes = new Huesped[100];
        this.elResponsable = elResponsable;
        this.servicios = servicios;
    }

    public Responsable getElResponsable() {
        return elResponsable;
    }

    public void setElResponsable(Responsable elResponsable) {
        this.elResponsable = elResponsable;
    }

    public String getHabitacionid() {
        return habitacionid;
    }

    public void setHabitacionid(String habitacionid) {
        this.habitacionid = habitacionid;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public void registrarHuesped(String nombre, String cedula, int edad) {
        for (int i = 0; i < huespedes.length; i++) {
            if (huespedes[i] != null) {
                huespedes[i] = new Huesped(nombre, cedula, edad);
                break;
            }  }    }

    @Override
    public String toString() {
        return "Habitacion " + "habitacionid=" + habitacionid + ", categoria=" + categoria + ", elResponsable=" + elResponsable + ", servicios= " + servicios.toString() + '}';
    }

    public void registrarResponsable(String nombre, String cedula, int edad) {
        if (elResponsable == null) {
            elResponsable = new Responsable(nombre, cedula, edad);

        }

    }

    public void asignarServicio(String id, String tipo, double costo, boolean pagado) {
        if (servicios == null) {
            servicios = new Servicio(id, tipo, costo, pagado);

        }

    }
    
    public void pagaServicio(String id){
        if(servicios.getId().equalsIgnoreCase(id)){
            if(servicios.isPagado()==false){
                servicios.setPagado(true);
                
            
            }
        
        
        }
    
    
    }
    
    public void eliminarHuesped(String cedula){
        for (int i = 0; i < huespedes.length; i++) {
            if(huespedes[i]!= null && huespedes[i].getCedula().equalsIgnoreCase(cedula)){
                huespedes[i]=null;
                break;
            
            }
            
        }
    
    
    }

}
