package com.cyscm.service;

import com.cyscm.pojo.User;

import java.util.List;

/**
 * @author zhoutao
 */
public interface UserService {

    /**
     * 获取全部用户
     * @return
     */
    List<User> listUser();

    /**
     *  保存用户
     * @param user
     * @return
     */
    User saveUser(User user);
}
