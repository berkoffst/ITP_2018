package isara;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;

/**
 *
 * @author isara
 */
public class connection {
   //connection jdbc     
    private static String USERNAME = "root";
    private static String PASSWORD = "root";
    private static String URL = "jdbc:derby://localhost:1527/income";
    private static String driverName = "org.apache.derby.jdbc.ClientDriver";    
   private static Connection conn = null;
    
    
   

    public static Connection connect(){
    //conection fail or success
        
      
      try{
          //connection success
          Class.forName(driverName);
          Connection conn = DriverManager.getConnection(URL,USERNAME,PASSWORD);
          System.out.println("success");
          
          //statement success
          Statement stmt = (Statement) conn.createStatement();
          
          String empId = "10003";
          String empname = "Dasun";
          double amount = 35000.00;
          String date = "2018-11-11"; 
          
         
          //insert queries to data base
          String insert = "INSERT INTO `emppay` (`uid`, `username`, `password`) VALUES ("+empId+",'"+empname+"','"+amount+"','"+date+"')";
          stmt.executeUpdate(insert);
          System.out.println("success sql");
 
      }
      catch(Exception e){
           System.out.println(e);
      }
        return conn;
    }


}
