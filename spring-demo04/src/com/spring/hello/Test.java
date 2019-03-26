package com.spring.hello;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String [] args){
        ApplicationContext context=new ClassPathXmlApplicationContext("spring-EL.xml");
        Customer obj=(Customer)context.getBean("customerBean");
        System.out.println(obj);
    }
}
