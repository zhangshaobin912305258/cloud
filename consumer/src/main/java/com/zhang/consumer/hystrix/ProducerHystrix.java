package com.zhang.consumer.hystrix;

import com.zhang.consumer.service.ProducerHystrixService;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
public class ProducerHystrix implements ProducerHystrixService {
    @RequestMapping("/hello")
    public String hello() {
        return "sorry,hello service call failed.";
    }
}
