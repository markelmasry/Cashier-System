/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package login;


import java.sql.*;
import javax.swing.JFrame;

/**
 *
 * @author marke
 */
public class Login {



    public static void main(String[] args) {
         
         
         String query;
        Modeling.MyConnection c1 =new Modeling.MyConnection();
        Connection c =c1.connecct();
        
      login_frame login = new login_frame();
      login.setVisible(true);
      login.pack();
      login.setLocationRelativeTo(null);
      login.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     
           
        try{
            c.close();
        }catch (SQLException e) {
        System.out.println(e);
    }
    }
    
}
