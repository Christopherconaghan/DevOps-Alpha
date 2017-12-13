/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package airlinebookingsystem;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author Ford
 */

import javax.swing.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

@SuppressWarnings("serial")
public class ConnectionManager {
	// credentials for database including AWS RDS database endpoint and JDBC
	// driver
	final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
	final String DB_URL = "jdbc:mysql://myflightdb.cvjkp9gulexe.eu-west-1.rds.amazonaws.com";
	final String USER_NAME = "user";
	final String PASSWORD = "myflight";

	Connection conn = null;
	Statement stmt = null;
	ResultSet rs = null;

	// connect to database
	public void connectToDatabase() {
		try {
			// STEP 1 - Load the JDBC driver
			java.lang.Class.forName(JDBC_DRIVER);
			System.out.println("STEP 1 COMPLETE - Driver Registered...");

			// STEP 2 - Open a connection
			conn = DriverManager.getConnection(DB_URL, USER_NAME, PASSWORD);
			System.out.println("STEP 2 COMPLETE - Connection obtained...");

			// STEP 3 - Create Statement object
			stmt = conn.createStatement();
			System.out.println("STEP 3 COMPLETE - Statement object created...");
		} catch (ClassNotFoundException e) {
			JOptionPane.showMessageDialog(null,"Could not load driver.\n" + e.getMessage());
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null,"Problem with SQL.\n" + e.getMessage());
		}

	}

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
