package by.matsukiryna.service;

import by.matsukiryna.factory.CustNumber;
import by.matsukiryna.factory.NumbersFactory;

public class AddingOperationService {
    public CustNumber add(CustNumber firstNumber, CustNumber secondNumber) {
        CustNumber tmp = NumbersFactory.createNumber(firstNumber.toString());
        tmp.add(secondNumber);
        return tmp;
    }
}
