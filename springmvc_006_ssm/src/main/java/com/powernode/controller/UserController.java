package com.powernode.controller;

import com.powernode.pojo.User;
import com.powernode.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
// 服务器端支持跨域访问
@CrossOrigin
@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    UserService userService;
    public static final int PAGE_SIZE=5;
    // /user/selectUserPage?userName=z&userSex=男&page=null
    @RequestMapping("/selectUserPage")
    // @ResponseBody
    public List<User> selcetUserPage(String userName,String userSex,Integer page){
        int startRow=0;
        if(page!=null){
            startRow=(page-1)*PAGE_SIZE;
        }
        return userService.selectUserPage(userName,userSex,startRow);
    }
    // /user/getRowCount?userName=z&userSex=男
    @RequestMapping("/getRowCount")
    // @ResponseBody
    public int getRowCount(String userName,String userSex){
        return userService.getRowCount(userName,userSex);
    }
    // /user/ deleteUserById?userId= 15968162087363060
    @RequestMapping("/deleteUserById")
    // @ResponseBody
    public int deleteUserById(String userId){
        return userService.deleteUserById(userId);
    }

    // /user/createUser(参数见下面)
    @RequestMapping("/createUser")
    // @ResponseBody
    public int createUser(User user){
        String userId=System.currentTimeMillis()+"";
        user.setUserId(userId);
        return userService.createUser(user);
    }

}

