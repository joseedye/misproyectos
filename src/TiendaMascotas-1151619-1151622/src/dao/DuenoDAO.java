package dao;

import Conexion.Conexion;
import dto.DuenoDTO;
import interfaces.Crud;
import java.util.List;

/**
 *
 * @author jose eduardo
 */
public class DuenoDAO implements Crud{
    
 private static final String SQL_TABLE = "propietario",
            SQL_INSERT = "INSERT INTO " + SQL_TABLE + " (cedula, nombre, direccion) VALUES (?,?,?)",
            SQL_UPDATE = "UPDATE " + SQL_TABLE + " SET nombre=?, direccion=? WHERE id = ?",
            SQL_DELETE = "DELETE FROM " + SQL_TABLE + " WHERE id = ?",
            SQL_SELECT = "SELECT * FROM " + SQL_TABLE + " WHERE id = ?",
            SQL_SELECT_ALL = "SELECT * FROM " + SQL_TABLE,
            SQL_AUTO_INCREMENT = "SELECT AUTO_INCREMENT FROM INFORMATION_SCHEMA.TABLES WHERE TABLE_SCHEMA = ? AND TABLE_NAME = '" + SQL_TABLE + "'";

    private static final Conexion CON = Conexion.getInstance();

    
    public boolean create(DuenoDTO o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object read(Object key) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List readAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean update(Object o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean delete(Object key) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int auto_increment() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean create(Object o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
   
}
