package semaforo;

import java.awt.Color;
import java.awt.Point;
import static java.lang.Thread.sleep;
import javax.swing.*;
import vista.Vista;

public class Semaforo implements Runnable {

    /*
    Se crean las variables de la vista
    1.Rojo,Amarillo, Verde -> Boton rojo,Amarillo y verde de el 
    semaforo
    2.Auto,Persona y Zebra->Labels con las imagenes de la simulacion de el 
    semaforo
    3.CPersonas->Variable que cuenta las personas que pasan en el semaforo
    4.cont,temp1,temp2,temp3,temp4->Variables de conteo de el tiempo que 
    cursan cada color de semaforo y con todo el recorrido de el semaforo
    5.El button nuevo crea una nueva simulacion de semaforo
     */
    JButton Rojo;
    JButton Amarillo;
    JButton Verde;
    JButton ButtonN;
    JTextField Conteo;
    JLabel Auto;
    JLabel Persona;
    JLabel Zebra;
    JTextField CPersonas;

    int cont = 0, temp1 = 0, temp2 = 0, temp3 = 0, temp4 = 0;

    //Constructor vacio por defecto 
    public Semaforo() {
    }

    //Constructor inicializado con toda la vista
    public Semaforo(JButton ent1, JButton ent2, JButton ent3,
            JTextField ent4, JButton ent5,
            JLabel ent6, JLabel ent7, JLabel ent8, JTextField ent9) {
        this.Rojo = ent1;
        this.Amarillo = ent2;
        this.Verde = ent3;
        this.Conteo = ent4;
        this.ButtonN = ent5;
        ent5.setBackground(Color.BLACK);
        this.Auto = ent6;
        this.Persona = ent7;
        this.Zebra = ent8;
        this.CPersonas = ent9;

    }

//Se inicia el hilo
    @Override
    public void run() {
        //variables para hacer los movimientos de los objetos 
        int posicionxPersona = this.Persona.getX();
        int posicionyPersona = this.Persona.getY();
        int posicionxAuto = this.Auto.getX();
        int posicionyAuto = this.Auto.getY();
        int cantPersonas = 0;
        while (true) {

            cont++;
//se hace el conteo de color rojo -> Amarillo
            if (cont >= 1 && cont <= 60) {

                temp1++;
                Conteo.setText("" + temp1);
                /*se hace el movimiento de la persona cada vez que el semaforo
                
               esta en rojo*/
                posicionyPersona -= 4;
                Persona.setLocation(posicionxPersona, posicionyPersona);

            }
//se coloca el semaforo en rojo
            if (cont == 1) {
                Rojo.setBackground(Color.red);
                Amarillo.setBackground(Color.gray);
                Verde.setBackground(Color.gray);

            }
//se hace el conteo de amarillo ->Verde 
            if (cont >= 60 && cont <= 63) {
                temp2++;
                Conteo.setText("" + temp2);

            }
//Se coloca el color amarillo
            if (cont == 60) {
                cantPersonas++;

                this.CPersonas.setText(String.valueOf(cantPersonas));
                Rojo.setBackground(Color.gray);
                Amarillo.setBackground(Color.yellow);
                Verde.setBackground(Color.gray);

            }
//se hace el conteo de color verde
            if (cont >= 63 && cont <= 93) {
                temp3++;
                Conteo.setText("" + temp3);

                //se hace movimiento de el auto cuando esta en verde
                posicionxAuto += 6;
                Auto.setLocation(posicionxAuto, posicionyAuto);
            }
//se coloca el color verde
            if (cont == 63) {

                Rojo.setBackground(Color.gray);
                Amarillo.setBackground(Color.gray);
                Verde.setBackground(Color.green);

            }
            //se hace el conteo de color verde -> amarillo
            if (cont >= 93 && cont <= 96) {
                temp4++;
                Conteo.setText("" + temp4);

            }
            //se coloca otra vez el color en amarillo            
            if (cont == 93) {
                Rojo.setBackground(Color.gray);
                Amarillo.setBackground(Color.yellow);
                Verde.setBackground(Color.gray);

            }
//se reinicia el cruze de personas y el cambio de color de el semaforo
            if (cont == 94) {

                cont = 0;
                temp1 = 0;
                temp2 = 0;
                temp3 = 0;
                temp4 = 0;
                posicionyPersona = 150;
                posicionxAuto = 0;
                Persona.setLocation(posicionxPersona, posicionyPersona);
                Auto.setLocation(posicionxAuto, posicionyAuto);

            }
//Medicion de tiempo que se utilice en el proceso
            try {
                sleep(100);
            } catch (Exception e) {
            }
        }
    }
//Se inicia el hilo

    public void start() {
        new Thread(this).start();

    }
}
