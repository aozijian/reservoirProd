package com.nit.reservoir.service.interceptor;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Created by aozijian on 2017/5/15.
 * 访问注解： 在方法上加 @Access(login = false) 表示不做登录拦截
 */
@Target({ElementType.METHOD, ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface Access {
    boolean login() default false;
}
