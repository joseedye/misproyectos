/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Juego;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Shape;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import util.Contadores;

/**
 *
 * @author acer
 */
public final class Habitacion extends JPanel {

    private Personaje personaje[];
    private Objeto objetos[];
    Image persona;
    Image objeto;

    public Habitacion(int personajes, int objeto) {
        super.setBackground(Color.WHITE);
        personaje = new Personaje[personajes];
        objetos = new Objeto[objeto];
        crearImg2();
        crearImg();
    }

    public void iniciar() {
        //posicion de inicio
        int maxX = (int) (Vista.ANCHO - 10 - Personaje.ANCHO);
        int maxY = (int) (Vista.ALTO -57- Personaje.ALTO);

        for (int i = 0; i < personaje.length; i++) {
            personaje[i] = new Personaje(Contadores.getIntegerRandom(0, maxX), Contadores.getIntegerRandom(0, maxY), this);
        }

        for (int i = 0; i < objetos.length; i++) {
            objetos[i] = new Objeto(Contadores.getIntegerRandom(0, maxX), Contadores.getIntegerRandom(0, maxY));
        }
        for (Personaje personaje : personaje) {
            personaje.start();
        }

    }

    @Override
    protected void paintComponent(Graphics figura) {
        super.paintComponent(figura);
        Graphics2D g2d = (Graphics2D) figura;
        dibujar(g2d);
    }

    public void dibujar(Graphics2D figura) {
        for (Personaje androide : personaje) {
            figura.drawImage(getPersonaje(), androide.x, androide.y ,androide.ANCHO,androide.ALTO, this); 
        }

        for (int i = 0; i < objetos.length; i++) { 
           figura.drawImage(getObjeto(), objetos[i].getX(), objetos[i].getY() ,Objeto.ANCHO,Objeto.ALTO,this);   
           Personaje personajee = colision(objetos[i].getElemento()); 
           if (personajee != null && !objetos[i].isEnMovimiento() && !personajee.tieneElemento()) {
                objetos[i] = new Objeto(objetos[i]); personajee.tomarElemento(objetos[i]);
            }
        }
    }

    public Personaje colision(Shape elemento) {

        for (Personaje personaje : personaje) {
            if (elemento.intersects(personaje.getPersonaje().getBounds2D())) { return personaje;   }
        }  return null;
    }
    
    public void crearImg (){
            ImageIcon icon  = new  javax.swing.ImageIcon(getClass().getResource("/util/hor.jpg"));
            persona = icon.getImage();
    }

    public void crearImg2 (){
            ImageIcon icon  = new  javax.swing.ImageIcon(getClass().getResource("/util/hoj.jpg"));
            objeto = icon.getImage();
           }
       
    public Image getPersonaje(){
      return persona;
    }

    public Image getObjeto(){
      return objeto;
    }
}
