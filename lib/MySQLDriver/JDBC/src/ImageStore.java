//store image in database

import java.sql.*;
import java.io.*;
public class ImageStore {
    public static void main(String args[]) throws Exception{
        Connection con= GetConnection.getConnect();
        PreparedStatement ps=con.prepareStatement("insert into imagetable values(?,?)");  
        ps.setString(1,"sono");  
  
        FileInputStream fin=new FileInputStream("E:\\kb.jpg");  
        ps.setBinaryStream(2,fin,fin.available());  
        int i=ps.executeUpdate();  
        System.out.println(i+" records affected");  
          
        con.close();  
    }
}
