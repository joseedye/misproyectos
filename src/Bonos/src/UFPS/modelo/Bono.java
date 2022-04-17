
package UFPS.modelo;

/**
 *
 * @author jose eduardo rozo
 */
public class Bono {
    private long valor;

    public Bono() {
    }

    public Bono(long valor) {
        this.valor = valor;
    }

    public long getValor() {
        return valor;
    }

    public void setValor(long valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "Bono{" + "valor=" + valor + '}'+"\n";
    }
    
    
    
}
