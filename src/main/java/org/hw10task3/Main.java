package org.hw10task3;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Class<?> mathSumClass = MathSum.class;

        Method method = mathSumClass.getMethod("mathSum", int.class, int.class);
        MathAnno calcOperation = method.getAnnotation(MathAnno.class);

        System.out.println(method.invoke(mathSumClass, calcOperation.number1(), calcOperation.number2()));
    }
}
