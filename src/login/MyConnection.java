
package login;


import java.sql.*;

public class MyConnection {
    
    
    private final static String user="root";
    private final static String pass="";
    private final static String uri="jdbc:mysql://localhost/registration_data";
    private final static String add="jdbc:mysql://localhost/sales";
    
    
/****************************User DataBase**********************************************/
public static  Connection connecct() {
        Connection con =null;
 try{
 
      con =  DriverManager.getConnection(uri,user,pass); 
}catch(SQLException ex){
            System.out.println(ex.getMessage());
}
return con;
}
/****************************Product DataBase**********************************************/
public static Connection connecct_2() {
        Connection con_2 =null;
 try{
 
      con_2 =  DriverManager.getConnection(add,user,pass); 
}catch(SQLException ex){
            System.out.println(ex.getMessage());
}
return con_2;
}

}