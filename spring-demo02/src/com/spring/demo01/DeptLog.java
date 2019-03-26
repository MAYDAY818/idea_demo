package com.spring.demo01;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

public class DeptLog {
    public void beForeLog(JoinPoint jp){
        System.out.println("开始日志");
    }
    public void afterLog(JoinPoint jp){
        System.out.println("结束日志");
    }
    public void aroundLog(ProceedingJoinPoint pi){
        System.out.println("开始环绕日志");
        try {
            pi.proceed();
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
        System.out.println("结束环绕日志");
    }
    public void overLog(JoinPoint jp){
        System.out.println("方法执行完毕");
    }
}
