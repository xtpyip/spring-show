package com.pyip.edu.annotion;
import java.lang.annotation.*;
@Documented
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface MyComponent { // 每个组件都是bean对象，都有一个id(name)
    String value() default "";
}
