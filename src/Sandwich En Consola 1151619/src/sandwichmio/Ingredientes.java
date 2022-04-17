package sandwichmio;

public abstract class Ingredientes {

    int cantidad;

    public Ingredientes() {
    }

    abstract public int getCantidad();

    abstract public void setCantidad(int cantidad);
}
