package NewProyect;
public class Hotel {    
    Habitacion[] misHabitaciones;
    
    public Hotel() {
        misHabitaciones = new Habitacion[20];
        
        misHabitaciones[0] = new Habitacion("1", "ejecutiva", null, null);
        misHabitaciones[1] = new Habitacion("2", "ejecutiva", null, null);
        misHabitaciones[2] = new Habitacion("3", "ejecutiva", null, null);
        misHabitaciones[3] = new Habitacion("4", "ejecutiva", null, null);
        misHabitaciones[4] = new Habitacion("5", "ejecutiva", null, null);
        misHabitaciones[5] = new Habitacion("6", "ejecutiva", null, null);
        misHabitaciones[6] = new Habitacion("7", "doble", null, null);
        misHabitaciones[7] = new Habitacion("8", "doble", null, null);
        misHabitaciones[8] = new Habitacion("9", "doble", null, null);
        misHabitaciones[9] = new Habitacion("10", "doble", null, null);
        misHabitaciones[10] = new Habitacion("11", "suite", null, null);
        misHabitaciones[11] = new Habitacion("12", "suite", null, null);
        misHabitaciones[12] = new Habitacion("13", "suite", null, null);
        misHabitaciones[13] = new Habitacion("14", "suite", null, null);
        misHabitaciones[14] = new Habitacion("15", "suite", null, null);
        misHabitaciones[15] = new Habitacion("16", "suite", null, null);
        misHabitaciones[16] = new Habitacion("17", "suite", null, null);
        misHabitaciones[17] = new Habitacion("18", "suite", null, null);
        misHabitaciones[18] = new Habitacion("19", "suite", null, null);
        misHabitaciones[19] = new Habitacion("20", "presidencial", null, null);
        
    }
    
      public boolean registrarHuespedHabitacion(String categoria, String nombre, String cedula, int edad) {
        boolean exito = false;
        if (misHabitaciones != null) {
            for (int i = 0; i < misHabitaciones.length; i++) {
                if (misHabitaciones[i].getCategoria().equalsIgnoreCase(categoria)) {
                    misHabitaciones[i].registrarHuesped(nombre, cedula, edad);
                    System.out.println("el huesped "+nombre +" ha sido registrdo en la habitacion "+categoria);
                    break;
                    
                }
                
            }
        }
        
        return exito;
    }
    
    public boolean validarCategoria(String categoria) {
        boolean exito = false;
        for (int i = 0; i < misHabitaciones.length; i++) {
            if (misHabitaciones[i].getCategoria().equalsIgnoreCase(categoria)) {
                System.out.println("hay habitacion disponibble para esa categoria");
                exito = true;
                
            }
            
        }
        return exito;
        
    }
    
  
        public boolean darsalida(String cedula){
        boolean exito=false;
        for (int i = 0; i < misHabitaciones.length; i++) {
           misHabitaciones[i].eliminarHuesped(cedula);
           exito=true;
            
            
        }
    System.out.println("el huesped con cedula :"+cedula+" ha sido eliminado");
    return exito;
    }
    
    public boolean añadirResponsable(String id, String nombre, String cedula, int edad) {
        boolean exito = false;
        
        for (int i = 0; i < misHabitaciones.length; i++) {
            if (misHabitaciones[i].getHabitacionid().equalsIgnoreCase(id)) {
                
                misHabitaciones[i].registrarResponsable(nombre, cedula, edad);
                System.out.println("el señor(a) "+nombre +" ha sido asignado como responsable");
                exito = true;
                
            }
            
        }
        return exito;
        
    }
    
    public String infoHabitaciones(String id) {
        String cad = null;
        for (int i = 0; i < misHabitaciones.length; i++) {
            if (misHabitaciones[i].getHabitacionid().equalsIgnoreCase(id)) {
                cad += misHabitaciones[i].toString();
                
            }
            
        }
        
        return cad;
        
    }
    
    public boolean añadirServicio(String idh, String id, String tipo, double costo, boolean pagado) {
        boolean exito=false;
        String [] ser = {"minibar","internet", "spa", "peliculas"};
        int ind = Integer.parseInt(id);
        for (int i = 0; i < misHabitaciones.length; i++) {
            if (misHabitaciones[i].getHabitacionid().equalsIgnoreCase(idh)) {
                misHabitaciones[i].asignarServicio(id, tipo, costo, pagado);
                System.out.println("el servicio de "+ ser[ind] +" ha sido asignado a la habitacion");
                exito=true;
                
            }
            
        }
        return exito;
    }
    

    
    
}
