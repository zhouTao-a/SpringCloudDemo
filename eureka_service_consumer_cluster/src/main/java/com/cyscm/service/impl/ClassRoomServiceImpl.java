package com.cyscm.service.impl;

import com.cyscm.pojo.ClassRoom;
import com.cyscm.pojo.User;
import com.cyscm.service.ClassRoomService;
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
    private RestTemplate restTemplate;

    @Autowired
    private DiscoveryClient discoveryClient;

    @Autowired
    private LoadBalancerClient loadBalancerClient;

    @Override
    public ClassRoom selectById(Integer id) {
        return new ClassRoom(2, "202112", listUserByLoadBalancerClient());
    }

    /**
     * 根据LoadBalanced 注解方式调用服务间接口
     * @return
     */
    private List<User> listUserByLoadBalancedAnnotation(){
        // ResponseEntity: 封装了返回数据
        ResponseEntity<List<User>> exchange = restTemplate.exchange(
                "http://service-provider/user/listUser",
                HttpMethod.GET,
                null,
                new ParameterizedTypeReference<List<User>>() { });

        return exchange.getBody();
    }

    /**
     * 根据LoadBalancerClient方式调用服务间接口
     * @return
     */
    private List<User> listUserByLoadBalancerClient(){
        StringBuffer sb = null;

        //根据服务名称获取服务
        ServiceInstance choose = loadBalancerClient.choose("service-provider");
        if (ObjectUtils.isEmpty(choose)) {
            return null;
        }

        sb = new StringBuffer();
        sb.append("http://" + choose.getHost() + ":" + choose.getPort() + "/user/listUser");
        System.out.println(choose.toString());

        // ResponseEntity: 封装了返回数据
        ResponseEntity<List<User>> exchange = restTemplate.exchange(
                sb.toString(),
                HttpMethod.GET,
                null,
                new ParameterizedTypeReference<List<User>>() { });

        return exchange.getBody();
    }

    /**
     * 根据DiscoveryClient方式调用服务间接口
     * @return
     */
    private List<User> listUserByDiscoveryClient(){
        StringBuffer sb = null;

        //获取服务列表
        List<String> services = discoveryClient.getServices();
        if (CollectionUtils.isEmpty(services)) {
            return null;
        }

        //根据服务名称获取服务
        List<ServiceInstance> instances = discoveryClient.getInstances("service-provider");
        if (CollectionUtils.isEmpty(instances)) {
            return null;
        }

        ServiceInstance si = instances.get(0);
        sb = new StringBuffer();
        sb.append("http://" + si.getHost() + ":" + si.getPort() + "/user/listUser");

        // ResponseEntity: 封装了返回数据
        ResponseEntity<List<User>> exchange = restTemplate.exchange(
                sb.toString(),
                HttpMethod.GET,
                null,
                new ParameterizedTypeReference<List<User>>() { });

        return exchange.getBody();
    }
}
