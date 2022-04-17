/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cebra;

/**
 *
 * @author Astrid Caicedo
 */
public class Carro extends Thread {

    private int x;
    private int y;
    private int largo;
    private int alto;
    private boolean b;

    public Carro() {
        this.x = 5;
        this.y = 40;
        this.largo = 69;
        this.alto = 45;
        this.b = true;
    }

    public boolean isB() {
        return b;
    }

    public void setB(boolean b) {
        this.b = b;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getLargo() {
        return largo;
    }

    public int getAlto() {
        return alto;
    }
    
    

    @Override
    public void run() {
        int con =5;
        while (b) {
           con = con + 1;
           x = con;
            if (con == 700) {
                con = 5;
            }

        }
        this.x = 5;
        this.stop();

    }
}
