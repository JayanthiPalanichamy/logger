import java.util.HashMap;

public class Logger {
    Destination destination;
    HashMap<DestinationType,String> reflexionMapper ;

    public Logger(DestinationType destinationType) {
        this.destination = selectDestination(destinationType);
    }

    public void logError(String message) {
       destination.logMessage(message);
    }

    private Destination selectDestination(DestinationType destinationType) {
        switch (destinationType) {
            case CONSOLE: {
                return new ConsoleDestination();
            }
            case FILE: {
                return new FileDestination();
            }
            case DATABASE: {
                return new DatabaseDestination();
            }
            default:
                return null;
        }
    }

    public void logWarning(String message) {
        destination.logMessage(message);
    }
}
