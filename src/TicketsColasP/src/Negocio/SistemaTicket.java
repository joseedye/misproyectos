/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio;

import Modelo.Caja;
import Modelo.Estudiante;
import Modelo.Ticket;
import java.util.Calendar;
import java.util.Date;
import ufps.util.ArchivoLeerURL;
import ufps.util.ServicioEmail;
import ufps.util.colecciones_seed.*;

/**
 *
 * @author acer
 */
public class SistemaTicket {

    ListaCD<Ticket> lista;
    Cola<Estudiante> estudiantes;
    Secuencia<Caja> caja;
    final String dirEst = "http://madarme.megaterios.co/estudiantes-semestre.txt";

    public SistemaTicket() {
        this.lista = new ListaCD();
        this.estudiantes = new Cola();
        this.caja = new Secuencia(3);

        this.cargarEstudiantes();
        this.crearCajas();
        this.asignarTicket();
        this.enviarEmails();

    }

    private void crearCajas() {

        ColaP<Estudiante> est = null;
        Byte a = 1, b = 3, c = 4, d = 7, e = 8, f = 10, id = 1;;

        for (int i = 0; i < caja.getCapacidad(); i++) {
            if (i == 0) {
                est = asignarEstudiantes(a, b);
            }
            if (i == 1) {
                est = asignarEstudiantes(c, d);
            }
            if (i == 2) {
                est = asignarEstudiantes(e, f);
            }
            Caja elem = new Caja(id++, est);
            caja.insertar(elem);

        }
    }

    private void cargarEstudiantes() {
        ArchivoLeerURL a = new ArchivoLeerURL(this.dirEst);
        Object v[] = a.leerArchivo();
        for (int i = 1; i < v.length; i++) {
            String datos[] = v[i].toString().split(";");
            Estudiante nuevo = new Estudiante(Integer.parseInt(datos[0]), datos[1], datos[2], Byte.parseByte(datos[3]));
            this.estudiantes.enColar(nuevo);

        }
    }

    private ColaP<Estudiante> asignarEstudiantes(Byte a, Byte b) {
        ColaP<Estudiante> colaSalida = new ColaP();
        Cola<Estudiante> colatemp = new Cola();
        Estudiante temp;
        while (!estudiantes.esVacia()) {
            temp = estudiantes.deColar();
            if (temp.getSemestre() >= a && temp.getSemestre() <= b) {
                colaSalida.enColar(temp, temp.getSemestre());
            } else {
                colatemp.enColar(temp);
            }
        }
        estudiantes = colatemp;
        return colaSalida;
    }

    private void asignarTicket() {
      
     java.util.Date fecha = new Date();
     int minutos =10;
     Calendar calendar = Calendar.getInstance();
      
        int x = -1;
        for (int i = caja.getTamanio() - 1; i != x; i--) {

            while (!caja.get(i).getEst().esVacia()) {
                
                calendar.setTime(fecha); 
                calendar.add(Calendar.MINUTE, minutos);
                
                Ticket nuevoticket = new Ticket(caja.get(i).getEst().deColar(),caja.get(i),fecha);
                
                lista.insertarAlFinal(nuevoticket);
                fecha = calendar.getTime();

            }

        }

    }

    public void enviarEmails() {
        ServicioEmail se = new ServicioEmail("pruebascorreojava", "3204291234");
        IteratorLCD it = (IteratorLCD) lista.iterator();

        for (int i = 0; i < lista.getTamanio(); i++) {
            Ticket temp = (Ticket) it.next();
            String cuerpo = "SEÑOR(A) " + temp.getEstudiante().getNombre() + " LE CORRESPONDE LA CAJA : " + temp.getCaja().getId();
            cuerpo += " Y EN LA FECHA: " + temp.getFecha();
            System.out.println(cuerpo);
//            se.enviarEmail(temp.getEstudiante().getEmail(), "NOTIFICACION DEL TURNO Y LA CAJA ", cuerpo);

        }
    }
}
