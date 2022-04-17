package sandwichmio;
public class Jamon extends Ingredientes {

      public Jamon() {
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
        System.out.println("cantidad de jamon "+cantidad);
        }
}
