package com.example.login.controller;

import com.example.login.Dao.UserDao;
import com.example.login.entry.User;
import com.example.login.utils.UuidUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class RegisterController {

    @Autowired
    private UserDao userDao ;

    @RequestMapping("/register")
    public String register(){
        return "register" ;
    }

    @RequestMapping("/doRegister")
    public String doRegister(
            Model model,
            @RequestParam("username") String username,
            @RequestParam("phone") String phone,
            @RequestParam("email") String email,
            @RequestParam("password") String password

    ){
        User user = new User() ;
        user.setUsername(username);
        user.setPhone(phone);
        user.setEmail(email);
        user.setPassword(password);
        user.setUuid(new UuidUtil().getUuid());

        if(userDao.selectByUser(username, email, phone) == null && userDao.selectByUuid(user.getUuid()) == null){
            userDao.add(user);
            model.addAttribute("success",username) ;
        }else{
            System.out.println("注册失败！！！");
        }

        return "success" ;
    }

}
