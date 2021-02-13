package sample.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class ConnectionDataBase {

    private final String USER = "user";
    private final String PASSWORD = "pass";
    private final String URL = "jdbc:mysql://localhost:3306/projects";

    public void connectionDataBase() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
        Statement statement = connection.createStatement();
    }


}
