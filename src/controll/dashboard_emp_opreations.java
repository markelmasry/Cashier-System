/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controll;

import Modeling.Database_Opreations;
import javax.swing.JOptionPane;
import javax.swing.JTable;

/**
 *
 * @author marke
 */
public class dashboard_emp_opreations {
    
     public static String Edit_Empolyee(String Query,String query,String email,String fname,String lname ,boolean checking){
         
      if(email.equals(""))
        {
            JOptionPane.showMessageDialog(null, " Add email name ");
            return " Add email name ";
        }
        else if(fname.equals(""))
        {
            JOptionPane.showMessageDialog(null, " Add an firstname ");
            return " Add an firstname ";

        }
        else if(lname.equals(""))
        {
            JOptionPane.showMessageDialog(null, " Add an lastname ");
            return " Add an lastname ";
        }
        else if (!Database_Opreations.check_email(query,email,checking))
        {
            JOptionPane.showMessageDialog(null, " this email dosent exist  ");
            return " this email dosent exist  ";
        }
        else{
            
                //String Query="UPDATE `user_data` SET `fname`='"+fname+"',`lname`='"+lname+"' where `email` ='"+email+"'";
                Database_Opreations.edit_empolyee(Query,checking);
                return " Update ";
            }
     
    }
     public static String Delete_Empolyee(String query,String email,boolean checking){
         
      if(email.equals(""))
        {
            JOptionPane.showMessageDialog(null, " Add email  ");
            return " Add email  ";

        }

        else if (!Database_Opreations.check_email(query,email,checking))
                {
                    JOptionPane.showMessageDialog(null, " Email  dosent  exist  ");
                    return " Email  dosent  exist  ";

                }

        else
        {

            String Query="DELETE FROM `user_data` WHERE `email` = ?";
             Database_Opreations.Delete_Empolyee(Query, email, checking);
          
             return " Deleted ";
            
        }
    
}
}