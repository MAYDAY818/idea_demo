package com.spring.demo01;

public class DeptServiImp implements DeptService {
    @Override
    public void addDept(String depa) {
        System.out.println("添加了部门"+depa);
    }
}
