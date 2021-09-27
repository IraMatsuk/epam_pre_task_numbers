package by.matsukiryna.service;

import by.matsukiryna.factory.CustNumber;
import by.matsukiryna.factory.NumbersFactory;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.List;

public class AddingOperationService {
    static Logger logger = LogManager.getLogger();

    public CustNumber add(CustNumber firstNumber, CustNumber secondNumber) {
        CustNumber tmp = NumbersFactory.createNumber(firstNumber.toString());
        tmp.add(secondNumber);
        return tmp;
    }

}
