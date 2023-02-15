package com.powernode.controller;

import com.powernode.pojo.Student;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
public class StudentListAction {

    @RequestMapping("/list")
    // 解析ajax请求
    @ResponseBody
    public List<Student> list(){
        List<Student> list=new ArrayList<>();
        Student student1=new Student("da",2);
        Student student2=new Student("gf",43);
        Student student3=new Student("v",432);
        Student student4=new Student("ht",423);
        list.add(student1);
        list.add(student2);
        list.add(student3);
        list.add(student4);
        // springmvc框架 把集合转为json
        return list;
    }

}
