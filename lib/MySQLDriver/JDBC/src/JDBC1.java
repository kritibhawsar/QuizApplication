//connection establishment

import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;
import javax.swing.JOptionPane;
public class JDBC1 {
    public static void main(String args[]){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306 ?autoReconnect=true&useSSL=false ","root","password");
            //jdbc is api ,mysql is databse, localhost is servername, 3306 is port number
            if(con!=null){
                System.out.println("Connection established successfully...");
                JOptionPane.showMessageDialog(null, "Kriti Bhawsar");
            }
            else
                System.out.println("Error occured...!!");
        }
        catch(ClassNotFoundException | SQLException e){
            e.printStackTrace();
            //JOptionPane.showMessageDialog(null, "Kriti is best");
        }
    }
}
