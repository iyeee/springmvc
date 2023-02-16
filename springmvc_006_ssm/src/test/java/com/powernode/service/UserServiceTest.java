package com.powernode.service;

import com.powernode.pojo.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext_mapper.xml","classpath:applicationContext_service.xml"})
public class UserServiceTest {
    @Autowired
    UserService userService;

    @Test
    public void selectUserPage() {
        List<User> list=userService.selectUserPage(null,null,0);
        System.out.println(list);
        List<User> list1=userService.selectUserPage("三","男",0);
        List<User> list2=userService.selectUserPage(null,"男",0);

    }

    @Test
    public void createUser() {
        User user=new User("15968162346981977", "护照", "A32532654", "李四", "男", "29", "不便分类的其他从业人员");
        int count= userService.createUser(user);
        System.out.println(count);

    }

    @Test
    public void deleteUserById() {
        int count= userService.deleteUserById("15968162346981977");
        System.out.println(count);
    }

    @Test
    public void getRowCount() {
        int count= userService.getRowCount(null,null);
        System.out.println(count);
        int count1= userService.getRowCount(null,"男");
    }
}