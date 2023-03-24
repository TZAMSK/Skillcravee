/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package connexion;

import config.configBD;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author phili
 */
public class connexionBD {
      private static Connection conn=null;
    public static Connection getConnection() throws SQLException{
        try {
            // Le chargerment du driver, librairie
            Class forName = Class.forName(configBD.DRIVER);
                conn =  DriverManager.getConnection(configBD.URL, configBD.USER, configBD.PASSWORD);
                 //   conn.setAutoCommit(false); // désactive l'auto-commit pour permettre les rollbacks

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(connexionBD.class.getName()).log(Level.SEVERE, null, ex);
        }
         //DriverManger est responsable de la selection de la BD et la création de la connexion
         return conn;
    }
    
    public static void closeConnection(){
    
        try {
            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(connexionBD.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    }
    
}
