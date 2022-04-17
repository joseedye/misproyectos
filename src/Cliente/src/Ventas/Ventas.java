package Ventas;

public class Ventas {
Cliente cliente;
Tarjeta tarjeta;


    public Ventas() {
      super();
      cliente = new Cliente();
      tarjeta = new Tarjeta();
        
    }

    public Ventas(Cliente cliente, Tarjeta tarjeta) {
        this.cliente = cliente;
        this.tarjeta = tarjeta;
    }

   
    
     public void cargar(){
     cliente.setCodigo("1"); 
     cliente.setNombre("Nicolas");
     cliente.vendedor.setNombre("Eduardo");
     cliente.vendedor.setCedula("100763464");
     tarjeta.setCodigo("312");
     tarjeta.setLimite("1000");
     cliente.setTarjeta(this.tarjeta);
         } 
    
     
    public void imprimir(){
        System.out.println(cliente.toString());
    } 
    public static void main(String[] args) {
       
    Ventas ventas = new Ventas ();
   ventas.cargar();
   ventas.imprimir();
    }
    
}
