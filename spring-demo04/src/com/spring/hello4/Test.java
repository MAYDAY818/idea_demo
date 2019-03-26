package com.spring.hello4;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String [] args){
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("spring-EL4.xml");
        Customer customer=(Customer)applicationContext.getBean("customerBean");
        System.out.println(customer.toString());
    }
}
