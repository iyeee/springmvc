package com.powernode.controller;

import com.powernode.Users;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
public class DataSubmitAction {

    //  <form action="${pageContext.request.contextPath}/one.action">
    // 姓名：<input name="myname"><br>
    // 年龄：<input name="age"><br>
    //     <input type="submit" value="提交">
    // </form>

    // 1)单个数据提交
    @RequestMapping("/one")
    // 名称一样
    public String one(String myname,int age){
        System.out.println(myname);
        System.out.println(age+100);
        return "main";
    }
    // 2)对象封装提交数据
    // 在提交请求中，保证请求参数的名称和实体类中成员变量名称一致，
    // 则可以自动提交数据，自动类型转换，自动封装数据到对象
    // 中文会乱码

    // public class Users {
    //     private String name;
    //     private Integer age;

    // 姓名：<input name="name"><br>
    // 年龄：<input name="age"><br>
    @RequestMapping(value = "/two",method = RequestMethod.POST)
    // 名称一样
    public String two(Users users){
        System.out.println(users);
        System.out.println(users.getName());
        System.out.println(users.getAge());
        return "main";
    }

    // 3)动态占位符提交
    // 超链接或者地址栏提交一杠一值 一杠一大括号，注解解析
    // <a href="${pageContext.request.contextPath}/three/张三/22.action">动态提交</a>
    @RequestMapping("/three/{name}/{age}")
    public String three(@PathVariable String name,@PathVariable int age){
        System.out.println(name);
        System.out.println(age+100);
        return "main";
    }

    // 4）映射名称不一致，使用注解
    @RequestMapping("/four")
    public String four(@RequestParam("name") String uname,@RequestParam("age") int uage){
        System.out.println(uage);
        System.out.println(uage+100);

        return "main";
    }

    @RequestMapping("five")
    // 5）手工提取数据
    public String five(HttpServletRequest request, HttpServletResponse response){
        String name = request.getParameter("name");
        int age = Integer.parseInt(request.getParameter("age"));
        System.out.println(name);
        System.out.println(age);
        return "main";
    }
    // action方法的返回值
    // 1）客户端资源的地址，自动拼接前缀和后缀，还可以屏蔽自动拼接字符串，可以指定返回的路径
    // 2）返回json格式的对象，自动将对象或集合转换为json，使用的jackson工具进行转换，必须添加jackson依赖，一般用ajax请求
    // 3）void 一般用于ajax请求
    // 4)基本数据类型，ajax
    // 5）返回ModelAndView，用的少

    // 完成ajax请求
    // 1.添加jackson依赖 jackson-databind
    // 2.webapp目录新建js目录，添加jQuery函数库
    // 3.index.jsp导入函数库
    // 4.action添加注解 @RequestBody，用于处理ajax请求
    // 5.在springmvc.xml文件中添加注解驱动<mvc:annotationdriven/,解析@RequestBody>
}


