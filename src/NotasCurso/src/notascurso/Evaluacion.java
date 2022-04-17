package notascurso;

public class Evaluacion {
    
   String tipo;
   Double nota;
   Double porcentaje;

    public Evaluacion() {
    }

    public Evaluacion(String tipo, Double nota, Double porcentaje) {
        this.tipo = tipo;
        this.nota = nota;
        this.porcentaje = porcentaje;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Double getNota() {
        return nota;
    }

    public void Double(Double nota) {
        this.nota = nota;
    }
 
    public void setNota(Double nota) {
        this.nota = nota;
    }
    public Double getPorcentaje() {
        return porcentaje;
    }

    public void setPorcentaje(Double porcentaje) {
        this.porcentaje = porcentaje;
    }
   
    
   
    
}
