/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controll;


import controll.Tables_Opreations;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import Modeling.Database_Opreations;
import Modeling.Employee_Model;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTable;


/**
 *
 * @author radwa
 */
public class Search_emp_operation {
   
   public static Employee_Model search_result(String id, boolean checking){
        
        ResultSet rs;
        
        if(id.equals(""))
        {
            JOptionPane.showMessageDialog(null, " Add Employee code ");
        }

        else
        {
            String query="select * from user_data  WHERE `id` =? ";
            rs=Database_Opreations.Search_emp(query, id,true);
            
            try {
                   if (checking== false)
                         throw new SQLException();
                  if(rs.next())
                {
                    String id_ =String.valueOf(rs.getInt("id"));
                    String fname =rs.getString("fname");
                    String lname=rs.getString("lname");
                    String email =rs.getString("email");
                    
                    return new Employee_Model (id_,fname,lname,email,null);

                }
                else {
                    JOptionPane.showMessageDialog(null, "this employee dosent  exist   ");
                }
            } catch(SQLException ex)
            {
              System.out.println(ex.getMessage());
            
            }
        }
        return new Employee_Model (null,null,null,null,null); 
        
    }
     
}
