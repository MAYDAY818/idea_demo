package com.test1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TextMain {
    public static void main(String[] args){
        ApplicationContext acx = new ClassPathXmlApplicationContext("spring-config.xml");
        IntroduceDemo id = (IntroduceDemo) acx.getBean("IntroduceDemo");
        id.intrduce();
    }
}
