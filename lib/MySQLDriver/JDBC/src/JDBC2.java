//databse creation

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.DriverManager;
import java.sql.Statement;
public class JDBC2 {
    public static void main(String args[]){
        try{
            Class.forName("com.mysql.jdbc.Driver");  //1.regster jdbc driver
            Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306?autoReconnect=true&useSSL=false","root","password");
            //2.create connection
            //The DriverManager class acts as an interface between user and drivers
            if(con!=null)
                System.out.println("Connection created successfully...");
            else
                System.out.println("Error occured...!!");
            
            Statement smt=con.createStatement();  //3.create statement
            smt.execute("create database jdbc");  //4.execute query  //execute query returns object of ResultSet
        
            con.close();   //5.close connection
        }
        catch(SQLException | ClassNotFoundException e){
            e.printStackTrace();
        }
    }
}
