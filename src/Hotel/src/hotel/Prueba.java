package hotel;
/**
 *
 * @author jose eduardo rozo
 */
public class Prueba {
    public static void main(String[] args) {
        Hotel l = new Hotel();
        l.habitacion7.anadirResponsable(new Huesped("eduradito",1004,19));
        l.habitacion7.anadirHuesped(new Huesped("edye",14536004,25));
        l.habitacion7.anadirServivio(1,"mini bar",20000,false);
        l.habitacion7.anadirServivio(2,"internet",20000,false);
        l.habitacion7.anadirServivio(3,"spa",20000,true);
        l.habitacion7.anadirServivio(4,"peliculas",20000,false);
        l.habitacion7.mostrarServicios();
        l.habitacion7.anadirResponsable(new Huesped("jose",1004,25));
        l.habitacion7.anadirHuesped(new Huesped("yeny",104357734,25));
        l.habitacion7.anadirHuesped(new Huesped("grooth",1453454,25));
        l.habitacion7.mostrarHuespedes();
        l.habitacion7.generarFactura();
        l.habitacion7.darSalida();
        l.habitacion7.pagarServicio(2);
        l.habitacion7.pagarServicio(1);
        l.habitacion7.pagarServicio(4);
        l.habitacion7.mostrarServicios();
        //l.habitacion7.darSalida();
        l.habitacion7.infoHabitacion();
        
    }   
 }