/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 *
 * @author ELCOT
 */
public class ConnectionProvider {
    public static Connection getCon() throws SQLException{
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con= DriverManager.getConnection("jdbc:mysql://localhost:1307/pharmacy?useSSL=false", "root", "ADMIN");
            return con;
        }
        catch(ClassNotFoundException |SQLException e){
            e.printStackTrace();
            return null;
        }
        
    }
}
