package notascurso;

public class Curso {
 Nivel uno = new Nivel();
 Nivel dos = new Nivel();
 Nivel tres = new Nivel();
 double notadefinitiva;

    public Nivel getUno() {
        return uno;
    }

    public void setUno(Nivel uno) {
        this.uno = uno;
    }

    public Nivel getDos() {
        return dos;
    }

    public void setDos(Nivel dos) {
        this.dos = dos;
    }

    public Nivel getTres() {
        return tres;
    }

    public void setTres(Nivel tres) {
        this.tres = tres;
    }

    public double getNotadefinitiva() {
        
  return ((getUno().getNotaDefinitiva()+ getDos().getNotaDefinitiva()+getTres().getNotaDefinitiva())/3);
    }

    public void setNotadefinitiva(double notadefinitiva) {
        this.notadefinitiva = notadefinitiva;
    }
 
 
}
