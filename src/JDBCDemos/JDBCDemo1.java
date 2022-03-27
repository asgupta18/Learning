package JDBCDemos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCDemo1 {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        // 1. Loading a driver

        Class.forName("com.mysql.cj.jdbc.Driver");

        //2. Create a connection

        String username = "root";
        String password = "root";
        String url = "jdbc:mysql://localhost:3306/8ambatch";

        Connection con = DriverManager.getConnection(url, username,password);

        //3. Create Statement

        Statement st = con.createStatement();

        //4. Execute Query







    }
}
