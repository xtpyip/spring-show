package com.pyip.edu.annotion;
import java.lang.annotation.*;
@Documented
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface MyTransactional { // 开启事务，指定事务
}
