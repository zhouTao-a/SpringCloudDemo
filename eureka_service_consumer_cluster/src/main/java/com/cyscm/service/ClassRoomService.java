package com.cyscm.service;

import com.cyscm.pojo.ClassRoom;

/**
 * @author zhoutao
 */
public interface ClassRoomService {

    /**
     * 根据主键查询班级
     * @param id
     * @return
     */
    ClassRoom selectById(Integer id);
}
