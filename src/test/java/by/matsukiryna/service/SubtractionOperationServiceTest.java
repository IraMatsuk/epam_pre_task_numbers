package by.matsukiryna.service;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SubtractionOperationServiceTest {
    SubtractionOperationService subtractionOperationService = new SubtractionOperationService();
    @BeforeEach
    void setUp() {
    }

    @Test
    void subtract() {
        assertEquals(20.0, 30.0, 10.0);
    }
}