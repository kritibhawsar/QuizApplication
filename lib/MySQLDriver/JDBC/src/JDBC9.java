//insertion using obj of preparedstatement

import java.sql.*;
public class JDBC9 {
    public static void main(String args[]) throws Exception{
        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc ?autoReconnect=true&useSSL=false", "root", "password");
            
            if(con!=null)
                System.out.println("Connection established successfully...");
           else
                System.out.println("Error occured...!!");
            
            String query = "insert into student values(64,'kriti bhawsar','khargone','kritibhawsarit19@gmail.com')";    
            PreparedStatement ps = con.prepareStatement(query);
            int i = ps.executeUpdate();
            if(i>0)
                System.out.println("Data Inserted successfully..!!");
            else
                System.out.println("Error Occured..!!");
    }
}
