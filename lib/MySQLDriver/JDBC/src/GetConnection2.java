
import java.sql.*;
public class GetConnection2 {
    static Connection getConnect(){
        Connection con=null;
        try{
            Class.forName(GetDetailsInterface.DRIVER);
            con=DriverManager.getConnection(GetDetailsInterface.URL,GetDetailsInterface.USERNAME,GetDetailsInterface.PASSWORD);
            if(con!=null)
                System.out.println("Connection established successfully...");
            else
                System.out.println("Error occured...!!");
        }
        catch(SQLException | ClassNotFoundException e){
            e.printStackTrace();
        }
        return con;
    }
}
