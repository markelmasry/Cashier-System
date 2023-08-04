/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controll;

import Modeling.Database_Opreations;
import controll.Order_Opreations;
import Modeling.Order_Model;
import java.sql.ResultSet;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author marke
 */
public class Order_OpreationsTest {
    
    public Order_OpreationsTest() {
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
     * Test of get_order_data method, of class Order_Opreations.
     */
    @Test
    public void testGet_order_data() {
        System.out.println("get_order_data");
        String pcode ="";
        boolean checking = true;
        Order_Model expResult = new Order_Model(null,null,null,"",null);
        Order_Model result = Order_Opreations.get_order_data(pcode, checking);
        assertEquals(expResult.toString(),result.toString());
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }
     @Test
    public void testGet_order_data2() {
        System.out.println("get_order_data");
        String pcode = "1";
        boolean checking = false;
        Order_Model expResult =  new Order_Model(null,null,null,null,null);
        Order_Model result = Order_Opreations.get_order_data(pcode, checking);
         assertEquals(expResult.toString(),result.toString());
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
     @Test
    public void testGet_order_data3() {
        System.out.println("get_order_data");
        String pcode = "222";
        boolean checking = true;
        Order_Model expResult = new Order_Model(null,null,null,"",null);
        Order_Model result = Order_Opreations.get_order_data(pcode, checking);
         assertEquals(expResult.toString(),result.toString());
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }
     @Test
    public void testGet_order_data4() {
        System.out.println("get_order_data");
        Order_Opreations o=new Order_Opreations();
        String pcode = "2";
        boolean checking = true;
        Order_Model expResult = new Order_Model("TEA",pcode,null,"30.0",null);;
        Order_Model result = o.get_order_data(pcode, checking);
        assertEquals(expResult.toString(),result.toString());
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
     /**
     * Test of getData method, of class Database_Opreations.
     */
    @Test
    public void testGetData() {
          System.out.println("getData");
        String Query = "select * from product_sales where id =?";
        String pcode = "2";
        boolean checking = false;
        ResultSet expResult = null;
        ResultSet result = Database_Opreations.getData(Query, pcode, checking);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
      //  fail("The test case is a prototype.");
    }
}
