/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio;

/**
 *
 * @author Estudiante
 */
public class Calculadora {
    private double mem;

    public double getMem() {
        return mem;
    }

    public void setMem(double mem) {
        this.mem = mem;
    }

    public double limpiarPantalla() {
        return 0;
    }

    public double sumar(double x, double y) {
        return (x+y);
    }

    public double restar(double x, double y) {
        return x - y;
    }

    public double multiplicar(double x, double y) {
        return x * y;
    }

    public double dividir(double x, double y) {
        if (y != 0) {
            return x / y;
        } else {
            throw new RuntimeException("Intenta dividir un cero!!");
        }
    }

    public double porcentaje(double x, double y) {
        return x * y / 100;
    }

    public double potencia(double x, double y) {
        return Math.pow(x, y);
    }

    public double Mmas(double x) {
        mem += x;
        return mem;
    }

    public double Mmenos(double x) {
        mem -= x;
        return mem;
    }

    public double MRC() {
        return mem;
    }

}
