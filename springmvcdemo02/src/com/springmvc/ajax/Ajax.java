package com.springmvc.ajax;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/ajax")
public class Ajax {

    @RequestMapping("/req")
    public String say(){
        return "hello";
    }
}
