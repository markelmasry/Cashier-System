
package login;


import java.sql.*;

public class MyConnection {
    
    private final static String user="root";
    private final static String pass="";
    private final static String uri="jdbc:mysql://localhost/cashier_system_database";
   
    
/****************************Our DataBase***********************************************/
public static  Connection connecct() {
        Connection con =null;
 try{
 
      con =  DriverManager.getConnection(uri,user,pass); 
}catch(SQLException ex){
            System.out.println(ex.getMessage());
}
return con;
}

}