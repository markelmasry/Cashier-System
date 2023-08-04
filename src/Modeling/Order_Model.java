/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modeling;

/**
 *
 * @author marke
 */
public class Order_Model {
    private String Name, Code,Qty,Price,Amount;

    public Order_Model(String Name, String Code, String Qty, String Price, String Amount) {
        this.Name = Name;
        this.Code = Code;
        this.Qty = Qty;
        this.Price = Price;
        this.Amount = Amount;
    }
    
    
    
    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getCode() {
        return Code;
    }

    public void setCode(String Code) {
        this.Code = Code;
    }

    public String getQty() {
        return Qty;
    }

    public void setQty(String Qty) {
        this.Qty = Qty;
    }

    public String getPrice() {
        return Price;
    }

    public void setPrice(String Price) {
        this.Price = Price;
    }

    public String getAmount() {
        return Amount;
    }

    public void setAmount(String Amount) {
        this.Amount = Amount;
    }

    @Override
    public String toString() {
        return "Order_Model{" + "Name=" + Name + ", Code=" + Code + ", Qty=" + Qty + ", Price=" + Price + ", Amount=" + Amount + '}';
    }


    
    
}
