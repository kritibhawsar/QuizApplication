//ResultSetMetaData and databasemetadata  
import java.sql.*;
public class JDBC14 {
    public static void main(String args[]) throws Exception{
        Connection con=GetConnection.getConnect();
        String query="select * from student";
        PreparedStatement ps= con.prepareStatement(query);
        ResultSet rs=ps.executeQuery();
        ResultSetMetaData rsd= rs.getMetaData();
        System.out.println("Table details- ");
        System.out.println("Total no. of columns : "+rsd.getColumnCount());
        System.out.println("Column name : "+rsd.getColumnName(2));
        System.out.println("Column type name : "+rsd.getColumnTypeName(2));   
        
        DatabaseMetaData dbmd = con.getMetaData();
        System.out.println("Database details- ");
        System.out.println("Driver Name : "+dbmd.getDriverName());
        System.out.println("Driver version : "+dbmd.getDriverVersion());
        System.out.println("Database product name : "+dbmd.getDatabaseProductName());
        System.out.println("Database product version : "+dbmd.getDatabaseProductVersion());
    }
}
