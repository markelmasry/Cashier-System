/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controll;
import Modeling.Database_Opreations;
import Modeling.Product_Model;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
/**
 *
 * @author Aya Raafat
 */
public class SreachFrame_Opreations {
    
   
    public static  Product_Model get_product_data(String id,boolean checking){
        Database_Opreations db =new Database_Opreations();
      
                if(id.equals(""))
                {
                    JOptionPane.showMessageDialog(null, " Add product code ");
                    return new Product_Model (" ",null,null,null);
                }
                   
    
                else
                {

                 String query="select * from product_sales  WHERE `id` =? ";
            try {
                 if (checking== false)
                 throw new SQLException();
                 
               ResultSet rs = db.getData(query,id,true);
                
                if(rs.next())
                    {
                        String id_ =String.valueOf(rs.getInt("id"));
                      String pname =rs.getString("productname");
                      String Whole_price=rs.getString("Whole_price");
                      String price =rs.getString("price");
                      return new Product_Model (id_,pname,Whole_price,price);
                     
                    }
                    else {
                     JOptionPane.showMessageDialog(null, "this product dosent  exist   ");
                     return new Product_Model (" ",null,null,null);
                    }
            } 
            catch (SQLException ex) {
                System.out.println(ex.getMessage());
                 return new Product_Model (null,null,null,null);
        }
    
}
    
    }
}
        
