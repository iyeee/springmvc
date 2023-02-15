package com.powernode.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
// 相当于包名
@RequestMapping("/zar")
public class DemoAction {
    /**
     * action规范
     * 1.public访问权限
     * 2.返回值任意
     * 3.方法名称任意
     * 4.方法可以没有参数，如果有可以任何类型
     * 5.@RequestMapping注解来声明路径
     */
    @RequestMapping("/demo")
    public String demo(){
        System.out.println("服务器被访问");
        // 跳到 admin/main.jsp
        return "main";
    }
}
