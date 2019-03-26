package com.spring.hello3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String [] args){
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("spring-EL3.xml");
        Customer customer=(Customer)applicationContext.getBean("customerBean");
        System.out.println(customer.toString());
    }
}
