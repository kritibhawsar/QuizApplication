

import java.sql.*;
public class JDBC13 {
    public static void main(String args[])throws Exception{
        Connection con=GetConnection.getConnect();
        String query="update student set name=? where rno=?";
        PreparedStatement ps= con.prepareStatement(query);
        ps.setString(1, "akshay bhawsar");
        ps.setInt(2, 1067);
        int i = ps.executeUpdate();
        if(i>0)
            System.out.println("Data updated successfully...");
        else
            System.out.println("Data is not updated...!!");
    }
}
