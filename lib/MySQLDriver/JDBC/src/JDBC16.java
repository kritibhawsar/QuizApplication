//

import java.sql.*;
public class JDBC16 {
    public static void main(String args[])throws Exception{
        Connection con=GetConnection2.getConnect();
        String query = "select * from student";    
        PreparedStatement ps = con.prepareStatement(query,ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
        ResultSet rs = ps.executeQuery();
        //rs.absolute(1);
        //rs.first();
        //rs.beforeFirst();
        //rs.last();
        //this four will not work because of type scroll insensitive
        rs.afterLast();
        while(rs.previous())
            System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3)+"\t"+rs.getString(4));
    }
}
