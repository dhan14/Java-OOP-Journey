/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugasoop;
import java.sql.*;
import javax.swing.JOptionPane;
/**
 *
 * @author Dhan
 */
public class CKoneksi {
    private static Connection Connect;
    public static Connection getKoneksi(){
 
 if(Connect == null){
 
 try {
 
 String url      = "jdbc:mysql://localhost:3306/db_oop";
 
 String username = "root";
 
 String password = "";
 
 DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
 
 Connect = DriverManager.getConnection(url, username, password);
 
 System.out.println("Koneksi Berhasil");
 
 } catch(SQLException e){
 
 System.out.println("Koneksi gagall");
 
 }
 
 }
 
 return Connect;
 
 }
}
