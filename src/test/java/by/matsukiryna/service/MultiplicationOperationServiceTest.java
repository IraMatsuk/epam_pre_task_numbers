package by.matsukiryna.service;

import by.matsukiryna.factory.CustNumber;
import by.matsukiryna.factory.DoubleCustNumber;
import by.matsukiryna.factory.NumbersFactory;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MultiplicationOperationServiceTest {
    MultiplicationOperationService multiplicationOperationService = new MultiplicationOperationService();

    @Test
    void multipleCustomNumbers() {
        double expected = 25.0;
        double firstNumber = 5.0;
        double secondNumber = 5.0;
        CustNumber custNumber = NumbersFactory.createNumber(String.valueOf(firstNumber));
        CustNumber custNumber2 = NumbersFactory.createNumber(String.valueOf(secondNumber));
        DoubleCustNumber doubleCustNumber = (DoubleCustNumber) custNumber;
        DoubleCustNumber doubleCustNumber2 = (DoubleCustNumber) custNumber2;
        doubleCustNumber.mult(doubleCustNumber2);
        assertEquals(doubleCustNumber.getNumber(), expected);
    }
}