package org.hw10task1;

import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        String operation = "div";

        Class<?> calcClass = Calculator.class;

        try {
            Method aritmOperation = calcClass.getDeclaredMethod(operation, int.class, int.class);
            CalculatorOperation calcOperation = aritmOperation.getAnnotation(CalculatorOperation.class);
            if (operation.equalsIgnoreCase("add")) {
                System.out.println(calculator.add(calcOperation.operandOne(), calcOperation.operandTwo()));
            }
            if (operation.equalsIgnoreCase("sub")) {
                System.out.println(calculator.sub(calcOperation.operandOne(), calcOperation.operandTwo()));
            }
            if (operation.equalsIgnoreCase("mul")) {
                System.out.println(calculator.mul(calcOperation.operandOne(), calcOperation.operandTwo()));
            }
            if (operation.equalsIgnoreCase("div")) {
                System.out.println(calculator.div(calcOperation.operandOne(), calcOperation.operandTwo()));
            }
        } catch (NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
    }
}
