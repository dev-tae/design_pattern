package main.java.singletonexample;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnectionManager {
    private static DatabaseConnectionManager instance;
    private Connection connection;

    private DatabaseConnectionManager() {
        // Private constructor prevents instantiation from other classes
        try {
            String url = "jdbc:mysql://localhost:3306/yourDatabase";
            String user = "yourUser";
            String password = "yourPassword";
            connection = DriverManager.getConnection(url, user, password);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static synchronized DatabaseConnectionManager getInstance() {
        if (instance == null) {
            instance = new DatabaseConnectionManager();
        }
        return instance;
    }

    public Connection getConnection() {
        return connection;
    }
}
