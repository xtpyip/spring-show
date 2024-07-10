package com.pyip.edu.annotion;
import java.lang.annotation.*;
@Documented
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface MyRepository { // 也是组件中的一种，仓库或mapper，指定对sql操作
    String value() default "";
}
