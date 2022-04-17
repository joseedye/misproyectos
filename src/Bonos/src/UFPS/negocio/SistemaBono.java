package UFPS.negocio;

import UFPS.modelo.*;
import ufps.util.colecciones_seed.*;
import ufps.util.*;

/**
 *
 * @author jose eduardo rozo
 */
public class SistemaBono {

    ListaCD<Estudiante> ests = new ListaCD<>();
    ListaCD<Regalo> regalos = new ListaCD<>();
    Cola<Bono> bonos = new Cola<>();
    //Direcciones de persistencia
    final String dirEst = "http://madarme.megaterios.co/estudiantes.txt";
    final String dirBono = "http://madarme.megaterios.co/bonos.txt";

    public SistemaBono() {

        this.cargarEstudiantes();
        this.cargarBonos(); 
        this.ordenarEstudiantes();
        this.ordenarBonos();
        this.crearRegalos();
        this.enviarEmails();
    }

    
    
    private void enviarEmails() {
        ServicioEmail se = new ServicioEmail("pruebascorreojava", "3204291234");
        IteratorLCD it = (IteratorLCD) regalos.iterator();
        
        for (int i = 0; i < regalos.getTamanio(); i++) {
            Regalo temp = (Regalo) it.next();
            String cuerpo = "señor " + temp.getEst().getNombre() + " ha sido el ganador de el bono numero ";
                   cuerpo += temp.getBono().getValor() + " y su promedio fue de : "+temp.getEst().getPromedio();
                   
            se.enviarEmail(temp.getEst().getEmail(), "notificacion de bono", cuerpo);
            
        }
    }
    

    /**
     * ORDENA LOS ESTUDIANTES POR PROMEDIO
     */
    private void ordenarEstudiantes() {
        if (!ests.esVacia()) {
            Pila<Estudiante> pilaEstudiantes = new Pila();
            int tam = ests.getTamanio();
            for (int i = 0; i < tam; i++) {

                IteratorLCD it = (IteratorLCD) ests.iterator();
                Estudiante menor = (Estudiante) it.next();

                while (it.hasNext()) {
                    Estudiante temp = (Estudiante) it.next();

                    if (temp.getPromedio() <= menor.getPromedio()) {
                        menor = temp;

                    }
                }

                pilaEstudiantes.apilar(menor);
                ests.eliminar(ests.getIndice(menor) + 1);

            }
                ests.vaciar();
            int tama = pilaEstudiantes.getTamanio();
            for (int i = 0; i < tama; i++) {
                ests.insertarAlFinal(pilaEstudiantes.desapilar());
            }
        }
    }

    /**
     * NO SE PERMITE PARA EL ORDENAMIENTO USAR ESTRUCTURAS DISTINTAS A PILAS Y
     * COLAS
     *
     */
    private void ordenarBonos() { 
        
        if (!bonos.esVacia()) {

            Pila<Bono> pilaBono2 = new Pila();
            Cola<Bono> colaBonorta = new Cola();
            int tam = bonos.getTamanio();
            
            for (int i = 0; i < tam/2; i++) {

                Bono mayor = bonos.deColar();
                while (!bonos.esVacia()) {
                    Bono dos = bonos.deColar();
                    if (dos.getValor() >= mayor.getValor()) {
                        pilaBono2.apilar(mayor);
                        mayor = dos;
                    } else {
                        pilaBono2.apilar(dos);
                    }
                }
                //System.out.println(mayor.getValor());
                colaBonorta.enColar(mayor);
                
                
                
                
                Bono mayor2 = pilaBono2.desapilar();
                while (!pilaBono2.esVacia()) {
                    Bono doss = pilaBono2.desapilar();
                    if (doss.getValor() >= mayor2.getValor()) {
                        bonos.enColar(mayor2);
                        mayor2 = doss;
                    } else {
                        bonos.enColar(doss);
                    }
                }
                // System.out.println(mayor.getValor());
                colaBonorta.enColar(mayor2);

            }
            bonos = colaBonorta;
        }
    }

    private void crearRegalos() {
               
        double tam = bonos.getTamanio();
        if (bonos.getTamanio() > ests.getTamanio()) {
            tam = ests.getTamanio();
        }
         IteratorLCD it = (IteratorLCD) ests.iterator();
        for (int i = 0; i < tam; i++) {
            Estudiante estu = (Estudiante)it.next();
            Regalo regalo = new Regalo(estu, bonos.deColar());
            regalos.insertarAlFinal(regalo);
        }
    }

    public ListaCD<Estudiante> getEsts() {
        return ests;
    }

    public ListaCD<Regalo> getRegalos() {
        return regalos;
    }

    public Cola<Bono> getBonos() {
        return bonos;
    }

    private void cargarEstudiantes() {
        ArchivoLeerURL a = new ArchivoLeerURL(this.dirEst);
        Object v[] = a.leerArchivo();
        for (int i = 1; i < v.length; i++) {
            String datos[] = v[i].toString().split(";");
            //System.out.println(d.toString());
            Estudiante nuevo = new Estudiante(Long.parseLong(datos[0]), datos[1], datos[2]);
            for (int j = 3; j < datos.length; j++) {
                float nota = Float.parseFloat(datos[j].replace(",", "."));
                nuevo.getNotas().insertar(nota);
            }

            this.ests.insertarAlFinal(nuevo);

        }
    }

    private void cargarBonos() {
        ArchivoLeerURL a = new ArchivoLeerURL(this.dirBono);
        Object v[] = a.leerArchivo();
        for (int i = 0; i < v.length; i++) {
            String datos[] = v[i].toString().split("-");
            Bono bon = new Bono(Long.parseLong(datos[2]));
            this.bonos.enColar(bon);

        }
    }
}
