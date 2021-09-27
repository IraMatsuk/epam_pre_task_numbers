package by.matsukiryna.service;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class SubtractionOperationService {
    static Logger logger = LogManager.getLogger();
    private double result;
    public double subtract(double firstNumber, double secondNumber) {
        result = firstNumber - secondNumber;
        logger.info(result);
        return result;
    }
}
