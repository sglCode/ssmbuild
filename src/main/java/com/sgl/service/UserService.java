package com.sgl.service;

import com.sgl.pojo.User;

import java.util.List;

/**
 * Created by sgl on 2020/5/6.
 */
public interface UserService {
    //�����û�
    void addUser(User user);
    //ɾ���û�
    void delUser(int id);
    //�޸��û�
    void updateUser(User user);
    //����һ���û�
    User findUser(int id);
    //���������û�
    List<User> findUserList();
    //ģ������
    List<User> findUserLike(String word);
}

