/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modeling;

/**
 *
 * @author Aya Raafat
 */
public class Product_Model {
     private  String productCode , productname, productprice , customerprice;

    public Product_Model(String productCode, String productname, String productprice, String customerprice) {
        this.productCode = productCode;
        this.productname = productname;
        this.productprice = productprice;
        this.customerprice = customerprice;
    }

    public String getProductCode() {
        return productCode;
    }

    public String getProductname() {
        return productname;
    }

    public String getProductprice() {
        return productprice;
    }

    public String getCustomerprice() {
        return customerprice;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    public void setProductname(String productname) {
        this.productname = productname;
    }

    public void setProductprice(String productprice) {
        this.productprice = productprice;
    }

    public void setCustomerprice(String customerprice) {
        this.customerprice = customerprice;
    }

    @Override
    public String toString() {
        return "Product_Model{" + "productCode=" + productCode + ", productname=" + productname + ", productprice=" + productprice + ", customerprice=" + customerprice + '}';
    }
   
}
