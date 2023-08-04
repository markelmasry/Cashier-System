/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controll;

import Modeling.Database_Opreations;
import Modeling.Product_Model;
import java.sql.ResultSet;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Aya Raafat
 */
public class SreachFrame_OpreationsTest {
    
    public SreachFrame_OpreationsTest() {
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
     * Test of get_product_data method, of class SreachFrame_Opreations.
     */
    @Test
    public void testGet_product_data1() {
        System.out.println("get_product_data");
        String id = "";
        boolean checking = true;
        Product_Model expResult = new Product_Model (" ",null,null,null);
        SreachFrame_Opreations b=new SreachFrame_Opreations();
        Product_Model result =  b.get_product_data(id, checking);
        assertEquals(expResult.toString(), result.toString());
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }
      @Test
    public void testGet_product_data2() {
        System.out.println("get_product_data");
        String id = "155";
        boolean checking = true;
        Product_Model expResult = new Product_Model (" ",null,null,null);
         SreachFrame_Opreations b=new SreachFrame_Opreations();
        Product_Model result =  b.get_product_data(id, checking);
        assertEquals(expResult.toString(), result.toString());
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }
      @Test
    public void testGet_product_data3() {
        System.out.println("get_product_data");
        String id = "15";
        boolean checking = false;
        Product_Model expResult = new Product_Model (null,null,null,null);
        SreachFrame_Opreations b=new SreachFrame_Opreations();
        Product_Model result =  b.get_product_data(id, checking);
        assertEquals(expResult.toString(), result.toString());
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }
      @Test
    public void testGet_product_data4() {
        System.out.println("get_product_data");
        String id = "2";
        boolean checking = true;
        Product_Model expResult = new Product_Model (id,"TEA","10.0","30.0");
        SreachFrame_Opreations b=new SreachFrame_Opreations();
        Product_Model result =  b.get_product_data(id, checking);
        assertEquals(expResult.toString(), result.toString());
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }
      @Test
    public void testGet_data() {
        System.out.println("getData");
        String Query = "select * from product_sales where id =?";
        String pcode = "2";
        boolean checking = false;
        ResultSet expResult = null;
        Database_Opreations db =new Database_Opreations();
        ResultSet result = db.getData(Query, pcode, checking);
        assertEquals(expResult, result);
         // TODO review the generated test code and remove the default call to fail.
      //  fail("The test case is a prototype.");
    }
    
}
