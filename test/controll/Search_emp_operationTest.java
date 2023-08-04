/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controll;

import Modeling.Employee_Model;
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
public class Search_emp_operationTest {
    
    public Search_emp_operationTest() {
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
     * Test of search_result method, of class Search_emp_operation.
     */
    @Test
    public void testSearch_result() {
        System.out.println("search_result");
        Search_emp_operation search =new Search_emp_operation();
        String id = "";
        boolean checking = true;
        Employee_Model expResult = new Employee_Model (null,null,null,null,null);
        Employee_Model result = search.search_result(id, checking);
        assertEquals(expResult.toString(), result.toString());
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    @Test
    public void testSearch_result2() {
        System.out.println("search_result");
         Search_emp_operation search =new Search_emp_operation();
        String id = "1";
        boolean checking = false;
        Employee_Model expResult = new Employee_Model (null,null,null,null,null);
        Employee_Model result = search.search_result(id, checking);
        assertEquals(expResult.toString(), result.toString());
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    @Test
    public void testSearch_result3() {
        System.out.println("search_result");
         Search_emp_operation search =new Search_emp_operation();
        String id = "15";
        boolean checking = true;
        Employee_Model expResult = new Employee_Model ("15","yara","gamal","yara.gamal@gmail.com",null);;
        Employee_Model result = search.search_result(id, checking);
        assertEquals(expResult.toString(), result.toString());
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }
    @Test
    public void testSearch_resul4t() {
        System.out.println("search_result");
         Search_emp_operation search =new Search_emp_operation();
        String id = "100";
        boolean checking = true;
        Employee_Model expResult = new Employee_Model (null,null,null,null,null); ;
        Employee_Model result = search.search_result(id, checking);
        assertEquals(expResult.toString(), result.toString());
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
 
    
}
