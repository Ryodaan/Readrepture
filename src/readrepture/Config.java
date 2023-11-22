/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package readrepture;

/**
 *
 * @author USER
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Config {
    private static Connection MySQLConfig;
     
    public static Connection configDB() throws SQLException {
        try {
            String url = "jdbc:mysql://localhost:3306/rdrapture";
            String user = "root";
            String pass = "";
            
            MySQLConfig = DriverManager.getConnection(url, user, pass);
        } catch(SQLException e) {
            System.out.println("Koneksi ke Database Gagal " + e.getMessage());
        }
        
        return MySQLConfig;
    }
}
