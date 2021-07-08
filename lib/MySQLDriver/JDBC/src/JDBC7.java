//retriving data from table in netbeans

import java.sql.*;
public class JDBC7 {
    public static void main(String args[]) throws SQLException, ClassNotFoundException{
        Class.forName("com.mysql.jdbc.Driver");
        Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc ?autoReconnect=true&useSSL=false","root","password");
        if(con!=null)
            System.out.println("Connection established successfully...");
        else
            System.out.println("Error Occured...!");
        Statement stmt= con.createStatement();
        String query="select * from product";
        ResultSet i=stmt.executeQuery(query);
        System.out.println("Table Data - ");
        while(i.next()){
            System.out.println(i.getInt(1)+"\t"+i.getString(2)+"\t"+i.getString(3)+"\t"+i.getInt(4));
        }
        con.close();
    }
}
