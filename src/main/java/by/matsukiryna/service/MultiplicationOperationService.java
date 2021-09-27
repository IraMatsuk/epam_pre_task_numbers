package by.matsukiryna.service;

import by.matsukiryna.factory.CustNumber;
import by.matsukiryna.factory.NumbersFactory;

public class MultiplicationOperationService {
    public CustNumber mult(CustNumber firstNumber, CustNumber secondNumber) {
        CustNumber tmp = NumbersFactory.createNumber(firstNumber.toString());
        tmp.mult(secondNumber);
        return tmp;
    }
}
