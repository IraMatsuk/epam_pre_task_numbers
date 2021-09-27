package by.matsukiryna.service;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MultiplicationOperationServiceTest {
    MultiplicationOperationService multiplicationOperationService = new MultiplicationOperationService();
    @BeforeEach
    void setUp() {
    }

    @Test
    void multiply() {
        assertEquals(25.0, multiplicationOperationService.multiply(5.0, 5.0));
    }
}