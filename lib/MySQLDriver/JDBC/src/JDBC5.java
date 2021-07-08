//data insertion by taking input from user

import java.sql.*;
import java.util.*;

public class JDBC5 {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter product id: ");
        String id=sc.nextLine();
        System.out.print("Enter product name: ");
        String name=sc.nextLine();
        System.out.print("Enter product category: ");
        String cat=sc.nextLine();
        System.out.print("Enter product price: ");
        int price=sc.nextInt();
        
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc ?autoReconnect=true&useSSL=false ","root","password");
            if(con!=null)
                System.out.println("Connection established successfully...");
            else
                System.out.println("Error occured...!!");
            
            Statement stmt= con.createStatement();
            String query= "insert into product values("+id+",'"+name+"','"+cat+"',"+price+")";
            int i1= stmt.executeUpdate(query);
            if(i1>0)
                System.out.println("Data inserted successfully...");
            else
                System.out.println("Data is not inserted...!!");
        }
        catch(ClassNotFoundException | SQLException e){
            e.printStackTrace();
        }
    }
}
