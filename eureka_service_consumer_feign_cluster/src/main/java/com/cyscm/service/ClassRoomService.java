package com.cyscm.service;

import com.cyscm.pojo.ClassRoom;
import com.cyscm.pojo.User;

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

    /**
     * XXX
     * @param user
     * @return
     */
    ClassRoom pojo(User user);

    /**
     * XXX
     * @param user
     * @return
     */
    ClassRoom pojoGet(User user);
}
