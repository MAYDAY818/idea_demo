package com.spring.demo01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringTest {
    public static void main(String[] args) {
        ApplicationContext ctx=new ClassPathXmlApplicationContext("beans.xml");
        DeptServiImp deptImpl=(DeptServiImp) ctx.getBean("deptService");
        deptImpl.addDept("烤肉饭部门");
        System.out.println(2^2);
        System.out.println(Math.pow(2,2));
    }
}
