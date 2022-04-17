package Control;


import java.util.ArrayList;

public class Mundo {
    private ArrayList<Serie>series ;

    public Mundo() {
        series = new ArrayList<>();
    }
    
    public void agregarSerie(Serie s){
        series.add(s);
    }

    public void setSeries(ArrayList<Serie> series) {
        this.series = series;
    }

    public ArrayList<Serie> getSeries() {
        return series;
    }
    
    
    
    
}
