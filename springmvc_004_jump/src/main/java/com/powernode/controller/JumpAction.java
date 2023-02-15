package com.powernode.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JumpAction {
    @RequestMapping("/one")
    public String one(){
        System.out.println("请求转发页面跳");
        // 默认使用视图解析器拼接前后缀进行跳转
        return "main";
    }

    @RequestMapping("/two")
    public String two(){
        System.out.println("请求转发页面action跳");
        // 默认使用视图解析器拼接前后缀进行跳转
        // forward 可以屏蔽前缀和后缀的拼接
        return "forward:/other.action";
    }

    @RequestMapping("/three")
    public String three(){
        System.out.println("重定向页面");
        // redirect 屏蔽前后缀拼接
        return "redirect:/admin/main.jsp";
    }

    @RequestMapping("/four")
    public String four(){
        System.out.println("重定向action");
        // redirect 屏蔽前后缀拼接
        return "redirect:/other.action";
    }

    @RequestMapping("/five")
    public String five(){
        System.out.println("随便跳");
        // redirect 屏蔽前后缀拼接
        return "forward:/fore/login.jsp";
    }
}
