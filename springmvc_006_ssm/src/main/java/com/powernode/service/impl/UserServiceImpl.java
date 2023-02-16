package com.powernode.service.impl;

import com.powernode.mapper.UserMapper;
import com.powernode.pojo.User;
import com.powernode.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserMapper userMapper;

    @Override
    public List<User> selectUserPage(String userName, String userSex, int startRow) {
        return userMapper.selectUserPage(userName,userSex,startRow);
    }

    @Override
    public int createUser(User user) {
       return userMapper.insert(user);
    }

    @Override
    public int deleteUserById(String userId) {
        return userMapper.delete(userId);
    }

    @Override
    public int getRowCount(String userName, String userSex) {
        return userMapper.getRowCount(userName,userSex);
    }
}
