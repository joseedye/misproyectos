package NewProyect;
public class Ejecutable {    
    
    public static void main(String[] args) {
        Hotel unHotel = new Hotel();
        unHotel.registrarHuespedHabitacion("presidencial", "eduardo", "27485933", 20);
        unHotel.añadirResponsable("1", "juan", "465348", 18);
        unHotel.registrarHuespedHabitacion("suite", "fernandez",      "34235546", 19);
        unHotel.añadirResponsable("1", "julian", "4759865849", 24);
        unHotel.añadirServicio("1", "2", "SPA", 5000, false);
        unHotel.registrarHuespedHabitacion("suite", "perez",       "34579345789", 18);
        unHotel.registrarHuespedHabitacion("doble", "molina",       "56384563845", 9);
        unHotel.registrarHuespedHabitacion("doble", "rodrigez",        "53485845", 8);
        unHotel.registrarHuespedHabitacion("doble", "rodrigez",       "576345773", 7);
        unHotel.registrarHuespedHabitacion("ejecutiva", "rodrigez", "346576348573",6);
        unHotel.añadirResponsable("1", "edye", "24381645", 20);
        unHotel.añadirServicio("1", "1", "internet", 3500, false);
        unHotel.darsalida("34235546");
        System.out.println(unHotel.infoHabitaciones("1"));
        unHotel.darsalida("27485933");
        unHotel.darsalida("34579345789");
        unHotel.darsalida("56384563845");
        unHotel.darsalida("576345773");
        unHotel.darsalida("346576348573");
        unHotel.darsalida("27485933");
    
}
}


