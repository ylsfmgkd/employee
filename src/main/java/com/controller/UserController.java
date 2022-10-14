package com.controller;

import com.pojo.User;

import com.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("employee")
public class UserController {

    @Resource(name = "userServiceImpl")
    private UserService userService;

    @RequestMapping("to_login")
    public String tologin(){
        return "employee/login";
    }

    @RequestMapping("/login")
    public String login(User user, HttpServletRequest request,Model model){
        User htUser = userService.login(user);
        //判断是否登录成功
        if (htUser != null){
            HttpSession session = request.getSession();
            session.setAttribute("user",htUser);
            return "redirect:listpage";
        }
        //return "redirect:login.jsp"; //重定向
        // return "forword:login.jsp"; //请求转发
        model.addAttribute("login_error","登录失败");
        return "redirect:to_login";
    }

    @RequestMapping("/to_register")
    public String toRegister()
    {
        return "employee/register";
    }

    @RequestMapping("/register")
    public String register (User user){
        boolean flag = userService.register(user);
        if (flag)
        {
            return "employee/login";
        }
        else
            {
                return "employee/register";
            }
    }
}


