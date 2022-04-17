package Ventas;

public class Tarjeta {
  private String codigo;
  private String limite; 

    public Tarjeta() {
        super();
        codigo = "";
        limite = "";
    }

    public Tarjeta(String codigo, String limite) {
        this.codigo = codigo;
        this.limite = limite;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getLimite() {
        return limite;
    }

    public void setLimite(String limite) {
        this.limite = limite;
    }

    @Override
    public String toString() {
        return "Tarjeta{" + "codigo=" + codigo + ", limite=" + limite + '}';
    }
   
   
}
