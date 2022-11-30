/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.edu.utp.clase16.config;
import java.lang.System.Logger;
import java.lang.System.Logger.Level;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;




/**
 *
 * @author gedua
 */
public class Conexion {
    private static final String URL = "jdbc:mysql://localhost:3306/bdclase16";
    private static final String USER = "root";
    private static final String PASS = "123456";
    private static final String DRIVER = "com.mysql.cj.jdbc.Driver";
    private static Connection cx = null;
    
    public static Connection getConex(){
        
        try {
            Class.forName(DRIVER);
            if(cx==null){
                cx = DriverManager.getConnection(URL, USER, PASS);
            }
        } catch (SQLException e) {
            System.out.println("Error: "+e);
        } catch (ClassNotFoundException ex) {
            System.out.println("Error: "+ex);
        }
    
    return cx;
    }
}

