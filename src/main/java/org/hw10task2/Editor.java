package org.hw10task2;


import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Documented
@Inherited
public @interface Editor {
    String name() default "NodePad++";
    String version() default  "8.5.8";
    int date() default 2023;
}
