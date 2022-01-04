package com.cyscm.service.impl;

import com.cyscm.pojo.ClassRoom;
import com.cyscm.pojo.User;
import com.cyscm.service.ClassRoomService;
import com.cyscm.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;

/**
 * @author zhoutao
 */
@Service
public class ClassRoomServiceImpl implements ClassRoomService {

    @Autowired
    private UserService userService;

    @Override
    public ClassRoom selectById(Integer id) {
        return new ClassRoom(id, "202112", userService.listUser());
    }

    @Override
    public ClassRoom pojo(User user) {
        return new ClassRoom(1, "202112", Arrays.asList(userService.saveByPost(user)));
    }

    @Override
    public ClassRoom pojoGet(User user) {
        return new ClassRoom(1, "202112", Arrays.asList(userService.saveByGet(user)));
    }

}
