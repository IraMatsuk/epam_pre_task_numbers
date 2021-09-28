package by.matsukiryna.service;

import static org.junit.jupiter.api.Assertions.*;

import by.matsukiryna.factory.CustNumber;
import by.matsukiryna.factory.DoubleCustNumber;
import by.matsukiryna.factory.NumbersFactory;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class AddingOperationServiceTest {
    AddingOperationService addingOperationService = new AddingOperationService();
    @BeforeEach
    void setUp() {
    }

    @Test
    void add() {
        assertEquals(20.0, 30.0, 10.0);
    }

    @Test
    void addCustomNumbers() {
        double expected = 40.0;
        double firstNumber = 30.0;
        double secondNumber = 10.0;
        CustNumber custNumber = NumbersFactory.createNumber(String.valueOf(firstNumber));
        CustNumber custNumber2 = NumbersFactory.createNumber(String.valueOf(secondNumber));
        DoubleCustNumber doubleCustNumber = (DoubleCustNumber) custNumber;
        DoubleCustNumber doubleCustNumber2 = (DoubleCustNumber) custNumber2;
        doubleCustNumber.add(doubleCustNumber2);
        assertEquals(doubleCustNumber.getNumber(), expected);
    }
}