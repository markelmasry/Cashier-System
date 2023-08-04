/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controll;

import Modeling.Database_Opreations;
import controll.login_operation;
import java.sql.ResultSet;
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
public class login_operationTest {
    
    public login_operationTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of get_email_and_password_data method, of class login_operation.
     */
    @Test
    public void testGet_email_and_password_data() {
        System.out.println("get_email_and_password_data");
        login_operation login = new login_operation();
        String email = "";
        String password = "6565";
        boolean checking = true;
        String expResult = "Please enter email";
        String result = login.get_email_and_password_data(email, password, checking);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
     @Test
    public void testGet_email_and_password_data2() {
        System.out.println("get_email_and_password_data");
        login_operation login = new login_operation();
        String email = "yara";
        String password = "";
        boolean checking = false;
        String expResult = "Please enter pass";
        String result = login.get_email_and_password_data(email, password, checking);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    } 
    
    @Test
    public void testGet_email_and_password_data3() {
        System.out.println("get_email_and_password_data");
        login_operation login = new login_operation();
        String email = "yara.gamal@gmail.com";
        String password = "Abcd1234@";
        boolean checking = false;
        String expResult = null;
        String result = login.get_email_and_password_data(email, password, checking);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    } 
    @Test
    public void testGet_email_and_password_data4() {
        System.out.println("get_email_and_password_data");
        login_operation login = new login_operation();
        String email = "yara.gamal@gmail.com";
        String password = "Abcd1234@";
        boolean checking = true;
        String expResult = "welcome";
        String result = login.get_email_and_password_data(email, password, checking);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    } 
    @Test
    public void testGet_email_and_password_data5() {
        System.out.println("get_email_and_password_data");
        login_operation login = new login_operation();
        String email = "yara.gamal@gmail.com";
        String password = "Abcd1234";
        boolean checking = true;
        String expResult = "incorrect User name or password";
        String result = login.get_email_and_password_data(email, password, checking);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
       @Test
    public void testGet_email_and_password() {
        System.out.println("get_email_and_password");
        String Query = "SELECT * FROM `user_data` WHERE `email` =? AND `password` =?";
       String email = "yara.gamal@gmail.com";
        String password = "Abcd1234";
        boolean checking = false;
        ResultSet expResult = null;
        ResultSet result = Database_Opreations.get_email_and_password(Query, email, password, checking);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }
       @Test
    public void testSearch_emp() {
        System.out.println("Search_emp");
        String query = "select * from user_data  WHERE `id` =? ";
        String id = "1";
        boolean checking = false;
        ResultSet expResult = null;
        ResultSet result = Database_Opreations.Search_emp(query, id, checking);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }


}
