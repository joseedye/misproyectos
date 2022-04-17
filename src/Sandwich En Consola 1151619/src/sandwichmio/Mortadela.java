package sandwichmio;
public class Mortadela extends Ingredientes{

    public Mortadela() {
        this.cantidad = 1000;
    }
        
    @Override
    public int getCantidad() {
     return this.cantidad;    }

    @Override
    public void setCantidad(int cantidad) {
        this.cantidad = this.cantidad+cantidad;
    }
    
    public void descripcion(){
        System.out.println("cantidad de mortadela "+cantidad);
        }
    
}
