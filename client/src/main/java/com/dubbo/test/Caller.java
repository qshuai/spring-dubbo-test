package com.dubbo.test;

import com.alibaba.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Component;

@Component
public class Caller {

    @Reference(version = "1.0.0")
    SayHello sayHello;

    public String greet() {
        return sayHello.greet();
    }
}
