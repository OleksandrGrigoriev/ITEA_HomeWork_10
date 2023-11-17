package org.hw10task3;

public class MathSum {

    @MathAnno(number1 = 100, number2 = 150)
    public static int mathSum(int number1, int number2) {
        return number1 + number2;
    }
}
