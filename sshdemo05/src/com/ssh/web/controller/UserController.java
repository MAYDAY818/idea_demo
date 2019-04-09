package com.ssh.web.controller;

import com.ssh.server.model.User;
import com.ssh.server.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

@RequestMapping("/user")
@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/index/{id}")
    public String index(ModelMap map, @PathVariable Integer id){
        System.out.println(userService.getUserById(id));
        map.put("loginUser",userService.getUserById(id));
        return "user/index";
    }

    @ResponseBody
    @RequestMapping("/login")
    public Map<String,Object> userLogin(ModelMap map, HttpServletRequest request){
        Map<String,Object> resultMap =new HashMap<String, Object>();
        User user=new User();
        user.setUserName(request.getParameter("userName"));
        user.setPassword(request.getParameter("password"));
        User currentUser=userService.queryUser(user);
        if(currentUser!=null){
            resultMap.put("id",currentUser.getId());
            resultMap.put("res","yes");
        }else {
            resultMap.put("res","no");
        }
        return resultMap;
    }
}
