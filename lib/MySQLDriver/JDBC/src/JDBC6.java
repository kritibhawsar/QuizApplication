//data updation

import java.sql.*;
public class JDBC6 {
    public static void main(String args[]) throws SQLException,ClassNotFoundException{
        Class.forName("com.mysql.jdbc.Driver");
        Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc ?autoReconnect=true&useSSL=false","root","password");
        if(con!=null)
            System.out.println("Connection established successfully...");
        else
            System.out.println("Error Occured...!!");
        Statement stmt= con.createStatement();
        String query="update product set pprice=95 where pid=5";
        int status=stmt.executeUpdate(query);
        if(status>0)
            System.out.println("Data updated successfully...");
        else
            System.out.println("Data is not updated...!!");
    }
}
