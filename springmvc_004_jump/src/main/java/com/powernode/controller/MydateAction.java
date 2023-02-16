package com.powernode.controller;

import com.powernode.pojo.Student;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.SimpleFormatter;

@Controller
public class MydateAction {
    SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy-MM-dd");
    // @RequestMapping("/mydate")
    // 需要加<mvc:annotation-driven></mvc:annotation-driven>
    // 日期：<input type="date" name="mydate"><br>
    // public String myDate(@DateTimeFormat(pattern = "yyyy-MM-dd")Date mydate){
    //     System.out.println(mydate);
    //     System.out.println(simpleDateFormat.format(mydate));
    //     return "show";
    // }

    // 注册一个全局日期处理
    @InitBinder
    public void initBinder(WebDataBinder dataBinder){
        dataBinder.registerCustomEditor(Date.class,new CustomDateEditor(simpleDateFormat,true));
    }
    @RequestMapping("/mydate")
    public String myDate(Date mydate, HttpServletRequest request){
        System.out.println(mydate);
        System.out.println(simpleDateFormat.format(mydate));
        request.setAttribute("mydate",simpleDateFormat.format(mydate));
        return "show";
    }

    @RequestMapping("/list")
    public String list(HttpServletRequest request) throws ParseException {
        Student student1=new Student("za",simpleDateFormat.parse("2000-11-11"));
        Student student2=new Student("za",simpleDateFormat.parse("2000-09-11"));
        Student student3=new Student("za",simpleDateFormat.parse("2000-03-11"));
        Student student4=new Student("za",simpleDateFormat.parse("2000-01-11"));
        List<Student> list=new ArrayList<>();
        list.add(student1);
        list.add(student2);
        list.add(student3);
        list.add(student4);
        request.setAttribute("list",list);
        return "show";
    }


}
