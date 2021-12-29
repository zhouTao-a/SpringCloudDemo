package com.cyscm.service;

import com.cyscm.pojo.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

/**
 * @author zhoutao
 */
@FeignClient("service-provider")
public interface UserService {

    /**
     * 获取全部用户
     * @return
     */
    @GetMapping("/user/listUser")
    List<User> listUser();
}
