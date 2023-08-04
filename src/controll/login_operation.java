/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controll;


import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import login.login_frame;
import login.welcome_frame;
import Modeling.Database_Opreations;

/**
 *
 * @author radwa
 */
public class login_operation {
  public static String get_email_and_password_data(String email,String password,boolean checking)
    {
          if (email.equals(""))
        { 
            JOptionPane.showMessageDialog(null, "Please enter email  "); 
             return "Please enter email";
          
        }
           if (password.equals(""))
        {
            JOptionPane.showMessageDialog(null, "Please enter pass  ");  
         return "Please enter pass";
          
        }
        else{   
           
           
                String query="SELECT * FROM `user_data` WHERE `email` =? AND `password` =?";
                ResultSet rs= Database_Opreations.get_email_and_password(query, email, password,true);

                try {
                        if (checking== false)
                           throw new SQLException();
                        
                       if(rs.next())
                       {
                           welcome_frame hf=new welcome_frame();
                           hf.setVisible(true);
                           hf.pack();
                           hf.setLocationRelativeTo(null);
                           hf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                           hf.jLabel3.setText("Hello :  "+email+" ");
                            return "welcome";
                       }
                       else {
                        JOptionPane.showMessageDialog(null, "incorrect User name or password  ");
                        return "incorrect User name or password";
                         }
               
                } catch(SQLException ex)
                    {
                     System.out.println(ex.getMessage());
                     return null;
                    }
          }    
    }
    
}

    

