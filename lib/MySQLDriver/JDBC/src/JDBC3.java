//table creation

import java.sql.*;
public class JDBC3 {
    public static void main(String args[]){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc ?autoReconnect=true&useSSL=false","root","password");
            if(con!=null)
                System.out.println("Connection established successfully...");
            else
                System.out.println("Error occured while connecting...!!");
            
            Statement stmt=con.createStatement();
            String query="create table product(pid int primary key, pname varchar(50), pcat varchar(50), pprice int )";
            boolean status=stmt.execute(query);  //returns true or false
            System.out.println(status);
            System.out.println("Table created successfully...");
            con.close();
        }
        catch(ClassNotFoundException | SQLException e){
            e.printStackTrace();
        }
    }
}
