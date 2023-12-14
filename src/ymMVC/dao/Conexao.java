/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ymMVC.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author deivithcunha
 */
public class Conexao {
    
    //private static final String URL = "jdbc:mysql://127.0.0.1:3306/faculdade?zeroDateTimeBehavior=convertToNull";
    private static final String URL = "jdbc:mysql://localhost:3306/registros?useTimezone=true&serverTimezone=UTC";
    private static final String USER = "root";
    
    // para quem instalou o XAMPP
    private static final String DRIVER = "com.mysql.jdbc.Driver";
    private static final String SENHA = "";
    
    
    // para quem não instalou o XAMPP 
        //private static final String DRIVER = "com.mysql.jdbc.Driver";
        //private static final String SENHA = "Saitama1@";
    
    public static void executar(String query){
        try {
            Class.forName( DRIVER );
            Connection conn = DriverManager.getConnection(URL,USER,SENHA);
            Statement st = conn.createStatement();
            st.execute( query );
            conn.close();
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.toString());
        }
    }
    
    public static ResultSet consultar(String query){
        try {
            Class.forName( DRIVER );
            Connection conn = DriverManager.getConnection(URL,USER,SENHA);
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery( query );
        //    conn.close();
            return rs;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.toString());
            return null;
        }
    }   
}
