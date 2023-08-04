/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controll;

import Modeling.Database_Opreations;
import Modeling.Order_Model;
import java.util.ArrayList;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author marke
 */
public class Order_Opreations {
    public static Order_Model get_order_data(String pcode,boolean checking){
        
        Database_Opreations db =new Database_Opreations();
        
        if (pcode=="")
        { JOptionPane.showMessageDialog(null, "Please add product code  ");  
          return new Order_Model(null,null,null,"",null);
        }
        else{   
           
          String query="select * from product_sales where id =?";         
          ResultSet rs =db.getData(query,pcode,true);
       
         try{
             if (checking== false)
                 throw new SQLException();
                        
                  
                  if(rs.next()==false)
                  {
                       JOptionPane.showMessageDialog(null, "Product Code Not Found  ");
                       return new Order_Model(null,null,null,"",null);
                  }
                  else
                  {
                      return new Order_Model(rs.getString("productname"),pcode,null,rs.getString("price"),null);
                  }
                 
         }
         catch(SQLException ex)
            {
             System.out.println(ex.getMessage());
             return new Order_Model(null,null,null,null,null);
            }
         }     
}

}