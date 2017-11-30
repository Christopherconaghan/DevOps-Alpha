/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author Ford
 */
public class ConnectionManager {
    
    Connection conn = null;

    public static Connection getConnection() {
        try {
                Class.forName("com.mysql.jdbc.Driver");
                Connection conn = DriverManager.getConnection("jdbc:mysql://myflightdb.cvjkp9gulexe.eu-west-1.rds.amazonaws.com/myflightdb", "user", "myflight");
                return conn;
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage());
            return null;
        }
    }
    
}
