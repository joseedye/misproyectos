package UFPS.modelo;

import ufps.util.colecciones_seed.Secuencia;

/**
 *
 * @author jose eduardo rozo
 */
public class Estudiante {
    private long cod;
    private String nombre;
    private String email;
    Secuencia <Float> notas;

    public Estudiante(long cod, String nombre, String email) {
        this.cod = cod;
        this.nombre = nombre;
        this.email = email;
        this.notas=new Secuencia<>(9);
    }

    public Estudiante() {
    }
    

    public long getCod() {
        return cod;
    }

    public void setCod(long cod) {
        this.cod = cod;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Secuencia<Float> getNotas() {
        return notas;
    }

    public void setNotas(Secuencia<Float> notas) {
        this.notas = notas;
    }
    
    
    public String toString()
    {
        String m="\n Cod:"+this.cod;
        m+=",Nombre:"+this.nombre+",email:"+this.getEmail();
        m+="    Notas:"+this.notas.toString()+"\n";
        
        return (m);
    }
    
    
     Secuencia <Float> notass = new Secuencia<>(9);
    public float getPromedio()
    {
        if(notass.esVacia()){
        for (int i = 0; i < notas.getCapacidad(); i++) {
            notass.insertar(notas.get(i));
        }
            notass.eliminarP(notass.getIndice(menor()));
            notass.eliminarP(notass.getIndice(menor()));
            }
        float rta = 0;
        for (int i = 0; i < notass.getTamanio(); i++) {
            rta += notass.get(i);
        }
        return rta/notass.getTamanio();
        
    }
    
  
   
    
    private float menor(){
        float menor = notass.get(0);
        for (int i = 1; i < notass.getTamanio(); i++) {
            if (notass.get(i)<menor){menor = notass.get(i);}
            }
        return menor;
    }
    
}
