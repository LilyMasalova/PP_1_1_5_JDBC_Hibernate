package jm.task.core.jdbc.util;

import java.sql.*;

public class Util {
    // реализуйте настройку соеденения с БД
    private static final String db_driver = "com.mysql.cj.jdbc.Driver";
    private static final String URL = "jdbc:mysql://localhost:3306/mydbtest";
    private static final String username = "root";
    private static final String password = "root";

    private static Connection connection;

    public static Connection getConnection() {

        try {
            Class.forName(db_driver);
            connection = DriverManager.getConnection(URL, username, password);
        } catch (ClassNotFoundException | SQLException e) {
            throw new RuntimeException(e);
        }

        return connection;
    }


}
