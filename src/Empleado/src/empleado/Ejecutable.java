/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empleado;

/**
 *
 * @author jose eduardo rozo
 */
public class Ejecutable {
    
    public static void main(String[] args) {
        Empleado e = new Comercial("jose eduardo",21,40000);
        Empleado f = new Comercial("jose ",21,40000);
        Empleado g = new Comercial("eduardo",21,40000);
        Comercial h = new Comercial("edye",31,40000);
        Comercial i = new Comercial("rozo",32,40000);
        Comercial d = new Comercial("yeny",33,40000);
        Comercial j = (Comercial)g;
        d.setComision(25000);
        h.setComision(22000);
        i.setComision(10000);
        j.setComision(10000);
        
        d.plus();g.plus();
        e.plus();h.plus();
        f.plus();i.plus();
        
        System.out.println(d.toString());
        System.out.println(e.toString());
        System.out.println(f.toString());
        System.out.println(g.toString());
        System.out.println(h.toString());
        System.out.println(i.toString());
          
        Empleado ee = new Repartidor("jose eduardo",21,40000,"1");
        Empleado ff = new Repartidor("jose ",21,40000,"3");
        Empleado gg = new Repartidor("eduardo",21,45000,"3");
        Empleado hh = new Repartidor("edye",31,40000,"3");
        Empleado ii = new Repartidor("rozo",32,40000,"5");
        Repartidor dd = new Repartidor("yeny",33,40000,"6");
        
        dd.plus();gg.plus();
        ee.plus();hh.plus();
        ff.plus();ii.plus();
        System.out.println("");
        System.out.println(dd.toString());
        System.out.println(ee.toString());
        System.out.println(ff.toString());
        System.out.println(gg.toString());
        System.out.println(hh.toString());
        System.out.println(ii.toString());
        
    }
}
