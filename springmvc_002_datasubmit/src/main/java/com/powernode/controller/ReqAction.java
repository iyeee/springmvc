package com.powernode.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ReqAction {
    @RequestMapping(value = "/req",method = RequestMethod.GET)
    public String req(){
        System.out.println("get请求");
        return "main";
    }


    @RequestMapping(value = "/req",method = RequestMethod.POST)
    public String req1(){
        System.out.println("post请求");
        return "main";
    }
}
