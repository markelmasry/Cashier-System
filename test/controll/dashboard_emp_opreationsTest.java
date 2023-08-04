/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controll;

import Modeling.Database_Opreations;
import javax.swing.JTable;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author marke
 */
public class dashboard_emp_opreationsTest {
    
    public dashboard_emp_opreationsTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
      @AfterClass
    public static void tearDownClass() {
         
        System.out.println("test case 17");
        String fname = "akram";
        String lname = "salah";
        String email = "akram.salah@gmail.com";
        String password = "Asdfg123$";
        String re_email = "akram.salah@gmail.com";
        String re_password = "Asdfg123$";
         boolean checking=true;
       String Query="SELECT * FROM `user_data` WHERE `email` =?";
        String query="INSERT INTO `user_data`( `fname`, `lname`, `email`, `password`) VALUES (?,?,?,?)";
        
        regstration_operation instance = new regstration_operation();
        boolean expResult = true;
        boolean result = instance.employee_data(Query,query,fname, lname, email, password, re_email, re_password,checking);
        assertEquals(expResult, result);
        

  
    }
    @AfterClass
    public static void tearDownClass2() {

        Database_Opreations g =new Database_Opreations();
        String fname = "s";
        String lname = "s";
        String email = "g";
        boolean checking=true;
        String query="UPDATE `user_data` SET `fname`='"+fname+"',`lname`='"+lname+"' where `email` ='"+email+"'";
         g.edit_empolyee(query, checking);
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

  
    /**
     * Test of Edit_Empolyee method, of class Search_emp_operation.
     */
    @Test
    public void testEdit_Empolyee() {
        System.out.println("Edit_Empolyee");
        dashboard_emp_opreations dash =new dashboard_emp_opreations();
       boolean checking = true;
        String Query = "";
        String query = "";
        String email = "";
        String fname = "";
        String lname = "";
        String expResult = " Add email name ";
        String result = dashboard_emp_opreations.Edit_Empolyee(Query, query, email, fname, lname,checking);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
     @Test
    public void testEdit_Empolyee2() {
        System.out.println("Edit_Empolyee");
         boolean checking = true;
        String Query = "";
        String query = "";
        String email = "sdasd";
        String fname = "";
        String lname = "";
        String expResult = " Add an firstname ";
        String result = dashboard_emp_opreations.Edit_Empolyee(Query, query, email, fname, lname, checking);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    @Test
    public void testEdit_Empolyee3() {
        System.out.println("Edit_Empolyee");
         boolean checking = true;
        String Query = "";
        String query = "";
        String email = "g";
        String fname = "s";
        String lname = "";
        String expResult = " Add an lastname ";
        String result = dashboard_emp_opreations.Edit_Empolyee(Query, query, email, fname, lname, checking);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

     @Test
    public void testEdit_Empolyee4() {
        System.out.println("Edit_Empolyee");
         boolean checking = false;
        String Query = "";
        String query = "";
        String email = "sdasd";
        String fname = "kjjlnm";
        String lname = "hjgjh";
        String expResult = " this email dosent exist  ";
        String result = dashboard_emp_opreations.Edit_Empolyee(Query, query, email, fname, lname, checking);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    @Test
    public void testEdit_Empolyee5() {
        System.out.println("Edit_Empolyee");
        String query="SELECT * FROM `user_data` WHERE `email` =?";
        String fname = "s";
        String lname = "s";
        String email = "g";
        String Query="UPDATE `user_data` SET `fname`='"+fname+"',`lname`='"+lname+"' where `email` ='"+email+"'";
         boolean checking = true;
        String expResult = " Update ";
        String result = dashboard_emp_opreations.Edit_Empolyee(Query, query, email, fname, lname, checking);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    /**
     * Test of Delete_Empolyee method, of class Search_emp_operation.
     */
    @Test
    public void testDelete_Empolyee() {
        System.out.println("Delete_Empolyee");
        boolean checking = true;
        String query = "";
        String email = "";
        String expResult = " Add email  ";
        String result = dashboard_emp_opreations.Delete_Empolyee(query, email,checking);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    @Test
    public void testDelete_Empolyee2() {
        System.out.println("Delete_Empolyee");
        boolean checking = false;
        String query = "";
        String email = "sdasd";
        String expResult = " Email  dosent  exist  ";
        String result = dashboard_emp_opreations.Delete_Empolyee(query, email,checking);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
     @Test
    public void testDelete_Empolyee3() {
        System.out.println("Delete_Empolyee");
        String query="SELECT * FROM `user_data` WHERE `email` =?";
        boolean checking = true;
        String email = "akram.salah@gmail.com";  
        String expResult = " Deleted ";
        String result = dashboard_emp_opreations.Delete_Empolyee(query, email,checking);
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
     @Test
    public void testDelete_Empolyee4() {
        System.out.println("Delete_Empolyee");
        String query="SELECT * FROM `user_data` WHERE `email` =?";
        boolean checking = false;
        String email = "akram.salah@gmail.com";  
        boolean expResult = false;
        boolean result = Database_Opreations.Delete_Empolyee(query, email,checking);
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
       @Test
    public void testEdit_Empolyee6() {
        System.out.println("Edit_Empolyee");
        String query="SELECT * FROM `user_data` WHERE `email` =?";
        String fname = "s";
        String lname = "s";
        String email = "g";
        String Query="UPDATE `user_data` SET `fname`='"+fname+"',`lname`='"+lname+"' where `email` ='"+email+"'";
         boolean checking = false;
       boolean expResult = false;
       boolean result = Database_Opreations.edit_empolyee(Query,checking);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
  
}
