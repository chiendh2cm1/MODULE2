package com.codegym;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TriangleClassifierTest {
    @Test
    void checkTriangleClassifier121() {
        int a = -1;
        int b = 2;
        int c = 1;
        String expect = "a,b,c không là 3 cạnh của tam giác";
        String result = TriangleClassifier.checkTriangleClassifier(a, b, c);
        assertEquals(expect, result);
    }


    @Test
    void checkTriangleClassifier345() {
        int a = 3;
        int b = 4;
        int c = 5;
        String expect = "a,b,c là 3 cạnh của tam giác";
        String result = TriangleClassifier.checkTriangleClassifier(a, b, c);
        assertEquals(expect, result);
    }

    @Test
    void checkTriangleClassifier333() {
        int a = 3;
        int b = 3;
        int c = 3;
        String expect = "a,b,c là 3 cạnh của tam giác đều";
        String result = TriangleClassifier.checkTriangleClassifier(a, b, c);
        assertEquals(expect, result);
    }

    @Test
    void checkTriangleClassifier335() {
        int a = 3;
        int b = 3;
        int c = 3;
        String expect = "a,b,c là 3 cạnh của tam giác đều";
        String result = TriangleClassifier.checkTriangleClassifier(a, b, c);
        assertEquals(expect, result);
    }
}