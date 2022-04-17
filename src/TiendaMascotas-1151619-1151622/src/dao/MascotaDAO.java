
package dao;

import Conexion.Conexion;
import Controlador.Controlador;
import dto.MascotaDTO;
import interfaces.Crud;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author jose eduardo
 */
public class MascotaDAO implements Crud <MascotaDTO>{

    private static final String SQL_INSERTMASCOTA = "INSERT INTO " + "mascota" + " (nombre, raza, dueño) VALUES (?,?,?)";

Conexion CON = Conexion.getInstance();
    
    @Override
    public boolean create(MascotaDTO mascota) {
           PreparedStatement ps;
        
        try{
         ps = CON.getCnn().prepareStatement(SQL_INSERTMASCOTA);
           
            ps.setString(1,mascota.getNombre());
            ps.setString(2,mascota.getRaza());
            ps.setString(3,mascota.getDueño());
            ps.executeUpdate();
           
            return (true);

    }catch (SQLException ex){
         Logger.getLogger(Controlador.class.getName()).log(Level.SEVERE, null, ex);
         return (false);
     }   
    }

    @Override
    public MascotaDTO read(Object key) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<MascotaDTO> readAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean update(MascotaDTO o) {
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
    
    
}
