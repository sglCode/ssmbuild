package com.sgl.service;

import com.sgl.dao.UserMapper;
import com.sgl.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by sgl on 2020/5/6.
 */
@Service("userService")
public class UserServiceImpl implements UserService {

    private UserMapper userMapper;

    public void setUserMapper(UserMapper userMapper) {

        this.userMapper = userMapper;
    }

    public void addUser(User user) {
        userMapper.addUser(user);
    }

    public void delUser(int id) {
        userMapper.delUser(id);
    }

    public void updateUser(User user) {
        userMapper.updateUser(user);
    }

    public User findUser(int id) {
        return userMapper.findUser(id);
    }

    public List<User> findUserList() {
        return userMapper.findUserList();
    }

    public List<User> findUserLike(String word) {
        return userMapper.findUserLike('%'+word+'%');
    }
}
