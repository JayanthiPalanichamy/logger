

public class Client {
    public int divide(int numerator, int denominator)  {
        try {
            return numerator/denominator;
        }
        catch (ArithmeticException e){
            Logger logger = new Logger();
            logger.errorLog("Divide By Zero");
        }
        return -1;
    }
}
