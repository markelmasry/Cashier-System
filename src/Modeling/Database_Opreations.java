/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modeling;


import controll.Our_Product_Opreations;
import controll.Tables_Opreations;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import login.regstration;


   
/**
 *
 * @author marke
 */
public class Database_Opreations implements Database_Operation {
     
    static Connection con;
    static PreparedStatement ps;   
    static ResultSet rs;
    
    
    public static ResultSet getData(String Query , String pcode,boolean checking){
     try {
         if (checking== false)
                 throw new SQLException();
         
        ps=MyConnection.connecct().prepareStatement(Query);
        ps.setString(1, pcode);
        rs=ps.executeQuery();
        return rs;
         
     } catch(SQLException ex)
            {
             System.out.println(ex.getMessage());
            
            }
        return null;
    }
    
     public static ResultSet get_email_and_password (String Query , String email,String password,boolean checking) {
        try { 
             if (checking== false)
                 throw new SQLException();
            ps=MyConnection.connecct().prepareStatement(Query);
            
            ps.setString(1, email);
            ps.setString(2, password);
            
            rs=ps.executeQuery();
            return rs;
        } 
         catch(SQLException ex)
            {
             System.out.println(ex.getMessage());
            
            }
        return null; 
        }
 public  boolean employee_data (String Query,String fname,String lname , String email,String password,boolean checking) {
        boolean flag=false;
        try
                  {  
                      if (checking==false)
                          throw new SQLException();
                      
                      ps =  MyConnection.connecct().prepareStatement(Query);
                      ps.setString(1, fname);
                      
                    /* 
                      if(lname!=null)
                      {
                           ps.setString(2, lname);
                           flag= true;
                      }
                      else
                      {
                           ps.setNull(2, 0);
                           flag= false;
                      }
                      ps.setString(3, email);
                      ps.setString(4, password);
                     */
                    
                           JOptionPane.showMessageDialog(null, "New user Added");
                           
                           flag= true;
                      
                      
                    } 
                     catch(SQLException ex)
                    {
                     System.out.println(ex.getMessage());
                     flag= false;
                    }
                    
      return flag;
    }
public static boolean  check_email(String query,String email,boolean checking)
{
        boolean checkuser=false;
        //String query="SELECT * FROM `user_data` WHERE `email` =?";
        
        try 
        {
            if(checking==false)
                   throw new SQLException();
            
            ps=MyConnection.connecct().prepareStatement(query);
            ps.setString(1, email);
               rs=ps.executeQuery();
               
            if(rs.next())
            {
                checkuser=true;
            }
        } 
        catch(SQLException ex)
                    {
                     System.out.println(ex.getMessage());
                    
                    }
        return checkuser;
}
public static boolean  check_pass(String password) {

    Pattern specailCharPatten = Pattern.compile("[^a-z0-9 ]", Pattern.CASE_INSENSITIVE);
    Pattern UpperCasePatten = Pattern.compile("[A-Z ]");
    Pattern lowerCasePatten = Pattern.compile("[a-z ]");
    Pattern digitCasePatten = Pattern.compile("[0-9 ]");
 

    boolean flag=true;

    if (password.length() < 8) {
        JOptionPane.showMessageDialog(null,"Password lenght must have alleast 8 character !!");
        flag=false;
    }
    else if (!specailCharPatten.matcher(password).find()) {
         JOptionPane.showMessageDialog(null,"Password must have atleast one specail character !!");
        flag=false;
    }
    else if (!UpperCasePatten.matcher(password).find()) {
         JOptionPane.showMessageDialog(null,"Password must have atleast one uppercase character !!");
        flag=false;
    }
    else if (!lowerCasePatten.matcher(password).find()) {
         JOptionPane.showMessageDialog(null,"Password must have atleast one lowercase character !!");
        flag=false;
    }
    else if (!digitCasePatten.matcher(password).find()) {
         JOptionPane.showMessageDialog(null,"Password must have atleast one digit character !!");
        flag=false;
    }

    return flag;

}
    public static ResultSet Search_emp(String query,String id,boolean checking){
        try {
             if (checking== false)
                 throw new SQLException();
                ps=MyConnection.connecct().prepareStatement(query);

                ps.setString(1, id);
                rs=ps.executeQuery();

             return rs;
            } 
           catch(SQLException ex)
            {
             System.out.println(ex.getMessage());
             
            }
        return null;
    }
    public static ResultSet check_manager_password(String query,String email,String password,boolean checking){
        PreparedStatement ps;
        ResultSet rs;
        
        try {
            if (checking== false)
                 throw new SQLException();
            ps=MyConnection.connecct().prepareStatement(query);
             ps.setString(1, email);
            ps.setString(2, password);
            
            
            rs=ps.executeQuery();
                
        return rs;
          
        } catch(SQLException ex)
            {
             System.out.println(ex.getMessage());
             
            }
        return null;
            
    }
     
     public  boolean addData(String Query, String pname , String customerprice , String productprice ,boolean checking){
       try
                  {       if (checking== false)
                              throw new SQLException(); 
                      ps = MyConnection.connecct().prepareStatement(Query);
                      ps.setString(1, pname);
                      ps.setString(2, productprice);
                      ps.setString(3, customerprice);
                      
                      ps.executeUpdate();
                      
                        //  Tables_Opreations.Update_Product_table(jTable1);
                          JOptionPane.showMessageDialog(null, "New Product Added");
                             return true;
                      
                    } 
                     catch(SQLException ex)
            {
             System.out.println(ex.getMessage());
             return false;
            }
         
    }
    
     public  boolean deleteData(String Query, String pname ,boolean checking ){
           try
                  {       if(checking==false) 
                            throw new SQLException();
                      ps = MyConnection.connecct().prepareStatement(Query);
                      ps.setString(1, pname);
                      ps.executeUpdate();
                  //    Tables_Opreations.Update_Product_table(jTable1);
                      JOptionPane.showMessageDialog(null, " Product Deleted");
                      return true;   
                  } 
                  catch (SQLException ex)
                    {
                        System.out.println(ex.getMessage());
                        return false;
                    }
     } 
     
    public  boolean editData(String Query, String pname , String customerprice , String productprice ,boolean checking ){
                
     try{
             if(checking==false) 
                    throw new SQLException();

        String query="UPDATE `product_sales` SET `price`='"+customerprice+"',`Whole_price`='"+productprice+"' where `productname` ='"+pname+"'";
        ps =  MyConnection.connecct().prepareStatement(query);
        ps.execute();
        //Tables_Opreations.Update_Product_table(jTable1);
        JOptionPane.showMessageDialog(null, " Product Updated");
           return true;
        }
      catch (SQLException ex)
                    {
                        System.out.println(ex.getMessage());
                        return false;
                    }
     
                
    }
    
      public  boolean check_pname(String pname,boolean checking){
         
        boolean checkuser=false;
         String query="SELECT * FROM `product_sales` WHERE `productname` =?";
        
        try 
        {       if (checking== false)
                 throw new SQLException();
            ps=MyConnection.connecct().prepareStatement(query);
            ps.setString(1, pname);
               rs=ps.executeQuery();
            if(rs.next())
            {
                checkuser=true;
            }
        } 
       catch(SQLException ex)
            {
             System.out.println(ex.getMessage());
             
            }
        return checkuser;
     
     }
     public static  ResultSet show_table () throws SQLException
    {
         
                String query="select * from product_sales";
          
                ps=MyConnection.connecct().prepareStatement(query);
            
                  rs=ps.executeQuery();
                  return rs;
     
    }
     public static ResultSet show_empolyee_table() throws SQLException{
         
        String query="select * from user_data";
        ps=Modeling.MyConnection.connecct().prepareStatement(query);
        rs=ps.executeQuery();
         return rs;
     }
     public static boolean edit_empolyee(String Query,boolean checking ){
        try {
             if (checking== false)
                 throw new SQLException();
            ps =  Modeling.MyConnection.connecct().prepareStatement(Query);
            ps.execute();
            JOptionPane.showMessageDialog(null, " employee Updated");
            return true;
        } catch(SQLException ex)
            {
             System.out.println(ex.getMessage());
             return false;
            }
        }
               
      
        public static boolean Delete_Empolyee(String Query,String email,boolean checking ){
                
        try
            {if(checking==false) 
                    throw new SQLException();
                ps =  Modeling.MyConnection.connecct().prepareStatement(Query);
                ps.setString(1, email);
                ps.executeUpdate();
                //Tables_Opreations.Update_Empolyee_table(jTable1);
                JOptionPane.showMessageDialog(null, " employee Deleted");
                return true;
              
            }
            catch (SQLException ex)
            {
                System.out.println(ex.getMessage());
               return false;


            }
               
      }
    
    
}
