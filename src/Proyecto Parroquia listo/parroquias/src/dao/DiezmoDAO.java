/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import Servicios.Conexion;
import dto.DiezmoDTO;
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
public class DiezmoDAO implements Crud<DiezmoDTO>{ 

    private static final String SQL_TABLE = "diezmo",
            SQL_INSERT = "INSERT INTO " + SQL_TABLE + " (cedula,valor) VALUES (?,?)",
            SQL_UPDATE = "UPDATE " + SQL_TABLE + " SET placa=?, tipo=? WHERE id = ?",
            SQL_DELETE = "DELETE FROM " + SQL_TABLE + " WHERE cedula = ?",
            SQL_SELECT = "SELECT * FROM " + SQL_TABLE + " WHERE cedula = ?",
            SQL_SELECT_ALL = "SELECT * FROM " + SQL_TABLE;
//            SQL_AUTO_INCREMENT = "SELECT AUTO_INCREMENT FROM INFORMATION_SCHEMA.TABLES WHERE TABLE_SCHEMA = ? AND TABLE_NAME = '" + SQL_TABLE + "'";

    private static final Conexion CON = Conexion.getInstance();
    
    @Override
    public boolean create(DiezmoDTO o) {
        
      PreparedStatement ps;
        try {
            ps = CON.getCnn().prepareStatement(SQL_INSERT);

            ps.setString(1, o.getCedula());
            ps.setString(2, o.getValor());
            
            if (ps.executeUpdate() > 0) {
                return (true);
            }
        } catch (SQLException ex) {
            Logger.getLogger(DiezmoDTO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            CON.close();
        }
        return (false);
         }

    @Override
    public DiezmoDTO read(Object key) {
        String cedula = (String) key;
        PreparedStatement ps;
        ResultSet rs;
        DiezmoDTO item = null;

        try {
            ps = CON.getCnn().prepareStatement(SQL_SELECT);

            rs = ps.executeQuery();

            while (rs.next()) {
               
                item = new DiezmoDTO(rs.getString("cedula"),rs.getString("valor"));

            }
        } catch (SQLException ex) {
            System.out.println("no se hiso");
            Logger.getLogger(DiezmoDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            CON.close();
        }
        return (item);
    }
            
    @Override
    public List<DiezmoDTO> readAll() {
        
        PreparedStatement ps;
        ResultSet rs;
        ArrayList<DiezmoDTO> listado = new ArrayList();

        try {
            ps = CON.getCnn().prepareStatement(SQL_SELECT_ALL);
            rs = ps.executeQuery();
            DiezmoDTO item;

            while (rs.next()) {
                //faltaaaaaaaaaaaaaaaaaaa
            item = new DiezmoDTO(rs.getString("cedula"), rs.getString("valor"));
            listado.add(item);
        }
        } catch (SQLException ex) {
            Logger.getLogger(DiezmoDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            CON.close();
        }
        return (listado);
    }

    @Override
    public boolean update(DiezmoDTO o) {
        if(delete(o.getCedula())&&create(o))return true;
        return false;
       }

    @Override
    public boolean delete(Object key) {
        String cedula = (String) key;
        
         PreparedStatement ps;
        try {
            ps = CON.getCnn().prepareStatement(SQL_DELETE);

            ps.setString(1, cedula);
           
            
            if (ps.executeUpdate() > 0) {
                return (true);
            }
        } catch (SQLException ex) {
            Logger.getLogger(DiezmoDTO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            CON.close();
        }
        return (false);
         }
        
    
}
