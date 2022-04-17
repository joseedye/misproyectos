/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import Servicios.Conexion;
import dto.FeligresDTO;
import interfaces.Crud;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author acer
 */
public class FeligresDAO implements Crud <FeligresDTO>{
    
    private static final String SQL_TABLE = "feligres",
            SQL_INSERT = "INSERT INTO " + SQL_TABLE + " (cedula,nombre,apellidos,direccion,telefono,estado,estrato) VALUES (?,?,?,?,?,?,?)",
            SQL_UPDATE = "UPDATE " + SQL_TABLE + " SET cedula=?,nombre=?,apellidos=?,direccion=?,telefono=?,estado=?,estrato=? WHERE cedula = ?",
            SQL_DELETE = "DELETE FROM " + SQL_TABLE + " WHERE cedula = ?",
            SQL_SELECT = "SELECT * FROM " + SQL_TABLE + " WHERE cedula = ?",
            SQL_SELECT_ALL = "SELECT * FROM " + SQL_TABLE;
//            SQL_AUTO_INCREMENT = "SELECT AUTO_INCREMENT FROM INFORMATION_SCHEMA.TABLES WHERE TABLE_SCHEMA = ? AND TABLE_NAME = '" + SQL_TABLE + "'";

    private static final Conexion CON = Conexion.getInstance();

    @Override
    public boolean create(FeligresDTO o) {
        
      PreparedStatement ps;
        try {
            ps = CON.getCnn().prepareStatement(SQL_INSERT);

            ps.setString(1, o.getCedula());
            ps.setString(2, o.getNombre());
            ps.setString(3, o.getApellido());
            ps.setString(4, o.getDireccion());
            ps.setString(5, o.getTelefono());
            ps.setString(6, o.getEstado());
            ps.setString(7, o.getEstrato());
            if (ps.executeUpdate() > 0) {
                return (true);
                
            }
        } catch (SQLException ex) {
            System.out.println("error en crear "+ex);
        } finally {
            CON.close();
        }
        return (false);
       }

    @Override
    public FeligresDTO read(Object key) { 
        PreparedStatement ps;
        ResultSet rs;
        FeligresDTO item = null;

        try {
            ps = CON.getCnn().prepareStatement(SQL_SELECT);
            ps.setString(1, (String) key);
            rs = ps.executeQuery();

            while (rs.next()) {
            item = new FeligresDTO (rs.getString("cedula"), rs.getString("nombre"), rs.getString("apellidos"),
                    rs.getString("direccion"),rs.getString("telefono"),rs.getString("estado"),rs.getString("estrato"));

           }
        } catch (SQLException ex) {
            System.out.println("error en leer feligres "+ex);
        } finally {
            CON.close();
        }
        return (item);
        
    }

    @Override
    public List<FeligresDTO> readAll() {
      
        PreparedStatement ps;
        ResultSet rs;
        ArrayList<FeligresDTO> listado = new ArrayList();

        try {
            ps = CON.getCnn().prepareStatement(SQL_SELECT_ALL);
            rs = ps.executeQuery();
            FeligresDTO item;

            while (rs.next()) {
                //faltaaaaaaaaaaaaaaaaaaa
            item = new FeligresDTO();//rs.getInt("id"), rs.getString("cedula"), rs.getString("nombre"), rs.getString("direccion"));
            listado.add(item);
        }
        } catch (SQLException ex) {
            Logger.getLogger(FeligresDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            CON.close();
        }
        return (listado);
    }

    @Override
    public boolean update(FeligresDTO o) {
     PreparedStatement ps;
        try {
            ps = CON.getCnn().prepareStatement(SQL_UPDATE);
            
            ps.setString(1, o.getCedula());
            ps.setString(2, o.getNombre());
            ps.setString(3, o.getApellido());
            ps.setString(4, o.getDireccion());
            ps.setString(5, o.getTelefono());
            ps.setString(6, o.getEstado());
            ps.setString(7, o.getEstrato());
            ps.setString(8, o.getCedula());
           
            
            if (ps.executeUpdate() > 0) {
                return (true);
            }
        } catch (SQLException ex) {
            Logger.getLogger(FeligresDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            CON.close();
        }
        return (false);
    }
    
    

    @Override
    public boolean delete(Object key) {
    String cedula =  (String) key;
    PreparedStatement ps;
        try {
            ps = CON.getCnn().prepareStatement(SQL_DELETE);

            ps.setString(1, cedula);

            if (ps.executeUpdate() > 0) {
                return (true);
            }
        } catch (SQLException ex) {
            Logger.getLogger(FeligresDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            CON.close();
        }
        return (false);   
    
    }

    
    
}
