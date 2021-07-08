// interface to declear objects for connection establishment
//creating an interface for this so that no one can access it and cannot change it
public interface GetDetailsInterface {
    String DRIVER="com.mysql.jdbc.Driver";
    String URL="jdbc:mysql://localhost:3306/jdbc ?autoReconnect=true&useSSL=false";
    String USERNAME="root";
    String PASSWORD="password";
}
