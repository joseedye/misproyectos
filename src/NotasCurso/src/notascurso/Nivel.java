package notascurso;
public class Nivel {
    String nivel;
    Evaluacion e = new Evaluacion("1",null,new Double(0.3));
    Evaluacion p = new Evaluacion("2",null,new Double(0.3));;
    Evaluacion t = new Evaluacion("3",null,new Double(0.4));;
    double notaDefinitiva;

    public String getNivel() {
        return nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }

    public Evaluacion getE() {
        return e;
    }

    public void setE(Evaluacion e) {
        this.e = e;
    }

    public Evaluacion getP() {
        return p;
    }

    public void setP(Evaluacion p) {
        this.p = p;
    }

    public Evaluacion getT() {
        return t;
    }

    public void setT(Evaluacion t) {
        this.t = t;
    }

    public double getNotaDefinitiva() {
        double rta =0,aa,bb,cc;
     
        aa=(e.getNota()*e.getPorcentaje());
        
        bb=(p.getNota()*p.getPorcentaje());
     
        cc=(t.getNota()*t.getPorcentaje());
    //System.out.println("aa "+aa+" bb "+bb+" cc "+cc);
        this.notaDefinitiva=aa+bb+cc;
        
        return this.notaDefinitiva;
    }

//    public static void main(String[] args) {
//        Nivel uno = new Nivel();
//        uno.setE(new Evaluacion("",50.0,30.0));
//        
//        uno.getNotaDefinitiva();
//        Nivel dos = new Nivel();
//        
//    }
//    public void notaDefinitivaNivel(){}
    
    public void cambiarNota(double uno,double dos,double tres){
    e.setNota(uno);
    p.setNota(dos);
    t.setNota(tres);
    getNotaDefinitiva();
    }
    
    public String mostrarInfo(){
    
        return this.notaDefinitiva+"";
    }
}
