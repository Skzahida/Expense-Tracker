/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package db;

import java.sql.*;
import javax.swing.JOptionPane;
/**
 *
 * @author HP
 */
public class dbconnect {
    public static Connection c;
    public static Statement st;
    static{
    try{
        
        c = DriverManager.getConnection("jdbc:mysql://localhost/expensedb?allowPublicKeyRetrieval=true&useSSL=false","root","Sadaf@786");
        
         st = c.createStatement();
         
    }catch(Exception e){
            
         JOptionPane.showMessageDialog(null, e);
        }
   
    }
    

    
    
    
}
