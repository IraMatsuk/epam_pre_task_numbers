package by.matsukiryna.service;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class MultiplicationOperationService {
    static Logger logger = LogManager.getLogger();
    private double result;

    public double multiply(double firstNumber, double secondNumber) {
        result = firstNumber * secondNumber;
        logger.info(result);
        return result;
    }
}
