package main.java.adapterexample;

public class FileLogger implements OldLogger {

    @Override
    public void logMessage(String message) {
        System.out.println("Logging to File: " + message);
    }
}
