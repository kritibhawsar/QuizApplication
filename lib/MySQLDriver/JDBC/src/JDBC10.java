//using another class for connection code

import java.sql.*;
public class JDBC10 {
    public static void main(String args[])throws Exception{
        Connection con= GetConnection.getConnect();  
        String query="update student set rno=1064 where name='kriti bhawsar'";
        PreparedStatement ps= con.prepareStatement(query);
        int i = ps.executeUpdate();
        if(i>0)
            System.out.println("Data Updated successfully...");
        else
            System.out.println("Error Occured...!!");
    }
}
