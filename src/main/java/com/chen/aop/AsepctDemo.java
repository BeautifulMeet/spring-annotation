package com.chen.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class AsepctDemo {

    @Pointcut("execution(public String com.chen.aop.MathUtil.*(..))")
    public void pointcut() {
        System.out.print("---------------------pointcut");
    }


    @Before("pointcut()")
    public void logBefore(){
        System.out.print("---------------------before");
    }
}
