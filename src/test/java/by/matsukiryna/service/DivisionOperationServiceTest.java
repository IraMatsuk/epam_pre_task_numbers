package by.matsukiryna.service;

import by.matsukiryna.factory.CustNumber;
import by.matsukiryna.factory.DoubleCustNumber;
import by.matsukiryna.factory.NumbersFactory;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DivisionOperationServiceTest {
    @Test
    void divisionCustomNumbers() {
        double expected = 3.0;
        double firstNumber = 30.0;
        double secondNumber = 10.0;
        CustNumber custNumber = NumbersFactory.createNumber(String.valueOf(firstNumber));
        CustNumber custNumber2 = NumbersFactory.createNumber(String.valueOf(secondNumber));
        DoubleCustNumber doubleCustNumber = (DoubleCustNumber) custNumber;
        DoubleCustNumber doubleCustNumber2 = (DoubleCustNumber) custNumber2;
        doubleCustNumber.div(doubleCustNumber2);
        assertEquals(doubleCustNumber.getNumber(), expected);
    }
}