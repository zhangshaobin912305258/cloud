package com.zhang.consumer.service;

import com.zhang.consumer.hystrix.ProducerHystrix;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(name = "producer",fallback = ProducerHystrix.class)
public interface ProducerHystrixService {

    @RequestMapping("/hello")
    public String hello();
}
