package com.dubbo.customer.controller;

import com.dubbo.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;



@RequestMapping(value = "/customer")
@Controller
public class CustomerController {

    @Autowired
    private DemoService demoService;

    @RequestMapping(value = "/test",method = RequestMethod.GET)
    @ResponseBody
    public String sayHello(String name){
        System.out.println("");
        return demoService.sayHello(name);
    }
}
