// clase para conectarnos a la base de datos
package Conexion;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Conexion {
    private static Conexion instance;
    private Connection cnn;
    private static final String DB = "parqueadero";
    private static final String USER = "root";
    private static final String PASS = "";

    private Conexion() {

        try {
            Class.forName("com.mysql.jdbc.Driver");
            cnn = DriverManager.getConnection("jdbc:mysql://localhost:3306/" + DB, USER, PASS);
            System.out.println("se creo la conexion ");
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public static synchronized Conexion getInstance() {

        if (instance == null) {
            instance = new Conexion();
        }

        return instance;
    }

    /**
     * Obtener conexion de la base de datos
     *
     * @return conexion de base de datos
     */
    public Connection getCnn() {
        return cnn;
    }

    /**
     * Obtener nombre de la base de datos
     *
     * @return Nombre de la base de datos
     */
    public static String getDb() {
        return DB;
    }

    /**
     * Cerrar conexion
     */
    public void close() {
        instance = null;
    }

}