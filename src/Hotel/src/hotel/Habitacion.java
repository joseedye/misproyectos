package hotel;
/**
 *
 * @author jose eduardo rozo
 */
public class Habitacion {

    int cantidadDeHuespedes,cant,numeroHabitacion;
    Huesped[] huespedesEnHabitacion;
    Servicio[] serviciosDeEstaHabitacion;
    Huesped responsable;
    String tipo;

    public Habitacion(int a, String tipo,int numero) {
        huespedesEnHabitacion = new Huesped[a];
        serviciosDeEstaHabitacion = new Servicio[4];
        cantidadDeHuespedes = a;
        cant =a;
        this.tipo = tipo;
        this.numeroHabitacion=numero;
    }
    
    public void infoHabitacion() {
        System.out.println("\nel responsable de la habitacion "+tipo +" numero "+numeroHabitacion+" es "+responsable
                +"\n los huespedes son");
        mostrarHuespedes();
        System.out.println("y los servicios son \n");
        mostrarServicios();
     }

    public void anadirHuesped(Huesped h1) {
        if(responsable!=null){
        if (cantidadDeHuespedes != 0) {
            huespedesEnHabitacion[cantidadDeHuespedes - 1] = h1;
            cantidadDeHuespedes = cantidadDeHuespedes - 1;
            System.out.println("se añadio el huesped "+h1.nombre+" en la habitacion"+this.numeroHabitacion);
        } else {
            System.out.println("esta habitacion admite "+cant+" huespedes y ya estan registrados");
        }
        }
       else
        System.out.println("no hay un responsable registrado en la habitacion");
    }
    
    public void anadirResponsable(Huesped h1) {
        
        if (responsable == null) {
            if(h1.edad>=18){
            responsable = h1; 
            System.out.println("se añadio el responsable "+h1.nombre+" en la habitacion "+this.numeroHabitacion+" de categoria "+this.tipo);
            }else{System.out.println("es menor de edad");}
        } else {
            System.out.println("ya hay un responsable registrado para esta habitacion su nombre es : "+responsable.nombre);
        }

    }
    
    
    // se espera que el identificador sea 1 minibar,2internet,3spa,4peliculas
    public void anadirServivio(int a, String b, double costo, boolean pagado) {
        if(a==3&&(b=="precidencial"||b=="suite")){
            System.out.println("la categoria "+this.tipo+" tiene restringido el uso de "+b);
            }else{ 
        
        
        if(huespedesEnHabitacion[cant-1]!=null){
        serviciosDeEstaHabitacion[a-1] = new Servicio(a, b, costo, pagado);
        System.out.println("se añadio el servicio de "+b+" a la habitacion "+this.numeroHabitacion);}
        else {
            System.out.println("no se ha podido añadir el servicio");}}
    }
    
    public void pagarServicio(int i){serviciosDeEstaHabitacion[i-1].pagado=true;}
    
     public void generarFactura() {
         System.out.println(""+this.responsable);
         
        for (int i = 0; i <4; i++) {
            if(serviciosDeEstaHabitacion[i].pagado==false){
            System.out.println("" + serviciosDeEstaHabitacion[i].toString());
               } }       
        
             System.out.println("el  consumo total es de : " + consumoTotal());
             System.out.println("la deuda total es de : " + deudaTotal());
             //System.out.println("el servicio mas solicitado es : " + deudaTotal);
              
    }
        
     public double deudaTotal(){
     double deuda_total=0;
     for (int i = 0; i <4; i++) {
       if(serviciosDeEstaHabitacion[i].pagado==false){
       deuda_total=deuda_total+serviciosDeEstaHabitacion[i].costo;}}
     return deuda_total;
     }
     
     public double consumoTotal(){
     double consumoTotal=0;
     for (int i = 0; i <4; i++) {consumoTotal=consumoTotal+serviciosDeEstaHabitacion[i].costo;}
     return consumoTotal;
     }
    
     public void darSalida() {
     //no haya servicio pendiente
       if(deudaTotal()==0){responsable=null;
       for (int i = 0; i < cant; i++) {huespedesEnHabitacion[i]=null;}
       for (int i = 0; i < 4; i++) {serviciosDeEstaHabitacion[i]=null;}  
          System.out.println("se dio salida a la habitacion "+numeroHabitacion );}
      else{System.out.println("no se ha podido dar salida a la habitacion porque tiene una deuda de "+deudaTotal());}
        
     } 
     
     
     
    public void mostrarHuespedes() {
        for (int i = 0; i < cant; i++) {
            if(huespedesEnHabitacion[i]!=null){
            System.out.println("" + huespedesEnHabitacion[i]);}
        }
    }
    
    public void mostrarServicios() {
        for (int i = 0; i <4; i++) {
            if(serviciosDeEstaHabitacion[i]!=null){
            System.out.println("" + serviciosDeEstaHabitacion[i].toString());}
        }
    }
}
