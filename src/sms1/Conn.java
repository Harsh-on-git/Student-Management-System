
package sms1;
import java.sql.*;
public class Conn {
    Statement s;
    Connection c;

     Conn () {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            c = DriverManager.getConnection("jdbc:mysql:///sms", "root", "MySQL@998485");
            s = c.createStatement();
            
        } catch (Exception e) {
            e.printStackTrace();
        }
} 
    public static void main(String[]args){
        new Conn();
    }
    
}
