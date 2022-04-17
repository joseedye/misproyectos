/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio;

import Vista.Vista;
import modelo.*;
import ufps.util.ArchivoLeerURL;
import ufps.util.colecciones_seed.*;

/**
 *
 * @author acer
 */
public class ServicioBiblioteca {

    final String diesolicitud = "http://madarme.megaterios.co/solicitudes.txt";
    final String dirinventario = "http://madarme.megaterios.co/inventario.txt";

    ColaP<Solicitud> cola_solicitud = new ColaP();
    ;
    ListaCD<Mensaje> mensajes = new ListaCD();
    Secuencia<Facultad> facultades = new Secuencia(6);

    public ServicioBiblioteca() {

        this.cargarSolicitudes();
        this.cargarInventario();
        this.generarMensajes();
        this.imprimir();

    }

    private void cargarSolicitudes() {

        ArchivoLeerURL a = new ArchivoLeerURL(this.diesolicitud);
        Object v[] = a.leerArchivo();
        for (int i = 1; i < v.length; i++) {
            String datos[] = v[i].toString().split(";");
            Solicitud nuevo = new Solicitud(Byte.parseByte(datos[2]), Byte.parseByte(datos[1]), Long.parseLong(datos[0]));
            this.cola_solicitud.enColar(nuevo, nuevo.getId_usuario());
        }

    }

    private void cargarInventario() {
        ListaCD<Libro> lib = new ListaCD();

        ArchivoLeerURL a = new ArchivoLeerURL(this.dirinventario);
        Object v[] = a.leerArchivo();
        for (int i = 1; i < v.length; i++) {
            String datos[] = v[i].toString().split(";");
            Libro nuevo = new Libro(Long.parseLong(datos[0]), datos[1]);
            lib.insertarAlFinal(nuevo);
        }

        for (int i = 0; i < facultades.getCapacidad(); i++) {
            Facultad d = new Facultad((byte) (i + 1), escogerLibro(i + 1, lib));
            facultades.insertar(d);
        }

    }

    private Pila<Libro> escogerLibro(long n, ListaCD<Libro> libros) {
        Pila<Libro> salida = new Pila();
        long numero;

        IteratorLCD<Libro> it = (IteratorLCD) libros.iterator();
        while (it.hasNext()) {
            Libro temp = it.next();
            numero = temp.getCod_libro() / 100000;
            if (n == numero) {
                salida.apilar(temp);
            }
        }

        return salida;
    }

    private void generarMensajes(){
        
        while (!cola_solicitud.esVacia()){
          Solicitud temp = cola_solicitud.deColar();
          String descripcion = "";
          
            if(temp.getTipo_solicitud()==1){
                
                  if(existeLibro(temp.getCod_libro())){
                      System.out.println("si existe");
                  descripcion = "se RECERVO el libro con codigo: "+temp.getCod_libro()+" "+Usuario(temp.getId_usuario());
                  eliminar(temp.getCod_libro());
                  }else{descripcion="no se RECERVO el libro con codigo "+ temp.getCod_libro()+" es invalido";}
            
            }
            else
            {
                
            if(temp.getTipo_solicitud()==2){
                    
                
                if( codigoValido(temp.getCod_libro())  &&  !existeLibro(temp.getCod_libro()) )  {
                  guardar(temp.getCod_libro());
                  descripcion = "se ENTREGO el libro con codigo: "+temp.getCod_libro()+" "+Usuario(temp.getId_usuario());
                  }else{descripcion="el codigo "+ temp.getCod_libro()+" es invalido";}
                
            
            }
            }
                    if(descripcion.isEmpty()){descripcion="el codigo "+ temp.getCod_libro() +"es invalido";}

                mensajes.insertarAlFinal(new Mensaje(descripcion));
            }
    }



    private String Usuario(byte i) {
        if (i == 1) {
            return "estudiante";
        }
        if (i == 2) {
            return "profesor";
        }
        return "";
    }

    private void eliminar(long cod) {

        long n = cod / 100000;
        if (codigoValido(cod)) {
            Facultad temp = facultades.get((int) n - 1);
            Pila<Libro> otra2 = new Pila();
            Pila<Libro> otra = temp.getLibros();
            while (!otra.esVacia()) {
                Libro li = otra.desapilar();

                if (li.getCod_libro() != cod) {
                    otra2.apilar(li);
                }
            }
            while (!otra2.esVacia()) {
                otra.apilar(otra2.desapilar());
            }

        }
    }

    private boolean existeLibro(long l) {

        if (codigoValido(l)) {
            long n = l / 100000;
            boolean rta = false;
            Facultad temp = facultades.get((int) n - 1);
            Pila<Libro> otra2 = new Pila();
            Pila<Libro> otra = temp.getLibros();

            while (!otra.esVacia()) {
                Libro li = otra.desapilar();
                otra2.apilar(li);

                if (li.getCod_libro() == l) {
                    rta = true;
                }

            }
            //pasar  de una pila a otra
            while (!otra2.esVacia()) {
                otra.apilar(otra2.desapilar());
            }

            return rta;
        }

        return false;
    }

    private boolean codigoValido(long l) {
        long n = l / 100000;
        return n >= 1 && n <= 6;
    }

    private void guardar(long l) {
        long n = l / 100000;

        facultades.get((int) n - 1).getLibros().apilar(new Libro(l, "LIBRO"));

    }

    private void imprimir() {
        Vista v = new Vista();
        v.setVisible(true);

        IteratorLCD it = (IteratorLCD) mensajes.iterator();
        while (it.hasNext()) {
            v.rta.setText(v.rta.getText() + "\n " + it.next().toString());
        }
    }
}
