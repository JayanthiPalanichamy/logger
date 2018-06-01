public class ConsoleDestination implements Destination {
    @Override
    public void logMessage(String message) {
        System.out.println(message);
    }
}
