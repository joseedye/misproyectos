/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Juego;

import java.awt.geom.Ellipse2D;
import util.Contadores;

/**
 *
 * @author acer
 */
public class Objeto extends Thread implements Cloneable {
    private int x;
    private int y;
    public static final int ANCHO = Personaje.ANCHO - 4;
    public static final int ALTO = Personaje.ANCHO - 4;
    private boolean enMovimiento;
    private Personaje personaje;

    public Objeto(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Objeto(Objeto elemento) {
        this.x = elemento.x;
        this.y = elemento.y;
    }

    public Ellipse2D getElemento() {
        return new Ellipse2D.Double(x, y, ANCHO, ALTO);
    }
  
    public void tomar(Personaje androide) {
        enMovimiento = true;
        this.personaje = androide;
//        color = Color.RED;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void soltar() {
        if (personaje != null) {
            personaje.soltarElemento();
            personaje = null;
        }
    }

    public void cambiarPosicion(int x, int y) {
        this.x = x + (Personaje.ANCHO / 2) - (ANCHO / 2);
        this.y = y + (Personaje.ALTO / 2) - (ALTO / 2);
    }


    @Override
    public void run() {
        try {
            Thread.sleep(Contadores.getIntegerRandom(1500, 2500));
        } catch (InterruptedException ie) {
            ie.printStackTrace();
        }  soltar();
        try {
            Thread.sleep(Contadores.getIntegerRandom(250, 750));
        } catch (InterruptedException ie) {
            ie.printStackTrace();
        }
//        color = Color.BLUE;
        enMovimiento = false;

    }

    @Override
    public Objeto clone() throws CloneNotSupportedException {
        return (Objeto) super.clone();
    }

    public boolean isEnMovimiento() {
        return enMovimiento;
    }

}
