

public class Client {
    public int divide(int numerator, int denominator) {
        try {
            return numerator / denominator;
        } catch (ArithmeticException e) {
            Logger logger = new Logger();
            logger.errorLog("Divide By Zero",false,false,true);
            logger.errorLog("Divide By Zero",true,false,false);
        }
        return 0;
    }
}
