

public class Logger {
    public void errorLog(String message, DestinationType destinationType) {
    switch (destinationType) {
        case CONSOLE: {
            new ConsoleDestination().logMessage(message);
            break;
        }
        case FILE: {
            new FileDestination().logMessage(message);
        }
        case DATABASE:{
            new DatabaseDestination().logMessage(message);
        }
    }
    }
}
