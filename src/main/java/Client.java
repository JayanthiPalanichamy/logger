

public class Client {
    public int divide(int numerator, int denominator) {
        try {
            return numerator / denominator;
        } catch (ArithmeticException e) {
            Logger logger = new Logger();
            logger.errorLog("Divide By Zero",DestinationType.CONSOLE);
            logger.errorLog("Divide by Zero",DestinationType.FILE);
            logger.errorLog("Divide By Zero",DestinationType.DATABASE);
        }
        return 0;
    }
}
