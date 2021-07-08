//data insertion

import java.sql.*;
public class JDBC4 {
    public static void main(String srgs[]) throws Exception{
        Class.forName("com.mysql.jdbc.Driver");
        Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc ?autoReconnect=true&useSSL=false","root","password");
        Statement stmt=con.createStatement();
        if(con!=null)
            System.out.println("Connection established successfully...");
        else
            System.out.println("Error occured...!!");
        
        String query="insert into product values(01,'jeans','cloth',600)";
        int i= stmt.executeUpdate(query);
        if(i>0)
            System.out.println("Data inserted successfully...");
        else
            System.out.println("Data is not inserted...!!");
    }
}
