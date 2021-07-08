
package quizapplication;
import java.sql.*;
public class DBConnection {
    static Connection con=null;
    public static Connection getConnect(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/QuizApp ?autoReset=true&useSSL=false","root","password");
        }
        catch(Exception e){
            e.printStackTrace();
        }
        return con;
    }
}
