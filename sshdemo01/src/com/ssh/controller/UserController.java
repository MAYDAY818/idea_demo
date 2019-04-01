package com.ssh.controller;

import com.ssh.bean.User;
import com.ssh.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserController {
    @RequestMapping("addUser")
    public ModelAndView addUser(User user){
        System.out.println("controller addUser "+user.toString());
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserService userService= (UserService) ctx.getBean("userService");
        userService.addUser(user);
        ModelAndView mv = new ModelAndView("/WEB-INF/views/success.jsp");
        mv.addObject("user",user.toString());
        return mv;
    }
}
