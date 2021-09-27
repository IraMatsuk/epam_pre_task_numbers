package by.matsukiryna.service;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DivisionOperationServiceTest {
    DivisionOperationService divisionOperationService = new DivisionOperationService();

    @BeforeEach
    void setUp() {
    }

    @Test
    void divide() {
        double actual = divisionOperationService.divide(10.0, 5.0);
        double expected = 2.0;
        assertEquals(actual, expected);
    }

    @Test
    @DisplayName("Division by zero should throw an ArithmeticException")
    void divideByZero() {
        Exception exception = assertThrows(ArithmeticException.class, () -> divisionOperationService.divide(10.0, 0.0));
        assertEquals("/ by zero", exception.getMessage());
    }
}