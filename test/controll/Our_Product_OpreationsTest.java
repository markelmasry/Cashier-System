/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controll;

import Modeling.Database_Opreations;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import java.lang.NullPointerException;
import java.sql.SQLException;
/**
 *
 * @author Aya Raafat
 */
public class Our_Product_OpreationsTest {
    
    public Our_Product_OpreationsTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass()throws SQLException {
    
        Database_Opreations h=new Database_Opreations();
         h.deleteData("DELETE FROM `product_sales` WHERE `productname` = ?","Water",true);
         h.addData("INSERT INTO `product_sales`( `productname`,`Whole_price`, `price`) VALUES (?,?,?)","hot water","20","60",true);
         String customerprice="40";
         String productprice="17";
         String pname="latte";
         h.editData("UPDATE `product_sales` SET `price`='"+customerprice+"',`Whole_price`='"+productprice+"' where `productname` ='"+pname+"'","latte","40","17",true);
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of addData method, of class Our_Product_Opreations.
     */
     @Test
    public void testAddData1() {
        System.out.println("addData");
        
        String pname = "cold milk";
        String customerprice = "12";
        String productprice = "80";
        String query="INSERT INTO `product_sales`( `productname`,`Whole_price`, `price`) VALUES (?,?,?)";
       boolean check = true;
        boolean checking=true;
        Database_Opreations addmock =  mock (Database_Opreations.class);
        when(addmock.addData("INSERT INTO `product_sales`( `productname`,`Whole_price`, `price`) VALUES (?,?,?)","cold milk","12","80",true)).thenReturn(true);
        when(addmock.addData("INSERT INTO `product_sales`( `productname`,`Whole_price`, `price`) VALUES (?,?,?)" ,"milk","50","12",false)).thenReturn(false);
        Our_Product_Opreations instance = new Our_Product_Opreations();
        boolean expResult = true;
        boolean result = instance.addData(query,pname, customerprice, productprice,checking,check);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
      //  fail("The test case is a prototype.");
    }
    @Test
    public void testAddData2() {
        System.out.println("addData");
        
        String pname = "Water";
        String customerprice = "15";
        String productprice = "6";
        String query="INSERT INTO `product_sales`( `productname`,`Whole_price`, `price`) VALUES (?,?,?)";
         boolean check = true;
         boolean checking=true;
        Database_Opreations addmock =  mock (Database_Opreations.class);
        when(addmock.addData("INSERT INTO `product_sales`( `productname`,`Whole_price`, `price`) VALUES (?,?,?)","Water","15","6",true)).thenReturn(true);
        when(addmock.addData("INSERT INTO `product_sales`( `productname`,`Whole_price`, `price`) VALUES (?,?,?)" ,"COFFEE","15","48",false)).thenReturn(false);
        Our_Product_Opreations instance = new Our_Product_Opreations();
        boolean expResult = true;
        boolean result = instance.addData(query,pname, customerprice, productprice,checking,check);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
      //  fail("The test case is a prototype.");
    }
    
    @Test
    public void testAddData3() {
        System.out.println("addData");
        
        String pname = "";
        String customerprice = "6";
        String productprice = "15";
        String query="INSERT INTO `product_sales`( `productname`,`Whole_price`, `price`) VALUES (?,?,?)";
        boolean check = true;
         boolean checking=true;
        Database_Opreations addmock =  mock (Database_Opreations.class);
        when(addmock.addData("INSERT INTO `product_sales`( `productname`,`Whole_price`, `price`) VALUES (?,?,?)","rr milk","50","12",true)).thenReturn(true);
        when(addmock.addData("INSERT INTO `product_sales`( `productname`,`Whole_price`, `price`) VALUES (?,?,?)" ,"COFFEE","15","48",false)).thenReturn(false);
        Our_Product_Opreations instance = new Our_Product_Opreations();
        boolean expResult = true;
        boolean result = instance.addData(query,pname, customerprice, productprice,checking,check);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
      //  fail("The test case is a prototype.");
    }
    @Test
    public void testAddData4() {
        System.out.println("addData");
        
        String pname = "Water";
        String customerprice = "";
        String productprice = "15";
        String query="INSERT INTO `product_sales`( `productname`,`Whole_price`, `price`) VALUES (?,?,?)";
         boolean check = true;
         boolean checking=true;
        Database_Opreations addmock =  mock (Database_Opreations.class);
        when(addmock.addData("INSERT INTO `product_sales`( `productname`,`Whole_price`, `price`) VALUES (?,?,?)","rr milk","50","12",true)).thenReturn(true);
        when(addmock.addData("INSERT INTO `product_sales`( `productname`,`Whole_price`, `price`) VALUES (?,?,?)" ,"COFFEE","15","48",false)).thenReturn(false);
        Our_Product_Opreations instance = new Our_Product_Opreations();
        boolean expResult = true;
        boolean result = instance.addData(query,pname, customerprice, productprice,checking,check);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
      //  fail("The test case is a prototype.");
    }
   
    @Test
    public void testAddData5() {
        System.out.println("addData");
        
        String pname = "Water";
        String customerprice = "6";
        String productprice = "";
        String query="INSERT INTO `product_sales`( `productname`,`Whole_price`, `price`) VALUES (?,?,?)";
         boolean check = true;
         boolean checking=true;
        Database_Opreations addmock =  mock (Database_Opreations.class);
        when(addmock.addData("INSERT INTO `product_sales`( `productname`,`Whole_price`, `price`) VALUES (?,?,?)","rr milk","50","12",true)).thenReturn(true);
        when(addmock.addData("INSERT INTO `product_sales`( `productname`,`Whole_price`, `price`) VALUES (?,?,?)" ,"COFFEE","15","48",false)).thenReturn(false);
        Our_Product_Opreations instance = new Our_Product_Opreations();
        boolean expResult = true;
        boolean result = instance.addData(query,pname, customerprice, productprice,checking,check);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
      //  fail("The test case is a prototype.");
    }
    
    @Test
    public void testAddData6() {
        System.out.println("addData");
        
        String pname = "rr milk";
        String customerprice = "50";
        String productprice = "12";
        String query="INSERT IO `product_sales`( `productname`,`Whole_price`, `price`) VALUES (?,?,?)";
         boolean check = true;
         boolean checking=false;
        Database_Opreations addmock =  mock (Database_Opreations.class);
        when(addmock.addData("INSERT INTO `product_sales`( `productname`,`Whole_price`, `price`) VALUES (?,?,?)","rr milk","50","12",true)).thenReturn(true);
        when(addmock.addData("INSERT IO `product_sales`( `productname`,`Whole_price`, `price`) VALUES (?,?,?)", "rr milk","50","12",false)).thenReturn(false);
        Our_Product_Opreations instance = new Our_Product_Opreations();
        boolean expResult = false;
        boolean result = instance.addData(query,pname, customerprice, productprice,checking,check);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
      //  fail("The test case is a prototype.");
    }
     @Test
    public void testAddData7() {
        System.out.println("addData");
        
        String pname = "Water";
        String customerprice = "15";
        String productprice = "6";
        String query="INSERT INTO `product_sales`( `productname`,`Whole_price`, `price`) VALUES (?,?,?)";
         boolean check = false;
         boolean checking=true;
        Database_Opreations addmock =  mock (Database_Opreations.class);
        when(addmock.addData("INSERT INTO `product_sales`( `productname`,`Whole_price`, `price`) VALUES (?,?,?)","Water","15","6",true)).thenReturn(true);
        when(addmock.addData("INSERT INTO `product_sales`( `productname`,`Whole_price`, `price`) VALUES (?,?,?)" ,"COFFEE","15","48",false)).thenReturn(false);
        Our_Product_Opreations instance = new Our_Product_Opreations();
        boolean expResult = true;
        boolean result = instance.addData(query,pname, customerprice, productprice,checking,check);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
      //  fail("The test case is a prototype.");
    }
    

    /**
     * Test of deleteData method, of class Our_Product_Opreations.
     */
    @Test
    public void testDeleteData1() {
        System.out.println("deleteData");
        
        String pname = "hot water";
        String query="DELETE FROM `product_sales` WHERE `productname` = ?";
       boolean check = true;
       boolean checking=true;
          Database_Opreations deletemock =  mock (Database_Opreations.class);
        when(deletemock.deleteData("DELETE FROM `product_sales` WHERE `productname` = ?","hot water",true)).thenReturn(true);
        when(deletemock.deleteData("DELETE FROM `product_sales` WHERE `productname` = ?" ,"ertmilk",false)).thenReturn(false);
        Our_Product_Opreations instance = new Our_Product_Opreations();
        boolean expResult = true;
        boolean result = instance.deleteData(query,pname,checking,check);
        assertEquals(expResult,result);
      
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
@Test
    public void testDeleteData2() {
        System.out.println("deleteData");
        
        String pname = "";
        String query="DELETE FROM `product_sales` WHERE `productname` = ?";
          boolean check = true;
          boolean checking=true;
          Database_Opreations deletemock =  mock (Database_Opreations.class);
        when(deletemock.deleteData("DELETE FROM `product_sales` WHERE `productname` = ?","ICE",true)).thenReturn(true);
        when(deletemock.deleteData("DELETE FROM `product_sales` WHERE `productname` = ?" ,"ertmilk",false)).thenReturn(false);
        Our_Product_Opreations instance = new Our_Product_Opreations();
        boolean expResult = true;
        boolean result = instance.deleteData(query,pname,checking,check);
        assertEquals(expResult,result);
      
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
@Test
    public void testDeleteData3() {
        System.out.println("deleteData");
        
        String pname = "errt";
        String query="DELETE FROM `product_sales` WHERE `productname` = ?";
          boolean check = true;
        boolean checking=true;
          Database_Opreations deletemock =  mock (Database_Opreations.class);
        when(deletemock.deleteData("DELETE FROM `product_sales` WHERE `productname` = ?","ICE",true)).thenReturn(true);
        when(deletemock.deleteData("DELETE FROM `product_sales` WHERE `productname` = ?" ,"ertmilk",false)).thenReturn(false);
        Our_Product_Opreations instance = new Our_Product_Opreations();
        boolean expResult = true;
        boolean result = instance.deleteData(query,pname,checking,check);
        assertEquals(expResult,result);
      
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
@Test
    public void testDeleteData4() {
        System.out.println("deleteData");
        
        String pname = "milk";
        String query="DELETE FOM `product_sales` WHERE `productname` = ?";
      boolean check = true;
    boolean checking=false;
          Database_Opreations deletemock =  mock (Database_Opreations.class);
        when(deletemock.deleteData("DELETE FROM `product_sales` WHERE `productname` = ?","ICE",true)).thenReturn(true);
        when(deletemock.deleteData("DELETE FOM `product_sales` WHERE `productname` = ?" ,"milk",false)).thenReturn(false);
        Our_Product_Opreations instance = new Our_Product_Opreations();
        boolean expResult = false;
        boolean result = instance.deleteData(query,pname,checking,check);
        assertEquals(expResult,result);
      
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    @Test
    public void testDeleteData5() {
        System.out.println("deleteData");
        
        String pname = "errt";
        String query="DELETE FROM `product_sales` WHERE `productname` = ?";
          boolean check = false;
        boolean checking=true;
          Database_Opreations deletemock =  mock (Database_Opreations.class);
        when(deletemock.deleteData("DELETE FROM `product_sales` WHERE `productname` = ?","ICE",true)).thenReturn(true);
        when(deletemock.deleteData("DELETE FROM `product_sales` WHERE `productname` = ?" ,"ertmilk",false)).thenReturn(false);
        Our_Product_Opreations instance = new Our_Product_Opreations();
        boolean expResult = true;
        boolean result = instance.deleteData(query,pname,checking,check);
        assertEquals(expResult,result);
      
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    

    /**
     * Test of editData method, of class Our_Product_Opreations.
     */
    @Test
    public void testEditData1() {
        System.out.println("editData");
        
        String pname = "latte";
        String customerprice = "80";
        String productprice = "12";
        String query="UPDATE `product_sales` SET `price`='"+customerprice+"',`Whole_price`='"+productprice+"' where `productname` ='"+pname+"'";
          boolean check = true;
         boolean checking=true;
        Database_Opreations editmock =  mock (Database_Opreations.class);
        when(editmock.editData("UPDATE `product_sales` SET `price`='"+customerprice+"',`Whole_price`='"+productprice+"' where `productname` ='"+pname+"'","latte","80","12",true)).thenReturn(true);
        when(editmock.editData("UPDATE `product_sales` SET `price`='"+customerprice+"',`Whole_price`='"+productprice+"' where `productname` ='"+pname+"'","ggghmilk","50","12",false)).thenReturn(false);
        Our_Product_Opreations instance = new Our_Product_Opreations();
        boolean result = instance.editData(query,pname, customerprice, productprice,checking,check);
        boolean expResult = true;
        
        assertEquals(expResult,result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    @Test
    public void testEditData2() {
        System.out.println("editData");
        
        String pname = "";
        String customerprice = "30";
        String productprice = "10";
        String query="UPDATE `product_sales` SET `price`='"+customerprice+"',`Whole_price`='"+productprice+"' where `productname` ='"+pname+"'";
          boolean check = true;
         boolean checking=true;
        Database_Opreations editmock =  mock (Database_Opreations.class);
        when(editmock.editData("UPDATE `product_sales` SET `price`='"+customerprice+"',`Whole_price`='"+productprice+"' where `productname` ='"+pname+"'","TEA","30","10",true)).thenReturn(true);
        when(editmock.editData("UPDATE `product_sales` SET `price`='"+customerprice+"',`Whole_price`='"+productprice+"' where `productname` ='"+pname+"'" ,"ggghmilk","50","12",false)).thenReturn(false);
        Our_Product_Opreations instance = new Our_Product_Opreations();
        boolean result = instance.editData(query,pname, customerprice, productprice,checking,check);
        boolean expResult = true;
        
        assertEquals(expResult,result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    @Test
    public void testEditData3() {
        System.out.println("editData");
        
        String pname = "TEA";
        String customerprice = "";
        String productprice = "10";
        String query="UPDATE `product_sales` SET `price`='"+customerprice+"',`Whole_price`='"+productprice+"' where `productname` ='"+pname+"'";
          boolean check = true;
         boolean checking=true;
        Database_Opreations editmock =  mock (Database_Opreations.class);
        when(editmock.editData("UPDATE `product_sales` SET `price`='"+customerprice+"',`Whole_price`='"+productprice+"' where `productname` ='"+pname+"'","TEA","30","10",true)).thenReturn(true);
        when(editmock.editData( "UPDATE `product_sales` SET `price`='"+customerprice+"',`Whole_price`='"+productprice+"' where `productname` ='"+pname+"'","ggghmilk","50","12",false)).thenReturn(false);
        Our_Product_Opreations instance = new Our_Product_Opreations();
        boolean result = instance.editData(query,pname, customerprice, productprice,checking,check);
        boolean expResult = true;
        
        assertEquals(expResult,result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    @Test
    public void testEditData4() {
        System.out.println("editData");
        
        String pname = "TEA";
        String customerprice = "30";
        String productprice = "";
        String query="UPDATE `product_sales` SET `price`='"+customerprice+"',`Whole_price`='"+productprice+"' where `productname` ='"+pname+"'";
         boolean check = true;
         boolean checking=true;
        Database_Opreations editmock =  mock (Database_Opreations.class);
        when(editmock.editData("UPDATE `product_sales` SET `price`='"+customerprice+"',`Whole_price`='"+productprice+"' where `productname` ='"+pname+"'","TEA","30","10",true)).thenReturn(true);
        when(editmock.editData("UPDATE `product_sales` SET `price`='"+customerprice+"',`Whole_price`='"+productprice+"' where `productname` ='"+pname+"'" ,"ggghmilk","50","12",false)).thenReturn(false);
        Our_Product_Opreations instance = new Our_Product_Opreations();
        boolean result = instance.editData(query,pname, customerprice, productprice,checking,check);
        boolean expResult = true;
        
        assertEquals(expResult,result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    @Test
    public void testEditData5() {
        System.out.println("editData");
        
        String pname = "rhtmilk";
        String customerprice = "80";
        String productprice = "12";
        String query="UPDATE `product_sales` SET `price`='"+customerprice+"',`Whole_price`='"+productprice+"' where `productname` ='"+pname+"'";
          boolean check = true;
         boolean checking=true;
        Database_Opreations editmock =  mock (Database_Opreations.class);
        when(editmock.editData("UPDATE `product_sales` SET `price`='"+customerprice+"',`Whole_price`='"+productprice+"' where `productname` ='"+pname+"'","TEA","30","10",true)).thenReturn(true);
        when(editmock.editData("UPDATE `product_sales` SET `price`='"+customerprice+"',`Whole_price`='"+productprice+"' where `productname` ='"+pname+"'" ,"ggghmilk","50","12",false)).thenReturn(false);
        Our_Product_Opreations instance = new Our_Product_Opreations();
        boolean result = instance.editData(query,pname, customerprice, productprice,checking,check);
        boolean expResult = true;
        
        assertEquals(expResult,result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
   
    @Test
    public void testEditData6() {
        System.out.println("editData");
        
        String pname = "latte";
        String customerprice = "80";
        String productprice = "12";
        String query="UPDATE `product_sales` ST `price`='"+customerprice+"',`Whole_price`='"+productprice+"' where `productname` ='"+pname+"'";
      boolean check = true;
       boolean checking=false;
        Database_Opreations editmock =  mock (Database_Opreations.class);
        when(editmock.editData("UPDATE `product_sales` SET `price`='"+customerprice+"',`Whole_price`='"+productprice+"' where `productname` ='"+pname+"'","Water","80","12",true)).thenReturn(true);
        when(editmock.editData("UPDATE `product_sales` ST `price`='"+customerprice+"',`Whole_price`='"+productprice+"' where `productname` ='"+pname+"'" ,"latte","80","12",false)).thenReturn(false);
        Our_Product_Opreations instance = new Our_Product_Opreations();
        boolean result = instance.editData(query,pname, customerprice, productprice,checking,check);
        boolean expResult = false;
        
        assertEquals(expResult,result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
   @Test
    public void testEditData7() {
        System.out.println("editData");
        
        String pname = "rhtmilk";
        String customerprice = "80";
        String productprice = "12";
        String query="UPDATE `product_sales` SET `price`='"+customerprice+"',`Whole_price`='"+productprice+"' where `productname` ='"+pname+"'";
          boolean check = false;
         boolean checking=true;
        Database_Opreations editmock =  mock (Database_Opreations.class);
        when(editmock.editData("UPDATE `product_sales` SET `price`='"+customerprice+"',`Whole_price`='"+productprice+"' where `productname` ='"+pname+"'","TEA","30","10",true)).thenReturn(true);
        when(editmock.editData("UPDATE `product_sales` SET `price`='"+customerprice+"',`Whole_price`='"+productprice+"' where `productname` ='"+pname+"'" ,"ggghmilk","50","12",false)).thenReturn(false);
        Our_Product_Opreations instance = new Our_Product_Opreations();
        boolean result = instance.editData(query,pname, customerprice, productprice,checking,check);
        boolean expResult = true;
        
        assertEquals(expResult,result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
