/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bookshopautomationssystem;
import java.sql.*;
import javax.swing.*;


/**
 *
 * @author atul
 */
public class MySqlConnect {
    //Connection conn = null;
    public static Connection ConnectDB(){
        try{
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            Connection conn = DriverManager.getConnection("jdbc:derby://localhost:1527/bookdb","root","root");
           // jOptionPane1.showMessageDialog(null,"Connected to database");
            return conn;
        }
        catch(Exception e)
        {
            System.out.println(e);
            //jOptionPane1.showMessageDialog(null,e);
            return null;
        }
    }
    
}
