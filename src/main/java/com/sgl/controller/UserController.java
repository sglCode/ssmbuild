package com.sgl.controller;

import com.sgl.pojo.User;
import com.sgl.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * Created by sgl on 2020/5/7.
 */
@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    @Qualifier("userService")
    private UserService userService;

    @RequestMapping("/allUsers")
    public String list(Model model){
        List<User> userList = userService.findUserList();
        model.addAttribute("userList",userList);
        return "allUsers";
    }
    @RequestMapping("/toAddUser")
    public String toAddUser(Model model){
        return "addUser";
    }
    @RequestMapping("/addUser")
    public String addUser(Model model,User user){
        userService.addUser(user);
        return "redirect:/user/allUsers";
    }
    @RequestMapping("/toUpdateUser")
    public String toUpdateUser(Model model,int id){
        User user = userService.findUser(id);
        model.addAttribute("user",user);
        return "updateUser";
    }
    @RequestMapping("/updateUser")
    public String updateUser(Model model,User user){

        userService.updateUser(user);
        return "redirect:/user/allUsers";
    }

    @RequestMapping("/delUser")
    public String delUser(Model model,int id){
        userService.delUser(id);
        return "redirect:/user/allUsers";
    }

    @RequestMapping("/findUserLike")
    public String toFindUserLike(Model model,String word){
        List<User> userLike = userService.findUserLike(word);
        model.addAttribute("userList",userLike);
        return "allUsers";
    }


}
