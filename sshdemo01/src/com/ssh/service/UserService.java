package com.ssh.service;

import com.ssh.bean.User;
import com.ssh.dao.UserDao;
import com.ssh.serviceImpl.UserServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserService implements UserServiceImpl {
    @Override
    public void addUser(User user) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserDao userDao= (UserDao) ctx.getBean("userDao");
        userDao.addUser(new User(user.getName(),user.getAge(),user.getSex(),user.getAdress()));
        System.out.println("add user "+user.toString());
    }
}
