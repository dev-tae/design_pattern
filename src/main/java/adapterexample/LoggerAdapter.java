package main.java.adapterexample;

public class LoggerAdapter implements OldLogger {
    private CloudLogger cloudLogger;

    public LoggerAdapter(CloudLogger cloudLogger) {
        this.cloudLogger = cloudLogger;
    }

    @Override
    public void logMessage(String message) {
        cloudLogger.saveToCloud(message);
    }
}
