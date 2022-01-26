package com.codegym;

public class TriangleClassifier {

    public static String checkTriangleClassifier(int a, int b, int c) {
        if (a > 0 & b > 0 & c > 0) {
            if (a + b > c && b + c > a && c + a > b) {
                if (a == b && b == c) {
                    return "a,b,c là 3 cạnh của tam giác đều";
                } else if (a == b || b == c || c == a) {
                    return "a,b,c là 3 cạnh của tam giác cân";
                } else {
                    return "a,b,c là 3 cạnh của tam giác";
                }
            } else {
                return "a,b,c không là 3 cạnh của tam giác";
            }
        } else {
            return "a,b,c không là 3 cạnh của tam giác";
        }
    }
}