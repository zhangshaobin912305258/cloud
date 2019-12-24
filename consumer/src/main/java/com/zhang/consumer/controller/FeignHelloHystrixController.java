package com.zhang.consumer.controller;

import com.zhang.consumer.service.ProducerHystrixService;
import com.zhang.consumer.service.ProducerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FeignHelloHystrixController {

    @Autowired
    private ProducerHystrixService producerService;

    @RequestMapping("/feignHystrix/call")
    public String call() {
        //像调用本地服务一样
        return producerService.hello();
    }
}
