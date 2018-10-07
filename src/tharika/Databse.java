/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tharika;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author Thari
 */
public class Databse {

    private static Connection con;
    
    public Databse(){
          
           con = null;
    }
    
    public static Connection getConnection(){
        try{
           
            con = (Connection) DriverManager.getConnection("jdbc:derby://localhost:1527/MyDataBase","thari","2018");
            System.out.println("Connected");
            return con;
            
        }
        catch(SQLException e){
            e.printStackTrace();
            
        }
        return null;
    }
    
      
    public static void main(String[] args) {
        
        /*Connection con = null;
        Statement st = null;
    
        try {
            con = (Connection) DriverManager.getConnection("jdbc:derby://localhost:1527/MyDataBase","THARI","2018");
            st = (Statement) con.createStatement();
        } catch (SQLException e) {
            e.printStackTrace();
        }*/
        getConnection();
        
   
        
    }
    
}


