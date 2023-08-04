/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controll;

import Modeling.Database_Opreations;
import controll.managerPassword_operation;
import java.sql.ResultSet;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author radwa
 */
public class managerPassword_operationTest {
    
    public managerPassword_operationTest() {
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
     * Test of mangerPassword method, of class managerPassword_operation.
     */
    @Test
    public void testMangerPassword() {
        System.out.println("mangerPassword1");
        String email = "";
        String password = "";
        String query="SELECT * FROM `user_data` WHERE `email` =? AND `password` =?";
         boolean checking = true;
        boolean expResult = false;
        boolean result = managerPassword_operation.mangerPassword(query,email, password,checking);
        assertEquals(expResult, result);
        
    }
    @Test
    public void testMangerPassword1() {
        System.out.println("mangerPassword2");
        String email = "radwa@gmail.com";
        String query="SELECT * FROM `user_data` WHERE `email` =? AND `password` =?";
        String password = "radwa";
         boolean checking = true;
        boolean expResult = false;
        boolean result = managerPassword_operation.mangerPassword(query,email, password,checking);
        assertEquals(expResult, result);
        
    }
@Test
    public void testMangerPassword2() {
        System.out.println("mangerPassword3");
        String email = "radwa@gmail.com";
        String password = "radwaEhab123@";
        String query="SELECT * FROM `user_data` WHERE `email` =? AND `password` =?";
         boolean checking = true;
        boolean expResult = true;
        boolean result = managerPassword_operation.mangerPassword(query,email, password,checking);
        assertEquals(expResult, result);
        
    }  
    @Test
    public void testMangerPassword3() {
        System.out.println("mangerPassword4");
        String email = "adwa@gmail.com";
        String password = "radwaEhab123@";
        String query="SELECT * FROM `user_data` WHERE `email` =? AND `password` =?";
         boolean checking = true;
        boolean expResult = false;
        boolean result = managerPassword_operation.mangerPassword(query,email, password,checking);
        assertEquals(expResult, result);
        
    }  
    @Test
    public void testMangerPassword4() {
        System.out.println("mangerPassword5");
        managerPassword_operation m=new managerPassword_operation();
        String email = "adwa@gmail.com";
        String password = "radwaEhab123@";
        String query="SELECT * FROM `user_data` WHERE `emai` =? AND `password` =?";
         boolean checking = false;
        boolean expResult = false;
        boolean result = m.mangerPassword(query,email, password,checking);
        assertEquals(expResult, result);
        
    }  
        /**
     * Test of check_manager_password method, of class Database_Opreations.
     */
    @Test
    public void testCheck_manager_password() {
        System.out.println("check_manager_password");
       Database_Opreations data = new Database_Opreations();
        String query = "SELECT * FROM `user_data` WHERE `emai` =? AND `password` =?";;
        String email = "adwa@gmail.com";
        String password = "radwaEhab123@";
        boolean checking = false;
        ResultSet expResult = null;
        ResultSet result = data.check_manager_password(query, email, password, checking);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
}
