/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controll;
    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import Modeling.Database_Opreations;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import java.lang.NullPointerException;  

/**
 *
 * @author marke
 */
public class Our_Product_Opreations {
    
   
    public boolean addData(String query,String pname , String customerprice , String productprice,boolean checking,boolean check){
         Database_Opreations ss = new  Database_Opreations() ;
                 if(pname.equals(""))
                {
                    JOptionPane.showMessageDialog(null, " Add product name ");
                    return true ;
                }
                else if(customerprice.equals(""))
                {
                    JOptionPane.showMessageDialog(null, " Add an Custmer_Price ");
                    return true ;
                }
                else if(productprice.equals(""))
                {
                    JOptionPane.showMessageDialog(null, " Add an product_price ");
                     return true ;
                }
                else if (ss.check_pname(pname,check))
                {
                    JOptionPane.showMessageDialog(null, " this product is already exist  ");
                     return true ;
                }
                else
               
                {
                    //String query="INSERT INTO `product_sales`( `productname`,`Whole_price`, `price`) VALUES (?,?,?)";
                
                    boolean a= ss.addData(query,pname ,customerprice ,productprice , checking);
                    // boolean a=Database_Opreations.addData(query, pname, customerprice, productprice);
                     return a;
                }
       
    }  
     public boolean deleteData(String query,String pname,boolean checking,boolean check){
         Database_Opreations ss = new  Database_Opreations();
                  if(pname.equals(""))
                {
                    JOptionPane.showMessageDialog(null, " Add product name ");
                       return true ;
                }
              
                else if (!ss.check_pname(pname,check))
                {
                    JOptionPane.showMessageDialog(null, " this product dosent exist  ");
                        return true ;
                }
    
    
                else
                {   
                 //String query="DELETE FROM `product_sales` WHERE `productname` = ?";
                 boolean a= ss.deleteData(query, pname,checking);
                  return a;    
                }   
    }
     
     public boolean editData( String query,String pname , String customerprice , String productprice,boolean checking,boolean check  ){
         Database_Opreations ss = new  Database_Opreations();
            if(pname.equals(""))
                {
                    JOptionPane.showMessageDialog(null, " Add product named ");
                        return true ;
                }
                else if(customerprice.equals(""))
                {
                    JOptionPane.showMessageDialog(null, " Add an Custmer_Price ");
                       return true ;
                }
                else if(productprice.equals(""))
                {
                    JOptionPane.showMessageDialog(null, " Add an product_price ");
                        return true ;
                }
                else if (!ss.check_pname(pname,check))
                {
                    JOptionPane.showMessageDialog(null, " this product dosent exist  ");
                       return true ;
                }
                else{
                       // String query="UPDATE `product_sales` SET `price`='"+customerprice+"',`Whole_price`='"+productprice+"' where `productname` ='"+pname+"'";
                       boolean a=  ss.editData(query,pname ,customerprice ,productprice,checking )  ; 
                         return a;
                }
           
}
 
}
    
    

