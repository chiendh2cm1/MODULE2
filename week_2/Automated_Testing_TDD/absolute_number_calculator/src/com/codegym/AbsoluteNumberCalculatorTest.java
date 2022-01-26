package com.codegym;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AbsoluteNumberCalculatorTest {
@Test
void testFindAbsolute0() {
    int number = 0;
    int expected = 0;

    int result = AbsoluteNumberCalculator.findAbsolute(number);
    assertEquals(expected, result);
}
@Test
    void testFindAbsolute9(){
    int number = -9;
    int expected = 9;
    int result = AbsoluteNumberCalculator.findAbsolute(number);
    assertEquals(expected,result);
}
}