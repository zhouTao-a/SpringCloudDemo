package com.cyscm.controller;

import com.cyscm.pojo.ClassRoom;
import com.cyscm.pojo.User;
import com.cyscm.service.ClassRoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author zhoutao
 */
@RestController
@RequestMapping("class")
public class ClassRoomController {

    @Autowired
    private ClassRoomService classRoomService;

    @GetMapping("/{id}")
    public ClassRoom selectClassRoomById(@PathVariable("id") Integer id){
        return classRoomService.selectById(id);
    }

    @PostMapping("/pojo")
    public ClassRoom pojo(@RequestBody User user){
        return classRoomService.pojo(user);
    }

    @GetMapping("/pojoGet")
    public ClassRoom pojoGet(User user){
        return classRoomService.pojoGet(user);
    }
}
