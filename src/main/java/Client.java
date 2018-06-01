

public class Client {
    public int divide(int numerator, int denominator) {
        try {
            return numerator / denominator;
        } catch (ArithmeticException e) {
            Logger logger = new Logger();
            logger.logError("Divide By Zero", DestinationType.CONSOLE);
            logger.logError("Divide by Zero", DestinationType.FILE);
            logger.logError("Divide By Zero", DestinationType.DATABASE);
        }
        return 0;
    }
}
