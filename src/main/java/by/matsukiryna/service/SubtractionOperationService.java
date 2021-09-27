package by.matsukiryna.service;

import by.matsukiryna.factory.CustNumber;
import by.matsukiryna.factory.NumbersFactory;

public class SubtractionOperationService {
    public CustNumber subtract(CustNumber firstNumber, CustNumber secondNumber) {
        CustNumber tmp = NumbersFactory.createNumber(firstNumber.toString());
        tmp.subtr(secondNumber);
        return tmp;
    }
}
