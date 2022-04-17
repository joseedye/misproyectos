/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package login;

import java.util.ArrayList;

/**
 *
 * @author jose eduardo rozo
 */
public class Cuentas {

    ArrayList< Cuenta> cuentas;

    
    public Cuentas() {
        cuentas = new ArrayList<>();
        
        if (cuentasGuardadas() == null) {
            crearArchivo();
            addCuenta("admin", "admin");
        } else {

            setCuentas(cuentasGuardadas());
        }
    }

    //traer todas las cuentas de un txt
    public ArrayList< Cuenta> cuentasGuardadas() {

        return null;
    }
    
    //busca una cuenta guardada
    public boolean buscar(){
        
        return false;
    }

    //crea un achivo txt
    public boolean crearArchivo() {

        return false;
    }

    //crea una cuenta
    public void addCuenta(String usuario, String contrasena) {
        cuentas.add(new Cuenta(usuario,contrasena));
        guardarCuentas();
    }

    //guarda las cuentas existentes
    public boolean guardarCuentas() {

        return false;
    }

    public ArrayList<Cuenta> getCuentas() {
        return cuentas;
    }

    public void setCuentas(ArrayList<Cuenta> cuentas) {
        this.cuentas = cuentas;
    }

}
