package com.test.rmit;

import static org.junit.jupiter.api.Assertions.*;
class CalculatorTest {

    @org.junit.jupiter.api.Test
    void add() {
        Calculator cacl1 = new Calculator();
        assertEquals(15, cacl1.add(10, 5));
    }

    @org.junit.jupiter.api.Test
    void subtract() {

    }

    @org.junit.jupiter.api.Test
    void multiply() {
    }

    @org.junit.jupiter.api.Test
    void divide() {
    }
}