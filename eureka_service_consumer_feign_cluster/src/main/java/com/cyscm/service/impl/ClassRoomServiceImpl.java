package com.cyscm.service.impl;

import com.cyscm.pojo.ClassRoom;
import com.cyscm.pojo.User;
import com.cyscm.service.ClassRoomService;
import com.cyscm.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;
import org.springframework.util.ObjectUtils;
import org.springframework.web.client.RestTemplate;

import java.util.List;

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

}
