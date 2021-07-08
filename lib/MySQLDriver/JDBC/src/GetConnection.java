import java.sql.*;
public class GetConnection {
    private static final String Driver="com.mysql.jdbc.Driver"; //private bcz no one should access it and final bcz no one should change it
    private static final String URL="jdbc:mysql://localhost:3306/jdbc ?autoReconnect=true&useSSL=false";
    private static final String USERNAME="root";
    private static final String PASSWORD="password";
    static Connection getConnect(){
        Connection con=null;
        try{
            Class.forName(Driver);
            con=DriverManager.getConnection(URL,USERNAME,PASSWORD);
            if(con!=null)
                System.out.println("Connection established successfully...");
            else
                System.out.println("Error occured while making connection...!!");
            
        }
        catch(SQLException | ClassNotFoundException e){
            e.printStackTrace();
        }
        return con;
    }
}
