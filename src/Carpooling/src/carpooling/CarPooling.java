package carpooling;

import javax.swing.JOptionPane;

/**
 *
 * @author Cristian Bustos
 */
public class CarPooling {

    private final Servicio myServicio[] = new Servicio[4];

    public CarPooling() {
        myServicio[0] = new Servicio("Y", 3500, 200, 1250);
        myServicio[1] = new Servicio("Orange", 3000, 250, 1000);
        myServicio[2] = new Servicio("Van", 6000, 1000, 3000);
        myServicio[3] = new Servicio("Conductor Elegido", 4000, 350, 1500);
    }

    public Servicio buscarServicio(String cate) {
        for (int i = 0; i < this.myServicio.length; i++) {
            if (this.myServicio[i].getCategoria().equalsIgnoreCase(cate)) {
                return this.myServicio[i];
            }
        }
        return null;
    }

    public boolean aggConductor(String nombre, String cedula, String placa_carro, int modelo_carro, String servicio) {
        for (int i = 0; i < this.myServicio.length; i++) {
            if (this.myServicio[i].getCategoria().equalsIgnoreCase(servicio)) {
                this.myServicio[i].aggConductor(nombre, cedula, placa_carro, modelo_carro);
                return true;
            }
        }
        return false;
    }

    public String listarConductor(String servicio) {
        for (int i = 0; i < this.myServicio.length; i++) {
            if (this.myServicio[i].getCategoria().equalsIgnoreCase(servicio)) {
                if (this.myServicio[i].getMyConductores().isEmpty()) {
                    return null;
                } else {
                    return this.myServicio[i].listarConductor();
                }
            }
        }
        return null;
    }

    public boolean eliminarConductor(String servicio, String cedula) {
        for (int i = 0; i < myServicio.length; i++) {
            if (this.myServicio[i].getCategoria().equalsIgnoreCase(servicio)) {
                this.myServicio[i].eliminarConductor(cedula);
                return true;
            }
        }
        return false;
    }

    public boolean asignarCarrera(String categoria, String nombre_cliente, String telefono_cliente, String medio_pago, String inicio, String fin, String estado) {
        Servicio s = this.buscarServicio(categoria);
        if (s != null) {
            if (s.buscarCOnLibre() == null) {
                JOptionPane.showMessageDialog(null, "No hay conductores disponibles en estos momentos, por favor espere");
            } else {
                JOptionPane.showMessageDialog(null, "Se le asigno una carrera a "
                        + s.buscarCOnLibre().getNombre() + " con cedula " + s.buscarCOnLibre().getCedula());
                s.buscarCOnLibre().aggCarrera(nombre_cliente, telefono_cliente, medio_pago, inicio, fin, estado);
                return true;
            }
        }
        return false;
    }

    public void precioServicio(String tlf, int duracion, int distancia) {
        int costoCarrera = 0;
        int costoAdicional = 0;
        for (int i = 0; i < this.myServicio.length; i++) {
            if (this.myServicio[i].buscarCarreraClienteTerminar(tlf)) {
                costoAdicional = (this.myServicio[i].getTarifaTiempo() * duracion) + (this.myServicio[i].getTarifaDistancia() * distancia);
                costoCarrera = this.myServicio[i].getTarifaMin() + costoAdicional;
                this.myServicio[i].setValorSer(costoCarrera);
                JOptionPane.showMessageDialog(null, "El valor a pagar por la carrera es de : " + this.myServicio[i].getValorSer());
            }
        }
    }

    public boolean buscarCarrera(String servicio, String nomCond, String tlf) {
        for (int i = 0; i < this.myServicio.length; i++) {
            if (this.myServicio[i].getCategoria().equalsIgnoreCase(servicio)) {
                if (this.myServicio[i].buscarCarreraClienteTerminar(tlf)) {
                    return true;
                }
            }
        }
        return false;
    }

    public void terminarServicio(String tlf) {
        for (int i = 0; i < this.myServicio.length; i++) {
            if (this.myServicio[i].buscarCarreraClienteTerminar(tlf)) {
                this.myServicio[i].terminar(tlf);
            }
        }
    }

    public String popularCar(String servicio) {
        for (int i = 0; i < this.myServicio.length; i++) {
            if (this.myServicio[i].getCategoria().equalsIgnoreCase(servicio)) {
                return this.myServicio[i].modeloMasPopular();
            }
        }
        return null;
    }

    public String infoServicio(String servicio) {
        return this.buscarServicio(servicio).toString();
    }

    public void buscarCond(String servicio, String cedula) {
        this.buscarServicio(servicio).buscarConduct(cedula);
    }

    public String buscarCarreraTel(String tel) {
        String cad = "No se encontro carrera con este numero telefonico";
        for (int i = 0; i < this.myServicio.length; i++) {
            if (!this.myServicio[i].buscarCarreraTel(tel).equalsIgnoreCase("n")) {
                cad = this.myServicio[i].buscarCarreraTel(tel);
            }
        }
        return cad;
    }

    public boolean buscarCarreraTlf(String tel) {
        for (int i = 0; i < this.myServicio.length; i++) {
            if (this.myServicio[i].buscarCarreraTlf(tel) == true) {
                return this.myServicio[i].buscarCarreraTlf(tel);
            }
        }
        return false;
    }
}
