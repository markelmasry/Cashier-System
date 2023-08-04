/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controll;

import Modeling.Database_Opreations;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author marke
 */
public class Tables_Opreations {
     
    static ResultSet rs;
    
        public static  void Show_Product_table(JTable jTable1) throws SQLException{
         
         rs= Database_Opreations.show_table();
        
        while(rs.next())            
                  {
                      String id =String.valueOf(rs.getInt("id"));
                      String pname =rs.getString("productname");
                      String Whole_price=rs.getString("Whole_price");
                      String price =rs.getString("price");
                      
                      
                      String data []={id,pname,Whole_price,price};
                         DefaultTableModel model = new DefaultTableModel();
                         model = (DefaultTableModel)jTable1.getModel();
                         model.addRow(data);
                         
                  }
     }
        public static  void Show_Empolyee_table(JTable jTable1) throws SQLException{

               
               rs=Database_Opreations.show_empolyee_table();
               
                  while(rs.next())            
                  {
                    
                    String id =String.valueOf(rs.getInt("id"));
                    String fname =rs.getString("fname");
                    String lname=rs.getString("lname");
                    String email =rs.getString("email");
                    
                      
                      
                      String data []={id,fname,lname,email};
                         DefaultTableModel model = new DefaultTableModel();
                         model = (DefaultTableModel)jTable1.getModel();
                         model.addRow(data);
                         
                  }
    
        
        }
        
     public static void Update_Product_table(JTable jTable1) throws SQLException
     {
        DefaultTableModel model = new DefaultTableModel(); 
        model = (DefaultTableModel)jTable1.getModel();
        model.setRowCount(0);
        Show_Product_table(jTable1);
     
    }
     public static void Update_Empolyee_table(JTable jTable1) throws SQLException
     {
        DefaultTableModel model = new DefaultTableModel(); 
        model = (DefaultTableModel)jTable1.getModel();
        model.setRowCount(0);
         Show_Empolyee_table(jTable1);
     
    }
     
    
}
