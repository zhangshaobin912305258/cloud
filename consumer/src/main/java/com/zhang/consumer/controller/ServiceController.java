package com.zhang.consumer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ServiceController {
    @Autowired
    private LoadBalancerClient loadBalancerClient;
    @Autowired
    private DiscoveryClient discoveryClient;

    /**
     * 获取所有服务
     * @return
     */
    @RequestMapping("/services")
    public Object services() {
        return discoveryClient.getInstances("producer");
    }

    /**
     * 采用轮训方式获取服务
     * @return
     */
    @RequestMapping("/discover")
    public Object discover() {
        return loadBalancerClient.choose("producer").getUri().toString();
    }

}
