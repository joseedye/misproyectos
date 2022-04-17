package logico;
public class Pan extends Ingredientes{

        public Pan() {
        this.cantidad = 100;
    }
    
    @Override
    public int getCantidad() {
     return this.cantidad;   
    }

    @Override
    public void setCantidad(int cantidad) {
        this.cantidad = this.cantidad+cantidad;
    }
    public void descripcion(){
        System.out.println("cantidad de pan "+cantidad);
        }
    
}
