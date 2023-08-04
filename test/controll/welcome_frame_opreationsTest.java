/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controll;

import controll.welcome_frame_opreations;
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
public class welcome_frame_opreationsTest {
    
    public welcome_frame_opreationsTest() {
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
     * Test of qtyChange method, of class welcome_frame_opreations.
     */
    @Test
    public void testQtyChange() {
        System.out.println("qtyChange");
        int qty = -5;
        float price = 50.0F;
        float expResult = -1F;
        float result = welcome_frame_opreations.qtyChange(qty, price);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
      //  fail("The test case is a prototype.");
    }
      @Test
    public void testQtyChange2() {
        System.out.println("qtyChange2");
        int qty = 3;
        float price = -50.0F;
        float expResult = -1F;
        float result = welcome_frame_opreations.qtyChange(qty, price);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
      //  fail("The test case is a prototype.");
    }
      @Test
    public void testQtyChange3() {
        System.out.println("qtyChange3");
        int qty = 3;
        float price = 50.0F;
        float expResult = 150.0F;
        float result = welcome_frame_opreations.qtyChange(qty, price);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
      //  fail("The test case is a prototype.");
    }

    /**
     * Test of get_total method, of class welcome_frame_opreations.
     */
    @Test
    public void testGet_total() {
        System.out.println("get_total");
        double num = 15;
        double sum = 100;
        double expResult = 115.0;
        double result = welcome_frame_opreations.get_total(num, sum);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }
    @Test
    public void testGet_total2() {
        System.out.println("get_total2");
        double num = 15;
        double sum = -100;
        double expResult = -1;
        double result = welcome_frame_opreations.get_total(num, sum);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }
        @Test
    public void testGet_total3() {
        System.out.println("get_total3");
        double num = -15;
        double sum = 100;
        double expResult = -1;
        double result = welcome_frame_opreations.get_total(num, sum);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of get_balance method, of class welcome_frame_opreations.
     */
    @Test
    public void testGet_balance() {
        System.out.println("get_balance");
        double pay = 50;
        double Total = 100;
        float expResult = -1F;
        float result = welcome_frame_opreations.get_balance(pay, Total);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
     
    @Test
    public void testGet_balance2() {
        System.out.println("get_balance2");
        welcome_frame_opreations w =new welcome_frame_opreations();
        double pay = 200;
        double Total = 150;
        float expResult = 50F;
        float result = w.get_balance(pay, Total);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }
    
}
