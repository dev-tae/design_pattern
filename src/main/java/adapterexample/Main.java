package main.java.adapterexample;

public class Main {
    public static void main(String[] args) {
        OldLogger fileLogger = new FileLogger();
        fileLogger.logMessage("This is a file log!");

        CloudLogger cloud = new CloudLogger();
        OldLogger cloudAdapter = new LoggerAdapter(cloud);
        cloudAdapter.logMessage("This is a cloud log through adapter!");
    }
}
