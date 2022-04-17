/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package variosjavaclasepreparar;

/**
 *
 * @author MADARME
 */
public class Test_Generecidad {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int v=3,vv=4;
        float x=4.5F,xx;
        xx=x;
        Persona y=new Persona("Pepe 1",8855996);
        Persona yy=new Persona("Pepe 2",8855996);
        Util util=new Util();
        util.imprimir(x);
        util.imprimir(v);
        util.imprimir(y);
        util.imprimir(util.compararDosObjetos(v, vv));
        util.imprimir(util.compararDosObjetos(x, xx));
        util.imprimir(util.compararDosObjetos(y, yy));
    }
    
}
