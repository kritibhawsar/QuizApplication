import java.sql.*;
public class JDBC11 {
    public static void main(String args[]) throws Exception{
        Connection con=GetConnection2.getConnect();
        String query="select * from student";
        PreparedStatement ps=con.prepareStatement(query);
        ResultSet rs= ps.executeQuery();
        if(rs.next())
            System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3)+"\t"+rs.getString(4));
        con.close();
    }
}
