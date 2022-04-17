/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import controlador.PropietarioControl;
import dao.PropietarioDAO;


public class Principal {

    public static void main(String[] args) {
     PropietarioDAO d = new PropietarioDAO();
     PropietarioControl p = new PropietarioControl(d);

        
    }

}
