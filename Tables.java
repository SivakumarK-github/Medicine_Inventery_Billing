/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.Statement;
/**
 *
 * @author ELCOT
 */
public class Tables {
    public static void main(String[] args){
        try{
            Connection con= ConnectionProvider.getCon();
            Statement st= con.createStatement();
            /*st.executeUpdate("CREATE TABLE appuser (" +
        "appuser_pk INT AUTO_INCREMENT PRIMARY KEY, " +
        "userRole VARCHAR(200), " +
        "name VARCHAR(200), " +
        "dob VARCHAR(50), " +
        "mobileNumber VARCHAR(50), " + // Corrected from varchr to VARCHAR
        "email VARCHAR(200), " +
        "username VARCHAR(200), " +
        "password VARCHAR(50), " +
        "address VARCHAR(200))");
            st.executeUpdate("insert into appuser(userRole,name,dob,mobileNumber,email,username,password,address)values ('ADMIN', 'ADMIN','13-02-2001','1234567890','benstokes@gmail.com','admin','ADMIN','INDIA')");
    */
            //st.executeUpdate("create table medicine(medicine_pk int AUTO_INCREMENT primary key, uniqueId varchar(200), name varchar(200), companyName varchar(200), quantity bigint, price bigint)");
            st.executeUpdate("create table bill(bill_pk int AUTO_INCREMENT primary key, billId varchar(200),billDate varchar(50),totalPaid bigint, generatedBy varchar(50))");
            
            JOptionPane.showMessageDialog(null,"Table Created Succesfully");
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
            
        }
    }
}
