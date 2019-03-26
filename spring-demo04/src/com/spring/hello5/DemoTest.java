package com.spring.hello5;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DemoTest {
    public static void main(String []args){
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("spring-EL5.xml");
        Customer customer=(Customer)applicationContext.getBean("customerBean");
        System.out.println(customer.toString());
    }
}
