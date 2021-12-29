package com.cyscm.controller;

import com.cyscm.pojo.ClassRoom;
import com.cyscm.service.ClassRoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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

}
