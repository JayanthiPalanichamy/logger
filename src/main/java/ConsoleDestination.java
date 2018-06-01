public class ConsoleDestination implements Loggable {
    @Override
    public void logMessage(String message) {
        System.out.println(message);
    }
}
