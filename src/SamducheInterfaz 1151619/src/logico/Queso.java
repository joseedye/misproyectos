package logico;

public class Queso extends Ingredientes {

    public Queso() {
        this.cantidad = 1500;
    }

    @Override
    public int getCantidad() {
        return this.cantidad;
    }

    @Override
    public void setCantidad(int cantidad) {
        this.cantidad = this.cantidad + cantidad;
    }

    public void descripcion() {
        System.out.println("cantidad de queso " + cantidad);
    }
}
