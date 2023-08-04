/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controll;


import Modeling.Database_Operation;
import javax.swing.JOptionPane;
import Modeling.Database_Opreations;


/**
 *
 * @author radwa
 */
public class regstration_operation {
    public  Database_Opreations db =new Database_Opreations();
public  Database_Operation dbs =new Database_Opreations();
    public regstration_operation() {
    }
    
    public regstration_operation(Database_Operation ob) {
        dbs=ob;
    }
    
    public  boolean employee_data(String Query,String query,String fname,String lname,String email,String password,String re_email,String re_password,boolean checking)
    {
        boolean result;
                if(fname.equals(""))
                {
                  JOptionPane.showMessageDialog(null, " Add first name ");
                  result= false;
                }
               else if(lname.equals(""))
                {
                  JOptionPane.showMessageDialog(null, " Add last name ");
                  result= false;
                  db.employee_data(query, fname, null, email, password, checking);
                }
              else  if(email.equals(""))
                {
                  JOptionPane.showMessageDialog(null, " Add an email ");
                   result= false;

                }                
                else if (db.check_email(Query,email,checking))
                {
                  JOptionPane.showMessageDialog(null, " Email is already exist  ");
                   result= false;
                }
                else if(password.equals(""))
                {
                   JOptionPane.showMessageDialog(null, " Add a password ");
                   result= false;
                }
                else if (!db.check_pass(password))
                {
                 JOptionPane.showMessageDialog(null, " Enter anthoer pass"); 
                   result= false;
                }
                else if(!email.equals(re_email))
                {
                  JOptionPane.showMessageDialog(null, " email dont matched ");
                   result= false;
                }
                else if(!password.equals(re_password))
                {
                  JOptionPane.showMessageDialog(null, " password dont matched ");
                   result= false;
                }
              
                else
                {   
                 // String query="INSERT INTO `user_data`( `fname`, `lname`, `email`, `password`) VALUES (?,?,?,?)";
                  db.employee_data(query, fname, lname, email, password,checking);
                  result= true;
                }
             return result;
    }
  }