package UFPS.modelo;

/**
 *
 * @author jose eduardo rozo
 */
public class Regalo {
   Estudiante est;
   Bono bono;

    public Regalo() {
    }

    public Regalo(Estudiante est, Bono bono) {
        this.est = est;
        this.bono = bono;
    }

    public Estudiante getEst() {
        return est;
    }

    public void setEst(Estudiante est) {
        this.est = est;
    }

    public Bono getBono() {
        return bono;
    }

    public void setBono(Bono bono) {
        this.bono = bono;
    }

    @Override
    public String toString() {
        return "Regalo{" + "estudiante = " + est + ", bono= " + bono + '}'+"\n";
    }
    
    
}
