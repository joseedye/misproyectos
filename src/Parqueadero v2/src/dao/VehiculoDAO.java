/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import Conexion.Conexion;
import dto.VehiculoDTO;
import interfaces.Crud;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author acer
 */
public class VehiculoDAO implements Crud <VehiculoDTO>{
    
    private static final String SQL_TABLE = "parqueadero",
            SQL_INSERT = "INSERT INTO " + SQL_TABLE + " (placa, modelo,tipo,valor) VALUES (?,?,?,?)",
            SQL_UPDATE = "UPDATE " + SQL_TABLE + " SET placa=?, tipo=? WHERE id = ?",
            SQL_DELETE = "DELETE FROM " + SQL_TABLE + " WHERE placa = ?",
            SQL_SELECT = "SELECT * FROM " + SQL_TABLE + " WHERE placa = ?",
            SQL_SELECT_ALL = "SELECT * FROM " + SQL_TABLE;

    private static final Conexion CON = Conexion.getInstance();

    @Override
    public boolean create(VehiculoDTO o) {
       PreparedStatement ps;
        try {
            ps = CON.getCnn().prepareStatement(SQL_INSERT);

            ps.setString(1, o.getPlaca());
            ps.setInt(2, o.getModelo());
            ps.setInt(3, o.getTipo());
            ps.setInt(4, o.getValor());
            
            if (ps.executeUpdate() > 0) {
                return (true);
            }
        } catch (SQLException ex) {
            Logger.getLogger(VehiculoDTO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            CON.close();
        }
        return (false);
    }

    @Override
    public VehiculoDTO read(Object key) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<VehiculoDTO> readAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean update(VehiculoDTO o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean delete(Object key) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public boolean deletee( ) {
         PreparedStatement ps;
        try {
            ps = CON.getCnn().prepareStatement("DELETE FROM parqueadero");
            ps.executeUpdate();
            return (true);      
        } catch (SQLException ex) {
            Logger.getLogger(VehiculoDTO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            CON.close();
        }
        return (false);
      }

    @Override
    public int auto_increment() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
}
