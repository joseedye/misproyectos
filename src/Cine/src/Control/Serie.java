package Control;


import java.util.ArrayList;

public class Serie {

    private String titulo;

    private int anio;

    private String sinopsis;

    private Genero genero;

    private Personaje personas;

    private String resenas;
    
    private ArrayList<Temporadas> temporada;

    public Serie() {
    }

    public Serie(String titulo,int anio,String sinopsis,int genero){
    this.titulo=titulo;
    this.anio=anio;
    this.sinopsis=sinopsis;
    temporada = new ArrayList<>();
    }
    
    public void addTemporada(Temporadas t) {
     temporada.add(t);
    }
    
    public ArrayList<Temporadas> getTemporad(){
        return temporada;
        
    }

    @Override
    public String toString() {
        return  titulo+"";
    }

    public String getTitulo() {
        return titulo;
    }
    
    
    
    
}
