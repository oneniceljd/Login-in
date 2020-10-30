package com.example.login.controller;

import com.example.login.entry.User;
import com.example.login.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {

    @Autowired
    private UserService userService ;

    @RequestMapping("/index")
    public String login(){
        return "login";
    }

    @RequestMapping("/doLogin")
    public String doLogin(
            Model model,
            @RequestParam("username") String name,
            @RequestParam("password") String password
    ){
        User user = userService.selectByUser(name, name, name) ;
        if(user == null){
            model.addAttribute("error", "账户不存在") ;
        }else{
            User user1 = userService.selectByPassword(password) ;
            //判断密码是否正确
            if(user1 == null){
                model.addAttribute("psw", "密码错误") ;
            }else {
                model.addAttribute("success", user1.getUsername());
            }
        }
        return "success" ;
    }

}
