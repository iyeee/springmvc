package com.powernode.controller;

import com.powernode.pojo.Users;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.Map;

@Controller
public class DataAction {
    @RequestMapping("/data")
    public String data(HttpServletRequest request,
                       HttpServletResponse response,
                       HttpSession session,
                       Model model,
                       Map map,
                       ModelMap modelMap){
        Users users=new Users("zs",22);

        // 传递数据
        request.setAttribute("requestUsers",users);
        session.setAttribute("sessionUsers",users);
        model.addAttribute("modelUsers",users);
        map.put("mapUsers",users);
        modelMap.addAttribute("modelMapUsers",users);
        // 请求转发
        return "main";


        // 重定向跳转，只有session还在
        // return "redirect:/admin/main.jsp";

    }
}
