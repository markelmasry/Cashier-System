/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controll;

import Modeling.Database_Opreations;
import Modeling.Employee_Model;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import login.Manger_pass;
import login.welcome_manger;
import java.sql.SQLException;

/**
 *
 * @author radwa
 */
public class managerPassword_operation {
    public static boolean mangerPassword(String query,String email,String password,boolean checking){
      //  String query="SELECT * FROM `user_data` WHERE `email` =? AND `password` =?";
        ResultSet rs= Database_Opreations.check_manager_password(query, email, password,true);
        try {
            if (checking== false)
                 throw new SQLException();
            if(rs.next())
            {
                Manger_pass mp =new Manger_pass();
                mp.dispose();
                welcome_manger rg=new welcome_manger();
                rg.setVisible(true);
                rg.pack();
                rg.setLocationRelativeTo(null);
                rg.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
                
                return true;
                
            }
            else {
                JOptionPane.showMessageDialog(null, "incorrect password  ");
                return false;
            }
        }catch(SQLException ex)
            {
             System.out.println(ex.getMessage());
              return false;
             
            }        
        
    }
    
}
