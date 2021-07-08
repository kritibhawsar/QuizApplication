//

import java.sql.*;
public class JDBC17 {
    public static void main(String args[])throws Exception{
        Connection con=GetConnection2.getConnect();
        String query = "select * from student";    
        PreparedStatement ps = con.prepareStatement(query,ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
        ResultSet rs = ps.executeQuery();
        while(rs.next())
        {
            if(rs.getInt(1)==1067)
            {
                rs.updateString(2,"shivam bhawsar");
                rs.updateRow();
            }
            System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3)+"\t"+rs.getString(4));
        }
    }
}
