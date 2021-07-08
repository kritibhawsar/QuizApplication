//use of preparedstatement

import java.sql.*;
public class JDBC8 {
    public static void main(String args[]) throws Exception{
        Class.forName("com.mysql.jdbc.Driver");
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc ?autoReconnect=true&useSSL=false","root","password");
        if(con!=null)
            System.out.println("Connection established successfully...");
        else
            System.out.println("Error occured...!!");
        String query="create table student(rno int ,name varchar(45),address varchar(45),email varchar(45),primary key(rno))";
        PreparedStatement stmt=con.prepareStatement(query);
        stmt.execute(query);
        System.out.println("Table created successfully...");
    }
}
