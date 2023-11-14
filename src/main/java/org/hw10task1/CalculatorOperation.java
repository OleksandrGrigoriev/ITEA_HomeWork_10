package org.hw10task1;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@Documented
public @interface CalculatorOperation {
    /**
     * @return first operand of arithmetic operation
     */
    int operandOne();

    /**
     * @return second operand of arithmetic operation
     */
    int operandTwo();
}
