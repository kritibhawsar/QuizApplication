//resultset concurrency

import java.sql.*;
public class JDBC15 {
    public static void main(String args[])throws Exception{
        Connection con = GetConnection2.getConnect();
        String query = "select * from student";    
        PreparedStatement ps = con.prepareStatement(query,ResultSet.TYPE_FORWARD_ONLY);
        ResultSet rs = ps.executeQuery();
        while(rs.next())
            System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3)+"\t"+rs.getString(4));
    }
}
