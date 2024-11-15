package com.DataBase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class koneksiDatabase {
    
    private static Connection connection;
    
        public static Connection getConnection(){
            if (connection == null){
                try {
                    String url = "jdbc:mysql://localhost:3306/pos";
                    String user = "root";
                    String pass = "";
                    DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
                    connection = (Connection) DriverManager.getConnection(url, user, pass);
                    
                } catch (SQLException ex){
                    Logger.getLogger(koneksiDatabase.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            return connection;
        }
}
