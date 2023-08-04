/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controll;



/**
 *
 * @author marke
 */
public class welcome_frame_opreations {
       
       public static float qtyChange(int qty ,float price){
            
           if(qty<0)
                return -1;
           else if(price<0)
                return -1;
           else{
           float amount= qty* price;
           return amount;
          
           }
       }
       public static double get_total(double num,double sum){
           if (sum>=0 && num>=0)
            return   sum =sum + num;
           else
             return -1;
         
       }
       public static float get_balance(double pay,double Total){
        
        if (pay<Total)
             return -1;          
        else
           return (float)(pay-Total); 
       }
}
