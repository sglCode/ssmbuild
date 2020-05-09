package com.sgl.service;

import com.sgl.pojo.User;

import java.util.List;

/**
 * Created by sgl on 2020/5/6.
 */
public interface UserService {
    //增加用户
    void addUser(User user);
    //删除用户
    void delUser(int id);
    //修改用户
    void updateUser(User user);
    //查找一个用户
    User findUser(int id);
    //查找所有用户
    List<User> findUserList();
    //模糊查找
    List<User> findUserLike(String word);
}

