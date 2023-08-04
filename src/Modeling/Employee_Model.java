/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modeling;

/**
 *
 * @author marke
 */
public class Employee_Model {
    
    private String Id,FirstNmae,LastNmae,Email_phone,Passowrd;

    public Employee_Model(String id,String FirstNmae, String LastNmae, String Email_phone, String Passowrd) {
        this.Id = id;
        this.FirstNmae = FirstNmae;
        this.LastNmae = LastNmae;
        this.Email_phone = Email_phone;
        this.Passowrd = Passowrd;
    }

    public String getid() {
        return Id;
    }
    public String getFirstNmae() {
        return FirstNmae;
    }

    public void setFirstNmae(String FirstNmae) {
        this.FirstNmae = FirstNmae;
    }

    public String getLastNmae() {
        return LastNmae;
    }

    public void setLastNmae(String LastNmae) {
        this.LastNmae = LastNmae;
    }

    public String getEmail_phone() {
        return Email_phone;
    }

    public void setEmail_phone(String Email_phone) {
        this.Email_phone = Email_phone;
    }

    public String getPassowrd() {
        return Passowrd;
    }

    public void setPassowrd(String Passowrd) {
        this.Passowrd = Passowrd;
    }

    @Override
    public String toString() {
        return "Employee_Model{" + "Id=" + Id + ", FirstNmae=" + FirstNmae + ", LastNmae=" + LastNmae + ", Email_phone=" + Email_phone + ", Passowrd=" + Passowrd + '}';
    }
    
}
