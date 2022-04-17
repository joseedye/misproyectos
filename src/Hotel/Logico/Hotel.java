package Logico;
public class Hotel {
    private Habitacion[] habitaciones;

    public Hotel() {
        habitaciones=new Habitacion[20];
        int i=0;
        for(;i<6;i++){
            Habitacion h=new Habitacion(i+1,Habitacion.EJECUTIVA);
            habitaciones[i]=h;
        }
        for(;i<10;i++){
            Habitacion h=new Habitacion(i+1,Habitacion.DOBLE);
            habitaciones[i]=h;
        }
        for(;i<19;i++){
            Habitacion h=new Habitacion(i+1,Habitacion.SUITE);
            habitaciones[i]=h;
        }
        Habitacion h=new Habitacion(i+1,Habitacion.PRESIDENCIAL);
        habitaciones[i]=h;
    }
    
    public boolean registrarResponsableHabitacion(int habitacion, String nombre, String cedula, int edad){
        for(Habitacion h:habitaciones){
           if(h.getNumeroHabitacion()==habitacion){
               return h.registrarResponsable(nombre, cedula, edad);
           } 
        }
        return false;
    }
    
    public boolean registrarHuespedHabitacion(String nombre, String cedula, int edad, String identificador,
            int tipo, double costo, int habitacion){
        if(estaHuespedRegistrardo(cedula))
            return false;
        Habitacion aux=null;
        for(Habitacion h:habitaciones){
            if(h.getNumeroHabitacion()==habitacion){
                aux=h;
                break;
            }
        }
        if(aux==null||aux.cantidadEspaciosDisponibles()==0){
            return false;
        }
        aux.registrarHuesped(nombre, cedula, edad, identificador, tipo, costo);
        return true;
    }
    
    public double pagarServicioHabitacion(String cedula, String servicio){
        Habitacion h=buscarHabitacionHuesped(cedula);
        return h.pagarServicio(servicio);
    }
    
    public int habitacionMayorConsumo(){
        int habitacion=habitaciones[0].getNumeroHabitacion();
        double mayor=habitaciones[0].calcularCostoTotal();
        for(int i=1;i<habitaciones.length;i++){
            double aux=habitaciones[i].calcularCostoTotal();
            if(aux>mayor){
                mayor=aux;
                habitacion=habitaciones[i].getNumeroHabitacion();
            }
        }
        return habitacion;
    }
    public int habitacionMayorDeuda(){
        int habitacion=habitaciones[0].getNumeroHabitacion();
        double mayor=habitaciones[0].calcularDeudaTotal();
        for(int i=1;i<habitaciones.length;i++){
            double aux=habitaciones[i].calcularDeudaTotal();
            if(aux>mayor){
                mayor=aux;
                habitacion=habitaciones[i].getNumeroHabitacion();
            }
        }
        return habitacion;
    }
    public int cantidadHabitacionesDisponibles(){
        int cant=0;
        for(Habitacion h:habitaciones){
            if(h.estaDisponible())
                cant++;
        }
        return cant;
    }
    public int cantidadHabitacionesOcupadas(){
        return habitaciones.length-cantidadHabitacionesDisponibles();
    }
    public boolean estaHuespedRegistrardo(String cedula){
        for(Habitacion h:habitaciones){
            if(h.estaHuesped(cedula))
                return true;
        }
        return false;
    }
    
    public Habitacion buscarHabitacionHuesped(String cedula){
        for(Habitacion h:habitaciones){
            if(h.estaHuesped(cedula))
                return h;
        }
        return null;
    }
    
    public Responsable responsableMasHabitaciones(){
        Responsable [] res=listarResponsables();
        Responsable r=null;
        int mayor=-1;
        for(int i=0;res[i]!=null;i++){
            int aux=0;
            for(Habitacion h:habitaciones){
                if(h.getResponsable().getCedula().equalsIgnoreCase(res[i].getCedula()))
                    aux++;
            }
            if(aux>mayor){
                r=res[i];
            }
        }
        return r;
    }
    public double porcentajeResponsables(){
        double porcent;
        int cant=0;
        for(Habitacion h:habitaciones){
            if(h.getResponsable()!=null){
                cant++;
            }
        }
        porcent=cant/20;
        return porcent*100;
    }
    private Responsable [] listarResponsables(){
        Responsable [] res=new Responsable[20];
        for(Habitacion h:habitaciones){
            int i=0;
            while(res[i]!=null){
                if(res[i].getCedula().equalsIgnoreCase(h.getResponsable().getCedula())){
                    break;
                }
                i++;
            }
            if(res[i]==null){
                res[i]=h.getResponsable();
            }
        }
        return res;
    }
}
