package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;



/*private String url = "jdbc:mysql://localhost:3306/StudentRecordSystem";
    private String user = "root";
    private String pass = "1234";*/

/*private String url = "jdbc:mysql://sql6.freemysqlhosting.net:3306/sql6133728";
private String user = "sql6133728";
private String pass = "2TzHWLPjxB";*/



public class DBConnection {
    private Connection connection;
    private String url = "jdbc:mysql://localhost:3306/StudentRecordSystem";
    private String user = "root";
    private String pass = "";

    public Connection getConnection() throws SQLException {
        connection = DriverManager.getConnection(url,user,pass);
        return connection;
    }

}
