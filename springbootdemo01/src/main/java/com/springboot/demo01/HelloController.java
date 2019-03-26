package com.springboot.demo01;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.text.DateFormat;
import java.util.Date;


//@RestController
@Controller
public class HelloController {
//    @Value("${name}")
//    private String name;
//    @Value("${age}")
//    private Integer age;
//    @Value("${content}")
//    private String content;
    @RequestMapping("/hello")
    public String hello(Model m){
        m.addAttribute("now", DateFormat.getDateTimeInstance().format(new Date()));
        return "hello";
    }
}
