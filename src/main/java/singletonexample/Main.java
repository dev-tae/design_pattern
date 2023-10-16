package main.java.singletonexample;

import java.sql.Connection;

public class Main {
    public static void main(String[] args) {
        // Get the only one object available
        DatabaseConnectionManager databaseManager = DatabaseConnectionManager.getInstance();
        Connection connection = databaseManager.getConnection();


        // Preventing initializing another object because of a private constructor
        //DatabaseConnectionManager databaseManager1 = new DatabaseConnectionManager();
    }
}
