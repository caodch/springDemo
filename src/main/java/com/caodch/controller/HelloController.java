package com.caodch.controller;

import com.caodch.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    /**
     * main commit 1
     * @return
     */
    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    public String getHello(@RequestParam String name){

        return "Hello World";
    }

    /**
     * dev commit
     * @return
     */
    @RequestMapping(value = "/sayHello" , method = RequestMethod.GET)
    public String sayHello(){
        return "wwww";
    }
}
