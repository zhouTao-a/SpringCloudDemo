package com.cyscm.controller;

import com.cyscm.pojo.User;
import com.cyscm.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author zhoutao
 */
@RestController
@RequestMapping("user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/listUser")
    public List<User> listUser(){
        return userService.listUser();
    }

    @GetMapping("/saveByGet")
    public User saveByGet(@RequestBody User user){
        return userService.saveUser(user);
    }

    @PostMapping("/saveByPost")
    public User saveByPost(@RequestBody User user){
        return userService.saveUser(user);
    }

}
