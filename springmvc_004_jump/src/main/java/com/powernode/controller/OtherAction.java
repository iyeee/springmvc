package com.powernode.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class OtherAction {
    @RequestMapping("/other")
    public String other(){
        System.out.println("这是other的action访问");
        return "main";
    }
}
