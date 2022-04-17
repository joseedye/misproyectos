/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Juego;
import java.awt.geom.RoundRectangle2D;
//import util.Contadores;

/**
 *
 * @author acer
 */
public class Personaje extends Thread {

    public static final int ANCHO = 25;
    public static final int ALTO = 50;

    private Habitacion habitacion;
    private Objeto elemento;

    public int x,y;
    private int dx = 1,dy = 1;
    private final int MIN = 5,MAX = 10;

    public Personaje(int x, int y, Habitacion habitacion) {
        this.x = x;
        this.y = y;
        this.habitacion = habitacion;
    }

    public RoundRectangle2D getPersonaje() {
        return new RoundRectangle2D.Double(x, y, ANCHO, ALTO, 15, 10);
    }

    @Override
    public void run() {
        while (true) {mover();
            try {
                Thread.sleep(7);
            } catch (InterruptedException ie) {
            }}
    }

    private void mover() {
        x = x + dx ;  y = y + dy;
        if (x + ANCHO > habitacion.getBounds().getMaxX()) {dx = -dx;}
        if (y + ALTO > habitacion.getBounds().getMaxY() - 19 - 6) {dy = -dy;}
        if (x < 0) {dx = -dx;}
        if (y < 0) {dy = -dy;}
        if (elemento != null) {elemento.cambiarPosicion(x, y);        }
        habitacion.repaint();
    }

    public boolean tieneElemento() {
        return elemento != null;
    }

    public void tomarElemento(Objeto elemento) {
        this.elemento = elemento;
        this.elemento.tomar(this);
        this.elemento.start();
    }

    public void soltarElemento() {
        this.elemento = null;
    }

}
