package com.pyip.edu.annotion;
import java.lang.annotation.*;
@Documented
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface MyService { // 组件的一种，指定业务层的名称
    String value() default "";
}