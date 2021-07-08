// use of ? 

import java.sql.*;
public class JDBC12 {
    public static void main(String args[])throws Exception {
        Connection con= GetConnection2.getConnect();
        String query="insert into student values(?,?,?,?)";
        PreparedStatement ps= con.prepareStatement(query);
        ps.setInt(1, 1067);
        ps.setString(2, "krishna bhawsar");
        ps.setString(4, "krishnabhawsar@gmail.com");
        ps.setString(3, "khargone");
        PreparedStatement ps2= con.prepareStatement(query);
        ps2.setInt(1, 1066);
        ps2.setString(2, "prachi bhawsar");
        ps2.setString(4, "prachibhawsar@gmail.com");
        ps2.setString(3, "khargone");
        int i=ps.executeUpdate();
        int i2=ps2.executeUpdate();
        if(i>0 && i2>0)
            System.out.println("Data inserted successfully...");
        else
            System.out.println("Data is not inserted...!!");
    }
}
