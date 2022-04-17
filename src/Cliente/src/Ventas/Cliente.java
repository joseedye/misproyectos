package Ventas;

public class Cliente {
   String codigo;
   String nombre;
  
   //definicion de la variable composicion
   Vendedor vendedor;
   Tarjeta tarjeta;

    public Cliente() {
        super();
        this.codigo="";
        this.nombre="";
        vendedor = new Vendedor ();
        tarjeta = new Tarjeta();
    }

   
   
    public Cliente(String codigo, String nombre, Vendedor vendedor) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.vendedor = vendedor;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Vendedor getVendedor() {
        return vendedor;
    }

    public void setVendedor(Vendedor vendedor) {
        this.vendedor = vendedor;
    }

    public Tarjeta getTarjeta() {
        return tarjeta;
    }

    public void setTarjeta(Tarjeta tarjeta) {
        this.tarjeta = tarjeta;
    }

    @Override
    public String toString() {
        return "Cliente{" + "codigo=" + codigo + ", nombre=" + nombre + ", vendedor=" + vendedor + ", tarjeta=" + tarjeta + '}';
    }
   
   
   
}
