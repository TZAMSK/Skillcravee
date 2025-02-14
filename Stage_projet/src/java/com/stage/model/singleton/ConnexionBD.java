package com.stage.model.singleton;

import com.stage.model.config.ConfigBD;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ConnexionBD {
      private static Connection conn=null;
    public static Connection getConnection() throws SQLException{
        try {
            Class.forName(ConfigBD.DRIVER);
                conn =  DriverManager.getConnection(ConfigBD.URL, ConfigBD.USER, ConfigBD.PASSWORD);

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ConnexionBD.class.getName()).log(Level.SEVERE, null, ex);
        }
         return conn;
    }
    
    public static void closeConnection(){
    
        try {
            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(ConnexionBD.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    }
    
}
