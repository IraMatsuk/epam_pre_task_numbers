package by.matsukiryna.service;

import by.matsukiryna.factory.CustNumber;
import by.matsukiryna.factory.NumbersFactory;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class DivisionOperationService {
    public CustNumber divide(CustNumber firstNumber, CustNumber secondNumber) {
        CustNumber tmp = NumbersFactory.createNumber(firstNumber.toString());
        tmp.div(secondNumber);
        return tmp;
    }
}
