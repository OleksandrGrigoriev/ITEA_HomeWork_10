package org.hw10task1;

public class Calculator {

    /**
     * @return sum of two numbers
     */
    @CalculatorOperation(operandOne = 10, operandTwo = 20)
    public int add(int operandOne, int operandTwo) { return operandOne + operandTwo; }

    /**
     * @return difference of two numbers
     */
    @CalculatorOperation(operandOne = 10, operandTwo = 20)
    public int sub(int operandOne, int operandTwo) {
        return operandOne - operandTwo;
    }

    /**
     * @return product of two numbers
     */
    @CalculatorOperation(operandOne = 10, operandTwo = 20)
    public int mul(int operandOne, int operandTwo) {
        return operandOne * operandTwo;
    }

    /**
     * @return resultat of division of two numbers
     */
    @CalculatorOperation(operandOne = 10, operandTwo = 20)
    public double div(int operandOne, int operandTwo) {
        if (operandTwo == 0) throw new IllegalArgumentException("Division by zero!");
        return operandOne / (double)operandTwo;
    }
}
