package com.dubbo.test.impl;

import com.dubbo.test.SayHello;
import com.alibaba.dubbo.config.annotation.Service;

@Service(version = "1.0.0")
public class SayHelloImpl implements SayHello {
    @Override
    public String greet() {
        return "hello world";
    }
}
