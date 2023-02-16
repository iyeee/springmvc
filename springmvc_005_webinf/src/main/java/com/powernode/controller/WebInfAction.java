package com.powernode.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class WebInfAction {
    @RequestMapping("/showindex")
    public String showIndex(){
        System.out.println("访问index");
        return "index";
    }

    @RequestMapping("/showMain")
    public String showMain(){
        System.out.println("访问main");
        return "main";
    }
    @RequestMapping("/showLogin")
    public String showLogin(){
        System.out.println("访问login");
        return "login";
    }
    @RequestMapping("/login")
    public String login(String name, String pwd, HttpServletRequest request){
        if ("za".equalsIgnoreCase(name) && "123".equalsIgnoreCase(pwd)) {
            request.getSession().setAttribute("users",name);
            return "main";
        }else{
            request.setAttribute("msg","用户或密码不正确");
            return "login";
        }
    }
}
