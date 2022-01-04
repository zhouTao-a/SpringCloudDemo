package com.cyscm.service.impl;

import com.cyscm.pojo.User;
import com.cyscm.service.UserService;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;


/**
 * @author zhoutao
 */
@Service
public class UserServiceImpl implements UserService {

    @Override
    public List<User> listUser() {
        return Arrays.asList(
        new User(1, "张三", 18),
        new User(2, "李四", 19),
        new User(3, "赵六", 21));
    }

    @Override
    public User saveUser(User user) {
        System.out.println(user.toString());
        return user;
    }
}
