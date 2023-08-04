/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controll;

import controll.regstration_operation;
import Modeling.Database_Opreations;
import Modeling.Database_Operation;
//import control.regstration_operation;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import java.sql.SQLException;
import static org.junit.Assert.*;
import org.mockito.Mockito;
import static org.mockito.Mockito.*;
/**
 *
 * @author radwa
 */
public class regstration_operationTest {
   
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() throws SQLException {
       
        
     
        String query="DELETE FROM `user_data` WHERE `email` = ?";
        //Search_emp_operation.Delete_Empolyee("radwaehab1@gmail.com", jTable1);
        Database_Opreations.Delete_Empolyee(query,"radwaehab1@gmail.com",true);
    }
    @AfterClass
    public static void tearDownClass2() throws SQLException {
       
        
     
        String query="DELETE FROM `user_data` WHERE `emai` = ?";
        //Search_emp_operation.Delete_Empolyee("radwaehab1@gmail.com", jTable1);
        Database_Opreations.Delete_Empolyee(query,"radwaehab1@gmail.com",true);
    }
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of employee_data method, of class regastration_operation.
     */
    
   
    @Test
    public void testEmployee_data() {
        System.out.println("test case 1");
        String fname = "";
        String lname = "";
        String email = "";
        String password = "";
        String re_email = "";
        String re_password = "";
        boolean checking=true;
       String Query="SELECT * FROM `user_data` WHERE `email` =?";
        String query="INSERT INTO `user_data`( `fname`, `lname`, `email`, `password`) VALUES (?,?,?,?)";
        Database_Operation es=Mockito.mock(Database_Operation.class);
        Database_Opreations db=new Database_Opreations();
      //  Database_Opreation empmock =  Mockito.mock (Database_Opreation.class);
            Mockito.when(es.employee_data(query, fname, lname, email, password,checking)).thenReturn(false);
        regstration_operation reg =new regstration_operation(es);
        //regstration_operation instance = new regstration_operation();
        
        boolean expResult = false;
        boolean result = reg.employee_data(Query,query,fname, lname, email, password, re_email, re_password,checking);
      
        System.out.println(result);
        assertEquals(expResult, result);
     
    }
    @Test
        public void testEmployee_data1() {
        System.out.println("test case 1");
        String fname = "";
        String lname = "";
        String email = "";
        String password = "";
        String re_email = "";
        String re_password = "";
         boolean checking=true;
       String Query="SELECT * FROM `user_data` WHERE `email` =?";
        String query="INSERT INTO `user_data`( `fname`, `lname`, `email`, `password`) VALUES (?,?,?,?)";
        regstration_operation instance = new regstration_operation();
        boolean expResult = false;
        boolean result = instance.employee_data(Query,query,fname, lname, email, password, re_email, re_password,checking);
        assertEquals(expResult, result);}
     @Test
        public void testEmployee_data2() {
        System.out.println("test case 3");
        String fname = "radwa";
        String lname = "";
        String email = "";
        String password = "";
        String re_email = "";
        String re_password = "";
         boolean checking=true;
       String Query="SELECT * FROM `user_data` WHERE `email` =?";
        String query="INSERT INTO `user_data`( `fname`, `lname`, `email`, `password`) VALUES (?,?,?,?)";
        regstration_operation instance = new regstration_operation();
        boolean expResult = false;
        boolean result = instance.employee_data(Query,query,fname, lname, email, password, re_email, re_password,checking);
        assertEquals(expResult, result);
      
    }
        
   @Test
        public void testEmployee_data3() {
        System.out.println("test case 3");
        String fname = "radwa";
        String lname = "ehab";
        String email = "";
        String password = "";
        String re_email = "";
        String re_password = "";
         boolean checking=true;
       String Query="SELECT * FROM `user_data` WHERE `email` =?";
        String query="INSERT INTO `user_data`( `fname`, `lname`, `email`, `password`) VALUES (?,?,?,?)";
        regstration_operation instance = new regstration_operation();
        boolean expResult = false;
        boolean result = instance.employee_data(Query,query,fname, lname, email, password, re_email, re_password,checking);
        assertEquals(expResult, result);
      
    }
    @Test
        public void testEmployee_data4() {
        System.out.println("test case 4");
        String fname = "radwa";
        String lname = "ehab";
        String email = "radwaehab@gmail.com";
        String password = "";
        String re_email = "";
        String re_password = "";
         boolean checking=true;
       String Query="SELECT * FROM `user_data` WHERE `email` =?";
        String query="INSERT INTO `user_data`( `fname`, `lname`, `email`, `password`) VALUES (?,?,?,?)";
        regstration_operation instance = new regstration_operation();
        boolean expResult = false;
        boolean result = instance.employee_data(Query,query,fname, lname, email, password, re_email, re_password,checking);
        assertEquals(expResult, result);
        
    }
        @Test
        public void testEmployee_data5() {
        System.out.println("test case 5");
        String fname = "radwa";
        String lname = "ehab";
        String email = "radwaehab1@gmail.com";
        String password = "";
        String re_email = "";
        String re_password = "";
         boolean checking=true;
       String Query="SELECT * FROM `user_data` WHERE `email` =?";
        String query="INSERT INTO `user_data`( `fname`, `lname`, `email`, `password`) VALUES (?,?,?,?)";
        regstration_operation instance = new regstration_operation();
        boolean expResult = false;
        boolean result = instance.employee_data(Query,query,fname, lname, email, password, re_email, re_password,checking);
        assertEquals(expResult, result);
        
    }
        @Test
        public void testEmployee_data6() {
        System.out.println("test case 19");
        String fname = "radwa";
        String lname = "ehab";
        String email = "radwaehab1@gmail.com";
        String password = "Radwa123@";
        String re_email = "";
        String re_password = "";
         boolean checking=true;
       String Query="SELECT * FROM `user_data` WHERE `email` =?";
        String query="INSERT INTO `user_data`( `fname`, `lname`, `email`, `password`) VALUES (?,?,?,?)";
        
        regstration_operation instance = new regstration_operation();
        boolean expResult = false;
        boolean result = instance.employee_data(Query,query,fname, lname, email, password, re_email, re_password,checking);
        assertEquals(expResult, result);
        
    }
         @Test
        public void testEmployee_data7() {
        System.out.println("test case 12");
        String fname = "radwa";
        String lname = "ehab";
        String email = "radwa1@gmail.com";
        String password = "radwa";
        String re_email = "";
        String re_password = "";
         boolean checking=true;
       String Query="SELECT * FROM `user_data` WHERE `email` =?";
        String query="INSERT INTO `user_data`( `fname`, `lname`, `email`, `password`) VALUES (?,?,?,?)";
        regstration_operation instance = new regstration_operation();
        boolean expResult = false;
        boolean result = instance.employee_data(Query,query,fname, lname, email, password, re_email, re_password,checking);
        assertEquals(expResult, result);
        
    }
        @Test
        public void testEmployee_data8() {
        System.out.println("test case 16");
        String fname = "radwa";
        String lname = "ehab";
        String email = "radwaehab1@gmail.com";
        String password = "Radwa123";
        String re_email = "";
        String re_password = "";
         boolean checking=true;
       String Query="SELECT * FROM `user_data` WHERE `email` =?";
        String query="INSERT INTO `user_data`( `fname`, `lname`, `email`, `password`) VALUES (?,?,?,?)";
        
        regstration_operation instance = new regstration_operation();
        boolean expResult = false;
        boolean result = instance.employee_data(Query,query,fname, lname, email, password, re_email, re_password,checking);
        assertEquals(expResult, result);
        
    }
        @Test
        public void testEmployee_data9() {
        System.out.println("test case 17");
        String fname = "radwa";
        String lname = "ehab";
        String email = "radwaehab1@gmail.com";
        String password = "radwa123@";
        String re_email = "";
        String re_password = "";
         boolean checking=true;
       String Query="SELECT * FROM `user_data` WHERE `email` =?";
        String query="INSERT INTO `user_data`( `fname`, `lname`, `email`, `password`) VALUES (?,?,?,?)";
        
        regstration_operation instance = new regstration_operation();
        boolean expResult = false;
        boolean result = instance.employee_data(Query,query,fname, lname, email, password, re_email, re_password,checking);
        assertEquals(expResult, result);
        
    }
        @Test
        public void testEmployee_data10() {
        System.out.println("test case 18");
        String fname = "radwa";
        String lname = "ehab";
        String email = "radwaehab1@gmail.com";
        String password = "Radwaradwa@";
        String re_email = "";
        String re_password = "";
         boolean checking=true;
       String Query="SELECT * FROM `user_data` WHERE `email` =?";
        String query="INSERT INTO `user_data`( `fname`, `lname`, `email`, `password`) VALUES (?,?,?,?)";
        
        regstration_operation instance = new regstration_operation();
        boolean expResult = false;
        boolean result = instance.employee_data(Query,query,fname, lname, email, password, re_email, re_password,checking);
        assertEquals(expResult, result);
        
    }
        @Test
        public void testEmployee_data11() {
        System.out.println("test case 19");
        String fname = "radwa";
        String lname = "ehab";
        String email = "radwaehab1@gmail.com";
        String password = "RADWA123@";
        String re_email = "";
        String re_password = "";
         boolean checking=true;
       String Query="SELECT * FROM `user_data` WHERE `email` =?";
        String query="INSERT INTO `user_data`( `fname`, `lname`, `email`, `password`) VALUES (?,?,?,?)";
        
        regstration_operation instance = new regstration_operation();
        boolean expResult = false;
        boolean result = instance.employee_data(Query,query,fname, lname, email, password, re_email, re_password,checking);
        assertEquals(expResult, result);
        
    }
         @Test
        public void testEmployee_data12() {
        System.out.println("test case 6");
        String fname = "radwa";
        String lname = "ehab";
        String email = "radwaehab1@gmail.com";
        String password = "Radwa123@";
        String re_email = "radwaehab123@gmail.com";
        String re_password = "";
         boolean checking=true;
       String Query="SELECT * FROM `user_data` WHERE `email` =?";
        String query="INSERT INTO `user_data`( `fname`, `lname`, `email`, `password`) VALUES (?,?,?,?)";
        regstration_operation instance = new regstration_operation();
        boolean expResult = false;
        boolean result = instance.employee_data(Query,query,fname, lname, email, password, re_email, re_password,checking);
        assertEquals(expResult, result);
        
    }
         @Test
        public void testEmployee_data13() {
        System.out.println("test case 10");
        String fname = "radwa";
        String lname = "ehab";
        String email = "radwaehab1@gmail.com";
        String password = "Radwa123@";
        String re_email = "radwaehab1@gmail.com";
        String re_password = "";
         boolean checking=true;
       String Query="SELECT * FROM `user_data` WHERE `email` =?";
        String query="INSERT INTO `user_data`( `fname`, `lname`, `email`, `password`) VALUES (?,?,?,?)";
        regstration_operation instance = new regstration_operation();
        boolean expResult = false;
        boolean result = instance.employee_data(Query,query,fname, lname, email, password, re_email, re_password,checking);
        assertEquals(expResult, result);
        
    }
         @Test
        public void testEmployee_data14() {
        System.out.println("test case 15");
        String fname = "radwa";
        String lname = "ehab";
        String email = "radwaehab22@gmail.com";
        String password = "Radwa123@";
        String re_email = "radwaehab22@gmail.com";
        String re_password = "Radwa123@";
         boolean checking=true;
       String Query="SELECT * FROM `user_data` WHERE `email` =?";
        String query="INSERT INTO `user_data`( `fname`, `lname`, `email`, `password`) VALUES (?,?,?,?)";
        
        regstration_operation instance = new regstration_operation();
        boolean expResult = true;
        boolean result = instance.employee_data(Query,query,fname, lname, email, password, re_email, re_password,checking);
        assertEquals(expResult, result);
        
    }
          @Test
        public void testEmployee_data15() {
        System.out.println("test case 15");
        String fname = "radwa";
        String lname = "ehab";
        String email = "radwaehab1@gmail.com";
        String password = "Radwa123@";
        String re_email = "radwaehab1@gmail.com";
        String re_password = "Radwa123";
         boolean checking=false;
       String Query="SELECT * FROM `user_data` WHERE `email` =?";
        String query="INSERT INTO `user_data`( `fname`, `lname`, `email`, `password`) VALUES (?,?,?,?)";
        
        regstration_operation instance = new regstration_operation();
        boolean expResult = false;
        boolean result = instance.employee_data(Query,query,fname, lname, email, password, re_email, re_password,checking);
        assertEquals(expResult, result);
        
    } 
         @Test
        public void testEmployee_data16() {
        System.out.println("test case 15");
        String fname = "radwa";
        String lname = "ehab";
        String email = "radwaehab1@gmail.com";
        String password = "Radwa123@";
        String re_email = "radwaehab1@gmail.com";
        String re_password = "Radwa123@";
         boolean checking=false;
       String Query="SELECT * FROM `user_data` WHERE `email` =?";
        String query="INSERT INTO `user_data`( `fname`, `lname`, `email`, `password`) VALUES (?,?,?,?)";
        
        regstration_operation instance = new regstration_operation();
        boolean expResult = true;
        boolean result = instance.employee_data(Query,query,fname, lname, email, password, re_email, re_password,checking);
        assertEquals(expResult, result);
        
    }
   
        /*
        @Test
        public void testEmployee_data21() {
        System.out.println("test case 4");
        String fname = "radwa";
        String lname = "ehab";
        String email = "radwaehab123@gmail.com";
        String password = "";
        String re_email = "";
        String re_password = "";
         boolean checking=true;
       String Query="SELECT * FROM `user_data` WHERE `email` =?";
        String query="INSERT INTO `user_data`( `fname`, `lname`, `email`, `password`) VALUES (?,?,?,?)";
        regstration_operation instance = new regstration_operation();
        boolean expResult = false;
        boolean result = instance.employee_data(Query,query,fname, lname, email, password, re_email, re_password,checking);
        assertEquals(expResult, result);
        
    }
        
         @Test
        public void testEmployee_data22() {
        System.out.println("test case 12");
        String fname = "";
        String lname = "";
        String email = "radwa1@gmail.com";
        String password = "radwa";
        String re_email = "radwaehab1@gmail.com";
        String re_password = "radwa";
         boolean checking=true;
       String Query="SELECT * FROM `user_data` WHERE `email` =?";
        String query="INSERT INTO `user_data`( `fname`, `lname`, `email`, `password`) VALUES (?,?,?,?)";
        regstration_operation instance = new regstration_operation();
        boolean expResult = false;
        boolean result = instance.employee_data(Query,query,fname, lname, email, password, re_email, re_password,checking);
        assertEquals(expResult, result);
        
    }
        @Test
        public void testEmployee_data23() {
        System.out.println("test case 16");
        String fname = "";
        String lname = "";
        String email = "radwaehab1@gmail.com";
        String password = "Radwa123";
        String re_email = "radwaehab1@gmail.com";
        String re_password = "Radwa123";
         boolean checking=true;
       String Query="SELECT * FROM `user_data` WHERE `email` =?";
        String query="INSERT INTO `user_data`( `fname`, `lname`, `email`, `password`) VALUES (?,?,?,?)";
        
        regstration_operation instance = new regstration_operation();
        boolean expResult = false;
        boolean result = instance.employee_data(Query,query,fname, lname, email, password, re_email, re_password,checking);
        assertEquals(expResult, result);
        
    }
        @Test
        public void testEmployee_data24() {
        System.out.println("test case 17");
        String fname = "";
        String lname = "";
        String email = "radwaehab1@gmail.com";
        String password = "radwa123@";
        String re_email = "radwaehab1@gmail.com";
        String re_password = "radwa123@";
         boolean checking=true;
       String Query="SELECT * FROM `user_data` WHERE `email` =?";
        String query="INSERT INTO `user_data`( `fname`, `lname`, `email`, `password`) VALUES (?,?,?,?)";
        
        regstration_operation instance = new regstration_operation();
        boolean expResult = false;
        boolean result = instance.employee_data(Query,query,fname, lname, email, password, re_email, re_password,checking);
        assertEquals(expResult, result);
        
    }
        @Test
        public void testEmployee_data25() {
        System.out.println("test case 18");
        String fname = "";
        String lname = "";
        String email = "radwaehab1@gmail.com";
        String password = "Radwaradwa@";
        String re_email = "radwaehab1@gmail.com";
        String re_password = "Radwaradwa@";
         boolean checking=true;
       String Query="SELECT * FROM `user_data` WHERE `email` =?";
        String query="INSERT INTO `user_data`( `fname`, `lname`, `email`, `password`) VALUES (?,?,?,?)";
        
        regstration_operation instance = new regstration_operation();
        boolean expResult = false;
        boolean result = instance.employee_data(Query,query,fname, lname, email, password, re_email, re_password,checking);
        assertEquals(expResult, result);
        
    }
        @Test
        public void testEmployee_data26() {
        System.out.println("test case 19");
        String fname = "";
        String lname = "";
        String email = "radwaehab1@gmail.com";
        String password = "RADWA123@";
        String re_email = "radwaehab1@gmail.com";
        String re_password = "RADWA123@";
         boolean checking=true;
       String Query="SELECT * FROM `user_data` WHERE `email` =?";
        String query="INSERT INTO `user_data`( `fname`, `lname`, `email`, `password`) VALUES (?,?,?,?)";
        
        regstration_operation instance = new regstration_operation();
        boolean expResult = false;
        boolean result = instance.employee_data(Query,query,fname, lname, email, password, re_email, re_password,checking);
        assertEquals(expResult, result);
        
    }
        @Test
        public void testEmployee_data11() {
        System.out.println("test case 11");
        String fname = "radwa";
        String lname = "ehab";
        String email = "radwaehab1@gmail.com";
        String password = "Radwa123@";
        String re_email = "radwaehab@gmail.com";
        String re_password = "Radwa123@";
         boolean checking=true;
       String Query="SELECT * FROM `user_data` WHERE `email` =?";
        String query="INSERT INTO `user_data`( `fname`, `lname`, `email`, `password`) VALUES (?,?,?,?)";
        regstration_operation instance = new regstration_operation();
        boolean expResult = false;
        boolean result = instance.employee_data(Query,query,fname, lname, email, password, re_email, re_password,checking);
        assertEquals(expResult, result);
        
    }
         @Test
        public void testEmployee_data100() {
        System.out.println("test case 10");
        String fname = "radwa";
        String lname = "ehab";
        String email = "radwaehab1@gmail.com";
        String password = "Radwa123@";
        String re_email = "radwaehab1@gmail.com";
        String re_password = "Radwa123";
         boolean checking=true;
       String Query="SELECT * FROM `user_data` WHERE `email` =?";
        String query="INSERT INTO `user_data`( `fname`, `lname`, `email`, `password`) VALUES (?,?,?,?)";
        regstration_operation instance = new regstration_operation();
        boolean expResult = false;
        boolean result = instance.employee_data(Query,query,fname, lname, email, password, re_email, re_password,checking);
        assertEquals(expResult, result);
        
    }
            @Test
        public void testEmployee_data27() {
        System.out.println("test case 7");
        String fname = "radwa";
        String lname = "ehab";
        String email = "radwaehab1@gmail.com";
        String password = "Radwa123@";
        String re_email = "radwaehab1@gmail.com";
        String re_password = "Radwa123@";
         boolean checking=true;
       String Query="SELECT * FROM `user_data` WHERE `email` =?";
        String query="INSERT INTO `user_data`( `fname`, `lname`, `email`, `password`) VALUES (?,?,?,?)";
        regstration_operation instance = new regstration_operation();
        boolean expResult = true;
        boolean result = instance.employee_data(Query,query,fname, lname, email, password, re_email, re_password,checking);
        assertEquals(expResult, result);
        
    }
        public void testEmployee_data28() {
        System.out.println("test case 7");
        String fname = "";
        String lname = "ehab";
        String email = "radwaehab1@gmail.com";
        String password = "Radwa123@";
        String re_email = "radwaehab1@gmail.com";
        String re_password = "Radwa123@";
         boolean checking=true;
       String Query="SELECT * FROM `user_data` WHERE `email` =?";
        String query="INSERT INTO `user_data`( `fname`, `lname`, `email`, `password`) VALUES (?,?,?,?)";
        regstration_operation instance = new regstration_operation();
        boolean expResult = true;
        boolean result = instance.employee_data(Query,query,fname, lname, email, password, re_email, re_password,checking);
        assertEquals(expResult, result);
        
    }
        /*
    @Test
        public void testEmployee_data2() {
        System.out.println("test case 2");
        String fname = "radwa";
        String lname = "";
        String email = "";
        String password = "";
        String re_email = "";
        String re_password = "";
         boolean checking=true;
       String Query="SELECT * FROM `user_data` WHERE `email` =?";
        String query="INSERT INTO `user_data`( `fname`, `lname`, `email`, `password`) VALUES (?,?,?,?)";
        regstration_operation instance = new regstration_operation();
        boolean expResult = false;
        boolean result = instance.employee_data(Query,query,fname, lname, email, password, re_email, re_password,checking);
        assertEquals(expResult, result);
       
    }
       
        
        
        
       
    
        @Test
        public void testEmployee_data8() {
        System.out.println("test case 8");
        String fname = "radwa";
        String lname = "ehab";
        String email = "radwaehab@gmail.com";
        String password = "Radwa123@";
        String re_email = "";
        String re_password = "";
         boolean checking=true;
       String Query="SELECT * FROM `user_data` WHERE `email` =?";
        String query="INSERT INTO `user_data`( `fname`, `lname`, `email`, `password`) VALUES (?,?,?,?)";
        regstration_operation instance = new regstration_operation();
        boolean expResult = false;
        boolean result = instance.employee_data(Query,query,fname, lname, email, password, re_email, re_password,checking);
        assertEquals(expResult, result);
        
    }
              @Test
        public void testEmployee_data9() {
        System.out.println("test case 9");
        String fname = "radwa";
        String lname = "ehab";
        String email = "radwaehab@gmail.com";
        String password = "Radwa123@";
        String re_email = "radwaehab@gmail.com";
        String re_password = "";
         boolean checking=true;
       String Query="SELECT * FROM `user_data` WHERE `email` =?";
        String query="INSERT INTO `user_data`( `fname`, `lname`, `email`, `password`) VALUES (?,?,?,?)";
        regstration_operation instance = new regstration_operation();
        boolean expResult = false;
        boolean result = instance.employee_data(Query,query,fname, lname, email, password, re_email, re_password,checking);
        assertEquals(expResult, result);
        
    }
       
        
       
        
        @Test
        public void testEmployee_data20() {
        System.out.println("test case 4");
        String fname = "radwa";
        String lname = "ehab";
        String email = "radwaehab22@gmail.com";
        String password = "";
        String re_email = "";
        String re_password = "";
         boolean checking=true;
       String Query="SELECT * FROM `user_data` WHERE `email` =?";
        String query="INSERT INTO `user_data`( `fname`, `lname`, `email`, `password`) VALUES (?,?,?,?)";
        regstration_operation instance = new regstration_operation();
        boolean expResult = false;
        boolean result = instance.employee_data(Query,query,fname, lname, email, password, re_email, re_password,checking);
        assertEquals(expResult, result);
        
    }*/
        
       
}
