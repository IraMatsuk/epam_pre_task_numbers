package by.matsukiryna.service;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class DivisionOperationService {
    static Logger logger = LogManager.getLogger();
    private double result;

    public double divide(double firstNumber, double secondNumber) {
        try {
            result = firstNumber / secondNumber;
            if ((result == Double.POSITIVE_INFINITY)
                    || (result == Double.NEGATIVE_INFINITY)) {
                throw new ArithmeticException();
            }
        } catch (ArithmeticException e) {
            logger.error(e);
        }
        return result;
    }
}
