package com.dubbo.provider.service;


import com.dubbo.service.DemoService;
import org.springframework.stereotype.Component;

@Component
public class DemoServiceImpl implements DemoService {

    @Override
    public String sayHello(String name) {
        return "Hello Dubbo,Hello " +name;
    }
}
