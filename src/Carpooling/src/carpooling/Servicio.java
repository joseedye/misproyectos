package carpooling;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Cristian Bustos
 */
public class Servicio {

    private String categoria;
    private int tarifaMin;
    private int tarifaTiempo;
    private int tarifaDistancia;
    private ArrayList<Conductor> myConductores = new ArrayList();
    private int valorSer;

    public Servicio(String categoria, int tarifaMin, int tarifaTiempo, int tarifaDistancia) {
        this.categoria = categoria;
        this.tarifaMin = tarifaMin;
        this.tarifaTiempo = tarifaTiempo;
        this.tarifaDistancia = tarifaDistancia;
    }

    private Conductor buscarCon(String cc) {
        for (int i = 0; i < this.myConductores.size(); i++) {
            if (this.myConductores.get(i).getCedula().equalsIgnoreCase(cc)) {
                return this.myConductores.get(i);
            }
        }
        return null;
    }

    public Conductor buscarCOnLibre() {
        for (int i = 0; i < this.myConductores.size(); i++) {
            if (this.myConductores.get(i).getMyCarrera() == null) {
                return this.myConductores.get(i);
            }
        }
        return null;
    }

    public boolean aggConductor(String nombre, String cedula, String placa, int modelo) {
        Conductor c = new Conductor(nombre, cedula, placa, modelo);
        Conductor con = this.buscarCon(c.getCedula());
        if (con != null) {
            JOptionPane.showMessageDialog(null, "Ya existe un conductor con esta cedula registrado en este servicio");
        } else {
            JOptionPane.showMessageDialog(null, c.toString() + "\nRegistrado a la categoria " + categoria + "\n");
            this.myConductores.add(c);
            return true;
        }
        return false;
    }

    public boolean eliminarConductor(String cedula) {
        Conductor c = this.buscarCon(cedula);
        for (int i = 0; i < myConductores.size(); i++) {
            if (c == myConductores.get(i)) {
                JOptionPane.showMessageDialog(null, "Se elimino el conductor " + c.getNombre() + " con cedula " + c.getCedula());
                myConductores.remove(i);
                return true;
            }
        }
        return false;
    }

    public String listarConductor() {
        String cad = "";
        int d = 1;
        for (int i = 0; i < myConductores.size(); i++) {
            if (myConductores.isEmpty()) {
                return null;
            } else {
                cad += (d++) + ". " + myConductores.get(i).getCedula() + "\n";
            }
        }
        return cad;
    }

    public boolean buscarCarreraClienteTerminar(String tlf) {
        for (int i = 0; i < this.myConductores.size(); i++) {
            if (this.myConductores.get(i).getMyCarrera().getTelefono_cliente().equalsIgnoreCase(tlf)) {
                return true;
            }
        }
        return false;
    }

    public void terminar(String nombre_cli) {
        for (int i = 0; i < this.myConductores.size(); i++) {
            if (this.myConductores.get(i).getMyCarrera().getNombre_cliente().equalsIgnoreCase(nombre_cli)) {
                this.myConductores.get(i).setMyCarrera(null);
            }
        }
    }
    
    public void buscarConduct(String cedula) {
        for (int i = 0; i < this.myConductores.size(); i++) {
            if (this.myConductores.get(i).getCedula().equalsIgnoreCase(cedula)) {
                JOptionPane.showMessageDialog(null, this.myConductores.get(i).toString());
            }
        }
    }

    public boolean buscarCond(String cc) {
        if (this.buscarCon(cc) != null) {
            return true;
        } else {
            return false;
        }
    }
    
    public boolean buscarCarreraTlf(String tel){
        for (int i = 0; i < this.myConductores.size(); i++) {
            if (this.myConductores.get(i).getMyCarrera() == null) {
                return false;
            }else if (this.myConductores.get(i).getMyCarrera().getTelefono_cliente().equalsIgnoreCase(tel)) {
                return true;
            }
        }
        return false;
    }

    public String buscarCarreraTel(String tel) {
        for (int i = 0; i < this.myConductores.size(); i++) {
            if (this.myConductores.get(i).getMyCarrera().getTelefono_cliente().equalsIgnoreCase(tel)) {
                return this.myConductores.get(i).getMyCarrera().toString();
            }
        }
        return "n";
    }
    
    
    public String modeloMasPopular() {
        String cad = "";
        Conductor aux = null;
        for (int i = 0; i < myConductores.size(); i++) {
            for (int j = i + 1; j < myConductores.size(); j++) {
                if (myConductores.get(i).getModelo_carro() > myConductores.get(j).getModelo_carro()) {
                    aux = myConductores.get(i);
                    myConductores.set(i, myConductores.get(j));
                    myConductores.set(j, aux);
                }else if (myConductores.get(i).getModelo_carro() == myConductores.get(j).getModelo_carro()) {
                    return cad = "Los modelos mas populares son " + myConductores.get(i).toString() + " y el de " + myConductores.get(j).toString();
                }
            }
            cad = "El modelo mas popular de la categoria " + categoria + " es del " + myConductores.get(i).toString(); 
        }
        return cad;
    }

    @Override
    public String toString() {
        String cad = "";
        for (int i = 0; i < this.myConductores.size(); i++) {
            cad += this.myConductores.get(i).getNombre() + "\n";
        }
        return "Servicio{" + "categoria=" + categoria + ", tarifaMin=" + tarifaMin
                + ", tarifaTiempo=" + tarifaTiempo + ", tarifaDistancia=" + tarifaDistancia + ", myConductores=" + cad;
    }

    public int getValorSer() {
        return valorSer;
    }

    public void setValorSer(int valorSer) {
        this.valorSer = valorSer;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public int getTarifaMin() {
        return tarifaMin;
    }

    public void setTarifaMin(int tarifaMin) {
        this.tarifaMin = tarifaMin;
    }

    public int getTarifaTiempo() {
        return tarifaTiempo;
    }

    public void setTarifaTiempo(int tarifaTiempo) {
        this.tarifaTiempo = tarifaTiempo;
    }

    public int getTarifaDistancia() {
        return tarifaDistancia;
    }

    public void setTarifaDistancia(int tarifaDistancia) {
        this.tarifaDistancia = tarifaDistancia;
    }

    public ArrayList getMyConductores() {
        return myConductores;
    }

    public void setMyConductores(ArrayList myConductores) {
        this.myConductores = myConductores;
    }

}
