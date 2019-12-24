package com.zhang.consumer.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(name = "producer")
public interface ProducerService {

    @RequestMapping("/hello")
    public String hello();
}
